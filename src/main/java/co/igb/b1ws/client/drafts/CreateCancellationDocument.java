
package co.igb.b1ws.client.drafts;

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
 *         &lt;element ref="{http://www.sap.com/SBO/DIS}DocumentParams" minOccurs="0"/>
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
    "documentParams"
})
@XmlRootElement(name = "CreateCancellationDocument", namespace = "DraftsService")
public class CreateCancellationDocument {

    @XmlElement(name = "DocumentParams")
    protected DocumentParams documentParams;

    /**
     * Obtiene el valor de la propiedad documentParams.
     * 
     * @return
     *     possible object is
     *     {@link DocumentParams }
     *     
     */
    public DocumentParams getDocumentParams() {
        return documentParams;
    }

    /**
     * Define el valor de la propiedad documentParams.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentParams }
     *     
     */
    public void setDocumentParams(DocumentParams value) {
        this.documentParams = value;
    }

}
