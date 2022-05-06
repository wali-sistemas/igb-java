
package co.igb.transportws.client.coordinadora.ags;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Recogidas_SeguimientoReferenciaIn complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Recogidas_SeguimientoReferenciaIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="nit_cliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="div_cliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="referencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apikey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recogidas_SeguimientoReferenciaIn", propOrder = {

})
public class RecogidasSeguimientoReferenciaIn {

    @XmlElement(name = "nit_cliente", required = true)
    protected String nitCliente;
    @XmlElement(name = "div_cliente", required = true)
    protected String divCliente;
    @XmlElement(required = true)
    protected String referencia;
    @XmlElement(required = true)
    protected String apikey;
    @XmlElement(required = true)
    protected String clave;

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
     * Obtiene el valor de la propiedad divCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivCliente() {
        return divCliente;
    }

    /**
     * Define el valor de la propiedad divCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivCliente(String value) {
        this.divCliente = value;
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
     * Obtiene el valor de la propiedad apikey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApikey() {
        return apikey;
    }

    /**
     * Define el valor de la propiedad apikey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApikey(String value) {
        this.apikey = value;
    }

    /**
     * Obtiene el valor de la propiedad clave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * Define el valor de la propiedad clave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
    }

}
