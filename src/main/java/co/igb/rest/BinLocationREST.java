package co.igb.rest;

import co.igb.dto.BinLocationDTO;
import co.igb.dto.ResponseDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.persistence.facade.BinLocationFacade;
import co.igb.persistence.facade.LocationLimitFacade;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dbotero
 */
@Stateless
@Path("binlocation")
public class BinLocationREST implements Serializable {
    private static final Logger CONSOLE = Logger.getLogger(BinLocationREST.class.getSimpleName());

    @EJB
    private BinLocationFacade blFacade;
    @EJB
    private LocationLimitFacade locationLimitFacade;
    @Inject
    private IGBApplicationBean applicationBean;

    public BinLocationREST() {
    }

    @GET
    @Path("picking-carts")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listPickingCarts(@HeaderParam("X-Company-Name") String companyName,
                                     @HeaderParam("X-Warehouse-Code") String warehouseCode,
                                     @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Listando carritos de picking");

        List response = blFacade.listPickingCarts(warehouseCode, companyName, pruebas);
        List<BinLocationDTO> pickingCarts = new ArrayList<>();
        for (Object row : response) {
            BinLocationDTO dto = new BinLocationDTO();
            dto.setBinAbs(((Integer) ((Object[]) row)[0]).longValue());
            dto.setBinCode((String) ((Object[]) row)[1]);
            dto.setBinName((String) ((Object[]) row)[2]);
            dto.setItems((Integer) ((Object[]) row)[3]);
            dto.setPieces((Integer) ((Object[]) row)[4]);

            if (dto.getBinName() != null && !dto.getBinName().trim().isEmpty()) {
                pickingCarts.add(dto);
            } else {
                CONSOLE.log(Level.WARNING, "El siguiente carrito no se mostrara porque no tiene nombre configurado. {0}", dto);
            }
        }
        CONSOLE.log(Level.INFO, "Se encontraron {0} carritos de picking", pickingCarts.size());
        return Response.ok(pickingCarts).build();
    }

    @GET
    @Path("binabs/{binCode}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response getBinAbs(
            @PathParam("binCode") String binCode,
            @HeaderParam("X-Company-Name") String companyName,
            @HeaderParam("X-Warehouse-Code") String warehouseCode,
            @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Obteniendo binabs para ubicacion " + binCode);

        Integer binAbs = blFacade.getBinAbs(binCode.trim(), companyName, pruebas);
        CONSOLE.log(Level.INFO, "Obtuvo el binAbs: {0}", binAbs);

        return Response.ok(new ResponseDTO(0, binAbs)).build();
    }

    @GET
    @Path("location-fixed/{itemcode}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response getLocationFixed(@PathParam("itemcode") String itemCode,
                                     @HeaderParam("X-Company-Name") String companyName,
                                     @HeaderParam("X-Warehouse-Code") String warehouseCode,
                                     @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Consultando la ubicacion fija para el item [" + itemCode + "]");
        if (itemCode == null || itemCode.isEmpty()) {
            return Response.ok(new ResponseDTO(-1, "No se encontraron datos para validar.")).build();
        }
        String res = locationLimitFacade.findLocationFixed(itemCode.trim(), companyName, pruebas);
        return Response.ok(new ResponseDTO(res == null ? -1 : 0, res)).build();
    }

    @GET
    @Path("attributes/{bincode}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response getLocationAttributes(@PathParam("bincode") String binCode,
                                          @HeaderParam("X-Company-Name") String companyName,
                                          @HeaderParam("X-Warehouse-Code") String warehouseCode,
                                          @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Consultando los atributos de la ubicacion [" + binCode.trim() + "]");
        if (binCode.trim() == null || binCode.trim().isEmpty()) {
            return Response.ok(new ResponseDTO(-1, "No se encontraron datos para consultar.")).build();
        }
        Object attr = blFacade.getLocationAttributes(binCode.trim(), warehouseCode, companyName, pruebas);
        return Response.ok(new ResponseDTO(0, attr)).build();
    }
}