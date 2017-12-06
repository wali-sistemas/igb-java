package co.igb.dto;

/**
 *
 * @author dbotero
 */
public class SingleItemTransferDTO {

    private Long binAbsFrom;
    private Long binAbsTo;
    private Integer quantity;
    private String itemCode;
    private String warehouseCode;

    public SingleItemTransferDTO() {
    }

    public Long getBinAbsFrom() {
        return binAbsFrom;
    }

    public void setBinAbsFrom(Long binAbsFrom) {
        this.binAbsFrom = binAbsFrom;
    }

    public Long getBinAbsTo() {
        return binAbsTo;
    }

    public void setBinAbsTo(Long binAbsTo) {
        this.binAbsTo = binAbsTo;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    @Override
    public String toString() {
        return "SingleItemTransferDTO{" + "binAbsFrom=" + binAbsFrom + ", binAbsTo=" + binAbsTo + ", quantity=" + quantity + ", itemCode=" + itemCode + ", warehouseCode=" + warehouseCode + '}';
    }

}
