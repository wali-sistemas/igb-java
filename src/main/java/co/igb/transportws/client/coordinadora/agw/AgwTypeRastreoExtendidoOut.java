
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_typeRastreoExtendidoOut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_typeRastreoExtendidoOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="codigo_remision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigo_estado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descripcion_estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fecha_recogida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fecha_entrega" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hora_entrega" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombre_origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombre_destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="referencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="detalle_estados" type="{https://sandbox.coordinadora.com/agw/ws/guias/1.6/server.php}ArrayOfAgw_typeRastreoExtendidoEstados"/>
 *         &lt;element name="detalle_novedades" type="{https://sandbox.coordinadora.com/agw/ws/guias/1.6/server.php}ArrayOfAgw_typeRastreoExtendidoNovedades"/>
 *         &lt;element name="guias_vinculadas" type="{https://sandbox.coordinadora.com/agw/ws/guias/1.6/server.php}ArrayOfAgw_typeGuiasVinculadas"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agw_typeRastreoExtendidoOut", propOrder = {

})
public class AgwTypeRastreoExtendidoOut {

    @XmlElement(name = "codigo_remision", required = true)
    protected String codigoRemision;
    @XmlElement(name = "codigo_estado")
    protected int codigoEstado;
    @XmlElement(name = "descripcion_estado", required = true)
    protected String descripcionEstado;
    @XmlElement(name = "fecha_recogida", required = true)
    protected String fechaRecogida;
    @XmlElement(name = "fecha_entrega", required = true)
    protected String fechaEntrega;
    @XmlElement(name = "hora_entrega", required = true)
    protected String horaEntrega;
    @XmlElement(name = "nombre_origen", required = true)
    protected String nombreOrigen;
    @XmlElement(name = "nombre_destino", required = true)
    protected String nombreDestino;
    @XmlElement(required = true)
    protected String referencia;
    @XmlElement(name = "detalle_estados", required = true)
    protected ArrayOfAgwTypeRastreoExtendidoEstados detalleEstados;
    @XmlElement(name = "detalle_novedades", required = true)
    protected ArrayOfAgwTypeRastreoExtendidoNovedades detalleNovedades;
    @XmlElement(name = "guias_vinculadas", required = true)
    protected ArrayOfAgwTypeGuiasVinculadas guiasVinculadas;

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
     * Obtiene el valor de la propiedad codigoEstado.
     * 
     */
    public int getCodigoEstado() {
        return codigoEstado;
    }

    /**
     * Define el valor de la propiedad codigoEstado.
     * 
     */
    public void setCodigoEstado(int value) {
        this.codigoEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionEstado() {
        return descripcionEstado;
    }

    /**
     * Define el valor de la propiedad descripcionEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionEstado(String value) {
        this.descripcionEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRecogida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRecogida() {
        return fechaRecogida;
    }

    /**
     * Define el valor de la propiedad fechaRecogida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRecogida(String value) {
        this.fechaRecogida = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEntrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Define el valor de la propiedad fechaEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEntrega(String value) {
        this.fechaEntrega = value;
    }

    /**
     * Obtiene el valor de la propiedad horaEntrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraEntrega() {
        return horaEntrega;
    }

    /**
     * Define el valor de la propiedad horaEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraEntrega(String value) {
        this.horaEntrega = value;
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
     * Obtiene el valor de la propiedad detalleEstados.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAgwTypeRastreoExtendidoEstados }
     *     
     */
    public ArrayOfAgwTypeRastreoExtendidoEstados getDetalleEstados() {
        return detalleEstados;
    }

    /**
     * Define el valor de la propiedad detalleEstados.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAgwTypeRastreoExtendidoEstados }
     *     
     */
    public void setDetalleEstados(ArrayOfAgwTypeRastreoExtendidoEstados value) {
        this.detalleEstados = value;
    }

    /**
     * Obtiene el valor de la propiedad detalleNovedades.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAgwTypeRastreoExtendidoNovedades }
     *     
     */
    public ArrayOfAgwTypeRastreoExtendidoNovedades getDetalleNovedades() {
        return detalleNovedades;
    }

    /**
     * Define el valor de la propiedad detalleNovedades.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAgwTypeRastreoExtendidoNovedades }
     *     
     */
    public void setDetalleNovedades(ArrayOfAgwTypeRastreoExtendidoNovedades value) {
        this.detalleNovedades = value;
    }

    /**
     * Obtiene el valor de la propiedad guiasVinculadas.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAgwTypeGuiasVinculadas }
     *     
     */
    public ArrayOfAgwTypeGuiasVinculadas getGuiasVinculadas() {
        return guiasVinculadas;
    }

    /**
     * Define el valor de la propiedad guiasVinculadas.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAgwTypeGuiasVinculadas }
     *     
     */
    public void setGuiasVinculadas(ArrayOfAgwTypeGuiasVinculadas value) {
        this.guiasVinculadas = value;
    }

}
