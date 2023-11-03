package co.igb.dto;

/**
 * @author jguisao
 */
public class CityDTO {
    private String code;
    private String name;

    public CityDTO() {
    }

    public CityDTO(String code, String name) {
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
        return "CityDTO{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}