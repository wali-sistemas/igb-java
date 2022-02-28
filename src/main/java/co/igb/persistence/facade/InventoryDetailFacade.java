package co.igb.persistence.facade;

import co.igb.persistence.entity.InventoryDetail;
import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author YEIJARA
 */
@Stateless
public class InventoryDetailFacade {
    private static final Logger CONSOLE = Logger.getLogger(InventoryFacade.class.getSimpleName());
    private static final String DB_TYPE_WALI = Constants.DATABASE_TYPE_WALI;
    @EJB
    private PersistenceConf persistenceConf;

    public InventoryDetailFacade() {
    }

    public void addDetail(InventoryDetail detail, String companyName, boolean testing) {
        persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI).persist(detail);
    }

    public List<InventoryDetail> findInventoryDetail(Integer idInventory, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();

        sb.append("SELECT * ");
        sb.append("FROM   inventory_detail ");
        sb.append("WHERE  idinventory = ");
        sb.append(idInventory);

        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI)
                    .createNativeQuery(sb.toString(), InventoryDetail.class).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al obtener el detalle del inventario. ", e);
            return null;
        }
    }
}