package co.igb.hanaws.client.journalEntries;

import co.igb.hanaws.dto.journalEntries.JournalEntryDTO;
import co.igb.hanaws.dto.journalEntries.JournalEntryRestDTO;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 * @author jguisao
 */
public class JournalEntryClient {
    private WebTarget webTarget;
    private Client client;

    public JournalEntryClient(String BASE_URI) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("v1");
    }

    public JournalEntryClient(String BASE_URI, String path) {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path(path);
    }

    public JournalEntryRestDTO addJournalEntry(JournalEntryDTO dto, String sessionId) {
        return webTarget.path("JournalEntries").request(MediaType.APPLICATION_JSON).cookie("B1SESSION", sessionId)
                .post(Entity.entity(dto, MediaType.APPLICATION_JSON), JournalEntryRestDTO.class);
    }
}