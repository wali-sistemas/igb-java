
package co.igb.transportws.client.coordinadora.ags;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Recogidas_SeguimientoOut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Recogidas_SeguimientoOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id_recogida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigo_estado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descripcion_estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="referencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="guias" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}ArrayOfString"/>
 *         &lt;element name="causal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigo_causal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recogidas_SeguimientoOut", propOrder = {

})
public class RecogidasSeguimientoOut {

    @XmlElement(name = "id_recogida", required = true)
    protected String idRecogida;
    @XmlElement(name = "codigo_estado")
    protected int codigoEstado;
    @XmlElement(name = "descripcion_estado", required = true)
    protected String descripcionEstado;
    @XmlElement(required = true)
    protected String referencia;
    @XmlElement(required = true)
    protected ArrayOfString guias;
    @XmlElement(required = true)
    protected String causal;
    @XmlElement(name = "codigo_causal")
    protected int codigoCausal;

    /**
     * Obtiene el valor de la propiedad idRecogida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRecogida() {
        return idRecogida;
    }

    /**
     * Define el valor de la propiedad idRecogida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRecogida(String value) {
        this.idRecogida = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoEstado.
     * 
     */
    public int getCodigoEstado() {
        return codigoEstado;
    }

    /**
     * Define el valor de la propiedad codigoEstado.
     * 
     */
    public void setCodigoEstado(int value) {
        this.codigoEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionEstado() {
        return descripcionEstado;
    }

    /**
     * Define el valor de la propiedad descripcionEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionEstado(String value) {
        this.descripcionEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad referencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Define el valor de la propiedad referencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencia(String value) {
        this.referencia = value;
    }

    /**
     * Obtiene el valor de la propiedad guias.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGuias() {
        return guias;
    }

    /**
     * Define el valor de la propiedad guias.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGuias(ArrayOfString value) {
        this.guias = value;
    }

    /**
     * Obtiene el valor de la propiedad causal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCausal() {
        return causal;
    }

    /**
     * Define el valor de la propiedad causal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCausal(String value) {
        this.causal = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCausal.
     * 
     */
    public int getCodigoCausal() {
        return codigoCausal;
    }

    /**
     * Define el valor de la propiedad codigoCausal.
     * 
     */
    public void setCodigoCausal(int value) {
        this.codigoCausal = value;
    }

}
