package co.igb.transportws.ejb;

import co.igb.ejb.IGBApplicationBean;
import co.igb.transportws.client.ola.OlaClient;
import co.igb.transportws.dto.ola.*;
import co.igb.util.Constants;
import org.codehaus.jackson.map.ObjectMapper;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Base64;
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

    public TypesOlaResponseDTO listTypeFlet() {
        GuiaOlaDTO dto = new GuiaOlaDTO();
        dto.setCodigocliente(appBean.obtenerValorPropiedad(Constants.OLA_WS_API_CODIGO));
        dto.setApikey(appBean.obtenerValorPropiedad(Constants.OLA_WS_API_KEY));

        try {
            String res = service.postTipoFletes(dto);
            TypesOlaResponseDTO typesResponseDTO = new ObjectMapper().readValue(res, TypesOlaResponseDTO.class);

            return typesResponseDTO;
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de OLA [WS_TIPOS_FLETES]. ", e);
        }
        return null;
    }

    public GuiaOlaResponseDTO generateGuia(GuiaOlaDTO dto) {
        dto.setCodigocliente(appBean.obtenerValorPropiedad(Constants.OLA_WS_API_CODIGO));
        dto.setApikey(appBean.obtenerValorPropiedad(Constants.OLA_WS_API_KEY));

        try {
            String res = service.postGenerarGuia(dto);
            GuiaOlaResponseDTO guiaResponseDTO = new ObjectMapper().readValue(res, GuiaOlaResponseDTO.class);

            return guiaResponseDTO;
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue pisible iniciar la interface de OLA [WS_GENERAR_GUIAS]. ", e);
        }
        return null;
    }

    public String printGuia(String guia, String companyName) {
        PrintOlaDTO dto = new PrintOlaDTO();
        dto.setCodigocliente(appBean.obtenerValorPropiedad(Constants.OLA_WS_API_CODIGO));
        dto.setApikey(appBean.obtenerValorPropiedad(Constants.OLA_WS_API_KEY));
        dto.setParamguia(guia);

        try {
            String response = service.postImpresionGuia(dto);
            PrintOlaResponseDTO printOlaResponseDTO = new ObjectMapper().readValue(response, PrintOlaResponseDTO.class);

            if (printOlaResponseDTO.getData().contains("https")) {
                return printOlaResponseDTO.getData();
            } else {
                File file = new File(appBean.obtenerValorPropiedad("url.archivo") + companyName + File.separator + "shipping" +
                        File.separator + "ola" + File.separator + "guia" + File.separator + guia + ".pdf");

                try (FileOutputStream fos = new FileOutputStream(file);) {
                    byte[] decoder = Base64.getDecoder().decode(printOlaResponseDTO.getData());
                    fos.write(decoder);
                    CONSOLE.log(Level.INFO, "Archivo de guia #{0} de transportadora Ola guardado", guia);
                } catch (Exception e) {
                    CONSOLE.log(Level.SEVERE, "Ocurrio un error guardando el PDF para la guia #" + guia + " de la transportadora Ola", e);
                }

                return appBean.obtenerValorPropiedad("url.shared") + companyName + "/shipping/ola/guia/" + guia + ".pdf";
            }
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue pisible iniciar la interface de OLA [WS_IMPRIMIR_GUIA]. ", e);
        }

        return null;
    }

    public String printRotulo(String guia, String companyName) {
        PrintOlaDTO dto = new PrintOlaDTO();
        dto.setCodigocliente(appBean.obtenerValorPropiedad(Constants.OLA_WS_API_CODIGO));
        dto.setApikey(appBean.obtenerValorPropiedad(Constants.OLA_WS_API_KEY));
        dto.setParamguia(guia);

        try {
            String response = service.postImpresionRotulos(dto);
            PrintOlaResponseDTO printOlaResponseDTO = new ObjectMapper().readValue(response, PrintOlaResponseDTO.class);

            if (printOlaResponseDTO.getData().contains("https")) {
                return printOlaResponseDTO.getData();
            } else {
                File file = new File(appBean.obtenerValorPropiedad("url.archivo") + companyName + File.separator + "shipping" +
                        File.separator + "ola" + File.separator + "rotulo" + File.separator + guia + ".pdf");

                try (FileOutputStream fos = new FileOutputStream(file);) {
                    byte[] decoder = Base64.getDecoder().decode(printOlaResponseDTO.getData());
                    fos.write(decoder);
                    CONSOLE.log(Level.INFO, "Archivo rotulo de guia #{0} de transportadora Ola guardado", guia);
                } catch (Exception e) {
                    CONSOLE.log(Level.SEVERE, "Ocurrio un error guardando el rotulo PDF para la guia #" + guia + " de la transportadora Ola", e);
                }

                return appBean.obtenerValorPropiedad("url.shared") + companyName + "/shipping/ola/guia/" + guia + ".pdf";
            }
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue pisible iniciar la interface de OLA [WS_IMPRIMIR_ROTULOS]. ", e);
        }

        return null;
    }
}