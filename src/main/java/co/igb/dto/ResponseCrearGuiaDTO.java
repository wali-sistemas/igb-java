package co.igb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseCrearGuiaDTO {
    private String numeroGuia;
    private String linkDeConsulta;
    private List<DatosAdicionales> datosAdicionales;

    public ResponseCrearGuiaDTO() {
        datosAdicionales = new ArrayList<>();
    }

    public String getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    public String getLinkDeConsulta() {
        return linkDeConsulta;
    }

    public void setLinkDeConsulta(String linkDeConsulta) {
        this.linkDeConsulta = linkDeConsulta;
    }

    public List<DatosAdicionales> getDatosAdicionales() {
        return datosAdicionales;
    }

    public void setDatosAdicionales(List<DatosAdicionales> datosAdicionales) {
        this.datosAdicionales = datosAdicionales;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DatosAdicionales {
        private String clave;
        private String valor;

        public DatosAdicionales() {
        }

        public String getClave() {
            return this.clave;
        }

        public void setClave(String clave) {
            this.clave = clave;
        }

        public String getValor() {
            return this.valor;
        }

        public void setValor(String valor) {
            this.valor = valor;
        }
    }
}