
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
 *         &lt;element name="Recogidas_seguimientoFCDetalladoPorReferenciaResult" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}ArrayOfRecogida_seguimientoextout"/>
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
    "recogidasSeguimientoFCDetalladoPorReferenciaResult"
})
@XmlRootElement(name = "Recogidas_seguimientoFCDetalladoPorReferenciaResponse")
public class RecogidasSeguimientoFCDetalladoPorReferenciaResponse {

    @XmlElement(name = "Recogidas_seguimientoFCDetalladoPorReferenciaResult", required = true)
    protected ArrayOfRecogidaSeguimientoextout recogidasSeguimientoFCDetalladoPorReferenciaResult;

    /**
     * Obtiene el valor de la propiedad recogidasSeguimientoFCDetalladoPorReferenciaResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecogidaSeguimientoextout }
     *     
     */
    public ArrayOfRecogidaSeguimientoextout getRecogidasSeguimientoFCDetalladoPorReferenciaResult() {
        return recogidasSeguimientoFCDetalladoPorReferenciaResult;
    }

    /**
     * Define el valor de la propiedad recogidasSeguimientoFCDetalladoPorReferenciaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecogidaSeguimientoextout }
     *     
     */
    public void setRecogidasSeguimientoFCDetalladoPorReferenciaResult(ArrayOfRecogidaSeguimientoextout value) {
        this.recogidasSeguimientoFCDetalladoPorReferenciaResult = value;
    }

}
