
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_typeRastreoSimpleOut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_typeRastreoSimpleOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="codigo_remision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigo_estado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descripcion_estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fecha_entrega" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hora_entrega" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="guia_vinculadas" type="{https://sandbox.coordinadora.com/agw/ws/guias/1.6/server.php}ArrayOfAgw_typeRastreoSimpleOutVinculadas"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agw_typeRastreoSimpleOut", propOrder = {

})
public class AgwTypeRastreoSimpleOut {

    @XmlElement(name = "codigo_remision", required = true)
    protected String codigoRemision;
    @XmlElement(name = "codigo_estado")
    protected int codigoEstado;
    @XmlElement(name = "descripcion_estado", required = true)
    protected String descripcionEstado;
    @XmlElement(name = "fecha_entrega", required = true)
    protected String fechaEntrega;
    @XmlElement(name = "hora_entrega", required = true)
    protected String horaEntrega;
    @XmlElement(name = "guia_vinculadas", required = true)
    protected ArrayOfAgwTypeRastreoSimpleOutVinculadas guiaVinculadas;

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
     * Obtiene el valor de la propiedad codigoEstado.
     * 
     */
    public int getCodigoEstado() {
        return codigoEstado;
    }

    /**
     * Define el valor de la propiedad codigoEstado.
     * 
     */
    public void setCodigoEstado(int value) {
        this.codigoEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionEstado() {
        return descripcionEstado;
    }

    /**
     * Define el valor de la propiedad descripcionEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionEstado(String value) {
        this.descripcionEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEntrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Define el valor de la propiedad fechaEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEntrega(String value) {
        this.fechaEntrega = value;
    }

    /**
     * Obtiene el valor de la propiedad horaEntrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraEntrega() {
        return horaEntrega;
    }

    /**
     * Define el valor de la propiedad horaEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraEntrega(String value) {
        this.horaEntrega = value;
    }

    /**
     * Obtiene el valor de la propiedad guiaVinculadas.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAgwTypeRastreoSimpleOutVinculadas }
     *     
     */
    public ArrayOfAgwTypeRastreoSimpleOutVinculadas getGuiaVinculadas() {
        return guiaVinculadas;
    }

    /**
     * Define el valor de la propiedad guiaVinculadas.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAgwTypeRastreoSimpleOutVinculadas }
     *     
     */
    public void setGuiaVinculadas(ArrayOfAgwTypeRastreoSimpleOutVinculadas value) {
        this.guiaVinculadas = value;
    }

}
