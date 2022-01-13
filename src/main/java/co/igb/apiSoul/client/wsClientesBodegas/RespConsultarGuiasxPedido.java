
package co.igb.apiSoul.client.wsClientesBodegas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespConsultarGuiasxPedido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespConsultarGuiasxPedido">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}RespuestaBaseCliente">
 *       &lt;sequence>
 *         &lt;element name="PaquetesxPedido" type="{http://tempuri.org/}ArrayOfClsBEGuiasxPedido" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespConsultarGuiasxPedido", propOrder = {
    "paquetesxPedido"
})
public class RespConsultarGuiasxPedido
    extends RespuestaBaseCliente
{

    @XmlElement(name = "PaquetesxPedido")
    protected ArrayOfClsBEGuiasxPedido paquetesxPedido;

    /**
     * Obtiene el valor de la propiedad paquetesxPedido.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsBEGuiasxPedido }
     *     
     */
    public ArrayOfClsBEGuiasxPedido getPaquetesxPedido() {
        return paquetesxPedido;
    }

    /**
     * Define el valor de la propiedad paquetesxPedido.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsBEGuiasxPedido }
     *     
     */
    public void setPaquetesxPedido(ArrayOfClsBEGuiasxPedido value) {
        this.paquetesxPedido = value;
    }

}
