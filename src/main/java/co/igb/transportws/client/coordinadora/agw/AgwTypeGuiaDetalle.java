
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_typeGuiaDetalle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_typeGuiaDetalle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ubl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="alto" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="ancho" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="largo" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="unidades" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="referencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombre_empaque" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agw_typeGuiaDetalle", propOrder = {

})
public class AgwTypeGuiaDetalle {

    protected int ubl;
    protected float alto;
    protected float ancho;
    protected float largo;
    protected float peso;
    protected int unidades;
    @XmlElement(required = true)
    protected String referencia;
    @XmlElement(name = "nombre_empaque", required = true)
    protected String nombreEmpaque;

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
     * Obtiene el valor de la propiedad peso.
     * 
     */
    public float getPeso() {
        return peso;
    }

    /**
     * Define el valor de la propiedad peso.
     * 
     */
    public void setPeso(float value) {
        this.peso = value;
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
     * Obtiene el valor de la propiedad nombreEmpaque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEmpaque() {
        return nombreEmpaque;
    }

    /**
     * Define el valor de la propiedad nombreEmpaque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEmpaque(String value) {
        this.nombreEmpaque = value;
    }

}
