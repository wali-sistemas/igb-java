package co.igb.transportws.ejb;

import co.igb.dto.ApiCoordinadoraDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.transportws.client.coordinadora.CoordinadoraClient;
import co.igb.transportws.dto.coordinadora.GuiaCoordinadoraDTO;
import co.igb.transportws.dto.coordinadora.GuiaCoordinadoraResponseDTO;
import co.igb.util.Constants;
import com.google.gson.Gson;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
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
public class CoordinadoraEJB {
    private static final Logger CONSOLE = Logger.getLogger(CoordinadoraEJB.class.getSimpleName());
    private CoordinadoraClient service;
    @Inject
    private IGBApplicationBean appBean;

    @PostConstruct
    private void initialize() {
        try {
            service = new CoordinadoraClient(appBean.obtenerValorPropiedad(Constants.COORDINADORA_WS_URL));
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de Coordinadora [WS_GUIAS]. ", e);
        }
    }

    public GuiaCoordinadoraResponseDTO generateGuia(ApiCoordinadoraDTO dto, String companyName) {
        GuiaCoordinadoraDTO header = new GuiaCoordinadoraDTO();
        GuiaCoordinadoraDTO.Detalle detail = new GuiaCoordinadoraDTO.Detalle();
        GuiaCoordinadoraDTO.Notificaciones notification = new GuiaCoordinadoraDTO.Notificaciones();
        //Remitente
        header.setIdClient(38002);
        header.setNombreRemitente("IGB");
        header.setDireccionRemitente("CALLE 98 SUR # 48-225 BOD 114");
        header.setTelefonoRemitente("4442025");
        header.setCiudadRemitente("05380000");//La Estrella
        header.setCodigoCuenta(2);
        header.setNivelServicio(1);
        header.setUsuario(appBean.obtenerValorPropiedad(Constants.COORDINADORA_WS_USER));
        header.setClave(appBean.obtenerValorPropiedad(Constants.COORDINADORA_WS_PASSWORD));
        header.setIdRotulo("55");
        //Destinatario
        header.setNombreDestinatario(dto.getNameDestination());
        header.setDireccionDestinatario(dto.getAddressDestination());
        header.setCiudadDestinatario(dto.getCityDestination());
        header.setTelefonoDestinatario(dto.getPhoneDestination());
        //Carga
        header.setValorDeclarado(dto.getValorDeclarado());
        header.setReferencia(dto.getInvoice());
        header.setObservaciones(dto.getObservation());
        header.setContenido(dto.getContents());

        List<GuiaCoordinadoraDTO.Detalle.Item> items = new ArrayList<>();
        GuiaCoordinadoraDTO.Detalle.Item item = new GuiaCoordinadoraDTO.Detalle.Item();
        item.setAlto(dto.getAlto());
        item.setAncho(dto.getAncho());
        item.setLargo(dto.getLargo());
        item.setPeso(dto.getPeso());
        item.setUnidades(dto.getUnidades());
        item.setReferencia(dto.getInvoice());
        item.setNombreEmpaque(dto.getNomEmpaque());
        items.add(item);

        detail.setItem(items);
        header.setDetalle(detail);

        List<GuiaCoordinadoraDTO.Notificaciones.Item> notifications = new ArrayList<>();
        GuiaCoordinadoraDTO.Notificaciones.Item notifItem = new GuiaCoordinadoraDTO.Notificaciones.Item();
        notifItem.setTipoMedio("1");
        notifItem.setDestinoNotificacion(dto.getMailDestination());
        notifications.add(notifItem);

        notification.setItem(notifications);
        header.setNotificaciones(notification);

        Gson gson = new Gson();
        String JSON = gson.toJson(header);
        CONSOLE.log(Level.INFO, JSON);

        try {
            GuiaCoordinadoraResponseDTO res = service.addGuia(header);

            StringBuilder sbRotulo = new StringBuilder();
            //TODO: Se recorre la cadena Base64 del rotulo, para almacearlo en un StringBuilder porque un String no soporta tantos carácteres
            for (int i = res.getPdfRotulo().length() - 1; i >= 0; i--) {
                String fileReverse = "";
                fileReverse = fileReverse + res.getPdfRotulo().charAt(i);
                sbRotulo.append(fileReverse);
            }
            String urlRotulo = convertFile(sbRotulo, "rotulo", res.getCodigoRemision(), companyName);

            StringBuilder sbGuia = new StringBuilder();
            //TODO: Se recorre la cadena Base64 de la guia, para almacearlo en un StringBuilder porque un String no soporta tantos carácteres
            for (int i = res.getPdfGuia().length() - 1; i >= 0; i--) {
                String fileReverse = "";
                fileReverse = fileReverse + res.getPdfGuia().charAt(i);
                sbGuia.append(fileReverse);
            }
            String urlGuia = convertFile(sbGuia, "guia", res.getCodigoRemision(), companyName);

            res.setPdfGuia(urlGuia);
            res.setPdfRotulo(urlRotulo);

            return res;
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de Coordinadora [WS_GENERAR_GUIAS]. ", e);
        }
        return null;
    }

    private String convertFile(StringBuilder sb, String typeDoc, String guia, String companyName) {
        //TODO: Se procede a decodificar la cadena Base64 a pdf
        try (FileOutputStream fos = new FileOutputStream(sb.reverse().toString());) {
            byte[] decoder = Base64.getDecoder().decode(sb.reverse().toString());
            fos.write(decoder);
            CONSOLE.log(Level.INFO, "Archivo de guia #{0} de transportadora Coordinadora guardado", guia);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error guardando el PDF para la guia #" + guia + " de la transportadora Coordinadora", e);
        }

        return appBean.obtenerValorPropiedad("url.shared") + companyName + "/shipping/coordinadora/" + typeDoc + "/" + guia + ".pdf";
    }
}