package co.igb.transportws.client.gopack;

import co.igb.transportws.dto.gopack.GuiaGoPackDTO;
import co.igb.transportws.dto.gopack.GuiaGoPackResponseDTO;
import co.igb.transportws.dto.gopack.LoginGoPackDTO;
import co.igb.transportws.dto.gopack.LoginGoPackResponseDTO;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;

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

    public GuiaGoPackResponseDTO addGuia(GuiaGoPackDTO dto, String token) {
        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
        headers.add("Authorization", token);

        return webTarget.path("")
                .queryParam("api", "Servicio.RemesaCliente.getCrear")
                .request(MediaType.APPLICATION_JSON)
                .headers(headers)
                .post(Entity.entity(dto, MediaType.APPLICATION_JSON), GuiaGoPackResponseDTO.class);
    }
}