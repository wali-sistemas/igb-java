package co.igb.persistence.facade;

import co.igb.dto.SalesOrderDTO;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dbotero
 */
@Stateless
public class SalesOrderFacade {

    private static final Logger CONSOLE = Logger.getLogger(SalesOrderFacade.class.getSimpleName());

    @PersistenceContext(unitName = "IGBPU")
    private EntityManager emIGB;
    @PersistenceContext(unitName = "VARROCPU")
    private EntityManager emVARROC;

    public SalesOrderFacade() {
    }

    private EntityManager chooseSchema(String schemaName) {
        switch (schemaName) {
            case "IGB":
                return emIGB;
            case "VARROC":
                return emVARROC;
            default:
                return null;
        }
    }

    public Integer getOrderDocEntry(Integer docNum, String schemaName) {
        StringBuilder sb = new StringBuilder();
        sb.append("select DocEntry from ORDR where DocNum = ");
        sb.append(docNum);
        try {
            return (Integer) chooseSchema(schemaName).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el docentry de la orden. ", e);
            return -1;
        }
    }

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<SalesOrderDTO> findOpenOrders(boolean showAll, String schemaName) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(enc.docnum as varchar(10)) docnum, ");
        sb.append("cast(enc.docdate as date) docdate, ");
        sb.append("cast(enc.cardcode as varchar(20)) cardcode, ");
        sb.append("cast(enc.cardname as varchar(100)) cardname, ");
        sb.append("cast(enc.confirmed as varchar(1)) confirmed, ");
        sb.append("(select count(1) from rdr1 det where det.docentry = enc.docentry and det.linestatus = 'O') items ");
        sb.append("from ordr enc where enc.DocStatus = 'O' ");
        if (!showAll) {
            sb.append("and enc.confirmed = 'Y' ");
        }
        sb.append("order by enc.docdate ");

        List<SalesOrderDTO> orders = new ArrayList<>();
        try {
            for (Object[] row : (List<Object[]>) chooseSchema(schemaName).createNativeQuery(sb.toString()).getResultList()) {
                SalesOrderDTO order = new SalesOrderDTO();
                order.setDocNum((String) row[0]);
                order.setDocDate((Date) row[1]);
                order.setCardCode((String) row[2]);
                order.setCardName((String) row[3]);
                order.setConfirmed((String) row[4]);
                order.setItems((Integer) row[5]);

                orders.add(order);
            }
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar las ordenes de venta abiertas. ", e);
        }
        return orders;
    }

    public List<Object[]> findOrdersStockAvailability(List<Integer> orderNumbers, String schemaName) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(detalle.itemCode as varchar(20)) itemCode, cast(detalle.openQty as int) openQuantity, cast(detalle.quantity as int) quantity, ");
        sb.append("cast(saldo.binabs as int) binAbs, cast(saldo.onhandqty as int) available, cast(ubicacion.bincode as varchar(50)) binCode, ");
        sb.append("cast(detalle.Dscription as varchar(100)) itemName, cast(orden.docnum as int) orderNumber, ");
        sb.append("cast(ubicacion.attr2val as varchar(5)) velocidad, cast(ubicacion.attr3val as int) secuencia ");
        sb.append("from ordr orden inner join rdr1 detalle on detalle.docentry = orden.docentry and detalle.lineStatus = 'O' ");
        sb.append("inner join OIBQ saldo on saldo.ItemCode = detalle.ItemCode and saldo.WhsCode = '01' and saldo.OnHandQty > 0 ");
        sb.append("inner join obin ubicacion on ubicacion.absentry = saldo.binabs and ubicacion.SysBin = 'N' and ubicacion.Attr1Val = 'STORAGE' ");
        if (orderNumbers != null && orderNumbers.size() == 1) {
            sb.append("where orden.docnum = ");
            sb.append(orderNumbers.get(0));
        } else if (orderNumbers != null && !orderNumbers.isEmpty()) {
            sb.append("where orden.docnum in (");
            for (Integer orderNumber : orderNumbers) {
                sb.append(orderNumber);
                sb.append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(")");
        }
        sb.append(" order by velocidad, secuencia ");

        CONSOLE.log(Level.FINE, sb.toString());
        try {
            return chooseSchema(schemaName).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al listar el inventario para lis items de las ordenes asignadas. ", e);
            return new ArrayList();
        }
    }

    public List<Object[]> findOrdersById(List<Integer> orderIds, String schemaName) {
        if (orderIds == null || orderIds.isEmpty()) {
            return new ArrayList();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(enc.docnum as varchar(10)) docnum, ");
        sb.append("cast(enc.cardname as varchar(100)) cardname ");
        sb.append("from ordr enc where enc.DocStatus = 'O' ");
        sb.append("and enc.docnum in (");
        for (Integer orderNumber : orderIds) {
            sb.append(orderNumber);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(")");
        try {
            return chooseSchema(schemaName).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al buscar ordenes por id. ", e);
            return new ArrayList();
        }
    }

    public Map<String, Integer> listPendingItems(Integer orderNumber, String schemaName) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(det.ItemCode as varchar(20)) itemcode, cast(sum(det.OpenQty) as int) pendingQuantity ");
        sb.append("from ORDR enc inner join RDR1 det on det.docentry = enc.docentry and det.OpenQty > 0 ");
        sb.append("where enc.docnum = ");
        sb.append(orderNumber);
        sb.append(" group by det.ItemCode ");
        CONSOLE.log(Level.FINE, sb.toString());
        try {
            Map<String, Integer> results = new HashMap<>();
            List<Object[]> rows = (List<Object[]>) chooseSchema(schemaName).createNativeQuery(sb.toString()).getResultList();
            for (Object[] col : rows) {
                results.put((String) col[0], (Integer) col[1]);
            }
            return results;
        } catch (NoResultException e) {
            CONSOLE.log(Level.WARNING, "No se encontraron items pendientes para la orden {0}", orderNumber);
            return new HashMap<>();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al listar los items pendientes de la orden. ", e);
            return new HashMap<>();
        }
    }

    public Object queryCustomer(Integer orderNumber, String schemaName) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(cardcode as varchar(20)) cardcode, cast(cardname as varchar(100)) cardname ");
        sb.append("from ORDR where docnum = ");
        sb.append(orderNumber);
        try {
            return chooseSchema(schemaName).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el cliente para la orden. ", e);
            return null;
        }
    }

    public Long getLineNum(Integer orderNumber, String itemcode, String companyName) {
        StringBuilder sb = new StringBuilder();
        sb.append("select top 1 det.linenum from ordr enc inner join rdr1 det on det.docentry = enc.docentry ");
        sb.append("where enc.docnum = ");
        sb.append(orderNumber);
        sb.append(" and det.itemcode = '");
        sb.append(itemcode);
        sb.append("' and linestatus = 'O'");
        try {
            return ((Integer) chooseSchema(companyName).createNativeQuery(sb.toString()).getSingleResult()).longValue();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el numero de linea de una orden. ", e);
            throw new RuntimeException("Ocurrio un error al consultar el numero de linea de una orden");
        }
    }
}
