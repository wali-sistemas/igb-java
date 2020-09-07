
package co.igb.apiSoul.client.wsClientesBodegas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespOrdenSalida complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespOrdenSalida">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}RespuestaBaseCliente">
 *       &lt;sequence>
 *         &lt;element name="ConsecutivoOrden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespOrdenSalida", propOrder = {
    "consecutivoOrden"
})
public class RespOrdenSalida
    extends RespuestaBaseCliente
{

    @XmlElement(name = "ConsecutivoOrden")
    protected String consecutivoOrden;

    /**
     * Obtiene el valor de la propiedad consecutivoOrden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsecutivoOrden() {
        return consecutivoOrden;
    }

    /**
     * Define el valor de la propiedad consecutivoOrden.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsecutivoOrden(String value) {
        this.consecutivoOrden = value;
    }

}
