package co.igb.rest;

import co.igb.dto.GenericRESTResponseDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.manager.client.SessionPoolManagerClient;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.logging.Logger;

/**
 * @author dbotero
 */
@Stateless
public class BasicSAPFunctions {
    private static final Logger CONSOLE = Logger.getLogger(BasicSAPFunctions.class.getSimpleName());
    @Inject
    private IGBApplicationBean appBean;

    public String getSessionId(String companyName) {
        SessionPoolManagerClient sessionClient = new SessionPoolManagerClient(appBean.obtenerValorPropiedad("igb.manager.rest"));
        String sessionId = null;
        GenericRESTResponseDTO respREST = null;
        try {
            respREST = sessionClient.getSession(companyName);
            if (respREST.getEstado() == 0) {
                sessionId = respREST.getContent().toString();
            } else {
                return null;
            }
        } catch (Exception ignored) {
        }
        return sessionId;
    }

    public boolean returnSession(String sessionId) {
        SessionPoolManagerClient sessionClient = new SessionPoolManagerClient(appBean.obtenerValorPropiedad("igb.manager.rest"));
        GenericRESTResponseDTO respREST = null;
        respREST = sessionClient.returnSession(sessionId);
        if (respREST.getEstado() == 0) {
            return true;
        } else {
            return false;
        }
    }
}