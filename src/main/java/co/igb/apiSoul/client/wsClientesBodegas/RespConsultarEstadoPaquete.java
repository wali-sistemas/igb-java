
package co.igb.apiSoul.client.wsClientesBodegas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespConsultarEstadoPaquete complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespConsultarEstadoPaquete">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}RespuestaBaseCliente">
 *       &lt;sequence>
 *         &lt;element name="PaquetesxSalida" type="{http://tempuri.org/}ArrayOfClsBEPaquetexSalida" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespConsultarEstadoPaquete", propOrder = {
    "paquetesxSalida"
})
public class RespConsultarEstadoPaquete
    extends RespuestaBaseCliente
{

    @XmlElement(name = "PaquetesxSalida")
    protected ArrayOfClsBEPaquetexSalida paquetesxSalida;

    /**
     * Obtiene el valor de la propiedad paquetesxSalida.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsBEPaquetexSalida }
     *     
     */
    public ArrayOfClsBEPaquetexSalida getPaquetesxSalida() {
        return paquetesxSalida;
    }

    /**
     * Define el valor de la propiedad paquetesxSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsBEPaquetexSalida }
     *     
     */
    public void setPaquetesxSalida(ArrayOfClsBEPaquetexSalida value) {
        this.paquetesxSalida = value;
    }

}
