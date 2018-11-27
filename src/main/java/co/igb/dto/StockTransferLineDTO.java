package co.igb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StockTransferLineDTO {
    private String itemCode;
    private Integer quantity;
    private String fromWhsCode;
    private String whsCode;

    public StockTransferLineDTO() {
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getWhsCode() {
        return whsCode;
    }

    public void setWhsCode(String whsCode) {
        this.whsCode = whsCode;
    }

    public String getFromWhsCode() {
        return fromWhsCode;
    }

    public void setFromWhsCode(String fromWhsCode) {
        this.fromWhsCode = fromWhsCode;
    }

    @Override
    public String toString() {
        return "StockTransferLineDTO{" +
                "itemCode='" + itemCode + '\'' +
                ", quantity=" + quantity +
                ", fromWhsCode='" + fromWhsCode + '\'' +
                ", whsCode='" + whsCode + '\'' +
                '}';
    }
}