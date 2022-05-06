
package co.igb.soulws.client.wsClientesBodegas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespSalidasEverfit complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespSalidasEverfit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}RespuestaBaseCliente">
 *       &lt;sequence>
 *         &lt;element name="ConsultaSalidasEverfit" type="{http://tempuri.org/}ArrayOfClsBEWsSalidasEverfit" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespSalidasEverfit", propOrder = {
    "consultaSalidasEverfit"
})
public class RespSalidasEverfit
    extends RespuestaBaseCliente
{

    @XmlElement(name = "ConsultaSalidasEverfit")
    protected ArrayOfClsBEWsSalidasEverfit consultaSalidasEverfit;

    /**
     * Obtiene el valor de la propiedad consultaSalidasEverfit.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsBEWsSalidasEverfit }
     *     
     */
    public ArrayOfClsBEWsSalidasEverfit getConsultaSalidasEverfit() {
        return consultaSalidasEverfit;
    }

    /**
     * Define el valor de la propiedad consultaSalidasEverfit.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsBEWsSalidasEverfit }
     *     
     */
    public void setConsultaSalidasEverfit(ArrayOfClsBEWsSalidasEverfit value) {
        this.consultaSalidasEverfit = value;
    }

}
