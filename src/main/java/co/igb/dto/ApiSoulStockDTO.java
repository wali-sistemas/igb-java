package co.igb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiSoulStockDTO {
    //variables de soul
    private String sku;
    private String estado;
    private int cantidadDisponible;
    private int cantidadReservada;
    //variables adicionales
    private String itemName;
    private String whsCode;
    public ApiSoulStockDTO() {
    }

    public ApiSoulStockDTO(String sku, String estado, int cantidadDisponible, int cantidadReservada, String itemName, String whsCode) {
        this.sku = sku;
        this.estado = estado;
        this.cantidadDisponible = cantidadDisponible;
        this.cantidadReservada = cantidadReservada;
        this.itemName = itemName;
        this.whsCode = whsCode;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public int getCantidadReservada() {
        return cantidadReservada;
    }

    public void setCantidadReservada(int cantidadReservada) {
        this.cantidadReservada = cantidadReservada;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getWhsCode() {
        return whsCode;
    }

    public void setWhsCode(String whsCode) {
        this.whsCode = whsCode;
    }

    @Override
    public String toString() {
        return "ApiSoulStockDTO{" +
                "sku='" + sku + '\'' +
                ", estado='" + estado + '\'' +
                ", cantidadDisponible=" + cantidadDisponible +
                ", cantidadReservada=" + cantidadReservada +
                ", itemName='" + itemName + '\'' +
                ", whsCode='" + whsCode + '\'' +
                '}';
    }
}