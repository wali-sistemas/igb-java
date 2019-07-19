package co.igb.rest;

import co.igb.b1ws.client.invoice.*;
import co.igb.dto.ResponseDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.persistence.facade.CustomerFacade;
import co.igb.persistence.facade.DeliveryNoteFacade;
import co.igb.persistence.facade.InvoiceFacade;
import co.igb.util.Constants;
import co.igb.util.IGBUtils;

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
import java.io.Serializable;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dbotero
 */
@Stateless
@Path("invoice")
public class InvoiceREST implements Serializable {

    private static final Logger CONSOLE = Logger.getLogger(InvoiceREST.class.getSimpleName());

    @EJB
    private InvoiceFacade invoiceFacade;
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
    public Response createInvoiceDocument(Integer deliveryDocEntry,
                                          @HeaderParam("X-Company-Name") String companyName,
                                          @HeaderParam("X-Employee") String userName,
                                          @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Creando factura para deliveryNoteDocEntry={0}", deliveryDocEntry);

        ResponseDTO responseInvoice = null;
        String documentType = IGBUtils.getProperParameter(appBean.obtenerValorPropiedad("igb.invoice.type"), companyName);
        CONSOLE.log(Level.INFO, "La empresa {0} usa el tipo de document {1}", new Object[]{companyName, documentType});
        if (documentType.equals("invoice")) {
            responseInvoice = (ResponseDTO) createInvoice(deliveryDocEntry, companyName, userName, pruebas).getEntity();
        } else {
            responseInvoice = (ResponseDTO) createDraft(deliveryDocEntry, companyName, userName, pruebas).getEntity();
        }
        return Response.ok(responseInvoice).build();
    }

    @POST
    @Path("draft")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response createDraft(Integer deliveryDocEntry,
                                @HeaderParam("X-Company-Name") String companyName,
                                @HeaderParam("X-Employee") String userName,
                                @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Creando borrador de factura para deliveryNoteDocEntry={0}", deliveryDocEntry);
        //Consultar entrega
        List<Object[]> deliveryData = dnFacade.getDeliveryNoteData(deliveryDocEntry, companyName, pruebas);
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
            BigDecimal deliveryValorDeclarado = (BigDecimal) row[9];
            String deliveryComentario = (String) row[10];

            if (invoice.getSeries() == null) {
                invoice.setSeries(Long.parseLong(getPropertyValue(Constants.INVOICE_SERIES, companyName)));
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
                    date.add(Calendar.DATE, customerFacade.getCustomerCreditDays(cardCode, companyName, pruebas));
                    invoice.setDocDueDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(date));
                } catch (Exception e) {
                }

