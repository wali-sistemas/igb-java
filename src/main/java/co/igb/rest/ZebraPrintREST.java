package co.igb.rest;

import co.igb.dto.ZebraPrintDTO;
import co.igb.persistence.facade.PackingListRecordFacade;
import co.igb.persistence.facade.PrinterFacade;
import co.igb.persistence.facade.SalesOrderFacade;
import co.igb.zebra.ZPLPrinter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author dbotero
 */
@Stateless
@Path("print")
public class ZebraPrintREST {

    private static final Logger CONSOLE = Logger.getLogger(ZebraPrintREST.class.getSimpleName());
    @EJB
    private PackingListRecordFacade plFacade;
    @EJB
    private SalesOrderFacade soFacade;
    @EJB
    private PrinterFacade prFacade;

    @POST
    @Path("packinglist/{printer}")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response printPackingList(Integer idPackingList, @PathParam("printer") String printerName, @HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "Imprimiendo etiquetas para packingList #{0}", idPackingList);

        PrintService printService = getPrintService(printerName);
        if (printService == null) {
            return Response.ok(new ResponseDTO(-1, "No se encontró la impresora [" + printerName + "] en el servidor.")).build();
        }

        String orderNumbers = plFacade.listOrderNumbers(idPackingList, companyName);
        if (orderNumbers == null || orderNumbers.trim().isEmpty()) {
            return Response.ok(new ResponseDTO(-1, "Ocurrió un error al consultar los datos para imprimir la etiqueta. (Order Numbers)")).build();
        }

        String numAtCards = soFacade.listNumAtCards(orderNumbers, companyName);
        if (numAtCards == null || numAtCards.trim().isEmpty()) {
            return Response.ok(new ResponseDTO(-1, "Ocurrió un error al consultar los datos para imprimir la etiqueta. (NumAtCard)")).build();
        }

        Object[] orderData = soFacade.retrieveStickerInfo(orderNumbers, companyName);
        if (orderData == null || orderData.length == 0) {
            return Response.ok(new ResponseDTO(-1, "Ocurrió un error al consultar los datos para imprimir la etiqueta. (Order Data)")).build();
        }

        boolean allSucceeded = true;
        Integer boxes = plFacade.obtainNumberOfBoxes(idPackingList, companyName);
        for (int i = 1; i <= boxes; i++) {
            ZebraPrintDTO label = new ZebraPrintDTO();
            label.setBoxNumber(i);
            label.setPackageTo((String) orderData[0]);
            label.setAddress((String) orderData[1]);
            label.setSalesOrderNumbers(orderNumbers);
            label.setCarrier((String) orderData[2]);
            label.setTotalBoxes(boxes);
            label.setNumAtCards(numAtCards);
            label.setPrinterName(printerName);

            DocPrintJob job = printService.createPrintJob();
            Doc doc = new SimpleDoc(ZPLPrinter.getPrintData(label, companyName), DocFlavor.BYTE_ARRAY.AUTOSENSE, null);
            try {
                job.print(doc, null);
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al imprimir. ", e);
                allSucceeded = false;
            }
        }
        return Response.ok(new ResponseDTO(0, allSucceeded)).build();
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response print(ZebraPrintDTO dto, @HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "Iniciando proceso de impresion {0}", dto);
        PrintService printService = getPrintService(dto.getPrinterName());
        if (printService == null) {
            return Response.ok(new ResponseDTO(-1, "No se encontró una impresora con nombre [" + dto.getPrinterName() + "] instalada en el servidor.")).build();
        }
        DocPrintJob job = printService.createPrintJob();
        Doc doc = new SimpleDoc(ZPLPrinter.getPrintData(dto, companyName), DocFlavor.BYTE_ARRAY.AUTOSENSE, null);
        try {
            job.print(doc, null);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al imprimir. ", e);
            return Response.ok(new ResponseDTO(-1, "Ocurrio un error al imprimir. " + e.getMessage())).build();
        }
        return Response.ok(new ResponseDTO(0, "Los datos se enviaron correctamente a la impresora")).build();
    }

    private PrintService getPrintService(String printerName) {
        PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
        if (services == null || services.length == 0) {
            return null;
        }
        for (PrintService ps : services) {
            if (ps.getName().equals(printerName)) {
                return ps;
            }
        }
        return null;
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response list() {
        CONSOLE.log(Level.INFO, "Listando impresoras zebra configuradas");
        List<String> printerNames = new ArrayList<>();
        PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
        if (services != null & services.length > 0) {
            for (PrintService ps : services) {
                if (ps.getName().toLowerCase().contains("zebra")) {
                    printerNames.add(ps.getName());
                }
            }
        }
        return Response.ok(printerNames).build();
    }

    @GET
    @Path("enabled")
    @Produces({MediaType.APPLICATION_JSON})
    public Response listAppPrinters() {
        CONSOLE.log(Level.INFO, "Listando impresoras habilitadas para web");
        try {
            return Response.ok(new ResponseDTO(0, prFacade.findAll())).build();
        } catch (Exception e) {
            return Response.ok(new ResponseDTO(-1, "Ocurrio un error al consultar las impresoras habilitadas para web. " + e.getMessage())).build();
        }
    }
}
