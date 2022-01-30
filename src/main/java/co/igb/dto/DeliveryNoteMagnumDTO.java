package co.igb.dto;

import java.math.BigDecimal;

/**
 * @author jguisao
 */
public class DeliveryNoteMagnumDTO {
    private Integer docNum;
    private String whsCode;
    private String transport;
    private BigDecimal lioQty;
    private BigDecimal pesoQty;
    private BigDecimal vrlDeclarad;
    private String statusOrder;
    private BigDecimal vlrFlete;

    public DeliveryNoteMagnumDTO() {
    }

    public DeliveryNoteMagnumDTO(Integer docNum, String whsCode, String transport, BigDecimal lioQty, BigDecimal pesoQty, BigDecimal vrlDeclarad, String statusOrder, BigDecimal vlrFlete) {
        this.docNum = docNum;
        this.whsCode = whsCode;
        this.transport = transport;
        this.lioQty = lioQty;
        this.pesoQty = pesoQty;
        this.vrlDeclarad = vrlDeclarad;
        this.statusOrder = statusOrder;
        this.vlrFlete = vlrFlete;
    }

    public Integer getDocNum() {
        return docNum;
    }

    public void setDocNum(Integer docNum) {
        this.docNum = docNum;
    }

    public String getWhsCode() {
        return whsCode;
    }

    public void setWhsCode(String whsCode) {
        this.whsCode = whsCode;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public BigDecimal getLioQty() {
        return lioQty;
    }

    public void setLioQty(BigDecimal lioQty) {
        this.lioQty = lioQty;
    }

    public BigDecimal getPesoQty() {
        return pesoQty;
    }

    public void setPesoQty(BigDecimal pesoQty) {
        this.pesoQty = pesoQty;
    }

    public BigDecimal getVrlDeclarad() {
        return vrlDeclarad;
    }

    public void setVrlDeclarad(BigDecimal vrlDeclarad) {
        this.vrlDeclarad = vrlDeclarad;
    }

    public String getStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(String statusOrder) {
        this.statusOrder = statusOrder;
    }

    public BigDecimal getVlrFlete() {
        return vlrFlete;
    }

    public void setVlrFlete(BigDecimal vlrFlete) {
        this.vlrFlete = vlrFlete;
    }

    @Override
    public String toString() {
        return "DeliveryNoteMagnumDTO{" +
                "docNum='" + docNum + '\'' +
                ", whsCode='" + whsCode + '\'' +
                ", transport='" + transport + '\'' +
                ", lioQty=" + lioQty +
                ", pesoQty=" + pesoQty +
                ", vrlDeclarad=" + vrlDeclarad +
                ", statusOrder='" + statusOrder + '\'' +
                ", vlrFlete=" + vlrFlete +
                '}';
    }
}