
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
 *         &lt;element name="Recogidas_programarAlternaResult" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}Recogidas_solicitar_alternaOut"/>
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
    "recogidasProgramarAlternaResult"
})
@XmlRootElement(name = "Recogidas_programarAlternaResponse")
public class RecogidasProgramarAlternaResponse {

    @XmlElement(name = "Recogidas_programarAlternaResult", required = true)
    protected RecogidasSolicitarAlternaOut recogidasProgramarAlternaResult;

    /**
     * Obtiene el valor de la propiedad recogidasProgramarAlternaResult.
     * 
     * @return
     *     possible object is
     *     {@link RecogidasSolicitarAlternaOut }
     *     
     */
    public RecogidasSolicitarAlternaOut getRecogidasProgramarAlternaResult() {
        return recogidasProgramarAlternaResult;
    }

    /**
     * Define el valor de la propiedad recogidasProgramarAlternaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RecogidasSolicitarAlternaOut }
     *     
     */
    public void setRecogidasProgramarAlternaResult(RecogidasSolicitarAlternaOut value) {
        this.recogidasProgramarAlternaResult = value;
    }

}
