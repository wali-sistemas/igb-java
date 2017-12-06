
package co.igb.b1ws.client.purchasedeliverynote;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "DocumentParams")
public class DocumentParams {

    @XmlElement(name = "DocEntry")
    protected Long docEntry;

    /**
     * Obtiene el valor de la propiedad docEntry.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDocEntry() {
        return docEntry;
    }

    /**
     * Define el valor de la propiedad docEntry.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDocEntry(Long value) {
        this.docEntry = value;
    }

}
