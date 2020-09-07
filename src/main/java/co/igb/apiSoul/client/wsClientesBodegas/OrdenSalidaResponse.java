
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
 *         &lt;element name="OrdenSalidaResult" type="{http://tempuri.org/}RespOrdenSalida" minOccurs="0"/>
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
    "ordenSalidaResult"
})
@XmlRootElement(name = "OrdenSalidaResponse")
public class OrdenSalidaResponse {

    @XmlElement(name = "OrdenSalidaResult")
    protected RespOrdenSalida ordenSalidaResult;

    /**
     * Obtiene el valor de la propiedad ordenSalidaResult.
     * 
     * @return
     *     possible object is
     *     {@link RespOrdenSalida }
     *     
     */
    public RespOrdenSalida getOrdenSalidaResult() {
        return ordenSalidaResult;
    }

    /**
     * Define el valor de la propiedad ordenSalidaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RespOrdenSalida }
     *     
     */
    public void setOrdenSalidaResult(RespOrdenSalida value) {
        this.ordenSalidaResult = value;
    }

}
