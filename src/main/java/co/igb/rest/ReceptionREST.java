package co.igb.rest;

import co.igb.b1ws.client.purchasedeliverynote.Add;
import co.igb.b1ws.client.purchasedeliverynote.AddResponse;
import co.igb.b1ws.client.purchasedeliverynote.Document;
import co.igb.b1ws.client.purchasedeliverynote.PurchaseDeliveryNotesService;
import co.igb.dto.*;
import co.igb.ejb.EmailManager;
import co.igb.ejb.IGBApplicationBean;
import co.igb.persistence.facade.PurchaseOrderFacade;
import co.igb.util.IGBUtils;
import com.google.gson.Gson;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
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
    @Inject
    private EmailManager emailManager;

    @GET
    @Path("list/orders")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    public Response listOpenOrders(@HeaderParam("X-Company-Name") String companyName,
                                   @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Consultando ordenes abiertas");
        try {
            return Response.ok(poFacade.findOpenOrders(companyName, pruebas)).build();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando las ordenes abiertas en " + companyName, e);
            return Response.serverError().build();
        }
    }

    @GET
    @Path("load/order/{docNum}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    public Response loadOrder(@PathParam("docNum") String docNum,
                              @HeaderParam("X-Company-Name") String companyName,
                              @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Consultando orden #{0}", docNum);
        return Response.ok(poFacade.find(docNum, companyName, pruebas)).build();
    }

    @GET
    @Path("load/order/udf/{docNum}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    public Response loadOrderUDF(@PathParam("docNum") String docNum,
                                 @HeaderParam("X-Company-Name") String companyName,
                                 @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Consultando los campos de usuario para la orden de compra #{0}", docNum);
        Object[] obj = poFacade.loadUserFields(docNum, companyName, pruebas);

        UserFieldDTO dto = new UserFieldDTO();
        dto.setTransp((String) obj[1]);
        try {
            dto.setFembarque(new SimpleDateFormat("yyyy-MM-dd").format(obj[2]));
        } catch (Exception e) {
        }
        try {
            dto.setFdocTras(new SimpleDateFormat("yyyy-MM-dd").format(obj[9]));
        } catch (Exception e) {
        }
        try {
            dto.setFarribPuert(new SimpleDateFormat("yyyy-MM-dd").format(obj[10]));
        } catch (Exception e) {
        }
        try {
            dto.setFarriboCed(new SimpleDateFormat("yyyy-MM-dd").format(obj[16]));
        } catch (Exception e) {
        }
        try {
            dto.setFcargaList(new SimpleDateFormat("yyyy-MM-dd").format(obj[19]));
        } catch (Exception e) {
        }
        try {
            dto.setFsalPuert(new SimpleDateFormat("yyyy-MM-dd").format(obj[21]));
        } catch (Exception e) {
        }
        try {
            dto.setFbooking(new SimpleDateFormat("yyyy-MM-dd").format(obj[24]));
        } catch (Exception e) {
        }
        try {
            dto.setFestimEmb(new SimpleDateFormat("yyyy-MM-dd").format(obj[26]));
        } catch (Exception e) {
        }
        try {
            dto.setFrecDocFin(new SimpleDateFormat("yyyy-MM-dd").format(obj[27]));
        } catch (Exception e) {
        }
        try {
            dto.setFarribCedEst(new SimpleDateFormat("yyyy-MM-dd").format(obj[30]));
        } catch (Exception e) {
        }
        try {
            dto.setFliq(new SimpleDateFormat("yyyy-MM-dd").format(obj[33]));
        } catch (Exception e) {
        }
        try {
            dto.setFlibBL(new SimpleDateFormat("yyyy-MM-dd").format(obj[34]));
        } catch (Exception e) {
        }
        try {
            dto.setDocDate(new SimpleDateFormat("yyyy-MM-dd").format(obj[42]));
        } catch (Exception e) {
        }
        dto.setTermNeg((String) obj[3]);
        dto.setModTranp((String) obj[4]);
        dto.setPuertDes((String) obj[5]);
        dto.setEstOC((String) obj[6]);
        dto.setEmbarc((String) obj[7]);
        dto.setDocTras((String) obj[8]);
        dto.setTipoEmp((String) obj[12]);
        dto.setObserv((String) obj[13]);
        dto.setPuertEmb((String) obj[14]);
        dto.setTranspTerr((String) obj[15]);
        dto.setCantCont((int) obj[17]);
        dto.setCbm((String) obj[18]);
        dto.setTiempTrans((String) obj[20]);
        dto.setTiempPuert((String) obj[22]);
        dto.setTiempEntComex((Integer) obj[23]);
        dto.setTiempEspBooking((Integer) obj[25]);
        dto.setEmisBL((String) obj[28]);
        dto.setInsp((String) obj[29]);
        dto.setNotifBL((String) obj[31]);
        dto.setLiqComex((String) obj[32]);
        dto.setConduct((String) obj[35]);
        dto.setCedulCond((Integer) obj[36]);
        dto.setPlaca((String) obj[37]);
        dto.setContened((String) obj[38]);
        dto.setPrecint((String) obj[39]);
        dto.setEnviarDatos((String) obj[40]);
        dto.setVendedor((String) obj[41]);
        dto.setComprador((String) obj[43]);
        dto.setEmailComprador((String) obj[44]);

        return Response.ok(dto).build();
    }

    @PUT
    @Path("update/order/udf")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    public Response updateOrderUDF(UserFieldDTO dto,
                                   @HeaderParam("X-Company-Name") String companyName,
                                   @HeaderParam("X-Pruebas") boolean pruebas) throws ParseException {
        CONSOLE.log(Level.INFO, "Inciando actualizacion de campos de usuario para la orden de compra #{0} en {1}", new Object[]{dto.getDocNum(), companyName});

        Long daysTiempTrans = calculateTime(dto.getFembarque(), dto.getFarriboCed());
        Long daysTiempPuer = calculateTime(dto.getFarribPuert(), dto.getFsalPuert());
        Long daysTiempEntComex = calculateTime(dto.getDocDate(), dto.getFcargaList());
        Long daysTiempEspBooking = calculateTime(dto.getFcargaList(), dto.getFbooking());

        dto.setTiempTrans(daysTiempTrans.toString());
        dto.setTiempPuert(daysTiempPuer.toString());
        dto.setTiempEntComex(daysTiempEntComex.intValue());
        dto.setTiempEspBooking(daysTiempEspBooking.intValue());

        Gson gson = new Gson();
        String json = gson.toJson(dto);
        CONSOLE.log(Level.INFO, json);

        if (poFacade.updateFieldUser(dto, companyName, pruebas)) {
            CONSOLE.log(Level.INFO, "Exito actualizando los campos de usuario para la orden de compra #{0}", dto.getDocNum());
            //notificar actualización de fecha de arribo al puerto
            if (dto.isSendNotification()) {
                try {
                    Map<String, String> params = new HashMap<>();
                    params.put("docNum", dto.getDocNum());
                    params.put("dateArribPuert", dto.getFarribPuert());
                    params.put("vendedor", dto.getVendedor());
                    params.put("comprador", dto.getComprador());

                    if (companyName.contains("VARROC")) {
                        params.put("footer", "email-mtz.png");
                        params.put("companyName", "MOTOZONE S.A.S");
                    } else {
                        params.put("footer", "email-igb.png");
                        params.put("companyName", "IGB S.A.S");
                    }

                    sendEmail("NotificationChangesInOrder", "soporte@igbcolombia.com", "Cambio (Fecha de Arribo al Puerto) Orden #" + dto.getDocNum(), dto.getEmailComprador(),
                            "compras2@igbcolombia.com", "", null, params);
                } catch (Exception e) {
                    CONSOLE.log(Level.SEVERE, "Ocurrio un error enviando la notificacion de cambio de fecha arribo a puerto para la orden de compra #" + dto.getDocNum(), e);
                    return Response.ok(new ResponseDTO(-1, "Ocurrio un error enviando la notificacion de cambio de fecha arribo al puerto para la orden de compra # " + dto.getDocNum())).build();
                }
            }
            return Response.ok(new ResponseDTO(0, "Exito actualizando los campos de usuario para la orden de compra #" + dto.getDocNum())).build();
        } else {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error actualizando los campos de usuario para la orden de compra #" + dto.getDocNum() + " en " + companyName);
            return Response.ok(new ResponseDTO(-1, "Ocurrio un error actualizando los campos de usuario para la orden de compra #" + dto.getDocNum())).build();
        }
    }

    @POST
    @Path("receive-items")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    public Response receiveAndClose(PurchaseOrderDTO order,
                                    @HeaderParam("X-Company-Name") String companyName,
                                    @HeaderParam("X-Warehouse-Code") String warehouseCode) {
        CONSOLE.log(Level.INFO, "Generando entrada de mercancia con los siguientes datos {0}", order);

        Document document = new Document();
        document.setCardCode(order.getCardCode());
        document.setSeries(Long.parseLong(getPropertyValue("igb.purchase.delivery.note.series", companyName)));
        document.setDocCurrency(getPropertyValue("igb.purchase.delivery.note.currency", companyName));
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
            line.setAccountCode(getPropertyValue("igb.purchase.delivery.note.line.account", companyName));
            line.setBaseEntry(order.getDocEntry());
            line.setBaseLine(lineDto.getDocLine());
            line.setBaseType(22L);
            line.setItemCode(lineDto.getItemCode());
            line.setLineNum(lineNum++);
            line.setQuantity(lineDto.getQuantity().doubleValue());

            Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation binAllocation =
                    new Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation();
            binAllocation.setBaseLineNumber(line.getLineNum());
            binAllocation.setBinAbsEntry(appBean.getReceptionBinId(companyName, warehouseCode).longValue());
            binAllocation.setQuantity(line.getQuantity());

            Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations bins = new Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations();
            bins.getDocumentLinesBinAllocation().add(binAllocation);

            line.setDocumentLinesBinAllocations(bins);
            docLines.getDocumentLine().add(line);
        }
        document.setDocumentLines(docLines);

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
                docEntry = createPurchaseDeliveryNote(document, sessionId);
                CONSOLE.log(Level.INFO, "Se creo la entrada por compra con docEntry={0}", docEntry);
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
        if (docEntry > 0) {
            return Response.ok(new ResponseDTO(0, docEntry)).build();
        } else {
            return Response.ok(new ResponseDTO(-1, "Ocurrio un error al crear la entrada. " + errorMessage)).build();
        }
    }

    private void sendEmail(String template, String from, String subject, String toAddress, String ccAddress, String bccAddress, List<String[]> adjuntos, Map<String, String> params) {
        MailMessageDTO dtoMail = new MailMessageDTO();
        dtoMail.setTemplateName(template);
        dtoMail.setParams(params);
        dtoMail.setAttachments(adjuntos);
        dtoMail.setFrom(from);
        dtoMail.setSubject(subject);
        dtoMail.addToAddress(toAddress + ',' + ccAddress);
        dtoMail.addBccAddress(bccAddress);
        dtoMail.addBccAddress(ccAddress);
        try {
            emailManager.sendEmail(dtoMail);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al enviar la notificacion. ", e);
        }
    }

    private Long createPurchaseDeliveryNote(Document document, String sessionId) throws MalformedURLException {
        PurchaseDeliveryNotesService service = new PurchaseDeliveryNotesService(new URL(String.format(appBean.obtenerValorPropiedad("igb.b1ws.wsdlUrl"), "PurchaseDeliveryNotesService")));
        Add add = new Add();
        add.setDocument(document);

        co.igb.b1ws.client.purchasedeliverynote.MsgHeader header = new co.igb.b1ws.client.purchasedeliverynote.MsgHeader();
        header.setServiceName("PurchaseDeliveryNotesService");
        header.setSessionID(sessionId);
        CONSOLE.log(Level.INFO, "Creando entrada de mercancia en SAP con sessionId [{0}]", sessionId);
        AddResponse response = service.getPurchaseDeliveryNotesServiceSoap12().add(add, header);

        return response.getDocumentParams().getDocEntry();
    }

    private Long calculateTime(String dateStart, String dateEnd) throws ParseException {
        if (dateStart == null || dateEnd == null) {
            return 0l;
        } else if (!dateStart.isEmpty() && !dateEnd.isEmpty()) {
            Date fecha1 = new SimpleDateFormat("yyyy-MM-dd").parse(dateStart);
            Date fecha2 = new SimpleDateFormat("yyyy-MM-dd").parse(dateEnd);
            Long startTime = fecha1.getTime();
            Long endTime = fecha2.getTime();
            Long dayStart = (long) Math.floor(startTime / (1000 * 60 * 60 * 24)); // convertimos a dias, para que no afecten cambios de hora
            Long dayEnd = (long) Math.floor(endTime / (1000 * 60 * 60 * 24)); // convertimos a dias, para que no afecten cambios de hora
            Long days = dayEnd - dayStart;

            return days;
        } else {
            return 0l;
        }
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

    private String getPropertyValue(String propertyName, String companyName) {
        return IGBUtils.getProperParameter(appBean.obtenerValorPropiedad(propertyName), companyName);
    }
}
