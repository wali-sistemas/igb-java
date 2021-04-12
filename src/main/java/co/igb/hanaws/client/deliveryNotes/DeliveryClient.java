package co.igb.hanaws.client.deliveryNotes;

import co.igb.hanaws.dto.deliveryNotes.DeliveryDTO;
import co.igb.hanaws.dto.deliveryNotes.DeliveryRestDTO;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 * @author jguisao
 */
public class DeliveryClient {
    private WebTarget webTarget;
    private Client client;

    public DeliveryClient(String BASE_URI) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("v1");
    }

    public DeliveryClient(String BASE_URI, String path) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path(path);
    }

    public DeliveryRestDTO addDeliveryNote(DeliveryDTO dto, String sessionId) {
        return webTarget.path("DeliveryNotes").request(MediaType.APPLICATION_JSON).cookie("B1SESSION", sessionId)
                .post(Entity.entity(dto, MediaType.APPLICATION_JSON), DeliveryRestDTO.class);
    }
}