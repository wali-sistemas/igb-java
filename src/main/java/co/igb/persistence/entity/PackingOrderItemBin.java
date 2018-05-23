package co.igb.persistence.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author dbotero
 */
@Entity
@Table(name = "packing_order_item_bin")
public class PackingOrderItemBin implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "idpacking_order_item_bin")
    private Long id;
    @JoinColumn(name = "idpacking_order_item", referencedColumnName = "idpacking_order_item")
    @ManyToOne(optional = false)
    private PackingOrderItem packingOrderItem;
    @Basic(optional = false)
    @Column(name = "bin_code")
    private String binCode;
    @Basic(optional = false)
    @Column(name = "bin_abs")
    private Long binAbs;
    @Basic(optional = false)
    @Column(name = "bin_name")
    private String binName;
    @Basic(optional = false)
    @Column(name = "picked_qty")
    private Integer pickedQty;
    @Basic(optional = false)
    @Column(name = "packed_qty")
    private Integer packedQty;

    public PackingOrderItemBin() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PackingOrderItem getPackingOrderItem() {
        return packingOrderItem;
    }

    public void setPackingOrderItem(PackingOrderItem packingOrderItem) {
        this.packingOrderItem = packingOrderItem;
    }

    public String getBinCode() {
        return binCode;
    }

    public void setBinCode(String binCode) {
        if (binCode != null) {
            this.binCode = binCode.trim();
        } else {
            this.binCode = null;
        }
    }

    public Long getBinAbs() {
        return binAbs;
    }

    public void setBinAbs(Long binAbs) {
        this.binAbs = binAbs;
    }

    public Integer getPickedQty() {
        return pickedQty;
    }

    public void setPickedQty(Integer pickedQty) {
        this.pickedQty = pickedQty;
    }

    public Integer getPackedQty() {
        return packedQty;
    }

    public void setPackedQty(Integer packedQty) {
        this.packedQty = packedQty;
    }

    public String getBinName() {
        return binName;
    }

    public void setBinName(String binName) {
        this.binName = binName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id);
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
        final PackingOrderItemBin other = (PackingOrderItemBin) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PackingOrderItemBin{" + "id=" + id + ", packingOrderItem=" + packingOrderItem + ", binCode=" + binCode + ", binAbs=" + binAbs + ", binName=" + binName + ", pickedQty=" + pickedQty + ", packedQty=" + packedQty + '}';
    }

}
