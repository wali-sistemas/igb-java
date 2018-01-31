package co.igb.persistence.facade;

import co.igb.persistence.entity.InventoryDifference;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author YEIJARA
 */
@Stateless
public class InventoryDifferenceFacade extends AbstractFacade<InventoryDifference> {

    private static final Logger CONSOLE = Logger.getLogger(InventoryFacade.class.getSimpleName());
    @PersistenceContext(unitName = "MySQLPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InventoryDifferenceFacade() {
        super(InventoryDifference.class);
    }
}
