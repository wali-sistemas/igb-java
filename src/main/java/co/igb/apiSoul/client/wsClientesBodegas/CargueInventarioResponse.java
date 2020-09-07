
package co.igb.apiSoul.client.wsClientesBodegas;

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
 *         &lt;element name="CargueInventarioResult" type="{http://tempuri.org/}RespCargueInventario" minOccurs="0"/>
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
    "cargueInventarioResult"
})
@XmlRootElement(name = "CargueInventarioResponse")
public class CargueInventarioResponse {

    @XmlElement(name = "CargueInventarioResult")
    protected RespCargueInventario cargueInventarioResult;

    /**
     * Obtiene el valor de la propiedad cargueInventarioResult.
     * 
     * @return
     *     possible object is
     *     {@link RespCargueInventario }
     *     
     */
    public RespCargueInventario getCargueInventarioResult() {
        return cargueInventarioResult;
    }

    /**
     * Define el valor de la propiedad cargueInventarioResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RespCargueInventario }
     *     
     */
    public void setCargueInventarioResult(RespCargueInventario value) {
        this.cargueInventarioResult = value;
    }

}
