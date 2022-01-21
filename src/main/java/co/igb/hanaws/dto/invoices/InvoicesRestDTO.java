package co.igb.hanaws.dto.invoices;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoicesRestDTO implements Serializable {
    @JsonProperty("DocEntry")
    protected Long docEntry;
    @JsonProperty("DocNum")
    protected Long docNum;
    @JsonProperty("DocType")
    protected String docType;
    @JsonProperty("HandWritten")
    protected String handWritten;
    @JsonProperty("Printed")
    protected String printed;
    @JsonProperty("DocDate")
    protected String docDate;
    @JsonProperty("DocDueDate")
    protected String docDueDate;
    @JsonProperty("CardCode")
    protected String cardCode;
    @JsonProperty("CardName")
    protected String cardName;
    @JsonProperty("Address")
    protected String address;
    @JsonProperty("NumAtCard")
    protected String numAtCard;
    @JsonProperty("DocTotal")
    protected Double docTotal;
    @JsonProperty("AttachmentEntry")
    protected Long attachmentEntry;
    @JsonProperty("DocCurrency")
    protected String docCurrency;
    @JsonProperty("DocRate")
    protected Double docRate;
    @JsonProperty("Reference1")
    protected String reference1;
    @JsonProperty("Reference2")
    protected String reference2;
    @JsonProperty("Comments")
    protected String comments;
    @JsonProperty("JournalMemo")
    protected String journalMemo;
    @JsonProperty("PaymentGroupCode")
    protected Long paymentGroupCode;
    @JsonProperty("DocTime")
    protected String docTime;
    @JsonProperty("SalesPersonCode")
    protected Long salesPersonCode;
    @JsonProperty("TransportationCode")
    protected Long transportationCode;
    @JsonProperty("Confirmed")
    protected String confirmed;
    @JsonProperty("ImportFileNum")
    protected Long importFileNum;
    @JsonProperty("SummeryType")
    protected String summeryType;
    @JsonProperty("ContactPersonCode")
    protected Long contactPersonCode;
    @JsonProperty("ShowSCN")
    protected String showSCN;
    @JsonProperty("Series")
    protected Long series;
    @JsonProperty("TaxDate")
    protected String taxDate;
    @JsonProperty("PartialSupply")
    protected String partialSupply;
    @JsonProperty("DocObjectCode")
    protected String docObjectCode;
    @JsonProperty("ShipToCode")
    protected String shipToCode;
    @JsonProperty("Indicator")
    protected String indicator;
    @JsonProperty("FederalTaxID")
    protected String federalTaxID;
    @JsonProperty("DiscountPercent")
    protected Double discountPercent;
    @JsonProperty("PaymentReference")
    protected String paymentReference;
    @JsonProperty("CreationDate")
    protected String creationDate;
    @JsonProperty("UpdateDate")
    protected String updateDate;
    @JsonProperty("FinancialPeriod")
    protected Long financialPeriod;
    @JsonProperty("TransNum")
    protected Long transNum;
    @JsonProperty("VatSum")
    protected BigDecimal vatSum;
    @JsonProperty("VatSumSys")
    protected Double vatSumSys;
    @JsonProperty("VatSumFc")
    protected Double vatSumFc;
    @JsonProperty("NetProcedure")
    protected String netProcedure;
    @JsonProperty("DocTotalFc")
    protected Double docTotalFc;
    @JsonProperty("DocTotalSys")
    protected Double docTotalSys;
    @JsonProperty("Form1099")
    protected Long form1099;
    @JsonProperty("Box1099")
    protected String box1099;
    @JsonProperty("RevisionPo")
    protected String revisionPo;
    @JsonProperty("RequriedDate")
    protected String requriedDate;
    @JsonProperty("CancelDate")
    protected String cancelDate;
    @JsonProperty("BlockDunning")
    protected String blockDunning;
    @JsonProperty("Submitted")
    protected String submitted;
    @JsonProperty("Segment")
    protected Long segment;
    @JsonProperty("PickStatus")
    protected String pickStatus;
    @JsonProperty("Pick")
    protected String pick;
    @JsonProperty("PaymentMethod")
    protected String paymentMethod;
    @JsonProperty("PaymentBlock")
    protected String paymentBlock;
    @JsonProperty("PaymentBlockEntry")
    protected Long paymentBlockEntry;
    @JsonProperty("CentralBankIndicator")
    protected String centralBankIndicator;
    @JsonProperty("MaximumCashDiscount")
    protected String maximumCashDiscount;
    @JsonProperty("Reserve")
    protected String reserve;
    @JsonProperty("Project")
    protected String project;
    @JsonProperty("ExemptionValidityDateFrom")
    protected String exemptionValidityDateFrom;
    @JsonProperty("ExemptionValidityDateTo")
    protected String exemptionValidityDateTo;
    @JsonProperty("WareHouseUpdateType")
    protected String wareHouseUpdateType;
    @JsonProperty("Rounding")
    protected String rounding;
    @JsonProperty("ExternalCorrectedDocNum")
    protected String externalCorrectedDocNum;
    @JsonProperty("InternalCorrectedDocNum")
    protected Long internalCorrectedDocNum;
    @JsonProperty("NextCorrectingDocument")
    protected Long nextCorrectingDocument;
    @JsonProperty("DeferredTax")
    protected String deferredTax;
    @JsonProperty("TaxExemptionLetterNum")
    protected String taxExemptionLetterNum;
    @JsonProperty("WTApplied")
    protected Double wtApplied;
    @JsonProperty("WTAppliedFC")
    protected Double wtAppliedFC;
    @JsonProperty("BillOfExchangeReserved")
    protected String billOfExchangeReserved;
    @JsonProperty("AgentCode")
    protected String agentCode;
    @JsonProperty("WTAppliedSC")
    protected Double wtAppliedSC;
    @JsonProperty("TotalEqualizationTax")
    protected Double totalEqualizationTax;
    @JsonProperty("TotalEqualizationTaxFC")
    protected Double totalEqualizationTaxFC;
    @JsonProperty("TotalEqualizationTaxSC")
    protected Double totalEqualizationTaxSC;
    @JsonProperty("NumberOfInstallments")
    protected Long numberOfInstallments;
    @JsonProperty("ApplyTaxOnFirstInstallment")
    protected String applyTaxOnFirstInstallment;
    @JsonProperty("WTNonSubjectAmount")
    protected Double wtNonSubjectAmount;
    @JsonProperty("WTNonSubjectAmountSC")
    protected Double wtNonSubjectAmountSC;
    @JsonProperty("WTNonSubjectAmountFC")
    protected Double wtNonSubjectAmountFC;
    @JsonProperty("WTExemptedAmount")
    protected Double wtExemptedAmount;
    @JsonProperty("WTExemptedAmountSC")
    protected Double wtExemptedAmountSC;
    @JsonProperty("WTExemptedAmountFC")
    protected Double wtExemptedAmountFC;
    @JsonProperty("BaseAmount")
    protected BigDecimal baseAmount;
    @JsonProperty("BaseAmountSC")
    protected Double baseAmountSC;
    @JsonProperty("BaseAmountFC")
    protected Double baseAmountFC;
    @JsonProperty("WTAmount")
    protected Double wtAmount;
    @JsonProperty("WTAmountSC")
    protected Double wtAmountSC;
    @JsonProperty("WTAmountFC")
    protected Double wtAmountFC;
    @JsonProperty("VatDate")
    protected String vatDate;
    @JsonProperty("DocumentsOwner")
    protected Long documentsOwner;
    @JsonProperty("FolioPrefixString")
    protected String folioPrefixString;
    @JsonProperty("FolioNumber")
    protected Long folioNumber;
    @JsonProperty("DocumentSubType")
    protected String documentSubType;
    @JsonProperty("BPChannelCode")
    protected String bpChannelCode;
    @JsonProperty("BPChannelContact")
    protected Long bpChannelContact;
    @JsonProperty("Address2")
    protected String address2;
    @JsonProperty("DocumentStatus")
    protected String documentStatus;
    @JsonProperty("PeriodIndicator")
    protected String periodIndicator;
    @JsonProperty("PayToCode")
    protected String payToCode;
    @JsonProperty("ManualNumber")
    protected String manualNumber;
    @JsonProperty("UseShpdGoodsAct")
    protected String useShpdGoodsAct;
    @JsonProperty("IsPayToBank")
    protected String isPayToBank;
    @JsonProperty("PayToBankCountry")
    protected String payToBankCountry;
    @JsonProperty("PayToBankCode")
    protected String payToBankCode;
    @JsonProperty("PayToBankAccountNo")
    protected String payToBankAccountNo;
    @JsonProperty("PayToBankBranch")
    protected String payToBankBranch;
    @JsonProperty("BPL_IDAssignedToInvoice")
    protected Long bplidAssignedToInvoice;
    @JsonProperty("DownPayment")
    protected Double downPayment;
    @JsonProperty("ReserveInvoice")
    protected String reserveInvoice;
    @JsonProperty("LanguageCode")
    protected Long languageCode;
    @JsonProperty("TrackingNumber")
    protected String trackingNumber;
    @JsonProperty("PickRemark")
    protected String pickRemark;
    @JsonProperty("ClosingDate")
    protected String closingDate;
    @JsonProperty("SequenceCode")
    protected Long sequenceCode;
    @JsonProperty("SequenceSerial")
    protected Long sequenceSerial;
    @JsonProperty("SeriesString")
    protected String seriesString;
    @JsonProperty("SubSeriesString")
    protected String subSeriesString;
    @JsonProperty("SequenceModel")
    protected String sequenceModel;
    @JsonProperty("UseCorrectionVATGroup")
    protected String useCorrectionVATGroup;
    @JsonProperty("TotalDiscount")
    protected Double totalDiscount;
    @JsonProperty("DownPaymentAmount")
    protected Double downPaymentAmount;
    @JsonProperty("DownPaymentPercentage")
    protected Double downPaymentPercentage;
    @JsonProperty("DownPaymentType")
    protected String downPaymentType;
    @JsonProperty("DownPaymentAmountSC")
    protected Double downPaymentAmountSC;
    @JsonProperty("DownPaymentAmountFC")
    protected Double downPaymentAmountFC;
    @JsonProperty("VatPercent")
    protected Double vatPercent;
    @JsonProperty("ServiceGrossProfitPercent")
    protected Double serviceGrossProfitPercent;
    @JsonProperty("OpeningRemarks")
    protected String openingRemarks;
    @JsonProperty("ClosingRemarks")
    protected String closingRemarks;
    @JsonProperty("RoundingDiffAmount")
    protected Double roundingDiffAmount;
    @JsonProperty("RoundingDiffAmountFC")
    protected Double roundingDiffAmountFC;
    @JsonProperty("RoundingDiffAmountSC")
    protected Double roundingDiffAmountSC;
    @JsonProperty("Cancelled")
    protected String cancelled;
    @JsonProperty("SignatureInputMessage")
    protected String signatureInputMessage;
    @JsonProperty("SignatureDigest")
    protected String signatureDigest;
    @JsonProperty("CertificationNumber")
    protected String certificationNumber;
    @JsonProperty("PrivateKeyVersion")
    protected Long privateKeyVersion;
    @JsonProperty("ControlAccount")
    protected String controlAccount;
    @JsonProperty("InsuranceOperation347")
    protected String insuranceOperation347;
    @JsonProperty("ArchiveNonremovableSalesQuotation")
    protected String archiveNonremovableSalesQuotation;
    @JsonProperty("GTSChecker")
    protected Long gtsChecker;
    @JsonProperty("GTSPayee")
    protected Long gtsPayee;
    @JsonProperty("ExtraMonth")
    protected Long extraMonth;
    @JsonProperty("ExtraDays")
    protected Long extraDays;
    @JsonProperty("CashDiscountDateOffset")
    protected Long cashDiscountDateOffset;
    @JsonProperty("StartFrom")
    protected String startFrom;
    @JsonProperty("NTSApproved")
    protected String ntsApproved;
    @JsonProperty("ETaxWebSite")
    protected Long eTaxWebSite;
    @JsonProperty("ETaxNumber")
    protected String eTaxNumber;
    @JsonProperty("NTSApprovedNumber")
    protected String ntsApprovedNumber;
    @JsonProperty("EDocGenerationType")
    protected String eDocGenerationType;
    @JsonProperty("EDocSeries")
    protected Long eDocSeries;
    @JsonProperty("EDocNum")
    protected String eDocNum;
    @JsonProperty("EDocExportFormat")
    protected Long eDocExportFormat;
    @JsonProperty("EDocStatus")
    protected String eDocStatus;
    @JsonProperty("EDocErrorCode")
    protected String eDocErrorCode;
    @JsonProperty("EDocErrorMessage")
    protected String eDocErrorMessage;
    @JsonProperty("DownPaymentStatus")
    protected String downPaymentStatus;
    @JsonProperty("GroupSeries")
    protected Long groupSeries;
    @JsonProperty("GroupNumber")
    protected Long groupNumber;
    @JsonProperty("GroupHandWritten")
    protected String groupHandWritten;
    @JsonProperty("ReopenOriginalDocument")
    protected String reopenOriginalDocument;
    @JsonProperty("ReopenManuallyClosedOrCanceledDocument")
    protected String reopenManuallyClosedOrCanceledDocument;
    @JsonProperty("CreateOnlineQuotation")
    protected String createOnlineQuotation;
    @JsonProperty("POSEquipmentNumber")
    protected String posEquipmentNumber;
    @JsonProperty("POSManufacturerSerialNumber")
    protected String posManufacturerSerialNumber;
    @JsonProperty("POSCashierNumber")
    protected Long posCashierNumber;
    @JsonProperty("ApplyCurrentVATRatesForDownPaymentsToDraw")
    protected String applyCurrentVATRatesForDownPaymentsToDraw;
    @JsonProperty("ClosingOption")
    protected String closingOption;
    @JsonProperty("SpecifiedClosingDate")
    protected String specifiedClosingDate;
    @JsonProperty("OpenForLandedCosts")
    protected String openForLandedCosts;
    @JsonProperty("AuthorizationStatus")
    protected String authorizationStatus;
    @JsonProperty("TotalDiscountFC")
    protected Double totalDiscountFC;
    @JsonProperty("TotalDiscountSC")
    protected Double totalDiscountSC;
    @JsonProperty("RelevantToGTS")
    protected String relevantToGTS;
    @JsonProperty("BPLName")
    protected String bplName;
    @JsonProperty("VATRegNum")
    protected String vatRegNum;
    @JsonProperty("AnnualInvoiceDeclarationReference")
    protected Long annualInvoiceDeclarationReference;
    @JsonProperty("Supplier")
    protected String supplier;
    @JsonProperty("Releaser")
    protected Long releaser;
    @JsonProperty("Receiver")
    protected Long receiver;
    @JsonProperty("BlanketAgreementNumber")
    protected Long blanketAgreementNumber;
    @JsonProperty("IsAlteration")
    protected String isAlteration;
    @JsonProperty("CancelStatus")
    protected String cancelStatus;
    @JsonProperty("AssetValueDate")
    protected String assetValueDate;
    @JsonProperty("DocumentDelivery")
    protected String documentDelivery;
    @JsonProperty("ReuseDocumentNum")
    protected String reuseDocumentNum;
    @JsonProperty("ReuseNotaFiscalNum")
    protected String reuseNotaFiscalNum;
    @JsonProperty("U_SourceCompany")
    protected String uSourceCompany;
    @JsonProperty("U_SourceEntry")
    protected String uSourceEntry;
    @JsonProperty("U_QCRefNo")
    protected Long uqcRefNo;
    @JsonProperty("U_WUID")
    protected String uWUID;
    @JsonProperty("U_MedioPg")
    protected String uMedioPg;
    @JsonProperty("U_Plantilla")
    protected Integer uPlantilla;
    @JsonProperty("U_NUNFAC")
    protected String ununfac;
    @JsonProperty("U_Origen")
    protected String uOrigen;
    @JsonProperty("U_AIU_ADMIN")
    protected Double uAIUAadmin;
    @JsonProperty("U_AIU_IMPRE")
    protected Double uAIUimpre;
    @JsonProperty("U_AIU_UTIL")
    protected Double uAIUutil;
    @JsonProperty("U_F_EN_DOC_FIN")
    protected String uFENdocFin;
    @JsonProperty("U_F_PAGO_FINAL")
    protected String uFPagoFinal;
    @JsonProperty("U_VLR_PAGO_FINAL")
    protected Double uVLRpagoFinal;
    @JsonProperty("U_CANT_CONTE")
    protected String uCantConte;
    @JsonProperty("U_LIQUID_COMEX")
    protected String uLiquidComex;
    @JsonProperty("U_addInFaElectronica_tipoND_FE")
    protected String uAddInFaElectronicaTipoNDFE;
    @JsonProperty("U_tipoNCC_FE")
    protected String uTipoNCCFE;
    @JsonProperty("U_fechaDocCont")
    protected String uFechaDocCont;
    @JsonProperty("U_FE_FechaTC")
    protected String uFeFechaTC;
    @JsonProperty("U_Doc_CR_FE")
    protected String uDocCrFE;
    @JsonProperty("U_CUFE")
    protected String uCUFE;
    @JsonProperty("U_DocAdicionales")
    protected String uDocAdicionales;
    @JsonProperty("U_addInFE_LinkFE")
    protected String uAddInFeLinkFE;
    @JsonProperty("U_addInFa_FVSerie")
    protected String uAddInFaFvSerie;
    @JsonProperty("U_addInFa_FVNum")
    protected String uAddInFaFvNum;
    @JsonProperty("U_NroFacContinFE")
    protected String uNroFacContinFE;
    @JsonProperty("U_tipoEmisionFE")
    protected String uTipoEmisionFE;
    @JsonProperty("U_CodigoQR")
    protected String uCodigoQR;
    @JsonProperty("U_SelloDigital")
    protected String uSelloDigital;
    @JsonProperty("U_tipo_NCV_FE")
    protected String uTipoNCVFE;
    @JsonProperty("U_CBM")
    protected String uCBM;
    @JsonProperty("U_condEntrega_FE")
    protected String uCondEntregaFE;
    @JsonProperty("U_DESPACHO_CONTADO")
    protected String uDespachoContado;
    @JsonProperty("U_totalImpoCo")
    protected Double uTotalImpoCo;
    @JsonProperty("U_SERIAL")
    protected String uSERIAL;
    @JsonProperty("U_ESTADO_WMS")
    protected String uEstadoWMS;
    @JsonProperty("U_INCOTERMS")
    protected String uINCOTERMS;
    @JsonProperty("U_OK1_Fa_Export")
    protected String uOK1FaExport;
    @JsonProperty("U_TipoFacturacion")
    protected String uTipoFacturacion;
    @JsonProperty("U_tipoMandato")
    protected String uTipoMandato;
    @JsonProperty("U_tipoTransporte")
    protected String uTipoTransporte;
    @JsonProperty("U_F_CARGA_LISTA")
    protected String uFCargaLista;
    @JsonProperty("U_TIEMPO_TRANSITO")
    protected String uTiempoTransito;
    @JsonProperty("U_F_SALIDA_PUERTO")
    protected String uFsalidaPuerto;
    @JsonProperty("U_TIEMPO_PUERTO")
    protected String uTiempoPuerto;
    @JsonProperty("U_TIPO_CARGA")
    protected String uTipoCarga;
    @JsonProperty("U_TIEMPO_ENT_COMEX")
    protected String uTiempoEntComex;
    @JsonProperty("U_F_BOOKING")
    protected String uFBOOKING;
    @JsonProperty("U_TIEMPO_ESP_BOOKING")
    protected String uTiempoEspBOOKING;
    @JsonProperty("U_F_ESTIM_EMBARQUE")
    protected String uFestimEmbarque;
    @JsonProperty("U_F_CUTT_OFF")
    protected String uFCUTTOFF;
    @JsonProperty("U_F_REC_DOC_FINAL")
    protected String uFrecDocFinal;
    @JsonProperty("U_EMISION_BL")
    protected String uEmisionBL;
    @JsonProperty("U_INSPECCION")
    protected String uInspeccion;
    @JsonProperty("U_F_ARRIBO_CEDI_EST")
    protected String uFAarriboCediEst;
    @JsonProperty("U_NotificationBL")
    protected String uNotificationBL;
    @JsonProperty("U_F_ESTIM_PAGO")
    protected String uFEstimPago;
    protected List<InvoicesRestDTO.DocumentLines.DocumentLine> documentLines;
    protected List<InvoicesRestDTO.DocumentAdditionalExpenses.DocumentAdditionalExpense> documentAdditionalExpenses;
    protected List<InvoicesRestDTO.WithholdingTaxDataCollection.WithholdingTaxData> withholdingTaxDataCollection;
    protected List<InvoicesRestDTO.DocumentPackages.DocumentPackage> documentPackages;
    protected List<InvoicesRestDTO.DocumentSpecialLines.DocumentSpecialLine> documentSpecialLines;
    protected List<InvoicesRestDTO.DocumentInstallments.DocumentInstallment> documentInstallments;
    protected List<InvoicesRestDTO.DownPaymentsToDraw.DownPaymentToDraw> downPaymentsToDraw;
    protected InvoicesRestDTO.TaxExtension taxExtension;
    protected InvoicesRestDTO.AddressExtension addressExtension;

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

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getHandWritten() {
        return handWritten;
    }

    public void setHandWritten(String handWritten) {
        this.handWritten = handWritten;
    }

    public String getPrinted() {
        return printed;
    }

    public void setPrinted(String printed) {
        this.printed = printed;
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

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumAtCard() {
        return numAtCard;
    }

    public void setNumAtCard(String numAtCard) {
        this.numAtCard = numAtCard;
    }

    public Double getDocTotal() {
        return docTotal;
    }

    public void setDocTotal(Double docTotal) {
        this.docTotal = docTotal;
    }

    public Long getAttachmentEntry() {
        return attachmentEntry;
    }

    public void setAttachmentEntry(Long attachmentEntry) {
        this.attachmentEntry = attachmentEntry;
    }

    public String getDocCurrency() {
        return docCurrency;
    }

    public void setDocCurrency(String docCurrency) {
        this.docCurrency = docCurrency;
    }

    public Double getDocRate() {
        return docRate;
    }

    public void setDocRate(Double docRate) {
        this.docRate = docRate;
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

    public Long getPaymentGroupCode() {
        return paymentGroupCode;
    }

    public void setPaymentGroupCode(Long paymentGroupCode) {
        this.paymentGroupCode = paymentGroupCode;
    }

    public String getDocTime() {
        return docTime;
    }

    public void setDocTime(String docTime) {
        this.docTime = docTime;
    }

    public Long getSalesPersonCode() {
        return salesPersonCode;
    }

    public void setSalesPersonCode(Long salesPersonCode) {
        this.salesPersonCode = salesPersonCode;
    }

    public Long getTransportationCode() {
        return transportationCode;
    }

    public void setTransportationCode(Long transportationCode) {
        this.transportationCode = transportationCode;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public Long getImportFileNum() {
        return importFileNum;
    }

    public void setImportFileNum(Long importFileNum) {
        this.importFileNum = importFileNum;
    }

    public String getSummeryType() {
        return summeryType;
    }

    public void setSummeryType(String summeryType) {
        this.summeryType = summeryType;
    }

    public Long getContactPersonCode() {
        return contactPersonCode;
    }

    public void setContactPersonCode(Long contactPersonCode) {
        this.contactPersonCode = contactPersonCode;
    }

    public String getShowSCN() {
        return showSCN;
    }

    public void setShowSCN(String showSCN) {
        this.showSCN = showSCN;
    }

    public Long getSeries() {
        return series;
    }

    public void setSeries(Long series) {
        this.series = series;
    }

    public String getTaxDate() {
        return taxDate;
    }

    public void setTaxDate(String taxDate) {
        this.taxDate = taxDate;
    }

    public String getPartialSupply() {
        return partialSupply;
    }

    public void setPartialSupply(String partialSupply) {
        this.partialSupply = partialSupply;
    }

    public String getDocObjectCode() {
        return docObjectCode;
    }

    public void setDocObjectCode(String docObjectCode) {
        this.docObjectCode = docObjectCode;
    }

    public String getShipToCode() {
        return shipToCode;
    }

    public void setShipToCode(String shipToCode) {
        this.shipToCode = shipToCode;
    }

    public String getIndicator() {
        return indicator;
    }

    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }

    public String getFederalTaxID() {
        return federalTaxID;
    }

    public void setFederalTaxID(String federalTaxID) {
        this.federalTaxID = federalTaxID;
    }

    public Double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public String getPaymentReference() {
        return paymentReference;
    }

    public void setPaymentReference(String paymentReference) {
        this.paymentReference = paymentReference;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public Long getFinancialPeriod() {
        return financialPeriod;
    }

    public void setFinancialPeriod(Long financialPeriod) {
        this.financialPeriod = financialPeriod;
    }

    public Long getTransNum() {
        return transNum;
    }

    public void setTransNum(Long transNum) {
        this.transNum = transNum;
    }

    public BigDecimal getVatSum() {
        return vatSum;
    }

    public void setVatSum(BigDecimal vatSum) {
        this.vatSum = vatSum;
    }

    public Double getVatSumSys() {
        return vatSumSys;
    }

    public void setVatSumSys(Double vatSumSys) {
        this.vatSumSys = vatSumSys;
    }

    public Double getVatSumFc() {
        return vatSumFc;
    }

    public void setVatSumFc(Double vatSumFc) {
        this.vatSumFc = vatSumFc;
    }

    public String getNetProcedure() {
        return netProcedure;
    }

    public void setNetProcedure(String netProcedure) {
        this.netProcedure = netProcedure;
    }

    public Double getDocTotalFc() {
        return docTotalFc;
    }

    public void setDocTotalFc(Double docTotalFc) {
        this.docTotalFc = docTotalFc;
    }

    public Double getDocTotalSys() {
        return docTotalSys;
    }

    public void setDocTotalSys(Double docTotalSys) {
        this.docTotalSys = docTotalSys;
    }

    public Long getForm1099() {
        return form1099;
    }

    public void setForm1099(Long form1099) {
        this.form1099 = form1099;
    }

    public String getBox1099() {
        return box1099;
    }

    public void setBox1099(String box1099) {
        this.box1099 = box1099;
    }

    public String getRevisionPo() {
        return revisionPo;
    }

    public void setRevisionPo(String revisionPo) {
        this.revisionPo = revisionPo;
    }

    public String getRequriedDate() {
        return requriedDate;
    }

    public void setRequriedDate(String requriedDate) {
        this.requriedDate = requriedDate;
    }

    public String getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(String cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getBlockDunning() {
        return blockDunning;
    }

    public void setBlockDunning(String blockDunning) {
        this.blockDunning = blockDunning;
    }

    public String getSubmitted() {
        return submitted;
    }

    public void setSubmitted(String submitted) {
        this.submitted = submitted;
    }

    public Long getSegment() {
        return segment;
    }

    public void setSegment(Long segment) {
        this.segment = segment;
    }

    public String getPickStatus() {
        return pickStatus;
    }

    public void setPickStatus(String pickStatus) {
        this.pickStatus = pickStatus;
    }

    public String getPick() {
        return pick;
    }

    public void setPick(String pick) {
        this.pick = pick;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentBlock() {
        return paymentBlock;
    }

    public void setPaymentBlock(String paymentBlock) {
        this.paymentBlock = paymentBlock;
    }

    public Long getPaymentBlockEntry() {
        return paymentBlockEntry;
    }

    public void setPaymentBlockEntry(Long paymentBlockEntry) {
        this.paymentBlockEntry = paymentBlockEntry;
    }

    public String getCentralBankIndicator() {
        return centralBankIndicator;
    }

    public void setCentralBankIndicator(String centralBankIndicator) {
        this.centralBankIndicator = centralBankIndicator;
    }

    public String getMaximumCashDiscount() {
        return maximumCashDiscount;
    }

    public void setMaximumCashDiscount(String maximumCashDiscount) {
        this.maximumCashDiscount = maximumCashDiscount;
    }

    public String getReserve() {
        return reserve;
    }

    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getExemptionValidityDateFrom() {
        return exemptionValidityDateFrom;
    }

    public void setExemptionValidityDateFrom(String exemptionValidityDateFrom) {
        this.exemptionValidityDateFrom = exemptionValidityDateFrom;
    }

    public String getExemptionValidityDateTo() {
        return exemptionValidityDateTo;
    }

    public void setExemptionValidityDateTo(String exemptionValidityDateTo) {
        this.exemptionValidityDateTo = exemptionValidityDateTo;
    }

    public String getWareHouseUpdateType() {
        return wareHouseUpdateType;
    }

    public void setWareHouseUpdateType(String wareHouseUpdateType) {
        this.wareHouseUpdateType = wareHouseUpdateType;
    }

    public String getRounding() {
        return rounding;
    }

    public void setRounding(String rounding) {
        this.rounding = rounding;
    }

    public String getExternalCorrectedDocNum() {
        return externalCorrectedDocNum;
    }

    public void setExternalCorrectedDocNum(String externalCorrectedDocNum) {
        this.externalCorrectedDocNum = externalCorrectedDocNum;
    }

    public Long getInternalCorrectedDocNum() {
        return internalCorrectedDocNum;
    }

    public void setInternalCorrectedDocNum(Long internalCorrectedDocNum) {
        this.internalCorrectedDocNum = internalCorrectedDocNum;
    }

    public Long getNextCorrectingDocument() {
        return nextCorrectingDocument;
    }

    public void setNextCorrectingDocument(Long nextCorrectingDocument) {
        this.nextCorrectingDocument = nextCorrectingDocument;
    }

    public String getDeferredTax() {
        return deferredTax;
    }

    public void setDeferredTax(String deferredTax) {
        this.deferredTax = deferredTax;
    }

    public String getTaxExemptionLetterNum() {
        return taxExemptionLetterNum;
    }

    public void setTaxExemptionLetterNum(String taxExemptionLetterNum) {
        this.taxExemptionLetterNum = taxExemptionLetterNum;
    }

    public Double getWtApplied() {
        return wtApplied;
    }

    public void setWtApplied(Double wtApplied) {
        this.wtApplied = wtApplied;
    }

    public Double getWtAppliedFC() {
        return wtAppliedFC;
    }

    public void setWtAppliedFC(Double wtAppliedFC) {
        this.wtAppliedFC = wtAppliedFC;
    }

    public String getBillOfExchangeReserved() {
        return billOfExchangeReserved;
    }

    public void setBillOfExchangeReserved(String billOfExchangeReserved) {
        this.billOfExchangeReserved = billOfExchangeReserved;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public Double getWtAppliedSC() {
        return wtAppliedSC;
    }

    public void setWtAppliedSC(Double wtAppliedSC) {
        this.wtAppliedSC = wtAppliedSC;
    }

    public Double getTotalEqualizationTax() {
        return totalEqualizationTax;
    }

    public void setTotalEqualizationTax(Double totalEqualizationTax) {
        this.totalEqualizationTax = totalEqualizationTax;
    }

    public Double getTotalEqualizationTaxFC() {
        return totalEqualizationTaxFC;
    }

    public void setTotalEqualizationTaxFC(Double totalEqualizationTaxFC) {
        this.totalEqualizationTaxFC = totalEqualizationTaxFC;
    }

    public Double getTotalEqualizationTaxSC() {
        return totalEqualizationTaxSC;
    }

    public void setTotalEqualizationTaxSC(Double totalEqualizationTaxSC) {
        this.totalEqualizationTaxSC = totalEqualizationTaxSC;
    }

    public Long getNumberOfInstallments() {
        return numberOfInstallments;
    }

    public void setNumberOfInstallments(Long numberOfInstallments) {
        this.numberOfInstallments = numberOfInstallments;
    }

    public String getApplyTaxOnFirstInstallment() {
        return applyTaxOnFirstInstallment;
    }

    public void setApplyTaxOnFirstInstallment(String applyTaxOnFirstInstallment) {
        this.applyTaxOnFirstInstallment = applyTaxOnFirstInstallment;
    }

    public Double getWtNonSubjectAmount() {
        return wtNonSubjectAmount;
    }

    public void setWtNonSubjectAmount(Double wtNonSubjectAmount) {
        this.wtNonSubjectAmount = wtNonSubjectAmount;
    }

    public Double getWtNonSubjectAmountSC() {
        return wtNonSubjectAmountSC;
    }

    public void setWtNonSubjectAmountSC(Double wtNonSubjectAmountSC) {
        this.wtNonSubjectAmountSC = wtNonSubjectAmountSC;
    }

    public Double getWtNonSubjectAmountFC() {
        return wtNonSubjectAmountFC;
    }

    public void setWtNonSubjectAmountFC(Double wtNonSubjectAmountFC) {
        this.wtNonSubjectAmountFC = wtNonSubjectAmountFC;
    }

    public Double getWtExemptedAmount() {
        return wtExemptedAmount;
    }

    public void setWtExemptedAmount(Double wtExemptedAmount) {
        this.wtExemptedAmount = wtExemptedAmount;
    }

    public Double getWtExemptedAmountSC() {
        return wtExemptedAmountSC;
    }

    public void setWtExemptedAmountSC(Double wtExemptedAmountSC) {
        this.wtExemptedAmountSC = wtExemptedAmountSC;
    }

    public Double getWtExemptedAmountFC() {
        return wtExemptedAmountFC;
    }

    public void setWtExemptedAmountFC(Double wtExemptedAmountFC) {
        this.wtExemptedAmountFC = wtExemptedAmountFC;
    }

    public BigDecimal getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(BigDecimal baseAmount) {
        this.baseAmount = baseAmount;
    }

    public Double getBaseAmountSC() {
        return baseAmountSC;
    }

    public void setBaseAmountSC(Double baseAmountSC) {
        this.baseAmountSC = baseAmountSC;
    }

    public Double getBaseAmountFC() {
        return baseAmountFC;
    }

    public void setBaseAmountFC(Double baseAmountFC) {
        this.baseAmountFC = baseAmountFC;
    }

    public Double getWtAmount() {
        return wtAmount;
    }

    public void setWtAmount(Double wtAmount) {
        this.wtAmount = wtAmount;
    }

    public Double getWtAmountSC() {
        return wtAmountSC;
    }

    public void setWtAmountSC(Double wtAmountSC) {
        this.wtAmountSC = wtAmountSC;
    }

    public Double getWtAmountFC() {
        return wtAmountFC;
    }

    public void setWtAmountFC(Double wtAmountFC) {
        this.wtAmountFC = wtAmountFC;
    }

    public String getVatDate() {
        return vatDate;
    }

    public void setVatDate(String vatDate) {
        this.vatDate = vatDate;
    }

    public Long getDocumentsOwner() {
        return documentsOwner;
    }

    public void setDocumentsOwner(Long documentsOwner) {
        this.documentsOwner = documentsOwner;
    }

    public String getFolioPrefixString() {
        return folioPrefixString;
    }

    public void setFolioPrefixString(String folioPrefixString) {
        this.folioPrefixString = folioPrefixString;
    }

    public Long getFolioNumber() {
        return folioNumber;
    }

    public void setFolioNumber(Long folioNumber) {
        this.folioNumber = folioNumber;
    }

    public String getDocumentSubType() {
        return documentSubType;
    }

    public void setDocumentSubType(String documentSubType) {
        this.documentSubType = documentSubType;
    }

    public String getBpChannelCode() {
        return bpChannelCode;
    }

    public void setBpChannelCode(String bpChannelCode) {
        this.bpChannelCode = bpChannelCode;
    }

    public Long getBpChannelContact() {
        return bpChannelContact;
    }

    public void setBpChannelContact(Long bpChannelContact) {
        this.bpChannelContact = bpChannelContact;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getDocumentStatus() {
        return documentStatus;
    }

    public void setDocumentStatus(String documentStatus) {
        this.documentStatus = documentStatus;
    }

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setPeriodIndicator(String periodIndicator) {
        this.periodIndicator = periodIndicator;
    }

    public String getPayToCode() {
        return payToCode;
    }

    public void setPayToCode(String payToCode) {
        this.payToCode = payToCode;
    }

    public String getManualNumber() {
        return manualNumber;
    }

    public void setManualNumber(String manualNumber) {
        this.manualNumber = manualNumber;
    }

    public String getUseShpdGoodsAct() {
        return useShpdGoodsAct;
    }

    public void setUseShpdGoodsAct(String useShpdGoodsAct) {
        this.useShpdGoodsAct = useShpdGoodsAct;
    }

    public String getIsPayToBank() {
        return isPayToBank;
    }

    public void setIsPayToBank(String isPayToBank) {
        this.isPayToBank = isPayToBank;
    }

    public String getPayToBankCountry() {
        return payToBankCountry;
    }

    public void setPayToBankCountry(String payToBankCountry) {
        this.payToBankCountry = payToBankCountry;
    }

    public String getPayToBankCode() {
        return payToBankCode;
    }

    public void setPayToBankCode(String payToBankCode) {
        this.payToBankCode = payToBankCode;
    }

    public String getPayToBankAccountNo() {
        return payToBankAccountNo;
    }

    public void setPayToBankAccountNo(String payToBankAccountNo) {
        this.payToBankAccountNo = payToBankAccountNo;
    }

    public String getPayToBankBranch() {
        return payToBankBranch;
    }

    public void setPayToBankBranch(String payToBankBranch) {
        this.payToBankBranch = payToBankBranch;
    }

    public Long getBplidAssignedToInvoice() {
        return bplidAssignedToInvoice;
    }

    public void setBplidAssignedToInvoice(Long bplidAssignedToInvoice) {
        this.bplidAssignedToInvoice = bplidAssignedToInvoice;
    }

    public Double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(Double downPayment) {
        this.downPayment = downPayment;
    }

    public String getReserveInvoice() {
        return reserveInvoice;
    }

    public void setReserveInvoice(String reserveInvoice) {
        this.reserveInvoice = reserveInvoice;
    }

    public Long getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(Long languageCode) {
        this.languageCode = languageCode;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getPickRemark() {
        return pickRemark;
    }

    public void setPickRemark(String pickRemark) {
        this.pickRemark = pickRemark;
    }

    public String getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(String closingDate) {
        this.closingDate = closingDate;
    }

    public Long getSequenceCode() {
        return sequenceCode;
    }

    public void setSequenceCode(Long sequenceCode) {
        this.sequenceCode = sequenceCode;
    }

    public Long getSequenceSerial() {
        return sequenceSerial;
    }

    public void setSequenceSerial(Long sequenceSerial) {
        this.sequenceSerial = sequenceSerial;
    }

    public String getSeriesString() {
        return seriesString;
    }

    public void setSeriesString(String seriesString) {
        this.seriesString = seriesString;
    }

    public String getSubSeriesString() {
        return subSeriesString;
    }

    public void setSubSeriesString(String subSeriesString) {
        this.subSeriesString = subSeriesString;
    }

    public String getSequenceModel() {
        return sequenceModel;
    }

    public void setSequenceModel(String sequenceModel) {
        this.sequenceModel = sequenceModel;
    }

    public String getUseCorrectionVATGroup() {
        return useCorrectionVATGroup;
    }

    public void setUseCorrectionVATGroup(String useCorrectionVATGroup) {
        this.useCorrectionVATGroup = useCorrectionVATGroup;
    }

    public Double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(Double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public Double getDownPaymentAmount() {
        return downPaymentAmount;
    }

    public void setDownPaymentAmount(Double downPaymentAmount) {
        this.downPaymentAmount = downPaymentAmount;
    }

    public Double getDownPaymentPercentage() {
        return downPaymentPercentage;
    }

    public void setDownPaymentPercentage(Double downPaymentPercentage) {
        this.downPaymentPercentage = downPaymentPercentage;
    }

    public String getDownPaymentType() {
        return downPaymentType;
    }

    public void setDownPaymentType(String downPaymentType) {
        this.downPaymentType = downPaymentType;
    }

    public Double getDownPaymentAmountSC() {
        return downPaymentAmountSC;
    }

    public void setDownPaymentAmountSC(Double downPaymentAmountSC) {
        this.downPaymentAmountSC = downPaymentAmountSC;
    }

    public Double getDownPaymentAmountFC() {
        return downPaymentAmountFC;
    }

    public void setDownPaymentAmountFC(Double downPaymentAmountFC) {
        this.downPaymentAmountFC = downPaymentAmountFC;
    }

    public Double getVatPercent() {
        return vatPercent;
    }

    public void setVatPercent(Double vatPercent) {
        this.vatPercent = vatPercent;
    }

    public Double getServiceGrossProfitPercent() {
        return serviceGrossProfitPercent;
    }

    public void setServiceGrossProfitPercent(Double serviceGrossProfitPercent) {
        this.serviceGrossProfitPercent = serviceGrossProfitPercent;
    }

    public String getOpeningRemarks() {
        return openingRemarks;
    }

    public void setOpeningRemarks(String openingRemarks) {
        this.openingRemarks = openingRemarks;
    }

    public String getClosingRemarks() {
        return closingRemarks;
    }

    public void setClosingRemarks(String closingRemarks) {
        this.closingRemarks = closingRemarks;
    }

    public Double getRoundingDiffAmount() {
        return roundingDiffAmount;
    }

    public void setRoundingDiffAmount(Double roundingDiffAmount) {
        this.roundingDiffAmount = roundingDiffAmount;
    }

    public Double getRoundingDiffAmountFC() {
        return roundingDiffAmountFC;
    }

    public void setRoundingDiffAmountFC(Double roundingDiffAmountFC) {
        this.roundingDiffAmountFC = roundingDiffAmountFC;
    }

    public Double getRoundingDiffAmountSC() {
        return roundingDiffAmountSC;
    }

    public void setRoundingDiffAmountSC(Double roundingDiffAmountSC) {
        this.roundingDiffAmountSC = roundingDiffAmountSC;
    }

    public String getCancelled() {
        return cancelled;
    }

    public void setCancelled(String cancelled) {
        this.cancelled = cancelled;
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

    public Long getPrivateKeyVersion() {
        return privateKeyVersion;
    }

    public void setPrivateKeyVersion(Long privateKeyVersion) {
        this.privateKeyVersion = privateKeyVersion;
    }

    public String getControlAccount() {
        return controlAccount;
    }

    public void setControlAccount(String controlAccount) {
        this.controlAccount = controlAccount;
    }

    public String getInsuranceOperation347() {
        return insuranceOperation347;
    }

    public void setInsuranceOperation347(String insuranceOperation347) {
        this.insuranceOperation347 = insuranceOperation347;
    }

    public String getArchiveNonremovableSalesQuotation() {
        return archiveNonremovableSalesQuotation;
    }

    public void setArchiveNonremovableSalesQuotation(String archiveNonremovableSalesQuotation) {
        this.archiveNonremovableSalesQuotation = archiveNonremovableSalesQuotation;
    }

    public Long getGtsChecker() {
        return gtsChecker;
    }

    public void setGtsChecker(Long gtsChecker) {
        this.gtsChecker = gtsChecker;
    }

    public Long getGtsPayee() {
        return gtsPayee;
    }

    public void setGtsPayee(Long gtsPayee) {
        this.gtsPayee = gtsPayee;
    }

    public Long getExtraMonth() {
        return extraMonth;
    }

    public void setExtraMonth(Long extraMonth) {
        this.extraMonth = extraMonth;
    }

    public Long getExtraDays() {
        return extraDays;
    }

    public void setExtraDays(Long extraDays) {
        this.extraDays = extraDays;
    }

    public Long getCashDiscountDateOffset() {
        return cashDiscountDateOffset;
    }

    public void setCashDiscountDateOffset(Long cashDiscountDateOffset) {
        this.cashDiscountDateOffset = cashDiscountDateOffset;
    }

    public String getStartFrom() {
        return startFrom;
    }

    public void setStartFrom(String startFrom) {
        this.startFrom = startFrom;
    }

    public String getNtsApproved() {
        return ntsApproved;
    }

    public void setNtsApproved(String ntsApproved) {
        this.ntsApproved = ntsApproved;
    }

    public Long geteTaxWebSite() {
        return eTaxWebSite;
    }

    public void seteTaxWebSite(Long eTaxWebSite) {
        this.eTaxWebSite = eTaxWebSite;
    }

    public String geteTaxNumber() {
        return eTaxNumber;
    }

    public void seteTaxNumber(String eTaxNumber) {
        this.eTaxNumber = eTaxNumber;
    }

    public String getNtsApprovedNumber() {
        return ntsApprovedNumber;
    }

    public void setNtsApprovedNumber(String ntsApprovedNumber) {
        this.ntsApprovedNumber = ntsApprovedNumber;
    }

    public String geteDocGenerationType() {
        return eDocGenerationType;
    }

    public void seteDocGenerationType(String eDocGenerationType) {
        this.eDocGenerationType = eDocGenerationType;
    }

    public Long geteDocSeries() {
        return eDocSeries;
    }

    public void seteDocSeries(Long eDocSeries) {
        this.eDocSeries = eDocSeries;
    }

    public String geteDocNum() {
        return eDocNum;
    }

    public void seteDocNum(String eDocNum) {
        this.eDocNum = eDocNum;
    }

    public Long geteDocExportFormat() {
        return eDocExportFormat;
    }

    public void seteDocExportFormat(Long eDocExportFormat) {
        this.eDocExportFormat = eDocExportFormat;
    }

    public String geteDocStatus() {
        return eDocStatus;
    }

    public void seteDocStatus(String eDocStatus) {
        this.eDocStatus = eDocStatus;
    }

    public String geteDocErrorCode() {
        return eDocErrorCode;
    }

    public void seteDocErrorCode(String eDocErrorCode) {
        this.eDocErrorCode = eDocErrorCode;
    }

    public String geteDocErrorMessage() {
        return eDocErrorMessage;
    }

    public void seteDocErrorMessage(String eDocErrorMessage) {
        this.eDocErrorMessage = eDocErrorMessage;
    }

    public String getDownPaymentStatus() {
        return downPaymentStatus;
    }

    public void setDownPaymentStatus(String downPaymentStatus) {
        this.downPaymentStatus = downPaymentStatus;
    }

    public Long getGroupSeries() {
        return groupSeries;
    }

    public void setGroupSeries(Long groupSeries) {
        this.groupSeries = groupSeries;
    }

    public Long getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(Long groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getGroupHandWritten() {
        return groupHandWritten;
    }

    public void setGroupHandWritten(String groupHandWritten) {
        this.groupHandWritten = groupHandWritten;
    }

    public String getReopenOriginalDocument() {
        return reopenOriginalDocument;
    }

    public void setReopenOriginalDocument(String reopenOriginalDocument) {
        this.reopenOriginalDocument = reopenOriginalDocument;
    }

    public String getReopenManuallyClosedOrCanceledDocument() {
        return reopenManuallyClosedOrCanceledDocument;
    }

    public void setReopenManuallyClosedOrCanceledDocument(String reopenManuallyClosedOrCanceledDocument) {
        this.reopenManuallyClosedOrCanceledDocument = reopenManuallyClosedOrCanceledDocument;
    }

    public String getCreateOnlineQuotation() {
        return createOnlineQuotation;
    }

    public void setCreateOnlineQuotation(String createOnlineQuotation) {
        this.createOnlineQuotation = createOnlineQuotation;
    }

    public String getPosEquipmentNumber() {
        return posEquipmentNumber;
    }

    public void setPosEquipmentNumber(String posEquipmentNumber) {
        this.posEquipmentNumber = posEquipmentNumber;
    }

    public String getPosManufacturerSerialNumber() {
        return posManufacturerSerialNumber;
    }

    public void setPosManufacturerSerialNumber(String posManufacturerSerialNumber) {
        this.posManufacturerSerialNumber = posManufacturerSerialNumber;
    }

    public Long getPosCashierNumber() {
        return posCashierNumber;
    }

    public void setPosCashierNumber(Long posCashierNumber) {
        this.posCashierNumber = posCashierNumber;
    }

    public String getApplyCurrentVATRatesForDownPaymentsToDraw() {
        return applyCurrentVATRatesForDownPaymentsToDraw;
    }

    public void setApplyCurrentVATRatesForDownPaymentsToDraw(String applyCurrentVATRatesForDownPaymentsToDraw) {
        this.applyCurrentVATRatesForDownPaymentsToDraw = applyCurrentVATRatesForDownPaymentsToDraw;
    }

    public String getClosingOption() {
        return closingOption;
    }

    public void setClosingOption(String closingOption) {
        this.closingOption = closingOption;
    }

    public String getSpecifiedClosingDate() {
        return specifiedClosingDate;
    }

    public void setSpecifiedClosingDate(String specifiedClosingDate) {
        this.specifiedClosingDate = specifiedClosingDate;
    }

    public String getOpenForLandedCosts() {
        return openForLandedCosts;
    }

    public void setOpenForLandedCosts(String openForLandedCosts) {
        this.openForLandedCosts = openForLandedCosts;
    }

    public String getAuthorizationStatus() {
        return authorizationStatus;
    }

    public void setAuthorizationStatus(String authorizationStatus) {
        this.authorizationStatus = authorizationStatus;
    }

    public Double getTotalDiscountFC() {
        return totalDiscountFC;
    }

    public void setTotalDiscountFC(Double totalDiscountFC) {
        this.totalDiscountFC = totalDiscountFC;
    }

    public Double getTotalDiscountSC() {
        return totalDiscountSC;
    }

    public void setTotalDiscountSC(Double totalDiscountSC) {
        this.totalDiscountSC = totalDiscountSC;
    }

    public String getRelevantToGTS() {
        return relevantToGTS;
    }

    public void setRelevantToGTS(String relevantToGTS) {
        this.relevantToGTS = relevantToGTS;
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

    public Long getAnnualInvoiceDeclarationReference() {
        return annualInvoiceDeclarationReference;
    }

    public void setAnnualInvoiceDeclarationReference(Long annualInvoiceDeclarationReference) {
        this.annualInvoiceDeclarationReference = annualInvoiceDeclarationReference;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Long getReleaser() {
        return releaser;
    }

    public void setReleaser(Long releaser) {
        this.releaser = releaser;
    }

    public Long getReceiver() {
        return receiver;
    }

    public void setReceiver(Long receiver) {
        this.receiver = receiver;
    }

    public Long getBlanketAgreementNumber() {
        return blanketAgreementNumber;
    }

    public void setBlanketAgreementNumber(Long blanketAgreementNumber) {
        this.blanketAgreementNumber = blanketAgreementNumber;
    }

    public String getIsAlteration() {
        return isAlteration;
    }

    public void setIsAlteration(String isAlteration) {
        this.isAlteration = isAlteration;
    }

    public String getCancelStatus() {
        return cancelStatus;
    }

    public void setCancelStatus(String cancelStatus) {
        this.cancelStatus = cancelStatus;
    }

    public String getAssetValueDate() {
        return assetValueDate;
    }

    public void setAssetValueDate(String assetValueDate) {
        this.assetValueDate = assetValueDate;
    }

    public String getDocumentDelivery() {
        return documentDelivery;
    }

    public void setDocumentDelivery(String documentDelivery) {
        this.documentDelivery = documentDelivery;
    }

    public String getReuseDocumentNum() {
        return reuseDocumentNum;
    }

    public void setReuseDocumentNum(String reuseDocumentNum) {
        this.reuseDocumentNum = reuseDocumentNum;
    }

    public String getReuseNotaFiscalNum() {
        return reuseNotaFiscalNum;
    }

    public void setReuseNotaFiscalNum(String reuseNotaFiscalNum) {
        this.reuseNotaFiscalNum = reuseNotaFiscalNum;
    }

    public String getuSourceCompany() {
        return uSourceCompany;
    }

    public void setuSourceCompany(String uSourceCompany) {
        this.uSourceCompany = uSourceCompany;
    }

    public String getuSourceEntry() {
        return uSourceEntry;
    }

    public void setuSourceEntry(String uSourceEntry) {
        this.uSourceEntry = uSourceEntry;
    }

    public Long getUqcRefNo() {
        return uqcRefNo;
    }

    public void setUqcRefNo(Long uqcRefNo) {
        this.uqcRefNo = uqcRefNo;
    }

    public String getuWUID() {
        return uWUID;
    }

    public void setuWUID(String uWUID) {
        this.uWUID = uWUID;
    }

    public String getuMedioPg() {
        return uMedioPg;
    }

    public void setuMedioPg(String uMedioPg) {
        this.uMedioPg = uMedioPg;
    }

    public Integer getuPlantilla() {
        return uPlantilla;
    }

    public void setuPlantilla(Integer uPlantilla) {
        this.uPlantilla = uPlantilla;
    }

    public String getUnunfac() {
        return ununfac;
    }

    public void setUnunfac(String ununfac) {
        this.ununfac = ununfac;
    }

    public String getuOrigen() {
        return uOrigen;
    }

    public void setuOrigen(String uOrigen) {
        this.uOrigen = uOrigen;
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

    public List<DocumentPackages.DocumentPackage> getDocumentPackages() {
        return documentPackages;
    }

    public void setDocumentPackages(List<DocumentPackages.DocumentPackage> documentPackages) {
        this.documentPackages = documentPackages;
    }

    public List<DocumentSpecialLines.DocumentSpecialLine> getDocumentSpecialLines() {
        return documentSpecialLines;
    }

    public void setDocumentSpecialLines(List<DocumentSpecialLines.DocumentSpecialLine> documentSpecialLines) {
        this.documentSpecialLines = documentSpecialLines;
    }

    public List<DocumentInstallments.DocumentInstallment> getDocumentInstallments() {
        return documentInstallments;
    }

    public void setDocumentInstallments(List<DocumentInstallments.DocumentInstallment> documentInstallments) {
        this.documentInstallments = documentInstallments;
    }

    public List<DownPaymentsToDraw.DownPaymentToDraw> getDownPaymentsToDraw() {
        return downPaymentsToDraw;
    }

    public void setDownPaymentsToDraw(List<DownPaymentsToDraw.DownPaymentToDraw> downPaymentsToDraw) {
        this.downPaymentsToDraw = downPaymentsToDraw;
    }

    public TaxExtension getTaxExtension() {
        return taxExtension;
    }

    public void setTaxExtension(TaxExtension taxExtension) {
        this.taxExtension = taxExtension;
    }

    public AddressExtension getAddressExtension() {
        return addressExtension;
    }

    public void setAddressExtension(AddressExtension addressExtension) {
        this.addressExtension = addressExtension;
    }

    public Double getuAIUAadmin() {
        return uAIUAadmin;
    }

    public void setuAIUAadmin(Double uAIUAadmin) {
        this.uAIUAadmin = uAIUAadmin;
    }

    public Double getuAIUimpre() {
        return uAIUimpre;
    }

    public void setuAIUimpre(Double uAIUimpre) {
        this.uAIUimpre = uAIUimpre;
    }

    public Double getuAIUutil() {
        return uAIUutil;
    }

    public void setuAIUutil(Double uAIUutil) {
        this.uAIUutil = uAIUutil;
    }

    public String getuFENdocFin() {
        return uFENdocFin;
    }

    public void setuFENdocFin(String uFENdocFin) {
        this.uFENdocFin = uFENdocFin;
    }

    public String getuFPagoFinal() {
        return uFPagoFinal;
    }

    public void setuFPagoFinal(String uFPagoFinal) {
        this.uFPagoFinal = uFPagoFinal;
    }

    public Double getuVLRpagoFinal() {
        return uVLRpagoFinal;
    }

    public void setuVLRpagoFinal(Double uVLRpagoFinal) {
        this.uVLRpagoFinal = uVLRpagoFinal;
    }

    public String getuCantConte() {
        return uCantConte;
    }

    public void setuCantConte(String uCantConte) {
        this.uCantConte = uCantConte;
    }

    public String getuLiquidComex() {
        return uLiquidComex;
    }

    public void setuLiquidComex(String uLiquidComex) {
        this.uLiquidComex = uLiquidComex;
    }

    public String getuAddInFaElectronicaTipoNDFE() {
        return uAddInFaElectronicaTipoNDFE;
    }

    public void setuAddInFaElectronicaTipoNDFE(String uAddInFaElectronicaTipoNDFE) {
        this.uAddInFaElectronicaTipoNDFE = uAddInFaElectronicaTipoNDFE;
    }

    public String getuTipoNCCFE() {
        return uTipoNCCFE;
    }

    public void setuTipoNCCFE(String uTipoNCCFE) {
        this.uTipoNCCFE = uTipoNCCFE;
    }

    public String getuFechaDocCont() {
        return uFechaDocCont;
    }

    public void setuFechaDocCont(String uFechaDocCont) {
        this.uFechaDocCont = uFechaDocCont;
    }

    public String getuFeFechaTC() {
        return uFeFechaTC;
    }

    public void setuFeFechaTC(String uFeFechaTC) {
        this.uFeFechaTC = uFeFechaTC;
    }

    public String getuDocCrFE() {
        return uDocCrFE;
    }

    public void setuDocCrFE(String uDocCrFE) {
        this.uDocCrFE = uDocCrFE;
    }

    public String getuCUFE() {
        return uCUFE;
    }

    public void setuCUFE(String uCUFE) {
        this.uCUFE = uCUFE;
    }

    public String getuDocAdicionales() {
        return uDocAdicionales;
    }

    public void setuDocAdicionales(String uDocAdicionales) {
        this.uDocAdicionales = uDocAdicionales;
    }

    public String getuAddInFeLinkFE() {
        return uAddInFeLinkFE;
    }

    public void setuAddInFeLinkFE(String uAddInFeLinkFE) {
        this.uAddInFeLinkFE = uAddInFeLinkFE;
    }

    public String getuAddInFaFvSerie() {
        return uAddInFaFvSerie;
    }

    public void setuAddInFaFvSerie(String uAddInFaFvSerie) {
        this.uAddInFaFvSerie = uAddInFaFvSerie;
    }

    public String getuAddInFaFvNum() {
        return uAddInFaFvNum;
    }

    public void setuAddInFaFvNum(String uAddInFaFvNum) {
        this.uAddInFaFvNum = uAddInFaFvNum;
    }

    public String getuNroFacContinFE() {
        return uNroFacContinFE;
    }

    public void setuNroFacContinFE(String uNroFacContinFE) {
        this.uNroFacContinFE = uNroFacContinFE;
    }

    public String getuTipoEmisionFE() {
        return uTipoEmisionFE;
    }

    public void setuTipoEmisionFE(String uTipoEmisionFE) {
        this.uTipoEmisionFE = uTipoEmisionFE;
    }

    public String getuCodigoQR() {
        return uCodigoQR;
    }

    public void setuCodigoQR(String uCodigoQR) {
        this.uCodigoQR = uCodigoQR;
    }

    public String getuSelloDigital() {
        return uSelloDigital;
    }

    public void setuSelloDigital(String uSelloDigital) {
        this.uSelloDigital = uSelloDigital;
    }

    public String getuTipoNCVFE() {
        return uTipoNCVFE;
    }

    public void setuTipoNCVFE(String uTipoNCVFE) {
        this.uTipoNCVFE = uTipoNCVFE;
    }

    public String getuCBM() {
        return uCBM;
    }

    public void setuCBM(String uCBM) {
        this.uCBM = uCBM;
    }

    public String getuCondEntregaFE() {
        return uCondEntregaFE;
    }

    public void setuCondEntregaFE(String uCondEntregaFE) {
        this.uCondEntregaFE = uCondEntregaFE;
    }

    public String getuDespachoContado() {
        return uDespachoContado;
    }

    public void setuDespachoContado(String uDespachoContado) {
        this.uDespachoContado = uDespachoContado;
    }

    public Double getuTotalImpoCo() {
        return uTotalImpoCo;
    }

    public void setuTotalImpoCo(Double uTotalImpoCo) {
        this.uTotalImpoCo = uTotalImpoCo;
    }

    public String getuSERIAL() {
        return uSERIAL;
    }

    public void setuSERIAL(String uSERIAL) {
        this.uSERIAL = uSERIAL;
    }

    public String getuEstadoWMS() {
        return uEstadoWMS;
    }

    public void setuEstadoWMS(String uEstadoWMS) {
        this.uEstadoWMS = uEstadoWMS;
    }

    public String getuINCOTERMS() {
        return uINCOTERMS;
    }

    public void setuINCOTERMS(String uINCOTERMS) {
        this.uINCOTERMS = uINCOTERMS;
    }

    public String getuOK1FaExport() {
        return uOK1FaExport;
    }

    public void setuOK1FaExport(String uOK1FaExport) {
        this.uOK1FaExport = uOK1FaExport;
    }

    public String getuTipoFacturacion() {
        return uTipoFacturacion;
    }

    public void setuTipoFacturacion(String uTipoFacturacion) {
        this.uTipoFacturacion = uTipoFacturacion;
    }

    public String getuTipoMandato() {
        return uTipoMandato;
    }

    public void setuTipoMandato(String uTipoMandato) {
        this.uTipoMandato = uTipoMandato;
    }

    public String getuTipoTransporte() {
        return uTipoTransporte;
    }

    public void setuTipoTransporte(String uTipoTransporte) {
        this.uTipoTransporte = uTipoTransporte;
    }

    public String getuFCargaLista() {
        return uFCargaLista;
    }

    public void setuFCargaLista(String uFCargaLista) {
        this.uFCargaLista = uFCargaLista;
    }

    public String getuTiempoTransito() {
        return uTiempoTransito;
    }

    public void setuTiempoTransito(String uTiempoTransito) {
        this.uTiempoTransito = uTiempoTransito;
    }

    public String getuFsalidaPuerto() {
        return uFsalidaPuerto;
    }

    public void setuFsalidaPuerto(String uFsalidaPuerto) {
        this.uFsalidaPuerto = uFsalidaPuerto;
    }

    public String getuTiempoPuerto() {
        return uTiempoPuerto;
    }

    public void setuTiempoPuerto(String uTiempoPuerto) {
        this.uTiempoPuerto = uTiempoPuerto;
    }

    public String getuTipoCarga() {
        return uTipoCarga;
    }

    public void setuTipoCarga(String uTipoCarga) {
        this.uTipoCarga = uTipoCarga;
    }

    public String getuTiempoEntComex() {
        return uTiempoEntComex;
    }

    public void setuTiempoEntComex(String uTiempoEntComex) {
        this.uTiempoEntComex = uTiempoEntComex;
    }

    public String getuFBOOKING() {
        return uFBOOKING;
    }

    public void setuFBOOKING(String uFBOOKING) {
        this.uFBOOKING = uFBOOKING;
    }

    public String getuTiempoEspBOOKING() {
        return uTiempoEspBOOKING;
    }

    public void setuTiempoEspBOOKING(String uTiempoEspBOOKING) {
        this.uTiempoEspBOOKING = uTiempoEspBOOKING;
    }

    public String getuFestimEmbarque() {
        return uFestimEmbarque;
    }

    public void setuFestimEmbarque(String uFestimEmbarque) {
        this.uFestimEmbarque = uFestimEmbarque;
    }

    public String getuFCUTTOFF() {
        return uFCUTTOFF;
    }

    public void setuFCUTTOFF(String uFCUTTOFF) {
        this.uFCUTTOFF = uFCUTTOFF;
    }

    public String getuFrecDocFinal() {
        return uFrecDocFinal;
    }

    public void setuFrecDocFinal(String uFrecDocFinal) {
        this.uFrecDocFinal = uFrecDocFinal;
    }

    public String getuEmisionBL() {
        return uEmisionBL;
    }

    public void setuEmisionBL(String uEmisionBL) {
        this.uEmisionBL = uEmisionBL;
    }

    public String getuInspeccion() {
        return uInspeccion;
    }

    public void setuInspeccion(String uInspeccion) {
        this.uInspeccion = uInspeccion;
    }

    public String getuFAarriboCediEst() {
        return uFAarriboCediEst;
    }

    public void setuFAarriboCediEst(String uFAarriboCediEst) {
        this.uFAarriboCediEst = uFAarriboCediEst;
    }

    public String getuNotificationBL() {
        return uNotificationBL;
    }

    public void setuNotificationBL(String uNotificationBL) {
        this.uNotificationBL = uNotificationBL;
    }

    public String getuFEstimPago() {
        return uFEstimPago;
    }

    public void setuFEstimPago(String uFEstimPago) {
        this.uFEstimPago = uFEstimPago;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DocumentInstallments implements Serializable {
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class DocumentInstallment implements Serializable {
            @JsonProperty("DueDate")
            protected String dueDate;
            @JsonProperty("Percentage")
            protected Double percentage;
            @JsonProperty("Total")
            protected Double total;
            @JsonProperty("LastDunningDate")
            protected String lastDunningDate;
            @JsonProperty("DunningLevel")
            protected Long dunningLevel;
            @JsonProperty("TotalFC")
            protected Double totalFC;
            @JsonProperty("InstallmentId")
            protected Long installmentId;
            @JsonProperty("PaymentOrdered")
            protected String paymentOrdered;

            public String getDueDate() {
                return dueDate;
            }

            public void setDueDate(String dueDate) {
                this.dueDate = dueDate;
            }

            public Double getPercentage() {
                return percentage;
            }

            public void setPercentage(Double percentage) {
                this.percentage = percentage;
            }

            public Double getTotal() {
                return total;
            }

            public void setTotal(Double total) {
                this.total = total;
            }

            public String getLastDunningDate() {
                return lastDunningDate;
            }

            public void setLastDunningDate(String lastDunningDate) {
                this.lastDunningDate = lastDunningDate;
            }

            public Long getDunningLevel() {
                return dunningLevel;
            }

            public void setDunningLevel(Long dunningLevel) {
                this.dunningLevel = dunningLevel;
            }

            public Double getTotalFC() {
                return totalFC;
            }

            public void setTotalFC(Double totalFC) {
                this.totalFC = totalFC;
            }

            public Long getInstallmentId() {
                return installmentId;
            }

            public void setInstallmentId(Long installmentId) {
                this.installmentId = installmentId;
            }

            public String getPaymentOrdered() {
                return paymentOrdered;
            }

            public void setPaymentOrdered(String paymentOrdered) {
                this.paymentOrdered = paymentOrdered;
            }
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DocumentLines implements Serializable {
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class DocumentLine implements Serializable {
            @JsonProperty("LineNum")
            protected Long lineNum;
            @JsonProperty("ItemCode")
            protected String itemCode;
            @JsonProperty("ItemDescription")
            protected String itemDescription;
            @JsonProperty("Quantity")
            protected Double quantity;
            @JsonProperty("ShipDate")
            protected String shipDate;
            @JsonProperty("Price")
            protected Double price;
            @JsonProperty("PriceAfterVAT")
            protected Double priceAfterVAT;
            @JsonProperty("Currency")
            protected String currency;
            @JsonProperty("Rate")
            protected Double rate;
            @JsonProperty("DiscountPercent")
            protected Double discountPercent;
            @JsonProperty("VendorNum")
            protected String vendorNum;
            @JsonProperty("SerialNum")
            protected String serialNum;
            @JsonProperty("WarehouseCode")
            protected String warehouseCode;
            @JsonProperty("SalesPersonCode")
            protected Long salesPersonCode;
            @JsonProperty("CommisionPercent")
            protected Double commisionPercent;
            @JsonProperty("TreeType")
            protected String treeType;
            @JsonProperty("AccountCode")
            protected String accountCode;
            @JsonProperty("UseBaseUnits")
            protected String useBaseUnits;
            @JsonProperty("SupplierCatNum")
            protected String supplierCatNum;
            @JsonProperty("CostingCode")
            protected String costingCode;
            @JsonProperty("ProjectCode")
            protected String projectCode;
            @JsonProperty("BarCode")
            protected String barCode;
            @JsonProperty("VatGroup")
            protected String vatGroup;
            @JsonProperty("Height1")
            protected Double height1;
            @JsonProperty("Hight1Unit")
            protected Long hight1Unit;
            @JsonProperty("Height2")
            protected Double height2;
            @JsonProperty("Height2Unit")
            protected Long height2Unit;
            @JsonProperty("Lengh1")
            protected Double lengh1;
            @JsonProperty("Lengh1Unit")
            protected Long lengh1Unit;
            @JsonProperty("Lengh2")
            protected Double lengh2;
            @JsonProperty("Lengh2Unit")
            protected Long lengh2Unit;
            @JsonProperty("Weight1")
            protected Double weight1;
            @JsonProperty("Weight1Unit")
            protected Long weight1Unit;
            @JsonProperty("Weight2")
            protected Double weight2;
            @JsonProperty("Weight2Unit")
            protected Long weight2Unit;
            @JsonProperty("Factor1")
            protected Double factor1;
            @JsonProperty("Factor2")
            protected Double factor2;
            @JsonProperty("Factor3")
            protected Double factor3;
            @JsonProperty("Factor4")
            protected Double factor4;
            @JsonProperty("BaseType")
            protected Long baseType;
            @JsonProperty("BaseEntry")
            protected Long baseEntry;
            @JsonProperty("BaseLine")
            protected Long baseLine;
            @JsonProperty("Volume")
            protected Double volume;
            @JsonProperty("VolumeUnit")
            protected Long volumeUnit;
            @JsonProperty("Width1")
            protected Double width1;
            @JsonProperty("Width1Unit")
            protected Long width1Unit;
            @JsonProperty("Width2")
            protected Double width2;
            @JsonProperty("Width2Unit")
            protected Long width2Unit;
            @JsonProperty("Address")
            protected String address;
            @JsonProperty("TaxCode")
            protected String taxCode;
            @JsonProperty("TaxType")
            protected String taxType;
            @JsonProperty("TaxLiable")
            protected String taxLiable;
            @JsonProperty("PickStatus")
            protected String pickStatus;
            @JsonProperty("PickQuantity")
            protected Double pickQuantity;
            @JsonProperty("PickListIdNumber")
            protected Long pickListIdNumber;
            @JsonProperty("OriginalItem")
            protected String originalItem;
            @JsonProperty("BackOrder")
            protected String backOrder;
            @JsonProperty("FreeText")
            protected String freeText;
            @JsonProperty("ShippingMethod")
            protected Long shippingMethod;
            @JsonProperty("POTargetNum")
            protected Long poTargetNum;
            @JsonProperty("POTargetEntry")
            protected String poTargetEntry;
            @JsonProperty("POTargetRowNum")
            protected Long poTargetRowNum;
            @JsonProperty("CorrectionInvoiceItem")
            protected String correctionInvoiceItem;
            @JsonProperty("CorrInvAmountToStock")
            protected Double corrInvAmountToStock;
            @JsonProperty("CorrInvAmountToDiffAcct")
            protected Double corrInvAmountToDiffAcct;
            @JsonProperty("AppliedTax")
            protected Double appliedTax;
            @JsonProperty("AppliedTaxFC")
            protected Double appliedTaxFC;
            @JsonProperty("AppliedTaxSC")
            protected Double appliedTaxSC;
            @JsonProperty("WTLiable")
            protected String wtLiable;
            @JsonProperty("DeferredTax")
            protected String deferredTax;
            @JsonProperty("EqualizationTaxPercent")
            protected Double equalizationTaxPercent;
            @JsonProperty("TotalEqualizationTax")
            protected Double totalEqualizationTax;
            @JsonProperty("TotalEqualizationTaxFC")
            protected Double totalEqualizationTaxFC;
            @JsonProperty("TotalEqualizationTaxSC")
            protected Double totalEqualizationTaxSC;
            @JsonProperty("NetTaxAmount")
            protected Double netTaxAmount;
            @JsonProperty("NetTaxAmountFC")
            protected Double netTaxAmountFC;
            @JsonProperty("NetTaxAmountSC")
            protected Double netTaxAmountSC;
            @JsonProperty("MeasureUnit")
            protected String measureUnit;
            @JsonProperty("UnitsOfMeasurment")
            protected Double unitsOfMeasurment;
            @JsonProperty("LineTotal")
            protected Double lineTotal;
            @JsonProperty("TaxPercentagePerRow")
            protected Double taxPercentagePerRow;
            @JsonProperty("TaxTotal")
            protected Double taxTotal;
            @JsonProperty("ConsumerSalesForecast")
            protected String consumerSalesForecast;
            @JsonProperty("ExciseAmount")
            protected Double exciseAmount;
            @JsonProperty("TaxPerUnit")
            protected Double taxPerUnit;
            @JsonProperty("TotalInclTax")
            protected Double totalInclTax;
            @JsonProperty("CountryOrg")
            protected String countryOrg;
            @JsonProperty("SWW")
            protected String sww;
            @JsonProperty("TransactionType")
            protected String transactionType;
            @JsonProperty("DistributeExpense")
            protected String distributeExpense;
            @JsonProperty("ShipToCode")
            protected String shipToCode;
            @JsonProperty("RowTotalFC")
            protected Double rowTotalFC;
            @JsonProperty("RowTotalSC")
            protected Double rowTotalSC;
            @JsonProperty("LastBuyInmPrice")
            protected Double lastBuyInmPrice;
            @JsonProperty("LastBuyDistributeSumFc")
            protected Double lastBuyDistributeSumFc;
            @JsonProperty("LastBuyDistributeSumSc")
            protected Double lastBuyDistributeSumSc;
            @JsonProperty("LastBuyDistributeSum")
            protected Double lastBuyDistributeSum;
            @JsonProperty("StockDistributesumForeign")
            protected Double stockDistributesumForeign;
            @JsonProperty("StockDistributesumSystem")
            protected Double stockDistributesumSystem;
            @JsonProperty("StockDistributesum")
            protected Double stockDistributesum;
            @JsonProperty("StockInmPrice")
            protected Double stockInmPrice;
            @JsonProperty("PickStatusEx")
            protected String pickStatusEx;
            @JsonProperty("TaxBeforeDPM")
            protected Double taxBeforeDPM;
            @JsonProperty("TaxBeforeDPMFC")
            protected Double taxBeforeDPMFC;
            @JsonProperty("TaxBeforeDPMSC")
            protected Double taxBeforeDPMSC;
            @JsonProperty("CFOPCode")
            protected String cfopCode;
            @JsonProperty("CSTCode")
            protected String cstCode;
            @JsonProperty("Usage")
            protected Long usage;
            @JsonProperty("TaxOnly")
            protected String taxOnly;
            @JsonProperty("VisualOrder")
            protected Long visualOrder;
            @JsonProperty("BaseOpenQuantity")
            protected Double baseOpenQuantity;
            @JsonProperty("UnitPrice")
            protected Double unitPrice;
            @JsonProperty("LineStatus")
            protected String lineStatus;
            @JsonProperty("PackageQuantity")
            protected Double packageQuantity;
            @JsonProperty("Text")
            protected String text;
            @JsonProperty("LineType")
            protected String lineType;
            @JsonProperty("COGSCostingCode")
            protected String cogsCostingCode;
            @JsonProperty("COGSAccountCode")
            protected String cogsAccountCode;
            @JsonProperty("ChangeAssemlyBoMWarehouse")
            protected String changeAssemlyBoMWarehouse;
            @JsonProperty("GrossBuyPrice")
            protected Double grossBuyPrice;
            @JsonProperty("GrossBase")
            protected Long grossBase;
            @JsonProperty("GrossProfitTotalBasePrice")
            protected Double grossProfitTotalBasePrice;
            @JsonProperty("CostingCode2")
            protected String costingCode2;
            @JsonProperty("CostingCode3")
            protected String costingCode3;
            @JsonProperty("CostingCode4")
            protected String costingCode4;
            @JsonProperty("CostingCode5")
            protected String costingCode5;
            @JsonProperty("ItemDetails")
            protected String itemDetails;
            @JsonProperty("LocationCode")
            protected Long locationCode;
            @JsonProperty("ActualDeliveryDate")
            protected String actualDeliveryDate;
            @JsonProperty("RemainingOpenQuantity")
            protected Double remainingOpenQuantity;
            @JsonProperty("OpenAmount")
            protected Double openAmount;
            @JsonProperty("OpenAmountFC")
            protected Double openAmountFC;
            @JsonProperty("OpenAmountSC")
            protected Double openAmountSC;
            @JsonProperty("ExLineNo")
            protected String exLineNo;
            @JsonProperty("RequiredDate")
            protected String requiredDate;
            @JsonProperty("RequiredQuantity")
            protected Double requiredQuantity;
            @JsonProperty("COGSCostingCode2")
            protected String cogsCostingCode2;
            @JsonProperty("COGSCostingCode3")
            protected String cogsCostingCode3;
            @JsonProperty("COGSCostingCode4")
            protected String cogsCostingCode4;
            @JsonProperty("COGSCostingCode5")
            protected String cogsCostingCode5;
            @JsonProperty("CSTforIPI")
            protected String csTforIPI;
            @JsonProperty("CSTforPIS")
            protected String csTforPIS;
            @JsonProperty("CSTforCOFINS")
            protected String csTforCOFINS;
            @JsonProperty("CreditOriginCode")
            protected String creditOriginCode;
            @JsonProperty("WithoutInventoryMovement")
            protected String withoutInventoryMovement;
            @JsonProperty("AgreementNo")
            protected Long agreementNo;
            @JsonProperty("AgreementRowNumber")
            protected Long agreementRowNumber;
            @JsonProperty("ShipToDescription")
            protected String shipToDescription;
            @JsonProperty("ActualBaseEntry")
            protected Long actualBaseEntry;
            @JsonProperty("ActualBaseLine")
            protected Long actualBaseLine;
            @JsonProperty("DocEntry")
            protected Long docEntry;
            @JsonProperty("Surpluses")
            protected Double surpluses;
            @JsonProperty("DefectAndBreakup")
            protected Double defectAndBreakup;
            @JsonProperty("Shortages")
            protected Double shortages;
            @JsonProperty("ConsiderQuantity")
            protected String considerQuantity;
            @JsonProperty("PartialRetirement")
            protected String partialRetirement;
            @JsonProperty("RetirementQuantity")
            protected Double retirementQuantity;
            @JsonProperty("RetirementAPC")
            protected Double retirementAPC;
            @JsonProperty("UoMEntry")
            protected Long uoMEntry;
            @JsonProperty("UoMCode")
            protected String uoMCode;
            @JsonProperty("InventoryQuantity")
            protected Double inventoryQuantity;
            @JsonProperty("RemainingOpenInventoryQuantity")
            protected Double remainingOpenInventoryQuantity;
            @JsonProperty("Incoterms")
            protected Long incoterms;
            @JsonProperty("TransportMode")
            protected Long transportMode;
            @JsonProperty("U_ExPrice")
            protected Double uExPrice;
            @JsonProperty("U_ExCurrency")
            protected String uExCurrency;
            @JsonProperty("U_ExRefNo")
            protected String uExRefNo;
            @JsonProperty("U_Color")
            protected String uColor;
            protected List<InvoicesRestDTO.DocumentLines.DocumentLine.LineTaxJurisdictions.LineTaxJurisdiction> lineTaxJurisdictions;
            protected List<InvoicesRestDTO.DocumentLines.DocumentLine.ExportProcesses.ExportProcess> exportProcesses;
            protected List<InvoicesRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense> documentLineAdditionalExpenses;
            protected List<InvoicesRestDTO.DocumentLines.DocumentLine.WithholdingTaxLines.WithholdingTaxLine> withholdingTaxLines;
            protected List<InvoicesRestDTO.DocumentLines.DocumentLine.SerialNumbers.SerialNumber> serialNumbers;
            protected List<InvoicesRestDTO.DocumentLines.DocumentLine.BatchNumbers.BatchNumber> batchNumbers;
            protected List<InvoicesRestDTO.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation> documentLinesBinAllocations;

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class BatchNumbers implements Serializable {
                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class BatchNumber implements Serializable {
                    @JsonProperty("BatchNumber")
                    protected String batchNumber;
                    @JsonProperty("ManufacturerSerialNumber")
                    protected String manufacturerSerialNumber;
                    @JsonProperty("InternalSerialNumber")
                    protected String internalSerialNumber;
                    @JsonProperty("ExpiryDate")
                    protected String expiryDate;
                    @JsonProperty("ManufacturingDate")
                    protected String manufacturingDate;
                    @JsonProperty("AddmisionDate")
                    protected String addmisionDate;
                    @JsonProperty("Location")
                    protected String location;
                    @JsonProperty("Notes")
                    protected String notes;
                    @JsonProperty("Quantity")
                    protected Double quantity;
                    @JsonProperty("BaseLineNumber")
                    protected Long baseLineNumber;

                    public String getBatchNumber() {
                        return batchNumber;
                    }

                    public void setBatchNumber(String batchNumber) {
                        this.batchNumber = batchNumber;
                    }

                    public String getManufacturerSerialNumber() {
                        return manufacturerSerialNumber;
                    }

                    public void setManufacturerSerialNumber(String manufacturerSerialNumber) {
                        this.manufacturerSerialNumber = manufacturerSerialNumber;
                    }

                    public String getInternalSerialNumber() {
                        return internalSerialNumber;
                    }

                    public void setInternalSerialNumber(String internalSerialNumber) {
                        this.internalSerialNumber = internalSerialNumber;
                    }

                    public String getExpiryDate() {
                        return expiryDate;
                    }

                    public void setExpiryDate(String expiryDate) {
                        this.expiryDate = expiryDate;
                    }

                    public String getManufacturingDate() {
                        return manufacturingDate;
                    }

                    public void setManufacturingDate(String manufacturingDate) {
                        this.manufacturingDate = manufacturingDate;
                    }

                    public String getAddmisionDate() {
                        return addmisionDate;
                    }

                    public void setAddmisionDate(String addmisionDate) {
                        this.addmisionDate = addmisionDate;
                    }

                    public String getLocation() {
                        return location;
                    }

                    public void setLocation(String location) {
                        this.location = location;
                    }

                    public String getNotes() {
                        return notes;
                    }

                    public void setNotes(String notes) {
                        this.notes = notes;
                    }

                    public Double getQuantity() {
                        return quantity;
                    }

                    public void setQuantity(Double quantity) {
                        this.quantity = quantity;
                    }

                    public Long getBaseLineNumber() {
                        return baseLineNumber;
                    }

                    public void setBaseLineNumber(Long baseLineNumber) {
                        this.baseLineNumber = baseLineNumber;
                    }
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class DocumentLineAdditionalExpenses implements Serializable {
                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class DocumentLineAdditionalExpense implements Serializable {
                    @JsonProperty("LineNumber")
                    protected Long lineNumber;
                    @JsonProperty("GroupCode")
                    protected Long groupCode;
                    @JsonProperty("ExpenseCode")
                    protected Long expenseCode;
                    @JsonProperty("LineTotal")
                    protected Double lineTotal;
                    @JsonProperty("LineTotalFC")
                    protected Double lineTotalFC;
                    @JsonProperty("LineTotalSys")
                    protected Double lineTotalSys;
                    @JsonProperty("PaidToDate")
                    protected Double paidToDate;
                    @JsonProperty("PaidToDateFC")
                    protected Double paidToDateFC;
                    @JsonProperty("PaidToDateSys")
                    protected Double paidToDateSys;
                    @JsonProperty("TaxLiable")
                    protected String taxLiable;
                    @JsonProperty("VatGroup")
                    protected String vatGroup;
                    @JsonProperty("TaxPercent")
                    protected Double taxPercent;
                    @JsonProperty("TaxSum")
                    protected Double taxSum;
                    @JsonProperty("TaxSumFC")
                    protected Double taxSumFC;
                    @JsonProperty("TaxSumSys")
                    protected Double taxSumSys;
                    @JsonProperty("DeductibleTaxSum")
                    protected Double deductibleTaxSum;
                    @JsonProperty("DeductibleTaxSumFC")
                    protected Double deductibleTaxSumFC;
                    @JsonProperty("DeductibleTaxSumSys")
                    protected Double deductibleTaxSumSys;
                    @JsonProperty("AquisitionTax")
                    protected String aquisitionTax;
                    @JsonProperty("TaxCode")
                    protected String taxCode;
                    @JsonProperty("TaxType")
                    protected String taxType;
                    @JsonProperty("TaxPaid")
                    protected Double taxPaid;
                    @JsonProperty("TaxPaidFC")
                    protected Double taxPaidFC;
                    @JsonProperty("TaxPaidSys")
                    protected Double taxPaidSys;
                    @JsonProperty("EqualizationTaxPercent")
                    protected Double equalizationTaxPercent;
                    @JsonProperty("EqualizationTaxSum")
                    protected Double equalizationTaxSum;
                    @JsonProperty("EqualizationTaxFC")
                    protected Double equalizationTaxFC;
                    @JsonProperty("EqualizationTaxSys")
                    protected Double equalizationTaxSys;
                    @JsonProperty("TaxTotalSum")
                    protected Double taxTotalSum;
                    @JsonProperty("TaxTotalSumFC")
                    protected Double taxTotalSumFC;
                    @JsonProperty("TaxTotalSumSys")
                    protected Double taxTotalSumSys;
                    @JsonProperty("WTLiable")
                    protected String wtLiable;
                    @JsonProperty("BaseGroup")
                    protected Long baseGroup;
                    @JsonProperty("DistributionRule")
                    protected String distributionRule;
                    @JsonProperty("Project")
                    protected String project;
                    @JsonProperty("DistributionRule2")
                    protected String distributionRule2;
                    @JsonProperty("DistributionRule3")
                    protected String distributionRule3;
                    @JsonProperty("DistributionRule4")
                    protected String distributionRule4;
                    @JsonProperty("DistributionRule5")
                    protected String distributionRule5;
                    @JsonProperty("LineExpenseTaxJurisdictions")
                    protected InvoicesRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense.LineExpenseTaxJurisdictions lineExpenseTaxJurisdictions;

                    public Long getLineNumber() {
                        return lineNumber;
                    }

                    public void setLineNumber(Long lineNumber) {
                        this.lineNumber = lineNumber;
                    }

                    public Long getGroupCode() {
                        return groupCode;
                    }

                    public void setGroupCode(Long groupCode) {
                        this.groupCode = groupCode;
                    }

                    public Long getExpenseCode() {
                        return expenseCode;
                    }

                    public void setExpenseCode(Long expenseCode) {
                        this.expenseCode = expenseCode;
                    }

                    public Double getLineTotal() {
                        return lineTotal;
                    }

                    public void setLineTotal(Double lineTotal) {
                        this.lineTotal = lineTotal;
                    }

                    public Double getLineTotalFC() {
                        return lineTotalFC;
                    }

                    public void setLineTotalFC(Double lineTotalFC) {
                        this.lineTotalFC = lineTotalFC;
                    }

                    public Double getLineTotalSys() {
                        return lineTotalSys;
                    }

                    public void setLineTotalSys(Double lineTotalSys) {
                        this.lineTotalSys = lineTotalSys;
                    }

                    public Double getPaidToDate() {
                        return paidToDate;
                    }

                    public void setPaidToDate(Double paidToDate) {
                        this.paidToDate = paidToDate;
                    }

                    public Double getPaidToDateFC() {
                        return paidToDateFC;
                    }

                    public void setPaidToDateFC(Double paidToDateFC) {
                        this.paidToDateFC = paidToDateFC;
                    }

                    public Double getPaidToDateSys() {
                        return paidToDateSys;
                    }

                    public void setPaidToDateSys(Double paidToDateSys) {
                        this.paidToDateSys = paidToDateSys;
                    }

                    public String getTaxLiable() {
                        return taxLiable;
                    }

                    public void setTaxLiable(String taxLiable) {
                        this.taxLiable = taxLiable;
                    }

                    public String getVatGroup() {
                        return vatGroup;
                    }

                    public void setVatGroup(String vatGroup) {
                        this.vatGroup = vatGroup;
                    }

                    public Double getTaxPercent() {
                        return taxPercent;
                    }

                    public void setTaxPercent(Double taxPercent) {
                        this.taxPercent = taxPercent;
                    }

                    public Double getTaxSum() {
                        return taxSum;
                    }

                    public void setTaxSum(Double taxSum) {
                        this.taxSum = taxSum;
                    }

                    public Double getTaxSumFC() {
                        return taxSumFC;
                    }

                    public void setTaxSumFC(Double taxSumFC) {
                        this.taxSumFC = taxSumFC;
                    }

                    public Double getTaxSumSys() {
                        return taxSumSys;
                    }

                    public void setTaxSumSys(Double taxSumSys) {
                        this.taxSumSys = taxSumSys;
                    }

                    public Double getDeductibleTaxSum() {
                        return deductibleTaxSum;
                    }

                    public void setDeductibleTaxSum(Double deductibleTaxSum) {
                        this.deductibleTaxSum = deductibleTaxSum;
                    }

                    public Double getDeductibleTaxSumFC() {
                        return deductibleTaxSumFC;
                    }

                    public void setDeductibleTaxSumFC(Double deductibleTaxSumFC) {
                        this.deductibleTaxSumFC = deductibleTaxSumFC;
                    }

                    public Double getDeductibleTaxSumSys() {
                        return deductibleTaxSumSys;
                    }

                    public void setDeductibleTaxSumSys(Double deductibleTaxSumSys) {
                        this.deductibleTaxSumSys = deductibleTaxSumSys;
                    }

                    public String getAquisitionTax() {
                        return aquisitionTax;
                    }

                    public void setAquisitionTax(String aquisitionTax) {
                        this.aquisitionTax = aquisitionTax;
                    }

                    public String getTaxCode() {
                        return taxCode;
                    }

                    public void setTaxCode(String taxCode) {
                        this.taxCode = taxCode;
                    }

                    public String getTaxType() {
                        return taxType;
                    }

                    public void setTaxType(String taxType) {
                        this.taxType = taxType;
                    }

                    public Double getTaxPaid() {
                        return taxPaid;
                    }

                    public void setTaxPaid(Double taxPaid) {
                        this.taxPaid = taxPaid;
                    }

                    public Double getTaxPaidFC() {
                        return taxPaidFC;
                    }

                    public void setTaxPaidFC(Double taxPaidFC) {
                        this.taxPaidFC = taxPaidFC;
                    }

                    public Double getTaxPaidSys() {
                        return taxPaidSys;
                    }

                    public void setTaxPaidSys(Double taxPaidSys) {
                        this.taxPaidSys = taxPaidSys;
                    }

                    public Double getEqualizationTaxPercent() {
                        return equalizationTaxPercent;
                    }

                    public void setEqualizationTaxPercent(Double equalizationTaxPercent) {
                        this.equalizationTaxPercent = equalizationTaxPercent;
                    }

                    public Double getEqualizationTaxSum() {
                        return equalizationTaxSum;
                    }

                    public void setEqualizationTaxSum(Double equalizationTaxSum) {
                        this.equalizationTaxSum = equalizationTaxSum;
                    }

                    public Double getEqualizationTaxFC() {
                        return equalizationTaxFC;
                    }

                    public void setEqualizationTaxFC(Double equalizationTaxFC) {
                        this.equalizationTaxFC = equalizationTaxFC;
                    }

                    public Double getEqualizationTaxSys() {
                        return equalizationTaxSys;
                    }

                    public void setEqualizationTaxSys(Double equalizationTaxSys) {
                        this.equalizationTaxSys = equalizationTaxSys;
                    }

                    public Double getTaxTotalSum() {
                        return taxTotalSum;
                    }

                    public void setTaxTotalSum(Double taxTotalSum) {
                        this.taxTotalSum = taxTotalSum;
                    }

                    public Double getTaxTotalSumFC() {
                        return taxTotalSumFC;
                    }

                    public void setTaxTotalSumFC(Double taxTotalSumFC) {
                        this.taxTotalSumFC = taxTotalSumFC;
                    }

                    public Double getTaxTotalSumSys() {
                        return taxTotalSumSys;
                    }

                    public void setTaxTotalSumSys(Double taxTotalSumSys) {
                        this.taxTotalSumSys = taxTotalSumSys;
                    }

                    public String getWtLiable() {
                        return wtLiable;
                    }

                    public void setWtLiable(String wtLiable) {
                        this.wtLiable = wtLiable;
                    }

                    public Long getBaseGroup() {
                        return baseGroup;
                    }

                    public void setBaseGroup(Long baseGroup) {
                        this.baseGroup = baseGroup;
                    }

                    public String getDistributionRule() {
                        return distributionRule;
                    }

                    public void setDistributionRule(String distributionRule) {
                        this.distributionRule = distributionRule;
                    }

                    public String getProject() {
                        return project;
                    }

                    public void setProject(String project) {
                        this.project = project;
                    }

                    public String getDistributionRule2() {
                        return distributionRule2;
                    }

                    public void setDistributionRule2(String distributionRule2) {
                        this.distributionRule2 = distributionRule2;
                    }

                    public String getDistributionRule3() {
                        return distributionRule3;
                    }

                    public void setDistributionRule3(String distributionRule3) {
                        this.distributionRule3 = distributionRule3;
                    }

                    public String getDistributionRule4() {
                        return distributionRule4;
                    }

                    public void setDistributionRule4(String distributionRule4) {
                        this.distributionRule4 = distributionRule4;
                    }

                    public String getDistributionRule5() {
                        return distributionRule5;
                    }

                    public void setDistributionRule5(String distributionRule5) {
                        this.distributionRule5 = distributionRule5;
                    }

                    public LineExpenseTaxJurisdictions getLineExpenseTaxJurisdictions() {
                        return lineExpenseTaxJurisdictions;
                    }

                    public void setLineExpenseTaxJurisdictions(LineExpenseTaxJurisdictions lineExpenseTaxJurisdictions) {
                        this.lineExpenseTaxJurisdictions = lineExpenseTaxJurisdictions;
                    }

                    @JsonIgnoreProperties(ignoreUnknown = true)
                    public static class LineExpenseTaxJurisdictions implements Serializable {
                        @JsonProperty("LineExpenseTaxJurisdiction")
                        protected List<InvoicesRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense.LineExpenseTaxJurisdictions.LineExpenseTaxJurisdiction> lineExpenseTaxJurisdiction;

                        public List<InvoicesRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense.LineExpenseTaxJurisdictions.LineExpenseTaxJurisdiction> getLineExpenseTaxJurisdiction() {
                            if (lineExpenseTaxJurisdiction == null) {
                                lineExpenseTaxJurisdiction = new ArrayList<InvoicesRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense.LineExpenseTaxJurisdictions.LineExpenseTaxJurisdiction>();
                            }
                            return this.lineExpenseTaxJurisdiction;
                        }

                        public void setLineExpenseTaxJurisdiction(List<LineExpenseTaxJurisdiction> lineExpenseTaxJurisdiction) {
                            this.lineExpenseTaxJurisdiction = lineExpenseTaxJurisdiction;
                        }

                        @JsonIgnoreProperties(ignoreUnknown = true)
                        public static class LineExpenseTaxJurisdiction implements Serializable {
                            @JsonProperty("JurisdictionCode")
                            protected String jurisdictionCode;
                            @JsonProperty("JurisdictionType")
                            protected Long jurisdictionType;
                            @JsonProperty("TaxAmount")
                            protected Double taxAmount;
                            @JsonProperty("TaxAmountSC")
                            protected Double taxAmountSC;
                            @JsonProperty("TaxAmountFC")
                            protected Double taxAmountFC;
                            @JsonProperty("TaxRate")
                            protected Double taxRate;
                            @JsonProperty("DocEntry")
                            protected Long docEntry;
                            @JsonProperty("LineNumber")
                            protected Long lineNumber;
                            @JsonProperty("RowSequence")
                            protected Long rowSequence;

                            public String getJurisdictionCode() {
                                return jurisdictionCode;
                            }

                            public void setJurisdictionCode(String jurisdictionCode) {
                                this.jurisdictionCode = jurisdictionCode;
                            }

                            public Long getJurisdictionType() {
                                return jurisdictionType;
                            }

                            public void setJurisdictionType(Long jurisdictionType) {
                                this.jurisdictionType = jurisdictionType;
                            }

                            public Double getTaxAmount() {
                                return taxAmount;
                            }

                            public void setTaxAmount(Double taxAmount) {
                                this.taxAmount = taxAmount;
                            }

                            public Double getTaxAmountSC() {
                                return taxAmountSC;
                            }

                            public void setTaxAmountSC(Double taxAmountSC) {
                                this.taxAmountSC = taxAmountSC;
                            }

                            public Double getTaxAmountFC() {
                                return taxAmountFC;
                            }

                            public void setTaxAmountFC(Double taxAmountFC) {
                                this.taxAmountFC = taxAmountFC;
                            }

                            public Double getTaxRate() {
                                return taxRate;
                            }

                            public void setTaxRate(Double taxRate) {
                                this.taxRate = taxRate;
                            }

                            public Long getDocEntry() {
                                return docEntry;
                            }

                            public void setDocEntry(Long docEntry) {
                                this.docEntry = docEntry;
                            }

                            public Long getLineNumber() {
                                return lineNumber;
                            }

                            public void setLineNumber(Long lineNumber) {
                                this.lineNumber = lineNumber;
                            }

                            public Long getRowSequence() {
                                return rowSequence;
                            }

                            public void setRowSequence(Long rowSequence) {
                                this.rowSequence = rowSequence;
                            }
                        }
                    }
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class DocumentLinesBinAllocations implements Serializable {
                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class DocumentLinesBinAllocation implements Serializable {
                    @JsonProperty("BinAbsEntry")
                    protected Long binAbsEntry;
                    @JsonProperty("Quantity")
                    protected Double quantity;
                    @JsonProperty("AllowNegativeQuantity")
                    protected String allowNegativeQuantity;
                    @JsonProperty("SerialAndBatchNumbersBaseLine")
                    protected Long serialAndBatchNumbersBaseLine;
                    @JsonProperty("BaseLineNumber")
                    protected Long baseLineNumber;

                    public Long getBinAbsEntry() {
                        return binAbsEntry;
                    }

                    public void setBinAbsEntry(Long binAbsEntry) {
                        this.binAbsEntry = binAbsEntry;
                    }

                    public Double getQuantity() {
                        return quantity;
                    }

                    public void setQuantity(Double quantity) {
                        this.quantity = quantity;
                    }

                    public String getAllowNegativeQuantity() {
                        return allowNegativeQuantity;
                    }

                    public void setAllowNegativeQuantity(String allowNegativeQuantity) {
                        this.allowNegativeQuantity = allowNegativeQuantity;
                    }

                    public Long getSerialAndBatchNumbersBaseLine() {
                        return serialAndBatchNumbersBaseLine;
                    }

                    public void setSerialAndBatchNumbersBaseLine(Long serialAndBatchNumbersBaseLine) {
                        this.serialAndBatchNumbersBaseLine = serialAndBatchNumbersBaseLine;
                    }

                    public Long getBaseLineNumber() {
                        return baseLineNumber;
                    }

                    public void setBaseLineNumber(Long baseLineNumber) {
                        this.baseLineNumber = baseLineNumber;
                    }
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class ExportProcesses implements Serializable {
                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class ExportProcess implements Serializable {
                    @JsonProperty("LineNumber")
                    protected Long lineNumber;
                    @JsonProperty("ExportationDocumentTypeCode")
                    protected Long exportationDocumentTypeCode;
                    @JsonProperty("ExportationDeclarationNumber")
                    protected Long exportationDeclarationNumber;
                    @JsonProperty("ExportationDeclarationDate")
                    protected String exportationDeclarationDate;
                    @JsonProperty("ExportationNatureCode")
                    protected Long exportationNatureCode;
                    @JsonProperty("ExportationRegistryNumber")
                    protected Long exportationRegistryNumber;
                    @JsonProperty("ExportationRegistryDate")
                    protected String exportationRegistryDate;
                    @JsonProperty("LadingBillNumber")
                    protected String ladingBillNumber;
                    @JsonProperty("LadingBillDate")
                    protected String ladingBillDate;
                    @JsonProperty("MerchandiseLeftCustomsDate")
                    protected String merchandiseLeftCustomsDate;
                    @JsonProperty("LadingBillTypeCode")
                    protected Long ladingBillTypeCode;

                    public Long getLineNumber() {
                        return lineNumber;
                    }

                    public void setLineNumber(Long lineNumber) {
                        this.lineNumber = lineNumber;
                    }

                    public Long getExportationDocumentTypeCode() {
                        return exportationDocumentTypeCode;
                    }

                    public void setExportationDocumentTypeCode(Long exportationDocumentTypeCode) {
                        this.exportationDocumentTypeCode = exportationDocumentTypeCode;
                    }

                    public Long getExportationDeclarationNumber() {
                        return exportationDeclarationNumber;
                    }

                    public void setExportationDeclarationNumber(Long exportationDeclarationNumber) {
                        this.exportationDeclarationNumber = exportationDeclarationNumber;
                    }

                    public String getExportationDeclarationDate() {
                        return exportationDeclarationDate;
                    }

                    public void setExportationDeclarationDate(String exportationDeclarationDate) {
                        this.exportationDeclarationDate = exportationDeclarationDate;
                    }

                    public Long getExportationNatureCode() {
                        return exportationNatureCode;
                    }

                    public void setExportationNatureCode(Long exportationNatureCode) {
                        this.exportationNatureCode = exportationNatureCode;
                    }

                    public Long getExportationRegistryNumber() {
                        return exportationRegistryNumber;
                    }

                    public void setExportationRegistryNumber(Long exportationRegistryNumber) {
                        this.exportationRegistryNumber = exportationRegistryNumber;
                    }

                    public String getExportationRegistryDate() {
                        return exportationRegistryDate;
                    }

                    public void setExportationRegistryDate(String exportationRegistryDate) {
                        this.exportationRegistryDate = exportationRegistryDate;
                    }

                    public String getLadingBillNumber() {
                        return ladingBillNumber;
                    }

                    public void setLadingBillNumber(String ladingBillNumber) {
                        this.ladingBillNumber = ladingBillNumber;
                    }

                    public String getLadingBillDate() {
                        return ladingBillDate;
                    }

                    public void setLadingBillDate(String ladingBillDate) {
                        this.ladingBillDate = ladingBillDate;
                    }

                    public String getMerchandiseLeftCustomsDate() {
                        return merchandiseLeftCustomsDate;
                    }

                    public void setMerchandiseLeftCustomsDate(String merchandiseLeftCustomsDate) {
                        this.merchandiseLeftCustomsDate = merchandiseLeftCustomsDate;
                    }

                    public Long getLadingBillTypeCode() {
                        return ladingBillTypeCode;
                    }

                    public void setLadingBillTypeCode(Long ladingBillTypeCode) {
                        this.ladingBillTypeCode = ladingBillTypeCode;
                    }
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class LineTaxJurisdictions implements Serializable {
                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class LineTaxJurisdiction implements Serializable {
                    @JsonProperty("JurisdictionCode")
                    protected String jurisdictionCode;
                    @JsonProperty("JurisdictionType")
                    protected Long jurisdictionType;
                    @JsonProperty("TaxAmount")
                    protected Double taxAmount;
                    @JsonProperty("TaxAmountSC")
                    protected Double taxAmountSC;
                    @JsonProperty("TaxAmountFC")
                    protected Double taxAmountFC;
                    @JsonProperty("TaxRate")
                    protected Double taxRate;
                    @JsonProperty("DocEntry")
                    protected Long docEntry;
                    @JsonProperty("LineNumber")
                    protected Long lineNumber;
                    @JsonProperty("RowSequence")
                    protected Long rowSequence;

                    public String getJurisdictionCode() {
                        return jurisdictionCode;
                    }

                    public void setJurisdictionCode(String jurisdictionCode) {
                        this.jurisdictionCode = jurisdictionCode;
                    }

                    public Long getJurisdictionType() {
                        return jurisdictionType;
                    }

                    public void setJurisdictionType(Long jurisdictionType) {
                        this.jurisdictionType = jurisdictionType;
                    }

                    public Double getTaxAmount() {
                        return taxAmount;
                    }

                    public void setTaxAmount(Double taxAmount) {
                        this.taxAmount = taxAmount;
                    }

                    public Double getTaxAmountSC() {
                        return taxAmountSC;
                    }

                    public void setTaxAmountSC(Double taxAmountSC) {
                        this.taxAmountSC = taxAmountSC;
                    }

                    public Double getTaxAmountFC() {
                        return taxAmountFC;
                    }

                    public void setTaxAmountFC(Double taxAmountFC) {
                        this.taxAmountFC = taxAmountFC;
                    }

                    public Double getTaxRate() {
                        return taxRate;
                    }

                    public void setTaxRate(Double taxRate) {
                        this.taxRate = taxRate;
                    }

                    public Long getDocEntry() {
                        return docEntry;
                    }

                    public void setDocEntry(Long docEntry) {
                        this.docEntry = docEntry;
                    }

                    public Long getLineNumber() {
                        return lineNumber;
                    }

                    public void setLineNumber(Long lineNumber) {
                        this.lineNumber = lineNumber;
                    }

                    public Long getRowSequence() {
                        return rowSequence;
                    }

                    public void setRowSequence(Long rowSequence) {
                        this.rowSequence = rowSequence;
                    }
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class SerialNumbers implements Serializable {
                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class SerialNumber implements Serializable {
                    @JsonProperty("ManufacturerSerialNumber")
                    protected String manufacturerSerialNumber;
                    @JsonProperty("InternalSerialNumber")
                    protected String internalSerialNumber;
                    @JsonProperty("ExpiryDate")
                    protected String expiryDate;
                    @JsonProperty("ManufactureDate")
                    protected String manufactureDate;
                    @JsonProperty("ReceptionDate")
                    protected String receptionDate;
                    @JsonProperty("WarrantyStart")
                    protected String warrantyStart;
                    @JsonProperty("WarrantyEnd")
                    protected String warrantyEnd;
                    @JsonProperty("Location")
                    protected String location;
                    @JsonProperty("Notes")
                    protected String notes;
                    @JsonProperty("BatchID")
                    protected String batchID;
                    @JsonProperty("SystemSerialNumber")
                    protected Long systemSerialNumber;
                    @JsonProperty("BaseLineNumber")
                    protected Long baseLineNumber;
                    @JsonProperty("Quantity")
                    protected Double quantity;

                    public String getManufacturerSerialNumber() {
                        return manufacturerSerialNumber;
                    }

                    public void setManufacturerSerialNumber(String manufacturerSerialNumber) {
                        this.manufacturerSerialNumber = manufacturerSerialNumber;
                    }

                    public String getInternalSerialNumber() {
                        return internalSerialNumber;
                    }

                    public void setInternalSerialNumber(String internalSerialNumber) {
                        this.internalSerialNumber = internalSerialNumber;
                    }

                    public String getExpiryDate() {
                        return expiryDate;
                    }

                    public void setExpiryDate(String expiryDate) {
                        this.expiryDate = expiryDate;
                    }

                    public String getManufactureDate() {
                        return manufactureDate;
                    }

                    public void setManufactureDate(String manufactureDate) {
                        this.manufactureDate = manufactureDate;
                    }

                    public String getReceptionDate() {
                        return receptionDate;
                    }

                    public void setReceptionDate(String receptionDate) {
                        this.receptionDate = receptionDate;
                    }

                    public String getWarrantyStart() {
                        return warrantyStart;
                    }

                    public void setWarrantyStart(String warrantyStart) {
                        this.warrantyStart = warrantyStart;
                    }

                    public String getWarrantyEnd() {
                        return warrantyEnd;
                    }

                    public void setWarrantyEnd(String warrantyEnd) {
                        this.warrantyEnd = warrantyEnd;
                    }

                    public String getLocation() {
                        return location;
                    }

                    public void setLocation(String location) {
                        this.location = location;
                    }

                    public String getNotes() {
                        return notes;
                    }

                    public void setNotes(String notes) {
                        this.notes = notes;
                    }

                    public String getBatchID() {
                        return batchID;
                    }

                    public void setBatchID(String batchID) {
                        this.batchID = batchID;
                    }

                    public Long getSystemSerialNumber() {
                        return systemSerialNumber;
                    }

                    public void setSystemSerialNumber(Long systemSerialNumber) {
                        this.systemSerialNumber = systemSerialNumber;
                    }

                    public Long getBaseLineNumber() {
                        return baseLineNumber;
                    }

                    public void setBaseLineNumber(Long baseLineNumber) {
                        this.baseLineNumber = baseLineNumber;
                    }

                    public Double getQuantity() {
                        return quantity;
                    }

                    public void setQuantity(Double quantity) {
                        this.quantity = quantity;
                    }
                }

            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class WithholdingTaxLines implements Serializable {
                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class WithholdingTaxLine implements Serializable {
                    @JsonProperty("WTCode")
                    protected String wtCode;
                    @JsonProperty("WTAmountSys")
                    protected Double wtAmountSys;
                    @JsonProperty("WTAmountFC")
                    protected Double wtAmountFC;
                    @JsonProperty("WTAmount")
                    protected Double wtAmount;
                    @JsonProperty("WithholdingType")
                    protected String withholdingType;
                    @JsonProperty("TaxableAmountinSys")
                    protected Double taxableAmountinSys;
                    @JsonProperty("TaxableAmountFC")
                    protected Double taxableAmountFC;
                    @JsonProperty("TaxableAmount")
                    protected Double taxableAmount;
                    @JsonProperty("RoundingType")
                    protected String roundingType;
                    @JsonProperty("Rate")
                    protected Double rate;
                    @JsonProperty("Criteria")
                    protected String criteria;
                    @JsonProperty("Category")
                    protected String category;
                    @JsonProperty("BaseType")
                    protected String baseType;
                    @JsonProperty("AppliedWTAmountSys")
                    protected Double appliedWTAmountSys;
                    @JsonProperty("AppliedWTAmountFC")
                    protected Double appliedWTAmountFC;
                    @JsonProperty("AppliedWTAmount")
                    protected Double appliedWTAmount;
                    @JsonProperty("GLAccount")
                    protected String glAccount;
                    @JsonProperty("LineNum")
                    protected Long lineNum;
                    @JsonProperty("BaseDocEntry")
                    protected Long baseDocEntry;
                    @JsonProperty("BaseDocLine")
                    protected Long baseDocLine;
                    @JsonProperty("BaseDocType")
                    protected Long baseDocType;
                    @JsonProperty("BaseDocumentReference")
                    protected Long baseDocumentReference;
                    @JsonProperty("Status")
                    protected String status;
                    @JsonProperty("TargetAbsEntry")
                    protected Long targetAbsEntry;
                    @JsonProperty("TargetDocumentType")
                    protected Long targetDocumentType;
                    @JsonProperty("CSTCodeIncoming")
                    protected String cstCodeIncoming;
                    @JsonProperty("CSTCodeOutgoing")
                    protected String cstCodeOutgoing;

                    public String getWtCode() {
                        return wtCode;
                    }

                    public void setWtCode(String wtCode) {
                        this.wtCode = wtCode;
                    }

                    public Double getWtAmountSys() {
                        return wtAmountSys;
                    }

                    public void setWtAmountSys(Double wtAmountSys) {
                        this.wtAmountSys = wtAmountSys;
                    }

                    public Double getWtAmountFC() {
                        return wtAmountFC;
                    }

                    public void setWtAmountFC(Double wtAmountFC) {
                        this.wtAmountFC = wtAmountFC;
                    }

                    public Double getWtAmount() {
                        return wtAmount;
                    }

                    public void setWtAmount(Double wtAmount) {
                        this.wtAmount = wtAmount;
                    }

                    public String getWithholdingType() {
                        return withholdingType;
                    }

                    public void setWithholdingType(String withholdingType) {
                        this.withholdingType = withholdingType;
                    }

                    public Double getTaxableAmountinSys() {
                        return taxableAmountinSys;
                    }

                    public void setTaxableAmountinSys(Double taxableAmountinSys) {
                        this.taxableAmountinSys = taxableAmountinSys;
                    }

                    public Double getTaxableAmountFC() {
                        return taxableAmountFC;
                    }

                    public void setTaxableAmountFC(Double taxableAmountFC) {
                        this.taxableAmountFC = taxableAmountFC;
                    }

                    public Double getTaxableAmount() {
                        return taxableAmount;
                    }

                    public void setTaxableAmount(Double taxableAmount) {
                        this.taxableAmount = taxableAmount;
                    }

                    public String getRoundingType() {
                        return roundingType;
                    }

                    public void setRoundingType(String roundingType) {
                        this.roundingType = roundingType;
                    }

                    public Double getRate() {
                        return rate;
                    }

                    public void setRate(Double rate) {
                        this.rate = rate;
                    }

                    public String getCriteria() {
                        return criteria;
                    }

                    public void setCriteria(String criteria) {
                        this.criteria = criteria;
                    }

                    public String getCategory() {
                        return category;
                    }

                    public void setCategory(String category) {
                        this.category = category;
                    }

                    public String getBaseType() {
                        return baseType;
                    }

                    public void setBaseType(String baseType) {
                        this.baseType = baseType;
                    }

                    public Double getAppliedWTAmountSys() {
                        return appliedWTAmountSys;
                    }

                    public void setAppliedWTAmountSys(Double appliedWTAmountSys) {
                        this.appliedWTAmountSys = appliedWTAmountSys;
                    }

                    public Double getAppliedWTAmountFC() {
                        return appliedWTAmountFC;
                    }

                    public void setAppliedWTAmountFC(Double appliedWTAmountFC) {
                        this.appliedWTAmountFC = appliedWTAmountFC;
                    }

                    public Double getAppliedWTAmount() {
                        return appliedWTAmount;
                    }

                    public void setAppliedWTAmount(Double appliedWTAmount) {
                        this.appliedWTAmount = appliedWTAmount;
                    }

                    public String getGlAccount() {
                        return glAccount;
                    }

                    public void setGlAccount(String glAccount) {
                        this.glAccount = glAccount;
                    }

                    public Long getLineNum() {
                        return lineNum;
                    }

                    public void setLineNum(Long lineNum) {
                        this.lineNum = lineNum;
                    }

                    public Long getBaseDocEntry() {
                        return baseDocEntry;
                    }

                    public void setBaseDocEntry(Long baseDocEntry) {
                        this.baseDocEntry = baseDocEntry;
                    }

                    public Long getBaseDocLine() {
                        return baseDocLine;
                    }

                    public void setBaseDocLine(Long baseDocLine) {
                        this.baseDocLine = baseDocLine;
                    }

                    public Long getBaseDocType() {
                        return baseDocType;
                    }

                    public void setBaseDocType(Long baseDocType) {
                        this.baseDocType = baseDocType;
                    }

                    public Long getBaseDocumentReference() {
                        return baseDocumentReference;
                    }

                    public void setBaseDocumentReference(Long baseDocumentReference) {
                        this.baseDocumentReference = baseDocumentReference;
                    }

                    public String getStatus() {
                        return status;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public Long getTargetAbsEntry() {
                        return targetAbsEntry;
                    }

                    public void setTargetAbsEntry(Long targetAbsEntry) {
                        this.targetAbsEntry = targetAbsEntry;
                    }

                    public Long getTargetDocumentType() {
                        return targetDocumentType;
                    }

                    public void setTargetDocumentType(Long targetDocumentType) {
                        this.targetDocumentType = targetDocumentType;
                    }

                    public String getCstCodeIncoming() {
                        return cstCodeIncoming;
                    }

                    public void setCstCodeIncoming(String cstCodeIncoming) {
                        this.cstCodeIncoming = cstCodeIncoming;
                    }

                    public String getCstCodeOutgoing() {
                        return cstCodeOutgoing;
                    }

                    public void setCstCodeOutgoing(String cstCodeOutgoing) {
                        this.cstCodeOutgoing = cstCodeOutgoing;
                    }
                }
            }
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DocumentAdditionalExpenses implements Serializable {
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class DocumentAdditionalExpense implements Serializable {
            @JsonProperty("ExpenseCode")
            protected Long expenseCode;
            @JsonProperty("LineTotal")
            protected BigDecimal lineTotal;
            @JsonProperty("LineTotalFC")
            protected Double lineTotalFC;
            @JsonProperty("LineTotalSys")
            protected Double lineTotalSys;
            @JsonProperty("PaidToDate")
            protected Double paidToDate;
            @JsonProperty("PaidToDateFC")
            protected Double paidToDateFC;
            @JsonProperty("PaidToDateSys")
            protected Double paidToDateSys;
            @JsonProperty("Remarks")
            protected String remarks;
            @JsonProperty("DistributionMethod")
            protected String distributionMethod;
            @JsonProperty("TaxLiable")
            protected String taxLiable;
            @JsonProperty("VatGroup")
            protected String vatGroup;
            @JsonProperty("TaxPercent")
            protected Double taxPercent;
            @JsonProperty("TaxSum")
            protected Double taxSum;
            @JsonProperty("TaxSumFC")
            protected Double taxSumFC;
            @JsonProperty("TaxSumSys")
            protected Double taxSumSys;
            @JsonProperty("DeductibleTaxSum")
            protected Double deductibleTaxSum;
            @JsonProperty("DeductibleTaxSumFC")
            protected Double deductibleTaxSumFC;
            @JsonProperty("DeductibleTaxSumSys")
            protected Double deductibleTaxSumSys;
            @JsonProperty("AquisitionTax")
            protected String aquisitionTax;
            @JsonProperty("TaxCode")
            protected String taxCode;
            @JsonProperty("TaxType")
            protected String taxType;
            @JsonProperty("TaxPaid")
            protected Double taxPaid;
            @JsonProperty("TaxPaidFC")
            protected Double taxPaidFC;
            @JsonProperty("TaxPaidSys")
            protected Double taxPaidSys;
            @JsonProperty("EqualizationTaxPercent")
            protected Double equalizationTaxPercent;
            @JsonProperty("EqualizationTaxSum")
            protected Double equalizationTaxSum;
            @JsonProperty("EqualizationTaxFC")
            protected Double equalizationTaxFC;
            @JsonProperty("EqualizationTaxSys")
            protected Double equalizationTaxSys;
            @JsonProperty("TaxTotalSum")
            protected Double taxTotalSum;
            @JsonProperty("TaxTotalSumFC")
            protected Double taxTotalSumFC;
            @JsonProperty("TaxTotalSumSys")
            protected Double taxTotalSumSys;
            @JsonProperty("BaseDocEntry")
            protected Long baseDocEntry;
            @JsonProperty("BaseDocLine")
            protected Long baseDocLine;
            @JsonProperty("BaseDocType")
            protected Long baseDocType;
            @JsonProperty("BaseDocumentReference")
            protected Long baseDocumentReference;
            @JsonProperty("LineNum")
            protected Long lineNum;
            @JsonProperty("LastPurchasePrice")
            protected String lastPurchasePrice;
            @JsonProperty("Status")
            protected String status;
            @JsonProperty("Stock")
            protected String stock;
            @JsonProperty("TargetAbsEntry")
            protected Long targetAbsEntry;
            @JsonProperty("TargetType")
            protected Long targetType;
            @JsonProperty("WTLiable")
            protected String wtLiable;
            @JsonProperty("DistributionRule")
            protected String distributionRule;
            @JsonProperty("Project")
            protected String project;
            @JsonProperty("DistributionRule2")
            protected String distributionRule2;
            @JsonProperty("DistributionRule3")
            protected String distributionRule3;
            @JsonProperty("DistributionRule4")
            protected String distributionRule4;
            @JsonProperty("DistributionRule5")
            protected String distributionRule5;
            @JsonProperty("DocExpenseTaxJurisdictions")
            protected InvoicesRestDTO.DocumentAdditionalExpenses.DocumentAdditionalExpense.DocExpenseTaxJurisdictions docExpenseTaxJurisdictions;

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

            public Double getLineTotalFC() {
                return lineTotalFC;
            }

            public void setLineTotalFC(Double lineTotalFC) {
                this.lineTotalFC = lineTotalFC;
            }

            public Double getLineTotalSys() {
                return lineTotalSys;
            }

            public void setLineTotalSys(Double lineTotalSys) {
                this.lineTotalSys = lineTotalSys;
            }

            public Double getPaidToDate() {
                return paidToDate;
            }

            public void setPaidToDate(Double paidToDate) {
                this.paidToDate = paidToDate;
            }

            public Double getPaidToDateFC() {
                return paidToDateFC;
            }

            public void setPaidToDateFC(Double paidToDateFC) {
                this.paidToDateFC = paidToDateFC;
            }

            public Double getPaidToDateSys() {
                return paidToDateSys;
            }

            public void setPaidToDateSys(Double paidToDateSys) {
                this.paidToDateSys = paidToDateSys;
            }

            public String getRemarks() {
                return remarks;
            }

            public void setRemarks(String remarks) {
                this.remarks = remarks;
            }

            public String getDistributionMethod() {
                return distributionMethod;
            }

            public void setDistributionMethod(String distributionMethod) {
                this.distributionMethod = distributionMethod;
            }

            public String getTaxLiable() {
                return taxLiable;
            }

            public void setTaxLiable(String taxLiable) {
                this.taxLiable = taxLiable;
            }

            public String getVatGroup() {
                return vatGroup;
            }

            public void setVatGroup(String vatGroup) {
                this.vatGroup = vatGroup;
            }

            public Double getTaxPercent() {
                return taxPercent;
            }

            public void setTaxPercent(Double taxPercent) {
                this.taxPercent = taxPercent;
            }

            public Double getTaxSum() {
                return taxSum;
            }

            public void setTaxSum(Double taxSum) {
                this.taxSum = taxSum;
            }

            public Double getTaxSumFC() {
                return taxSumFC;
            }

            public void setTaxSumFC(Double taxSumFC) {
                this.taxSumFC = taxSumFC;
            }

            public Double getTaxSumSys() {
                return taxSumSys;
            }

            public void setTaxSumSys(Double taxSumSys) {
                this.taxSumSys = taxSumSys;
            }

            public Double getDeductibleTaxSum() {
                return deductibleTaxSum;
            }

            public void setDeductibleTaxSum(Double deductibleTaxSum) {
                this.deductibleTaxSum = deductibleTaxSum;
            }

            public Double getDeductibleTaxSumFC() {
                return deductibleTaxSumFC;
            }

            public void setDeductibleTaxSumFC(Double deductibleTaxSumFC) {
                this.deductibleTaxSumFC = deductibleTaxSumFC;
            }

            public Double getDeductibleTaxSumSys() {
                return deductibleTaxSumSys;
            }

            public void setDeductibleTaxSumSys(Double deductibleTaxSumSys) {
                this.deductibleTaxSumSys = deductibleTaxSumSys;
            }

            public String getAquisitionTax() {
                return aquisitionTax;
            }

            public void setAquisitionTax(String aquisitionTax) {
                this.aquisitionTax = aquisitionTax;
            }

            public String getTaxCode() {
                return taxCode;
            }

            public void setTaxCode(String taxCode) {
                this.taxCode = taxCode;
            }

            public String getTaxType() {
                return taxType;
            }

            public void setTaxType(String taxType) {
                this.taxType = taxType;
            }

            public Double getTaxPaid() {
                return taxPaid;
            }

            public void setTaxPaid(Double taxPaid) {
                this.taxPaid = taxPaid;
            }

            public Double getTaxPaidFC() {
                return taxPaidFC;
            }

            public void setTaxPaidFC(Double taxPaidFC) {
                this.taxPaidFC = taxPaidFC;
            }

            public Double getTaxPaidSys() {
                return taxPaidSys;
            }

            public void setTaxPaidSys(Double taxPaidSys) {
                this.taxPaidSys = taxPaidSys;
            }

            public Double getEqualizationTaxPercent() {
                return equalizationTaxPercent;
            }

            public void setEqualizationTaxPercent(Double equalizationTaxPercent) {
                this.equalizationTaxPercent = equalizationTaxPercent;
            }

            public Double getEqualizationTaxSum() {
                return equalizationTaxSum;
            }

            public void setEqualizationTaxSum(Double equalizationTaxSum) {
                this.equalizationTaxSum = equalizationTaxSum;
            }

            public Double getEqualizationTaxFC() {
                return equalizationTaxFC;
            }

            public void setEqualizationTaxFC(Double equalizationTaxFC) {
                this.equalizationTaxFC = equalizationTaxFC;
            }

            public Double getEqualizationTaxSys() {
                return equalizationTaxSys;
            }

            public void setEqualizationTaxSys(Double equalizationTaxSys) {
                this.equalizationTaxSys = equalizationTaxSys;
            }

            public Double getTaxTotalSum() {
                return taxTotalSum;
            }

            public void setTaxTotalSum(Double taxTotalSum) {
                this.taxTotalSum = taxTotalSum;
            }

            public Double getTaxTotalSumFC() {
                return taxTotalSumFC;
            }

            public void setTaxTotalSumFC(Double taxTotalSumFC) {
                this.taxTotalSumFC = taxTotalSumFC;
            }

            public Double getTaxTotalSumSys() {
                return taxTotalSumSys;
            }

            public void setTaxTotalSumSys(Double taxTotalSumSys) {
                this.taxTotalSumSys = taxTotalSumSys;
            }

            public Long getBaseDocEntry() {
                return baseDocEntry;
            }

            public void setBaseDocEntry(Long baseDocEntry) {
                this.baseDocEntry = baseDocEntry;
            }

            public Long getBaseDocLine() {
                return baseDocLine;
            }

            public void setBaseDocLine(Long baseDocLine) {
                this.baseDocLine = baseDocLine;
            }

            public Long getBaseDocType() {
                return baseDocType;
            }

            public void setBaseDocType(Long baseDocType) {
                this.baseDocType = baseDocType;
            }

            public Long getBaseDocumentReference() {
                return baseDocumentReference;
            }

            public void setBaseDocumentReference(Long baseDocumentReference) {
                this.baseDocumentReference = baseDocumentReference;
            }

            public Long getLineNum() {
                return lineNum;
            }

            public void setLineNum(Long lineNum) {
                this.lineNum = lineNum;
            }

            public String getLastPurchasePrice() {
                return lastPurchasePrice;
            }

            public void setLastPurchasePrice(String lastPurchasePrice) {
                this.lastPurchasePrice = lastPurchasePrice;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getStock() {
                return stock;
            }

            public void setStock(String stock) {
                this.stock = stock;
            }

            public Long getTargetAbsEntry() {
                return targetAbsEntry;
            }

            public void setTargetAbsEntry(Long targetAbsEntry) {
                this.targetAbsEntry = targetAbsEntry;
            }

            public Long getTargetType() {
                return targetType;
            }

            public void setTargetType(Long targetType) {
                this.targetType = targetType;
            }

            public String getWtLiable() {
                return wtLiable;
            }

            public void setWtLiable(String wtLiable) {
                this.wtLiable = wtLiable;
            }

            public String getDistributionRule() {
                return distributionRule;
            }

            public void setDistributionRule(String distributionRule) {
                this.distributionRule = distributionRule;
            }

            public String getProject() {
                return project;
            }

            public void setProject(String project) {
                this.project = project;
            }

            public String getDistributionRule2() {
                return distributionRule2;
            }

            public void setDistributionRule2(String distributionRule2) {
                this.distributionRule2 = distributionRule2;
            }

            public String getDistributionRule3() {
                return distributionRule3;
            }

            public void setDistributionRule3(String distributionRule3) {
                this.distributionRule3 = distributionRule3;
            }

            public String getDistributionRule4() {
                return distributionRule4;
            }

            public void setDistributionRule4(String distributionRule4) {
                this.distributionRule4 = distributionRule4;
            }

            public String getDistributionRule5() {
                return distributionRule5;
            }

            public void setDistributionRule5(String distributionRule5) {
                this.distributionRule5 = distributionRule5;
            }

            public DocExpenseTaxJurisdictions getDocExpenseTaxJurisdictions() {
                return docExpenseTaxJurisdictions;
            }

            public void setDocExpenseTaxJurisdictions(DocExpenseTaxJurisdictions docExpenseTaxJurisdictions) {
                this.docExpenseTaxJurisdictions = docExpenseTaxJurisdictions;
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class DocExpenseTaxJurisdictions implements Serializable {
                @JsonProperty("DocExpenseTaxJurisdiction")
                protected List<InvoicesRestDTO.DocumentAdditionalExpenses.DocumentAdditionalExpense.DocExpenseTaxJurisdictions.DocExpenseTaxJurisdiction> docExpenseTaxJurisdiction;

                public List<InvoicesRestDTO.DocumentAdditionalExpenses.DocumentAdditionalExpense.DocExpenseTaxJurisdictions.DocExpenseTaxJurisdiction> getDocExpenseTaxJurisdiction() {
                    if (docExpenseTaxJurisdiction == null) {
                        docExpenseTaxJurisdiction = new ArrayList<InvoicesRestDTO.DocumentAdditionalExpenses.DocumentAdditionalExpense.DocExpenseTaxJurisdictions.DocExpenseTaxJurisdiction>();
                    }
                    return this.docExpenseTaxJurisdiction;
                }

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class DocExpenseTaxJurisdiction implements Serializable {
                    @JsonProperty("JurisdictionCode")
                    protected String jurisdictionCode;
                    @JsonProperty("JurisdictionType")
                    protected Long jurisdictionType;
                    @JsonProperty("TaxAmount")
                    protected Double taxAmount;
                    @JsonProperty("TaxAmountSC")
                    protected Double taxAmountSC;
                    @JsonProperty("TaxAmountFC")
                    protected Double taxAmountFC;
                    @JsonProperty("TaxRate")
                    protected Double taxRate;
                    @JsonProperty("DocEntry")
                    protected Long docEntry;
                    @JsonProperty("LineNumber")
                    protected Long lineNumber;
                    @JsonProperty("RowSequence")
                    protected Long rowSequence;

                    public String getJurisdictionCode() {
                        return jurisdictionCode;
                    }

                    public void setJurisdictionCode(String jurisdictionCode) {
                        this.jurisdictionCode = jurisdictionCode;
                    }

                    public Long getJurisdictionType() {
                        return jurisdictionType;
                    }

                    public void setJurisdictionType(Long jurisdictionType) {
                        this.jurisdictionType = jurisdictionType;
                    }

                    public Double getTaxAmount() {
                        return taxAmount;
                    }

                    public void setTaxAmount(Double taxAmount) {
                        this.taxAmount = taxAmount;
                    }

                    public Double getTaxAmountSC() {
                        return taxAmountSC;
                    }

                    public void setTaxAmountSC(Double taxAmountSC) {
                        this.taxAmountSC = taxAmountSC;
                    }

                    public Double getTaxAmountFC() {
                        return taxAmountFC;
                    }

                    public void setTaxAmountFC(Double taxAmountFC) {
                        this.taxAmountFC = taxAmountFC;
                    }

                    public Double getTaxRate() {
                        return taxRate;
                    }

                    public void setTaxRate(Double taxRate) {
                        this.taxRate = taxRate;
                    }

                    public Long getDocEntry() {
                        return docEntry;
                    }

                    public void setDocEntry(Long docEntry) {
                        this.docEntry = docEntry;
                    }

                    public Long getLineNumber() {
                        return lineNumber;
                    }

                    public void setLineNumber(Long lineNumber) {
                        this.lineNumber = lineNumber;
                    }

                    public Long getRowSequence() {
                        return rowSequence;
                    }

                    public void setRowSequence(Long rowSequence) {
                        this.rowSequence = rowSequence;
                    }
                }
            }
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class WithholdingTaxDataCollection implements Serializable {
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class WithholdingTaxData implements Serializable {
            @JsonProperty("WTCode")
            protected String wtCode;
            @JsonProperty("WTAmountSys")
            protected Double wtAmountSys;
            @JsonProperty("WTAmountFC")
            protected Double wtAmountFC;
            @JsonProperty("WTAmount")
            protected BigDecimal wtAmount;
            @JsonProperty("WithholdingType")
            protected String withholdingType;
            @JsonProperty("TaxableAmountinSys")
            protected Double taxableAmountinSys;
            @JsonProperty("TaxableAmountFC")
            protected Double taxableAmountFC;
            @JsonProperty("TaxableAmount")
            protected BigDecimal taxableAmount;
            @JsonProperty("RoundingType")
            protected String roundingType;
            @JsonProperty("Rate")
            protected Double rate;
            @JsonProperty("Criteria")
            protected String criteria;
            @JsonProperty("Category")
            protected String category;
            @JsonProperty("BaseType")
            protected String baseType;
            @JsonProperty("AppliedWTAmountSys")
            protected Double appliedWTAmountSys;
            @JsonProperty("AppliedWTAmountFC")
            protected Double appliedWTAmountFC;
            @JsonProperty("AppliedWTAmount")
            protected Double appliedWTAmount;
            @JsonProperty("GLAccount")
            protected String glAccount;
            @JsonProperty("LineNum")
            protected Long lineNum;
            @JsonProperty("BaseDocEntry")
            protected Long baseDocEntry;
            @JsonProperty("BaseDocLine")
            protected Long baseDocLine;
            @JsonProperty("BaseDocType")
            protected Long baseDocType;
            @JsonProperty("BaseDocumentReference")
            protected Long baseDocumentReference;
            @JsonProperty("Status")
            protected String status;
            @JsonProperty("TargetAbsEntry")
            protected Long targetAbsEntry;
            @JsonProperty("TargetDocumentType")
            protected Long targetDocumentType;
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

            public Double getWtAmountSys() {
                return wtAmountSys;
            }

            public void setWtAmountSys(Double wtAmountSys) {
                this.wtAmountSys = wtAmountSys;
            }

            public Double getWtAmountFC() {
                return wtAmountFC;
            }

            public void setWtAmountFC(Double wtAmountFC) {
                this.wtAmountFC = wtAmountFC;
            }

            public BigDecimal getWtAmount() {
                return wtAmount;
            }

            public void setWtAmount(BigDecimal wtAmount) {
                this.wtAmount = wtAmount;
            }

            public String getWithholdingType() {
                return withholdingType;
            }

            public void setWithholdingType(String withholdingType) {
                this.withholdingType = withholdingType;
            }

            public Double getTaxableAmountinSys() {
                return taxableAmountinSys;
            }

            public void setTaxableAmountinSys(Double taxableAmountinSys) {
                this.taxableAmountinSys = taxableAmountinSys;
            }

            public Double getTaxableAmountFC() {
                return taxableAmountFC;
            }

            public void setTaxableAmountFC(Double taxableAmountFC) {
                this.taxableAmountFC = taxableAmountFC;
            }

            public BigDecimal getTaxableAmount() {
                return taxableAmount;
            }

            public void setTaxableAmount(BigDecimal taxableAmount) {
                this.taxableAmount = taxableAmount;
            }

            public String getRoundingType() {
                return roundingType;
            }

            public void setRoundingType(String roundingType) {
                this.roundingType = roundingType;
            }

            public Double getRate() {
                return rate;
            }

            public void setRate(Double rate) {
                this.rate = rate;
            }

            public String getCriteria() {
                return criteria;
            }

            public void setCriteria(String criteria) {
                this.criteria = criteria;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getBaseType() {
                return baseType;
            }

            public void setBaseType(String baseType) {
                this.baseType = baseType;
            }

            public Double getAppliedWTAmountSys() {
                return appliedWTAmountSys;
            }

            public void setAppliedWTAmountSys(Double appliedWTAmountSys) {
                this.appliedWTAmountSys = appliedWTAmountSys;
            }

            public Double getAppliedWTAmountFC() {
                return appliedWTAmountFC;
            }

            public void setAppliedWTAmountFC(Double appliedWTAmountFC) {
                this.appliedWTAmountFC = appliedWTAmountFC;
            }

            public Double getAppliedWTAmount() {
                return appliedWTAmount;
            }

            public void setAppliedWTAmount(Double appliedWTAmount) {
                this.appliedWTAmount = appliedWTAmount;
            }

            public String getGlAccount() {
                return glAccount;
            }

            public void setGlAccount(String glAccount) {
                this.glAccount = glAccount;
            }

            public Long getLineNum() {
                return lineNum;
            }

            public void setLineNum(Long lineNum) {
                this.lineNum = lineNum;
            }

            public Long getBaseDocEntry() {
                return baseDocEntry;
            }

            public void setBaseDocEntry(Long baseDocEntry) {
                this.baseDocEntry = baseDocEntry;
            }

            public Long getBaseDocLine() {
                return baseDocLine;
            }

            public void setBaseDocLine(Long baseDocLine) {
                this.baseDocLine = baseDocLine;
            }

            public Long getBaseDocType() {
                return baseDocType;
            }

            public void setBaseDocType(Long baseDocType) {
                this.baseDocType = baseDocType;
            }

            public Long getBaseDocumentReference() {
                return baseDocumentReference;
            }

            public void setBaseDocumentReference(Long baseDocumentReference) {
                this.baseDocumentReference = baseDocumentReference;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public Long getTargetAbsEntry() {
                return targetAbsEntry;
            }

            public void setTargetAbsEntry(Long targetAbsEntry) {
                this.targetAbsEntry = targetAbsEntry;
            }

            public Long getTargetDocumentType() {
                return targetDocumentType;
            }

            public void setTargetDocumentType(Long targetDocumentType) {
                this.targetDocumentType = targetDocumentType;
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DocumentPackages implements Serializable {
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class DocumentPackage implements Serializable {
            @JsonProperty("Number")
            protected Long number;
            @JsonProperty("Type")
            protected String type;
            @JsonProperty("TotalWeight")
            protected Double totalWeight;
            @JsonProperty("Units")
            protected Long units;
            @JsonProperty("DocumentPackageItems")
            protected InvoicesRestDTO.DocumentPackages.DocumentPackage.DocumentPackageItems documentPackageItems;

            public Long getNumber() {
                return number;
            }

            public void setNumber(Long number) {
                this.number = number;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public Double getTotalWeight() {
                return totalWeight;
            }

            public void setTotalWeight(Double totalWeight) {
                this.totalWeight = totalWeight;
            }

            public Long getUnits() {
                return units;
            }

            public void setUnits(Long units) {
                this.units = units;
            }

            public DocumentPackageItems getDocumentPackageItems() {
                return documentPackageItems;
            }

            public void setDocumentPackageItems(DocumentPackageItems documentPackageItems) {
                this.documentPackageItems = documentPackageItems;
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class DocumentPackageItems implements Serializable {
                @JsonProperty("DocumentPackageItem")
                protected List<InvoicesRestDTO.DocumentPackages.DocumentPackage.DocumentPackageItems.DocumentPackageItem> documentPackageItem;

                public List<InvoicesRestDTO.DocumentPackages.DocumentPackage.DocumentPackageItems.DocumentPackageItem> getDocumentPackageItem() {
                    if (documentPackageItem == null) {
                        documentPackageItem = new ArrayList<InvoicesRestDTO.DocumentPackages.DocumentPackage.DocumentPackageItems.DocumentPackageItem>();
                    }
                    return this.documentPackageItem;
                }

                public void setDocumentPackageItem(List<DocumentPackageItem> documentPackageItem) {
                    this.documentPackageItem = documentPackageItem;
                }

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class DocumentPackageItem implements Serializable {
                    @JsonProperty("PackageNumber")
                    protected Long packageNumber;
                    @JsonProperty("ItemCode")
                    protected String itemCode;
                    @JsonProperty("Quantity")
                    protected Double quantity;
                    @JsonProperty("UoMEntry")
                    protected Long uoMEntry;
                    @JsonProperty("MeasureUnit")
                    protected String measureUnit;
                    @JsonProperty("UnitsOfMeasurement")
                    protected Double unitsOfMeasurement;

                    public Long getPackageNumber() {
                        return packageNumber;
                    }

                    public void setPackageNumber(Long packageNumber) {
                        this.packageNumber = packageNumber;
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

                    public Long getUoMEntry() {
                        return uoMEntry;
                    }

                    public void setUoMEntry(Long uoMEntry) {
                        this.uoMEntry = uoMEntry;
                    }

                    public String getMeasureUnit() {
                        return measureUnit;
                    }

                    public void setMeasureUnit(String measureUnit) {
                        this.measureUnit = measureUnit;
                    }

                    public Double getUnitsOfMeasurement() {
                        return unitsOfMeasurement;
                    }

                    public void setUnitsOfMeasurement(Double unitsOfMeasurement) {
                        this.unitsOfMeasurement = unitsOfMeasurement;
                    }
                }
            }
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DocumentSpecialLines implements Serializable {
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class DocumentSpecialLine implements Serializable {
            @JsonProperty("LineNum")
            protected Long lineNum;
            @JsonProperty("AfterLineNumber")
            protected Long afterLineNumber;
            @JsonProperty("OrderNumber")
            protected Long orderNumber;
            @JsonProperty("LineType")
            protected String lineType;
            @JsonProperty("Subtotal")
            protected Double subtotal;
            @JsonProperty("LineText")
            protected String lineText;
            @JsonProperty("SubtotalFC")
            protected Double subtotalFC;
            @JsonProperty("SubtotalSC")
            protected Double subtotalSC;
            @JsonProperty("TaxAmount")
            protected Double taxAmount;
            @JsonProperty("TaxAmountFC")
            protected Double taxAmountFC;
            @JsonProperty("TaxAmountSC")
            protected Double taxAmountSC;
            @JsonProperty("Freight1")
            protected Double freight1;
            @JsonProperty("Freight1FC")
            protected Double freight1FC;
            @JsonProperty("Freight1SC")
            protected Double freight1SC;
            @JsonProperty("Freight2")
            protected Double freight2;
            @JsonProperty("Freight2FC")
            protected Double freight2FC;
            @JsonProperty("Freight2SC")
            protected Double freight2SC;
            @JsonProperty("Freight3")
            protected Double freight3;
            @JsonProperty("Freight3FC")
            protected Double freight3FC;
            @JsonProperty("Freight3SC")
            protected Double freight3SC;
            @JsonProperty("GrossTotal")
            protected Double grossTotal;
            @JsonProperty("GrossTotalFC")
            protected Double grossTotalFC;
            @JsonProperty("GrossTotalSC")
            protected Double grossTotalSC;

            public Long getLineNum() {
                return lineNum;
            }

            public void setLineNum(Long lineNum) {
                this.lineNum = lineNum;
            }

            public Long getAfterLineNumber() {
                return afterLineNumber;
            }

            public void setAfterLineNumber(Long afterLineNumber) {
                this.afterLineNumber = afterLineNumber;
            }

            public Long getOrderNumber() {
                return orderNumber;
            }

            public void setOrderNumber(Long orderNumber) {
                this.orderNumber = orderNumber;
            }

            public String getLineType() {
                return lineType;
            }

            public void setLineType(String lineType) {
                this.lineType = lineType;
            }

            public Double getSubtotal() {
                return subtotal;
            }

            public void setSubtotal(Double subtotal) {
                this.subtotal = subtotal;
            }

            public String getLineText() {
                return lineText;
            }

            public void setLineText(String lineText) {
                this.lineText = lineText;
            }

            public Double getSubtotalFC() {
                return subtotalFC;
            }

            public void setSubtotalFC(Double subtotalFC) {
                this.subtotalFC = subtotalFC;
            }

            public Double getSubtotalSC() {
                return subtotalSC;
            }

            public void setSubtotalSC(Double subtotalSC) {
                this.subtotalSC = subtotalSC;
            }

            public Double getTaxAmount() {
                return taxAmount;
            }

            public void setTaxAmount(Double taxAmount) {
                this.taxAmount = taxAmount;
            }

            public Double getTaxAmountFC() {
                return taxAmountFC;
            }

            public void setTaxAmountFC(Double taxAmountFC) {
                this.taxAmountFC = taxAmountFC;
            }

            public Double getTaxAmountSC() {
                return taxAmountSC;
            }

            public void setTaxAmountSC(Double taxAmountSC) {
                this.taxAmountSC = taxAmountSC;
            }

            public Double getFreight1() {
                return freight1;
            }

            public void setFreight1(Double freight1) {
                this.freight1 = freight1;
            }

            public Double getFreight1FC() {
                return freight1FC;
            }

            public void setFreight1FC(Double freight1FC) {
                this.freight1FC = freight1FC;
            }

            public Double getFreight1SC() {
                return freight1SC;
            }

            public void setFreight1SC(Double freight1SC) {
                this.freight1SC = freight1SC;
            }

            public Double getFreight2() {
                return freight2;
            }

            public void setFreight2(Double freight2) {
                this.freight2 = freight2;
            }

            public Double getFreight2FC() {
                return freight2FC;
            }

            public void setFreight2FC(Double freight2FC) {
                this.freight2FC = freight2FC;
            }

            public Double getFreight2SC() {
                return freight2SC;
            }

            public void setFreight2SC(Double freight2SC) {
                this.freight2SC = freight2SC;
            }

            public Double getFreight3() {
                return freight3;
            }

            public void setFreight3(Double freight3) {
                this.freight3 = freight3;
            }

            public Double getFreight3FC() {
                return freight3FC;
            }

            public void setFreight3FC(Double freight3FC) {
                this.freight3FC = freight3FC;
            }

            public Double getFreight3SC() {
                return freight3SC;
            }

            public void setFreight3SC(Double freight3SC) {
                this.freight3SC = freight3SC;
            }

            public Double getGrossTotal() {
                return grossTotal;
            }

            public void setGrossTotal(Double grossTotal) {
                this.grossTotal = grossTotal;
            }

            public Double getGrossTotalFC() {
                return grossTotalFC;
            }

            public void setGrossTotalFC(Double grossTotalFC) {
                this.grossTotalFC = grossTotalFC;
            }

            public Double getGrossTotalSC() {
                return grossTotalSC;
            }

            public void setGrossTotalSC(Double grossTotalSC) {
                this.grossTotalSC = grossTotalSC;
            }
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DownPaymentsToDraw implements Serializable {
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class DownPaymentToDraw implements Serializable {
            @JsonProperty("DocEntry")
            protected Long docEntry;
            @JsonProperty("PostingDate")
            protected String postingDate;
            @JsonProperty("DueDate")
            protected String dueDate;
            @JsonProperty("Name")
            protected String name;
            @JsonProperty("Details")
            protected String details;
            @JsonProperty("AmountToDraw")
            protected Double amountToDraw;
            @JsonProperty("DownPaymentType")
            protected String downPaymentType;
            @JsonProperty("AmountToDrawFC")
            protected Double amountToDrawFC;
            @JsonProperty("AmountToDrawSC")
            protected Double amountToDrawSC;
            @JsonProperty("DocInternalID")
            protected Long docInternalID;
            @JsonProperty("RowNum")
            protected Long rowNum;
            @JsonProperty("DocNumber")
            protected Long docNumber;
            @JsonProperty("Tax")
            protected Double tax;
            @JsonProperty("TaxFC")
            protected Double taxFC;
            @JsonProperty("TaxSC")
            protected Double taxSC;
            @JsonProperty("GrossAmountToDraw")
            protected Double grossAmountToDraw;
            @JsonProperty("GrossAmountToDrawFC")
            protected Double grossAmountToDrawFC;
            @JsonProperty("GrossAmountToDrawSC")
            protected Double grossAmountToDrawSC;
            @JsonProperty("IsGrossLine")
            protected String isGrossLine;
            @JsonProperty("DownPaymentsToDrawDetails")
            protected InvoicesRestDTO.DownPaymentsToDraw.DownPaymentToDraw.DownPaymentsToDrawDetails downPaymentsToDrawDetails;

            public Long getDocEntry() {
                return docEntry;
            }

            public void setDocEntry(Long docEntry) {
                this.docEntry = docEntry;
            }

            public String getPostingDate() {
                return postingDate;
            }

            public void setPostingDate(String postingDate) {
                this.postingDate = postingDate;
            }

            public String getDueDate() {
                return dueDate;
            }

            public void setDueDate(String dueDate) {
                this.dueDate = dueDate;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getDetails() {
                return details;
            }

            public void setDetails(String details) {
                this.details = details;
            }

            public Double getAmountToDraw() {
                return amountToDraw;
            }

            public void setAmountToDraw(Double amountToDraw) {
                this.amountToDraw = amountToDraw;
            }

            public String getDownPaymentType() {
                return downPaymentType;
            }

            public void setDownPaymentType(String downPaymentType) {
                this.downPaymentType = downPaymentType;
            }

            public Double getAmountToDrawFC() {
                return amountToDrawFC;
            }

            public void setAmountToDrawFC(Double amountToDrawFC) {
                this.amountToDrawFC = amountToDrawFC;
            }

            public Double getAmountToDrawSC() {
                return amountToDrawSC;
            }

            public void setAmountToDrawSC(Double amountToDrawSC) {
                this.amountToDrawSC = amountToDrawSC;
            }

            public Long getDocInternalID() {
                return docInternalID;
            }

            public void setDocInternalID(Long docInternalID) {
                this.docInternalID = docInternalID;
            }

            public Long getRowNum() {
                return rowNum;
            }

            public void setRowNum(Long rowNum) {
                this.rowNum = rowNum;
            }

            public Long getDocNumber() {
                return docNumber;
            }

            public void setDocNumber(Long docNumber) {
                this.docNumber = docNumber;
            }

            public Double getTax() {
                return tax;
            }

            public void setTax(Double tax) {
                this.tax = tax;
            }

            public Double getTaxFC() {
                return taxFC;
            }

            public void setTaxFC(Double taxFC) {
                this.taxFC = taxFC;
            }

            public Double getTaxSC() {
                return taxSC;
            }

            public void setTaxSC(Double taxSC) {
                this.taxSC = taxSC;
            }

            public Double getGrossAmountToDraw() {
                return grossAmountToDraw;
            }

            public void setGrossAmountToDraw(Double grossAmountToDraw) {
                this.grossAmountToDraw = grossAmountToDraw;
            }

            public Double getGrossAmountToDrawFC() {
                return grossAmountToDrawFC;
            }

            public void setGrossAmountToDrawFC(Double grossAmountToDrawFC) {
                this.grossAmountToDrawFC = grossAmountToDrawFC;
            }

            public Double getGrossAmountToDrawSC() {
                return grossAmountToDrawSC;
            }

            public void setGrossAmountToDrawSC(Double grossAmountToDrawSC) {
                this.grossAmountToDrawSC = grossAmountToDrawSC;
            }

            public String getIsGrossLine() {
                return isGrossLine;
            }

            public void setIsGrossLine(String isGrossLine) {
                this.isGrossLine = isGrossLine;
            }

            public InvoicesRestDTO.DownPaymentsToDraw.DownPaymentToDraw.DownPaymentsToDrawDetails getDownPaymentsToDrawDetails() {
                return downPaymentsToDrawDetails;
            }

            public void setDownPaymentsToDrawDetails(InvoicesRestDTO.DownPaymentsToDraw.DownPaymentToDraw.DownPaymentsToDrawDetails downPaymentsToDrawDetails) {
                this.downPaymentsToDrawDetails = downPaymentsToDrawDetails;
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class DownPaymentsToDrawDetails implements Serializable {
                @JsonProperty("DownPaymentToDrawDetails")
                protected List<InvoicesRestDTO.DownPaymentsToDraw.DownPaymentToDraw.DownPaymentsToDrawDetails.DownPaymentToDrawDetails> downPaymentToDrawDetails;

                public List<InvoicesRestDTO.DownPaymentsToDraw.DownPaymentToDraw.DownPaymentsToDrawDetails.DownPaymentToDrawDetails> getDownPaymentToDrawDetails() {
                    if (downPaymentToDrawDetails == null) {
                        downPaymentToDrawDetails = new ArrayList<InvoicesRestDTO.DownPaymentsToDraw.DownPaymentToDraw.DownPaymentsToDrawDetails.DownPaymentToDrawDetails>();
                    }
                    return this.downPaymentToDrawDetails;
                }

                public void setDownPaymentToDrawDetails(List<DownPaymentToDrawDetails> downPaymentToDrawDetails) {
                    this.downPaymentToDrawDetails = downPaymentToDrawDetails;
                }

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class DownPaymentToDrawDetails implements Serializable {
                    @JsonProperty("DocInternalID")
                    protected Long docInternalID;
                    @JsonProperty("RowNum")
                    protected Long rowNum;
                    @JsonProperty("SeqNum")
                    protected Long seqNum;
                    @JsonProperty("DocEntry")
                    protected Long docEntry;
                    @JsonProperty("VatGroupCode")
                    protected String vatGroupCode;
                    @JsonProperty("VatPercent")
                    protected Double vatPercent;
                    @JsonProperty("AmountToDraw")
                    protected Double amountToDraw;
                    @JsonProperty("AmountToDrawFC")
                    protected Double amountToDrawFC;
                    @JsonProperty("AmountToDrawSC")
                    protected Double amountToDrawSC;
                    @JsonProperty("Tax")
                    protected Double tax;
                    @JsonProperty("TaxFC")
                    protected Double taxFC;
                    @JsonProperty("TaxSC")
                    protected Double taxSC;
                    @JsonProperty("IsGrossLine")
                    protected String isGrossLine;
                    @JsonProperty("GrossAmountToDraw")
                    protected Double grossAmountToDraw;
                    @JsonProperty("GrossAmountToDrawFC")
                    protected Double grossAmountToDrawFC;
                    @JsonProperty("GrossAmountToDrawSC")
                    protected Double grossAmountToDrawSC;
                    @JsonProperty("LineType")
                    protected String lineType;
                    @JsonProperty("TaxAdjust")
                    protected String taxAdjust;

                    public Long getDocInternalID() {
                        return docInternalID;
                    }

                    public void setDocInternalID(Long docInternalID) {
                        this.docInternalID = docInternalID;
                    }

                    public Long getRowNum() {
                        return rowNum;
                    }

                    public void setRowNum(Long rowNum) {
                        this.rowNum = rowNum;
                    }

                    public Long getSeqNum() {
                        return seqNum;
                    }

                    public void setSeqNum(Long seqNum) {
                        this.seqNum = seqNum;
                    }

                    public Long getDocEntry() {
                        return docEntry;
                    }

                    public void setDocEntry(Long docEntry) {
                        this.docEntry = docEntry;
                    }

                    public String getVatGroupCode() {
                        return vatGroupCode;
                    }

                    public void setVatGroupCode(String vatGroupCode) {
                        this.vatGroupCode = vatGroupCode;
                    }

                    public Double getVatPercent() {
                        return vatPercent;
                    }

                    public void setVatPercent(Double vatPercent) {
                        this.vatPercent = vatPercent;
                    }

                    public Double getAmountToDraw() {
                        return amountToDraw;
                    }

                    public void setAmountToDraw(Double amountToDraw) {
                        this.amountToDraw = amountToDraw;
                    }

                    public Double getAmountToDrawFC() {
                        return amountToDrawFC;
                    }

                    public void setAmountToDrawFC(Double amountToDrawFC) {
                        this.amountToDrawFC = amountToDrawFC;
                    }

                    public Double getAmountToDrawSC() {
                        return amountToDrawSC;
                    }

                    public void setAmountToDrawSC(Double amountToDrawSC) {
                        this.amountToDrawSC = amountToDrawSC;
                    }

                    public Double getTax() {
                        return tax;
                    }

                    public void setTax(Double tax) {
                        this.tax = tax;
                    }

                    public Double getTaxFC() {
                        return taxFC;
                    }

                    public void setTaxFC(Double taxFC) {
                        this.taxFC = taxFC;
                    }

                    public Double getTaxSC() {
                        return taxSC;
                    }

                    public void setTaxSC(Double taxSC) {
                        this.taxSC = taxSC;
                    }

                    public String getIsGrossLine() {
                        return isGrossLine;
                    }

                    public void setIsGrossLine(String isGrossLine) {
                        this.isGrossLine = isGrossLine;
                    }

                    public Double getGrossAmountToDraw() {
                        return grossAmountToDraw;
                    }

                    public void setGrossAmountToDraw(Double grossAmountToDraw) {
                        this.grossAmountToDraw = grossAmountToDraw;
                    }

                    public Double getGrossAmountToDrawFC() {
                        return grossAmountToDrawFC;
                    }

                    public void setGrossAmountToDrawFC(Double grossAmountToDrawFC) {
                        this.grossAmountToDrawFC = grossAmountToDrawFC;
                    }

                    public Double getGrossAmountToDrawSC() {
                        return grossAmountToDrawSC;
                    }

                    public void setGrossAmountToDrawSC(Double grossAmountToDrawSC) {
                        this.grossAmountToDrawSC = grossAmountToDrawSC;
                    }

                    public String getLineType() {
                        return lineType;
                    }

                    public void setLineType(String lineType) {
                        this.lineType = lineType;
                    }

                    public String getTaxAdjust() {
                        return taxAdjust;
                    }

                    public void setTaxAdjust(String taxAdjust) {
                        this.taxAdjust = taxAdjust;
                    }
                }

            }
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TaxExtension implements Serializable {
        @JsonProperty("TaxId0")
        protected String taxId0;
        @JsonProperty("TaxId1")
        protected String taxId1;
        @JsonProperty("TaxId2")
        protected String taxId2;
        @JsonProperty("TaxId3")
        protected String taxId3;
        @JsonProperty("TaxId4")
        protected String taxId4;
        @JsonProperty("TaxId5")
        protected String taxId5;
        @JsonProperty("TaxId6")
        protected String taxId6;
        @JsonProperty("TaxId7")
        protected String taxId7;
        @JsonProperty("TaxId8")
        protected String taxId8;
        @JsonProperty("TaxId9")
        protected String taxId9;
        @JsonProperty("State")
        protected String state;
        @JsonProperty("County")
        protected String county;
        @JsonProperty("Incoterms")
        protected String incoterms;
        @JsonProperty("Vehicle")
        protected String vehicle;
        @JsonProperty("VehicleState")
        protected String vehicleState;
        @JsonProperty("NFRef")
        protected String nfRef;
        @JsonProperty("Carrier")
        protected String carrier;
        @JsonProperty("PackQuantity")
        protected Long packQuantity;
        @JsonProperty("PackDescription")
        protected String packDescription;
        @JsonProperty("Brand")
        protected String brand;
        @JsonProperty("ShipUnitNo")
        protected Long shipUnitNo;
        @JsonProperty("NetWeight")
        protected Double netWeight;
        @JsonProperty("GrossWeight")
        protected Double grossWeight;
        @JsonProperty("StreetS")
        protected String streetS;
        @JsonProperty("BlockS")
        protected String blockS;
        @JsonProperty("BuildingS")
        protected String buildingS;
        @JsonProperty("CityS")
        protected String cityS;
        @JsonProperty("ZipCodeS")
        protected String zipCodeS;
        @JsonProperty("CountyS")
        protected String countyS;
        @JsonProperty("StateS")
        protected String stateS;
        @JsonProperty("CountryS")
        protected String countryS;
        @JsonProperty("StreetB")
        protected String streetB;
        @JsonProperty("BlockB")
        protected String blockB;
        @JsonProperty("BuildingB")
        protected String buildingB;
        @JsonProperty("CityB")
        protected String cityB;
        @JsonProperty("ZipCodeB")
        protected String zipCodeB;
        @JsonProperty("CountyB")
        protected String countyB;
        @JsonProperty("StateB")
        protected String stateB;
        @JsonProperty("CountryB")
        protected String countryB;
        @JsonProperty("ImportOrExport")
        protected String importOrExport;
        @JsonProperty("MainUsage")
        protected Long mainUsage;
        @JsonProperty("GlobalLocationNumberS")
        protected String globalLocationNumberS;
        @JsonProperty("GlobalLocationNumberB")
        protected String globalLocationNumberB;

        public String getTaxId0() {
            return taxId0;
        }

        public void setTaxId0(String taxId0) {
            this.taxId0 = taxId0;
        }

        public String getTaxId1() {
            return taxId1;
        }

        public void setTaxId1(String taxId1) {
            this.taxId1 = taxId1;
        }

        public String getTaxId2() {
            return taxId2;
        }

        public void setTaxId2(String taxId2) {
            this.taxId2 = taxId2;
        }

        public String getTaxId3() {
            return taxId3;
        }

        public void setTaxId3(String taxId3) {
            this.taxId3 = taxId3;
        }

        public String getTaxId4() {
            return taxId4;
        }

        public void setTaxId4(String taxId4) {
            this.taxId4 = taxId4;
        }

        public String getTaxId5() {
            return taxId5;
        }

        public void setTaxId5(String taxId5) {
            this.taxId5 = taxId5;
        }

        public String getTaxId6() {
            return taxId6;
        }

        public void setTaxId6(String taxId6) {
            this.taxId6 = taxId6;
        }

        public String getTaxId7() {
            return taxId7;
        }

        public void setTaxId7(String taxId7) {
            this.taxId7 = taxId7;
        }

        public String getTaxId8() {
            return taxId8;
        }

        public void setTaxId8(String taxId8) {
            this.taxId8 = taxId8;
        }

        public String getTaxId9() {
            return taxId9;
        }

        public void setTaxId9(String taxId9) {
            this.taxId9 = taxId9;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getCounty() {
            return county;
        }

        public void setCounty(String county) {
            this.county = county;
        }

        public String getIncoterms() {
            return incoterms;
        }

        public void setIncoterms(String incoterms) {
            this.incoterms = incoterms;
        }

        public String getVehicle() {
            return vehicle;
        }

        public void setVehicle(String vehicle) {
            this.vehicle = vehicle;
        }

        public String getVehicleState() {
            return vehicleState;
        }

        public void setVehicleState(String vehicleState) {
            this.vehicleState = vehicleState;
        }

        public String getNfRef() {
            return nfRef;
        }

        public void setNfRef(String nfRef) {
            this.nfRef = nfRef;
        }

        public String getCarrier() {
            return carrier;
        }

        public void setCarrier(String carrier) {
            this.carrier = carrier;
        }

        public Long getPackQuantity() {
            return packQuantity;
        }

        public void setPackQuantity(Long packQuantity) {
            this.packQuantity = packQuantity;
        }

        public String getPackDescription() {
            return packDescription;
        }

        public void setPackDescription(String packDescription) {
            this.packDescription = packDescription;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public Long getShipUnitNo() {
            return shipUnitNo;
        }

        public void setShipUnitNo(Long shipUnitNo) {
            this.shipUnitNo = shipUnitNo;
        }

        public Double getNetWeight() {
            return netWeight;
        }

        public void setNetWeight(Double netWeight) {
            this.netWeight = netWeight;
        }

        public Double getGrossWeight() {
            return grossWeight;
        }

        public void setGrossWeight(Double grossWeight) {
            this.grossWeight = grossWeight;
        }

        public String getStreetS() {
            return streetS;
        }

        public void setStreetS(String streetS) {
            this.streetS = streetS;
        }

        public String getBlockS() {
            return blockS;
        }

        public void setBlockS(String blockS) {
            this.blockS = blockS;
        }

        public String getBuildingS() {
            return buildingS;
        }

        public void setBuildingS(String buildingS) {
            this.buildingS = buildingS;
        }

        public String getCityS() {
            return cityS;
        }

        public void setCityS(String cityS) {
            this.cityS = cityS;
        }

        public String getZipCodeS() {
            return zipCodeS;
        }

        public void setZipCodeS(String zipCodeS) {
            this.zipCodeS = zipCodeS;
        }

        public String getCountyS() {
            return countyS;
        }

        public void setCountyS(String countyS) {
            this.countyS = countyS;
        }

        public String getStateS() {
            return stateS;
        }

        public void setStateS(String stateS) {
            this.stateS = stateS;
        }

        public String getCountryS() {
            return countryS;
        }

        public void setCountryS(String countryS) {
            this.countryS = countryS;
        }

        public String getStreetB() {
            return streetB;
        }

        public void setStreetB(String streetB) {
            this.streetB = streetB;
        }

        public String getBlockB() {
            return blockB;
        }

        public void setBlockB(String blockB) {
            this.blockB = blockB;
        }

        public String getBuildingB() {
            return buildingB;
        }

        public void setBuildingB(String buildingB) {
            this.buildingB = buildingB;
        }

        public String getCityB() {
            return cityB;
        }

        public void setCityB(String cityB) {
            this.cityB = cityB;
        }

        public String getZipCodeB() {
            return zipCodeB;
        }

        public void setZipCodeB(String zipCodeB) {
            this.zipCodeB = zipCodeB;
        }

        public String getCountyB() {
            return countyB;
        }

        public void setCountyB(String countyB) {
            this.countyB = countyB;
        }

        public String getStateB() {
            return stateB;
        }

        public void setStateB(String stateB) {
            this.stateB = stateB;
        }

        public String getCountryB() {
            return countryB;
        }

        public void setCountryB(String countryB) {
            this.countryB = countryB;
        }

        public String getImportOrExport() {
            return importOrExport;
        }

        public void setImportOrExport(String importOrExport) {
            this.importOrExport = importOrExport;
        }

        public Long getMainUsage() {
            return mainUsage;
        }

        public void setMainUsage(Long mainUsage) {
            this.mainUsage = mainUsage;
        }

        public String getGlobalLocationNumberS() {
            return globalLocationNumberS;
        }

        public void setGlobalLocationNumberS(String globalLocationNumberS) {
            this.globalLocationNumberS = globalLocationNumberS;
        }

        public String getGlobalLocationNumberB() {
            return globalLocationNumberB;
        }

        public void setGlobalLocationNumberB(String globalLocationNumberB) {
            this.globalLocationNumberB = globalLocationNumberB;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AddressExtension implements Serializable {
        @JsonProperty("ShipToStreet")
        protected String shipToStreet;
        @JsonProperty("ShipToStreetNo")
        protected String shipToStreetNo;
        @JsonProperty("ShipToBlock")
        protected String shipToBlock;
        @JsonProperty("ShipToBuilding")
        protected String shipToBuilding;
        @JsonProperty("ShipToCity")
        protected String shipToCity;
        @JsonProperty("ShipToZipCode")
        protected String shipToZipCode;
        @JsonProperty("ShipToCounty")
        protected String shipToCounty;
        @JsonProperty("ShipToState")
        protected String shipToState;
        @JsonProperty("ShipToCountry")
        protected String shipToCountry;
        @JsonProperty("ShipToAddressType")
        protected String shipToAddressType;
        @JsonProperty("BillToStreet")
        protected String billToStreet;
        @JsonProperty("BillToStreetNo")
        protected String billToStreetNo;
        @JsonProperty("BillToBlock")
        protected String billToBlock;
        @JsonProperty("BillToBuilding")
        protected String billToBuilding;
        @JsonProperty("BillToCity")
        protected String billToCity;
        @JsonProperty("BillToZipCode")
        protected String billToZipCode;
        @JsonProperty("BillToCounty")
        protected String billToCounty;
        @JsonProperty("BillToState")
        protected String billToState;
        @JsonProperty("BillToCountry")
        protected String billToCountry;
        @JsonProperty("BillToAddressType")
        protected String billToAddressType;
        @JsonProperty("ShipToGlobalLocationNumber")
        protected String shipToGlobalLocationNumber;
        @JsonProperty("BillToGlobalLocationNumber")
        protected String billToGlobalLocationNumber;

        public String getShipToStreet() {
            return shipToStreet;
        }

        public void setShipToStreet(String shipToStreet) {
            this.shipToStreet = shipToStreet;
        }

        public String getShipToStreetNo() {
            return shipToStreetNo;
        }

        public void setShipToStreetNo(String shipToStreetNo) {
            this.shipToStreetNo = shipToStreetNo;
        }

        public String getShipToBlock() {
            return shipToBlock;
        }

        public void setShipToBlock(String shipToBlock) {
            this.shipToBlock = shipToBlock;
        }

        public String getShipToBuilding() {
            return shipToBuilding;
        }

        public void setShipToBuilding(String shipToBuilding) {
            this.shipToBuilding = shipToBuilding;
        }

        public String getShipToCity() {
            return shipToCity;
        }

        public void setShipToCity(String shipToCity) {
            this.shipToCity = shipToCity;
        }

        public String getShipToZipCode() {
            return shipToZipCode;
        }

        public void setShipToZipCode(String shipToZipCode) {
            this.shipToZipCode = shipToZipCode;
        }

        public String getShipToCounty() {
            return shipToCounty;
        }

        public void setShipToCounty(String shipToCounty) {
            this.shipToCounty = shipToCounty;
        }

        public String getShipToState() {
            return shipToState;
        }

        public void setShipToState(String shipToState) {
            this.shipToState = shipToState;
        }

        public String getShipToCountry() {
            return shipToCountry;
        }

        public void setShipToCountry(String shipToCountry) {
            this.shipToCountry = shipToCountry;
        }

        public String getShipToAddressType() {
            return shipToAddressType;
        }

        public void setShipToAddressType(String shipToAddressType) {
            this.shipToAddressType = shipToAddressType;
        }

        public String getBillToStreet() {
            return billToStreet;
        }

        public void setBillToStreet(String billToStreet) {
            this.billToStreet = billToStreet;
        }

        public String getBillToStreetNo() {
            return billToStreetNo;
        }

        public void setBillToStreetNo(String billToStreetNo) {
            this.billToStreetNo = billToStreetNo;
        }

        public String getBillToBlock() {
            return billToBlock;
        }

        public void setBillToBlock(String billToBlock) {
            this.billToBlock = billToBlock;
        }

        public String getBillToBuilding() {
            return billToBuilding;
        }

        public void setBillToBuilding(String billToBuilding) {
            this.billToBuilding = billToBuilding;
        }

        public String getBillToCity() {
            return billToCity;
        }

        public void setBillToCity(String billToCity) {
            this.billToCity = billToCity;
        }

        public String getBillToZipCode() {
            return billToZipCode;
        }

        public void setBillToZipCode(String billToZipCode) {
            this.billToZipCode = billToZipCode;
        }

        public String getBillToCounty() {
            return billToCounty;
        }

        public void setBillToCounty(String billToCounty) {
            this.billToCounty = billToCounty;
        }

        public String getBillToState() {
            return billToState;
        }

        public void setBillToState(String billToState) {
            this.billToState = billToState;
        }

        public String getBillToCountry() {
            return billToCountry;
        }

        public void setBillToCountry(String billToCountry) {
            this.billToCountry = billToCountry;
        }

        public String getBillToAddressType() {
            return billToAddressType;
        }

        public void setBillToAddressType(String billToAddressType) {
            this.billToAddressType = billToAddressType;
        }

        public String getShipToGlobalLocationNumber() {
            return shipToGlobalLocationNumber;
        }

        public void setShipToGlobalLocationNumber(String shipToGlobalLocationNumber) {
            this.shipToGlobalLocationNumber = shipToGlobalLocationNumber;
        }

        public String getBillToGlobalLocationNumber() {
            return billToGlobalLocationNumber;
        }

        public void setBillToGlobalLocationNumber(String billToGlobalLocationNumber) {
            this.billToGlobalLocationNumber = billToGlobalLocationNumber;
        }
    }
}