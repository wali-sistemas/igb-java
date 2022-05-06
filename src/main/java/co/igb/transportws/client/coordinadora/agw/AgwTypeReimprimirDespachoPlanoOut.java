
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_typeReimprimirDespachoPlanoOut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_typeReimprimirDespachoPlanoOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="codigo_despacho" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tiquete" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agw_typeReimprimirDespachoPlanoOut", propOrder = {

})
public class AgwTypeReimprimirDespachoPlanoOut {

    @XmlElement(name = "codigo_despacho")
    protected int codigoDespacho;
    @XmlElement(required = true)
    protected String tiquete;

    /**
     * Obtiene el valor de la propiedad codigoDespacho.
     * 
     */
    public int getCodigoDespacho() {
        return codigoDespacho;
    }

    /**
     * Define el valor de la propiedad codigoDespacho.
     * 
     */
    public void setCodigoDespacho(int value) {
        this.codigoDespacho = value;
    }

    /**
     * Obtiene el valor de la propiedad tiquete.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiquete() {
        return tiquete;
    }

    /**
     * Define el valor de la propiedad tiquete.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiquete(String value) {
        this.tiquete = value;
    }

}
