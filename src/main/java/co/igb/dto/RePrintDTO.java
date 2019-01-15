package co.igb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RePrintDTO {
    private Integer orderNumber;
    private Integer boxNumber;
    private String printerName;

    public RePrintDTO() {
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getBoxNumber() {
        return boxNumber;
    }

    public void setBoxNumber(Integer boxNumber) {
        this.boxNumber = boxNumber;
    }

    public String getPrinterName() {
        return printerName;
    }

    public void setPrinterName(String printerName) {
        this.printerName = printerName;
    }

    @Override
    public String toString() {
        return "RePrintDTO{" +
                "orderNumber=" + orderNumber +
                ", boxNumber=" + boxNumber +
                ", printerName='" + printerName + '\'' +
                '}';
    }
}