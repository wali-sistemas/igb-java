package co.igb.persistence.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author YEIJARA
 */
@Entity
@Table(name = "OIBQ")
public class SaldoUbicacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "AbsEntry")
    private Integer absEntry;
    @Basic(optional = false)
    @Column(name = "ItemCode")
    private String itemCode;
    @JoinColumn(name = "BinAbs", referencedColumnName = "absEntry")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private UbicacionSAP ubicacion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "OnHandQty")
    private BigDecimal onHandQty;
    @Column(name = "WhsCode")
    private String whsCode;
    @Column(name = "Freezed")
    private Character freezed;
    @Column(name = "FreezeDoc")
    private Integer freezeDoc;

    public SaldoUbicacion() {
    }

    public SaldoUbicacion(Integer absEntry) {
        this.absEntry = absEntry;
    }

    public SaldoUbicacion(Integer absEntry, String itemCode, UbicacionSAP ubicacion) {
        this.absEntry = absEntry;
        this.itemCode = itemCode;
        this.ubicacion = ubicacion;
    }

    public SaldoUbicacion(Integer absEntry, String itemCode, UbicacionSAP ubicacion, BigDecimal onHandQty,
            String whsCode, Character freezed, Integer freezeDoc) {
        this.absEntry = absEntry;
        this.itemCode = itemCode;
        this.ubicacion = ubicacion;
        this.onHandQty = onHandQty;
        this.whsCode = whsCode;
        this.freezed = freezed;
        this.freezeDoc = freezeDoc;
    }

    public Integer getAbsEntry() {
        return absEntry;
    }

    public void setAbsEntry(Integer absEntry) {
        this.absEntry = absEntry;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public UbicacionSAP getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(UbicacionSAP ubicacion) {
        this.ubicacion = ubicacion;
    }

    public BigDecimal getOnHandQty() {
        return onHandQty;
    }

    public void setOnHandQty(BigDecimal onHandQty) {
        this.onHandQty = onHandQty;
    }

    public String getWhsCode() {
        return whsCode;
    }

    public void setWhsCode(String whsCode) {
        this.whsCode = whsCode;
    }

    public Character getFreezed() {
        return freezed;
    }

    public void setFreezed(Character freezed) {
        this.freezed = freezed;
    }

    public Integer getFreezeDoc() {
        return freezeDoc;
    }

    public void setFreezeDoc(Integer freezeDoc) {
        this.freezeDoc = freezeDoc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (absEntry != null ? absEntry.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SaldoUbicacion)) {
            return false;
        }
        SaldoUbicacion other = (SaldoUbicacion) object;
        return !((this.absEntry == null && other.absEntry != null) || (this.absEntry != null && !this.absEntry.equals(other.absEntry)));
    }

    @Override
    public String toString() {
        return "co.matisses.sap.entity.SaldoUbicacion[ absEntry=" + absEntry + " ]";
    }
}
