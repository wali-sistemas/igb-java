package co.igb.apiCubic.dto.orden;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CubicOrdenRestDTO implements Serializable {
    protected Long success;
    protected String msg;
    protected Data data;
    protected String debug;

    public CubicOrdenRestDTO() {
    }

    public Long getSuccess() {
        return success;
    }

    public void setSuccess(Long success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getDebug() {
        return debug;
    }

    public void setDebug(String debug) {
        this.debug = debug;
    }

    public static class Data {
        protected Respuestas respuestas;

        public Respuestas getRespuestas() {
            return respuestas;
        }

        public void setRespuestas(Respuestas respuestas) {
            this.respuestas = respuestas;
        }

        public static class Respuestas {
            protected String resultado;
            protected String codigo;
            protected String descripcion;
            protected String id;

            public String getResultado() {
                return resultado;
            }

            public void setResultado(String resultado) {
                this.resultado = resultado;
            }

            public String getCodigo() {
                return codigo;
            }

            public void setCodigo(String codigo) {
                this.codigo = codigo;
            }

            public String getDescripcion() {
                return descripcion;
            }

            public void setDescripcion(String descripcion) {
                this.descripcion = descripcion;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }
        }
    }
}