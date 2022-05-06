
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_detalleDespachoOut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_detalleDespachoOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="codigo_despacho" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="detalle" type="{https://sandbox.coordinadora.com/agw/ws/guias/1.6/server.php}ArrayOfAgw_detalleDespachoGuias"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agw_detalleDespachoOut", propOrder = {

})
public class AgwDetalleDespachoOut {

    @XmlElement(name = "codigo_despacho")
    protected int codigoDespacho;
    @XmlElement(required = true)
    protected ArrayOfAgwDetalleDespachoGuias detalle;

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
     * Obtiene el valor de la propiedad detalle.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAgwDetalleDespachoGuias }
     *     
     */
    public ArrayOfAgwDetalleDespachoGuias getDetalle() {
        return detalle;
    }

    /**
     * Define el valor de la propiedad detalle.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAgwDetalleDespachoGuias }
     *     
     */
    public void setDetalle(ArrayOfAgwDetalleDespachoGuias value) {
        this.detalle = value;
    }

}
