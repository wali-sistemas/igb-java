package co.igb.rest;

import co.igb.dto.PrintReportDTO;
import co.igb.dto.ResponseDTO;
import co.igb.dto.SalesOrderDTO;
import co.igb.dto.UserDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.ejb.IGBAuthLDAP;
import co.igb.persistence.entity.AssignedOrder;
import co.igb.persistence.entity.PickingRecord;
import co.igb.persistence.entity.ReportPickingProgress;
import co.igb.persistence.facade.AssignedOrderFacade;
import co.igb.persistence.facade.PickingRecordFacade;
import co.igb.persistence.facade.ReportPickingProgressFacade;
import co.igb.persistence.facade.SalesOrderFacade;
import co.igb.util.Constants;
import net.sf.jasperreports.engine.*;
import org.apache.pdfbox.pdmodel.PDDocument;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author YEIJARA
 */
@Stateless
@Path("report")
public class ReportREST implements Serializable {

    @Inject
    private IGBApplicationBean applicationBean;
    private static final Logger CONSOLE = Logger.getLogger(ReportREST.class.getSimpleName());
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

    @GET
    @Path("reports-orders")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response obtainReportsOrders(@HeaderParam("X-Company-Name") String companyName,
                                        @HeaderParam("X-Warehouse-Code") String warehouseCode,
                                        @HeaderParam("X-Pruebas") boolean pruebas) {
        List<SalesOrderDTO> orders = salesOrderFacade.findOpenOrders(false, false, companyName, pruebas, warehouseCode);
        List<AssignedOrder> assigned = assignedOrderFacade.listOpenAssignations(companyName, pruebas);

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
    @Path("reports-employee-assigned")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response obtainReportsEmployeeAssigned(@HeaderParam("X-Company-Name") String companyName,
                                                  @HeaderParam("X-Pruebas") boolean pruebas) {
        List<UserDTO> users = authenticator.listEmployeesInGroup(applicationBean.obtenerValorPropiedad("igb.employee.group"));

        if (users != null && !users.isEmpty()) {
            for (UserDTO u : users) {
                u.setOrdenesAsignadas(assignedOrderFacade.countOrderEmployeeAssigneed(u.getUsername(), companyName, pruebas));
            }
        }

        return Response.ok(new ResponseDTO(0, users)).build();
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

    @POST
    @Path("generate-report/")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public ResponseDTO generateReport(PrintReportDTO dto) throws Exception {
        String reportName = null;
        String report = null;
        String rutaArchivo = "";

        switch (dto.getDocumento()) {
            case "delivery":
                rutaArchivo = applicationBean.obtenerValorPropiedad("url.archivo");
                reportName = dto.getId() + ".pdf";
                report = JasperCompileManager.compileReportToFile(applicationBean.obtenerValorPropiedad("url.jasper") + dto.getCompanyName() + File.separator + dto.getDocumento()
                        + File.separator + dto.getDocumento() + ".jrxml");
                rutaArchivo = rutaArchivo + dto.getCompanyName() + File.separator + dto.getDocumento() + File.separator + reportName;
                break;
            case "packingList":
                rutaArchivo = applicationBean.obtenerValorPropiedad("url.archivo");
                reportName = dto.getId() + ".pdf";
                report = JasperCompileManager.compileReportToFile(applicationBean.obtenerValorPropiedad("url.jasper") + dto.getCompanyName() + File.separator + dto.getDocumento()
                        + File.separator + dto.getDocumento() + ".jrxml");
                rutaArchivo = rutaArchivo + dto.getCompanyName() + File.separator + dto.getDocumento() + File.separator + reportName;
                break;
            case "checkOut":
                rutaArchivo = applicationBean.obtenerValorPropiedad("url.archivo");
                reportName = dto.getId() + ".pdf";
                report = JasperCompileManager.compileReportToFile(applicationBean.obtenerValorPropiedad("url.jasper") + dto.getCompanyName() + File.separator + dto.getDocumento()
                        + File.separator + dto.getDocumento() + ".jrxml");
                rutaArchivo = rutaArchivo + dto.getCompanyName() + File.separator + dto.getDocumento() + File.separator + reportName;
                break;
            default:
                reportName = "";
                break;
        }

        //TODO: Se crea la coneccion con la base de datos
        String cn = null;
        InitialContext initialContext = new InitialContext();
        if (dto.getOrigen().equals("S")) {
            if (dto.getCompanyName().equals("IGB")) {
                cn = "java:/IGBDS";
            } else {
                cn = "java:/VARROCDS";
            }
        } else {
            cn = "java:/MySQLDS";
        }
        DataSource dataSource = (DataSource) initialContext.lookup(cn);
        Connection connection = dataSource.getConnection();

        //TODO: Se mandan los parametros al Jasper
        Map<String, Object> mapa = new HashMap<>();
        if (dto.getId() != 0) {
            mapa.put("id", dto.getId());
        }
        generarInforme(report, rutaArchivo, dto, mapa, connection);
        connection.close();
        return new ResponseDTO(0, rutaArchivo);
    }

    private void generarInforme(String report, String rutaArchivo, PrintReportDTO dto, Map<String, Object> mapa, Connection connection) throws JRException, IOException, PrinterException {
        JasperPrint jasperPrint = JasperFillManager.fillReport(report, mapa, connection);
        JasperExportManager.exportReportToPdfFile(jasperPrint, rutaArchivo);
        PDDocument document = PDDocument.load(new File(rutaArchivo));
        CONSOLE.log(Level.INFO, "Se guardo el documento {0} numero {1}", new Object[]{dto.getDocumento(), dto.getId()});

        //TODO: Configurar para imprimir automaticamente
        /*if (dto.isImprimir()) {
            Impresora printer = impresoraFacade.obtenerImpresoraSucursal(dto.getSucursal(), "DOC");

            if (printer != null && printer.getIdImpresora() != null && printer.getIdImpresora() != 0) {
            PrintService myPrintService = findPrintService("RICOH Aficio MP 2851 PCL 5e"/*printer.getNombreImpresoraServidor());

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
        }*/
        document.close();
    }

    /*private static PrintService findPrintService(String printerName) {
        PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);
        for (PrintService printService : printServices) {
            if (printService.getName().trim().equals(printerName)) {
                return printService;
            }
        }
        return null;
    }*/
}