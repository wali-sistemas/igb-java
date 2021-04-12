package co.igb.hanaws.client.invoices;

import co.igb.hanaws.dto.invoices.InvoicesDTO;
import co.igb.hanaws.dto.invoices.InvoicesRestDTO;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 * @author jguisao
 */
public class InvoicesClient {
    private WebTarget webTarget;
    private Client client;

    public InvoicesClient(String BASE_URI) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("v1");
    }

    public InvoicesClient(String BASE_URI, String path) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path(path);
    }

    public InvoicesRestDTO addInvoice(InvoicesDTO dto, String sessionId) {
        return webTarget.path("Invoices").request(MediaType.APPLICATION_JSON).cookie("B1SESSION", sessionId)
                .post(Entity.entity(dto, MediaType.APPLICATION_JSON), InvoicesRestDTO.class);
    }
}