package co.igb.transportws.client.aldia;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

/**
 * @author jguisao
 */
public class AldiaClient {
    private WebTarget webTarget;
    private Client client;

    public AldiaClient(String BASE_URI) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("Remesas");
    }

    public AldiaClient(String BASE_URI, String path) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path(path);
    }
}