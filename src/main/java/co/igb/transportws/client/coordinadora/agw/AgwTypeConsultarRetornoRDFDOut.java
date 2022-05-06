
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_typeConsultarRetornoRDFDOut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_typeConsultarRetornoRDFDOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="remision_retorno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agw_typeConsultarRetornoRDFDOut", propOrder = {

})
public class AgwTypeConsultarRetornoRDFDOut {

    @XmlElement(name = "remision_retorno", required = true)
    protected String remisionRetorno;

    /**
     * Obtiene el valor de la propiedad remisionRetorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemisionRetorno() {
        return remisionRetorno;
    }

    /**
     * Define el valor de la propiedad remisionRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemisionRetorno(String value) {
        this.remisionRetorno = value;
    }

}
