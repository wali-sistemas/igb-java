package co.igb.transportws.dto.rapidoochoa;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author jguisao
 */
public class GuiaResponseDTO implements Serializable {
    @JsonProperty("message")
    protected String message;
    @JsonProperty("status")
    protected Integer status;
    @JsonProperty("valores")
    protected Valor valores;

    public GuiaResponseDTO(Integer status) {
        this.status = status;
    }

    public static class Valor implements Serializable {
        @JsonProperty("numero_guia")
        protected String numeroGuia;
        @JsonProperty("id_guia")
        protected String idGuia;
        @JsonProperty("link_impresion")
        protected String linkImpresion;

        public String getNumeroGuia() {
            return numeroGuia;
        }

        public void setNumeroGuia(String numeroGuia) {
            this.numeroGuia = numeroGuia;
        }

        public String getIdGuia() {
            return idGuia;
        }

        public void setIdGuia(String idGuia) {
            this.idGuia = idGuia;
        }

        public String getLinkImpresion() {
            return linkImpresion;
        }

        public void setLinkImpresion(String linkImpresion) {
            this.linkImpresion = linkImpresion;
        }
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Valor getValores() {
        return valores;
    }

    public void setValores(Valor valores) {
        this.valores = valores;
    }
}