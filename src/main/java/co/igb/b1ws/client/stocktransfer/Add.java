
package co.igb.b1ws.client.stocktransfer;

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
 *         &lt;element ref="{http://www.sap.com/SBO/DIS}StockTransfer" minOccurs="0"/>
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
    "stockTransfer"
})
@XmlRootElement(name = "Add", namespace = "StockTransferService")
public class Add {

    @XmlElement(name = "StockTransfer")
    protected StockTransfer stockTransfer;

    /**
     * Obtiene el valor de la propiedad stockTransfer.
     * 
     * @return
     *     possible object is
     *     {@link StockTransfer }
     *     
     */
    public StockTransfer getStockTransfer() {
        return stockTransfer;
    }

    /**
     * Define el valor de la propiedad stockTransfer.
     * 
     * @param value
     *     allowed object is
     *     {@link StockTransfer }
     *     
     */
    public void setStockTransfer(StockTransfer value) {
        this.stockTransfer = value;
    }

}
