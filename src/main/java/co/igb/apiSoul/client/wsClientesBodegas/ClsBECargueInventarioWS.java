
package co.igb.apiSoul.client.wsClientesBodegas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clsBECargueInventarioWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clsBECargueInventarioWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Item" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Marca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreComercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Clase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Modelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubpartidaArancelaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Valor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnidadComercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtrasCaracteristicas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Plu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ancho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Largo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Alto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnidaMedidaLongitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Peso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnidadMedidaPeso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroLote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaVencimientoLote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsBECargueInventarioWS", propOrder = {
    "item",
    "marca",
    "nombreComercial",
    "referencia",
    "tipo",
    "clase",
    "modelo",
    "subpartidaArancelaria",
    "valor",
    "unidadComercial",
    "cantidad",
    "otrasCaracteristicas",
    "codigoProducto",
    "estado",
    "plu",
    "ancho",
    "largo",
    "alto",
    "unidaMedidaLongitud",
    "peso",
    "unidadMedidaPeso",
    "numeroLote",
    "fechaVencimientoLote"
})
public class ClsBECargueInventarioWS {

    @XmlElement(name = "Item")
    protected String item;
    @XmlElement(name = "Marca")
    protected String marca;
    @XmlElement(name = "NombreComercial")
    protected String nombreComercial;
    @XmlElement(name = "Referencia")
    protected String referencia;
    @XmlElement(name = "Tipo")
    protected String tipo;
    @XmlElement(name = "Clase")
    protected String clase;
    @XmlElement(name = "Modelo")
    protected String modelo;
    @XmlElement(name = "SubpartidaArancelaria")
    protected String subpartidaArancelaria;
    @XmlElement(name = "Valor")
    protected String valor;
    @XmlElement(name = "UnidadComercial")
    protected String unidadComercial;
    @XmlElement(name = "Cantidad")
    protected String cantidad;
    @XmlElement(name = "OtrasCaracteristicas")
    protected String otrasCaracteristicas;
    @XmlElement(name = "CodigoProducto")
    protected String codigoProducto;
    @XmlElement(name = "Estado")
    protected String estado;
    @XmlElement(name = "Plu")
    protected String plu;
    @XmlElement(name = "Ancho")
    protected String ancho;
    @XmlElement(name = "Largo")
    protected String largo;
    @XmlElement(name = "Alto")
    protected String alto;
    @XmlElement(name = "UnidaMedidaLongitud")
    protected String unidaMedidaLongitud;
    @XmlElement(name = "Peso")
    protected String peso;
    @XmlElement(name = "UnidadMedidaPeso")
    protected String unidadMedidaPeso;
    @XmlElement(name = "NumeroLote")
    protected String numeroLote;
    @XmlElement(name = "FechaVencimientoLote")
    protected String fechaVencimientoLote;

    /**
     * Obtiene el valor de la propiedad item.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItem() {
        return item;
    }

    /**
     * Define el valor de la propiedad item.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItem(String value) {
        this.item = value;
    }

    /**
     * Obtiene el valor de la propiedad marca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define el valor de la propiedad marca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreComercial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreComercial() {
        return nombreComercial;
    }

    /**
     * Define el valor de la propiedad nombreComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreComercial(String value) {
        this.nombreComercial = value;
    }

    /**
     * Obtiene el valor de la propiedad referencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Define el valor de la propiedad referencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencia(String value) {
        this.referencia = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad clase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClase() {
        return clase;
    }

    /**
     * Define el valor de la propiedad clase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClase(String value) {
        this.clase = value;
    }

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

    /**
     * Obtiene el valor de la propiedad subpartidaArancelaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubpartidaArancelaria() {
        return subpartidaArancelaria;
    }

    /**
     * Define el valor de la propiedad subpartidaArancelaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubpartidaArancelaria(String value) {
        this.subpartidaArancelaria = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValor(String value) {
        this.valor = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadComercial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadComercial() {
        return unidadComercial;
    }

    /**
     * Define el valor de la propiedad unidadComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadComercial(String value) {
        this.unidadComercial = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidad(String value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad otrasCaracteristicas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtrasCaracteristicas() {
        return otrasCaracteristicas;
    }

    /**
     * Define el valor de la propiedad otrasCaracteristicas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtrasCaracteristicas(String value) {
        this.otrasCaracteristicas = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * Define el valor de la propiedad codigoProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProducto(String value) {
        this.codigoProducto = value;
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
     * Obtiene el valor de la propiedad plu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlu() {
        return plu;
    }

    /**
     * Define el valor de la propiedad plu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlu(String value) {
        this.plu = value;
    }

    /**
     * Obtiene el valor de la propiedad ancho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncho() {
        return ancho;
    }

    /**
     * Define el valor de la propiedad ancho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncho(String value) {
        this.ancho = value;
    }

    /**
     * Obtiene el valor de la propiedad largo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLargo() {
        return largo;
    }

    /**
     * Define el valor de la propiedad largo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLargo(String value) {
        this.largo = value;
    }

    /**
     * Obtiene el valor de la propiedad alto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlto() {
        return alto;
    }

    /**
     * Define el valor de la propiedad alto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlto(String value) {
        this.alto = value;
    }

    /**
     * Obtiene el valor de la propiedad unidaMedidaLongitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidaMedidaLongitud() {
        return unidaMedidaLongitud;
    }

    /**
     * Define el valor de la propiedad unidaMedidaLongitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidaMedidaLongitud(String value) {
        this.unidaMedidaLongitud = value;
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
     * Obtiene el valor de la propiedad unidadMedidaPeso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadMedidaPeso() {
        return unidadMedidaPeso;
    }

    /**
     * Define el valor de la propiedad unidadMedidaPeso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadMedidaPeso(String value) {
        this.unidadMedidaPeso = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroLote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLote() {
        return numeroLote;
    }

    /**
     * Define el valor de la propiedad numeroLote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLote(String value) {
        this.numeroLote = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVencimientoLote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVencimientoLote() {
        return fechaVencimientoLote;
    }

    /**
     * Define el valor de la propiedad fechaVencimientoLote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVencimientoLote(String value) {
        this.fechaVencimientoLote = value;
    }

}
