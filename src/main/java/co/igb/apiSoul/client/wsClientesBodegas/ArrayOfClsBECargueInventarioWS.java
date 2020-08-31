
package co.igb.apiSoul.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfClsBECargueInventarioWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClsBECargueInventarioWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clsBECargueInventarioWS" type="{http://tempuri.org/}clsBECargueInventarioWS" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClsBECargueInventarioWS", propOrder = {
    "clsBECargueInventarioWS"
})
public class ArrayOfClsBECargueInventarioWS {

    @XmlElement(nillable = true)
    protected List<ClsBECargueInventarioWS> clsBECargueInventarioWS;

    /**
     * Gets the value of the clsBECargueInventarioWS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clsBECargueInventarioWS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClsBECargueInventarioWS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClsBECargueInventarioWS }
     * 
     * 
     */
    public List<ClsBECargueInventarioWS> getClsBECargueInventarioWS() {
        if (clsBECargueInventarioWS == null) {
            clsBECargueInventarioWS = new ArrayList<ClsBECargueInventarioWS>();
        }
        return this.clsBECargueInventarioWS;
    }

}
