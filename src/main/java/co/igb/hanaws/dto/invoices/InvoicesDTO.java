package co.igb.hanaws.dto.invoices;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoicesDTO implements Serializable {
    @JsonProperty("CardCode")
    protected String cardCode;
    @JsonProperty("Comments")
    protected String comments;
    @JsonProperty("Series")
    protected Long series;
    @JsonProperty("DocDate")
    protected String docDate;
    @JsonProperty("DocDueDate")
    protected String docDueDate;
    @JsonProperty("ContactPersonCode")
    protected Long contactPersonCode;
    @JsonProperty("SalesPersonCode")
    protected Long salesPersonCode;
    @JsonProperty("BaseAmount")
    protected BigDecimal baseAmount;
    @JsonProperty("VatSum")
    protected BigDecimal vatSum;
    @JsonProperty("U_WUID")
    protected String uWUID;
    @JsonProperty("U_TOT_CAJ")
    protected Double utotcaj;
    @JsonProperty("U_NUNFAC")
    protected String ununfac;
    @JsonProperty("U_TRANSP")
    protected String utransp;
    @JsonProperty("DocumentLines")
    protected List<InvoicesDTO.DocumentLines.DocumentLine> documentLines;
    @JsonProperty("DocumentAdditionalExpenses")
    protected List<InvoicesDTO.DocumentAdditionalExpenses.DocumentAdditionalExpense> documentAdditionalExpenses;
    @JsonProperty("WithholdingTaxDataCollection")
    protected List<InvoicesDTO.WithholdingTaxDataCollection.WithholdingTaxData> withholdingTaxDataCollection;

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Long getSeries() {
        return series;
    }

    public void setSeries(Long series) {
        this.series = series;
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

    public Long getContactPersonCode() {
        return contactPersonCode;
    }

    public void setContactPersonCode(Long contactPersonCode) {
        this.contactPersonCode = contactPersonCode;
    }

    public Long getSalesPersonCode() {
        return salesPersonCode;
    }

    public void setSalesPersonCode(Long salesPersonCode) {
        this.salesPersonCode = salesPersonCode;
    }

    public BigDecimal getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(BigDecimal baseAmount) {
        this.baseAmount = baseAmount;
    }

    public BigDecimal getVatSum() {
        return vatSum;
    }

    public void setVatSum(BigDecimal vatSum) {
        this.vatSum = vatSum;
    }

    public String getuWUID() {
        return uWUID;
    }

    public void setuWUID(String uWUID) {
        this.uWUID = uWUID;
    }

    public Double getUtotcaj() {
        return utotcaj;
    }

    public void setUtotcaj(Double utotcaj) {
        this.utotcaj = utotcaj;
    }

    public String getUnunfac() {
        return ununfac;
    }

    public void setUnunfac(String ununfac) {
        this.ununfac = ununfac;
    }

    public String getUtransp() {
        return utransp;
    }

    public void setUtransp(String utransp) {
        this.utransp = utransp;
    }

    public List<DocumentLines.DocumentLine> getDocumentLines() {
        return documentLines;
    }

    public void setDocumentLines(List<DocumentLines.DocumentLine> documentLines) {
        this.documentLines = documentLines;
    }

    public List<DocumentAdditionalExpenses.DocumentAdditionalExpense> getDocumentAdditionalExpenses() {
        return documentAdditionalExpenses;
    }

    public void setDocumentAdditionalExpenses(List<DocumentAdditionalExpenses.DocumentAdditionalExpense> documentAdditionalExpenses) {
        this.documentAdditionalExpenses = documentAdditionalExpenses;
    }

    public List<WithholdingTaxDataCollection.WithholdingTaxData> getWithholdingTaxDataCollection() {
        return withholdingTaxDataCollection;
    }

    public void setWithholdingTaxDataCollection(List<WithholdingTaxDataCollection.WithholdingTaxData> withholdingTaxDataCollection) {
        this.withholdingTaxDataCollection = withholdingTaxDataCollection;
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
            @JsonProperty("BaseType")
            protected Long baseType;
            @JsonProperty("BaseEntry")
            protected Long baseEntry;
            @JsonProperty("BaseLine")
            protected Long baseLine;

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

            public Long getBaseType() {
                return baseType;
            }

            public void setBaseType(Long baseType) {
                this.baseType = baseType;
            }

            public Long getBaseEntry() {
                return baseEntry;
            }

            public void setBaseEntry(Long baseEntry) {
                this.baseEntry = baseEntry;
            }

            public Long getBaseLine() {
                return baseLine;
            }

            public void setBaseLine(Long baseLine) {
                this.baseLine = baseLine;
            }
        }
    }

    public static class DocumentAdditionalExpenses {
        public static class DocumentAdditionalExpense {
            @JsonProperty("ExpenseCode")
            protected Long expenseCode;
            @JsonProperty("LineTotal")
            protected BigDecimal lineTotal;
            @JsonProperty("TaxCode")
            protected String taxCode;
            @JsonProperty("BaseDocEntry")
            protected long baseDocEntry;
            @JsonProperty("BaseDocLine")
            protected long baseDocLine;
            @JsonProperty("BaseDocType")
            protected long baseDocType;
            @JsonProperty("BaseDocumentReference")
            protected long baseDocumentReference;

            public Long getExpenseCode() {
                return expenseCode;
            }

            public void setExpenseCode(Long expenseCode) {
                this.expenseCode = expenseCode;
            }

            public BigDecimal getLineTotal() {
                return lineTotal;
            }

            public void setLineTotal(BigDecimal lineTotal) {
                this.lineTotal = lineTotal;
            }

            public String getTaxCode() {
                return taxCode;
            }

            public void setTaxCode(String taxCode) {
                this.taxCode = taxCode;
            }

            public long getBaseDocEntry() {
                return baseDocEntry;
            }

            public void setBaseDocEntry(long baseDocEntry) {
                this.baseDocEntry = baseDocEntry;
            }

            public long getBaseDocLine() {
                return baseDocLine;
            }

            public void setBaseDocLine(long baseDocLine) {
                this.baseDocLine = baseDocLine;
            }

            public long getBaseDocType() {
                return baseDocType;
            }

            public void setBaseDocType(long baseDocType) {
                this.baseDocType = baseDocType;
            }

            public long getBaseDocumentReference() {
                return baseDocumentReference;
            }

            public void setBaseDocumentReference(long baseDocumentReference) {
                this.baseDocumentReference = baseDocumentReference;
            }
        }
    }

    public static class WithholdingTaxDataCollection {
        public static class WithholdingTaxData {
            @JsonProperty("WTCode")
            protected String wtCode;
            @JsonProperty("WTAmount")
            protected BigDecimal wtAmount;
            @JsonProperty("TaxableAmount")
            protected BigDecimal taxableAmount;
            @JsonProperty("U_Base_ML")
            protected BigDecimal uBaseML;
            @JsonProperty("U_Base_MS")
            protected BigDecimal uBaseMS;
            @JsonProperty("U_Base_ME")
            protected BigDecimal uBaseME;
            @JsonProperty("U_Tarifa")
            protected Double uTarifa;
            @JsonProperty("U_Fuente")
            protected String uFuente;
            @JsonProperty("U_Ret_ML")
            protected BigDecimal uRetML;
            @JsonProperty("U_Ret_MS")
            protected BigDecimal uRetMS;
            @JsonProperty("U_Ret_ME")
            protected BigDecimal uRetME;

            public String getWtCode() {
                return wtCode;
            }

            public void setWtCode(String wtCode) {
                this.wtCode = wtCode;
            }

            public BigDecimal getWtAmount() {
                return wtAmount;
            }

            public void setWtAmount(BigDecimal wtAmount) {
                this.wtAmount = wtAmount;
            }

            public BigDecimal getTaxableAmount() {
                return taxableAmount;
            }

            public void setTaxableAmount(BigDecimal taxableAmount) {
                this.taxableAmount = taxableAmount;
            }

            public BigDecimal getuBaseML() {
                return uBaseML;
            }

            public void setuBaseML(BigDecimal uBaseML) {
                this.uBaseML = uBaseML;
            }

            public BigDecimal getuBaseMS() {
                return uBaseMS;
            }

            public void setuBaseMS(BigDecimal uBaseMS) {
                this.uBaseMS = uBaseMS;
            }

            public BigDecimal getuBaseME() {
                return uBaseME;
            }

            public void setuBaseME(BigDecimal uBaseME) {
                this.uBaseME = uBaseME;
            }

            public Double getuTarifa() {
                return uTarifa;
            }

            public void setuTarifa(Double uTarifa) {
                this.uTarifa = uTarifa;
            }

            public String getuFuente() {
                return uFuente;
            }

            public void setuFuente(String uFuente) {
                this.uFuente = uFuente;
            }

            public BigDecimal getuRetML() {
                return uRetML;
            }

            public void setuRetML(BigDecimal uRetML) {
                this.uRetML = uRetML;
            }

            public BigDecimal getuRetMS() {
                return uRetMS;
            }

            public void setuRetMS(BigDecimal uRetMS) {
                this.uRetMS = uRetMS;
            }

            public BigDecimal getuRetME() {
                return uRetME;
            }

            public void setuRetME(BigDecimal uRetME) {
                this.uRetME = uRetME;
            }
        }
    }

    @Override
    public String toString() {
        return "InvoicesDTO{" +
                "cardCode='" + cardCode + '\'' +
                ", comments='" + comments + '\'' +
                ", series=" + series +
                ", docDate='" + docDate + '\'' +
                ", docDueDate='" + docDueDate + '\'' +
                ", contactPersonCode=" + contactPersonCode +
                ", salesPersonCode=" + salesPersonCode +
                ", baseAmount=" + baseAmount +
                ", vatSum=" + vatSum +
                ", uWUID='" + uWUID + '\'' +
                ", utotcaj=" + utotcaj +
                ", ununfac='" + ununfac + '\'' +
                ", documentLines=" + documentLines +
                ", documentAdditionalExpenses=" + documentAdditionalExpenses +
                ", withholdingTaxDataCollection=" + withholdingTaxDataCollection +
                '}';
    }
}