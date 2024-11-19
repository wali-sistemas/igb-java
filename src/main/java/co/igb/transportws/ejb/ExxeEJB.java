package co.igb.transportws.ejb;

import co.igb.dto.ApiExxeDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.transportws.client.exxe.ExxeClient;
import co.igb.transportws.dto.exxe.*;
import co.igb.util.Constants;
import com.google.gson.Gson;

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
public class ExxeEJB {
    private static final Logger CONSOLE = Logger.getLogger(ExxeEJB.class.getSimpleName());
    private ExxeClient service;
    @Inject
    private IGBApplicationBean appBean;

    @PostConstruct
    private void initialize() {
        try {
            service = new ExxeClient(appBean.obtenerValorPropiedad(Constants.EXXE_WS_URL));
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de Exxe [WS_GUIAS]. ", e);
        }
    }

    private String createToken(String companyName) {
        LoginExxeDTO dto = new LoginExxeDTO();

        if (companyName.contains("IGB")) {
            dto.setUsername(appBean.obtenerValorPropiedad(Constants.IGB_EXXE_WS_USER));
            dto.setPassword(appBean.obtenerValorPropiedad(Constants.IGB_EXXE_WS_PASSWORD));
        }

        Gson gson = new Gson();
        String JSON = gson.toJson(dto);
        CONSOLE.log(Level.INFO, JSON);

        try {
            LoginExxeResponseDTO res = service.findToken(dto);
            return res.getAccessToken();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar un token de Exxe para " + companyName, e);
        }
        return null;
    }

    public GuiaExxeResponseDTO createGuia(ApiExxeDTO dto, String companyName) {
        String token = createToken(companyName);
        if (token != null) {
            GuiaExxeDTO guiaExxeDTO = new GuiaExxeDTO();
            guiaExxeDTO.setShipToIdentification(dto.getDocumentod());
            guiaExxeDTO.setShipToName(dto.getNombred());
            guiaExxeDTO.setShipToAddress(dto.getDirecciond());
            guiaExxeDTO.setShipToPhoneNumber(dto.getTelefonod());
            guiaExxeDTO.setShipToCityCode(dto.getCodCiudadd());
            guiaExxeDTO.setShipFromCityCode(dto.getCodCiudadr());
            guiaExxeDTO.setShipToEmail("analistatransporte@igbcolombia.com");
            guiaExxeDTO.setDescription("CARGA GENERAL - " + dto.getDescripcion());
            guiaExxeDTO.setWeightKg(Integer.parseInt(dto.getPeso()));
            guiaExxeDTO.setDeclaredValue(Integer.parseInt(dto.getVlrDecl()));
            guiaExxeDTO.setQuantitypackages(Integer.parseInt(dto.getCant()));
            guiaExxeDTO.setIdAccountCustomer(Integer.parseInt(dto.getDocumentor()));
            guiaExxeDTO.setReferenceDocument("FV-" + dto.getFactura());
            guiaExxeDTO.setMoneyCollect(0);

            Gson gson = new Gson();
            String JSON = gson.toJson(guiaExxeDTO);
            CONSOLE.log(Level.INFO, JSON);

            try {
                return service.createGuia(guiaExxeDTO, token);
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de Exxe [WS_CREATE_GUIA]. ", e);
            }
            return null;
        }
        CONSOLE.log(Level.SEVERE, "Ocurrio un error obteniendo el token para crear la guia en Exxe.");
        return null;
    }

    public String generatePrintDocument(String guia, String companyName) {
        String token = createToken(companyName);
        if (token != null) {
            try {
                DocumentExxeResponseDTO resRotulo = service.printRotulo(guia, token);
                DocumentExxeResponseDTO resDocument = null;
                if (resRotulo.getCode() == 1) {
                    resDocument = service.printGuia(guia, token);
                    if (resDocument.getCode() == 1) {
                        StringBuilder sbDocument = new StringBuilder();
                        //TODO: Se recorre la cadena Base64 de la guia, para almacearlo en un StringBuilder porque un String no soporta tantos carácteres
                        for (int i = resDocument.getLabelBase64().length() - 1; i >= 0; i--) {
                            String fileReverse = "";
                            fileReverse = fileReverse + resDocument.getLabelBase64().charAt(i);
                            sbDocument.append(fileReverse);
                        }
                        convertFile(sbDocument.reverse(), "guia", guia, companyName);
                    } else {
                        CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando el documento de remesa de la guia {0} en Exxe. error={1}", new Object[]{guia, resRotulo.getMessage()});
                    }

                    StringBuilder sbRotulo = new StringBuilder();
                    //TODO: Se recorre la cadena Base64 del rotulo, para almacearlo en un StringBuilder porque un String no soporta tantos carácteres
                    for (int i = resRotulo.getLabelBase64().length() - 1; i >= 0; i--) {
                        String fileReverse = "";
                        fileReverse = fileReverse + resRotulo.getLabelBase64().charAt(i);
                        sbRotulo.append(fileReverse);
                    }
                    return convertFile(sbRotulo.reverse(), "rotulo", guia, companyName);
                } else {
                    CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando el rotulo de la guia {0} en Exxe. error={1}", new Object[]{guia, resDocument.getMessage()});
                    return null;
                }
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de Exxe [WS_CREATE_GUIA]. ", e);
            }
            return null;
        }
        return null;
    }

    private String convertFile(StringBuilder sb, String typeDoc, String guia, String companyName) {
        //TODO: Se procede a decodificar la cadena Base64 a pdf
        String rutaFile = appBean.obtenerValorPropiedad("url.archivo") + companyName + File.separator + "shipping" + File.separator + "exxe" + File.separator + typeDoc + File.separator + guia + ".pdf";
        File file = new File(rutaFile);

        try (FileOutputStream fos = new FileOutputStream(file)) {
            byte[] decoder = Base64.getDecoder().decode(sb.toString());
            fos.write(decoder);
            CONSOLE.log(Level.INFO, "Archivo de guia #{0} de transportadora Exxe guardado", guia);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error guardando el PDF para la guia #" + guia + " de la transportadora Exxe", e);
        }

        return appBean.obtenerValorPropiedad("url.shared") + companyName + "/shipping/exxe/" + typeDoc + "/" + guia + ".pdf";
    }
}