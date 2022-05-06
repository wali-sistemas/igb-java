
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
 *         &lt;element name="Seguimiento_detalladoResult" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}Seguimiento_detalladoOut"/>
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
    "seguimientoDetalladoResult"
})
@XmlRootElement(name = "Seguimiento_detalladoResponse")
public class SeguimientoDetalladoResponse {

    @XmlElement(name = "Seguimiento_detalladoResult", required = true)
    protected SeguimientoDetalladoOut seguimientoDetalladoResult;

    /**
     * Obtiene el valor de la propiedad seguimientoDetalladoResult.
     * 
     * @return
     *     possible object is
     *     {@link SeguimientoDetalladoOut }
     *     
     */
    public SeguimientoDetalladoOut getSeguimientoDetalladoResult() {
        return seguimientoDetalladoResult;
    }

    /**
     * Define el valor de la propiedad seguimientoDetalladoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link SeguimientoDetalladoOut }
     *     
     */
    public void setSeguimientoDetalladoResult(SeguimientoDetalladoOut value) {
        this.seguimientoDetalladoResult = value;
    }

}
