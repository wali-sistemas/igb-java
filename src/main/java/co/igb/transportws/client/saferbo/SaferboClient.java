package co.igb.transportws.client.saferbo;

import co.igb.transportws.dto.saferbo.GuiaSaferboDTO;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 * @author jguisao
 */
public class SaferboClient {
    private WebTarget webTarget;
    private Client client;

    public SaferboClient(String BASE_URI) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI);
    }

    public SaferboClient(String BASE_URI, String path) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path(path);
    }

    public String postCreateGuia(GuiaSaferboDTO dto) throws ClientErrorException {
        return webTarget.path("ws.generar.guias.directo.php").request(MediaType.TEXT_HTML_TYPE)
                .post(Entity.entity(dto, MediaType.APPLICATION_JSON), String.class);
    }
}