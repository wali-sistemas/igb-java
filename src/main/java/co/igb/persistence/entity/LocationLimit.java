package co.igb.persistence.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author YEIJARA
 */
@Entity
@Table(name = "dbo.[@LIMITES_UBICACION]")
public class LocationLimit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Code")
    private String code;
    @Column(name = "Name")
    private String name;
    @Column(name = "U_Ubicacion")
    private String ubicacion;
    @Column(name = "U_Item")
    private String item;
    @Column(name = "U_CantMinima")
    private Integer cantMaxima;
    @Column(name = "U_CantMaxima")
    private Integer cantMinima;

    public LocationLimit() {
    }

    public LocationLimit(String code) {
        this.code = code;
    }

    public LocationLimit(String code, String name, String ubicacion, String item, Integer cantMaxima, Integer cantMinima) {
        this.code = code;
        this.name = name;
        this.ubicacion = ubicacion;
        this.item = item;
        this.cantMaxima = cantMaxima;
        this.cantMinima = cantMinima;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getCantMaxima() {
        return cantMaxima;
    }

    public void setCantMaxima(Integer cantMaxima) {
        this.cantMaxima = cantMaxima;
    }

    public Integer getCantMinima() {
        return cantMinima;
    }

    public void setCantMinima(Integer cantMinima) {
        this.cantMinima = cantMinima;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LocationLimit)) {
            return false;
        }
        LocationLimit other = (LocationLimit) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.igb.persistence.entity.LimitesUbicacion[ code=" + code + " ]";
    }
}
