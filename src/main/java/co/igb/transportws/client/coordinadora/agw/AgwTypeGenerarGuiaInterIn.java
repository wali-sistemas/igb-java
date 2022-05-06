
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_typeGenerarGuiaInterIn complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_typeGenerarGuiaInterIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="codigo_remision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id_cliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_remitente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombre_remitente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="direccion_remitente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telefono_remitente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ciudad_remitente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nit_destinatario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="div_destinatario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombre_destinatario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="direccion_destinatario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigo_ciudad_destinatario_inter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombre_ciudad_destinatario_inter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pais_destinatario_inter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigo_postal_destinatario_inter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="impuestos_origen_inter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telefono_destinatario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valor_declarado" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="codigo_cuenta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codigo_producto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nivel_servicio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="contenido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="referencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="detalle" type="{https://sandbox.coordinadora.com/agw/ws/guias/1.6/server.php}ArrayOfAgw_typeGuiaDetalle"/>
 *         &lt;element name="cuenta_contable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="centro_costos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id_rotulo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Agw_typeGenerarGuiaInterIn", propOrder = {

})
public class AgwTypeGenerarGuiaInterIn {

    @XmlElement(name = "codigo_remision", required = true)
    protected String codigoRemision;
    @XmlElement(required = true)
    protected String fecha;
    @XmlElement(name = "id_cliente")
    protected int idCliente;
    @XmlElement(name = "id_remitente")
    protected int idRemitente;
    @XmlElement(name = "nombre_remitente", required = true)
    protected String nombreRemitente;
    @XmlElement(name = "direccion_remitente", required = true)
    protected String direccionRemitente;
    @XmlElement(name = "telefono_remitente", required = true)
    protected String telefonoRemitente;
    @XmlElement(name = "ciudad_remitente", required = true)
    protected String ciudadRemitente;
    @XmlElement(name = "nit_destinatario", required = true)
    protected String nitDestinatario;
    @XmlElement(name = "div_destinatario", required = true)
    protected String divDestinatario;
    @XmlElement(name = "nombre_destinatario", required = true)
    protected String nombreDestinatario;
    @XmlElement(name = "direccion_destinatario", required = true)
    protected String direccionDestinatario;
    @XmlElement(name = "codigo_ciudad_destinatario_inter", required = true)
    protected String codigoCiudadDestinatarioInter;
    @XmlElement(name = "nombre_ciudad_destinatario_inter", required = true)
    protected String nombreCiudadDestinatarioInter;
    @XmlElement(name = "pais_destinatario_inter", required = true)
    protected String paisDestinatarioInter;
    @XmlElement(name = "codigo_postal_destinatario_inter", required = true)
    protected String codigoPostalDestinatarioInter;
    @XmlElement(name = "impuestos_origen_inter", required = true)
    protected String impuestosOrigenInter;
    @XmlElement(name = "telefono_destinatario", required = true)
    protected String telefonoDestinatario;
    @XmlElement(name = "valor_declarado")
    protected float valorDeclarado;
    @XmlElement(name = "codigo_cuenta")
    protected int codigoCuenta;
    @XmlElement(name = "codigo_producto")
    protected int codigoProducto;
    @XmlElement(name = "nivel_servicio")
    protected int nivelServicio;
    @XmlElement(required = true)
    protected String contenido;
    @XmlElement(required = true)
    protected String referencia;
    @XmlElement(required = true)
    protected String observaciones;
    @XmlElement(required = true)
    protected String estado;
    @XmlElement(required = true)
    protected ArrayOfAgwTypeGuiaDetalle detalle;
    @XmlElement(name = "cuenta_contable", required = true)
    protected String cuentaContable;
    @XmlElement(name = "centro_costos", required = true)
    protected String centroCostos;
    @XmlElement(name = "id_rotulo")
    protected int idRotulo;
    @XmlElement(required = true)
    protected String usuario;
    @XmlElement(required = true)
    protected String clave;

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
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad idCliente.
     * 
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Define el valor de la propiedad idCliente.
     * 
     */
    public void setIdCliente(int value) {
        this.idCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad idRemitente.
     * 
     */
    public int getIdRemitente() {
        return idRemitente;
    }

    /**
     * Define el valor de la propiedad idRemitente.
     * 
     */
    public void setIdRemitente(int value) {
        this.idRemitente = value;
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
     * Obtiene el valor de la propiedad ciudadRemitente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadRemitente() {
        return ciudadRemitente;
    }

    /**
     * Define el valor de la propiedad ciudadRemitente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadRemitente(String value) {
        this.ciudadRemitente = value;
    }

    /**
     * Obtiene el valor de la propiedad nitDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNitDestinatario() {
        return nitDestinatario;
    }

    /**
     * Define el valor de la propiedad nitDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNitDestinatario(String value) {
        this.nitDestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad divDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivDestinatario() {
        return divDestinatario;
    }

    /**
     * Define el valor de la propiedad divDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivDestinatario(String value) {
        this.divDestinatario = value;
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
     * Obtiene el valor de la propiedad codigoCiudadDestinatarioInter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCiudadDestinatarioInter() {
        return codigoCiudadDestinatarioInter;
    }

    /**
     * Define el valor de la propiedad codigoCiudadDestinatarioInter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCiudadDestinatarioInter(String value) {
        this.codigoCiudadDestinatarioInter = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCiudadDestinatarioInter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCiudadDestinatarioInter() {
        return nombreCiudadDestinatarioInter;
    }

    /**
     * Define el valor de la propiedad nombreCiudadDestinatarioInter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCiudadDestinatarioInter(String value) {
        this.nombreCiudadDestinatarioInter = value;
    }

    /**
     * Obtiene el valor de la propiedad paisDestinatarioInter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisDestinatarioInter() {
        return paisDestinatarioInter;
    }

    /**
     * Define el valor de la propiedad paisDestinatarioInter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisDestinatarioInter(String value) {
        this.paisDestinatarioInter = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPostalDestinatarioInter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPostalDestinatarioInter() {
        return codigoPostalDestinatarioInter;
    }

    /**
     * Define el valor de la propiedad codigoPostalDestinatarioInter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPostalDestinatarioInter(String value) {
        this.codigoPostalDestinatarioInter = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestosOrigenInter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpuestosOrigenInter() {
        return impuestosOrigenInter;
    }

    /**
     * Define el valor de la propiedad impuestosOrigenInter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpuestosOrigenInter(String value) {
        this.impuestosOrigenInter = value;
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
     * Obtiene el valor de la propiedad valorDeclarado.
     * 
     */
    public float getValorDeclarado() {
        return valorDeclarado;
    }

    /**
     * Define el valor de la propiedad valorDeclarado.
     * 
     */
    public void setValorDeclarado(float value) {
        this.valorDeclarado = value;
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
     * Obtiene el valor de la propiedad codigoProducto.
     * 
     */
    public int getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * Define el valor de la propiedad codigoProducto.
     * 
     */
    public void setCodigoProducto(int value) {
        this.codigoProducto = value;
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
     * Obtiene el valor de la propiedad contenido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * Define el valor de la propiedad contenido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContenido(String value) {
        this.contenido = value;
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

    /**
     * Obtiene el valor de la propiedad detalle.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAgwTypeGuiaDetalle }
     *     
     */
    public ArrayOfAgwTypeGuiaDetalle getDetalle() {
        return detalle;
    }

    /**
     * Define el valor de la propiedad detalle.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAgwTypeGuiaDetalle }
     *     
     */
    public void setDetalle(ArrayOfAgwTypeGuiaDetalle value) {
        this.detalle = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentaContable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuentaContable() {
        return cuentaContable;
    }

    /**
     * Define el valor de la propiedad cuentaContable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuentaContable(String value) {
        this.cuentaContable = value;
    }

    /**
     * Obtiene el valor de la propiedad centroCostos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentroCostos() {
        return centroCostos;
    }

    /**
     * Define el valor de la propiedad centroCostos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentroCostos(String value) {
        this.centroCostos = value;
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
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
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
