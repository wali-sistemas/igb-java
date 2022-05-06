
package co.igb.soulws.client.wsClientesBodegas;

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
 *         &lt;element name="pDocumentoTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pNroOrdenCompra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pCargueInventario" type="{http://tempuri.org/}ArrayOfClsBECargueInventarioWS" minOccurs="0"/>
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
    "pDocumentoTransporte",
    "pNroOrdenCompra",
    "pCargueInventario"
})
@XmlRootElement(name = "CargueInventario")
public class CargueInventario {

    protected String pUsuario;
    protected String pContrasena;
    protected String pDocumentoTransporte;
    protected String pNroOrdenCompra;
    protected ArrayOfClsBECargueInventarioWS pCargueInventario;

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
     * Obtiene el valor de la propiedad pDocumentoTransporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDocumentoTransporte() {
        return pDocumentoTransporte;
    }

    /**
     * Define el valor de la propiedad pDocumentoTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDocumentoTransporte(String value) {
        this.pDocumentoTransporte = value;
    }

    /**
     * Obtiene el valor de la propiedad pNroOrdenCompra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNroOrdenCompra() {
        return pNroOrdenCompra;
    }

    /**
     * Define el valor de la propiedad pNroOrdenCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNroOrdenCompra(String value) {
        this.pNroOrdenCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad pCargueInventario.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsBECargueInventarioWS }
     *     
     */
    public ArrayOfClsBECargueInventarioWS getPCargueInventario() {
        return pCargueInventario;
    }

    /**
     * Define el valor de la propiedad pCargueInventario.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsBECargueInventarioWS }
     *     
     */
    public void setPCargueInventario(ArrayOfClsBECargueInventarioWS value) {
        this.pCargueInventario = value;
    }

}
