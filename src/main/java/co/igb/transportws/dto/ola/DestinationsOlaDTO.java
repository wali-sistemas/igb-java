package co.igb.transportws.dto.ola;

/**
 * @author jguisao
 */
public class DestinationsOlaDTO {
    private String codigocliente;
    private String apikey;
    private String origen;
    private String parambuscador;

    public DestinationsOlaDTO() {
    }

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

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getParambuscador() {
        return parambuscador;
    }

    public void setParambuscador(String parambuscador) {
        this.parambuscador = parambuscador;
    }
}