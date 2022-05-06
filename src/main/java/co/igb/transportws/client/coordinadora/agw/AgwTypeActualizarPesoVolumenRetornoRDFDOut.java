
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_typeActualizarPesoVolumenRetornoRDFDOut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_typeActualizarPesoVolumenRetornoRDFDOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id_con" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agw_typeActualizarPesoVolumenRetornoRDFDOut", propOrder = {

})
public class AgwTypeActualizarPesoVolumenRetornoRDFDOut {

    @XmlElement(name = "id_con")
    protected int idCon;

    /**
     * Obtiene el valor de la propiedad idCon.
     * 
     */
    public int getIdCon() {
        return idCon;
    }

    /**
     * Define el valor de la propiedad idCon.
     * 
     */
    public void setIdCon(int value) {
        this.idCon = value;
    }

}
