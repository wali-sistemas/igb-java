package co.igb.persistence.facade;

import co.igb.persistence.entity.PickingRecord;
import co.igb.persistence.entity.PickingRecord_;
import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dbotero
 */
@Stateless
public class PickingRecordFacade {

    private static final Logger CONSOLE = Logger.getLogger(PickingRecordFacade.class.getSimpleName());
    private static final String DB_TYPE = Constants.DATABASE_TYPE_MYSQL;

    @EJB
    private PersistenceConf persistenceConf;

    public PickingRecordFacade() {

    }

    public void create(PickingRecord pickingRecord, String companyName, boolean testing) {
        persistenceConf.chooseSchema(companyName, testing, DB_TYPE).persist(pickingRecord);
    }

    public Set<String> listSkippedItems(Integer orderNumber, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select item_code from picking_record where order_number =");
        sb.append(orderNumber);
        sb.append(" and company_name = '");
        sb.append(companyName);
        sb.append("' and expires is not null");

        try {
            return new TreeSet<String>(persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList());
        } catch (Exception e) {
            return new TreeSet<>();
        }
    }

    /**
     * @param orderNumber
     * @param companyName
     * @return map with structure [itemcode->[bin->quantity]]
     */
    public Map<String, Map<Long, Integer>> listPickedItems(Integer orderNumber, Boolean excludeTemporary, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select item_code, quantity, bin_to from picking_record where order_number = ");
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
            List<Object[]> results = persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
            for (Object[] row : results) {
                String itemCode = (String) row[0];
                Integer quantity = (Integer) row[1];
                Long binAbs = ((Integer) row[2]).longValue();
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

    public List<Integer> listPickingsRecords(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();

        sb.append("SELECT DISTINCT order_number AS order_number FROM picking_record ");

        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException e) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar la lista de picking_record. ", e);
        }
        return null;
    }


    public List<PickingRecord> listPicking(Integer orderNumber, String companyName, boolean testing) {
        CriteriaBuilder cb = persistenceConf.chooseSchema(companyName, testing, DB_TYPE).getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(PickingRecord.class);
        Root picking = cq.from(PickingRecord.class);

        cq.where(cb.and(
                cb.equal(picking.get(PickingRecord_.orderNumber), orderNumber),
                cb.equal(picking.get(PickingRecord_.companyName), companyName)
        ));

        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createQuery(cq).getResultList();
        } catch (NoResultException e) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los datos de la orden del picking_record. ", e);
        }
        return null;
    }

    public List<Object[]> findTemporaryRecords(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select idpicking_record, expires from picking_record where company_name = '");
        sb.append(companyName);
        sb.append("' and expires is not null");
        try {
            return (List<Object[]>) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException e) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los registros de picking temporales. ", e);
        }
        return new ArrayList<>();
    }

    public void deleteExpiredRecords(List<Integer> recordIds, String companyName, boolean testing) {
        CriteriaBuilder cb = persistenceConf.chooseSchema(companyName, testing, DB_TYPE).getCriteriaBuilder();
        CriteriaDelete<PickingRecord> cd = cb.createCriteriaDelete(PickingRecord.class);
        Root<PickingRecord> root = cd.from(PickingRecord.class);
        cd.where(root.get("id").in(recordIds));
        try {
            persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createQuery(cd).executeUpdate();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al eliminar los picking records vencidos. ", e);
        }
    }
}
