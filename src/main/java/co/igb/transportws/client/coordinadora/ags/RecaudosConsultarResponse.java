
package co.igb.transportws.client.coordinadora.ags;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Recaudos_consultarResult" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}ArrayOfRecaudos_out"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "recaudosConsultarResult"
})
@XmlRootElement(name = "Recaudos_consultarResponse")
public class RecaudosConsultarResponse {

    @XmlElement(name = "Recaudos_consultarResult", required = true)
    protected ArrayOfRecaudosOut recaudosConsultarResult;

    /**
     * Obtiene el valor de la propiedad recaudosConsultarResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecaudosOut }
     *     
     */
    public ArrayOfRecaudosOut getRecaudosConsultarResult() {
        return recaudosConsultarResult;
    }

    /**
     * Define el valor de la propiedad recaudosConsultarResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecaudosOut }
     *     
     */
    public void setRecaudosConsultarResult(ArrayOfRecaudosOut value) {
        this.recaudosConsultarResult = value;
    }

}
