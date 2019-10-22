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
    @Column(name = "LineTotal")
    private BigDecimal lineTotal;

    public SalesOrderDetail() {
    }

    public SalesOrderDetail(Integer docEntry, String itemCode, char lineStatus, Integer quantity, Integer openQty, BigDecimal lineTotal) {
        this.docEntry = docEntry;
        this.itemCode = itemCode;
        this.lineStatus = lineStatus;
        this.quantity = quantity;
        this.openQty = openQty;
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

    @Override
    public String toString() {
        return "SalesOrderDetail{" +
                "docEntry=" + docEntry +
                ", itemCode='" + itemCode + '\'' +
                ", lineStatus=" + lineStatus +
                ", quantity=" + quantity +
                ", openQty=" + openQty +
                ", lineTotal=" + lineTotal +
                '}';
    }
}