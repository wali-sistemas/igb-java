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
public class SessionPoolManagerClient {
    private WebTarget webTarget;
    private Client client;

    public SessionPoolManagerClient(String BASE_URI) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("pool");
    }

    public SessionPoolManagerClient(String BASE_URI, String path) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path(path);
    }

    public GenericRESTResponseDTO pollSession(String companyName) {
        return webTarget.path("session").path(companyName).request(MediaType.APPLICATION_JSON).get(GenericRESTResponseDTO.class);
    }

    public GenericRESTResponseDTO returnSession(String sessionId) {
        return webTarget.path("return").path(sessionId).request(MediaType.APPLICATION_JSON).put(Entity.entity(sessionId, MediaType.APPLICATION_JSON), GenericRESTResponseDTO.class);
    }

    /*public GenericRESTResponseDTO returnSession(SessionDTO dto) {
        return webTarget.path("return").request(MediaType.APPLICATION_JSON).put(Entity.entity(dto, MediaType.APPLICATION_JSON), GenericRESTResponseDTO.class);
    }*/
}