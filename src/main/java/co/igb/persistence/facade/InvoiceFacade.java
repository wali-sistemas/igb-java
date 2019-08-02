package co.igb.persistence.facade;

import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;
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

    public List<Object[]> findListInvoicesShipping(String transport, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select TOP 10 CAST(f.DocDate as date) as DocDate, CAST(f.U_TOT_CAJ as int) as Box, CAST(f.DocNum as varchar(10)) as DocNum, ");
        sb.append("       CAST(f.CardCode as varchar(20)) as CardCode, CAST(f.CardName as varchar(100)) as CardName, ");
        sb.append("       CAST(t.Name as varchar(20)) as Transport, CAST(d.StreetS as varchar(100)) as Street, ");
        sb.append("       CAST(l.Name as varchar(50)) as Depart, CAST(d.CityS as varchar(50)) as City ");
        sb.append("from   OINV f ");
        sb.append("inner  join INV12 d ON d.DocEntry = f.DocEntry ");
        sb.append("inner  join [@TRANSP] t ON t.Code = f.U_TRANSP ");
        sb.append("inner  join OCST l ON l.Code = d.StateS ");
        sb.append("where  f.U_SHIPPING = 'N' and f.U_TOT_CAJ > 0 ");
        if (!transport.equals("*")) {
            sb.append("and t.Name = '");
            sb.append(transport);
            sb.append("'");
        }
        sb.append(" order  by f.DocDate desc, t.Name ASC");
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
        sb.append("select DISTINCT CAST(t.Name as varchar(20)) as Transport ");
        sb.append("from   OINV f ");
        sb.append("inner  join INV1 d ON d.DocEntry = f.DocEntry and d.WhsCode = '01' ");
        sb.append("inner  join [@TRANSP] t ON t.Code = f.U_TRANSP ");
        sb.append("where  f.U_SHIPPING = 'N' and f.U_TOT_CAJ > 0 ");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException e) {
        } catch (Exception ex) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error listando las transportadoras.");
        }
        return null;
    }
}