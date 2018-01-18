package co.igb.persistence.facade;

import co.igb.persistence.entity.PickingRecord;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
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

    /**
     *
     * @param orderNumbers
     * @return map with structure [orderNumber->[itemcode->quantity]]
     */
    public Map<Integer, Map<String, Integer>> listPickedItems(List<Integer> orderNumbers) {
        StringBuilder sb = new StringBuilder();
        sb.append("select * from picking_record where order_number in (");
        for (Integer orderNumber : orderNumbers) {
            sb.append(orderNumber);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(")");
        CONSOLE.log(Level.INFO, sb.toString());
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
     *
     * @param orderNumber
     * @return map with structure [itemcode->[bin->quantity]]
     */
    public Map<String, Map<Long, Integer>> listPickedItems(Integer orderNumber) {
        StringBuilder sb = new StringBuilder();
        sb.append("select * from picking_record where order_number = ");
        sb.append(orderNumber);

        CONSOLE.log(Level.INFO, sb.toString());
        try {
            Map<String, Map<Long, Integer>> pickedItems = new HashMap<>();
            List<Object[]> results = em.createNativeQuery(sb.toString()).getResultList();
            for (Object[] row : results) {
                String itemCode = (String) row[2];
                Integer quantity = (Integer) row[3];
                Long binAbs = (Long) row[5];
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
}
