package co.igb.persistence.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
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
    @Column(name = "docNum")
    private String docNum;
    @Basic(optional = false)
    @Column(name = "cardCode")
    private String cardCode;
    @Basic(optional = false)
    @Column(name = "lineNum")
    private Integer lineNum;
    @Basic(optional = false)
    @Column(name = "itemCode")
    private String itemCode;
    @Basic(optional = false)
    @Column(name = "qty")
    private Integer qty;
    @Basic(optional = false)
    @Column(name = "whsCode")
    private String whsCode;
    @Basic(optional = false)
    @Column(name = "binCode")
    private String binCode;
    @Basic(optional = false)
    @Column(name = "binAbs")
    private Integer binAbs;
    @Basic(optional = false)
    @Column(name = "comments")
    private String comments;
    @Basic(optional = false)
    @Column(name = "companyName")
    private String companyName;
    @Basic(optional = false)
    @Column(name = "empId")
    private String empId;
    @Basic(optional = false)
    @Column(name = "docDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date docDate;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @Column(name = "empIdSet")
    private String empIdSet;
    @Basic(optional = false)
    @Column(name = "qtyConfirm")
    private Integer qtyConfirm;
    @Basic(optional = false)
    @Column(name = "docDateConfirm")
    private Date docDateConfirm;
    @Basic(optional = false)
    @Column(name = "observation")
    private String observation;
    @Basic(optional = false)
    @Column(name = "itemName")
    private String itemName;
    @Basic(optional = false)
    @Column(name = "binType")
    private String binType;
    @Basic(optional = false)
    @Column(name = "binSequence")
    private Integer binSequence;
    @Basic(optional = false)
    @Column(name = "lineStatus")
    private String lineStatus;
    @Basic(optional = false)
    @Column(name = "orderNum")
    private String orderNum;

    public PickingExpress() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getWhsCode() {
        return whsCode;
    }

    public void setWhsCode(String whsCode) {
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmpIdSet() {
        return empIdSet;
    }

    public void setEmpIdSet(String empIdSet) {
        this.empIdSet = empIdSet;
    }

    public Integer getQtyConfirm() {
        return qtyConfirm;
    }

    public void setQtyConfirm(Integer qtyConfirm) {
        this.qtyConfirm = qtyConfirm;
    }

    public Date getDocDateConfirm() {
        return docDateConfirm;
    }

    public void setDocDateConfirm(Date docDateConfirm) {
        this.docDateConfirm = docDateConfirm;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getBinType() {
        return binType;
    }

    public void setBinType(String binType) {
        this.binType = binType;
    }

    public Integer getBinSequence() {
        return binSequence;
    }

    public void setBinSequence(Integer binSequence) {
        this.binSequence = binSequence;
    }

    public String getLineStatus() {
        return lineStatus;
    }

    public void setLineStatus(String lineStatus) {
        this.lineStatus = lineStatus;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
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
                ", docNum='" + docNum + '\'' +
                ", cardCode='" + cardCode + '\'' +
                ", lineNum=" + lineNum +
                ", itemCode='" + itemCode + '\'' +
                ", qty=" + qty +
                ", whsCode='" + whsCode + '\'' +
                ", binCode='" + binCode + '\'' +
                ", binAbs=" + binAbs +
                ", comments='" + comments + '\'' +
                ", companyName='" + companyName + '\'' +
                ", empId='" + empId + '\'' +
                ", docDate=" + docDate +
                ", status='" + status + '\'' +
                ", empIdSet='" + empIdSet + '\'' +
                ", qtyConfirm=" + qtyConfirm +
                ", docDateConfirm=" + docDateConfirm +
                ", observation='" + observation + '\'' +
                ", itemName='" + itemName + '\'' +
                ", binType='" + binType + '\'' +
                ", binSequence=" + binSequence +
                ", lineStatus='" + lineStatus + '\'' +
                ", orderNum='" + orderNum + '\'' +
                '}';
    }
}