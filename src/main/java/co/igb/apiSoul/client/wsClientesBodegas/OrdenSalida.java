
package co.igb.apiSoul.client.wsClientesBodegas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pContrasena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pSede" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pPrioridad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pFechaOrden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pFechaEstimadaDespacho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pObservaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pNroPedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pCodigoSalida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aplicaPesoCatalogo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pOrdenSalida" type="{http://tempuri.org/}ArrayOfClsBEOrdenSalidaWS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pUsuario",
    "pContrasena",
    "pSede",
    "pPrioridad",
    "pFechaOrden",
    "pFechaEstimadaDespacho",
    "pObservaciones",
    "pNroPedido",
    "pCodigoSalida",
    "aplicaPesoCatalogo",
    "pOrdenSalida"
})
@XmlRootElement(name = "OrdenSalida")
public class OrdenSalida {

    protected String pUsuario;
    protected String pContrasena;
    protected String pSede;
    protected String pPrioridad;
    protected String pFechaOrden;
    protected String pFechaEstimadaDespacho;
    protected String pObservaciones;
    protected String pNroPedido;
    protected String pCodigoSalida;
    protected boolean aplicaPesoCatalogo;
    protected ArrayOfClsBEOrdenSalidaWS pOrdenSalida;

    /**
     * Obtiene el valor de la propiedad pUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPUsuario() {
        return pUsuario;
    }

    /**
     * Define el valor de la propiedad pUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPUsuario(String value) {
        this.pUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad pContrasena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPContrasena() {
        return pContrasena;
    }

    /**
     * Define el valor de la propiedad pContrasena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPContrasena(String value) {
        this.pContrasena = value;
    }

    /**
     * Obtiene el valor de la propiedad pSede.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSede() {
        return pSede;
    }

    /**
     * Define el valor de la propiedad pSede.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSede(String value) {
        this.pSede = value;
    }

    /**
     * Obtiene el valor de la propiedad pPrioridad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPrioridad() {
        return pPrioridad;
    }

    /**
     * Define el valor de la propiedad pPrioridad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPrioridad(String value) {
        this.pPrioridad = value;
    }

    /**
     * Obtiene el valor de la propiedad pFechaOrden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFechaOrden() {
        return pFechaOrden;
    }

    /**
     * Define el valor de la propiedad pFechaOrden.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFechaOrden(String value) {
        this.pFechaOrden = value;
    }

    /**
     * Obtiene el valor de la propiedad pFechaEstimadaDespacho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFechaEstimadaDespacho() {
        return pFechaEstimadaDespacho;
    }

    /**
     * Define el valor de la propiedad pFechaEstimadaDespacho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFechaEstimadaDespacho(String value) {
        this.pFechaEstimadaDespacho = value;
    }

    /**
     * Obtiene el valor de la propiedad pObservaciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPObservaciones() {
        return pObservaciones;
    }

    /**
     * Define el valor de la propiedad pObservaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPObservaciones(String value) {
        this.pObservaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad pNroPedido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNroPedido() {
        return pNroPedido;
    }

    /**
     * Define el valor de la propiedad pNroPedido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNroPedido(String value) {
        this.pNroPedido = value;
    }

    /**
     * Obtiene el valor de la propiedad pCodigoSalida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCodigoSalida() {
        return pCodigoSalida;
    }

    /**
     * Define el valor de la propiedad pCodigoSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCodigoSalida(String value) {
        this.pCodigoSalida = value;
    }

    /**
     * Obtiene el valor de la propiedad aplicaPesoCatalogo.
     * 
     */
    public boolean isAplicaPesoCatalogo() {
        return aplicaPesoCatalogo;
    }

    /**
     * Define el valor de la propiedad aplicaPesoCatalogo.
     * 
     */
    public void setAplicaPesoCatalogo(boolean value) {
        this.aplicaPesoCatalogo = value;
    }

    /**
     * Obtiene el valor de la propiedad pOrdenSalida.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsBEOrdenSalidaWS }
     *     
     */
    public ArrayOfClsBEOrdenSalidaWS getPOrdenSalida() {
        return pOrdenSalida;
    }

    /**
     * Define el valor de la propiedad pOrdenSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsBEOrdenSalidaWS }
     *     
     */
    public void setPOrdenSalida(ArrayOfClsBEOrdenSalidaWS value) {
        this.pOrdenSalida = value;
    }

}
