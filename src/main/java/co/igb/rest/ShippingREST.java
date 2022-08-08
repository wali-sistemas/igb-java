package co.igb.rest;

import co.igb.dto.*;
import co.igb.ejb.IGBApplicationBean;
import co.igb.persistence.entity.ShippingOrder;
import co.igb.persistence.facade.*;
import co.igb.transportws.dto.ola.GuiaOlaDTO;
import co.igb.transportws.dto.ola.GuiaOlaResponseDTO;
import co.igb.transportws.dto.rapidoochoa.GuiaDTO;
import co.igb.transportws.dto.rapidoochoa.GuiaResponseDTO;
import co.igb.transportws.ejb.OlaEJB;
import co.igb.transportws.ejb.RapidoochoaEJB;
import co.igb.transportws.ejb.SaferboEJB;
import co.igb.util.Constants;
import com.google.gson.Gson;

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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
@Path("shipping")
public class ShippingREST implements Serializable {
    private static final Logger CONSOLE = Logger.getLogger(ShippingREST.class.getSimpleName());

    @Inject
    private IGBApplicationBean appBean;
    @EJB
    private InvoiceFacade invoiceFacade;
    @EJB
    private ShippingOrderFacade shippingOrderFacade;
    @EJB
    private DeliveryNoteFacade deliveryNoteFacade;
    @EJB
    private CheckOutOrderFacade checkOutOrderFacade;
    @EJB
    private RapidoochoaEJB rapidoochoaEJB;
    @EJB
    private SaferboEJB saferboEJB;
    @EJB
    private TranspFacade transpFacade;
    @EJB
    private OlaEJB olaEJB;

    @POST
    @Path("add")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response addShipping(ShippingDTO shippingDTO,
                                @HeaderParam("X-Company-Name") String companyName,
                                @HeaderParam("X-Employee") String userName,
                                @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Iniciando proceso de shipping para la factura #[" + shippingDTO.getInvoice() + "]");
        Integer entrega = invoiceFacade.getDocNumDelivery(shippingDTO.getInvoice(), companyName, pruebas);
        Integer order = null;
        if (entrega != null) {
            order = deliveryNoteFacade.getDocNumSalesOrder(entrega, companyName, pruebas);
        }

        ShippingOrder entity = new ShippingOrder();
        entity.setOrderNumber(order);
        entity.setDeliveryNumber(entrega);
        entity.setInvoiceNumber(Integer.parseInt(shippingDTO.getInvoice()));
        entity.setBoxSumShipping(shippingDTO.getBoxSum());
        //TODO: Estado cerrado por default
        entity.setStatus(Constants.STATUS_CLOSED);
        entity.setEmpId(userName);
        entity.setCompanyName(companyName);
        entity.setDatetimeShipping(new Date());

        Object[] infoShipping = invoiceFacade.getShippingInformation(entity.getInvoiceNumber(), companyName, pruebas);
        if (infoShipping == null) {
            return Response.ok(new ResponseDTO(-1, "No encontro informacion de shipping para la factura #" + entity.getInvoiceNumber().toString())).build();
        }

        entity.setAddressShipping((String) infoShipping[0]);
        entity.setCityShipping((String) infoShipping[1]);
        entity.setDepartmentShipping((String) infoShipping[2]);
        entity.setPhoneNumber((String) infoShipping[3]);
        entity.setWeightNumber((Integer) infoShipping[4]);
        entity.setDeclaredValueNumber((Integer) infoShipping[5]);
        entity.setGuideShipping((String) infoShipping[6]);
        entity.setCommentShipping((String) infoShipping[7]);
        entity.setTransportName((String) infoShipping[8]);

        try {
            shippingOrderFacade.create(entity, companyName, pruebas);
            CONSOLE.log(Level.INFO, "Shiping creado para la factura #" + shippingDTO.getInvoice());
            /***Actualizar campo shipping en factura SAP***/
            invoiceFacade.updateFieldShipping(entity.getInvoiceNumber(), companyName, pruebas);
            return Response.ok(new ResponseDTO(0, "Shipping creado.")).build();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error creando el shipping para la factura #" + shippingDTO.getInvoice(), e);
            return Response.ok(-1, "Ocurrio un error creando el shipping para la factura #" + shippingDTO.getInvoice()).build();
        }
    }

