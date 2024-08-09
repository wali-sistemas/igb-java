package co.igb.transportws.dto.aldia;

import java.io.Serializable;

/**
 * @author jguisao
 */
public class LoginAldiaDTO implements Serializable {
    private String user;
    private String password;

    public LoginAldiaDTO() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginAldiaDTO{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}