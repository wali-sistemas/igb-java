package co.igb.transportws.dto.aldia;

import java.io.Serializable;

/**
 * @author jguisao
 */
public class DocumentAldiaResponseDTO implements Serializable {
    private String data;
    private Integer code;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}