
package co.igb.apiSoul.client.wsClientesBodegas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clsBEWsPaquetesxPedido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clsBEWsPaquetesxPedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Destinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DireccionEnvio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NroPaquete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescripcionPaquete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Peso" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Largo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Ancho" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Alto" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CodigoProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreComercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CantidadSalida" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CantidadAlistada" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="NroGuia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ConsecutivoSalida" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NroPedido" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsBEWsPaquetesxPedido", propOrder = {
    "observaciones",
    "destinatario",
    "direccionEnvio",
    "nroPaquete",
    "descripcionPaquete",
    "peso",
    "largo",
    "ancho",
    "alto",
    "codigoProducto",
    "nombreComercial",
    "referencia",
    "cantidadSalida",
    "cantidadAlistada",
    "nroGuia"
})
public class ClsBEWsPaquetesxPedido {

    @XmlElement(name = "Observaciones")
    protected String observaciones;
    @XmlElement(name = "Destinatario")
    protected String destinatario;
    @XmlElement(name = "DireccionEnvio")
    protected String direccionEnvio;
    @XmlElement(name = "NroPaquete")
    protected String nroPaquete;
    @XmlElement(name = "DescripcionPaquete")
    protected String descripcionPaquete;
    @XmlElement(name = "Peso", required = true)
    protected BigDecimal peso;
    @XmlElement(name = "Largo", required = true)
    protected BigDecimal largo;
    @XmlElement(name = "Ancho", required = true)
    protected BigDecimal ancho;
    @XmlElement(name = "Alto", required = true)
    protected BigDecimal alto;
    @XmlElement(name = "CodigoProducto")
    protected String codigoProducto;
    @XmlElement(name = "NombreComercial")
    protected String nombreComercial;
    @XmlElement(name = "Referencia")
    protected String referencia;
    @XmlElement(name = "CantidadSalida", required = true)
    protected BigDecimal cantidadSalida;
    @XmlElement(name = "CantidadAlistada", required = true)
    protected BigDecimal cantidadAlistada;
    @XmlElement(name = "NroGuia")
    protected String nroGuia;
    @XmlAttribute(name = "ConsecutivoSalida")
    protected String consecutivoSalida;
    @XmlAttribute(name = "NroPedido")
    protected String nroPedido;

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
     * Obtiene el valor de la propiedad destinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinatario() {
        return destinatario;
    }

    /**
     * Define el valor de la propiedad destinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinatario(String value) {
        this.destinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionEnvio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    /**
     * Define el valor de la propiedad direccionEnvio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionEnvio(String value) {
        this.direccionEnvio = value;
    }

    /**
     * Obtiene el valor de la propiedad nroPaquete.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroPaquete() {
        return nroPaquete;
    }

    /**
     * Define el valor de la propiedad nroPaquete.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroPaquete(String value) {
        this.nroPaquete = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionPaquete.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionPaquete() {
        return descripcionPaquete;
    }

    /**
     * Define el valor de la propiedad descripcionPaquete.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionPaquete(String value) {
        this.descripcionPaquete = value;
    }

    /**
     * Obtiene el valor de la propiedad peso.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPeso() {
        return peso;
    }

    /**
     * Define el valor de la propiedad peso.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPeso(BigDecimal value) {
        this.peso = value;
    }

    /**
     * Obtiene el valor de la propiedad largo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLargo() {
        return largo;
    }

    /**
     * Define el valor de la propiedad largo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLargo(BigDecimal value) {
        this.largo = value;
    }

    /**
     * Obtiene el valor de la propiedad ancho.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAncho() {
        return ancho;
    }

    /**
     * Define el valor de la propiedad ancho.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAncho(BigDecimal value) {
        this.ancho = value;
    }

    /**
     * Obtiene el valor de la propiedad alto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAlto() {
        return alto;
    }

    /**
     * Define el valor de la propiedad alto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAlto(BigDecimal value) {
        this.alto = value;
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
     * Obtiene el valor de la propiedad cantidadSalida.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCantidadSalida() {
        return cantidadSalida;
    }

    /**
     * Define el valor de la propiedad cantidadSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCantidadSalida(BigDecimal value) {
        this.cantidadSalida = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadAlistada.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCantidadAlistada() {
        return cantidadAlistada;
    }

    /**
     * Define el valor de la propiedad cantidadAlistada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCantidadAlistada(BigDecimal value) {
        this.cantidadAlistada = value;
    }

    /**
     * Obtiene el valor de la propiedad nroGuia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroGuia() {
        return nroGuia;
    }

    /**
     * Define el valor de la propiedad nroGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroGuia(String value) {
        this.nroGuia = value;
    }

    /**
     * Obtiene el valor de la propiedad consecutivoSalida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsecutivoSalida() {
        return consecutivoSalida;
    }

    /**
     * Define el valor de la propiedad consecutivoSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsecutivoSalida(String value) {
        this.consecutivoSalida = value;
    }

    /**
     * Obtiene el valor de la propiedad nroPedido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroPedido() {
        return nroPedido;
    }

    /**
     * Define el valor de la propiedad nroPedido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroPedido(String value) {
        this.nroPedido = value;
    }

}
