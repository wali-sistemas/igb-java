package co.igb.dto;

/**
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
    private int pendingQuantity;
    private String velocity;
    private Integer sequence;
    private String binLocationType;

    public SortedStockDTO(Object[] dbData) {
        itemCode = (String) dbData[0];
        openQuantity = ((Integer) dbData[1]).intValue();
        quantity = ((Integer) dbData[2]).intValue();
        binAbs = ((Integer) dbData[3]).longValue();
        availableQuantity = ((Integer) dbData[4]).intValue();
        binCode = (String) dbData[5];
        itemName = (String) dbData[6];
        orderNumber = ((Integer) dbData[7]).intValue();
        velocity = (String) dbData[8];
        sequence = (Integer) dbData[9];
        binLocationType = (String) dbData[10];
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getOpenQuantity() {
        return openQuantity;
    }

    public void setOpenQuantity(int openQuantity) {
        this.openQuantity = openQuantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getBinAbs() {
        return binAbs;
    }

    public void setBinAbs(long binAbs) {
        this.binAbs = binAbs;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public String getBinCode() {
        return binCode;
    }

    public void setBinCode(String binCode) {
        this.binCode = binCode;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getPendingQuantity() {
        return pendingQuantity;
    }

    public void setPendingQuantity(int pendingQuantity) {
        this.pendingQuantity = pendingQuantity;
    }

    public String getVelocity() {
        return velocity;
    }

    public void setVelocity(String velocity) {
        this.velocity = velocity;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getBinLocationType() {
        return binLocationType;
    }

    public void setBinLocationType(String binLocationType) {
        this.binLocationType = binLocationType;
    }

    @Override
    public int compareTo(SortedStockDTO o) {
        if (o == null || o.getBinCode() == null) {
            return 1;
        }

        if (this.velocity.equals(o.getVelocity())) {
            return this.sequence.compareTo(o.getSequence());
        }

        return this.velocity.compareTo(o.getVelocity());
    }

    @Override
    public String toString() {
        return "SortedStockDTO{" +
                "itemCode='" + itemCode + '\'' +
                ", itemName='" + itemName + '\'' +
                ", openQuantity=" + openQuantity +
                ", quantity=" + quantity +
                ", binAbs=" + binAbs +
                ", availableQuantity=" + availableQuantity +
                ", binCode='" + binCode + '\'' +
                ", orderNumber=" + orderNumber +
                ", pendingQuantity=" + pendingQuantity +
                ", velocity='" + velocity + '\'' +
                ", sequence=" + sequence +
                ", binLocationType='" + binLocationType + '\'' +
                '}';
    }
}