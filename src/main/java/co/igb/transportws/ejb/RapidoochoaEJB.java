package co.igb.transportws.ejb;

import co.igb.ejb.IGBApplicationBean;
import co.igb.transportws.client.rapidoochoa.RapidoochoaClient;
import co.igb.transportws.dto.rapidoochoa.GuiaDTO;
import co.igb.transportws.dto.rapidoochoa.GuiaResponseDTO;
import co.igb.transportws.dto.rapidoochoa.TokenResponseDTO;
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
            service = new RapidoochoaClient(Constants.RAPIDO_OCHOA_WS_URL);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de Rapido-ochoa [WS_GUIAS]. ", e);
        }
    }

    public String createToken() {
        try {
            TokenResponseDTO res = service.createToken("cmFwaWRvb2Nob2E=", "1020466061", "Franco.4545");
            return res.getToken();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de Rapido-Ochoa [WS_GUIAS]. ", e);
        }
        return "";
    }

    public GuiaResponseDTO createGuia(GuiaDTO dto) {
        String token = createToken();

        if (!token.isEmpty()) {
            try {
                return service.createGuia(dto, token);
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error creando la guia de transporte[Rapido-ochoa]", e);
            }
        }
        return null;
    }
}