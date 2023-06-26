package co.igb.transportws.ejb;

import co.igb.dto.ApiTransprensaDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.transportws.client.transprensa.TransprensaClient;
import co.igb.transportws.dto.transprensa.GuiaTransprensaDTO;
import co.igb.transportws.dto.transprensa.GuiaTransprensaResponseDTO;
import co.igb.transportws.dto.transprensa.RotuloTransprensaDTO;
import co.igb.transportws.dto.transprensa.RotuloTrasnprensaResponseDTO;
import co.igb.util.Constants;
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
public class TransprensaEJB {
    private static final Logger CONSOLE = Logger.getLogger(TransprensaEJB.class.getSimpleName());
    private TransprensaClient service;
    @Inject
    private IGBApplicationBean appBean;

    @PostConstruct
    private void initialize() {
        try {
            service = new TransprensaClient(appBean.obtenerValorPropiedad(Constants.TRANSPRENSA_WS_URL));
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de Transprensa [WS_GUIAS]. ", e);
        }
    }

    public String getRotuloGuia(String guia) {
        RotuloTransprensaDTO dto = new RotuloTransprensaDTO();
        dto.setGuia_inicial(guia);
        dto.setGuia_final("");

        Gson gson = new Gson();
        String JSON = gson.toJson(dto);
        CONSOLE.log(Level.INFO, JSON);

        try {
            RotuloTrasnprensaResponseDTO res = service.consultarRotulo(appBean.obtenerValorPropiedad(Constants.TRANSPRENSA_WS_USER), appBean.obtenerValorPropiedad(Constants.TRANSPRENSA_WS_PASSWORD), appBean.obtenerValorPropiedad(Constants.TRANSPRENSA_WS_CODIGO), dto);

            if (res.isSuccess()) {
                return res.getData().get(0).getRotulo();
            } else {
                return null;
            }
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de TRANSPRENSA [WS_CONSULTAR_ROTULO]. ", e);
        }
        return null;
    }

    public GuiaTransprensaResponseDTO addGuia(ApiTransprensaDTO dto) {
        GuiaTransprensaDTO guia = new GuiaTransprensaDTO();
        GuiaTransprensaDTO.Remitente remitente = new GuiaTransprensaDTO.Remitente();
        GuiaTransprensaDTO.Destinatario destino = new GuiaTransprensaDTO.Destinatario();
        GuiaTransprensaDTO.Detalle detalle = new GuiaTransprensaDTO.Detalle();

        //Remitente
        remitente.setRemitenteCodigo("");
        remitente.setTipoDocumentoRemitenteCodigo("2");
        remitente.setRemitenteDocumento(dto.getDocumentor());
        remitente.setRemitenteNombre(dto.getNombrer());
        remitente.setRemitenteDireccion(dto.getDireccionr());
        remitente.setRemitenteTelefono(dto.getTelefonor());
        remitente.setRemitenteCiudadCodigo(dto.getCodCiudadr());
        guia.setRemitente(remitente);
        //Destinatario
        destino.setDestinatarioCodigo("");
        destino.setTipoDocumentoDestinatarioCodigo("1");
        destino.setDestinatarioDocumento(dto.getDocumentod());
        destino.setDestinatarioNombre(dto.getNombred());
        destino.setDestinatarioDireccion(dto.getDirecciond());
        destino.setDestinatarioTelefono(dto.getTelefonod());
        destino.setDestinatarioCiudadCodigo(dto.getCodCiudadd());
        guia.setDestinatario(destino);
        //Encabezado
        guia.setCiudadCodigoOrigen(dto.getCodCiudadr());
        guia.setCiudadCodigoDestino(dto.getCodCiudadd());
        guia.setTipoServicio("2");
        guia.setCentroCosto("1");
        guia.setOrdenCarga("");
        guia.setOrdenCompra(dto.getFactura());
        guia.setDocumentoCliente(dto.getDocumentod());
        guia.setRemesaObservacion(dto.getObservacion());
        guia.setRemesaCodigo("");
        guia.setFormaPago("");
        guia.setOtrosValores("");
        //Detalle
        List<GuiaTransprensaDTO.Detalle> detail = new ArrayList<>();
        detalle.setDetallePeso(dto.getPeso());
        detalle.setDetalleVolumen(dto.getVolumen());
        detalle.setDetalleValorDeclarado(dto.getVlrDecl());
        detalle.setDetalleProductoCodigo("3559");
        detalle.setDetalleCantidad(dto.getCant());
        detalle.setDetalleDescripcion(dto.getDescripcion());
        detail.add(detalle);

        guia.setDetalle(detail);

        Gson gson = new Gson();
        String JSON = gson.toJson(guia);
        CONSOLE.log(Level.INFO, JSON);

        try {
             return service.addRemesaCredito(appBean.obtenerValorPropiedad(Constants.TRANSPRENSA_WS_USER), appBean.obtenerValorPropiedad(Constants.TRANSPRENSA_WS_PASSWORD), appBean.obtenerValorPropiedad(Constants.TRANSPRENSA_WS_CODIGO), guia);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la interface de TRANSPRENSA [WS_CREAR_REMESA]. ", e);
        }
        return null;
    }
}