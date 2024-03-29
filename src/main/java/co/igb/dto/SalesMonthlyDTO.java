package co.igb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SalesMonthlyDTO {
    private String month;
    private String year;
    private BigDecimal totalCost;
    private BigDecimal totalSale;
    private BigDecimal margeSale;
    private BigDecimal descFin;
    private BigDecimal totalDescFin;
    private BigDecimal margeDesFin;

    public SalesMonthlyDTO() {
    }

    public SalesMonthlyDTO(String month, String year, BigDecimal totalCost, BigDecimal totalSale, BigDecimal margeSale, BigDecimal descFin, BigDecimal totalDescFin, BigDecimal margeDesFin) {
        this.month = month;
        this.year = year;
        this.totalCost = totalCost;
        this.totalSale = totalSale;
        this.margeSale = margeSale;
        this.descFin = descFin;
        this.totalDescFin = totalDescFin;
        this.margeDesFin = margeDesFin;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public BigDecimal getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(BigDecimal totalSale) {
        this.totalSale = totalSale;
    }

    public BigDecimal getMargeSale() {
        return margeSale;
    }

    public void setMargeSale(BigDecimal margeSale) {
        this.margeSale = margeSale;
    }

    public BigDecimal getDescFin() {
        return descFin;
    }

    public void setDescFin(BigDecimal descFin) {
        this.descFin = descFin;
    }

    public BigDecimal getTotalDescFin() {
        return totalDescFin;
    }

    public void setTotalDescFin(BigDecimal totalDescFin) {
        this.totalDescFin = totalDescFin;
    }

    public BigDecimal getMargeDesFin() {
        return margeDesFin;
    }

    public void setMargeDesFin(BigDecimal margeDesFin) {
        this.margeDesFin = margeDesFin;
    }

    @Override
    public String toString() {
        return "SalesMonthlyDTO{" +
                "month='" + month + '\'' +
                ", year='" + year + '\'' +
                ", totalCost=" + totalCost +
                ", totalSale=" + totalSale +
                ", margeSale=" + margeSale +
                ", descFin=" + descFin +
                ", totalDescFin=" + totalDescFin +
                ", margeDesFin=" + margeDesFin +
                '}';
    }
}