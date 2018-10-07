package co.igb.persistence.facade;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dbotero
 */
@Stateless
public class CustomerFacade {

    private static final Logger CONSOLE = Logger.getLogger(CustomerFacade.class.getSimpleName());

    @EJB
    private PersistenceConf persistenceConf;

    public String getCustomerName(String customerId, String schema) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(cardname as varchar(100)) cardname from OCRD where cardcode = '");
        sb.append(customerId);
        sb.append("'");
        return (String) persistenceConf.chooseSchema(schema).createNativeQuery(sb.toString()).getSingleResult();
    }

    public int getCustomerCreditDays(String cardCode, String companyName) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(pay.extradays as int) days from ocrd cus ");
        sb.append("inner join octg pay on pay.groupnum = cus.groupnum ");
        sb.append("where cus.cardcode = '");
        sb.append(cardCode);
        sb.append("'");
        try {
            return (Integer) persistenceConf.chooseSchema(companyName).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el plazo de credito para un cliente. ", e);
            return 0;
        }
    }
}
