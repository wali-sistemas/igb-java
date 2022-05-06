
package co.igb.transportws.client.coordinadora.ags;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Informes_negociosOut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Informes_negociosOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="codigo_remision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nit_cliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="division" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="term_origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="term_destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ciudad_origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipo_poblacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fecha_recogida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fecha_despacho" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fecha_entrega" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombre_remitente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dir_remite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombre_destinatario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dir_destinatario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cuenta_contable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="centro_costos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unidades" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="peso_volumen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valoracion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dias_ofrecidos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dias_transcurridos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="novedad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eficiencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ano" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nivel_servicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recaudo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="forma_pago" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numero_aprobacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="a_recaudar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="guia_nueva" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipo_vinculo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imagen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="despacho" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="peso_liquidado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flete_fijo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flete_variable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flete_total" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="factura" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hora_recogida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nit_destinatario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hora_estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fecha_guia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Informes_negociosOut", propOrder = {

})
public class InformesNegociosOut {

    @XmlElement(name = "codigo_remision", required = true)
    protected String codigoRemision;
    @XmlElement(name = "nit_cliente", required = true)
    protected String nitCliente;
    @XmlElement(required = true)
    protected String division;
    @XmlElement(required = true)
    protected String documento;
    @XmlElement(name = "term_origen", required = true)
    protected String termOrigen;
    @XmlElement(name = "term_destino", required = true)
    protected String termDestino;
    @XmlElement(name = "ciudad_origen", required = true)
    protected String ciudadOrigen;
    @XmlElement(required = true)
    protected String destino;
    @XmlElement(name = "tipo_poblacion", required = true)
    protected String tipoPoblacion;
    @XmlElement(name = "fecha_recogida", required = true)
    protected String fechaRecogida;
    @XmlElement(name = "fecha_despacho", required = true)
    protected String fechaDespacho;
    @XmlElement(name = "fecha_entrega", required = true)
    protected String fechaEntrega;
    @XmlElement(required = true)
    protected String cliente;
    @XmlElement(name = "nombre_remitente", required = true)
    protected String nombreRemitente;
    @XmlElement(name = "dir_remite", required = true)
    protected String dirRemite;
    @XmlElement(name = "nombre_destinatario", required = true)
    protected String nombreDestinatario;
    @XmlElement(name = "dir_destinatario", required = true)
    protected String dirDestinatario;
    @XmlElement(name = "cuenta_contable", required = true)
    protected String cuentaContable;
    @XmlElement(name = "centro_costos", required = true)
    protected String centroCostos;
    @XmlElement(required = true)
    protected String producto;
    protected int unidades;
    @XmlElement(required = true)
    protected String peso;
    @XmlElement(name = "peso_volumen", required = true)
    protected String pesoVolumen;
    @XmlElement(required = true)
    protected String valoracion;
    @XmlElement(required = true)
    protected String estado;
    @XmlElement(name = "dias_ofrecidos")
    protected int diasOfrecidos;
    @XmlElement(name = "dias_transcurridos")
    protected int diasTranscurridos;
    @XmlElement(required = true)
    protected String novedad;
    @XmlElement(required = true)
    protected String eficiencia;
    @XmlElement(required = true)
    protected String ano;
    @XmlElement(required = true)
    protected String mes;
    @XmlElement(name = "nivel_servicio", required = true)
    protected String nivelServicio;
    @XmlElement(required = true)
    protected String recaudo;
    @XmlElement(name = "forma_pago", required = true)
    protected String formaPago;
    @XmlElement(name = "numero_aprobacion", required = true)
    protected String numeroAprobacion;
    @XmlElement(name = "a_recaudar", required = true)
    protected String aRecaudar;
    @XmlElement(name = "guia_nueva", required = true)
    protected String guiaNueva;
    @XmlElement(name = "tipo_vinculo", required = true)
    protected String tipoVinculo;
    protected int imagen;
    protected int despacho;
    @XmlElement(name = "peso_liquidado", required = true)
    protected String pesoLiquidado;
    @XmlElement(name = "flete_fijo", required = true)
    protected String fleteFijo;
    @XmlElement(name = "flete_variable", required = true)
    protected String fleteVariable;
    @XmlElement(name = "flete_total", required = true)
    protected String fleteTotal;
    @XmlElement(required = true)
    protected String factura;
    @XmlElement(name = "hora_recogida", required = true)
    protected String horaRecogida;
    @XmlElement(name = "nit_destinatario", required = true)
    protected String nitDestinatario;
    @XmlElement(name = "hora_estado", required = true)
    protected String horaEstado;
    @XmlElement(required = true)
    protected String observaciones;
    @XmlElement(name = "fecha_guia", required = true)
    protected String fechaGuia;

