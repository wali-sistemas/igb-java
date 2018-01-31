package co.igb.persistence.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author YEIJARA
 */
@Entity
@Table(name = "inventory_difference")
public class InventoryDifference implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "idinventory_difference")
    private Integer idInventoryDifference;
    @Basic(optional = false)
    @Column(name = "idinventory")
    private Integer idInventory;
    @Basic(optional = false)
    @Column(name = "item")
    private String item;
    @Basic(optional = false)
    @Column(name = "expected")
    private Integer expected;
    @Basic(optional = false)
    @Column(name = "found")
    private Integer found;

    public InventoryDifference() {
    }

    public InventoryDifference(Integer idInventoryDifference, Integer idInventory, String item, Integer expected, Integer found) {
        this.idInventoryDifference = idInventoryDifference;
        this.idInventory = idInventory;
        this.item = item;
        this.expected = expected;
        this.found = found;
    }

    public Integer getIdInventoryDifference() {
        return idInventoryDifference;
    }

    public void setIdInventoryDifference(Integer idInventoryDifference) {
        this.idInventoryDifference = idInventoryDifference;
    }

    public Integer getIdInventory() {
        return idInventory;
    }

    public void setIdInventory(Integer idInventory) {
        this.idInventory = idInventory;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getExpected() {
        return expected;
    }

    public void setExpected(Integer expected) {
        this.expected = expected;
    }

    public Integer getFound() {
        return found;
    }

    public void setFound(Integer found) {
        this.found = found;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.idInventoryDifference);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InventoryDifference other = (InventoryDifference) obj;
        return Objects.equals(this.idInventoryDifference, other.idInventoryDifference);
    }

    @Override
    public String toString() {
        return "InventoryDifference{" + "idInventoryDifference=" + idInventoryDifference + ", idInventory=" + idInventory + ", item=" + item + ", expected=" + expected + ", found=" + found + '}';
    }
}
