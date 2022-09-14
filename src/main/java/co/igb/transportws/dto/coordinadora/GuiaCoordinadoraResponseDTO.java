package co.igb.transportws.dto.coordinadora;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author jguisao
 */
public class GuiaCoordinadoraResponseDTO {
    @JsonProperty("codigo_remision")
    private String codigoRemision;
    @JsonProperty("pdf_guia")
    private String pdfGuia;
    @JsonProperty("pdf_rotulo")
    private String pdfRotulo;

    public String getCodigoRemision() {
        return codigoRemision;
    }

    public void setCodigoRemision(String codigoRemision) {
        this.codigoRemision = codigoRemision;
    }

    public String getPdfGuia() {
        return pdfGuia;
    }

    public void setPdfGuia(String pdfGuia) {
        this.pdfGuia = pdfGuia;
    }

    public String getPdfRotulo() {
        return pdfRotulo;
    }

    public void setPdfRotulo(String pdfRotulo) {
        this.pdfRotulo = pdfRotulo;
    }
}