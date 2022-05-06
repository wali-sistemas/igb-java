
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
 *         &lt;element name="Rotulos_integracionResult" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}ArrayOfRotulos_integracionout"/>
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
    "rotulosIntegracionResult"
})
@XmlRootElement(name = "Rotulos_integracionResponse")
public class RotulosIntegracionResponse {

    @XmlElement(name = "Rotulos_integracionResult", required = true)
    protected ArrayOfRotulosIntegracionout rotulosIntegracionResult;

    /**
     * Obtiene el valor de la propiedad rotulosIntegracionResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRotulosIntegracionout }
     *     
     */
    public ArrayOfRotulosIntegracionout getRotulosIntegracionResult() {
        return rotulosIntegracionResult;
    }

    /**
     * Define el valor de la propiedad rotulosIntegracionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRotulosIntegracionout }
     *     
     */
    public void setRotulosIntegracionResult(ArrayOfRotulosIntegracionout value) {
        this.rotulosIntegracionResult = value;
    }

}
