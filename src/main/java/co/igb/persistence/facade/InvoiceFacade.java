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
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al cosultar el DocNum de la factura de id #[" + docEntry + "]", e);
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

    public List<Object[]> findListInvoicesShipping(String transport, String invoice, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select CAST(f.DocDate as date) as DocDate, CAST(f.U_TOT_CAJ as int) as Box, CAST(f.DocNum as varchar(10)) as DocNum, ");
        sb.append("       CAST(f.CardCode as varchar(20)) as CardCode, CAST(f.CardName as varchar(100)) as CardName, ");
        sb.append("       CAST(t.Name as varchar(15)) as Transport, CAST(d.StreetS as varchar(100)) as Street, ");
        sb.append("       CAST(l.Name as varchar(50)) as Depart, CAST(d.CityS as varchar(50)) as City ");
        sb.append("from   OINV f ");
        sb.append("inner  join INV12 d ON d.DocEntry = f.DocEntry ");
        sb.append("inner  join [@TRANSP] t ON t.Code = f.U_TRANSP ");
        sb.append("inner  join OCST l ON l.Code = d.StateS and l.Country = 'CO' ");
        sb.append("where  f.U_SHIPPING = 'N' and f.U_TOT_CAJ > 0 ");
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

    public Object[] getShippingInformation(Integer DocNum, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(d.StreetS as varchar(45)) as Direccion, cast(CityS as varchar(30)) as Ciudad, cast(m.Name as varchar(30)) as Departamento, ");
        sb.append("       cast(s.Phone2 as varchar(15)) as Telefono, CAST(f.U_PESO_BRUTO as int) as Peso, cast(f.U_VR_DECLARADO as int) as ValorDeclarado, ");
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
}