
package co.igb.apiSoul.client.wsClientesBodegas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfClsBEWsReporteConteo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClsBEWsReporteConteo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReporteConteo" type="{http://tempuri.org/}clsBEWsReporteConteo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClsBEWsReporteConteo", propOrder = {
    "reporteConteo"
})
public class ArrayOfClsBEWsReporteConteo {

    @XmlElement(name = "ReporteConteo", nillable = true)
    protected List<ClsBEWsReporteConteo> reporteConteo;

    /**
     * Gets the value of the reporteConteo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reporteConteo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReporteConteo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClsBEWsReporteConteo }
     * 
     * 
     */
    public List<ClsBEWsReporteConteo> getReporteConteo() {
        if (reporteConteo == null) {
            reporteConteo = new ArrayList<ClsBEWsReporteConteo>();
        }
        return this.reporteConteo;
    }

}
