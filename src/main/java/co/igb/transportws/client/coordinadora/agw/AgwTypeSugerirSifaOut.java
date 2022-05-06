
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_typeSugerirSifaOut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_typeSugerirSifaOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="validado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="unidades" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="volumen" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="pesoReal" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="productoGuia" type="{https://sandbox.coordinadora.com/agw/ws/guias/1.6/server.php}Sifa_typeProductoGuia"/>
 *         &lt;element name="sugerencias" type="{https://sandbox.coordinadora.com/agw/ws/guias/1.6/server.php}ArrayOfSifa_typeSugerencia"/>
 *         &lt;element name="codigoCuenta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombreCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="abreviadoCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agw_typeSugerirSifaOut", propOrder = {

})
public class AgwTypeSugerirSifaOut {

    protected boolean validado;
    protected int unidades;
    protected float volumen;
    protected float pesoReal;
    @XmlElement(required = true)
    protected SifaTypeProductoGuia productoGuia;
    @XmlElement(required = true)
    protected ArrayOfSifaTypeSugerencia sugerencias;
    protected int codigoCuenta;
    @XmlElement(required = true)
    protected String nombreCuenta;
    @XmlElement(required = true)
    protected String abreviadoCuenta;

    /**
     * Obtiene el valor de la propiedad validado.
     * 
     */
    public boolean isValidado() {
        return validado;
    }

    /**
     * Define el valor de la propiedad validado.
     * 
     */
    public void setValidado(boolean value) {
        this.validado = value;
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
     * Obtiene el valor de la propiedad volumen.
     * 
     */
    public float getVolumen() {
        return volumen;
    }

    /**
     * Define el valor de la propiedad volumen.
     * 
     */
    public void setVolumen(float value) {
        this.volumen = value;
    }

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
     * Obtiene el valor de la propiedad productoGuia.
     * 
     * @return
     *     possible object is
     *     {@link SifaTypeProductoGuia }
     *     
     */
    public SifaTypeProductoGuia getProductoGuia() {
        return productoGuia;
    }

    /**
     * Define el valor de la propiedad productoGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link SifaTypeProductoGuia }
     *     
     */
    public void setProductoGuia(SifaTypeProductoGuia value) {
        this.productoGuia = value;
    }

    /**
     * Obtiene el valor de la propiedad sugerencias.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSifaTypeSugerencia }
     *     
     */
    public ArrayOfSifaTypeSugerencia getSugerencias() {
        return sugerencias;
    }

    /**
     * Define el valor de la propiedad sugerencias.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSifaTypeSugerencia }
     *     
     */
    public void setSugerencias(ArrayOfSifaTypeSugerencia value) {
        this.sugerencias = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCuenta.
     * 
     */
    public int getCodigoCuenta() {
        return codigoCuenta;
    }

    /**
     * Define el valor de la propiedad codigoCuenta.
     * 
     */
    public void setCodigoCuenta(int value) {
        this.codigoCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCuenta() {
        return nombreCuenta;
    }

    /**
     * Define el valor de la propiedad nombreCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCuenta(String value) {
        this.nombreCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad abreviadoCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbreviadoCuenta() {
        return abreviadoCuenta;
    }

    /**
     * Define el valor de la propiedad abreviadoCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbreviadoCuenta(String value) {
        this.abreviadoCuenta = value;
    }

}
