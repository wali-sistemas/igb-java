
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_typeReimprimirDespachoIn complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_typeReimprimirDespachoIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="codigo_despacho" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="margen_izquierdo" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="margen_superior" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
@XmlType(name = "Agw_typeReimprimirDespachoIn", propOrder = {

})
public class AgwTypeReimprimirDespachoIn {

    @XmlElement(name = "codigo_despacho", required = true)
    protected String codigoDespacho;
    @XmlElement(name = "margen_izquierdo")
    protected float margenIzquierdo;
    @XmlElement(name = "margen_superior")
    protected float margenSuperior;
    @XmlElement(required = true)
    protected String usuario;
    @XmlElement(required = true)
    protected String clave;

    /**
     * Obtiene el valor de la propiedad codigoDespacho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDespacho() {
        return codigoDespacho;
    }

    /**
     * Define el valor de la propiedad codigoDespacho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDespacho(String value) {
        this.codigoDespacho = value;
    }

    /**
     * Obtiene el valor de la propiedad margenIzquierdo.
     * 
     */
    public float getMargenIzquierdo() {
        return margenIzquierdo;
    }

    /**
     * Define el valor de la propiedad margenIzquierdo.
     * 
     */
    public void setMargenIzquierdo(float value) {
        this.margenIzquierdo = value;
    }

    /**
     * Obtiene el valor de la propiedad margenSuperior.
     * 
     */
    public float getMargenSuperior() {
        return margenSuperior;
    }

    /**
     * Define el valor de la propiedad margenSuperior.
     * 
     */
    public void setMargenSuperior(float value) {
        this.margenSuperior = value;
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
