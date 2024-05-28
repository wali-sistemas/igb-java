package co.igb.transportws.dto.saferbo;

import java.io.Serializable;

/**
 * @author jguisao
 */
public class GuiaSaferboResponseDTO implements Serializable {
    protected String error;
    protected String numeroguia;
    protected String impresionrotulo;
    protected String impresionguia;
    protected String impresionzebra;
    protected String pdfguialinea;
    protected String pdfguiabase64;
    protected String pdfguiadescargar;
    protected String regionalorigen;
    protected String regionaldestino;
    protected String diasentrega;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getNumeroguia() {
        return numeroguia;
    }

    public void setNumeroguia(String numeroguia) {
        this.numeroguia = numeroguia;
    }

    public String getImpresionrotulo() {
        return impresionrotulo;
    }

    public void setImpresionrotulo(String impresionrotulo) {
        this.impresionrotulo = impresionrotulo;
    }

    public String getImpresionguia() {
        return impresionguia;
    }

    public void setImpresionguia(String impresionguia) {
        this.impresionguia = impresionguia;
    }

    public String getImpresionzebra() {
        return impresionzebra;
    }

    public void setImpresionzebra(String impresionzebra) {
        this.impresionzebra = impresionzebra;
    }

    public String getPdfguialinea() {
        return pdfguialinea;
    }

    public void setPdfguialinea(String pdfguialinea) {
        this.pdfguialinea = pdfguialinea;
    }

    public String getPdfguiabase64() {
        return pdfguiabase64;
    }

    public void setPdfguiabase64(String pdfguiabase64) {
        this.pdfguiabase64 = pdfguiabase64;
    }

    public String getPdfguiadescargar() {
        return pdfguiadescargar;
    }

    public void setPdfguiadescargar(String pdfguiadescargar) {
        this.pdfguiadescargar = pdfguiadescargar;
    }

    public String getRegionalorigen() {
        return regionalorigen;
    }

    public void setRegionalorigen(String regionalorigen) {
        this.regionalorigen = regionalorigen;
    }

    public String getRegionaldestino() {
        return regionaldestino;
    }

    public void setRegionaldestino(String regionaldestino) {
        this.regionaldestino = regionaldestino;
    }

    public String getDiasentrega() {
        return diasentrega;
    }

    public void setDiasentrega(String diasentrega) {
        this.diasentrega = diasentrega;
    }
}