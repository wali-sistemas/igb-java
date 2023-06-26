package co.igb.transportws.dto.transprensa;

import java.io.Serializable;

/**
 * @author jguisao
 */
public class RotuloTransprensaDTO implements Serializable {
    protected String guia_inicial;
    protected String guia_final;

    public String getGuia_inicial() {
        return guia_inicial;
    }

    public void setGuia_inicial(String guia_inicial) {
        this.guia_inicial = guia_inicial;
    }

    public String getGuia_final() {
        return guia_final;
    }

    public void setGuia_final(String guia_final) {
        this.guia_final = guia_final;
    }

    @Override
    public String toString() {
        return "RotuloTransprensaDTO{" +
                "guia_inicial='" + guia_inicial + '\'' +
                ", guia_final='" + guia_final + '\'' +
                '}';
    }
}