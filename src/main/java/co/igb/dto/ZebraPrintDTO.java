package co.igb.dto;

/**
 * @author dbotero
 */
public class ZebraPrintDTO {
    private Integer boxNumber;
    private Integer totalBoxes;
    private String printerName;
    private String packageTo;
    private String carrier;
    private String address;
    private String salesOrderNumbers;
    private String numAtCards;
    private String employee;
    private String city;
    private String state;
    private String invoice;
    private String payment;

    public ZebraPrintDTO() {
    }

    public ZebraPrintDTO(Integer boxNumber, Integer totalBoxes, String printerName, String packageTo, String carrier, String address, String salesOrderNumbers, String numAtCards, String employee, String city, String state, String invoice, String payment) {
        this.boxNumber = boxNumber;
        this.totalBoxes = totalBoxes;
        this.printerName = printerName;
        this.packageTo = packageTo;
        this.carrier = carrier;
        this.address = address;
        this.salesOrderNumbers = salesOrderNumbers;
        this.numAtCards = numAtCards;
        this.employee = employee;
        this.city = city;
        this.state = state;
        this.invoice = invoice;
        this.payment = payment;
    }

    public void setAddress(String address) {
        this.address = address;
        this.address = this.address.replace("\r", " ");
    }

    public String getAddressLine1() {
        if (address.length() <= 55) {
            return address;
        } else {
            return address.substring(0, 55);
        }
    }

    public String getAddressLine2() {
        if (address.length() > 55) {
            return address.substring(55, address.length() > 110 ? 110 : address.length());
        }
        return "";
    }

    public String getAddressLine3() {
        if (address.length() > 110) {
            return address.substring(110, address.length() > 165 ? 165 : address.length());
        }
        return "";
    }

    public String getAddressLine4() {
        if (address.length() > 165) {
            return address.substring(165, address.length() > 220 ? 220 : address.length());
        }
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
        if (packageTo.length() <= 43) {
            return packageTo;
        }
        return packageTo.substring(0, 43);
    }

    public String getCardName2() {
        if (packageTo == null || packageTo.trim().isEmpty() || packageTo.length() <= 43) {
            return "";
        }
        if (packageTo.length() < 86) {
            return packageTo.substring(43);
        }
        return packageTo.substring(43, 86);
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPackageTo(String packageTo) {
        this.packageTo = packageTo;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
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
        sb.append(", employee: ");
        sb.append(this.getEmployee());
        sb.append(", city: ");
        sb.append(this.getCity());
        sb.append(", state: ");
        sb.append(this.getState());
        sb.append(", invoice: ");
        sb.append(this.getInvoice());
        sb.append(", payment: ");
        sb.append(this.getPayment());
        sb.append("}");
        return sb.toString();
    }
}