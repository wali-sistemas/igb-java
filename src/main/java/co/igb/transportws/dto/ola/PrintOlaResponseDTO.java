package co.igb.transportws.dto.ola;

/**
 * @author jguisao
 */
public class PrintOlaResponseDTO {
    protected String status;
    protected String mensaje;
    protected String data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}