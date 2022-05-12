package co.igb.transportws.dto.rapidoochoa;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GuiaResponseDTO implements Serializable {
    protected String message;
    protected Integer status;
    protected Valor valores;

    public GuiaResponseDTO() {
    }

    public static class Valor {
        protected String numero_guia;
        protected String id_guia;
        protected String link_impresion;

        public String getNumero_guia() {
            return numero_guia;
        }

        public void setNumero_guia(String numero_guia) {
            this.numero_guia = numero_guia;
        }

        public String getId_guia() {
            return id_guia;
        }

        public void setId_guia(String id_guia) {
            this.id_guia = id_guia;
        }

        public String getLink_impresion() {
            return link_impresion;
        }

        public void setLink_impresion(String link_impresion) {
            this.link_impresion = link_impresion;
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