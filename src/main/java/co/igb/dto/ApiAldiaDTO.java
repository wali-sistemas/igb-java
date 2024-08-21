package co.igb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiAldiaDTO {
    private String documentor;
    private String nombrer;
    private String direccionr;
    private String telefonor;
    private String codCiudadr;
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
    private String tipoEmpaque;

    public ApiAldiaDTO() {
    }

    public ApiAldiaDTO(String documentor, String nombrer, String direccionr, String telefonor, String codCiudadr, String tipoDocumentod, String documentod, String nombred, String direcciond, String telefonod, String codCiudadd, String observacion, String factura, String peso, String volumen, String vlrDecl, String codProducto, String cant, String descripcion, String tipoEmpaque) {
        this.documentor = documentor;
        this.nombrer = nombrer;
        this.direccionr = direccionr;
        this.telefonor = telefonor;
        this.codCiudadr = codCiudadr;
        this.tipoDocumentod = tipoDocumentod;
        this.documentod = documentod;
        this.nombred = nombred;
        this.direcciond = direcciond;
        this.telefonod = telefonod;
        this.codCiudadd = codCiudadd;
        this.observacion = observacion;
        this.factura = factura;
        this.peso = peso;
        this.volumen = volumen;
        this.vlrDecl = vlrDecl;
        this.codProducto = codProducto;
        this.cant = cant;
        this.descripcion = descripcion;
        this.tipoEmpaque = tipoEmpaque;
    }

    public String getDocumentor() {
        return documentor;
    }

    public void setDocumentor(String documentor) {
        this.documentor = documentor;
    }

    public String getNombrer() {
        return nombrer;
    }

    public void setNombrer(String nombrer) {
        this.nombrer = nombrer;
    }

    public String getDireccionr() {
        return direccionr;
    }

    public void setDireccionr(String direccionr) {
        this.direccionr = direccionr;
    }

    public String getTelefonor() {
        return telefonor;
    }

    public void setTelefonor(String telefonor) {
        this.telefonor = telefonor;
    }

    public String getCodCiudadr() {
        return codCiudadr;
    }

    public void setCodCiudadr(String codCiudadr) {
        this.codCiudadr = codCiudadr;
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

    public String getTipoEmpaque() {
        return tipoEmpaque;
    }

    public void setTipoEmpaque(String tipoEmpaque) {
        this.tipoEmpaque = tipoEmpaque;
    }

    @Override
    public String toString() {
        return "ApiAldiaDTO{" +
                "documentor='" + documentor + '\'' +
                ", nombrer='" + nombrer + '\'' +
                ", direccionr='" + direccionr + '\'' +
                ", telefonor='" + telefonor + '\'' +
                ", codCiudadr='" + codCiudadr + '\'' +
                ", tipoDocumentod='" + tipoDocumentod + '\'' +
                ", documentod='" + documentod + '\'' +
                ", nombred='" + nombred + '\'' +
                ", direcciond='" + direcciond + '\'' +
                ", telefonod='" + telefonod + '\'' +
                ", codCiudadd='" + codCiudadd + '\'' +
                ", observacion='" + observacion + '\'' +
                ", factura='" + factura + '\'' +
                ", peso='" + peso + '\'' +
                ", volumen='" + volumen + '\'' +
                ", vlrDecl='" + vlrDecl + '\'' +
                ", codProducto='" + codProducto + '\'' +
                ", cant='" + cant + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tipoEmpaque='" + tipoEmpaque + '\'' +
                '}';
    }
}