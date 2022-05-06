
package co.igb.soulws.client.wsClientesBodegas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfClsBEGuiasxPedido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClsBEGuiasxPedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clsBEGuiasxPedido" type="{http://tempuri.org/}clsBEGuiasxPedido" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClsBEGuiasxPedido", propOrder = {
    "clsBEGuiasxPedido"
})
public class ArrayOfClsBEGuiasxPedido {

    @XmlElement(nillable = true)
    protected List<ClsBEGuiasxPedido> clsBEGuiasxPedido;

    /**
     * Gets the value of the clsBEGuiasxPedido property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clsBEGuiasxPedido property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClsBEGuiasxPedido().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClsBEGuiasxPedido }
     * 
     * 
     */
    public List<ClsBEGuiasxPedido> getClsBEGuiasxPedido() {
        if (clsBEGuiasxPedido == null) {
            clsBEGuiasxPedido = new ArrayList<ClsBEGuiasxPedido>();
        }
        return this.clsBEGuiasxPedido;
    }

}
