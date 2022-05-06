
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
 *         &lt;element name="Recogidas_seguimientoPorFechaResult" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}ArrayOfRecogidas_seguimientoporfechaout"/>
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
    "recogidasSeguimientoPorFechaResult"
})
@XmlRootElement(name = "Recogidas_seguimientoPorFechaResponse")
public class RecogidasSeguimientoPorFechaResponse {

    @XmlElement(name = "Recogidas_seguimientoPorFechaResult", required = true)
    protected ArrayOfRecogidasSeguimientoporfechaout recogidasSeguimientoPorFechaResult;

    /**
     * Obtiene el valor de la propiedad recogidasSeguimientoPorFechaResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecogidasSeguimientoporfechaout }
     *     
     */
    public ArrayOfRecogidasSeguimientoporfechaout getRecogidasSeguimientoPorFechaResult() {
        return recogidasSeguimientoPorFechaResult;
    }

    /**
     * Define el valor de la propiedad recogidasSeguimientoPorFechaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecogidasSeguimientoporfechaout }
     *     
     */
    public void setRecogidasSeguimientoPorFechaResult(ArrayOfRecogidasSeguimientoporfechaout value) {
        this.recogidasSeguimientoPorFechaResult = value;
    }

}
