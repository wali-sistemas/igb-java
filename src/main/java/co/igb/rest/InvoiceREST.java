package co.igb.rest;

import co.igb.b1ws.client.invoice.Add;
import co.igb.b1ws.client.invoice.AddResponse;
import co.igb.b1ws.client.invoice.Document;
import co.igb.b1ws.client.invoice.Document.DocumentLines;
import co.igb.b1ws.client.invoice.Document.DocumentLines.DocumentLine;
import co.igb.b1ws.client.invoice.InvoicesService;
import co.igb.b1ws.client.invoice.MsgHeader;
import co.igb.ejb.IGBApplicationBean;
import co.igb.persistence.facade.CustomerFacade;
import co.igb.persistence.facade.DeliveryNoteFacade;
import co.igb.util.IGBUtils;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
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
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * @author dbotero
 */
@Stateless
@Path("invoice")
public class InvoiceREST implements Serializable {

    private static final Logger CONSOLE = Logger.getLogger(InvoiceREST.class.getSimpleName());

    @EJB
    private DeliveryNoteFacade dnFacade;
    @EJB
    private CustomerFacade customerFacade;
    @EJB
    private BasicSAPFunctions sapFunctions;
    @Inject
    private IGBApplicationBean appBean;

    @POST
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response createInvoiceDocument(Integer deliveryDocEntry, @HeaderParam("X-Company-Name") String companyName, @HeaderParam("X-Employee") String userName) {
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        CONSOLE.log(Level.INFO, "Creando factura para deliveryNoteDocEntry={0}", deliveryDocEntry);

        ResponseDTO responseInvoice = null;
        String documentType = IGBUtils.getProperParameter(appBean.obtenerValorPropiedad("igb.invoice.type"), companyName);
        CONSOLE.log(Level.INFO, "La empresa {0} usa el tipo de document {1}", new Object[]{companyName, documentType});
        if (documentType.equals("invoice")) {
            responseInvoice = (ResponseDTO) createInvoice(deliveryDocEntry, companyName, userName).getEntity();
        } else {
            responseInvoice = (ResponseDTO) createDraft(deliveryDocEntry, companyName, userName).getEntity();
        }
        return Response.ok(responseInvoice).build();
    }

    @POST
    @Path("draft")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response createDraft(Integer deliveryDocEntry, @HeaderParam("X-Company-Name") String companyName, @HeaderParam("X-Employee") String userName) {
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        CONSOLE.log(Level.INFO, "Creando borrador de factura para deliveryNoteDocEntry={0}", deliveryDocEntry);
        //Consultar entrega
        List<Object[]> deliveryData = dnFacade.getDeliveryNoteData(deliveryDocEntry, companyName);
        if (deliveryData.isEmpty()) {
            return Response.ok(new ResponseDTO(-1, "No se encontraron datos de entrega para facturar")).build();
        }
        //Crear borrador de factura a partir de la entrega

        co.igb.b1ws.client.drafts.Document.DocumentLines lines = new co.igb.b1ws.client.drafts.Document.DocumentLines();
        co.igb.b1ws.client.drafts.Document invoice = new co.igb.b1ws.client.drafts.Document();
        long lineNum = 0;
        for (Object[] row : deliveryData) {
            Long delDocEntry = ((Integer) row[0]).longValue();
            Long deliveryDocNum = ((Integer) row[1]).longValue();
            Long deliveryObjectType = ((Integer) row[2]).longValue();
            String cardCode = (String) row[3];
            Long deliverySalesPersonCode = ((Integer) row[4]).longValue();
            Long deliveryContactCode = ((Integer) row[5]).longValue();
            Long deliveryLineNum = ((Integer) row[6]).longValue();
            String deliveryItemCode = (String) row[7];
            Integer deliveryQuantity = (Integer) row[8];

            if (invoice.getSeries() == null) {
                invoice.setSeries(Long.parseLong(getPropertyValue("igb.invoice.series", companyName)));
                invoice.setCardCode(cardCode);
                invoice.setDocType("dDocument_Items");
                invoice.setDocObjectCode("13");

                try {
                    GregorianCalendar date = new GregorianCalendar();
                    XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(date);
                    invoice.setDocDate(date2);
                } catch (Exception e) {
                }

                try {
                    GregorianCalendar date = new GregorianCalendar();
                    date.add(Calendar.DATE, customerFacade.getCustomerCreditDays(cardCode, companyName));
                    invoice.setDocDueDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(date));
                } catch (Exception e) {
                }

                invoice.setContactPersonCode(deliveryContactCode);
                invoice.setComments("Creado automaticamente desde WALI por " + userName);
                invoice.setSalesPersonCode(deliverySalesPersonCode);

            }

            co.igb.b1ws.client.drafts.Document.DocumentLines.DocumentLine line = new co.igb.b1ws.client.drafts.Document.DocumentLines.DocumentLine();
            line.setBaseEntry(delDocEntry);
            line.setBaseLine(deliveryLineNum);
            line.setBaseType(deliveryObjectType);
            line.setItemCode(deliveryItemCode);
            line.setQuantity(deliveryQuantity.doubleValue());
            line.setLineNum(lineNum++);

            lines.getDocumentLine().add(line);
        }

        invoice.setDocumentLines(lines);

