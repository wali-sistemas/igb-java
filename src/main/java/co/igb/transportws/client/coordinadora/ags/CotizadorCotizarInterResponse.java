
package co.igb.transportws.client.coordinadora.ags;

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
 *         &lt;element name="Cotizador_cotizarInterResult" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}Cotizador_cotizarInterOut"/>
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
    "cotizadorCotizarInterResult"
})
@XmlRootElement(name = "Cotizador_cotizarInterResponse")
public class CotizadorCotizarInterResponse {

    @XmlElement(name = "Cotizador_cotizarInterResult", required = true)
    protected CotizadorCotizarInterOut cotizadorCotizarInterResult;

    /**
     * Obtiene el valor de la propiedad cotizadorCotizarInterResult.
     * 
     * @return
     *     possible object is
     *     {@link CotizadorCotizarInterOut }
     *     
     */
    public CotizadorCotizarInterOut getCotizadorCotizarInterResult() {
        return cotizadorCotizarInterResult;
    }

    /**
     * Define el valor de la propiedad cotizadorCotizarInterResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CotizadorCotizarInterOut }
     *     
     */
    public void setCotizadorCotizarInterResult(CotizadorCotizarInterOut value) {
        this.cotizadorCotizarInterResult = value;
    }

}
