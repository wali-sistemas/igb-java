package co.igb.transportws.ejb;

import co.igb.dto.ApiAldiaDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.transportws.client.aldia.AldiaClient;
import co.igb.transportws.dto.aldia.*;
import co.igb.util.Constants;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
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

    private String createToken(String companyName) {
        LoginAldiaDTO dto = new LoginAldiaDTO();

        if (companyName.contains("IGB")) {
            dto.setUser(appBean.obtenerValorPropiedad(Constants.IGB_ALDIA_WS_USER));
            dto.setPassword(appBean.obtenerValorPropiedad(Constants.IGB_ALDIA_WS_PASSWORD));
        } else {
            dto.setUser(appBean.obtenerValorPropiedad(Constants.MTZ_ALDIA_WS_USER));
            dto.setPassword(appBean.obtenerValorPropiedad(Constants.MTZ_ALDIA_WS_PASSWORD));
        }

        Gson gson = new Gson();
        String JSON = gson.toJson(dto);
        CONSOLE.log(Level.INFO, JSON);

        try {
            LoginAldiaResponseDTO res = service.getToken(dto);
            return res.getAccessToken();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar un token de aldia para " + companyName, e);
        }
        return null;
    }

    public GuiaAldiaResponseDTO createGuia(ApiAldiaDTO dto, String companyName) {
        GuiaAldiaDTO guiaAldiaDTO = new GuiaAldiaDTO();
        GuiaAldiaDTO.Data data = new GuiaAldiaDTO.Data();
        List<GuiaAldiaDTO.Data> listData = new ArrayList<>();

        String token = createToken(companyName);
        if (token != null) {
            data.setRemesa("");
            data.setOrdencargue("");
            data.setNombreremitente(dto.getNombrer());
            data.setDireccionremitente("CALLE 98 SUR 48-225 BOD 114");
            data.setCodigodaneremitente("05380");//La Estrella
            data.setDocumentoremitente(dto.getDocumentor());

            data.setNombredestinatario(dto.getNombred().toUpperCase());
            data.setDocumentodestinatario(dto.getDocumentod());
            data.setDirecciondestinatario(dto.getDirecciond());
            data.setTelefonodestinatario(dto.getTelefonod());
            data.setCodigodanedestinatario(dto.getCodCiudadd());
            data.setDivisioncliente("");
            data.setClasificacionmercancia("CARGA GENERAL - " + dto.getDescripcion());
            data.setObservacion(dto.getObservacion());

            GuiaAldiaDTO.Data.Detalle detail = new GuiaAldiaDTO.Data.Detalle();
            List<GuiaAldiaDTO.Data.Detalle> details = new ArrayList<>();
            detail.setUnidades(dto.getCant());
            detail.setPeso(dto.getPeso());
            detail.setProducto(dto.getTipoEmpaque());
            detail.setDocumentoRemitente(dto.getFactura());
            detail.setRemision("");
            detail.setValordeclarado(dto.getVlrDecl());
            detail.setDescripcion(dto.getDescripcion());
            detail.setVolumen(dto.getVolumen());
            detail.setEmpaque(dto.getTipoEmpaque());
            details.add(detail);
            data.setDetalle(details);

            listData.add(data);
            guiaAldiaDTO.setData(listData);

            Gson gson = new Gson();
            String JSON = gson.toJson(guiaAldiaDTO);
            CONSOLE.log(Level.INFO, JSON);

            try {
                return service.addGuia(guiaAldiaDTO, token);
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de Aldia [WS_TOKEN]. ", e);
            }
        } else {
            CONSOLE.log(Level.SEVERE, "Ocurrio una novedad consultando la disponibilidad del token para " + companyName);
            return null;
        }
        return null;
    }

    public String getRotuloGuia(String guia, String companyName) {
        String token = createToken(companyName);
        if (token != null) {
            RotuloAldiaDTO.Data data = new RotuloAldiaDTO.Data();
            data.setRemesa1(guia);
            data.setRemesa2(guia);

            RotuloAldiaDTO dto = new RotuloAldiaDTO();
            dto.setData(data);

            Gson gson = new Gson();
            String JSON = gson.toJson(dto);
            CONSOLE.log(Level.INFO, JSON);

            try {
                String res = service.getRotulo(dto, token);
                RotuloAldiaResponseDTO rotuloAldiaResponseDTO = new ObjectMapper().readValue(res, RotuloAldiaResponseDTO.class);

                if (rotuloAldiaResponseDTO.getCode().equals(200)) {
                    return rotuloAldiaResponseDTO.getData();
                } else {
                    return null;
                }
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de Aldia [WS_CONSULTAR_ROTULO]. ", e);
            }
            return null;
        }
        return null;
    }
}
