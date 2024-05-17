package co.igb.transportws.client.gopack;

import co.igb.transportws.dto.gopack.LoginGoPackDTO;
import co.igb.transportws.dto.gopack.LoginGoPackResponseDTO;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 * @author jguisao
 */
public class GopackClient {
    private WebTarget webTarget;
    private Client client;

    public GopackClient(String BASE_URI) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI);
    }

    public GopackClient(String BASE_URI, String path) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path(path);
    }

    public LoginGoPackResponseDTO getToken(LoginGoPackDTO dto) {
        return webTarget.path("")
                .queryParam("api", "servicio.Seguridad.login")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(dto, MediaType.APPLICATION_JSON), LoginGoPackResponseDTO.class);
    }
}