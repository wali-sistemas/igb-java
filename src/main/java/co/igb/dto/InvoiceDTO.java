package co.igb.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceDTO {
    private Date docDate;
    private Integer box;
    private String docNum;
    private String cardCode;
    private String cardName;
    private String transport;
    private String street;
    private String depart;
    private String city;
    private String codCity;
    private BigDecimal valStandDecl;
    private Integer unidEmpStand;
    private String rexpedition;

    public InvoiceDTO() {
    }

    public InvoiceDTO(Date docDate, Integer box, String docNum, String cardCode, String cardName, String transport, String street, String depart, String city, String codCity, BigDecimal valStandDecl, Integer unidEmpStand, String rexpedition) {
        this.docDate = docDate;
        this.box = box;
        this.docNum = docNum;
        this.cardCode = cardCode;
        this.cardName = cardName;
        this.transport = transport;
        this.street = street;
        this.depart = depart;
        this.city = city;
        this.codCity = codCity;
        this.valStandDecl = valStandDecl;
        this.unidEmpStand = unidEmpStand;
        this.rexpedition = rexpedition;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public Integer getBox() {
        return box;
    }

    public void setBox(Integer box) {
        this.box = box;
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

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCodCity() {
        return codCity;
    }

    public void setCodCity(String codCity) {
        this.codCity = codCity;
    }

    public BigDecimal getValStandDecl() {
        return valStandDecl;
    }

    public void setValStandDecl(BigDecimal valStandDecl) {
        this.valStandDecl = valStandDecl;
    }

    public Integer getUnidEmpStand() {
        return unidEmpStand;
    }

    public void setUnidEmpStand(Integer unidEmpStand) {
        this.unidEmpStand = unidEmpStand;
    }

    public String getRexpedition() {
        return rexpedition;
    }

    public void setRexpedition(String rexpedition) {
        this.rexpedition = rexpedition;
    }

    @Override
    public String toString() {
        return "InvoiceDTO{" +
                "docDate=" + docDate +
                ", box=" + box +
                ", docNum='" + docNum + '\'' +
                ", cardCode='" + cardCode + '\'' +
                ", cardName='" + cardName + '\'' +
                ", transport='" + transport + '\'' +
                ", street='" + street + '\'' +
                ", depart='" + depart + '\'' +
                ", city='" + city + '\'' +
                ", codCity='" + codCity + '\'' +
                ", valStandDecl=" + valStandDecl +
                ", unidEmpStand=" + unidEmpStand +
                ", rexpedition='" + rexpedition + '\'' +
                '}';
    }
}