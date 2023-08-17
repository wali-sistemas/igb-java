package co.igb.persistence.facade;

import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
public class CustomerFacade {
    private static final Logger CONSOLE = Logger.getLogger(CustomerFacade.class.getSimpleName());
    private static final String DB_TYPE_HANA = Constants.DATABASE_TYPE_HANA;
    @EJB
    private PersistenceConf persistenceConf;

    public String getCustomerName(String customerId, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(o.\"CardName\" as varchar(100))as CardName from OCRD o where o.\"CardCode\"='");
        sb.append(customerId);
        sb.append("'");
        try {
            return (String) persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el nombre del cliente con id #[" + customerId + "]", e);
            return null;
        }
    }

    public int getCustomerCreditDays(String cardCode, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(pay.\"ExtraDays\" as int) days from OCRD cus ");
        sb.append("inner join OCTG pay on pay.\"GroupNum\" = cus.\"GroupNum\" ");
        sb.append("where cus.\"CardCode\"='");
        sb.append(cardCode);
        sb.append("'");
        try {
            return (Integer) persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el plazo de credito para un cliente. ", e);
            return 0;
        }
    }

    public BigDecimal getCustomerFlete(String customerId, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select ifnull(cast(t.\"U_PORC_FLE_CLIE\" as numeric(4,2)),0) as porcetajeFlete ");
        sb.append("from  OCRD s ");
        sb.append("inner join CRD1 d on d.\"CardCode\"=s.\"CardCode\" and s.\"ShipToDef\" = d.\"Address\" ");
        sb.append("inner join \"@TRANSP_TAR\" t on t.\"Code\"=d.\"U_Municipio\" ");
        sb.append("where s.\"CardCode\"='");
        sb.append(customerId);
        sb.append("' and d.\"AdresType\"='S'");
        try {
            return (BigDecimal) persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando el porcentaje de flete para el cliente #[" + customerId + "]");
            return null;
        }
    }

    public String disableFreightCollection(String cardCode, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(\"QryGroup16\" as varchar(1)) ");
        sb.append("from OCRD ");
        sb.append("where \"CardCode\"='");
        sb.append(cardCode);
        sb.append("'");
        try {
            return (String) persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando si al cliente [" + cardCode + "] se le cobra flete");
        }
        return "N";
    }

    public List<Object[]> getWithholdingTaxData(String cardCode, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(di.\"WTCode\" as varchar(6)) as WTCode, cast(i.\"PrctBsAmnt\" as numeric(18,2)) as PrctBsAmnt, ");
        sb.append(" cast(i.\"U_BP_Base_Mi\" as numeric(18,2)) as U_BP_Base_Mi, cast(i.\"U_Tipo\" as varchar(10)) as U_Tipo ");
        sb.append("from CRD4 di ");
        sb.append("inner join OWHT i on i.\"WTCode\"=di.\"WTCode\" ");
        sb.append("where i.\"Inactive\"='N' and di.\"CardCode\"='");
        sb.append(cardCode);
        sb.append("' order by di.\"WTCode\"");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando la tabla de retencion del cliente #[" + cardCode + "]");
            return null;
        }
    }

    public List<Object[]> getExpensesCode(String cardCode, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(x.\"ExpnsCode\" as numeric(6)) as ExpnsCode, cast(i.\"PrctBsAmnt\" as numeric(4,2)) as PrctBsAmnt, cast(i.\"U_BP_Base_Mi\" as numeric(18,2)) as U_BP_Base_Mi ");
        sb.append("from CRD4 di ");
        sb.append("inner join OWHT i on i.\"WTCode\"=di.\"WTCode\" ");
        sb.append("inner join OEXD x on x.\"ExpnsName\"=i.\"U_GASTO\" ");
        sb.append("where i.\"Inactive\"='N' and di.\"CardCode\"='");
        sb.append(cardCode);
        sb.append("' order by di.\"WTCode\"");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando la tabla de retencion del cliente #[" + cardCode + "]");
            return null;
        }
    }
}