
package co.igb.soulws.client.wsClientesBodegas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespConsultarPaquetesxPedido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespConsultarPaquetesxPedido">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}RespuestaBaseCliente">
 *       &lt;sequence>
 *         &lt;element name="PaquetesxPedido" type="{http://tempuri.org/}ArrayOfClsBEWsPaquetesxPedido" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespConsultarPaquetesxPedido", propOrder = {
    "paquetesxPedido"
})
public class RespConsultarPaquetesxPedido
    extends RespuestaBaseCliente
{

    @XmlElement(name = "PaquetesxPedido")
    protected ArrayOfClsBEWsPaquetesxPedido paquetesxPedido;

    /**
     * Obtiene el valor de la propiedad paquetesxPedido.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsBEWsPaquetesxPedido }
     *     
     */
    public ArrayOfClsBEWsPaquetesxPedido getPaquetesxPedido() {
        return paquetesxPedido;
    }

    /**
     * Define el valor de la propiedad paquetesxPedido.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsBEWsPaquetesxPedido }
     *     
     */
    public void setPaquetesxPedido(ArrayOfClsBEWsPaquetesxPedido value) {
        this.paquetesxPedido = value;
    }

}
