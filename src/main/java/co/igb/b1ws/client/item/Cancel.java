
package co.igb.b1ws.client.item;

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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sap.com/SBO/DIS}ItemParams" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "itemParams"
})
@XmlRootElement(name = "Cancel", namespace = "ItemsService")
public class Cancel {

    @XmlElement(name = "ItemParams")
    protected ItemParams itemParams;

    /**
     * Obtiene el valor de la propiedad itemParams.
     * 
     * @return
     *     possible object is
     *     {@link ItemParams }
     *     
     */
    public ItemParams getItemParams() {
        return itemParams;
    }

    /**
     * Define el valor de la propiedad itemParams.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemParams }
     *     
     */
    public void setItemParams(ItemParams value) {
        this.itemParams = value;
    }

}