    @POST
    @Path("list-invoices")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response findInvoicesShipping(InvoiceDTO invoiceDTO,
                                         @HeaderParam("X-Company-Name") String companyName,
                                         @HeaderParam("X-Pruebas") boolean pruebas,
                                         @HeaderParam("X-Warehouse-Code") String warehouseCode) {
        CONSOLE.log(Level.INFO, "Listando facturas para realizar shipping de la empresa [" + companyName + "]");
        List<Object[]> listInvoices = invoiceFacade.findListInvoicesShipping(invoiceDTO.getTransport(), invoiceDTO.getDocNum(), companyName, warehouseCode, pruebas);
        List<InvoiceDTO> shipping = new ArrayList<>();

        if (listInvoices == null) {
            return Response.ok(new ResponseDTO(-1, "No se encontraron facturas pendientes para shipping.")).build();
        }

        for (Object[] row : listInvoices) {
            InvoiceDTO dto = new InvoiceDTO();
            dto.setDocDate((Date) row[0]);
            dto.setBox((Integer) row[1]);
            dto.setDocNum((String) row[2]);
            dto.setCardCode((String) row[3]);
            dto.setCardName((String) row[4]);
            dto.setTransport((String) row[5]);
            dto.setStreet((String) row[6]);
            dto.setDepart((String) row[7]);
            dto.setCity((String) row[8]);
            dto.setCodCity((String) row[9]);
            dto.setValStandDecl((BigDecimal) row[10]);
            dto.setUnidEmpStand((Integer) row[11]);

            shipping.add(dto);
        }
        return Response.ok(new ResponseDTO(0, shipping)).build();
    }

    @GET
    @Path("list-transport")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response getListTransportInvoice(@HeaderParam("X-Company-Name") String companyName,
                                            @HeaderParam("X-Pruebas") boolean pruebas) {
        List<String> trans = invoiceFacade.getListTransport(companyName, pruebas);
        return Response.ok(new ResponseDTO(trans == null ? -1 : 0, trans)).build();
    }

    @GET
    @Path("list-transp-payroll")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response getListTranspPayroll(@HeaderParam("X-Company-Name") String companyName,
                                         @HeaderParam("X-Pruebas") boolean pruebas) {
        List<String> trans = shippingOrderFacade.listTransPayroll(companyName, pruebas);
        return Response.ok(new ResponseDTO(trans == null ? -1 : 0, trans)).build();
    }

    @GET
    @Path("detail-container/{invoice}/{box}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response getDetailContainer(@PathParam("invoice") String docNum,
                                       @PathParam("box") Integer box,
                                       @HeaderParam("X-Company-Name") String companyName,
                                       @HeaderParam("X-Pruebas") boolean pruebas) {
        if (docNum == null || docNum.isEmpty() || box == null || box < 0) {
            CONSOLE.log(Level.SEVERE, "Sin datos para realizar la consulta.");
            return Response.ok(new ResponseDTO(-1, "Sin datos para realizar la consulta.")).build();
        }

        Integer delivery = invoiceFacade.getDocNumDelivery(docNum, companyName, pruebas);
        if (delivery == null) {
            CONSOLE.log(Level.SEVERE, "No se encontro la entrega en SAP para la factura #[" + docNum + "].");
            return Response.ok(new ResponseDTO(-1, "No se encontro la entrega en SAP.")).build();
        }

        List<Object[]> detailBox = checkOutOrderFacade.getListItemsBox(delivery, box, companyName, pruebas);
        if (detailBox == null || detailBox.size() <= 0) {
            CONSOLE.log(Level.SEVERE, "No existe registro en check-out para la entrega #[" + delivery.toString() + "].");
            return Response.ok(new ResponseDTO(-1, "No existe registro en check-out.")).build();
        }

        return Response.ok(new ResponseDTO(0, detailBox)).build();
    }

    @GET
    @Path("list-destination-ola")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listDestinationOla(@HeaderParam("X-Company-Name") String companyName,
                                       @HeaderParam("X-Pruebas") boolean pruebas) {
        return Response.ok(new ResponseDTO(0, olaEJB.listDestinations(companyName))).build();
    }

