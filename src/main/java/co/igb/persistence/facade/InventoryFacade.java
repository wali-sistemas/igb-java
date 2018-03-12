package co.igb.persistence.facade;

import co.igb.persistence.entity.Inventory;
import co.igb.persistence.entity.Inventory_;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author YEIJARA
 */
@Stateless
public class InventoryFacade extends AbstractFacade<Inventory> {

    private static final Logger CONSOLE = Logger.getLogger(InventoryFacade.class.getSimpleName());
    @PersistenceContext(unitName = "MySQLPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InventoryFacade() {
        super(Inventory.class);
    }

    public Inventory findLastInventoryOpen(String warehouse, String schema) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Inventory> cq = cb.createQuery(Inventory.class);
        Root<Inventory> inventory = cq.from(Inventory.class);

        cq.where(cb.equal(inventory.get(Inventory_.status), "PE"),
                cb.equal(inventory.get(Inventory_.whsCode), warehouse),
                cb.equal(inventory.get(Inventory_.company), schema));

        cq.orderBy(cb.desc(inventory.get(Inventory_.id)));

        try {
            return em.createQuery(cq).setMaxResults(1).getSingleResult();
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los inventarios pendientes. ", e);
            return null;
        }
    }

    public List<Object[]> obtenerUltimosInventarios(String schema, List<String> locations) {
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
            return em.createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "", e);
            return null;
        }
    }
}
