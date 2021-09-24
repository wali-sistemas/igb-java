package co.igb.apiCubic.client.orden;

import co.igb.apiCubic.dto.orden.CubicOrdenDTO;
import co.igb.apiCubic.dto.orden.CubicOrdenRestDTO;

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
public class CubicOrdenWS {
    private WebTarget webTarget;
    private Client client;

    public CubicOrdenWS(String BASE_URI) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI);
    }

    public CubicOrdenWS(String BASE_URI, String path) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path(path);
    }

    public CubicOrdenRestDTO createOrder(CubicOrdenDTO dto, String user, String pass) {
        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
        headers.add("user",user);
        headers.add("password",pass);

        return webTarget.path("ordenes/ws_ordenesTrabajo.php").request(MediaType.APPLICATION_JSON).headers(headers)
                .post(Entity.entity(dto, MediaType.APPLICATION_JSON), CubicOrdenRestDTO.class);
    }
}