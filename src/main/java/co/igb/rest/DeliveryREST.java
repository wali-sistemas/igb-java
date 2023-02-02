package co.igb.rest;

import co.igb.dto.DeliveryNoteMagnumDTO;
import co.igb.dto.PickingExpressOrderDTO;
import co.igb.dto.ResponseDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.hanaws.client.deliveryNotes.DeliveryClient;
import co.igb.hanaws.dto.deliveryNotes.DeliveryDTO;
import co.igb.hanaws.dto.deliveryNotes.DeliveryRestDTO;
import co.igb.persistence.facade.BinLocationFacade;
import co.igb.persistence.facade.DeliveryNoteFacade;
import co.igb.persistence.facade.SalesOrderFacade;
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
import java.math.BigDecimal;
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
    private DeliveryClient service;
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

    @PostConstruct
    private void initialize() {
        try {
            service = new DeliveryClient(Constants.HANAWS_SL_URL);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la instancia de DeliveryServiceLayer. ", e);
        }
    }

    @POST
    @Path("modula")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response createDeliveryNoteModula(Integer orderMDL,
                                             @HeaderParam("X-Company-Name") String companyName,
                                             @HeaderParam("X-Employee") String userName,
                                             @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Iniciando creacion de entrega para las ordenes de solo wms-modula");

        List<Object[]> orderRecords = deliveryNoteFacade.listRecords(orderMDL, "30", companyName, pruebas);
        if (orderRecords.isEmpty()) {
            CONSOLE.log(Level.SEVERE, "No se encontraron registros para crear entrega de la orden {0}", orderMDL);
            return Response.ok(new ResponseDTO(-2, "No se encontraron registros para crear entrega de la orden " + orderMDL)).build();
        }

        HashMap<String, DeliveryDTO.DocumentLines.DocumentLine> items = new HashMap<>();
        DeliveryDTO document = new DeliveryDTO();
        Integer orderDocEntry = null;
        Integer orderNumber = (Integer) orderRecords.get(0)[0];

        if (orderDocEntry == null) {
            document.setSeries(Long.parseLong(getPropertyValue(Constants.DELIVERY_NOTE_SERIES, companyName)));
            document.setCardCode((String) orderRecords.get(0)[1]);
            String commentOV = (String) orderRecords.get(0)[6];
            if (commentOV != null) {
                //limitando caracteres no mayores a 254 para que lo acepte SAP
                String commentWms = "Orden #" + orderNumber + " creada por " + userName + " desde WALI.";
                if ((commentOV.length() + commentWms.length() - 254) > 0) {
                    document.setComments(commentOV.substring(0, commentOV.length() - (commentOV.length() + commentWms.length() - 251)) + "..." + commentWms);
                } else {
                    document.setComments(commentOV + "." + commentWms);
                }
            } else {
                document.setComments("Orden #" + orderNumber + " creada por " + userName + " desde WALI.");
            }
            document.setUtotcaj(0.0);
            document.setUvrdeclarado((BigDecimal) orderRecords.get(0)[7]);
            document.setUnunfac(orderNumber.toString());
        }

        for (Object[] row : orderRecords) {
            String itemCode = (String) row[2];
            Integer quantity = (Integer) row[3];
            Integer binAbs = (Integer) row[4];
            String binCode = (String) row[5];
            orderDocEntry = (Integer) row[8];

            if (orderDocEntry == null || orderDocEntry <= 0) {
                return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-2, "Ocurrió un error al consultar el docEntry de la orden. ")).build();
            }

            DeliveryDTO.DocumentLines.DocumentLine line = new DeliveryDTO.DocumentLines.DocumentLine();
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
                line.setDocumentLinesBinAllocations(new ArrayList<DeliveryDTO.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation>());

                items.put(itemCode, line);
            } else {
                //Si el item ya se agrego a la orden
                line = items.get(itemCode);
                line.setQuantity(line.getQuantity() + quantity.doubleValue());
            }

            boolean quantityAdded = false;
            for (DeliveryDTO.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation binAllocation : line.getDocumentLinesBinAllocations()) {
                if (binAllocation.getBinAbsEntry().equals(binAbs.longValue())) {
                    binAllocation.setQuantity(binAllocation.getQuantity() + quantity.doubleValue());
                    quantityAdded = true;
                    break;
                }
            }

            if (!quantityAdded) {
                DeliveryDTO.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation binAllocation = new DeliveryDTO.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation();
                binAllocation.setAllowNegativeQuantity(Constants.SAP_STATUS_NO);
                binAllocation.setBaseLineNumber(line.getLineNum());
                binAllocation.setBinAbsEntry(binAbs.longValue());
                binAllocation.setQuantity(quantity.doubleValue());
                line.getDocumentLinesBinAllocations().add(binAllocation);
            }
        }

        List<DeliveryDTO.DocumentLines.DocumentLine> itemsList = new ArrayList<>(items.values());
        itemsList.sort(new Comparator<DeliveryDTO.DocumentLines.DocumentLine>() {
            @Override
            public int compare(DeliveryDTO.DocumentLines.DocumentLine o1, DeliveryDTO.DocumentLines.DocumentLine o2) {
                return o1.getLineNum().compareTo(o2.getLineNum());
            }
        });

        document.setDocumentLines(itemsList);

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
        Long docNum = -1L;
        String errorMessage = null;
        if (sessionId != null) {
            try {
                Gson gson = new Gson();
                String JSON = gson.toJson(document);
                CONSOLE.log(Level.INFO, JSON);
                docNum = createDeliveryNoteService(document, sessionId);
                CONSOLE.log(Level.INFO, "Se creo la entrega con DocNum={0}", docNum);
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
        if (docNum > 0) {
            return Response.ok(new ResponseDTO(0, docNum)).build();
        } else {
            return Response.ok(new ResponseDTO(-1, "Ocurrio un error al crear la entrega. " + errorMessage)).build();
        }
    }

    @POST
    @Path("express")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response createDeliveryNote(PickingExpressOrderDTO dto,
                                       @HeaderParam("X-Company-Name") String companyName,
                                       @HeaderParam("X-Employee") String userName,
                                       @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Creando documento de entrega para la orden {0}", dto.getOrderSAP());

        List<Object[]> packingRecords = deliveryNoteFacade.listRecords(dto.getOrderSAP(), companyName.contains("VARROC") ? "13" : "01", companyName, pruebas);
        if (packingRecords.isEmpty()) {
            CONSOLE.log(Level.SEVERE, "No se encontraron registros para crear entrega de la orden {0}", dto.getOrderSAP());
            return Response.ok(new ResponseDTO(-2, "No se encontraron registros para crear entrega de la orden " + dto.getOrderSAP())).build();
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
            CONSOLE.log(Level.SEVERE, "Sin items pendientes para crear entrega automatica a la orden {0}", dto.getOrderSAP());
            return Response.ok(new ResponseDTO(-2, "Sin items pendientes para crear entrega automatica a la orden " + dto.getOrderSAP())).build();
        }

        HashMap<String, DeliveryDTO.DocumentLines.DocumentLine> items = new HashMap<>();
        DeliveryDTO document = new DeliveryDTO();
        Integer orderDocEntry = null;
        Integer orderNumber = (Integer) packingRecords.get(0)[0];

        if (orderDocEntry == null) {
            document.setSeries(Long.parseLong(getPropertyValue(Constants.DELIVERY_NOTE_SERIES, companyName)));
            document.setCardCode((String) packingRecords.get(0)[1]);
            String commentOV = (String) packingRecords.get(0)[6];
            if (commentOV != null) {
                //limitando caracteres no mayores a 254 para que lo acepte SAP
                String commentWms = "Orden #" + orderNumber + " creada por " + userName + " desde WALI.";
                if ((commentOV.length() + commentWms.length() - 254) > 0) {
                    document.setComments(commentOV.substring(0, commentOV.length() - (commentOV.length() + commentWms.length() - 251)) + "..." + commentWms);
                } else {
                    document.setComments(commentOV + "." + commentWms);
                }
            } else {
                document.setComments("Orden #" + orderNumber + " creada por " + userName + " desde WALI.");
            }
            document.setUtotcaj(0.0);
            document.setUvrdeclarado((BigDecimal) packingRecords.get(0)[7]);
            document.setUnunfac(orderNumber.toString());
        }

        for (Object[] row : itemsMissing) {
            String itemCode = (String) row[2];
            Integer quantity = (Integer) row[3];
            Integer binAbs = (Integer) row[4];
            String binCode = (String) row[5];
            orderDocEntry = (Integer) row[8];

            if (orderDocEntry == null || orderDocEntry <= 0) {
                return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-2, "Ocurrió un error al consultar el docEntry de la orden. ")).build();
            }

            DeliveryDTO.DocumentLines.DocumentLine line = new DeliveryDTO.DocumentLines.DocumentLine();
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
                line.setDocumentLinesBinAllocations(new ArrayList<DeliveryDTO.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation>());

                items.put(itemCode, line);
            } else {
                //Si el item ya se agrego a la orden
                line = items.get(itemCode);
                line.setQuantity(line.getQuantity() + quantity.doubleValue());
            }

            boolean quantityAdded = false;
            for (DeliveryDTO.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation binAllocation : line.getDocumentLinesBinAllocations()) {
                if (binAllocation.getBinAbsEntry().equals(binAbs.longValue())) {
                    binAllocation.setQuantity(binAllocation.getQuantity() + quantity.doubleValue());
                    quantityAdded = true;
                    break;
                }
            }

            if (!quantityAdded) {
                DeliveryDTO.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation binAllocation = new DeliveryDTO.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation();
                binAllocation.setAllowNegativeQuantity(Constants.SAP_STATUS_NO);
                binAllocation.setBaseLineNumber(line.getLineNum());
                binAllocation.setBinAbsEntry(binAbs.longValue());
                binAllocation.setQuantity(quantity.doubleValue());
                line.getDocumentLinesBinAllocations().add(binAllocation);
            }
        }

        List<DeliveryDTO.DocumentLines.DocumentLine> itemsList = new ArrayList<>(items.values());
        itemsList.sort(new Comparator<DeliveryDTO.DocumentLines.DocumentLine>() {
            @Override
            public int compare(DeliveryDTO.DocumentLines.DocumentLine o1, DeliveryDTO.DocumentLines.DocumentLine o2) {
                return o1.getLineNum().compareTo(o2.getLineNum());
            }
        });

        //TODO: Listar items de la orden serializada que proviene de modula.
        if (dto.getOrderMDL() != null) {
            List<Object[]> itemsMDL = deliveryNoteFacade.listRecords(dto.getOrderMDL(), "30", companyName, pruebas);
            if (itemsMDL.isEmpty()) {
                CONSOLE.log(Level.SEVERE, "No se encontraron registros para crear entrega de la orden {0}", dto.getOrderMDL());
                return Response.ok(new ResponseDTO(-2, "No se encontraron registros para crear entrega de la orden " + dto.getOrderMDL())).build();
            }

            for (Object[] obj : itemsMDL) {
                Integer qtyMDL = (Integer) obj[3];
                Integer binAbsMDL = (Integer) obj[4];
                Integer docEntryMDL = (Integer) obj[8];
                Integer baseLineNumMDL = (Integer) obj[9];

                DeliveryDTO.DocumentLines.DocumentLine lineMDL = new DeliveryDTO.DocumentLines.DocumentLine();
                lineMDL.setLineNum((long) itemsList.size());
                lineMDL.setItemCode((String) obj[2]);
                lineMDL.setQuantity(qtyMDL.doubleValue());
                lineMDL.setWarehouseCode("30");
                lineMDL.setBaseLine(baseLineNumMDL.longValue());
                lineMDL.setBaseEntry(docEntryMDL.longValue());
                lineMDL.setBaseType(Long.parseLong(getPropertyValue(Constants.SALES_ORDER_SERIES, companyName)));
                lineMDL.setDocumentLinesBinAllocations(new ArrayList<DeliveryDTO.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation>());

                DeliveryDTO.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation binAllocationMDL = new DeliveryDTO.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation();
                binAllocationMDL.setAllowNegativeQuantity(Constants.SAP_STATUS_NO);
                binAllocationMDL.setBaseLineNumber((long) itemsList.size());
                binAllocationMDL.setBinAbsEntry(binAbsMDL.longValue());
                binAllocationMDL.setQuantity(qtyMDL.doubleValue());
                lineMDL.getDocumentLinesBinAllocations().add(binAllocationMDL);

                itemsList.add(lineMDL);
            }
        }
        document.setDocumentLines(itemsList);

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
        Long docNum = -1L;
        String errorMessage = null;
        if (sessionId != null) {
            try {
                Gson gson = new Gson();
                String JSON = gson.toJson(document);
                CONSOLE.log(Level.INFO, JSON);
                docNum = createDeliveryNoteService(document, sessionId);
                CONSOLE.log(Level.INFO, "Se creo la entrega con DocNum={0}", docNum);
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
        if (docNum > 0) {
            return Response.ok(new ResponseDTO(0, docNum)).build();
        } else {
            return Response.ok(new ResponseDTO(-1, "Ocurrio un error al crear la entrega. " + errorMessage)).build();
        }
    }

    @POST
    @Path("magnum")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response createDeliveryNoteMagnum(DeliveryNoteMagnumDTO dto,
                                             @HeaderParam("X-Company-Name") String companyName,
                                             @HeaderParam("X-Employee") String userName,
                                             @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Iniciando creacion de entrega para las ordenes de magnum");

        List<Object[]> orderRecords = deliveryNoteFacade.listRecords(dto.getDocNum(), dto.getWhsCode(), companyName, pruebas);
        if (orderRecords.isEmpty()) {
            CONSOLE.log(Level.SEVERE, "No se encontraron registros para crear entrega de la orden {0}", dto.getDocNum());
            return Response.ok(new ResponseDTO(-2, "No se encontraron registros para crear entrega de la orden " + dto.getDocNum())).build();
        }

        HashMap<String, DeliveryDTO.DocumentLines.DocumentLine> items = new HashMap<>();
        DeliveryDTO document = new DeliveryDTO();
        Integer orderDocEntry = null;
        Integer orderNumber = (Integer) orderRecords.get(0)[0];

        if (orderDocEntry == null) {
            document.setSeries(Long.parseLong(getPropertyValue(Constants.DELIVERY_NOTE_SERIES, companyName)));
            document.setCardCode((String) orderRecords.get(0)[1]);
            String commentOV = (String) orderRecords.get(0)[6];
            if (commentOV != null) {
                //limitando caracteres no mayores a 254 para que lo acepte SAP
                String commentWms = "Orden #" + orderNumber + " creada por " + userName + " desde WALI.";
                if ((commentOV.length() + commentWms.length() - 254) > 0) {
                    document.setComments(commentOV.substring(0, commentOV.length() - (commentOV.length() + commentWms.length() - 251)) + "..." + commentWms);
                } else {
                    document.setComments(commentOV + "." + commentWms);
                }
            } else {
                document.setComments("Orden #" + orderNumber + " creada por " + userName + " desde WALI.");
            }
            document.setUvrdeclarado(dto.getVrlDeclarad());
            document.setUnunfac(orderNumber.toString());
            document.setUtransp(dto.getTransport());
            document.setUtotlios(dto.getLioQty());
            document.setUpesobruto(dto.getPesoQty());
            document.setUdespachoContado(dto.getStatusOrder());
            document.setUvlrfle(dto.getVlrFlete());
            document.setUseparador(userName);
        }

        for (Object[] row : orderRecords) {
            String itemCode = (String) row[2];
            Integer quantity = (Integer) row[3];
            Integer binAbs = (Integer) row[4];
            String binCode = (String) row[5];
            orderDocEntry = (Integer) row[8];

            if (orderDocEntry == null || orderDocEntry <= 0) {
                return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-2, "Ocurrió un error al consultar el docEntry de la orden. ")).build();
            }

            DeliveryDTO.DocumentLines.DocumentLine line = new DeliveryDTO.DocumentLines.DocumentLine();
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
                line.setDocumentLinesBinAllocations(new ArrayList<DeliveryDTO.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation>());

                items.put(itemCode, line);
            } else {
                //Si el item ya se agrego a la orden
                line = items.get(itemCode);
                line.setQuantity(line.getQuantity() + quantity.doubleValue());
            }

            boolean quantityAdded = false;
            for (DeliveryDTO.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation binAllocation : line.getDocumentLinesBinAllocations()) {
                if (binAllocation.getBinAbsEntry().equals(binAbs.longValue())) {
                    binAllocation.setQuantity(binAllocation.getQuantity() + quantity.doubleValue());
                    quantityAdded = true;
                    break;
                }
            }

            if (!quantityAdded) {
                DeliveryDTO.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation binAllocation = new DeliveryDTO.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation();
                binAllocation.setAllowNegativeQuantity(Constants.SAP_STATUS_NO);
                binAllocation.setBaseLineNumber(line.getLineNum());
                binAllocation.setBinAbsEntry(binAbs.longValue());
                binAllocation.setQuantity(quantity.doubleValue());
                line.getDocumentLinesBinAllocations().add(binAllocation);
            }
        }

        List<DeliveryDTO.DocumentLines.DocumentLine> itemsList = new ArrayList<>(items.values());
        itemsList.sort(new Comparator<DeliveryDTO.DocumentLines.DocumentLine>() {
            @Override
            public int compare(DeliveryDTO.DocumentLines.DocumentLine o1, DeliveryDTO.DocumentLines.DocumentLine o2) {
                return o1.getLineNum().compareTo(o2.getLineNum());
            }
        });

        document.setDocumentLines(itemsList);

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
        Long docNum = -1L;
        String errorMessage = null;
        if (sessionId != null) {
            try {
                Gson gson = new Gson();
                String JSON = gson.toJson(document);
                CONSOLE.log(Level.INFO, JSON);
                docNum = createDeliveryNoteService(document, sessionId);
                CONSOLE.log(Level.INFO, "Se creo la entrega con DocNum={0}", docNum);
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
        if (docNum > 0) {
            return Response.ok(new ResponseDTO(0, docNum)).build();
        } else {
            return Response.ok(new ResponseDTO(-1, "Ocurrio un error al crear la entrega. " + errorMessage)).build();
        }
    }

    private Long createDeliveryNoteService(DeliveryDTO document, String sessionId) {
        DeliveryRestDTO res = null;
        try {
            res = service.addDeliveryNote(document, sessionId);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error retornando la respuesta de la creacion de la entrega. ", e);
            return -1l;
        }
        return res.getDocNum();
    }

    private String getPropertyValue(String propertyName, String companyName) {
        return IGBUtils.getProperParameter(appBean.obtenerValorPropiedad(propertyName), companyName);
    }
}