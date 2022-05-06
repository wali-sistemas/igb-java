
package co.igb.soulws.client.wsClientesBodegas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clsBEGuiasxPedido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clsBEGuiasxPedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NoPedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnidadAgrupamiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NroPaquete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroGuia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Remision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Consecutivo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsBEGuiasxPedido", propOrder = {
    "noPedido",
    "unidadAgrupamiento",
    "nroPaquete",
    "numeroGuia",
    "idRemision"
})
public class ClsBEGuiasxPedido {

    @XmlElement(name = "NoPedido")
    protected String noPedido;
    @XmlElement(name = "UnidadAgrupamiento")
    protected String unidadAgrupamiento;
    @XmlElement(name = "NroPaquete")
    protected String nroPaquete;
    @XmlElement(name = "NumeroGuia")
    protected String numeroGuia;
    @XmlElement(name = "Id_Remision")
    protected String idRemision;
    @XmlAttribute(name = "Consecutivo")
    protected String consecutivo;

    /**
     * Obtiene el valor de la propiedad noPedido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoPedido() {
        return noPedido;
    }

    /**
     * Define el valor de la propiedad noPedido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoPedido(String value) {
        this.noPedido = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadAgrupamiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadAgrupamiento() {
        return unidadAgrupamiento;
    }

    /**
     * Define el valor de la propiedad unidadAgrupamiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadAgrupamiento(String value) {
        this.unidadAgrupamiento = value;
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
     * Obtiene el valor de la propiedad numeroGuia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuia() {
        return numeroGuia;
    }

    /**
     * Define el valor de la propiedad numeroGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuia(String value) {
        this.numeroGuia = value;
    }

    /**
     * Obtiene el valor de la propiedad idRemision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRemision() {
        return idRemision;
    }

    /**
     * Define el valor de la propiedad idRemision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRemision(String value) {
        this.idRemision = value;
    }

    /**
     * Obtiene el valor de la propiedad consecutivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsecutivo() {
        return consecutivo;
    }

    /**
     * Define el valor de la propiedad consecutivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsecutivo(String value) {
        this.consecutivo = value;
    }

}
