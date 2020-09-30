package co.igb.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dbotero
 */
public class PickingWarningDTO {
    private Integer orderNumber;
    private String message;
    private List<String> items;

    public PickingWarningDTO() {
        items = new ArrayList<>();
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "PickingWarningDTO{" +
                "orderNumber=" + orderNumber +
                ", message='" + message + '\'' +
                ", items=" + items +
                '}';
    }
}