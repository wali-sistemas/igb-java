
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_typeGuiaDetalleRecaudo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_typeGuiaDetalleRecaudo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="referencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="valor_base_iva" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="valor_iva" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="forma_pago" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agw_typeGuiaDetalleRecaudo", propOrder = {

})
public class AgwTypeGuiaDetalleRecaudo {

    @XmlElement(required = true)
    protected String referencia;
    protected float valor;
    @XmlElement(name = "valor_base_iva")
    protected float valorBaseIva;
    @XmlElement(name = "valor_iva")
    protected float valorIva;
    @XmlElement(name = "forma_pago")
    protected int formaPago;

    /**
     * Obtiene el valor de la propiedad referencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Define el valor de la propiedad referencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencia(String value) {
        this.referencia = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     * 
     */
    public float getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     * 
     */
    public void setValor(float value) {
        this.valor = value;
    }

    /**
     * Obtiene el valor de la propiedad valorBaseIva.
     * 
     */
    public float getValorBaseIva() {
        return valorBaseIva;
    }

    /**
     * Define el valor de la propiedad valorBaseIva.
     * 
     */
    public void setValorBaseIva(float value) {
        this.valorBaseIva = value;
    }

    /**
     * Obtiene el valor de la propiedad valorIva.
     * 
     */
    public float getValorIva() {
        return valorIva;
    }

    /**
     * Define el valor de la propiedad valorIva.
     * 
     */
    public void setValorIva(float value) {
        this.valorIva = value;
    }

    /**
     * Obtiene el valor de la propiedad formaPago.
     * 
     */
    public int getFormaPago() {
        return formaPago;
    }

    /**
     * Define el valor de la propiedad formaPago.
     * 
     */
    public void setFormaPago(int value) {
        this.formaPago = value;
    }

}
