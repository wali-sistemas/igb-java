
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
 *         &lt;element name="Rotulos_previoResult" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}Rotulos_previoOut"/>
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
    "rotulosPrevioResult"
})
@XmlRootElement(name = "Rotulos_previoResponse")
public class RotulosPrevioResponse {

    @XmlElement(name = "Rotulos_previoResult", required = true)
    protected RotulosPrevioOut rotulosPrevioResult;

    /**
     * Obtiene el valor de la propiedad rotulosPrevioResult.
     * 
     * @return
     *     possible object is
     *     {@link RotulosPrevioOut }
     *     
     */
    public RotulosPrevioOut getRotulosPrevioResult() {
        return rotulosPrevioResult;
    }

    /**
     * Define el valor de la propiedad rotulosPrevioResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RotulosPrevioOut }
     *     
     */
    public void setRotulosPrevioResult(RotulosPrevioOut value) {
        this.rotulosPrevioResult = value;
    }

}