    /**
     * Obtiene el valor de la propiedad codigoRemision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRemision() {
        return codigoRemision;
    }

    /**
     * Define el valor de la propiedad codigoRemision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRemision(String value) {
        this.codigoRemision = value;
    }

    /**
     * Obtiene el valor de la propiedad nitCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNitCliente() {
        return nitCliente;
    }

    /**
     * Define el valor de la propiedad nitCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNitCliente(String value) {
        this.nitCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad division.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Define el valor de la propiedad division.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * Obtiene el valor de la propiedad documento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * Define el valor de la propiedad documento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumento(String value) {
        this.documento = value;
    }

    /**
     * Obtiene el valor de la propiedad termOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermOrigen() {
        return termOrigen;
    }

    /**
     * Define el valor de la propiedad termOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermOrigen(String value) {
        this.termOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad termDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermDestino() {
        return termDestino;
    }

    /**
     * Define el valor de la propiedad termDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermDestino(String value) {
        this.termDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudadOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    /**
     * Define el valor de la propiedad ciudadOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadOrigen(String value) {
        this.ciudadOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad destino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Define el valor de la propiedad destino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestino(String value) {
        this.destino = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPoblacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPoblacion() {
        return tipoPoblacion;
    }

    /**
     * Define el valor de la propiedad tipoPoblacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPoblacion(String value) {
        this.tipoPoblacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRecogida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRecogida() {
        return fechaRecogida;
    }

    /**
     * Define el valor de la propiedad fechaRecogida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRecogida(String value) {
        this.fechaRecogida = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDespacho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDespacho() {
        return fechaDespacho;
    }

    /**
     * Define el valor de la propiedad fechaDespacho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDespacho(String value) {
        this.fechaDespacho = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEntrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Define el valor de la propiedad fechaEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEntrega(String value) {
        this.fechaEntrega = value;
    }

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCliente(String value) {
        this.cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreRemitente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreRemitente() {
        return nombreRemitente;
    }

    /**
     * Define el valor de la propiedad nombreRemitente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreRemitente(String value) {
        this.nombreRemitente = value;
    }

    /**
     * Obtiene el valor de la propiedad dirRemite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirRemite() {
        return dirRemite;
    }

    /**
     * Define el valor de la propiedad dirRemite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirRemite(String value) {
        this.dirRemite = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    /**
     * Define el valor de la propiedad nombreDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDestinatario(String value) {
        this.nombreDestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad dirDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirDestinatario() {
        return dirDestinatario;
    }

    /**
     * Define el valor de la propiedad dirDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirDestinatario(String value) {
        this.dirDestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentaContable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuentaContable() {
        return cuentaContable;
    }

    /**
     * Define el valor de la propiedad cuentaContable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuentaContable(String value) {
        this.cuentaContable = value;
    }

    /**
     * Obtiene el valor de la propiedad centroCostos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentroCostos() {
        return centroCostos;
    }

    /**
     * Define el valor de la propiedad centroCostos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentroCostos(String value) {
        this.centroCostos = value;
    }

    /**
     * Obtiene el valor de la propiedad producto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducto() {
        return producto;
    }

    /**
     * Define el valor de la propiedad producto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducto(String value) {
        this.producto = value;
    }

    /**
     * Obtiene el valor de la propiedad unidades.
     * 
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * Define el valor de la propiedad unidades.
     * 
     */
    public void setUnidades(int value) {
        this.unidades = value;
    }

    /**
     * Obtiene el valor de la propiedad peso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeso() {
        return peso;
    }

    /**
     * Define el valor de la propiedad peso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeso(String value) {
        this.peso = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoVolumen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoVolumen() {
        return pesoVolumen;
    }

    /**
     * Define el valor de la propiedad pesoVolumen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoVolumen(String value) {
        this.pesoVolumen = value;
    }

    /**
     * Obtiene el valor de la propiedad valoracion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValoracion() {
        return valoracion;
    }

    /**
     * Define el valor de la propiedad valoracion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValoracion(String value) {
        this.valoracion = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad diasOfrecidos.
     * 
     */
    public int getDiasOfrecidos() {
        return diasOfrecidos;
    }

    /**
     * Define el valor de la propiedad diasOfrecidos.
     * 
     */
    public void setDiasOfrecidos(int value) {
        this.diasOfrecidos = value;
    }

    /**
     * Obtiene el valor de la propiedad diasTranscurridos.
     * 
     */
    public int getDiasTranscurridos() {
        return diasTranscurridos;
    }

    /**
     * Define el valor de la propiedad diasTranscurridos.
     * 
     */
    public void setDiasTranscurridos(int value) {
        this.diasTranscurridos = value;
    }

