package co.igb.dto;

import java.util.Date;

/**
 * @author jguisao
 */
public class PickingListExpressDTO {
    public Integer idPickingExpress;
    public String docNum;
    public String cardCode;
    public Integer lineNum;
    public String itemCode;
    public String itemName;
    public Integer qty;
    public String whsCode;
    public String binCode;
    public Integer binAbs;
    public String binType;
    public Integer binSequence;
    public String comments;
    public String companyName;
    public String empId;
    public Date docDate;
    public String status;
    public String empIdSet;
    public Integer qtyConfirm;
    public Date docDateConfirm;
    public String observation;
    public String orderNum;
    public String typeOrderNum;
    public Integer row;
    public Integer countRow;

    public PickingListExpressDTO() {
    }

    public PickingListExpressDTO(Integer idPickingExpress, String docNum, String cardCode, Integer lineNum, String itemCode, String itemName, Integer qty, String whsCode, String binCode, Integer binAbs, String binType, Integer binSequence, String comments, String companyName, String empId, Date docDate, String status, String empIdSet, Integer qtyConfirm, Date docDateConfirm, String observation, String orderNum, String typeOrderNum, Integer row, Integer countRow) {
        this.idPickingExpress = idPickingExpress;
        this.docNum = docNum;
        this.cardCode = cardCode;
        this.lineNum = lineNum;
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.qty = qty;
        this.whsCode = whsCode;
        this.binCode = binCode;
        this.binAbs = binAbs;
        this.binType = binType;
        this.binSequence = binSequence;
        this.comments = comments;
        this.companyName = companyName;
        this.empId = empId;
        this.docDate = docDate;
        this.status = status;
        this.empIdSet = empIdSet;
        this.qtyConfirm = qtyConfirm;
        this.docDateConfirm = docDateConfirm;
        this.observation = observation;
        this.orderNum = orderNum;
        this.typeOrderNum = typeOrderNum;
        this.row = row;
        this.countRow = countRow;
    }

    public Integer getIdPickingExpress() {
        return idPickingExpress;
    }

    public void setIdPickingExpress(Integer idPickingExpress) {
        this.idPickingExpress = idPickingExpress;
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

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getTypeOrderNum() {
        return typeOrderNum;
    }

    public void setTypeOrderNum(String typeOrderNum) {
        this.typeOrderNum = typeOrderNum;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getCountRow() {
        return countRow;
    }

    public void setCountRow(Integer countRow) {
        this.countRow = countRow;
    }

    @Override
    public String toString() {
        return "PickingListExpressDTO{" +
                "idPickingExpress=" + idPickingExpress +
                ", docNum='" + docNum + '\'' +
                ", cardCode='" + cardCode + '\'' +
                ", lineNum=" + lineNum +
                ", itemCode='" + itemCode + '\'' +
                ", itemName='" + itemName + '\'' +
                ", qty=" + qty +
                ", whsCode='" + whsCode + '\'' +
                ", binCode='" + binCode + '\'' +
                ", binAbs=" + binAbs +
                ", binType='" + binType + '\'' +
                ", binSequence=" + binSequence +
                ", comments='" + comments + '\'' +
                ", companyName='" + companyName + '\'' +
                ", empId='" + empId + '\'' +
                ", docDate=" + docDate +
                ", status='" + status + '\'' +
                ", empIdSet='" + empIdSet + '\'' +
                ", qtyConfirm=" + qtyConfirm +
                ", docDateConfirm=" + docDateConfirm +
                ", observation='" + observation + '\'' +
                ", orderNum='" + orderNum + '\'' +
                ", typeOrderNum='" + typeOrderNum + '\'' +
                ", row=" + row +
                ", countRow=" + countRow +
                '}';
    }
}
