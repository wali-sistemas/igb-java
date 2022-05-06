
package co.igb.soulws.client.wsClientesBodegas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clsBEConsultaInventarioBodega complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clsBEConsultaInventarioBodega">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CantidadDisponible" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CantidadReservada" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bodega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sede" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsBEConsultaInventarioBodega", propOrder = {
    "sku",
    "cantidadDisponible",
    "cantidadReservada",
    "estado",
    "bodega",
    "sede"
})
public class ClsBEConsultaInventarioBodega {

    @XmlElement(name = "Sku")
    protected String sku;
    @XmlElement(name = "CantidadDisponible")
    protected int cantidadDisponible;
    @XmlElement(name = "CantidadReservada")
    protected int cantidadReservada;
    @XmlElement(name = "Estado")
    protected String estado;
    @XmlElement(name = "Bodega")
    protected String bodega;
    @XmlElement(name = "Sede")
    protected String sede;

    /**
     * Obtiene el valor de la propiedad sku.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSku() {
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
    public void setSku(String value) {
        this.sku = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadDisponible.
     * 
     */
    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    /**
     * Define el valor de la propiedad cantidadDisponible.
     * 
     */
    public void setCantidadDisponible(int value) {
        this.cantidadDisponible = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadReservada.
     * 
     */
    public int getCantidadReservada() {
        return cantidadReservada;
    }

    /**
     * Define el valor de la propiedad cantidadReservada.
     * 
     */
    public void setCantidadReservada(int value) {
        this.cantidadReservada = value;
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
     * Obtiene el valor de la propiedad bodega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodega() {
        return bodega;
    }

    /**
     * Define el valor de la propiedad bodega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodega(String value) {
        this.bodega = value;
    }

    /**
     * Obtiene el valor de la propiedad sede.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSede() {
        return sede;
    }

    /**
     * Define el valor de la propiedad sede.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSede(String value) {
        this.sede = value;
    }

}
