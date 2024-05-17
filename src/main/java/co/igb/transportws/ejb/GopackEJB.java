package co.igb.transportws.ejb;

import co.igb.dto.ApiGoPackDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.transportws.client.gopack.GopackClient;
import co.igb.transportws.dto.gopack.GuiaGoPackDTO;
import co.igb.transportws.dto.gopack.GuiaGoPackResponseDTO;
import co.igb.transportws.dto.gopack.LoginGoPackDTO;
import co.igb.transportws.dto.gopack.LoginGoPackResponseDTO;
import co.igb.util.Constants;
import com.google.gson.Gson;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    public String createGuia(ApiGoPackDTO dto, String companyName) {
        GuiaGoPackDTO guiaGoPackDTO = new GuiaGoPackDTO();

        String token = createToken(companyName);
        if (token != null) {
            guiaGoPackDTO.setCiudadOrigen("11001000");
            guiaGoPackDTO.setCiudadDestino("11001000");
            guiaGoPackDTO.setRemesaFecha(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
            guiaGoPackDTO.setRemitenteDocumento("811011909-9");
            guiaGoPackDTO.setRemitenteNombre("IGB MOTORCYCLE PARTS");
            guiaGoPackDTO.setRemitenteDireccion("CALLE 98 SUR #48-225 BOD 114");
            guiaGoPackDTO.setRemitenteTelefono("6044442025");
            guiaGoPackDTO.setRemitenteEmail("analistatransporte@igbcolombia.com");
            guiaGoPackDTO.setRemitenteTipodoc("2");

            guiaGoPackDTO.setDestinatarioDocumento("1035866418");
            guiaGoPackDTO.setDestinatarioNombre("JADILSON GUISAO RESTREPO");
            guiaGoPackDTO.setDestinatarioDireccion("AV 34 F # 42 F 33");
            guiaGoPackDTO.setDestinatarioTelefono("3226979043");
            guiaGoPackDTO.setDestinatarioEmail("sistemas2@igbcolombia.com");
            guiaGoPackDTO.setDestinatarioTipodoc("1");

            guiaGoPackDTO.setRemesaTiposervicio("7");
            guiaGoPackDTO.setRemesaFormapago("5");
            guiaGoPackDTO.setRemesaCantidad("1");
            guiaGoPackDTO.setRemesaPeso("100");
            guiaGoPackDTO.setRemesaVolumen("0");
            guiaGoPackDTO.setRemesaValordeclarado("1200000");
            guiaGoPackDTO.setRemesaObservacion("ejemplo de creacion ws empresa (IGB) por favor cancelar");
            guiaGoPackDTO.setRemesaDocumentocliente("523652");
            guiaGoPackDTO.setRemesaDicecontener("RESPUESTOS");
            guiaGoPackDTO.setRemesaProducto("2577");
            guiaGoPackDTO.setRemesaFlete("0");
            guiaGoPackDTO.setRemesaManejo("0");

            Gson gson = new Gson();
            String JSON = gson.toJson(guiaGoPackDTO);
            CONSOLE.log(Level.INFO, JSON);

            try {
                GuiaGoPackResponseDTO res = service.addGuia(guiaGoPackDTO, token);
                if (res.isSuccess()) {
                    return res.getData().getRemesaCodigo();
                } else {
                    return null;
                }
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de GO-PACK [WS_TOKEN]. ", e);
            }
        } else {
            CONSOLE.log(Level.SEVERE,"Ocurrio una novedad consultando la disponibilidad del token para " + companyName);
            return null;
        }
        return null;
    }
}
