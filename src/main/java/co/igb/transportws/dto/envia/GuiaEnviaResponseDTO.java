package co.igb.transportws.dto.envia;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GuiaEnviaResponseDTO implements Serializable {
    private String respuesta;
    @JsonProperty("k_cobrados")
    private Integer kCobrados;
    @JsonProperty("valor_flete")
    private BigDecimal valorFlete;
    @JsonProperty("valor_costom")
    private BigDecimal valorCostom;
    @JsonProperty("valor_otros")
    private BigDecimal valorOtros;
    @JsonProperty("dias_entrega")
    private Integer diasEntrega;
    private String guia;
    @JsonProperty("urlguia")
    private String urlGuia;
    @JsonProperty("num_ordens")
    private String numOrdens;
    @JsonProperty("cod_postaldestino")
    private String codPostalDestino;
    private String cubrimiento;
    private String bt64;

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Integer getkCobrados() {
        return kCobrados;
    }

    public void setkCobrados(Integer kCobrados) {
        this.kCobrados = kCobrados;
    }

    public BigDecimal getValorFlete() {
        return valorFlete;
    }

    public void setValorFlete(BigDecimal valorFlete) {
        this.valorFlete = valorFlete;
    }

    public BigDecimal getValorCostom() {
        return valorCostom;
    }

    public void setValorCostom(BigDecimal valorCostom) {
        this.valorCostom = valorCostom;
    }

    public BigDecimal getValorOtros() {
        return valorOtros;
    }

    public void setValorOtros(BigDecimal valorOtros) {
        this.valorOtros = valorOtros;
    }

    public Integer getDiasEntrega() {
        return diasEntrega;
    }

    public void setDiasEntrega(Integer diasEntrega) {
        this.diasEntrega = diasEntrega;
    }

    public String getGuia() {
        return guia;
    }

    public void setGuia(String guia) {
        this.guia = guia;
    }

    public String getUrlGuia() {
        return urlGuia;
    }

    public void setUrlGuia(String urlGuia) {
        this.urlGuia = urlGuia;
    }

    public String getNumOrdens() {
        return numOrdens;
    }

    public void setNumOrdens(String numOrdens) {
        this.numOrdens = numOrdens;
    }

    public String getCodPostalDestino() {
        return codPostalDestino;
    }

    public void setCodPostalDestino(String codPostalDestino) {
        this.codPostalDestino = codPostalDestino;
    }

    public String getCubrimiento() {
        return cubrimiento;
    }

    public void setCubrimiento(String cubrimiento) {
        this.cubrimiento = cubrimiento;
    }

    public String getBt64() {
        return bt64;
    }

    public void setBt64(String bt64) {
        this.bt64 = bt64;
    }
}
