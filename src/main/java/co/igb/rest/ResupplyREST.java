package co.igb.rest;

import co.igb.dto.LocationLimitDTO;
import co.igb.dto.ResponseDTO;
import co.igb.persistence.entity.LocationLimit;
import co.igb.persistence.facade.BinLocationFacade;
import co.igb.persistence.facade.LocationLimitFacade;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author YEIJARA
 */
@Stateless
@Path("resupply")
public class ResupplyREST implements Serializable {

    private static final Logger CONSOLE = Logger.getLogger(ResupplyREST.class.getSimpleName());
    @EJB
    private BinLocationFacade binLocationFacade;
    @EJB
    private LocationLimitFacade locationLimitFacade;

    @GET
    @Path("list-locations-resupply")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listLocationsResupply(@HeaderParam("X-Company-Name") String companyName,
                                          @HeaderParam("X-Warehouse-Code") String warehouseCode,
                                          @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Se estan consultando las ubicaciones pendientes por re-abastecer");
        return Response.ok(new ResponseDTO(0, binLocationFacade.findLocationsResupply(warehouseCode, companyName, pruebas))).build();
    }

    @GET
    @Path("list-items-location/{location}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listItemsLocation(@PathParam("location") String location,
                                      @HeaderParam("X-Company-Name") String companyName,
                                      @HeaderParam("X-Warehouse-Code") String warehouseCode,
                                      @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Se estan consultando las referencias que necesitan para re-abastecer de la ubicacion {0}", location);
        return Response.ok(new ResponseDTO(0, binLocationFacade.findItemsLocationResupply(location, warehouseCode, companyName, pruebas))).build();
    }

    @GET
    @Path("list-location-storage/{itemCode}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listUbicationsStorage(@PathParam("itemCode") String itemCode,
                                          @HeaderParam("X-Company-Name") String companyName,
                                          @HeaderParam("X-Warehouse-Code") String warehouseCode,
                                          @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Se estan consultando las ubicaciones tipo STORAGE, para poder re-abastecer el item {0}", itemCode);
        return Response.ok(new ResponseDTO(0, binLocationFacade.listLocationsStorageResupply(itemCode, companyName, pruebas, warehouseCode))).build();
    }

    @GET
    @Path("list-location-limits/{parametro}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listLocationLimits(@PathParam("parametro") String parametro,
                                       @HeaderParam("X-Company-Name") String companyName,
                                       @HeaderParam("X-Warehouse-Code") String warehouseCode,
                                       @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Se estan obteniendo los limites de ubicacion");
        String itemCode = "";
        String binCode = "";

        /*Si los dos primeros caracteres son numericos es una ubicación, de lo contrario es un item*/
        if (parametro.matches("[0-9]{2}.+")) {
            binCode = parametro;
            CONSOLE.log(Level.INFO, "Consultando limites para la ubicacion {0}", parametro);
        } else {
            itemCode = parametro;
            CONSOLE.log(Level.INFO, "Consultando limites para el item {0}", parametro);
        }
        CONSOLE.log(Level.INFO, "Retornando limites de ubicacion");
        return Response.ok(new ResponseDTO(0, locationLimitFacade.listLocationsLimits(itemCode, binCode, companyName, pruebas, warehouseCode))).build();
    }

    @POST
    @Path("save-location-limit")
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response saveLocationLimit(LocationLimitDTO limit,
                                      @HeaderParam("X-Company-Name") String companyName,
                                      @HeaderParam("X-Warehouse-Code") String warehouseCode,
                                      @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Se gestionara un limite de ubicacion");
        LocationLimit location = new LocationLimit();

        location.setCode(limit.getItem() + limit.getUbicacion().trim());
        location.setName(limit.getItem() + limit.getUbicacion().trim());
        location.setUbicacion(limit.getUbicacion().trim());
        location.setItem(limit.getItem());
        location.setCantMinima(limit.getCantMinima());
        location.setCantMaxima(limit.getCantMaxima());

        if (limit.getCode() != null && !limit.getCode().isEmpty()) {
            if (locationLimitFacade.editLimit(companyName, pruebas, location)) {
                return Response.ok(new ResponseDTO(0, location)).build();
            } else {
                return Response.ok(new ResponseDTO(-1, "Ocurrio un error al actualizar el límite de ubicación.")).build();
            }
        } else {
            //TODO: consultar si ya esta registrada la ubicación fija. Solo puede existir una ubicacion fija para un item.
            if ((locationLimitFacade.findLocationFixed(limit.getItem(), companyName, pruebas)) != null) {
                return Response.ok(new ResponseDTO(-1, "Ya existe una ubicación fija para este ítem.")).build();
            }
            if (locationLimitFacade.createLimit(companyName, pruebas, location)) {
                return Response.ok(new ResponseDTO(0, location)).build();
            } else {
                return Response.ok(new ResponseDTO(-1, "Ocurrio un error, el límite de ubicación ya existe.")).build();
            }
        }
    }

    @DELETE
    @Path("delete-location-limit/{code}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response deleteLocationLimit(@PathParam("code") String code,
                                        @HeaderParam("X-Company-Name") String companyName,
                                        @HeaderParam("X-Warehouse-Code") String warehouseCode,
                                        @HeaderParam("X-Pruebas") boolean pruebas) {
        try {
            locationLimitFacade.deleteLimit(code, companyName, pruebas);
            return Response.ok(new ResponseDTO(0, "Se elimino correctamente.")).build();
        } catch (Exception e) {
            return Response.ok(new ResponseDTO(-1, e.getMessage())).build();
        }
    }
}