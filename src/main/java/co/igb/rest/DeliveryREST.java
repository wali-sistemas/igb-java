package co.igb.rest;

import co.igb.b1ws.client.deliverynote.*;
import co.igb.dto.ResponseDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.persistence.facade.BinLocationFacade;
import co.igb.persistence.facade.DeliveryNoteFacade;
import co.igb.persistence.facade.SalesOrderFacade;
import co.igb.util.Constants;
import co.igb.util.IGBUtils;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
@Path("delivery")
public class DeliveryREST {
    private static final Logger CONSOLE = Logger.getLogger(DeliveryREST.class.getSimpleName());

    @EJB
    private BinLocationFacade blFacade;
    @EJB
    private SalesOrderFacade soFacade;
    @EJB
    private BasicSAPFunctions sapFunctions;
    @EJB
    private DeliveryNoteFacade deliveryNoteFacade;
    @Inject
    private IGBApplicationBean appBean;

    @POST
    @Path("express")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response createDeliveryNote(Integer docNum,
                                       @HeaderParam("X-Company-Name") String companyName,
                                       @HeaderParam("X-Employee") String userName,
                                       @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Creando documento de entrega para la orden {0}", docNum);

        List<Object[]> packingRecords = deliveryNoteFacade.listRecords(docNum, companyName, pruebas);
        if (packingRecords.isEmpty()) {
            CONSOLE.log(Level.SEVERE, "No se encontraron registros para crear entrega de la orden {0}", docNum);
            return Response.ok(new ResponseDTO(-2, "No se encontraron registros para crear entrega de la orden " + docNum)).build();
        }

        HashSet<Object[]> itemsMissing = new HashSet<>();
        HashSet<String> itemsOut = new HashSet<>();
        Integer docEntrySAP = null;
        for (Object[] obj : packingRecords) {
            if (obj[4] == null) {
                //validar si hay más stock en otras ubicaciones
                List<Object[]> bins = soFacade.findOrdersStockAvailability((Integer) obj[0], new ArrayList<>(Collections.singleton((String) obj[2])), (String) obj[10], companyName, pruebas);

                int qtyOrd = (int) obj[3], qtyComp = 0, qtyBin = 0, qtyReal = 0;
                if (bins.size() > 0) {
                    for (Object[] objBin : bins) {
                        if (qtyComp == qtyOrd) {
                            break;
                        }
                        qtyBin = (int) objBin[4];
                        if ((qtyOrd > qtyBin) && (qtyComp <= qtyOrd)) {
                            qtyReal = qtyOrd - qtyComp;
                            if (qtyReal <= qtyBin) {
                                itemsMissing.add(new Object[]{obj[0], obj[1], obj[2], qtyReal, objBin[3], objBin[5], obj[6], obj[7], obj[8], obj[9]});
                                qtyComp += qtyReal;
                            } else {
                                itemsMissing.add(new Object[]{obj[0], obj[1], obj[2], objBin[4], objBin[3], objBin[5], obj[6], obj[7], obj[8], obj[9]});
                                qtyComp += (int) objBin[4];
                            }
                        }
                    }
                } else {
                    //se add para cerrar la linea, y se da por negado el item.
                    itemsOut.add((String) obj[2]);
                    docEntrySAP = (Integer) obj[8];
                }
            } else {
                itemsMissing.add(new Object[]{obj[0], obj[1], obj[2], obj[3], obj[4], obj[5], obj[6], obj[7], obj[8], obj[9]});
            }
        }

        if (!itemsOut.isEmpty()) {
            boolean res = soFacade.closeOrderLines(docEntrySAP, itemsOut, companyName, pruebas);
            if (!res) {
                CONSOLE.log(Level.WARNING, "Ocurrió un error al cerrar las líneas de la órden {0} para los productos que no tienen saldo: {1}", new Object[]{docEntrySAP, Arrays.toString(itemsOut.toArray())});
            }
        }
        if (itemsMissing.isEmpty()) {
            CONSOLE.log(Level.SEVERE, "Sin items pendientes para crear entrega automatica a la orden {0}", docNum);
            return Response.ok(new ResponseDTO(-2, "Sin items pendientes para crear entrega automatica a la orden " + docNum)).build();
        }

        HashMap<String, Document.DocumentLines.DocumentLine> items = new HashMap<>();
        Document document = new Document();
        Integer orderDocEntry = null;
        for (Object[] row : itemsMissing) {
            Integer orderNumber = (Integer) row[0];
            String customerId = (String) row[1];
            String itemCode = (String) row[2];
            Integer quantity = (Integer) row[3];
            Integer binAbs = (Integer) row[4];
            String binCode = (String) row[5];
            String employee = userName;

            if (orderDocEntry == null) {
                document.setSeries(Long.parseLong(getPropertyValue(Constants.DELIVERY_NOTE_SERIES, companyName)));
                document.setCardCode(customerId);
                String commentOV = (String) row[6];
                if (commentOV != null) {
                    //limitando caracteres no mayores a 254 para que lo acepte SAP
                    String commentWms = "Orden #" + orderNumber + " creada por " + employee + " desde WALI.";
                    if ((commentOV.length() + commentWms.length() - 254) > 0) {
                        document.setComments(commentOV.substring(0, commentOV.length() - (commentOV.length() + commentWms.length() - 251)) + "..." + commentWms);
                    } else {
                        document.setComments(commentOV + "." + commentWms);
                    }
                } else {
                    document.setComments("Orden #" + orderNumber + " creada por " + employee + " desde WALI.");
                }
                document.setUTOTCAJ(0.0);
                document.setUVRDECLARADO((BigDecimal) row[7]);
                document.setUNUNFAC(orderNumber.toString());
                orderDocEntry = (Integer) row[8];
                if (orderDocEntry == null || orderDocEntry <= 0) {
                    return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-2, "Ocurrió un error al consultar el docEntry de la orden. ")).build();
                }
            }

