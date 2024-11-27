package co.igb.dto;

/**
 * @author jguisao
 */
public class InvoiceExpressDTO {
    private Integer docNumDelivery;
    private String slpCode;

    public InvoiceExpressDTO() {
    }

    public InvoiceExpressDTO(Integer docNumDelivery, String slpCode) {
        this.docNumDelivery = docNumDelivery;
        this.slpCode = slpCode;
    }

    public Integer getDocNumDelivery() {
        return docNumDelivery;
    }

    public void setDocNumDelivery(Integer docNumDelivery) {
        this.docNumDelivery = docNumDelivery;
    }

    public String getSlpCode() {
        return slpCode;
    }

    public void setSlpCode(String slpCode) {
        this.slpCode = slpCode;
    }

    @Override
    public String toString() {
        return "InvoiceExpressDTO{" +
                "docNumDelivery=" + docNumDelivery +
                ", slpCode=" + slpCode +
                '}';
    }
}