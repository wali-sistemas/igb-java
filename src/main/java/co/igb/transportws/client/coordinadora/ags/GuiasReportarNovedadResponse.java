
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
 *         &lt;element name="Guias_reportarNovedadResult" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}Guias_reportarNovedadOut"/>
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
    "guiasReportarNovedadResult"
})
@XmlRootElement(name = "Guias_reportarNovedadResponse")
public class GuiasReportarNovedadResponse {

    @XmlElement(name = "Guias_reportarNovedadResult", required = true)
    protected GuiasReportarNovedadOut guiasReportarNovedadResult;

    /**
     * Obtiene el valor de la propiedad guiasReportarNovedadResult.
     * 
     * @return
     *     possible object is
     *     {@link GuiasReportarNovedadOut }
     *     
     */
    public GuiasReportarNovedadOut getGuiasReportarNovedadResult() {
        return guiasReportarNovedadResult;
    }

    /**
     * Define el valor de la propiedad guiasReportarNovedadResult.
     * 
     * @param value
     *     allowed object is
     *     {@link GuiasReportarNovedadOut }
     *     
     */
    public void setGuiasReportarNovedadResult(GuiasReportarNovedadOut value) {
        this.guiasReportarNovedadResult = value;
    }

}
