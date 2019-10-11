package co.igb.persistence.entity;

/**
 * @author jguisao
 */

import javax.persistence.*;
import java.io.Serializable;

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

    public SalesOrderDetail() {
    }

    public SalesOrderDetail(Integer docEntry, String itemCode, char lineStatus, Integer quantity, Integer openQty) {
        this.docEntry = docEntry;
        this.itemCode = itemCode;
        this.lineStatus = lineStatus;
        this.quantity = quantity;
        this.openQty = openQty;
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
        openQty = openQty;
    }

    @Override
    public String toString() {
        return "SalesOrderDetail{" +
                "docEntry=" + docEntry +
                ", itemCode='" + itemCode + '\'' +
                ", lineStatus=" + lineStatus +
                ", quantity=" + quantity +
                ", OpenQty=" + openQty +
                '}';
    }
}