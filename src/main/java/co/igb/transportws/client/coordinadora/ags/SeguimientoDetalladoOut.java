
package co.igb.transportws.client.coordinadora.ags;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Seguimiento_detalladoOut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Seguimiento_detalladoOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="codigo_remision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imagen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estados" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}ArrayOfSeguimiento_detalle"/>
 *         &lt;element name="novedades" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}ArrayOfSeguimiento_novedades"/>
 *         &lt;element name="tiene_anexo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="anexos" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}ArrayOfSeguimiento_anexo"/>
 *         &lt;element name="nombre_origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombre_destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="referencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="guias_vinculadas" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}ArrayOfSeguimiento_guiaviculadaout"/>
 *         &lt;element name="dias_promesa_servicio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="persona_recibe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Seguimiento_detalladoOut", propOrder = {

})
public class SeguimientoDetalladoOut {

    @XmlElement(name = "codigo_remision", required = true)
    protected String codigoRemision;
    @XmlElement(required = true)
    protected String imagen;
    @XmlElement(required = true)
    protected ArrayOfSeguimientoDetalle estados;
    @XmlElement(required = true)
    protected ArrayOfSeguimientoNovedades novedades;
    @XmlElement(name = "tiene_anexo")
    protected int tieneAnexo;
    @XmlElement(required = true)
    protected ArrayOfSeguimientoAnexo anexos;
    @XmlElement(name = "nombre_origen", required = true)
    protected String nombreOrigen;
    @XmlElement(name = "nombre_destino", required = true)
    protected String nombreDestino;
    @XmlElement(required = true)
    protected String referencia;
    protected int producto;
    @XmlElement(name = "guias_vinculadas", required = true)
    protected ArrayOfSeguimientoGuiaviculadaout guiasVinculadas;
    @XmlElement(name = "dias_promesa_servicio")
    protected int diasPromesaServicio;
    @XmlElement(name = "persona_recibe", required = true)
    protected String personaRecibe;

    /**
     * Obtiene el valor de la propiedad codigoRemision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRemision() {
        return codigoRemision;
    }

    /**
     * Define el valor de la propiedad codigoRemision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRemision(String value) {
        this.codigoRemision = value;
    }

    /**
     * Obtiene el valor de la propiedad imagen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Define el valor de la propiedad imagen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagen(String value) {
        this.imagen = value;
    }

    /**
     * Obtiene el valor de la propiedad estados.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSeguimientoDetalle }
     *     
     */
    public ArrayOfSeguimientoDetalle getEstados() {
        return estados;
    }

    /**
     * Define el valor de la propiedad estados.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSeguimientoDetalle }
     *     
     */
    public void setEstados(ArrayOfSeguimientoDetalle value) {
        this.estados = value;
    }

    /**
     * Obtiene el valor de la propiedad novedades.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSeguimientoNovedades }
     *     
     */
    public ArrayOfSeguimientoNovedades getNovedades() {
        return novedades;
    }

    /**
     * Define el valor de la propiedad novedades.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSeguimientoNovedades }
     *     
     */
    public void setNovedades(ArrayOfSeguimientoNovedades value) {
        this.novedades = value;
    }

    /**
     * Obtiene el valor de la propiedad tieneAnexo.
     * 
     */
    public int getTieneAnexo() {
        return tieneAnexo;
    }

    /**
     * Define el valor de la propiedad tieneAnexo.
     * 
     */
    public void setTieneAnexo(int value) {
        this.tieneAnexo = value;
    }

    /**
     * Obtiene el valor de la propiedad anexos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSeguimientoAnexo }
     *     
     */
    public ArrayOfSeguimientoAnexo getAnexos() {
        return anexos;
    }

    /**
     * Define el valor de la propiedad anexos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSeguimientoAnexo }
     *     
     */
    public void setAnexos(ArrayOfSeguimientoAnexo value) {
        this.anexos = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreOrigen() {
        return nombreOrigen;
    }

    /**
     * Define el valor de la propiedad nombreOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreOrigen(String value) {
        this.nombreOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDestino() {
        return nombreDestino;
    }

    /**
     * Define el valor de la propiedad nombreDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDestino(String value) {
        this.nombreDestino = value;
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
     * Obtiene el valor de la propiedad guiasVinculadas.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSeguimientoGuiaviculadaout }
     *     
     */
    public ArrayOfSeguimientoGuiaviculadaout getGuiasVinculadas() {
        return guiasVinculadas;
    }

    /**
     * Define el valor de la propiedad guiasVinculadas.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSeguimientoGuiaviculadaout }
     *     
     */
    public void setGuiasVinculadas(ArrayOfSeguimientoGuiaviculadaout value) {
        this.guiasVinculadas = value;
    }

    /**
     * Obtiene el valor de la propiedad diasPromesaServicio.
     * 
     */
    public int getDiasPromesaServicio() {
        return diasPromesaServicio;
    }

    /**
     * Define el valor de la propiedad diasPromesaServicio.
     * 
     */
    public void setDiasPromesaServicio(int value) {
        this.diasPromesaServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad personaRecibe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonaRecibe() {
        return personaRecibe;
    }

    /**
     * Define el valor de la propiedad personaRecibe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonaRecibe(String value) {
        this.personaRecibe = value;
    }

}
