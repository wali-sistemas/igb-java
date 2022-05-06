
package co.igb.soulws.client.wsClientesBodegas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespConsultaConteo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespConsultaConteo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}RespuestaBaseCliente">
 *       &lt;sequence>
 *         &lt;element name="ConsultasInventario" type="{http://tempuri.org/}ArrayOfClsBEConsultaInventarioConteo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespConsultaConteo", propOrder = {
    "consultasInventario"
})
public class RespConsultaConteo
    extends RespuestaBaseCliente
{

    @XmlElement(name = "ConsultasInventario")
    protected ArrayOfClsBEConsultaInventarioConteo consultasInventario;

    /**
     * Obtiene el valor de la propiedad consultasInventario.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsBEConsultaInventarioConteo }
     *     
     */
    public ArrayOfClsBEConsultaInventarioConteo getConsultasInventario() {
        return consultasInventario;
    }

    /**
     * Define el valor de la propiedad consultasInventario.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsBEConsultaInventarioConteo }
     *     
     */
    public void setConsultasInventario(ArrayOfClsBEConsultaInventarioConteo value) {
        this.consultasInventario = value;
    }

}
