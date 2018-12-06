package co.igb.rest;

import co.igb.b1ws.client.deliverynote.Add;
import co.igb.b1ws.client.deliverynote.AddResponse;
import co.igb.b1ws.client.deliverynote.DeliveryNotesService;
import co.igb.b1ws.client.deliverynote.Document;
import co.igb.b1ws.client.deliverynote.MsgHeader;
import co.igb.dto.AutoPackDTO;
import co.igb.dto.CompanyDTO;
import co.igb.dto.PackingDTO;
import co.igb.dto.PackingListRecordDTO;
import co.igb.dto.ResponseDTO;
import co.igb.dto.UserDTO;
import co.igb.dto.ValidatePackingItemResponseDTO;
import co.igb.ejb.EmailManager;
import co.igb.ejb.IGBApplicationBean;
import co.igb.ejb.IGBAuthLDAP;
import co.igb.ejb.PDFManager;
import co.igb.persistence.entity.PackingListRecord;
import co.igb.persistence.entity.PackingOrder;
import co.igb.persistence.entity.PackingOrderItem;
import co.igb.persistence.entity.PackingOrderItemBin;
import co.igb.persistence.facade.BinLocationFacade;
import co.igb.persistence.facade.CustomerFacade;
import co.igb.persistence.facade.ItemFacade;
import co.igb.persistence.facade.PackingListRecordFacade;
import co.igb.persistence.facade.PackingOrderFacade;
import co.igb.persistence.facade.SalesOrderFacade;
import co.igb.util.Constants;
import co.igb.util.IGBUtils;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.File;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static co.igb.b1ws.client.deliverynote.Document.DocumentLines.DocumentLine;
import static co.igb.b1ws.client.deliverynote.Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations;
import static co.igb.b1ws.client.deliverynote.Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation;

/**
 * @author dbotero
 */
@Stateless
@Path("packing")
public class PackingREST implements Serializable {

