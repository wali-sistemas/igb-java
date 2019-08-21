package co.igb.persistence.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author jguisao
 */
/***SAP***/
@Entity
@Table(name = "OINV")
public class Invoice implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DocEntry")
    private Integer docEntry;
    @Basic(optional = false)
    @Column(name = "DocNum")
    private Integer docNum;
    @Basic(optional = false)
    @Column(name = "U_SHIPPING")
    private Character uShipping;

    public Invoice() {
    }

    public Integer getDocEntry() {
        return docEntry;
    }

    public void setDocEntry(Integer docEntry) {
        this.docEntry = docEntry;
    }

    public Integer getDocNum() {
        return docNum;
    }

    public void setDocNum(Integer docNum) {
        this.docNum = docNum;
    }

    public Character getuShipping() {
        return uShipping;
    }

    public void setuShipping(Character uShipping) {
        this.uShipping = uShipping;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (docEntry != null ? docEntry.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Warehouse)) {
            return false;
        }
        Invoice other = (Invoice) object;
        return !((this.docEntry == null && other.docEntry != null) || (this.docEntry != null && !this.docEntry.equals(other.docEntry)));
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "docEntry=" + docEntry +
                ", docNum='" + docNum + '\'' +
                ", uShipping=" + uShipping +
                '}';
    }
}