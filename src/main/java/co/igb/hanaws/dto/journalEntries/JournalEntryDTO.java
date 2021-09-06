package co.igb.hanaws.dto.journalEntries;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class JournalEntryDTO implements Serializable {
    @JsonProperty("JdtNum")
    protected Long jdtNum;
    @JsonProperty("AutoVAT")
    protected String autoVAT;
    @JsonProperty("DueDate")
    protected String dueDate;
    @JsonProperty("Memo")
    protected String memo;
    @JsonProperty("ReferenceDate")
    protected String referenceDate;
    @JsonProperty("Series")
    protected Long series;
    @JsonProperty("StampTax")
    protected String stampTax;
    @JsonProperty("TaxDate")
    protected String taxDate;
    @JsonProperty("TransactionCode")
    protected String transactionCode;
    @JsonProperty("UseAutoStorno")
    protected String useAutoStorno;
    @JsonProperty("VatDate")
    protected String vatDate;
    @JsonProperty("JournalEntryLines")
    protected List<JournalEntryDTO.JournalEntryLines> journalEntryLines;

    public JournalEntryDTO() {
    }

    public Long getJdtNum() {
        return jdtNum;
    }

    public void setJdtNum(Long jdtNum) {
        this.jdtNum = jdtNum;
    }

    public String getAutoVAT() {
        return autoVAT;
    }

    public void setAutoVAT(String autoVAT) {
        this.autoVAT = autoVAT;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getReferenceDate() {
        return referenceDate;
    }

    public void setReferenceDate(String referenceDate) {
        this.referenceDate = referenceDate;
    }

    public Long getSeries() {
        return series;
    }

    public void setSeries(Long series) {
        this.series = series;
    }

    public String getStampTax() {
        return stampTax;
    }

    public void setStampTax(String stampTax) {
        this.stampTax = stampTax;
    }

    public String getTaxDate() {
        return taxDate;
    }

    public void setTaxDate(String taxDate) {
        this.taxDate = taxDate;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public String getUseAutoStorno() {
        return useAutoStorno;
    }

    public void setUseAutoStorno(String useAutoStorno) {
        this.useAutoStorno = useAutoStorno;
    }

    public String getVatDate() {
        return vatDate;
    }

    public void setVatDate(String vatDate) {
        this.vatDate = vatDate;
    }

    public List<JournalEntryLines> getJournalEntryLines() {
        return journalEntryLines;
    }

    public void setJournalEntryLines(List<JournalEntryLines> journalEntryLines) {
        this.journalEntryLines = journalEntryLines;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class JournalEntryLines implements Serializable {
        @JsonProperty("Line_ID")
        protected Long lineID;
        @JsonProperty("AccountCode")
        protected String accountCode;
        @JsonProperty("Debit")
        protected BigDecimal debit;
        @JsonProperty("Credit")
        protected BigDecimal credit;
        @JsonProperty("U_InfoCo01")
        protected String uInfoCo01;
        @JsonProperty("ControlAccount")
        protected String controlAccount;
        @JsonProperty("CostingCode")
        protected String costingCode;
        @JsonProperty("DueDate")
        protected String dueDate;
        @JsonProperty("Reference1")
        protected String reference1;
        @JsonProperty("ReferenceDate1")
        protected String referenceDate1;
        @JsonProperty("ReferenceDate2")
        protected String referenceDate2;
        @JsonProperty("TaxDate")
        protected String taxDate;
        @JsonProperty("VatDate")
        protected String vatDate;
        @JsonProperty("ProjectCode")
        protected String projectCode;

        public Long getLineID() {
            return lineID;
        }

        public void setLineID(Long lineID) {
            this.lineID = lineID;
        }

        public String getAccountCode() {
            return accountCode;
        }

        public void setAccountCode(String accountCode) {
            this.accountCode = accountCode;
        }

        public BigDecimal getDebit() {
            return debit;
        }

        public void setDebit(BigDecimal debit) {
            this.debit = debit;
        }

        public BigDecimal getCredit() {
            return credit;
        }

        public void setCredit(BigDecimal credit) {
            this.credit = credit;
        }

        public String getuInfoCo01() {
            return uInfoCo01;
        }

        public void setuInfoCo01(String uInfoCo01) {
            this.uInfoCo01 = uInfoCo01;
        }

        public String getControlAccount() {
            return controlAccount;
        }

        public void setControlAccount(String controlAccount) {
            this.controlAccount = controlAccount;
        }

        public String getCostingCode() {
            return costingCode;
        }

        public void setCostingCode(String costingCode) {
            this.costingCode = costingCode;
        }

        public String getDueDate() {
            return dueDate;
        }

        public void setDueDate(String dueDate) {
            this.dueDate = dueDate;
        }

        public String getReference1() {
            return reference1;
        }

        public void setReference1(String reference1) {
            this.reference1 = reference1;
        }

        public String getReferenceDate1() {
            return referenceDate1;
        }

        public void setReferenceDate1(String referenceDate1) {
            this.referenceDate1 = referenceDate1;
        }

        public String getReferenceDate2() {
            return referenceDate2;
        }

        public void setReferenceDate2(String referenceDate2) {
            this.referenceDate2 = referenceDate2;
        }

        public String getTaxDate() {
            return taxDate;
        }

        public void setTaxDate(String taxDate) {
            this.taxDate = taxDate;
        }

        public String getVatDate() {
            return vatDate;
        }

        public void setVatDate(String vatDate) {
            this.vatDate = vatDate;
        }

        public String getProjectCode() {
            return projectCode;
        }

        public void setProjectCode(String projectCode) {
            this.projectCode = projectCode;
        }

        @Override
        public String toString() {
            return "JournalEntryLines{" +
                    "lineID=" + lineID +
                    ", accountCode='" + accountCode + '\'' +
                    ", debit=" + debit +
                    ", credit=" + credit +
                    ", uInfoCo01='" + uInfoCo01 + '\'' +
                    ", controlAccount='" + controlAccount + '\'' +
                    ", costingCode='" + costingCode + '\'' +
                    ", dueDate='" + dueDate + '\'' +
                    ", reference1='" + reference1 + '\'' +
                    ", referenceDate1='" + referenceDate1 + '\'' +
                    ", referenceDate2='" + referenceDate2 + '\'' +
                    ", taxDate='" + taxDate + '\'' +
                    ", vatDate='" + vatDate + '\'' +
                    ", projectCode='" + projectCode + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "JournalEntryDTO{" +
                "jdtNum=" + jdtNum +
                ", autoVAT='" + autoVAT + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", memo='" + memo + '\'' +
                ", referenceDate='" + referenceDate + '\'' +
                ", series=" + series +
                ", stampTax='" + stampTax + '\'' +
                ", taxDate='" + taxDate + '\'' +
                ", transactionCode='" + transactionCode + '\'' +
                ", useAutoStorno='" + useAutoStorno + '\'' +
                ", vatDate='" + vatDate + '\'' +
                ", journalEntryLines=" + journalEntryLines +
                '}';
    }
}