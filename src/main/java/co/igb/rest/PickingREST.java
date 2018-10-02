package co.igb.rest;

import co.igb.dto.ResponseDTO;
import co.igb.dto.SortedStockDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.ejb.StockTransferEJB;
import co.igb.persistence.entity.AssignedOrder;
import co.igb.persistence.entity.PackingOrder;
import co.igb.persistence.entity.PackingOrderItem;
import co.igb.persistence.entity.PackingOrderItemBin;
import co.igb.persistence.facade.AssignedOrderFacade;
import co.igb.persistence.facade.BinLocationFacade;
import co.igb.persistence.facade.PackingOrderFacade;
import co.igb.persistence.facade.PickingRecordFacade;
import co.igb.persistence.facade.SalesOrderFacade;
import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dbotero
 */
@Path("picking/v2")
public class PickingREST implements Serializable {

    private static final Logger CONSOLE = Logger.getLogger(PickingREST.class.getSimpleName());

    @EJB
    private SalesOrderFacade soFacade;
    @EJB
    private AssignedOrderFacade aoFacade;
    @EJB
    private PickingRecordFacade prFacade;
    @EJB
    private BinLocationFacade blFacade;
    @EJB
    private PackingOrderFacade poFacade;
    @EJB
    private StockTransferEJB stockTransferEJB;
    @Inject
    private IGBApplicationBean appBean;

    public PickingREST() {
    }

    @GET
    @Path("delete-temporary")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response deleteTemporaryRecords(@HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        CONSOLE.log(Level.INFO, "Ejecutando proceso para eliminar registros de picking temporales");
        List<Object[]> records = prFacade.findTemporaryRecords(companyName);
        CONSOLE.log(Level.INFO, "Se encontraron {0} registros temporales", records.size());
        Date now = new Date();
        List<Integer> expiredRecords = new ArrayList<>();
        for (Object[] row : records) {
            Integer recordId = (Integer) row[0];
            Date expires = (Date) row[1];
            if (hasExpired(expires, now)) {
                expiredRecords.add(recordId);
            }
        }
        if (!expiredRecords.isEmpty()) {
            CONSOLE.log(Level.INFO, "Eliminando {0} registros vencidos", expiredRecords);
            prFacade.deleteExpiredRecords(expiredRecords);
        }
        return Response.ok(new ResponseDTO(0, expiredRecords)).build();
    }

    private boolean hasExpired(Date expires, Date now) {
        int maxMinutes = Integer.parseInt(appBean.obtenerValorPropiedad("igb.temporary.picking.ttl"));
        long diff = (now.getTime() - expires.getTime()) / 60000;
        CONSOLE.log(Level.INFO, "Tiempo: {0}, limite: {1}", new Object[]{diff, maxMinutes});
        return diff >= maxMinutes;
    }

    private Object[] processPickingStatus(Integer orderNumber, Boolean excludeTemporary, String companyName) {
        Map<String, Map<Long, Integer>> pickedItems = prFacade.listPickedItems(orderNumber, excludeTemporary, companyName);

        //consultar los items pendientes por entregar de cada orden
        Map<String, Integer> pendingItems = soFacade.listPendingItems(orderNumber, companyName);

        //si un item existe en la lista de picking pero no en la de pendientes, no se tiene en cuenta
        for (int i = 0; i < pendingItems.keySet().toArray().length; i++) {
            String itemCode = (String) pendingItems.keySet().toArray()[i];
            if (pickedItems.containsKey(itemCode)) {
                int totalPicked = 0;
                for (Long binAbs : pickedItems.get(itemCode).keySet()) {
                    totalPicked += pickedItems.get(itemCode).get(binAbs);
                }
                Integer pending = pendingItems.get(itemCode);
                if (pending != null && totalPicked >= pending) {
                    pendingItems.remove(itemCode);
                    i--;
                } else if (pending != null) {
                    pendingItems.put(itemCode, pending - totalPicked);
                }
            }
        }

        List<Object> skippedItems = prFacade.listSkippedItems(orderNumber, companyName);
        return new Object[]{pendingItems, pickedItems, skippedItems};
    }

