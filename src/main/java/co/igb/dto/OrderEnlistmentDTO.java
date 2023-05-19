package co.igb.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author jguisao
 */
public class OrderEnlistmentDTO {
    private String status;
    private String docNumSAP;
    private String docNumMDL;
    private String cardCode;
    private String cardName;
    private String slpName;
    private String region;
    private Date docDate;
    private BigDecimal docTotal;
    private String payCond;
    private BigDecimal cupo;
    private BigDecimal balance;
    private Integer dayVenc;
    private Integer promDay;

    public OrderEnlistmentDTO() {
    }

    public OrderEnlistmentDTO(String status, String docNumSAP, String docNumMDL, String cardCode, String cardName, String slpName, String region, Date docDate, BigDecimal docTotal, String payCond, BigDecimal cupo, BigDecimal balance, Integer dayVenc, Integer promDay) {
        this.status = status;
        this.docNumSAP = docNumSAP;
        this.docNumMDL = docNumMDL;
        this.cardCode = cardCode;
        this.cardName = cardName;
        this.slpName = slpName;
        this.region = region;
        this.docDate = docDate;
        this.docTotal = docTotal;
        this.payCond = payCond;
        this.cupo = cupo;
        this.balance = balance;
        this.dayVenc = dayVenc;
        this.promDay = promDay;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDocNumSAP() {
        return docNumSAP;
    }

    public void setDocNumSAP(String docNumSAP) {
        this.docNumSAP = docNumSAP;
    }

    public String getDocNumMDL() {
        return docNumMDL;
    }

    public void setDocNumMDL(String docNumMDL) {
        this.docNumMDL = docNumMDL;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getSlpName() {
        return slpName;
    }

    public void setSlpName(String slpName) {
        this.slpName = slpName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public BigDecimal getDocTotal() {
        return docTotal;
    }

    public void setDocTotal(BigDecimal docTotal) {
        this.docTotal = docTotal;
    }

    public String getPayCond() {
        return payCond;
    }

    public void setPayCond(String payCond) {
        this.payCond = payCond;
    }

    public BigDecimal getCupo() {
        return cupo;
    }

    public void setCupo(BigDecimal cupo) {
        this.cupo = cupo;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Integer getDayVenc() {
        return dayVenc;
    }

    public void setDayVenc(Integer dayVenc) {
        this.dayVenc = dayVenc;
    }

    public Integer getPromDay() {
        return promDay;
    }

    public void setPromDay(Integer promDay) {
        this.promDay = promDay;
    }

    @Override
    public String toString() {
        return "OrderEnlistmentDTO{" +
                "status='" + status + '\'' +
                ", docNumSAP='" + docNumSAP + '\'' +
                ", docNumMDL='" + docNumMDL + '\'' +
                ", cardCode='" + cardCode + '\'' +
                ", cardName='" + cardName + '\'' +
                ", slpName='" + slpName + '\'' +
                ", region='" + region + '\'' +
                ", docDate=" + docDate +
                ", docTotal=" + docTotal +
                ", payCond=" + payCond +
                ", cupo=" + cupo +
                ", balance=" + balance +
                ", dayVenc=" + dayVenc +
                ", promDay=" + promDay +
                '}';
    }
}