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
import javax.persistence.criteria.Predicate;
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
        Predicate statusOpen = cb.equal(root.get(AssignedOrder_.status), "open");
        Predicate statusWarning = cb.equal(root.get(AssignedOrder_.status), "warning");
        cq.where(cb.or(statusOpen, statusWarning));
        try {
            return em.createQuery(cq).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar las ordenes de venta asignadas abiertas. ", e);
            return new ArrayList();
        }
    }

    public List<AssignedOrder> listOpenAssignationsByUserAndCompany(String username, Integer orderNumber, String company) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<AssignedOrder> cq = cb.createQuery(AssignedOrder.class);
        Root<AssignedOrder> root = cq.from(AssignedOrder.class);

        Predicate statusOpen = cb.equal(root.get(AssignedOrder_.status), "open");
        //Predicate statusWarning = cb.equal(root.get(AssignedOrder_.status), "warning");
        //Predicate status = cb.or(statusOpen, statusWarning);
        Predicate userOwns = cb.equal(root.get(AssignedOrder_.empId), username);
        Predicate companyFilter = cb.equal(root.get(AssignedOrder_.company), company);

        if (orderNumber != null && orderNumber > 0) {
            Predicate orderFilter = cb.equal(root.get(AssignedOrder_.orderNumber), orderNumber);
            cq.where(statusOpen, userOwns, companyFilter, orderFilter);
        } else {
            cq.where(statusOpen, userOwns, companyFilter);
        }

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

    public Integer countOrderEmployeeAssigneed(String user) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(Integer.class);
        Root root = cq.from(AssignedOrder.class);

        cq.where(cb.equal(root.get(AssignedOrder_.empId), user), cb.equal(root.get(AssignedOrder_.status), "open"));
        cq.select(cb.count(root.get(AssignedOrder_.id)));

        try {
            return ((Long) em.createQuery(cq).getSingleResult()).intValue();
        } catch (NoResultException e) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar las ordenes asignadas por empleado. ", e);
        }
        return 0;
    }
}
