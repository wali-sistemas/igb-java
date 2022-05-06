
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_imprimirRotulosOut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_imprimirRotulosOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rotulos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rotulosRd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agw_imprimirRotulosOut", propOrder = {

})
public class AgwImprimirRotulosOut {

    protected boolean error;
    @XmlElement(required = true)
    protected String errorMessage;
    @XmlElement(required = true)
    protected String rotulos;
    @XmlElement(required = true)
    protected String rotulosRd;

    /**
     * Obtiene el valor de la propiedad error.
     * 
     */
    public boolean isError() {
        return error;
    }

    /**
     * Define el valor de la propiedad error.
     * 
     */
    public void setError(boolean value) {
        this.error = value;
    }

    /**
     * Obtiene el valor de la propiedad errorMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Define el valor de la propiedad errorMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad rotulos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRotulos() {
        return rotulos;
    }

    /**
     * Define el valor de la propiedad rotulos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRotulos(String value) {
        this.rotulos = value;
    }

    /**
     * Obtiene el valor de la propiedad rotulosRd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRotulosRd() {
        return rotulosRd;
    }

    /**
     * Define el valor de la propiedad rotulosRd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRotulosRd(String value) {
        this.rotulosRd = value;
    }

}
