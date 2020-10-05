package co.igb.rest;

import co.igb.apiSoul.client.wsClientesBodegas.*;
import co.igb.dto.ApiSoulStockDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.persistence.facade.ItemFacade;
import co.igb.util.Constants;

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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
@Path("soul")
public class SoulREST implements Serializable {
    private static final Logger CONSOLE = Logger.getLogger(SoulREST.class.getSimpleName());

    @Inject
    private IGBApplicationBean appBean;
    @EJB
    private ItemFacade itemFacade;

    @GET
    @Path("find-stock")
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response getCurrentStock(@HeaderParam("X-Company-Name") String companyName,
                                    @HeaderParam("X-Pruebas") boolean pruebas) {
        CONSOLE.log(Level.INFO, "Iniciando consulta de stock [WebService de Magnum]");

        List<ClsBEConsultaInventarioBodega> list = consultarInventarioBodega(Constants.SOUL_USER, Constants.SOUL_PASSWORD);
        List<ApiSoulStockDTO> stock = new ArrayList<>();
        for (ClsBEConsultaInventarioBodega obj : list) {
            ApiSoulStockDTO dto = new ApiSoulStockDTO();
            dto.setSku(obj.getSku());
            dto.setCantidadDisponible(obj.getCantidadDisponible());
            dto.setCantidadReservada(obj.getCantidadReservada());
            dto.setEstado(obj.getEstado());

            if (obj.getSku().substring(0, 2).equals("TY") || obj.getSku().substring(0, 2).equals("PW") || obj.getSku().substring(0, 1).equals("U")) {
                dto.setItemName(itemFacade.getItemName(obj.getSku(), companyName, pruebas));
            } else {
                dto.setItemName(obj.getSku());
            }

            if (obj.getSku().substring(0, 2).equals("TY")) {
                dto.setWhsCode("26");
            } else if (obj.getSku().substring(0, 2).equals("PW") || obj.getSku().substring(0, 1).equals("U")) {
                dto.setWhsCode("05");
            }

            stock.add(dto);
        }
        CONSOLE.log(Level.INFO, "Finalizando consulta de stock [WebService de Magnum]");
        return Response.ok(stock).build();
    }

    private List<ClsBEConsultaInventarioBodega> consultarInventarioBodega(String user, String password) {
        WsClientesBodegas service = new WsClientesBodegas();
        CONSOLE.log(Level.INFO, "Conectando con WebService de [Magnum-Soul]");
        RespConsultaInventarioBodega response = service.getWsClientesBodegasSoap12().consultaInventarioBodega(user, password);
        return response.getConsultasInventario().getConsultaInventario();
    }
}