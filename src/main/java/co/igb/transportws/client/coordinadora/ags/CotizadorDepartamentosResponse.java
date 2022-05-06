
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
 *         &lt;element name="Cotizador_departamentosResult" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}ArrayOfCotizador_departamentosout"/>
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
    "cotizadorDepartamentosResult"
})
@XmlRootElement(name = "Cotizador_departamentosResponse")
public class CotizadorDepartamentosResponse {

    @XmlElement(name = "Cotizador_departamentosResult", required = true)
    protected ArrayOfCotizadorDepartamentosout cotizadorDepartamentosResult;

    /**
     * Obtiene el valor de la propiedad cotizadorDepartamentosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCotizadorDepartamentosout }
     *     
     */
    public ArrayOfCotizadorDepartamentosout getCotizadorDepartamentosResult() {
        return cotizadorDepartamentosResult;
    }

    /**
     * Define el valor de la propiedad cotizadorDepartamentosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCotizadorDepartamentosout }
     *     
     */
    public void setCotizadorDepartamentosResult(ArrayOfCotizadorDepartamentosout value) {
        this.cotizadorDepartamentosResult = value;
    }

}
