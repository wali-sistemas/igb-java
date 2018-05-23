package co.igb.dto;

import java.util.Date;

/**
 * @author dbotero
 */
public class PackingListRecordDTO {

    private Integer idPackingList;
    private Integer orderNumber;
    private String customerId;
    private String customerName;
    private Date datetimePacked;
    private Integer idPackingOrder;
    private String itemCode;
    private Integer quantity;
    private String binCode;
    private Long binAbs;
    private Integer boxNumber;
    private String employee;
    private String status;

    public Integer getIdPackingList() {
        return idPackingList;
    }

    public void setIdPackingList(Integer idPackingList) {
        this.idPackingList = idPackingList;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getDatetimePacked() {
        return datetimePacked;
    }

    public void setDatetimePacked(Date datetimePacked) {
        this.datetimePacked = datetimePacked;
    }

    public Integer getIdPackingOrder() {
        return idPackingOrder;
    }

    public void setIdPackingOrder(Integer idPackingOrder) {
        this.idPackingOrder = idPackingOrder;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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

    public Integer getBoxNumber() {
        return boxNumber;
    }

    public void setBoxNumber(Integer boxNumber) {
        this.boxNumber = boxNumber;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PackingListRecordDTO{" + "idPackingList=" + idPackingList + ", orderNumber=" + orderNumber + ", customerId=" + customerId + ", customerName=" + customerName + ", datetimePacked=" + datetimePacked + ", idPackingOrder=" + idPackingOrder + ", itemCode=" + itemCode + ", quantity=" + quantity + ", binCode=" + binCode + ", binAbs=" + binAbs + ", boxNumber=" + boxNumber + ", employee=" + employee + ", status=" + status + '}';
    }

}
