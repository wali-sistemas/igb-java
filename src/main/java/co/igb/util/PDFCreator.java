package co.igb.util;

import co.igb.dto.PackingListRecordDTO;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class PDFCreator {
    private final static String[] HEADER_ARRAY = {"Caja", "Órden", "Artículo", "Cant."};
    private final static Font SMALL_BOLD = new Font(Font.FontFamily.TIMES_ROMAN, 8, Font.BOLD);
    private final static Font NORMAL_FONT = new Font(Font.FontFamily.TIMES_ROMAN, 8, Font.NORMAL);
    private final static Font TITLE_FONT = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.NORMAL);

    public static void addHeader(Document document, String companyName, String customerId, String customerName) throws DocumentException {
        //Agrega el nombre de la empresa
        Paragraph paragraph = new Paragraph();
        addEmptyLine(paragraph, 1);
        paragraph.setFont(TITLE_FONT);
        paragraph.add(new Chunk(companyName));
        addEmptyLine(paragraph, 1);

        PdfPTable table = new PdfPTable(4);
        table.setWidthPercentage(100);

        //Agrega label para datos de cliente
        PdfPCell cellClienteLabel = new PdfPCell();
        cellClienteLabel.setBorder(0);
        Paragraph pClienteLabel = new Paragraph("Cliente: ", NORMAL_FONT);
        pClienteLabel.setAlignment(Paragraph.ALIGN_RIGHT);
        cellClienteLabel.addElement(pClienteLabel);
        table.addCell(cellClienteLabel);

        //Agrega nombre del cliente
        PdfPCell cellNombreCliente = new PdfPCell();
        cellNombreCliente.setBorder(0);
        Paragraph pNombreCliente = new Paragraph(customerName, NORMAL_FONT);
        pNombreCliente.setAlignment(Paragraph.ALIGN_LEFT);
        Paragraph pNitCliente = new Paragraph(customerId, NORMAL_FONT);
        pNitCliente.setAlignment(Paragraph.ALIGN_LEFT);
        cellNombreCliente.addElement(pNombreCliente);
        cellNombreCliente.addElement(pNitCliente);
        table.addCell(cellNombreCliente);

        PdfPCell cellFechaLabel = new PdfPCell();
        cellFechaLabel.setBorder(0);
        Paragraph pFechaLabel = new Paragraph("Fecha: ", NORMAL_FONT);
        pFechaLabel.setAlignment(Paragraph.ALIGN_RIGHT);
        cellFechaLabel.addElement(pFechaLabel);
        table.addCell(cellFechaLabel);

        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
        PdfPCell cellFecha = new PdfPCell();
        cellFecha.setBorder(0);
        Paragraph pFecha = new Paragraph(sdf.format(new Date()), NORMAL_FONT);
        pFecha.setAlignment(PdfPCell.ALIGN_LEFT);
        cellFecha.addElement(pFecha);
        table.addCell(cellFecha);

        table.setWidths(new int[]{10, 70, 10, 10});
        paragraph.add(table);

        addEmptyLine(paragraph, 1);

        document.add(paragraph);

    }

    public static void addContent(Document document, List<PackingListRecordDTO> dataObjList) throws DocumentException {
        Paragraph paragraph = new Paragraph();
        paragraph.setFont(NORMAL_FONT);
        createReportTable(paragraph, dataObjList);
        document.add(paragraph);
    }

    private static void createReportTable(Paragraph paragraph, List<PackingListRecordDTO> dataObjList) throws DocumentException {
        PdfPTable table = new PdfPTable(4);
        table.setWidthPercentage(100);
        table.setWidths(new int[]{10, 10, 75, 5});

        if (null == dataObjList) {
            paragraph.add(new Chunk("No hay datos para mostrar."));
            return;
        }

        addHeaderInTable(table, HEADER_ARRAY[0], Paragraph.ALIGN_RIGHT);
        addHeaderInTable(table, HEADER_ARRAY[1], Paragraph.ALIGN_RIGHT);
        addHeaderInTable(table, HEADER_ARRAY[2], Paragraph.ALIGN_LEFT);
        addHeaderInTable(table, HEADER_ARRAY[3], Paragraph.ALIGN_RIGHT);

        table.setHeaderRows(1);

        for (PackingListRecordDTO dataObject : dataObjList) {
            addToTable(table, new String[]{dataObject.getBoxNumber().toString()}, Paragraph.ALIGN_RIGHT);
            addToTable(table, new String[]{dataObject.getOrderNumber().toString()}, Paragraph.ALIGN_RIGHT);
            addToTable(table, new String[]{dataObject.getItemName(), dataObject.getItemCode()}, Paragraph.ALIGN_LEFT);
            addToTable(table, new String[]{dataObject.getQuantity().toString()}, Paragraph.ALIGN_RIGHT);
        }
        paragraph.add(table);
    }

    private static void addEmptyLine(Paragraph paragraph, int lines) {
        for (int i = 0; i < lines; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }

    private static void addHeaderInTable(PdfPTable table, String header, int alignment) {
        PdfPCell cell = new PdfPCell();
        Paragraph p = new Paragraph(header, SMALL_BOLD);
        p.setAlignment(alignment);
        cell.addElement(p);
        table.addCell(cell);
    }

    private static void addToTable(PdfPTable table, String[] data, int alignment) {
        PdfPCell cell = new PdfPCell();
        for (String line : data) {
            Paragraph p = new Paragraph(line, NORMAL_FONT);
            p.setAlignment(alignment);
            cell.addElement(p);
        }

        table.addCell(cell);
    }
}