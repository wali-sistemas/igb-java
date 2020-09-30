package co.igb.dto;

/**
 * @author dbotero
 */
public class ValidatePackingItemResponseDTO {
    private String itemName;
    private Integer items;

    public ValidatePackingItemResponseDTO() {
    }

    public ValidatePackingItemResponseDTO(String itemName, Integer items) {
        this.itemName = itemName;
        this.items = items;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getItems() {
        return items;
    }

    public void setItems(Integer items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ValidatePackingItemResponseDTO{" +
                "itemName='" + itemName + '\'' +
                ", items=" + items +
                '}';
    }
}