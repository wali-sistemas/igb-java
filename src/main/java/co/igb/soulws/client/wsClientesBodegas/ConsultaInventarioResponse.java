
package co.igb.soulws.client.wsClientesBodegas;

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
 *         &lt;element name="ConsultaInventarioResult" type="{http://tempuri.org/}RespConsultaInventario" minOccurs="0"/>
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
    "consultaInventarioResult"
})
@XmlRootElement(name = "ConsultaInventarioResponse")
public class ConsultaInventarioResponse {

    @XmlElement(name = "ConsultaInventarioResult")
    protected RespConsultaInventario consultaInventarioResult;

    /**
     * Obtiene el valor de la propiedad consultaInventarioResult.
     * 
     * @return
     *     possible object is
     *     {@link RespConsultaInventario }
     *     
     */
    public RespConsultaInventario getConsultaInventarioResult() {
        return consultaInventarioResult;
    }

    /**
     * Define el valor de la propiedad consultaInventarioResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RespConsultaInventario }
     *     
     */
    public void setConsultaInventarioResult(RespConsultaInventario value) {
        this.consultaInventarioResult = value;
    }

}