    private static final Logger CONSOLE = Logger.getLogger(PackingREST.class.getSimpleName());

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
    @Inject
    private IGBApplicationBean appBean;
    @Inject
    private PDFManager pdfManager;
    @Inject
    private EmailManager emailManager;

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
                                                    @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Listando clientes con registros de packing pendientes");
        List<Object[]> customers = poFacade.listCustomersWithOpenRecords(companyName, pruebas);
        CONSOLE.log(Level.INFO, "Se obtuvieron {0} clientes con ordenes de empaque abiertas", customers.size());
        return Response.ok(new ResponseDTO(0, customers)).build();
    }

    @GET
    @Path("orders/{customerId}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listCustomerOrders(@PathParam("customerId") String customerId,
                                       @HeaderParam("X-Company-Name") String companyName,
                                       @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Listando ordenes de packing abiertas para el cliente {0}", customerId);
        List<Object[]> orders = poFacade.listCustomerOrders(customerId, companyName, pruebas);
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
        record.setIdPackingOrder(packingRecord.getIdPackingOrder());
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
    @Path("items/{idPackingOrder}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listPackingOrderItems(@PathParam("idPackingOrder") Long idPackingOrder,
                                          @HeaderParam("X-Company-Name") String companyName,
                                          @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Retornando items para la packing order #{0}", idPackingOrder);
        List<Object[]> items = poFacade.listOrderItems(idPackingOrder, companyName, pruebas);
        CONSOLE.log(Level.INFO, "Se encontraron {0} items para la packing list", items.size());
        return Response.ok(new ResponseDTO(0, items)).build();
    }

    @POST
    @Path("delivery")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    @SuppressWarnings("null")
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

        HashMap<String, DocumentLine> items = new HashMap<>();
        Document document = new Document();
        Integer orderDocEntry = null;
        for (Object[] row : packingRecords) {
            Integer idPackingListRecord = (Integer) row[0];
            Integer idPackingList = (Integer) row[1];
            Integer orderNumber = (Integer) row[2];
            String customerId = (String) row[3];
            String customerName = (String) row[4];
            Date packingDate = (Date) row[5];
            //Integer idPackingOrder = (Integer)row[6];
            String itemCode = (String) row[7];
            String itemName = (String) row[8];
            Integer quantity = (Integer) row[9];
            Integer binAbs = (Integer) row[10];
            String binCode = (String) row[11];
            Integer boxNumber = (Integer) row[12];
            String status = (String) row[13];
            String employee = (String) row[14];
            //String companyName = (String)row[14];

            if (orderDocEntry == null) {
                document.setSeries(Long.parseLong(getPropertyValue(Constants.DELIVERY_NOTE_SERIES, companyName)));
                document.setCardCode(customerId);
                String commentOV = salesOrderFacade.getOrderComment(orderNumber, companyName, pruebas);
                if (commentOV != null) {
                    /*TODO: limitando caracteres no mayores a 254 para que lo acepte SAP*/
                    String commentWms = "Packing de la orden " + orderNumber + " creada por " + employee;
                    if ((commentOV.length() + commentWms.length() - 254) > 0) {
                        document.setComments(commentOV.substring(0, commentOV.length() - (commentOV.length() + commentWms.length() - 251)) + "..." + commentWms);
                    } else {
                        document.setComments(commentOV + "." + commentWms);
                    }
                } else {
                    document.setComments("Packing de la orden " + orderNumber + " creada por " + employee);
                }
                document.setUTOTCAJ(plFacade.getTotalBoxNumber(orderNumber, companyName, pruebas).doubleValue());
                document.setUVRDECLARADO(salesOrderFacade.getValorDeclarado(orderNumber, companyName, pruebas));
                orderDocEntry = salesOrderFacade.getOrderDocEntry(orderNumber, companyName, pruebas);
                if (orderDocEntry == null || orderDocEntry <= 0) {
                    return Response.status(Response.Status.BAD_REQUEST).entity(new ResponseDTO(-1, "Ocurrió un error al consultar los datos de la orden. ")).build();
                }
            }

            DocumentLine line;
            if (!items.containsKey(itemCode)) {
                //Si el item no se ha agregado a la orden
                line = new DocumentLine();
                line.setLineNum((long) items.size());
                line.setItemCode(itemCode);
                line.setQuantity(quantity.doubleValue());
                line.setWarehouseCode(binCode.substring(0, 2));

                try {
                    Long baseLineNum = salesOrderFacade.getLineNum(orderNumber, itemCode, companyName, pruebas);
                    if (baseLineNum < 0) {
                        return Response.ok(new ResponseDTO(-1, "Ocurrio un error al consultar el numero de linea de la orden (baseLine). Es posible que la orden de venta ya se haya cerrado")).build();
                    }
                    line.setBaseLine(baseLineNum);
                } catch (Exception e) {
                    return Response.ok(new ResponseDTO(-1, e.getMessage())).build();
                }

                line.setBaseEntry(orderDocEntry.longValue());
                line.setBaseType(Long.parseLong(getPropertyValue(Constants.SALES_ORDER_SERIES, companyName)));
                line.setDocumentLinesBinAllocations(new DocumentLinesBinAllocations());

                items.put(itemCode, line);
            } else {
                //Si el item ya se agrego a la orden
                line = items.get(itemCode);
                line.setQuantity(line.getQuantity() + quantity.doubleValue());
            }

            boolean quantityAdded = false;
            for (DocumentLinesBinAllocation binAllocation : line.getDocumentLinesBinAllocations().getDocumentLinesBinAllocation()) {
                if (binAllocation.getBinAbsEntry().equals(binAbs.longValue())) {
                    binAllocation.setQuantity(binAllocation.getQuantity() + quantity.doubleValue());
                    quantityAdded = true;
                    break;
                }
            }

            if (!quantityAdded) {
                DocumentLinesBinAllocation binAllocation = new DocumentLinesBinAllocation();
                binAllocation.setAllowNegativeQuantity(Constants.SAP_STATUS_NO);
                binAllocation.setBaseLineNumber(line.getLineNum());
                binAllocation.setBinAbsEntry(binAbs.longValue());
                binAllocation.setQuantity(quantity.doubleValue());
                line.getDocumentLinesBinAllocations().getDocumentLinesBinAllocation().add(binAllocation);
            }
        }

        Document.DocumentLines documentLines = new Document.DocumentLines();
        List<DocumentLine> itemsList = new ArrayList<>(items.values());
        itemsList.sort(new Comparator<DocumentLine>() {
            @Override
            public int compare(DocumentLine o1, DocumentLine o2) {
                return o1.getLineNum().compareTo(o2.getLineNum());
            }
        });

        documentLines.getDocumentLine().addAll(itemsList);
        document.setDocumentLines(documentLines);

        logDocument(document);

        //1. Login
        String sessionId = null;
        try {
            sessionId = sapFunctions.login(companyName);
            CONSOLE.log(Level.INFO, "Se inicio sesion en DI Server satisfactoriamente. SessionID={0}", sessionId);
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
            sapFunctions.logout(sessionId);
        }
        //4. Validar y retornar
        if (docEntry > 0) {
            return Response.ok(new ResponseDTO(0, docEntry)).build();
        } else {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new ResponseDTO(-1, "Ocurrio un error al crear la entrega. " + errorMessage)).build();
        }
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
        for (DocumentLine line : document.getDocumentLines().getDocumentLine()) {
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
            for (DocumentLinesBinAllocation binAllocation : line.getDocumentLinesBinAllocations().getDocumentLinesBinAllocation()) {
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

    private String getPropertyValue(String propertyName, String companyName) {
        return IGBUtils.getProperParameter(appBean.obtenerValorPropiedad(propertyName), companyName);
    }

    @PUT
    @Path("close/{username}/{idPackingOrder}")
    @Produces("application/pdf")
    public Response closePackingOrder(@PathParam("username") String username,
                                      @PathParam("idPackingOrder") Integer idPackingOrder,
                                      @HeaderParam("X-Company-Name") String companyName,
                                      @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Cerrando packing orden {0}", username);
        //Cierra los registros de packing abiertos
        plFacade.closePackingOrder(username, companyName, pruebas);
        boolean orderComplete = poFacade.isPackingOrderComplete(idPackingOrder, companyName, pruebas);
        //Se cierra la orden de packing
        poFacade.closePackingOrder(idPackingOrder, companyName, pruebas);

        List<PackingListRecordDTO> records = parseRecords(
                plFacade.listRecords(idPackingOrder, companyName, pruebas, false));

        String companyReportName = null;
        List<CompanyDTO> companies = appBean.listCompanies();
        for (CompanyDTO company : companies) {
            if (company.getCompanyId().equals(companyName)) {
                companyReportName = company.getCompanyName();
                break;
            }
        }

        String fileName = String.valueOf(System.currentTimeMillis());
        File file = pdfManager.createPackingListPdf(idPackingOrder.toString(), fileName, companyReportName, records);

        try {
            UserDTO userDto = ldapUtil.getUserInfo(username);
            CONSOLE.log(Level.INFO, "Enviando correo al empleado {0} -> {1}", new Object[]{userDto.getCompleteName(), userDto.getEmail()});
            emailManager.sendWithAttachment(file.getAbsolutePath(), fileName + ".pdf", userDto.getCompleteName(), userDto.getEmail());
            //TODO: parametrizar ubicacion PDF
        } catch (Exception e) {
            CONSOLE.log(Level.INFO, "Enviando correo a sistemas, ya que ocurrio un error al cargar los datos del empleado {0}", username);
            emailManager.sendWithAttachment(
                    file.getAbsolutePath(),
                    fileName + ".pdf",
                    username,
                    appBean.obtenerValorPropiedad(Constants.EMAIL_BCC_PACKING_ERROR));
        }

        Response.ResponseBuilder response = Response.ok(file);
        response.header("Content-Disposition", "attachment; filename=" + fileName + ".pdf");
        return response.build();
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
                responseInvoice = (ResponseDTO) invoiceREST.createDraft(((Long) responseDelivery.getContent()).intValue(), companyName, employee, pruebas).getEntity();
            } else if (documentType != null && documentType.equals("invoice")) {
                responseInvoice = (ResponseDTO) invoiceREST.createInvoice(((Long) responseDelivery.getContent()).intValue(), companyName, employee, pruebas).getEntity();
            } else {
                CONSOLE.log(Level.SEVERE, "La empresa no tiene configurado el tipo de documento (borrador o factura) que se debe crear");
                return Response.ok(new ResponseDTO(-1, "La empresa no tiene configurado el tipo de documento (borrador o factura) que se debe crear")).build();
            }
            if (responseInvoice.getCode() != 0) {
                return Response.ok(responseInvoice).build();
            }

            //TODO:
            //cerrar OV si queda con items pendientes
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
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al cancelar el proceso de packing " + idPackingOrder, e);
        }

        return Response.ok(new ResponseDTO(0, "")).build();
    }
}
