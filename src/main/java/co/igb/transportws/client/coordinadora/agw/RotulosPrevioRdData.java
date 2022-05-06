
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Rotulos_previo_Rd_Data complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Rotulos_previo_Rd_Data">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="etiqueta1d" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="etiqueta2d" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombre_nivel_servicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="abreviado_cuenta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="abreviado_producto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigo_terminal_origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="abreviado_terminal_origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigo_terminal_destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="abreviado_terminal_destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zona_reparto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subzona_reparto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="referencia_detalle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pdf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rotulos_previo_Rd_Data", propOrder = {

})
public class RotulosPrevioRdData {

    @XmlElement(name = "etiqueta1d", required = true)
    protected String etiqueta1D;
    @XmlElement(name = "etiqueta2d", required = true)
    protected String etiqueta2D;
    @XmlElement(name = "nombre_nivel_servicio", required = true)
    protected String nombreNivelServicio;
    @XmlElement(name = "abreviado_cuenta", required = true)
    protected String abreviadoCuenta;
    @XmlElement(name = "abreviado_producto", required = true)
    protected String abreviadoProducto;
    @XmlElement(name = "codigo_terminal_origen", required = true)
    protected String codigoTerminalOrigen;
    @XmlElement(name = "abreviado_terminal_origen", required = true)
    protected String abreviadoTerminalOrigen;
    @XmlElement(name = "codigo_terminal_destino", required = true)
    protected String codigoTerminalDestino;
    @XmlElement(name = "abreviado_terminal_destino", required = true)
    protected String abreviadoTerminalDestino;
    @XmlElement(name = "zona_reparto", required = true)
    protected String zonaReparto;
    @XmlElement(name = "subzona_reparto", required = true)
    protected String subzonaReparto;
    @XmlElement(name = "referencia_detalle", required = true)
    protected String referenciaDetalle;
    @XmlElement(required = true)
    protected String error;
    @XmlElement(required = true)
    protected String pdf;

    /**
     * Obtiene el valor de la propiedad etiqueta1D.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtiqueta1D() {
        return etiqueta1D;
    }

    /**
     * Define el valor de la propiedad etiqueta1D.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtiqueta1D(String value) {
        this.etiqueta1D = value;
    }

    /**
     * Obtiene el valor de la propiedad etiqueta2D.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtiqueta2D() {
        return etiqueta2D;
    }

    /**
     * Define el valor de la propiedad etiqueta2D.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtiqueta2D(String value) {
        this.etiqueta2D = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreNivelServicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreNivelServicio() {
        return nombreNivelServicio;
    }

    /**
     * Define el valor de la propiedad nombreNivelServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreNivelServicio(String value) {
        this.nombreNivelServicio = value;
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
     * Obtiene el valor de la propiedad codigoTerminalOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTerminalOrigen() {
        return codigoTerminalOrigen;
    }

    /**
     * Define el valor de la propiedad codigoTerminalOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTerminalOrigen(String value) {
        this.codigoTerminalOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad abreviadoTerminalOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbreviadoTerminalOrigen() {
        return abreviadoTerminalOrigen;
    }

    /**
     * Define el valor de la propiedad abreviadoTerminalOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbreviadoTerminalOrigen(String value) {
        this.abreviadoTerminalOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTerminalDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTerminalDestino() {
        return codigoTerminalDestino;
    }

    /**
     * Define el valor de la propiedad codigoTerminalDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTerminalDestino(String value) {
        this.codigoTerminalDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad abreviadoTerminalDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbreviadoTerminalDestino() {
        return abreviadoTerminalDestino;
    }

    /**
     * Define el valor de la propiedad abreviadoTerminalDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbreviadoTerminalDestino(String value) {
        this.abreviadoTerminalDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad zonaReparto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZonaReparto() {
        return zonaReparto;
    }

    /**
     * Define el valor de la propiedad zonaReparto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZonaReparto(String value) {
        this.zonaReparto = value;
    }

    /**
     * Obtiene el valor de la propiedad subzonaReparto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubzonaReparto() {
        return subzonaReparto;
    }

    /**
     * Define el valor de la propiedad subzonaReparto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubzonaReparto(String value) {
        this.subzonaReparto = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaDetalle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaDetalle() {
        return referenciaDetalle;
    }

    /**
     * Define el valor de la propiedad referenciaDetalle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaDetalle(String value) {
        this.referenciaDetalle = value;
    }

    /**
     * Obtiene el valor de la propiedad error.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Define el valor de la propiedad error.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Obtiene el valor de la propiedad pdf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdf() {
        return pdf;
    }

    /**
     * Define el valor de la propiedad pdf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdf(String value) {
        this.pdf = value;
    }

}
