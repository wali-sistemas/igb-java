package co.igb.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PrintReportDTO {
    private int id;
    private int copias;
    private String documento;
    private String companyName;
    private String origen;
    private String filtro;
    private boolean imprimir;
    private String year;
    private String month;
    private String day;

    public PrintReportDTO() {
    }

    public PrintReportDTO(int id, int copias, String documento, String companyName, String origen, boolean imprimir) {
        this.id = id;
        this.copias = copias;
        this.documento = documento;
        this.companyName = companyName;
        this.origen = origen;
        this.imprimir = imprimir;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean isImprimir() {
        return imprimir;
    }

    public void setImprimir(boolean imprimir) {
        this.imprimir = imprimir;
    }

    public String getFiltro() {
        return filtro;
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "PrintReportDTO{" +
                "id=" + id +
                ", copias=" + copias +
                ", documento='" + documento + '\'' +
                ", companyName='" + companyName + '\'' +
                ", origen='" + origen + '\'' +
                ", filtro='" + filtro + '\'' +
                ", imprimir=" + imprimir +
                '}';
    }
}