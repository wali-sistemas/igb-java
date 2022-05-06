
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_typeGenerarDespachoOut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_typeGenerarDespachoOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="impresion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigo_despacho" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_cliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nit_cliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="div_cliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agw_typeGenerarDespachoOut", propOrder = {

})
public class AgwTypeGenerarDespachoOut {

    @XmlElement(required = true)
    protected String url;
    @XmlElement(required = true)
    protected String impresion;
    @XmlElement(name = "codigo_despacho")
    protected int codigoDespacho;
    @XmlElement(name = "id_cliente")
    protected int idCliente;
    @XmlElement(name = "nit_cliente", required = true)
    protected String nitCliente;
    @XmlElement(name = "div_cliente", required = true)
    protected String divCliente;

    /**
     * Obtiene el valor de la propiedad url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Define el valor de la propiedad url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Obtiene el valor de la propiedad impresion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpresion() {
        return impresion;
    }

    /**
     * Define el valor de la propiedad impresion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpresion(String value) {
        this.impresion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoDespacho.
     * 
     */
    public int getCodigoDespacho() {
        return codigoDespacho;
    }

    /**
     * Define el valor de la propiedad codigoDespacho.
     * 
     */
    public void setCodigoDespacho(int value) {
        this.codigoDespacho = value;
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

}
