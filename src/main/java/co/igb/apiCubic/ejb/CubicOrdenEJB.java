package co.igb.apiCubic.ejb;

import co.igb.apiCubic.client.orden.CubicOrdenWS;
import co.igb.apiCubic.dto.orden.CubicOrdenDTO;
import co.igb.apiCubic.dto.orden.CubicOrdenRestDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.util.Constants;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.InternalServerErrorException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
public class CubicOrdenEJB {
    private static final Logger CONSOLE = Logger.getLogger(CubicOrdenEJB.class.getSimpleName());
    private CubicOrdenWS service;

    @Inject
    private IGBApplicationBean appBean;

    @PostConstruct
    private void initialize() {
        try {
            service = new CubicOrdenWS(appBean.obtenerValorPropiedad(Constants.CUBIC_WS_URL));
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de cubic [WS_ORDENES]. ", e);
        }
    }

    public CubicOrdenRestDTO addOrden(CubicOrdenDTO dto) {
        try {
            String user = appBean.obtenerValorPropiedad(Constants.CUBIC_WS_USER);
            String password = appBean.obtenerValorPropiedad(Constants.EMAIL_PASSWORD);
            return service.createOrder(dto, user, password);
        } catch (InternalServerErrorException e) {
            if (e.getResponse().getStatus() == 500) {
                CONSOLE.log(Level.WARNING, "La orden ya se encuentra creada en cubic.");

                CubicOrdenRestDTO restDTO = new CubicOrdenRestDTO();
                CubicOrdenRestDTO.Data.Respuestas respuesta = new CubicOrdenRestDTO.Data.Respuestas();
                CubicOrdenRestDTO.Data data = new CubicOrdenRestDTO.Data();
                respuesta.setResultado("1");
                respuesta.setCodigo("500");
                respuesta.setDescripcion("El número de documento ya se encuentra en otra orden de trabajo.");
                respuesta.setId(null);
                data.setRespuestas(respuesta);
                restDTO.setData(data);

                return restDTO;
            } else {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error retornando la respuesta de la instancia [WS_ORDENES]. ", e);
            }
            return null;
        }
    }
}