package co.igb.dto;

/**
 *
 * @author YEIJARA
 */
public class InventoryDTO {

    private Integer idInventory;
    private Integer quantity;
    private String item;

    public InventoryDTO() {
    }

    public InventoryDTO(Integer idInventory, Integer quantity, String item) {
        this.idInventory = idInventory;
        this.quantity = quantity;
        this.item = item;
    }

    public Integer getIdInventory() {
        return idInventory;
    }

    public void setIdInventory(Integer idInventory) {
        this.idInventory = idInventory;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "InventoryDTO{" + "idInventory=" + idInventory + ", quantity=" + quantity + ", item=" + item + '}';
    }
}
