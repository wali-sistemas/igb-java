
package co.igb.transportws.client.coordinadora.ags;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Recogidas_solicitar_alternaIn complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Recogidas_solicitar_alternaIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="observaciones_guia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modalidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fecha_recogida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ciudad_origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ciudad_destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombre_destinatario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nit_destinatario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="direccion_destinatario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telefono_destinatario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombre_empresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombre_contacto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="referencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nivel_servicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="guia_inicial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nit_cliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="div_cliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="persona_autoriza" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telefono_autoriza" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipo_notificacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destino_notificacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valor_declarado" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="unidades" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="centro_costos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cuenta_contable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datafono" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="agente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contenido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="equipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sub_equipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nit_remite" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Recogidas_solicitar_alternaIn", propOrder = {

})
public class RecogidasSolicitarAlternaIn {

    @XmlElement(name = "observaciones_guia", required = true)
    protected String observacionesGuia;
    protected int modalidad;
    @XmlElement(name = "fecha_recogida", required = true)
    protected String fechaRecogida;
    @XmlElement(name = "ciudad_origen", required = true)
    protected String ciudadOrigen;
    @XmlElement(name = "ciudad_destino", required = true)
    protected String ciudadDestino;
    @XmlElement(name = "nombre_destinatario", required = true)
    protected String nombreDestinatario;
    @XmlElement(name = "nit_destinatario", required = true)
    protected String nitDestinatario;
    @XmlElement(name = "direccion_destinatario", required = true)
    protected String direccionDestinatario;
    @XmlElement(name = "telefono_destinatario", required = true)
    protected String telefonoDestinatario;
    @XmlElement(name = "nombre_empresa", required = true)
    protected String nombreEmpresa;
    @XmlElement(name = "nombre_contacto", required = true)
    protected String nombreContacto;
    @XmlElement(required = true)
    protected String direccion;
    @XmlElement(required = true)
    protected String telefono;
    protected int producto;
    @XmlElement(required = true)
    protected String referencia;
    @XmlElement(name = "nivel_servicio", required = true)
    protected String nivelServicio;
    @XmlElement(name = "guia_inicial", required = true)
    protected String guiaInicial;
    @XmlElement(name = "nit_cliente", required = true)
    protected String nitCliente;
    @XmlElement(name = "div_cliente", required = true)
    protected String divCliente;
    @XmlElement(name = "persona_autoriza", required = true)
    protected String personaAutoriza;
    @XmlElement(name = "telefono_autoriza", required = true)
    protected String telefonoAutoriza;
    @XmlElement(name = "tipo_notificacion", required = true)
    protected String tipoNotificacion;
    @XmlElement(name = "destino_notificacion", required = true)
    protected String destinoNotificacion;
    @XmlElement(name = "valor_declarado")
    protected float valorDeclarado;
    protected int unidades;
    @XmlElement(required = true)
    protected String observaciones;
    protected int estado;
    @XmlElement(name = "centro_costos", required = true)
    protected String centroCostos;
    @XmlElement(name = "cuenta_contable", required = true)
    protected String cuentaContable;
    protected boolean datafono;
    @XmlElement(required = true)
    protected String agente;
    @XmlElement(required = true)
    protected String contenido;
    @XmlElement(required = true)
    protected String equipo;
    @XmlElement(name = "sub_equipo", required = true)
    protected String subEquipo;
    @XmlElement(name = "nit_remite", required = true)
    protected String nitRemite;
    @XmlElement(required = true)
    protected String apikey;
    @XmlElement(required = true)
    protected String clave;

    /**
     * Obtiene el valor de la propiedad observacionesGuia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacionesGuia() {
        return observacionesGuia;
    }

    /**
     * Define el valor de la propiedad observacionesGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacionesGuia(String value) {
        this.observacionesGuia = value;
    }

    /**
     * Obtiene el valor de la propiedad modalidad.
     * 
     */
    public int getModalidad() {
        return modalidad;
    }

    /**
     * Define el valor de la propiedad modalidad.
     * 
     */
    public void setModalidad(int value) {
        this.modalidad = value;
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
     * Obtiene el valor de la propiedad nombreEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    /**
     * Define el valor de la propiedad nombreEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEmpresa(String value) {
        this.nombreEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreContacto() {
        return nombreContacto;
    }

    /**
     * Define el valor de la propiedad nombreContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreContacto(String value) {
        this.nombreContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
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
     * Obtiene el valor de la propiedad nivelServicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivelServicio() {
        return nivelServicio;
    }

    /**
     * Define el valor de la propiedad nivelServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivelServicio(String value) {
        this.nivelServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad guiaInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuiaInicial() {
        return guiaInicial;
    }

    /**
     * Define el valor de la propiedad guiaInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuiaInicial(String value) {
        this.guiaInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad nitCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNitCliente() {
        return nitCliente;
    }

    /**
     * Define el valor de la propiedad nitCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNitCliente(String value) {
        this.nitCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad divCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivCliente() {
        return divCliente;
    }

    /**
     * Define el valor de la propiedad divCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivCliente(String value) {
        this.divCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad personaAutoriza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonaAutoriza() {
        return personaAutoriza;
    }

    /**
     * Define el valor de la propiedad personaAutoriza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonaAutoriza(String value) {
        this.personaAutoriza = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoAutoriza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoAutoriza() {
        return telefonoAutoriza;
    }

    /**
     * Define el valor de la propiedad telefonoAutoriza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoAutoriza(String value) {
        this.telefonoAutoriza = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoNotificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoNotificacion() {
        return tipoNotificacion;
    }

    /**
     * Define el valor de la propiedad tipoNotificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoNotificacion(String value) {
        this.tipoNotificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad destinoNotificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinoNotificacion() {
        return destinoNotificacion;
    }

    /**
     * Define el valor de la propiedad destinoNotificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinoNotificacion(String value) {
        this.destinoNotificacion = value;
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
     */
    public int getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     */
    public void setEstado(int value) {
        this.estado = value;
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
     * Obtiene el valor de la propiedad datafono.
     * 
     */
    public boolean isDatafono() {
        return datafono;
    }

    /**
     * Define el valor de la propiedad datafono.
     * 
     */
    public void setDatafono(boolean value) {
        this.datafono = value;
    }

    /**
     * Obtiene el valor de la propiedad agente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgente() {
        return agente;
    }

    /**
     * Define el valor de la propiedad agente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgente(String value) {
        this.agente = value;
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
     * Obtiene el valor de la propiedad equipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipo() {
        return equipo;
    }

    /**
     * Define el valor de la propiedad equipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipo(String value) {
        this.equipo = value;
    }

    /**
     * Obtiene el valor de la propiedad subEquipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubEquipo() {
        return subEquipo;
    }

    /**
     * Define el valor de la propiedad subEquipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubEquipo(String value) {
        this.subEquipo = value;
    }

    /**
     * Obtiene el valor de la propiedad nitRemite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNitRemite() {
        return nitRemite;
    }

    /**
     * Define el valor de la propiedad nitRemite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNitRemite(String value) {
        this.nitRemite = value;
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
