package co.igb.rest;

import co.igb.dto.*;
import co.igb.ejb.IGBApplicationBean;
import co.igb.ejb.IGBAuthLDAP;
import co.igb.persistence.entity.AssignedOrder;
import co.igb.persistence.entity.PickingRecord;
import co.igb.persistence.entity.ReportPickingProgress;
import co.igb.persistence.facade.*;
import co.igb.util.Constants;
import net.sf.jasperreports.engine.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPageable;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.naming.InitialContext;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.print.attribute.standard.Sides;
import javax.sql.DataSource;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
@Path("report")
public class ReportREST implements Serializable {
    private static final Logger CONSOLE = Logger.getLogger(ReportREST.class.getSimpleName());
    @Inject
    private IGBApplicationBean applicationBean;
    @EJB
    private SalesOrderFacade salesOrderFacade;
    @EJB
    private AssignedOrderFacade assignedOrderFacade;
    @EJB
    private IGBAuthLDAP authenticator;
    @EJB
    private PickingRecordFacade pickingRecordFacade;
    @EJB
    private ReportPickingProgressFacade reportPickingProgressFacade;
    @EJB
    private InvoiceFacade invoiceFacade;
    @EJB
    private PaymentsReceivedFacade paymentsReceivedFacade;
    @EJB
    private PackingListRecordFacade packingListRecordFacade;
    @EJB
    private ShippingOrderFacade shippingOrderFacade;
    @EJB
    private LandedCostsFacade landedCostsFacade;
    @EJB
    private PurchaseOrderFacade purchaseOrderFacade;
    @EJB
    private DeliveryNoteFacade deliveryNoteFacade;
    @EJB
    private UserFacade userFacade;

    @GET
    @Path("reports-orders")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response obtainReportsOrders(@HeaderParam("X-Company-Name") String companyName,
                                        @HeaderParam("X-Warehouse-Code") String warehouseCode,
                                        @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Consultando estados de ordenes en bodega general para la empresa [" + companyName + "]");
        List<SalesOrderDTO> orders = salesOrderFacade.findOpenOrders(false, false, companyName, pruebas, warehouseCode);
        List<AssignedOrder> assigned = assignedOrderFacade.listOpenAssignations(companyName, pruebas);
        Integer packing = packingListRecordFacade.getOrdersForPacking(companyName, pruebas);
        Integer shipping = invoiceFacade.getOrdersForShipping(companyName, pruebas);

        Integer[] contador = new Integer[]{0, 0, packing.intValue(), shipping};
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
        CONSOLE.log(Level.INFO, "Retornando estados de ordenes en bodega general para la empresa [" + companyName + "]");
        return Response.ok(new ResponseDTO(0, contador)).build();
    }

    @GET
    @Path("reports-picking-progress")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listPickingProgress(@HeaderParam("X-Company-Name") String companyName,
                                        @HeaderParam("X-Pruebas") boolean pruebas) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd");
        List<Integer> pickings = pickingRecordFacade.listPickingsRecords(companyName, pruebas);
        List<Object[]> ordenes = new ArrayList<>();

        if (pickings != null && !pickings.isEmpty()) {
            for (Integer l : pickings) {
                // Validar si el registro ya no fue registrado
                ReportPickingProgress rpp = reportPickingProgressFacade.obtainReportOrder(l, companyName, pruebas);

                if (rpp != null && rpp.getOrderNumber() != null && rpp.getOrderNumber() != 0) {
                    ordenes.add(new Object[]{l, rpp.getPromedio(), rpp.getTotalTiempo()});
                } else {
                    int dias = 0;
                    int horas = 0;
                    int minutos = 0;
                    int diferencia = 0;
                    long time1;
                    long time2;
                    double totalTiempo = 0.0;
                    double promedio = 0.0;
                    List<PickingRecord> datos = pickingRecordFacade.listPicking(l, companyName, pruebas);

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

                    // Si la orden ya esta cerrada se hace un registro en la base de datos
                    AssignedOrder order = assignedOrderFacade.findByOrderNumber(l, companyName, pruebas);

                    if (order != null && order.getId() != null && order.getId() != 0 && order.getStatus().equals(Constants.STATUS_CLOSED)) {
                        ReportPickingProgress progress = new ReportPickingProgress();

                        progress.setDias(dias);
                        progress.setHoras(horas);
                        progress.setMinutos(minutos);
                        progress.setOrderNumber(l);
                        progress.setPromedio(promedio);
                        progress.setSegundos(diferencia);
                        progress.setTotalTiempo(totalTiempo);

                        try {
                            reportPickingProgressFacade.create(progress, companyName, pruebas);
                        } catch (Exception ignored) {
                        }
                    }
                }
            }
        }

