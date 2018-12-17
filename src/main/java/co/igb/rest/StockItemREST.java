package co.igb.rest;

import co.igb.dto.ResponseDTO;
import co.igb.persistence.facade.ItemFacade;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
@Path("stockitem")
public class StockItemREST implements Serializable {

    private static final Logger CONSOLE = Logger.getLogger(StockItemREST.class.getSimpleName());

    @EJB
    private ItemFacade itemFacade;

    public StockItemREST() {
    }

    @GET
    @Path("find/{parametro}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    public Response consultarStockItem(@PathParam("parametro") String parametro,
                                       @HeaderParam("X-Warehouse-Code") String warehouseCode,
                                       @HeaderParam("X-Company-Name") String companyName,
                                       @HeaderParam("X-Pruebas") Boolean pruebas) {
        /*Parametro contiene ubicacion o item*/
        if (parametro == null || parametro.isEmpty()) {
            CONSOLE.log(Level.INFO, "No se recibieron datos para consultar el stock");
            return Response.ok(new ResponseDTO(-1, "No se recibieron datos para consultar el stock.")).build();
        }
        String itemCode = "";
        String binCode = "";

        /*Si los dos primeros caracteres son numericos es una ubicación, de lo contrario es un item*/
        if (parametro.matches("[0-9]{2}.+")) {
            binCode = parametro;
            CONSOLE.log(Level.INFO, "Consultando stock para la ubicacion {0}", parametro);
        } else {
            itemCode = parametro;
            CONSOLE.log(Level.INFO, "Consultando stock del item {0}", parametro);
        }

        List<Object[]> items = itemFacade.getItemStock(itemCode, binCode, warehouseCode, companyName, pruebas);

        if (items != null) {
            return Response.ok(items).build();
        } else {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el stock del item {0}", parametro);
            return Response.ok(new ResponseDTO(-1, "Ocurrio un error al consultar el stock.")).build();
        }
    }

    @GET
    @Path("checkoutStock/{item}/{location}")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    public Response confirmarStockItem(@PathParam("item") String itemCode,
                                       @PathParam("location") String location,
                                       @HeaderParam("X-Warehouse-Code") String warehouseCode,
                                       @HeaderParam("X-Company-Name") String companyName,
                                       @HeaderParam("X-Pruebas") Boolean pruebas) {
        if (itemCode == null || itemCode.isEmpty() || location == null || location.isEmpty()) {
            CONSOLE.log(Level.SEVERE, "No se encontraron datos para validar el stock.");
            return Response.ok(new ResponseDTO(-1, "No se encontraron datos para validar el stock.")).build();
        }

        Object obj = itemFacade.getCheckOutStockItem(itemCode, location, companyName, pruebas);
        if (obj != null) {
            return Response.ok(obj).build();
        } else {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al revisar el stock del item [" + itemCode + "] para la ubicacion [" + location + "]");
            return Response.ok(new ResponseDTO(-1, "Ocurrio un error al revisar el stock del item [" + itemCode + "] para la ubicacion [" + location + "]")).build();
        }
    }
}