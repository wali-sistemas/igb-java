package co.igb.transportws.client.Envia;

import co.igb.transportws.dto.envia.GuiaEnviaDTO;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author jguisao
 */
public class EnviaClient {
    private WebTarget webTarget;
    private Client client;


    public EnviaClient(String BASE_URI) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("");
    }

    public EnviaClient(String BASE_URI, String path) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path(path);
    }

    public String createGuia(GuiaEnviaDTO dto, String username, String password) {
        String credentials = username + ":" + password;
        String basicAuth = Base64.getEncoder().encodeToString(credentials.getBytes(StandardCharsets.UTF_8));

        return webTarget.path("ServicioLiquidacionRESTpruebas/Service1.svc/Generacion/").request(MediaType.APPLICATION_JSON).header("Authorization", "Basic " + basicAuth)
                .post(Entity.entity(dto, MediaType.APPLICATION_JSON), String.class);
    }
}
