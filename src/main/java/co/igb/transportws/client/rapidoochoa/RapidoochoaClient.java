package co.igb.transportws.client.rapidoochoa;

import co.igb.dto.ApiSaferboDTO;
import co.igb.dto.ResponseCrearGuiaDTO;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 * @author jguisao
 */
public class RapidoochoaClient {
    private WebTarget webTarget;
    private Client client;

    public RapidoochoaClient(String BASE_URI) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI);
    }

    public RapidoochoaClient(String BASE_URI, String path) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path(path);
    }

    public ResponseCrearGuiaDTO findGuia(ApiSaferboDTO dto, String transport) throws ClientErrorException {
        return webTarget.path("crearguia").path(transport).request(MediaType.APPLICATION_JSON).post(Entity.entity(dto, MediaType.APPLICATION_JSON), ResponseCrearGuiaDTO.class);
    }
}