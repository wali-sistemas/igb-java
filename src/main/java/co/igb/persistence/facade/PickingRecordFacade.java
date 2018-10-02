package co.igb.persistence.facade;

import co.igb.persistence.entity.PickingRecord;
import co.igb.persistence.entity.PickingRecord_;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dbotero
 */
@Stateless
public class PickingRecordFacade extends AbstractFacade<PickingRecord> {

    private static final Logger CONSOLE = Logger.getLogger(PickingRecordFacade.class.getSimpleName());

    @PersistenceContext(unitName = "MySQLPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PickingRecordFacade() {
        super(PickingRecord.class);
    }

    public List<Object> listSkippedItems(Integer orderNumber, String companyName) {
        StringBuilder sb = new StringBuilder();
        sb.append("select * from picking_record where order_number =");
        sb.append(orderNumber);
        sb.append(" and company_name = '");
        sb.append(companyName);
        sb.append("' and expires is not null");

        try {
            return em.createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    /**
     * @param orderNumbers
     * @param companyName
     * @return map with structure [orderNumber->[itemcode->quantity]]
     */
    public Map<Integer, Map<String, Integer>> listPickedItems(List<Integer> orderNumbers, String companyName) {
        StringBuilder sb = new StringBuilder();
        sb.append("select * from picking_record where order_number in (");
        for (Integer orderNumber : orderNumbers) {
            sb.append(orderNumber);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(") and company_name = '");
        sb.append(companyName);
        sb.append("'");
        CONSOLE.log(Level.FINE, sb.toString());
        try {
            Map<Integer, Map<String, Integer>> pickedItems = new HashMap<>();
            List<Object[]> results = em.createNativeQuery(sb.toString()).getResultList();
            for (Object[] row : results) {
                Integer orderNumber = (Integer) row[1];
                String itemCode = (String) row[2];
                Integer quantity = (Integer) row[3];
                Map<String, Integer> items = pickedItems.get(orderNumber);
                if (items == null) {
                    items = new HashMap<>();
                    items.put(itemCode, quantity);
                } else if (!items.containsKey(itemCode)) {
                    items.put(itemCode, quantity);
                } else {
                    items.put(itemCode, items.get(itemCode) + quantity);
                }
                pickedItems.put(orderNumber, items);
            }
            return pickedItems;
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "There was an error loading already picked items. ", e);
            return new HashMap<>();
        }
    }

    /**
     * @param orderNumber
     * @param companyName
     * @return map with structure [itemcode->[bin->quantity]]
     */
    public Map<String, Map<Long, Integer>> listPickedItems(Integer orderNumber, Boolean excludeTemporary, String companyName) {
        StringBuilder sb = new StringBuilder();
        sb.append("select * from picking_record where order_number = ");
        sb.append(orderNumber);
        if (excludeTemporary) {
            sb.append(" and expires is null ");
        }
        sb.append(" and company_name = '");
        sb.append(companyName);
        sb.append("'");
        CONSOLE.log(Level.FINE, sb.toString());
        try {
            Map<String, Map<Long, Integer>> pickedItems = new HashMap<>();
            List<Object[]> results = em.createNativeQuery(sb.toString()).getResultList();
            for (Object[] row : results) {
                String itemCode = (String) row[2];
                Integer quantity = (Integer) row[3];
                Long binAbs = ((Integer) row[5]).longValue();
                Map<Long, Integer> bins = pickedItems.get(itemCode);
                if (bins == null) {
                    bins = new HashMap<>();
                    bins.put(binAbs, quantity);
                } else if (!bins.containsKey(binAbs)) {
                    bins.put(binAbs, quantity);
                } else {
                    bins.put(binAbs, bins.get(binAbs) + quantity);
                }
                pickedItems.put(itemCode, bins);
            }
            return pickedItems;
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "There was an error loading already picked items. ", e);
            return new HashMap<>();
        }
    }

    public List<Integer> listPickingsRecords() {
        StringBuilder sb = new StringBuilder();

        sb.append("SELECT DISTINCT order_number AS order_number FROM igb.picking_record ");

        try {
            return em.createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException e) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar la lista de picking_record. ", e);
        }
        return null;
    }


    public List<PickingRecord> listPicking(Integer orderNumber, String companyName) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(PickingRecord.class);
        Root picking = cq.from(PickingRecord.class);

        cq.where(cb.and(
                cb.equal(picking.get(PickingRecord_.orderNumber), orderNumber),
                cb.equal(picking.get(PickingRecord_.companyName), companyName)
        ));

        try {
            return em.createQuery(cq).getResultList();
        } catch (NoResultException e) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los datos de la orden del picking_record. ", e);
        }
        return null;
    }

    public List<Object[]> findTemporaryRecords(String companyName) {
        StringBuilder sb = new StringBuilder();
        sb.append("select idpicking_record, expires from picking_record where company_name = '");
        sb.append(companyName);
        sb.append("' and expires is not null");
        try {
            return (List<Object[]>) em.createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException e) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los registros de picking temporales. ", e);
        }
        return new ArrayList<>();
    }

    public void deleteExpiredRecords(List<Integer> recordIds) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaDelete<PickingRecord> cd = cb.createCriteriaDelete(PickingRecord.class);
        Root<PickingRecord> root = cd.from(PickingRecord.class);
        cd.where(root.get("id").in(recordIds));
        try {
            em.createQuery(cd).executeUpdate();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al eliminar los picking records vencidos. ", e);
        }
    }
}
