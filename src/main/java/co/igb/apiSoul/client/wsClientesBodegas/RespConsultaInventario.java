
package co.igb.apiSoul.client.wsClientesBodegas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespConsultaInventario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespConsultaInventario">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}RespuestaBaseCliente">
 *       &lt;sequence>
 *         &lt;element name="ConsultasInventario" type="{http://tempuri.org/}ArrayOfClsBEConsultaInventario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespConsultaInventario", propOrder = {
    "consultasInventario"
})
public class RespConsultaInventario
    extends RespuestaBaseCliente
{

    @XmlElement(name = "ConsultasInventario")
    protected ArrayOfClsBEConsultaInventario consultasInventario;

    /**
     * Obtiene el valor de la propiedad consultasInventario.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsBEConsultaInventario }
     *     
     */
    public ArrayOfClsBEConsultaInventario getConsultasInventario() {
        return consultasInventario;
    }

    /**
     * Define el valor de la propiedad consultasInventario.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsBEConsultaInventario }
     *     
     */
    public void setConsultasInventario(ArrayOfClsBEConsultaInventario value) {
        this.consultasInventario = value;
    }

}
