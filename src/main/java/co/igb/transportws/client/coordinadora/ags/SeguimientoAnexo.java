
package co.igb.transportws.client.coordinadora.ags;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Seguimiento_anexo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Seguimiento_anexo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="anexo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Seguimiento_anexo", propOrder = {

})
public class SeguimientoAnexo {

    @XmlElement(required = true)
    protected String anexo;

    /**
     * Obtiene el valor de la propiedad anexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnexo() {
        return anexo;
    }

    /**
     * Define el valor de la propiedad anexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnexo(String value) {
        this.anexo = value;
    }

}
