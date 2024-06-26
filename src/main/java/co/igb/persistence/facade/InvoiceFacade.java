package co.igb.persistence.facade;

import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
public class InvoiceFacade {
    private static final Logger CONSOLE = Logger.getLogger(InvoiceFacade.class.getSimpleName());
    private static final String DB_TYPE_HANA = Constants.DATABASE_TYPE_HANA;
    @EJB
    private PersistenceConf persistenceConf;

    public InvoiceFacade() {
    }

    public Integer getDocNumInvoice(Long docEntry, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(f.\"DocNum\" as int) as DocNum from OINV f where f.\"DocEntry\"=");
        sb.append(docEntry);
        try {
            return (Integer) persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al cosultar el DocNum de la factura de id #[" + docEntry.toString() + "]", e);
            return null;
        }
    }

    public Integer getDocNumDelivery(String docNum, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select distinct cast(d.\"BaseRef\" as int) as BaseRef ");
        sb.append("from OINV f ");
        sb.append("inner join INV1 d ON d.\"DocEntry\"=f.\"DocEntry\" where f.\"DocNum\"='");
        sb.append(docNum);
        sb.append("'");
        try {
            return (Integer) persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar la entrega para la factura #[" + docNum + "]");
        }
        return null;
    }

    public List<Object[]> findListInvoicesShipping(String transport, String invoice, String companyName, String warehouseCode, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(f.\"DocDate\" as date)as DocDate,cast(f.\"U_TOT_CAJ\" as int)as Box,cast(f.\"DocNum\" as varchar(10))as DocNum, ");
        sb.append(" cast(f.\"CardCode\" as varchar(20))as CardCode,cast(f.\"CardName\" as varchar(100))as CardName, ");
        sb.append(" cast(t.\"Name\" as varchar(15))as Transport,cast(d.\"StreetS\" as varchar(100))as Street, ");
        sb.append(" cast(l.\"Name\" as varchar(50))as Depart,cast(d.\"CityS\" as varchar(50))as City,cast(d.\"BlockS\" as varchar(20))as CodCity, ");
        sb.append(" cast(v.\"U_MIN_SEG\" as numeric(18,2))as ValStandDecl,cast(v.\"U_MIN_FLE\" as int)as UnidEmpStand,cast(v.\"U_REXPEDICION\" as varchar(1))as Rexp, ");
        sb.append(" cast((select ifnull(c.\"Phone2\",c.\"Phone1\") from OCRD c where c.\"CardCode\"=f.\"CardCode\")as varchar(10))as Phone ");
        sb.append("from OINV f ");
        sb.append("inner join INV12 d on d.\"DocEntry\"=f.\"DocEntry\" ");
        sb.append("inner join \"@TRANSP\" t on t.\"Code\"=f.\"U_TRANSP\" ");
        sb.append("left join \"@TRANSP_TAR\" v on v.\"U_COD_TRA\"=f.\"U_TRANSP\" and v.\"Code\"=d.\"U_MunicipioS\" ");
        sb.append("inner join OCST l on l.\"Code\"=d.\"StateS\" and l.\"Country\"='CO' ");
        sb.append("where(select max(d.\"WhsCode\")from INV1 d where d.\"DocEntry\" = f.\"DocEntry\")");
        sb.append(" in('01','30','32','05','26') ");
        sb.append("and f.\"U_SHIPPING\"='N' and (f.\"U_TOT_CAJ\">=0 or f.\"U_TOT_CAJ\" is null) ");
        if (!transport.equals("*")) {
            sb.append("and cast(t.\"Name\" as varchar(15))='");
            sb.append(transport);
            sb.append("' ");
        }
        if (!invoice.isEmpty()) {
            sb.append("and f.\"DocNum\"='");
            sb.append(invoice);
            sb.append("' ");
        }
        sb.append("order by f.\"DocDate\" desc,t.\"Name\" ASC limit 100");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException e) {
        } catch (Exception ex) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando las facturas para shipping de la empresa [" + companyName + "]");
        }
        return null;
    }

    public List<String> getListTransport(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select distinct CAST(t.\"Name\" as varchar(15)) as Transport ");
        sb.append("from OINV f ");
        sb.append("inner join INV12 d on d.\"DocEntry\"=f.\"DocEntry\" ");
        sb.append("inner join \"@TRANSP\" t on t.\"Code\"=f.\"U_TRANSP\" ");
        sb.append("inner join OCST l on l.\"Code\"=d.\"StateS\" and l.\"Country\"='CO' ");
        sb.append("where f.\"U_SHIPPING\"='N' and f.\"U_TOT_CAJ\">0 ");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException e) {
        } catch (Exception ex) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error listando las transportadoras.");
        }
        return null;
    }

    public void updateFieldShipping(Integer docNum, String companyName, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA);
        StringBuilder sb = new StringBuilder();
        sb.append("update oinv set \"U_SHIPPING\"='S' where \"DocNum\"=");
        sb.append(docNum);
        try {
            em.createNativeQuery(sb.toString()).executeUpdate();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error actualizando el shipping para la factura #[" + docNum.toString() + "]");
        }
    }

    public void updateFieldTotalBox(Integer docNum, Integer totalBox, String companyName, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA);
        StringBuilder sb = new StringBuilder();
        sb.append("update OINV set \"U_TOT_CAJ\"=");
        sb.append(totalBox);
        sb.append(" where \"DocNum\"=");
        sb.append(docNum);
        try {
            em.createNativeQuery(sb.toString()).executeUpdate();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al actualizar el total de cajas para la factura #[", docNum.toString() + "]");
        }
    }

    public Object[] getShippingInformation(Integer DocNum, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(d.\"StreetS\" as varchar(45)) as Direccion, cast(d.\"CityS\" as varchar(30)) as Ciudad, cast(m.\"Name\" as varchar(30)) as Departamento, ");
        sb.append(" cast(s.\"Phone2\" as varchar(15)) as Telefono, cast(f.\"U_PESO_BRUTO\" as int) as Peso, cast(f.\"U_VR_DECLARADO\" as int) as ValorDeclarado, ");
        sb.append(" cast(f.\"U_UBIC1\" as varchar(15)) as guia, cast(f.\"U_OBSERVACION\" as varchar(45)) as Comentario, cast(t.\"Name\" as varchar(45)) as Transporte ");
        sb.append("from OINV f ");
        sb.append("inner join INV12 d on d.\"DocEntry\" = f.\"DocEntry\" ");
        sb.append("inner join OCST  m on m.\"Code\" = d.\"StateS\" AND m.\"Country\"='CO' ");
        sb.append("inner join OCRD  s on s.\"CardCode\" = f.\"CardCode\" ");
        sb.append("inner join \"@TRANSP\" t ON t.\"Code\" = \"U_TRANSP\" where f.\"DocNum\"=");
        sb.append(DocNum);
        try {
            return (Object[]) persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar la información para shipping de la factura #[" + DocNum.toString() + "]");
        }
        return null;
    }

    public List<Object[]> getAnnualSales(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(t.\"ano\" as varchar(4)) as ano, cast(sum(t.costoTotalVenta - t.costoTotalNota) as numeric(18,0)) as costoTotal, cast(sum(t.valorTotalVenta - t.valorTotalNota) as numeric(18,0)) as valorTotal, ");
        sb.append(" cast(((sum(t.valorTotalVenta - t.valorTotalNota) - sum(t.costoTotalVenta - t.costoTotalNota)) / sum(t.valorTotalVenta - t.valorTotalNota)) * 100 as numeric(18,2)) as margenAnual, ");
        sb.append(" ifnull(cast(sum(t.valorTotalVenta - t.valorTotalNota - t.valorTotalDescFin) as numeric(18,0)),0)as valorTotalDescFin, ");
        sb.append(" ifnull(cast(((sum(t.valorTotalVenta-t.valorTotalNota-t.valorTotalDescFin)-sum(t.costoTotalVenta-t.costoTotalNota))/sum(t.valorTotalVenta-t.valorTotalNota-t.valorTotalDescFin-t.valorTotalDescFin))*100 as numeric(18,2)),0)as margenAnualDescFin ");
        sb.append("from ( ");
        sb.append(" select 'FV' as Doc, cast(year(f.\"DocDate\") as varchar(4)) as \"ano\", cast(sum((cast(d.\"Quantity\" as int) * cast(d.\"StockPrice\" as numeric(18,0)))) as numeric(18,0)) as costoTotalVenta,0 as costoTotalNota, ");
        sb.append("  cast(sum((cast(d.\"LineTotal\" as numeric(18,0)) - (cast(d.\"LineTotal\" as numeric(18,0)) * cast(f.\"DiscPrcnt\" as int))/100)) as numeric(18,0)) as valorTotalVenta,0 as valorTotalNota,0 as valorTotalDescFin ");
        sb.append(" from OINV f ");
        sb.append(" inner join INV1 d on d.\"DocEntry\"=f.\"DocEntry\" ");
        sb.append(" inner join OSLP a ON f.\"SlpCode\"=a.\"SlpCode\" ");
        sb.append(" inner join OCRD c ON f.\"CardCode\"=c.\"CardCode\" ");
        sb.append(" inner join OCST p ON c.\"State1\"=p.\"Code\" ");
        sb.append(" where f.\"DocDate\" between ADD_YEARS(TO_DATE(current_date,'YYYY-MM-DD'),-3) and current_date and p.\"Country\"='CO' ");
        //TODO: Solo impuesto aplica para IGB
        if (companyName.contains("IGB")) {
            sb.append(" and d.\"TaxOnly\"='N' ");
        }
        sb.append("  and f.\"DocNum\" not in(select \"Code\" from \"@DOC_EXCLU\" where \"U_TIPO\"='FV') ");
        sb.append(" group by year(f.\"DocDate\") ");

        //TODO: Aplica solo para REDPLAS, carga de saldos iniciales
        if (companyName.contains("REDPLAS")) {
            sb.append(" UNION ALL ");
            sb.append("select 'FV' as Doc, cast(\"U_ANO\" as varchar(4))as \"ano\",0 as costoTotalVenta,0 as costoTotalNota,   cast(sum(\"U_VALOR\")as numeric(18,0))as valorTotalVenta,0 as valorTotalNota,0 as valorTotalDescFin ");
            sb.append("from \"@HIST_VENTAS\" ");
            sb.append("group by \"U_ANO\" ");
        }
        sb.append("UNION ALL ");
        sb.append(" select 'NC' as Doc, cast(year(n.\"DocDate\") as varchar(4)) as \"ano\",0 as costoTotalVenta, cast(sum((cast(d.\"Quantity\" as int) * cast(d.\"StockPrice\" as numeric(18,0)))) as numeric(18,0))as costoTotalNota,0 as valorTotalVenta, ");
        sb.append("  cast(sum((cast(d.\"LineTotal\" as numeric(18,0)) - (cast(d.\"LineTotal\" as numeric(18,0)) * cast(n.\"DiscPrcnt\" as int))/100)) as numeric(18,0)) as valorTotalNota,0 as valorTotalDescFin ");
        sb.append(" from ORIN n ");
        sb.append(" inner Join RIN1 d ON d.\"DocEntry\"=n.\"DocEntry\" ");
        sb.append(" inner join OSLP a ON n.\"SlpCode\"=a.\"SlpCode\" ");
        sb.append(" inner join OCRD c ON n.\"CardCode\"=c.\"CardCode\" ");
        sb.append(" inner join OCST p ON c.\"State1\"=p.\"Code\" ");
        sb.append(" where n.\"DocDate\" between ADD_YEARS(TO_DATE(current_date,'YYYY-MM-DD'),-3) and current_date and p.\"Country\"='CO' ");
        //TODO: Solo impuesto aplica para IGB
        if (companyName.contains("IGB")) {
            sb.append(" and d.\"TaxOnly\"='N' ");
        }
        sb.append("  and n.\"DocNum\" not in(select \"Code\" from \"@DOC_EXCLU\" where \"U_TIPO\"='NC') ");
        sb.append(" group by year(n.\"DocDate\") ");
        sb.append("UNION ALL ");
        sb.append(" select 'DF' as Doc, cast(year(a.\"TaxDate\") as varchar(4)) as \"ano\", 0 as costoTotalVenta, 0 as costoTotalNota, 0 as valorTotalVenta,0 as valorTotalNota,cast(sum(d.\"Debit\"-d.\"Credit\") as numeric(18,2)) as valorTotalDescFin ");
        sb.append(" from OJDT a ");
        sb.append(" inner join JDT1 d on d.\"TransId\"=a.\"TransId\" ");
        sb.append(" where a.\"TaxDate\" between ADD_YEARS(TO_DATE(current_date,'YYYY-MM-DD'),-3) and current_date and a.\"Memo\"<>'P.133 períodos de cierre' and ");
        if (companyName.contains("VARROC")) {
            sb.append("d.\"Account\" in ('41350515') and a.\"DocSeries\"='18' ");
        } else {
            sb.append("d.\"Account\" in ('41350520','41750540','41750525','41750530') ");
        }
        sb.append("  and a.\"TransId\" not in(select \"Code\" from \"@DOC_EXCLU\" where \"U_TIPO\"='AS') ");
        sb.append(" group by year(a.\"TaxDate\") ");
        sb.append(")as t ");
        sb.append("group by t.\"ano\" order by t.\"ano\"");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando las ventas anuales para la empresa [" + companyName + "]");
        }
        return null;
    }

    public List<Object[]> getMonthlySales(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(v.\"U_MonthName\" as varchar(20))as mes, cast(year(current_date) as varchar(4)) as ano, ");
        sb.append(" ifnull(cast(sum(t.\"costoTotalVenta\" - t.\"costoTotalNota\") as numeric(18,0)),0) as costoTotal, ");
        sb.append(" ifnull(cast(sum(t.\"valorTotalVenta\" - t.\"valorTotalNota\") as numeric(18,0)),0) as valorTotal, ");
        sb.append(" ifnull(cast(((sum(t.\"valorTotalVenta\"-t.\"valorTotalNota\")-sum(t.\"costoTotalVenta\"-t.\"costoTotalNota\"))/nullif(sum(t.\"valorTotalVenta\"-t.\"valorTotalNota\"),0))*100 as numeric(18,2)),0)as margenAnual, ");
        sb.append(" ifnull(cast(sum(t.\"valorTotalDescFin\") as numeric(18,0)),0) as descFin, ");
        sb.append(" ifnull(cast(sum(t.\"valorTotalVenta\" - t.\"valorTotalNota\" - t.\"valorTotalDescFin\") as numeric(18,0)),0) as valorTotalDescFin, ");
        sb.append(" ifnull(cast(((sum(t.\"valorTotalVenta\"-t.\"valorTotalNota\"-t.\"valorTotalDescFin\")-sum(t.\"costoTotalVenta\"-t.\"costoTotalNota\"))/nullif(sum(t.\"valorTotalVenta\"-t.\"valorTotalNota\"-t.\"valorTotalDescFin\"),0))*100 as numeric(18,2)),0)as margenAnualDescFin ");
        sb.append("from \"@SPT_VALUES\" v ");
        sb.append("left join (");
        if (companyName.contains("VARROC")) {
            sb.append("select t.Doc,t.mm,t.mes,sum(t.\"costoTotalVenta\")as \"costoTotalVenta\",sum(t.\"costoTotalNota\")as \"costoTotalNota\",sum(t.\"valorTotalVenta\")as \"valorTotalVenta\",sum(t.\"valorTotalNota\")as \"valorTotalNota\",sum(t.\"valorTotalDescFin\")as \"valorTotalDescFin\" ");
            sb.append("from ( ");
            sb.append(" select 'FV' as Doc,month(f.\"DocDate\")as mm,monthname(f.\"DocDate\")as mes, ");
            sb.append("  cast(sum((cast(d.\"Quantity\" as int)*cast(d.\"StockPrice\" as numeric(18,0))))as numeric(18,0))as \"costoTotalVenta\",0 as \"costoTotalNota\", ");
            sb.append("  case when d.\"TaxOnly\"='N' then cast(sum((cast(d.\"LineTotal\" as numeric(18,0))-(cast(d.\"LineTotal\" as numeric(18,0))*cast(f.\"DiscPrcnt\" as int))/100))as numeric(18,0)) else 0 end as \"valorTotalVenta\", ");
            sb.append("  0 as \"valorTotalNota\",0 as \"valorTotalDescFin\" ");
            sb.append(" from OINV f ");
            sb.append(" inner join INV1 d on d.\"DocEntry\"=f.\"DocEntry\" ");
            sb.append(" inner join OSLP a ON f.\"SlpCode\"=a.\"SlpCode\" ");
            sb.append(" inner join OCRD c ON f.\"CardCode\"=c.\"CardCode\" ");
            sb.append(" inner join OCST p ON c.\"State1\"=p.\"Code\" ");
            sb.append(" where year(f.\"DocDate\")=year(current_date) and p.\"Country\"='CO' and f.\"DocNum\" not in(select \"Code\" from \"@DOC_EXCLU\" where \"U_TIPO\"='FV') ");
            sb.append(" group by monthname(f.\"DocDate\"),year(f.\"DocDate\"),month(f.\"DocDate\"),d.\"TaxOnly\" ");
            sb.append(")as t ");
            sb.append("group by t.Doc,t.mm,t.mes ");
        } else {
            sb.append("select 'FV' as Doc, month(f.\"DocDate\") as mm, monthname(f.\"DocDate\") as mes, ");
            sb.append("cast(sum((cast(d.\"Quantity\" as int) * cast(d.\"StockPrice\" as numeric(18,0)))) as numeric(18,0)) as \"costoTotalVenta\", 0 as \"costoTotalNota\", ");
            sb.append("cast(sum((cast(d.\"LineTotal\" as numeric(18,0)) - (cast(d.\"LineTotal\" as numeric(18,0)) * cast(f.\"DiscPrcnt\" as int))/100)) as numeric(18,0)) as \"valorTotalVenta\",0 as \"valorTotalNota\",0 as \"valorTotalDescFin\" ");
            sb.append("from OINV f ");
            sb.append("inner join INV1 d on d.\"DocEntry\"=f.\"DocEntry\" ");
            sb.append("inner join OSLP a ON f.\"SlpCode\"=a.\"SlpCode\" ");
            sb.append("inner join OCRD c ON f.\"CardCode\"=c.\"CardCode\" ");
            sb.append("inner join OCST p ON c.\"State1\"=p.\"Code\" ");
            sb.append("where year(f.\"DocDate\")=year(current_date) and p.\"Country\"='CO' and f.\"DocNum\" not in(select \"Code\" from \"@DOC_EXCLU\" where \"U_TIPO\"='FV') ");
            //TODO: Solo impuesto aplica para IGB
            if (companyName.contains("IGB")) {
                sb.append(" and d.\"TaxOnly\"='N' ");
            }
            sb.append("group by monthname(f.\"DocDate\"), year(f.\"DocDate\"), month(f.\"DocDate\") ");
        }
        sb.append("UNION ALL ");
        if (companyName.contains("VARROC")) {
            sb.append("select t.Doc,t.mm,t.mes,sum(t.\"costoTotalVenta\")as \"costoTotalVenta\",sum(t.\"costoTotalNota\")as \"costoTotalNota\",sum(t.\"valorTotalVenta\")as \"valorTotalVenta\",sum(t.\"valorTotalNota\")as \"valorTotalNota\",sum(t.\"valorTotalDescFin\")as \"valorTotalDescFin\" ");
            sb.append("from ( ");
            sb.append(" select 'NC' as Doc,month(n.\"DocDate\")as mm,monthname(n.\"DocDate\")as mes,0 as \"costoTotalVenta\", ");
            sb.append("  cast(sum((cast(d.\"Quantity\" as int)*cast(d.\"StockPrice\" as numeric(18,0))))as numeric(18,0))as \"costoTotalNota\",0 as \"valorTotalVenta\", ");
            sb.append("  case when d.\"TaxOnly\"='N' then cast(sum((cast(d.\"LineTotal\" as numeric(18,0))-(cast(d.\"LineTotal\" as numeric(18,0))*cast(ifnull(n.\"DiscPrcnt\",0) as int))/100))as numeric(18,0)) else 0 end as \"valorTotalNota\", ");
            sb.append("  0 as \"valorTotalDescFin\" ");
            sb.append(" from ORIN n ");
            sb.append(" inner join RIN1 d on d.\"DocEntry\"=n.\"DocEntry\" ");
            sb.append(" inner join OSLP a ON n.\"SlpCode\"=a.\"SlpCode\" ");
            sb.append(" inner join OCRD c ON n.\"CardCode\"=c.\"CardCode\" ");
            sb.append(" inner join OCST p ON c.\"State1\"=p.\"Code\" ");
            sb.append(" where year(n.\"DocDate\")=year(current_date) and p.\"Country\"='CO' and n.\"DocNum\" not in(select \"Code\" from \"@DOC_EXCLU\" where \"U_TIPO\"='NC') ");
            sb.append(" group by monthname(n.\"DocDate\"),year(n.\"DocDate\"),month(n.\"DocDate\"),d.\"TaxOnly\" ");
            sb.append(")as t ");
            sb.append("group by t.Doc,t.mm,t.mes ");
        } else {
            sb.append("select 'NC' as Doc, month(n.\"DocDate\") as mm, monthname(n.\"DocDate\") as mes, 0 as \"costoTotalVenta\", ");
            //TODO: Por instrucción de contabilidad, el costo de la nota se calcula diferente
            if (companyName.contains("IGB")) {
                sb.append("sum(cast(case n.\"DocType\" when 'S' then (d.\"LineTotal\"-(d.\"LineTotal\"*(n.\"DiscPrcnt\")/100)) else (d.\"Quantity\"*d.\"StockPrice\")end as numeric(18,0)))as \"costoTotalNota\", ");
            } else {
                sb.append("cast(sum((cast(d.\"Quantity\" as int)*cast(d.\"StockPrice\" as numeric(18,0))))as numeric(18,0))as \"costoTotalNota\", ");
            }
            sb.append(" 0 as \"valorTotalVenta\",cast(sum((cast(d.\"LineTotal\" as numeric(18,0)) - (cast(d.\"LineTotal\" as numeric(18,0)) * cast(ifnull(n.\"DiscPrcnt\",0) as int))/100)) as numeric(18,0)) as \"valorTotalNota\",0 as \"valorTotalDescFin\" ");
            sb.append("from ORIN n ");
            sb.append("inner join RIN1 d on d.\"DocEntry\" = n.\"DocEntry\" ");
            sb.append("inner join OSLP a ON n.\"SlpCode\"=a.\"SlpCode\" ");
            sb.append("inner join OCRD c ON n.\"CardCode\"=c.\"CardCode\" ");
            sb.append("inner join OCST p ON c.\"State1\"=p.\"Code\" ");
            sb.append("where year(n.\"DocDate\")=year(current_date) and p.\"Country\"='CO' and n.\"DocNum\" not in(select \"Code\" from \"@DOC_EXCLU\" where \"U_TIPO\"='NC') ");
            //TODO: Solo impuesto aplica para IGB
            if (companyName.contains("IGB")) {
                sb.append(" and d.\"TaxOnly\"='N' ");
            }
            sb.append("group by monthname(n.\"DocDate\"), year(n.\"DocDate\"), month(n.\"DocDate\") ");
        }
        sb.append("UNION ALL ");
        sb.append("select 'DF' as Doc, month(a.\"TaxDate\") as mm, monthname(a.\"TaxDate\") as mes, 0 as \"costoTotalVenta\", 0 as \"costoTotalNota\", ");
        sb.append(" 0 as \"valorTotalVenta\", 0 as \"valorTotalNota\", cast(sum(d.\"Debit\"-d.\"Credit\") as numeric(18,2)) as \"valorTotalDescFin\" ");
        sb.append("from OJDT a ");
        sb.append("inner join JDT1 d on d.\"TransId\"=a.\"TransId\" ");
        sb.append("where year(a.\"TaxDate\")=year(current_date) and a.\"Memo\"<>'P.133 períodos de cierre' and a.\"TransId\" not in(select \"Code\" from \"@DOC_EXCLU\" where \"U_TIPO\"='AS') and ");
        if (companyName.contains("VARROC")) {
            sb.append(" d.\"Account\" in ('41350515') and a.\"DocSeries\"='18' ");
        } else {
            sb.append("d.\"Account\" in ('41350520','41750540','41750525','41750530') ");
        }
        sb.append("group by monthname(a.\"TaxDate\"), year(a.\"TaxDate\"), month(a.\"TaxDate\") ");
        sb.append(") as t on t.mm = v.\"U_Value\" ");
        sb.append("where v.\"U_Value\" between 1 and 12 ");
        sb.append("group by v.\"U_MonthName\", cast(year(current_date) as varchar(4)),v.\"U_Value\" ");
        sb.append("order by v.\"U_Value\" asc");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando las ventas mensuales para la empresa [" + companyName + "]");
        }
        return null;
    }

    public BigDecimal getInvoiceTotal(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select ifnull(cast(sum(t.valorTotalVenta-t.valorTotalNota-t.valorTotalDescFin) as numeric(18,0)),0)as Facturado ");
        sb.append("from ( ");
        if (companyName.contains("VARROC")) {
            sb.append("select sum(t.valorTotalVenta)as valorTotalVenta,sum(valorTotalNota)as valorTotalNota,sum(valorTotalDescFin)as valorTotalDescFin ");
            sb.append("from ( ");
            sb.append(" select case when d.\"TaxOnly\"='N' then cast(sum((cast(d.\"LineTotal\" as numeric(18,0))-(cast(d.\"LineTotal\" as numeric(18,0))*cast(f.\"DiscPrcnt\" as int))/100))as numeric(18,0)) else 0 end as valorTotalVenta, ");
            sb.append("  0 as valorTotalNota,0 as valorTotalDescFin ");
            sb.append(" from OINV f ");
            sb.append(" inner join INV1 d ON d.\"DocEntry\"=f.\"DocEntry\" ");
            sb.append(" inner join OSLP a ON f.\"SlpCode\"=a.\"SlpCode\" ");
            sb.append(" inner join OCRD c ON f.\"CardCode\"=c.\"CardCode\" ");
            sb.append(" inner join OCST p ON c.\"State1\"=p.\"Code\" ");
            sb.append(" where year(f.\"DocDate\")=year(current_date) and month(f.\"DocDate\")=month(current_date) and p.\"Country\"='CO' and f.\"DocNum\" not in(select \"Code\" from \"@DOC_EXCLU\" where \"U_TIPO\"='FV') ");
            sb.append(" group by d.\"TaxOnly\" ");
            sb.append(")as t ");
        } else {
            sb.append("select cast(sum((cast(d.\"LineTotal\" as numeric(18,0))-(cast(d.\"LineTotal\" as numeric(18,0))*cast(f.\"DiscPrcnt\" as int))/100))as numeric(18,0))as valorTotalVenta,0 as valorTotalNota,0 as valorTotalDescFin ");
            sb.append("from OINV f ");
            sb.append("inner join INV1 d ON d.\"DocEntry\"=f.\"DocEntry\" ");
            sb.append("inner join OSLP a ON f.\"SlpCode\"=a.\"SlpCode\" ");
            sb.append("inner join OCRD c ON f.\"CardCode\"=c.\"CardCode\" ");
            sb.append("inner join OCST p ON c.\"State1\"=p.\"Code\" ");
            sb.append("where year(f.\"DocDate\")=year(current_date) and month(f.\"DocDate\")=month(current_date) and p.\"Country\"='CO' and f.\"DocNum\" not in(select \"Code\" from \"@DOC_EXCLU\" where \"U_TIPO\"='FV') ");
            //TODO: Solo impuesto aplica para IGB
            if (companyName.contains("IGB")) {
                sb.append(" and d.\"TaxOnly\"='N' ");
            }
        }
        sb.append("UNION ALL ");
        if (companyName.contains("VARROC")) {
            sb.append("select sum(t.valorTotalVenta)as valorTotalVenta,sum(t.valorTotalNota)as valorTotalNota,sum(t.valorTotalDescFin)as valorTotalDescFin ");
            sb.append("from ( ");
            sb.append(" select 0 as valorTotalVenta, ");
            sb.append("  case when d.\"TaxOnly\"='N' then cast(sum((cast(d.\"LineTotal\"as numeric(18,0))-(cast(d.\"LineTotal\"as numeric(18,0))*cast(ifnull(n.\"DiscPrcnt\",0)as int))/100))as numeric (18,0)) else 0 end as valorTotalNota, ");
            sb.append("  0 as valorTotalDescFin ");
            sb.append(" from ORIN n ");
            sb.append(" inner join RIN1 d ON d.\"DocEntry\"=n.\"DocEntry\" ");
            sb.append(" inner join OSLP a ON n.\"SlpCode\"=a.\"SlpCode\" ");
            sb.append(" inner join OCRD c ON n.\"CardCode\"=c.\"CardCode\" ");
            sb.append(" inner join OCST p ON c.\"State1\"=p.\"Code\" ");
            sb.append(" where year(n.\"DocDate\")=year(current_date) and month(n.\"DocDate\")=month(current_date) and p.\"Country\"='CO' and n.\"DocNum\" not in (select \"Code\" from \"@DOC_EXCLU\" where \"U_TIPO\"='NC') ");
            sb.append(" group by d.\"TaxOnly\" ");
            sb.append(")as t ");
        } else {
            sb.append("select 0 as valorTotalVenta,cast(sum((cast(d.\"LineTotal\" as numeric(18,0))-(cast(d.\"LineTotal\" as numeric(18,0))*cast(ifnull(n.\"DiscPrcnt\",0) as int))/100))as numeric(18,0))as valorTotalNota,0 as valorTotalDescFin ");
            sb.append("from ORIN n ");
            sb.append("inner join RIN1 d ON d.\"DocEntry\"=n.\"DocEntry\" ");
            sb.append("inner join OSLP a ON n.\"SlpCode\"=a.\"SlpCode\" ");
            sb.append("inner join OCRD c ON n.\"CardCode\"=c.\"CardCode\" ");
            sb.append("inner join OCST p ON c.\"State1\"=p.\"Code\" ");
            sb.append("where year(n.\"DocDate\")=year(current_date) and month(n.\"DocDate\")=month(current_date) and p.\"Country\"='CO' and n.\"DocNum\" not in(select \"Code\" from \"@DOC_EXCLU\" where \"U_TIPO\"='NC') ");
            //TODO: Solo impuesto aplica para IGB
            if (companyName.contains("IGB")) {
                sb.append(" and d.\"TaxOnly\"='N' ");
            }
        }
        sb.append("UNION ALL ");
        sb.append(" select 0 as valorTotalVenta,0 as valorTotalNota,cast(sum(d.\"Debit\"-d.\"Credit\") as numeric(18,2))as valorTotalDescFin ");
        sb.append(" from OJDT a ");
        sb.append(" inner join JDT1 d on d.\"TransId\"=a.\"TransId\" ");
        sb.append(" where year(a.\"TaxDate\")=year(current_date) and month(a.\"TaxDate\")=month(current_date) and a.\"Memo\"<>'P.133 períodos de cierre' and a.\"TransId\" not in(select \"Code\" from \"@DOC_EXCLU\" where \"U_TIPO\"='AS') and ");
        if (companyName.contains("VARROC")) {
            sb.append("d.\"Account\" in ('41350515') and a.\"DocSeries\"='18' ");
        } else {
            sb.append("d.\"Account\" in ('41350520','41750540','41750525','41750530') ");
        }
        sb.append(")as t");
        try {
            return (BigDecimal) persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el total facturado a la fecha para [" + companyName + "]", e);
        }
        return new BigDecimal(0);
    }

    public Integer getOrdersForShipping(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(count(f.\"DocNum\") as int) as ordenes from OINV f where f.\"U_SHIPPING\" = 'N' and (f.\"U_TOT_CAJ\">=0 or f.\"U_TOT_CAJ\" is null) ");
        try {
            return (Integer) persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando el total de ordenes pendientes por shipping.", e);
        }
        return 0;
    }

    public List<Object[]> listDetailInvoice(String docNum, String companyname, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(d.\"ItemCode\" as varchar(20))as item,cast(d.\"Dscription\" as varchar(100))as itemName,cast(d.\"Quantity\" as int)as qty,cast(d.\"GrossBuyPr\" as numeric(18,2))as costo ");
        sb.append("from OINV e ");
        sb.append("inner join INV1 d on d.\"DocEntry\"=e.\"DocEntry\" ");
        sb.append("where e.\"DocNum\"=");
        sb.append(docNum);
        try {
            return persistenceConf.chooseSchema(companyname, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando el detalle de la factura #" + docNum);
        }
        return new ArrayList<>();
    }

    public void updateGuiaTransport(String docNum, String nroGuia, String urlGuia, String username, String totalBox, String vlrDecl, String peso, String companyname, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("update OINV set \"U_UBIC1\"='");
        sb.append(nroGuia);
        sb.append("',\"U_nwr_Tag\"='");
        sb.append(urlGuia);
        sb.append("',\"U_SEPARADOR\"='");
        sb.append(username);
        sb.append("',\"U_TOT_CAJ\"='");
        sb.append(totalBox);
        sb.append("',\"U_VLR_SEG\"='");
        sb.append(vlrDecl);
        sb.append("',\"U_PESO_BRUTO\"='");
        sb.append(peso);
        sb.append("',\"U_VR_DECLARADO\"='");
        sb.append(vlrDecl);
        sb.append("' where \"DocNum\" in(");
        sb.append(docNum);
        sb.append(")");
        try {
            persistenceConf.chooseSchema(companyname, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).executeUpdate();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al actualizar la guia para la(s) factura(s) #[" + docNum.toString() + "]", e);
        }
    }

    public List<Object[]> listCashInvoicesForShipping(String companyname, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select distinct cast(\"DocNum\" as varchar(10))as docNum,cast(\"CardCode\" as varchar(20))as cardCode,cast(\"CardName\" as varchar(100))as cardName, ");
        sb.append(" cast(\"SlpName\" as varchar(100))as slpName,cast(f.\"DocDate\" as date)as docDate,cast(days_between(f.\"DocDate\",current_date) as int)as day, ");
        sb.append(" cast(\"DocTotal\" as numeric(18,0))as docTotal,cast(\"DocTotal\"-\"PaidToDate\" as numeric(18,0))as balance,cast(\"U_DESPACHO_CONTADO\" as varchar(50))as status, ");
        sb.append(" case when d.\"WhsCode\" in('01','30') then 'REPUESTOS' else 'LLANTAS' end category,cast(a.\"Memo\" as varchar(50))as location ");
        sb.append("from OINV f ");
        sb.append("inner join OSLP a ON f.\"SlpCode\" = a.\"SlpCode\" ");
        sb.append("inner join INV1 d ON f.\"DocEntry\" = d.\"DocEntry\" ");
        sb.append("where \"GroupNum\"='-1'and (\"U_DESPACHO_CONTADO\" is null or \"U_DESPACHO_CONTADO\"='En Proceso') and f.\"DocNum\">'525000' and ");
        sb.append(" d.\"ItemCode\" not in ('INTMORA','FLETES','DESCUENTO') and f.\"DocType\"='I' and f.\"SlpCode\" not in ('15','22','81')");
        try {
            return persistenceConf.chooseSchema(companyname, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al listar las facturas de contado para despachar en " + companyname, e);
        }
        return new ArrayList<>();
    }

    public void updateStatusCashInvoice(Integer docNum, String status, String note, String companyname, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("update OINV ");
        sb.append("set \"U_DESPACHO_CONTADO\"='");
        sb.append(status);
        sb.append("',\"U_nwr_Note\"='");
        sb.append(note);
        sb.append("' where \"DocNum\" ='");
        sb.append(docNum);
        sb.append("'");
        try {
            persistenceConf.chooseSchema(companyname, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).executeUpdate();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al actulizar el estado (Despacho-Contado) para la factura " + docNum + " en " + companyname, e);
        }
    }
}