
package co.igb.transportws.client.coordinadora.ags;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Rotulos_generarIn complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Rotulos_generarIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id_tipo_rotulo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="detalles" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}Rotulos_generar_detalleIn"/>
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
@XmlType(name = "Rotulos_generarIn", propOrder = {

})
public class RotulosGenerarIn {

    @XmlElement(name = "id_tipo_rotulo", required = true)
    protected String idTipoRotulo;
    @XmlElement(required = true)
    protected RotulosGenerarDetalleIn detalles;
    @XmlElement(required = true)
    protected String apikey;
    @XmlElement(required = true)
    protected String clave;

    /**
     * Obtiene el valor de la propiedad idTipoRotulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTipoRotulo() {
        return idTipoRotulo;
    }

    /**
     * Define el valor de la propiedad idTipoRotulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTipoRotulo(String value) {
        this.idTipoRotulo = value;
    }

    /**
     * Obtiene el valor de la propiedad detalles.
     * 
     * @return
     *     possible object is
     *     {@link RotulosGenerarDetalleIn }
     *     
     */
    public RotulosGenerarDetalleIn getDetalles() {
        return detalles;
    }

    /**
     * Define el valor de la propiedad detalles.
     * 
     * @param value
     *     allowed object is
     *     {@link RotulosGenerarDetalleIn }
     *     
     */
    public void setDetalles(RotulosGenerarDetalleIn value) {
        this.detalles = value;
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
