package co.igb.dto;

/**
 *
 * @author dbotero
 */
public class SortedStockDTO implements Comparable<SortedStockDTO> {

    private String itemCode;
    private String itemName;
    private int openQuantity;
    private int quantity;
    private long binAbs;
    private int availableQuantity;
    private String binCode;
    private int orderNumber;

    public SortedStockDTO(Object[] dbData) {
        itemCode = (String) dbData[0];
        openQuantity = (Integer) dbData[1];
        quantity = (Integer) dbData[2];
        binAbs = ((Integer) dbData[3]).longValue();
        availableQuantity = (Integer) dbData[4];
        binCode = (String) dbData[5];
        itemName = (String) dbData[6];
        orderNumber = (Integer) dbData[7];
    }

    public String getItemCode() {
        return itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public int getOpenQuantity() {
        return openQuantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public long getBinAbs() {
        return binAbs;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public String getBinCode() {
        return binCode;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    @Override
    public int compareTo(SortedStockDTO o) {
        if (o == null || o.getBinCode() == null) {
            return 1;
        }
        if (this.binCode == null) {
            return -1;
        }
        return this.binCode.compareTo(o.getBinCode());
    }
}
