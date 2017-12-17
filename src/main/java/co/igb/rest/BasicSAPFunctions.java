package co.igb.rest;

import co.igb.b1ws.client.login.LoginService;
import co.igb.b1ws.client.login.Logout;
import co.igb.b1ws.client.login.MsgHeader;
import co.igb.ejb.IGBApplicationBean;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author dbotero
 */
@Stateless
public class BasicSAPFunctions {

    private static final Logger CONSOLE = Logger.getLogger(BasicSAPFunctions.class.getSimpleName());

    @Inject
    private IGBApplicationBean appBean;

    public String login() {
        try {
            LoginService service = new LoginService(new URL(String.format(appBean.obtenerValorPropiedad("igb.b1ws.wsdlUrl"), "LoginService")));
            return service.getLoginServiceSoap12().login(
                    appBean.obtenerValorPropiedad("igb.b1ws.databaseServer"),
                    appBean.obtenerValorPropiedad("igb.b1ws.databaseName"),
                    appBean.obtenerValorPropiedad("igb.b1ws.databaseType"),
                    appBean.obtenerValorPropiedad("igb.b1ws.companyUsername"),
                    appBean.obtenerValorPropiedad("igb.b1ws.companyPassword"),
                    appBean.obtenerValorPropiedad("igb.b1ws.language"),
                    appBean.obtenerValorPropiedad("igb.b1ws.licenseServer"));
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al iniciar sesion en el DI Server. ", e);
            return null;
        }
    }

    public void logout(String sessionId) {
        try {
            LoginService service = new LoginService(new URL(String.format(appBean.obtenerValorPropiedad("igb.b1ws.wsdlUrl"), "LoginService")));
            MsgHeader header = new MsgHeader();
            header.setSessionID(sessionId);
            Logout parameters = new Logout();
            service.getLoginServiceSoap12().logout(parameters, header);
            CONSOLE.log(Level.INFO, "Sesion {0} finalizada con exito", sessionId);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al finalizar la sesion " + sessionId, e);
        }
    }
}
