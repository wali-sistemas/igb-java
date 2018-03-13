package co.igb.rest;

import co.igb.dto.PackingDTO;
import co.igb.dto.PackingListRecordDTO;
import co.igb.persistence.entity.PackingListRecord;
import co.igb.persistence.entity.PackingOrder;
import co.igb.persistence.entity.PackingOrderItem;
import co.igb.persistence.entity.PackingOrderItemBin;
import co.igb.persistence.facade.BinLocationFacade;
import co.igb.persistence.facade.CustomerFacade;
import co.igb.persistence.facade.PackingListRecordFacade;
import co.igb.persistence.facade.PackingOrderFacade;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
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

    @POST
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response createPackingRecord(Long pickingId, @HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        CONSOLE.log(Level.INFO, "Probando creacion de nuevo registro de packing");
        //Creates packing record
        PackingOrder packing = new PackingOrder();
        packing.setCustomerId("1234");
        packing.setCustomerName("daniel");
        packing.setOrderNumber(9987);
        packing.setStatus("open");

        PackingOrderItem item = new PackingOrderItem();
        item.setItemCode("item1");

        List<PackingOrderItemBin> bins = new ArrayList<>();

        PackingOrderItemBin bin = new PackingOrderItemBin();
        bin.setBinAbs(12345L);
        bin.setBinCode("1234-5");
        bin.setPackingOrderItem(item);
        bin.setPickedQty(10);
        bin.setPackedQty(0);
        bins.add(bin);

        item.setBins(bins);
        item.setPackingOrder(packing);
        packing.getItems().add(item);

        try {
            poFacade.create(packing);
            return Response.ok(packing).build();
        } catch (Exception e) {
            return Response.ok(e).build();
        }

    }

    @GET
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listPackingRecords(@HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        CONSOLE.log(Level.INFO, "Listando registros de packing");
        List<PackingDTO> list = poFacade.listOpen(companyName);
        CONSOLE.log(Level.INFO, "Se obtuvieron {0} registros de packing. {1}", new Object[]{list.size(), Arrays.toString(list.toArray())});
        return Response.ok(new ResponseDTO(0, list)).build();
    }

    @GET
    @Path("customers")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listCustomersWithPackingRecords(@HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        CONSOLE.log(Level.INFO, "Listando clientes con registros de packing pendientes");
        List<Object[]> customers = poFacade.listCustomersWithOpenRecords(companyName);
        CONSOLE.log(Level.INFO, "Se obtuvieron {0} clientes con ordenes de empaque abiertas", customers.size());
        return Response.ok(new ResponseDTO(0, customers)).build();
    }

    @GET
    @Path("orders/{customerId}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listCustomerOrders(@PathParam("customerId") String customerId, @HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        CONSOLE.log(Level.INFO, "Listando ordenes de packing abiertas para el cliente {0}", customerId);
        List<Object[]> orders = poFacade.listCustomerOrders(customerId, companyName);
        CONSOLE.log(Level.INFO, "Se obtuvieron {0} ordenes de empaque abiertas para el cliente {1}", new Object[]{orders.size(), customerId});
        return Response.ok(new ResponseDTO(0, orders)).build();
    }

    @GET
    @Path("bin/{orderNumber}/{binCode}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response validateBinCode(@PathParam("orderNumber") Integer orderNumber, @PathParam("binCode") String binCode, @HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        CONSOLE.log(Level.INFO, "Listando items por ubicacion y orden ");
        Integer items = poFacade.countItemsOnBin(binCode, orderNumber, companyName);
        CONSOLE.log(Level.INFO, "Se obtuvieron {0} items para la orden {1} y ubicacion {2}", new Object[]{items, orderNumber, binCode});
        return Response.ok(new ResponseDTO(0, items)).build();
    }

    @GET
    @Path("item/{orderNumber}/{binCode}/{itemCode}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response validateItemCode(@PathParam("orderNumber") Integer orderNumber, @PathParam("itemCode") String itemCode,
            @PathParam("binCode") String binCode, @HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        CONSOLE.log(Level.INFO, "Listando items por ubicacion y orden ");
        Integer items = poFacade.validateItemOnBin(itemCode, binCode, orderNumber, companyName);
        CONSOLE.log(Level.INFO, "El item existe en la orden {0} y ubicacion {1}", new Object[]{orderNumber, binCode});
        return Response.ok(new ResponseDTO(0, items)).build();
    }

    @POST
    @Path("pack")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response addToPackingList(PackingListRecordDTO packingRecord, @HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        CONSOLE.log(Level.INFO, "Agregando item a packing list");
        PackingListRecord record = new PackingListRecord();
        if (packingRecord.getIdPackingList() == null || packingRecord.getIdPackingList() == 0) {
            record.setIdPackingList(plFacade.getNextPackingListId());
            if (record.getIdPackingList() == 0) {
                return Response.ok(new ResponseDTO(-1, "Ocurrió un error al guardar el registro. ")).build();
            }
        } else {
            record.setIdPackingList(packingRecord.getIdPackingList());
        }

        if (packingRecord.getBinAbs() != null) {
            record.setBinAbs(packingRecord.getBinAbs());
        } else {
            record.setBinAbs(blFacade.getBinAbs(packingRecord.getBinCode(), companyName).longValue());
        }

        record.setBinCode(packingRecord.getBinCode());
        record.setBoxNumber(packingRecord.getBoxNumber());
        record.setCustomerId(packingRecord.getCustomerId());
        record.setEmployee(packingRecord.getEmployee());

        if (packingRecord.getCustomerName() != null) {
            record.setCustomerName(packingRecord.getCustomerName());
        } else {
            record.setCustomerName(cFacade.getCustomerName(packingRecord.getCustomerId(), companyName));
        }

        record.setDatetimePacked(new Date());
        record.setItemCode(packingRecord.getItemCode());
        record.setOrderNumber(packingRecord.getOrderNumber());
        record.setIdPackingOrder(packingRecord.getIdPackingOrder());
        record.setQuantity(packingRecord.getQuantity());
        record.setStatus("open");
        record.setCompanyName(companyName);

        try {
            plFacade.create(record);
            poFacade.updatePackedQuantity(record.getBinCode(), record.getItemCode(), record.getOrderNumber(), record.getQuantity(), companyName);
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
    public Response listOpenPackingJobs(@PathParam("username") String username, @HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        CONSOLE.log(Level.INFO, "Listando procesos de packing abiertos para el empleado {0}", username);
        List<Object[]> records = plFacade.listOpenPackingRecords(username, companyName);
        CONSOLE.log(Level.INFO, "Se encontraron {0} entradas de registro de packing abiertas para el empleado", records.size());
        return Response.ok(new ResponseDTO(0, records)).build();
    }

    @GET
    @Path("{idPackingOrder}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listPackingOrderItems(@PathParam("idPackingOrder") Long idPackingOrder, @HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        CONSOLE.log(Level.INFO, "Retornando items para la packing order #{0}", idPackingOrder);
        List<Object[]> items = poFacade.listOrderItems(idPackingOrder, companyName);
        CONSOLE.log(Level.INFO, "Se encontraron {0} items para la packing list", items.size());
        return Response.ok(new ResponseDTO(0, items)).build();
    }
}
