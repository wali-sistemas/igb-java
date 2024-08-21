package co.igb.transportws.dto.aldia;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author jguisao
 */
public class GuiaAldiaDTO implements Serializable {
    private List<Data> data;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public static class Data {
        private String remesa;
        private String ordencargue;
        private String nombreremitente;
        private String direccionremitente;
        private String codigodaneremitente;
        private String documentoremitente;
        private String nombredestinatario;
        private String documentodestinatario;
        private String direcciondestinatario;
        private String telefonodestinatario;
        private String codigodanedestinatario;
        private String divisioncliente;
        private String clasificacionmercancia;
        private String observacion;
        private List<Detalle> detalle;

        public String getRemesa() {
            return remesa;
        }

        public void setRemesa(String remesa) {
            this.remesa = remesa;
        }

        public String getOrdencargue() {
            return ordencargue;
        }

        public void setOrdencargue(String ordencargue) {
            this.ordencargue = ordencargue;
        }

        public String getNombreremitente() {
            return nombreremitente;
        }

        public void setNombreremitente(String nombreremitente) {
            this.nombreremitente = nombreremitente;
        }

        public String getDireccionremitente() {
            return direccionremitente;
        }

        public void setDireccionremitente(String direccionremitente) {
            this.direccionremitente = direccionremitente;
        }

        public String getCodigodaneremitente() {
            return codigodaneremitente;
        }

        public void setCodigodaneremitente(String codigodaneremitente) {
            this.codigodaneremitente = codigodaneremitente;
        }

        public String getDocumentoremitente() {
            return documentoremitente;
        }

        public void setDocumentoremitente(String documentoremitente) {
            this.documentoremitente = documentoremitente;
        }

        public String getNombredestinatario() {
            return nombredestinatario;
        }

        public void setNombredestinatario(String nombredestinatario) {
            this.nombredestinatario = nombredestinatario;
        }

        public String getDocumentodestinatario() {
            return documentodestinatario;
        }

        public void setDocumentodestinatario(String documentodestinatario) {
            this.documentodestinatario = documentodestinatario;
        }

        public String getDirecciondestinatario() {
            return direcciondestinatario;
        }

        public void setDirecciondestinatario(String direcciondestinatario) {
            this.direcciondestinatario = direcciondestinatario;
        }

        public String getTelefonodestinatario() {
            return telefonodestinatario;
        }

        public void setTelefonodestinatario(String telefonodestinatario) {
            this.telefonodestinatario = telefonodestinatario;
        }

        public String getCodigodanedestinatario() {
            return codigodanedestinatario;
        }

        public void setCodigodanedestinatario(String codigodanedestinatario) {
            this.codigodanedestinatario = codigodanedestinatario;
        }

        public String getDivisioncliente() {
            return divisioncliente;
        }

        public void setDivisioncliente(String divisioncliente) {
            this.divisioncliente = divisioncliente;
        }

        public String getClasificacionmercancia() {
            return clasificacionmercancia;
        }

        public void setClasificacionmercancia(String clasificacionmercancia) {
            this.clasificacionmercancia = clasificacionmercancia;
        }

        public String getObservacion() {
            return observacion;
        }

        public void setObservacion(String observacion) {
            this.observacion = observacion;
        }

        public List<Detalle> getDetalle() {
            return detalle;
        }

        public void setDetalle(List<Detalle> detalle) {
            this.detalle = detalle;
        }

        public static class Detalle {
            private String unidades;
            private String peso;
            private String producto;
            @JsonProperty("documento_remitente")
            private String documentoRemitente;
            private String remision;
            private String valordeclarado;
            private String descripcion;
            private String volumen;
            private String empaque;

            public String getUnidades() {
                return unidades;
            }

            public void setUnidades(String unidades) {
                this.unidades = unidades;
            }

            public String getPeso() {
                return peso;
            }

            public void setPeso(String peso) {
                this.peso = peso;
            }

            public String getProducto() {
                return producto;
            }

            public void setProducto(String producto) {
                this.producto = producto;
            }

            public String getDocumentoRemitente() {
                return documentoRemitente;
            }

            public void setDocumentoRemitente(String documentoRemitente) {
                this.documentoRemitente = documentoRemitente;
            }

            public String getRemision() {
                return remision;
            }

            public void setRemision(String remision) {
                this.remision = remision;
            }

            public String getValordeclarado() {
                return valordeclarado;
            }

            public void setValordeclarado(String valordeclarado) {
                this.valordeclarado = valordeclarado;
            }

            public String getDescripcion() {
                return descripcion;
            }

            public void setDescripcion(String descripcion) {
                this.descripcion = descripcion;
            }

            public String getVolumen() {
                return volumen;
            }

            public void setVolumen(String volumen) {
                this.volumen = volumen;
            }

            public String getEmpaque() {
                return empaque;
            }

            public void setEmpaque(String empaque) {
                this.empaque = empaque;
            }
        }
    }
}
