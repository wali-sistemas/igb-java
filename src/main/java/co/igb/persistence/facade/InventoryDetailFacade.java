package co.igb.persistence.facade;

import co.igb.persistence.entity.InventoryDetail;
import java.util.List;
import java.util.logging.Level;
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

    public List<InventoryDetail> findInventoryDetail(Integer idInventory) {
        StringBuilder sb = new StringBuilder();

        sb.append("SELECT * ");
        sb.append("FROM   inventory_detail ");
        sb.append("WHERE  idinventory = ");
        sb.append(idInventory);

        try {
            return em.createNativeQuery(sb.toString(), InventoryDetail.class).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al obtener el detalle del inventario. ", e);
            return null;
        }
    }
}
