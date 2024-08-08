package co.igb.transportws.ejb;

import co.igb.ejb.IGBApplicationBean;
import co.igb.transportws.client.aldia.AldiaClient;
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
public class AldiaEJB {
    private static final Logger CONSOLE = Logger.getLogger(AldiaEJB.class.getSimpleName());
    private AldiaClient service;
    @Inject
    private IGBApplicationBean appBean;

    @PostConstruct
    private void initialize() {
        try {
            service = new AldiaClient(appBean.obtenerValorPropiedad(Constants.ALDIA_WS_URL));
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de Aldia [WS_GUIAS]. ", e);
        }
    }
}
