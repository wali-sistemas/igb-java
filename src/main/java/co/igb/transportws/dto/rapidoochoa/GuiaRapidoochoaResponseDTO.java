package co.igb.transportws.dto.rapidoochoa;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author jguisao
 */
public class GuiaRapidoochoaResponseDTO implements Serializable {
    @JsonProperty("message")
    protected String message;
    @JsonProperty("status")
    protected Integer status;
    @JsonProperty("valores")
    protected Valor valores;

    public static class Valor implements Serializable {
        @JsonProperty("numero_guia")
        protected String numeroGuia;
        @JsonProperty("id_guia")
        protected String idGuia;
        @JsonProperty("link_impresion")
        protected String linkImpresion;
        @JsonProperty("impresion")
        protected Impresion impresion;

        public static class Impresion {
            @JsonProperty("link_impresion_rotulos")
            protected String linkImpresionRotulos;
            @JsonProperty("link_impresion")
            protected String linkImpresion;
            @JsonProperty("codigos_zpl")
            protected List<CodigosZPL> codigos_zpl;
            @JsonProperty("link_impresion_full")
            protected String linkImpresionFull;

            public static class CodigosZPL {
                @JsonProperty("zpl")
                protected String zpl;

                public String getZpl() {
                    return zpl;
                }

                public void setZpl(String zpl) {
                    this.zpl = zpl;
                }
            }

            public String getLinkImpresionRotulos() {
                return linkImpresionRotulos;
            }

            public void setLinkImpresionRotulos(String linkImpresionRotulos) {
                this.linkImpresionRotulos = linkImpresionRotulos;
            }

            public String getLinkImpresion() {
                return linkImpresion;
            }

            public void setLinkImpresion(String linkImpresion) {
                this.linkImpresion = linkImpresion;
            }

            public List<CodigosZPL> getCodigos_zpl() {
                return codigos_zpl;
            }

            public void setCodigos_zpl(List<CodigosZPL> codigos_zpl) {
                this.codigos_zpl = codigos_zpl;
            }

            public String getLinkImpresionFull() {
                return linkImpresionFull;
            }

            public void setLinkImpresionFull(String linkImpresionFull) {
                this.linkImpresionFull = linkImpresionFull;
            }
        }

        public Impresion getImpresion() {
            return impresion;
        }

        public void setImpresion(Impresion impresion) {
            this.impresion = impresion;
        }

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