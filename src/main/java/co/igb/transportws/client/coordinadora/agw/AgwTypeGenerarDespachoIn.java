
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_typeGenerarDespachoIn complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_typeGenerarDespachoIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="guias" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="margen_izquierdo" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="margen_superior" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="tipo_impresion" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Agw_typeGenerarDespachoIn", propOrder = {

})
public class AgwTypeGenerarDespachoIn {

    @XmlElement(required = true)
    protected String guias;
    @XmlElement(name = "margen_izquierdo")
    protected float margenIzquierdo;
    @XmlElement(name = "margen_superior")
    protected float margenSuperior;
    @XmlElement(name = "tipo_impresion", required = true)
    protected String tipoImpresion;
    @XmlElement(required = true)
    protected String usuario;
    @XmlElement(required = true)
    protected String clave;

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
     * Obtiene el valor de la propiedad tipoImpresion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoImpresion() {
        return tipoImpresion;
    }

    /**
     * Define el valor de la propiedad tipoImpresion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoImpresion(String value) {
        this.tipoImpresion = value;
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
