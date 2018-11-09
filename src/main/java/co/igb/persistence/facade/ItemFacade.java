package co.igb.persistence.facade;

import co.igb.ejb.IGBApplicationBean;
import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.logging.Level;
import java.util.logging.Logger;

@Stateless
public class ItemFacade {
    private static final Logger CONSOLE = Logger.getLogger(ItemFacade.class.getSimpleName());
    private static final String DB_TYPE = Constants.DATABASE_TYPE_MSSQL;

    @Inject
    private IGBApplicationBean applicationBean;

    @EJB
    private PersistenceConf persistenceConf;

    public ItemFacade() {

    }

    public String getItemName(String itemCode, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(itemname as varchar(200)) itemname from oitm where itemcode='");
        sb.append(itemCode);
        sb.append("'");
        try {
            return (String) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el nombre del item " + itemCode, e);
            return null;
        }
    }
}
