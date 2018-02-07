package co.igb.persistence.facade;

import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dbotero
 */
@Stateless
public class CustomerFacade {

    private static final Logger CONSOLE = Logger.getLogger(CustomerFacade.class.getSimpleName());

    @PersistenceContext(unitName = "IGBPU")
    private EntityManager emIGB;
    @PersistenceContext(unitName = "VARROCPU")
    private EntityManager emVARROC;

    private EntityManager chooseSchema(String schemaName) {
        switch (schemaName) {
            case "IGB":
                return emIGB;
            case "VARROC":
                return emVARROC;
            default:
                return null;
        }
    }

    public String getCustomerName(String customerId, String schema) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(cardname as varchar(100)) cardname from OCRD where cardcode = '");
        sb.append(customerId);
        sb.append("'");
        return (String) chooseSchema(schema).createNativeQuery(sb.toString()).getSingleResult();
    }
}
