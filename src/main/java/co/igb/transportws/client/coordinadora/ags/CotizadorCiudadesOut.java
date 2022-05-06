
package co.igb.transportws.client.coordinadora.ags;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Cotizador_ciudadesOut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Cotizador_ciudadesOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="abreviado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipo_poblacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigo_departamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombre_departamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cotizador_ciudadesOut", propOrder = {

})
public class CotizadorCiudadesOut {

    @XmlElement(required = true)
    protected String codigo;
    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String abreviado;
    @XmlElement(name = "tipo_poblacion", required = true)
    protected String tipoPoblacion;
    @XmlElement(name = "codigo_departamento", required = true)
    protected String codigoDepartamento;
    @XmlElement(name = "nombre_departamento", required = true)
    protected String nombreDepartamento;
    @XmlElement(required = true)
    protected String estado;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad abreviado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbreviado() {
        return abreviado;
    }

    /**
     * Define el valor de la propiedad abreviado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbreviado(String value) {
        this.abreviado = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPoblacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPoblacion() {
        return tipoPoblacion;
    }

    /**
     * Define el valor de la propiedad tipoPoblacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPoblacion(String value) {
        this.tipoPoblacion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoDepartamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDepartamento() {
        return codigoDepartamento;
    }

    /**
     * Define el valor de la propiedad codigoDepartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDepartamento(String value) {
        this.codigoDepartamento = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreDepartamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    /**
     * Define el valor de la propiedad nombreDepartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDepartamento(String value) {
        this.nombreDepartamento = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

}
