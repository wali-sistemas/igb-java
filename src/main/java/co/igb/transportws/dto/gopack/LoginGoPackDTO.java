package co.igb.transportws.dto.gopack;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author jguisao
 */
public class LoginGoPackDTO implements Serializable {
    @JsonProperty("usuario_login")
    private String usuarioLogin;
    @JsonProperty("usuario_password")
    private String usuarioPassword;

    public String getUsuarioLogin() {
        return usuarioLogin;
    }

    public void setUsuarioLogin(String usuarioLogin) {
        this.usuarioLogin = usuarioLogin;
    }

    public String getUsuarioPassword() {
        return usuarioPassword;
    }

    public void setUsuarioPassword(String usuarioPassword) {
        this.usuarioPassword = usuarioPassword;
    }

    @Override
    public String toString() {
        return "LoginGoPackDTO{" +
                "usuario_login='" + usuarioLogin + '\'' +
                ", usuario_password='" + usuarioPassword + '\'' +
                '}';
    }
}