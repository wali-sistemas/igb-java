package co.igb.dto;

/**
 * @author dbotero
 */
public class InventoryInconsistency {
    private String binCode;
    private String itemCode;
    private Integer expectedQuantity;
    private Integer foundQuantity;

    public InventoryInconsistency() {
    }

    public String getBinCode() {
        return binCode;
    }

    public void setBinCode(String binCode) {
        this.binCode = binCode;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public Integer getExpectedQuantity() {
        return expectedQuantity;
    }

    public void setExpectedQuantity(Integer expectedQuantity) {
        this.expectedQuantity = expectedQuantity;
    }

    public Integer getFoundQuantity() {
        return foundQuantity;
    }

    public void setFoundQuantity(Integer foundQuantity) {
        this.foundQuantity = foundQuantity;
    }

    @Override
    public String toString() {
        return "InventoryInconsistency{" +
                "binCode='" + binCode + '\'' +
                ", itemCode='" + itemCode + '\'' +
                ", expectedQuantity=" + expectedQuantity +
                ", foundQuantity=" + foundQuantity +
                '}';
    }
}