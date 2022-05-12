package co.igb.transportws.ejb;

import co.igb.ejb.IGBApplicationBean;
import co.igb.transportws.client.rapidoochoa.RapidoochoaClient;
import co.igb.transportws.dto.rapidoochoa.GuiaDTO;
import co.igb.transportws.dto.rapidoochoa.GuiaResponseDTO;
import co.igb.util.Constants;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.xml.ws.Response;
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
            return service.createToken("cmFwaWRvb2Nob2E=", "1020466061", "Franco.4545");
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de Rapido-Ochoa [WS_GUIAS]. ", e);
        }
        return "";
    }

    public GuiaResponseDTO createGuia(String consecutivo) {
        GuiaDTO dto = new GuiaDTO();
        dto.setNmImpresionRemesa(consecutivo);
        dto.setCdPoblacionOrigen("5001000");
        dto.setCdPoblacionDestino("5615000");
        dto.setNmPesoDeclarado("1");
        dto.setNmUnidPorEmbalaje("1");
        dto.setVmValorDeclarado("200000");
        dto.setDsNombreRemitente("IGB");
        dto.setDniCliente("811011909");
        dto.setDsNombreDestinatario("1035866418");
        dto.setDsNombreDestinatario("JADILSON GUISAO RESTREPO");
        dto.setDsDireccionDestinatario("AV 34 F # 42 F 33");
        dto.setDsTelefonoDestinatario("3226979043");
        dto.setDsDocReferencia("366447");
        dto.setDsDiceContener("PARTES Y REPUESTOS");
        dto.setCdTipoDniDestinatario("1035866418");
        dto.setVmValorOtros("0");
        dto.setNmFormaDePago("CRÉDITO");

        String token = createToken();

        if (!token.isEmpty()) {
            try {
                GuiaResponseDTO res = service.createGuia(dto, token);
                return res;
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error creando la guia de transporte[Rapido-ochoa]", e);
            }
        }
        return null;
    }
}