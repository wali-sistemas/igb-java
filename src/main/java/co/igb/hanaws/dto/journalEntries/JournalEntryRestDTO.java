package co.igb.hanaws.dto.journalEntries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class JournalEntryRestDTO implements Serializable {
    @JsonProperty("odata.metadata")
    protected String metaData;
    @JsonProperty("ReferenceDate")
    protected String referenceDate;
    @JsonProperty("Memo")
    protected String memo;
    @JsonProperty("Reference")
    protected String reference;
    @JsonProperty("Reference2")
    protected String reference2;
    @JsonProperty("TransactionCode")
    protected String transactionCode;
    @JsonProperty("ProjectCode")
    protected String projectCode;
    @JsonProperty("TaxDate")
    protected String taxDate;
    @JsonProperty("JdtNum")
    protected Long jdtNum;
    @JsonProperty("Indicator")
    protected String indicator;
    @JsonProperty("UseAutoStorno")
    protected String useAutoStorno;
    @JsonProperty("StornoDate")
    protected String stornoDate;
    @JsonProperty("VatDate")
    protected String vatDate;
    @JsonProperty("Series")
    protected Long series;
    @JsonProperty("StampTax")
    protected String stampTax;
    @JsonProperty("DueDate")
    protected String dueDate;
    @JsonProperty("AutoVAT")
    protected String autoVAT;
    @JsonProperty("Number")
    protected Long number;
    @JsonProperty("FolioNumber")
    protected String folioNumber;
    @JsonProperty("FolioPrefixString")
    protected String FolioPrefixString;
    @JsonProperty("ReportEU")
    protected String reportEU;
    @JsonProperty("Report347")
    protected String report347;
    @JsonProperty("Printed")
    protected String printed;
    @JsonProperty("LocationCode")
    protected String locationCode;
    @JsonProperty("OriginalJournal")
    protected String originalJournal;
    @JsonProperty("Original")
    protected Long original;
    @JsonProperty("BaseReference")
    protected String baseReference;
    @JsonProperty("BlockDunningLetter")
    protected String blockDunningLetter;
    @JsonProperty("AutomaticWT")
    protected String automaticWT;
    @JsonProperty("WTSum")
    protected BigDecimal wTSum;
    @JsonProperty("WTSumSC")
    protected BigDecimal wTSumSC;
    @JsonProperty("WTSumFC")
    protected BigDecimal wTSumFC;
    @JsonProperty("SignatureInputMessage")
    protected String signatureInputMessage;
    @JsonProperty("SignatureDigest")
    protected String signatureDigest;
    @JsonProperty("CertificationNumber")
    protected String certificationNumber;
    @JsonProperty("PrivateKeyVersion")
    protected String privateKeyVersion;
    @JsonProperty("Corisptivi")
    protected String corisptivi;
    @JsonProperty("Reference3")
    protected String reference3;
    @JsonProperty("DocumentType")
    protected String documentType;
    @JsonProperty("DeferredTax")
    protected String deferredTax;
    @JsonProperty("BlanketAgreementNumber")
    protected String blanketAgreementNumber;
    @JsonProperty("OperationCode")
    protected String operationCode;
    @JsonProperty("ResidenceNumberType")
    protected String residenceNumberType;
    @JsonProperty("ECDPostingType")
    protected String ecdPostingType;
    @JsonProperty("ExposedTransNumber")
    protected String exposedTransNumber;
    @JsonProperty("PointOfIssueCode")
    protected String pointOfIssueCode;
    @JsonProperty("Letter")
    protected String letter;
    @JsonProperty("FolioNumberFrom")
    protected String folioNumberFrom;
    @JsonProperty("FolioNumberTo")
    protected String folioNumberTo;
    @JsonProperty("IsCostCenterTransfer")
    protected String isCostCenterTransfer;
    @JsonProperty("ReportingSectionControlStatementVAT")
    protected String reportingSectionControlStatementVAT;
    @JsonProperty("ExcludeFromTaxReportControlStatementVAT")
    protected String excludeFromTaxReportControlStatementVAT;
    @JsonProperty("SAPPassport")
    protected String sapPassport;
    @JsonProperty("Cig")
    protected String cig;
    @JsonProperty("Cup")
    protected String cup;
    @JsonProperty("AdjustTransaction")
    protected String adjustTransaction;
    @JsonProperty("AttachmentEntry")
    protected String attachmentEntry;
    @JsonProperty("U_TipoDoc")
    protected String uTipoDoc;
    @JsonProperty("U_ClaveDoc")
    protected String uClaveDoc;
    @JsonProperty("U_DifCode")
    protected String uDifCode;
    @JsonProperty("U_VrAct")
    protected BigDecimal uVrAct;
    @JsonProperty("U_OK1_IFRS")
    protected String uOK1IFRS;
    @JsonProperty("U_SerieDoc")
    protected String uSerieDoc;
    @JsonProperty("U_IdDocOri")
    protected String uIdDocOri;
    @JsonProperty("U_SubTypeDO")
    protected String uSubTypeDO;
    @JsonProperty("U_ObTypeDO")
    protected String uObTypeDO;
    @JsonProperty("U_WUID")
    protected String uWUID;
    @JsonProperty("U_nFactExe")
    protected String unFactExe;
    @JsonProperty("U_Doc_CR_FE")
    protected String uDocCRFE;
    @JsonProperty("U_CUFE")
    protected String uCUFE;
    @JsonProperty("U_addInFE_LinkFE")
    protected String uAddInFELinkFE;
    @JsonProperty("U_tipo_NCV_FE")
    protected String uTipoNCVFE;
    @JsonProperty("U_FactUser")
    protected String uFactUser;
    protected List<JournalEntryRestDTO.JournalEntryLines> journalEntryLines;
    protected List<JournalEntryRestDTO.WithholdingTaxDataCollection> withholdingTaxDataCollection;
    protected List<JournalEntryRestDTO.ElectronicProtocols> electronicProtocols;

    public String getMetaData() {
        return metaData;
    }

    public void setMetaData(String metaData) {
        this.metaData = metaData;
    }

    public String getReferenceDate() {
        return referenceDate;
    }

    public void setReferenceDate(String referenceDate) {
        this.referenceDate = referenceDate;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getReference2() {
        return reference2;
    }

    public void setReference2(String reference2) {
        this.reference2 = reference2;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getTaxDate() {
        return taxDate;
    }

    public void setTaxDate(String taxDate) {
        this.taxDate = taxDate;
    }

    public Long getJdtNum() {
        return jdtNum;
    }

    public void setJdtNum(Long jdtNum) {
        this.jdtNum = jdtNum;
    }

    public String getIndicator() {
        return indicator;
    }

    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }

    public String getUseAutoStorno() {
        return useAutoStorno;
    }

    public void setUseAutoStorno(String useAutoStorno) {
        this.useAutoStorno = useAutoStorno;
    }

    public String getStornoDate() {
        return stornoDate;
    }

    public void setStornoDate(String stornoDate) {
        this.stornoDate = stornoDate;
    }

    public String getVatDate() {
        return vatDate;
    }

    public void setVatDate(String vatDate) {
        this.vatDate = vatDate;
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

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getAutoVAT() {
        return autoVAT;
    }

    public void setAutoVAT(String autoVAT) {
        this.autoVAT = autoVAT;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getFolioNumber() {
        return folioNumber;
    }

    public void setFolioNumber(String folioNumber) {
        this.folioNumber = folioNumber;
    }

    public String getFolioPrefixString() {
        return FolioPrefixString;
    }

    public void setFolioPrefixString(String folioPrefixString) {
        FolioPrefixString = folioPrefixString;
    }

    public String getReportEU() {
        return reportEU;
    }

    public void setReportEU(String reportEU) {
        this.reportEU = reportEU;
    }

    public String getReport347() {
        return report347;
    }

    public void setReport347(String report347) {
        this.report347 = report347;
    }

    public String getPrinted() {
        return printed;
    }

    public void setPrinted(String printed) {
        this.printed = printed;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getOriginalJournal() {
        return originalJournal;
    }

    public void setOriginalJournal(String originalJournal) {
        this.originalJournal = originalJournal;
    }

    public Long getOriginal() {
        return original;
    }

    public void setOriginal(Long original) {
        this.original = original;
    }

    public String getBaseReference() {
        return baseReference;
    }

    public void setBaseReference(String baseReference) {
        this.baseReference = baseReference;
    }

    public String getBlockDunningLetter() {
        return blockDunningLetter;
    }

    public void setBlockDunningLetter(String blockDunningLetter) {
        this.blockDunningLetter = blockDunningLetter;
    }

    public String getAutomaticWT() {
        return automaticWT;
    }

    public void setAutomaticWT(String automaticWT) {
        this.automaticWT = automaticWT;
    }

    public BigDecimal getwTSum() {
        return wTSum;
    }

    public void setwTSum(BigDecimal wTSum) {
        this.wTSum = wTSum;
    }

    public BigDecimal getwTSumSC() {
        return wTSumSC;
    }

    public void setwTSumSC(BigDecimal wTSumSC) {
        this.wTSumSC = wTSumSC;
    }

    public BigDecimal getwTSumFC() {
        return wTSumFC;
    }

    public void setwTSumFC(BigDecimal wTSumFC) {
        this.wTSumFC = wTSumFC;
    }

    public String getSignatureInputMessage() {
        return signatureInputMessage;
    }

    public void setSignatureInputMessage(String signatureInputMessage) {
        this.signatureInputMessage = signatureInputMessage;
    }

    public String getSignatureDigest() {
        return signatureDigest;
    }

    public void setSignatureDigest(String signatureDigest) {
        this.signatureDigest = signatureDigest;
    }

    public String getCertificationNumber() {
        return certificationNumber;
    }

    public void setCertificationNumber(String certificationNumber) {
        this.certificationNumber = certificationNumber;
    }

    public String getPrivateKeyVersion() {
        return privateKeyVersion;
    }

    public void setPrivateKeyVersion(String privateKeyVersion) {
        this.privateKeyVersion = privateKeyVersion;
    }

    public String getCorisptivi() {
        return corisptivi;
    }

    public void setCorisptivi(String corisptivi) {
        this.corisptivi = corisptivi;
    }

    public String getReference3() {
        return reference3;
    }

    public void setReference3(String reference3) {
        this.reference3 = reference3;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDeferredTax() {
        return deferredTax;
    }

    public void setDeferredTax(String deferredTax) {
        this.deferredTax = deferredTax;
    }

    public String getBlanketAgreementNumber() {
        return blanketAgreementNumber;
    }

    public void setBlanketAgreementNumber(String blanketAgreementNumber) {
        this.blanketAgreementNumber = blanketAgreementNumber;
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    public String getResidenceNumberType() {
        return residenceNumberType;
    }

    public void setResidenceNumberType(String residenceNumberType) {
        this.residenceNumberType = residenceNumberType;
    }

    public String getEcdPostingType() {
        return ecdPostingType;
    }

    public void setEcdPostingType(String ecdPostingType) {
        this.ecdPostingType = ecdPostingType;
    }

    public String getExposedTransNumber() {
        return exposedTransNumber;
    }

    public void setExposedTransNumber(String exposedTransNumber) {
        this.exposedTransNumber = exposedTransNumber;
    }

    public String getPointOfIssueCode() {
        return pointOfIssueCode;
    }

    public void setPointOfIssueCode(String pointOfIssueCode) {
        this.pointOfIssueCode = pointOfIssueCode;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getFolioNumberFrom() {
        return folioNumberFrom;
    }

    public void setFolioNumberFrom(String folioNumberFrom) {
        this.folioNumberFrom = folioNumberFrom;
    }

    public String getFolioNumberTo() {
        return folioNumberTo;
    }

    public void setFolioNumberTo(String folioNumberTo) {
        this.folioNumberTo = folioNumberTo;
    }

    public String getIsCostCenterTransfer() {
        return isCostCenterTransfer;
    }

    public void setIsCostCenterTransfer(String isCostCenterTransfer) {
        this.isCostCenterTransfer = isCostCenterTransfer;
    }

    public String getReportingSectionControlStatementVAT() {
        return reportingSectionControlStatementVAT;
    }

    public void setReportingSectionControlStatementVAT(String reportingSectionControlStatementVAT) {
        this.reportingSectionControlStatementVAT = reportingSectionControlStatementVAT;
    }

    public String getExcludeFromTaxReportControlStatementVAT() {
        return excludeFromTaxReportControlStatementVAT;
    }

    public void setExcludeFromTaxReportControlStatementVAT(String excludeFromTaxReportControlStatementVAT) {
        this.excludeFromTaxReportControlStatementVAT = excludeFromTaxReportControlStatementVAT;
    }

    public String getSapPassport() {
        return sapPassport;
    }

    public void setSapPassport(String sapPassport) {
        this.sapPassport = sapPassport;
    }

    public String getCig() {
        return cig;
    }

    public void setCig(String cig) {
        this.cig = cig;
    }

    public String getCup() {
        return cup;
    }

    public void setCup(String cup) {
        this.cup = cup;
    }

    public String getAdjustTransaction() {
        return adjustTransaction;
    }

    public void setAdjustTransaction(String adjustTransaction) {
        this.adjustTransaction = adjustTransaction;
    }

    public String getAttachmentEntry() {
        return attachmentEntry;
    }

    public void setAttachmentEntry(String attachmentEntry) {
        this.attachmentEntry = attachmentEntry;
    }

    public String getuTipoDoc() {
        return uTipoDoc;
    }

    public void setuTipoDoc(String uTipoDoc) {
        this.uTipoDoc = uTipoDoc;
    }

    public String getuClaveDoc() {
        return uClaveDoc;
    }

    public void setuClaveDoc(String uClaveDoc) {
        this.uClaveDoc = uClaveDoc;
    }

    public String getuDifCode() {
        return uDifCode;
    }

    public void setuDifCode(String uDifCode) {
        this.uDifCode = uDifCode;
    }

    public BigDecimal getuVrAct() {
        return uVrAct;
    }

    public void setuVrAct(BigDecimal uVrAct) {
        this.uVrAct = uVrAct;
    }

    public String getuOK1IFRS() {
        return uOK1IFRS;
    }

    public void setuOK1IFRS(String uOK1IFRS) {
        this.uOK1IFRS = uOK1IFRS;
    }

    public String getuSerieDoc() {
        return uSerieDoc;
    }

    public void setuSerieDoc(String uSerieDoc) {
        this.uSerieDoc = uSerieDoc;
    }

    public String getuIdDocOri() {
        return uIdDocOri;
    }

    public void setuIdDocOri(String uIdDocOri) {
        this.uIdDocOri = uIdDocOri;
    }

    public String getuSubTypeDO() {
        return uSubTypeDO;
    }

    public void setuSubTypeDO(String uSubTypeDO) {
        this.uSubTypeDO = uSubTypeDO;
    }

    public String getuObTypeDO() {
        return uObTypeDO;
    }

    public void setuObTypeDO(String uObTypeDO) {
        this.uObTypeDO = uObTypeDO;
    }

    public String getuWUID() {
        return uWUID;
    }

    public void setuWUID(String uWUID) {
        this.uWUID = uWUID;
    }

    public String getUnFactExe() {
        return unFactExe;
    }

    public void setUnFactExe(String unFactExe) {
        this.unFactExe = unFactExe;
    }

    public String getuDocCRFE() {
        return uDocCRFE;
    }

    public void setuDocCRFE(String uDocCRFE) {
        this.uDocCRFE = uDocCRFE;
    }

    public String getuCUFE() {
        return uCUFE;
    }

    public void setuCUFE(String uCUFE) {
        this.uCUFE = uCUFE;
    }

    public String getuAddInFELinkFE() {
        return uAddInFELinkFE;
    }

    public void setuAddInFELinkFE(String uAddInFELinkFE) {
        this.uAddInFELinkFE = uAddInFELinkFE;
    }

    public String getuTipoNCVFE() {
        return uTipoNCVFE;
    }

    public void setuTipoNCVFE(String uTipoNCVFE) {
        this.uTipoNCVFE = uTipoNCVFE;
    }

    public String getuFactUser() {
        return uFactUser;
    }

    public void setuFactUser(String uFactUser) {
        this.uFactUser = uFactUser;
    }

    public List<JournalEntryLines> getJournalEntryLines() {
        return journalEntryLines;
    }

    public void setJournalEntryLines(List<JournalEntryLines> journalEntryLines) {
        this.journalEntryLines = journalEntryLines;
    }

    public List<WithholdingTaxDataCollection> getWithholdingTaxDataCollection() {
        return withholdingTaxDataCollection;
    }

    public void setWithholdingTaxDataCollection(List<WithholdingTaxDataCollection> withholdingTaxDataCollection) {
        this.withholdingTaxDataCollection = withholdingTaxDataCollection;
    }

    public List<ElectronicProtocols> getElectronicProtocols() {
        return electronicProtocols;
    }

    public void setElectronicProtocols(List<ElectronicProtocols> electronicProtocols) {
        this.electronicProtocols = electronicProtocols;
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
        @JsonProperty("FCDebit")
        protected BigDecimal fcDebit;
        @JsonProperty("FCCredit")
        protected BigDecimal fcCredit;
        @JsonProperty("FCCurrency")
        protected String fcCurrency;
        @JsonProperty("DueDate")
        protected String dueDate;
        @JsonProperty("ShortName")
        protected String shortName;
        @JsonProperty("ContraAccount")
        protected String contraAccount;
        @JsonProperty("LineMemo")
        protected String lineMemo;
        @JsonProperty("ReferenceDate1")
        protected String referenceDate1;
        @JsonProperty("ReferenceDate2")
        protected String referenceDate2;
        @JsonProperty("Reference1")
        protected String reference1;
        @JsonProperty("Reference2")
        protected String reference2;
        @JsonProperty("CostingCode")
        protected String costingCode;
        @JsonProperty("TaxDate")
        protected String taxDate;
        @JsonProperty("BaseSum")
        protected BigDecimal baseSum;
        @JsonProperty("TaxGroup")
        protected String taxGroup;
        @JsonProperty("DebitSys")
        protected BigDecimal debitSys;
        @JsonProperty("CreditSys")
        protected BigDecimal creditSys;
        @JsonProperty("VatDate")
        protected String vatDate;
        @JsonProperty("VatLine")
        protected String vatLine;
        @JsonProperty("SystemBaseAmount")
        protected BigDecimal systemBaseAmount;
        @JsonProperty("VatAmount")
        protected BigDecimal vatAmount;
        @JsonProperty("SystemVatAmount")
        protected BigDecimal systemVatAmount;
        @JsonProperty("GrossValue")
        protected BigDecimal grossValue;
        @JsonProperty("AdditionalReference")
        protected String additionalReference;
        @JsonProperty("CheckAbs")
        protected String checkAbs;
        @JsonProperty("CostingCode2")
        protected String costingCode2;
        @JsonProperty("CostingCode3")
        protected String costingCode3;
        @JsonProperty("CostingCode4")
        protected String costingCode4;
        @JsonProperty("TaxCode")
        protected String taxCode;
        @JsonProperty("TaxPostAccount")
        protected String taxPostAccount;
        @JsonProperty("CostingCode5")
        protected String costingCode5;
        @JsonProperty("LocationCode")
        protected String locationCode;
        @JsonProperty("ControlAccount")
        protected String controlAccount;
        @JsonProperty("EqualizationTaxAmount")
        protected BigDecimal equalizationTaxAmount;
        @JsonProperty("SystemEqualizationTaxAmount")
        protected String systemEqualizationTaxAmount;
        @JsonProperty("TotalTax")
        protected BigDecimal totalTax;
        @JsonProperty("SystemTotalTax")
        protected BigDecimal systemTotalTax;
        @JsonProperty("WTLiable")
        protected String wTLiable;
        @JsonProperty("WTRow")
        protected String wTRow;
        @JsonProperty("PaymentBlock")
        protected String paymentBlock;
        @JsonProperty("BlockReason")
        protected String blockReason;
        @JsonProperty("FederalTaxID")
        protected String federalTaxID;
        @JsonProperty("BPLID")
        protected String bplid;
        @JsonProperty("BPLName")
        protected String bplName;
        @JsonProperty("VATRegNum")
        protected String vatRegNum;
        @JsonProperty("PaymentOrdered")
        protected String paymentOrdered;
        @JsonProperty("ExposedTransNumber")
        protected String exposedTransNumber;
        @JsonProperty("DocumentArray")
        protected String documentArray;
        @JsonProperty("DocumentLine")
        protected String documentLine;
        @JsonProperty("CostElementCode")
        protected String costElementCode;
        @JsonProperty("Cig")
        protected String cig;
        @JsonProperty("Cup")
        protected String cup;
        @JsonProperty("IncomeClassificationCategory")
        protected String incomeClassificationCategory;
        @JsonProperty("IncomeClassificationType")
        protected String incomeClassificationType;
        @JsonProperty("ExpensesClassificationCategory")
        protected String expensesClassificationCategory;
        @JsonProperty("ExpensesClassificationType")
        protected String expensesClassificationType;
        @JsonProperty("VATClassificationCategory")
        protected String vatClassificationCategory;
        @JsonProperty("VATClassificationType")
        protected String vatClassificationType;
        @JsonProperty("VATExemptionCause")
        protected String vatExemptionCause;
        @JsonProperty("U_BD_Exp")
        protected String uBDExp;
        @JsonProperty("U_InfoCo01")
        protected String uInfoCo01;
        @JsonProperty("U_BaseRet")
        protected BigDecimal uBaseRet;
        @JsonProperty("U_CodRet")
        protected String uCodRet;
        @JsonProperty("U_TarifaRet")
        protected BigDecimal uTarifaRet;
        @JsonProperty("U_InfoCo03")
        protected String uInfoCo03;
        protected List<CashFlowAssignments> cashFlowAssignments;

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

        public BigDecimal getFcDebit() {
            return fcDebit;
        }

        public void setFcDebit(BigDecimal fcDebit) {
            this.fcDebit = fcDebit;
        }

        public BigDecimal getFcCredit() {
            return fcCredit;
        }

        public void setFcCredit(BigDecimal fcCredit) {
            this.fcCredit = fcCredit;
        }

        public String getFcCurrency() {
            return fcCurrency;
        }

        public void setFcCurrency(String fcCurrency) {
            this.fcCurrency = fcCurrency;
        }

        public String getDueDate() {
            return dueDate;
        }

        public void setDueDate(String dueDate) {
            this.dueDate = dueDate;
        }

        public String getShortName() {
            return shortName;
        }

        public void setShortName(String shortName) {
            this.shortName = shortName;
        }

        public String getContraAccount() {
            return contraAccount;
        }

        public void setContraAccount(String contraAccount) {
            this.contraAccount = contraAccount;
        }

        public String getLineMemo() {
            return lineMemo;
        }

        public void setLineMemo(String lineMemo) {
            this.lineMemo = lineMemo;
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

        public String getReference1() {
            return reference1;
        }

        public void setReference1(String reference1) {
            this.reference1 = reference1;
        }

        public String getReference2() {
            return reference2;
        }

        public void setReference2(String reference2) {
            this.reference2 = reference2;
        }

        public String getCostingCode() {
            return costingCode;
        }

        public void setCostingCode(String costingCode) {
            this.costingCode = costingCode;
        }

        public String getTaxDate() {
            return taxDate;
        }

        public void setTaxDate(String taxDate) {
            this.taxDate = taxDate;
        }

        public BigDecimal getBaseSum() {
            return baseSum;
        }

        public void setBaseSum(BigDecimal baseSum) {
            this.baseSum = baseSum;
        }

        public String getTaxGroup() {
            return taxGroup;
        }

        public void setTaxGroup(String taxGroup) {
            this.taxGroup = taxGroup;
        }

        public BigDecimal getDebitSys() {
            return debitSys;
        }

        public void setDebitSys(BigDecimal debitSys) {
            this.debitSys = debitSys;
        }

        public BigDecimal getCreditSys() {
            return creditSys;
        }

        public void setCreditSys(BigDecimal creditSys) {
            this.creditSys = creditSys;
        }

        public String getVatDate() {
            return vatDate;
        }

        public void setVatDate(String vatDate) {
            this.vatDate = vatDate;
        }

        public String getVatLine() {
            return vatLine;
        }

        public void setVatLine(String vatLine) {
            this.vatLine = vatLine;
        }

        public BigDecimal getSystemBaseAmount() {
            return systemBaseAmount;
        }

        public void setSystemBaseAmount(BigDecimal systemBaseAmount) {
            this.systemBaseAmount = systemBaseAmount;
        }

        public BigDecimal getVatAmount() {
            return vatAmount;
        }

        public void setVatAmount(BigDecimal vatAmount) {
            this.vatAmount = vatAmount;
        }

        public BigDecimal getSystemVatAmount() {
            return systemVatAmount;
        }

        public void setSystemVatAmount(BigDecimal systemVatAmount) {
            this.systemVatAmount = systemVatAmount;
        }

        public BigDecimal getGrossValue() {
            return grossValue;
        }

        public void setGrossValue(BigDecimal grossValue) {
            this.grossValue = grossValue;
        }

        public String getAdditionalReference() {
            return additionalReference;
        }

        public void setAdditionalReference(String additionalReference) {
            this.additionalReference = additionalReference;
        }

        public String getCheckAbs() {
            return checkAbs;
        }

        public void setCheckAbs(String checkAbs) {
            this.checkAbs = checkAbs;
        }

        public String getCostingCode2() {
            return costingCode2;
        }

        public void setCostingCode2(String costingCode2) {
            this.costingCode2 = costingCode2;
        }

        public String getCostingCode3() {
            return costingCode3;
        }

        public void setCostingCode3(String costingCode3) {
            this.costingCode3 = costingCode3;
        }

        public String getCostingCode4() {
            return costingCode4;
        }

        public void setCostingCode4(String costingCode4) {
            this.costingCode4 = costingCode4;
        }

        public String getTaxCode() {
            return taxCode;
        }

        public void setTaxCode(String taxCode) {
            this.taxCode = taxCode;
        }

        public String getTaxPostAccount() {
            return taxPostAccount;
        }

        public void setTaxPostAccount(String taxPostAccount) {
            this.taxPostAccount = taxPostAccount;
        }

        public String getCostingCode5() {
            return costingCode5;
        }

        public void setCostingCode5(String costingCode5) {
            this.costingCode5 = costingCode5;
        }

        public String getLocationCode() {
            return locationCode;
        }

        public void setLocationCode(String locationCode) {
            this.locationCode = locationCode;
        }

        public String getControlAccount() {
            return controlAccount;
        }

        public void setControlAccount(String controlAccount) {
            this.controlAccount = controlAccount;
        }

        public BigDecimal getEqualizationTaxAmount() {
            return equalizationTaxAmount;
        }

        public void setEqualizationTaxAmount(BigDecimal equalizationTaxAmount) {
            this.equalizationTaxAmount = equalizationTaxAmount;
        }

        public String getSystemEqualizationTaxAmount() {
            return systemEqualizationTaxAmount;
        }

        public void setSystemEqualizationTaxAmount(String systemEqualizationTaxAmount) {
            this.systemEqualizationTaxAmount = systemEqualizationTaxAmount;
        }

        public BigDecimal getTotalTax() {
            return totalTax;
        }

        public void setTotalTax(BigDecimal totalTax) {
            this.totalTax = totalTax;
        }

        public BigDecimal getSystemTotalTax() {
            return systemTotalTax;
        }

        public void setSystemTotalTax(BigDecimal systemTotalTax) {
            this.systemTotalTax = systemTotalTax;
        }

        public String getwTLiable() {
            return wTLiable;
        }

        public void setwTLiable(String wTLiable) {
            this.wTLiable = wTLiable;
        }

        public String getwTRow() {
            return wTRow;
        }

        public void setwTRow(String wTRow) {
            this.wTRow = wTRow;
        }

        public String getPaymentBlock() {
            return paymentBlock;
        }

        public void setPaymentBlock(String paymentBlock) {
            this.paymentBlock = paymentBlock;
        }

        public String getBlockReason() {
            return blockReason;
        }

        public void setBlockReason(String blockReason) {
            this.blockReason = blockReason;
        }

        public String getFederalTaxID() {
            return federalTaxID;
        }

        public void setFederalTaxID(String federalTaxID) {
            this.federalTaxID = federalTaxID;
        }

        public String getBplid() {
            return bplid;
        }

        public void setBplid(String bplid) {
            this.bplid = bplid;
        }

        public String getBplName() {
            return bplName;
        }

        public void setBplName(String bplName) {
            this.bplName = bplName;
        }

        public String getVatRegNum() {
            return vatRegNum;
        }

        public void setVatRegNum(String vatRegNum) {
            this.vatRegNum = vatRegNum;
        }

        public String getPaymentOrdered() {
            return paymentOrdered;
        }

        public void setPaymentOrdered(String paymentOrdered) {
            this.paymentOrdered = paymentOrdered;
        }

        public String getExposedTransNumber() {
            return exposedTransNumber;
        }

        public void setExposedTransNumber(String exposedTransNumber) {
            this.exposedTransNumber = exposedTransNumber;
        }

        public String getDocumentArray() {
            return documentArray;
        }

        public void setDocumentArray(String documentArray) {
            this.documentArray = documentArray;
        }

        public String getDocumentLine() {
            return documentLine;
        }

        public void setDocumentLine(String documentLine) {
            this.documentLine = documentLine;
        }

        public String getCostElementCode() {
            return costElementCode;
        }

        public void setCostElementCode(String costElementCode) {
            this.costElementCode = costElementCode;
        }

        public String getCig() {
            return cig;
        }

        public void setCig(String cig) {
            this.cig = cig;
        }

        public String getCup() {
            return cup;
        }

        public void setCup(String cup) {
            this.cup = cup;
        }

        public String getIncomeClassificationCategory() {
            return incomeClassificationCategory;
        }

        public void setIncomeClassificationCategory(String incomeClassificationCategory) {
            this.incomeClassificationCategory = incomeClassificationCategory;
        }

        public String getIncomeClassificationType() {
            return incomeClassificationType;
        }

        public void setIncomeClassificationType(String incomeClassificationType) {
            this.incomeClassificationType = incomeClassificationType;
        }

        public String getExpensesClassificationCategory() {
            return expensesClassificationCategory;
        }

        public void setExpensesClassificationCategory(String expensesClassificationCategory) {
            this.expensesClassificationCategory = expensesClassificationCategory;
        }

        public String getExpensesClassificationType() {
            return expensesClassificationType;
        }

        public void setExpensesClassificationType(String expensesClassificationType) {
            this.expensesClassificationType = expensesClassificationType;
        }

        public String getVatClassificationCategory() {
            return vatClassificationCategory;
        }

        public void setVatClassificationCategory(String vatClassificationCategory) {
            this.vatClassificationCategory = vatClassificationCategory;
        }

        public String getVatClassificationType() {
            return vatClassificationType;
        }

        public void setVatClassificationType(String vatClassificationType) {
            this.vatClassificationType = vatClassificationType;
        }

        public String getVatExemptionCause() {
            return vatExemptionCause;
        }

        public void setVatExemptionCause(String vatExemptionCause) {
            this.vatExemptionCause = vatExemptionCause;
        }

        public String getuBDExp() {
            return uBDExp;
        }

        public void setuBDExp(String uBDExp) {
            this.uBDExp = uBDExp;
        }

        public String getuInfoCo01() {
            return uInfoCo01;
        }

        public void setuInfoCo01(String uInfoCo01) {
            this.uInfoCo01 = uInfoCo01;
        }

        public BigDecimal getuBaseRet() {
            return uBaseRet;
        }

        public void setuBaseRet(BigDecimal uBaseRet) {
            this.uBaseRet = uBaseRet;
        }

        public String getuCodRet() {
            return uCodRet;
        }

        public void setuCodRet(String uCodRet) {
            this.uCodRet = uCodRet;
        }

        public BigDecimal getuTarifaRet() {
            return uTarifaRet;
        }

        public void setuTarifaRet(BigDecimal uTarifaRet) {
            this.uTarifaRet = uTarifaRet;
        }

        public String getuInfoCo03() {
            return uInfoCo03;
        }

        public void setuInfoCo03(String uInfoCo03) {
            this.uInfoCo03 = uInfoCo03;
        }

        public List<CashFlowAssignments> getCashFlowAssignments() {
            return cashFlowAssignments;
        }

        public void setCashFlowAssignments(List<CashFlowAssignments> cashFlowAssignments) {
            this.cashFlowAssignments = cashFlowAssignments;
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class CashFlowAssignments implements Serializable {
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class WithholdingTaxDataCollection implements Serializable {
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ElectronicProtocols implements Serializable {
    }
}