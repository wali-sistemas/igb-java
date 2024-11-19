package co.igb.transportws.dto.exxe;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author jguisao
 */
public class GuiaExxeResponseDTO implements Serializable {
    @JsonProperty("DeliveryNumber")
    private String deliveryNumber;
    @JsonProperty("Barcode")
    private String barcode;
    @JsonProperty("Zone")
    private String zone;
    @JsonProperty("Code")
    private Integer code;
    @JsonProperty("Message")
    private String message;

    public String getDeliveryNumber() {
        return deliveryNumber;
    }

    public void setDeliveryNumber(String deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}