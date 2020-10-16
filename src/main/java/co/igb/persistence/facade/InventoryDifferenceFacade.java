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

    private static final String DB_TYPE_WALI = Constants.DATABASE_TYPE_WALI;

    @EJB
    private PersistenceConf persistenceConf;

    public InventoryDifferenceFacade() {
    }

    public void create(InventoryDifference inventoryDifference, String companyName, boolean testing) {
        persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI).persist(inventoryDifference);
    }
}