    @GET
    @Path("nextitem/{username}")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response findNextItemToPick(
            @PathParam("username") String username,
            @QueryParam("orderNumber") Integer orderNumber,
            @HeaderParam("X-Company-Name") String companyName,
            @HeaderParam("X-Warehouse-Code") String warehouseCode) {
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        CONSOLE.log(Level.INFO, "Buscando siguiente item para packing para el usuario {0} ", username);

        //buscar ordenes asignadas en estado open para el empleado en la empresa seleccionada
        List<AssignedOrder> orders = aoFacade.listOpenAssignationsByUserAndCompany(username, orderNumber, companyName);

        //si no hay ordenes pendientes, mostrar alerta con mensaje de error
        if (orders == null || orders.isEmpty()) {
            CONSOLE.log(Level.WARNING, "No se encontraron ordenes de venta asignadas al usuario {0} en la empresa {1}", new Object[]{username, companyName});
            return Response.ok(new ResponseDTO(-2, "El usuario no tiene órdenes de venta asignadas pendientes por picking")).build();
        }

        boolean warning = false;
        boolean skippedItems = false;
        TreeSet<SortedStockDTO> sortedStock = new TreeSet<>();
        for (AssignedOrder order : orders) {
            Object[] pickingStatus = processPickingStatus(order.getOrderNumber(), false, companyName);
            Map<String, Integer> pendingItems = (Map<String, Integer>) pickingStatus[0];
            Map<String, Map<Long, Integer>> pickedItems = (Map<String, Map<Long, Integer>>) pickingStatus[1];
            List<Object> skipped = (List<Object>) pickingStatus[2];

            if (pendingItems == null || pendingItems.isEmpty()) {
                if (skipped.isEmpty()) {
                    CONSOLE.log(Level.WARNING, "La orden {0} no tiene items pendientes por despachar y se marca como cerrada. ", order.getOrderNumber());
                    closeAndPack(order, pickedItems, companyName);
                    continue;
                } else {
                    CONSOLE.log(Level.INFO, "La orden {0} no tiene mas items pendientes por picking, pero tiene skipped items ");
                    skippedItems = true;
                    continue;
                }
            }

            //Si hay items pendientes por picking, consulta su saldo y lo retorna organizado por velocidad y secuencia.
            if (!pendingItems.isEmpty()) {
                List<Object[]> orderStock = soFacade.findOrdersStockAvailability(
                        order.getOrderNumber(),
                        new ArrayList<>(pendingItems.keySet()),
                        warehouseCode,
                        companyName);
                //Agregar el inventario de la orden al set de stock
                for (Object[] row : orderStock) {
                    SortedStockDTO sorted = new SortedStockDTO(row);
                    if (pendingItems.containsKey(sorted.getItemCode()) && pendingItems.get(sorted.getItemCode()) > 0) {
                        sorted.setPendingQuantity(pendingItems.get(row[0]));
                        sortedStock.add(sorted);
                    }
                }
            }
        }
        //seleccionar y retornar el siguiente item para picking
        if (sortedStock.isEmpty() && !warning) {
            return Response.ok(new ResponseDTO(-1, "No hay más items pendientes por picking")).build();
        } else if (sortedStock.isEmpty() && warning) {
            return Response.ok(new ResponseDTO(-3, "No hay saldo disponible para picking en la(s) orden(es) asignada(s)")).build();
        } else if (sortedStock.isEmpty() && skippedItems) {
            return Response.ok(new ResponseDTO(-4, "No hay ítems pendientes por picking, pero hay ítems marcados para recoger después.")).build();
        } else {
            return Response.ok(new ResponseDTO(0, sortedStock.first())).build();
        }
    }

