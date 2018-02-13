package co.igb.rest;

import co.igb.dto.PackingDTO;
import co.igb.dto.PackingListRecordDTO;
import co.igb.persistence.entity.PackingListRecord;
import co.igb.persistence.entity.PackingOrder;
import co.igb.persistence.entity.PackingOrderItem;
import co.igb.persistence.entity.PackingOrderItemBin;
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
        return Response.ok(list).build();
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

        record.setBinAbs(packingRecord.getBinAbs());
        record.setBinCode(packingRecord.getBinCode());
        record.setBoxNumber(packingRecord.getBoxNumber());
        record.setCustomerId(packingRecord.getCustomerId());
        record.setCustomerName(packingRecord.getCustomerName());
        record.setDatetimePacked(new Date());
        record.setItemCode(packingRecord.getItemCode());
        record.setOrderNumber(packingRecord.getOrderNumber());
        record.setPickingOrder(packingRecord.getPickingOrder());
        record.setQuantity(packingRecord.getQuantity());
        record.setStatus(packingRecord.getStatus());

        try {
            plFacade.create(record);
            return Response.ok(new ResponseDTO(0, record.getIdPackingList())).build();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al crear el registro. ", e);
            return Response.ok(new ResponseDTO(-1, "Ocurrió un error al crear el registro")).build();
        }

    }
}
