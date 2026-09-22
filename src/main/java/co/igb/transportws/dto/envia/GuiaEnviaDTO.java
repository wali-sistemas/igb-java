package co.igb.transportws.dto.envia;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author jguisao
 */
public class GuiaEnviaDTO implements Serializable {
    @JsonProperty("ciudad_origen")
    private String ciudadOrigen;
    @JsonProperty("ciudad_destino")
    private String ciudadDestino;
    @JsonProperty("cod_formapago")
    private Integer codFormaPago;
    @JsonProperty("cod_servicio")
    private Integer codServicio;
    @JsonProperty("num_unidades")
    private Integer numUnidades;
    @JsonProperty("mpesoreal_k")
    private Integer mpesorealk;
    @JsonProperty("mpesovolumen_k")
    private Integer mpesovolumenk;
    @JsonProperty("valor_declarado")
    private Integer valorDeclarado;
    @JsonProperty("mca_nosabado")
    private Integer mcaNoSabado;
    @JsonProperty("mca_docinternacional")
    private Integer mcaDocInternacional;
    @JsonProperty("cod_regional_cta")
    private Integer codRegionalCta;
    @JsonProperty("cod_oficina_cta")
    private Integer codOficinaCta;
    @JsonProperty("cod_cuenta")
    private Integer codCuenta;
    @JsonProperty("con_cartaporte")
    private String conCartaporte;
    @JsonProperty("info_origen")
    private InfoOrigen infoOrigen;
    @JsonProperty("info_destino")
    private InfoDestino infoDestino;
    @JsonProperty("info_contenido")
    private InfoContenido infoContenido;
    @JsonProperty("numero_guia")
    private String numeroGuia;
    @JsonProperty("generar_os")
    private String generarOs;
    @JsonProperty("tipo_rotulo")
    private Integer tipoRotulo;

    public GuiaEnviaDTO() {
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

    public Integer getCodFormaPago() {
        return codFormaPago;
    }

    public void setCodFormaPago(Integer codFormaPago) {
        this.codFormaPago = codFormaPago;
    }

    public Integer getCodServicio() {
        return codServicio;
    }

    public void setCodServicio(Integer codServicio) {
        this.codServicio = codServicio;
    }

    public Integer getNumUnidades() {
        return numUnidades;
    }

    public void setNumUnidades(Integer numUnidades) {
        this.numUnidades = numUnidades;
    }

    public Integer getMpesorealk() {
        return mpesorealk;
    }

    public void setMpesorealk(Integer mpesorealk) {
        this.mpesorealk = mpesorealk;
    }

    public Integer getMpesovolumenk() {
        return mpesovolumenk;
    }

    public void setMpesovolumenk(Integer mpesovolumenk) {
        this.mpesovolumenk = mpesovolumenk;
    }

    public Integer getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(Integer valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    public Integer getMcaNoSabado() {
        return mcaNoSabado;
    }

    public void setMcaNoSabado(Integer mcaNoSabado) {
        this.mcaNoSabado = mcaNoSabado;
    }

    public Integer getMcaDocInternacional() {
        return mcaDocInternacional;
    }

    public void setMcaDocInternacional(Integer mcaDocInternacional) {
        this.mcaDocInternacional = mcaDocInternacional;
    }

    public Integer getCodRegionalCta() {
        return codRegionalCta;
    }

    public void setCodRegionalCta(Integer codRegionalCta) {
        this.codRegionalCta = codRegionalCta;
    }

    public Integer getCodOficinaCta() {
        return codOficinaCta;
    }

    public void setCodOficinaCta(Integer codOficinaCta) {
        this.codOficinaCta = codOficinaCta;
    }

    public Integer getCodCuenta() {
        return codCuenta;
    }

    public void setCodCuenta(Integer codCuenta) {
        this.codCuenta = codCuenta;
    }

    public String getConCartaporte() {
        return conCartaporte;
    }

    public void setConCartaporte(String conCartaporte) {
        this.conCartaporte = conCartaporte;
    }

    public InfoOrigen getInfoOrigen() {
        return infoOrigen;
    }

    public void setInfoOrigen(InfoOrigen infoOrigen) {
        this.infoOrigen = infoOrigen;
    }

    public InfoDestino getInfoDestino() {
        return infoDestino;
    }

    public void setInfoDestino(InfoDestino infoDestino) {
        this.infoDestino = infoDestino;
    }

    public InfoContenido getInfoContenido() {
        return infoContenido;
    }

    public void setInfoContenido(InfoContenido infoContenido) {
        this.infoContenido = infoContenido;
    }

    public String getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    public String getGenerarOs() {
        return generarOs;
    }

    public void setGenerarOs(String generarOs) {
        this.generarOs = generarOs;
    }

    public Integer getTipoRotulo() {
        return tipoRotulo;
    }

    public void setTipoRotulo(Integer tipoRotulo) {
        this.tipoRotulo = tipoRotulo;
    }

    public static class InfoOrigen implements Serializable {
        @JsonProperty("nom_remitente")
        private String nomRemitente;
        @JsonProperty("dir_remitente")
        private String dirRemitente;
        @JsonProperty("tel_remitente")
        private String telRemitente;
        @JsonProperty("cedRemitente")
        private String cedRemitente;

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
    }

    public static class InfoDestino implements Serializable {
        @JsonProperty("nom_destinatario")
        private String nomDestinatario;
        @JsonProperty("dir_destinatario")
        private String dirDestinatario;
        @JsonProperty("tel_destinatario")
        private String telDestinatario;
        @JsonProperty("ced_destinatario")
        private String cedDestinatario;

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
    }

    public static class InfoContenido implements Serializable {
        @JsonProperty("dice_contener")
        private String diceContener;
        @JsonProperty("texto_guia")
        private String textoGuia;
        @JsonProperty("accion_notaguia")
        private String accionNotaGuia;
        @JsonProperty("num_documentos")
        private String numDocumentos;
        @JsonProperty("centrocosto")
        private String centroCosto;
        @JsonProperty("valorproducto")
        private String valorProducto;

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

        public String getCentroCosto() {
            return centroCosto;
        }

        public void setCentroCosto(String centroCosto) {
            this.centroCosto = centroCosto;
        }

        public String getValorProducto() {
            return valorProducto;
        }

        public void setValorProducto(String valorProducto) {
            this.valorProducto = valorProducto;
        }
    }
}