        return Response.ok(new ResponseDTO(0, ordenes)).build();
    }

    @GET
    @Path("reports-orders-client")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response obtainReportsOrdersByClient(@HeaderParam("X-Company-Name") String companyName,
                                                @HeaderParam("X-Warehouse-Code") String warehouseCode,
                                                @HeaderParam("X-Pruebas") boolean pruebas) {
        List<SalesOrderDTO> orders = salesOrderFacade.findOpenOrders(false, false, companyName, pruebas, warehouseCode);
        List<AssignedOrder> assigned = assignedOrderFacade.listOpenAssignations(companyName, pruebas);

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

    @GET
    @Path("sales-annual")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response getSalesAnnual(@HeaderParam("X-Company-Name") String companyName,
                                   @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Consultando el total de ventas anuales para la empresa [" + companyName + "]");
        List<Object[]> sales = invoiceFacade.getAnnualSales(companyName, pruebas);
        if (sales != null) {
            List<SalesAnnualDTO> listSales = new ArrayList<>();
            for (Object[] row : sales) {
                listSales.add(new SalesAnnualDTO((String) row[0], (BigDecimal) row[1], (BigDecimal) row[2], (BigDecimal) row[3], (BigDecimal) row[4], (BigDecimal) row[5]));
            }
            CONSOLE.log(Level.INFO, "Retornando ventas anuales para [" + companyName + "]");
            return Response.ok(new ResponseDTO(listSales == null ? -1 : 0, listSales)).build();
        }
        CONSOLE.log(Level.SEVERE, "No se encontraron ventas anuales para mostrar en [" + companyName + "]");
        return Response.ok(new ResponseDTO(-1, "No se encontraron ventas anuales para mostar.")).build();
    }

    @GET
    @Path("sales-monthly")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response getSalesMonthly(@HeaderParam("X-Company-Name") String companyName,
                                    @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Consultando el total de ventas mensuales para la empresa [" + companyName + "]");
        List<Object[]> sales = invoiceFacade.getMonthlySales(companyName, pruebas);
        if (sales != null || sales.size() <= 0) {
            List<SalesMonthlyDTO> listSales = new ArrayList<>();
            for (Object[] row : sales) {
                listSales.add(new SalesMonthlyDTO((String) row[0], (String) row[1], (BigDecimal) row[2], (BigDecimal) row[3], (BigDecimal) row[4], (BigDecimal) row[5], (BigDecimal) row[6], (BigDecimal) row[7]));
            }
            CONSOLE.log(Level.INFO, "Retornando ventas mensuales para [" + companyName + "]");
            return Response.ok(new ResponseDTO(listSales == null ? -1 : 0, listSales)).build();
        }
        CONSOLE.log(Level.SEVERE, "No se encontraron ventas mensuales para mostrar en [" + companyName + "]");
        return Response.ok(new ResponseDTO(-1, "No se encontraron ventas mensuales para mostrar.")).build();
    }

    @GET
    @Path("sales-collect-monthly")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response getSalesCollectMonthly(@HeaderParam("X-Company-Name") String companyName,
                                           @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Consultando el recaudo de ventas mensuales para la empresa [" + companyName + "]");
        List<Object[]> listCollect = paymentsReceivedFacade.getCollectMonthly(companyName, pruebas);
        if (listCollect != null || listCollect.size() <= 0) {
            CONSOLE.log(Level.INFO, "Retornando recaudos mensuales para la empresa [" + companyName + "]");
            return Response.ok(new ResponseDTO(0, listCollect)).build();
        } else {
            CONSOLE.log(Level.SEVERE, "No se encontraron recaudos mensuales para mostrar en [" + companyName + "]");
            return Response.ok(new ResponseDTO(-1, "No se encontraron recaudos mensuales para mostrar.")).build();
        }
    }

    @GET
    @Path("sales-by-collect")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response getSalesByCollect(@HeaderParam("X-Company-Name") String companyName,
                                      @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Consultando la cartera por cobrar para la empresa [" + companyName + "]");
        List<Object[]> listByCollect = paymentsReceivedFacade.getByCollect(companyName, pruebas);
        if (listByCollect != null || listByCollect.size() <= 0) {
            CONSOLE.log(Level.INFO, "Retornando la cartera por cobrar para la empresa [" + companyName + "]");
            return Response.ok(new ResponseDTO(0, listByCollect)).build();
        } else {
            CONSOLE.log(Level.SEVERE, "No se encontro cartera por cobrar para mostrar en [" + companyName + "]");
            return Response.ok(new ResponseDTO(-1, "No se encontro cartera por cobrar para mostrar en [" + companyName + "].")).build();
        }
    }

    @GET
    @Path("states-order")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listOrderStates(@HeaderParam("X-Company-Name") String companyName,
                                    @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Consultando estados de las ordenes para la empresa [" + companyName + "]");
        List<Object[]> listOrders = salesOrderFacade.getOrderStates(companyName, pruebas);
        if (listOrders != null || listOrders.size() <= 0) {
            BigDecimal totalInvoice = invoiceFacade.getInvoiceTotal(companyName, pruebas);
            BigDecimal totalOrder = salesOrderFacade.getTotalOrderMonth(companyName, pruebas);
            List<StatusOrderDTO> listStatusOrder = new ArrayList<>();
            for (Object[] row : listOrders) {
                listStatusOrder.add(new StatusOrderDTO((String) row[0], (Integer) row[1], (BigDecimal) row[2], totalInvoice, totalOrder));
            }
            CONSOLE.log(Level.INFO, "Retornando estado de las ordenes para la empresa [" + companyName + "]");
            return Response.ok(new ResponseDTO(0, listStatusOrder)).build();
        } else {
            CONSOLE.log(Level.SEVERE, "No se encontraron estados de ordenes para mostrar en [" + companyName + "]");
            return Response.ok(new ResponseDTO(-1, "No se encontraron estados de ordenes para mostrar.")).build();
        }
    }

    @GET
    @Path("orders-of-day")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listOrdersOfDay(@HeaderParam("X-Company-Name") String companyName,
                                    @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Iniciando servicio para consultar las ordenes del día en {0}", companyName);
        return Response.ok(salesOrderFacade.listOrdersOfDay(companyName, pruebas)).build();
    }

    @GET
    @Path("comex/purchase-costo")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response getPurchaseCosto(@HeaderParam("X-Company-Name") String companyName,
                                     @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Consultando el costo de compras de comex en [" + companyName + "]");
        List<Object[]> costs = landedCostsFacade.listPurchesesCosts(companyName, pruebas);
        if (costs != null || costs.size() <= 0) {
            List<PurchaseCostDTO> PurchasesCosts = new ArrayList<>();
            for (Object[] row : costs) {
                PurchasesCosts.add(new PurchaseCostDTO((BigDecimal) row[0], (BigDecimal) row[1], (BigDecimal) row[2], (String) row[3], (int) row[4]));
            }
            CONSOLE.log(Level.INFO, "Retornando costos de compras comex en [" + companyName + "]");
            return Response.ok(new ResponseDTO(PurchasesCosts == null ? -1 : 0, PurchasesCosts)).build();
        }
        CONSOLE.log(Level.SEVERE, "No se encontraron los costos de compras para mostrar en [" + companyName + "]");
        return Response.ok(new ResponseDTO(-1, "No se encontraron los costos de compras para mostrar en " + companyName)).build();
    }

    @GET
    @Path("comex/import-costo")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response getImportCosto(@HeaderParam("X-Company-Name") String companyName,
                                   @HeaderParam("X-Pruebas") boolean pruebas) {
        return Response.ok(new ResponseDTO(0, landedCostsFacade.listImportsCosto(companyName, pruebas))).build();
    }

    @GET
    @Path("comex/purchase-factor")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response getPurchaseCosto(@QueryParam("year") Integer year,
                                     @QueryParam("month") String month,
                                     @HeaderParam("X-Company-Name") String companyName,
                                     @HeaderParam("X-Pruebas") boolean pruebas) {
        return Response.ok(new ResponseDTO(0, landedCostsFacade.listPurchesesFactor(year, convertNameMonth(month), companyName, pruebas))).build();
    }

    @GET
    @Path("comex/tracking-order/{order}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response getTrackingOrder(@PathParam("order") String docNum,
                                     @HeaderParam("X-Company-Name") String companyName,
                                     @HeaderParam("X-Pruebas") boolean pruebas) {
        List<TrackingOrderDTO> trackingOrder = new ArrayList<>();
        List<Object[]> datails = purchaseOrderFacade.listTrackingOrder(docNum, companyName, pruebas);
        for (Object[] obj : datails) {
            TrackingOrderDTO dto = new TrackingOrderDTO();
            dto.setConcept((String) obj[0]);
            dto.setInformation((String) obj[1]);
            dto.setOrder((String) obj[2]);
            dto.setCardCode((String) obj[3]);
            dto.setCreateDate((Date) obj[4]);
            dto.setBuyer((String) obj[5]);
            dto.setTypeShipment((String) obj[6]);
            dto.setNroQty((String) obj[7]);
            dto.setLiquid((String) obj[8]);
            dto.setUserName(dto.getBuyer().substring(0, 1));

            trackingOrder.add(dto);
        }
        return Response.ok(trackingOrder).build();
    }

    @GET
    @Path("comex/time-operation")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response getTimeOperation(@HeaderParam("X-Company-Name") String companyName,
                                     @HeaderParam("X-Pruebas") boolean pruebas,
                                     @QueryParam("year") Integer year,
                                     @QueryParam("month") Integer month) {
        List<Object[]> list = purchaseOrderFacade.listTimeOperation(year, month, companyName, pruebas);
        List<TimeOperationDTO> timeOperations = new ArrayList<>();
        for (Object[] obj : list) {
            TimeOperationDTO dto = new TimeOperationDTO();
            dto.setYear((Integer) obj[0]);
            dto.setMonth((Integer) obj[1]);
            dto.setNameMonth((String) obj[2]);
            dto.setUserName((String) obj[3]);
            dto.setTimeEstCargaS((Integer) obj[4]);
            dto.setTimeRealCargaS((BigDecimal) obj[5]);
            dto.setTimeEstContainer((Integer) obj[6]);
            dto.setTimeRealContainer((BigDecimal) obj[7]);

            timeOperations.add(dto);
        }
        return Response.ok(timeOperations).build();
    }

    @GET
    @Path("comex/time-liquid")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response getTimeLiquid(@HeaderParam("X-Company-Name") String companyName,
                                  @HeaderParam("X-Pruebas") boolean pruebas,
                                  @QueryParam("year") Integer year,
                                  @QueryParam("month") Integer month) {
        List<Object[]> list = purchaseOrderFacade.listTimeLiquid(year, month, companyName, pruebas);
        List<TimeLiquidDTO> timeLiquids = new ArrayList<>();
        for (Object[] obj : list) {
            TimeLiquidDTO dto = new TimeLiquidDTO();
            dto.setYear((Integer) obj[0]);
            dto.setMonth((Integer) obj[1]);
            dto.setNameMonth((String) obj[2]);
            dto.setUserName((String) obj[3]);
            dto.setTimeEstCargaS((Integer) obj[4]);
            dto.setTimeRealCargaS((BigDecimal) obj[5]);
            dto.setTimeEstContainer((Integer) obj[6]);
            dto.setTimeRealContainer((BigDecimal) obj[7]);

            timeLiquids.add(dto);
        }
        return Response.ok(timeLiquids).build();
    }

    @GET
    @Path("comex/booking")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response getBooking(@HeaderParam("X-Company-Name") String companyName,
                               @HeaderParam("X-Pruebas") boolean pruebas,
                               @QueryParam("year") Integer year,
                               @QueryParam("month") Integer month) {
        List<Object[]> list = purchaseOrderFacade.listBooking(year, month, companyName, pruebas);
        List<BookingDTO> bookings = new ArrayList<>();
        for (Object[] obj : list) {
            BookingDTO dto = new BookingDTO();
            dto.setYear((Integer) obj[0]);
            dto.setMonth((Integer) obj[1]);
            dto.setNameMonth((String) obj[2]);
            dto.setUserName((String) obj[3]);
            dto.setTimeEstCargaS((Integer) obj[4]);
            dto.setTimeRealCargaS((BigDecimal) obj[5]);
            dto.setTimeEstContainer((Integer) obj[6]);
            dto.setTimeRealContainer((BigDecimal) obj[7]);

            bookings.add(dto);
        }
        return Response.ok(bookings).build();
    }

    @POST
    @Path("generate-report/")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public ResponseDTO generateReport(PrintReportDTO dto,
                                      @HeaderParam("X-Warehouse-Code") String whsCode) throws Exception {
        String reportName = null;
        String report = null;
        String rutaArchivo = applicationBean.obtenerValorPropiedad("url.archivo");

        switch (dto.getDocumento()) {
            case "delivery":
                int orderNum = dto.getId();
                if (dto.getFiltro().equals("Orden")) {
                    //TODO: consultar DocNum de la entrega por número de orden, y guardar el pdf con nro de orden de venta
                    dto.setId(deliveryNoteFacade.getDocNumDeliveryNote(dto.getId(), dto.getCompanyName(), false));
                    reportName = orderNum + ".pdf";
                } else {
                    reportName = dto.getId() + ".pdf";
                }
                report = JasperCompileManager.compileReportToFile(applicationBean.obtenerValorPropiedad("url.jasper") + dto.getCompanyName() + File.separator + dto.getDocumento()
                        + File.separator + dto.getDocumento() + ".jrxml");
                rutaArchivo = rutaArchivo + dto.getCompanyName() + File.separator + dto.getDocumento() + File.separator + reportName;
                break;
            case "packingList":
                reportName = dto.getId() + ".pdf";
                report = JasperCompileManager.compileReportToFile(applicationBean.obtenerValorPropiedad("url.jasper") + dto.getCompanyName() + File.separator + dto.getDocumento()
                        + File.separator + dto.getDocumento() + ".jrxml");
                rutaArchivo = rutaArchivo + dto.getCompanyName() + File.separator + dto.getDocumento() + File.separator + reportName;
                break;
            case "checkOut":
                reportName = dto.getId() + ".pdf";
                report = JasperCompileManager.compileReportToFile(applicationBean.obtenerValorPropiedad("url.jasper") + dto.getCompanyName() + File.separator + dto.getDocumento()
                        + File.separator + dto.getDocumento() + ".jrxml");
                rutaArchivo = rutaArchivo + dto.getCompanyName() + File.separator + dto.getDocumento() + File.separator + reportName;
                break;
            case "shipping":
                reportName = dto.getId() != 0 ? String.valueOf(dto.getId()) + ".pdf" : dto.getFiltro() + ".pdf";
                report = JasperCompileManager.compileReportToFile(applicationBean.obtenerValorPropiedad("url.jasper") + dto.getCompanyName() + File.separator + dto.getDocumento()
                        + File.separator + "payroll" + File.separator + "payroll.jrxml");
                rutaArchivo = rutaArchivo + dto.getCompanyName() + File.separator + dto.getDocumento() + File.separator + "payroll" + File.separator + reportName;
                break;
            case "pickingExpress":
                reportName = dto.getId() + ".pdf";
                report = JasperCompileManager.compileReportToFile(applicationBean.obtenerValorPropiedad("url.jasper") + dto.getCompanyName() + File.separator + dto.getDocumento()
                        + File.separator + dto.getDocumento() + ".jrxml");
                rutaArchivo = rutaArchivo + dto.getCompanyName() + File.separator + dto.getDocumento() + File.separator + reportName;
                break;
            case "pickingExpressGroup":
                //validar si las ordenes corresponden al mismo cliente, de lo contrario no continuar con multi-picking.
                if (validateMultiPicking(dto.getFiltro(), dto.getCompanyName())) {
                    reportName = dto.getFiltro() + ".pdf";
                    report = JasperCompileManager.compileReportToFile(applicationBean.obtenerValorPropiedad("url.jasper") + dto.getCompanyName() + File.separator + "pickingExpress"
                            + File.separator + dto.getDocumento() + ".jrxml");
                    rutaArchivo = rutaArchivo + dto.getCompanyName() + File.separator + "pickingExpress" + File.separator + reportName;
                    break;
                } else {
                    return new ResponseDTO(-2, "Las ordenes no corresponde al mismo cliente.");
                }
            case "transferStock":
                reportName = dto.getId() + ".pdf";
                report = JasperCompileManager.compileReportToFile(applicationBean.obtenerValorPropiedad("url.jasper") + dto.getCompanyName() + File.separator + dto.getDocumento()
                        + File.separator + dto.getDocumento() + ".jrxml");
                rutaArchivo = rutaArchivo + dto.getCompanyName() + File.separator + dto.getDocumento() + File.separator + reportName;
                break;
            case "jobCertify":
                reportName = dto.getId() + ".pdf";
                report = JasperCompileManager.compileReportToFile(applicationBean.obtenerValorPropiedad("url.jasper") + dto.getCompanyName() + File.separator + "employee" +
                        File.separator + dto.getDocumento() + File.separator + dto.getDocumento() + ".jrxml");
                rutaArchivo = rutaArchivo + dto.getCompanyName() + File.separator + "employee" + File.separator + dto.getDocumento() + File.separator + reportName;
                break;
            case "custodyPrint":
                reportName = dto.getId() + ".pdf";
                report = JasperCompileManager.compileReportToFile(applicationBean.obtenerValorPropiedad("url.jasper") + dto.getCompanyName() + File.separator + "employee" +
                        File.separator + dto.getDocumento() + File.separator + dto.getDocumento() + ".jrxml");
                rutaArchivo = rutaArchivo + dto.getCompanyName() + File.separator + "employee" + File.separator + dto.getDocumento() + File.separator + reportName;
                break;
            case "assetRegister":
                reportName = dto.getFiltro() + ".pdf";
                report = JasperCompileManager.compileReportToFile(applicationBean.obtenerValorPropiedad("url.jasper") + dto.getCompanyName() + File.separator + "employee" +
                        File.separator + dto.getDocumento() + File.separator + dto.getDocumento() + ".jrxml");
                rutaArchivo = rutaArchivo + dto.getCompanyName() + File.separator + "employee" + File.separator + dto.getDocumento() + File.separator + reportName;
                break;
            default:
                reportName = "";
                break;
        }

        //Se crea la coneccion con la base de datos
        String cn = null;
        InitialContext initialContext = new InitialContext();
        //Origen: S=SAP W=WALI N=NOMINA
        if (dto.getOrigen().equals("S")) {
            switch (dto.getCompanyName()) {
                case "IGB":
                    cn = "java:/HANAIGBDS";
                    break;
                case "VARROC":
                    cn = "java:/HANAVARROCDS";
                    break;
                case "REDPLAS":
                    cn = "java:/HANAREDPLASDS";
                    break;
                case "VELEZ":
                    cn = "java:/HANAVELEZDS";
                    break;
                case "IGBPruebas":
                    cn = "java:/HANAIGBTESTDS";
                    break;
                case "VARROCPruebas":
                    cn = "java:/HANAVARROCTESTDS";
                    break;
                case "REDPLASPruebas":
                    cn = "java:/HANAREDPLASTESTDS";
                    break;
                default:
                    cn = "";
                    break;
            }
        } else if (dto.getOrigen().equals("N")) {
            switch (dto.getCompanyName()) {
                case "IGB_NOVAWEB":
                    cn = "java:/IGBNOVAWEBNUBEDS";
                    break;
                case "MTZ_NOVAWEB":
                    cn = "java:/MTZNOVAWEBNUBEDS";
                    break;
                case "VILNA_NOVAWEB":
                    cn = "java:/VILNOVAWEBNUBEDS";
                    break;
                case "WALI_NOVAWEB":
                    cn = "java:/WALNOVAWEBNUBEDS";
                    break;
                case "DSM_NOVAWEB":
                    cn = "java:/DIGNOVAWEBNUBEDS";
                    break;
                case "INVERSUR_NOVAWEB":
                    cn = "java:/INVNOVAWEBNUBEDS";
                    break;
                case "MOTOREPUESTOS_NOVAWEB":
                    cn = "java:/MOTNOVAWEBNUBEDS";
                    break;
                default:
                    cn = "";
                    break;
            }
        } else if (dto.getOrigen().equals("W")) {
            cn = "java:/WMSDS";
        } else {
            cn = "java:/MySQLDS";
        }
        DataSource dataSource = (DataSource) initialContext.lookup(cn);
        Connection connection = dataSource.getConnection();

        //Se mandan los parametros al Jasper
        Map<String, Object> mapa = new HashMap<>();
        if (dto.getDocumento().equals("paystub")) {
            mapa.put("id", dto.getId());
            mapa.put("year", dto.getYear());
            mapa.put("month", dto.getMonth());
            mapa.put("day", dto.getDay());
        } else if (dto.getDocumento().equals("jobCertify")) {
            mapa.put("id", dto.getId());
            mapa.put("year", dto.getYear());
            mapa.put("month", dto.getMonth());
            mapa.put("day", dto.getDay());
            mapa.put("sendto", dto.getFiltro());
        } else if (dto.getDocumento().equals("assetRegister")) {
            mapa.put("filtro", dto.getFiltro());
            mapa.put("filtroSec", dto.getFiltroSec());
            mapa.put("comments", dto.getComments());
        } else {
            if (dto.getId() != 0) {
                mapa.put("id", dto.getId());
            } else if (dto.getFiltro() != null) {
                mapa.put("filtro", dto.getFiltro());
            }
        }
        generarInforme(report, rutaArchivo, dto, mapa, connection, dto.getCompanyName(), whsCode);
        connection.close();
        return new ResponseDTO(0, rutaArchivo);
    }

    private void generarInforme(String report, String rutaArchivo, PrintReportDTO dto, Map<String, Object> mapa, Connection connection, String companyName, String whsCode) throws JRException, IOException, PrinterException {
        JasperPrint jasperPrint = JasperFillManager.fillReport(report, mapa, connection);
        JasperExportManager.exportReportToPdfFile(jasperPrint, rutaArchivo);
        PDDocument document = PDDocument.load(new File(rutaArchivo));
        CONSOLE.log(Level.INFO, "Se guardo el documento {0} numero {1}", new Object[]{dto.getDocumento(), dto.getId()});

        //Configurar para imprimir automaticamente
        if (dto.isImprimir()) {
            /*Impresora String printer = "RICOH Aficio MP 2851 PCL 5e"; /*impresoraFacade.obtenerImpresoraSucursal(dto.getSucursal(), "DOC");
            if (printer != null && printer.getIdImpresora() != null && printer.getIdImpresora() != 0) {*/

            PrintService myPrintService = null;
            if (companyName.contains("IGB") || companyName.contains("VELEZ")) {
                myPrintService = findPrintService(/*"KyoceraFacturacion"*/"KyoceraCediP3055"/*printer.getNombreImpresoraServidor()*/);
            } else if (companyName.contains("VARROC") && whsCode.equals("32")) {
                myPrintService = findPrintService("KyoceraCediP3045");
            }

            PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
            pras.add(Sides.DUPLEX);
            pras.add(OrientationRequested.PORTRAIT);

            PrinterJob printerJob = PrinterJob.getPrinterJob();

            if (myPrintService != null) {
                CONSOLE.log(Level.INFO, "Impresora seleccionada: {0}", myPrintService.getName());
                printerJob.setPageable(new PDFPageable(document));
                printerJob.setPrintService(myPrintService);
                printerJob.print(pras);
                CONSOLE.log(Level.INFO, "Se mando a imprimir el documento {0} numero {2} a la impresora {1}",
                        new Object[]{dto.getDocumento(), myPrintService.getName(), dto.getId()});
            }
            //}
        }
        document.close();
    }

    private static PrintService findPrintService(String printerName) {
        PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);
        for (PrintService printService : printServices) {
            if (printService.getName().trim().equals(printerName)) {
                return printService;
            }
        }
        return null;
    }

    private boolean validateMultiPicking(String orders, String companyName) {
        HashSet<String> clients = new HashSet<>();
        if (orders != null && orders.contains(",")) {
            for (String order : orders.split(",")) {
                clients.add(salesOrderFacade.getCardCode(order, companyName));
            }
        }
        if (clients.size() <= 1) {
            return true;
        } else {
            return false;
        }
    }

    private String convertNameMonth(String month) {
        switch (month) {
            case "Enero":
                return "JANUARY";
            case "Febrero":
                return "FEBRUARY";
            case "Marzo":
                return "MARCH";
            case "Abril":
                return "APRIL";
            case "Mayo":
                return "MAY";
            case "Junio":
                return "JUNE";
            case "Julio":
                return "JULY";
            case "Agosto":
                return "AUGUST";
            case "Septiembre":
                return "SEPTEMBER";
            case "Octubre":
                return "OCTOBER";
            case "Noviembre":
                return "NOVEMBER";
            case "Diciembre":
                return "DECEMBER";
        }
        return "";
    }
}