package co.igb.transportws.dto.ola;

/**
 * @author jguisao
 */
public class PrintOlaDTO {
    private String codigocliente;
    private String apikey;
    private String paramguia;

    public String getCodigocliente() {
        return codigocliente;
    }

    public void setCodigocliente(String codigocliente) {
        this.codigocliente = codigocliente;
    }

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public String getParamguia() {
        return paramguia;
    }

    public void setParamguia(String paramguia) {
        this.paramguia = paramguia;
    }
}