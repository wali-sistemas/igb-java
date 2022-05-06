
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Sifa_typeSugerencia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Sifa_typeSugerencia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="pesoReal" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="unidades" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="largo" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="ancho" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="alto" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="referencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ubl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pesoRealTotal" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="pesoVolumenRedondeado" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="pesoVolumenTotal" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="pesoVolumen" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="nombreUbl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="abreviadoUbl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sifa_typeSugerencia", propOrder = {

})
public class SifaTypeSugerencia {

    protected float pesoReal;
    protected int unidades;
    protected float largo;
    protected float ancho;
    protected float alto;
    @XmlElement(required = true)
    protected String referencia;
    protected int ubl;
    protected float pesoRealTotal;
    protected float pesoVolumenRedondeado;
    protected float pesoVolumenTotal;
    protected float pesoVolumen;
    @XmlElement(required = true)
    protected String nombreUbl;
    @XmlElement(required = true)
    protected String abreviadoUbl;

    /**
     * Obtiene el valor de la propiedad pesoReal.
     * 
     */
    public float getPesoReal() {
        return pesoReal;
    }

    /**
     * Define el valor de la propiedad pesoReal.
     * 
     */
    public void setPesoReal(float value) {
        this.pesoReal = value;
    }

    /**
     * Obtiene el valor de la propiedad unidades.
     * 
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * Define el valor de la propiedad unidades.
     * 
     */
    public void setUnidades(int value) {
        this.unidades = value;
    }

    /**
     * Obtiene el valor de la propiedad largo.
     * 
     */
    public float getLargo() {
        return largo;
    }

    /**
     * Define el valor de la propiedad largo.
     * 
     */
    public void setLargo(float value) {
        this.largo = value;
    }

    /**
     * Obtiene el valor de la propiedad ancho.
     * 
     */
    public float getAncho() {
        return ancho;
    }

    /**
     * Define el valor de la propiedad ancho.
     * 
     */
    public void setAncho(float value) {
        this.ancho = value;
    }

    /**
     * Obtiene el valor de la propiedad alto.
     * 
     */
    public float getAlto() {
        return alto;
    }

    /**
     * Define el valor de la propiedad alto.
     * 
     */
    public void setAlto(float value) {
        this.alto = value;
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
     * Obtiene el valor de la propiedad ubl.
     * 
     */
    public int getUbl() {
        return ubl;
    }

    /**
     * Define el valor de la propiedad ubl.
     * 
     */
    public void setUbl(int value) {
        this.ubl = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoRealTotal.
     * 
     */
    public float getPesoRealTotal() {
        return pesoRealTotal;
    }

    /**
     * Define el valor de la propiedad pesoRealTotal.
     * 
     */
    public void setPesoRealTotal(float value) {
        this.pesoRealTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoVolumenRedondeado.
     * 
     */
    public float getPesoVolumenRedondeado() {
        return pesoVolumenRedondeado;
    }

    /**
     * Define el valor de la propiedad pesoVolumenRedondeado.
     * 
     */
    public void setPesoVolumenRedondeado(float value) {
        this.pesoVolumenRedondeado = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoVolumenTotal.
     * 
     */
    public float getPesoVolumenTotal() {
        return pesoVolumenTotal;
    }

    /**
     * Define el valor de la propiedad pesoVolumenTotal.
     * 
     */
    public void setPesoVolumenTotal(float value) {
        this.pesoVolumenTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoVolumen.
     * 
     */
    public float getPesoVolumen() {
        return pesoVolumen;
    }

    /**
     * Define el valor de la propiedad pesoVolumen.
     * 
     */
    public void setPesoVolumen(float value) {
        this.pesoVolumen = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreUbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreUbl() {
        return nombreUbl;
    }

    /**
     * Define el valor de la propiedad nombreUbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreUbl(String value) {
        this.nombreUbl = value;
    }

    /**
     * Obtiene el valor de la propiedad abreviadoUbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbreviadoUbl() {
        return abreviadoUbl;
    }

    /**
     * Define el valor de la propiedad abreviadoUbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbreviadoUbl(String value) {
        this.abreviadoUbl = value;
    }

}
