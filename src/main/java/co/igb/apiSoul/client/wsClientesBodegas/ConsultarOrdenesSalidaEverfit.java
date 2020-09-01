
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
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contrasena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaOrdenDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaOrdenHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroBp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consecutivoSalida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ordenCompra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detalleOrden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tramitada" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "usuario",
    "contrasena",
    "fechaOrdenDesde",
    "fechaOrdenHasta",
    "numeroBp",
    "consecutivoSalida",
    "ordenCompra",
    "detalleOrden",
    "tramitada"
})
@XmlRootElement(name = "ConsultarOrdenesSalidaEverfit")
public class ConsultarOrdenesSalidaEverfit {

    protected String usuario;
    protected String contrasena;
    protected String fechaOrdenDesde;
    protected String fechaOrdenHasta;
    protected String numeroBp;
    protected String consecutivoSalida;
    protected String ordenCompra;
    protected String detalleOrden;
    protected boolean tramitada;

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
     * Obtiene el valor de la propiedad contrasena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Define el valor de la propiedad contrasena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrasena(String value) {
        this.contrasena = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaOrdenDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaOrdenDesde() {
        return fechaOrdenDesde;
    }

    /**
     * Define el valor de la propiedad fechaOrdenDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaOrdenDesde(String value) {
        this.fechaOrdenDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaOrdenHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaOrdenHasta() {
        return fechaOrdenHasta;
    }

    /**
     * Define el valor de la propiedad fechaOrdenHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaOrdenHasta(String value) {
        this.fechaOrdenHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroBp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroBp() {
        return numeroBp;
    }

    /**
     * Define el valor de la propiedad numeroBp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroBp(String value) {
        this.numeroBp = value;
    }

    /**
     * Obtiene el valor de la propiedad consecutivoSalida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsecutivoSalida() {
        return consecutivoSalida;
    }

    /**
     * Define el valor de la propiedad consecutivoSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsecutivoSalida(String value) {
        this.consecutivoSalida = value;
    }

    /**
     * Obtiene el valor de la propiedad ordenCompra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdenCompra() {
        return ordenCompra;
    }

    /**
     * Define el valor de la propiedad ordenCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdenCompra(String value) {
        this.ordenCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad detalleOrden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalleOrden() {
        return detalleOrden;
    }

    /**
     * Define el valor de la propiedad detalleOrden.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalleOrden(String value) {
        this.detalleOrden = value;
    }

    /**
     * Obtiene el valor de la propiedad tramitada.
     * 
     */
    public boolean isTramitada() {
        return tramitada;
    }

    /**
     * Define el valor de la propiedad tramitada.
     * 
     */
    public void setTramitada(boolean value) {
        this.tramitada = value;
    }

}
