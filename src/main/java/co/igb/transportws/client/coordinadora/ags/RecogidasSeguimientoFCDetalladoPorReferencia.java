
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
 *         &lt;element name="p" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}Recogidas_SeguimientoReferenciaIn"/>
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
    "p"
})
@XmlRootElement(name = "Recogidas_seguimientoFCDetalladoPorReferencia")
public class RecogidasSeguimientoFCDetalladoPorReferencia {

    @XmlElement(required = true)
    protected RecogidasSeguimientoReferenciaIn p;

    /**
     * Obtiene el valor de la propiedad p.
     * 
     * @return
     *     possible object is
     *     {@link RecogidasSeguimientoReferenciaIn }
     *     
     */
    public RecogidasSeguimientoReferenciaIn getP() {
        return p;
    }

    /**
     * Define el valor de la propiedad p.
     * 
     * @param value
     *     allowed object is
     *     {@link RecogidasSeguimientoReferenciaIn }
     *     
     */
    public void setP(RecogidasSeguimientoReferenciaIn value) {
        this.p = value;
    }

}
