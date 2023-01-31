package co.igb.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author dbotero
 */
public class SalesOrderDTO {
    private Long docEntry;
    private String docNum;
    private String series;
    private String confirmed;
    private Integer salesPersonCode;
    private Date docDate;
    private String cardCode;
    private String cardName;
    private Integer items;
    private String comments;
    private String assignedPickingEmployee;
    private String status;
    private String address;
    private String transp;
    private String docNumMDL;
    private String whsCode;
    private BigDecimal subTotal;
    private BigDecimal vlrDeclarStand;
    private Integer undEmpStand;
    private Integer qty;
    private BigDecimal porcFlet;
    private BigDecimal totalFlet;
    private String condPayment;
    private String marca;

    public SalesOrderDTO() {
    }

    public SalesOrderDTO(Long docEntry, String docNum, String series, String confirmed, Integer salesPersonCode, Date docDate, String cardCode, String cardName, Integer items, String comments, String assignedPickingEmployee, String status, String address, String transp, String docNumMDL) {
        this.docEntry = docEntry;
        this.docNum = docNum;
        this.series = series;
        this.confirmed = confirmed;
        this.salesPersonCode = salesPersonCode;
        this.docDate = docDate;
        this.cardCode = cardCode;
        this.cardName = cardName;
        this.items = items;
        this.comments = comments;
        this.assignedPickingEmployee = assignedPickingEmployee;
        this.status = status;
        this.address = address;
        this.transp = transp;
        this.docNumMDL = docNumMDL;
    }

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

    public Integer getSalesPersonCode() {
        return salesPersonCode;
    }

    public void setSalesPersonCode(Integer salesPersonCode) {
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

    public String getDocNumMDL() {
        return docNumMDL;
    }

    public void setDocNumMDL(String docNumMDL) {
        this.docNumMDL = docNumMDL;
    }

    public String getWhsCode() {
        return whsCode;
    }

    public void setWhsCode(String whsCode) {
        this.whsCode = whsCode;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public BigDecimal getVlrDeclarStand() {
        return vlrDeclarStand;
    }

    public void setVlrDeclarStand(BigDecimal vlrDeclarStand) {
        this.vlrDeclarStand = vlrDeclarStand;
    }

    public Integer getUndEmpStand() {
        return undEmpStand;
    }

    public void setUndEmpStand(Integer undEmpStand) {
        this.undEmpStand = undEmpStand;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public BigDecimal getPorcFlet() {
        return porcFlet;
    }

    public void setPorcFlet(BigDecimal porcFlet) {
        this.porcFlet = porcFlet;
    }

    public BigDecimal getTotalFlet() {
        return totalFlet;
    }

    public void setTotalFlet(BigDecimal totalFlet) {
        this.totalFlet = totalFlet;
    }

    public String getCondPayment() {
        return condPayment;
    }

    public void setCondPayment(String condPayment) {
        this.condPayment = condPayment;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "SalesOrderDTO{" +
                "docEntry=" + docEntry +
                ", docNum='" + docNum + '\'' +
                ", series='" + series + '\'' +
                ", confirmed='" + confirmed + '\'' +
                ", salesPersonCode=" + salesPersonCode +
                ", docDate=" + docDate +
                ", cardCode='" + cardCode + '\'' +
                ", cardName='" + cardName + '\'' +
                ", items=" + items +
                ", comments='" + comments + '\'' +
                ", assignedPickingEmployee='" + assignedPickingEmployee + '\'' +
                ", status='" + status + '\'' +
                ", address='" + address + '\'' +
                ", transp='" + transp + '\'' +
                ", docNumMDL='" + docNumMDL + '\'' +
                ", whsCode='" + whsCode + '\'' +
                ", subTotal=" + subTotal +
                ", vlrDeclarStand=" + vlrDeclarStand +
                ", undEmpStand=" + undEmpStand +
                ", qty=" + qty +
                ", porcFlet=" + porcFlet +
                ", totalFlet=" + totalFlet +
                ", condPayment='" + condPayment + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}