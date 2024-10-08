package co.igb.transportws.ejb;

import co.igb.dto.PrintSticketOlaDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.transportws.client.ola.OlaClient;
import co.igb.transportws.dto.ola.*;
import co.igb.util.Constants;
import com.fasterxml.jackson.databind.ObjectMapper;

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

    public TypesOlaResponseDTO listTypeFlet(String companyName) {
        GuiaOlaDTO dto = new GuiaOlaDTO();

        if (companyName.equals("IGB")) {
            dto.setCodigocliente(appBean.obtenerValorPropiedad(Constants.IGB_OLA_WS_API_CODIGO));
            dto.setApikey(appBean.obtenerValorPropiedad(Constants.IGB_OLA_WS_API_KEY));
        } else {
            dto.setCodigocliente(appBean.obtenerValorPropiedad(Constants.MTZ_OLA_WS_API_CODIGO));
            dto.setApikey(appBean.obtenerValorPropiedad(Constants.MTZ_OLA_WS_API_KEY));
        }

        try {
            String res = service.postTipoFletes(dto);
            TypesOlaResponseDTO typesResponseDTO = new ObjectMapper().readValue(res, TypesOlaResponseDTO.class);

            return typesResponseDTO;
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de OLA [WS_TIPOS_FLETES]. ", e);
        }
        return null;
    }

    public GuiaOlaResponseDTO generateGuia(GuiaOlaDTO dto, String companyName) {
        if (companyName.equals("IGB")) {
            dto.setCodigocliente(appBean.obtenerValorPropiedad(Constants.IGB_OLA_WS_API_CODIGO));
            dto.setApikey(appBean.obtenerValorPropiedad(Constants.IGB_OLA_WS_API_KEY));
        } else {
            dto.setCodigocliente(appBean.obtenerValorPropiedad(Constants.MTZ_OLA_WS_API_CODIGO));
            dto.setApikey(appBean.obtenerValorPropiedad(Constants.MTZ_OLA_WS_API_KEY));
        }

        try {
            String res = service.postGenerarGuia(dto);
            GuiaOlaResponseDTO guiaResponseDTO = new ObjectMapper().readValue(res, GuiaOlaResponseDTO.class);

            return guiaResponseDTO;
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de OLA [WS_GENERAR_GUIAS]. ", e);
        }
        return null;
    }

    public String printGuia(String guia, String companyName) {
        PrintOlaDTO dto = new PrintOlaDTO();

        if (companyName.equals("IGB")) {
            dto.setCodigocliente(appBean.obtenerValorPropiedad(Constants.IGB_OLA_WS_API_CODIGO));
            dto.setApikey(appBean.obtenerValorPropiedad(Constants.IGB_OLA_WS_API_KEY));
        } else {
            dto.setCodigocliente(appBean.obtenerValorPropiedad(Constants.MTZ_OLA_WS_API_CODIGO));
            dto.setApikey(appBean.obtenerValorPropiedad(Constants.MTZ_OLA_WS_API_KEY));
        }
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
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de OLA [WS_IMPRIMIR_GUIA]. ", e);
        }

        return null;
    }

    public String printRotulo(String guia, String companyName) {
        PrintOlaDTO dto = new PrintOlaDTO();

        if (companyName.equals("IGB")) {
            dto.setCodigocliente(appBean.obtenerValorPropiedad(Constants.IGB_OLA_WS_API_CODIGO));
            dto.setApikey(appBean.obtenerValorPropiedad(Constants.IGB_OLA_WS_API_KEY));
        } else {
            dto.setCodigocliente(appBean.obtenerValorPropiedad(Constants.MTZ_OLA_WS_API_CODIGO));
            dto.setApikey(appBean.obtenerValorPropiedad(Constants.MTZ_OLA_WS_API_KEY));
        }
        dto.setParamguia(guia);

        try {
            String response = service.postImpresionRotulos(dto);
            PrintOlaResponseDTO printOlaResponseDTO = new ObjectMapper().readValue(response, PrintOlaResponseDTO.class);

            if (printOlaResponseDTO.getData().contains("https")) {
                return printOlaResponseDTO.getData();
            } else {
                File file = new File(appBean.obtenerValorPropiedad("url.archivo") + companyName + File.separator + "shipping" +
                        File.separator + "ola" + File.separator + "rotulo" + File.separator + guia + ".pdf");

                try (FileOutputStream fos = new FileOutputStream(file)) {
                    byte[] decoder = Base64.getDecoder().decode(printOlaResponseDTO.getData());
                    fos.write(decoder);
                    CONSOLE.log(Level.INFO, "Archivo rotulo de guia #{0} de transportadora Ola guardado", guia);
                } catch (Exception e) {
                    CONSOLE.log(Level.SEVERE, "Ocurrio un error guardando el rotulo PDF para la guia #" + guia + " de la transportadora Ola", e);
                }

                return appBean.obtenerValorPropiedad("url.shared") + companyName + "/shipping/ola/rotulo/" + guia + ".pdf";
            }
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de OLA [WS_IMPRIMIR_ROTULOS]. ", e);
        }

        return null;
    }

    public String printSticker(String guia, String companyName) {
        PrintSticketOlaDTO dto = new PrintSticketOlaDTO();

        if (companyName.equals("IGB")) {
            dto.setCodigocliente(appBean.obtenerValorPropiedad(Constants.IGB_OLA_WS_API_CODIGO));
            dto.setApikey(appBean.obtenerValorPropiedad(Constants.IGB_OLA_WS_API_KEY));
        } else {
            dto.setCodigocliente(appBean.obtenerValorPropiedad(Constants.MTZ_OLA_WS_API_CODIGO));
            dto.setApikey(appBean.obtenerValorPropiedad(Constants.MTZ_OLA_WS_API_KEY));
        }
        dto.setGuia(guia);
        //TODO: tipo 1=10cm x 6cm, 2=10cm x 10cm
        dto.setTipo("2");

        try {
            String response = service.postImpresionSticker(dto);
            PrintOlaResponseDTO printOlaResponseDTO = new ObjectMapper().readValue(response, PrintOlaResponseDTO.class);
            return printOlaResponseDTO.getRutapdf();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de OLA [WS_IMPRIMIR_STICKER]. ", e);
        }

        return null;
    }

    public DestinationsOlaResponseDTO listDestinations(String companyName) {
        DestinationsOlaDTO dto = new DestinationsOlaDTO();

        if (companyName.equals("IGB")) {
            dto.setCodigocliente(appBean.obtenerValorPropiedad(Constants.IGB_OLA_WS_API_CODIGO));
            dto.setApikey(appBean.obtenerValorPropiedad(Constants.IGB_OLA_WS_API_KEY));
            dto.setOrigen("1");
        } else {
            dto.setCodigocliente(appBean.obtenerValorPropiedad(Constants.MTZ_OLA_WS_API_CODIGO));
            dto.setApikey(appBean.obtenerValorPropiedad(Constants.MTZ_OLA_WS_API_KEY));
            dto.setOrigen("2");
        }

        try {
            String res = service.postCiudadesDestino(dto);
            DestinationsOlaResponseDTO destinationsDTO = new ObjectMapper().readValue(res, DestinationsOlaResponseDTO.class);

            return destinationsDTO;
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de OLA [WS_GENERAR_GUIAS]. ", e);
        }
        return null;
    }
}