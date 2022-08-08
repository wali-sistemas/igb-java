package co.igb.transportws.dto.ola;

import java.util.List;

/**
 * @author jguisao
 */
public class DestinationsOlaResponseDTO {
    protected String status;
    protected String mensaje;
    protected List<Data> data;

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

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public static class Data {
        protected String codigo;
        protected String nombre;
        protected String dep;

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDep() {
            return dep;
        }

        public void setDep(String dep) {
            this.dep = dep;
        }
    }
}