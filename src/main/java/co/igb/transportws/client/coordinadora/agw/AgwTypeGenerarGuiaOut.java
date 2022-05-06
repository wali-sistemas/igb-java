
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_typeGenerarGuiaOut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_typeGenerarGuiaOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id_remision" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codigo_remision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pdf_guia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="url_terceros" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="referencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agw_typeGenerarGuiaOut", propOrder = {

})
public class AgwTypeGenerarGuiaOut {

    @XmlElement(name = "id_remision")
    protected int idRemision;
    @XmlElement(name = "codigo_remision", required = true)
    protected String codigoRemision;
    @XmlElement(name = "pdf_guia", required = true)
    protected String pdfGuia;
    @XmlElement(name = "url_terceros", required = true)
    protected String urlTerceros;
    @XmlElement(required = true)
    protected String referencia;

    /**
     * Obtiene el valor de la propiedad idRemision.
     * 
     */
    public int getIdRemision() {
        return idRemision;
    }

    /**
     * Define el valor de la propiedad idRemision.
     * 
     */
    public void setIdRemision(int value) {
        this.idRemision = value;
    }

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
     * Obtiene el valor de la propiedad pdfGuia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfGuia() {
        return pdfGuia;
    }

    /**
     * Define el valor de la propiedad pdfGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfGuia(String value) {
        this.pdfGuia = value;
    }

    /**
     * Obtiene el valor de la propiedad urlTerceros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlTerceros() {
        return urlTerceros;
    }

    /**
     * Define el valor de la propiedad urlTerceros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlTerceros(String value) {
        this.urlTerceros = value;
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

}
