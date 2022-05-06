
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_typeconsultarDespachosOut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_typeconsultarDespachosOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="despachos" type="{https://sandbox.coordinadora.com/agw/ws/guias/1.6/server.php}ArrayOfAgw_typeDespacho"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agw_typeconsultarDespachosOut", propOrder = {

})
public class AgwTypeconsultarDespachosOut {

    @XmlElement(required = true)
    protected ArrayOfAgwTypeDespacho despachos;

    /**
     * Obtiene el valor de la propiedad despachos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAgwTypeDespacho }
     *     
     */
    public ArrayOfAgwTypeDespacho getDespachos() {
        return despachos;
    }

    /**
     * Define el valor de la propiedad despachos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAgwTypeDespacho }
     *     
     */
    public void setDespachos(ArrayOfAgwTypeDespacho value) {
        this.despachos = value;
    }

}
