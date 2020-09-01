
package co.igb.apiSoul.client.wsClientesBodegas;

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
 *         &lt;element name="ConsultarOrdenesSalidaEverfitResult" type="{http://tempuri.org/}RespSalidasEverfit" minOccurs="0"/>
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
    "consultarOrdenesSalidaEverfitResult"
})
@XmlRootElement(name = "ConsultarOrdenesSalidaEverfitResponse")
public class ConsultarOrdenesSalidaEverfitResponse {

    @XmlElement(name = "ConsultarOrdenesSalidaEverfitResult")
    protected RespSalidasEverfit consultarOrdenesSalidaEverfitResult;

    /**
     * Obtiene el valor de la propiedad consultarOrdenesSalidaEverfitResult.
     * 
     * @return
     *     possible object is
     *     {@link RespSalidasEverfit }
     *     
     */
    public RespSalidasEverfit getConsultarOrdenesSalidaEverfitResult() {
        return consultarOrdenesSalidaEverfitResult;
    }

    /**
     * Define el valor de la propiedad consultarOrdenesSalidaEverfitResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RespSalidasEverfit }
     *     
     */
    public void setConsultarOrdenesSalidaEverfitResult(RespSalidasEverfit value) {
        this.consultarOrdenesSalidaEverfitResult = value;
    }

}
