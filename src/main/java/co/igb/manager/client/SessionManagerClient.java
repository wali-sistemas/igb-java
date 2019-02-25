package co.igb.manager.client;

import co.igb.dto.GenericRESTResponseDTO;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 * @author jguisao
 */
public class SessionManagerClient {

    private WebTarget webTarget;
    private Client client;

    public SessionManagerClient(String BASE_URI) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("session");
    }

    public SessionManagerClient(String BASE_URI, String path) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path(path);
    }

    public GenericRESTResponseDTO openSession(String companyName) {
        return webTarget.path("open").path(companyName).request(MediaType.APPLICATION_JSON).get(GenericRESTResponseDTO.class);
    }

    public GenericRESTResponseDTO closedSession(String sessionId) {
        return webTarget.path("closed").path(sessionId).request(MediaType.APPLICATION_JSON).put(Entity.entity(sessionId, MediaType.APPLICATION_JSON), GenericRESTResponseDTO.class);
    }
}