
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Sifa_typeProductoGuia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Sifa_typeProductoGuia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="codigoUbl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombreUbl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="abreviadoUbl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombreProducto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="abreviadoProducto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sifa_typeProductoGuia", propOrder = {

})
public class SifaTypeProductoGuia {

    protected int codigoUbl;
    @XmlElement(required = true)
    protected String nombreUbl;
    @XmlElement(required = true)
    protected String abreviadoUbl;
    protected int producto;
    @XmlElement(required = true)
    protected String nombreProducto;
    @XmlElement(required = true)
    protected String abreviadoProducto;

    /**
     * Obtiene el valor de la propiedad codigoUbl.
     * 
     */
    public int getCodigoUbl() {
        return codigoUbl;
    }

    /**
     * Define el valor de la propiedad codigoUbl.
     * 
     */
    public void setCodigoUbl(int value) {
        this.codigoUbl = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreUbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreUbl() {
        return nombreUbl;
    }

    /**
     * Define el valor de la propiedad nombreUbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreUbl(String value) {
        this.nombreUbl = value;
    }

    /**
     * Obtiene el valor de la propiedad abreviadoUbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbreviadoUbl() {
        return abreviadoUbl;
    }

    /**
     * Define el valor de la propiedad abreviadoUbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbreviadoUbl(String value) {
        this.abreviadoUbl = value;
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
     * Obtiene el valor de la propiedad nombreProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Define el valor de la propiedad nombreProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreProducto(String value) {
        this.nombreProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad abreviadoProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbreviadoProducto() {
        return abreviadoProducto;
    }

    /**
     * Define el valor de la propiedad abreviadoProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbreviadoProducto(String value) {
        this.abreviadoProducto = value;
    }

}
