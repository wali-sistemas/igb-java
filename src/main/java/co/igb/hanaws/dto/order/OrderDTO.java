package co.igb.hanaws.dto.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderDTO implements Serializable {
    @JsonProperty("DocEntry")
    protected Long docEntry;
    @JsonProperty("DocNum")
    protected Long docNum;
    @JsonProperty("DocDate")
    protected String docDate;
    @JsonProperty("DocDueDate")
    protected String docDueDate;
    @JsonProperty("CardCode")
    protected String cardCode;
    @JsonProperty("NumAtCard")
    protected String numAtCard;
    @JsonProperty("Comments")
    protected String comments;
    @JsonProperty("JournalMemo")
    protected String journalMemo;
    @JsonProperty("SalesPersonCode")
    protected Long salesPersonCode;
    @JsonProperty("Confirmed")
    protected String confirmed;
    @JsonProperty("Series")
    protected Long series;
    @JsonProperty("ShipToCode")
    protected String shipToCode;
    @JsonProperty("DiscountPercent")
    protected Double discountPercent;
    @JsonProperty("PayToCode")
    protected String payToCode;
    @JsonProperty("U_TRANSP")
    protected String utransp;
    @JsonProperty("U_SEPARADOR")
    protected String useparador;
    @JsonProperty("U_FEC_INI")
    protected String ufecini;
    @JsonProperty("U_SERIAL")
    protected String uSerialMDL;
    @JsonProperty("DocumentLines")
    protected List<DocumentLines.DocumentLine> documentLines;

    public Long getDocEntry() {
        return docEntry;
    }

    public void setDocEntry(Long docEntry) {
        this.docEntry = docEntry;
    }

    public Long getDocNum() {
        return docNum;
    }

    public void setDocNum(Long docNum) {
        this.docNum = docNum;
    }

    public String getDocDate() {
        return docDate;
    }

    public void setDocDate(String docDate) {
        this.docDate = docDate;
    }

    public String getDocDueDate() {
        return docDueDate;
    }

    public void setDocDueDate(String docDueDate) {
        this.docDueDate = docDueDate;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getNumAtCard() {
        return numAtCard;
    }

    public void setNumAtCard(String numAtCard) {
        this.numAtCard = numAtCard;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getJournalMemo() {
        return journalMemo;
    }

    public void setJournalMemo(String journalMemo) {
        this.journalMemo = journalMemo;
    }

    public Long getSalesPersonCode() {
        return salesPersonCode;
    }

    public void setSalesPersonCode(Long salesPersonCode) {
        this.salesPersonCode = salesPersonCode;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public Long getSeries() {
        return series;
    }

    public void setSeries(Long series) {
        this.series = series;
    }

    public String getShipToCode() {
        return shipToCode;
    }

    public void setShipToCode(String shipToCode) {
        this.shipToCode = shipToCode;
    }

    public Double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public String getPayToCode() {
        return payToCode;
    }

    public void setPayToCode(String payToCode) {
        this.payToCode = payToCode;
    }

    public String getUtransp() {
        return utransp;
    }

    public void setUtransp(String utransp) {
        this.utransp = utransp;
    }

    public String getUseparador() {
        return useparador;
    }

    public void setUseparador(String useparador) {
        this.useparador = useparador;
    }

    public String getUfecini() {
        return ufecini;
    }

    public void setUfecini(String ufecini) {
        this.ufecini = ufecini;
    }

    public String getuSerialMDL() {
        return uSerialMDL;
    }

    public void setuSerialMDL(String uSerialMDL) {
        this.uSerialMDL = uSerialMDL;
    }

    public List<DocumentLines.DocumentLine> getDocumentLines() {
        return documentLines;
    }

    public void setDocumentLines(List<DocumentLines.DocumentLine> documentLines) {
        this.documentLines = documentLines;
    }

    public static class DocumentLines {
        public static class DocumentLine {
            @JsonProperty("LineNum")
            protected Long lineNum;
            @JsonProperty("ItemCode")
            protected String itemCode;
            @JsonProperty("Quantity")
            protected Double quantity;
            @JsonProperty("WarehouseCode")
            protected String warehouseCode;
            @JsonProperty("CostingCode")
            protected String costingCode;

            public Long getLineNum() {
                return lineNum;
            }

            public void setLineNum(Long lineNum) {
                this.lineNum = lineNum;
            }

            public String getItemCode() {
                return itemCode;
            }

            public void setItemCode(String itemCode) {
                this.itemCode = itemCode;
            }

            public Double getQuantity() {
                return quantity;
            }

            public void setQuantity(Double quantity) {
                this.quantity = quantity;
            }

            public String getWarehouseCode() {
                return warehouseCode;
            }

            public void setWarehouseCode(String warehouseCode) {
                this.warehouseCode = warehouseCode;
            }

            public String getCostingCode() {
                return costingCode;
            }

            public void setCostingCode(String costingCode) {
                this.costingCode = costingCode;
            }

            @Override
            public String toString() {
                return "DocumentLine{" +
                        "lineNum='" + lineNum + '\'' +
                        ", itemCode='" + itemCode + '\'' +
                        ", quantity=" + quantity +
                        ", warehouseCode='" + warehouseCode + '\'' +
                        ", costingCode='" + costingCode + '\'' +
                        '}';
            }
        }
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "docEntry=" + docEntry +
                ", docNum=" + docNum +
                ", docDate='" + docDate + '\'' +
                ", docDueDate='" + docDueDate + '\'' +
                ", cardCode='" + cardCode + '\'' +
                ", numAtCard='" + numAtCard + '\'' +
                ", comments='" + comments + '\'' +
                ", journalMemo='" + journalMemo + '\'' +
                ", salesPersonCode=" + salesPersonCode +
                ", confirmed='" + confirmed + '\'' +
                ", series=" + series +
                ", shipToCode='" + shipToCode + '\'' +
                ", discountPercent=" + discountPercent +
                ", payToCode='" + payToCode + '\'' +
                ", utransp='" + utransp + '\'' +
                ", useparador='" + useparador + '\'' +
                ", ufecini='" + ufecini + '\'' +
                ", uSerialMDL='" + uSerialMDL + '\'' +
                ", documentLines=" + documentLines +
                '}';
    }
}