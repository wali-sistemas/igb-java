package co.igb.rest;

import co.igb.dto.OrderAssignmentDTO;
import co.igb.dto.ResponseDTO;
import co.igb.dto.SalesOrderDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.persistence.entity.AssignedOrder;
import co.igb.persistence.facade.AssignedOrderFacade;
import co.igb.persistence.facade.CustomerFacade;
import co.igb.persistence.facade.PackingOrderFacade;
import co.igb.persistence.facade.PickingRecordFacade;
import co.igb.persistence.facade.SalesOrderFacade;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dbotero
 */
@Stateless
@Path("salesorder")
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
    @EJB
    private CustomerFacade customerFacade;
    @Inject
    private IGBApplicationBean appBean;

    @GET
    @Path("list/orders/{showAll}/{filterGroup}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listOpenOrders(@PathParam("showAll") Boolean showAll,
                                   @PathParam("filterGroup") Boolean filterGroup,
                                   @HeaderParam("X-Company-Name") String companyName,
                                   @HeaderParam("X-Warehouse-Code") String warehouseCode,
                                   @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Listando ordenes abiertas. mostrar no autorizadas? {0}", showAll);
        CONSOLE.log(Level.INFO, "en pruebas? {0}", pruebas);
        try {
            List<SalesOrderDTO> orders = soFacade.findOpenOrders(showAll, filterGroup, companyName, pruebas, warehouseCode);
            List<AssignedOrder> assignations = aoFacade.listOpenAssignations(companyName, pruebas);
            List<AssignedOrder> closedAssignations = aoFacade.listClosedAssignations(companyName, pruebas);
            CONSOLE.log(Level.INFO, "{0} ordenes abiertas encontradas...", orders.size());

            for (AssignedOrder assignation : closedAssignations) {
                int orderIndex = -1;
                for (int i = 0; i < orders.size(); i++) {
                    SalesOrderDTO order = orders.get(i);
                    if (order.getDocNum().equals(assignation.getOrderNumber().toString())) {
                        orderIndex = i;
                        break;
                    }
                }
                if (orderIndex >= 0) {
                    orders.remove(orderIndex);
                }
            }
            CONSOLE.log(Level.INFO, "{0} ordenes no han sido procesadas", orders.size());
            for (AssignedOrder assignation : assignations) {
                for (SalesOrderDTO orderDto : orders) {
                    if (orderDto.getDocNum().equals(assignation.getOrderNumber().toString())) {
                        orderDto.setAssignedPickingEmployee(assignation.getEmpId());
                        orderDto.setStatus(assignation.getStatus());
                        break;
                    }
                }
            }
            return Response.ok(orders).build();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error listando las ordenes abiertas en " + companyName, e);
            return Response.serverError().build();
        }
    }

    @POST
    @Path("assign")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response assignOrders(OrderAssignmentDTO dto,
                                 @HeaderParam("X-Company-Name") String companyName,
                                 @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Asignando ordenes para picking. {0}", dto);
        boolean allAssigned = true;
        for (String[] orderId : dto.getOrders()) {
            AssignedOrder assignation = aoFacade.findByOrderNumber(Integer.parseInt(orderId[0]), companyName, pruebas);
            if (assignation != null) {
                //Reassign
                assignation.setDateAssigned(new Date());
                assignation.setAssignedBy(dto.getAssignedBy());
                assignation.setEmpId(dto.getEmployeeId());
                try {
                    aoFacade.edit(assignation, companyName, pruebas);
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
                entity.setCustomerName(customerFacade.getCustomerName(orderId[1], companyName, pruebas));
                entity.setCompany(companyName);

                try {
                    aoFacade.create(entity, companyName, pruebas);
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
    @Path("orders/{username}")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listAssignedOrders(@PathParam("username") String username,
                                       @HeaderParam("X-Company-Name") String companyName,
                                       @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Listando ordenes asignadas al usuario: {0}", new Object[]{username});
        if (companyName == null) {
            return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-1, "No se especificó la empresa")).build();
        }
        List<AssignedOrder> assignations = aoFacade.listOpenAssignationsByUserAndCompany(username, null, companyName, pruebas);
        if (assignations == null || assignations.isEmpty()) {
            return Response.ok(new ResponseDTO(-1, "No se encontraron asignaciones para el usuario")).build();
        }
        List<Integer> orderIds = new ArrayList<>();
        for (AssignedOrder order : assignations) {
            orderIds.add(order.getOrderNumber());
        }
        return Response.ok(new ResponseDTO(0, soFacade.findOrdersById(orderIds, companyName, pruebas))).build();
    }

    @GET
    @Path("stock/{orderNumber}")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listAvailableStock(
            @PathParam("orderNumber") Integer orderNumber,
            @HeaderParam("X-Company-Name") String companyName,
            @HeaderParam("X-Warehouse-Code") String warehouseCode,
            @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Validando saldo disponible para orden: {0}", orderNumber);

        List<Object[]> data = soFacade.listRemainingStock(orderNumber, warehouseCode, companyName, pruebas);
        if (data.isEmpty()) {
            return Response.ok(new ResponseDTO(-1, "No se pudo ejecutar la consulta. ")).build();
        } else {
            return Response.ok(new ResponseDTO(0, data)).build();
        }
    }

    @PUT
    @Path("enable")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response enableAssignation(Integer orderNumber,
                                      @HeaderParam("X-Company-Name") String companyName,
                                      @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Habilitando asignacion de picking para orden: {0}", orderNumber);
        boolean success = aoFacade.enablePicking(orderNumber, companyName, pruebas);
        return Response.ok(new ResponseDTO(success ? 0 : -1, null)).build();
    }

    @DELETE
    @Path("reset-assigned/{orderNumber}")
    @Consumes({MediaType.APPLICATION_JSON})
    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
    public Response deleteAssignedOrder(@PathParam("orderNumber") Integer orderNumber,
                                        @HeaderParam("X-Company-Name") String companyName,
                                        @HeaderParam("X-Pruebas") boolean pruebas) {
        if (orderNumber == null) {
            return Response.ok(new ResponseDTO(-1, "Sin datos para des-asignar la orden.")).build();
        }
        CONSOLE.log(Level.INFO, "Des-asignando orden [" + orderNumber + ']');
        return Response.ok(new ResponseDTO(aoFacade.deleteAssignedOrder(orderNumber, companyName, pruebas) ? 0 : 1, null)).build();
    }
}