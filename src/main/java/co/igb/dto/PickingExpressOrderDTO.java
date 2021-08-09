package co.igb.dto;

/**
 * @author jguisao
 */
public class PickingExpressOrderDTO {
    private Integer orderSAP;
    private Integer orderMDL;

    public PickingExpressOrderDTO() {
    }

    public PickingExpressOrderDTO(Integer orderSAP, Integer orderMDL) {
        this.orderSAP = orderSAP;
        this.orderMDL = orderMDL;
    }

    public Integer getOrderSAP() {
        return orderSAP;
    }

    public void setOrderSAP(Integer orderSAP) {
        this.orderSAP = orderSAP;
    }

    public Integer getOrderMDL() {
        return orderMDL;
    }

    public void setOrderMDL(Integer orderMDL) {
        this.orderMDL = orderMDL;
    }

    @Override
    public String toString() {
        return "PickingExpressOrderDTO{" +
                "orderSAP=" + orderSAP +
                ", orderMDL=" + orderMDL +
                '}';
    }
}