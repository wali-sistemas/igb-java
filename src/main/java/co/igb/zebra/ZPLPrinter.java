package co.igb.zebra;

import co.igb.dto.ZebraPrintDTO;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.IOUtils;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

/**
 *
 * @author dbotero
 */
public class ZPLPrinter {

    private static final Logger CONSOLE = Logger.getLogger(ZPLPrinter.class.getSimpleName());
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public static byte[] getPrintData(ZebraPrintDTO dto, String companyName) {
        try {
            ClassLoader classLoader = ZPLPrinter.class.getClassLoader();
            String templateText = IOUtils.toString(classLoader.getResourceAsStream(companyName.toLowerCase() + ".prn"), "UTF-8");
            Velocity.init();
            VelocityContext context = new VelocityContext();
            context.put("cardname1", dto.getCardName1());
            context.put("cardname2", dto.getCardName2());
            context.put("boxNumber", dto.getBoxNumber());
            context.put("totalBoxes", dto.getTotalBoxes());
            context.put("salesOrders", dto.getSalesOrderNumbers());
            context.put("numAtCards", dto.getNumAtCards());
            context.put("printDate", sdf.format(new Date()));
            context.put("carrier", dto.getCarrier());
            context.put("address1", dto.getAddressLine1());
            context.put("address2", dto.getAddressLine2());
            context.put("address3", dto.getAddressLine3());
            context.put("address4", dto.getAddressLine4());
            context.put("employee", dto.getEmployee());
            context.put("city", dto.getCity() + '-' + dto.getState());
            StringWriter writer = new StringWriter();
            Velocity.evaluate(context, writer, "TemplateName", templateText);
            return writer.toString().getBytes();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al procesar la plantilla de la etiqueta. ", e);
            return null;
        }
    }
}