package co.igb.transportws.dto.transprensa;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RotuloTransprensaDTO implements Serializable {
    @JsonProperty("guia_inicial")
    protected String guiaInicial;
    @JsonProperty("guia_final")
    protected String guiaFinal;

    public String getGuiaInicial() {
        return guiaInicial;
    }

    public void setGuiaInicial(String guiaInicial) {
        this.guiaInicial = guiaInicial;
    }

    public String getGuiaFinal() {
        return guiaFinal;
    }

    public void setGuiaFinal(String guiaFinal) {
        this.guiaFinal = guiaFinal;
    }

    @Override
    public String toString() {
        return "RotuloTransprensaDTO{" +
                "guia_inicial='" + guiaInicial + '\'' +
                ", guia_final='" + guiaFinal + '\'' +
                '}';
    }
}