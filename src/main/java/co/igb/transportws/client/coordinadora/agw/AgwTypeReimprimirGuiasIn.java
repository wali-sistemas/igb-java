
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_typeReimprimirGuiasIn complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_typeReimprimirGuiasIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id_remisiones" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="margen_izquierdo" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="margen_superior" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="formato_impresion" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Agw_typeReimprimirGuiasIn", propOrder = {

})
public class AgwTypeReimprimirGuiasIn {

    @XmlElement(name = "id_remisiones", required = true)
    protected String idRemisiones;
    @XmlElement(name = "margen_izquierdo")
    protected float margenIzquierdo;
    @XmlElement(name = "margen_superior")
    protected float margenSuperior;
    @XmlElement(name = "formato_impresion", required = true)
    protected String formatoImpresion;
    @XmlElement(required = true)
    protected String usuario;
    @XmlElement(required = true)
    protected String clave;

    /**
     * Obtiene el valor de la propiedad idRemisiones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRemisiones() {
        return idRemisiones;
    }

    /**
     * Define el valor de la propiedad idRemisiones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRemisiones(String value) {
        this.idRemisiones = value;
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
     * Obtiene el valor de la propiedad formatoImpresion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatoImpresion() {
        return formatoImpresion;
    }

    /**
     * Define el valor de la propiedad formatoImpresion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatoImpresion(String value) {
        this.formatoImpresion = value;
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
