
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Sifa_typeCotizacionFullTarifa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Sifa_typeCotizacionFullTarifa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="pesoLiquidado" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="fleteFijo" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="fleteVariable" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="fleteTotal" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="unidades" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="volumen" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="pesoReal" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="cotizadoTarifaPlena" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="detalles" type="{https://sandbox.coordinadora.com/agw/ws/guias/1.6/server.php}ArrayOfSifa_typeDetalleFullTarifa"/>
 *         &lt;element name="nivelesServicios" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="servicioComplementarios" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="insumos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sifa_typeCotizacionFullTarifa", propOrder = {

})
public class SifaTypeCotizacionFullTarifa {

    protected float pesoLiquidado;
    protected float fleteFijo;
    protected float fleteVariable;
    protected float fleteTotal;
    protected int unidades;
    protected float volumen;
    protected float pesoReal;
    protected boolean cotizadoTarifaPlena;
    @XmlElement(required = true)
    protected ArrayOfSifaTypeDetalleFullTarifa detalles;
    @XmlElement(required = true)
    protected String nivelesServicios;
    @XmlElement(required = true)
    protected String servicioComplementarios;
    @XmlElement(required = true)
    protected String insumos;

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
     * Obtiene el valor de la propiedad fleteTotal.
     * 
     */
    public float getFleteTotal() {
        return fleteTotal;
    }

    /**
     * Define el valor de la propiedad fleteTotal.
     * 
     */
    public void setFleteTotal(float value) {
        this.fleteTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad unidades.
     * 
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * Define el valor de la propiedad unidades.
     * 
     */
    public void setUnidades(int value) {
        this.unidades = value;
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
     * Obtiene el valor de la propiedad cotizadoTarifaPlena.
     * 
     */
    public boolean isCotizadoTarifaPlena() {
        return cotizadoTarifaPlena;
    }

    /**
     * Define el valor de la propiedad cotizadoTarifaPlena.
     * 
     */
    public void setCotizadoTarifaPlena(boolean value) {
        this.cotizadoTarifaPlena = value;
    }

    /**
     * Obtiene el valor de la propiedad detalles.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSifaTypeDetalleFullTarifa }
     *     
     */
    public ArrayOfSifaTypeDetalleFullTarifa getDetalles() {
        return detalles;
    }

    /**
     * Define el valor de la propiedad detalles.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSifaTypeDetalleFullTarifa }
     *     
     */
    public void setDetalles(ArrayOfSifaTypeDetalleFullTarifa value) {
        this.detalles = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelesServicios.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivelesServicios() {
        return nivelesServicios;
    }

    /**
     * Define el valor de la propiedad nivelesServicios.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivelesServicios(String value) {
        this.nivelesServicios = value;
    }

    /**
     * Obtiene el valor de la propiedad servicioComplementarios.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicioComplementarios() {
        return servicioComplementarios;
    }

    /**
     * Define el valor de la propiedad servicioComplementarios.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicioComplementarios(String value) {
        this.servicioComplementarios = value;
    }

    /**
     * Obtiene el valor de la propiedad insumos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsumos() {
        return insumos;
    }

    /**
     * Define el valor de la propiedad insumos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsumos(String value) {
        this.insumos = value;
    }

}
