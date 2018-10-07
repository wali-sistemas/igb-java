package co.igb.persistence.facade;

import co.igb.persistence.entity.InventoryDifference;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import java.util.logging.Logger;

/**
 *
 * @author YEIJARA
 */
@Stateless
public class InventoryDifferenceFacade extends AbstractFacade<InventoryDifference> {

    private static final Logger CONSOLE = Logger.getLogger(InventoryFacade.class.getSimpleName());
    @EJB
    private PersistenceConf persistenceConf;

    @Override
    protected EntityManager getEntityManager() {
        return persistenceConf.chooseSchema("MySQLPU");
    }

    public InventoryDifferenceFacade() {
        super(InventoryDifference.class);
    }
}
