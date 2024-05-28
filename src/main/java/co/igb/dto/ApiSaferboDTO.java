package co.igb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiSaferboDTO {
    private String tipoDocumentod;
    private String documentod;
    private String nombred;
    private String direcciond;
    private String telefonod;
    private String codCiudadd;
    private String observacion;
    private String factura;
    private String peso;
    private String volumen;
    private String vlrDecl;
    private String codProducto;
    private String cant;
    private String descripcion;

    public ApiSaferboDTO() {
    }

    public String getTipoDocumentod() {
        return tipoDocumentod;
    }

    public void setTipoDocumentod(String tipoDocumentod) {
        this.tipoDocumentod = tipoDocumentod;
    }

    public String getDocumentod() {
        return documentod;
    }

    public void setDocumentod(String documentod) {
        this.documentod = documentod;
    }

    public String getNombred() {
        return nombred;
    }

    public void setNombred(String nombred) {
        this.nombred = nombred;
    }

    public String getDirecciond() {
        return direcciond;
    }

    public void setDirecciond(String direcciond) {
        this.direcciond = direcciond;
    }

    public String getTelefonod() {
        return telefonod;
    }

    public void setTelefonod(String telefonod) {
        this.telefonod = telefonod;
    }

    public String getCodCiudadd() {
        return codCiudadd;
    }

    public void setCodCiudadd(String codCiudadd) {
        this.codCiudadd = codCiudadd;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    public String getVlrDecl() {
        return vlrDecl;
    }

    public void setVlrDecl(String vlrDecl) {
        this.vlrDecl = vlrDecl;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getCant() {
        return cant;
    }

    public void setCant(String cant) {
        this.cant = cant;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}