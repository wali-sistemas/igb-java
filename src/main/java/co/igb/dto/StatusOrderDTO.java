package co.igb.dto;

import java.math.BigDecimal;

/**
 *
 * @author jguisao
 */
public class StatusOrderDTO {
    private String status;
    private Integer orderNumber;
    private BigDecimal totalOrder;
    private BigDecimal totalInvoice;

    public StatusOrderDTO() {
    }

    public StatusOrderDTO(String status, Integer orderNumber, BigDecimal totalOrder, BigDecimal totalInvoice) {
        this.status = status;
        this.orderNumber = orderNumber;
        this.totalOrder = totalOrder;
        this.totalInvoice = totalInvoice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public BigDecimal getTotalOrder() {
        return totalOrder;
    }

    public void setTotalOrder(BigDecimal totalOrder) {
        this.totalOrder = totalOrder;
    }

    public BigDecimal getTotalInvoice() {
        return totalInvoice;
    }

    public void setTotalInvoice(BigDecimal totalInvoice) {
        this.totalInvoice = totalInvoice;
    }

    @Override
    public String toString() {
        return "StatusOrderDTO{" +
                "status='" + status + '\'' +
                ", orderNumber=" + orderNumber +
                ", totalOrder=" + totalOrder +
                ", totalInvoice=" + totalInvoice +
                '}';
    }
}