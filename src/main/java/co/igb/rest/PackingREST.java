package co.igb.rest;

import co.igb.dto.*;
import co.igb.ejb.EmailManager;
import co.igb.ejb.IGBApplicationBean;
import co.igb.ejb.IGBAuthLDAP;
import co.igb.ejb.PDFManager;
import co.igb.hanaws.client.deliveryNotes.DeliveryClient;
import co.igb.hanaws.dto.deliveryNotes.DeliveryDTO;
import co.igb.hanaws.dto.deliveryNotes.DeliveryRestDTO;
import co.igb.persistence.entity.*;
import co.igb.persistence.facade.*;
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
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dbotero
 */
@Stateless
@Path("packing")
public class PackingREST implements Serializable {
    private static final Logger CONSOLE = Logger.getLogger(PackingREST.class.getSimpleName());
    private DeliveryClient service;
    @EJB
    private PackingOrderFacade poFacade;
    @EJB
    private PackingListRecordFacade plFacade;
    @EJB
    private CustomerFacade cFacade;
    @EJB
    private BinLocationFacade blFacade;
    @EJB
    private SalesOrderFacade salesOrderFacade;
    @EJB
    private BasicSAPFunctions sapFunctions;
    @EJB
    private InvoiceREST invoiceREST;
    @EJB
    private ItemFacade itemFacade;
    @EJB
    private IGBAuthLDAP ldapUtil;
    @EJB
    private DeliveryNoteFacade deliveryNoteFacade;
    @EJB
    private CheckOutOrderFacade checkOutOrderFacade;
    @Inject
    private IGBApplicationBean appBean;
    @Inject
    private PDFManager pdfManager;
    @Inject
    private EmailManager emailManager;

