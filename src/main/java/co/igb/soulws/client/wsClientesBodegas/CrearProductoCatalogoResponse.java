
package co.igb.soulws.client.wsClientesBodegas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CrearProductoCatalogoResult" type="{http://tempuri.org/}RespConsultarProductoCatalogo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "crearProductoCatalogoResult"
})
@XmlRootElement(name = "CrearProductoCatalogoResponse")
public class CrearProductoCatalogoResponse {

    @XmlElement(name = "CrearProductoCatalogoResult")
    protected RespConsultarProductoCatalogo crearProductoCatalogoResult;

    /**
     * Obtiene el valor de la propiedad crearProductoCatalogoResult.
     * 
     * @return
     *     possible object is
     *     {@link RespConsultarProductoCatalogo }
     *     
     */
    public RespConsultarProductoCatalogo getCrearProductoCatalogoResult() {
        return crearProductoCatalogoResult;
    }

    /**
     * Define el valor de la propiedad crearProductoCatalogoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RespConsultarProductoCatalogo }
     *     
     */
    public void setCrearProductoCatalogoResult(RespConsultarProductoCatalogo value) {
        this.crearProductoCatalogoResult = value;
    }

}
