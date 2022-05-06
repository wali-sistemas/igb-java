
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
 *         &lt;element name="Cotizador_cotizarResult" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}Cotizador_cotizarOut"/>
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
    "cotizadorCotizarResult"
})
@XmlRootElement(name = "Cotizador_cotizarResponse")
public class CotizadorCotizarResponse {

    @XmlElement(name = "Cotizador_cotizarResult", required = true)
    protected CotizadorCotizarOut cotizadorCotizarResult;

    /**
     * Obtiene el valor de la propiedad cotizadorCotizarResult.
     * 
     * @return
     *     possible object is
     *     {@link CotizadorCotizarOut }
     *     
     */
    public CotizadorCotizarOut getCotizadorCotizarResult() {
        return cotizadorCotizarResult;
    }

    /**
     * Define el valor de la propiedad cotizadorCotizarResult.
     * 
     * @param value
     *     allowed object is
     *     {@link CotizadorCotizarOut }
     *     
     */
    public void setCotizadorCotizarResult(CotizadorCotizarOut value) {
        this.cotizadorCotizarResult = value;
    }

}
