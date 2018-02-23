package co.igb.ejb;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author dbotero
 */
@SessionScoped
@Named("emailManager")
public class EmailManager implements Serializable {

    private static final Logger CONSOLE = Logger.getLogger(EmailManager.class.getSimpleName());

    @Inject
    private IGBApplicationBean appBean;

    public void sendInventoryInconsistence(String employeeName, String binCode,
            String itemCode, Integer expectedQuantity, Integer realQuantity) {
        try {
            Email email = new SimpleEmail();
            email.setHostName(appBean.obtenerValorPropiedad("mail.host"));
            email.setSmtpPort(Integer.parseInt(appBean.obtenerValorPropiedad("mail.port")));
            email.setAuthenticator(new DefaultAuthenticator(
                    appBean.obtenerValorPropiedad("mail.username"), appBean.obtenerValorPropiedad("mail.password")));
            email.setSSL(true);
            email.setFrom(appBean.obtenerValorPropiedad("mail.from.inconsistency"));
            email.setSubject(appBean.obtenerValorPropiedad("mail.subject.inconsistency"));
            email.setMsg(String.format(appBean.obtenerValorPropiedad("mail.msg.inconsistency"),
                    employeeName, binCode, itemCode, expectedQuantity.toString(), realQuantity.toString(), Integer.toString(expectedQuantity - realQuantity)));
            email.addTo(appBean.obtenerValorPropiedad("mail.to.inconsistency"));
            email.send();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al enviar el correo de notificacion de inconsistencia de inventario. ", e);
        }
    }
}
