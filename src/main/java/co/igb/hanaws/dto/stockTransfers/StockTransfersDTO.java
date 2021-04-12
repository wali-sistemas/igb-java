package co.igb.hanaws.dto.stockTransfers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class StockTransfersDTO implements Serializable {
    @JsonProperty("Series")
    protected Long series;
    @JsonProperty("ToWarehouse")
    protected String toWarehouse;
    @JsonProperty("FromWarehouse")
    protected String fromWarehouse;
    @JsonProperty("Comments")
    protected String comments;
    @JsonProperty("StockTransferLines")
    protected List<StockTransfersDTO.StockTransferLines.StockTransferLine> stockTransferLines;

    public Long getSeries() {
        return series;
    }

    public void setSeries(Long series) {
        this.series = series;
    }

    public String getToWarehouse() {
        return toWarehouse;
    }

    public void setToWarehouse(String toWarehouse) {
        this.toWarehouse = toWarehouse;
    }

    public String getFromWarehouse() {
        return fromWarehouse;
    }

    public void setFromWarehouse(String fromWarehouse) {
        this.fromWarehouse = fromWarehouse;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public List<StockTransferLines.StockTransferLine> getStockTransferLines() {
        return stockTransferLines;
    }

    public void setStockTransferLines(List<StockTransferLines.StockTransferLine> stockTransferLines) {
        this.stockTransferLines = stockTransferLines;
    }

    public static class StockTransferLines {
        public static class StockTransferLine {
            @JsonProperty("LineNum")
            protected Long lineNum;
            @JsonProperty("ItemCode")
            protected String itemCode;
            @JsonProperty("Quantity")
            protected Double quantity;
            @JsonProperty("WarehouseCode")
            protected String warehouseCode;
            @JsonProperty("FromWarehouseCode")
            protected String fromWarehouseCode;
            @JsonProperty("StockTransferLinesBinAllocations")
            protected List<StockTransfersDTO.StockTransferLines.StockTransferLine.StockTransferLinesBinAllocations.StockTransferLinesBinAllocation> stockTransferLinesBinAllocations;

            public Long getLineNum() {
                return lineNum;
            }

            public void setLineNum(Long lineNum) {
                this.lineNum = lineNum;
            }

            public String getItemCode() {
                return itemCode;
            }

            public void setItemCode(String itemCode) {
                this.itemCode = itemCode;
            }

            public Double getQuantity() {
                return quantity;
            }

            public void setQuantity(Double quantity) {
                this.quantity = quantity;
            }

            public String getWarehouseCode() {
                return warehouseCode;
            }

            public void setWarehouseCode(String warehouseCode) {
                this.warehouseCode = warehouseCode;
            }

            public String getFromWarehouseCode() {
                return fromWarehouseCode;
            }

            public void setFromWarehouseCode(String fromWarehouseCode) {
                this.fromWarehouseCode = fromWarehouseCode;
            }

            public List<StockTransferLinesBinAllocations.StockTransferLinesBinAllocation> getStockTransferLinesBinAllocations() {
                return stockTransferLinesBinAllocations;
            }

            public void setStockTransferLinesBinAllocations(List<StockTransferLinesBinAllocations.StockTransferLinesBinAllocation> stockTransferLinesBinAllocations) {
                this.stockTransferLinesBinAllocations = stockTransferLinesBinAllocations;
            }

            public static class StockTransferLinesBinAllocations {
                public static class StockTransferLinesBinAllocation {
                    @JsonProperty("BinAbsEntry")
                    protected Long binAbsEntry;
                    @JsonProperty("Quantity")
                    protected Double quantity;
                    @JsonProperty("AllowNegativeQuantity")
                    protected String allowNegativeQuantity;
                    @JsonProperty("SerialAndBatchNumbersBaseLine")
                    protected Long serialAndBatchNumbersBaseLine;
                    @JsonProperty("BinActionType")
                    protected String binActionType;
                    @JsonProperty("BaseLineNumber")
                    protected Long baseLineNumber;

                    public Long getBinAbsEntry() {
                        return binAbsEntry;
                    }

                    public void setBinAbsEntry(Long binAbsEntry) {
                        this.binAbsEntry = binAbsEntry;
                    }

                    public Double getQuantity() {
                        return quantity;
                    }

                    public void setQuantity(Double quantity) {
                        this.quantity = quantity;
                    }

                    public String getAllowNegativeQuantity() {
                        return allowNegativeQuantity;
                    }

                    public void setAllowNegativeQuantity(String allowNegativeQuantity) {
                        this.allowNegativeQuantity = allowNegativeQuantity;
                    }

                    public Long getSerialAndBatchNumbersBaseLine() {
                        return serialAndBatchNumbersBaseLine;
                    }

                    public void setSerialAndBatchNumbersBaseLine(Long serialAndBatchNumbersBaseLine) {
                        this.serialAndBatchNumbersBaseLine = serialAndBatchNumbersBaseLine;
                    }

                    public String getBinActionType() {
                        return binActionType;
                    }

                    public void setBinActionType(String binActionType) {
                        this.binActionType = binActionType;
                    }

                    public Long getBaseLineNumber() {
                        return baseLineNumber;
                    }

                    public void setBaseLineNumber(Long baseLineNumber) {
                        this.baseLineNumber = baseLineNumber;
                    }
                }
            }
        }
    }
}