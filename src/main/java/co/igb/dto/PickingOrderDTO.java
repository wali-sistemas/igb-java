package co.igb.dto;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author dbotero
 */
public class PickingOrderDTO {

    private Integer totalItems = 0;
    private HashMap<String, Integer> items;

    public PickingOrderDTO() {
        items = new HashMap<>();
    }

    public void addItem(String itemcode, Integer quantity) {
        if (items.containsKey(itemcode)) {
            items.put(itemcode, items.get(itemcode) + quantity);
        } else {
            items.put(itemcode, quantity);
        }
        totalItems += quantity;
    }

    public Integer getItemQuantity(String itemCode) {
        Integer quantity = items.get(itemCode);
        if (quantity == null) {
            return 0;
        }
        return quantity;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    private Set<String> getKeys() {
        return this.items.keySet();
    }

    public static boolean validForPacking(PickingOrderDTO order1, PickingOrderDTO order2) {
        //If total items are different, orders are not valid
        if (!order1.getTotalItems().equals(order2.getTotalItems())) {
            return false;
        }
        //If there are different itemcodes on both orders
        if (!order1.getKeys().equals(order2.getKeys())) {
            return false;
        }
        //If quantities for each item are the same
        for (String itemCode : order1.getKeys()) {
            if (!order1.getItemQuantity(itemCode).equals(order2.getItemQuantity(itemCode))) {
                return false;
            }
        }
        return true;
    }
}

class PickingOrderItemDTO {

    private String itemCode;
    private Integer quantity;

    public PickingOrderItemDTO() {
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "PickingOrderItemDTO{" + "itemCode=" + itemCode + ", quantity=" + quantity + '}';
    }

}
