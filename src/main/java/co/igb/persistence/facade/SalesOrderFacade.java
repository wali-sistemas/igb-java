package co.igb.persistence.facade;

import co.igb.dto.SalesOrderDTO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
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

    public List findOrdersStockAvailability(List<Integer> orderNumbers, String schemaName) {
        StringBuilder sb = new StringBuilder();
            sb.append("select cast(detalle.itemCode as varchar(20)) itemCode, cast(detalle.openQty as int) openQuantity, cast(detalle.quantity as int) quantity, ");
        sb.append("cast(saldo.binabs as int) binAbs, cast(saldo.onhandqty as int) available, cast(ubicacion.bincode as varchar(50)) binCode, ");
        sb.append("cast(detalle.Dscription as varchar(100)) itemName ");
        sb.append("from ordr orden inner join rdr1 detalle on detalle.docentry = orden.docentry and detalle.lineStatus = 'O' ");
        sb.append("inner join OIBQ saldo on saldo.ItemCode = detalle.ItemCode and saldo.WhsCode = '01' and saldo.OnHandQty > 0 ");
        sb.append("inner join obin ubicacion on ubicacion.absentry = saldo.binabs and ubicacion.SysBin = 'N' ");
        sb.append("where orden.docnum in (");
        for (Integer orderNumber : orderNumbers) {
            sb.append(orderNumber);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(")");
        CONSOLE.log(Level.INFO, sb.toString());
        try {
            return chooseSchema(schemaName).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al listar el inventario para lis items de las ordenes asignadas. ", e);
            return new ArrayList();
        }
    }

    public List<Object[]> findOrdersById(List<Integer> orderIds, String schemaName) {
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
}
