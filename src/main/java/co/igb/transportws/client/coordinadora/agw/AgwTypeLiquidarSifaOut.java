
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_typeLiquidarSifaOut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_typeLiquidarSifaOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ubl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombreProducto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="abreviadoProducto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreUbl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="abreviadoUbl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoCuenta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombreCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="abreviadoCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cotizacion" type="{https://sandbox.coordinadora.com/agw/ws/guias/1.6/server.php}Sifa_typeCotizacion"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agw_typeLiquidarSifaOut", propOrder = {

})
public class AgwTypeLiquidarSifaOut {

    protected int ubl;
    protected int producto;
    @XmlElement(required = true)
    protected String nombreProducto;
    @XmlElement(required = true)
    protected String abreviadoProducto;
    @XmlElement(required = true)
    protected String nombreUbl;
    @XmlElement(required = true)
    protected String abreviadoUbl;
    protected int codigoCuenta;
    @XmlElement(required = true)
    protected String nombreCuenta;
    @XmlElement(required = true)
    protected String abreviadoCuenta;
    @XmlElement(required = true)
    protected SifaTypeCotizacion cotizacion;

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
     * Obtiene el valor de la propiedad producto.
     * 
     */
    public int getProducto() {
        return producto;
    }

    /**
     * Define el valor de la propiedad producto.
     * 
     */
    public void setProducto(int value) {
        this.producto = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Define el valor de la propiedad nombreProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreProducto(String value) {
        this.nombreProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad abreviadoProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbreviadoProducto() {
        return abreviadoProducto;
    }

    /**
     * Define el valor de la propiedad abreviadoProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbreviadoProducto(String value) {
        this.abreviadoProducto = value;
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

    /**
     * Obtiene el valor de la propiedad cotizacion.
     * 
     * @return
     *     possible object is
     *     {@link SifaTypeCotizacion }
     *     
     */
    public SifaTypeCotizacion getCotizacion() {
        return cotizacion;
    }

    /**
     * Define el valor de la propiedad cotizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link SifaTypeCotizacion }
     *     
     */
    public void setCotizacion(SifaTypeCotizacion value) {
        this.cotizacion = value;
    }

}
