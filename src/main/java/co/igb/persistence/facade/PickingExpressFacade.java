package co.igb.persistence.facade;

import co.igb.dto.PickingListExpressDTO;
import co.igb.persistence.entity.PickingExpress;
import co.igb.persistence.entity.PickingExpress_;
import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
public class PickingExpressFacade {
    private static final Logger CONSOLE = Logger.getLogger(PickingExpressFacade.class.getSimpleName());
    private static final String DB_TYPE_WALI = Constants.DATABASE_TYPE_WALI;
    @EJB
    private PersistenceConf persistenceConf;

    public PickingExpressFacade() {
    }

    public void create(PickingExpress PickingExpress, String companyName, boolean testing) {
        persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI).persist(PickingExpress);
    }

    public PickingExpress find(Long idPackingExpress, String companyName, boolean testing) {
        return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI).find(PickingExpress.class, idPackingExpress);
    }

    public Object[] listPickingExpressBySeller(String docNum, String empIdSet, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select top 1 * from picking_express where (lineStatus='' or lineStatus is null or lineStatus='P') and docNum=");
        sb.append(docNum);
        sb.append(" and empId='");
        sb.append(empIdSet);
        sb.append("' order by binType, binSequence");
        try {
            return (Object[]) persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error listando las entregas para pickingListExpress en " + companyName, e);
        }
        return null;
    }

    public List<String> listPickingExpressClosed(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select distinct cast(docNum as varchar(10))as docNum from picking_express where status='F'");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error listando las entregas cerradas para pickingListExpress en " + companyName, e);
        }
        return null;
    }

    public boolean assignEmployeeToPickListExpress(String delivery, String empId, String companyName, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaUpdate<PickingExpress> cu = cb.createCriteriaUpdate(PickingExpress.class);
        Root<PickingExpress> root = cu.from(PickingExpress.class);
        cu.set(root.get(PickingExpress_.empId), empId);
        cu.where(cb.equal(root.get(PickingExpress_.docNum), delivery));
        try {
            int rows = em.createQuery(cu).executeUpdate();
            if (rows == 1) {
                return true;
            }
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error asignando el pickingListExpress para la entrega [" + delivery + "] en " + companyName, e);
        }
        return false;
    }

    public boolean updateItemToPickListExpress(PickingListExpressDTO dto, String empIdSet, String companyName, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaUpdate<PickingExpress> cu = cb.createCriteriaUpdate(PickingExpress.class);
        Root<PickingExpress> root = cu.from(PickingExpress.class);
        cu.set(root.get(PickingExpress_.empIdSet), empIdSet);
        cu.set(root.get(PickingExpress_.qtyConfirm), dto.getQtyConfirm());
        cu.set(root.get(PickingExpress_.docDateConfirm), new Date());
        cu.set(root.get(PickingExpress_.observation), dto.getObservation());
        cu.set(root.get(PickingExpress_.lineStatus), "F");
        cu.where(cb.equal(root.get(PickingExpress_.id), dto.getIdPickingExpress()));
        try {
            int rows = em.createQuery(cu).executeUpdate();
            if (rows == 1) {
                return true;
            }
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error confirmando el pickingListExpress " + dto.getIdPickingExpress() + " de la entrega " + dto.getDocNum() + " en " + companyName, e);
        }
        return false;
    }

    public boolean updateStatusPickListExpress(String delivery, String status, String companyName, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaUpdate<PickingExpress> cu = cb.createCriteriaUpdate(PickingExpress.class);
        Root<PickingExpress> root = cu.from(PickingExpress.class);
        cu.set(root.get(PickingExpress_.status), status);
        cu.where(cb.equal(root.get(PickingExpress_.docNum), delivery));
        try {
            int rows = em.createQuery(cu).executeUpdate();
            if (rows == 1) {
                return true;
            }
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error actualizando el estado del picking list con nro de entrega " + delivery + " en " + companyName, e);
        }
        return false;
    }
}