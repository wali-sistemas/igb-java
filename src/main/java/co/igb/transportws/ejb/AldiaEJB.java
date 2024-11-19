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
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Base64;
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
            LoginAldiaResponseDTO res = service.findToken(dto);
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
                CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de Aldia [WS_CREATE_GUIA]. ", e);
            }
        } else {
            CONSOLE.log(Level.SEVERE, "Ocurrio una novedad consultando la disponibilidad del token para " + companyName);
            return null;
        }
        return null;
    }

    public String generatePrintDocument(String guia, String companyName) {
        String token = createToken(companyName);
        if (token != null) {
            RotuloAldiaDTO.Data dataRotulo = new RotuloAldiaDTO.Data();
            dataRotulo.setRemesa1(guia);
            dataRotulo.setRemesa2(guia);

            RotuloAldiaDTO dtoRotulo = new RotuloAldiaDTO();
            dtoRotulo.setData(dataRotulo);

            Gson gsonRotulo = new Gson();
            String JSON1 = gsonRotulo.toJson(dtoRotulo);
            CONSOLE.log(Level.INFO, JSON1);

            try {
                String resRotulo = service.findRotulo(dtoRotulo, token);
                RotuloAldiaResponseDTO rotuloAldiaResponseDTO = new ObjectMapper().readValue(resRotulo, RotuloAldiaResponseDTO.class);

                if (rotuloAldiaResponseDTO.getCode().equals(200)) {
                    //Consultar documento de remesa
                    DocumentAldiaDTO.Data dataDocument = new DocumentAldiaDTO.Data();
                    dataDocument.setRemesaRango1(guia);
                    dataDocument.setRemesaRango2(guia);

                    DocumentAldiaDTO dtoDocument = new DocumentAldiaDTO();
                    dtoDocument.setData(dataDocument);

                    Gson gsonDocument = new Gson();
                    String JSON2 = gsonDocument.toJson(dtoDocument);
                    CONSOLE.log(Level.INFO, JSON2);

                    String resDocument = service.findDocument(dtoDocument, token);
                    DocumentAldiaResponseDTO documentAldiaResponseDTO = new ObjectMapper().readValue(resDocument, DocumentAldiaResponseDTO.class);

                    if (documentAldiaResponseDTO.getCode().equals(200)) {
                        StringBuilder sbDocument = new StringBuilder();
                        //TODO: Se recorre la cadena Base64 de la guia, para almacearlo en un StringBuilder porque un String no soporta tantos carácteres
                        for (int i = documentAldiaResponseDTO.getData().length() - 1; i >= 0; i--) {
                            String fileReverse = "";
                            fileReverse = fileReverse + documentAldiaResponseDTO.getData().charAt(i);
                            sbDocument.append(fileReverse);
                        }
                        convertFile(sbDocument.reverse(), "guia", guia, companyName);
                    } else {
                        CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando el documento de remesa de la guia {0} en ALDIA. error={1}", new Object[]{guia, documentAldiaResponseDTO.getCode()});
                    }

                    StringBuilder sbRotulo = new StringBuilder();
                    //TODO: Se recorre la cadena Base64 del rotulo, para almacearlo en un StringBuilder porque un String no soporta tantos carácteres
                    for (int i = rotuloAldiaResponseDTO.getData().length() - 1; i >= 0; i--) {
                        String fileReverse = "";
                        fileReverse = fileReverse + rotuloAldiaResponseDTO.getData().charAt(i);
                        sbRotulo.append(fileReverse);
                    }
                    return convertFile(sbRotulo.reverse(), "rotulo", guia, companyName);
                } else {
                    CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando el rotulo de la guia {0} en ALDIA. error={1}", new Object[]{guia, rotuloAldiaResponseDTO.getCode()});
                    return null;
                }
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de Aldia [WS_CREATE_GUIA]. ", e);
            }
            return null;
        }
        return null;
    }

    public void getCargarRemesa(String companyName) {
        String token = createToken(companyName);
        if (token != null) {
            try {
                String res = service.postCargarRemesa(token);
                RotuloAldiaResponseDTO rotuloAldiaResponseDTO = new ObjectMapper().readValue(res, RotuloAldiaResponseDTO.class);

                if (rotuloAldiaResponseDTO.getCode().equals(200) || rotuloAldiaResponseDTO.getCode().equals(204)) {
                    CONSOLE.log(Level.INFO, "Carga de remesa Aldia exitosa.");
                } else {
                    CONSOLE.log(Level.WARNING, "Ocurrio una novedad cargando la remesa Aldia a la plataforma.");
                }
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de Aldia [WS_CARGA_REMESA]. ", e);
            }
        }
    }

    private String convertFile(StringBuilder sb, String typeDoc, String guia, String companyName) {
        //TODO: Se procede a decodificar la cadena Base64 a pdf
        String rutaFile = appBean.obtenerValorPropiedad("url.archivo") + companyName + File.separator + "shipping" + File.separator + "aldia" + File.separator + typeDoc + File.separator + guia + ".pdf";
        File file = new File(rutaFile);

        try (FileOutputStream fos = new FileOutputStream(file)) {
            byte[] decoder = Base64.getDecoder().decode(sb.toString());
            fos.write(decoder);
            CONSOLE.log(Level.INFO, "Archivo de guia #{0} de transportadora Aldia guardado", guia);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error guardando el PDF para la guia #" + guia + " de la transportadora Aldia", e);
        }

        return appBean.obtenerValorPropiedad("url.shared") + companyName + "/shipping/aldia/" + typeDoc + "/" + guia + ".pdf";
    }
}