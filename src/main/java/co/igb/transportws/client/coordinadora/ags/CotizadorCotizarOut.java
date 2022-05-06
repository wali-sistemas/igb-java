
package co.igb.transportws.client.coordinadora.ags;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Cotizador_cotizarOut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Cotizador_cotizarOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="flete_total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="flete_fijo" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="flete_variable" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="peso_liquidado" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="otros_valores" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ubl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="volumen" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="peso_real" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="dias_entrega" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cotizador_cotizarOut", propOrder = {

})
public class CotizadorCotizarOut {

    @XmlElement(name = "flete_total")
    protected int fleteTotal;
    @XmlElement(name = "flete_fijo")
    protected float fleteFijo;
    @XmlElement(name = "flete_variable")
    protected float fleteVariable;
    @XmlElement(name = "peso_liquidado")
    protected float pesoLiquidado;
    @XmlElement(name = "otros_valores")
    protected float otrosValores;
    protected int producto;
    protected int ubl;
    protected float volumen;
    @XmlElement(name = "peso_real")
    protected float pesoReal;
    @XmlElement(name = "dias_entrega")
    protected int diasEntrega;

    /**
     * Obtiene el valor de la propiedad fleteTotal.
     * 
     */
    public int getFleteTotal() {
        return fleteTotal;
    }

    /**
     * Define el valor de la propiedad fleteTotal.
     * 
     */
    public void setFleteTotal(int value) {
        this.fleteTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad fleteFijo.
     * 
     */
    public float getFleteFijo() {
        return fleteFijo;
    }

    /**
     * Define el valor de la propiedad fleteFijo.
     * 
     */
    public void setFleteFijo(float value) {
        this.fleteFijo = value;
    }

    /**
     * Obtiene el valor de la propiedad fleteVariable.
     * 
     */
    public float getFleteVariable() {
        return fleteVariable;
    }

    /**
     * Define el valor de la propiedad fleteVariable.
     * 
     */
    public void setFleteVariable(float value) {
        this.fleteVariable = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoLiquidado.
     * 
     */
    public float getPesoLiquidado() {
        return pesoLiquidado;
    }

    /**
     * Define el valor de la propiedad pesoLiquidado.
     * 
     */
    public void setPesoLiquidado(float value) {
        this.pesoLiquidado = value;
    }

    /**
     * Obtiene el valor de la propiedad otrosValores.
     * 
     */
    public float getOtrosValores() {
        return otrosValores;
    }

    /**
     * Define el valor de la propiedad otrosValores.
     * 
     */
    public void setOtrosValores(float value) {
        this.otrosValores = value;
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
     * Obtiene el valor de la propiedad ubl.
     * 
     */
    public int getUbl() {
        return ubl;
    }

    /**
     * Define el valor de la propiedad ubl.
     * 
     */
    public void setUbl(int value) {
        this.ubl = value;
    }

    /**
     * Obtiene el valor de la propiedad volumen.
     * 
     */
    public float getVolumen() {
        return volumen;
    }

    /**
     * Define el valor de la propiedad volumen.
     * 
     */
    public void setVolumen(float value) {
        this.volumen = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoReal.
     * 
     */
    public float getPesoReal() {
        return pesoReal;
    }

    /**
     * Define el valor de la propiedad pesoReal.
     * 
     */
    public void setPesoReal(float value) {
        this.pesoReal = value;
    }

    /**
     * Obtiene el valor de la propiedad diasEntrega.
     * 
     */
    public int getDiasEntrega() {
        return diasEntrega;
    }

    /**
     * Define el valor de la propiedad diasEntrega.
     * 
     */
    public void setDiasEntrega(int value) {
        this.diasEntrega = value;
    }

}
