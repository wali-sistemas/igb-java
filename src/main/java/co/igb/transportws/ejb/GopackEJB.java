package co.igb.transportws.ejb;

import co.igb.ejb.IGBApplicationBean;
import co.igb.transportws.client.gopack.GopackClient;
import co.igb.transportws.dto.gopack.LoginGoPackDTO;
import co.igb.transportws.dto.gopack.LoginGoPackResponseDTO;
import co.igb.util.Constants;
import com.google.gson.Gson;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
public class GopackEJB {
    private static final Logger CONSOLE = Logger.getLogger(GopackEJB.class.getSimpleName());
    private GopackClient service;
    @Inject
    private IGBApplicationBean appBean;

    @PostConstruct
    private void initialize() {
        try {
            service = new GopackClient(appBean.obtenerValorPropiedad(Constants.GOPACK_WS_API_URL));
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de GO-PACK [WS_GUIAS]. ", e);
        }
    }

    private String createToken(String companyName) {
        LoginGoPackDTO dto = new LoginGoPackDTO();

        if (companyName.contains("IGB")) {
            dto.setUsuarioLogin(appBean.obtenerValorPropiedad(Constants.IGB_GOPACK_WS_API_USER));
            dto.setUsuarioPassword(appBean.obtenerValorPropiedad(Constants.IGB_GOPACK_WS_API_PASSWORD));
        } else {
            dto.setUsuarioLogin(appBean.obtenerValorPropiedad(Constants.MTZ_GOPACK_WS_API_USER));
            dto.setUsuarioPassword(appBean.obtenerValorPropiedad(Constants.MTZ_GOPACK_WS_API_PASSWORD));
        }

        Gson gson = new Gson();
        String JSON = gson.toJson(dto);
        CONSOLE.log(Level.INFO, JSON);

        try {
            LoginGoPackResponseDTO res = service.getToken(dto);
            if (res.isSuccess()) {
                return res.getData().getToken();
            } else {
                return null;
            }
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de GO-PACK [WS_TOKEN]. ", e);
        }
        return null;
    }
}
