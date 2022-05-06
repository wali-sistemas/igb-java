
package co.igb.soulws.client.wsClientesBodegas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespCargueInventario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespCargueInventario">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}RespuestaBaseCliente">
 *       &lt;sequence>
 *         &lt;element name="RespuestaCargue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespCargueInventario", propOrder = {
    "respuestaCargue"
})
public class RespCargueInventario
    extends RespuestaBaseCliente
{

    @XmlElement(name = "RespuestaCargue")
    protected String respuestaCargue;

    /**
     * Obtiene el valor de la propiedad respuestaCargue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespuestaCargue() {
        return respuestaCargue;
    }

    /**
     * Define el valor de la propiedad respuestaCargue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespuestaCargue(String value) {
        this.respuestaCargue = value;
    }

}
