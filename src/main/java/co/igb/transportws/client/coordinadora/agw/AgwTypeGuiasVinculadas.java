
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_typeGuiasVinculadas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_typeGuiasVinculadas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="guias" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agw_typeGuiasVinculadas", propOrder = {

})
public class AgwTypeGuiasVinculadas {

    @XmlElement(required = true)
    protected String guias;

    /**
     * Obtiene el valor de la propiedad guias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuias() {
        return guias;
    }

    /**
     * Define el valor de la propiedad guias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuias(String value) {
        this.guias = value;
    }

}
