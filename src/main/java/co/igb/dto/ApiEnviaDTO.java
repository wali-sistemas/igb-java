package co.igb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiEnviaDTO {
    private String ciudadOrigen;
    private String ciudadDestino;
    private String numUnidades;
    private String mpesorealK;
    private String mpesovolumenK;
    private String valorDeclarado;
    private String mcaNoSabado;
    private String nomRemitente;
    private String dirRemitente;
    private String telRemitente;
    private String cedRemitente;
    private String nomDestinatario;
    private String dirDestinatario;
    private String telDestinatario;
    private String cedDestinatario;
    private String diceContener;
    private String textoGuia;
    private String accionNotaGuia;
    private String numDocumentos;

    public ApiEnviaDTO() {
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getNumUnidades() {
        return numUnidades;
    }

    public void setNumUnidades(String numUnidades) {
        this.numUnidades = numUnidades;
    }

    public String getMpesorealK() {
        return mpesorealK;
    }

    public void setMpesorealK(String mpesorealK) {
        this.mpesorealK = mpesorealK;
    }

    public String getMpesovolumenK() {
        return mpesovolumenK;
    }

    public void setMpesovolumenK(String mpesovolumenK) {
        this.mpesovolumenK = mpesovolumenK;
    }

    public String getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(String valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    public String getMcaNoSabado() {
        return mcaNoSabado;
    }

    public void setMcaNoSabado(String mcaNoSabado) {
        this.mcaNoSabado = mcaNoSabado;
    }

    public String getNomRemitente() {
        return nomRemitente;
    }

    public void setNomRemitente(String nomRemitente) {
        this.nomRemitente = nomRemitente;
    }

    public String getDirRemitente() {
        return dirRemitente;
    }

    public void setDirRemitente(String dirRemitente) {
        this.dirRemitente = dirRemitente;
    }

    public String getTelRemitente() {
        return telRemitente;
    }

    public void setTelRemitente(String telRemitente) {
        this.telRemitente = telRemitente;
    }

    public String getCedRemitente() {
        return cedRemitente;
    }

    public void setCedRemitente(String cedRemitente) {
        this.cedRemitente = cedRemitente;
    }

    public String getNomDestinatario() {
        return nomDestinatario;
    }

    public void setNomDestinatario(String nomDestinatario) {
        this.nomDestinatario = nomDestinatario;
    }

    public String getDirDestinatario() {
        return dirDestinatario;
    }

    public void setDirDestinatario(String dirDestinatario) {
        this.dirDestinatario = dirDestinatario;
    }

    public String getTelDestinatario() {
        return telDestinatario;
    }

    public void setTelDestinatario(String telDestinatario) {
        this.telDestinatario = telDestinatario;
    }

    public String getCedDestinatario() {
        return cedDestinatario;
    }

    public void setCedDestinatario(String cedDestinatario) {
        this.cedDestinatario = cedDestinatario;
    }

    public String getDiceContener() {
        return diceContener;
    }

    public void setDiceContener(String diceContener) {
        this.diceContener = diceContener;
    }

    public String getTextoGuia() {
        return textoGuia;
    }

    public void setTextoGuia(String textoGuia) {
        this.textoGuia = textoGuia;
    }

    public String getAccionNotaGuia() {
        return accionNotaGuia;
    }

    public void setAccionNotaGuia(String accionNotaGuia) {
        this.accionNotaGuia = accionNotaGuia;
    }

    public String getNumDocumentos() {
        return numDocumentos;
    }

    public void setNumDocumentos(String numDocumentos) {
        this.numDocumentos = numDocumentos;
    }

    @Override
    public String toString() {
        return "ApiEnviaDTO{" +
                "ciudadOrigen='" + ciudadOrigen + '\'' +
                ", ciudadDestino='" + ciudadDestino + '\'' +
                ", numUnidades='" + numUnidades + '\'' +
                ", mpesorealK='" + mpesorealK + '\'' +
                ", mpesovolumenK='" + mpesovolumenK + '\'' +
                ", valorDeclarado='" + valorDeclarado + '\'' +
                ", mcaNoSabado='" + mcaNoSabado + '\'' +
                ", nomRemitente='" + nomRemitente + '\'' +
                ", dirRemitente='" + dirRemitente + '\'' +
                ", telRemitente='" + telRemitente + '\'' +
                ", cedRemitente='" + cedRemitente + '\'' +
                ", nomDestinatario='" + nomDestinatario + '\'' +
                ", dirDestinatario='" + dirDestinatario + '\'' +
                ", telDestinatario='" + telDestinatario + '\'' +
                ", cedDestinatario='" + cedDestinatario + '\'' +
                ", diceContener='" + diceContener + '\'' +
                ", textoGuia='" + textoGuia + '\'' +
                ", accionNotaGuia='" + accionNotaGuia + '\'' +
                ", numDocumentos='" + numDocumentos + '\'' +
                '}';
    }
}