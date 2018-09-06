package co.igb.dto;

public class StockTransferLineDTO {
    private String itemCode;
    private Integer quantity;

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

    @Override
    public String toString() {
        return "StockTransferLineDTO{" + "itemCode='" + itemCode + '\'' + ", quantity=" + quantity + '}';
    }
}
