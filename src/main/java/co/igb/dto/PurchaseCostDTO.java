package co.igb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PurchaseCostDTO {
    private BigDecimal costCompra;
    private BigDecimal costLogistic;
    private BigDecimal porcentaje;
    private String costMonth;
    private int costYear;

    public PurchaseCostDTO() {
    }

    public PurchaseCostDTO(BigDecimal costCompra, BigDecimal costLogistic, BigDecimal porcentaje, String costMonth, int costYear) {
        this.costCompra = costCompra;
        this.costLogistic = costLogistic;
        this.porcentaje = porcentaje;
        this.costMonth = costMonth;
        this.costYear = costYear;
    }

    public BigDecimal getCostCompra() {
        return costCompra;
    }

    public void setCostCompra(BigDecimal costCompra) {
        this.costCompra = costCompra;
    }

    public BigDecimal getCostLogistic() {
        return costLogistic;
    }

    public void setCostLogistic(BigDecimal costLogistic) {
        this.costLogistic = costLogistic;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getCostMonth() {
        return costMonth;
    }

    public void setCostMonth(String costMonth) {
        this.costMonth = costMonth;
    }

    public int getCostYear() {
        return costYear;
    }

    public void setCostYear(int costYear) {
        this.costYear = costYear;
    }

    @Override
    public String toString() {
        return "PurchaseCostDTO{" +
                "costCompra=" + costCompra +
                ", costLogistic=" + costLogistic +
                ", porcentaje=" + porcentaje +
                ", costMonth='" + costMonth + '\'' +
                ", costYear=" + costYear +
                '}';
    }
}