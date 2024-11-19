package co.igb.transportws.client.aldia;

import co.igb.transportws.dto.aldia.*;

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
public class AldiaClient {
    private WebTarget webTarget;
    private Client client;

    public AldiaClient(String BASE_URI) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI);
    }

    public AldiaClient(String BASE_URI, String path) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path(path);
    }

    public LoginAldiaResponseDTO findToken(LoginAldiaDTO dto) {
        return webTarget.path("auth/login").request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(dto, MediaType.APPLICATION_JSON), LoginAldiaResponseDTO.class);
    }

    public GuiaAldiaResponseDTO addGuia(GuiaAldiaDTO dto, String token) {
        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
        headers.add("token", token);

        return webTarget.path("remesas").request(MediaType.APPLICATION_JSON).headers(headers)
                .post(Entity.entity(dto, MediaType.APPLICATION_JSON), GuiaAldiaResponseDTO.class);
    }

    public String findRotulo(RotuloAldiaDTO dto, String token) {
        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
        headers.add("token", token);

        return webTarget.path("informes/etiquetaremesanuevo").request(MediaType.APPLICATION_JSON).headers(headers)
                .post(Entity.entity(dto, MediaType.APPLICATION_JSON), String.class);
    }

    public String findDocument(DocumentAldiaDTO dto, String token) {
        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
        headers.add("token", token);

        return webTarget.path("informes/impresionlote").request(MediaType.APPLICATION_JSON).headers(headers)
                .post(Entity.entity(dto, MediaType.APPLICATION_JSON), String.class);
    }

    public String postCargarRemesa(String token) {
        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
        headers.add("token", token);

        return webTarget.path("maestros/cargaRemesa").request(MediaType.APPLICATION_JSON).headers(headers)
                .post(Entity.entity(null, MediaType.APPLICATION_JSON), String.class);
    }
}