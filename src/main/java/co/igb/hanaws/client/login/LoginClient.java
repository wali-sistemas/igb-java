package co.igb.hanaws.client.login;

import co.igb.hanaws.dto.login.LoginDTO;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.core.Response;

/**
 * @author jguisao
 */
public class LoginClient {
    private WebTarget webTarget;
    private Client client;

    public LoginClient(String BASE_URI) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI);
    }

    public LoginClient(String BASE_URI, String path) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path(path);
    }

    public Response getItem() {
        return webTarget.request(MediaType.APPLICATION_JSON).
                get(Response.class);
    }

    public Response getSessionID(LoginDTO dto) {
        return webTarget.request(MediaType.APPLICATION_JSON).
                post(Entity.entity(dto, MediaType.APPLICATION_JSON), Response.class);
    }
}