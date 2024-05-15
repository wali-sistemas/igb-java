package co.igb.transportws.dto.gopack;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author jguisao
 */
public class LoginGoPackDTO {
    @JsonProperty("usuario_login")
    private String usuarioLogin;
    @JsonProperty("usuario_password")
    private String usuarioPassword;

    public LoginGoPackDTO() {
    }

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
                "usuarioLogin='" + usuarioLogin + '\'' +
                ", usuarioPassword='" + usuarioPassword + '\'' +
                '}';
    }
}