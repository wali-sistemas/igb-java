package co.igb.rest;

import co.igb.dto.OrderAssignmentDTO;
import co.igb.dto.SalesOrderDTO;
import co.igb.persistence.entity.AssignedOrder;
import co.igb.persistence.facade.AssignedOrderFacade;
import co.igb.persistence.facade.SalesOrderFacade;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
    public Response assignOrders(OrderAssignmentDTO dto) {
        CONSOLE.log(Level.INFO, "Asignando ordenes para picking. {0}", dto);
        boolean allAssigned = true;
        for (Integer orderId : dto.getOrders()) {
            AssignedOrder assignation = aoFacade.findByOrderNumber(orderId);
            if (assignation != null) {
                //Reassign
                assignation.setDateAssigned(new Date());
                assignation.setAssignedBy(dto.getAssignedBy());
                assignation.setEmpId(dto.getEmployeeId());
                try {
                    aoFacade.edit(assignation);
                } catch (Exception e) {
                    allAssigned = false;
                    CONSOLE.log(Level.SEVERE, "Ocurrio un error al reasignar la orden " + orderId + " al empleado " + dto.getEmployeeId(), e);
                }
            } else {
                //Create assignation record
                AssignedOrder entity = new AssignedOrder();
                entity.setAssignedBy(dto.getAssignedBy());
                entity.setDateAssigned(new Date());
                entity.setEmpId(dto.getEmployeeId());
                entity.setOrderNumber(orderId);
                entity.setStatus("open");

                try {
                    aoFacade.create(entity);
                } catch (Exception e) {
                    allAssigned = false;
                    CONSOLE.log(Level.SEVERE, "Ocurrio un error al asignar la orden " + orderId + " al empleado " + dto.getEmployeeId(), e);
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
        //TODO: filter response by order number
        //Get all orders assigned to the user
        List<AssignedOrder> assignations = aoFacade.listOpenAssignationsByUser(username);
        List<Integer> orderNumbers = new ArrayList<>();
        for (AssignedOrder assignation : assignations) {
            if ((orderNumber != null && orderNumber.equals(assignation.getOrderNumber().toString())) || orderNumber == null) {
                orderNumbers.add(assignation.getOrderNumber());
            }
        }
        //Get items and locations from all assignations
        List stock = soFacade.findOrdersStockAvailability(orderNumbers, companyName);
        return Response.ok(stock).build();
    }

    @GET
    @Path("orders/{username}")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listAssignedOrders(@PathParam("username") String username, @HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        CONSOLE.log(Level.INFO, "Listando ordenes asignadas al usuario: {0}", new Object[]{username});
        List<AssignedOrder> assignations = aoFacade.listOpenAssignationsByUser(username);
        List<Integer> orderIds = new ArrayList<>();
        for (AssignedOrder order : assignations) {
            orderIds.add(order.getOrderNumber());
        }
        return Response.ok(soFacade.findOrdersById(orderIds, companyName)).build();
    }
}
