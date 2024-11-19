package co.igb.transportws.client.exxe;

import co.igb.transportws.dto.exxe.*;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 * @author jguisao
 */
public class ExxeClient {
    private WebTarget webTarget;
    private Client client;


    public ExxeClient(String BASE_URI) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("api");
    }

    public ExxeClient(String BASE_URI, String path) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path(path);
    }

    public LoginExxeResponseDTO findToken(LoginExxeDTO dto) {
        return webTarget.path("login").request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(dto, MediaType.APPLICATION_JSON), LoginExxeResponseDTO.class);
    }

    public GuiaExxeResponseDTO createGuia(GuiaExxeDTO dto, String token) {
        return webTarget.path("shipment/create").request(MediaType.APPLICATION_JSON).header("Authorization", "Bearer " + token)
                .post(Entity.entity(dto, MediaType.APPLICATION_JSON), GuiaExxeResponseDTO.class);
    }

    public DocumentExxeResponseDTO printRotulo(String guia, String token) {
        return webTarget.path("shipment/getLabels/" + guia).request(MediaType.APPLICATION_JSON).header("Authorization", "Bearer " + token)
                .get(DocumentExxeResponseDTO.class);
    }

    public DocumentExxeResponseDTO printGuia(String guia, String token) {
        return webTarget.path("shipment/getlabelsGuia/" + guia).request(MediaType.APPLICATION_JSON).header("Authorization", "Bearer " + token)
                .get(DocumentExxeResponseDTO.class);
    }
}