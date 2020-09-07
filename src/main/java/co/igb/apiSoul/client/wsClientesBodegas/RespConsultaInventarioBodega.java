
package co.igb.apiSoul.client.wsClientesBodegas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespConsultaInventarioBodega complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespConsultaInventarioBodega">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}RespuestaBaseCliente">
 *       &lt;sequence>
 *         &lt;element name="ConsultasInventario" type="{http://tempuri.org/}ArrayOfClsBEConsultaInventarioBodega" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespConsultaInventarioBodega", propOrder = {
    "consultasInventario"
})
public class RespConsultaInventarioBodega
    extends RespuestaBaseCliente
{

    @XmlElement(name = "ConsultasInventario")
    protected ArrayOfClsBEConsultaInventarioBodega consultasInventario;

    /**
     * Obtiene el valor de la propiedad consultasInventario.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsBEConsultaInventarioBodega }
     *     
     */
    public ArrayOfClsBEConsultaInventarioBodega getConsultasInventario() {
        return consultasInventario;
    }

    /**
     * Define el valor de la propiedad consultasInventario.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsBEConsultaInventarioBodega }
     *     
     */
    public void setConsultasInventario(ArrayOfClsBEConsultaInventarioBodega value) {
        this.consultasInventario = value;
    }

}
