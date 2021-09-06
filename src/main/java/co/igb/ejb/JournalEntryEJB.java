package co.igb.ejb;

import co.igb.dto.ResponseDTO;
import co.igb.hanaws.client.journalEntries.JournalEntryClient;
import co.igb.hanaws.dto.journalEntries.JournalEntryDTO;
import co.igb.hanaws.dto.journalEntries.JournalEntryRestDTO;
import co.igb.rest.BasicSAPFunctions;
import co.igb.util.Constants;
import com.google.gson.Gson;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
public class JournalEntryEJB {
    private static final Logger CONSOLE = Logger.getLogger(JournalEntryEJB.class.getSimpleName());
    private JournalEntryClient service;
    @Inject
    private IGBApplicationBean appBean;
    @EJB
    private BasicSAPFunctions sapFunctions;

    @PostConstruct
    private void initialize() {
        try {
            service = new JournalEntryClient(Constants.HANAWS_SL_URL);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "No fue posible iniciar la instancia de JournalEntries. ", e);
        }
    }

    public ResponseDTO createJournalEntry(JournalEntryDTO dto, String companyName) {
        Long transId = 0l;
        //1. Login
        String sessionId = null;
        try {
            sessionId = sapFunctions.getSessionId(companyName);
            if (sessionId != null) {
                CONSOLE.log(Level.INFO, "Se inicio sesion en DI Server satisfactoriamente. SessionID={0}", sessionId);
            } else {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al iniciar sesion en el DI Server.");
                return new ResponseDTO(-1, "Ocurrio un error al iniciar sesion en el DI Server.");
            }
        } catch (Exception ignored) {
        }
        //2. Procesar documento
        if (sessionId != null) {
            try {
                CONSOLE.log(Level.INFO, "Iniciando creacion de asiento para {0}", companyName);
                Gson gson = new Gson();
                String json = gson.toJson(dto);
                CONSOLE.log(Level.INFO, json);
                JournalEntryRestDTO res = service.addJournalEntry(dto, sessionId);
                transId = res.getJdtNum();

                if (transId == 0) {
                    CONSOLE.log(Level.WARNING, "Ocurrió un problema al crear el asiento. Resetear el sesión ID.");
                    return new ResponseDTO(-1, "Ocurrió un problema al crear el asiento. Resetear el sesión ID.");
                } else {
                    CONSOLE.log(Level.INFO, "Se creo el asiento satisfactoriamente");
                }
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al crear el asiento ", e);
                return new ResponseDTO(-1, e.getMessage());
            }
        }

        //3. Logout
        if (sessionId != null) {
            boolean resp = sapFunctions.returnSession(sessionId);
            if (resp) {
                CONSOLE.log(Level.INFO, "Se cerro la sesion [{0}] de DI Server correctamente", sessionId);
            } else {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al cerrar la sesion [{0}] de DI Server", sessionId);
            }
        }
        return new ResponseDTO(0, transId);
    }
}