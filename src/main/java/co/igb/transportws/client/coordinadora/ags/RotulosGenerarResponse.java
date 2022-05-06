
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
 *         &lt;element name="Rotulos_generarResult" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}Rotulos_cmOut"/>
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
    "rotulosGenerarResult"
})
@XmlRootElement(name = "Rotulos_generarResponse")
public class RotulosGenerarResponse {

    @XmlElement(name = "Rotulos_generarResult", required = true)
    protected RotulosCmOut rotulosGenerarResult;

    /**
     * Obtiene el valor de la propiedad rotulosGenerarResult.
     * 
     * @return
     *     possible object is
     *     {@link RotulosCmOut }
     *     
     */
    public RotulosCmOut getRotulosGenerarResult() {
        return rotulosGenerarResult;
    }

    /**
     * Define el valor de la propiedad rotulosGenerarResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RotulosCmOut }
     *     
     */
    public void setRotulosGenerarResult(RotulosCmOut value) {
        this.rotulosGenerarResult = value;
    }

}
