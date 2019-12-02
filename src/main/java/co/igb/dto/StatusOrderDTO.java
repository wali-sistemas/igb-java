package co.igb.dto;

import java.math.BigDecimal;

/**
 *
 * @author jguisao
 */
public class StatusOrderDTO {
    private String status;
    private Integer orderNumber;
    private BigDecimal totalPend;
    private BigDecimal totalInvoice;
    private BigDecimal totalOrder;

    public StatusOrderDTO() {
    }

    public StatusOrderDTO(String status, Integer orderNumber, BigDecimal totalPend, BigDecimal totalInvoice, BigDecimal totalOrder) {
        this.status = status;
        this.orderNumber = orderNumber;
        this.totalPend = totalPend;
        this.totalInvoice = totalInvoice;
        this.totalOrder = totalOrder;
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

    public BigDecimal getTotalPend() {
        return totalPend;
    }

    public void setTotalPend(BigDecimal totalPend) {
        this.totalPend = totalPend;
    }

    public BigDecimal getTotalInvoice() {
        return totalInvoice;
    }

    public void setTotalInvoice(BigDecimal totalInvoice) {
        this.totalInvoice = totalInvoice;
    }

    public BigDecimal getTotalOrder() {
        return totalOrder;
    }

    public void setTotalOrder(BigDecimal totalOrder) {
        this.totalOrder = totalOrder;
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