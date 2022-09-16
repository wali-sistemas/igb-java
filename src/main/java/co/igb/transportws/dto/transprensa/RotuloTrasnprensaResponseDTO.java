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
        @JsonProperty("remesa")
        protected String remesa;
        @JsonProperty("valor")
        protected String valor;
        @JsonProperty("rotulo")
        protected String rotulo;

        public String getRemesa() {
            return remesa;
        }

        public void setRemesa(String remesa) {
            this.remesa = remesa;
        }

        public String getValor() {
            return valor;
        }

        public void setValor(String valor) {
            this.valor = valor;
        }

        public String getRotulo() {
            return rotulo;
        }

        public void setRotulo(String rotulo) {
            this.rotulo = rotulo;
        }
    }
}