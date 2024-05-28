package co.igb.transportws.dto.saferbo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author jguisao
 */
public class GuiaSaferboDTO implements Serializable {
    private String origen;
    private String destino;
    @JsonProperty("ds_valoracion")
    private String dsvaloracion;
    @JsonProperty("ds_largo")
    private String dslargo;
    @JsonProperty("ds_ancho")
    private String dsancho;
    @JsonProperty("ds_alto")
    private String dsalto;
    @JsonProperty("ds_pesovol")
    private String dspesovol;
    @JsonProperty("ds_peso")
    private String dspeso;
    private String tipoacceso;
    private String tipodatos;
    private String dscodigocliente;
    private String idnegociacion;
    private String idtipoenvio;
    private String idtipoliquidacion;
    private String idtarifaxtrayecto;
    private String dsnitr;
    private String dsnombrer;
    private String dstelr;
    private String dsdirr;
    private String dsunidad;
    private String dskilos;
    private String dsvalordec;
    @JsonProperty("dsobs_1")
    private String dsobs1;
    @JsonProperty("dsobs_2")
    private String dsobs2;
    @JsonProperty("dsobs_3")
    private String dsobs3;
    private String dscodigodestinatario;
    private String dsnitd;
    private String dsnombred;
    private String dsteld;
    private String dsdird;
    private String dsvalorrecaudar;
    private String arunidades;
    private String idconsec;
    private String solocotizar;
    private String generarguia;
    private String resultadojson;
    private String cotizarfull;

    public GuiaSaferboDTO() {
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDsvaloracion() {
        return dsvaloracion;
    }

    public void setDsvaloracion(String dsvaloracion) {
        this.dsvaloracion = dsvaloracion;
    }

    public String getDslargo() {
        return dslargo;
    }

    public void setDslargo(String dslargo) {
        this.dslargo = dslargo;
    }

    public String getDsancho() {
        return dsancho;
    }

    public void setDsancho(String dsancho) {
        this.dsancho = dsancho;
    }

    public String getDsalto() {
        return dsalto;
    }

    public void setDsalto(String dsalto) {
        this.dsalto = dsalto;
    }

    public String getDspesovol() {
        return dspesovol;
    }

    public void setDspesovol(String dspesovol) {
        this.dspesovol = dspesovol;
    }

    public String getDspeso() {
        return dspeso;
    }

    public void setDspeso(String dspeso) {
        this.dspeso = dspeso;
    }

    public String getTipoacceso() {
        return tipoacceso;
    }

    public void setTipoacceso(String tipoacceso) {
        this.tipoacceso = tipoacceso;
    }

    public String getTipodatos() {
        return tipodatos;
    }

    public void setTipodatos(String tipodatos) {
        this.tipodatos = tipodatos;
    }

    public String getDscodigocliente() {
        return dscodigocliente;
    }

    public void setDscodigocliente(String dscodigocliente) {
        this.dscodigocliente = dscodigocliente;
    }

    public String getIdnegociacion() {
        return idnegociacion;
    }

    public void setIdnegociacion(String idnegociacion) {
        this.idnegociacion = idnegociacion;
    }

    public String getIdtipoenvio() {
        return idtipoenvio;
    }

    public void setIdtipoenvio(String idtipoenvio) {
        this.idtipoenvio = idtipoenvio;
    }

    public String getIdtipoliquidacion() {
        return idtipoliquidacion;
    }

    public void setIdtipoliquidacion(String idtipoliquidacion) {
        this.idtipoliquidacion = idtipoliquidacion;
    }

    public String getIdtarifaxtrayecto() {
        return idtarifaxtrayecto;
    }

    public void setIdtarifaxtrayecto(String idtarifaxtrayecto) {
        this.idtarifaxtrayecto = idtarifaxtrayecto;
    }

    public String getDsnitr() {
        return dsnitr;
    }

    public void setDsnitr(String dsnitr) {
        this.dsnitr = dsnitr;
    }

    public String getDsnombrer() {
        return dsnombrer;
    }

    public void setDsnombrer(String dsnombrer) {
        this.dsnombrer = dsnombrer;
    }

    public String getDstelr() {
        return dstelr;
    }

    public void setDstelr(String dstelr) {
        this.dstelr = dstelr;
    }

    public String getDsdirr() {
        return dsdirr;
    }

    public void setDsdirr(String dsdirr) {
        this.dsdirr = dsdirr;
    }

    public String getDsunidad() {
        return dsunidad;
    }

    public void setDsunidad(String dsunidad) {
        this.dsunidad = dsunidad;
    }

    public String getDskilos() {
        return dskilos;
    }

    public void setDskilos(String dskilos) {
        this.dskilos = dskilos;
    }

    public String getDsvalordec() {
        return dsvalordec;
    }

    public void setDsvalordec(String dsvalordec) {
        this.dsvalordec = dsvalordec;
    }

    public String getDsobs1() {
        return dsobs1;
    }

    public void setDsobs1(String dsobs1) {
        this.dsobs1 = dsobs1;
    }

    public String getDsobs2() {
        return dsobs2;
    }

    public void setDsobs2(String dsobs2) {
        this.dsobs2 = dsobs2;
    }

    public String getDsobs3() {
        return dsobs3;
    }

    public void setDsobs3(String dsobs3) {
        this.dsobs3 = dsobs3;
    }

    public String getDscodigodestinatario() {
        return dscodigodestinatario;
    }

    public void setDscodigodestinatario(String dscodigodestinatario) {
        this.dscodigodestinatario = dscodigodestinatario;
    }

    public String getDsnitd() {
        return dsnitd;
    }

    public void setDsnitd(String dsnitd) {
        this.dsnitd = dsnitd;
    }

    public String getDsnombred() {
        return dsnombred;
    }

    public void setDsnombred(String dsnombred) {
        this.dsnombred = dsnombred;
    }

    public String getDsteld() {
        return dsteld;
    }

    public void setDsteld(String dsteld) {
        this.dsteld = dsteld;
    }

    public String getDsdird() {
        return dsdird;
    }

    public void setDsdird(String dsdird) {
        this.dsdird = dsdird;
    }

    public String getDsvalorrecaudar() {
        return dsvalorrecaudar;
    }

    public void setDsvalorrecaudar(String dsvalorrecaudar) {
        this.dsvalorrecaudar = dsvalorrecaudar;
    }

    public String getArunidades() {
        return arunidades;
    }

    public void setArunidades(String arunidades) {
        this.arunidades = arunidades;
    }

    public String getIdconsec() {
        return idconsec;
    }

    public void setIdconsec(String idconsec) {
        this.idconsec = idconsec;
    }

    public String getSolocotizar() {
        return solocotizar;
    }

    public void setSolocotizar(String solocotizar) {
        this.solocotizar = solocotizar;
    }

    public String getGenerarguia() {
        return generarguia;
    }

    public void setGenerarguia(String generarguia) {
        this.generarguia = generarguia;
    }

    public String getResultadojson() {
        return resultadojson;
    }

    public void setResultadojson(String resultadojson) {
        this.resultadojson = resultadojson;
    }

    public String getCotizarfull() {
        return cotizarfull;
    }

    public void setCotizarfull(String cotizarfull) {
        this.cotizarfull = cotizarfull;
    }
}