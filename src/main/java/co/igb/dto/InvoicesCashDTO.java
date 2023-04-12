package co.igb.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author jguisao
 */
public class InvoicesCashDTO {
    private String docNum;
    private String cardCode;
    private String cardName;
    private String slpName;
    private String status;
    private String category;
    private String location;
    private Date docDate;
    private Integer day;
    private BigDecimal docTotal;
    private BigDecimal balance;

    public InvoicesCashDTO() {
    }

    public InvoicesCashDTO(String docNum, String cardCode, String cardName, String slpName, Date docDate, Integer day, BigDecimal docTotal, BigDecimal balance, String status, String category, String location) {
        this.docNum = docNum;
        this.cardCode = cardCode;
        this.cardName = cardName;
        this.slpName = slpName;
        this.docDate = docDate;
        this.day = day;
        this.docTotal = docTotal;
        this.balance = balance;
        this.status = status;
        this.category = category;
        this.location = location;
    }

    public String getDocNum() {
        return docNum;
    }

    public void setDocNum(String docNum) {
        this.docNum = docNum;
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

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public BigDecimal getDocTotal() {
        return docTotal;
    }

    public void setDocTotal(BigDecimal docTotal) {
        this.docTotal = docTotal;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "InvoicesCashDTO{" +
                "docNum='" + docNum + '\'' +
                ", cardCode='" + cardCode + '\'' +
                ", cardName='" + cardName + '\'' +
                ", slpName='" + slpName + '\'' +
                ", status='" + status + '\'' +
                ", category='" + category + '\'' +
                ", location='" + location + '\'' +
                ", docDate=" + docDate +
                ", day=" + day +
                ", docTotal=" + docTotal +
                ", balance=" + balance +
                '}';
    }
}