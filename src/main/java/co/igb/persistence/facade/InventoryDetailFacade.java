package co.igb.persistence.facade;

import co.igb.persistence.entity.InventoryDetail;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author YEIJARA
 */
@Stateless
public class InventoryDetailFacade extends AbstractFacade<InventoryDetail> {

    private static final Logger CONSOLE = Logger.getLogger(InventoryFacade.class.getSimpleName());
    @PersistenceContext(unitName = "MySQLPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InventoryDetailFacade() {
        super(InventoryDetail.class);
    }
}