        //1. Login
        String sessionId = null;
        try {
            sessionId = sapFunctions.login(companyName);
            CONSOLE.log(Level.INFO, "Se inicio sesion en DI Server satisfactoriamente. SessionID={0}", sessionId);
        } catch (Exception e) {
            return Response.ok(new ResponseDTO(-1, "Ocurrio un error al iniciar sesion en SAP. " + e.getMessage())).build();
        }
        //2. Registrar documento
        Long docEntry = -1L;
        String errorMessage = null;
        if (sessionId != null) {
            try {
                docEntry = createDraft(invoice, sessionId);
                CONSOLE.log(Level.INFO, "Se creo el borrador de factura con docEntry={0}", docEntry);
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
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new ResponseDTO(-1, "Ocurrio un error al crear la factura. " + errorMessage)).build();
        }
    }

    @POST
    @Path("invoice")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response createInvoice(Integer deliveryDocEntry, @HeaderParam("X-Company-Name") String companyName, @HeaderParam("X-Employee") String userName) {
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        CONSOLE.log(Level.INFO, "Creando factura para deliveryNoteDocEntry={0}", deliveryDocEntry);
        //Consultar entrega
        List<Object[]> deliveryData = dnFacade.getDeliveryNoteData(deliveryDocEntry, companyName);
        if (deliveryData.isEmpty()) {
            return Response.ok(new ResponseDTO(-1, "No se encontraron datos de entrega para facturar")).build();
        }
        //Crear factura a partir de la entrega
        DocumentLines lines = new DocumentLines();
        Document invoice = new Document();
        long lineNum = 0;
        for (Object[] row : deliveryData) {
            Long delDocEntry = (Long) row[0];
            Long deliveryDocNum = (Long) row[1];
            Long deliveryObjectType = (Long) row[2];
            String cardCode = (String) row[3];
            Long deliverySalesPersonCode = (Long) row[4];
            Long deliveryContactCode = (Long) row[5];
            Long deliveryLineNum = (Long) row[6];
            String deliveryItemCode = (String) row[7];
            Integer deliveryQuantity = (Integer) row[8];

            if (invoice.getSeries() == null) {
                invoice.setSeries(Long.parseLong(getPropertyValue("igb.invoice.series", companyName)));
                invoice.setCardCode(cardCode);

                try {
                    GregorianCalendar date = new GregorianCalendar();
                    XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(date);
                    invoice.setDocDate(date2);
                } catch (Exception e) {
                }

                try {
                    GregorianCalendar date = new GregorianCalendar();
                    date.add(Calendar.DATE, customerFacade.getCustomerCreditDays(cardCode, companyName));
                    invoice.setDocDueDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(date));
                } catch (Exception e) {
                }

                invoice.setContactPersonCode(deliveryContactCode);
                invoice.setComments("Creado automaticamente desde WALI por " + userName);
                invoice.setSalesPersonCode(deliverySalesPersonCode);

            }

            DocumentLine line = new DocumentLine();
            line.setBaseEntry(delDocEntry);
            line.setBaseLine(deliveryLineNum);
            line.setBaseType(deliveryObjectType);
            line.setItemCode(deliveryItemCode);
            line.setQuantity(deliveryQuantity.doubleValue());
            line.setLineNum(lineNum++);

            lines.getDocumentLine().add(line);
        }

        invoice.setDocumentLines(lines);

        //1. Login
        String sessionId = null;
        try {
            sessionId = sapFunctions.login(companyName);
            CONSOLE.log(Level.INFO, "Se inicio sesion en DI Server satisfactoriamente. SessionID={0}", sessionId);
        } catch (Exception e) {
            return Response.ok(new ResponseDTO(-1, "Ocurrio un error al iniciar sesion en SAP. " + e.getMessage())).build();
        }
        //2. Registrar documento
        Long docEntry = -1L;
        String errorMessage = null;
        if (sessionId != null) {
            try {
                docEntry = createInvoice(invoice, sessionId);
                CONSOLE.log(Level.INFO, "Se creo la factura con docEntry={0}", docEntry);
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
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new ResponseDTO(-1, "Ocurrio un error al crear la factura. " + errorMessage)).build();
        }
    }

    private Long createDraft(co.igb.b1ws.client.drafts.Document document, String sessionId) throws MalformedURLException {
        co.igb.b1ws.client.drafts.DraftsService service = new co.igb.b1ws.client.drafts.DraftsService(new URL(String.format(appBean.obtenerValorPropiedad("igb.b1ws.wsdlUrl"), "DraftsService")));
        co.igb.b1ws.client.drafts.Add add = new co.igb.b1ws.client.drafts.Add();
        add.setDocument(document);

        co.igb.b1ws.client.drafts.MsgHeader header = new co.igb.b1ws.client.drafts.MsgHeader();
        header.setServiceName("DraftsService");
        header.setSessionID(sessionId);
        co.igb.b1ws.client.drafts.AddResponse response = service.getDraftsServiceSoap12().add(add, header);
        return response.getDocumentParams().getDocEntry();
    }

    private Long createInvoice(Document document, String sessionId) throws MalformedURLException {
        InvoicesService service = new InvoicesService(new URL(String.format(appBean.obtenerValorPropiedad("igb.b1ws.wsdlUrl"), "InvoicesService")));
        Add add = new Add();
        add.setDocument(document);

        MsgHeader header = new MsgHeader();
        header.setServiceName("InvoicesService");
        header.setSessionID(sessionId);
        AddResponse response = service.getInvoicesServiceSoap12().add(add, header);
        return response.getDocumentParams().getDocEntry();
    }

    private String getPropertyValue(String propertyName, String companyName) {
        return IGBUtils.getProperParameter(appBean.obtenerValorPropiedad(propertyName), companyName);
    }
}
