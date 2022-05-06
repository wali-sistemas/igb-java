
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_typeEditarGuiaOut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_typeEditarGuiaOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id_remision" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codigo_remision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pdf_guia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pdf_rotulo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agw_typeEditarGuiaOut", propOrder = {

})
public class AgwTypeEditarGuiaOut {

    @XmlElement(name = "id_remision")
    protected int idRemision;
    @XmlElement(name = "codigo_remision", required = true)
    protected String codigoRemision;
    @XmlElement(name = "pdf_guia", required = true)
    protected String pdfGuia;
    @XmlElement(name = "pdf_rotulo", required = true)
    protected String pdfRotulo;

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
     * Obtiene el valor de la propiedad pdfRotulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfRotulo() {
        return pdfRotulo;
    }

    /**
     * Define el valor de la propiedad pdfRotulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfRotulo(String value) {
        this.pdfRotulo = value;
    }

}
