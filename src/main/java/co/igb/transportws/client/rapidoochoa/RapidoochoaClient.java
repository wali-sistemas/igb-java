package co.igb.transportws.client.rapidoochoa;

import co.igb.transportws.dto.rapidoochoa.GuiaRapidoochoaDTO;
import co.igb.transportws.dto.rapidoochoa.GuiaRapidoochoaResponseDTO;
import co.igb.transportws.dto.rapidoochoa.TokenRapidoochoaResponseDTO;

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

    public TokenRapidoochoaResponseDTO createToken(String token, String user, String password) {
        return webTarget.path("wstiquetes/auth")
                .queryParam("token", token)
                .queryParam("user", user)
                .queryParam("password", password)
                .request(MediaType.APPLICATION_JSON).get(TokenRapidoochoaResponseDTO.class);
    }

    public Boolean validateToken(String token) {
        return webTarget.path("wstiquetes/validarToken")
                .queryParam("token", token)
                .request(MediaType.APPLICATION_JSON).get(Boolean.class);
    }

    public GuiaRapidoochoaResponseDTO createGuia(GuiaRapidoochoaDTO dto, String token) {
        return webTarget.path("carga/generarGuia").request().header("token", token)
                .post(Entity.entity(dto, MediaType.APPLICATION_JSON + ";charset=utf-8"), GuiaRapidoochoaResponseDTO.class);
    }
}