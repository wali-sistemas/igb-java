package co.igb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author dbotero
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SingleItemTransferDTO {

    private Long binAbsFrom;
    private Long binAbsTo;
    private Integer quantity;
    private Integer expectedQuantity;
    private Integer orderNumber;
    private String username;
    private String itemCode;
    private String warehouseCode;
    private Boolean temporary = false;

    public SingleItemTransferDTO() {
    }

    public SingleItemTransferDTO(Long binAbsFrom, Long binAbsTo, Integer quantity, Integer expectedQuantity, Integer orderNumber, String username, String itemCode, String warehouseCode, Boolean temporary) {
        this.binAbsFrom = binAbsFrom;
        this.binAbsTo = binAbsTo;
        this.quantity = quantity;
        this.expectedQuantity = expectedQuantity;
        this.orderNumber = orderNumber;
        this.username = username;
        this.itemCode = itemCode;
        this.warehouseCode = warehouseCode;
        this.temporary = temporary;
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
        if (itemCode != null) {
            this.itemCode = itemCode.toUpperCase();
        } else {
            this.itemCode = null;
        }

    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getExpectedQuantity() {
        return expectedQuantity;
    }

    public void setExpectedQuantity(Integer expectedQuantity) {
        this.expectedQuantity = expectedQuantity;
    }

    public Boolean getTemporary() {
        return temporary;
    }

    public void setTemporary(Boolean temporary) {
        this.temporary = temporary;
    }

    @Override
    public String toString() {
        return "SingleItemTransferDTO{" + "binAbsFrom=" + binAbsFrom + ", binAbsTo=" + binAbsTo + ", quantity=" + quantity + ", expectedQuantity=" + expectedQuantity + ", orderNumber=" + orderNumber + ", username=" + username + ", itemCode=" + itemCode + ", warehouseCode=" + warehouseCode + ", temporary=" + temporary + '}';
    }
}