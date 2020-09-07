
package co.igb.apiSoul.client.wsClientesBodegas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clsBEConsultaInventarioConteo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clsBEConsultaInventarioConteo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CantidadDocumental" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CantidadContada" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConteoFinalizado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsBEConsultaInventarioConteo", propOrder = {
    "sku",
    "cantidadDocumental",
    "cantidadContada",
    "tipo",
    "conteoFinalizado"
})
public class ClsBEConsultaInventarioConteo {

    @XmlElement(name = "Sku")
    protected String sku;
    @XmlElement(name = "CantidadDocumental")
    protected int cantidadDocumental;
    @XmlElement(name = "CantidadContada")
    protected int cantidadContada;
    @XmlElement(name = "Tipo")
    protected int tipo;
    @XmlElement(name = "ConteoFinalizado")
    protected boolean conteoFinalizado;

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
     * Obtiene el valor de la propiedad cantidadDocumental.
     * 
     */
    public int getCantidadDocumental() {
        return cantidadDocumental;
    }

    /**
     * Define el valor de la propiedad cantidadDocumental.
     * 
     */
    public void setCantidadDocumental(int value) {
        this.cantidadDocumental = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadContada.
     * 
     */
    public int getCantidadContada() {
        return cantidadContada;
    }

    /**
     * Define el valor de la propiedad cantidadContada.
     * 
     */
    public void setCantidadContada(int value) {
        this.cantidadContada = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     */
    public void setTipo(int value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad conteoFinalizado.
     * 
     */
    public boolean isConteoFinalizado() {
        return conteoFinalizado;
    }

    /**
     * Define el valor de la propiedad conteoFinalizado.
     * 
     */
    public void setConteoFinalizado(boolean value) {
        this.conteoFinalizado = value;
    }

}
