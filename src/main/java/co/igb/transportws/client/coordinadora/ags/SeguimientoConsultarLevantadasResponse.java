
package co.igb.transportws.client.coordinadora.ags;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Seguimiento_consultarLevantadasResult" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}Consultar_levantadasOut"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "seguimientoConsultarLevantadasResult"
})
@XmlRootElement(name = "Seguimiento_consultarLevantadasResponse")
public class SeguimientoConsultarLevantadasResponse {

    @XmlElement(name = "Seguimiento_consultarLevantadasResult", required = true)
    protected ConsultarLevantadasOut seguimientoConsultarLevantadasResult;

    /**
     * Obtiene el valor de la propiedad seguimientoConsultarLevantadasResult.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarLevantadasOut }
     *     
     */
    public ConsultarLevantadasOut getSeguimientoConsultarLevantadasResult() {
        return seguimientoConsultarLevantadasResult;
    }

    /**
     * Define el valor de la propiedad seguimientoConsultarLevantadasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarLevantadasOut }
     *     
     */
    public void setSeguimientoConsultarLevantadasResult(ConsultarLevantadasOut value) {
        this.seguimientoConsultarLevantadasResult = value;
    }

}
