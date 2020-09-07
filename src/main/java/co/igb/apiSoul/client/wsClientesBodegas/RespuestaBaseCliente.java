
package co.igb.apiSoul.client.wsClientesBodegas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespuestaBaseCliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaBaseCliente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RespValida" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MensajeError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoError" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaBaseCliente", propOrder = {
    "respValida",
    "mensajeError",
    "codigoError"
})
@XmlSeeAlso({
    RespConsultaInventarioBodega.class,
    RespOrdenSalida.class,
    RespConsultarEstadoPaquete.class,
    RespReporteConteo.class,
    RespSalidasEverfit.class,
    RespCargueInventario.class,
    RespConsultaInventario.class,
    RespConsultaConteo.class
})
public class RespuestaBaseCliente {

    @XmlElement(name = "RespValida")
    protected boolean respValida;
    @XmlElement(name = "MensajeError")
    protected String mensajeError;
    @XmlElement(name = "CodigoError")
    protected int codigoError;

    /**
     * Obtiene el valor de la propiedad respValida.
     * 
     */
    public boolean isRespValida() {
        return respValida;
    }

    /**
     * Define el valor de la propiedad respValida.
     * 
     */
    public void setRespValida(boolean value) {
        this.respValida = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajeError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeError() {
        return mensajeError;
    }

    /**
     * Define el valor de la propiedad mensajeError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeError(String value) {
        this.mensajeError = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoError.
     * 
     */
    public int getCodigoError() {
        return codigoError;
    }

    /**
     * Define el valor de la propiedad codigoError.
     * 
     */
    public void setCodigoError(int value) {
        this.codigoError = value;
    }

}
