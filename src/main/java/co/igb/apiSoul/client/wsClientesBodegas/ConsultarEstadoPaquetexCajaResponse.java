
package co.igb.apiSoul.client;

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
 *         &lt;element name="ConsultarEstadoPaquetexCajaResult" type="{http://tempuri.org/}RespConsultarEstadoPaquete" minOccurs="0"/>
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
    "consultarEstadoPaquetexCajaResult"
})
@XmlRootElement(name = "ConsultarEstadoPaquetexCajaResponse")
public class ConsultarEstadoPaquetexCajaResponse {

    @XmlElement(name = "ConsultarEstadoPaquetexCajaResult")
    protected RespConsultarEstadoPaquete consultarEstadoPaquetexCajaResult;

    /**
     * Obtiene el valor de la propiedad consultarEstadoPaquetexCajaResult.
     * 
     * @return
     *     possible object is
     *     {@link RespConsultarEstadoPaquete }
     *     
     */
    public RespConsultarEstadoPaquete getConsultarEstadoPaquetexCajaResult() {
        return consultarEstadoPaquetexCajaResult;
    }

    /**
     * Define el valor de la propiedad consultarEstadoPaquetexCajaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RespConsultarEstadoPaquete }
     *     
     */
    public void setConsultarEstadoPaquetexCajaResult(RespConsultarEstadoPaquete value) {
        this.consultarEstadoPaquetexCajaResult = value;
    }

}
