
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_generarDespachoMovilIn complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_generarDespachoMovilIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="accion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="equipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="movil" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recibidor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="guias" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Agw_generarDespachoMovilIn", propOrder = {

})
public class AgwGenerarDespachoMovilIn {

    @XmlElement(required = true)
    protected String accion;
    @XmlElement(required = true)
    protected String equipo;
    @XmlElement(required = true)
    protected String movil;
    @XmlElement(required = true)
    protected String recibidor;
    @XmlElement(required = true)
    protected String guias;
    @XmlElement(required = true)
    protected String usuario;
    @XmlElement(required = true)
    protected String clave;

    /**
     * Obtiene el valor de la propiedad accion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccion() {
        return accion;
    }

    /**
     * Define el valor de la propiedad accion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccion(String value) {
        this.accion = value;
    }

    /**
     * Obtiene el valor de la propiedad equipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipo() {
        return equipo;
    }

    /**
     * Define el valor de la propiedad equipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipo(String value) {
        this.equipo = value;
    }

    /**
     * Obtiene el valor de la propiedad movil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovil() {
        return movil;
    }

    /**
     * Define el valor de la propiedad movil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovil(String value) {
        this.movil = value;
    }

    /**
     * Obtiene el valor de la propiedad recibidor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecibidor() {
        return recibidor;
    }

    /**
     * Define el valor de la propiedad recibidor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecibidor(String value) {
        this.recibidor = value;
    }

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
