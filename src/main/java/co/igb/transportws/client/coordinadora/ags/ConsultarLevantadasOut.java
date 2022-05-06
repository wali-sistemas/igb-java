
package co.igb.transportws.client.coordinadora.ags;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Consultar_levantadasOut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Consultar_levantadasOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="remisiones" type="{https://sandbox.coordinadora.com/ags/1.5/server.php}ArrayOfRemisiones_levantadas"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Consultar_levantadasOut", propOrder = {

})
public class ConsultarLevantadasOut {

    @XmlElement(required = true)
    protected ArrayOfRemisionesLevantadas remisiones;

    /**
     * Obtiene el valor de la propiedad remisiones.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRemisionesLevantadas }
     *     
     */
    public ArrayOfRemisionesLevantadas getRemisiones() {
        return remisiones;
    }

    /**
     * Define el valor de la propiedad remisiones.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRemisionesLevantadas }
     *     
     */
    public void setRemisiones(ArrayOfRemisionesLevantadas value) {
        this.remisiones = value;
    }

}
