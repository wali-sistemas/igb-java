package co.igb.persistence.facade;

import co.igb.persistence.entity.Invoice;
import co.igb.persistence.entity.Invoice_;
import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;
import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
public class InvoiceFacade {
    private static final Logger CONSOLE = Logger.getLogger(InvoiceFacade.class.getSimpleName());
    private static final String DB_TYPE = Constants.DATABASE_TYPE_MSSQL;

    @EJB
    private PersistenceConf persistenceConf;

    public Integer getDocNumInvoice(Long docEntry, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(f.DocNum as int) as DocNum from OINV f where f.DocEntry =");
        sb.append(docEntry);
        try {
            return (Integer) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al cosultar el DocNum de la factura de id #[" + docEntry.toString() + "]", e);
            return null;
        }
    }

    public Integer getDocNumDelivery(String docNum, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select DISTINCT cast(d.BaseRef as int) as BaseRef ");
        sb.append("from   OINV f ");
        sb.append("inner  join INV1 d ON d.DocEntry = f.DocEntry where f.DocNum = '");
        sb.append(docNum);
        sb.append("'");
        try {
            return (Integer) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar la entrega para la factura #[" + docNum + "]");
        }
        return null;
    }

    public List<Object[]> findListInvoicesShipping(String transport, String invoice, String companyName, String warehouseCode, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select top 12 CAST(f.DocDate as date) as DocDate, CAST(f.U_TOT_CAJ as int) as Box, CAST(f.DocNum as varchar(10)) as DocNum, ");
        sb.append("       CAST(f.CardCode as varchar(20)) as CardCode, CAST(f.CardName as varchar(100)) as CardName, ");
        sb.append("       CAST(t.Name as varchar(15)) as Transport, CAST(d.StreetS as varchar(100)) as Street, ");
        sb.append("       CAST(l.Name as varchar(50)) as Depart, CAST(d.CityS as varchar(50)) as City ");
        sb.append("from   OINV f ");
        sb.append("inner  join INV12 d ON d.DocEntry = f.DocEntry ");
        sb.append("inner  join [@TRANSP] t ON t.Code = f.U_TRANSP ");
        sb.append("inner  join OCST l ON l.Code = d.StateS and l.Country = 'CO' ");
        sb.append("where  (select top 1 d.WhsCode from INV1 d where d.DocEntry = f.DocEntry) = '");
        sb.append(warehouseCode);
        sb.append("' and f.U_SHIPPING = 'N' and f.U_TOT_CAJ > 0 ");
        if (!transport.equals("*")) {
            sb.append("and cast(t.Name as varchar(15)) = '");
            sb.append(transport);
            sb.append("' ");
        }
        if (!invoice.isEmpty()) {
            sb.append("and f.DocNum = '");
            sb.append(invoice);
            sb.append("' ");
        }
        sb.append("order  by f.DocDate desc, t.Name ASC");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException e) {
        } catch (Exception ex) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando las facturas para shipping de la empresa [" + companyName + "]");
        }
        return null;
    }

    public List<String> getListTransport(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select DISTINCT CAST(t.Name as varchar(15)) as Transport ");
        sb.append("from   OINV f ");
        sb.append("inner  join INV12 d ON d.DocEntry = f.DocEntry ");
        sb.append("inner  join [@TRANSP] t ON t.Code = f.U_TRANSP ");
        sb.append("inner  join OCST l ON l.Code = d.StateS and l.Country = 'CO' ");
        sb.append("where  f.U_SHIPPING = 'N' and f.U_TOT_CAJ > 0 ");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException e) {
        } catch (Exception ex) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error listando las transportadoras.");
        }
        return null;
    }

    public void updateFieldShipping(Integer DocNum, String companyName, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(companyName, testing, DB_TYPE);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaUpdate<Invoice> cu = cb.createCriteriaUpdate(Invoice.class);
        Root<Invoice> root = cu.from(Invoice.class);
        cu.set(root.get(Invoice_.uShipping), 'S');
        cu.where(cb.equal(root.get(Invoice_.docNum), DocNum));
        try {
            em.createQuery(cu).executeUpdate();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error actualizando el shipping para la factura #[" + DocNum.toString() + "]");
        }
    }

    public void updateFielUser(Integer DocNum, Integer totalBox, String companyName, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(companyName, testing, DB_TYPE);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaUpdate<Invoice> cu = cb.createCriteriaUpdate(Invoice.class);
        Root<Invoice> root = cu.from(Invoice.class);
        cu.set(root.get(Invoice_.uTotalCaja), totalBox);
        cu.where(cb.equal(root.get(Invoice_.docNum), DocNum));
        try {
            em.createQuery(cu).executeUpdate();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al actualizar el total de cajas para la factura #[", DocNum.toString() + "]");
        }
    }

    public Object[] getShippingInformation(Integer DocNum, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(d.StreetS as varchar(45)) as Direccion, cast(CityS as varchar(30)) as Ciudad, cast(m.Name as varchar(30)) as Departamento, ");
        sb.append("       cast(s.Phone2 as varchar(15)) as Telefono, cast(f.U_PESO_BRUTO as int) as Peso, cast(f.U_VR_DECLARADO as int) as ValorDeclarado, ");
        sb.append("       cast(f.U_UBIC1 as varchar(15)) as guia, cast(f.U_OBSERVACION as varchar(45)) as Comentario, cast(t.Name as varchar(45)) as Transporte ");
        sb.append("from   OINV f ");
        sb.append("inner  join INV12 d ON d.DocEntry = f.DocEntry ");
        sb.append("inner  join OCST  m ON m.Code = d.StateS AND m.Country = 'CO' ");
        sb.append("inner  join OCRD  s ON s.CardCode = f.CardCode ");
        sb.append("inner  join [@TRANSP] t ON t.Code = U_TRANSP where DocNum = ");
        sb.append(DocNum);
        try {
            return (Object[]) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar la información para shipping de la factura #[" + DocNum.toString() + "]");
        }
        return null;
    }

    public List<Object[]> getAnnualSales(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select CAST(t.año AS varchar(4)) as año, CAST(SUM(t.costoTotalVenta - t.costoTotalNota) as numeric(18,0)) AS costoTotal, CAST(SUM(t.valorTotalVenta - t.valorTotalNota) AS numeric(18,0)) AS valorTotal, ");
        sb.append("CAST(((SUM(t.valorTotalVenta - t.valorTotalNota) - SUM(t.costoTotalVenta - t.costoTotalNota)) / SUM(t.valorTotalVenta - t.valorTotalNota)) * 100 as numeric(18,2)) AS margenAnual ");
        sb.append("from ( select 'FV' as Doc, CAST(YEAR(f.DocDate) as varchar(4)) AS año, CAST(SUM((CAST(d.Quantity AS int) * CAST(d.StockPrice AS numeric(18,0)))) as numeric(18,0)) AS costoTotalVenta, 0 AS costoTotalNota, ");
        sb.append("       CAST(SUM((CAST(d.LineTotal AS numeric(18,0)) - (CAST(d.LineTotal AS numeric(18,0)) * CAST(f.DiscPrcnt AS int))/100)) as numeric(18,0)) AS valorTotalVenta, 0 AS valorTotalNota ");
        sb.append("from OINV f ");
        sb.append("Inner Join INV1 d ON d.DocEntry = f.DocEntry ");
        sb.append("Where f.DocType = 'I' and YEAR(f.DocDate) between YEAR(DATEADD (YEAR, -4, GETDATE())) AND YEAR(GETDATE()) Group by YEAR(f.DocDate) ");
        sb.append("UNION ALL ");
        sb.append("select 'NC' as Doc, CAST(YEAR(n.DocDate) as varchar(4)) AS año, 0 AS costoTotalVenta, CAST(SUM((CAST(d.Quantity AS int) * CAST(d.StockPrice AS numeric(18,0)))) as numeric(18,0)) AS costoTotalNota, 0 AS valorTotalVenta, ");
        sb.append("       CAST(SUM((CAST(d.LineTotal AS numeric(18,0)) - (CAST(d.LineTotal AS numeric(18,0)) * CAST(n.DiscPrcnt AS int))/100)) as numeric(18,0)) AS valorTotalNota ");
        sb.append("from ORIN n ");
        sb.append("Inner Join RIN1 d ON d.DocEntry = n.DocEntry ");
        sb.append("Where n.DocType = 'I' and YEAR(n.DocDate) between YEAR(DATEADD (YEAR, -4, GETDATE())) AND YEAR(GETDATE()) ");
        sb.append("Group by YEAR(n.DocDate) ) AS t Group by t.año");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando las ventas anuales para la empresa [" + companyName + "]");
        }
        return null;
    }

    public List<Object[]> getMonthlySales(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("Select CAST(DATENAME(month, DATEADD(month, MONTH(DATEADD(mm, number, GETDATE())), 0) - 1) AS varchar(20)) AS mes, CAST(YEAR(GETDATE()) AS varchar(4)) AS año, ");
        sb.append("ISNULL(CAST(SUM(t.costoTotalVenta - t.costoTotalNota) AS numeric(18,0)),0) AS costoTotal, ");
        sb.append("ISNULL(CAST(SUM(t.valorTotalVenta - t.valorTotalNota) AS numeric(18,0)),0) AS valorTotal, ");
        sb.append("ISNULL(CAST(((SUM(t.valorTotalVenta - t.valorTotalNota) - SUM(t.costoTotalVenta - t.costoTotalNota)) / SUM(t.valorTotalVenta - t.valorTotalNota)) * 100 AS numeric(18,2)),0) AS margenAnual ");
        sb.append("From master.dbo.spt_values v ");
        sb.append("Left join ( Select 'FV' AS Doc, MONTH(f.DocDate) AS mm, DATENAME(MONTH, f.DocDate) AS mes, ");
        sb.append("CAST(SUM((CAST(d.Quantity AS int) * CAST(d.StockPrice AS numeric(18,0)))) AS numeric(18,0)) AS costoTotalVenta, 0 AS costoTotalNota, ");
        sb.append("CAST(SUM((CAST(d.LineTotal AS numeric(18,0)) - (CAST(d.LineTotal AS numeric(18,0)) * CAST(f.DiscPrcnt AS int))/100)) AS numeric(18,0)) AS valorTotalVenta, 0 AS valorTotalNota ");
        sb.append("From OINV f ");
        sb.append("Inner Join INV1 d ON d.DocEntry = f.DocEntry ");
        sb.append("Where f.DocType = 'I' and YEAR(f.DocDate) = YEAR(GETDATE()) ");
        sb.append("Group by DATENAME(MONTH, f.DocDate), YEAR(f.DocDate), MONTH(f.DocDate) UNION ALL ");
        sb.append("Select 'NC' AS Doc, MONTH(n.DocDate) AS mm, DATENAME(MONTH, n.DocDate) AS mes, 0 AS costoTotalVenta,");
        sb.append("CAST(SUM((CAST(d.Quantity AS int) * CAST(d.StockPrice AS numeric(18,0)))) AS numeric(18,0)) AS costoTotalNota, 0 AS valorTotalVenta, ");
        sb.append("CAST(SUM((CAST(d.LineTotal AS numeric(18,0)) - (CAST(d.LineTotal AS numeric(18,0)) * CAST(ISNULL(n.DiscPrcnt,0) AS int))/100)) AS numeric(18,0)) AS valorTotalNota ");
        sb.append("From ORIN n ");
        sb.append("Inner Join RIN1 d ON d.DocEntry = n.DocEntry ");
        sb.append("Where n.DocType = 'I' and YEAR(n.DocDate) = YEAR(GETDATE()) ");
        sb.append("Group by DATENAME(MONTH, n.DocDate), YEAR(n.DocDate), MONTH(n.DocDate) ");
        sb.append(") AS t ON t.mm = MONTH(DATEADD(mm, number, GETDATE())) ");
        sb.append("Where (name IS NULL) AND (number BETWEEN 0 AND 11) ");
        sb.append("Group By DATENAME(month, DATEADD(month, MONTH(DATEADD(mm, number, GETDATE())), 0) - 1), STR(MONTH(DATEADD(mm, number, GETDATE())), 2) ");
        sb.append("Order BY STR(MONTH(DATEADD(mm, number, GETDATE())), 2) ASC");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando las ventas mensuales para la empresa [" + companyName + "]");
        }
        return null;
    }

    public BigDecimal getInvoiceTotal(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("Select ISNULL(CAST(SUM(t.valorTotalVenta - t.valorTotalNota) AS numeric(18,0)),0) AS Facturado From ( ");
        sb.append("Select CAST(SUM((CAST(d.LineTotal AS numeric(18,0)) - (CAST(d.LineTotal AS numeric(18,0)) * CAST(f.DiscPrcnt AS int))/100)) AS numeric(18,0)) AS valorTotalVenta, 0 AS valorTotalNota ");
        sb.append("From OINV f Inner Join INV1 d ON d.DocEntry = f.DocEntry Where f.DocType = 'I' and YEAR(f.DocDate) = YEAR(GETDATE()) and MONTH(f.DocDate) = MONTH(GETDATE()) ");
        sb.append("UNION ALL ");
        sb.append("Select 0 AS valorTotalVenta, CAST(SUM((CAST(d.LineTotal AS numeric(18,0)) - (CAST(d.LineTotal AS numeric(18,0)) * CAST(ISNULL(n.DiscPrcnt,0) AS int))/100)) AS numeric(18,0)) AS valorTotalNota ");
        sb.append("From ORIN n Inner Join RIN1 d ON d.DocEntry = n.DocEntry Where n.DocType = 'I' and YEAR(n.DocDate) = YEAR(GETDATE()) and MONTH(n.DocDate) = MONTH(GETDATE())) AS t");
        try {
            return (BigDecimal) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el total facturado a la fecha para [" + companyName + "]", e);
        }
        return new BigDecimal(0);
    }
}