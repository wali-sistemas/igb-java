package co.igb.persistence.facade;

import co.igb.dto.PackingDTO;
import co.igb.persistence.entity.PackingOrder;
import co.igb.persistence.entity.PackingOrder_;
import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dbotero
 */
@Stateless
public class PackingOrderFacade {

    private static final Logger CONSOLE = Logger.getLogger(PackingOrderFacade.class.getSimpleName());
    private static final String DB_TYPE = Constants.DATABASE_TYPE_MYSQL;

    @EJB
    private PersistenceConf persistenceConf;

    public PackingOrderFacade() {
    }

    public void create(PackingOrder packingOrder, String companyName, boolean testing) {
        persistenceConf.chooseSchema(companyName, testing, DB_TYPE).persist(packingOrder);
    }

    public PackingOrder edit(PackingOrder packingOrder, String companyName, boolean testing) {
        return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).merge(packingOrder);
    }

    public PackingOrder find(Long idPackingOrder, String companyName, boolean testing) {
        return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).find(PackingOrder.class, idPackingOrder);
    }

    public List<PackingDTO> listOpen(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select enc.idpacking_order, enc.order_number, enc.status, enc.customer_id, enc.customer_name, ");
        sb.append("item.idpacking_order_item, item.item_code, bin.idpacking_order_item_bin, bin.bin_code, ");
        sb.append("bin.bin_abs, bin.picked_qty, bin.packed_qty ");
        sb.append("from packing_order enc ");
        sb.append("inner join packing_order_item item on item.idpacking_order = enc.idpacking_order ");
        sb.append("inner join packing_order_item_bin bin on bin.idpacking_order_item = item.idpacking_order_item ");
        sb.append("where status = 'open' and company_name = '");
        sb.append(companyName);
        sb.append("'");
        try {
            Map<Integer, PackingDTO> records = new HashMap<>();
            List<Object[]> rows = persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();

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

    public List<Object[]> listCustomersWithOpenRecords(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select distinct customer_id, customer_name from packing_order where company_name = '");
        sb.append(companyName);
        sb.append("' and status = 'open' order by customer_name");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los clientes con ordenes de empaque abiertas. ", e);
            return new ArrayList<>();
        }
    }

    public Integer OrderNumber(Integer idPackingList, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select distinct order_number order_number from packing_order where company_name = '");
        sb.append(companyName);
        sb.append("' and idpacking_order =");
        sb.append(idPackingList);
        try {
            return (Integer) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar la orden.", e);
            return null;
        }
    }

    public List<Object[]> listCustomerOrders(String customerId, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select idpacking_order, order_number from packing_order where customer_id = '");
        sb.append(customerId);
        sb.append("'and status = 'open' and company_name = '");
        sb.append(companyName);
        sb.append("' order by order_number");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar las ordenes de empaque abiertas para el cliente " + customerId, e);
            return new ArrayList<>();
        }
    }

    public Integer countItemsOnBin(String binCode, Integer orderNumber, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select count(distinct itm.item_code) items from packing_order ord ");
        sb.append("inner join packing_order_item itm on itm.idpacking_order = ord.idpacking_order ");
        sb.append("inner join packing_order_item_bin bin on bin.idpacking_order_item = itm.idpacking_order_item ");
        sb.append("where ord.order_number = ");
        sb.append(orderNumber);
        sb.append(" and bin.bin_code = '");
        sb.append(binCode.trim());
        sb.append("' and ord.company_name = '");
        sb.append(companyName);
        sb.append("' and ord.status = 'open'");
        try {
            return ((BigInteger) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult()).intValue();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los items por orden y ubicacion. ", e);
            return 0;
        }
    }

    public Integer validateItemOnBin(String itemCode, String binCode, Integer orderNumber, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select bin.picked_qty - bin.packed_qty missing_items from packing_order ord ");
        sb.append("inner join packing_order_item itm on itm.idpacking_order = ord.idpacking_order ");
        sb.append("inner join packing_order_item_bin bin on bin.idpacking_order_item = itm.idpacking_order_item ");
        sb.append("where ord.order_number = ");
        sb.append(orderNumber);
        sb.append(" and bin.bin_code = '");
        sb.append(binCode.trim());
        sb.append("' and itm.item_code = '");
        sb.append(itemCode);
        sb.append("' and ord.company_name = '");
        sb.append(companyName);
        sb.append("' and ord.status = 'open'");
        try {
            return ((BigInteger) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult()).intValue();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al validar item por orden y ubicacion. ", e);
            return 0;
        }
    }

    public void updatePackedQuantity(String binCode, String itemCode, Integer orderNumber, Integer additionalQuantity,
                                     String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("update packing_order_item_bin set packed_qty = packed_qty + ");
        sb.append(additionalQuantity);
        sb.append(" where bin_code = '");
        sb.append(binCode.trim());
        sb.append("' and idpacking_order_item = ( select itm.idpacking_order_item from packing_order ord ");
        sb.append("inner join packing_order_item itm on itm.idpacking_order = ord.idpacking_order ");
        sb.append("where itm.item_code = '");
        sb.append(itemCode);
        sb.append("' and ord.order_number = ");
        sb.append(orderNumber);
        sb.append(")");
        try {
            int result = persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).executeUpdate();
            CONSOLE.log(Level.INFO, "Se actualizaron {0} filas", result);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al actualizar la cantidad de items empacados. ", e);
        }
    }

    public List<Object[]> listOrderItems(Long idPackingOrder, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select bin.bin_code, bin.bin_name, bin.picked_qty - bin.packed_qty missing_quantity, itm.item_code ");
        sb.append("from packing_order ord inner join packing_order_item itm on itm.idpacking_order = ord.idpacking_order ");
        sb.append("inner join packing_order_item_bin bin on bin.idpacking_order_item = itm.idpacking_order_item where ord.company_name = '");
        sb.append(companyName);
        sb.append("' and ord.idpacking_order =");
        sb.append(idPackingOrder);
        sb.append(" and bin.picked_qty - bin.packed_qty > 0 order by bin_code, item_code");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar la orden de empaque. ", e);
            return new ArrayList<>();
        }
    }

    public boolean isPackingOrderComplete(Integer idPackingOrder, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select sum(bin.picked_qty - bin.packed_qty) from packing_order ord ");
        sb.append("inner join packing_order_item itm on itm.idpacking_order = ord.idpacking_order ");
        sb.append("inner join packing_order_item_bin bin on bin.idpacking_order_item = itm.idpacking_order_item ");
        sb.append("where ord.idpacking_order = ");
        sb.append(idPackingOrder);
        try {
            return ((BigDecimal) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult()).intValue() == 0;
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar si la orden de packing se encuentra completa. ", e);
            return false;
        }
    }

    public boolean arePackingOrdersComplete(String username, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select ifnull(sum(bin.picked_qty - bin.packed_qty), 0) pendingItems from packing_order ord ");
        sb.append("inner join packing_order_item itm on itm.idpacking_order = ord.idpacking_order ");
        sb.append("inner join packing_order_item_bin bin on bin.idpacking_order_item = itm.idpacking_order_item ");
        sb.append("where ord.idpacking_order in (");
        sb.append("select distinct idpacking_order from packing_list_record ");
        sb.append("where status = 'open' and employee = '");
        sb.append(username);
        sb.append("' and company_name = '");
        sb.append(companyName);
        sb.append("' )");
        try {
            return ((BigDecimal) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult()).intValue() == 0;
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar si la orden de packing se encuentra completa. ", e);
            return false;
        }
    }

    public void closePackingOrder(Integer idPackingOrder, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("update packing_order set status = 'closed' where idpacking_order = ");
        sb.append(idPackingOrder);
        sb.append(" and company_name = '");
        sb.append(companyName);
        sb.append("'");
        try {
            persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).executeUpdate();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al cerrar la orden de packing. ", e);
        }
    }

    public List<PackingOrder> listOrders(String customerId, Integer salesOrder, String companyName, boolean testing) {
        CriteriaBuilder cb = persistenceConf.chooseSchema(companyName, testing, DB_TYPE).getCriteriaBuilder();
        CriteriaQuery<PackingOrder> cq = cb.createQuery(PackingOrder.class);
        Root<PackingOrder> root = cq.from(PackingOrder.class);
        Predicate customer = cb.equal(root.get(PackingOrder_.customerId), customerId);
        Predicate status = cb.equal(root.get(PackingOrder_.status), "open");
        if (salesOrder != null) {
            cq.where(customer, status, cb.equal(root.get(PackingOrder_.orderNumber), salesOrder));
        } else {
            cq.where(customer, status);
        }

        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createQuery(cq).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al listar las ordenes de packing. ", e);
            return new ArrayList<>();
        }
    }

    public List<Object[]> listAllPackings(String customer, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();

        sb.append("SELECT ord.customer_id, ord.customer_name, ord.order_number, item.item_code, bin.bin_name, bin.bin_code, bin.bin_abs, bin.picked_qty, ord.idpacking_order ");
        sb.append("FROM   packing_order ord ");
        sb.append("INNER  JOIN packing_order_item item ON item.idpacking_order = ord.idpacking_order ");
        sb.append("INNER  JOIN packing_order_item_bin bin ON bin.idpacking_order_item = item.idpacking_order_item ");
        sb.append("WHERE  ord.status = 'open' ");
        sb.append("AND    bin.packed_qty < bin.picked_qty ");
        sb.append("AND    ord.company_name = '");
        sb.append(companyName);
        sb.append("' ");
        if (customer != null && !customer.isEmpty() && !customer.equals("null")) {
            sb.append(" AND   ord.customer_id = '");
            sb.append(customer);
            sb.append("'");
        }

        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al listar las ordenes de packing. ", e);
            return new ArrayList<>();
        }
    }

    public List<Integer> listIdOrderItems(Long idPackingOrder, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select bin.idpacking_order_item ");
        sb.append("from packing_order ord inner join packing_order_item itm on itm.idpacking_order = ord.idpacking_order ");
        sb.append("inner join packing_order_item_bin bin on bin.idpacking_order_item = itm.idpacking_order_item where ord.company_name = '");
        sb.append(companyName);
        sb.append("' and ord.idpacking_order =");
        sb.append(idPackingOrder);
        sb.append(" order by bin_code, item_code");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar la orden de empaque. ", e);
            return new ArrayList<>();
        }
    }

    public void updatePackedQty(Long idPackingOrderItem, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("update packing_order_item_bin set packed_qty = 0 where idpacking_order_item = ");
        sb.append(idPackingOrderItem);
        try {
            persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).executeUpdate();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al actualizar el packedQty.", e);
        }
    }

    public void closePackingOrder(String username, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("update packing_list_record set status = 'closed' where employee = '");
        sb.append(username);
        sb.append("' and status = 'open' and company_name = '");
        sb.append(companyName);
        sb.append("' and idpacking_list_record <> 0");
        try {
            persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).executeUpdate();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al cerrar la orden de packing. ", e);
        }
    }
}