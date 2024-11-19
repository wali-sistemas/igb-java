package co.igb.transportws.dto.exxe;

import java.io.Serializable;

/**
 * @author jguisao
 */
public class GuiaExxeDTO implements Serializable {
    private String shipToIdentification;
    private String shipToName;
    private String shipToAddress;
    private String shipToPhoneNumber;
    private String shipToCityCode;
    private String shipFromCityCode;
    private String shipToEmail;
    private String description;
    private Integer weightKg;
    private Integer declaredValue;
    private Integer quantitypackages;
    private Integer idAccountCustomer;
    private String referenceDocument;
    private Integer deliveryNumber;
    private String otherReferenceDocuments;
    private Integer moneyCollect;
    private Integer moneyColletionDescription;
    private String packagesDescription;

    public String getShipToIdentification() {
        return shipToIdentification;
    }

    public void setShipToIdentification(String shipToIdentification) {
        this.shipToIdentification = shipToIdentification;
    }

    public String getShipToName() {
        return shipToName;
    }

    public void setShipToName(String shipToName) {
        this.shipToName = shipToName;
    }

    public String getShipToAddress() {
        return shipToAddress;
    }

    public void setShipToAddress(String shipToAddress) {
        this.shipToAddress = shipToAddress;
    }

    public String getShipToPhoneNumber() {
        return shipToPhoneNumber;
    }

    public void setShipToPhoneNumber(String shipToPhoneNumber) {
        this.shipToPhoneNumber = shipToPhoneNumber;
    }

    public String getShipToCityCode() {
        return shipToCityCode;
    }

    public void setShipToCityCode(String shipToCityCode) {
        this.shipToCityCode = shipToCityCode;
    }

    public String getShipFromCityCode() {
        return shipFromCityCode;
    }

    public void setShipFromCityCode(String shipFromCityCode) {
        this.shipFromCityCode = shipFromCityCode;
    }

    public String getShipToEmail() {
        return shipToEmail;
    }

    public void setShipToEmail(String shipToEmail) {
        this.shipToEmail = shipToEmail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(Integer weightKg) {
        this.weightKg = weightKg;
    }

    public Integer getDeclaredValue() {
        return declaredValue;
    }

    public void setDeclaredValue(Integer declaredValue) {
        this.declaredValue = declaredValue;
    }

    public Integer getQuantitypackages() {
        return quantitypackages;
    }

    public void setQuantitypackages(Integer quantitypackages) {
        this.quantitypackages = quantitypackages;
    }

    public Integer getIdAccountCustomer() {
        return idAccountCustomer;
    }

    public void setIdAccountCustomer(Integer idAccountCustomer) {
        this.idAccountCustomer = idAccountCustomer;
    }

    public String getReferenceDocument() {
        return referenceDocument;
    }

    public void setReferenceDocument(String referenceDocument) {
        this.referenceDocument = referenceDocument;
    }

    public Integer getDeliveryNumber() {
        return deliveryNumber;
    }

    public void setDeliveryNumber(Integer deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }

    public String getOtherReferenceDocuments() {
        return otherReferenceDocuments;
    }

    public void setOtherReferenceDocuments(String otherReferenceDocuments) {
        this.otherReferenceDocuments = otherReferenceDocuments;
    }

    public Integer getMoneyCollect() {
        return moneyCollect;
    }

    public void setMoneyCollect(Integer moneyCollect) {
        this.moneyCollect = moneyCollect;
    }

    public Integer getMoneyColletionDescription() {
        return moneyColletionDescription;
    }

    public void setMoneyColletionDescription(Integer moneyColletionDescription) {
        this.moneyColletionDescription = moneyColletionDescription;
    }

    public String getPackagesDescription() {
        return packagesDescription;
    }

    public void setPackagesDescription(String packagesDescription) {
        this.packagesDescription = packagesDescription;
    }
}