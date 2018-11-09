package co.igb.persistence.facade;

import co.igb.persistence.entity.Inventory;
import co.igb.persistence.entity.Inventory_;
import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Stateless
public class InventoryFacade {

    private static final Logger CONSOLE = Logger.getLogger(InventoryFacade.class.getSimpleName());
    private static final String DB_TYPE = Constants.DATABASE_TYPE_MYSQL;

    @EJB
    private PersistenceConf persistenceConf;

    public InventoryFacade() {

    }

    public void create(Inventory inventory, String companyName, boolean testing) {
        persistenceConf.chooseSchema(companyName, testing, DB_TYPE).persist(inventory);
    }

    public Inventory edit(Inventory inventory, String companyName, boolean testing) {
        return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).merge(inventory);
    }

    public Inventory find(Integer idInventory, String companyName, boolean testing) {
        return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).find(Inventory.class, idInventory);
    }

    public Inventory findLastInventoryOpen(String warehouse, String companyName, boolean testing) {
        CriteriaBuilder cb = persistenceConf.chooseSchema(companyName, testing, DB_TYPE).getCriteriaBuilder();
        CriteriaQuery<Inventory> cq = cb.createQuery(Inventory.class);
        Root<Inventory> inventory = cq.from(Inventory.class);

        cq.where(cb.equal(inventory.get(Inventory_.status), "PE"),
                cb.equal(inventory.get(Inventory_.whsCode), warehouse),
                cb.equal(inventory.get(Inventory_.company), companyName));

        cq.orderBy(cb.desc(inventory.get(Inventory_.id)));

        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createQuery(cq).setMaxResults(1).getSingleResult();
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los inventarios pendientes. ", e);
            return null;
        }
    }

    public List<Object[]> obtenerUltimosInventarios(String schema, List<String> locations, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();

        sb.append("SELECT location, MAX(date) ");
        sb.append("FROM   igb.inventory ");
        sb.append("WHERE  company = '");
        sb.append(schema);
        sb.append("' AND   location IN (");
        for (String s : locations) {
            sb.append("'");
            sb.append(s);
            sb.append("', ");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(sb.length() - 1);
        sb.append(") GROUP by location ");
        sb.append("ORDER BY MAX(date)");

        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "", e);
            return null;
        }
    }
}
