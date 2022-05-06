
package co.igb.soulws.client.wsClientesBodegas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfClsBEWsSalidasEverfit complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClsBEWsSalidasEverfit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConsultaSalidasEverfit" type="{http://tempuri.org/}clsBEWsSalidasEverfit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClsBEWsSalidasEverfit", propOrder = {
    "consultaSalidasEverfit"
})
public class ArrayOfClsBEWsSalidasEverfit {

    @XmlElement(name = "ConsultaSalidasEverfit", nillable = true)
    protected List<ClsBEWsSalidasEverfit> consultaSalidasEverfit;

    /**
     * Gets the value of the consultaSalidasEverfit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consultaSalidasEverfit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsultaSalidasEverfit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClsBEWsSalidasEverfit }
     * 
     * 
     */
    public List<ClsBEWsSalidasEverfit> getConsultaSalidasEverfit() {
        if (consultaSalidasEverfit == null) {
            consultaSalidasEverfit = new ArrayList<ClsBEWsSalidasEverfit>();
        }
        return this.consultaSalidasEverfit;
    }

}
