package co.igb.rest;

import co.igb.dto.InventoryDTO;
import co.igb.persistence.entity.InventoryDetail;
import co.igb.persistence.facade.InventoryDetailFacade;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author YEIJARA
 */
@Stateless
@Path("inventory")
public class InventoryREST {

    private static final Logger CONSOLE = Logger.getLogger(InventoryREST.class.getSimpleName());
    @EJB
    private InventoryDetailFacade inventoryDetailFacade;

    public InventoryREST() {
    }

    @POST
    @Path("addItem")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response addItem(InventoryDTO inventory, @HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        CONSOLE.log(Level.INFO, "Agregando item al inventario {0}", inventory);

        InventoryDetail detail = new InventoryDetail();

        detail.setDate(new Date());
        detail.setIdInventory(inventory.getIdInventory());
        detail.setItem(inventory.getItem());
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
}
