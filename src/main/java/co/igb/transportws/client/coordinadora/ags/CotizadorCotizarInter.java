
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
 *         &lt;element name="p" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}Cotizador_cotizarInterIn"/>
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
    "p"
})
@XmlRootElement(name = "Cotizador_cotizarInter")
public class CotizadorCotizarInter {

    @XmlElement(required = true)
    protected CotizadorCotizarInterIn p;

    /**
     * Obtiene el valor de la propiedad p.
     * 
     * @return
     *     possible object is
     *     {@link CotizadorCotizarInterIn }
     *     
     */
    public CotizadorCotizarInterIn getP() {
        return p;
    }

    /**
     * Define el valor de la propiedad p.
     * 
     * @param value
     *     allowed object is
     *     {@link CotizadorCotizarInterIn }
     *     
     */
    public void setP(CotizadorCotizarInterIn value) {
        this.p = value;
    }

}
