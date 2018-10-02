package co.igb.dto;

import java.util.ArrayList;
import java.util.List;

public class StockTransferDTO {
    private String username;
    private String binCodeFrom;
    private String binCodeTo;
    private Long binAbsFrom;
    private Long binAbsTo;
    private String warehouseCode;
    private List<StockTransferLineDTO> lines;

    public StockTransferDTO() {
        setLines(new ArrayList<>());
    }

    public List<StockTransferLineDTO> getLines() {
        return lines;
    }

    public void setLines(List<StockTransferLineDTO> lines) {
        this.lines = lines;
    }

    public String getBinCodeFrom() {
        return binCodeFrom;
    }

    public void setBinCodeFrom(String binCodeFrom) {
        this.binCodeFrom = binCodeFrom;
    }

    public String getBinCodeTo() {
        return binCodeTo;
    }

    public void setBinCodeTo(String binCodeTo) {
        this.binCodeTo = binCodeTo;
    }

    public Long getBinAbsFrom() {
        return binAbsFrom;
    }

    public void setBinAbsFrom(Long binAbsFrom) {
        this.binAbsFrom = binAbsFrom;
    }

    public Long getBinAbsTo() {
        return binAbsTo;
    }

    public void setBinAbsTo(Long binAbsTo) {
        this.binAbsTo = binAbsTo;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "StockTransferDTO{" +
                "username='" + username + '\'' +
                ", binCodeFrom='" + binCodeFrom + '\'' +
                ", binCodeTo='" + binCodeTo + '\'' +
                ", binAbsFrom=" + binAbsFrom +
                ", binAbsTo=" + binAbsTo +
                ", warehouseCode='" + warehouseCode + '\'' +
                ", lines=" + lines +
                '}';
    }
}
