package co.igb.transportws.dto.ola;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

/**
 * @author jguisao
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class GuiaOlaResponseDTO {
    protected String status;
    protected String mensaje;
    protected Data data;
    protected List<Error> error;

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

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public List<Error> getError() {
        return error;
    }

    public void setError(List<Error> error) {
        this.error = error;
    }

    public static class Data {
        protected String codigoperador;
        protected String nombreoperador;
        protected String flete;
        protected Integer fletevariable;
        protected Integer totalenvio;
        protected String trayecto;
        protected String numeroenvio;

        public String getCodigoperador() {
            return codigoperador;
        }

        public void setCodigoperador(String codigoperador) {
            this.codigoperador = codigoperador;
        }

        public String getNombreoperador() {
            return nombreoperador;
        }

        public void setNombreoperador(String nombreoperador) {
            this.nombreoperador = nombreoperador;
        }

        public String getFlete() {
            return flete;
        }

        public void setFlete(String flete) {
            this.flete = flete;
        }

        public Integer getFletevariable() {
            return fletevariable;
        }

        public void setFletevariable(Integer fletevariable) {
            this.fletevariable = fletevariable;
        }

        public Integer getTotalenvio() {
            return totalenvio;
        }

        public void setTotalenvio(Integer totalenvio) {
            this.totalenvio = totalenvio;
        }

        public String getTrayecto() {
            return trayecto;
        }

        public void setTrayecto(String trayecto) {
            this.trayecto = trayecto;
        }

        public String getNumeroenvio() {
            return numeroenvio;
        }

        public void setNumeroenvio(String numeroenvio) {
            this.numeroenvio = numeroenvio;
        }
    }

    public static class Error {
        protected String error;

        public String getError() {
            return error;
        }

        public void setError(String error) {
            this.error = error;
        }
    }
}