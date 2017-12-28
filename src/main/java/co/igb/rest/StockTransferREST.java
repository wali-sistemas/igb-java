package co.igb.rest;

import co.igb.b1ws.client.stocktransfer.Add;
import co.igb.b1ws.client.stocktransfer.AddResponse;
import co.igb.b1ws.client.stocktransfer.MsgHeader;
import co.igb.b1ws.client.stocktransfer.StockTransfer;
import co.igb.b1ws.client.stocktransfer.StockTransferService;
import co.igb.dto.SingleItemTransferDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.persistence.entity.PickingRecord;
import co.igb.persistence.facade.PickingRecordFacade;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author dbotero
 */
@Stateless
@Path("stocktransfer")
public class StockTransferREST implements Serializable {

    private static final Logger CONSOLE = Logger.getLogger(StockTransferREST.class.getSimpleName());

    @EJB
    private BasicSAPFunctions sapFunctions;
    @EJB
    private PickingRecordFacade pickingRecordFacade;
    @Inject
    private IGBApplicationBean appBean;

    public StockTransferREST() {
    }

    @POST
    @Path("picking")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response createPickingTransferDocument(SingleItemTransferDTO itemTransfer, @HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        CONSOLE.log(Level.INFO, "Trasladando item a carrito de picking {0}", itemTransfer);

        //Validates received data
        if (itemTransfer == null) {
            return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-1, "No se recibió información para la transferencia")).build();
        } else if (itemTransfer.getBinAbsFrom() == null || itemTransfer.getBinAbsFrom() < 0) {
            return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-1, "La ubicación de origen no es válida")).build();
        } else if (itemTransfer.getBinAbsTo() == null || itemTransfer.getBinAbsTo() < 0) {
            return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-1, "La ubicación de destino no es válida")).build();
        } else if (itemTransfer.getItemCode() == null || itemTransfer.getItemCode().trim().isEmpty()) {
            return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-1, "La referencia no es válida")).build();
        } else if (itemTransfer.getOrderNumber() == null || itemTransfer.getOrderNumber() < 0) {
            return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-1, "El número de la órden no es válido")).build();
        } else if (itemTransfer.getQuantity() == null || itemTransfer.getQuantity() < 0) {
            return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-1, "La cantidad no es válida")).build();
        } else if (itemTransfer.getUsername() == null || itemTransfer.getUsername().trim().isEmpty()) {
            return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-1, "No se recibió el usuario que realiza el picking")).build();
        } else if (itemTransfer.getWarehouseCode() == null || itemTransfer.getWarehouseCode().trim().isEmpty()) {
            return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-1, "No se recibió el código de la bodega")).build();
        }

        StockTransfer document = new StockTransfer();
        document.setSeries(24L); //TODO: parametrizar
        //document.setCardCode(itemTransfer.get);
        document.setToWarehouse(itemTransfer.getWarehouseCode());
        document.setFromWarehouse(itemTransfer.getWarehouseCode());
        document.setComments("Proceso de picking orden #" + itemTransfer.getOrderNumber());

        StockTransfer.StockTransferLines.StockTransferLine line = new StockTransfer.StockTransferLines.StockTransferLine();
        line.setLineNum(0L);
        line.setItemCode(itemTransfer.getItemCode());
        line.setQuantity(itemTransfer.getQuantity().doubleValue());
        line.setWarehouseCode(itemTransfer.getWarehouseCode());
        line.setFromWarehouseCode(itemTransfer.getWarehouseCode());

        StockTransfer.StockTransferLines.StockTransferLine.StockTransferLinesBinAllocations.StockTransferLinesBinAllocation outOperation = new StockTransfer.StockTransferLines.StockTransferLine.StockTransferLinesBinAllocations.StockTransferLinesBinAllocation();
        outOperation.setAllowNegativeQuantity("tNO");
        outOperation.setBaseLineNumber(0L);
        outOperation.setBinAbsEntry(itemTransfer.getBinAbsFrom());
        outOperation.setBinActionType("batFromWarehouse");
        outOperation.setQuantity(itemTransfer.getQuantity().doubleValue());

        StockTransfer.StockTransferLines.StockTransferLine.StockTransferLinesBinAllocations.StockTransferLinesBinAllocation inOperation = new StockTransfer.StockTransferLines.StockTransferLine.StockTransferLinesBinAllocations.StockTransferLinesBinAllocation();
        inOperation.setAllowNegativeQuantity("tNO");
        inOperation.setBaseLineNumber(0L);
        inOperation.setBinAbsEntry(itemTransfer.getBinAbsTo());
        inOperation.setBinActionType("batToWarehouse");
        inOperation.setQuantity(itemTransfer.getQuantity().doubleValue());

        StockTransfer.StockTransferLines.StockTransferLine.StockTransferLinesBinAllocations binAllocations = new StockTransfer.StockTransferLines.StockTransferLine.StockTransferLinesBinAllocations();
        binAllocations.getStockTransferLinesBinAllocation().add(inOperation);
        binAllocations.getStockTransferLinesBinAllocation().add(outOperation);

        line.setStockTransferLinesBinAllocations(binAllocations);
        StockTransfer.StockTransferLines documentLines = new StockTransfer.StockTransferLines();
        documentLines.getStockTransferLine().add(line);
        document.setStockTransferLines(documentLines);

        //1. Login
        String sessionId = null;
        try {
            sessionId = sapFunctions.login();
            CONSOLE.log(Level.INFO, "Se inicio sesion en DI Server satisfactoriamente. SessionID={0}", sessionId);
        } catch (Exception e) {
        }
        //2. Registrar documento
        Long docEntry = -1L;
        String errorMessage = null;
        if (sessionId != null) {
            try {
                docEntry = createTransferDocument(document, sessionId);
                CONSOLE.log(Level.INFO, "Se creo la transferencia docEntry={0}", docEntry);
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al crear el documento. ", e);
                errorMessage = e.getMessage();
            }
        }
        //3. Logout
        if (sessionId != null) {
            sapFunctions.logout(sessionId);
        }
        //4. Validar y retornar
        if (docEntry > 0) {
            try {
                PickingRecord pickingRecord = new PickingRecord();
                pickingRecord.setBinFrom(itemTransfer.getBinAbsFrom());
                pickingRecord.setBinTo(itemTransfer.getBinAbsTo());
                pickingRecord.setEmpId(itemTransfer.getUsername());
                pickingRecord.setItemCode(itemTransfer.getItemCode());
                pickingRecord.setOrderNumber(itemTransfer.getOrderNumber().longValue());
                pickingRecord.setQuantity(itemTransfer.getQuantity().longValue());
                pickingRecord.setStockTransferDocEntry(docEntry);
                pickingRecord.setTransactionDate(new Date());
                pickingRecordFacade.create(pickingRecord);
                return Response.ok(new ResponseDTO(0, pickingRecord)).build();
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "There was an error recording the operation to the MySQL database. ", e);
                return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new ResponseDTO(-1, "Ocurrió un error al procesar la solicitud. Valida si el traslado se realizó correctamente en SAP y reinicia sesión en Wali")).build();
            }
        } else {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new ResponseDTO(-1, "Ocurrio un error al crear la transferencia. " + errorMessage)).build();
        }
    }

    private Long createTransferDocument(StockTransfer document, String sessionId) throws MalformedURLException {
        StockTransferService service = new StockTransferService(new URL(String.format(appBean.obtenerValorPropiedad("igb.b1ws.wsdlUrl"), "StockTransferService")));
        Add add = new Add();
        add.setStockTransfer(document);

        MsgHeader header = new MsgHeader();
        header.setServiceName("StockTransferService");
        header.setSessionID(sessionId);
        AddResponse response = service.getStockTransferServiceSoap12().add(add, header);
        return response.getStockTransferParams().getDocEntry();
    }
}
