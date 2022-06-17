
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_typeEditarGuiaIn complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_typeEditarGuiaIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id_remision" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codigo_remision" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="ciudad_destinatario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telefono_destinatario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valor_declarado" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="codigo_cuenta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codigo_producto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="contenido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="referencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="detalle" type="{https://sandbox.coordinadora.com/agw/ws/guias/1.6/server.php}ArrayOfAgw_typeGuiaDetalle"/>
 *         &lt;element name="cuenta_contable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="centro_costos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="margen_izquierdo" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="margen_superior" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="id_rotulo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="formato_impresion" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Agw_typeEditarGuiaIn", propOrder = {

})
public class AgwTypeEditarGuiaIn {

    @XmlElement(name = "id_remision")
    protected int idRemision;
    @XmlElement(name = "codigo_remision", required = true)
    protected String codigoRemision;
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
    @XmlElement(name = "ciudad_destinatario", required = true)
    protected String ciudadDestinatario;
    @XmlElement(name = "telefono_destinatario", required = true)
    protected String telefonoDestinatario;
    @XmlElement(name = "valor_declarado")
    protected float valorDeclarado;
    @XmlElement(name = "codigo_cuenta")
    protected int codigoCuenta;
    @XmlElement(name = "codigo_producto")
    protected int codigoProducto;
    @XmlElement(required = true)
    protected String contenido;
    @XmlElement(required = true)
    protected String referencia;
    @XmlElement(required = true)
    protected String observaciones;
    @XmlElement(required = true)
    protected ArrayOfAgwTypeGuiaDetalle detalle;
    @XmlElement(name = "cuenta_contable", required = true)
    protected String cuentaContable;
    @XmlElement(name = "centro_costos", required = true)
    protected String centroCostos;
    @XmlElement(name = "margen_izquierdo")
    protected float margenIzquierdo;
    @XmlElement(name = "margen_superior")
    protected float margenSuperior;
    @XmlElement(name = "id_rotulo")
    protected int idRotulo;
    @XmlElement(name = "formato_impresion", required = true)
    protected String formatoImpresion;
    @XmlElement(required = true)
    protected String usuario;
    @XmlElement(required = true)
    protected String clave;

    /**
     * Obtiene el valor de la propiedad idRemision.
     * 
     */
    public int getIdRemision() {
        return idRemision;
    }

    /**
     * Define el valor de la propiedad idRemision.
     * 
     */
    public void setIdRemision(int value) {
        this.idRemision = value;
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
     * Obtiene el valor de la propiedad ciudadDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadDestinatario() {
        return ciudadDestinatario;
    }

    /**
     * Define el valor de la propiedad ciudadDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadDestinatario(String value) {
        this.ciudadDestinatario = value;
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
     * Obtiene el valor de la propiedad margenIzquierdo.
     * 
     */
    public float getMargenIzquierdo() {
        return margenIzquierdo;
    }

    /**
     * Define el valor de la propiedad margenIzquierdo.
     * 
     */
    public void setMargenIzquierdo(float value) {
        this.margenIzquierdo = value;
    }

    /**
     * Obtiene el valor de la propiedad margenSuperior.
     * 
     */
    public float getMargenSuperior() {
        return margenSuperior;
    }

    /**
     * Define el valor de la propiedad margenSuperior.
     * 
     */
    public void setMargenSuperior(float value) {
        this.margenSuperior = value;
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
     * Obtiene el valor de la propiedad formatoImpresion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatoImpresion() {
        return formatoImpresion;
    }

    /**
     * Define el valor de la propiedad formatoImpresion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatoImpresion(String value) {
        this.formatoImpresion = value;
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