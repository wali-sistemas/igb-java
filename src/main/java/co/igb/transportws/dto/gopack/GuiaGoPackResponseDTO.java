package co.igb.transportws.dto.gopack;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author jguisao
 */
public class GuiaGoPackResponseDTO implements Serializable {
    private boolean success;
    private Data data;
    private String msg;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class Data implements Serializable {
        @JsonProperty("remesa_codigo")
        private String remesaCodigo;
        @JsonProperty("Tarifa")
        private Double tarifa;

        public String getRemesaCodigo() {
            return remesaCodigo;
        }

        public void setRemesaCodigo(String remesaCodigo) {
            this.remesaCodigo = remesaCodigo;
        }

        public Double getTarifa() {
            return tarifa;
        }

        public void setTarifa(Double tarifa) {
            this.tarifa = tarifa;
        }
    }
}