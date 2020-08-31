
package co.igb.apiSoul.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfClsBEPaquetexSalida complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClsBEPaquetexSalida">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clsBEPaquetexSalida" type="{http://tempuri.org/}clsBEPaquetexSalida" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClsBEPaquetexSalida", propOrder = {
    "clsBEPaquetexSalida"
})
public class ArrayOfClsBEPaquetexSalida {

    @XmlElement(nillable = true)
    protected List<ClsBEPaquetexSalida> clsBEPaquetexSalida;

    /**
     * Gets the value of the clsBEPaquetexSalida property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clsBEPaquetexSalida property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClsBEPaquetexSalida().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClsBEPaquetexSalida }
     * 
     * 
     */
    public List<ClsBEPaquetexSalida> getClsBEPaquetexSalida() {
        if (clsBEPaquetexSalida == null) {
            clsBEPaquetexSalida = new ArrayList<ClsBEPaquetexSalida>();
        }
        return this.clsBEPaquetexSalida;
    }

}
