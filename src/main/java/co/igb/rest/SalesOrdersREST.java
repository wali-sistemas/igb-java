package co.igb.rest;

import co.igb.dto.OrderAssignmentDTO;
import co.igb.dto.SalesOrderDTO;
import co.igb.persistence.entity.AssignedOrder;
import co.igb.persistence.entity.PackingOrder;
import co.igb.persistence.entity.PackingOrderItem;
import co.igb.persistence.entity.PackingOrderItemBin;
import co.igb.persistence.facade.AssignedOrderFacade;
import co.igb.persistence.facade.PackingOrderFacade;
import co.igb.persistence.facade.PickingRecordFacade;
import co.igb.persistence.facade.SalesOrderFacade;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author dbotero
 */
@Stateless
@Path("picking")
public class SalesOrdersREST implements Serializable {

    private static final Logger CONSOLE = Logger.getLogger(SalesOrdersREST.class.getSimpleName());

    @EJB
    private SalesOrderFacade soFacade;
    @EJB
    private AssignedOrderFacade aoFacade;
    @EJB
    private PickingRecordFacade pickingRecordFacade;
    @EJB
    private PackingOrderFacade poFacade;

    @GET
    @Path("list/orders")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listOpenOrders(@QueryParam("showAll") Boolean showAll, @HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        CONSOLE.log(Level.INFO, "Listando ordenes de compra abiertas. mostrar no autorizadas? {0}", showAll);
        try {
            List<SalesOrderDTO> orders = soFacade.findOpenOrders(showAll, companyName);
            List<AssignedOrder> assignations = aoFacade.listOpenAssignations();
            for (AssignedOrder assignation : assignations) {
                for (SalesOrderDTO orderDto : orders) {
                    if (orderDto.getDocNum().equals(assignation.getOrderNumber().toString())) {
                        orderDto.setAssignedPickingEmployee(assignation.getEmpId());
                        break;
                    }
                }
            }
            return Response.ok(orders).build();
        } catch (Exception e) {
            return Response.serverError().build();
        }
    }

