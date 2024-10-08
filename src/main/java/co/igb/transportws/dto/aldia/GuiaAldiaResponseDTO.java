package co.igb.transportws.dto.aldia;

import java.io.Serializable;
import java.util.List;

/**
 * @author jguisao
 */
public class GuiaAldiaResponseDTO implements Serializable {
    private List<String> data;
    private Integer code;

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}