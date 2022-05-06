
package co.igb.transportws.client.coordinadora.ags;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Cotizador_cotizarInterIn complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Cotizador_cotizarInterIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="nit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="div" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ciudad_origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pais_destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ciudad_destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigo_postal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valoracion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="detalle" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}ArrayOfCotizador_detalleempaques"/>
 *         &lt;element name="apikey" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Cotizador_cotizarInterIn", propOrder = {

})
public class CotizadorCotizarInterIn {

    @XmlElement(required = true)
    protected String nit;
    @XmlElement(required = true)
    protected String div;
    @XmlElement(required = true)
    protected String producto;
    @XmlElement(name = "ciudad_origen", required = true)
    protected String ciudadOrigen;
    @XmlElement(name = "pais_destino", required = true)
    protected String paisDestino;
    @XmlElement(name = "ciudad_destino", required = true)
    protected String ciudadDestino;
    @XmlElement(name = "codigo_postal", required = true)
    protected String codigoPostal;
    @XmlElement(required = true)
    protected String valoracion;
    @XmlElement(required = true)
    protected ArrayOfCotizadorDetalleempaques detalle;
    @XmlElement(required = true)
    protected String apikey;
    @XmlElement(required = true)
    protected String clave;

    /**
     * Obtiene el valor de la propiedad nit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNit() {
        return nit;
    }

    /**
     * Define el valor de la propiedad nit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNit(String value) {
        this.nit = value;
    }

    /**
     * Obtiene el valor de la propiedad div.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiv() {
        return div;
    }

    /**
     * Define el valor de la propiedad div.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiv(String value) {
        this.div = value;
    }

    /**
     * Obtiene el valor de la propiedad producto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducto() {
        return producto;
    }

    /**
     * Define el valor de la propiedad producto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducto(String value) {
        this.producto = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudadOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    /**
     * Define el valor de la propiedad ciudadOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadOrigen(String value) {
        this.ciudadOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad paisDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisDestino() {
        return paisDestino;
    }

    /**
     * Define el valor de la propiedad paisDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisDestino(String value) {
        this.paisDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudadDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadDestino() {
        return ciudadDestino;
    }

    /**
     * Define el valor de la propiedad ciudadDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadDestino(String value) {
        this.ciudadDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Define el valor de la propiedad codigoPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPostal(String value) {
        this.codigoPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad valoracion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValoracion() {
        return valoracion;
    }

    /**
     * Define el valor de la propiedad valoracion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValoracion(String value) {
        this.valoracion = value;
    }

    /**
     * Obtiene el valor de la propiedad detalle.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCotizadorDetalleempaques }
     *     
     */
    public ArrayOfCotizadorDetalleempaques getDetalle() {
        return detalle;
    }

    /**
     * Define el valor de la propiedad detalle.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCotizadorDetalleempaques }
     *     
     */
    public void setDetalle(ArrayOfCotizadorDetalleempaques value) {
        this.detalle = value;
    }

    /**
     * Obtiene el valor de la propiedad apikey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApikey() {
        return apikey;
    }

    /**
     * Define el valor de la propiedad apikey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApikey(String value) {
        this.apikey = value;
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
