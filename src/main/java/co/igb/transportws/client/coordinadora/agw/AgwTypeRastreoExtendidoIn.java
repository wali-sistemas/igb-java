
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_typeRastreoExtendidoIn complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_typeRastreoExtendidoIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="codigos_remision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agw_typeRastreoExtendidoIn", propOrder = {

})
public class AgwTypeRastreoExtendidoIn {

    @XmlElement(name = "codigos_remision", required = true)
    protected String codigosRemision;
    @XmlElement(required = true)
    protected String usuario;
    @XmlElement(required = true)
    protected String clave;

    /**
     * Obtiene el valor de la propiedad codigosRemision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigosRemision() {
        return codigosRemision;
    }

    /**
     * Define el valor de la propiedad codigosRemision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigosRemision(String value) {
        this.codigosRemision = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad clave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * Define el valor de la propiedad clave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
    }

}
