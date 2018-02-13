package co.igb.persistence.facade;

import co.igb.dto.PackingDTO;
import co.igb.persistence.entity.PackingOrder;
import java.util.ArrayList;
import java.util.Arrays;
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
public class PackingOrderFacade extends AbstractFacade<PackingOrder> {

    private static final Logger CONSOLE = Logger.getLogger(PackingOrderFacade.class.getSimpleName());

    @PersistenceContext(unitName = "MySQLPU")
    private EntityManager em;

    public PackingOrderFacade() {
        super(PackingOrder.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public List<PackingDTO> listOpen(String companyname) {
        StringBuilder sb = new StringBuilder();
        sb.append("select enc.idpacking_order, enc.order_number, enc.status, enc.customer_id, enc.customer_name, ");
        sb.append("item.idpacking_order_item, item.item_code, bin.idpacking_order_item_bin, bin.bin_code, ");
        sb.append("bin.bin_abs, bin.picked_qty, bin.packed_qty ");
        sb.append("from packing_order enc ");
        sb.append("inner join packing_order_item item on item.idpacking_order = enc.idpacking_order ");
        sb.append("inner join packing_order_item_bin bin on bin.idpacking_order_item = item.idpacking_order_item ");
        sb.append("where status = 'open' and company_name = '");
        sb.append(companyname);
        sb.append("'");
        try {
            Map<Integer, PackingDTO> records = new HashMap<>();
            List<Object[]> rows = em.createNativeQuery(sb.toString()).getResultList();

            for (Object[] col : rows) {
                Integer id = (Integer) col[0];
                PackingDTO packing = records.get(id);
                if (packing == null) {
                    packing = new PackingDTO();
                    packing.setCustomerId((String) col[3]);
                    packing.setCustomerName((String) col[4]);
                    packing.setIdPackingOrder(id);
                    packing.setOrderNumber((Integer) col[1]);
                    packing.setStatus((String) col[2]);
                }
                packing.add((Integer) col[5], (String) col[6], (Integer) col[7], (String) col[8], (Integer) col[9], (Integer) col[10], (Integer) col[11]);
                records.put(id, packing);
            }
            CONSOLE.log(Level.INFO, Arrays.toString(records.values().toArray()));
            return Arrays.asList(records.values().toArray(new PackingDTO[0]));
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los proceso de packing abiertos. ", e);
            return new ArrayList<>();
        }
    }
}
