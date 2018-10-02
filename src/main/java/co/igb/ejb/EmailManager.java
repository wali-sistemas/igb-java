package co.igb.ejb;

import co.igb.dto.InventoryInconsistency;
import co.igb.util.Constants;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dbotero
 */
@SessionScoped
@Named("emailManager")
public class EmailManager implements Serializable {

    private static final Logger CONSOLE = Logger.getLogger(EmailManager.class.getSimpleName());

    @Inject
    private IGBApplicationBean appBean;

    public void sendInventoryInconsistence(String employeeName, Object[] binCodeAndName,
                                           String itemCode, Integer expectedQuantity, Integer realQuantity) {
        try {
            HtmlEmail email = initializeNewEmail();
            email.setFrom(appBean.obtenerValorPropiedad(Constants.EMAIL_FROM_INVENTORY_INCONSISTENCY));
            email.setSubject(appBean.obtenerValorPropiedad(Constants.EMAIL_SUBJECT_INVENTORY_INCONSISTENCY));
            email.setHtmlMsg(
                    String.format(
                            appBean.obtenerValorPropiedad(Constants.EMAIL_MSG_INVENTORY_INCONSISTENCY),
                            employeeName,
                            binCodeAndName[0],
                            itemCode,
                            realQuantity.toString(),
                            expectedQuantity.toString(),
                            Integer.toString(expectedQuantity - realQuantity)));
            String emailsTo = appBean.obtenerValorPropiedad(Constants.EMAIL_TO_INVENTORY_INCONSISTENCY);
            if (emailsTo != null && emailsTo.contains(",")) {
                for (String emailTo : emailsTo.split(",")) {
                    email.addTo(emailTo);
                }
            } else {
                email.addTo(emailsTo);
            }

            email.addBcc(appBean.obtenerValorPropiedad(Constants.EMAIL_BCC_INVENTORY_INCONSISTENCY));
            email.send();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al enviar el correo de notificacion de inconsistencia de inventario. ", e);
        }
    }

    public void sendInventoryInconsistencies(String employeeName, List<InventoryInconsistency> inconsistencies) {
        try {
            HtmlEmail email = initializeNewEmail();
            email.setFrom(appBean.obtenerValorPropiedad(Constants.EMAIL_FROM_INVENTORY_INCONSISTENCY));
            email.setSubject(appBean.obtenerValorPropiedad(Constants.EMAIL_SUBJECT_INVENTORY_INCONSISTENCY));

            StringBuilder htmlContent = new StringBuilder();
            for (InventoryInconsistency inventoryInconsistency : inconsistencies) {
                htmlContent.append(
                        String.format(
                                appBean.obtenerValorPropiedad(Constants.EMAIL_MSG_INVENTORY_INCONSISTENCY_LINE),
                                inventoryInconsistency.getItemCode(),
                                inventoryInconsistency.getBinCode(),
                                inventoryInconsistency.getExpectedQuantity(),
                                inventoryInconsistency.getFoundQuantity()
                        ));
            }

            String htmlMsgBody = String.format(
                    appBean.obtenerValorPropiedad(Constants.EMAIL_MSG_INVENTORY_INCONSISTENCY_BODY),
                    employeeName,
                    String.format(
                            appBean.obtenerValorPropiedad(Constants.EMAIL_MSG_INVENTORY_INCONSISTENCY_HEAD),
                            htmlContent.toString()
                    )
            );
            email.setHtmlMsg(htmlMsgBody);
            String emailsTo = appBean.obtenerValorPropiedad(Constants.EMAIL_TO_INVENTORY_INCONSISTENCY);
            if (emailsTo != null && emailsTo.contains(",")) {
                for (String emailTo : emailsTo.split(",")) {
                    email.addTo(emailTo);
                }
            } else {
                email.addTo(emailsTo);
            }

            email.addBcc(appBean.obtenerValorPropiedad(Constants.EMAIL_BCC_INVENTORY_INCONSISTENCY));
            email.send();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al enviar el correo de notificacion de inconsistencia de inventario. ", e);
        }
    }

    public void sendPackingList(String employeeName, String employeeEmail) {
        try {
            HtmlEmail email = initializeNewEmail();
            email.setFrom(appBean.obtenerValorPropiedad(Constants.EMAIL_FROM_PACKING_LIST));
            email.setSubject(appBean.obtenerValorPropiedad(Constants.EMAIL_SUBJECT_PACKING_LIST));
            email.setHtmlMsg(
                    String.format(
                            appBean.obtenerValorPropiedad(Constants.EMAIL_MSG_PACKING_LIST),
                            employeeName));
            if (employeeEmail != null) {
                email.addCc(appBean.obtenerValorPropiedad(Constants.EMAIL_CC_PACKING_LIST));
                email.addTo(employeeEmail);
            } else {
                email.addTo(appBean.obtenerValorPropiedad(Constants.EMAIL_CC_PACKING_LIST));
            }
            email.send();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al enviar el correo de notificacion de inconsistencia de inventario. ", e);
        }
    }

    public void sendWithAttachment(String filePath, String fileName, String employeeName, String employeeEmail) {
        try {
            // Create the attachment
            EmailAttachment attachment = new EmailAttachment();
            attachment.setPath(filePath);
            attachment.setDisposition(EmailAttachment.ATTACHMENT);
            attachment.setDescription("Packing list");
            attachment.setName(fileName);

            // Create the email message
            MultiPartEmail email = new MultiPartEmail();
            email.setHostName(appBean.obtenerValorPropiedad(Constants.EMAIL_HOST));
            email.setSmtpPort(Integer.parseInt(appBean.obtenerValorPropiedad(Constants.EMAIL_PORT)));
            email.setAuthenticator(new DefaultAuthenticator(
                    appBean.obtenerValorPropiedad(Constants.EMAIL_USERNAME),
                    appBean.obtenerValorPropiedad(Constants.EMAIL_PASSWORD)));
            email.setSSL(true);
            email.setCharset("utf-8");
            if (employeeEmail != null) {
                email.addCc(appBean.obtenerValorPropiedad(Constants.EMAIL_CC_PACKING_LIST));
                email.addTo(employeeEmail);
            } else {
                email.addTo(appBean.obtenerValorPropiedad(Constants.EMAIL_CC_PACKING_LIST));
            }
            email.setFrom(appBean.obtenerValorPropiedad(Constants.EMAIL_FROM_PACKING_LIST));
            email.setSubject(appBean.obtenerValorPropiedad(Constants.EMAIL_SUBJECT_PACKING_LIST));
            email.setMsg(String.format(
                    appBean.obtenerValorPropiedad(Constants.EMAIL_MSG_PACKING_LIST),
                    //"Adjunto a este mensaje se encuentra la packing list correspondiente al despacho que acaba de finalizar el usuario %1$s",
                    employeeName
            ));

            // add the attachment
            email.attach(attachment);

            // send the email
            email.send();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al enviar el correo con packing list adjunta. ", e);
        }
    }

    private HtmlEmail initializeNewEmail() {
        HtmlEmail email = new HtmlEmail();
        email.setHostName(appBean.obtenerValorPropiedad(Constants.EMAIL_HOST));
        email.setSmtpPort(Integer.parseInt(appBean.obtenerValorPropiedad(Constants.EMAIL_PORT)));
        email.setAuthenticator(new DefaultAuthenticator(
                appBean.obtenerValorPropiedad(Constants.EMAIL_USERNAME),
                appBean.obtenerValorPropiedad(Constants.EMAIL_PASSWORD)));
        email.setSSL(true);
        email.setCharset("utf-8");
        return email;
    }
}