    @POST
    @Path("add-guia-saferbo")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response createGuiaSaferbo(ApiSaferboDTO dto,
                                      @HeaderParam("X-Company-Name") String companyName,
                                      @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Iniciando creacion de guia con la transportadora Saferbo");

        ResponseCrearGuiaDTO response = saferboEJB.createGuia(dto);
        if (!response.getNumeroGuia().isEmpty() || !response.getNumeroGuia().equals(null)) {
            CONSOLE.log(Level.INFO, "Creación de guia saferbo exitosa #{0}", response.getNumeroGuia());

            //Actualizar en las facturas de SAP la guia campo
            try {
                invoiceFacade.updateGuiaTransport(dto.getFactura(), response.getNumeroGuia(), "", companyName, pruebas);
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al actualizar la guia en SAP para la empresa " + companyName, e);
            }

            return Response.ok(new ResponseDTO(0, response.getNumeroGuia())).build();
        } else {
            CONSOLE.log(Level.SEVERE, response.getNumeroGuia());
            return Response.ok(new ResponseDTO(-1, "Ocurrio un error al crear la guia para la transportadora saferbo.")).build();
        }
    }

    @POST
    @Path("add-guia-rapidoochoa/{docNum}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response createGuiaRapidoochoa(GuiaDTO dto,
                                          @PathParam("docNum") String docNum,
                                          @HeaderParam("X-Company-Name") String companyName,
                                          @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Iniciando creacion de guia con la transportadora Rapidoochoa");

        Integer serie = transpFacade.getSerieStart(02, companyName, pruebas);
        serie++;
        dto.setNmImpresionRemesa(serie.toString());

        Gson gson = new Gson();
        String JSON = gson.toJson(dto);
        CONSOLE.log(Level.INFO, JSON);

        GuiaResponseDTO res = rapidoochoaEJB.createGuia(dto);
        if (res.getStatus().equals(200)) {
            try {
                invoiceFacade.updateGuiaTransport(docNum, res.getValores().getNumeroGuia(), res.getValores().getLinkImpresion(), companyName, pruebas);
                transpFacade.updateSerieLast(02, serie, companyName, pruebas);
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al actualizar el nro de guia en la factura #{0} para {1}", new Object[]{docNum, companyName});
            }
            CONSOLE.log(Level.INFO, "Creacion exitosa de guia #{0} con la transportadora Rapidoochoa", res.getValores().getIdGuia());
            return Response.ok(new ResponseDTO(0, res.getValores().getLinkImpresion())).build();
        } else {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error creando la guia con la transportadora Rapidoochoa");
            return Response.ok(new ResponseDTO(-1, "Ocurrio un error creando la guia con la transportadora Rapidoochoa")).build();
        }
    }

    @POST
    @Path("add-guia-ola/{docNum}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response createGuiaOla(GuiaOlaDTO dto,
                                  @PathParam("docNum") String docNum,
                                  @HeaderParam("X-Company-Name") String companyName,
                                  @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Iniciando creacion de guia con la transportadora Ola");

        Gson gson = new Gson();
        String JSON = gson.toJson(dto);
        CONSOLE.log(Level.INFO, JSON);

        GuiaOlaResponseDTO res = olaEJB.generateGuia(dto, companyName);
        if (res.getStatus().equals("OK")) {
            String urlGuia = olaEJB.printGuia(res.getData().getNumeroenvio(), companyName);
            if (urlGuia != null) {
                try {
                    invoiceFacade.updateGuiaTransport(docNum, res.getData().getNumeroenvio(), urlGuia, companyName, pruebas);
                    String urlRotulo = olaEJB.printRotulo(res.getData().getNumeroenvio(), companyName);
                    if (urlGuia != null) {
                        CONSOLE.log(Level.INFO, "Creacion exitosa de guia #{0} con la transportadora Ola", res.getData().getNumeroenvio());
                        return Response.ok(new ResponseDTO(0, new Object[]{urlGuia, urlRotulo})).build();
                    } else {
                        CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando los rotulos para la guia #" + res.getData().getNumeroenvio() + "de la trasnportadora Ola");
                        return Response.ok(new ResponseDTO(0, new Object[]{urlGuia, null})).build();
                    }
                } catch (Exception e) {
                    CONSOLE.log(Level.SEVERE, "Ocurrio un error al actualizar el nro de guia en la factura #{0} para {1}", new Object[]{docNum, companyName});
                    return Response.ok(new ResponseDTO(-1, "Ocurrio un error al actualizar el nro de guia en la factura " + docNum)).build();
                }
            } else {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error imprimiendo el rotulo para la guia #{0} trasnportadora Ola", res.getData().getNumeroenvio());
                return Response.ok(new ResponseDTO(-1, "Ocurrio un error imprimiendo el rotulo para la guia " + res.getData())).build();
            }
        } else {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error creando la guia con la transportadora Rapidoochoa");
            return Response.ok(new ResponseDTO(-1, "Ocurrio un error creando la guia con la transportadora Rapidoochoa")).build();
        }
    }
}