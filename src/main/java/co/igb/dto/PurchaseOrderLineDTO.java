package co.igb.dto;

import java.util.Objects;

/**
 * @author dbotero
 */
public class PurchaseOrderLineDTO {
    private Long docLine;
    private String itemCode;
    private String itemName;
    private Integer quantity;
    private Integer lineNum;

    public PurchaseOrderLineDTO() {
    }

    public PurchaseOrderLineDTO(String itemCode, String itemName, Integer quantity, Integer lineNum) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.quantity = quantity;
        this.lineNum = lineNum;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public Long getDocLine() {
        return docLine;
    }

    public void setDocLine(Long docLine) {
        this.docLine = docLine;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void addQuantity(Integer quantity) {
        this.quantity += quantity;
    }

    public Integer getLineNum() {
        return lineNum;
    }

    public void setLineNum(Integer lineNum) {
        this.lineNum = lineNum;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.itemCode);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PurchaseOrderLineDTO other = (PurchaseOrderLineDTO) obj;
        if (!Objects.equals(this.itemCode, other.itemCode)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PurchaseOrderLineDTO{" + "docLine=" + docLine + ", itemCode=" + itemCode + ", itemName="
                + itemName + ", quantity=" + quantity + ", lineNum=" + lineNum + '}';
    }
}