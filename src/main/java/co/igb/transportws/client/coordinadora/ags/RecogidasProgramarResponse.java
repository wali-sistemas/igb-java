
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
 *         &lt;element name="Recogidas_programarResult" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}Recogidas_solicitarOut"/>
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
    "recogidasProgramarResult"
})
@XmlRootElement(name = "Recogidas_programarResponse")
public class RecogidasProgramarResponse {

    @XmlElement(name = "Recogidas_programarResult", required = true)
    protected RecogidasSolicitarOut recogidasProgramarResult;

    /**
     * Obtiene el valor de la propiedad recogidasProgramarResult.
     * 
     * @return
     *     possible object is
     *     {@link RecogidasSolicitarOut }
     *     
     */
    public RecogidasSolicitarOut getRecogidasProgramarResult() {
        return recogidasProgramarResult;
    }

    /**
     * Define el valor de la propiedad recogidasProgramarResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RecogidasSolicitarOut }
     *     
     */
    public void setRecogidasProgramarResult(RecogidasSolicitarOut value) {
        this.recogidasProgramarResult = value;
    }

}
