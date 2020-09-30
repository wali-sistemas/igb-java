package co.igb.dto;

/**
 * @author dbotero
 */
public class BinLocationDTO {
    private Long binAbs;
    private String binCode;
    private String binName;
    private Integer items;
    private Integer pieces;

    public BinLocationDTO() {
    }

    public BinLocationDTO(Long binAbs, String binCode, String binName, Integer items, Integer pieces) {
        this.binAbs = binAbs;
        this.binCode = binCode;
        this.binName = binName;
        this.items = items;
        this.pieces = pieces;
    }

    public Long getBinAbs() {
        return binAbs;
    }

    public void setBinAbs(Long binAbs) {
        this.binAbs = binAbs;
    }

    public String getBinCode() {
        return binCode;
    }

    public void setBinCode(String binCode) {
        this.binCode = binCode;
    }

    public String getBinName() {
        return binName;
    }

    public void setBinName(String binName) {
        this.binName = binName;
    }

    public Integer getItems() {
        return items;
    }

    public void setItems(Integer items) {
        this.items = items;
    }

    public void setPieces(Integer pieces) {
        this.pieces = pieces;
    }

    public Integer getPieces() {
        return pieces;
    }

    @Override
    public String toString() {
        return "BinLocationDTO{" + "binAbs=" + binAbs + ", binCode=" + binCode + ", binName=" + binName + ", items=" + items + ", pieces=" + pieces + '}';
    }
}
