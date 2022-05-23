package co.igb.transportws.dto.rapidoochoa;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TokenResponseDTO implements Serializable {
    protected String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}