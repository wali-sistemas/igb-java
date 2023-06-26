package co.igb.transportws.dto.transprensa;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author jguisao
 */
public class RotuloTrasnprensaResponseDTO implements Serializable {
    @JsonProperty("Success")
    protected boolean success;
    @JsonProperty("Msg")
    protected String msj;
    @JsonProperty("Data")
    protected List<Data> data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public static class Data implements Serializable {
        @JsonProperty("guias")
        protected String guias;
        @JsonProperty("url_impresion")
        protected String url_impresion;

        public String getGuias() {
            return guias;
        }

        public void setGuias(String guias) {
            this.guias = guias;
        }

        public String getUrl_impresion() {
            return url_impresion;
        }

        public void setUrl_impresion(String url_impresion) {
            this.url_impresion = url_impresion;
        }
    }
}