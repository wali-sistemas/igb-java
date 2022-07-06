package co.igb.transportws.ejb;

import co.igb.ejb.IGBApplicationBean;
import co.igb.transportws.client.ola.OlaClient;
import co.igb.transportws.dto.ola.GuiaDTO;
import co.igb.transportws.dto.ola.GuiaResponseDTO;
import co.igb.transportws.dto.ola.TypesResponseDTO;
import co.igb.util.Constants;
import org.codehaus.jackson.map.ObjectMapper;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
public class OlaEJB {
    private static final Logger CONSOLE = Logger.getLogger(OlaEJB.class.getSimpleName());
    private OlaClient service;
    @Inject
    private IGBApplicationBean appBean;

    @PostConstruct
    private void initialize() {
        try {
            service = new OlaClient(appBean.obtenerValorPropiedad(Constants.OLA_WS_API_URL));
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de OLA [WS_GUIAS]. ", e);
        }
    }

    public TypesResponseDTO listTypeFlet() {
        GuiaDTO dto = new GuiaDTO();
        dto.setCodigocliente(appBean.obtenerValorPropiedad(Constants.OLA_WS_API_CODIGO));
        dto.setApikey(appBean.obtenerValorPropiedad(Constants.OLA_WS_API_KEY));

        try {
            String res = service.postTipoFletes(dto);
            TypesResponseDTO typesResponseDTO = new ObjectMapper().readValue(res, TypesResponseDTO.class);

            return typesResponseDTO;
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de OLA [WS_TIPOS_FLETES]. ", e);
        }
        return null;
    }

    public GuiaResponseDTO generateGuia() {
        GuiaDTO dto = new GuiaDTO();
        dto.setCodigocliente(appBean.obtenerValorPropiedad(Constants.OLA_WS_API_CODIGO));
        dto.setApikey(appBean.obtenerValorPropiedad(Constants.OLA_WS_API_KEY));
        dto.setTipoflete("credito");
        dto.setOrigen("MEDELLIN");
        dto.setDestino("CALI");
        dto.setUnidades("1");
        dto.setKilos("1");
        dto.setVolumen("1");
        dto.setVlrmcia("100000");
        dto.setObs("PRUEBA SISTEMAS IGB");
        dto.setNitr("7100000");
        dto.setNombrer("REMITENTE PRUEBA");
        dto.setTelr("310000000");
        dto.setDirr("CALLE 44 N 55C 100 AP 450 BARR LA AMERICA");
        dto.setCorreor("correo@remitente.com");
        dto.setNombredg("nombre destinatario");
        dto.setNitd("72000000");
        dto.setTeld("312000000");
        dto.setDird("CRA 56 N 67B 89 OF 101");
        dto.setCorreod("correo@destinatario.com");
        dto.setAdicionales("PREGUNTAR POR FULANO");
        dto.setCartaporte("XXX 2345-3455");

        try {
            String res = service.postGenerarGuia(dto);
            GuiaResponseDTO guiaResponseDTO = new ObjectMapper().readValue(res, GuiaResponseDTO.class);

            return guiaResponseDTO;
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue pisible iniciar la interface de OLA [WS_GENERAR_GUIAS]. ", e);
        }
        return null;
    }
}