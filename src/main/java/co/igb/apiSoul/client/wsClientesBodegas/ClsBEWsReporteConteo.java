
package co.igb.apiSoul.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clsBEWsReporteConteo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clsBEWsReporteConteo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreComercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NroFactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CantidadContada" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Diferencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConteoFinalizado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FechaFinalizacionConteo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsBEWsReporteConteo", propOrder = {
    "sku",
    "nombreComercial",
    "nroFactura",
    "cantidad",
    "cantidadContada",
    "diferencia",
    "conteoFinalizado",
    "fechaFinalizacionConteo"
})
public class ClsBEWsReporteConteo {

    @XmlElement(name = "Sku")
    protected String sku;
    @XmlElement(name = "NombreComercial")
    protected String nombreComercial;
    @XmlElement(name = "NroFactura")
    protected String nroFactura;
    @XmlElement(name = "Cantidad")
    protected int cantidad;
    @XmlElement(name = "CantidadContada")
    protected int cantidadContada;
    @XmlElement(name = "Diferencia")
    protected int diferencia;
    @XmlElement(name = "ConteoFinalizado")
    protected boolean conteoFinalizado;
    @XmlElement(name = "FechaFinalizacionConteo")
    protected String fechaFinalizacionConteo;

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
     * Obtiene el valor de la propiedad nroFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroFactura() {
        return nroFactura;
    }

    /**
     * Define el valor de la propiedad nroFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroFactura(String value) {
        this.nroFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
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
     * Obtiene el valor de la propiedad diferencia.
     * 
     */
    public int getDiferencia() {
        return diferencia;
    }

    /**
     * Define el valor de la propiedad diferencia.
     * 
     */
    public void setDiferencia(int value) {
        this.diferencia = value;
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

    /**
     * Obtiene el valor de la propiedad fechaFinalizacionConteo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFinalizacionConteo() {
        return fechaFinalizacionConteo;
    }

    /**
     * Define el valor de la propiedad fechaFinalizacionConteo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFinalizacionConteo(String value) {
        this.fechaFinalizacionConteo = value;
    }

}
