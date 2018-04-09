package co.igb.rest;

import co.igb.persistence.facade.BinLocationFacade;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author YEIJARA
 */
@Stateless
@Path("resupply")
public class ResupplyREST implements Serializable {

    private static final Logger CONSOLE = Logger.getLogger(ResupplyREST.class.getSimpleName());
    @EJB
    private BinLocationFacade binLocationFacade;

    @GET
    @Path("list-locations-resupply")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listLocationsResupply(@HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "Se estan consultando las ubicaciones pendientes por re-abastecer");
        return Response.ok(new ResponseDTO(0, binLocationFacade.findLocationsResupply("01", companyName))).build();
    }

    @GET
    @Path("list-items-location/{location}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listItemsLocation(@PathParam("location") String location, @HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "Se estan consultando las referencias que necesitan para re-abastecer de la ubicacion {0}", location);
        return Response.ok(new ResponseDTO(0, binLocationFacade.findItemsLocationResupply(location, "01", companyName))).build();
    }

    @GET
    @Path("list-location-storage/{itemCode}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listUbicationsStorage(@PathParam("itemCode") String itemCode, @HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "Se estan consultando las ubicaciones tipo STORAGE, para poder re-abastecer el item {0}", itemCode);
        return Response.ok(new ResponseDTO(0, binLocationFacade.listLocationsStorageResupply(itemCode, companyName))).build();
    }
}
