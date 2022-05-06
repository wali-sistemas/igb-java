
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_typeSugerirSifaIn complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_typeSugerirSifaIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="detalle" type="{https://sandbox.coordinadora.com/agw/ws/guias/1.6/server.php}ArrayOfAgw_typeGuiaDetalle"/>
 *         &lt;element name="nivel_servicio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="recaudos" type="{https://sandbox.coordinadora.com/agw/ws/guias/1.6/server.php}ArrayOfAgw_typeGuiaDetalleRecaudo"/>
 *         &lt;element name="cnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cdiv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rcodigo_cm_ciudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dcodigo_cm_ciudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigo_cuenta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="valor_declarado" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="liquidacion_enguia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="liquidacion_endespacho" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigo_producto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agw_typeSugerirSifaIn", propOrder = {

})
public class AgwTypeSugerirSifaIn {

    @XmlElement(required = true)
    protected ArrayOfAgwTypeGuiaDetalle detalle;
    @XmlElement(name = "nivel_servicio")
    protected int nivelServicio;
    @XmlElement(required = true)
    protected ArrayOfAgwTypeGuiaDetalleRecaudo recaudos;
    @XmlElement(required = true)
    protected String cnit;
    @XmlElement(required = true)
    protected String cdiv;
    @XmlElement(name = "rcodigo_cm_ciudad", required = true)
    protected String rcodigoCmCiudad;
    @XmlElement(name = "dcodigo_cm_ciudad", required = true)
    protected String dcodigoCmCiudad;
    @XmlElement(name = "codigo_cuenta")
    protected int codigoCuenta;
    @XmlElement(name = "valor_declarado")
    protected float valorDeclarado;
    @XmlElement(name = "liquidacion_enguia", required = true)
    protected String liquidacionEnguia;
    @XmlElement(name = "liquidacion_endespacho", required = true)
    protected String liquidacionEndespacho;
    @XmlElement(name = "codigo_producto")
    protected int codigoProducto;
    @XmlElement(required = true)
    protected String token;

    /**
     * Obtiene el valor de la propiedad detalle.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAgwTypeGuiaDetalle }
     *     
     */
    public ArrayOfAgwTypeGuiaDetalle getDetalle() {
        return detalle;
    }

    /**
     * Define el valor de la propiedad detalle.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAgwTypeGuiaDetalle }
     *     
     */
    public void setDetalle(ArrayOfAgwTypeGuiaDetalle value) {
        this.detalle = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelServicio.
     * 
     */
    public int getNivelServicio() {
        return nivelServicio;
    }

    /**
     * Define el valor de la propiedad nivelServicio.
     * 
     */
    public void setNivelServicio(int value) {
        this.nivelServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad recaudos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAgwTypeGuiaDetalleRecaudo }
     *     
     */
    public ArrayOfAgwTypeGuiaDetalleRecaudo getRecaudos() {
        return recaudos;
    }

    /**
     * Define el valor de la propiedad recaudos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAgwTypeGuiaDetalleRecaudo }
     *     
     */
    public void setRecaudos(ArrayOfAgwTypeGuiaDetalleRecaudo value) {
        this.recaudos = value;
    }

    /**
     * Obtiene el valor de la propiedad cnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnit() {
        return cnit;
    }

    /**
     * Define el valor de la propiedad cnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnit(String value) {
        this.cnit = value;
    }

    /**
     * Obtiene el valor de la propiedad cdiv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdiv() {
        return cdiv;
    }

    /**
     * Define el valor de la propiedad cdiv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdiv(String value) {
        this.cdiv = value;
    }

    /**
     * Obtiene el valor de la propiedad rcodigoCmCiudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcodigoCmCiudad() {
        return rcodigoCmCiudad;
    }

    /**
     * Define el valor de la propiedad rcodigoCmCiudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcodigoCmCiudad(String value) {
        this.rcodigoCmCiudad = value;
    }

    /**
     * Obtiene el valor de la propiedad dcodigoCmCiudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcodigoCmCiudad() {
        return dcodigoCmCiudad;
    }

    /**
     * Define el valor de la propiedad dcodigoCmCiudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcodigoCmCiudad(String value) {
        this.dcodigoCmCiudad = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCuenta.
     * 
     */
    public int getCodigoCuenta() {
        return codigoCuenta;
    }

    /**
     * Define el valor de la propiedad codigoCuenta.
     * 
     */
    public void setCodigoCuenta(int value) {
        this.codigoCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad valorDeclarado.
     * 
     */
    public float getValorDeclarado() {
        return valorDeclarado;
    }

    /**
     * Define el valor de la propiedad valorDeclarado.
     * 
     */
    public void setValorDeclarado(float value) {
        this.valorDeclarado = value;
    }

    /**
     * Obtiene el valor de la propiedad liquidacionEnguia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiquidacionEnguia() {
        return liquidacionEnguia;
    }

    /**
     * Define el valor de la propiedad liquidacionEnguia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiquidacionEnguia(String value) {
        this.liquidacionEnguia = value;
    }

    /**
     * Obtiene el valor de la propiedad liquidacionEndespacho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiquidacionEndespacho() {
        return liquidacionEndespacho;
    }

    /**
     * Define el valor de la propiedad liquidacionEndespacho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiquidacionEndespacho(String value) {
        this.liquidacionEndespacho = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoProducto.
     * 
     */
    public int getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * Define el valor de la propiedad codigoProducto.
     * 
     */
    public void setCodigoProducto(int value) {
        this.codigoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Define el valor de la propiedad token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

}
