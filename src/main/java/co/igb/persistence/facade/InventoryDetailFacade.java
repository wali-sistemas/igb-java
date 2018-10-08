package co.igb.persistence.facade;

import co.igb.persistence.entity.InventoryDetail;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YEIJARA
 */
@Stateless
public class InventoryDetailFacade extends AbstractFacade<InventoryDetail> {

    private static final Logger CONSOLE = Logger.getLogger(InventoryFacade.class.getSimpleName());
    private static final String DB_TYPE = "mysql";

    @EJB
    private PersistenceConf persistenceConf;

    @Override
    protected EntityManager getEntityManager() {
        return persistenceConf.chooseSchema("MySQLPU", DB_TYPE);
    }

    public InventoryDetailFacade() {
        super(InventoryDetail.class);
    }

    public List<InventoryDetail> findInventoryDetail(Integer idInventory, String companyName) {
        StringBuilder sb = new StringBuilder();

        sb.append("SELECT * ");
        sb.append("FROM   inventory_detail ");
        sb.append("WHERE  idinventory = ");
        sb.append(idInventory);

        try {
            return persistenceConf.chooseSchema(companyName, DB_TYPE).createNativeQuery(sb.toString(), InventoryDetail.class).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al obtener el detalle del inventario. ", e);
            return null;
        }
    }
}
