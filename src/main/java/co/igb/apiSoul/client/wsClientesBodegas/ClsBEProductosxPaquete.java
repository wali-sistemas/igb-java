
package co.igb.apiSoul.client.wsClientesBodegas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clsBEProductosxPaquete complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clsBEProductosxPaquete">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CantidadAlistada" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CantidadPedida" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AlistamientoFinalizado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrdenCompra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetalleOrden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsBEProductosxPaquete", propOrder = {
    "sku",
    "cantidadAlistada",
    "cantidadPedida",
    "alistamientoFinalizado",
    "descripcion",
    "ordenCompra",
    "detalleOrden"
})
public class ClsBEProductosxPaquete {

    @XmlElement(name = "SKU")
    protected String sku;
    @XmlElement(name = "CantidadAlistada", required = true)
    protected BigDecimal cantidadAlistada;
    @XmlElement(name = "CantidadPedida", required = true)
    protected BigDecimal cantidadPedida;
    @XmlElement(name = "AlistamientoFinalizado")
    protected boolean alistamientoFinalizado;
    @XmlElement(name = "Descripcion")
    protected String descripcion;
    @XmlElement(name = "OrdenCompra")
    protected String ordenCompra;
    @XmlElement(name = "DetalleOrden")
    protected String detalleOrden;

    /**
     * Obtiene el valor de la propiedad sku.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKU() {
        return sku;
    }

    /**
     * Define el valor de la propiedad sku.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKU(String value) {
        this.sku = value;
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
     * Obtiene el valor de la propiedad cantidadPedida.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCantidadPedida() {
        return cantidadPedida;
    }

    /**
     * Define el valor de la propiedad cantidadPedida.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCantidadPedida(BigDecimal value) {
        this.cantidadPedida = value;
    }

    /**
     * Obtiene el valor de la propiedad alistamientoFinalizado.
     * 
     */
    public boolean isAlistamientoFinalizado() {
        return alistamientoFinalizado;
    }

    /**
     * Define el valor de la propiedad alistamientoFinalizado.
     * 
     */
    public void setAlistamientoFinalizado(boolean value) {
        this.alistamientoFinalizado = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad ordenCompra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdenCompra() {
        return ordenCompra;
    }

    /**
     * Define el valor de la propiedad ordenCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdenCompra(String value) {
        this.ordenCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad detalleOrden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalleOrden() {
        return detalleOrden;
    }

    /**
     * Define el valor de la propiedad detalleOrden.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalleOrden(String value) {
        this.detalleOrden = value;
    }

}
