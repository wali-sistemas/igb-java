package co.igb.rest;

import co.igb.dto.ResponseDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.hanaws.client.invoices.InvoicesClient;
import co.igb.hanaws.dto.invoices.InvoicesDTO;
import co.igb.hanaws.dto.invoices.InvoicesRestDTO;
import co.igb.persistence.facade.CustomerFacade;
import co.igb.persistence.facade.DeliveryNoteFacade;
import co.igb.persistence.facade.InvoiceFacade;
import co.igb.util.Constants;
import co.igb.util.IGBUtils;
import com.google.gson.Gson;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dbotero
 */
@Stateless
@Path("invoice")
public class InvoiceREST implements Serializable {
    private static final Logger CONSOLE = Logger.getLogger(InvoiceREST.class.getSimpleName());
    private InvoicesClient service;
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

    @PostConstruct
    private void initialize() {
        try {
            service = new InvoicesClient(Constants.HANAWS_SL_URL);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la instancia de InvoiceServiceLayer. ", e);
        }
    }

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
            //responseInvoice = (ResponseDTO) createDraft(deliveryDocEntry, companyName, userName, pruebas).getEntity();
        }
        return Response.ok(responseInvoice).build();
    }

    @POST
    @Path("invoice")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response createInvoice(Integer docNumDelivery,
                                  @HeaderParam("X-Company-Name") String companyName,
                                  @HeaderParam("X-Employee") String userName,
                                  @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Creando factura para la entrega DocNum={0}", docNumDelivery);
        //Consultar entrega
        List<Object[]> deliveryData = dnFacade.getDeliveryNoteData(docNumDelivery, companyName, pruebas);
        if (deliveryData.isEmpty()) {
            return Response.ok(new ResponseDTO(-1, "No se encontraron datos de entrega para facturar")).build();
        }
        //Crear factura a partir de la entrega
        List<InvoicesDTO.DocumentLines.DocumentLine> lines = new ArrayList<>();
        InvoicesDTO invoice = new InvoicesDTO();
        long lineNum = 0;

        Long delDocEntry = ((Integer) deliveryData.get(0)[0]).longValue();
        Integer docNum = (Integer) deliveryData.get(0)[1];
        Long deliveryObjectType = ((Integer) deliveryData.get(0)[2]).longValue();
        String cardCode = (String) deliveryData.get(0)[3];
        Long deliverySalesPersonCode = ((Integer) deliveryData.get(0)[4]).longValue();
        Long deliveryContactCode = ((Integer) deliveryData.get(0)[5]).longValue();
        BigDecimal deliveryValorNeto = (BigDecimal) deliveryData.get(0)[11];
        String deliveryComment = (String) deliveryData.get(0)[10];
        BigDecimal deliveryImpuesto = (BigDecimal) deliveryData.get(0)[12];
        Integer deliveryCreditDays = (Integer) deliveryData.get(0)[13];
        BigDecimal porcFlete = (BigDecimal) deliveryData.get(0)[14];
        BigDecimal flete = (BigDecimal) deliveryData.get(0)[15];
        String whsCode = (String) deliveryData.get(0)[16];

        if (invoice.getSeries() == null) {
            invoice.setSeries(Long.parseLong(getPropertyValue("igb.invoice.series", companyName)));
            invoice.setCardCode(cardCode);

            try {
                String date2 = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
                invoice.setDocDate(date2);
            } catch (Exception e) {
            }

            try {
                GregorianCalendar date = new GregorianCalendar();
                date.add(Calendar.DATE, deliveryCreditDays);
                invoice.setDocDueDate(new SimpleDateFormat("yyyy-MM-dd").format(date.getTime()));
            } catch (Exception e) {
            }

            invoice.setContactPersonCode(deliveryContactCode);
            invoice.setSalesPersonCode(deliverySalesPersonCode);
            invoice.setBaseAmount(deliveryValorNeto);
            invoice.setVatSum(deliveryImpuesto);
            invoice.setuWUID(getPropertyValue("invoice.wuid", companyName));
            invoice.setUnunfac(docNum.toString());
        }

        if (deliveryComment != null) {
            invoice.setComments(deliveryComment);
        } else {
            invoice.setComments("Creado desde WALI por " + userName);
        }

        for (Object[] row : deliveryData) {
            InvoicesDTO.DocumentLines.DocumentLine line = new InvoicesDTO.DocumentLines.DocumentLine();
            Long deliveryLineNum = ((Integer) row[6]).longValue();
            String deliveryItemCode = (String) row[7];
            Integer deliveryQuantity = (Integer) row[8];
            line.setBaseEntry(delDocEntry);
            line.setBaseLine(deliveryLineNum);
            line.setBaseType(deliveryObjectType);
            line.setItemCode(deliveryItemCode);
            line.setQuantity(deliveryQuantity.doubleValue());
            line.setLineNum(lineNum++);

            lines.add(line);
        }

        invoice.setDocumentLines(lines);

        /***Agregando gastos a la factura***/
        List<InvoicesDTO.DocumentAdditionalExpenses.DocumentAdditionalExpense> gastos = new ArrayList<>();
        List<Object[]> listExpenses = customerFacade.getExpensesCode(invoice.getCardCode(), companyName, pruebas);
        if (listExpenses != null || listExpenses.size() > 0) {
            for (Object[] row : listExpenses) {
                BigDecimal expenseCode = (BigDecimal) row[0];
                BigDecimal prctBsAmnt = (BigDecimal) row[1];
                BigDecimal baseMinima = (BigDecimal) row[2];
                BigDecimal lineTotal = invoice.getBaseAmount().multiply(prctBsAmnt.divide(BigDecimal.valueOf(100)));

                if (baseMinima.compareTo(invoice.getBaseAmount()) == -1) {
                    InvoicesDTO.DocumentAdditionalExpenses.DocumentAdditionalExpense gasto = new InvoicesDTO.DocumentAdditionalExpenses.DocumentAdditionalExpense();
                    gasto.setExpenseCode(expenseCode.longValue());
                    gasto.setLineTotal(lineTotal.setScale(0, RoundingMode.CEILING));
                    //sin IVA corresponde a un impuesto, y un impuesto nunca se cobra sobre otro impuesto AUTO-CREE.
                    gasto.setTaxCode("I_LEG_T0");
                    gastos.add(gasto);
                }
            }
        }

        //flete aplica solo para IGB siempre y cuando no sean ítem REPSOL, MotoZone solo llantas y no se efectua por este medio.
        boolean itemRepsol = false;
        for (InvoicesDTO.DocumentLines.DocumentLine line : invoice.getDocumentLines()) {
            if (line.getItemCode().substring(0, 2).equals("RP")) {
                itemRepsol = true;
                break;
            }
        }

        if (companyName.contains("IGB") && !itemRepsol) {
            //TODO: validar si el cliente de IGB tiene checkList en el maestro de SN de deshabilitar flete
            if (!customerFacade.disableFreightCollection(invoice.getCardCode(), companyName, pruebas).equals("Y")) {
                BigDecimal lineTotal;
                //TODO: Solo para bodegas de asociadas con magnum en IGB, se mapea el flete desde la entrega
                if (whsCode.equals("05") || whsCode.equals("26")) {
                    lineTotal = flete;
                } else {
                    lineTotal = invoice.getBaseAmount().multiply(porcFlete.divide(BigDecimal.valueOf(100)));
                }

                if (porcFlete != null) {
                    InvoicesDTO.DocumentAdditionalExpenses.DocumentAdditionalExpense gasto = new InvoicesDTO.DocumentAdditionalExpenses.DocumentAdditionalExpense();
                    gasto.setExpenseCode(Constants.CODE_FLETE_GRABABLE);
                    gasto.setLineTotal(lineTotal.setScale(0, RoundingMode.CEILING));
                    gastos.add(gasto);
                }
            }
        }
        invoice.setDocumentAdditionalExpenses(gastos);

        /***Consultando tabla de retenciones***/
        List<Object[]> listRetencion = customerFacade.getWithholdingTaxData(invoice.getCardCode(), companyName, pruebas);
        if (listRetencion != null || listRetencion.size() > 0) {
            List<InvoicesDTO.WithholdingTaxDataCollection.WithholdingTaxData> retenciones = new ArrayList<>();

            for (Object[] row : listRetencion) {
                BigDecimal valueRet = (BigDecimal) row[1];
                BigDecimal baseMinima = (BigDecimal) row[2];
                BigDecimal base = new BigDecimal(0);
                BigDecimal baseImpuesto = new BigDecimal(0);
                //clientes con (R/IVA VENTAS) su base parte del impuesto
                if (row[3].equals("IVA")) {
                    base = invoice.getVatSum().multiply(valueRet.divide(BigDecimal.valueOf(100)));
                    baseImpuesto = invoice.getVatSum();
                } else {
                    base = invoice.getBaseAmount().multiply(valueRet.divide(BigDecimal.valueOf(100)));
                    baseImpuesto = invoice.getBaseAmount();
                }

                InvoicesDTO.WithholdingTaxDataCollection.WithholdingTaxData retencion = new InvoicesDTO.WithholdingTaxDataCollection.WithholdingTaxData();

                if (baseMinima.compareTo(invoice.getBaseAmount()) == -1) {
                    /***Agregando retenciones a la factura***/
                    retencion.setWtCode(row[0].toString());
                    retencion.setTaxableAmount(base.setScale(0, RoundingMode.CEILING));
                    retencion.setWtAmount(base.setScale(0, RoundingMode.CEILING));
                    retencion.setuBaseME(baseImpuesto.setScale(0, RoundingMode.CEILING));
                    retencion.setuRetME(base.setScale(0, RoundingMode.CEILING));
                    retencion.setuBaseML(baseImpuesto.setScale(0, RoundingMode.CEILING));
                    retencion.setuRetML(base.setScale(0, RoundingMode.CEILING));
                    retencion.setuBaseMS(baseImpuesto.setScale(0, RoundingMode.CEILING));
                    retencion.setuRetMS(base.setScale(0, RoundingMode.CEILING));
                    retencion.setuTarifa(valueRet.doubleValue());
                    retencion.setuFuente("A");

                    retenciones.add(retencion);
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
                Gson gson = new Gson();
                String JSON = gson.toJson(invoice);
                CONSOLE.log(Level.INFO, JSON);
                docEntry = createInvoice(invoice, sessionId);
                CONSOLE.log(Level.INFO, "Se creo la factura con docNum={0}", docEntry);
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

    private Long createInvoice(InvoicesDTO document, String sessionId) {
        InvoicesRestDTO res = null;
        try {
            res = service.addInvoice(document, sessionId);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error retornando la respuesta de la creacion de la factura. ", e);
            return -1l;
        }
        return res.getDocEntry();
    }

    private String getPropertyValue(String propertyName, String companyName) {
        return IGBUtils.getProperParameter(appBean.obtenerValorPropiedad(propertyName), companyName);
    }
}