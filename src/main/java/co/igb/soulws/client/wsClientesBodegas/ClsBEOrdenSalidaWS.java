
package co.igb.soulws.client.wsClientesBodegas;

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
 *         &lt;element name="DireccionEnvio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoEmbalaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CantidadSalida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnidadComercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoBodega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NroDocTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PesoNeto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PesoBruto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrdenCompra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cedula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CentroCosto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Seccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aeropuerto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Compania" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetalleOrden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transportador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NroGuia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiceContener" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoFlete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "direccionEnvio",
    "tipoEmbalaje",
    "codigoProducto",
    "cantidadSalida",
    "unidadComercial",
    "valorProducto",
    "codigoBodega",
    "fileId",
    "nroDocTransporte",
    "pesoNeto",
    "pesoBruto",
    "ordenCompra",
    "cedula",
    "centroCosto",
    "seccion",
    "aeropuerto",
    "compania",
    "pais",
    "cargo",
    "telefono",
    "detalleOrden",
    "area",
    "transportador",
    "nroGuia",
    "tipoDestino",
    "diceContener",
    "correo",
    "tipoFlete"
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
    @XmlElement(name = "DireccionEnvio")
    protected String direccionEnvio;
    @XmlElement(name = "TipoEmbalaje")
    protected String tipoEmbalaje;
    @XmlElement(name = "CodigoProducto")
    protected String codigoProducto;
    @XmlElement(name = "CantidadSalida")
    protected String cantidadSalida;
    @XmlElement(name = "UnidadComercial")
    protected String unidadComercial;
    @XmlElement(name = "ValorProducto")
    protected String valorProducto;
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
    @XmlElement(name = "OrdenCompra")
    protected String ordenCompra;
    @XmlElement(name = "Cedula")
    protected String cedula;
    @XmlElement(name = "CentroCosto")
    protected String centroCosto;
    @XmlElement(name = "Seccion")
    protected String seccion;
    @XmlElement(name = "Aeropuerto")
    protected String aeropuerto;
    @XmlElement(name = "Compania")
    protected String compania;
    @XmlElement(name = "Pais")
    protected String pais;
    @XmlElement(name = "Cargo")
    protected String cargo;
    @XmlElement(name = "Telefono")
    protected String telefono;
    @XmlElement(name = "DetalleOrden")
    protected String detalleOrden;
    @XmlElement(name = "Area")
    protected String area;
    @XmlElement(name = "Transportador")
    protected String transportador;
    @XmlElement(name = "NroGuia")
    protected String nroGuia;
    @XmlElement(name = "TipoDestino")
    protected String tipoDestino;
    @XmlElement(name = "DiceContener")
    protected String diceContener;
    @XmlElement(name = "Correo")
    protected String correo;
    @XmlElement(name = "TipoFlete")
    protected String tipoFlete;

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
     * Obtiene el valor de la propiedad direccionEnvio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    /**
     * Define el valor de la propiedad direccionEnvio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionEnvio(String value) {
        this.direccionEnvio = value;
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
     * Obtiene el valor de la propiedad unidadComercial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadComercial() {
        return unidadComercial;
    }

    /**
     * Define el valor de la propiedad unidadComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadComercial(String value) {
        this.unidadComercial = value;
    }

    /**
     * Obtiene el valor de la propiedad valorProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorProducto() {
        return valorProducto;
    }

    /**
     * Define el valor de la propiedad valorProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorProducto(String value) {
        this.valorProducto = value;
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
     * Obtiene el valor de la propiedad cedula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Define el valor de la propiedad cedula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCedula(String value) {
        this.cedula = value;
    }

    /**
     * Obtiene el valor de la propiedad centroCosto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentroCosto() {
        return centroCosto;
    }

    /**
     * Define el valor de la propiedad centroCosto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentroCosto(String value) {
        this.centroCosto = value;
    }

    /**
     * Obtiene el valor de la propiedad seccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeccion() {
        return seccion;
    }

    /**
     * Define el valor de la propiedad seccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeccion(String value) {
        this.seccion = value;
    }

    /**
     * Obtiene el valor de la propiedad aeropuerto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAeropuerto() {
        return aeropuerto;
    }

    /**
     * Define el valor de la propiedad aeropuerto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAeropuerto(String value) {
        this.aeropuerto = value;
    }

    /**
     * Obtiene el valor de la propiedad compania.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompania() {
        return compania;
    }

    /**
     * Define el valor de la propiedad compania.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompania(String value) {
        this.compania = value;
    }

    /**
     * Obtiene el valor de la propiedad pais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Define el valor de la propiedad pais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Obtiene el valor de la propiedad cargo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Define el valor de la propiedad cargo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargo(String value) {
        this.cargo = value;
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
     * Obtiene el valor de la propiedad area.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArea() {
        return area;
    }

    /**
     * Define el valor de la propiedad area.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * Obtiene el valor de la propiedad transportador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportador() {
        return transportador;
    }

    /**
     * Define el valor de la propiedad transportador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportador(String value) {
        this.transportador = value;
    }

    /**
     * Obtiene el valor de la propiedad nroGuia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroGuia() {
        return nroGuia;
    }

    /**
     * Define el valor de la propiedad nroGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroGuia(String value) {
        this.nroGuia = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDestino() {
        return tipoDestino;
    }

    /**
     * Define el valor de la propiedad tipoDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDestino(String value) {
        this.tipoDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad diceContener.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiceContener() {
        return diceContener;
    }

    /**
     * Define el valor de la propiedad diceContener.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiceContener(String value) {
        this.diceContener = value;
    }

    /**
     * Obtiene el valor de la propiedad correo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Define el valor de la propiedad correo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreo(String value) {
        this.correo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoFlete.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoFlete() {
        return tipoFlete;
    }

    /**
     * Define el valor de la propiedad tipoFlete.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoFlete(String value) {
        this.tipoFlete = value;
    }

}
