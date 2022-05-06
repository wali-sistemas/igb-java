
package co.igb.soulws.client.wsClientesBodegas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clsBEWsSalidasEverfit complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clsBEWsSalidasEverfit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConsecutivoUnidadAgrupamiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrdenCompraEver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetalleOrdenEver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Destinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CantidadSalida" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CantidadAlistada" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Despachado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Seguimiento" type="{http://tempuri.org/}clsBEWsSeguimiento" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ConsecutivoSalida" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsBEWsSalidasEverfit", propOrder = {
    "consecutivoUnidadAgrupamiento",
    "ordenCompraEver",
    "detalleOrdenEver",
    "destinatario",
    "bp",
    "codigoProducto",
    "cantidadSalida",
    "cantidadAlistada",
    "despachado",
    "seguimiento"
})
public class ClsBEWsSalidasEverfit {

    @XmlElement(name = "ConsecutivoUnidadAgrupamiento")
    protected String consecutivoUnidadAgrupamiento;
    @XmlElement(name = "OrdenCompraEver")
    protected String ordenCompraEver;
    @XmlElement(name = "DetalleOrdenEver")
    protected String detalleOrdenEver;
    @XmlElement(name = "Destinatario")
    protected String destinatario;
    @XmlElement(name = "Bp")
    protected String bp;
    @XmlElement(name = "CodigoProducto")
    protected String codigoProducto;
    @XmlElement(name = "CantidadSalida", required = true)
    protected BigDecimal cantidadSalida;
    @XmlElement(name = "CantidadAlistada", required = true)
    protected BigDecimal cantidadAlistada;
    @XmlElement(name = "Despachado")
    protected String despachado;
    @XmlElement(name = "Seguimiento")
    protected List<ClsBEWsSeguimiento> seguimiento;
    @XmlAttribute(name = "ConsecutivoSalida")
    protected String consecutivoSalida;

    /**
     * Obtiene el valor de la propiedad consecutivoUnidadAgrupamiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsecutivoUnidadAgrupamiento() {
        return consecutivoUnidadAgrupamiento;
    }

    /**
     * Define el valor de la propiedad consecutivoUnidadAgrupamiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsecutivoUnidadAgrupamiento(String value) {
        this.consecutivoUnidadAgrupamiento = value;
    }

    /**
     * Obtiene el valor de la propiedad ordenCompraEver.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdenCompraEver() {
        return ordenCompraEver;
    }

    /**
     * Define el valor de la propiedad ordenCompraEver.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdenCompraEver(String value) {
        this.ordenCompraEver = value;
    }

    /**
     * Obtiene el valor de la propiedad detalleOrdenEver.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalleOrdenEver() {
        return detalleOrdenEver;
    }

    /**
     * Define el valor de la propiedad detalleOrdenEver.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalleOrdenEver(String value) {
        this.detalleOrdenEver = value;
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
     * Obtiene el valor de la propiedad bp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBp() {
        return bp;
    }

    /**
     * Define el valor de la propiedad bp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBp(String value) {
        this.bp = value;
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
     * Obtiene el valor de la propiedad despachado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDespachado() {
        return despachado;
    }

    /**
     * Define el valor de la propiedad despachado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDespachado(String value) {
        this.despachado = value;
    }

    /**
     * Gets the value of the seguimiento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seguimiento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeguimiento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClsBEWsSeguimiento }
     * 
     * 
     */
    public List<ClsBEWsSeguimiento> getSeguimiento() {
        if (seguimiento == null) {
            seguimiento = new ArrayList<ClsBEWsSeguimiento>();
        }
        return this.seguimiento;
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

}
