
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
 *         &lt;element name="ConsultarPaquetesxPedidoResult" type="{http://tempuri.org/}RespConsultarPaquetesxPedido" minOccurs="0"/>
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
    "consultarPaquetesxPedidoResult"
})
@XmlRootElement(name = "ConsultarPaquetesxPedidoResponse")
public class ConsultarPaquetesxPedidoResponse {

    @XmlElement(name = "ConsultarPaquetesxPedidoResult")
    protected RespConsultarPaquetesxPedido consultarPaquetesxPedidoResult;

    /**
     * Obtiene el valor de la propiedad consultarPaquetesxPedidoResult.
     * 
     * @return
     *     possible object is
     *     {@link RespConsultarPaquetesxPedido }
     *     
     */
    public RespConsultarPaquetesxPedido getConsultarPaquetesxPedidoResult() {
        return consultarPaquetesxPedidoResult;
    }

    /**
     * Define el valor de la propiedad consultarPaquetesxPedidoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RespConsultarPaquetesxPedido }
     *     
     */
    public void setConsultarPaquetesxPedidoResult(RespConsultarPaquetesxPedido value) {
        this.consultarPaquetesxPedidoResult = value;
    }

}
