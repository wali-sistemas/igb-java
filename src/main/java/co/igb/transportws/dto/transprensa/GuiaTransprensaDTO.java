package co.igb.transportws.dto.transprensa;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author jguisao
 */
public class GuiaTransprensaDTO implements Serializable {
    @JsonProperty("CiudadCodigoOrigen")
    protected String ciudadCodigoOrigen;
    @JsonProperty("CiudadCodigoDestino")
    protected String ciudadCodigoDestino;
    @JsonProperty("TipoServicio")
    protected String tipoServicio;
    @JsonProperty("remitente")
    protected Remitente remitente;
    @JsonProperty("destinatario")
    protected Destinatario destinatario;
    @JsonProperty("detalle")
    protected List<Detalle> detalle;
    @JsonProperty("CentroCosto")
    protected String centroCosto;
    @JsonProperty("OrdenCarga")
    protected String ordenCarga;
    @JsonProperty("OrdenCompra")
    protected String ordenCompra;
    @JsonProperty("DocumentoCliente")
    protected String documentoCliente;
    @JsonProperty("RemesaObservacion")
    protected String remesaObservacion;
    @JsonProperty("RemesaCodigo")
    protected String remesaCodigo;
    @JsonProperty("FormaPago")
    protected String formaPago;
    @JsonProperty("OtrosValores")
    protected String otrosValores;

    public String getCiudadCodigoOrigen() {
        return ciudadCodigoOrigen;
    }

    public void setCiudadCodigoOrigen(String ciudadCodigoOrigen) {
        this.ciudadCodigoOrigen = ciudadCodigoOrigen;
    }

    public String getCiudadCodigoDestino() {
        return ciudadCodigoDestino;
    }

    public void setCiudadCodigoDestino(String ciudadCodigoDestino) {
        this.ciudadCodigoDestino = ciudadCodigoDestino;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public Remitente getRemitente() {
        return remitente;
    }

    public void setRemitente(Remitente remitente) {
        this.remitente = remitente;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }

    public List<Detalle> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<Detalle> detalle) {
        this.detalle = detalle;
    }

    public String getCentroCosto() {
        return centroCosto;
    }

    public void setCentroCosto(String centroCosto) {
        this.centroCosto = centroCosto;
    }

    public String getOrdenCarga() {
        return ordenCarga;
    }

    public void setOrdenCarga(String ordenCarga) {
        this.ordenCarga = ordenCarga;
    }

    public String getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(String ordenCompra) {
        this.ordenCompra = ordenCompra;
    }

