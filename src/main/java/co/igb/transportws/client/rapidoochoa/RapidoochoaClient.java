package co.igb.transportws.client.rapidoochoa;

import co.igb.transportws.dto.rapidoochoa.GuiaDTO;
import co.igb.transportws.dto.rapidoochoa.GuiaResponseDTO;

import co.igb.dto.ApiSaferboDTO;
import co.igb.dto.ResponseCrearGuiaDTO;

import javax.ws.rs.ClientErrorException;
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

    public String createToken(String token, String user, String password) {
        return webTarget.path("wstiquetes/auth")
                .queryParam("token", token)
                .queryParam("user", user)
                .queryParam("password", password)
                .request(MediaType.APPLICATION_JSON).get(String.class);
    }

    public Boolean validateToken(String token) {
        return webTarget.path("wstiquetes/validarToken")
                .queryParam("token", token)
                .request(MediaType.APPLICATION_JSON).get(Boolean.class);
    }

    public GuiaResponseDTO createGuia(GuiaDTO dto, String token) {
        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
        headers.add("token", token);

        return webTarget.path("carga/generarGuia")
                .request(MediaType.APPLICATION_JSON)
                .headers(headers)
                .post(Entity.entity(dto, MediaType.APPLICATION_JSON), GuiaResponseDTO.class);
    }
}