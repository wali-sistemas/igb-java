
package co.igb.apiSoul.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para clsBEPaquetexSalida complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clsBEPaquetexSalida">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NroPaquete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Piloto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CentroCosto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Seccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aeropuerto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Compania" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstadoPaquete" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DescripcionEstadoPaquete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaEstadoPaquete" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ProductosxPaquete" type="{http://tempuri.org/}ArrayOfClsBEProductosxPaquete" minOccurs="0"/>
 *         &lt;element name="Seguimiento" type="{http://tempuri.org/}ArrayOfClsBEWsSeguimiento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsBEPaquetexSalida", propOrder = {
    "nroPaquete",
    "piloto",
    "bp",
    "centroCosto",
    "seccion",
    "aeropuerto",
    "ciudad",
    "compania",
    "pais",
    "telefono",
    "cargo",
    "estadoPaquete",
    "descripcionEstadoPaquete",
    "fechaEstadoPaquete",
    "productosxPaquete",
    "seguimiento"
})
public class ClsBEPaquetexSalida {

    @XmlElement(name = "NroPaquete")
    protected String nroPaquete;
    @XmlElement(name = "Piloto")
    protected String piloto;
    @XmlElement(name = "BP")
    protected String bp;
    @XmlElement(name = "CentroCosto")
    protected String centroCosto;
    @XmlElement(name = "Seccion")
    protected String seccion;
    @XmlElement(name = "Aeropuerto")
    protected String aeropuerto;
    @XmlElement(name = "Ciudad")
    protected String ciudad;
    @XmlElement(name = "Compania")
    protected String compania;
    @XmlElement(name = "Pais")
    protected String pais;
    @XmlElement(name = "Telefono")
    protected String telefono;
    @XmlElement(name = "Cargo")
    protected String cargo;
    @XmlElement(name = "EstadoPaquete")
    protected int estadoPaquete;
    @XmlElement(name = "DescripcionEstadoPaquete")
    protected String descripcionEstadoPaquete;
    @XmlElement(name = "FechaEstadoPaquete", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEstadoPaquete;
    @XmlElement(name = "ProductosxPaquete")
    protected ArrayOfClsBEProductosxPaquete productosxPaquete;
    @XmlElement(name = "Seguimiento")
    protected ArrayOfClsBEWsSeguimiento seguimiento;

    /**
     * Obtiene el valor de la propiedad nroPaquete.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroPaquete() {
        return nroPaquete;
    }

    /**
     * Define el valor de la propiedad nroPaquete.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroPaquete(String value) {
        this.nroPaquete = value;
    }

    /**
     * Obtiene el valor de la propiedad piloto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiloto() {
        return piloto;
    }

    /**
     * Define el valor de la propiedad piloto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiloto(String value) {
        this.piloto = value;
    }

    /**
     * Obtiene el valor de la propiedad bp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBP() {
        return bp;
    }

    /**
     * Define el valor de la propiedad bp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBP(String value) {
        this.bp = value;
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
     * Obtiene el valor de la propiedad ciudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Define el valor de la propiedad ciudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudad(String value) {
        this.ciudad = value;
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
     * Obtiene el valor de la propiedad estadoPaquete.
     * 
     */
    public int getEstadoPaquete() {
        return estadoPaquete;
    }

    /**
     * Define el valor de la propiedad estadoPaquete.
     * 
     */
    public void setEstadoPaquete(int value) {
        this.estadoPaquete = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionEstadoPaquete.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionEstadoPaquete() {
        return descripcionEstadoPaquete;
    }

    /**
     * Define el valor de la propiedad descripcionEstadoPaquete.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionEstadoPaquete(String value) {
        this.descripcionEstadoPaquete = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEstadoPaquete.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEstadoPaquete() {
        return fechaEstadoPaquete;
    }

    /**
     * Define el valor de la propiedad fechaEstadoPaquete.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEstadoPaquete(XMLGregorianCalendar value) {
        this.fechaEstadoPaquete = value;
    }

    /**
     * Obtiene el valor de la propiedad productosxPaquete.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsBEProductosxPaquete }
     *     
     */
    public ArrayOfClsBEProductosxPaquete getProductosxPaquete() {
        return productosxPaquete;
    }

    /**
     * Define el valor de la propiedad productosxPaquete.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsBEProductosxPaquete }
     *     
     */
    public void setProductosxPaquete(ArrayOfClsBEProductosxPaquete value) {
        this.productosxPaquete = value;
    }

    /**
     * Obtiene el valor de la propiedad seguimiento.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsBEWsSeguimiento }
     *     
     */
    public ArrayOfClsBEWsSeguimiento getSeguimiento() {
        return seguimiento;
    }

    /**
     * Define el valor de la propiedad seguimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsBEWsSeguimiento }
     *     
     */
    public void setSeguimiento(ArrayOfClsBEWsSeguimiento value) {
        this.seguimiento = value;
    }

}
