
package co.igb.soulws.client.wsClientesBodegas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfClsBEProductosxPaquete complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClsBEProductosxPaquete">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clsBEProductosxPaquete" type="{http://tempuri.org/}clsBEProductosxPaquete" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClsBEProductosxPaquete", propOrder = {
    "clsBEProductosxPaquete"
})
public class ArrayOfClsBEProductosxPaquete {

    @XmlElement(nillable = true)
    protected List<ClsBEProductosxPaquete> clsBEProductosxPaquete;

    /**
     * Gets the value of the clsBEProductosxPaquete property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clsBEProductosxPaquete property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClsBEProductosxPaquete().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClsBEProductosxPaquete }
     * 
     * 
     */
    public List<ClsBEProductosxPaquete> getClsBEProductosxPaquete() {
        if (clsBEProductosxPaquete == null) {
            clsBEProductosxPaquete = new ArrayList<ClsBEProductosxPaquete>();
        }
        return this.clsBEProductosxPaquete;
    }

}
