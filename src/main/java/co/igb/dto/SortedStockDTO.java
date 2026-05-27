package co.igb.dto;

import java.util.Objects;

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
    private String itemCodeF;
    private String itemNameF;

    public SortedStockDTO() {
    }

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
        itemCodeF = (String) dbData[11];
        itemNameF = (String) dbData[12];
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

    public String getItemCodeF() {
        return itemCodeF;
    }

    public void setItemCodeF(String itemCodeF) {
        this.itemCodeF = itemCodeF;
    }

    public String getItemNameF() {
        return itemNameF;
    }

    public void setItemNameF(String itemNameF) {
        this.itemNameF = itemNameF;
    }

    @Override
    public int compareTo(SortedStockDTO o) {
        if (o == null) {
            return 1;
        }

        int result;

        result = compareNullable(this.velocity, o.velocity);
        if (result != 0) return result;

        result = compareNullable(this.sequence, o.sequence);
        if (result != 0) return result;

        result = compareNullable(this.binLocationType, o.binLocationType);
        if (result != 0) return result;

        result = compareNullable(this.itemCode, o.itemCode);
        if (result != 0) return result;

        result = compareNullable(this.itemCodeF, o.itemCodeF);
        if (result != 0) return result;

        result = Long.compare(this.binAbs, o.binAbs);
        if (result != 0) return result;

        result = compareNullable(this.binCode, o.binCode);
        if (result != 0) return result;

        result = Integer.compare(this.orderNumber, o.orderNumber);
        if (result != 0) return result;

        result = Integer.compare(this.availableQuantity, o.availableQuantity);
        if (result != 0) return result;

        result = Integer.compare(this.quantity, o.quantity);
        if (result != 0) return result;

        result = Integer.compare(this.openQuantity, o.openQuantity);
        if (result != 0) return result;

        return Integer.compare(this.pendingQuantity, o.pendingQuantity);
    }

    private static <T extends Comparable<? super T>> int compareNullable(T a, T b) {
        if (a == null && b == null) return 0;
        if (a == null) return -1;
        if (b == null) return 1;
        return a.compareTo(b);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        SortedStockDTO other = (SortedStockDTO) obj;

        return openQuantity == other.openQuantity
                && quantity == other.quantity
                && binAbs == other.binAbs
                && availableQuantity == other.availableQuantity
                && orderNumber == other.orderNumber
                && pendingQuantity == other.pendingQuantity
                && Objects.equals(itemCode, other.itemCode)
                && Objects.equals(itemName, other.itemName)
                && Objects.equals(binCode, other.binCode)
                && Objects.equals(velocity, other.velocity)
                && Objects.equals(sequence, other.sequence)
                && Objects.equals(binLocationType, other.binLocationType)
                && Objects.equals(itemCodeF, other.itemCodeF)
                && Objects.equals(itemNameF, other.itemNameF);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                itemCode,
                itemName,
                openQuantity,
                quantity,
                binAbs,
                availableQuantity,
                binCode,
                orderNumber,
                pendingQuantity,
                velocity,
                sequence,
                binLocationType,
                itemCodeF,
                itemNameF
        );
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
                ", itemCodeF='" + itemCodeF + '\'' +
                ", itemNameF='" + itemNameF + '\'' +
                '}';
    }
}