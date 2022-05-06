
package co.igb.transportws.client.coordinadora.ags;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Seguimiento_guiaViculadaOut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Seguimiento_guiaViculadaOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="codigo_remision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipo_vinculo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipo_cuenta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Seguimiento_guiaViculadaOut", propOrder = {

})
public class SeguimientoGuiaViculadaOut {

    @XmlElement(name = "codigo_remision", required = true)
    protected String codigoRemision;
    @XmlElement(name = "tipo_vinculo")
    protected int tipoVinculo;
    protected int producto;
    @XmlElement(name = "tipo_cuenta")
    protected int tipoCuenta;

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
     * Obtiene el valor de la propiedad tipoVinculo.
     * 
     */
    public int getTipoVinculo() {
        return tipoVinculo;
    }

    /**
     * Define el valor de la propiedad tipoVinculo.
     * 
     */
    public void setTipoVinculo(int value) {
        this.tipoVinculo = value;
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
     * Obtiene el valor de la propiedad tipoCuenta.
     * 
     */
    public int getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * Define el valor de la propiedad tipoCuenta.
     * 
     */
    public void setTipoCuenta(int value) {
        this.tipoCuenta = value;
    }

}
