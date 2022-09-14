package co.igb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiCoordinadoraDTO {
    private String nameDestination;
    private String addressDestination;
    private String cityDestination;
    private String phoneDestination;
    private String invoice;
    private String observation;
    private String contents;
    private String mailDestination;
    private String nomEmpaque;
    private double valorDeclarado;
    private double alto;
    private double ancho;
    private double largo;
    private double peso;
    private long unidades;

    public ApiCoordinadoraDTO() {
    }

    public ApiCoordinadoraDTO(String nameDestination, String addressDestination, String cityDestination, String phoneDestination, String invoice, String observation, String contents, String mailDestination, String nomEmpaque, double valorDeclarado, double alto, double ancho, double largo, double peso, long unidades) {
        this.nameDestination = nameDestination;
        this.addressDestination = addressDestination;
        this.cityDestination = cityDestination;
        this.phoneDestination = phoneDestination;
        this.invoice = invoice;
        this.observation = observation;
        this.contents = contents;
        this.mailDestination = mailDestination;
        this.nomEmpaque = nomEmpaque;
        this.valorDeclarado = valorDeclarado;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
        this.peso = peso;
        this.unidades = unidades;
    }

    public String getNameDestination() {
        return nameDestination;
    }

    public void setNameDestination(String nameDestination) {
        this.nameDestination = nameDestination;
    }

    public String getAddressDestination() {
        return addressDestination;
    }

    public void setAddressDestination(String addressDestination) {
        this.addressDestination = addressDestination;
    }

    public String getCityDestination() {
        return cityDestination;
    }

    public void setCityDestination(String cityDestination) {
        this.cityDestination = cityDestination;
    }

    public String getPhoneDestination() {
        return phoneDestination;
    }

    public void setPhoneDestination(String phoneDestination) {
        this.phoneDestination = phoneDestination;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getMailDestination() {
        return mailDestination;
    }

    public void setMailDestination(String mailDestination) {
        this.mailDestination = mailDestination;
    }

    public String getNomEmpaque() {
        return nomEmpaque;
    }

    public void setNomEmpaque(String nomEmpaque) {
        this.nomEmpaque = nomEmpaque;
    }

    public double getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(double valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public long getUnidades() {
        return unidades;
    }

    public void setUnidades(long unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "ApiCoordinadoraDTO{" +
                "nameDestination='" + nameDestination + '\'' +
                ", addressDestination='" + addressDestination + '\'' +
                ", cityDestination='" + cityDestination + '\'' +
                ", phoneDestination='" + phoneDestination + '\'' +
                ", invoice='" + invoice + '\'' +
                ", observation='" + observation + '\'' +
                ", contents='" + contents + '\'' +
                ", mailDestination='" + mailDestination + '\'' +
                ", nomEmpaque='" + nomEmpaque + '\'' +
                ", valorDeclarado=" + valorDeclarado +
                ", alto=" + alto +
                ", ancho=" + ancho +
                ", largo=" + largo +
                ", peso=" + peso +
                ", unidades=" + unidades +
                '}';
    }
}