
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
 *         &lt;element name="ConsultaInventarioBodegaResult" type="{http://tempuri.org/}RespConsultaInventarioBodega" minOccurs="0"/>
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
    "consultaInventarioBodegaResult"
})
@XmlRootElement(name = "ConsultaInventarioBodegaResponse")
public class ConsultaInventarioBodegaResponse {

    @XmlElement(name = "ConsultaInventarioBodegaResult")
    protected RespConsultaInventarioBodega consultaInventarioBodegaResult;

    /**
     * Obtiene el valor de la propiedad consultaInventarioBodegaResult.
     * 
     * @return
     *     possible object is
     *     {@link RespConsultaInventarioBodega }
     *     
     */
    public RespConsultaInventarioBodega getConsultaInventarioBodegaResult() {
        return consultaInventarioBodegaResult;
    }

    /**
     * Define el valor de la propiedad consultaInventarioBodegaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RespConsultaInventarioBodega }
     *     
     */
    public void setConsultaInventarioBodegaResult(RespConsultaInventarioBodega value) {
        this.consultaInventarioBodegaResult = value;
    }

}
