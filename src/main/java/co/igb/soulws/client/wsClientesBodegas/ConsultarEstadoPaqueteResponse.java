
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
 *         &lt;element name="ConsultarEstadoPaqueteResult" type="{http://tempuri.org/}RespConsultarEstadoPaquete" minOccurs="0"/>
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
    "consultarEstadoPaqueteResult"
})
@XmlRootElement(name = "ConsultarEstadoPaqueteResponse")
public class ConsultarEstadoPaqueteResponse {

    @XmlElement(name = "ConsultarEstadoPaqueteResult")
    protected RespConsultarEstadoPaquete consultarEstadoPaqueteResult;

    /**
     * Obtiene el valor de la propiedad consultarEstadoPaqueteResult.
     * 
     * @return
     *     possible object is
     *     {@link RespConsultarEstadoPaquete }
     *     
     */
    public RespConsultarEstadoPaquete getConsultarEstadoPaqueteResult() {
        return consultarEstadoPaqueteResult;
    }

    /**
     * Define el valor de la propiedad consultarEstadoPaqueteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RespConsultarEstadoPaquete }
     *     
     */
    public void setConsultarEstadoPaqueteResult(RespConsultarEstadoPaquete value) {
        this.consultarEstadoPaqueteResult = value;
    }

}
