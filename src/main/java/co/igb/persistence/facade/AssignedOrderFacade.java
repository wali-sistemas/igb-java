package co.igb.persistence.facade;

import co.igb.persistence.entity.AssignedOrder;
import co.igb.persistence.entity.AssignedOrder_;
import java.util.ArrayList;
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
 * @author dbotero
 */
@Stateless
public class AssignedOrderFacade extends AbstractFacade<AssignedOrder> {

    private static final Logger CONSOLE = Logger.getLogger(AssignedOrderFacade.class.getSimpleName());

    @PersistenceContext(unitName = "MySQLPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AssignedOrderFacade() {
        super(AssignedOrder.class);
    }

    public List<AssignedOrder> listOpenAssignations() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<AssignedOrder> cq = cb.createQuery(AssignedOrder.class);
        Root<AssignedOrder> root = cq.from(AssignedOrder.class);
        cq.where(cb.equal(root.get(AssignedOrder_.status), "open"));
        try {
            return em.createQuery(cq).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar las ordenes de venta asignadas abiertas. ", e);
            return new ArrayList();
        }
    }

    public List<AssignedOrder> listOpenAssignationsByUser(String username) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<AssignedOrder> cq = cb.createQuery(AssignedOrder.class);
        Root<AssignedOrder> root = cq.from(AssignedOrder.class);
        cq.where(cb.equal(root.get(AssignedOrder_.status), "open"), cb.equal(root.get(AssignedOrder_.empId), username));
        try {
            return em.createQuery(cq).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar las ordenes de venta asignadas abiertas. ", e);
            return new ArrayList();
        }
    }

    public AssignedOrder findByOrderNumber(Integer orderNumber) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<AssignedOrder> cq = cb.createQuery(AssignedOrder.class);
        Root<AssignedOrder> root = cq.from(AssignedOrder.class);
        cq.where(cb.equal(root.get(AssignedOrder_.orderNumber), orderNumber));
        try {
            return em.createQuery(cq).getSingleResult();
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar asignaciones para la orden " + orderNumber, e);
            return null;
        }
    }
}
