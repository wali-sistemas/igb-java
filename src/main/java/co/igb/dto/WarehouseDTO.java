package co.igb.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WarehouseDTO {
    private Integer dftBinAbs;
    private String code;
    private String name;

    public WarehouseDTO() {
    }

    public WarehouseDTO(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getDftBinAbs() {
        return dftBinAbs;
    }

    public void setDftBinAbs(Integer dftBinAbs) {
        this.dftBinAbs = dftBinAbs;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "WarehouseDTO{" +
                "dftBinAbs=" + dftBinAbs +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}