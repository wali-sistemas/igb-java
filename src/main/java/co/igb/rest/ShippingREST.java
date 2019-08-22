package co.igb.rest;

import co.igb.dto.InvoiceDTO;
import co.igb.dto.ResponseDTO;
import co.igb.dto.ShippingDTO;
import co.igb.persistence.entity.ShippingOrder;
import co.igb.persistence.facade.*;
import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;
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

    @EJB
    private InvoiceFacade invoiceFacade;
    @EJB
    private ShippingOrderFacade shippingOrderFacade;
    @EJB
    private DeliveryNoteFacade deliveryNoteFacade;
    @EJB
    private CheckOutOrderFacade checkOutOrderFacade;

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
            CONSOLE.log(Level.SEVERE, "Ocurrio un error creando el shipping para la factura #" + shippingDTO.getInvoice());
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
                                         @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Listando facturas para realizar shipping de la empresa [" + companyName + "]");
        List<Object[]> listInvoices = invoiceFacade.findListInvoicesShipping(invoiceDTO.getTransport(), invoiceDTO.getDocNum(), companyName, pruebas);
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
}