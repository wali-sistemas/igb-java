
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_imprimirRotulosIn complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_imprimirRotulosIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id_rotulo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigos_remisiones" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Agw_imprimirRotulosIn", propOrder = {

})
public class AgwImprimirRotulosIn {

    @XmlElement(name = "id_rotulo", required = true)
    protected String idRotulo;
    @XmlElement(name = "codigos_remisiones", required = true)
    protected String codigosRemisiones;
    @XmlElement(required = true)
    protected String usuario;
    @XmlElement(required = true)
    protected String clave;

    /**
     * Obtiene el valor de la propiedad idRotulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRotulo() {
        return idRotulo;
    }

    /**
     * Define el valor de la propiedad idRotulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRotulo(String value) {
        this.idRotulo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigosRemisiones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigosRemisiones() {
        return codigosRemisiones;
    }

    /**
     * Define el valor de la propiedad codigosRemisiones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigosRemisiones(String value) {
        this.codigosRemisiones = value;
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