    @PostConstruct
    private void initialize() {
        try {
            service = new DeliveryClient(Constants.HANAWS_SL_URL);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la instancia de DeliveryServiceLayer. ", e);
        }
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listPackingRecords(@HeaderParam("X-Company-Name") String companyName,
                                       @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Listando registros de packing");
        List<PackingDTO> list = poFacade.listOpen(companyName, pruebas);
        CONSOLE.log(Level.INFO, "Se obtuvieron {0} registros de packing. {1}", new Object[]{list.size(), Arrays.toString(list.toArray())});
        return Response.ok(new ResponseDTO(0, list)).build();
    }

    @GET
    @Path("customers")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listCustomersWithPackingRecords(@HeaderParam("X-Company-Name") String companyName,
                                                    @HeaderParam("X-Warehouse-Code") String warehouseCode,
                                                    @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Listando clientes con registros de packing pendientes");
        List<Object[]> customers = poFacade.listCustomersWithOpenRecords(companyName, warehouseCode, pruebas);
        CONSOLE.log(Level.INFO, "Se obtuvieron {0} clientes con ordenes de empaque abiertas", customers.size());
        return Response.ok(new ResponseDTO(0, customers)).build();
    }

    @GET
    @Path("orders/{customerId}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listCustomerOrders(@PathParam("customerId") String customerId,
                                       @HeaderParam("X-Company-Name") String companyName,
                                       @HeaderParam("X-Warehouse-Code") String warehouseCode,
                                       @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Listando ordenes de packing abiertas para el cliente {0}", customerId);
        List<Object[]> orders = poFacade.listCustomerOrders(customerId, warehouseCode, companyName, pruebas);
        CONSOLE.log(Level.INFO, "Se obtuvieron {0} ordenes de empaque abiertas para el cliente {1}", new Object[]{orders.size(), customerId});
        return Response.ok(new ResponseDTO(0, orders)).build();
    }

    @GET
    @Path("bin/{orderNumber}/{binCode}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response validateBinCode(@PathParam("orderNumber") Integer orderNumber,
                                    @PathParam("binCode") String binCode,
                                    @HeaderParam("X-Company-Name") String companyName,
                                    @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Listando items por ubicacion y orden ");
        if (binCode == null) {
            return Response.ok(new ResponseDTO(-1, "El código de la ubicación es obligatorio")).build();
        }
        Integer items = poFacade.countItemsOnBin(binCode, orderNumber, companyName, pruebas);
        CONSOLE.log(Level.INFO, "Se obtuvieron {0} items para la orden {1} y ubicacion {2}", new Object[]{items, orderNumber, binCode});
        return Response.ok(new ResponseDTO(0, items)).build();
    }

    @GET
    @Path("item/{orderNumber}/{binCode}/{itemCode}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response validateItemCode(@PathParam("orderNumber") Integer orderNumber,
                                     @PathParam("itemCode") String itemCode,
                                     @PathParam("binCode") String binCode,
                                     @HeaderParam("X-Company-Name") String companyName,
                                     @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Validando item {0} en orden {1} y ubicacion {2} ", new Object[]{itemCode, orderNumber, binCode});

        if (binCode == null) {
            return Response.ok(new ResponseDTO(-1, "El código de la ubicación es obligatorio")).build();
        }

        Integer items = poFacade.validateItemOnBin(itemCode, binCode, orderNumber, companyName, pruebas);
        String itemName = itemFacade.getItemName(itemCode, companyName, pruebas);
        if (items > 0) {
            CONSOLE.log(Level.INFO, "El item existe en la orden {0} y ubicacion {1}", new Object[]{orderNumber, binCode});
            return Response.ok(new ResponseDTO(0, new ValidatePackingItemResponseDTO(itemName, items))).build();
        } else {
            CONSOLE.log(Level.SEVERE, "El item {0} no se encuentra pendiente por packing para la orden {1} y ubicacion {2}", new Object[]{itemCode, orderNumber, binCode});
            return Response.ok(new ResponseDTO(-1, null)).build();
        }
    }

    @POST
    @Path("pack")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response addToPackingList(PackingListRecordDTO packingRecord,
                                     @HeaderParam("X-Company-Name") String companyName,
                                     @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Agregando item a packing list {0}", packingRecord);

        //Valida el estado de la orden. Si esta cerrada, informa el error
        String orderStatus = salesOrderFacade.getOrderStatus(packingRecord.getOrderNumber(), companyName, pruebas);
        if (orderStatus == null || !orderStatus.equals(Constants.SAP_STATUS_OPEN)) {
            return Response.ok(new ResponseDTO(-2, "La órden no se encuentra abierta y por lo tanto no se puede proceder con el proceso de packing")).build();
        }

        PackingListRecord record = new PackingListRecord();
        if (packingRecord.getIdPackingList() == null || packingRecord.getIdPackingList() == 0) {
            record.setIdPackingList(plFacade.getNextPackingListId(companyName, pruebas));
            if (record.getIdPackingList() == 0) {
                return Response.ok(new ResponseDTO(-1, "Ocurrió un error al guardar el registro. ")).build();
            }
        } else {
            record.setIdPackingList(packingRecord.getIdPackingList());
        }

        if (packingRecord.getBinAbs() != null) {
            record.setBinAbs(packingRecord.getBinAbs());
        } else {
            record.setBinAbs(blFacade.getBinAbs(packingRecord.getBinCode(), companyName, pruebas).longValue());
        }

        record.setBinCode(packingRecord.getBinCode());
        record.setBoxNumber(packingRecord.getBoxNumber());
        record.setCustomerId(packingRecord.getCustomerId());
        record.setEmployee(packingRecord.getEmployee());

        if (packingRecord.getCustomerName() != null) {
            record.setCustomerName(packingRecord.getCustomerName());
        } else {
            record.setCustomerName(cFacade.getCustomerName(packingRecord.getCustomerId(), companyName, pruebas));
        }

        record.setDatetimePacked(new Date());
        record.setItemCode(packingRecord.getItemCode());
        record.setItemName(packingRecord.getItemName());
        record.setOrderNumber(packingRecord.getOrderNumber());
        record.setIdPackingOrder(new PackingOrder(packingRecord.getIdPackingOrder().longValue()));
        record.setQuantity(packingRecord.getQuantity());
        record.setStatus(Constants.STATUS_OPEN);
        record.setCompanyName(companyName);

        try {
            plFacade.create(record, companyName, pruebas);
            poFacade.updatePackedQuantity(record.getBinCode(), record.getItemCode(), record.getOrderNumber(), record.getQuantity(), companyName, pruebas);
            return Response.ok(new ResponseDTO(0, record)).build();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al crear el registro. ", e);
            return Response.ok(new ResponseDTO(-1, "Ocurrió un error al crear el registro")).build();
        }
    }

    @GET
    @Path("list/{username}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listOpenPackingJobs(@PathParam("username") String username,
                                        @HeaderParam("X-Company-Name") String companyName,
                                        @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Listando procesos de packing abiertos para el empleado {0}", username);
        List<Object[]> records = plFacade.listOpenPackingRecords(username, companyName, pruebas);
        CONSOLE.log(Level.INFO, "Se encontraron {0} entradas de registro de packing abiertas para el empleado", records.size());
        return Response.ok(new ResponseDTO(0, records)).build();
    }

    @GET
    @Path("list-boxes/{username}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listBoxesUsed(@PathParam("username") String username,
                                  @HeaderParam("X-Company-Name") String companyName,
                                  @HeaderParam("X-Pruebas") boolean pruebas) {
        return Response.ok(new ResponseDTO(0, plFacade.listBoxesUsedPackingRecords(username, companyName, pruebas))).build();
    }

    @GET
    @Path("items/{idPackingOrder}/{orderNumber}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listPackingOrderItems(@PathParam("idPackingOrder") Long idPackingOrder,
                                          @PathParam("orderNumber") Integer orderNumber,
                                          @HeaderParam("X-Company-Name") String companyName,
                                          @HeaderParam("X-Pruebas") boolean pruebas) {
        if (orderNumber != null) {
            //Validando si la orden ya tiene entrega en SAP
            Integer delivery = deliveryNoteFacade.getDocNumDeliveryNote(orderNumber, companyName, pruebas);
            if (delivery > 0) {
                try {
                    //Se procede a cerrar el packing list en MySql
                    poFacade.closePackingOrder(idPackingOrder.intValue(), companyName, pruebas);
                } catch (Exception e) {
                    CONSOLE.log(Level.WARNING, "Ocurrio una excepcion cerrando la orden #" + idPackingOrder.toString() + " en " + companyName, e);
                }

                CONSOLE.log(Level.WARNING, "Ya existe una entrega en SAP para la orden #{0}", orderNumber.toString());
                return Response.ok(new ResponseDTO(0, "Ya existe una entrega en SAP para la orden #" + orderNumber.toString())).build();
            } else {
                //Validando si la orden se encuentra cerrada o cancelada
                if (salesOrderFacade.getOrderStatus(orderNumber, companyName, pruebas).equals("C")) {
                    //Se procede a cerrar el packing list en MySql
                    poFacade.closePackingOrder(idPackingOrder.intValue(), companyName, pruebas);

                    CONSOLE.log(Level.WARNING, "La orden #{0} ya se encuentra cerrada en SAP.", orderNumber.toString());
                    return Response.ok(new ResponseDTO(0, "La orden " + orderNumber.toString() + " ya se encuentra cerrada en SAP")).build();
                } else {
                    CONSOLE.log(Level.INFO, "Retornando items para la packing order #{0}", idPackingOrder);
                    List<Object[]> items = poFacade.listOrderItems(idPackingOrder, companyName, pruebas);
                    List<Object[]> listItems = new ArrayList<>();

                    for (Object[] obj : items) {
                        listItems.add(new Object[]{obj[0], obj[1], obj[2], obj[3], obj[4], obj[5], obj[6], null, null});
                    }

                    CONSOLE.log(Level.INFO, "Se encontraron {0} items para la packing list", items.size());
                    return Response.ok(new ResponseDTO(1, listItems)).build();
                }
            }
        } else {
            CONSOLE.log(Level.SEVERE, "No se encontraron datos para la packing list #" + idPackingOrder.toString());
            return Response.ok(new ResponseDTO(-1, "No se encontraron datos para la packing list #" + idPackingOrder.toString())).build();
        }
    }

    @POST
    @Path("deliveryV1")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response createDeliveryNote(Integer idPackingOrder,
                                       @HeaderParam("X-Company-Name") String companyName,
                                       @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Creando documento de entrega para packing orden {0}", idPackingOrder);

        List<Object[]> packingRecords = plFacade.listRecords(idPackingOrder, companyName, pruebas, true);
        if (packingRecords.isEmpty()) {
            return Response.ok(new ResponseDTO(-1, "No se encontraron registros de packing pendientes por entregar")).build();
        }

        //Valida el estado de la orden. Si esta cerrada, informa el error
        String orderStatus = salesOrderFacade.getOrderStatus((Integer) packingRecords.get(0)[2], companyName, pruebas);
        if (orderStatus == null || !orderStatus.equals(Constants.SAP_STATUS_OPEN)) {
            return Response.ok(new ResponseDTO(-2, "La órden no se encuentra abierta y por lo tanto no se puede proceder con el proceso de packing")).build();
        }

        HashMap<String, DeliveryDTO.DocumentLines.DocumentLine> items = new HashMap<>();
        DeliveryDTO document = new DeliveryDTO();
        Integer orderDocEntry = null;
        for (Object[] row : packingRecords) {
            Integer orderNumber = (Integer) row[2];
            String customerId = (String) row[3];
            String itemCode = (String) row[7];
            Integer quantity = (Integer) row[9];
            Integer binAbs = (Integer) row[10];
            String binCode = (String) row[11];
            String employee = (String) row[14];

            if (orderDocEntry == null) {
                document.setSeries(Long.parseLong(getPropertyValue(Constants.DELIVERY_NOTE_SERIES, companyName)));
                document.setCardCode(customerId);
                String commentOV = salesOrderFacade.getOrderComment(orderNumber, companyName, pruebas);
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
                document.setUtotcaj(plFacade.getTotalBoxNumber(orderNumber, companyName, pruebas).doubleValue());
                document.setUvrdeclarado(salesOrderFacade.getValorDeclarado(orderNumber, companyName, pruebas));
                document.setUnunfac(orderNumber.toString());
                orderDocEntry = salesOrderFacade.getOrderDocEntry(orderNumber, companyName, pruebas);
                if (orderDocEntry == null || orderDocEntry <= 0) {
                    return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-1, "Ocurrió un error al consultar los datos de la orden. ")).build();
                }
            }

            DeliveryDTO.DocumentLines.DocumentLine line = new DeliveryDTO.DocumentLines.DocumentLine();
            if (!items.containsKey(itemCode)) {
                //Si el item no se ha agregado a la orden
                line.setLineNum((long) items.size());
                line.setItemCode(itemCode);
                line.setQuantity(quantity.doubleValue());
                line.setWarehouseCode(binCode.substring(0, 2));

                try {
                    Long baseLineNum = salesOrderFacade.getLineNum(orderNumber, itemCode, companyName, pruebas);
                    if (baseLineNum < 0) {
                        return Response.ok(new ResponseDTO(-1, "Ocurrio un error al consultar el numero de linea de la orden (baseLine) para el ítem [" + itemCode + "]. Es posible que la orden de compra ya se haya cerrado")).build();
                    }
                    line.setBaseLine(baseLineNum);
                } catch (Exception e) {
                    CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el numero de linea de la orden " + orderNumber.toString(), e);
                    return Response.ok(new ResponseDTO(-1, e.getMessage())).build();
                }

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
                docNum = createDeliveryNote(document, sessionId);
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
            //return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new ResponseDTO(-1, "Ocurrio un error al crear la entrega. " + errorMessage)).build();
        }
    }

