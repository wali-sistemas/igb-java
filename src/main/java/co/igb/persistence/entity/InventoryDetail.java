package co.igb.persistence.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author YEIJARA
 */
@Entity
@Table(name = "inventory_detail")
public class InventoryDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "idinventario_detail")
    private Integer idInventoryDetail;
    @Basic(optional = false)
    @Column(name = "idinventory")
    private Integer idInventory;
    @Basic(optional = false)
    @Column(name = "item")
    private String item;
    @Basic(optional = false)
    @Column(name = "quantity")
    private Integer quantity;
    @Basic(optional = false)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date")
    private Date date;

    public InventoryDetail() {
    }

    public InventoryDetail(Integer idInventoryDetail) {
        this.idInventoryDetail = idInventoryDetail;
    }

    public Integer getIdInventoryDetail() {
        return idInventoryDetail;
    }

    public void setIdInventoryDetail(Integer idInventoryDetail) {
        this.idInventoryDetail = idInventoryDetail;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.idInventoryDetail);
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
        final InventoryDetail other = (InventoryDetail) obj;
        return Objects.equals(this.idInventoryDetail, other.idInventoryDetail);
    }

    @Override
    public String toString() {
        return "InventoryDetail{" + "idInventoryDetail=" + idInventoryDetail + ", idInventory=" + idInventory + ", item=" + item + ", quantity=" + quantity + ", date=" + date + '}';
    }
}
