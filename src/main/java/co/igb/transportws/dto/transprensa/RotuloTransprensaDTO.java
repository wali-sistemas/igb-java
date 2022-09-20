package co.igb.transportws.dto.transprensa;

import java.io.Serializable;
import java.util.List;

/**
 * @author jguisao
 */
public class RotuloTransprensaDTO implements Serializable {
    protected List<Remesa> remesas;

    public List<Remesa> getRemesas() {
        return remesas;
    }

    public void setRemesas(List<Remesa> remesas) {
        this.remesas = remesas;
    }

    public static class Remesa implements Serializable {
        protected String remesa;

        public String getRemesa() {
            return remesa;
        }

        public void setRemesa(String remesa) {
            this.remesa = remesa;
        }
    }
}