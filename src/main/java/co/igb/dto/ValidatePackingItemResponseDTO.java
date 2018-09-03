package co.igb.dto;

public class ValidatePackingItemResponseDTO {
    private String itemName;
    private Integer items;

    public ValidatePackingItemResponseDTO(String itemName, Integer items){
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
}
