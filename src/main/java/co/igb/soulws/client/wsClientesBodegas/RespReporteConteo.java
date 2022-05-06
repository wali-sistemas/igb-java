
package co.igb.soulws.client.wsClientesBodegas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespReporteConteo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespReporteConteo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}RespuestaBaseCliente">
 *       &lt;sequence>
 *         &lt;element name="ReporteConteo" type="{http://tempuri.org/}ArrayOfClsBEWsReporteConteo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespReporteConteo", propOrder = {
    "reporteConteo"
})
public class RespReporteConteo
    extends RespuestaBaseCliente
{

    @XmlElement(name = "ReporteConteo")
    protected ArrayOfClsBEWsReporteConteo reporteConteo;

    /**
     * Obtiene el valor de la propiedad reporteConteo.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsBEWsReporteConteo }
     *     
     */
    public ArrayOfClsBEWsReporteConteo getReporteConteo() {
        return reporteConteo;
    }

    /**
     * Define el valor de la propiedad reporteConteo.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsBEWsReporteConteo }
     *     
     */
    public void setReporteConteo(ArrayOfClsBEWsReporteConteo value) {
        this.reporteConteo = value;
    }

}
