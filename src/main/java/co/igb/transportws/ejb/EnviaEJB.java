package co.igb.transportws.ejb;

import co.igb.dto.ApiEnviaDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.transportws.client.Envia.EnviaClient;
import co.igb.transportws.dto.envia.GuiaEnviaDTO;
import co.igb.transportws.dto.envia.GuiaEnviaResponseDTO;
import co.igb.util.Constants;
import com.fasterxml.jackson.databind.ObjectMapper;
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
public class EnviaEJB {
    private static final Logger CONSOLE = Logger.getLogger(EnviaEJB.class.getSimpleName());
    private EnviaClient service;
    @Inject
    private IGBApplicationBean appBean;

    @PostConstruct
    private void initialize() {
        try {
            service = new EnviaClient(appBean.obtenerValorPropiedad(Constants.IGB_ENVIA_WS_URL));
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de Envia [WS_GUIAS]. ", e);
        }
    }

    public GuiaEnviaResponseDTO createGuia(ApiEnviaDTO dto, String companyName) {
        GuiaEnviaDTO guiaEnviaDTO = new GuiaEnviaDTO();
        guiaEnviaDTO.setCiudadOrigen(dto.getCiudadOrigen());
        guiaEnviaDTO.setCiudadDestino(dto.getCiudadDestino());
        guiaEnviaDTO.setCodFormaPago(4);
        guiaEnviaDTO.setCodServicio(3);
        guiaEnviaDTO.setNumUnidades(Integer.valueOf(dto.getNumUnidades()));
        guiaEnviaDTO.setMpesorealk(Integer.valueOf(dto.getMpesorealK()));
        guiaEnviaDTO.setMpesovolumenk(Integer.valueOf(dto.getMpesorealK()));
        guiaEnviaDTO.setValorDeclarado(Integer.valueOf(dto.getValorDeclarado()));
        guiaEnviaDTO.setMcaNoSabado(1);
        guiaEnviaDTO.setMcaDocInternacional(0);
        guiaEnviaDTO.setCodRegionalCta(1);
        guiaEnviaDTO.setCodOficinaCta(1);
        guiaEnviaDTO.setCodCuenta(30);
        guiaEnviaDTO.setConCartaporte("0");

        GuiaEnviaDTO.InfoOrigen infoOrigen = new GuiaEnviaDTO.InfoOrigen();
        infoOrigen.setNomRemitente(dto.getNomRemitente());
        infoOrigen.setDirRemitente(dto.getDirRemitente());
        infoOrigen.setTelRemitente(dto.getTelRemitente());
        infoOrigen.setCedRemitente(dto.getCedRemitente());

        guiaEnviaDTO.setInfoOrigen(infoOrigen);

        GuiaEnviaDTO.InfoDestino infoDestino = new GuiaEnviaDTO.InfoDestino();
        infoDestino.setNomDestinatario(dto.getNomDestinatario());
        infoDestino.setDirDestinatario(dto.getDirDestinatario());
        infoDestino.setTelDestinatario(dto.getTelDestinatario());
        infoDestino.setCedDestinatario(dto.getCedDestinatario());

        guiaEnviaDTO.setInfoDestino(infoDestino);

        GuiaEnviaDTO.InfoContenido infoContenido = new GuiaEnviaDTO.InfoContenido();
        infoContenido.setDiceContener(dto.getDiceContener());
        infoContenido.setTextoGuia(dto.getTextoGuia());
        infoContenido.setAccionNotaGuia(dto.getAccionNotaGuia());
        infoContenido.setNumDocumentos(dto.getNumDocumentos());
        infoContenido.setCentroCosto("");
        infoContenido.setValorProducto("0");

        guiaEnviaDTO.setInfoContenido(infoContenido);
        guiaEnviaDTO.setNumeroGuia("");
        guiaEnviaDTO.setGenerarOs("N");
        guiaEnviaDTO.setTipoRotulo(2);

        Gson gson = new Gson();
        String JSON = gson.toJson(guiaEnviaDTO);
        CONSOLE.log(Level.INFO, JSON);

        try {
            String res = service.createGuia(guiaEnviaDTO, appBean.obtenerValorPropiedad(Constants.IGB_ENVIA_WS_USER), appBean.obtenerValorPropiedad(Constants.IGB_ENVIA_WS_PASSWORD));
            GuiaEnviaResponseDTO guiaEnviaResponseDTO = new ObjectMapper().readValue(res, GuiaEnviaResponseDTO.class);

            return guiaEnviaResponseDTO;
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de Envia [WS_CREATE_GUIA]. ", e);
        }
        return null;
    }
}
