package co.igb.transportws.dto.coordinadora;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author jguisao
 */
public class GuiaCoordinadoraDTO implements Serializable {
    @JsonProperty("id_cliente")
    private long idClient;
    @JsonProperty("nombre_remitente")
    private String nombreRemitente;
    @JsonProperty("direccion_remitente")
    private String direccionRemitente;
    @JsonProperty("telefono_remitente")
    private String telefonoRemitente;
    @JsonProperty("ciudad_remitente")
    private String ciudadRemitente;
    @JsonProperty("nombre_destinatario")
    private String nombreDestinatario;
    @JsonProperty("direccion_destinatario")
    private String direccionDestinatario;
    @JsonProperty("ciudad_destinatario")
    private String ciudadDestinatario;
    @JsonProperty("telefono_destinatario")
    private String telefonoDestinatario;
    @JsonProperty("valor_declarado")
    private double valorDeclarado;
    @JsonProperty("codigo_cuenta")
    private long codigoCuenta;
    @JsonProperty("contenido")
    private String contenido;
    @JsonProperty("referencia")
    private String referencia;
    @JsonProperty("observaciones")
    private String observaciones;
    @JsonProperty("detalle")
    private Detalle detalle;
    @JsonProperty("nivel_servicio")
    private long nivelServicio;
    @JsonProperty("usuario")
    private String usuario;
    @JsonProperty("clave")
    private String clave;
    @JsonProperty("notificaciones")
    private Notificaciones notificaciones;
    @JsonProperty("id_rotulo")
    private String idRotulo;

    public long getIdClient() {
        return idClient;
    }

    public void setIdClient(long idClient) {
        this.idClient = idClient;
    }

    public String getNombreRemitente() {
        return nombreRemitente;
    }

    public void setNombreRemitente(String nombreRemitente) {
        this.nombreRemitente = nombreRemitente;
    }

    public String getDireccionRemitente() {
        return direccionRemitente;
    }

    public void setDireccionRemitente(String direccionRemitente) {
        this.direccionRemitente = direccionRemitente;
    }

    public String getTelefonoRemitente() {
        return telefonoRemitente;
    }

    public void setTelefonoRemitente(String telefonoRemitente) {
        this.telefonoRemitente = telefonoRemitente;
    }

    public String getCiudadRemitente() {
        return ciudadRemitente;
    }

    public void setCiudadRemitente(String ciudadRemitente) {
        this.ciudadRemitente = ciudadRemitente;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public void setNombreDestinatario(String nombreDestinatario) {
        this.nombreDestinatario = nombreDestinatario;
    }

    public String getDireccionDestinatario() {
        return direccionDestinatario;
    }

    public void setDireccionDestinatario(String direccionDestinatario) {
        this.direccionDestinatario = direccionDestinatario;
    }

    public String getCiudadDestinatario() {
        return ciudadDestinatario;
    }

    public void setCiudadDestinatario(String ciudadDestinatario) {
        this.ciudadDestinatario = ciudadDestinatario;
    }

    public String getTelefonoDestinatario() {
        return telefonoDestinatario;
    }

    public void setTelefonoDestinatario(String telefonoDestinatario) {
        this.telefonoDestinatario = telefonoDestinatario;
    }

    public double getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(double valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    public long getCodigoCuenta() {
        return codigoCuenta;
    }

    public void setCodigoCuenta(long codigoCuenta) {
        this.codigoCuenta = codigoCuenta;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Detalle getDetalle() {
        return detalle;
    }

    public void setDetalle(Detalle detalle) {
        this.detalle = detalle;
    }

    public long getNivelServicio() {
        return nivelServicio;
    }

    public void setNivelServicio(long nivelServicio) {
        this.nivelServicio = nivelServicio;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Notificaciones getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(Notificaciones notificaciones) {
        this.notificaciones = notificaciones;
    }

    public String getIdRotulo() {
        return idRotulo;
    }

    public void setIdRotulo(String idRotulo) {
        this.idRotulo = idRotulo;
    }

    public static class Detalle implements Serializable {
        private List<Item> item;

        public List<Item> getItem() {
            return item;
        }

        public void setItem(List<Item> item) {
            this.item = item;
        }

        public static class Item implements Serializable {
            @JsonProperty("alto")
            private double alto;
            @JsonProperty("ancho")
            private double ancho;
            @JsonProperty("largo")
            private double largo;
            @JsonProperty("peso")
            private double peso;
            @JsonProperty("unidades")
            private long unidades;
            @JsonProperty("referencia")
            private String referencia;
            @JsonProperty("nombre_empaque")
            private String nombreEmpaque;

            public double getAlto() {
                return alto;
            }

            public void setAlto(double alto) {
                this.alto = alto;
            }

            public double getAncho() {
                return ancho;
            }

            public void setAncho(double ancho) {
                this.ancho = ancho;
            }

            public double getLargo() {
                return largo;
            }

            public void setLargo(double largo) {
                this.largo = largo;
            }

            public double getPeso() {
                return peso;
            }

            public void setPeso(double peso) {
                this.peso = peso;
            }

            public long getUnidades() {
                return unidades;
            }

            public void setUnidades(long unidades) {
                this.unidades = unidades;
            }

            public String getReferencia() {
                return referencia;
            }

            public void setReferencia(String referencia) {
                this.referencia = referencia;
            }

            public String getNombreEmpaque() {
                return nombreEmpaque;
            }

            public void setNombreEmpaque(String nombreEmpaque) {
                this.nombreEmpaque = nombreEmpaque;
            }
        }
    }

    public static class Notificaciones implements Serializable {
        private List<Item> item;

        public List<Item> getItem() {
            return item;
        }

        public void setItem(List<Item> item) {
            this.item = item;
        }

        public static class Item implements Serializable {
            @JsonProperty("tipo_medio")
            private String tipoMedio;
            @JsonProperty("destino_notificacion")
            private String destinoNotificacion;

            public String getTipoMedio() {
                return tipoMedio;
            }

            public void setTipoMedio(String tipoMedio) {
                this.tipoMedio = tipoMedio;
            }

            public String getDestinoNotificacion() {
                return destinoNotificacion;
            }

            public void setDestinoNotificacion(String destinoNotificacion) {
                this.destinoNotificacion = destinoNotificacion;
            }
        }
    }
}