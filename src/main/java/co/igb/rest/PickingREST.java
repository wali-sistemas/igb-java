package co.igb.rest;

import co.igb.dto.SortedStockDTO;
import co.igb.persistence.entity.AssignedOrder;
import co.igb.persistence.entity.PackingOrder;
import co.igb.persistence.entity.PackingOrderItem;
import co.igb.persistence.entity.PackingOrderItemBin;
import co.igb.persistence.facade.AssignedOrderFacade;
import co.igb.persistence.facade.BinLocationFacade;
import co.igb.persistence.facade.PackingOrderFacade;
import co.igb.persistence.facade.PickingRecordFacade;
import co.igb.persistence.facade.SalesOrderFacade;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.commons.lang3.time.StopWatch;

/**
 *
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

    public PickingREST() {
    }

    @GET
    @Path("nextitem/{username}")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response findNextItemToPick(@PathParam("username") String username, @QueryParam("orderNumber") Integer orderNumber,
            @HeaderParam("X-Company-Name") String companyName) {
        StopWatch watch = new StopWatch();
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        CONSOLE.log(Level.INFO, "Listando ordenes de venta asignadas ");

        watch.start();
        //TODO: buscar ordenes asignadas en estado warning y cambiar estado a las que tengan disponibilidad de inventario
        //buscar ordenes asignadas en estado open para el empleado en la empresa seleccionada
        List<AssignedOrder> orders = aoFacade.listOpenAssignationsByUserAndCompany(username, orderNumber, companyName);

        //si no hay ordenes pendientes, mostrar alerta con mensaje de error
        if (orders == null || orders.isEmpty()) {
            CONSOLE.log(Level.WARNING, "No se encontraron ordenes de venta asignadas al usuario {0} en la empresa {1}", new Object[]{username, companyName});
            watch.stop();
            CONSOLE.log(Level.INFO, "El proceso tomo {0}ms", watch.getTime());
            return Response.ok(new ResponseDTO(-2, "El usuario no tiene órdenes de venta asignadas pendientes por picking")).build();
        }

        TreeSet<SortedStockDTO> sortedStock = new TreeSet<>();
        for (AssignedOrder order : orders) {
            //consultar los items a los que ya se les hizo picking para cada orden
            Map<String, Map<Long, Integer>> pickedItems = prFacade.listPickedItems(order.getOrderNumber());

            //consultar los items pendientes por entregar de cada orden
            Map<String, Integer> pendingItems = soFacade.listPendingItems(order.getOrderNumber(), companyName);
            if (pendingItems == null || pendingItems.isEmpty()) {
                order.setStatus("warning");
                CONSOLE.log(Level.WARNING, "La orden {0} no tiene items pendientes por despachar. ", order.getOrderNumber());
                aoFacade.edit(order);
                continue;
            }

            //a los items pendientes por entregar descontarle los que ya tuvieron picking. 
            //si un item existe en la lista de picking pero no en la de pendientes, no se tiene en cuenta
            for (int i = 0; i < pendingItems.keySet().size(); i++) {
                //for (String itemCode : pendingItems.keySet()) {
                String itemCode = (String) (pendingItems.keySet().toArray())[i];
                if (pickedItems.containsKey(itemCode)) {
                    int totalPicked = 0;
                    for (Long binAbs : pickedItems.get(itemCode).keySet()) {
                        totalPicked += pickedItems.get(itemCode).get(binAbs);
                    }
                    if (totalPicked >= pendingItems.get(itemCode)) {
                        //pendingItems.put(itemCode, 0);
                        pendingItems.remove(itemCode);
                        i--;
                    } else {
                        pendingItems.put(itemCode, pendingItems.get(itemCode) - totalPicked);
                    }
                }
            }

            //validar disponibilidad de inventario por orden
            List<Object[]> orderStock = soFacade.findOrdersStockAvailability(Arrays.asList(order.getOrderNumber()), companyName);

            //si una orden no tiene inventario disponible, marcarla como warning
            if (orderStock == null || orderStock.isEmpty() || pendingItems.size() > getItemsCount(orderStock)) {
                order.setStatus("warning");
                aoFacade.edit(order);
                CONSOLE.log(Level.WARNING, "La orden {0} no tiene inventario suficiente en ubicaciones de picking y pasara a estado warning. ", order.getOrderNumber());
            } else {
                //Agregar el inventario de la orden al set de stock
                for (Object[] row : orderStock) {
                    SortedStockDTO sorted = new SortedStockDTO(row);
                    if (pendingItems.containsKey(sorted.getItemCode()) && pendingItems.get(sorted.getItemCode()) > 0) {
                        sortedStock.add(sorted);
                    }
                }
            }
        }
        //seleccionar y retornar el siguiente item para picking
        watch.stop();
        CONSOLE.log(Level.INFO, "El proceso tomo {0}ms", watch.getTime());
        if (sortedStock.isEmpty()) {
            return Response.ok(new ResponseDTO(-1, "No hay mas items pendientes por picking")).build();
        } else {
            return Response.ok(new ResponseDTO(0, sortedStock.first())).build();
        }
    }

    private int getItemsCount(List<Object[]> queryResult) {
        HashSet<String> items = new HashSet<>();
        for (Object[] row : queryResult) {
            items.add((String) row[0]);
        }
        return items.size();
    }

    @GET
    @Path("close/{username}")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response closeOrders(@PathParam("username") String username, @QueryParam("orderNumber") Integer orderNumber,
            @HeaderParam("X-Company-Name") String companyName) {
        StopWatch watch = new StopWatch();
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        CONSOLE.log(Level.INFO, "Listando ordenes de venta asignadas ");

        watch.start();
        //buscar ordenes asignadas en estado open para el empleado en la empresa seleccionada
        List<AssignedOrder> orders = aoFacade.listOpenAssignationsByUserAndCompany(username, orderNumber, companyName);

        //si no hay ordenes pendientes, mostrar alerta con mensaje de error
        if (orders == null || orders.isEmpty()) {
            CONSOLE.log(Level.WARNING, "No se encontraron ordenes de venta asignadas al usuario {0} en la empresa {1}", new Object[]{username, companyName});
            watch.stop();
            CONSOLE.log(Level.INFO, "El proceso tomo {0}ms", watch.getTime());
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        for (AssignedOrder order : orders) {
            //consultar los items a los que ya se les hizo picking para cada orden
            Map<String, Map<Long, Integer>> pickedItems = prFacade.listPickedItems(order.getOrderNumber());

            //consultar los items pendientes por entregar de cada orden
            Map<String, Integer> pendingItems = soFacade.listPendingItems(order.getOrderNumber(), companyName);
            if (pendingItems == null || pendingItems.isEmpty()) {
                order.setStatus("warning");
                CONSOLE.log(Level.WARNING, "La orden {0} no tiene items pendientes por despachar. ", order.getOrderNumber());
                try {
                    aoFacade.edit(order);
                } catch (Exception e) {
                }
                continue;
            }

            //a los items pendientes por entregar descontarle los que ya tuvieron picking. 
            //si un item existe en la lista de picking pero no en la de pendientes, no se tiene en cuenta
            for (String itemCode : pendingItems.keySet()) {
                if (pickedItems.containsKey(itemCode)) {
                    int totalPicked = 0;
                    for (Long binAbs : pickedItems.get(itemCode).keySet()) {
                        totalPicked += pickedItems.get(itemCode).get(binAbs);
                    }
                    if (totalPicked >= pendingItems.get(itemCode)) {
                        pendingItems.put(itemCode, 0);
                    } else {
                        pendingItems.put(itemCode, pendingItems.get(itemCode) - totalPicked);
                    }
                }
            }

            //validar que todos los items pendientes tengan cantidad igual a cero
            for (String itemCode : pendingItems.keySet()) {
                if (pendingItems.get(itemCode) > 0) {
                    CONSOLE.log(Level.SEVERE, "Se intento marcar como finalizada una orden que aun tiene items pendientes por picking. orden={0}, usuario={1}, item={2}, pendiente={3}",
                            new Object[]{order.getOrderNumber(), username, itemCode, pendingItems.get(itemCode)});
                    watch.stop();
                    CONSOLE.log(Level.INFO, "El proceso tomo {0}ms", watch.getTime());
                    return Response.ok(new ResponseDTO(-1, "La orden " + order.getOrderNumber() + " todavía tiene "
                            + pendingItems.get(itemCode) + " unidades pendientes del item " + itemCode)).build();
                }
            }

            closeAndPack(order, pickedItems, companyName);
        }

        watch.stop();
        CONSOLE.log(Level.INFO, "El proceso tomo {0}ms", watch.getTime());
        return Response.ok(new ResponseDTO(0, "")).build();
    }

    private void closeAndPack(AssignedOrder order, Map<String, Map<Long, Integer>> pickedItems, String companyName) {
        try {
            order.setStatus("closed");
            aoFacade.edit(order);
            CONSOLE.log(Level.INFO, "Cerro la asignacion de picking para la orden {0}", order.getOrderNumber());

            HashMap<Long, String> bins = new HashMap<>();
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
                        bin.setBinCode(bins.get(binAbs));
                        bins.put(binAbs, blFacade.getBinCode(binAbs, companyName));
                    }
                    bin.setBinCode(bins.get(binAbs));
                    bin.setPackedQty(0);
                    bin.setPickedQty(pickedItems.get(itemCode).get(binAbs));
                    bin.setPackingOrderItem(packingItem);
                    packingItem.getBins().add(bin);
                }
                packingOrder.getItems().add(packingItem);
            }
            poFacade.create(packingOrder);
            CONSOLE.log(Level.INFO, "Se creo la orden de packing para la orden {0}", order.getOrderNumber());
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al actualizar el estado de la asignacion de picking. ", e);
        }
    }
}
