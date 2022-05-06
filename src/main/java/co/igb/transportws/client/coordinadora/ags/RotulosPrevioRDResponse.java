
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
 *         &lt;element name="Rotulos_previoRDResult" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}Rotulos_previo_RDOut"/>
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
    "rotulosPrevioRDResult"
})
@XmlRootElement(name = "Rotulos_previoRDResponse")
public class RotulosPrevioRDResponse {

    @XmlElement(name = "Rotulos_previoRDResult", required = true)
    protected RotulosPrevioRDOut rotulosPrevioRDResult;

    /**
     * Obtiene el valor de la propiedad rotulosPrevioRDResult.
     * 
     * @return
     *     possible object is
     *     {@link RotulosPrevioRDOut }
     *     
     */
    public RotulosPrevioRDOut getRotulosPrevioRDResult() {
        return rotulosPrevioRDResult;
    }

    /**
     * Define el valor de la propiedad rotulosPrevioRDResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RotulosPrevioRDOut }
     *     
     */
    public void setRotulosPrevioRDResult(RotulosPrevioRDOut value) {
        this.rotulosPrevioRDResult = value;
    }

}
