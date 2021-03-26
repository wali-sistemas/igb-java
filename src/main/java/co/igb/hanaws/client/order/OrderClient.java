package co.igb.hanaws.client.order;

import co.igb.hanaws.dto.order.DetailDTO;
import co.igb.hanaws.dto.order.OrderDTO;
import co.igb.hanaws.dto.order.OrderRestDTO;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author jguisao
 */
public class OrderClient {
    private WebTarget webTarget;
    private Client client;

    public OrderClient(String BASE_URI) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("v1");
    }

    public OrderClient(String BASE_URI, String path) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path(path);
    }

    public OrderRestDTO addOrder(OrderDTO dto, String sessionId) {
        return webTarget.path("Orders").request(MediaType.APPLICATION_JSON).cookie("B1SESSION", sessionId)
                .post(Entity.entity(dto, MediaType.APPLICATION_JSON), OrderRestDTO.class);
    }

    public Response updateOrder(DetailDTO dto, String sessionId, Integer docEntry) {
        WebTarget url = webTarget.path("Orders(" + docEntry + ")");
        return url.request(MediaType.APPLICATION_JSON).cookie("B1SESSION", sessionId)
                .method("PATCH", Entity.json(dto));
    }
}