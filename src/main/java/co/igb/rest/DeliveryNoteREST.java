package co.igb.rest;

import co.igb.b1ws.client.deliverynote.Add;
import co.igb.b1ws.client.deliverynote.AddResponse;
import co.igb.b1ws.client.deliverynote.DeliveryNotesService;
import co.igb.b1ws.client.deliverynote.Document;
import co.igb.b1ws.client.deliverynote.MsgHeader;
import co.igb.dto.DeliveryNoteDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.persistence.facade.SalesOrderFacade;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
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
@Path("deliverynote")
public class DeliveryNoteREST implements Serializable {

    private static final Logger CONSOLE = Logger.getLogger(DeliveryNoteREST.class.getSimpleName());

    @EJB
    private BasicSAPFunctions sapFunctions;
    @EJB
    private SalesOrderFacade salesOrderFacade;
    @Inject
    private IGBApplicationBean appBean;

    public DeliveryNoteREST() {
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response createDeliveryNoteDocument(DeliveryNoteDTO delivery, @HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        CONSOLE.log(Level.INFO, "Creando documento de entrega {0}", delivery);

        //Validates received data
        if (delivery == null) {
            return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-1, "No se recibió información para la entrega")).build();
        } else if (delivery.getCardCode() == null || delivery.getCardCode().trim().isEmpty()) {
            return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-1, "El ID del cliente no es válido (vacío)")).build();
        } else if (delivery.getLines() == null || delivery.getLines().isEmpty()) {
            return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-1, "No se recibieron items para entregar")).build();
        } else if (delivery.getOrderNumber() == null || delivery.getOrderNumber() <= 0) {
            return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-1, "El número de la órden no es válido")).build();
        }

        Document document = new Document();
        document.setSeries(8L); //TODO: parametrizar
        document.setCardCode(delivery.getCardCode());
        document.setComments("Proceso de packing orden #" + delivery.getOrderNumber());

        long lineNum = 0L;
        Document.DocumentLines documentLines = new Document.DocumentLines();
        for (DeliveryNoteDTO.DeliveryNoteLineDTO lineDto : delivery.getLines()) {
            if (lineDto.getItemCode() == null || lineDto.getItemCode().trim().isEmpty()) {
                return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-1, "La referencia del ítem en la linea " + lineNum++ + " no es válida")).build();
            } else if (lineDto.getQuantity() == null || lineDto.getQuantity() <= 0) {
                return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-1, "La cantidad del ítem en la linea " + lineNum++ + " no es válida")).build();
            } else if (lineDto.getWarehouseCode() == null || lineDto.getWarehouseCode().trim().isEmpty()) {
                return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-1, "El código de almacén del ítem en la linea " + lineNum++ + " no es válido")).build();
            } else if (lineDto.getBinAllocation() == null || lineDto.getBinAllocation().isEmpty()) {
                return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-1, "No se recibió información de ubicación para el ítem en la linea " + lineNum++)).build();
            }

            Integer orderDocEntry = salesOrderFacade.getOrderDocEntry(delivery.getOrderNumber(), companyName);
            if (orderDocEntry <= 0) {
                return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-1, "Ocurrió un error al consultar los datos de la orden. ")).build();
            }

            Document.DocumentLines.DocumentLine line = new Document.DocumentLines.DocumentLine();
            line.setLineNum(lineNum++);
            line.setItemCode(lineDto.getItemCode());
            line.setQuantity(lineDto.getQuantity().doubleValue());
            line.setWarehouseCode(lineDto.getWarehouseCode());
            line.setBaseEntry(orderDocEntry.longValue());
            line.setBaseType(17L); //TODO: parametrizar

            Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations binAllocations = new Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations();
            for (DeliveryNoteDTO.DeliveryNoteLineDTO.DeliveryNoteBinAllocationDTO locations : lineDto.getBinAllocation()) {
                if (locations.getBinAbs() == null || locations.getBinAbs() <= 0) {
                    return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-1, "La ubicación del ítem en la linea " + lineNum + " no es válida")).build();
                } else if (locations.getQuantity() == null || locations.getQuantity() <= 0) {
                    return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-1, "La cantidad en ubicación del ítem en la linea " + lineNum + " no es válida")).build();
                }

                Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation binAllocation
                        = new Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation();
                binAllocation.setAllowNegativeQuantity("tNO");
                binAllocation.setBaseLineNumber(line.getLineNum());
                binAllocation.setBinAbsEntry(locations.getBinAbs());
                binAllocation.setQuantity(locations.getQuantity().doubleValue());
                binAllocations.getDocumentLinesBinAllocation().add(binAllocation);
            }
            line.setDocumentLinesBinAllocations(binAllocations);
            documentLines.getDocumentLine().add(line);
        }
        document.setDocumentLines(documentLines);

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
                docEntry = createDeliveryNote(document, sessionId);
                CONSOLE.log(Level.INFO, "Se creo la entrega con docEntry={0}", docEntry);
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
            return Response.ok(new ResponseDTO(0, docEntry)).build();
        } else {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new ResponseDTO(-1, "Ocurrio un error al crear la entrega. " + errorMessage)).build();
        }
    }

    private Long createDeliveryNote(Document document, String sessionId) throws MalformedURLException {
        DeliveryNotesService service = new DeliveryNotesService(new URL(String.format(appBean.obtenerValorPropiedad("igb.b1ws.wsdlUrl"), "DeliveryNotesService")));
        Add add = new Add();
        add.setDocument(document);

        MsgHeader header = new MsgHeader();
        header.setServiceName("DeliveryNotesService");
        header.setSessionID(sessionId);
        AddResponse response = service.getDeliveryNotesServiceSoap12().add(add, header);
        return response.getDocumentParams().getDocEntry();
    }
}
