package co.igb.dto;

/**
 *
 * @author YEIJARA
 */
public class LocationLimitDTO {

    private Integer cantMaxima;
    private Integer cantMinima;
    private String code;
    private String name;
    private String ubicacion;
    private String item;

    public LocationLimitDTO() {
    }

    public LocationLimitDTO(Integer cantMaxima, Integer cantMinima, String code, String name, String ubicacion, String item) {
        this.cantMaxima = cantMaxima;
        this.cantMinima = cantMinima;
        this.code = code;
        this.name = name;
        this.ubicacion = ubicacion;
        this.item = item;
    }

    public Integer getCantMaxima() {
        return cantMaxima;
    }

    public void setCantMaxima(Integer cantMaxima) {
        this.cantMaxima = cantMaxima;
    }

    public Integer getCantMinima() {
        return cantMinima;
    }

    public void setCantMinima(Integer cantMinima) {
        this.cantMinima = cantMinima;
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

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
