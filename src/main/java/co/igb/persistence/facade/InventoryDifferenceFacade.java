package co.igb.persistence.facade;

import co.igb.persistence.entity.InventoryDifference;
import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.logging.Logger;

/**
 * @author YEIJARA
 */
@Stateless
public class InventoryDifferenceFacade {

    private static final Logger CONSOLE = Logger.getLogger(InventoryFacade.class.getSimpleName());
    private static final String DB_TYPE = Constants.DATABASE_TYPE_MYSQL;

    @EJB
    private PersistenceConf persistenceConf;

    public InventoryDifferenceFacade() {

    }

    public void create(InventoryDifference inventoryDifference, String companyName, boolean testing) {
        persistenceConf.chooseSchema(companyName, testing, DB_TYPE).persist(inventoryDifference);
    }
}
