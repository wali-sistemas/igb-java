package co.igb.persistence.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author YEIJARA
 */
@Embeddable
public class StockTransferDetailPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "DocEntry")
    private int docEntry;
    @Basic(optional = false)
    @Column(name = "LineNum")
    private int lineNum;

    public StockTransferDetailPK() {
    }

    public StockTransferDetailPK(int docEntry, int lineNum) {
        this.docEntry = docEntry;
        this.lineNum = lineNum;
    }

    public int getDocEntry() {
        return docEntry;
    }

    public void setDocEntry(int docEntry) {
        this.docEntry = docEntry;
    }

    public int getLineNum() {
        return lineNum;
    }

    public void setLineNum(int lineNum) {
        this.lineNum = lineNum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) docEntry;
        hash += (int) lineNum;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StockTransferDetailPK)) {
            return false;
        }
        StockTransferDetailPK other = (StockTransferDetailPK) object;
        if (this.docEntry != other.docEntry) {
            return false;
        }
        return this.lineNum == other.lineNum;
    }

    @Override
    public String toString() {
        return "StockTransferDetailPK[ docEntry=" + docEntry + ", lineNum=" + lineNum + " ]";
    }
}
