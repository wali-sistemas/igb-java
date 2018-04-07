package co.igb.dto;

/**
 *
 * @author dbotero
 */
public class ZebraPrintDTO {

    public static final String BOX_LABEL = "BOX_LABEL";
    private Integer boxNumber;
    private Integer totalBoxes;
    private String printerName;
    private String packageTo;
    private String carrier;
    private String address;
    private String salesOrderNumbers;
    private String numAtCards;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressLine1() {
        return "";
    }

    public String getAddressLine2() {
        return "";
    }

    public String getAddressLine3() {
        return "";
    }

    public String getAddressLine4() {
        return "";
    }

    public void setBoxNumber(Integer boxNumber) {
        this.boxNumber = boxNumber;
    }

    public Integer getBoxNumber() {
        return boxNumber;
    }

    public Integer getTotalBoxes() {
        return totalBoxes;
    }

    public void setTotalBoxes(Integer totalBoxes) {
        this.totalBoxes = totalBoxes;
    }

    public String getNumAtCards() {
        return numAtCards;
    }

    public void setNumAtCards(String numAtCards) {
        this.numAtCards = numAtCards;
    }

    public String getSalesOrderNumbers() {
        return salesOrderNumbers;
    }

    public void setSalesOrderNumbers(String salesOrderNumbers) {
        this.salesOrderNumbers = salesOrderNumbers;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPrinterName() {
        return printerName;
    }

    public void setPrinterName(String printerName) {
        this.printerName = printerName;
    }

    public String getCardName1() {
        if (packageTo == null || packageTo.trim().isEmpty()) {
            return "";
        }
        if (packageTo.length() <= 48) {
            return packageTo;
        }
        return packageTo.substring(0, 48);
    }

    public String getCardName2() {
        if (packageTo == null || packageTo.trim().isEmpty() || packageTo.length() <= 48) {
            return "";
        }
        if (packageTo.length() < 96) {
            return packageTo.substring(48);
        }
        return packageTo.substring(48, 96);
    }

    public void setPackageTo(String packageTo) {
        this.packageTo = packageTo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ZebraPrintDTO{");
        sb.append("address: ");
        sb.append(this.address);
        sb.append(", boxNumber: ");
        sb.append(this.getBoxNumber());
        sb.append(", cardName1: ");
        sb.append(this.getCardName1());
        sb.append(", cardName2: ");
        sb.append(this.getCardName2());
        sb.append(", carrier: ");
        sb.append(this.getCarrier());
        sb.append(", numAtCards: ");
        sb.append(this.getNumAtCards());
        sb.append(", printerName: ");
        sb.append(this.getPrinterName());
        sb.append(", salesOrderNumbers: ");
        sb.append(this.getSalesOrderNumbers());
        sb.append(", totalBoxes: ");
        sb.append(this.getTotalBoxes());
        sb.append(", addressLine1: ");
        sb.append(this.getAddressLine1());
        sb.append(", addressLine2: ");
        sb.append(this.getAddressLine2());
        sb.append(", addressLine3: ");
        sb.append(this.getAddressLine3());
        sb.append(", addressLine4: ");
        sb.append(this.getAddressLine4());
        sb.append("}");
        return sb.toString();
    }

}