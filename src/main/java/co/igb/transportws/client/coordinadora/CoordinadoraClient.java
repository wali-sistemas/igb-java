package co.igb.transportws.client.coordinadora;

import co.igb.transportws.dto.coordinadora.GuiaCoordinadoraDTO;
import co.igb.transportws.dto.coordinadora.GuiaCoordinadoraResponseDTO;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 * @author jguisao
 */
public class CoordinadoraClient {
    private WebTarget webTarget;
    private Client client;

    public CoordinadoraClient(String BASE_URI) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI);
    }

    public CoordinadoraClient(String BASE_URI, String path) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path(path);
    }

    public GuiaCoordinadoraResponseDTO addGuia(GuiaCoordinadoraDTO dto) {
        return webTarget.path("").request()
                .post(Entity.entity(dto, MediaType.APPLICATION_JSON + ";charset=utf-8"), GuiaCoordinadoraResponseDTO.class);
    }
}