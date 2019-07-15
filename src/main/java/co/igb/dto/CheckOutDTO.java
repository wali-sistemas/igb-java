package co.igb.dto;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Date;

/**
 * @author jguisao
 */
public class CheckOutDTO {
    @JsonProperty("idcheckout_order")
    private Long idCheckoutOrder;
    @JsonProperty("order_number")
    private Integer orderNumber;
    @JsonProperty("delivery_number")
    private Integer deliveryNumber;
    @JsonProperty("item_code")
    private String itemCode;
    @JsonProperty("qty_order")
    private Integer qtyOrder;
    @JsonProperty("qty_scan")
    private Integer qtyScan;
    private String status;
    @JsonProperty("emp_id")
    private String empId;
    @JsonProperty("datetime_checkout")
    private Date datetimeCheckout;
    @JsonProperty("box_number")
    private Integer boxNumber;
    @JsonProperty("company_name")
    private String companyName;
    @JsonProperty("start_time")
    private String startTime;
    @JsonProperty("end_time")
    private String endTime;

    public CheckOutDTO() {
    }

    public CheckOutDTO(Long idCheckoutOrder, Integer orderNumber, Integer deliveryNumber, String itemCode, Integer qtyOrder, Integer qtyScan, String status, String empId, Date datetimeCheckout, Integer boxNumber, String companyName, String startTime, String endTime) {
        this.idCheckoutOrder = idCheckoutOrder;
        this.orderNumber = orderNumber;
        this.deliveryNumber = deliveryNumber;
        this.itemCode = itemCode;
        this.qtyOrder = qtyOrder;
        this.qtyScan = qtyScan;
        this.status = status;
        this.empId = empId;
        this.datetimeCheckout = datetimeCheckout;
        this.boxNumber = boxNumber;
        this.companyName = companyName;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Long getIdCheckoutOrder() {
        return idCheckoutOrder;
    }

    public void setIdCheckoutOrder(Long idCheckoutOrder) {
        this.idCheckoutOrder = idCheckoutOrder;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getDeliveryNumber() {
        return deliveryNumber;
    }

    public void setDeliveryNumber(Integer deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public Integer getQtyOrder() {
        return qtyOrder;
    }

    public void setQtyOrder(Integer qtyOrder) {
        this.qtyOrder = qtyOrder;
    }

    public Integer getQtyScan() {
        return qtyScan;
    }

    public void setQtyScan(Integer qtyScan) {
        this.qtyScan = qtyScan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public Date getDatetimeCheckout() {
        return datetimeCheckout;
    }

    public void setDatetimeCheckout(Date datetimeCheckout) {
        this.datetimeCheckout = datetimeCheckout;
    }

    public Integer getBoxNumber() {
        return boxNumber;
    }

    public void setBoxNumber(Integer boxNumber) {
        this.boxNumber = boxNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "CheckOutDTO{" +
                "idCheckoutOrder=" + idCheckoutOrder +
                ", orderNumber=" + orderNumber +
                ", deliveryNumber=" + deliveryNumber +
                ", itemCode='" + itemCode + '\'' +
                ", qtyOrder=" + qtyOrder +
                ", qtyScan=" + qtyScan +
                ", status='" + status + '\'' +
                ", empId='" + empId + '\'' +
                ", datetimeCheckout=" + datetimeCheckout +
                ", boxNumber=" + boxNumber +
                ", companyName='" + companyName + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}