package co.igb.transportws.dto.aldia;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author jguisao
 */
public class RotuloAldiaDTO implements Serializable {
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class Data implements Serializable {
        @JsonProperty("Remesa1")
        private String remesa1;
        @JsonProperty("Remesa2")
        private String remesa2;

        public String getRemesa1() {
            return remesa1;
        }

        public void setRemesa1(String remesa1) {
            this.remesa1 = remesa1;
        }

        public String getRemesa2() {
            return remesa2;
        }

        public void setRemesa2(String remesa2) {
            this.remesa2 = remesa2;
        }
    }
}