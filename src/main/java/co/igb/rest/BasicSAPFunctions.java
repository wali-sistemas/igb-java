package co.igb.rest;

import co.igb.b1ws.client.login.LoginService;
import co.igb.b1ws.client.login.Logout;
import co.igb.b1ws.client.login.MsgHeader;
import co.igb.dto.GenericRESTResponseDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.manager.client.SessionPoolManagerClient;
import co.igb.util.Constants;
import co.igb.util.IGBUtils;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dbotero
 */
@Stateless
public class BasicSAPFunctions {

    private static final Logger CONSOLE = Logger.getLogger(BasicSAPFunctions.class.getSimpleName());

    @Inject
    private IGBApplicationBean appBean;

    public String login(String companyName) {
        try {
            LoginService service = new LoginService(new URL(String.format(appBean.obtenerValorPropiedad(Constants.B1WS_WSDL_URL), Constants.B1WS_LOGIN_SERVICE)));
            return service.getLoginServiceSoap12().login(
                    appBean.obtenerValorPropiedad(Constants.B1WS_DATABASE_SERVER),
                    IGBUtils.getProperParameter(appBean.obtenerValorPropiedad(Constants.B1WS_DATABASE_NAME), companyName),
                    appBean.obtenerValorPropiedad(Constants.B1WS_DATABASE_TYPE),
                    IGBUtils.getProperParameter(appBean.obtenerValorPropiedad(Constants.B1WS_COMPANY_USERNAME), companyName),
                    IGBUtils.getProperParameter(appBean.obtenerValorPropiedad(Constants.B1WS_COMPANY_PASSWORD), companyName),
                    appBean.obtenerValorPropiedad(Constants.B1WS_LANGUAGE),
                    appBean.obtenerValorPropiedad(Constants.B1WS_LICENSE_SERVER));
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al iniciar sesion en el DI Server. ", e);
            return null;
        }
    }

    public void logout(String sessionId) {
        try {
            LoginService service = new LoginService(new URL(String.format(appBean.obtenerValorPropiedad(Constants.B1WS_WSDL_URL), Constants.B1WS_LOGIN_SERVICE)));
            MsgHeader header = new MsgHeader();
            header.setSessionID(sessionId);
            Logout parameters = new Logout();
            service.getLoginServiceSoap12().logout(parameters, header);
            CONSOLE.log(Level.INFO, "Sesion {0} finalizada con exito", sessionId);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al finalizar la sesion " + sessionId, e);
        }
    }

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