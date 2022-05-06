
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_typeNotificaciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_typeNotificaciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="tipo_medio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destino_notificacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agw_typeNotificaciones", propOrder = {

})
public class AgwTypeNotificaciones {

    @XmlElement(name = "tipo_medio", required = true)
    protected String tipoMedio;
    @XmlElement(name = "destino_notificacion", required = true)
    protected String destinoNotificacion;

    /**
     * Obtiene el valor de la propiedad tipoMedio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMedio() {
        return tipoMedio;
    }

    /**
     * Define el valor de la propiedad tipoMedio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMedio(String value) {
        this.tipoMedio = value;
    }

    /**
     * Obtiene el valor de la propiedad destinoNotificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinoNotificacion() {
        return destinoNotificacion;
    }

    /**
     * Define el valor de la propiedad destinoNotificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinoNotificacion(String value) {
        this.destinoNotificacion = value;
    }

}
