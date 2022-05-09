package co.igb.transportws.ejb;

import co.igb.ejb.IGBApplicationBean;
import co.igb.transportws.client.rapidoochoa.RapidoochoaClient;
import co.igb.util.Constants;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
public class RapidoochoaEJB {
    private static final Logger CONSOLE = Logger.getLogger(RapidoochoaEJB.class.getSimpleName());
    private RapidoochoaClient service;

    @Inject
    private IGBApplicationBean appBean;

    @PostConstruct
    private void initialize() {
        try {
            service = new RapidoochoaClient(appBean.obtenerValorPropiedad(Constants.RAPIDO_OCHOA_WS_URL));
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de Rapido-Ochoa [WS_GUIAS]. ", e);
        }
    }


}