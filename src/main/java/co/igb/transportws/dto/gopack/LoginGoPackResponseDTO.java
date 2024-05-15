package co.igb.transportws.dto.gopack;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author jguisao
 */
public class LoginGoPackResponseDTO implements Serializable {
    @JsonProperty("success")
    private boolean success;
    @JsonProperty("data")
    private Data data;
    @JsonProperty("msg")
    private String msg;

    public LoginGoPackResponseDTO() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class Data implements Serializable {
        private Usuario usuario;
        private String token;

        public Usuario getUsuario() {
            return usuario;
        }

        public void setUsuario(Usuario usuario) {
            this.usuario = usuario;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public static class Usuario implements Serializable {
            @JsonProperty("usuario_codigo")
            private String usuarioCodigo;
            @JsonProperty("usuario_nombre")
            private String usuarioNombre;
            @JsonProperty("usuario_cambioclave")
            private boolean usuarioCambioclave;
            @JsonProperty("empresa_nombre")
            private String empresaNombre;
            @JsonProperty("empresa_codigo_cs")
            private String empresa_codigo_cs;

            public String getUsuarioCodigo() {
                return usuarioCodigo;
            }

            public void setUsuarioCodigo(String usuarioCodigo) {
                this.usuarioCodigo = usuarioCodigo;
            }

            public String getUsuarioNombre() {
                return usuarioNombre;
            }

            public void setUsuarioNombre(String usuarioNombre) {
                this.usuarioNombre = usuarioNombre;
            }

            public boolean isUsuarioCambioclave() {
                return usuarioCambioclave;
            }

            public void setUsuarioCambioclave(boolean usuarioCambioclave) {
                this.usuarioCambioclave = usuarioCambioclave;
            }

            public String getEmpresaNombre() {
                return empresaNombre;
            }

            public void setEmpresaNombre(String empresaNombre) {
                this.empresaNombre = empresaNombre;
            }

            public String getEmpresa_codigo_cs() {
                return empresa_codigo_cs;
            }

            public void setEmpresa_codigo_cs(String empresa_codigo_cs) {
                this.empresa_codigo_cs = empresa_codigo_cs;
            }

            @Override
            public String toString() {
                return "Usuario{" +
                        "usuarioCodigo='" + usuarioCodigo + '\'' +
                        ", usuarioNombre='" + usuarioNombre + '\'' +
                        ", usuarioCambioclave=" + usuarioCambioclave +
                        ", empresaNombre='" + empresaNombre + '\'' +
                        ", empresa_codigo_cs='" + empresa_codigo_cs + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "Data{" +
                    "usuario=" + usuario +
                    ", token='" + token + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "LoginGoPackResponseDTO{" +
                "success=" + success +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}