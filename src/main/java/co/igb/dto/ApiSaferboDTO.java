package co.igb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiSaferboDTO {
    //Datos del Remitente
    private static final String identificacionRemitente = "900011909";
    private static final String nombreRemitente = "IGB MOTORCYCLE PARTS S.A.S";
    private static final String telefonoRemitente = "4442025";
    private static final String direccionRemitente = "CALLE 98 SUR # 48-225 BOD 114";
    private static final String ciudadRemitente = "LA ESTRELLA-ANTIOQUIA-05380000";
    //Datos del Destinatario
    private String codigoDestinatario;
    private String identificacionDestinatario;
    private String nombreDestinatario;
    private String telefonoDestinatario;
    private String direccionDestinatario;
    private String ciudadDestinatario;
    //Datos guia
    private static final String largo = "0";
    private static final String peso = "0";
    private static final String ancho = "0";
    private static final String alto = "0";
    private String volumen;
    private String valorDeclarado;
    private String observacion;
    //Datos saferbo pruebas
    private String codigoCliente;
    //Estandar de SAFERBO
    private static final String tipoEnvio = "1";
    private static final String tipoLiquidacion = "1";
    private static final String tipoNegociacion = "1";
    private static final String tipoDato = "2";
    private static final String tipoAcceso = "1";
    private static final String tarifaXTrayecto = "2";
    private static final String pagoContraentrega = "0";
    private static final String dsUnidad = "0";
    private static final String dsKilos = "0";
    private static final String dsConsec = "0";
    private String valorRecaudar;
    private String arUnidades;
    //Datos adicionales
    private String factura;

    public ApiSaferboDTO() {
    }

    public static String getIdentificacionRemitente() {
        return identificacionRemitente;
    }

    public static String getNombreRemitente() {
        return nombreRemitente;
    }

    public static String getTelefonoRemitente() {
        return telefonoRemitente;
    }

    public static String getDireccionRemitente() {
        return direccionRemitente;
    }

    public static String getCiudadRemitente() {
        return ciudadRemitente;
    }

    public String getCodigoDestinatario() {
        return codigoDestinatario;
    }

    public void setCodigoDestinatario(String codigoDestinatario) {
        this.codigoDestinatario = codigoDestinatario;
    }

    public String getIdentificacionDestinatario() {
        return identificacionDestinatario;
    }

    public void setIdentificacionDestinatario(String identificacionDestinatario) {
        this.identificacionDestinatario = identificacionDestinatario;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public void setNombreDestinatario(String nombreDestinatario) {
        this.nombreDestinatario = nombreDestinatario;
    }

    public String getTelefonoDestinatario() {
        return telefonoDestinatario;
    }

    public void setTelefonoDestinatario(String telefonoDestinatario) {
        this.telefonoDestinatario = telefonoDestinatario;
    }

    public String getDireccionDestinatario() {
        return direccionDestinatario;
    }

    public void setDireccionDestinatario(String direccionDestinatario) {
        this.direccionDestinatario = direccionDestinatario;
    }

    public String getCiudadDestinatario() {
        return ciudadDestinatario;
    }

    public void setCiudadDestinatario(String ciudadDestinatario) {
        this.ciudadDestinatario = ciudadDestinatario;
    }

    public static String getLargo() {
        return largo;
    }

    public static String getPeso() {
        return peso;
    }

    public static String getAncho() {
        return ancho;
    }

    public static String getAlto() {
        return alto;
    }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    public String getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(String valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public static String getTipoEnvio() {
        return tipoEnvio;
    }

    public static String getTipoLiquidacion() {
        return tipoLiquidacion;
    }

    public static String getTipoNegociacion() {
        return tipoNegociacion;
    }

    public static String getTipoDato() {
        return tipoDato;
    }

    public static String getTipoAcceso() {
        return tipoAcceso;
    }

    public static String getTarifaXTrayecto() {
        return tarifaXTrayecto;
    }

    public static String getPagoContraentrega() {
        return pagoContraentrega;
    }

    public static String getDsUnidad() {
        return dsUnidad;
    }

    public static String getDsKilos() {
        return dsKilos;
    }

    public static String getDsConsec() {
        return dsConsec;
    }

    public String getValorRecaudar() {
        return valorRecaudar;
    }

    public void setValorRecaudar(String valorRecaudar) {
        this.valorRecaudar = valorRecaudar;
    }

    public String getArUnidades() {
        return arUnidades;
    }

    public void setArUnidades(String arUnidades) {
        this.arUnidades = arUnidades;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    @Override
    public String toString() {
        return "ApiSaferboDTO{" +
                "identificacionRemitente='" + identificacionRemitente + '\'' +
                ", nombreRemitente='" + nombreRemitente + '\'' +
                ", telefonoRemitente='" + telefonoRemitente + '\'' +
                ", direccionRemitente='" + direccionRemitente + '\'' +
                ", ciudadRemitente='" + ciudadRemitente + '\'' +
                ", codigoDestinatario='" + codigoDestinatario + '\'' +
                ", identificacionDestinatario='" + identificacionDestinatario + '\'' +
                ", nombreDestinatario='" + nombreDestinatario + '\'' +
                ", telefonoDestinatario='" + telefonoDestinatario + '\'' +
                ", direccionDestinatario='" + direccionDestinatario + '\'' +
                ", ciudadDestinatario='" + ciudadDestinatario + '\'' +
                ", largo='" + largo + '\'' +
                ", peso='" + peso + '\'' +
                ", ancho='" + ancho + '\'' +
                ", alto='" + alto + '\'' +
                ", volumen='" + volumen + '\'' +
                ", valorDeclarado='" + valorDeclarado + '\'' +
                ", observacion='" + observacion + '\'' +
                ", codigoCliente='" + codigoCliente + '\'' +
                ", tipoEnvio='" + tipoEnvio + '\'' +
                ", tipoLiquidacion='" + tipoLiquidacion + '\'' +
                ", tipoNegociacion='" + tipoNegociacion + '\'' +
                ", tipoDato='" + tipoDato + '\'' +
                ", tipoAcceso='" + tipoAcceso + '\'' +
                ", tarifaXTrayecto='" + tarifaXTrayecto + '\'' +
                ", pagoContraentrega='" + pagoContraentrega + '\'' +
                ", dsUnidad='" + dsUnidad + '\'' +
                ", dsKilos='" + dsKilos + '\'' +
                ", dsConsec='" + dsConsec + '\'' +
                ", valorRecaudar='" + valorRecaudar + '\'' +
                ", arUnidades='" + arUnidades + '\'' +
                ", factura='" + factura + '\'' +
                '}';
    }
}