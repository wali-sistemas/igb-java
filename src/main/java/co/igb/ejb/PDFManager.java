package co.igb.ejb;

import co.igb.dto.PackingListRecordDTO;
import co.igb.util.HeaderFooter;
import co.igb.util.PDFCreator;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dbotero
 */
@SessionScoped
@Named("pdfManager")
public class PDFManager implements Serializable {
    public static final String PDF_EXTENSION = ".pdf";

    private static final Logger CONSOLE = Logger.getLogger(PDFManager.class.getSimpleName());

    public File createPackingListPdf(String packingOrderNum, String fileName, String companyName, List<PackingListRecordDTO> data) {
        Document document = null;
        try {
            //Document is not auto-closable hence need to close it separately

            File file = new File(fileName + PDF_EXTENSION);
            CONSOLE.log(Level.INFO, "Guardando PDF en: {0}", file.getAbsolutePath());

            document = new Document(PageSize.LETTER);
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file));
            HeaderFooter event = new HeaderFooter();
            event.setHeader("Lista de empaque");
            writer.setPageEvent(event);
            document.open();
            PDFCreator.addHeader(document, companyName, data.get(0).getCustomerId(), data.get(0).getCustomerName());
            PDFCreator.addContent(document, data);
            return file;
        } catch (DocumentException | FileNotFoundException e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al generar el pdf para la packing list. ", e);
        } finally {
            if (null != document) {
                document.close();
            }
        }
        return null;
    }
}
