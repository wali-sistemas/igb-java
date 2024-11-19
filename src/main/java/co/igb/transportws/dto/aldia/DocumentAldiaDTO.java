package co.igb.transportws.dto.aldia;

import java.io.Serializable;

/**
 * @author jguisao
 */
public class DocumentAldiaDTO implements Serializable {
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class Data implements Serializable {
        private String remesaRango1;
        private String remesaRango2;

        public String getRemesaRango1() {
            return remesaRango1;
        }

        public void setRemesaRango1(String remesaRango1) {
            this.remesaRango1 = remesaRango1;
        }

        public String getRemesaRango2() {
            return remesaRango2;
        }

        public void setRemesaRango2(String remesaRango2) {
            this.remesaRango2 = remesaRango2;
        }
    }
}