    @POST
    @Path("delivery")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response createDeliveryNoteV2(Integer idPackingOrder,
                                         @HeaderParam("X-Company-Name") String companyName,
                                         @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Creando documento de entrega para packing orden {0}", idPackingOrder);

        List<Object[]> packingRecords = plFacade.listRecords(idPackingOrder, companyName, pruebas, true);
        if (packingRecords.isEmpty()) {
            return Response.ok(new ResponseDTO(-1, "No se encontraron registros de packing pendientes por entregar")).build();
        }
        //Valida el estado de la orden. Si esta cerrada, informa el error
        String orderStatus = salesOrderFacade.getOrderStatus((Integer) packingRecords.get(0)[2], companyName, pruebas);
        if (orderStatus == null || !orderStatus.equals(Constants.SAP_STATUS_OPEN)) {
            return Response.ok(new ResponseDTO(-2, "La órden no se encuentra abierta y por lo tanto no se puede proceder con el proceso de packing")).build();
        }

        DeliveryDTO document = new DeliveryDTO();

        Integer orderDocEntry = null;
        Integer orderNumber = (Integer) packingRecords.get(0)[2];
        String customerId = (String) packingRecords.get(0)[3];
        String employee = (String) packingRecords.get(0)[14];
        String commentOV = salesOrderFacade.getOrderComment(orderNumber, companyName, pruebas);

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
        //Encabezado
        document.setSeries(Long.parseLong(getPropertyValue(Constants.DELIVERY_NOTE_SERIES, companyName)));
        document.setCardCode(customerId);
        document.setUtotcaj(plFacade.getTotalBoxNumber(orderNumber, companyName, pruebas).doubleValue());
        document.setUvrdeclarado(salesOrderFacade.getValorDeclarado(orderNumber, companyName, pruebas));
        document.setUnunfac(orderNumber.toString());

        orderDocEntry = salesOrderFacade.getOrderDocEntry(orderNumber, companyName, pruebas);
        if (orderDocEntry == null || orderDocEntry <= 0) {
            return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-1, "Ocurrió un error al consultar los datos de la orden. ")).build();
        }

        List<DeliveryDTO.DocumentLines.DocumentLine> itemsList = new ArrayList<>();
        List<DeliveryDTO.DocumentLines.DocumentLine.DocumentLinesBinAllocations> binsList = new ArrayList<>();
        for (Object[] row : packingRecords) {
            DeliveryDTO.DocumentLines.DocumentLine line = new DeliveryDTO.DocumentLines.DocumentLine();
            String itemCode = (String) row[7];
            Integer quantity = (Integer) row[9];
            Integer binAbs = (Integer) row[10];
            String binCode = (String) row[11];

            try {
                Long baseLineNum = salesOrderFacade.getLineNum(orderNumber, itemCode, companyName, pruebas);
                if (baseLineNum < 0) {
                    return Response.ok(new ResponseDTO(-1, "Ocurrio un error al consultar el numero de linea de la orden (baseLine) para el ítem [" + itemCode + "]. Es posible que la orden de compra ya se haya cerrado")).build();
                }
                line.setBaseLine(baseLineNum);
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el numero de linea de la orden " + orderNumber.toString(), e);
                return Response.ok(new ResponseDTO(-1, e.getMessage())).build();
            }

            //Detalle
            line.setLineNum((long) itemsList.size());
            line.setItemCode(itemCode);
            line.setQuantity(quantity.doubleValue());
            line.setWarehouseCode(binCode.substring(0, 2));
            line.setBaseEntry(orderDocEntry.longValue());
            line.setBaseType(Long.parseLong(getPropertyValue(Constants.SALES_ORDER_SERIES, companyName)));
            line.setDocumentLinesBinAllocations(new ArrayList<DeliveryDTO.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation>());

            //Ubicacion
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
            itemsList.add(line);
        }

        document.setDocumentLines(itemsList);

        /***Agregando gastos de flete en la entrega, solo para motozone***/
        if (companyName.contains("VARROC")) {
            Object[] dataBills = salesOrderFacade.getBillsByOrder(orderNumber, companyName, pruebas);
            if (dataBills != null) {
                Integer docEntry = (Integer) dataBills[0];
                BigDecimal lineTotalFlet = (BigDecimal) dataBills[1];
                String taxCodeFlet = (String) dataBills[2];
                Integer lineNumFlet = (Integer) dataBills[3];
                Integer objTypeFlet = (Integer) dataBills[4];

                List<DeliveryDTO.DocumentAdditionalExpenses.DocumentAdditionalExpense> gastos = new ArrayList<>();
                DeliveryDTO.DocumentAdditionalExpenses.DocumentAdditionalExpense gasto = new DeliveryDTO.DocumentAdditionalExpenses.DocumentAdditionalExpense();
                switch (taxCodeFlet) {
                    case "IVAG19":
                        gasto.setExpenseCode(6l);//flete
                        break;
                    case "IVAEXCLU":
                        gasto.setExpenseCode(2l);//flete no gravados
                        break;
                }

                gasto.setBaseDocEntry(docEntry.longValue());
                gasto.setBaseDocType(objTypeFlet);
                gasto.setBaseDocLine(lineNumFlet);
                gasto.setBaseDocumentReference(orderNumber);
                gasto.setTaxCode(taxCodeFlet);
                gasto.setLineTotal(lineTotalFlet.setScale(0, RoundingMode.CEILING));
                gastos.add(gasto);

                document.setDocumentAdditionalExpenses(gastos);
            }
        }

        Gson gson = new Gson();
        String JSON = gson.toJson(document);
        CONSOLE.log(Level.INFO, JSON);

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
                docNum = createDeliveryNote(document, sessionId);
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
            //return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new ResponseDTO(-1, "Ocurrio un error al crear la entrega. " + errorMessage)).build();
        }
    }

    private Long createDeliveryNote(DeliveryDTO document, String sessionId) {
        DeliveryRestDTO res = null;
        try {
            res = service.addDeliveryNote(document, sessionId);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error retornando la respuesta de la creacion de la entrega. ", e.getMessage());
            return -1l;
        }
        return res.getDocNum();
    }

    private String getPropertyValue(String propertyName, String companyName) {
        return IGBUtils.getProperParameter(appBean.obtenerValorPropiedad(propertyName), companyName);
    }

    @PUT
    @Path("close/{username}/{idPackingOrder}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    public Response closePackingOrder(@PathParam("username") String username,
                                      @PathParam("idPackingOrder") Integer idPackingOrder,
                                      @HeaderParam("X-Company-Name") String companyName,
                                      @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Cerrando packing orden #{0} asignada al usuario {1} en [{2}]", new Object[]{idPackingOrder.toString(), username, companyName});

        try {
            //Cierra los registros de packing abiertos MySql
            plFacade.closePackingOrder(idPackingOrder, companyName, pruebas);
        } catch (Exception e) {
            CONSOLE.log(Level.WARNING, "Ocurrio una excepcion cerrando los registros de packing abiertos para la orden #" + idPackingOrder + " asignada al usuario " + username + " en " + companyName, e);
        }

        if (!poFacade.isPackingOrderComplete(idPackingOrder, companyName, pruebas)) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar si la orden de packing #{0} se encuentra completa", idPackingOrder.toString());
            return Response.ok(new ResponseDTO(-1, "Ocurrio un error al consultar si la orden de packing #" + idPackingOrder.toString() + "se encuentra completa.")).build();
        }

        try {
            //Se cierra la orden de packing MySql
            poFacade.closePackingOrder(idPackingOrder, companyName, pruebas);
        } catch (Exception e) {
            CONSOLE.log(Level.WARNING, "Ocurrio una excepcion cerrando la orden #" + idPackingOrder.toString() + " asignada al usuario " + username + " en " + companyName, e);
            return Response.ok(new ResponseDTO(-1, e.getMessage())).build();
        }
        return Response.ok(new ResponseDTO(0, "Packing orden cerrada.")).build();
    }

    private List<PackingListRecordDTO> parseRecords(List<Object[]> rows) {
        List<PackingListRecordDTO> records = new ArrayList<>();
        for (Object[] row : rows) {
            int col = 0;
            Long id = ((Integer) row[col++]).longValue();
            Integer idPackingList = (Integer) row[col++];
            Integer orderNumber = (Integer) row[col++];
            String customerId = (String) row[col++];
            String customerName = (String) row[col++];
            Date datetimePacked = (Date) row[col++];
            Integer idPackingOrder = (Integer) row[col++];
            String itemCode = (String) row[col++];
            String itemName = (String) row[col++];
            Integer quantity = (Integer) row[col++];
            Long binAbs = ((Integer) row[col++]).longValue();
            String binCode = (String) row[col++];
            Integer boxNumber = (Integer) row[col++];
            String status = (String) row[col++];
            String employee = (String) row[col++];
            String companyName = (String) row[col++];

            PackingListRecordDTO record = new PackingListRecordDTO();
            record.setBinAbs(binAbs);
            record.setBinCode(binCode);
            record.setBoxNumber(boxNumber);
            //record.setCompanyName(companyName);
            record.setCustomerId(customerId);
            record.setCustomerName(customerName);
            record.setDatetimePacked(datetimePacked);
            record.setEmployee(employee);
            //record.setId(id);
            record.setIdPackingList(idPackingList);
            record.setIdPackingOrder(idPackingOrder);
            record.setItemCode(itemCode);
            record.setItemName(itemName);
            record.setOrderNumber(orderNumber);
            record.setQuantity(quantity);
            record.setStatus(status);

            records.add(record);
        }
        return records;
    }

    @GET
    @Path("status")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    public Response arePackingOrdersComplete(@HeaderParam("X-Employee") String username,
                                             @HeaderParam("X-Company-Name") String companyName,
                                             @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Validando estado de packing para empleado {0}", username);
        return Response.ok(new ResponseDTO(0, poFacade.arePackingOrdersComplete(username, companyName, pruebas))).build();
    }

    @POST
    @Path("autopack")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response autoPack(AutoPackDTO autoPackDTO,
                             @HeaderParam("X-Company-Name") String companyName,
                             @HeaderParam("X-Pruebas") boolean pruebas,
                             @HeaderParam("X-Employee") String employee) {
        CONSOLE.log(Level.INFO, "Iniciando proceso de empaque automatico.");
        if (autoPackDTO == null) {
            CONSOLE.log(Level.SEVERE, "No se enviaron los datos para realizar el cierre (authPackDTO == null)");
            return Response.ok(new ResponseDTO(-1, "No se enviaron los datos para realizar el cierre")).build();
        }

        CONSOLE.log(Level.INFO, "Cliente: {0}, Sales order: {1}",
                new Object[]{autoPackDTO.getCustomerId(), autoPackDTO.getOrderNumber() != null ? autoPackDTO.getOrderNumber() : "todas"});

        if (companyName == null || companyName.trim().isEmpty()) {
            CONSOLE.log(Level.SEVERE, "No se enviaron los datos para realizar el cierre (companyName == null)");
            return Response.ok(new ResponseDTO(-1, "No se enviaron los datos para realizar el cierre")).build();
        }
        if (employee == null || employee.trim().isEmpty()) {
            CONSOLE.log(Level.SEVERE, "No se enviaron los datos para realizar el cierre (employee == null)");
            return Response.ok(new ResponseDTO(-1, "No se enviaron los datos para realizar el cierre")).build();
        }

        if (autoPackDTO.getCustomerId() == null) {
            CONSOLE.log(Level.SEVERE, "No se enviaron los datos para realizar el cierre (customerId == null)");
            return Response.ok(new ResponseDTO(-1, "No se enviaron los datos para realizar el cierre")).build();
        }

        //cargar datos de ordenes de packing
        List<PackingOrder> packingOrders = poFacade.listOrders(autoPackDTO.getCustomerId(), autoPackDTO.getOrderNumber(), companyName, pruebas);
        if (packingOrders == null || packingOrders.isEmpty()) {
            CONSOLE.log(Level.SEVERE, "La packing order no existe o no se encuentra abierta");
            return Response.ok(new ResponseDTO(-1, "La packing order no existe o no se encuentra abierta")).build();
        }
        CONSOLE.log(Level.INFO, "Procesando {0} ordenes de packing", packingOrders.size());

        //crear registros de packing para cada item/bin
        for (PackingOrder order : packingOrders) {
            Integer idPackingList = null;
            String customerName = null;
            for (PackingOrderItem item : order.getItems()) {
                for (PackingOrderItemBin itemBin : item.getBins()) {
                    //agregar registro de packing solo si faltan items por empacar
                    if (itemBin.getPackedQty() < itemBin.getPickedQty()) {
                        PackingListRecordDTO recordDto = new PackingListRecordDTO();
                        recordDto.setBinAbs(itemBin.getBinAbs());
                        recordDto.setBinCode(itemBin.getBinCode());
                        recordDto.setBoxNumber(1);
                        recordDto.setCustomerId(autoPackDTO.getCustomerId());
                        recordDto.setCustomerName(customerName);
                        recordDto.setDatetimePacked(new Date());
                        recordDto.setEmployee(employee);
                        recordDto.setIdPackingList(idPackingList);
                        recordDto.setIdPackingOrder(order.getId().intValue());
                        recordDto.setItemCode(item.getItemCode());
                        recordDto.setOrderNumber(order.getOrderNumber());
                        recordDto.setQuantity(itemBin.getPickedQty() - itemBin.getPackedQty());

                        ResponseDTO res = (ResponseDTO) this.addToPackingList(recordDto, companyName, pruebas).getEntity();
                        CONSOLE.log(Level.INFO, "  -> Packing record creado. Status: {0}", res.getCode());
                        if (res.getCode() != 0) {
                            return Response.ok(res).build();
                        }
                        if (idPackingList == null) {
                            PackingListRecord record = (PackingListRecord) res.getContent();
                            idPackingList = record.getIdPackingList();
                            customerName = record.getCustomerName();
                        }
                    }
                }
            }

            //generar entrega
            CONSOLE.log(Level.INFO, "Creando documento de entrega para la orden de packing #{0}", order.getId());
            ResponseDTO responseDelivery = (ResponseDTO) this.createDeliveryNote(order.getId().intValue(), companyName, pruebas).getEntity();
            if (responseDelivery.getCode() != 0) {
                return Response.ok(responseDelivery).build();
            }

            //cerrar packing order
            CONSOLE.log(Level.INFO, "Cerrando orden de packing #{0}", order.getId());
            ResponseDTO res = (ResponseDTO) this.closePackingOrder(employee, order.getId().intValue(), companyName, pruebas).getEntity();
            if (res.getCode() != 0) {
                return Response.ok(res).build();
            }

            //generar factura/borrador de factura
            CONSOLE.log(Level.INFO, "Creando factura/borrador de factura para entrega con docEntry={0}", responseDelivery.getContent());
            ResponseDTO responseInvoice = null;

            String documentType = IGBUtils.getProperParameter(appBean.obtenerValorPropiedad("igb.invoice.type"), companyName);
            CONSOLE.log(Level.INFO, "La empresa {0} usa el tipo de document {1}", new Object[]{companyName, documentType});
            if (documentType != null && documentType.equals("draft")) {
                //responseInvoice = (ResponseDTO) invoiceREST.createDraft(((Long) responseDelivery.getContent()).intValue(), companyName, employee, pruebas).getEntity();
            } else if (documentType != null && documentType.equals("invoice")) {
                responseInvoice = (ResponseDTO) invoiceREST.createInvoice(((Long) responseDelivery.getContent()).intValue(), companyName, employee, pruebas).getEntity();
            } else {
                CONSOLE.log(Level.SEVERE, "La empresa no tiene configurado el tipo de documento (borrador o factura) que se debe crear");
                return Response.ok(new ResponseDTO(-1, "La empresa no tiene configurado el tipo de documento (borrador o factura) que se debe crear")).build();
            }
            if (responseInvoice.getCode() != 0) {
                return Response.ok(responseInvoice).build();
            }
        }

        return Response.ok(new ResponseDTO(0, "Proceso de empaque automatico finalizado con éxito")).build();
    }

    @GET
    @Path("get-packing-orders/{customer}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    public Response getPackingOrders(@PathParam("customer") String customer,
                                     @HeaderParam("X-Company-Name") String companyName,
                                     @HeaderParam("X-Pruebas") boolean pruebas) {
        List<Object[]> customers = poFacade.listAllPackings(customer, companyName, pruebas);
        return Response.ok(new ResponseDTO(0, customers)).build();
    }

    @PUT
    @Path("cancel/{idPackingOrder}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response cleanPackingProcess(@PathParam("idPackingOrder") Integer idPackingOrder,
                                        @HeaderParam("X-Company-Name") String companyName,
                                        @HeaderParam("X-Pruebas") boolean pruebas,
                                        @HeaderParam("X-Employee") String username) {
        CONSOLE.log(Level.WARNING, "Cancelando proceso de packing para packingOrder {0}", idPackingOrder);
        try {
            //cerrar packing records
            plFacade.closePackingOrder(idPackingOrder, companyName, pruebas);
            CONSOLE.log(Level.WARNING, "--- Los packing records fueron cerrados");
            //consultar y cerrar packing order
            poFacade.closePackingOrder(idPackingOrder, companyName, pruebas);
            CONSOLE.log(Level.WARNING, "--- La orden de packing fue cerrada");
            //enviar correo de notificacion a sistemas y logistica
            PackingOrder packingOrder = poFacade.find(idPackingOrder.longValue(), companyName, pruebas);
            emailManager.sendPackingErrorNotification(packingOrder.getOrderNumber(), username);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al cancelar el proceso de packing " + idPackingOrder.toString(), e);
        }

        return Response.ok(new ResponseDTO(0, "")).build();
    }

    @PUT
    @Path("cancel-packing-order/{idPackingOrder}")
    @Produces({MediaType.APPLICATION_JSON + ";chaset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response cancelPackingOrder(@PathParam("idPackingOrder") Integer idPackingOrder,
                                       @HeaderParam("X-Company-Name") String companyName,
                                       @HeaderParam("X-Pruebas") boolean pruebas,
                                       @HeaderParam("X-Employee") String username) {
        try {
            List<Integer> items = poFacade.listIdOrderItems(idPackingOrder.longValue(), companyName, pruebas);
            for (Integer id : items) {
                //reiniciar el packedQty a 0
                poFacade.updatePackedQty(id, companyName, pruebas);
                //eliminar los registros de packing abiertos
                plFacade.deletePackingOrder(idPackingOrder, companyName, pruebas);
            }

            return Response.ok(new ResponseDTO(0, "Ok")).build();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al cancelar el proceso de packing " + idPackingOrder.toString(), e);
            return Response.ok(new ResponseDTO(-1, "Ocurrio un error al cancelar el proceso de packing.")).build();
        }
    }

    @GET
    @Path("get-detail-delivery/{orderNumber}")
    @Produces({MediaType.APPLICATION_JSON + ";chaset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response getDeatilDelivery(@PathParam("orderNumber") Integer orderNumber,
                                      @HeaderParam("X-Company-Name") String companyName,
                                      @HeaderParam("X-Pruebas") boolean pruebas) {
        Integer delivery = deliveryNoteFacade.getDocNumDeliveryNote(orderNumber, companyName, pruebas);
        if (delivery != null) {
            DeliveryNoteDTO deliveryNoteDTO = new DeliveryNoteDTO();
            deliveryNoteDTO.setDocNum(delivery);

            List detailDelivery = deliveryNoteFacade.getDetailDeliveryNoteData(delivery, companyName, pruebas);
            List<DeliveryNoteDTO.DeliveryNoteLineDTO> deliveryNoteLineDTO = new ArrayList<>();

            for (Object row : detailDelivery) {
                DeliveryNoteDTO.DeliveryNoteLineDTO dto = new DeliveryNoteDTO.DeliveryNoteLineDTO();
                dto.setItemCode((String) ((Object[]) row)[0]);
                dto.setQuantity((Integer) ((Object[]) row)[1]);
                dto.setOrderNumber((Integer) ((Object[]) row)[2]);
                deliveryNoteLineDTO.add(dto);
            }

            deliveryNoteDTO.setLines(deliveryNoteLineDTO);

            return Response.ok(deliveryNoteDTO).build();
        }
        return Response.ok(new ResponseDTO(-1, "Ocurrio un error consultando el número de la entrega.")).build();
    }

    @POST
    @Path("add-checkout-order")
    @Produces({MediaType.APPLICATION_JSON + ";chaset=utf-8"})
    @Consumes({MediaType.APPLICATION_JSON + ";chaset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response addCheckOutOrder(CheckOutDTO dto,
                                     @HeaderParam("X-Company-Name") String companyName,
                                     @HeaderParam("X-Pruebas") boolean pruebas) {
        if (dto.getOrderNumber() == null || dto.getOrderNumber() == 0) {
            CONSOLE.log(Level.SEVERE, "Numero de orden es obligatorio");
            return Response.ok(new ResponseDTO(-1, "Número de orden es obligatorio.")).build();
        }
        if (dto.getItemCode() == null || dto.getItemCode().isEmpty()) {
            CONSOLE.log(Level.SEVERE, "Codigo de articulo es obligatorio");
            return Response.ok(new ResponseDTO(-1, "Código de artículo es obligatorio.")).build();
        }

        CheckOutOrder checkOutOrder = new CheckOutOrder();
        checkOutOrder.setOrderNumber(dto.getOrderNumber());
        checkOutOrder.setDeliveryNumber(dto.getDeliveryNumber());
        checkOutOrder.setItemCode(dto.getItemCode());
        checkOutOrder.setQtyOrder(dto.getQtyOrder().longValue());
        checkOutOrder.setQtyScan(dto.getQtyScan().longValue());
        checkOutOrder.setStatus(Constants.STATUS_OPEN);
        checkOutOrder.setEmpId(dto.getEmpId());
        checkOutOrder.setDatetime_checkout(new Date());
        checkOutOrder.setBoxNumber(dto.getBoxNumber());
        checkOutOrder.setCompanyName(companyName);
        checkOutOrder.setStartTime(dto.getStartTime());
        checkOutOrder.setEndTime(dto.getEndTime());

        try {
            checkOutOrderFacade.create(checkOutOrder, companyName, pruebas);
            CONSOLE.log(Level.INFO, "confirmado el checkout para la orden #", dto.getOrderNumber().toString());
            return Response.ok(new ResponseDTO(0, "CheckOut confirmado exitosamente.")).build();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error confirmando el checkout para la orden #" + dto.getOrderNumber().toString(), e);
            return Response.ok(new ResponseDTO(-1, "Ocurrio un error confirmando el checkout.")).build();
        }
    }

    @GET
    @Path("find-checkout/{orderNumber}")
    @Produces({MediaType.APPLICATION_JSON + ";chaset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response findCheckOut(@PathParam("orderNumber") String orderNumber,
                                 @HeaderParam("X-Company-Name") String companyName,
                                 @HeaderParam("X-Pruebas") boolean pruebas) {
        if (orderNumber == null || orderNumber.isEmpty()) {
            return Response.ok(new ResponseDTO(-1, "Sin datos para validar check-out.")).build();
        }
        Integer idCheckOut = checkOutOrderFacade.getIdCheckOut(orderNumber, companyName, pruebas);
        return Response.ok(new ResponseDTO(idCheckOut == 0 ? -1 : 0, idCheckOut)).build();
    }

    @GET
    @Path("find-orders-pending")
    @Produces({MediaType.APPLICATION_JSON + ";chaset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response findOrdersPendingByInvoice(@HeaderParam("X-Company-Name") String companyName,
                                               @HeaderParam("X-Pruebas") boolean pruebas) {
        List<Object[]> orders = salesOrderFacade.listPendingOrdersByInvoice(companyName, pruebas);
        return Response.ok(new ResponseDTO(orders == null ? -1 : 0, orders)).build();
    }
}