
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
 *         &lt;element ref="{http://www.sap.com/SBO/DIS}StockTransferParams" minOccurs="0"/>
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
    "stockTransferParams"
})
@XmlRootElement(name = "Remove", namespace = "StockTransferService")
public class Remove {

    @XmlElement(name = "StockTransferParams")
    protected StockTransferParams stockTransferParams;

    /**
     * Obtiene el valor de la propiedad stockTransferParams.
     * 
     * @return
     *     possible object is
     *     {@link StockTransferParams }
     *     
     */
    public StockTransferParams getStockTransferParams() {
        return stockTransferParams;
    }

    /**
     * Define el valor de la propiedad stockTransferParams.
     * 
     * @param value
     *     allowed object is
     *     {@link StockTransferParams }
     *     
     */
    public void setStockTransferParams(StockTransferParams value) {
        this.stockTransferParams = value;
    }

}
