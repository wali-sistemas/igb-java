package co.igb.transportws.client.ola;

import co.igb.transportws.dto.ola.GuiaDTO;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 * @author jguisao
 */
public class OlaClient {
    private WebTarget webTarget;
    private Client client;

    public OlaClient(String BASE_URI) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI);
    }

    public OlaClient(String BASE_URI, String path) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path(path);
    }

    public String postTipoFletes(GuiaDTO dto) {
        return webTarget.path("tipofletes").request(MediaType.TEXT_HTML)
                .post(Entity.entity(dto, MediaType.APPLICATION_JSON), String.class);
    }

    public String postGenerarGuia(GuiaDTO dto) {
        return webTarget.path("generarenvio").request(MediaType.TEXT_HTML)
                .post(Entity.entity(dto, MediaType.APPLICATION_JSON), String.class);
    }
}