
package co.igb.soulws.client.wsClientesBodegas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfClsBEConsultaInventarioConteo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClsBEConsultaInventarioConteo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConsultaInventario" type="{http://tempuri.org/}clsBEConsultaInventarioConteo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClsBEConsultaInventarioConteo", propOrder = {
    "consultaInventario"
})
public class ArrayOfClsBEConsultaInventarioConteo {

    @XmlElement(name = "ConsultaInventario", nillable = true)
    protected List<ClsBEConsultaInventarioConteo> consultaInventario;

    /**
     * Gets the value of the consultaInventario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consultaInventario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsultaInventario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClsBEConsultaInventarioConteo }
     * 
     * 
     */
    public List<ClsBEConsultaInventarioConteo> getConsultaInventario() {
        if (consultaInventario == null) {
            consultaInventario = new ArrayList<ClsBEConsultaInventarioConteo>();
        }
        return this.consultaInventario;
    }

}
