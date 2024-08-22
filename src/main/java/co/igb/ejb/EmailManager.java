package co.igb.ejb;

import co.igb.dto.InventoryInconsistency;
import co.igb.dto.MailMessageDTO;
import co.igb.util.Constants;
import org.apache.commons.lang3.text.StrSubstitutor;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dbotero
 */
@SessionScoped
@Named("emailManager")
public class EmailManager implements Serializable {
    private static final Logger CONSOLE = Logger.getLogger(EmailManager.class.getSimpleName());
    private String username;
    private String password;
    private String host;
    private String templatesFolder;
    private String port;

    @Inject
    private IGBApplicationBean appBean;

    @PostConstruct
    protected void initialize() {
        username = appBean.obtenerValorPropiedad(Constants.EMAIL_USERNAME);
        password = appBean.obtenerValorPropiedad(Constants.EMAIL_PASSWORD);
        host = appBean.obtenerValorPropiedad(Constants.EMAIL_HOST);
        templatesFolder = appBean.obtenerValorPropiedad("mail.templates");
        port = appBean.obtenerValorPropiedad(Constants.EMAIL_PORT);
    }

    public Properties getEmailProperties() {
        Properties config = new Properties();
        config.put("mail.smtp.auth", "true");
        config.put("mail.smtp.starttls.enable", "true");
        config.put("mail.smtp.host", host);
        config.put("mail.smtp.port", port);
        return config;
    }

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
            addRecipients(email, "to", appBean.obtenerValorPropiedad(Constants.EMAIL_TO_INVENTORY_INCONSISTENCY));

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
                addRecipients(email, "cc", appBean.obtenerValorPropiedad(Constants.EMAIL_CC_PACKING_LIST));
                addRecipients(email, "to", employeeEmail);
            } else {
                addRecipients(email, "to", appBean.obtenerValorPropiedad(Constants.EMAIL_CC_PACKING_LIST));
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

    public void sendPackingErrorNotification(Integer orderNumber, String employeeName) {
        CONSOLE.log(Level.INFO, "Enviando notificacion de error en packing. orden {0}, usuario {1}", new Object[]{orderNumber, employeeName});
        try {
            HtmlEmail email = initializeNewEmail();
            email.setFrom(appBean.obtenerValorPropiedad(Constants.EMAIL_FROM_PACKING_ERROR));
            email.setSubject(appBean.obtenerValorPropiedad(Constants.EMAIL_SUBJECT_PACKING_ERROR));
            email.setHtmlMsg(
                    String.format(
                            appBean.obtenerValorPropiedad(Constants.EMAIL_MSG_PACKING_ERROR),
                            orderNumber.toString(),
                            employeeName));
            addRecipients(email, "to", appBean.obtenerValorPropiedad(Constants.EMAIL_TO_PACKING_ERROR));
            addRecipients(email, "cc", appBean.obtenerValorPropiedad(Constants.EMAIL_CC_PACKING_ERROR));
            addRecipients(email, "bcc", appBean.obtenerValorPropiedad(Constants.EMAIL_BCC_PACKING_ERROR));
            email.send();
            CONSOLE.log(Level.INFO, "La notificacion de error en packing fue enviada");
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al enviar la notificacion de error en packing. ", e);
        }
    }

    public void sendEmail(MailMessageDTO dto) throws Exception {
        Session session = Session.getInstance(getEmailProperties(), new Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(dto.getFrom()));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(dto.getToList()));
            message.addRecipients(Message.RecipientType.CC, InternetAddress.parse(dto.getCcList()));
            if (!dto.getTemplateName().equals("TicketNotification")) {
                message.addRecipients(Message.RecipientType.BCC, InternetAddress.parse(dto.getBccList()));
            }
            message.setSubject(dto.getSubject());
            message.setSentDate(new Date());
            try {
                String fullTemplateName = appBean.obtenerValorPropiedad(Constants.EMAIL_TEMPLATES) + dto.getTemplateName() + ".html";
                String templateContent = new String(Files.readAllBytes(Paths.get(fullTemplateName)), StandardCharsets.UTF_8);
                message.setContent(StrSubstitutor.replace(templateContent, dto.getParams()), "text/html");
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error enviando el email", e);
                throw new Exception("Ocurrio un error enviando el email");
            }
            CONSOLE.log(Level.INFO, "Enviando datos al email {0}", dto.getTo());
            Transport.send(message);
        } catch (MessagingException e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error enviando el email", e);
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    private void addRecipients(HtmlEmail email, String recipientType, String recipients) {
        if (recipients != null && recipients.contains(",")) {
            for (String recipient : recipients.split(",")) {
                addRecipient(email, recipientType, recipient);
            }
        } else {
            addRecipient(email, recipientType, recipients);
        }
    }

    private void addRecipient(HtmlEmail email, String recipientType, String recipient) {
        try {
            switch (recipientType) {
                case "to":
                    email.addTo(recipient);
                    break;
                case "cc":
                    email.addCc(recipient);
                    break;
                case "bcc":
                    email.addBcc(recipient);
                    break;
                default:

            }
        } catch (EmailException ignored) {
        }
    }
}