                invoice.setContactPersonCode(deliveryContactCode);
                invoice.setComments(deliveryComentario);
                invoice.setSalesPersonCode(deliverySalesPersonCode);
                invoice.setUVRDECLARADO(deliveryValorDeclarado);
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
            sessionId = sapFunctions.getSessionId(companyName);
            if (sessionId != null) {
                CONSOLE.log(Level.INFO, "Se inicio sesion en DI Server satisfactoriamente. SessionID={0}", sessionId);
            } else {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al iniciar sesion en el DI Server.");
                return Response.ok(new ResponseDTO(-1, "Ocurrio un error al iniciar sesion en el DI Server.")).build();
            }
        } catch (Exception ignored) {
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
            boolean resp = sapFunctions.returnSession(sessionId);
            if (resp) {
                CONSOLE.log(Level.INFO, "Se cerro la sesion [{0}] de DI Server correctamente", sessionId);
            } else {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al cerrar la sesion [{0}] de DI Server", sessionId);
                return Response.ok(new ResponseDTO(-1, "Ocurrio un error cerrando la sesion de DI Server.")).build();
            }
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
    public Response createInvoice(Integer deliveryDocEntry,
                                  @HeaderParam("X-Company-Name") String companyName,
                                  @HeaderParam("X-Employee") String userName,
                                  @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Creando factura para deliveryNoteDocEntry={0}", deliveryDocEntry);
        //Consultar entrega
        List<Object[]> deliveryData = dnFacade.getDeliveryNoteData(deliveryDocEntry, companyName, pruebas);
        if (deliveryData.isEmpty()) {
            return Response.ok(new ResponseDTO(-1, "No se encontraron datos de entrega para facturar")).build();
        }
        //Crear factura a partir de la entrega
        Document.DocumentLines lines = new Document.DocumentLines();
        Document invoice = new Document();
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
            BigDecimal deliveryValorNeto = (BigDecimal) row[11];

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
                    date.add(Calendar.DATE, customerFacade.getCustomerCreditDays(cardCode, companyName, pruebas));
                    invoice.setDocDueDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(date));
                } catch (Exception e) {
                }

                invoice.setContactPersonCode(deliveryContactCode);
                invoice.setComments("Creado automaticamente desde WALI por " + userName);
                invoice.setSalesPersonCode(deliverySalesPersonCode);
                invoice.setuOrigen("W");
                invoice.setBaseAmount(deliveryValorNeto.doubleValue());
            }

            Document.DocumentLines.DocumentLine line = new Document.DocumentLines.DocumentLine();
            line.setBaseEntry(delDocEntry);
            line.setBaseLine(deliveryLineNum);
            line.setBaseType(deliveryObjectType);
            line.setItemCode(deliveryItemCode);
            line.setQuantity(deliveryQuantity.doubleValue());
            line.setLineNum(lineNum++);

            lines.getDocumentLine().add(line);
        }

        invoice.setDocumentLines(lines);

        /***Agregando gastos a la factura***/
        Document.DocumentAdditionalExpenses gastos = new Document.DocumentAdditionalExpenses();
        Document.DocumentAdditionalExpenses.DocumentAdditionalExpense gasto = new Document.DocumentAdditionalExpenses.DocumentAdditionalExpense();
        /***Gasto obligatorio para cualquier cliente***/
        if (companyName.contains("IGB")) {
            gasto.setExpenseCode(Constants.CODE_AUTO_CREE_IGB);
        } else {
            gasto.setExpenseCode(Constants.CODE_AUTO_CREE_MTZ);
        }
        gasto.setLineTotal(Math.ceil(invoice.getBaseAmount() * 0.04));
        gastos.getDocumentAdditionalExpense().add(gasto);

        //TODO: flete aplica solo para IGB siempre y cuando no sean ítem REPSOL, MotoZone solo llantas y no se efectua por este medio.
        //if (companyName.contains("IGB")) {
        BigDecimal porcFlete = customerFacade.getCustomerFlete(invoice.getCardCode(), companyName, pruebas);

        gasto = new Document.DocumentAdditionalExpenses.DocumentAdditionalExpense();
        gasto.setExpenseCode(Constants.CODE_FLETE_GRABABLE);
        gasto.setLineTotal(Math.ceil(invoice.getBaseAmount() * (porcFlete.doubleValue() / 100)));
        gastos.getDocumentAdditionalExpense().add(gasto);

        invoice.setDocumentAdditionalExpenses(gastos);
        //}

        /***Consultando tabla de retenciones***/
        List<Object[]> listRetencion = customerFacade.getWithholdingTaxData(invoice.getCardCode(), companyName, pruebas);
        if (listRetencion != null || listRetencion.size() > 0) {
            Document.WithholdingTaxDataCollection retenciones = new Document.WithholdingTaxDataCollection();

            for (Object[] row : listRetencion) {
                BigDecimal valueRet = (BigDecimal) row[1];
                BigDecimal baseMinima = (BigDecimal) row[2];
                Double base = Math.ceil(invoice.getBaseAmount() * (valueRet.doubleValue() / 100));

                Document.WithholdingTaxDataCollection.WithholdingTaxData retencion = new Document.WithholdingTaxDataCollection.WithholdingTaxData();

                if (baseMinima.doubleValue() < invoice.getBaseAmount()) {
                    /***Agregando retenciones a la factura***/
                    retencion.setWTCode(row[0].toString());
                    retencion.setTaxableAmount(base);
                    retencion.setWTAmount(base);
                    retencion.setuBaseME(invoice.getBaseAmount());
                    retencion.setuRetME(base);
                    retencion.setuBaseML(invoice.getBaseAmount());
                    retencion.setuRetML(base);
                    retencion.setuBaseMS(invoice.getBaseAmount());
                    retencion.setuRetMS(base);
                    retencion.setuTarifa(valueRet.doubleValue());
                    retencion.setuFuente("A");

                    retenciones.getWithholdingTaxData().add(retencion);
                }
            }
            invoice.setWithholdingTaxDataCollection(retenciones);
        }

        //1. Login
        String sessionId = null;
        try {
            sessionId = sapFunctions.getSessionId(companyName);
            if (sessionId != null) {
                CONSOLE.log(Level.INFO, "Se inicio sesion en DI Server satisfactoriamente. SessionID={0}", sessionId);
            } else {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al iniciar sesion en el DI Server.");
                return Response.ok(new ResponseDTO(-1, "Ocurrio un error al iniciar sesion en el DI Server.")).build();
            }
        } catch (Exception ignored) {
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
            boolean resp = sapFunctions.returnSession(sessionId);
            if (resp) {
                CONSOLE.log(Level.INFO, "Se cerro la sesion [{0}] de DI Server correctamente", sessionId);
            } else {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al cerrar la sesion [{0}] de DI Server", sessionId);
                return Response.ok(new ResponseDTO(-1, "Ocurrio un error cerrando la sesion de DI Server.")).build();
            }
        }
        //4. Validar y retornar
        if (docEntry > 0) {
            return Response.ok(new ResponseDTO(0, invoiceFacade.getDocNumInvoice(docEntry, companyName, pruebas))).build();
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
        CONSOLE.log(Level.INFO, "Creando FV preliminar en SAP con sessionId [{0}]", sessionId);
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
        CONSOLE.log(Level.INFO, "Creando factura en SAP con sessionId [{0}]", sessionId);
        AddResponse response = service.getInvoicesServiceSoap12().add(add, header);
        return response.getDocumentParams().getDocEntry();
    }

    private String getPropertyValue(String propertyName, String companyName) {
        return IGBUtils.getProperParameter(appBean.obtenerValorPropiedad(propertyName), companyName);
    }
}