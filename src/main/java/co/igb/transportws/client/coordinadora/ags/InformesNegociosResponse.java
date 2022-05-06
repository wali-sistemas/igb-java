
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
 *         &lt;element name="Informes_negociosResult" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}ArrayOfInformes_negociosout"/>
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
    "informesNegociosResult"
})
@XmlRootElement(name = "Informes_negociosResponse")
public class InformesNegociosResponse {

    @XmlElement(name = "Informes_negociosResult", required = true)
    protected ArrayOfInformesNegociosout informesNegociosResult;

    /**
     * Obtiene el valor de la propiedad informesNegociosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInformesNegociosout }
     *     
     */
    public ArrayOfInformesNegociosout getInformesNegociosResult() {
        return informesNegociosResult;
    }

    /**
     * Define el valor de la propiedad informesNegociosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInformesNegociosout }
     *     
     */
    public void setInformesNegociosResult(ArrayOfInformesNegociosout value) {
        this.informesNegociosResult = value;
    }

}
