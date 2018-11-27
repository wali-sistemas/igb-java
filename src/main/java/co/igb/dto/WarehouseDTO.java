package co.igb.dto;

public class WarehouseDTO {
    private String code;
    private String name;

    public WarehouseDTO() {
    }

    public WarehouseDTO(String code, String name) {
        this.code = code;
        this.name = name;
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
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}