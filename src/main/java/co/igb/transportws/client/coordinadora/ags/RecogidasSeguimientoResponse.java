
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
 *         &lt;element name="Recogidas_seguimientoResult" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}Recogidas_SeguimientoOut"/>
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
    "recogidasSeguimientoResult"
})
@XmlRootElement(name = "Recogidas_seguimientoResponse")
public class RecogidasSeguimientoResponse {

    @XmlElement(name = "Recogidas_seguimientoResult", required = true)
    protected RecogidasSeguimientoOut recogidasSeguimientoResult;

    /**
     * Obtiene el valor de la propiedad recogidasSeguimientoResult.
     * 
     * @return
     *     possible object is
     *     {@link RecogidasSeguimientoOut }
     *     
     */
    public RecogidasSeguimientoOut getRecogidasSeguimientoResult() {
        return recogidasSeguimientoResult;
    }

    /**
     * Define el valor de la propiedad recogidasSeguimientoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RecogidasSeguimientoOut }
     *     
     */
    public void setRecogidasSeguimientoResult(RecogidasSeguimientoOut value) {
        this.recogidasSeguimientoResult = value;
    }

}
