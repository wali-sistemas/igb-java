
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_typeNovedadReetiquetadoIn complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_typeNovedadReetiquetadoIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="unidad_entrada" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unidad_salida" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Agw_typeNovedadReetiquetadoIn", propOrder = {

})
public class AgwTypeNovedadReetiquetadoIn {

    @XmlElement(name = "unidad_entrada", required = true)
    protected String unidadEntrada;
    @XmlElement(name = "unidad_salida", required = true)
    protected String unidadSalida;
    @XmlElement(required = true)
    protected String usuario;
    @XmlElement(required = true)
    protected String clave;

    /**
     * Obtiene el valor de la propiedad unidadEntrada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadEntrada() {
        return unidadEntrada;
    }

    /**
     * Define el valor de la propiedad unidadEntrada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadEntrada(String value) {
        this.unidadEntrada = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadSalida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadSalida() {
        return unidadSalida;
    }

    /**
     * Define el valor de la propiedad unidadSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadSalida(String value) {
        this.unidadSalida = value;
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
