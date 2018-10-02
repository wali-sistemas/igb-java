package co.igb.dto;

import java.util.Date;

/**
 *
 * @author dbotero
 */
public class SalesOrderDTO {

    private Long docEntry;
    private String docNum;
    private String series;
    private String confirmed;
    private Long salesPersonCode;
    private Date docDate;
    private String cardCode;
    private String cardName;
    private Integer items;
    private String comments;
    private String assignedPickingEmployee;
    private String status;
    private String address;
    private String transp;

    public Long getDocEntry() {
        return docEntry;
    }

    public void setDocEntry(Long docEntry) {
        this.docEntry = docEntry;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public String getDocNum() {
        return docNum;
    }

    public void setDocNum(String docNum) {
        this.docNum = docNum;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Long getSalesPersonCode() {
        return salesPersonCode;
    }

    public void setSalesPersonCode(Long salesPersonCode) {
        this.salesPersonCode = salesPersonCode;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
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

    public Integer getItems() {
        return items;
    }

    public void setItems(Integer items) {
        this.items = items;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getAssignedPickingEmployee() {
        return assignedPickingEmployee;
    }

    public void setAssignedPickingEmployee(String assignedPickingEmployee) {
        this.assignedPickingEmployee = assignedPickingEmployee;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTransp() {
        return transp;
    }

    public void setTransp(String transp) {
        this.transp = transp;
    }
}
