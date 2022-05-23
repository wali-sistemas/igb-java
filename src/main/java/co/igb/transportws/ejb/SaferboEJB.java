package co.igb.transportws.ejb;

import co.igb.dto.ApiSaferboDTO;
import co.igb.dto.ResponseCrearGuiaDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.transportws.client.saferbo.SaferboTransportClient;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
public class SaferboEJB {
    private static final Logger CONSOLE = Logger.getLogger(SaferboEJB.class.getSimpleName());
    private SaferboTransportClient service;
    @Inject
    private IGBApplicationBean appBean;

    @PostConstruct
    private void initialize() {
        try {
            service = new SaferboTransportClient(appBean.obtenerValorPropiedad("igb.api.saferbo"));
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de Saferbo [WS_GUIAS]. ", e);
        }
    }

    public ResponseCrearGuiaDTO createGuia(ApiSaferboDTO dto) {
        try {
            return service.createGuia(dto);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error creando la guia de transporte[Saferbo]", e);
        }
        return null;
    }
}