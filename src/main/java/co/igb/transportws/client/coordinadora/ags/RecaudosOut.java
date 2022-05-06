
package co.igb.transportws.client.coordinadora.ags;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Recaudos_Out complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Recaudos_Out">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id_corte" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="referencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechahora_recaudo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anulado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="forma_pago" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="numero_aprobacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recaudos_Out", propOrder = {

})
public class RecaudosOut {

    @XmlElement(name = "id_corte")
    protected int idCorte;
    @XmlElement(required = true)
    protected String referencia;
    @XmlElement(name = "fechahora_recaudo", required = true)
    protected String fechahoraRecaudo;
    protected boolean anulado;
    @XmlElement(name = "forma_pago")
    protected int formaPago;
    protected float valor;
    @XmlElement(name = "numero_aprobacion")
    protected int numeroAprobacion;

    /**
     * Obtiene el valor de la propiedad idCorte.
     * 
     */
    public int getIdCorte() {
        return idCorte;
    }

    /**
     * Define el valor de la propiedad idCorte.
     * 
     */
    public void setIdCorte(int value) {
        this.idCorte = value;
    }

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
     * Obtiene el valor de la propiedad fechahoraRecaudo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechahoraRecaudo() {
        return fechahoraRecaudo;
    }

    /**
     * Define el valor de la propiedad fechahoraRecaudo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechahoraRecaudo(String value) {
        this.fechahoraRecaudo = value;
    }

    /**
     * Obtiene el valor de la propiedad anulado.
     * 
     */
    public boolean isAnulado() {
        return anulado;
    }

    /**
     * Define el valor de la propiedad anulado.
     * 
     */
    public void setAnulado(boolean value) {
        this.anulado = value;
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
     * Obtiene el valor de la propiedad numeroAprobacion.
     * 
     */
    public int getNumeroAprobacion() {
        return numeroAprobacion;
    }

    /**
     * Define el valor de la propiedad numeroAprobacion.
     * 
     */
    public void setNumeroAprobacion(int value) {
        this.numeroAprobacion = value;
    }

}
