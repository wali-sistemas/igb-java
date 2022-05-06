
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
 *         &lt;element name="Recogidas_seguimientoExtResult" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}Recogida_SeguimientoExtOut"/>
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
    "recogidasSeguimientoExtResult"
})
@XmlRootElement(name = "Recogidas_seguimientoExtResponse")
public class RecogidasSeguimientoExtResponse {

    @XmlElement(name = "Recogidas_seguimientoExtResult", required = true)
    protected RecogidaSeguimientoExtOut recogidasSeguimientoExtResult;

    /**
     * Obtiene el valor de la propiedad recogidasSeguimientoExtResult.
     * 
     * @return
     *     possible object is
     *     {@link RecogidaSeguimientoExtOut }
     *     
     */
    public RecogidaSeguimientoExtOut getRecogidasSeguimientoExtResult() {
        return recogidasSeguimientoExtResult;
    }

    /**
     * Define el valor de la propiedad recogidasSeguimientoExtResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RecogidaSeguimientoExtOut }
     *     
     */
    public void setRecogidasSeguimientoExtResult(RecogidaSeguimientoExtOut value) {
        this.recogidasSeguimientoExtResult = value;
    }

}
