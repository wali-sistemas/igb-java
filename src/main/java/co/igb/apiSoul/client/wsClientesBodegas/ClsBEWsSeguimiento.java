
package co.igb.apiSoul.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clsBEWsSeguimiento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clsBEWsSeguimiento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Bp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaEstimadaSalida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaEstimadaLlegada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaRealSalida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaRealLlegada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Motonave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NroViaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsBEWsSeguimiento", propOrder = {
    "bp",
    "docTransporte",
    "fechaEstimadaSalida",
    "fechaEstimadaLlegada",
    "fechaRealSalida",
    "fechaRealLlegada",
    "motonave",
    "nroViaje"
})
public class ClsBEWsSeguimiento {

    @XmlElement(name = "Bp")
    protected String bp;
    @XmlElement(name = "DocTransporte")
    protected String docTransporte;
    @XmlElement(name = "FechaEstimadaSalida")
    protected String fechaEstimadaSalida;
    @XmlElement(name = "FechaEstimadaLlegada")
    protected String fechaEstimadaLlegada;
    @XmlElement(name = "FechaRealSalida")
    protected String fechaRealSalida;
    @XmlElement(name = "FechaRealLlegada")
    protected String fechaRealLlegada;
    @XmlElement(name = "Motonave")
    protected String motonave;
    @XmlElement(name = "NroViaje")
    protected String nroViaje;

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
     * Obtiene el valor de la propiedad docTransporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTransporte() {
        return docTransporte;
    }

    /**
     * Define el valor de la propiedad docTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocTransporte(String value) {
        this.docTransporte = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEstimadaSalida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEstimadaSalida() {
        return fechaEstimadaSalida;
    }

    /**
     * Define el valor de la propiedad fechaEstimadaSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEstimadaSalida(String value) {
        this.fechaEstimadaSalida = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEstimadaLlegada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEstimadaLlegada() {
        return fechaEstimadaLlegada;
    }

    /**
     * Define el valor de la propiedad fechaEstimadaLlegada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEstimadaLlegada(String value) {
        this.fechaEstimadaLlegada = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRealSalida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRealSalida() {
        return fechaRealSalida;
    }

    /**
     * Define el valor de la propiedad fechaRealSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRealSalida(String value) {
        this.fechaRealSalida = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRealLlegada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRealLlegada() {
        return fechaRealLlegada;
    }

    /**
     * Define el valor de la propiedad fechaRealLlegada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRealLlegada(String value) {
        this.fechaRealLlegada = value;
    }

    /**
     * Obtiene el valor de la propiedad motonave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotonave() {
        return motonave;
    }

    /**
     * Define el valor de la propiedad motonave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotonave(String value) {
        this.motonave = value;
    }

    /**
     * Obtiene el valor de la propiedad nroViaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroViaje() {
        return nroViaje;
    }

    /**
     * Define el valor de la propiedad nroViaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroViaje(String value) {
        this.nroViaje = value;
    }

}
