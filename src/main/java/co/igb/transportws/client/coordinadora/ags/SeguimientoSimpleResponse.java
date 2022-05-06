
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
 *         &lt;element name="Seguimiento_simpleResult" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}Seguimiento_simpleOut"/>
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
    "seguimientoSimpleResult"
})
@XmlRootElement(name = "Seguimiento_simpleResponse")
public class SeguimientoSimpleResponse {

    @XmlElement(name = "Seguimiento_simpleResult", required = true)
    protected SeguimientoSimpleOut seguimientoSimpleResult;

    /**
     * Obtiene el valor de la propiedad seguimientoSimpleResult.
     * 
     * @return
     *     possible object is
     *     {@link SeguimientoSimpleOut }
     *     
     */
    public SeguimientoSimpleOut getSeguimientoSimpleResult() {
        return seguimientoSimpleResult;
    }

    /**
     * Define el valor de la propiedad seguimientoSimpleResult.
     * 
     * @param value
     *     allowed object is
     *     {@link SeguimientoSimpleOut }
     *     
     */
    public void setSeguimientoSimpleResult(SeguimientoSimpleOut value) {
        this.seguimientoSimpleResult = value;
    }

}
