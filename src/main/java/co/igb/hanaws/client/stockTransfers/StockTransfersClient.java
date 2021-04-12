package co.igb.hanaws.client.stockTransfers;

import co.igb.hanaws.dto.stockTransfers.StockTransfersDTO;
import co.igb.hanaws.dto.stockTransfers.StockTransfersRestDTO;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 * @author jguisao
 */
public class StockTransfersClient {
    private WebTarget webTarget;
    private Client client;

    public StockTransfersClient(String BASE_URI) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("v1");
    }

    public StockTransfersClient(String BASE_URI, String path) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path(path);
    }

    public StockTransfersRestDTO addTransfer(StockTransfersDTO dto, String sessionId) {
        return webTarget.path("StockTransfers").request(MediaType.APPLICATION_JSON).cookie("B1SESSION", sessionId)
                .post(Entity.entity(dto, MediaType.APPLICATION_JSON), StockTransfersRestDTO.class);
    }
}