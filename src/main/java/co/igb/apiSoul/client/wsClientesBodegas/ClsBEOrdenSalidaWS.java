
package co.igb.apiSoul.client.wsClientesBodegas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clsBEOrdenSalidaWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clsBEOrdenSalidaWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Item" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoAlmacen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CiudadEnvio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoIata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Destinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoEmbalaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CantidadSalida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoBodega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NroDocTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PesoNeto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PesoBruto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsBEOrdenSalidaWS", propOrder = {
    "item",
    "codigoAlmacen",
    "ciudadEnvio",
    "codigoIata",
    "destinatario",
    "tipoEmbalaje",
    "codigoProducto",
    "cantidadSalida",
    "codigoBodega",
    "fileId",
    "nroDocTransporte",
    "pesoNeto",
    "pesoBruto"
})
public class ClsBEOrdenSalidaWS {

    @XmlElement(name = "Item")
    protected String item;
    @XmlElement(name = "CodigoAlmacen")
    protected String codigoAlmacen;
    @XmlElement(name = "CiudadEnvio")
    protected String ciudadEnvio;
    @XmlElement(name = "CodigoIata")
    protected String codigoIata;
    @XmlElement(name = "Destinatario")
    protected String destinatario;
    @XmlElement(name = "TipoEmbalaje")
    protected String tipoEmbalaje;
    @XmlElement(name = "CodigoProducto")
    protected String codigoProducto;
    @XmlElement(name = "CantidadSalida")
    protected String cantidadSalida;
    @XmlElement(name = "CodigoBodega")
    protected String codigoBodega;
    @XmlElement(name = "FileId")
    protected String fileId;
    @XmlElement(name = "NroDocTransporte")
    protected String nroDocTransporte;
    @XmlElement(name = "PesoNeto")
    protected String pesoNeto;
    @XmlElement(name = "PesoBruto")
    protected String pesoBruto;

    /**
     * Obtiene el valor de la propiedad item.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItem() {
        return item;
    }

    /**
     * Define el valor de la propiedad item.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItem(String value) {
        this.item = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoAlmacen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoAlmacen() {
        return codigoAlmacen;
    }

    /**
     * Define el valor de la propiedad codigoAlmacen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoAlmacen(String value) {
        this.codigoAlmacen = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudadEnvio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadEnvio() {
        return ciudadEnvio;
    }

    /**
     * Define el valor de la propiedad ciudadEnvio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadEnvio(String value) {
        this.ciudadEnvio = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoIata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoIata() {
        return codigoIata;
    }

    /**
     * Define el valor de la propiedad codigoIata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoIata(String value) {
        this.codigoIata = value;
    }

    /**
     * Obtiene el valor de la propiedad destinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinatario() {
        return destinatario;
    }

    /**
     * Define el valor de la propiedad destinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinatario(String value) {
        this.destinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoEmbalaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEmbalaje() {
        return tipoEmbalaje;
    }

    /**
     * Define el valor de la propiedad tipoEmbalaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEmbalaje(String value) {
        this.tipoEmbalaje = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * Define el valor de la propiedad codigoProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProducto(String value) {
        this.codigoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadSalida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadSalida() {
        return cantidadSalida;
    }

    /**
     * Define el valor de la propiedad cantidadSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadSalida(String value) {
        this.cantidadSalida = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoBodega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoBodega() {
        return codigoBodega;
    }

    /**
     * Define el valor de la propiedad codigoBodega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoBodega(String value) {
        this.codigoBodega = value;
    }

    /**
     * Obtiene el valor de la propiedad fileId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * Define el valor de la propiedad fileId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileId(String value) {
        this.fileId = value;
    }

    /**
     * Obtiene el valor de la propiedad nroDocTransporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroDocTransporte() {
        return nroDocTransporte;
    }

    /**
     * Define el valor de la propiedad nroDocTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroDocTransporte(String value) {
        this.nroDocTransporte = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoNeto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoNeto() {
        return pesoNeto;
    }

    /**
     * Define el valor de la propiedad pesoNeto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoNeto(String value) {
        this.pesoNeto = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoBruto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoBruto() {
        return pesoBruto;
    }

    /**
     * Define el valor de la propiedad pesoBruto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoBruto(String value) {
        this.pesoBruto = value;
    }

}
