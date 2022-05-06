
package co.igb.transportws.client.coordinadora.ags;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfSeguimiento_guiaviculadaout complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSeguimiento_guiaviculadaout">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}Seguimiento_guiaViculadaOut" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSeguimiento_guiaviculadaout", propOrder = {
    "item"
})
public class ArrayOfSeguimientoGuiaviculadaout {

    protected List<SeguimientoGuiaViculadaOut> item;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeguimientoGuiaViculadaOut }
     * 
     * 
     */
    public List<SeguimientoGuiaViculadaOut> getItem() {
        if (item == null) {
            item = new ArrayList<SeguimientoGuiaViculadaOut>();
        }
        return this.item;
    }

}
