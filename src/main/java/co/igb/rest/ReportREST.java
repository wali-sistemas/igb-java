package co.igb.rest;

import co.igb.dto.SalesOrderDTO;
import co.igb.dto.UserDTO;
import co.igb.ejb.IGBAuthLDAP;
import co.igb.persistence.entity.AssignedOrder;
import co.igb.persistence.entity.PickingRecord;
import co.igb.persistence.facade.AssignedOrderFacade;
import co.igb.persistence.facade.PickingRecordFacade;
import co.igb.persistence.facade.SalesOrderFacade;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author YEIJARA
 */
@Stateless
@Path("report")
public class ReportREST implements Serializable {

    private static final Logger CONSOLE = Logger.getLogger(ReportREST.class.getSimpleName());
    @EJB
    private SalesOrderFacade salesOrderFacade;
    @EJB
    private AssignedOrderFacade assignedOrderFacade;
    @EJB
    private IGBAuthLDAP authenticator;
    @EJB
    private PickingRecordFacade pickingRecordFacade;

    @GET
    @Path("reports-orders")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response obtainReportsOrders(@HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);

        List<SalesOrderDTO> orders = salesOrderFacade.findOpenOrders(false, companyName);
        List<AssignedOrder> assigned = assignedOrderFacade.listOpenAssignations();

        Integer[] contador = new Integer[]{0, 0};
        for (SalesOrderDTO s : orders) {
            boolean existe = false;

            for (int i = 0; i < assigned.size(); i++) {
                AssignedOrder a = assigned.get(i);

                if (a.getOrderNumber().equals(Integer.parseInt(s.getDocNum()))) {
                    contador[1]++;
                    existe = true;
                    assigned.remove(a);
                    break;
                }
            }

            if (!existe) {
                contador[0]++;
            }
        }

        return Response.ok(new ResponseDTO(0, contador)).build();
    }

    @GET
    @Path("reports-employee-assigned/{groupName}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response obtainReportsEmployeeAssigned(@PathParam("groupName") String groupName, @HeaderParam("X-Company-Name") String companyName) {
        List<UserDTO> users = authenticator.listEmployeesInGroup(groupName);

        if (users != null && !users.isEmpty()) {
            for (UserDTO u : users) {
                u.setOrdenesAsignadas(assignedOrderFacade.countOrderEmployeeAssigneed(u.getUsername()));
            }
        }

        return Response.ok(new ResponseDTO(0, users)).build();
    }

    @GET
    @Path("reports-picking-progress")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listPickingProgress(@HeaderParam("X-Company-Name") String companyName) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd");
        List<Integer> pickings = pickingRecordFacade.listPickingsRecords();
        List<Object[]> ordenes = new ArrayList<>();

        if (pickings != null && !pickings.isEmpty()) {
            for (Integer l : pickings) {
                int dias = 0;
                int horas = 0;
                int minutos = 0;
                int diferencia = 0;
                long time1;
                long time2;
                double totalTiempo = 0.0;
                double promedio = 0.0;
                List<PickingRecord> datos = pickingRecordFacade.listPicking(l);

                if (datos != null && !datos.isEmpty()) {
                    for (int i = 0; i < datos.size(); i++) {
                        if (totalTiempo > 0) {
                            diferencia = (int) totalTiempo;

                            if (diferencia > 86400) {
                                dias = (int) Math.floor(diferencia / 86400);
                                diferencia = diferencia - (dias * 86400);
                            }
                            if (diferencia > 3600) {
                                horas = (int) Math.floor(diferencia / 3600);
                                diferencia = diferencia - (horas * 3600);
                            }
                            if (diferencia > 60) {
                                minutos = (int) Math.floor(diferencia / 60);
                                diferencia = diferencia - (minutos * 60);
                            }
                        }

                        if (i < (datos.size() - 1)) {
                            time1 = datos.get(i).getTransactionDate().getTime();

                            if (Integer.parseInt(sdf.format(datos.get(i + 1).getTransactionDate())) > Integer.parseInt(sdf.format(datos.get(i).getTransactionDate()))) {
                                int tmp1 = (int) Math.floor(minutos / (i + 1));
                                minutos = minutos - (tmp1 * (i + 1));
                                totalTiempo += ((tmp1 * 60) + ((diferencia + (minutos * 60)) / (i + 1)));
                            } else {
                                time2 = datos.get(i + 1).getTransactionDate().getTime();
                                totalTiempo += (time2 - time1) / 1000;
                            }
                        }

                        System.out.println("Tiempo en posicion " + i + " " + totalTiempo);
                    }

                    if (totalTiempo > 0) {
                        diferencia = (int) totalTiempo;

                        if (diferencia > 86400) {
                            dias = (int) Math.floor(diferencia / 86400);
                            diferencia = diferencia - (dias * 86400);
                        }
                        if (diferencia > 3600) {
                            horas = (int) Math.floor(diferencia / 3600);
                            diferencia = diferencia - (horas * 3600);
                        }
                        if (diferencia > 60) {
                            minutos = (int) Math.floor(diferencia / 60);
                            diferencia = diferencia - (minutos * 60);
                        }
                    }

                    ordenes.add(new Object[]{l, ((((dias * 24) * 60) + (horas * 60) + minutos) / datos.size()), (((dias * 24) * 60) + (horas * 60) + minutos)});
                } else {
                    ordenes.add(new Object[]{l, promedio, totalTiempo});
                }
            }
        }

        return Response.ok(new ResponseDTO(0, ordenes)).build();
    }

    @GET
    @Path("reports-orders-client")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response obtainReportsOrdersByClient(@HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        List<SalesOrderDTO> orders = salesOrderFacade.findOpenOrders(false, companyName);
        List<AssignedOrder> assigned = assignedOrderFacade.listOpenAssignations();

        List<Object[]> datos = new ArrayList<>();
        for (SalesOrderDTO s : orders) {
            boolean existe = false;

            for (int i = 0; i < assigned.size(); i++) {
                AssignedOrder a = assigned.get(i);

                if (a.getOrderNumber().equals(Integer.parseInt(s.getDocNum())) && a.getStatus().equals("open")) {
                    existe = true;
                    assigned.remove(a);
                    break;
                }
            }

            if (!existe) {
                if (!datos.isEmpty()) {
                    boolean exist = false;

                    for (Object[] o : datos) {
                        if (o[0].equals(s.getCardCode())) {
                            o[1] = ((int) o[1]) + 1;
                            exist = true;
                            break;
                        }
                    }

                    if (!exist) {
                        datos.add(new Object[]{s.getCardCode(), 1});
                    }
                } else {
                    datos.add(new Object[]{s.getCardCode(), 1});
                }
            }
        }

        return Response.ok(new ResponseDTO(0, datos)).build();
    }
}
