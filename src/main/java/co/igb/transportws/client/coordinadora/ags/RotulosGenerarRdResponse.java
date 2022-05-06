
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
 *         &lt;element name="Rotulos_generarRdResult" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}Rotulos_cmOut"/>
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
    "rotulosGenerarRdResult"
})
@XmlRootElement(name = "Rotulos_generarRdResponse")
public class RotulosGenerarRdResponse {

    @XmlElement(name = "Rotulos_generarRdResult", required = true)
    protected RotulosCmOut rotulosGenerarRdResult;

    /**
     * Obtiene el valor de la propiedad rotulosGenerarRdResult.
     * 
     * @return
     *     possible object is
     *     {@link RotulosCmOut }
     *     
     */
    public RotulosCmOut getRotulosGenerarRdResult() {
        return rotulosGenerarRdResult;
    }

    /**
     * Define el valor de la propiedad rotulosGenerarRdResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RotulosCmOut }
     *     
     */
    public void setRotulosGenerarRdResult(RotulosCmOut value) {
        this.rotulosGenerarRdResult = value;
    }

}
