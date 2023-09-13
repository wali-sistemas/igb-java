package co.igb.persistence.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author jguisao
 */
@Entity
@Table(name = "picking_express")
public class PickingExpress implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpicking_express")
    private Long id;
    @Basic(optional = false)
    @Column(name = "docEntry")
    private Integer docEntry;
    @Basic(optional = false)
    @Column(name = "docNum")
    private String docNum;
    @Basic(optional = false)
    @Column(name = "cardCode")
    private String cardCode;
    @Basic(optional = false)
    @Column(name = "lineNum")
    private Integer lineNum;
    @Basic(optional = false)
    @Column(name = "item_code")
    private String itemCode;
    @Basic(optional = false)
    @Column(name = "qty")
    private Integer qty;
    @Basic(optional = false)
    @Column(name = "whsCode")
    private Integer whsCode;
    @Basic(optional = false)
    @Column(name = "binCode")
    private String binCode;
    @Basic(optional = false)
    @Column(name = "binAbs")
    private Integer binAbs;
    @Basic(optional = false)
    @Column(name = "comments")
    private String comments;

    public PickingExpress() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDocEntry() {
        return docEntry;
    }

    public void setDocEntry(Integer docEntry) {
        this.docEntry = docEntry;
    }

    public String getDocNum() {
        return docNum;
    }

    public void setDocNum(String docNum) {
        this.docNum = docNum;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public Integer getLineNum() {
        return lineNum;
    }

    public void setLineNum(Integer lineNum) {
        this.lineNum = lineNum;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Integer getWhsCode() {
        return whsCode;
    }

    public void setWhsCode(Integer whsCode) {
        this.whsCode = whsCode;
    }

    public String getBinCode() {
        return binCode;
    }

    public void setBinCode(String binCode) {
        this.binCode = binCode;
    }

    public Integer getBinAbs() {
        return binAbs;
    }

    public void setBinAbs(Integer binAbs) {
        this.binAbs = binAbs;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final PickingExpress other = (PickingExpress) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PickingExpress{" +
                "id=" + id +
                ", docEntry=" + docEntry +
                ", docNum='" + docNum + '\'' +
                ", cardCode='" + cardCode + '\'' +
                ", lineNum=" + lineNum +
                ", itemCode='" + itemCode + '\'' +
                ", qty=" + qty +
                ", whsCode=" + whsCode +
                ", binCode='" + binCode + '\'' +
                ", binAbs=" + binAbs +
                ", comments='" + comments + '\'' +
                '}';
    }
}