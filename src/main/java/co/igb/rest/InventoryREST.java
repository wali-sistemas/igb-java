package co.igb.rest;

import co.igb.dto.InventoryDTO;
import co.igb.dto.ResponseDTO;
import co.igb.persistence.entity.Inventory;
import co.igb.persistence.entity.InventoryDetail;
import co.igb.persistence.facade.BinLocationFacade;
import co.igb.persistence.facade.InventoryDetailFacade;
import co.igb.persistence.facade.InventoryFacade;

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
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YEIJARA
 */
@Stateless
@Path("inventory")
public class InventoryREST {

    private static final Logger CONSOLE = Logger.getLogger(InventoryREST.class.getSimpleName());
    @EJB
    private InventoryFacade inventoryFacade;
    @EJB
    private InventoryDetailFacade inventoryDetailFacade;
    @EJB
    private BinLocationFacade binLocationFacade;

    public InventoryREST() {
    }

    @GET
    @Path("inventoryopen/{warehouse}")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response findLastOpenInventory(@PathParam("warehouse") String warehouse, @HeaderParam("X-Company-Name") String companyName) {
        Inventory inventory = inventoryFacade.findLastInventoryOpen(warehouse, companyName);

        if (inventory != null && inventory.getId() != null && inventory.getId() != 0) {
            return Response.ok(inventory).build();
        } else {
            return Response.ok(-1).build();
        }
    }

    @POST
    @Path("addItem")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response addItem(InventoryDTO inventory, @HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "Agregando item al inventario {0}", inventory);

        InventoryDetail detail = new InventoryDetail();

        detail.setDate(new Date());
        detail.setIdInventory(inventory.getIdInventory());
        detail.setItem(inventory.getItem().toUpperCase());
        detail.setQuantity(inventory.getQuantity());

        try {
            inventoryDetailFacade.create(detail);
            CONSOLE.log(Level.INFO, "Se agrego el detalle con id {0}", detail.getIdInventoryDetail());
            return Response.ok(0).build();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al incluir el inventario. ", e);
        }

        return Response.ok(-1).build();
    }

    @GET
    @Path("inventoryhistory/{warehouse}/{idinventory}")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response findInventoryDetail(@PathParam("warehouse") String warehouse, @PathParam("idinventory") Integer idInventory) {
        List<InventoryDetail> details = inventoryDetailFacade.findInventoryDetail(idInventory);

        if (details != null && !details.isEmpty()) {
            return Response.ok(details).build();
        } else {
            return Response.ok(-1).build();
        }
    }

    @GET
    @Path("inventoryrandom/{warehouse}")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response inventoryRandom(@PathParam("warehouse") String warehouse, @HeaderParam("X-Company-Name") String companyName) {
        /*Se consultan las ubicaciones con saldo*/
        List<String> locations = binLocationFacade.listBinLocations(companyName, warehouse);

        if (locations != null && !locations.isEmpty()) {
            List<Object[]> datos = inventoryFacade.obtenerUltimosInventarios(companyName, locations);

            if (datos != null && !datos.isEmpty()) {
                for (Object[] o : datos) {
                    for (String l : locations) {
                        if (l.equals((String) o[0])) {
                            locations.remove(l);
                            break;
                        }
                    }
                }

                if (!locations.isEmpty()) {
                    return Response.ok(new ResponseDTO(0, locations.get(0))).build();
                } else {
                    return Response.ok(new ResponseDTO(0, datos.get(0)[0])).build();
                }
            } else {
                return Response.ok(new ResponseDTO(0, locations.get(0))).build();
            }
        }
        return Response.ok(new ResponseDTO(-1, "No se encontraron ubicaciones aleatorias.")).build();
    }
}
