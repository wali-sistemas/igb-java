package co.igb.rest;

import co.igb.b1ws.client.purchasedeliverynote.Add;
import co.igb.b1ws.client.purchasedeliverynote.AddResponse;
import co.igb.b1ws.client.purchasedeliverynote.Document;
import co.igb.b1ws.client.purchasedeliverynote.PurchaseDeliveryNotesService;
import co.igb.dto.PurchaseOrderDTO;
import co.igb.dto.PurchaseOrderLineDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.persistence.facade.PurchaseOrderFacade;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author dbotero
 */
@Stateless
@Path("reception")
public class ReceptionREST implements Serializable {

    private static final Logger CONSOLE = Logger.getLogger(ReceptionREST.class.getSimpleName());
    @EJB
    private PurchaseOrderFacade poFacade;
    @EJB
    private BasicSAPFunctions sapFunctions;
    @Inject
    private IGBApplicationBean appBean;

    @GET
    @Path("list/orders")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    public Response listOpenOrders(@HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "Consultando ordenes abiertas");
        try {
            return Response.ok(poFacade.findOpenOrders(companyName)).build();
        } catch (Exception e) {
            return Response.serverError().build();
        }
    }

    @GET
    @Path("load/order/{docNum}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    public Response loadOrder(@PathParam("docNum") String docNum, @HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "Consultando orden #{0}", docNum);
        return Response.ok(poFacade.find(docNum, companyName)).build();
    }

    @POST
    @Path("receive-items")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    public Response receiveAndClose(PurchaseOrderDTO order, @HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        CONSOLE.log(Level.INFO, "Generando entrada de mercancia con los siguientes datos {0}", order);
        Document document = new Document();
        document.setCardCode(order.getCardCode());
        document.setSeries(14L); //TODO: parametrizar serie de numeracion por empresa
        document.setDocCurrency("USD");
        document.setDocRate(order.getDocRate());
        document.setSalesPersonCode(order.getSalesPersonCode());
        document.setComments(order.getComments());
        document.setFederalTaxID(order.getCardCode().substring(1));
        document.setDocDate(dateToXML(new Date()));
        document.setDocDueDate(dateToXML(new Date()));

        document.setUTRANSP(order.getUtransp());
        document.setUDESP(order.getUdesp());
        document.setUFEMBARQUE(dateToXML(order.getUfembarque()));
        document.setUTERMNEG(order.getUtermneg());
        document.setUMODTRANSP(order.getUmodtransp());
        document.setUPUERTODES(order.getUpuertodes());
        document.setUMODIMP(order.getUmodimp());
        document.setUESTADOOC(order.getUestadooc());
        document.setUFPROFORMA(dateToXML(order.getUfproforma()));
        document.setUEMBARCADO(order.getUembarcado());
        document.setUAGENTEADU(order.getUagenteadu());
        document.setUDOCTRANSP(order.getUdoctransp());
        document.setUFDOCTRANSP(dateToXML(order.getUfdoctransp()));
        document.setUFARRIBALMA(dateToXML(order.getUfarribalma()));
        document.setUFARRIBPUERTO(dateToXML(order.getUfarribpuerto()));
        document.setUREQANT(order.getUreqant());
        document.setUANTREALIZ(order.getUantrealiz());
        document.setUTOTCAJ(order.getUtotcaj());
        document.setUTOTBUL(order.getUtotbul());
        document.setUVLRFLE(order.getUvlrfle());
        document.setUVLRSEG(order.getUvlrseg());
        document.setUTOTFLE(order.getUtotfle());
        document.setUPESOBRUTO(order.getUpesobruto());
        document.setUAUTPRECIO(order.getUautprecio());
        document.setUIVCDone(order.getUivcDone());
        document.setUOK1IVAPA(order.getUok1IVAPA());
        document.setUMOTDEVOL(order.getUmotdevol());
        document.setUANTCANCELADO(order.getUantcancelado());
        document.setUIMPCANCELADO(order.getUimpcancelado());
        document.setUTIPOEMPAQUE(order.getUtipoempaque());
        document.setUVRANTICIPO(order.getUvranticipo());
        document.setUVRTOTAL(order.getUvrtotal());
        document.setUVRIMPUESTO(order.getUvrimpuesto());
        document.setUVRDECLARADO(order.getUvrdeclarado());
        document.setUPUERTOEMB(order.getUpuertoemb());
        document.setUTRANSPTERR(order.getUtranspterr());
        document.setUALMACDES(order.getUalmacdes());
        document.setUBPVNIMP(order.getUbpvnimp());
        document.setUESTADOPED(order.getUestadoped());
        document.setUAutorret(order.getuAutorret());
        document.setURetefue(order.getuRetefue());
        document.setUReteIca(order.getuReteIca());
        document.setUTypeExped(order.getuTypeExped());
        document.setUALIST(order.getUalist());
        document.setUOK1IFRS(order.getUok1IFRS());
        document.setUTOTFLECLIE(order.getUtotfleclie());
        document.setUSHIPPING(order.getUshipping());
        document.setUEsIndep(order.getuEsIndep());

        Document.DocumentLines docLines = new Document.DocumentLines();
        long lineNum = 1;
        for (PurchaseOrderLineDTO lineDto : order.getLines()) {
            Document.DocumentLines.DocumentLine line = new Document.DocumentLines.DocumentLine();
            line.setAccountCode("14350505");
            line.setBaseEntry(order.getDocEntry());
            line.setBaseLine(lineDto.getDocLine());
            line.setBaseType(22L);
            //line.setCurrency(value);
            line.setItemCode(lineDto.getItemCode());
            line.setLineNum(lineNum++);
            line.setQuantity(lineDto.getQuantity().doubleValue());
            //line.setUBANCO(null);
            //line.setUBLDLyID(null);
            //line.setUBLDNCps(null);
            //TODO: confirmar si la cuenta es la 14350505
            docLines.getDocumentLine().add(line);
        }
        document.setDocumentLines(docLines);

        //1. Login
        String sessionId = null;
        try {
            sessionId = sapFunctions.login(companyName);
            CONSOLE.log(Level.INFO, "Se inicio sesion en DI Server satisfactoriamente. SessionID={0}", sessionId);
        } catch (Exception e) {
        }
        //2. Registrar documento
        Long docEntry = -1L;
        String errorMessage = null;
        if (sessionId != null) {
            try {
                docEntry = createPurchaseDeliveryNote(document, sessionId);
                CONSOLE.log(Level.INFO, "Se creo la entrada por compra con docEntry={0}", docEntry);
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al crear el documento. ", e);
                errorMessage = e.getMessage();
            }
        }
        //3. Logout
        if (sessionId != null) {
            sapFunctions.logout(sessionId);
        }
        if (docEntry > 0) {
            return Response.ok(new ResponseDTO(0, docEntry)).build();
        } else {
            return Response.ok(new ResponseDTO(-1, "Ocurrio un error al crear la entrada. " + errorMessage)).build();
        }
    }

    private Long createPurchaseDeliveryNote(Document document, String sessionId) throws MalformedURLException {
        PurchaseDeliveryNotesService service = new PurchaseDeliveryNotesService(new URL(String.format(appBean.obtenerValorPropiedad("igb.b1ws.wsdlUrl"), "PurchaseDeliveryNotesService")));
        Add add = new Add();
        add.setDocument(document);

        co.igb.b1ws.client.purchasedeliverynote.MsgHeader header = new co.igb.b1ws.client.purchasedeliverynote.MsgHeader();
        header.setServiceName("PurchaseDeliveryNotesService");
        header.setSessionID(sessionId);
        AddResponse response = service.getPurchaseDeliveryNotesServiceSoap12().add(add, header);
        return response.getDocumentParams().getDocEntry();

    }

    private XMLGregorianCalendar dateToXML(Date date) {
        try {
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
        } catch (Exception e) {
        }
        return null;
    }
}
