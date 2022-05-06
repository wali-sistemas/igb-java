
package co.igb.transportws.client.coordinadora.ags;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Cotizador_cotizarInterOut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Cotizador_cotizarInterOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="volumen" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="peso_liquidado" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="total_seguro" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="total_combustible" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="total_area_extendida" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="recargo_sobredimension" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="tarifa" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="porcentaje_descuento" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="trm" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
@XmlType(name = "Cotizador_cotizarInterOut", propOrder = {

})
public class CotizadorCotizarInterOut {

    protected float peso;
    protected float volumen;
    @XmlElement(name = "peso_liquidado")
    protected float pesoLiquidado;
    @XmlElement(name = "total_seguro")
    protected float totalSeguro;
    @XmlElement(name = "total_combustible")
    protected float totalCombustible;
    @XmlElement(name = "total_area_extendida")
    protected float totalAreaExtendida;
    @XmlElement(name = "recargo_sobredimension")
    protected float recargoSobredimension;
    protected float tarifa;
    @XmlElement(name = "porcentaje_descuento")
    protected float porcentajeDescuento;
    protected float total;
    protected float trm;
    @XmlElement(name = "dias_entrega")
    protected int diasEntrega;

    /**
     * Obtiene el valor de la propiedad peso.
     * 
     */
    public float getPeso() {
        return peso;
    }

    /**
     * Define el valor de la propiedad peso.
     * 
     */
    public void setPeso(float value) {
        this.peso = value;
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
     * Obtiene el valor de la propiedad totalSeguro.
     * 
     */
    public float getTotalSeguro() {
        return totalSeguro;
    }

    /**
     * Define el valor de la propiedad totalSeguro.
     * 
     */
    public void setTotalSeguro(float value) {
        this.totalSeguro = value;
    }

    /**
     * Obtiene el valor de la propiedad totalCombustible.
     * 
     */
    public float getTotalCombustible() {
        return totalCombustible;
    }

    /**
     * Define el valor de la propiedad totalCombustible.
     * 
     */
    public void setTotalCombustible(float value) {
        this.totalCombustible = value;
    }

    /**
     * Obtiene el valor de la propiedad totalAreaExtendida.
     * 
     */
    public float getTotalAreaExtendida() {
        return totalAreaExtendida;
    }

    /**
     * Define el valor de la propiedad totalAreaExtendida.
     * 
     */
    public void setTotalAreaExtendida(float value) {
        this.totalAreaExtendida = value;
    }

    /**
     * Obtiene el valor de la propiedad recargoSobredimension.
     * 
     */
    public float getRecargoSobredimension() {
        return recargoSobredimension;
    }

    /**
     * Define el valor de la propiedad recargoSobredimension.
     * 
     */
    public void setRecargoSobredimension(float value) {
        this.recargoSobredimension = value;
    }

    /**
     * Obtiene el valor de la propiedad tarifa.
     * 
     */
    public float getTarifa() {
        return tarifa;
    }

    /**
     * Define el valor de la propiedad tarifa.
     * 
     */
    public void setTarifa(float value) {
        this.tarifa = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeDescuento.
     * 
     */
    public float getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    /**
     * Define el valor de la propiedad porcentajeDescuento.
     * 
     */
    public void setPorcentajeDescuento(float value) {
        this.porcentajeDescuento = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     */
    public float getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     */
    public void setTotal(float value) {
        this.total = value;
    }

    /**
     * Obtiene el valor de la propiedad trm.
     * 
     */
    public float getTrm() {
        return trm;
    }

    /**
     * Define el valor de la propiedad trm.
     * 
     */
    public void setTrm(float value) {
        this.trm = value;
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
