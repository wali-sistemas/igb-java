package co.igb.persistence.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author dbotero
 */
@Entity
@Table(name = "packing_order_item")
public class PackingOrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpacking_order_item")
    private Long id;
    @JoinColumn(name = "idpacking_order", referencedColumnName = "idpacking_order")
    @ManyToOne(optional = false)
    private PackingOrder packingOrder;
    @Basic(optional = false)
    @Column(name = "item_code")
    private String itemCode;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "packingOrderItem", fetch = FetchType.EAGER)
    private List<PackingOrderItemBin> bins;

    public PackingOrderItem() {
        bins = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PackingOrder getPackingOrder() {
        return packingOrder;
    }

    public void setPackingOrder(PackingOrder packingOrder) {
        this.packingOrder = packingOrder;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public List<PackingOrderItemBin> getBins() {
        return bins;
    }

    public void setBins(List<PackingOrderItemBin> bins) {
        this.bins = bins;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final PackingOrderItem other = (PackingOrderItem) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PackingOrderItem{" + "id=" + id + ", itemCode=" + itemCode + '}';
    }

}