    @POST
    @Path("assign")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response assignOrders(OrderAssignmentDTO dto, @HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "Asignando ordenes para picking. {0}", dto);
        boolean allAssigned = true;
        for (String[] orderId : dto.getOrders()) {
            AssignedOrder assignation = aoFacade.findByOrderNumber(Integer.parseInt(orderId[0]));
            if (assignation != null) {
                //Reassign
                assignation.setDateAssigned(new Date());
                assignation.setAssignedBy(dto.getAssignedBy());
                assignation.setEmpId(dto.getEmployeeId());
                try {
                    aoFacade.edit(assignation);
                } catch (Exception e) {
                    allAssigned = false;
                    CONSOLE.log(Level.SEVERE, "Ocurrio un error al reasignar la orden " + Arrays.toString(orderId) + " al empleado " + dto.getEmployeeId(), e);
                }
            } else {
                //Create assignation record
                AssignedOrder entity = new AssignedOrder();
                entity.setAssignedBy(dto.getAssignedBy());
                entity.setDateAssigned(new Date());
                entity.setEmpId(dto.getEmployeeId());
                entity.setOrderNumber(Integer.parseInt(orderId[0]));
                entity.setStatus("open");
                entity.setCustomerId(orderId[1]);
                entity.setCompany(companyName);

                try {
                    aoFacade.create(entity);
                } catch (Exception e) {
                    allAssigned = false;
                    CONSOLE.log(Level.SEVERE, "Ocurrio un error al asignar la orden " + Arrays.toString(orderId) + " al empleado " + dto.getEmployeeId(), e);
                }
            }
        }
        if (allAssigned) {
            return Response.ok(new ResponseDTO(0, null)).build();
        } else {
            return Response.ok(new ResponseDTO(-1, "No fue posible asignar todas las órdenes al empleado. Por favor refresca la ventana y vuelve a intentar")).build();
        }
    }

    @GET
    @Path("pick/{username}")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response getNextPickingItem(@PathParam("username") String username, @QueryParam("orderNumber") String orderNumber, @HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        CONSOLE.log(Level.INFO, "Buscando siguiente item para picking, usuario: {0}, orden: {1}", new Object[]{username, orderNumber});
        if (companyName == null) {
            return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-1, "No se especificó la empresa")).build();
        }
        List<AssignedOrder> assignations = aoFacade.listOpenAssignationsByUserAndCompany(username, Integer.parseInt(orderNumber == null ? "0" : orderNumber), companyName);
        if (assignations.isEmpty()) {
            return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-3, "El usuario no tiene asignaciones pendientes")).build();
        }
        List<Integer> orderNumbers = new ArrayList<>();
        for (AssignedOrder assignation : assignations) {
            if ((orderNumber != null && orderNumber.equals(assignation.getOrderNumber().toString())) || orderNumber == null) {
                orderNumbers.add(assignation.getOrderNumber());
            }
        }

        //Lists all items already picked for all assigned/filtered orders
        Map<Integer, Map<String, Integer>> pickedItems = pickingRecordFacade.listPickedItems(orderNumbers);
        //Get items and locations from all assignations
        List<Object[]> stock = soFacade.findOrdersStockAvailability(orderNumbers, companyName);
        //Filters already picked items from assigned ones
        List pendingItems = new ArrayList();
        for (Object[] row : stock) {
            //row[0]: itemCode
            //row[1]: openQuantity
            //row[2]: quantity
            //row[3]: binAbs
            //row[4]: availableQty
            //row[5]: binCode
            //row[6]: itemName
            //row[7]: orderNumber
            Integer currentOrderNumber = (Integer) row[7];
            String currentItemCode = (String) row[0];
            if (!pickedItems.containsKey(currentOrderNumber) || !pickedItems.get(currentOrderNumber).containsKey(currentItemCode)) {
                pendingItems.add(row);
            }
        }
        if (stock == null || stock.isEmpty() || pendingItems.isEmpty()) {
            CONSOLE.log(Level.INFO, "There are no more pending items to pick");

            try {
                //Marks picking assignation as done
                for (AssignedOrder assignedOrder : assignations) {
                    if (orderNumber != null && orderNumber.equals(assignedOrder.getOrderNumber().toString())) {
                        assignedOrder.setStatus("done");
                        aoFacade.edit(assignedOrder);
                        createPackingOrder(assignedOrder, companyName);
                        break;
                    } else if (orderNumber == null) {
                        assignedOrder.setStatus("done");
                        aoFacade.edit(assignedOrder);
                        createPackingOrder(assignedOrder, companyName);
                    }
                }

                return Response.ok(new ResponseDTO(-2, "There are no more items to pick")).build();
            } catch (Exception e) {
                return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new ResponseDTO(-1, "Ocurrio un error al finalizar el proceso de picking")).build();
            }

        } else {
            CONSOLE.log(Level.INFO, "{0} items were returned from the query and only {1} are pending", new Object[]{stock.size(), pendingItems.size()});
            return Response.ok(pendingItems).build();
        }
    }

    private void createPackingOrder(AssignedOrder order, String schemaName) throws Exception {

        Object[] customerData = (Object[]) soFacade.queryCustomer(order.getOrderNumber(), schemaName);
        if (customerData == null) {
            throw new Exception("Could not query customer data for order " + order.getOrderNumber());
        }

        //Creates packing record
        PackingOrder packing = new PackingOrder();
        packing.setCustomerId((String) customerData[0]);
        packing.setCustomerName((String) customerData[1]);
        packing.setOrderNumber(order.getOrderNumber());
        packing.setStatus("open");

        Map<String, Map<Long, Integer>> pickedItems = pickingRecordFacade.listPickedItems(order.getOrderNumber());
        if (pickedItems.isEmpty()) {
            throw new Exception("Could not query picking records for order " + order.getOrderNumber());
        }

        for (String itemcode : pickedItems.keySet()) {
            PackingOrderItem item = new PackingOrderItem();
            item.setItemCode(itemcode);

            List<PackingOrderItemBin> bins = new ArrayList<>();
            for (Long binAbs : pickedItems.get(itemcode).keySet()) {
                PackingOrderItemBin bin = new PackingOrderItemBin();
                bin.setBinAbs(binAbs);
                bin.setBinCode(null);
                bin.setPackingOrderItem(item);
                bin.setPickedQty(pickedItems.get(itemcode).get(binAbs));
                bin.setPackedQty(0);
                bins.add(bin);
            }

            item.setBins(bins);
            item.setPackingOrder(packing);
            packing.getItems().add(item);
        }

        try {
            poFacade.create(packing);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al crear el registro de packing. ", e);
            throw new Exception("Ocurrio un error al crear el registro de packing.");
        }

    }

    @GET
    @Path("orders/{username}")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listAssignedOrders(@PathParam("username") String username, @HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        CONSOLE.log(Level.INFO, "Listando ordenes asignadas al usuario: {0}", new Object[]{username});
        if (companyName == null) {
            return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-1, "No se especificó la empresa")).build();
        }
        List<AssignedOrder> assignations = aoFacade.listOpenAssignationsByUserAndCompany(username, null, companyName);
        List<Integer> orderIds = new ArrayList<>();
        for (AssignedOrder order : assignations) {
            orderIds.add(order.getOrderNumber());
        }
        return Response.ok(soFacade.findOrdersById(orderIds, companyName)).build();
    }
}
