package co.igb.transportws.dto.transprensa;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author jguisao
 */
public class GuiaTransprensaResponseDTO implements Serializable {
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
        @JsonProperty("Orden")
        protected String orden;
        @JsonProperty("Remesa")
        protected String remesa;
        @JsonProperty("Validacion")
        protected String validacion;
        @JsonProperty("Success")
        protected String success;

        public String getOrden() {
            return orden;
        }

        public void setOrden(String orden) {
            this.orden = orden;
        }

        public String getRemesa() {
            return remesa;
        }

        public void setRemesa(String remesa) {
            this.remesa = remesa;
        }

        public String getValidacion() {
            return validacion;
        }

        public void setValidacion(String validacion) {
            this.validacion = validacion;
        }

        public String getSuccess() {
            return success;
        }

        public void setSuccess(String success) {
            this.success = success;
        }
    }
}