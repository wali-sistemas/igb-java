package co.igb.persistence.facade;

import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dbotero
 */
@Stateless
public class CustomerFacade {

    private static final Logger CONSOLE = Logger.getLogger(CustomerFacade.class.getSimpleName());
    private static final String DB_TYPE = Constants.DATABASE_TYPE_MSSQL;

    @EJB
    private PersistenceConf persistenceConf;

    public String getCustomerName(String customerId, String schema, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(cardname as varchar(100)) cardname from OCRD where cardcode = '");
        sb.append(customerId);
        sb.append("'");
        try {
            return (String) persistenceConf.chooseSchema(schema, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el nombre del cliente con id #[" + customerId + "]", e);
            return null;
        }
    }

    public int getCustomerCreditDays(String cardCode, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(pay.extradays as int) days from ocrd cus ");
        sb.append("inner join octg pay on pay.groupnum = cus.groupnum ");
        sb.append("where cus.cardcode = '");
        sb.append(cardCode);
        sb.append("'");
        try {
            return (Integer) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el plazo de credito para un cliente. ", e);
            return 0;
        }
    }

    public BigDecimal getCustomerFlete(String customerId, String schema, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select ISNULL(cast(t.U_PORC_FLE_CLIE as numeric(4,2)),0) as porcetajeFlete ");
        sb.append("from  OCRD s ");
        sb.append("inner join CRD1 d ON d.CardCode = s.CardCode and s.ShipToDef = d.Address ");
        sb.append("inner join [@TRANSP_TAR] t ON t.Code = d.U_Municipio ");
        sb.append("where s.CardCode = '");
        sb.append(customerId);
        sb.append("' and d.AdresType = 'S'");
        try {
            return (BigDecimal) persistenceConf.chooseSchema(schema, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando el porcentaje de flete para el cliente #[" + customerId + "]");
            return null;
        }
    }

    public List<Object[]> getWithholdingTaxData(String cardCode, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(di.WTCode as varchar(6)) as WTCode, cast(i.PrctBsAmnt as numeric(4,2)) as PrctBsAmnt, ");
        sb.append("       cast(i.U_BP_Base_Mi as numeric(18,2)) as U_BP_Base_Mi, cast(i.U_Tipo as varchar(10)) as U_Tipo ");
        sb.append("from CRD4 di ");
        sb.append("inner join OWHT i ON i.WTCode = di.WTCode ");
        sb.append("where i.Inactive = 'N' and di.cardCode = '");
        sb.append(cardCode);
        sb.append("' order by di.WTCode");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando la tabla de retencion del cliente #[" + cardCode + "]");
            return null;
        }
    }

    public List<Object[]> getExpensesCode(String cardCode, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(x.ExpnsCode as numeric(6)) as ExpnsCode, cast(i.PrctBsAmnt as numeric(4,2)) as PrctBsAmnt, cast(i.U_BP_Base_Mi as numeric(18,2)) as U_BP_Base_Mi ");
        sb.append("from CRD4 di ");
        sb.append("inner join OWHT i ON i.WTCode = di.WTCode ");
        sb.append("inner join OEXD x ON x.ExpnsName = i.U_GASTO ");
        sb.append("where i.Inactive = 'N' and di.cardCode = '");
        sb.append(cardCode);
        sb.append("' order by di.WTCode");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando la tabla de retencion del cliente #[" + cardCode + "]");
            return null;
        }
    }
}