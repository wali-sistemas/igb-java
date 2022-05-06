
package co.igb.transportws.client.coordinadora.ags;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Remisiones_levantadas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Remisiones_levantadas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="codigo_remision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="referencia_unidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Remisiones_levantadas", propOrder = {

})
public class RemisionesLevantadas {

    @XmlElement(name = "codigo_remision", required = true)
    protected String codigoRemision;
    @XmlElement(name = "referencia_unidad", required = true)
    protected String referenciaUnidad;

    /**
     * Obtiene el valor de la propiedad codigoRemision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRemision() {
        return codigoRemision;
    }

    /**
     * Define el valor de la propiedad codigoRemision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRemision(String value) {
        this.codigoRemision = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaUnidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaUnidad() {
        return referenciaUnidad;
    }

    /**
     * Define el valor de la propiedad referenciaUnidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaUnidad(String value) {
        this.referenciaUnidad = value;
    }

}