            Document.DocumentLines.DocumentLine line = new Document.DocumentLines.DocumentLine();
            if (!items.containsKey(itemCode)) {
                //Si el item no se ha agregado a la orden
                line.setLineNum((long) items.size());
                line.setItemCode(itemCode);
                line.setQuantity(quantity.doubleValue());
                line.setWarehouseCode(binCode.substring(0, 2));

                Integer baseLineNum = (Integer) row[9];
                if (baseLineNum < 0) {
                    CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el numero de linea de la orden {0}", orderNumber.toString());
                    return Response.ok(new ResponseDTO(-2, "Ocurrio un error al consultar el numero de linea de la orden (baseLine) para el ítem [" + itemCode + "]. Es posible que la orden ya se haya cerrado")).build();
                }
                line.setBaseLine(baseLineNum.longValue());
                line.setBaseEntry(orderDocEntry.longValue());
                line.setBaseType(Long.parseLong(getPropertyValue(Constants.SALES_ORDER_SERIES, companyName)));
                line.setDocumentLinesBinAllocations(new Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations());

                items.put(itemCode, line);
            } else {
                //Si el item ya se agrego a la orden
                line = items.get(itemCode);
                line.setQuantity(line.getQuantity() + quantity.doubleValue());
            }

            boolean quantityAdded = false;
            for (Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation binAllocation : line.getDocumentLinesBinAllocations().getDocumentLinesBinAllocation()) {
                if (binAllocation.getBinAbsEntry().equals(binAbs.longValue())) {
                    binAllocation.setQuantity(binAllocation.getQuantity() + quantity.doubleValue());
                    quantityAdded = true;
                    break;
                }
            }

            if (!quantityAdded) {
                Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation binAllocation = new Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation();
                binAllocation.setAllowNegativeQuantity(Constants.SAP_STATUS_NO);
                binAllocation.setBaseLineNumber(line.getLineNum());
                binAllocation.setBinAbsEntry(binAbs.longValue());
                binAllocation.setQuantity(quantity.doubleValue());
                line.getDocumentLinesBinAllocations().getDocumentLinesBinAllocation().add(binAllocation);
            }
        }

        Document.DocumentLines documentLines = new Document.DocumentLines();
        List<Document.DocumentLines.DocumentLine> itemsList = new ArrayList<>(items.values());
        itemsList.sort(new Comparator<Document.DocumentLines.DocumentLine>() {
            @Override
            public int compare(Document.DocumentLines.DocumentLine o1, Document.DocumentLines.DocumentLine o2) {
                return o1.getLineNum().compareTo(o2.getLineNum());
            }
        });

        documentLines.getDocumentLine().addAll(itemsList);
        document.setDocumentLines(documentLines);

        logDocument(document);

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
                docEntry = createDeliveryNote(document, sessionId);
                CONSOLE.log(Level.INFO, "Se creo la entrega con docEntry={0}", docEntry);
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
            return Response.ok(new ResponseDTO(-1, "Ocurrio un error al crear la entrega. " + errorMessage)).build();
        }
    }

    private Long createDeliveryNote(Document document, String sessionId) throws MalformedURLException {
        DeliveryNotesService service = new DeliveryNotesService(new URL(
                String.format(
                        appBean.obtenerValorPropiedad(Constants.B1WS_WSDL_URL),
                        Constants.B1WS_DELIVERY_NOTE_SERVICE)));
        Add add = new Add();
        add.setDocument(document);

        MsgHeader header = new MsgHeader();
        header.setServiceName(Constants.B1WS_DELIVERY_NOTE_SERVICE);
        header.setSessionID(sessionId);
        AddResponse response = service.getDeliveryNotesServiceSoap12().add(add, header);
        return response.getDocumentParams().getDocEntry();
    }

    private void logDocument(Document document) {
        StringBuilder sb = new StringBuilder();
        sb.append("series=");
        sb.append(document.getSeries());
        sb.append(", cardCode=");
        sb.append(document.getCardCode());
        sb.append(", comments=");
        sb.append(document.getComments());
        sb.append(", lines[");
        for (Document.DocumentLines.DocumentLine line : document.getDocumentLines().getDocumentLine()) {
            sb.append("line{");
            sb.append("lineNum=");
            sb.append(line.getLineNum());
            sb.append(", itemCode=");
            sb.append(line.getItemCode());
            sb.append(", quantity=");
            sb.append(line.getQuantity());
            sb.append(", whsCode=");
            sb.append(line.getWarehouseCode());
            sb.append(", baseEntry=");
            sb.append(line.getBaseEntry());
            sb.append(", baseType=");
            sb.append(line.getBaseType());
            sb.append(", bins[");
            for (Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation binAllocation : line.getDocumentLinesBinAllocations().getDocumentLinesBinAllocation()) {
                sb.append("bin{");
                sb.append("allowNegative=");
                sb.append(binAllocation.getAllowNegativeQuantity());
                sb.append(", baseLineNum=");
                sb.append(binAllocation.getBaseLineNumber());
                sb.append(", binAbs=");
                sb.append(binAllocation.getBinAbsEntry());
                sb.append(", quantity=");
                sb.append(binAllocation.getQuantity());
                sb.append("}, ");
            }
            sb.delete(sb.length() - 2, sb.length());
            sb.append("]}, ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        CONSOLE.log(Level.INFO, "Enviando el documento a SAP {0}", sb.toString());
    }

    private String getPropertyValue(String propertyName, String companyName) {
        return IGBUtils.getProperParameter(appBean.obtenerValorPropiedad(propertyName), companyName);
    }
}