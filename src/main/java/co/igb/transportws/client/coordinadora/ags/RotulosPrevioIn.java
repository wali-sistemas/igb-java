
package co.igb.transportws.client.coordinadora.ags;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Rotulos_previoIn complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Rotulos_previoIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="cuenta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="unidades" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="nivel_servicio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="direccion_destinatario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ciudad_destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telefono_destinatario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombre_destinatario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="direccion_remitente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ciudad_origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telefono_remitente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombre_remitente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigo_remision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numero_unidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="referencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="referencia_detalle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipo_respuesta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id_rotulo" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "Rotulos_previoIn", propOrder = {

})
public class RotulosPrevioIn {

    protected int cuenta;
    protected int producto;
    protected int unidades;
    protected float peso;
    @XmlElement(name = "nivel_servicio")
    protected int nivelServicio;
    @XmlElement(name = "direccion_destinatario", required = true)
    protected String direccionDestinatario;
    @XmlElement(name = "ciudad_destino", required = true)
    protected String ciudadDestino;
    @XmlElement(name = "telefono_destinatario", required = true)
    protected String telefonoDestinatario;
    @XmlElement(name = "nombre_destinatario", required = true)
    protected String nombreDestinatario;
    @XmlElement(name = "direccion_remitente", required = true)
    protected String direccionRemitente;
    @XmlElement(name = "ciudad_origen", required = true)
    protected String ciudadOrigen;
    @XmlElement(name = "telefono_remitente", required = true)
    protected String telefonoRemitente;
    @XmlElement(name = "nombre_remitente", required = true)
    protected String nombreRemitente;
    @XmlElement(name = "codigo_remision", required = true)
    protected String codigoRemision;
    @XmlElement(name = "numero_unidad")
    protected int numeroUnidad;
    @XmlElement(required = true)
    protected String referencia;
    @XmlElement(name = "referencia_detalle", required = true)
    protected String referenciaDetalle;
    @XmlElement(required = true)
    protected String observaciones;
    @XmlElement(name = "tipo_respuesta", required = true)
    protected String tipoRespuesta;
    @XmlElement(name = "id_rotulo")
    protected int idRotulo;
    @XmlElement(required = true)
    protected String apikey;
    @XmlElement(required = true)
    protected String clave;

    /**
     * Obtiene el valor de la propiedad cuenta.
     * 
     */
    public int getCuenta() {
        return cuenta;
    }

    /**
     * Define el valor de la propiedad cuenta.
     * 
     */
    public void setCuenta(int value) {
        this.cuenta = value;
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
     * Obtiene el valor de la propiedad nivelServicio.
     * 
     */
    public int getNivelServicio() {
        return nivelServicio;
    }

    /**
     * Define el valor de la propiedad nivelServicio.
     * 
     */
    public void setNivelServicio(int value) {
        this.nivelServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionDestinatario() {
        return direccionDestinatario;
    }

    /**
     * Define el valor de la propiedad direccionDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionDestinatario(String value) {
        this.direccionDestinatario = value;
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
     * Obtiene el valor de la propiedad telefonoDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoDestinatario() {
        return telefonoDestinatario;
    }

    /**
     * Define el valor de la propiedad telefonoDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoDestinatario(String value) {
        this.telefonoDestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    /**
     * Define el valor de la propiedad nombreDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDestinatario(String value) {
        this.nombreDestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionRemitente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionRemitente() {
        return direccionRemitente;
    }

    /**
     * Define el valor de la propiedad direccionRemitente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionRemitente(String value) {
        this.direccionRemitente = value;
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
     * Obtiene el valor de la propiedad telefonoRemitente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoRemitente() {
        return telefonoRemitente;
    }

    /**
     * Define el valor de la propiedad telefonoRemitente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoRemitente(String value) {
        this.telefonoRemitente = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreRemitente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreRemitente() {
        return nombreRemitente;
    }

    /**
     * Define el valor de la propiedad nombreRemitente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreRemitente(String value) {
        this.nombreRemitente = value;
    }

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
     * Obtiene el valor de la propiedad numeroUnidad.
     * 
     */
    public int getNumeroUnidad() {
        return numeroUnidad;
    }

    /**
     * Define el valor de la propiedad numeroUnidad.
     * 
     */
    public void setNumeroUnidad(int value) {
        this.numeroUnidad = value;
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
     * Obtiene el valor de la propiedad observaciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Define el valor de la propiedad observaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservaciones(String value) {
        this.observaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRespuesta() {
        return tipoRespuesta;
    }

    /**
     * Define el valor de la propiedad tipoRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRespuesta(String value) {
        this.tipoRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad idRotulo.
     * 
     */
    public int getIdRotulo() {
        return idRotulo;
    }

    /**
     * Define el valor de la propiedad idRotulo.
     * 
     */
    public void setIdRotulo(int value) {
        this.idRotulo = value;
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
