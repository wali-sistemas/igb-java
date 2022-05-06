
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_generarDespachoMovilOut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_generarDespachoMovilOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id_cliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codigo_despacho" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tiquete" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agw_generarDespachoMovilOut", propOrder = {

})
public class AgwGenerarDespachoMovilOut {

    @XmlElement(name = "id_cliente")
    protected int idCliente;
    @XmlElement(name = "codigo_despacho")
    protected int codigoDespacho;
    @XmlElement(required = true)
    protected String message;
    @XmlElement(required = true)
    protected String tiquete;

    /**
     * Obtiene el valor de la propiedad idCliente.
     * 
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Define el valor de la propiedad idCliente.
     * 
     */
    public void setIdCliente(int value) {
        this.idCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoDespacho.
     * 
     */
    public int getCodigoDespacho() {
        return codigoDespacho;
    }

    /**
     * Define el valor de la propiedad codigoDespacho.
     * 
     */
    public void setCodigoDespacho(int value) {
        this.codigoDespacho = value;
    }

    /**
     * Obtiene el valor de la propiedad message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Define el valor de la propiedad message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Obtiene el valor de la propiedad tiquete.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiquete() {
        return tiquete;
    }

    /**
     * Define el valor de la propiedad tiquete.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiquete(String value) {
        this.tiquete = value;
    }

}
