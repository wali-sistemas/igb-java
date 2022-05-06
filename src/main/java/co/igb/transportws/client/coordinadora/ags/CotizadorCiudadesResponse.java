
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
 *         &lt;element name="Cotizador_ciudadesResult" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}ArrayOfCotizador_ciudadesout"/>
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
    "cotizadorCiudadesResult"
})
@XmlRootElement(name = "Cotizador_ciudadesResponse")
public class CotizadorCiudadesResponse {

    @XmlElement(name = "Cotizador_ciudadesResult", required = true)
    protected ArrayOfCotizadorCiudadesout cotizadorCiudadesResult;

    /**
     * Obtiene el valor de la propiedad cotizadorCiudadesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCotizadorCiudadesout }
     *     
     */
    public ArrayOfCotizadorCiudadesout getCotizadorCiudadesResult() {
        return cotizadorCiudadesResult;
    }

    /**
     * Define el valor de la propiedad cotizadorCiudadesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCotizadorCiudadesout }
     *     
     */
    public void setCotizadorCiudadesResult(ArrayOfCotizadorCiudadesout value) {
        this.cotizadorCiudadesResult = value;
    }

}
