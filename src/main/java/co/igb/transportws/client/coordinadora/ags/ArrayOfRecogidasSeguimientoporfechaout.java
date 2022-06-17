
package co.igb.transportws.client.coordinadora.ags;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfRecogidas_seguimientoporfechaout complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRecogidas_seguimientoporfechaout">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}Recogidas_SeguimientoPorFechaOut" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRecogidas_seguimientoporfechaout", propOrder = {
    "item"
})
public class ArrayOfRecogidasSeguimientoporfechaout {

    protected List<RecogidasSeguimientoPorFechaOut> item;

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
     * {@link RecogidasSeguimientoPorFechaOut }
     * 
     * 
     */
    public List<RecogidasSeguimientoPorFechaOut> getItem() {
        if (item == null) {
            item = new ArrayList<RecogidasSeguimientoPorFechaOut>();
        }
        return this.item;
    }

}