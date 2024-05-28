package co.igb.transportws.ejb;

import co.igb.dto.ApiSaferboDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.transportws.client.saferbo.SaferboClient;
import co.igb.transportws.dto.saferbo.GuiaSaferboDTO;
import co.igb.transportws.dto.saferbo.GuiaSaferboResponseDTO;
import co.igb.util.Constants;
import com.google.gson.Gson;
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
public class SaferboEJB {
    private static final Logger CONSOLE = Logger.getLogger(SaferboEJB.class.getSimpleName());
    private SaferboClient service;
    @Inject
    private IGBApplicationBean appBean;

    @PostConstruct
    private void initialize() {
        try {
            service = new SaferboClient(appBean.obtenerValorPropiedad(Constants.SAFERBO_WS_URL));
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de Saferbo [WS_GUIAS]. ", e);
        }
    }

    public GuiaSaferboResponseDTO createGuia(ApiSaferboDTO apiSaferboDTO, String companyname) {
        GuiaSaferboDTO dto = new GuiaSaferboDTO();
        dto.setOrigen("LA ESTRELLA-ANTIOQUIA-05380000");
        dto.setDestino(apiSaferboDTO.getCodCiudadd());
        dto.setDsvaloracion(apiSaferboDTO.getVlrDecl());
        dto.setDslargo("1");
        dto.setDsancho("1");
        dto.setDsalto("1");
        dto.setDspesovol("0");
        dto.setDspeso(apiSaferboDTO.getPeso());
        dto.setTipoacceso("1");
        dto.setTipodatos("2");
        if (companyname.contains("IGB")){
            dto.setDscodigocliente("017750");
        } else {
            dto.setDscodigocliente("014587");
        }
        dto.setDsnitr("");
        dto.setDsnombrer("");
        dto.setDstelr("");
        dto.setDsdirr("");
        dto.setIdnegociacion("2");
        dto.setIdtipoenvio("3");
        dto.setIdtipoliquidacion("1");
        dto.setIdtarifaxtrayecto("2");
        dto.setDsunidad("1");
        dto.setDskilos("1");
        dto.setDsvalordec(apiSaferboDTO.getVlrDecl());
        dto.setDsobs1("FV #" + apiSaferboDTO.getFactura());
        dto.setDsobs2(apiSaferboDTO.getDescripcion());
        dto.setDsobs3("");
        dto.setDscodigodestinatario("0000");
        dto.setDsnitd(apiSaferboDTO.getDocumentod());
        dto.setDsnombred(apiSaferboDTO.getNombred());
        dto.setDsdird(apiSaferboDTO.getDirecciond());
        dto.setArunidades(apiSaferboDTO.getCant());
        dto.setDsvalorrecaudar("0");
        dto.setIdconsec("0");
        dto.setSolocotizar("0");
        dto.setGenerarguia("1");
        dto.setResultadojson("1");
        dto.setCotizarfull("0");

        Gson gson = new Gson();
        String JSON = gson.toJson(dto);
        CONSOLE.log(Level.INFO, JSON);

        try {
            String res = service.postCreateGuia(dto);
            GuiaSaferboResponseDTO guiaSaferboResponseDTO = new ObjectMapper().readValue(res, GuiaSaferboResponseDTO.class);
            return guiaSaferboResponseDTO;
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de Saferbo [WS_GUIAS]. ", e);
        }
        return null;
    }
}