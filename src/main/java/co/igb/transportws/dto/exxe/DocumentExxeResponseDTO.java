package co.igb.transportws.dto.exxe;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author jguisao
 */
public class DocumentExxeResponseDTO {
    @JsonProperty("DeliveryNumber")
    private String deliveryNumber;
    private String labelBase64;
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

    public String getLabelBase64() {
        return labelBase64;
    }

    public void setLabelBase64(String labelBase64) {
        this.labelBase64 = labelBase64;
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