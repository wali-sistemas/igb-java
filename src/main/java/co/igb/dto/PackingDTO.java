package co.igb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author dbotero
 */
public class PackingDTO {

    @JsonProperty("idpacking_order")
    private Integer idPackingOrder;
    @JsonProperty("order_number")
    private Integer orderNumber;
    @JsonProperty("customer_id")
    private String customerId;
    @JsonProperty("customer_name")
    private String customerName;
    private String status;
    private Map<String, PackingLineDTO> lines;

    public PackingDTO() {
        lines = new HashMap<>();
    }

    public Integer getIdPackingOrder() {
        return idPackingOrder;
    }

    public void setIdPackingOrder(Integer idPackingOrder) {
        this.idPackingOrder = idPackingOrder;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Map<String, PackingLineDTO> getLines() {
        return lines;
    }

    public void add(Integer idPackingOrderItem, String itemCode, Integer idPackingOrderItemBin, String binCode, Integer binAbs, Integer pickedQty, Integer packedQty) {
        PackingLineDTO line = lines.get(itemCode);
        if (line != null) {
            line.add(idPackingOrderItemBin, binCode, binAbs, pickedQty, packedQty);
        } else {
            line = new PackingLineDTO();
            line.setItemCode(itemCode);
            line.setIdPackingOrderItem(idPackingOrderItem);

            line.add(idPackingOrderItemBin, binCode, binAbs, pickedQty, packedQty);
        }
        lines.put(itemCode, line);
    }

    @Override
    public String toString() {
        return "PackingDTO{" + "idPackingOrder=" + idPackingOrder + ", orderNumber=" + orderNumber + ", customerId=" + customerId + ", customerName=" + customerName + ", status=" + status + ", lines=" + lines + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.idPackingOrder);
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
        final PackingDTO other = (PackingDTO) obj;
        if (!Objects.equals(this.idPackingOrder, other.idPackingOrder)) {
            return false;
        }
        return true;
    }

    public static class PackingLineDTO {

        @JsonProperty("idpacking_order_item")
        private Integer idPackingOrderItem;
        @JsonProperty("item_code")
        private String itemCode;
        private Map<String, PackingBinDTO> bins;

        public PackingLineDTO() {
            bins = new HashMap<>();
        }

        public Integer getIdPackingOrderItem() {
            return idPackingOrderItem;
        }

        public void setIdPackingOrderItem(Integer idPackingOrderItem) {
            this.idPackingOrderItem = idPackingOrderItem;
        }

        public String getItemCode() {
            return itemCode;
        }

        public void setItemCode(String itemCode) {
            this.itemCode = itemCode;
        }

        public Map<String, PackingBinDTO> getBins() {
            return bins;
        }

        private void add(Integer idPackingOrderItemBin, String binCode, Integer binAbs, Integer pickedQty, Integer packedQty) {
            PackingBinDTO bin = bins.get(binCode);
            if (bin != null) {
                bin.setPackedQty(bin.getPackedQty() + packedQty);
            } else {
                bin = new PackingBinDTO();
                bin.setBinAbs(binAbs);
                bin.setBinCode(binCode);
                bin.setIdPackingOrderItemBin(idPackingOrderItemBin);
                bin.setPackedQty(packedQty);
                bin.setPickedQty(pickedQty);
            }
            bins.put(binCode, bin);
        }

        @Override
        public String toString() {
            return "PackingLineDTO{" + "idPackingOrderItem=" + idPackingOrderItem + ", itemCode=" + itemCode + ", bins=" + bins + '}';
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 97 * hash + Objects.hashCode(this.idPackingOrderItem);
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
            final PackingLineDTO other = (PackingLineDTO) obj;
            if (!Objects.equals(this.idPackingOrderItem, other.idPackingOrderItem)) {
                return false;
            }
            return true;
        }

        public static class PackingBinDTO {

            @JsonProperty("idpacking_order_item_bin")
            private Integer idPackingOrderItemBin;
            @JsonProperty("bin_code")
            private String binCode;
            @JsonProperty("bin_abs")
            private Integer binAbs;
            @JsonProperty("picked_qty")
            private Integer pickedQty;
            @JsonProperty("packed_qty")
            private Integer packedQty;

            public PackingBinDTO() {

            }

            public Integer getIdPackingOrderItemBin() {
                return idPackingOrderItemBin;
            }

            public void setIdPackingOrderItemBin(Integer idPackingOrderItemBin) {
                this.idPackingOrderItemBin = idPackingOrderItemBin;
            }

            public String getBinCode() {
                return binCode;
            }

            public void setBinCode(String binCode) {
                this.binCode = binCode;
            }

            public Integer getBinAbs() {
                return binAbs;
            }

            public void setBinAbs(Integer binAbs) {
                this.binAbs = binAbs;
            }

            public Integer getPickedQty() {
                return pickedQty;
            }

            public void setPickedQty(Integer pickedQty) {
                this.pickedQty = pickedQty;
            }

            public Integer getPackedQty() {
                return packedQty;
            }

            public void setPackedQty(Integer packedQty) {
                this.packedQty = packedQty;
            }

            @Override
            public String toString() {
                return "PackingBinDTO{" + "idPackingOrderItemBin=" + idPackingOrderItemBin + ", binCode=" + binCode + ", binAbs=" + binAbs + ", pickedQty=" + pickedQty + ", packedQty=" + packedQty + '}';
            }

            @Override
            public int hashCode() {
                int hash = 3;
                hash = 29 * hash + Objects.hashCode(this.idPackingOrderItemBin);
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
                final PackingBinDTO other = (PackingBinDTO) obj;
                if (!Objects.equals(this.idPackingOrderItemBin, other.idPackingOrderItemBin)) {
                    return false;
                }
                return true;
            }

        }
    }
}