    public String getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(String documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public String getRemesaObservacion() {
        return remesaObservacion;
    }

    public void setRemesaObservacion(String remesaObservacion) {
        this.remesaObservacion = remesaObservacion;
    }

    public String getRemesaCodigo() {
        return remesaCodigo;
    }

    public void setRemesaCodigo(String remesaCodigo) {
        this.remesaCodigo = remesaCodigo;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getOtrosValores() {
        return otrosValores;
    }

    public void setOtrosValores(String otrosValores) {
        this.otrosValores = otrosValores;
    }

    public static class Remitente implements Serializable {
        @JsonProperty("RemitenteCodigo")
        protected String remitenteCodigo;
        @JsonProperty("TipoDocumentoRemitenteCodigo")
        protected String tipoDocumentoRemitenteCodigo;
        @JsonProperty("RemitenteDocumento")
        protected String remitenteDocumento;
        @JsonProperty("RemitenteNombre")
        protected String remitenteNombre;
        @JsonProperty("RemitenteDireccion")
        protected String remitenteDireccion;
        @JsonProperty("RemitenteTelefono")
        protected String remitenteTelefono;
        @JsonProperty("RemitenteCiudadCodigo")
        protected String remitenteCiudadCodigo;

        public String getRemitenteCodigo() {
            return remitenteCodigo;
        }

        public void setRemitenteCodigo(String remitenteCodigo) {
            this.remitenteCodigo = remitenteCodigo;
        }

        public String getTipoDocumentoRemitenteCodigo() {
            return tipoDocumentoRemitenteCodigo;
        }

        public void setTipoDocumentoRemitenteCodigo(String tipoDocumentoRemitenteCodigo) {
            this.tipoDocumentoRemitenteCodigo = tipoDocumentoRemitenteCodigo;
        }

        public String getRemitenteDocumento() {
            return remitenteDocumento;
        }

        public void setRemitenteDocumento(String remitenteDocumento) {
            this.remitenteDocumento = remitenteDocumento;
        }

        public String getRemitenteNombre() {
            return remitenteNombre;
        }

        public void setRemitenteNombre(String remitenteNombre) {
            this.remitenteNombre = remitenteNombre;
        }

        public String getRemitenteDireccion() {
            return remitenteDireccion;
        }

        public void setRemitenteDireccion(String remitenteDireccion) {
            this.remitenteDireccion = remitenteDireccion;
        }

        public String getRemitenteTelefono() {
            return remitenteTelefono;
        }

        public void setRemitenteTelefono(String remitenteTelefono) {
            this.remitenteTelefono = remitenteTelefono;
        }

        public String getRemitenteCiudadCodigo() {
            return remitenteCiudadCodigo;
        }

        public void setRemitenteCiudadCodigo(String remitenteCiudadCodigo) {
            this.remitenteCiudadCodigo = remitenteCiudadCodigo;
        }
    }

    public static class Destinatario implements Serializable {
        @JsonProperty("DestinatarioCodigo")
        protected String destinatarioCodigo;
        @JsonProperty("TipoDocumentoDestinatarioCodigo")
        protected String tipoDocumentoDestinatarioCodigo;
        @JsonProperty("DestinatarioDocumento")
        protected String destinatarioDocumento;
        @JsonProperty("DestinatarioNombre")
        protected String destinatarioNombre;
        @JsonProperty("DestinatarioDireccion")
        protected String destinatarioDireccion;
        @JsonProperty("DestinatarioTelefono")
        protected String destinatarioTelefono;
        @JsonProperty("DestinatarioCiudadCodigo")
        protected String destinatarioCiudadCodigo;

        public String getDestinatarioCodigo() {
            return destinatarioCodigo;
        }

        public void setDestinatarioCodigo(String destinatarioCodigo) {
            this.destinatarioCodigo = destinatarioCodigo;
        }

        public String getTipoDocumentoDestinatarioCodigo() {
            return tipoDocumentoDestinatarioCodigo;
        }

        public void setTipoDocumentoDestinatarioCodigo(String tipoDocumentoDestinatarioCodigo) {
            this.tipoDocumentoDestinatarioCodigo = tipoDocumentoDestinatarioCodigo;
        }

        public String getDestinatarioDocumento() {
            return destinatarioDocumento;
        }

        public void setDestinatarioDocumento(String destinatarioDocumento) {
            this.destinatarioDocumento = destinatarioDocumento;
        }

        public String getDestinatarioNombre() {
            return destinatarioNombre;
        }

        public void setDestinatarioNombre(String destinatarioNombre) {
            this.destinatarioNombre = destinatarioNombre;
        }

        public String getDestinatarioDireccion() {
            return destinatarioDireccion;
        }

        public void setDestinatarioDireccion(String destinatarioDireccion) {
            this.destinatarioDireccion = destinatarioDireccion;
        }

        public String getDestinatarioTelefono() {
            return destinatarioTelefono;
        }

        public void setDestinatarioTelefono(String destinatarioTelefono) {
            this.destinatarioTelefono = destinatarioTelefono;
        }

        public String getDestinatarioCiudadCodigo() {
            return destinatarioCiudadCodigo;
        }

        public void setDestinatarioCiudadCodigo(String destinatarioCiudadCodigo) {
            this.destinatarioCiudadCodigo = destinatarioCiudadCodigo;
        }
    }

    public static class Detalle implements Serializable {
        @JsonProperty("DetallePeso")
        protected String detallePeso;
        @JsonProperty("DetalleVolumen")
        protected String detalleVolumen;
        @JsonProperty("DetalleValorDeclarado")
        protected String detalleValorDeclarado;
        @JsonProperty("DetalleProductoCodigo")
        protected String detalleProductoCodigo;
        @JsonProperty("DetalleCantidad")
        protected String detalleCantidad;
        @JsonProperty("DetalleDescripcion")
        protected String detalleDescripcion;

        public String getDetallePeso() {
            return detallePeso;
        }

        public void setDetallePeso(String detallePeso) {
            this.detallePeso = detallePeso;
        }

        public String getDetalleVolumen() {
            return detalleVolumen;
        }

        public String getDetalleValorDeclarado() {
            return detalleValorDeclarado;
        }

        public void setDetalleValorDeclarado(String detalleValorDeclarado) {
            this.detalleValorDeclarado = detalleValorDeclarado;
        }

        public void setDetalleVolumen(String detalleVolumen) {
            this.detalleVolumen = detalleVolumen;
        }

        public String getDetalleProductoCodigo() {
            return detalleProductoCodigo;
        }

        public void setDetalleProductoCodigo(String detalleProductoCodigo) {
            this.detalleProductoCodigo = detalleProductoCodigo;
        }

        public String getDetalleCantidad() {
            return detalleCantidad;
        }

        public void setDetalleCantidad(String detalleCantidad) {
            this.detalleCantidad = detalleCantidad;
        }

        public String getDetalleDescripcion() {
            return detalleDescripcion;
        }

        public void setDetalleDescripcion(String detalleDescripcion) {
            this.detalleDescripcion = detalleDescripcion;
        }
    }
}