    @PUT
    @Path("close/{username}")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response closeOrders(@PathParam("username") String username, @QueryParam("orderNumber") Integer orderNumber,
                                @HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        CONSOLE.log(Level.INFO, "Procesando solicitud de cierre de orden {0}", orderNumber != null ? orderNumber : "multiple");

        //buscar ordenes asignadas en estado open para el empleado en la empresa seleccionada
        List<AssignedOrder> orders = aoFacade.listOpenAssignationsByUserAndCompany(username, orderNumber, companyName);

        //si no hay ordenes pendientes, mostrar alerta con mensaje de error
        if (orders == null || orders.isEmpty()) {
            CONSOLE.log(Level.WARNING, "No se encontraron ordenes de venta asignadas al usuario {0} en la empresa {1}", new Object[]{username, companyName});
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        for (AssignedOrder order : orders) {
            Object[] pickingStatus = processPickingStatus(order.getOrderNumber(), true, companyName);
            Map<String, Integer> pendingItems = (Map<String, Integer>) pickingStatus[0];
            Map<String, Map<Long, Integer>> pickedItems = (Map<String, Map<Long, Integer>>) pickingStatus[1];

            //TODO: validar si este mapa trae items con valor cero o si solo incluye items que tengan algun valor
            //validar que todos los items pendientes tengan cantidad igual a cero
            for (String itemCode : pendingItems.keySet()) {
                if (pendingItems.get(itemCode) > 0) {
                    CONSOLE.log(Level.SEVERE, "Se intento marcar como finalizada una orden que aun tiene items pendientes por picking. orden={0}, usuario={1}, item={2}, pendiente={3}",
                            new Object[]{order.getOrderNumber(), username, itemCode, pendingItems.get(itemCode)});
                    return Response.ok(new ResponseDTO(-1, "La orden " + order.getOrderNumber() + " todavía tiene "
                            + pendingItems.get(itemCode) + " unidades pendientes del item " + itemCode)).build();
                }
            }

            closeAndPack(order, pickedItems, companyName);
            try {
                moveItemsToPackingArea(order.getOrderNumber(), companyName);
            }catch (Exception e){
                return Response.ok(
                        new ResponseDTO(
                                -1,
                                "Ocurrió un error al trasladar los ítems a la ubicación de packing. " + e.getMessage())
                ).build();
            }
        }
        return Response.ok(new ResponseDTO(0, "")).build();
    }

    private void closeAndPack(AssignedOrder order, Map<String, Map<Long, Integer>> pickedItems, String companyName) {
        try {
            HashMap<Long, String[]> bins = new HashMap<>();
            PackingOrder packingOrder = new PackingOrder();
            packingOrder.setCustomerId(order.getCustomerId());
            packingOrder.setCustomerName(order.getCustomerName());
            packingOrder.setOrderNumber(order.getOrderNumber());
            packingOrder.setStatus("open");
            packingOrder.setCompanyName(companyName);

            for (String itemCode : pickedItems.keySet()) {
                PackingOrderItem packingItem = new PackingOrderItem();
                packingItem.setItemCode(itemCode);
                packingItem.setPackingOrder(packingOrder);
                for (Long binAbs : pickedItems.get(itemCode).keySet()) {
                    PackingOrderItemBin bin = new PackingOrderItemBin();
                    bin.setBinAbs(binAbs);
                    if (!bins.containsKey(binAbs)) {
                        Object[] binAndName = blFacade.getBinCodeAndName(binAbs, companyName);
                        bins.put(binAbs, Arrays.copyOf(binAndName, binAndName.length, String[].class));
                    }

                    bin.setBinCode(bins.get(binAbs)[0]);
                    bin.setBinName(bins.get(binAbs)[1]);

                    bin.setPackedQty(0);
                    bin.setPickedQty(pickedItems.get(itemCode).get(binAbs));
                    bin.setPackingOrderItem(packingItem);
                    packingItem.getBins().add(bin);
                }
                packingOrder.getItems().add(packingItem);
            }
            poFacade.create(packingOrder);
            CONSOLE.log(Level.INFO, "Se creo la orden de packing para la orden {0}", order.getOrderNumber());

            order.setStatus(Constants.STATUS_CLOSED);
            aoFacade.edit(order);
            CONSOLE.log(Level.INFO, "Cerro la asignacion de picking para la orden {0}", order.getOrderNumber());
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al actualizar el estado de la asignacion de picking. ", e);
        }
    }

    private void moveItemsToPackingArea(Integer orderNumber, String companyName) {
        stockTransferEJB.transferClosedPickingToPackingArea(orderNumber, companyName);
    }
}
