package co.igb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackingOrderDTO {
    private String concept;
    private String information;
    private String order;
    private String cardCode;
    private String userName;
    private String typeShipment;
    private String nroQty;
    private String buyer;
    private String liquid;
    private Date createDate;

    public TrackingOrderDTO() {
    }

    public TrackingOrderDTO(String concept, String information, String order, String cardCode, String userName, String typeShipment, String nroQty, String buyer, String liquid, Date createDate) {
        this.concept = concept;
        this.information = information;
        this.order = order;
        this.cardCode = cardCode;
        this.userName = userName;
        this.typeShipment = typeShipment;
        this.nroQty = nroQty;
        this.buyer = buyer;
        this.liquid = liquid;
        this.createDate = createDate;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getTypeShipment() {
        return typeShipment;
    }

    public void setTypeShipment(String typeShipment) {
        this.typeShipment = typeShipment;
    }

    public String getNroQty() {
        return nroQty;
    }

    public void setNroQty(String nroQty) {
        this.nroQty = nroQty;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLiquid() {
        return liquid;
    }

    public void setLiquid(String liquid) {
        this.liquid = liquid;
    }

    @Override
    public String toString() {
        return "TrackingOrderDTO{" +
                "concept='" + concept + '\'' +
                ", information='" + information + '\'' +
                ", order='" + order + '\'' +
                ", cardCode='" + cardCode + '\'' +
                ", userName='" + userName + '\'' +
                ", typeShipment='" + typeShipment + '\'' +
                ", nroQty='" + nroQty + '\'' +
                ", buyer='" + buyer + '\'' +
                ", liquid='" + liquid + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}