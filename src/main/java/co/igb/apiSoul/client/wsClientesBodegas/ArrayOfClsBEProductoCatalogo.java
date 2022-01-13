
package co.igb.apiSoul.client.wsClientesBodegas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfClsBEProductoCatalogo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClsBEProductoCatalogo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clsBEProductoCatalogo" type="{http://tempuri.org/}clsBEProductoCatalogo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClsBEProductoCatalogo", propOrder = {
    "clsBEProductoCatalogo"
})
public class ArrayOfClsBEProductoCatalogo {

    @XmlElement(nillable = true)
    protected List<ClsBEProductoCatalogo> clsBEProductoCatalogo;

    /**
     * Gets the value of the clsBEProductoCatalogo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clsBEProductoCatalogo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClsBEProductoCatalogo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClsBEProductoCatalogo }
     * 
     * 
     */
    public List<ClsBEProductoCatalogo> getClsBEProductoCatalogo() {
        if (clsBEProductoCatalogo == null) {
            clsBEProductoCatalogo = new ArrayList<ClsBEProductoCatalogo>();
        }
        return this.clsBEProductoCatalogo;
    }

}
