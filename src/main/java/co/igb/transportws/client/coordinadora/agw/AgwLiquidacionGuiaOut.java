
package co.igb.transportws.client.coordinadora.agw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agw_liquidacionGuiaOut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agw_liquidacionGuiaOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="flete_fijo" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="flete_variable" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="flete_total" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agw_liquidacionGuiaOut", propOrder = {

})
public class AgwLiquidacionGuiaOut {

    @XmlElement(name = "flete_fijo")
    protected float fleteFijo;
    @XmlElement(name = "flete_variable")
    protected float fleteVariable;
    @XmlElement(name = "flete_total")
    protected float fleteTotal;

    /**
     * Obtiene el valor de la propiedad fleteFijo.
     * 
     */
    public float getFleteFijo() {
        return fleteFijo;
    }

    /**
     * Define el valor de la propiedad fleteFijo.
     * 
     */
    public void setFleteFijo(float value) {
        this.fleteFijo = value;
    }

    /**
     * Obtiene el valor de la propiedad fleteVariable.
     * 
     */
    public float getFleteVariable() {
        return fleteVariable;
    }

    /**
     * Define el valor de la propiedad fleteVariable.
     * 
     */
    public void setFleteVariable(float value) {
        this.fleteVariable = value;
    }

    /**
     * Obtiene el valor de la propiedad fleteTotal.
     * 
     */
    public float getFleteTotal() {
        return fleteTotal;
    }

    /**
     * Define el valor de la propiedad fleteTotal.
     * 
     */
    public void setFleteTotal(float value) {
        this.fleteTotal = value;
    }

}
