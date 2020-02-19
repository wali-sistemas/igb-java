package co.igb.persistence.facade;

import co.igb.persistence.entity.AssignedOrder;
import co.igb.persistence.entity.AssignedOrder_;
import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dbotero
 */
@Stateless
public class AssignedOrderFacade {

    private static final Logger CONSOLE = Logger.getLogger(AssignedOrderFacade.class.getSimpleName());
    private static final String DB_TYPE = Constants.DATABASE_TYPE_MYSQL;

    @EJB
    private PersistenceConf persistenceConf;

    public AssignedOrderFacade() {

    }

    public void create(AssignedOrder assignation, String companyName, boolean testing) {
        persistenceConf.chooseSchema(companyName, testing, DB_TYPE).persist(assignation);
    }

    public AssignedOrder edit(AssignedOrder assignation, String companyName, boolean testing) {
        return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).merge(assignation);
    }

    public List<AssignedOrder> listOpenAssignations(String companyName, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(companyName, testing, DB_TYPE);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<AssignedOrder> cq = cb.createQuery(AssignedOrder.class);
        Root<AssignedOrder> root = cq.from(AssignedOrder.class);
        Predicate statusOpen = cb.equal(root.get(AssignedOrder_.status), "open");
        Predicate statusWarning = cb.equal(root.get(AssignedOrder_.status), "warning");
        cq.where(cb.or(statusOpen, statusWarning), cb.equal(root.get(AssignedOrder_.company), companyName));
        try {
            return em.createQuery(cq).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar las ordenes de venta asignadas abiertas. ", e);
            return new ArrayList<>();
        }
    }

    public List<AssignedOrder> listClosedAssignations(String companyName, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(companyName, testing, DB_TYPE);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<AssignedOrder> cq = cb.createQuery(AssignedOrder.class);
        Root<AssignedOrder> root = cq.from(AssignedOrder.class);
        Predicate statusClosed = cb.equal(root.get(AssignedOrder_.status), Constants.STATUS_CLOSED);
        cq.where(statusClosed, cb.equal(root.get(AssignedOrder_.company), companyName));
        try {
            return em.createQuery(cq).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar las ordenes de venta asignadas cerradas. ", e);
            return new ArrayList<>();
        }
    }

    public List<AssignedOrder> listOpenAssignationsByUserAndCompany(String username, Integer orderNumber, String companyName, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(companyName, testing, DB_TYPE);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<AssignedOrder> cq = cb.createQuery(AssignedOrder.class);
        Root<AssignedOrder> root = cq.from(AssignedOrder.class);

        Predicate statusOpen = cb.equal(root.get(AssignedOrder_.status), "open");
        //Predicate statusWarning = cb.equal(root.get(AssignedOrder_.status), "warning");
        //Predicate status = cb.or(statusOpen, statusWarning);
        Predicate userOwns = cb.equal(root.get(AssignedOrder_.empId), username);
        Predicate companyFilter = cb.equal(root.get(AssignedOrder_.company), companyName);

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
            return new ArrayList<>();
        }
    }

    public AssignedOrder findByOrderNumber(Integer orderNumber, String companyName, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(companyName, testing, DB_TYPE);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<AssignedOrder> cq = cb.createQuery(AssignedOrder.class);
        Root<AssignedOrder> root = cq.from(AssignedOrder.class);
        cq.where(cb.equal(root.get(AssignedOrder_.orderNumber), orderNumber), cb.equal(root.get(AssignedOrder_.company), companyName));
        try {
            return em.createQuery(cq).getSingleResult();
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar asignaciones para la orden " + orderNumber, e);
            return null;
        }
    }

    public Integer countOrderEmployeeAssigneed(String user, String companyName, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(companyName, testing, DB_TYPE);
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

    public boolean enablePicking(Integer orderNumber, String companyName, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(companyName, testing, DB_TYPE);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaUpdate<AssignedOrder> cu = cb.createCriteriaUpdate(AssignedOrder.class);
        Root<AssignedOrder> root = cu.from(AssignedOrder.class);
        cu.set(root.get(AssignedOrder_.status), "open");
        cu.where(cb.equal(root.get(AssignedOrder_.orderNumber), orderNumber));
        try {
            int rows = em.createQuery(cu).executeUpdate();
            if (rows == 1) {
                return true;
            }
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al cambiar el estado de la asignacion de picking. ", e);
        }
        return false;
    }

    public boolean deleteAssignedOrder(Integer orderNumber, String companyName, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(companyName, testing, DB_TYPE);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaDelete<AssignedOrder> cd = cb.createCriteriaDelete(AssignedOrder.class);
        Root<AssignedOrder> root = cd.from(AssignedOrder.class);
        cd.where(cb.equal(root.get(AssignedOrder_.orderNumber), orderNumber));
        try {
            int rows = em.createQuery(cd).executeUpdate();
            if (rows == 1) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            CONSOLE.log(Level.INFO, "Ocurrio un error al des-asignar la orden. ", e);
            return false;
        }
    }
}
