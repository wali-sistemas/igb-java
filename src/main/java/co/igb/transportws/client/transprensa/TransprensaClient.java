package co.igb.transportws.client.transprensa;

import co.igb.transportws.dto.transprensa.RotuloTransprensaDTO;
import co.igb.transportws.dto.transprensa.RotuloTrasnprensaResponseDTO;

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
public class TransprensaClient {
    private WebTarget webTarget;
    private Client client;

    public TransprensaClient(String BASE_URI) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("Remesas");
    }

    public TransprensaClient(String BASE_URI, String path) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path(path);
    }

    public RotuloTrasnprensaResponseDTO consultarRotulo(String user, String pass, String codCliente, RotuloTransprensaDTO dto) {
        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
        headers.add("UsuarioCliente", user);
        headers.add("PswdCliente", pass);
        headers.add("CodigoCliente", codCliente);

        return webTarget.path("ConsultaRotulo").request().headers(headers)
                .post(Entity.entity(dto, MediaType.APPLICATION_JSON), RotuloTrasnprensaResponseDTO.class);
    }
}