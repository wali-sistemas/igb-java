package co.igb.rest;

import co.igb.b1ws.client.invoice.Document;
import co.igb.b1ws.client.invoice.Document.DocumentLines;
import co.igb.b1ws.client.invoice.Document.DocumentLines.DocumentLine;
import co.igb.ejb.IGBApplicationBean;
import co.igb.persistence.facade.DeliveryNoteFacade;
import co.igb.util.IGBUtils;
import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author dbotero
 */
@Stateless
@Path("invoice")
public class InvoiceREST implements Serializable {

    private static final Logger CONSOLE = Logger.getLogger(InvoiceREST.class.getSimpleName());

    @EJB
    private DeliveryNoteFacade dnFacade;
    @Inject
    private IGBApplicationBean appBean;

    @POST
    @Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Response createInvoice(Integer deliveryDocEntry, @HeaderParam("X-Company-Name") String companyName) {
        CONSOLE.log(Level.INFO, "company-name: {0}", companyName);
        CONSOLE.log(Level.INFO, "Creando factura para deliveryNoteDocEntry={0}", deliveryDocEntry);
        //Consultar entrega
        List<Object[]> deliveryData = dnFacade.getDeliveryNoteData(deliveryDocEntry, companyName);
        if (deliveryData.isEmpty()) {
            return Response.ok(new ResponseDTO(-1, "No se encontraron datos de entrega para facturar")).build();
        }
        //Crear factura a partir de la entrega
        Document invoice = new Document();
        for (Object[] row : deliveryData) {
            if (invoice.getSeries() == null) {
                invoice.setSeries(Long.parseLong(getPropertyValue("igb.invoice.series", companyName)));
                invoice.setCardCode((String) row[3]);

                try {
                    GregorianCalendar date = new GregorianCalendar();
                    XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(date);
                    invoice.setDocDate(date2);
                } catch (Exception e) {
                }

                try {
                    GregorianCalendar date = new GregorianCalendar();
                    date.add(Calendar.DATE, 0);
                    invoice.setDocDueDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(date));
                } catch (Exception e) {
                }

                invoice.setContactPersonCode(null);
                invoice.setComments(null);
                invoice.setSalesPersonCode(null);

            }
        }

        DocumentLines lines = new DocumentLines();

        DocumentLine line = new DocumentLine();
        line.setBaseEntry(null);
        line.setBaseLine(null);
        line.setBaseType(null);
        line.setItemCode(null);
        line.setQuantity(null);
        line.setLineNum(null);

        lines.getDocumentLine().add(line);

        invoice.setDocumentLines(lines);
        //login
        //crear doc
        //logout
        return Response.ok(new ResponseDTO(0, null)).build();
    }

    private String getPropertyValue(String propertyName, String companyName) {
        return IGBUtils.getProperParameter(appBean.obtenerValorPropiedad(propertyName), companyName);
    }
}