    /**
     * Obtiene el valor de la propiedad novedad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNovedad() {
        return novedad;
    }

    /**
     * Define el valor de la propiedad novedad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNovedad(String value) {
        this.novedad = value;
    }

    /**
     * Obtiene el valor de la propiedad eficiencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEficiencia() {
        return eficiencia;
    }

    /**
     * Define el valor de la propiedad eficiencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEficiencia(String value) {
        this.eficiencia = value;
    }

    /**
     * Obtiene el valor de la propiedad ano.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAno() {
        return ano;
    }

    /**
     * Define el valor de la propiedad ano.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAno(String value) {
        this.ano = value;
    }

    /**
     * Obtiene el valor de la propiedad mes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMes() {
        return mes;
    }

    /**
     * Define el valor de la propiedad mes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMes(String value) {
        this.mes = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelServicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivelServicio() {
        return nivelServicio;
    }

    /**
     * Define el valor de la propiedad nivelServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivelServicio(String value) {
        this.nivelServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad recaudo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecaudo() {
        return recaudo;
    }

    /**
     * Define el valor de la propiedad recaudo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecaudo(String value) {
        this.recaudo = value;
    }

    /**
     * Obtiene el valor de la propiedad formaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaPago() {
        return formaPago;
    }

    /**
     * Define el valor de la propiedad formaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaPago(String value) {
        this.formaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroAprobacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroAprobacion() {
        return numeroAprobacion;
    }

    /**
     * Define el valor de la propiedad numeroAprobacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroAprobacion(String value) {
        this.numeroAprobacion = value;
    }

    /**
     * Obtiene el valor de la propiedad aRecaudar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARecaudar() {
        return aRecaudar;
    }

    /**
     * Define el valor de la propiedad aRecaudar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARecaudar(String value) {
        this.aRecaudar = value;
    }

    /**
     * Obtiene el valor de la propiedad guiaNueva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuiaNueva() {
        return guiaNueva;
    }

    /**
     * Define el valor de la propiedad guiaNueva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuiaNueva(String value) {
        this.guiaNueva = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoVinculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoVinculo() {
        return tipoVinculo;
    }

    /**
     * Define el valor de la propiedad tipoVinculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoVinculo(String value) {
        this.tipoVinculo = value;
    }

    /**
     * Obtiene el valor de la propiedad imagen.
     * 
     */
    public int getImagen() {
        return imagen;
    }

    /**
     * Define el valor de la propiedad imagen.
     * 
     */
    public void setImagen(int value) {
        this.imagen = value;
    }

    /**
     * Obtiene el valor de la propiedad despacho.
     * 
     */
    public int getDespacho() {
        return despacho;
    }

    /**
     * Define el valor de la propiedad despacho.
     * 
     */
    public void setDespacho(int value) {
        this.despacho = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoLiquidado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoLiquidado() {
        return pesoLiquidado;
    }

    /**
     * Define el valor de la propiedad pesoLiquidado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoLiquidado(String value) {
        this.pesoLiquidado = value;
    }

    /**
     * Obtiene el valor de la propiedad fleteFijo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFleteFijo() {
        return fleteFijo;
    }

    /**
     * Define el valor de la propiedad fleteFijo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFleteFijo(String value) {
        this.fleteFijo = value;
    }

    /**
     * Obtiene el valor de la propiedad fleteVariable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFleteVariable() {
        return fleteVariable;
    }

    /**
     * Define el valor de la propiedad fleteVariable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFleteVariable(String value) {
        this.fleteVariable = value;
    }

    /**
     * Obtiene el valor de la propiedad fleteTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFleteTotal() {
        return fleteTotal;
    }

    /**
     * Define el valor de la propiedad fleteTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFleteTotal(String value) {
        this.fleteTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad factura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactura() {
        return factura;
    }

    /**
     * Define el valor de la propiedad factura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactura(String value) {
        this.factura = value;
    }

    /**
     * Obtiene el valor de la propiedad horaRecogida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraRecogida() {
        return horaRecogida;
    }

    /**
     * Define el valor de la propiedad horaRecogida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraRecogida(String value) {
        this.horaRecogida = value;
    }

    /**
     * Obtiene el valor de la propiedad nitDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNitDestinatario() {
        return nitDestinatario;
    }

    /**
     * Define el valor de la propiedad nitDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNitDestinatario(String value) {
        this.nitDestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad horaEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraEstado() {
        return horaEstado;
    }

    /**
     * Define el valor de la propiedad horaEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraEstado(String value) {
        this.horaEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad observaciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Define el valor de la propiedad observaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservaciones(String value) {
        this.observaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaGuia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaGuia() {
        return fechaGuia;
    }

    /**
     * Define el valor de la propiedad fechaGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaGuia(String value) {
        this.fechaGuia = value;
    }

}
