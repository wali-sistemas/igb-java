
package co.igb.transportws.client.coordinadora.ags;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Cotizador_detalleEmpaques complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Cotizador_detalleEmpaques">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ubl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ancho" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="largo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unidades" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cotizador_detalleEmpaques", propOrder = {

})
public class CotizadorDetalleEmpaques {

    @XmlElement(required = true)
    protected String ubl;
    @XmlElement(required = true)
    protected String alto;
    @XmlElement(required = true)
    protected String ancho;
    @XmlElement(required = true)
    protected String largo;
    @XmlElement(required = true)
    protected String peso;
    @XmlElement(required = true)
    protected String unidades;

    /**
     * Obtiene el valor de la propiedad ubl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUbl() {
        return ubl;
    }

    /**
     * Define el valor de la propiedad ubl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUbl(String value) {
        this.ubl = value;
    }

    /**
     * Obtiene el valor de la propiedad alto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlto() {
        return alto;
    }

    /**
     * Define el valor de la propiedad alto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlto(String value) {
        this.alto = value;
    }

    /**
     * Obtiene el valor de la propiedad ancho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncho() {
        return ancho;
    }

    /**
     * Define el valor de la propiedad ancho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncho(String value) {
        this.ancho = value;
    }

    /**
     * Obtiene el valor de la propiedad largo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLargo() {
        return largo;
    }

    /**
     * Define el valor de la propiedad largo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLargo(String value) {
        this.largo = value;
    }

    /**
     * Obtiene el valor de la propiedad peso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeso() {
        return peso;
    }

    /**
     * Define el valor de la propiedad peso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeso(String value) {
        this.peso = value;
    }

    /**
     * Obtiene el valor de la propiedad unidades.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidades() {
        return unidades;
    }

    /**
     * Define el valor de la propiedad unidades.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidades(String value) {
        this.unidades = value;
    }

}
