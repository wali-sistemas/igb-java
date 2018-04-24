package co.igb.rest;

import co.igb.dto.BinLocationDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.persistence.facade.BinLocationFacade;
import co.igb.util.IGBUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author dbotero
 */
@Stateless
@Path("binlocation")
public class BinLocationREST implements Serializable {

    private static final Logger CONSOLE = Logger.getLogger(BinLocationREST.class.getSimpleName());

    @EJB
    private BinLocationFacade blFacade;
    @Inject
    private IGBApplicationBean applicationBean;

    public BinLocationREST() {
    }

    @GET
    @Path("picking-carts")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response listPickingCarts(@HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        CONSOLE.log(Level.INFO, "Listando carritos de picking");

        String warehouseCode = IGBUtils.getProperParameter(applicationBean.obtenerValorPropiedad("igb.warehouse.code"), companyName);

        List response = blFacade.listPickingCarts(warehouseCode, companyName);
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
}
