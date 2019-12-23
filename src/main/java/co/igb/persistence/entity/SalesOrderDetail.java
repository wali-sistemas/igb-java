package co.igb.persistence.entity;

/**
 * @author jguisao
 */

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/***SAP***/
@Entity
@Table(name = "RDR1")
public class SalesOrderDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DocEntry")
    private Integer docEntry;
    @Basic(optional = false)
    @Column(name = "ItemCode")
    private String itemCode;
    @Basic(optional = false)
    @Column(name = "LineStatus")
    private char lineStatus;
    @Basic(optional = false)
    @Column(name = "Quantity")
    private Integer quantity;
    @Basic(optional = false)
    @Column(name = "OpenQty")
    private Integer openQty;
    @Basic(optional = false)
    @Column(name = "OpenCreQty")
    private Integer openCreQty;
    @Basic(optional = false)
    @Column(name = "PackQty")
    private Integer packQty;
    @Basic(optional = false)
    @Column(name = "PcQuantity")
    private Integer pcQuantity;
    @Basic(optional = false)
    @Column(name = "InvQty")
    private Integer invQty;
    @Basic(optional = false)
    @Column(name = "OpenInvQty")
    private Integer openInvQty;
    @Basic(optional = false)
    @Column(name = "OpenSum")
    private BigDecimal openSum;
    @Basic(optional = false)
    @Column(name = "TotalSumSy")
    private BigDecimal totalSumSy;
    @Basic(optional = false)
    @Column(name = "OpenSumSys")
    private BigDecimal openSumSys;
    @Basic(optional = false)
    @Column(name = "u_Picking")
    private String uPicking;
    @Basic(optional = false)
    @Column(name = "LineTotal")
    private BigDecimal lineTotal;

    public SalesOrderDetail() {
    }

    public SalesOrderDetail(Integer docEntry, String itemCode, String uPicking, char lineStatus, Integer quantity, Integer openQty, Integer openCreQty, Integer packQty, Integer pcQuantity, Integer invQty, Integer openInvQty, BigDecimal openSum, BigDecimal totalSumSy, BigDecimal openSumSys, BigDecimal lineTotal) {
        this.docEntry = docEntry;
        this.itemCode = itemCode;
        this.uPicking = uPicking;
        this.lineStatus = lineStatus;
        this.quantity = quantity;
        this.openQty = openQty;
        this.openCreQty = openCreQty;
        this.packQty = packQty;
        this.pcQuantity = pcQuantity;
        this.invQty = invQty;
        this.openInvQty = openInvQty;
        this.openSum = openSum;
        this.totalSumSy = totalSumSy;
        this.openSumSys = openSumSys;
        this.lineTotal = lineTotal;
    }

    public Integer getDocEntry() {
        return docEntry;
    }

    public void setDocEntry(Integer docEntry) {
        this.docEntry = docEntry;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public char getLineStatus() {
        return lineStatus;
    }

    public void setLineStatus(char lineStatus) {
        this.lineStatus = lineStatus;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getOpenQty() {
        return openQty;
    }

    public void setOpenQty(Integer openQty) {
        this.openQty = openQty;
    }

    public BigDecimal getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(BigDecimal lineTotal) {
        this.lineTotal = lineTotal;
    }

    public Integer getOpenCreQty() {
        return openCreQty;
    }

    public void setOpenCreQty(Integer openCreQty) {
        this.openCreQty = openCreQty;
    }

    public Integer getPackQty() {
        return packQty;
    }

    public void setPackQty(Integer packQty) {
        this.packQty = packQty;
    }

    public Integer getPcQuantity() {
        return pcQuantity;
    }

    public void setPcQuantity(Integer pcQuantity) {
        this.pcQuantity = pcQuantity;
    }

    public Integer getInvQty() {
        return invQty;
    }

    public void setInvQty(Integer invQty) {
        this.invQty = invQty;
    }

    public Integer getOpenInvQty() {
        return openInvQty;
    }

    public void setOpenInvQty(Integer openInvQty) {
        this.openInvQty = openInvQty;
    }

    public BigDecimal getOpenSum() {
        return openSum;
    }

    public void setOpenSum(BigDecimal openSum) {
        this.openSum = openSum;
    }

    public BigDecimal getTotalSumSy() {
        return totalSumSy;
    }

    public void setTotalSumSy(BigDecimal totalSumSy) {
        this.totalSumSy = totalSumSy;
    }

    public BigDecimal getOpenSumSys() {
        return openSumSys;
    }

    public void setOpenSumSys(BigDecimal openSumSys) {
        this.openSumSys = openSumSys;
    }

    public String getuPicking() {
        return uPicking;
    }

    public void setuPicking(String uPicking) {
        this.uPicking = uPicking;
    }

    @Override
    public String toString() {
        return "SalesOrderDetail{" +
                "docEntry=" + docEntry +
                ", itemCode='" + itemCode + '\'' +
                ", uPicking='" + uPicking + '\'' +
                ", lineStatus=" + lineStatus +
                ", quantity=" + quantity +
                ", openQty=" + openQty +
                ", openCreQty=" + openCreQty +
                ", packQty=" + packQty +
                ", pcQuantity=" + pcQuantity +
                ", invQty=" + invQty +
                ", openInvQty=" + openInvQty +
                ", openSum=" + openSum +
                ", totalSumSy=" + totalSumSy +
                ", openSumSys=" + openSumSys +
                ", lineTotal=" + lineTotal +
                '}';
    }
}