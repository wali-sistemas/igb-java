
package co.igb.b1ws.client.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "Document")
public class Document {

    @XmlElement(name = "DocEntry")
    protected Long docEntry;
    @XmlElement(name = "DocNum")
    protected Long docNum;
    @XmlElement(name = "DocType")
    protected String docType;
    @XmlElement(name = "HandWritten")
    protected String handWritten;
    @XmlElement(name = "Printed")
    protected String printed;
    @XmlElement(name = "DocDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docDate;
    @XmlElement(name = "DocDueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docDueDate;
    @XmlElement(name = "CardCode")
    protected String cardCode;
    @XmlElement(name = "CardName")
    protected String cardName;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "NumAtCard")
    protected String numAtCard;
    @XmlElement(name = "DocTotal")
    protected BigDecimal docTotal;
    @XmlElement(name = "AttachmentEntry")
    protected Long attachmentEntry;
    @XmlElement(name = "DocCurrency")
    protected String docCurrency;
    @XmlElement(name = "DocRate")
    protected BigDecimal docRate;
    @XmlElement(name = "Reference1")
    protected String reference1;
    @XmlElement(name = "Reference2")
    protected String reference2;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "JournalMemo")
    protected String journalMemo;
    @XmlElement(name = "PaymentGroupCode")
    protected Long paymentGroupCode;
    @XmlElement(name = "DocTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar docTime;
    @XmlElement(name = "SalesPersonCode")
    protected Long salesPersonCode;
    @XmlElement(name = "TransportationCode")
    protected Long transportationCode;
    @XmlElement(name = "Confirmed")
    protected String confirmed;
    @XmlElement(name = "ImportFileNum")
    protected Long importFileNum;
    @XmlElement(name = "SummeryType")
    protected String summeryType;
    @XmlElement(name = "ContactPersonCode")
    protected Long contactPersonCode;
    @XmlElement(name = "ShowSCN")
    protected String showSCN;
    @XmlElement(name = "Series")
    protected Long series;
    @XmlElement(name = "TaxDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar taxDate;
    @XmlElement(name = "PartialSupply")
    protected String partialSupply;
    @XmlElement(name = "DocObjectCode")
    protected String docObjectCode;
    @XmlElement(name = "ShipToCode")
    protected String shipToCode;
    @XmlElement(name = "Indicator")
    protected String indicator;
    @XmlElement(name = "FederalTaxID")
    protected String federalTaxID;
    @XmlElement(name = "DiscountPercent")
    protected BigDecimal discountPercent;
    @XmlElement(name = "PaymentReference")
    protected String paymentReference;
    @XmlElement(name = "CreationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "UpdateDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar updateDate;
    @XmlElement(name = "FinancialPeriod")
    protected Long financialPeriod;
    @XmlElement(name = "TransNum")
    protected Long transNum;
    @XmlElement(name = "VatSum")
    protected BigDecimal vatSum;
    @XmlElement(name = "VatSumSys")
    protected BigDecimal vatSumSys;
    @XmlElement(name = "VatSumFc")
    protected BigDecimal vatSumFc;
    @XmlElement(name = "NetProcedure")
    protected String netProcedure;
    @XmlElement(name = "DocTotalFc")
    protected BigDecimal docTotalFc;
    @XmlElement(name = "DocTotalSys")
    protected BigDecimal docTotalSys;
    @XmlElement(name = "Form1099")
    protected Long form1099;
    @XmlElement(name = "Box1099")
    protected String box1099;
    @XmlElement(name = "RevisionPo")
    protected String revisionPo;
    @XmlElement(name = "RequriedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requriedDate;
    @XmlElement(name = "CancelDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cancelDate;
    @XmlElement(name = "BlockDunning")
    protected String blockDunning;
    @XmlElement(name = "Submitted")
    protected String submitted;
    @XmlElement(name = "Segment")
    protected Long segment;
    @XmlElement(name = "PickStatus")
    protected String pickStatus;
    @XmlElement(name = "Pick")
    protected String pick;
    @XmlElement(name = "PaymentMethod")
    protected String paymentMethod;
    @XmlElement(name = "PaymentBlock")
    protected String paymentBlock;
    @XmlElement(name = "PaymentBlockEntry")
    protected Long paymentBlockEntry;
    @XmlElement(name = "CentralBankIndicator")
    protected String centralBankIndicator;
    @XmlElement(name = "MaximumCashDiscount")
    protected String maximumCashDiscount;
    @XmlElement(name = "Reserve")
    protected String reserve;
    @XmlElement(name = "Project")
    protected String project;
    @XmlElement(name = "ExemptionValidityDateFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exemptionValidityDateFrom;
    @XmlElement(name = "ExemptionValidityDateTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exemptionValidityDateTo;
    @XmlElement(name = "WareHouseUpdateType")
    protected String wareHouseUpdateType;
    @XmlElement(name = "Rounding")
    protected String rounding;
    @XmlElement(name = "ExternalCorrectedDocNum")
    protected String externalCorrectedDocNum;
    @XmlElement(name = "InternalCorrectedDocNum")
    protected Long internalCorrectedDocNum;
    @XmlElement(name = "NextCorrectingDocument")
    protected Long nextCorrectingDocument;
    @XmlElement(name = "DeferredTax")
    protected String deferredTax;
    @XmlElement(name = "TaxExemptionLetterNum")
    protected String taxExemptionLetterNum;
    @XmlElement(name = "WTApplied")
    protected BigDecimal wtApplied;
    @XmlElement(name = "WTAppliedFC")
    protected BigDecimal wtAppliedFC;
    @XmlElement(name = "BillOfExchangeReserved")
    protected String billOfExchangeReserved;
    @XmlElement(name = "AgentCode")
    protected String agentCode;
    @XmlElement(name = "WTAppliedSC")
    protected BigDecimal wtAppliedSC;
    @XmlElement(name = "TotalEqualizationTax")
    protected BigDecimal totalEqualizationTax;
    @XmlElement(name = "TotalEqualizationTaxFC")
    protected BigDecimal totalEqualizationTaxFC;
    @XmlElement(name = "TotalEqualizationTaxSC")
    protected BigDecimal totalEqualizationTaxSC;
    @XmlElement(name = "NumberOfInstallments")
    protected Long numberOfInstallments;
    @XmlElement(name = "ApplyTaxOnFirstInstallment")
    protected String applyTaxOnFirstInstallment;
    @XmlElement(name = "WTNonSubjectAmount")
    protected BigDecimal wtNonSubjectAmount;
    @XmlElement(name = "WTNonSubjectAmountSC")
    protected BigDecimal wtNonSubjectAmountSC;
    @XmlElement(name = "WTNonSubjectAmountFC")
    protected BigDecimal wtNonSubjectAmountFC;
    @XmlElement(name = "WTExemptedAmount")
    protected BigDecimal wtExemptedAmount;
    @XmlElement(name = "WTExemptedAmountSC")
    protected BigDecimal wtExemptedAmountSC;
    @XmlElement(name = "WTExemptedAmountFC")
    protected BigDecimal wtExemptedAmountFC;
    @XmlElement(name = "BaseAmount")
    protected BigDecimal baseAmount;
    @XmlElement(name = "BaseAmountSC")
    protected BigDecimal baseAmountSC;
    @XmlElement(name = "BaseAmountFC")
    protected BigDecimal baseAmountFC;
    @XmlElement(name = "WTAmount")
    protected BigDecimal wtAmount;
    @XmlElement(name = "WTAmountSC")
    protected BigDecimal wtAmountSC;
    @XmlElement(name = "WTAmountFC")
    protected BigDecimal wtAmountFC;
    @XmlElement(name = "VatDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vatDate;
    @XmlElement(name = "DocumentsOwner")
    protected Long documentsOwner;
    @XmlElement(name = "FolioPrefixString")
    protected String folioPrefixString;
    @XmlElement(name = "FolioNumber")
    protected Long folioNumber;
    @XmlElement(name = "DocumentSubType")
    protected String documentSubType;
    @XmlElement(name = "BPChannelCode")
    protected String bpChannelCode;
    @XmlElement(name = "BPChannelContact")
    protected Long bpChannelContact;
    @XmlElement(name = "Address2")
    protected String address2;
    @XmlElement(name = "DocumentStatus")
    protected String documentStatus;
    @XmlElement(name = "PeriodIndicator")
    protected String periodIndicator;
    @XmlElement(name = "PayToCode")
    protected String payToCode;
    @XmlElement(name = "ManualNumber")
    protected String manualNumber;
    @XmlElement(name = "UseShpdGoodsAct")
    protected String useShpdGoodsAct;
    @XmlElement(name = "IsPayToBank")
    protected String isPayToBank;
    @XmlElement(name = "PayToBankCountry")
    protected String payToBankCountry;
    @XmlElement(name = "PayToBankCode")
    protected String payToBankCode;
    @XmlElement(name = "PayToBankAccountNo")
    protected String payToBankAccountNo;
    @XmlElement(name = "PayToBankBranch")
    protected String payToBankBranch;
    @XmlElement(name = "BPL_IDAssignedToInvoice")
    protected Long bplidAssignedToInvoice;
    @XmlElement(name = "DownPayment")
    protected BigDecimal downPayment;
    @XmlElement(name = "ReserveInvoice")
    protected String reserveInvoice;
    @XmlElement(name = "LanguageCode")
    protected Long languageCode;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "PickRemark")
    protected String pickRemark;
    @XmlElement(name = "ClosingDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar closingDate;
    @XmlElement(name = "SequenceCode")
    protected Long sequenceCode;
    @XmlElement(name = "SequenceSerial")
    protected Long sequenceSerial;
    @XmlElement(name = "SeriesString")
    protected String seriesString;
    @XmlElement(name = "SubSeriesString")
    protected String subSeriesString;
    @XmlElement(name = "SequenceModel")
    protected String sequenceModel;
    @XmlElement(name = "UseCorrectionVATGroup")
    protected String useCorrectionVATGroup;
    @XmlElement(name = "TotalDiscount")
    protected BigDecimal totalDiscount;
    @XmlElement(name = "DownPaymentAmount")
    protected BigDecimal downPaymentAmount;
    @XmlElement(name = "DownPaymentPercentage")
    protected BigDecimal downPaymentPercentage;
    @XmlElement(name = "DownPaymentType")
    protected String downPaymentType;
    @XmlElement(name = "DownPaymentAmountSC")
    protected BigDecimal downPaymentAmountSC;
    @XmlElement(name = "DownPaymentAmountFC")
    protected BigDecimal downPaymentAmountFC;
    @XmlElement(name = "VatPercent")
    protected BigDecimal vatPercent;
    @XmlElement(name = "ServiceGrossProfitPercent")
    protected BigDecimal serviceGrossProfitPercent;
    @XmlElement(name = "OpeningRemarks")
    protected String openingRemarks;
    @XmlElement(name = "ClosingRemarks")
    protected String closingRemarks;
    @XmlElement(name = "RoundingDiffAmount")
    protected BigDecimal roundingDiffAmount;
    @XmlElement(name = "RoundingDiffAmountFC")
    protected BigDecimal roundingDiffAmountFC;
    @XmlElement(name = "RoundingDiffAmountSC")
    protected BigDecimal roundingDiffAmountSC;
    @XmlElement(name = "Cancelled")
    protected String cancelled;
    @XmlElement(name = "SignatureInputMessage")
    protected String signatureInputMessage;
    @XmlElement(name = "SignatureDigest")
    protected String signatureDigest;
    @XmlElement(name = "CertificationNumber")
    protected String certificationNumber;
    @XmlElement(name = "PrivateKeyVersion")
    protected Long privateKeyVersion;
    @XmlElement(name = "ControlAccount")
    protected String controlAccount;
    @XmlElement(name = "InsuranceOperation347")
    protected String insuranceOperation347;
    @XmlElement(name = "ArchiveNonremovableSalesQuotation")
    protected String archiveNonremovableSalesQuotation;
    @XmlElement(name = "GTSChecker")
    protected Long gtsChecker;
    @XmlElement(name = "GTSPayee")
    protected Long gtsPayee;
    @XmlElement(name = "ExtraMonth")
    protected Long extraMonth;
    @XmlElement(name = "ExtraDays")
    protected Long extraDays;
    @XmlElement(name = "CashDiscountDateOffset")
    protected Long cashDiscountDateOffset;
    @XmlElement(name = "StartFrom")
    protected String startFrom;
    @XmlElement(name = "NTSApproved")
    protected String ntsApproved;
    @XmlElement(name = "ETaxWebSite")
    protected Long eTaxWebSite;
    @XmlElement(name = "ETaxNumber")
    protected String eTaxNumber;
    @XmlElement(name = "NTSApprovedNumber")
    protected String ntsApprovedNumber;
    @XmlElement(name = "EDocGenerationType")
    protected String eDocGenerationType;
    @XmlElement(name = "EDocSeries")
    protected Long eDocSeries;
    @XmlElement(name = "EDocNum")
    protected String eDocNum;
    @XmlElement(name = "EDocExportFormat")
    protected Long eDocExportFormat;
    @XmlElement(name = "EDocStatus")
    protected String eDocStatus;
    @XmlElement(name = "EDocErrorCode")
    protected String eDocErrorCode;
    @XmlElement(name = "EDocErrorMessage")
    protected String eDocErrorMessage;
    @XmlElement(name = "DownPaymentStatus")
    protected String downPaymentStatus;
    @XmlElement(name = "GroupSeries")
    protected Long groupSeries;
    @XmlElement(name = "GroupNumber")
    protected Long groupNumber;
    @XmlElement(name = "GroupHandWritten")
    protected String groupHandWritten;
    @XmlElement(name = "ReopenOriginalDocument")
    protected String reopenOriginalDocument;
    @XmlElement(name = "ReopenManuallyClosedOrCanceledDocument")
    protected String reopenManuallyClosedOrCanceledDocument;
    @XmlElement(name = "CreateOnlineQuotation")
    protected String createOnlineQuotation;
    @XmlElement(name = "POSEquipmentNumber")
    protected String posEquipmentNumber;
    @XmlElement(name = "POSManufacturerSerialNumber")
    protected String posManufacturerSerialNumber;
    @XmlElement(name = "POSCashierNumber")
    protected Long posCashierNumber;
    @XmlElement(name = "ApplyCurrentVATRatesForDownPaymentsToDraw")
    protected String applyCurrentVATRatesForDownPaymentsToDraw;
    @XmlElement(name = "ClosingOption")
    protected String closingOption;
    @XmlElement(name = "SpecifiedClosingDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar specifiedClosingDate;
    @XmlElement(name = "OpenForLandedCosts")
    protected String openForLandedCosts;
    @XmlElement(name = "AuthorizationStatus")
    protected String authorizationStatus;
    @XmlElement(name = "TotalDiscountFC")
    protected BigDecimal totalDiscountFC;
    @XmlElement(name = "TotalDiscountSC")
    protected BigDecimal totalDiscountSC;
    @XmlElement(name = "RelevantToGTS")
    protected String relevantToGTS;
    @XmlElement(name = "BPLName")
    protected String bplName;
    @XmlElement(name = "VATRegNum")
    protected String vatRegNum;
    @XmlElement(name = "AnnualInvoiceDeclarationReference")
    protected Long annualInvoiceDeclarationReference;
    @XmlElement(name = "Supplier")
    protected String supplier;
    @XmlElement(name = "Releaser")
    protected Long releaser;
    @XmlElement(name = "Receiver")
    protected Long receiver;
    @XmlElement(name = "BlanketAgreementNumber")
    protected Long blanketAgreementNumber;
    @XmlElement(name = "IsAlteration")
    protected String isAlteration;
    @XmlElement(name = "CancelStatus")
    protected String cancelStatus;
    @XmlElement(name = "AssetValueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar assetValueDate;
    @XmlElement(name = "DocumentDelivery")
    protected String documentDelivery;
    @XmlElement(name = "AuthorizationCode")
    protected String authorizationCode;
    @XmlElement(name = "StartDeliveryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDeliveryDate;
    @XmlElement(name = "StartDeliveryTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar startDeliveryTime;
    @XmlElement(name = "EndDeliveryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDeliveryDate;
    @XmlElement(name = "EndDeliveryTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar endDeliveryTime;
    @XmlElement(name = "VehiclePlate")
    protected String vehiclePlate;
    @XmlElement(name = "ATDocumentType")
    protected String atDocumentType;
    @XmlElement(name = "ElecCommStatus")
    protected String elecCommStatus;
    @XmlElement(name = "ElecCommMessage")
    protected String elecCommMessage;
    @XmlElement(name = "ReuseDocumentNum")
    protected String reuseDocumentNum;
    @XmlElement(name = "ReuseNotaFiscalNum")
    protected String reuseNotaFiscalNum;
    @XmlElement(name = "PrintSEPADirect")
    protected String printSEPADirect;
    @XmlElement(name = "FiscalDocNum")
    protected String fiscalDocNum;
    @XmlElement(name = "POSDailySummaryNo")
    protected Long posDailySummaryNo;
    @XmlElement(name = "POSReceiptNo")
    protected Long posReceiptNo;
    @XmlElement(name = "PointOfIssueCode")
    protected String pointOfIssueCode;
    @XmlElement(name = "Letter")
    protected String letter;
    @XmlElement(name = "FolioNumberFrom")
    protected Long folioNumberFrom;
    @XmlElement(name = "FolioNumberTo")
    protected Long folioNumberTo;
    @XmlElement(name = "InterimType")
    protected String interimType;
    @XmlElement(name = "RelatedType")
    protected Long relatedType;
    @XmlElement(name = "RelatedEntry")
    protected Long relatedEntry;
    @XmlElement(name = "DocumentTaxID")
    protected String documentTaxID;
    @XmlElement(name = "DateOfReportingControlStatementVAT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfReportingControlStatementVAT;
    @XmlElement(name = "ReportingSectionControlStatementVAT")
    protected String reportingSectionControlStatementVAT;
    @XmlElement(name = "ExcludeFromTaxReportControlStatementVAT")
    protected String excludeFromTaxReportControlStatementVAT;
    @XmlElement(name = "POS_CashRegister")
    protected Long posCashRegister;
    @XmlElement(name = "UpdateTime")
    @XmlSchemaType(name = "time")
    protected String updateTime;
    @XmlElement(name = "PriceMode")
    protected String priceMode;
    @XmlElement(name = "ShipFrom")
    protected String shipFrom;
    @XmlElement(name = "CommissionTrade")
    protected String commissionTrade;
    @XmlElement(name = "CommissionTradeReturn")
    protected String commissionTradeReturn;
    @XmlElement(name = "UseBillToAddrToDetermineTax")
    protected String useBillToAddrToDetermineTax;
    @XmlElement(name = "U_BPCOST")
    protected String ubpcost;
    @XmlElement(name = "U_WUID")
    protected String uwuid;
    @XmlElement(name = "U_F_TOMA_PED")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar uftomaped;
    @XmlElement(name = "U_CAMPANA")
    protected String ucampana;
    @XmlElement(name = "U_TRANSP")
    protected String utransp;
    @XmlElement(name = "U_SEPARADOR")
    protected String useparador;
    @XmlElement(name = "U_DESP")
    protected String udesp;
    @XmlElement(name = "U_UBIC1")
    protected String uubic1;
    @XmlElement(name = "U_CONC_NC")
    protected String uconcnc;
    @XmlElement(name = "U_CONC_ND")
    protected String uconcnd;
    @XmlElement(name = "U_CONC_INV")
    protected String uconcinv;
    @XmlElement(name = "U_F_EMBARQUE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ufembarque;
    @XmlElement(name = "U_TERM_NEG")
    protected String utermneg;
    @XmlElement(name = "U_MOD_TRANSP")
    protected String umodtransp;
    @XmlElement(name = "U_PUERTO_DES")
    protected String upuertodes;
    @XmlElement(name = "U_MOD_IMP")
    protected String umodimp;
    @XmlElement(name = "U_ESTADO_OC")
    protected String uestadooc;
    @XmlElement(name = "U_F_PROFORMA")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ufproforma;
    @XmlElement(name = "U_EMBARCADO")
    protected String uembarcado;
    @XmlElement(name = "U_DOC_TRANSP")
    protected String udoctransp;
    @XmlElement(name = "U_F_DOC_TRANSP")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ufdoctransp;
    @XmlElement(name = "U_F_ARRIB_PUERTO")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ufarribpuerto;
    @XmlElement(name = "U_F_ARRIB_ALMA")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ufarribalma;
    @XmlElement(name = "U_REQ_ANT")
    protected String ureqant;
    @XmlElement(name = "U_ANT_REALIZ")
    protected String uantrealiz;
    @XmlElement(name = "U_TOT_CAJ")
    protected BigDecimal utotcaj;
    @XmlElement(name = "U_TOT_BUL")
    protected BigDecimal utotbul;
    @XmlElement(name = "U_TOT_LIOS")
    protected BigDecimal utotlios;
    @XmlElement(name = "U_VLR_FLE")
    protected BigDecimal uvlrfle;
    @XmlElement(name = "U_VLR_SEG")
    protected BigDecimal uvlrseg;
    @XmlElement(name = "U_TOT_FLE")
    protected BigDecimal utotfle;
    @XmlElement(name = "U_HORA_INI")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar uhoraini;
    @XmlElement(name = "U_HORA_FIN")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar uhorafin;
    @XmlElement(name = "U_PESO_BRUTO")
    protected BigDecimal upesobruto;
    @XmlElement(name = "U_AUT_PRECIO")
    protected String uautprecio;
    @XmlElement(name = "U_TipoNota")
    protected String uTipoNota;
    @XmlElement(name = "U_NUNFAC")
    protected String ununfac;
    @XmlElement(name = "U_FECHA_ENTREGA_PRO")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ufechaentregapro;
    @XmlElement(name = "U_NUM_FAC_IMP")
    protected String unumfacimp;
    @XmlElement(name = "U_TRANSP_IMP")
    protected String utranspimp;
    @XmlElement(name = "U_TIEMPO_ESTIMADO")
    protected BigDecimal utiempoestimado;
    @XmlElement(name = "U_FEC_INI")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ufecini;
    @XmlElement(name = "U_FEC_FIN")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ufecfin;
    @XmlElement(name = "U_IVCDone")
    protected String uivcDone;
    @XmlElement(name = "U_Vendedor_2")
    protected String uVendedor2;
    @XmlElement(name = "U_DifCode")
    protected String uDifCode;
    @XmlElement(name = "U_OK1_IVAPA")
    protected String uok1IVAPA;
    @XmlElement(name = "U_MOT_DEVOL")
    protected String umotdevol;
    @XmlElement(name = "U_FECHA_PAGO")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ufechapago;
    @XmlElement(name = "U_ANT_CANCELADO")
    protected String uantcancelado;
    @XmlElement(name = "U_IMP_CANCELADO")
    protected String uimpcancelado;
    @XmlElement(name = "U_TIPO_EMPAQUE")
    protected String utipoempaque;
    @XmlElement(name = "U_VR_ANTICIPO")
    protected BigDecimal uvranticipo;
    @XmlElement(name = "U_VR_TOTAL")
    protected BigDecimal uvrtotal;
    @XmlElement(name = "U_VR_IMPUESTO")
    protected BigDecimal uvrimpuesto;
    @XmlElement(name = "U_OBSERVACION")
    protected String uobservacion;
    @XmlElement(name = "U_VR_DECLARADO")
    protected BigDecimal uvrdeclarado;
    @XmlElement(name = "U_PUERTO_EMB")
    protected String upuertoemb;
    @XmlElement(name = "U_NAVIERA")
    protected String unaviera;
    @XmlElement(name = "U_TRANSP_TERR")
    protected String utranspterr;
    @XmlElement(name = "U_AGENTE_ADU")
    protected String uagenteadu;
    @XmlElement(name = "U_ALMAC_DES")
    protected String ualmacdes;
    @XmlElement(name = "U_GUID")
    protected String uguid;
    @XmlElement(name = "U_BPV_NCON2")
    protected String ubpvncon2;
    @XmlElement(name = "U_BPV_SERI")
    protected String ubpvseri;
    @XmlElement(name = "U_BPV_TRAN")
    protected String ubpvtran;
    @XmlElement(name = "U_BPV_FAFE")
    protected String ubpvfafe;
    @XmlElement(name = "U_BPV_COMP")
    protected String ubpvcomp;
    @XmlElement(name = "U_BPV_TDOC")
    protected String ubpvtdoc;
    @XmlElement(name = "U_BPV_NIMP")
    protected String ubpvnimp;
    @XmlElement(name = "U_BPV_NumExp")
    protected String ubpvNumExp;
    @XmlElement(name = "U_BPV_NCON")
    protected String ubpvncon;
    @XmlElement(name = "U_MOTIVO")
    protected String umotivo;
    @XmlElement(name = "U_ESTADO_PED")
    protected String uestadoped;
    @XmlElement(name = "U_Autorret")
    protected String uAutorret;
    @XmlElement(name = "U_Retefue")
    protected String uRetefue;
    @XmlElement(name = "U_ReteIca")
    protected String uReteIca;
    @XmlElement(name = "U_NWR_PicS")
    protected String unwrPicS;
    @XmlElement(name = "U_NWR_BRet")
    protected String unwrbRet;
    @XmlElement(name = "U_nwr_PAut")
    protected Long uNwrPAut;
    @XmlElement(name = "U_nwr_Note")
    protected String uNwrNote;
    @XmlElement(name = "U_nwr_Tag")
    protected String uNwrTag;
    @XmlElement(name = "U_nwr_Frgt")
    protected BigDecimal uNwrFrgt;
    @XmlElement(name = "U_NWR_NORM")
    protected String unwrnorm;
    @XmlElement(name = "U_TypeExped")
    protected String uTypeExped;
    @XmlElement(name = "U_NWR_Manifest")
    protected String unwrManifest;
    @XmlElement(name = "U_EMPACADOR")
    protected String uempacador;
    @XmlElement(name = "U_HORA_INI_EMP")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar uhorainiemp;
    @XmlElement(name = "U_HORA_FIN_EMP")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar uhorafinemp;
    @XmlElement(name = "U_ALIST")
    protected String ualist;
    @XmlElement(name = "U_FEC_INI_EMP")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ufeciniemp;
    @XmlElement(name = "U_FEC_FIN_EMP")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ufecfinemp;
    @XmlElement(name = "U_OK1_IFRS")
    protected String uok1IFRS;
    @XmlElement(name = "U_TOT_FLE_CLIE")
    protected BigDecimal utotfleclie;
    @XmlElement(name = "U_SHIPPING")
    protected String ushipping;
    @XmlElement(name = "U_EsIndep")
    protected String uEsIndep;
    @XmlElement(name = "U_DocEntryLeg")
    protected Long uDocEntryLeg;
    @XmlElement(name = "U_idLineLeg")
    protected String uIdLineLeg;
    @XmlElement(name = "U_serieLeg")
    protected Long uSerieLeg;
    @XmlElement(name = "U_Fecha_Arribo_CEDI")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar uFechaArriboCEDI;
    @XmlElement(name = "U_CatRet")
    protected String uCatRet;
    @XmlElement(name = "U_Bodega")
    protected String uBodega;
    @XmlElement(name = "U_AIU_ADMIN")
    protected BigDecimal uaiuadmin;
    @XmlElement(name = "U_AIU_IMPRE")
    protected BigDecimal uaiuimpre;
    @XmlElement(name = "U_AIU_UTIL")
    protected BigDecimal uaiuutil;
    //@XmlElement(name = "U_addInFaElectronica_tipoND_FE")
    //protected String uAddInFaElectronicaTipoNDFE;
    //@XmlElement(name = "U_DocAdicionales")
    //protected String uDocAdicionales;
    @XmlElement(name = "U_Origen")
    protected String uOrigen;
    @XmlElement(name = "Document_ApprovalRequests")
    protected Document.DocumentApprovalRequests documentApprovalRequests;
    @XmlElement(name = "DocumentLines")
    protected Document.DocumentLines documentLines;
    @XmlElement(name = "ElectronicProtocols")
    protected Document.ElectronicProtocols electronicProtocols;
    @XmlElement(name = "DocumentAdditionalExpenses")
    protected Document.DocumentAdditionalExpenses documentAdditionalExpenses;
    @XmlElement(name = "WithholdingTaxDataWTXCollection")
    protected Document.WithholdingTaxDataWTXCollection withholdingTaxDataWTXCollection;
    @XmlElement(name = "WithholdingTaxDataCollection")
    protected Document.WithholdingTaxDataCollection withholdingTaxDataCollection;
    @XmlElement(name = "DocumentSpecialLines")
    protected Document.DocumentSpecialLines documentSpecialLines;
    @XmlElement(name = "TaxExtension")
    protected Document.TaxExtension taxExtension;
    @XmlElement(name = "AddressExtension")
    protected Document.AddressExtension addressExtension;

    /**
     * Obtiene el valor de la propiedad docEntry.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getDocEntry() {
        return docEntry;
    }

    /**
     * Define el valor de la propiedad docEntry.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setDocEntry(Long value) {
        this.docEntry = value;
    }

    /**
     * Obtiene el valor de la propiedad docNum.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getDocNum() {
        return docNum;
    }

    /**
     * Define el valor de la propiedad docNum.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setDocNum(Long value) {
        this.docNum = value;
    }

    /**
     * Obtiene el valor de la propiedad docType.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDocType() {
        return docType;
    }

    /**
     * Define el valor de la propiedad docType.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocType(String value) {
        this.docType = value;
    }

    /**
     * Obtiene el valor de la propiedad handWritten.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHandWritten() {
        return handWritten;
    }

    /**
     * Define el valor de la propiedad handWritten.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHandWritten(String value) {
        this.handWritten = value;
    }

    /**
     * Obtiene el valor de la propiedad printed.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrinted() {
        return printed;
    }

    /**
     * Define el valor de la propiedad printed.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrinted(String value) {
        this.printed = value;
    }

    /**
     * Obtiene el valor de la propiedad docDate.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDocDate() {
        return docDate;
    }

    /**
     * Define el valor de la propiedad docDate.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDocDate(XMLGregorianCalendar value) {
        this.docDate = value;
    }

    /**
     * Obtiene el valor de la propiedad docDueDate.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDocDueDate() {
        return docDueDate;
    }

    /**
     * Define el valor de la propiedad docDueDate.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDocDueDate(XMLGregorianCalendar value) {
        this.docDueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad cardCode.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * Define el valor de la propiedad cardCode.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCardCode(String value) {
        this.cardCode = value;
    }

    /**
     * Obtiene el valor de la propiedad cardName.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * Define el valor de la propiedad cardName.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCardName(String value) {
        this.cardName = value;
    }

    /**
     * Obtiene el valor de la propiedad address.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddress() {
        return address;
    }

    /**
     * Define el valor de la propiedad address.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Obtiene el valor de la propiedad numAtCard.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumAtCard() {
        return numAtCard;
    }

    /**
     * Define el valor de la propiedad numAtCard.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumAtCard(String value) {
        this.numAtCard = value;
    }

    /**
     * Obtiene el valor de la propiedad docTotal.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getDocTotal() {
        return docTotal;
    }

    /**
     * Define el valor de la propiedad docTotal.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setDocTotal(BigDecimal value) {
        this.docTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad attachmentEntry.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getAttachmentEntry() {
        return attachmentEntry;
    }

    /**
     * Define el valor de la propiedad attachmentEntry.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setAttachmentEntry(Long value) {
        this.attachmentEntry = value;
    }

    /**
     * Obtiene el valor de la propiedad docCurrency.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDocCurrency() {
        return docCurrency;
    }

    /**
     * Define el valor de la propiedad docCurrency.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocCurrency(String value) {
        this.docCurrency = value;
    }

    /**
     * Obtiene el valor de la propiedad docRate.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getDocRate() {
        return docRate;
    }

    /**
     * Define el valor de la propiedad docRate.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setDocRate(BigDecimal value) {
        this.docRate = value;
    }

    /**
     * Obtiene el valor de la propiedad reference1.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReference1() {
        return reference1;
    }

    /**
     * Define el valor de la propiedad reference1.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReference1(String value) {
        this.reference1 = value;
    }

    /**
     * Obtiene el valor de la propiedad reference2.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReference2() {
        return reference2;
    }

    /**
     * Define el valor de la propiedad reference2.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReference2(String value) {
        this.reference2 = value;
    }

    /**
     * Obtiene el valor de la propiedad comments.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getComments() {
        return comments;
    }

    /**
     * Define el valor de la propiedad comments.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Obtiene el valor de la propiedad journalMemo.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getJournalMemo() {
        return journalMemo;
    }

    /**
     * Define el valor de la propiedad journalMemo.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setJournalMemo(String value) {
        this.journalMemo = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentGroupCode.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getPaymentGroupCode() {
        return paymentGroupCode;
    }

    /**
     * Define el valor de la propiedad paymentGroupCode.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setPaymentGroupCode(Long value) {
        this.paymentGroupCode = value;
    }

    /**
     * Obtiene el valor de la propiedad docTime.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDocTime() {
        return docTime;
    }

    /**
     * Define el valor de la propiedad docTime.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDocTime(XMLGregorianCalendar value) {
        this.docTime = value;
    }

    /**
     * Obtiene el valor de la propiedad salesPersonCode.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getSalesPersonCode() {
        return salesPersonCode;
    }

    /**
     * Define el valor de la propiedad salesPersonCode.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setSalesPersonCode(Long value) {
        this.salesPersonCode = value;
    }

    /**
     * Obtiene el valor de la propiedad transportationCode.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getTransportationCode() {
        return transportationCode;
    }

    /**
     * Define el valor de la propiedad transportationCode.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setTransportationCode(Long value) {
        this.transportationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad confirmed.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getConfirmed() {
        return confirmed;
    }

    /**
     * Define el valor de la propiedad confirmed.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setConfirmed(String value) {
        this.confirmed = value;
    }

    /**
     * Obtiene el valor de la propiedad importFileNum.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getImportFileNum() {
        return importFileNum;
    }

    /**
     * Define el valor de la propiedad importFileNum.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setImportFileNum(Long value) {
        this.importFileNum = value;
    }

    /**
     * Obtiene el valor de la propiedad summeryType.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSummeryType() {
        return summeryType;
    }

    /**
     * Define el valor de la propiedad summeryType.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSummeryType(String value) {
        this.summeryType = value;
    }

    /**
     * Obtiene el valor de la propiedad contactPersonCode.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getContactPersonCode() {
        return contactPersonCode;
    }

    /**
     * Define el valor de la propiedad contactPersonCode.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setContactPersonCode(Long value) {
        this.contactPersonCode = value;
    }

    /**
     * Obtiene el valor de la propiedad showSCN.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getShowSCN() {
        return showSCN;
    }

    /**
     * Define el valor de la propiedad showSCN.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setShowSCN(String value) {
        this.showSCN = value;
    }

    /**
     * Obtiene el valor de la propiedad series.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getSeries() {
        return series;
    }

    /**
     * Define el valor de la propiedad series.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setSeries(Long value) {
        this.series = value;
    }

    /**
     * Obtiene el valor de la propiedad taxDate.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getTaxDate() {
        return taxDate;
    }

    /**
     * Define el valor de la propiedad taxDate.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setTaxDate(XMLGregorianCalendar value) {
        this.taxDate = value;
    }

    /**
     * Obtiene el valor de la propiedad partialSupply.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPartialSupply() {
        return partialSupply;
    }

    /**
     * Define el valor de la propiedad partialSupply.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPartialSupply(String value) {
        this.partialSupply = value;
    }

    /**
     * Obtiene el valor de la propiedad docObjectCode.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDocObjectCode() {
        return docObjectCode;
    }

    /**
     * Define el valor de la propiedad docObjectCode.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocObjectCode(String value) {
        this.docObjectCode = value;
    }

    /**
     * Obtiene el valor de la propiedad shipToCode.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getShipToCode() {
        return shipToCode;
    }

    /**
     * Define el valor de la propiedad shipToCode.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setShipToCode(String value) {
        this.shipToCode = value;
    }

    /**
     * Obtiene el valor de la propiedad indicator.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIndicator() {
        return indicator;
    }

    /**
     * Define el valor de la propiedad indicator.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIndicator(String value) {
        this.indicator = value;
    }

    /**
     * Obtiene el valor de la propiedad federalTaxID.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFederalTaxID() {
        return federalTaxID;
    }

    /**
     * Define el valor de la propiedad federalTaxID.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFederalTaxID(String value) {
        this.federalTaxID = value;
    }

    /**
     * Obtiene el valor de la propiedad discountPercent.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Define el valor de la propiedad discountPercent.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setDiscountPercent(BigDecimal value) {
        this.discountPercent = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentReference.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaymentReference() {
        return paymentReference;
    }

    /**
     * Define el valor de la propiedad paymentReference.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaymentReference(String value) {
        this.paymentReference = value;
    }

    /**
     * Obtiene el valor de la propiedad creationDate.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Define el valor de la propiedad creationDate.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad updateDate.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Define el valor de la propiedad updateDate.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

    /**
     * Obtiene el valor de la propiedad financialPeriod.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getFinancialPeriod() {
        return financialPeriod;
    }

    /**
     * Define el valor de la propiedad financialPeriod.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setFinancialPeriod(Long value) {
        this.financialPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad transNum.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getTransNum() {
        return transNum;
    }

    /**
     * Define el valor de la propiedad transNum.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setTransNum(Long value) {
        this.transNum = value;
    }

    /**
     * Obtiene el valor de la propiedad vatSum.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getVatSum() {
        return vatSum;
    }

    /**
     * Define el valor de la propiedad vatSum.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setVatSum(BigDecimal value) {
        this.vatSum = value;
    }

    /**
     * Obtiene el valor de la propiedad vatSumSys.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getVatSumSys() {
        return vatSumSys;
    }

    /**
     * Define el valor de la propiedad vatSumSys.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setVatSumSys(BigDecimal value) {
        this.vatSumSys = value;
    }

    /**
     * Obtiene el valor de la propiedad vatSumFc.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getVatSumFc() {
        return vatSumFc;
    }

    /**
     * Define el valor de la propiedad vatSumFc.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setVatSumFc(BigDecimal value) {
        this.vatSumFc = value;
    }

    /**
     * Obtiene el valor de la propiedad netProcedure.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNetProcedure() {
        return netProcedure;
    }

    /**
     * Define el valor de la propiedad netProcedure.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNetProcedure(String value) {
        this.netProcedure = value;
    }

    /**
     * Obtiene el valor de la propiedad docTotalFc.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getDocTotalFc() {
        return docTotalFc;
    }

    /**
     * Define el valor de la propiedad docTotalFc.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setDocTotalFc(BigDecimal value) {
        this.docTotalFc = value;
    }

    /**
     * Obtiene el valor de la propiedad docTotalSys.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getDocTotalSys() {
        return docTotalSys;
    }

    /**
     * Define el valor de la propiedad docTotalSys.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setDocTotalSys(BigDecimal value) {
        this.docTotalSys = value;
    }

    /**
     * Obtiene el valor de la propiedad form1099.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getForm1099() {
        return form1099;
    }

    /**
     * Define el valor de la propiedad form1099.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setForm1099(Long value) {
        this.form1099 = value;
    }

    /**
     * Obtiene el valor de la propiedad box1099.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBox1099() {
        return box1099;
    }

    /**
     * Define el valor de la propiedad box1099.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBox1099(String value) {
        this.box1099 = value;
    }

    /**
     * Obtiene el valor de la propiedad revisionPo.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRevisionPo() {
        return revisionPo;
    }

    /**
     * Define el valor de la propiedad revisionPo.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRevisionPo(String value) {
        this.revisionPo = value;
    }

    /**
     * Obtiene el valor de la propiedad requriedDate.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getRequriedDate() {
        return requriedDate;
    }

    /**
     * Define el valor de la propiedad requriedDate.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setRequriedDate(XMLGregorianCalendar value) {
        this.requriedDate = value;
    }

    /**
     * Obtiene el valor de la propiedad cancelDate.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCancelDate() {
        return cancelDate;
    }

    /**
     * Define el valor de la propiedad cancelDate.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setCancelDate(XMLGregorianCalendar value) {
        this.cancelDate = value;
    }

    /**
     * Obtiene el valor de la propiedad blockDunning.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBlockDunning() {
        return blockDunning;
    }

    /**
     * Define el valor de la propiedad blockDunning.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBlockDunning(String value) {
        this.blockDunning = value;
    }

    /**
     * Obtiene el valor de la propiedad submitted.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubmitted() {
        return submitted;
    }

    /**
     * Define el valor de la propiedad submitted.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubmitted(String value) {
        this.submitted = value;
    }

    /**
     * Obtiene el valor de la propiedad segment.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getSegment() {
        return segment;
    }

    /**
     * Define el valor de la propiedad segment.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setSegment(Long value) {
        this.segment = value;
    }

    /**
     * Obtiene el valor de la propiedad pickStatus.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPickStatus() {
        return pickStatus;
    }

    /**
     * Define el valor de la propiedad pickStatus.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPickStatus(String value) {
        this.pickStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad pick.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPick() {
        return pick;
    }

    /**
     * Define el valor de la propiedad pick.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPick(String value) {
        this.pick = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentMethod.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Define el valor de la propiedad paymentMethod.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentBlock.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaymentBlock() {
        return paymentBlock;
    }

    /**
     * Define el valor de la propiedad paymentBlock.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaymentBlock(String value) {
        this.paymentBlock = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentBlockEntry.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getPaymentBlockEntry() {
        return paymentBlockEntry;
    }

    /**
     * Define el valor de la propiedad paymentBlockEntry.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setPaymentBlockEntry(Long value) {
        this.paymentBlockEntry = value;
    }

    /**
     * Obtiene el valor de la propiedad centralBankIndicator.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCentralBankIndicator() {
        return centralBankIndicator;
    }

    /**
     * Define el valor de la propiedad centralBankIndicator.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCentralBankIndicator(String value) {
        this.centralBankIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumCashDiscount.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMaximumCashDiscount() {
        return maximumCashDiscount;
    }

    /**
     * Define el valor de la propiedad maximumCashDiscount.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMaximumCashDiscount(String value) {
        this.maximumCashDiscount = value;
    }

    /**
     * Obtiene el valor de la propiedad reserve.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReserve() {
        return reserve;
    }

    /**
     * Define el valor de la propiedad reserve.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReserve(String value) {
        this.reserve = value;
    }

    /**
     * Obtiene el valor de la propiedad project.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProject() {
        return project;
    }

    /**
     * Define el valor de la propiedad project.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProject(String value) {
        this.project = value;
    }

    /**
     * Obtiene el valor de la propiedad exemptionValidityDateFrom.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getExemptionValidityDateFrom() {
        return exemptionValidityDateFrom;
    }

    /**
     * Define el valor de la propiedad exemptionValidityDateFrom.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setExemptionValidityDateFrom(XMLGregorianCalendar value) {
        this.exemptionValidityDateFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad exemptionValidityDateTo.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getExemptionValidityDateTo() {
        return exemptionValidityDateTo;
    }

    /**
     * Define el valor de la propiedad exemptionValidityDateTo.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setExemptionValidityDateTo(XMLGregorianCalendar value) {
        this.exemptionValidityDateTo = value;
    }

    /**
     * Obtiene el valor de la propiedad wareHouseUpdateType.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWareHouseUpdateType() {
        return wareHouseUpdateType;
    }

    /**
     * Define el valor de la propiedad wareHouseUpdateType.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWareHouseUpdateType(String value) {
        this.wareHouseUpdateType = value;
    }

    /**
     * Obtiene el valor de la propiedad rounding.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRounding() {
        return rounding;
    }

    /**
     * Define el valor de la propiedad rounding.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRounding(String value) {
        this.rounding = value;
    }

    /**
     * Obtiene el valor de la propiedad externalCorrectedDocNum.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExternalCorrectedDocNum() {
        return externalCorrectedDocNum;
    }

    /**
     * Define el valor de la propiedad externalCorrectedDocNum.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExternalCorrectedDocNum(String value) {
        this.externalCorrectedDocNum = value;
    }

    /**
     * Obtiene el valor de la propiedad internalCorrectedDocNum.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getInternalCorrectedDocNum() {
        return internalCorrectedDocNum;
    }

    /**
     * Define el valor de la propiedad internalCorrectedDocNum.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setInternalCorrectedDocNum(Long value) {
        this.internalCorrectedDocNum = value;
    }

    /**
     * Obtiene el valor de la propiedad nextCorrectingDocument.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getNextCorrectingDocument() {
        return nextCorrectingDocument;
    }

    /**
     * Define el valor de la propiedad nextCorrectingDocument.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setNextCorrectingDocument(Long value) {
        this.nextCorrectingDocument = value;
    }

    /**
     * Obtiene el valor de la propiedad deferredTax.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDeferredTax() {
        return deferredTax;
    }

    /**
     * Define el valor de la propiedad deferredTax.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDeferredTax(String value) {
        this.deferredTax = value;
    }

    /**
     * Obtiene el valor de la propiedad taxExemptionLetterNum.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTaxExemptionLetterNum() {
        return taxExemptionLetterNum;
    }

    /**
     * Define el valor de la propiedad taxExemptionLetterNum.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTaxExemptionLetterNum(String value) {
        this.taxExemptionLetterNum = value;
    }

    /**
     * Obtiene el valor de la propiedad wtApplied.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getWTApplied() {
        return wtApplied;
    }

    /**
     * Define el valor de la propiedad wtApplied.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setWTApplied(BigDecimal value) {
        this.wtApplied = value;
    }

    /**
     * Obtiene el valor de la propiedad wtAppliedFC.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getWTAppliedFC() {
        return wtAppliedFC;
    }

    /**
     * Define el valor de la propiedad wtAppliedFC.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setWTAppliedFC(BigDecimal value) {
        this.wtAppliedFC = value;
    }

    /**
     * Obtiene el valor de la propiedad billOfExchangeReserved.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBillOfExchangeReserved() {
        return billOfExchangeReserved;
    }

    /**
     * Define el valor de la propiedad billOfExchangeReserved.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBillOfExchangeReserved(String value) {
        this.billOfExchangeReserved = value;
    }

    /**
     * Obtiene el valor de la propiedad agentCode.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAgentCode() {
        return agentCode;
    }

    /**
     * Define el valor de la propiedad agentCode.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAgentCode(String value) {
        this.agentCode = value;
    }

    /**
     * Obtiene el valor de la propiedad wtAppliedSC.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getWTAppliedSC() {
        return wtAppliedSC;
    }

    /**
     * Define el valor de la propiedad wtAppliedSC.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setWTAppliedSC(BigDecimal value) {
        this.wtAppliedSC = value;
    }

    /**
     * Obtiene el valor de la propiedad totalEqualizationTax.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTotalEqualizationTax() {
        return totalEqualizationTax;
    }

    /**
     * Define el valor de la propiedad totalEqualizationTax.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTotalEqualizationTax(BigDecimal value) {
        this.totalEqualizationTax = value;
    }

    /**
     * Obtiene el valor de la propiedad totalEqualizationTaxFC.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTotalEqualizationTaxFC() {
        return totalEqualizationTaxFC;
    }

    /**
     * Define el valor de la propiedad totalEqualizationTaxFC.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTotalEqualizationTaxFC(BigDecimal value) {
        this.totalEqualizationTaxFC = value;
    }

    /**
     * Obtiene el valor de la propiedad totalEqualizationTaxSC.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTotalEqualizationTaxSC() {
        return totalEqualizationTaxSC;
    }

    /**
     * Define el valor de la propiedad totalEqualizationTaxSC.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTotalEqualizationTaxSC(BigDecimal value) {
        this.totalEqualizationTaxSC = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfInstallments.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getNumberOfInstallments() {
        return numberOfInstallments;
    }

    /**
     * Define el valor de la propiedad numberOfInstallments.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setNumberOfInstallments(Long value) {
        this.numberOfInstallments = value;
    }

    /**
     * Obtiene el valor de la propiedad applyTaxOnFirstInstallment.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApplyTaxOnFirstInstallment() {
        return applyTaxOnFirstInstallment;
    }

    /**
     * Define el valor de la propiedad applyTaxOnFirstInstallment.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApplyTaxOnFirstInstallment(String value) {
        this.applyTaxOnFirstInstallment = value;
    }

    /**
     * Obtiene el valor de la propiedad wtNonSubjectAmount.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getWTNonSubjectAmount() {
        return wtNonSubjectAmount;
    }

    /**
     * Define el valor de la propiedad wtNonSubjectAmount.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setWTNonSubjectAmount(BigDecimal value) {
        this.wtNonSubjectAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad wtNonSubjectAmountSC.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getWTNonSubjectAmountSC() {
        return wtNonSubjectAmountSC;
    }

    /**
     * Define el valor de la propiedad wtNonSubjectAmountSC.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setWTNonSubjectAmountSC(BigDecimal value) {
        this.wtNonSubjectAmountSC = value;
    }

    /**
     * Obtiene el valor de la propiedad wtNonSubjectAmountFC.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getWTNonSubjectAmountFC() {
        return wtNonSubjectAmountFC;
    }

    /**
     * Define el valor de la propiedad wtNonSubjectAmountFC.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setWTNonSubjectAmountFC(BigDecimal value) {
        this.wtNonSubjectAmountFC = value;
    }

    /**
     * Obtiene el valor de la propiedad wtExemptedAmount.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getWTExemptedAmount() {
        return wtExemptedAmount;
    }

    /**
     * Define el valor de la propiedad wtExemptedAmount.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setWTExemptedAmount(BigDecimal value) {
        this.wtExemptedAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad wtExemptedAmountSC.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getWTExemptedAmountSC() {
        return wtExemptedAmountSC;
    }

    /**
     * Define el valor de la propiedad wtExemptedAmountSC.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setWTExemptedAmountSC(BigDecimal value) {
        this.wtExemptedAmountSC = value;
    }

    /**
     * Obtiene el valor de la propiedad wtExemptedAmountFC.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getWTExemptedAmountFC() {
        return wtExemptedAmountFC;
    }

    /**
     * Define el valor de la propiedad wtExemptedAmountFC.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setWTExemptedAmountFC(BigDecimal value) {
        this.wtExemptedAmountFC = value;
    }

    /**
     * Obtiene el valor de la propiedad baseAmount.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getBaseAmount() {
        return baseAmount;
    }

    /**
     * Define el valor de la propiedad baseAmount.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setBaseAmount(BigDecimal value) {
        this.baseAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad baseAmountSC.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getBaseAmountSC() {
        return baseAmountSC;
    }

    /**
     * Define el valor de la propiedad baseAmountSC.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setBaseAmountSC(BigDecimal value) {
        this.baseAmountSC = value;
    }

    /**
     * Obtiene el valor de la propiedad baseAmountFC.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getBaseAmountFC() {
        return baseAmountFC;
    }

    /**
     * Define el valor de la propiedad baseAmountFC.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setBaseAmountFC(BigDecimal value) {
        this.baseAmountFC = value;
    }

    /**
     * Obtiene el valor de la propiedad wtAmount.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getWTAmount() {
        return wtAmount;
    }

    /**
     * Define el valor de la propiedad wtAmount.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setWTAmount(BigDecimal value) {
        this.wtAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad wtAmountSC.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getWTAmountSC() {
        return wtAmountSC;
    }

    /**
     * Define el valor de la propiedad wtAmountSC.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setWTAmountSC(BigDecimal value) {
        this.wtAmountSC = value;
    }

    /**
     * Obtiene el valor de la propiedad wtAmountFC.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getWTAmountFC() {
        return wtAmountFC;
    }

    /**
     * Define el valor de la propiedad wtAmountFC.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setWTAmountFC(BigDecimal value) {
        this.wtAmountFC = value;
    }

    /**
     * Obtiene el valor de la propiedad vatDate.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getVatDate() {
        return vatDate;
    }

    /**
     * Define el valor de la propiedad vatDate.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setVatDate(XMLGregorianCalendar value) {
        this.vatDate = value;
    }

    /**
     * Obtiene el valor de la propiedad documentsOwner.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getDocumentsOwner() {
        return documentsOwner;
    }

    /**
     * Define el valor de la propiedad documentsOwner.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setDocumentsOwner(Long value) {
        this.documentsOwner = value;
    }

    /**
     * Obtiene el valor de la propiedad folioPrefixString.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFolioPrefixString() {
        return folioPrefixString;
    }

    /**
     * Define el valor de la propiedad folioPrefixString.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFolioPrefixString(String value) {
        this.folioPrefixString = value;
    }

    /**
     * Obtiene el valor de la propiedad folioNumber.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getFolioNumber() {
        return folioNumber;
    }

    /**
     * Define el valor de la propiedad folioNumber.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setFolioNumber(Long value) {
        this.folioNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad documentSubType.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDocumentSubType() {
        return documentSubType;
    }

    /**
     * Define el valor de la propiedad documentSubType.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocumentSubType(String value) {
        this.documentSubType = value;
    }

    /**
     * Obtiene el valor de la propiedad bpChannelCode.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBPChannelCode() {
        return bpChannelCode;
    }

    /**
     * Define el valor de la propiedad bpChannelCode.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBPChannelCode(String value) {
        this.bpChannelCode = value;
    }

    /**
     * Obtiene el valor de la propiedad bpChannelContact.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getBPChannelContact() {
        return bpChannelContact;
    }

    /**
     * Define el valor de la propiedad bpChannelContact.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setBPChannelContact(Long value) {
        this.bpChannelContact = value;
    }

    /**
     * Obtiene el valor de la propiedad address2.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Define el valor de la propiedad address2.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Obtiene el valor de la propiedad documentStatus.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDocumentStatus() {
        return documentStatus;
    }

    /**
     * Define el valor de la propiedad documentStatus.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocumentStatus(String value) {
        this.documentStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad periodIndicator.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPeriodIndicator() {
        return periodIndicator;
    }

    /**
     * Define el valor de la propiedad periodIndicator.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPeriodIndicator(String value) {
        this.periodIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad payToCode.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPayToCode() {
        return payToCode;
    }

    /**
     * Define el valor de la propiedad payToCode.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPayToCode(String value) {
        this.payToCode = value;
    }

    /**
     * Obtiene el valor de la propiedad manualNumber.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getManualNumber() {
        return manualNumber;
    }

    /**
     * Define el valor de la propiedad manualNumber.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setManualNumber(String value) {
        this.manualNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad useShpdGoodsAct.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUseShpdGoodsAct() {
        return useShpdGoodsAct;
    }

    /**
     * Define el valor de la propiedad useShpdGoodsAct.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUseShpdGoodsAct(String value) {
        this.useShpdGoodsAct = value;
    }

    /**
     * Obtiene el valor de la propiedad isPayToBank.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIsPayToBank() {
        return isPayToBank;
    }

    /**
     * Define el valor de la propiedad isPayToBank.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsPayToBank(String value) {
        this.isPayToBank = value;
    }

    /**
     * Obtiene el valor de la propiedad payToBankCountry.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPayToBankCountry() {
        return payToBankCountry;
    }

    /**
     * Define el valor de la propiedad payToBankCountry.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPayToBankCountry(String value) {
        this.payToBankCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad payToBankCode.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPayToBankCode() {
        return payToBankCode;
    }

    /**
     * Define el valor de la propiedad payToBankCode.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPayToBankCode(String value) {
        this.payToBankCode = value;
    }

    /**
     * Obtiene el valor de la propiedad payToBankAccountNo.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPayToBankAccountNo() {
        return payToBankAccountNo;
    }

    /**
     * Define el valor de la propiedad payToBankAccountNo.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPayToBankAccountNo(String value) {
        this.payToBankAccountNo = value;
    }

    /**
     * Obtiene el valor de la propiedad payToBankBranch.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPayToBankBranch() {
        return payToBankBranch;
    }

    /**
     * Define el valor de la propiedad payToBankBranch.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPayToBankBranch(String value) {
        this.payToBankBranch = value;
    }

    /**
     * Obtiene el valor de la propiedad bplidAssignedToInvoice.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getBPLIDAssignedToInvoice() {
        return bplidAssignedToInvoice;
    }

    /**
     * Define el valor de la propiedad bplidAssignedToInvoice.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setBPLIDAssignedToInvoice(Long value) {
        this.bplidAssignedToInvoice = value;
    }

    /**
     * Obtiene el valor de la propiedad downPayment.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getDownPayment() {
        return downPayment;
    }

    /**
     * Define el valor de la propiedad downPayment.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setDownPayment(BigDecimal value) {
        this.downPayment = value;
    }

    /**
     * Obtiene el valor de la propiedad reserveInvoice.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReserveInvoice() {
        return reserveInvoice;
    }

    /**
     * Define el valor de la propiedad reserveInvoice.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReserveInvoice(String value) {
        this.reserveInvoice = value;
    }

    /**
     * Obtiene el valor de la propiedad languageCode.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getLanguageCode() {
        return languageCode;
    }

    /**
     * Define el valor de la propiedad languageCode.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setLanguageCode(Long value) {
        this.languageCode = value;
    }

    /**
     * Obtiene el valor de la propiedad trackingNumber.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Define el valor de la propiedad trackingNumber.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad pickRemark.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPickRemark() {
        return pickRemark;
    }

    /**
     * Define el valor de la propiedad pickRemark.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPickRemark(String value) {
        this.pickRemark = value;
    }

    /**
     * Obtiene el valor de la propiedad closingDate.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getClosingDate() {
        return closingDate;
    }

    /**
     * Define el valor de la propiedad closingDate.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setClosingDate(XMLGregorianCalendar value) {
        this.closingDate = value;
    }

    /**
     * Obtiene el valor de la propiedad sequenceCode.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getSequenceCode() {
        return sequenceCode;
    }

    /**
     * Define el valor de la propiedad sequenceCode.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setSequenceCode(Long value) {
        this.sequenceCode = value;
    }

    /**
     * Obtiene el valor de la propiedad sequenceSerial.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getSequenceSerial() {
        return sequenceSerial;
    }

    /**
     * Define el valor de la propiedad sequenceSerial.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setSequenceSerial(Long value) {
        this.sequenceSerial = value;
    }

    /**
     * Obtiene el valor de la propiedad seriesString.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSeriesString() {
        return seriesString;
    }

    /**
     * Define el valor de la propiedad seriesString.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSeriesString(String value) {
        this.seriesString = value;
    }

    /**
     * Obtiene el valor de la propiedad subSeriesString.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubSeriesString() {
        return subSeriesString;
    }

    /**
     * Define el valor de la propiedad subSeriesString.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubSeriesString(String value) {
        this.subSeriesString = value;
    }

    /**
     * Obtiene el valor de la propiedad sequenceModel.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSequenceModel() {
        return sequenceModel;
    }

    /**
     * Define el valor de la propiedad sequenceModel.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSequenceModel(String value) {
        this.sequenceModel = value;
    }

    /**
     * Obtiene el valor de la propiedad useCorrectionVATGroup.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUseCorrectionVATGroup() {
        return useCorrectionVATGroup;
    }

    /**
     * Define el valor de la propiedad useCorrectionVATGroup.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUseCorrectionVATGroup(String value) {
        this.useCorrectionVATGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad totalDiscount.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTotalDiscount() {
        return totalDiscount;
    }

    /**
     * Define el valor de la propiedad totalDiscount.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTotalDiscount(BigDecimal value) {
        this.totalDiscount = value;
    }

    /**
     * Obtiene el valor de la propiedad downPaymentAmount.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getDownPaymentAmount() {
        return downPaymentAmount;
    }

    /**
     * Define el valor de la propiedad downPaymentAmount.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setDownPaymentAmount(BigDecimal value) {
        this.downPaymentAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad downPaymentPercentage.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getDownPaymentPercentage() {
        return downPaymentPercentage;
    }

    /**
     * Define el valor de la propiedad downPaymentPercentage.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setDownPaymentPercentage(BigDecimal value) {
        this.downPaymentPercentage = value;
    }

    /**
     * Obtiene el valor de la propiedad downPaymentType.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDownPaymentType() {
        return downPaymentType;
    }

    /**
     * Define el valor de la propiedad downPaymentType.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDownPaymentType(String value) {
        this.downPaymentType = value;
    }

    /**
     * Obtiene el valor de la propiedad downPaymentAmountSC.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getDownPaymentAmountSC() {
        return downPaymentAmountSC;
    }

    /**
     * Define el valor de la propiedad downPaymentAmountSC.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setDownPaymentAmountSC(BigDecimal value) {
        this.downPaymentAmountSC = value;
    }

    /**
     * Obtiene el valor de la propiedad downPaymentAmountFC.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getDownPaymentAmountFC() {
        return downPaymentAmountFC;
    }

    /**
     * Define el valor de la propiedad downPaymentAmountFC.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setDownPaymentAmountFC(BigDecimal value) {
        this.downPaymentAmountFC = value;
    }

    /**
     * Obtiene el valor de la propiedad vatPercent.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getVatPercent() {
        return vatPercent;
    }

    /**
     * Define el valor de la propiedad vatPercent.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setVatPercent(BigDecimal value) {
        this.vatPercent = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceGrossProfitPercent.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getServiceGrossProfitPercent() {
        return serviceGrossProfitPercent;
    }

    /**
     * Define el valor de la propiedad serviceGrossProfitPercent.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setServiceGrossProfitPercent(BigDecimal value) {
        this.serviceGrossProfitPercent = value;
    }

    /**
     * Obtiene el valor de la propiedad openingRemarks.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOpeningRemarks() {
        return openingRemarks;
    }

    /**
     * Define el valor de la propiedad openingRemarks.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOpeningRemarks(String value) {
        this.openingRemarks = value;
    }

    /**
     * Obtiene el valor de la propiedad closingRemarks.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getClosingRemarks() {
        return closingRemarks;
    }

    /**
     * Define el valor de la propiedad closingRemarks.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setClosingRemarks(String value) {
        this.closingRemarks = value;
    }

    /**
     * Obtiene el valor de la propiedad roundingDiffAmount.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getRoundingDiffAmount() {
        return roundingDiffAmount;
    }

    /**
     * Define el valor de la propiedad roundingDiffAmount.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setRoundingDiffAmount(BigDecimal value) {
        this.roundingDiffAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad roundingDiffAmountFC.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getRoundingDiffAmountFC() {
        return roundingDiffAmountFC;
    }

    /**
     * Define el valor de la propiedad roundingDiffAmountFC.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setRoundingDiffAmountFC(BigDecimal value) {
        this.roundingDiffAmountFC = value;
    }

    /**
     * Obtiene el valor de la propiedad roundingDiffAmountSC.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getRoundingDiffAmountSC() {
        return roundingDiffAmountSC;
    }

    /**
     * Define el valor de la propiedad roundingDiffAmountSC.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setRoundingDiffAmountSC(BigDecimal value) {
        this.roundingDiffAmountSC = value;
    }

    /**
     * Obtiene el valor de la propiedad cancelled.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCancelled() {
        return cancelled;
    }

    /**
     * Define el valor de la propiedad cancelled.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCancelled(String value) {
        this.cancelled = value;
    }

    /**
     * Obtiene el valor de la propiedad signatureInputMessage.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSignatureInputMessage() {
        return signatureInputMessage;
    }

    /**
     * Define el valor de la propiedad signatureInputMessage.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSignatureInputMessage(String value) {
        this.signatureInputMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad signatureDigest.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSignatureDigest() {
        return signatureDigest;
    }

    /**
     * Define el valor de la propiedad signatureDigest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSignatureDigest(String value) {
        this.signatureDigest = value;
    }

    /**
     * Obtiene el valor de la propiedad certificationNumber.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCertificationNumber() {
        return certificationNumber;
    }

    /**
     * Define el valor de la propiedad certificationNumber.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCertificationNumber(String value) {
        this.certificationNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad privateKeyVersion.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getPrivateKeyVersion() {
        return privateKeyVersion;
    }

    /**
     * Define el valor de la propiedad privateKeyVersion.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setPrivateKeyVersion(Long value) {
        this.privateKeyVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad controlAccount.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getControlAccount() {
        return controlAccount;
    }

    /**
     * Define el valor de la propiedad controlAccount.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setControlAccount(String value) {
        this.controlAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad insuranceOperation347.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInsuranceOperation347() {
        return insuranceOperation347;
    }

    /**
     * Define el valor de la propiedad insuranceOperation347.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInsuranceOperation347(String value) {
        this.insuranceOperation347 = value;
    }

    /**
     * Obtiene el valor de la propiedad archiveNonremovableSalesQuotation.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getArchiveNonremovableSalesQuotation() {
        return archiveNonremovableSalesQuotation;
    }

    /**
     * Define el valor de la propiedad archiveNonremovableSalesQuotation.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setArchiveNonremovableSalesQuotation(String value) {
        this.archiveNonremovableSalesQuotation = value;
    }

    /**
     * Obtiene el valor de la propiedad gtsChecker.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getGTSChecker() {
        return gtsChecker;
    }

    /**
     * Define el valor de la propiedad gtsChecker.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setGTSChecker(Long value) {
        this.gtsChecker = value;
    }

    /**
     * Obtiene el valor de la propiedad gtsPayee.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getGTSPayee() {
        return gtsPayee;
    }

    /**
     * Define el valor de la propiedad gtsPayee.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setGTSPayee(Long value) {
        this.gtsPayee = value;
    }

    /**
     * Obtiene el valor de la propiedad extraMonth.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getExtraMonth() {
        return extraMonth;
    }

    /**
     * Define el valor de la propiedad extraMonth.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setExtraMonth(Long value) {
        this.extraMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad extraDays.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getExtraDays() {
        return extraDays;
    }

    /**
     * Define el valor de la propiedad extraDays.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setExtraDays(Long value) {
        this.extraDays = value;
    }

    /**
     * Obtiene el valor de la propiedad cashDiscountDateOffset.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getCashDiscountDateOffset() {
        return cashDiscountDateOffset;
    }

    /**
     * Define el valor de la propiedad cashDiscountDateOffset.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setCashDiscountDateOffset(Long value) {
        this.cashDiscountDateOffset = value;
    }

    /**
     * Obtiene el valor de la propiedad startFrom.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStartFrom() {
        return startFrom;
    }

    /**
     * Define el valor de la propiedad startFrom.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStartFrom(String value) {
        this.startFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad ntsApproved.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNTSApproved() {
        return ntsApproved;
    }

    /**
     * Define el valor de la propiedad ntsApproved.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNTSApproved(String value) {
        this.ntsApproved = value;
    }

    /**
     * Obtiene el valor de la propiedad eTaxWebSite.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getETaxWebSite() {
        return eTaxWebSite;
    }

    /**
     * Define el valor de la propiedad eTaxWebSite.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setETaxWebSite(Long value) {
        this.eTaxWebSite = value;
    }

    /**
     * Obtiene el valor de la propiedad eTaxNumber.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getETaxNumber() {
        return eTaxNumber;
    }

    /**
     * Define el valor de la propiedad eTaxNumber.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setETaxNumber(String value) {
        this.eTaxNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad ntsApprovedNumber.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNTSApprovedNumber() {
        return ntsApprovedNumber;
    }

    /**
     * Define el valor de la propiedad ntsApprovedNumber.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNTSApprovedNumber(String value) {
        this.ntsApprovedNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad eDocGenerationType.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEDocGenerationType() {
        return eDocGenerationType;
    }

    /**
     * Define el valor de la propiedad eDocGenerationType.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEDocGenerationType(String value) {
        this.eDocGenerationType = value;
    }

    /**
     * Obtiene el valor de la propiedad eDocSeries.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getEDocSeries() {
        return eDocSeries;
    }

    /**
     * Define el valor de la propiedad eDocSeries.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setEDocSeries(Long value) {
        this.eDocSeries = value;
    }

    /**
     * Obtiene el valor de la propiedad eDocNum.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEDocNum() {
        return eDocNum;
    }

    /**
     * Define el valor de la propiedad eDocNum.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEDocNum(String value) {
        this.eDocNum = value;
    }

    /**
     * Obtiene el valor de la propiedad eDocExportFormat.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getEDocExportFormat() {
        return eDocExportFormat;
    }

    /**
     * Define el valor de la propiedad eDocExportFormat.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setEDocExportFormat(Long value) {
        this.eDocExportFormat = value;
    }

    /**
     * Obtiene el valor de la propiedad eDocStatus.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEDocStatus() {
        return eDocStatus;
    }

    /**
     * Define el valor de la propiedad eDocStatus.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEDocStatus(String value) {
        this.eDocStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad eDocErrorCode.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEDocErrorCode() {
        return eDocErrorCode;
    }

    /**
     * Define el valor de la propiedad eDocErrorCode.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEDocErrorCode(String value) {
        this.eDocErrorCode = value;
    }

    /**
     * Obtiene el valor de la propiedad eDocErrorMessage.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEDocErrorMessage() {
        return eDocErrorMessage;
    }

    /**
     * Define el valor de la propiedad eDocErrorMessage.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEDocErrorMessage(String value) {
        this.eDocErrorMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad downPaymentStatus.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDownPaymentStatus() {
        return downPaymentStatus;
    }

    /**
     * Define el valor de la propiedad downPaymentStatus.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDownPaymentStatus(String value) {
        this.downPaymentStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad groupSeries.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getGroupSeries() {
        return groupSeries;
    }

    /**
     * Define el valor de la propiedad groupSeries.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setGroupSeries(Long value) {
        this.groupSeries = value;
    }

    /**
     * Obtiene el valor de la propiedad groupNumber.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getGroupNumber() {
        return groupNumber;
    }

    /**
     * Define el valor de la propiedad groupNumber.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setGroupNumber(Long value) {
        this.groupNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad groupHandWritten.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGroupHandWritten() {
        return groupHandWritten;
    }

    /**
     * Define el valor de la propiedad groupHandWritten.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGroupHandWritten(String value) {
        this.groupHandWritten = value;
    }

    /**
     * Obtiene el valor de la propiedad reopenOriginalDocument.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReopenOriginalDocument() {
        return reopenOriginalDocument;
    }

    /**
     * Define el valor de la propiedad reopenOriginalDocument.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReopenOriginalDocument(String value) {
        this.reopenOriginalDocument = value;
    }

    /**
     * Obtiene el valor de la propiedad reopenManuallyClosedOrCanceledDocument.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReopenManuallyClosedOrCanceledDocument() {
        return reopenManuallyClosedOrCanceledDocument;
    }

    /**
     * Define el valor de la propiedad reopenManuallyClosedOrCanceledDocument.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReopenManuallyClosedOrCanceledDocument(String value) {
        this.reopenManuallyClosedOrCanceledDocument = value;
    }

    /**
     * Obtiene el valor de la propiedad createOnlineQuotation.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreateOnlineQuotation() {
        return createOnlineQuotation;
    }

    /**
     * Define el valor de la propiedad createOnlineQuotation.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreateOnlineQuotation(String value) {
        this.createOnlineQuotation = value;
    }

    /**
     * Obtiene el valor de la propiedad posEquipmentNumber.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPOSEquipmentNumber() {
        return posEquipmentNumber;
    }

    /**
     * Define el valor de la propiedad posEquipmentNumber.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPOSEquipmentNumber(String value) {
        this.posEquipmentNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad posManufacturerSerialNumber.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPOSManufacturerSerialNumber() {
        return posManufacturerSerialNumber;
    }

    /**
     * Define el valor de la propiedad posManufacturerSerialNumber.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPOSManufacturerSerialNumber(String value) {
        this.posManufacturerSerialNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad posCashierNumber.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getPOSCashierNumber() {
        return posCashierNumber;
    }

    /**
     * Define el valor de la propiedad posCashierNumber.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setPOSCashierNumber(Long value) {
        this.posCashierNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad applyCurrentVATRatesForDownPaymentsToDraw.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApplyCurrentVATRatesForDownPaymentsToDraw() {
        return applyCurrentVATRatesForDownPaymentsToDraw;
    }

    /**
     * Define el valor de la propiedad applyCurrentVATRatesForDownPaymentsToDraw.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApplyCurrentVATRatesForDownPaymentsToDraw(String value) {
        this.applyCurrentVATRatesForDownPaymentsToDraw = value;
    }

    /**
     * Obtiene el valor de la propiedad closingOption.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getClosingOption() {
        return closingOption;
    }

    /**
     * Define el valor de la propiedad closingOption.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setClosingOption(String value) {
        this.closingOption = value;
    }

    /**
     * Obtiene el valor de la propiedad specifiedClosingDate.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getSpecifiedClosingDate() {
        return specifiedClosingDate;
    }

    /**
     * Define el valor de la propiedad specifiedClosingDate.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setSpecifiedClosingDate(XMLGregorianCalendar value) {
        this.specifiedClosingDate = value;
    }

    /**
     * Obtiene el valor de la propiedad openForLandedCosts.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOpenForLandedCosts() {
        return openForLandedCosts;
    }

    /**
     * Define el valor de la propiedad openForLandedCosts.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOpenForLandedCosts(String value) {
        this.openForLandedCosts = value;
    }

    /**
     * Obtiene el valor de la propiedad authorizationStatus.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAuthorizationStatus() {
        return authorizationStatus;
    }

    /**
     * Define el valor de la propiedad authorizationStatus.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAuthorizationStatus(String value) {
        this.authorizationStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad totalDiscountFC.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTotalDiscountFC() {
        return totalDiscountFC;
    }

    /**
     * Define el valor de la propiedad totalDiscountFC.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTotalDiscountFC(BigDecimal value) {
        this.totalDiscountFC = value;
    }

    /**
     * Obtiene el valor de la propiedad totalDiscountSC.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTotalDiscountSC() {
        return totalDiscountSC;
    }

    /**
     * Define el valor de la propiedad totalDiscountSC.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTotalDiscountSC(BigDecimal value) {
        this.totalDiscountSC = value;
    }

    /**
     * Obtiene el valor de la propiedad relevantToGTS.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRelevantToGTS() {
        return relevantToGTS;
    }

    /**
     * Define el valor de la propiedad relevantToGTS.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRelevantToGTS(String value) {
        this.relevantToGTS = value;
    }

    /**
     * Obtiene el valor de la propiedad bplName.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBPLName() {
        return bplName;
    }

    /**
     * Define el valor de la propiedad bplName.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBPLName(String value) {
        this.bplName = value;
    }

    /**
     * Obtiene el valor de la propiedad vatRegNum.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVATRegNum() {
        return vatRegNum;
    }

    /**
     * Define el valor de la propiedad vatRegNum.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVATRegNum(String value) {
        this.vatRegNum = value;
    }

    /**
     * Obtiene el valor de la propiedad annualInvoiceDeclarationReference.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getAnnualInvoiceDeclarationReference() {
        return annualInvoiceDeclarationReference;
    }

    /**
     * Define el valor de la propiedad annualInvoiceDeclarationReference.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setAnnualInvoiceDeclarationReference(Long value) {
        this.annualInvoiceDeclarationReference = value;
    }

    /**
     * Obtiene el valor de la propiedad supplier.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSupplier() {
        return supplier;
    }

    /**
     * Define el valor de la propiedad supplier.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSupplier(String value) {
        this.supplier = value;
    }

    /**
     * Obtiene el valor de la propiedad releaser.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getReleaser() {
        return releaser;
    }

    /**
     * Define el valor de la propiedad releaser.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setReleaser(Long value) {
        this.releaser = value;
    }

    /**
     * Obtiene el valor de la propiedad receiver.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getReceiver() {
        return receiver;
    }

    /**
     * Define el valor de la propiedad receiver.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setReceiver(Long value) {
        this.receiver = value;
    }

    /**
     * Obtiene el valor de la propiedad blanketAgreementNumber.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getBlanketAgreementNumber() {
        return blanketAgreementNumber;
    }

    /**
     * Define el valor de la propiedad blanketAgreementNumber.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setBlanketAgreementNumber(Long value) {
        this.blanketAgreementNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad isAlteration.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIsAlteration() {
        return isAlteration;
    }

    /**
     * Define el valor de la propiedad isAlteration.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsAlteration(String value) {
        this.isAlteration = value;
    }

    /**
     * Obtiene el valor de la propiedad cancelStatus.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCancelStatus() {
        return cancelStatus;
    }

    /**
     * Define el valor de la propiedad cancelStatus.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCancelStatus(String value) {
        this.cancelStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad assetValueDate.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getAssetValueDate() {
        return assetValueDate;
    }

    /**
     * Define el valor de la propiedad assetValueDate.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setAssetValueDate(XMLGregorianCalendar value) {
        this.assetValueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad documentDelivery.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDocumentDelivery() {
        return documentDelivery;
    }

    /**
     * Define el valor de la propiedad documentDelivery.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocumentDelivery(String value) {
        this.documentDelivery = value;
    }

    /**
     * Obtiene el valor de la propiedad authorizationCode.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Define el valor de la propiedad authorizationCode.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad startDeliveryDate.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getStartDeliveryDate() {
        return startDeliveryDate;
    }

    /**
     * Define el valor de la propiedad startDeliveryDate.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setStartDeliveryDate(XMLGregorianCalendar value) {
        this.startDeliveryDate = value;
    }

    /**
     * Obtiene el valor de la propiedad startDeliveryTime.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getStartDeliveryTime() {
        return startDeliveryTime;
    }

    /**
     * Define el valor de la propiedad startDeliveryTime.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setStartDeliveryTime(XMLGregorianCalendar value) {
        this.startDeliveryTime = value;
    }

    /**
     * Obtiene el valor de la propiedad endDeliveryDate.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getEndDeliveryDate() {
        return endDeliveryDate;
    }

    /**
     * Define el valor de la propiedad endDeliveryDate.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setEndDeliveryDate(XMLGregorianCalendar value) {
        this.endDeliveryDate = value;
    }

    /**
     * Obtiene el valor de la propiedad endDeliveryTime.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getEndDeliveryTime() {
        return endDeliveryTime;
    }

    /**
     * Define el valor de la propiedad endDeliveryTime.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setEndDeliveryTime(XMLGregorianCalendar value) {
        this.endDeliveryTime = value;
    }

    /**
     * Obtiene el valor de la propiedad vehiclePlate.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVehiclePlate() {
        return vehiclePlate;
    }

    /**
     * Define el valor de la propiedad vehiclePlate.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVehiclePlate(String value) {
        this.vehiclePlate = value;
    }

    /**
     * Obtiene el valor de la propiedad atDocumentType.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getATDocumentType() {
        return atDocumentType;
    }

    /**
     * Define el valor de la propiedad atDocumentType.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setATDocumentType(String value) {
        this.atDocumentType = value;
    }

    /**
     * Obtiene el valor de la propiedad elecCommStatus.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getElecCommStatus() {
        return elecCommStatus;
    }

    /**
     * Define el valor de la propiedad elecCommStatus.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setElecCommStatus(String value) {
        this.elecCommStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad elecCommMessage.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getElecCommMessage() {
        return elecCommMessage;
    }

    /**
     * Define el valor de la propiedad elecCommMessage.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setElecCommMessage(String value) {
        this.elecCommMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad reuseDocumentNum.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReuseDocumentNum() {
        return reuseDocumentNum;
    }

    /**
     * Define el valor de la propiedad reuseDocumentNum.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReuseDocumentNum(String value) {
        this.reuseDocumentNum = value;
    }

    /**
     * Obtiene el valor de la propiedad reuseNotaFiscalNum.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReuseNotaFiscalNum() {
        return reuseNotaFiscalNum;
    }

    /**
     * Define el valor de la propiedad reuseNotaFiscalNum.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReuseNotaFiscalNum(String value) {
        this.reuseNotaFiscalNum = value;
    }

    /**
     * Obtiene el valor de la propiedad printSEPADirect.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrintSEPADirect() {
        return printSEPADirect;
    }

    /**
     * Define el valor de la propiedad printSEPADirect.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrintSEPADirect(String value) {
        this.printSEPADirect = value;
    }

    /**
     * Obtiene el valor de la propiedad fiscalDocNum.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFiscalDocNum() {
        return fiscalDocNum;
    }

    /**
     * Define el valor de la propiedad fiscalDocNum.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFiscalDocNum(String value) {
        this.fiscalDocNum = value;
    }

    /**
     * Obtiene el valor de la propiedad posDailySummaryNo.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getPOSDailySummaryNo() {
        return posDailySummaryNo;
    }

    /**
     * Define el valor de la propiedad posDailySummaryNo.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setPOSDailySummaryNo(Long value) {
        this.posDailySummaryNo = value;
    }

    /**
     * Obtiene el valor de la propiedad posReceiptNo.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getPOSReceiptNo() {
        return posReceiptNo;
    }

    /**
     * Define el valor de la propiedad posReceiptNo.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setPOSReceiptNo(Long value) {
        this.posReceiptNo = value;
    }

    /**
     * Obtiene el valor de la propiedad pointOfIssueCode.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPointOfIssueCode() {
        return pointOfIssueCode;
    }

    /**
     * Define el valor de la propiedad pointOfIssueCode.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPointOfIssueCode(String value) {
        this.pointOfIssueCode = value;
    }

    /**
     * Obtiene el valor de la propiedad letter.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLetter() {
        return letter;
    }

    /**
     * Define el valor de la propiedad letter.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLetter(String value) {
        this.letter = value;
    }

    /**
     * Obtiene el valor de la propiedad folioNumberFrom.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getFolioNumberFrom() {
        return folioNumberFrom;
    }

    /**
     * Define el valor de la propiedad folioNumberFrom.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setFolioNumberFrom(Long value) {
        this.folioNumberFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad folioNumberTo.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getFolioNumberTo() {
        return folioNumberTo;
    }

    /**
     * Define el valor de la propiedad folioNumberTo.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setFolioNumberTo(Long value) {
        this.folioNumberTo = value;
    }

    /**
     * Obtiene el valor de la propiedad interimType.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInterimType() {
        return interimType;
    }

    /**
     * Define el valor de la propiedad interimType.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInterimType(String value) {
        this.interimType = value;
    }

    /**
     * Obtiene el valor de la propiedad relatedType.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getRelatedType() {
        return relatedType;
    }

    /**
     * Define el valor de la propiedad relatedType.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setRelatedType(Long value) {
        this.relatedType = value;
    }

    /**
     * Obtiene el valor de la propiedad relatedEntry.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getRelatedEntry() {
        return relatedEntry;
    }

    /**
     * Define el valor de la propiedad relatedEntry.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setRelatedEntry(Long value) {
        this.relatedEntry = value;
    }

    /**
     * Obtiene el valor de la propiedad documentTaxID.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDocumentTaxID() {
        return documentTaxID;
    }

    /**
     * Define el valor de la propiedad documentTaxID.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocumentTaxID(String value) {
        this.documentTaxID = value;
    }

    /**
     * Obtiene el valor de la propiedad dateOfReportingControlStatementVAT.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDateOfReportingControlStatementVAT() {
        return dateOfReportingControlStatementVAT;
    }

    /**
     * Define el valor de la propiedad dateOfReportingControlStatementVAT.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDateOfReportingControlStatementVAT(XMLGregorianCalendar value) {
        this.dateOfReportingControlStatementVAT = value;
    }

    /**
     * Obtiene el valor de la propiedad reportingSectionControlStatementVAT.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReportingSectionControlStatementVAT() {
        return reportingSectionControlStatementVAT;
    }

    /**
     * Define el valor de la propiedad reportingSectionControlStatementVAT.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReportingSectionControlStatementVAT(String value) {
        this.reportingSectionControlStatementVAT = value;
    }

    /**
     * Obtiene el valor de la propiedad excludeFromTaxReportControlStatementVAT.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExcludeFromTaxReportControlStatementVAT() {
        return excludeFromTaxReportControlStatementVAT;
    }

    /**
     * Define el valor de la propiedad excludeFromTaxReportControlStatementVAT.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExcludeFromTaxReportControlStatementVAT(String value) {
        this.excludeFromTaxReportControlStatementVAT = value;
    }

    /**
     * Obtiene el valor de la propiedad posCashRegister.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getPOSCashRegister() {
        return posCashRegister;
    }

    /**
     * Define el valor de la propiedad posCashRegister.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setPOSCashRegister(Long value) {
        this.posCashRegister = value;
    }

    /**
     * Obtiene el valor de la propiedad updateTime.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Define el valor de la propiedad updateTime.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUpdateTime(String value) {
        this.updateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad priceMode.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPriceMode() {
        return priceMode;
    }

    /**
     * Define el valor de la propiedad priceMode.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPriceMode(String value) {
        this.priceMode = value;
    }

    /**
     * Obtiene el valor de la propiedad shipFrom.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getShipFrom() {
        return shipFrom;
    }

    /**
     * Define el valor de la propiedad shipFrom.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setShipFrom(String value) {
        this.shipFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad commissionTrade.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCommissionTrade() {
        return commissionTrade;
    }

    /**
     * Define el valor de la propiedad commissionTrade.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCommissionTrade(String value) {
        this.commissionTrade = value;
    }

    /**
     * Obtiene el valor de la propiedad commissionTradeReturn.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCommissionTradeReturn() {
        return commissionTradeReturn;
    }

    /**
     * Define el valor de la propiedad commissionTradeReturn.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCommissionTradeReturn(String value) {
        this.commissionTradeReturn = value;
    }

    /**
     * Obtiene el valor de la propiedad useBillToAddrToDetermineTax.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUseBillToAddrToDetermineTax() {
        return useBillToAddrToDetermineTax;
    }

    /**
     * Define el valor de la propiedad useBillToAddrToDetermineTax.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUseBillToAddrToDetermineTax(String value) {
        this.useBillToAddrToDetermineTax = value;
    }

    /**
     * Obtiene el valor de la propiedad ubpcost.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUBPCOST() {
        return ubpcost;
    }

    /**
     * Define el valor de la propiedad ubpcost.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUBPCOST(String value) {
        this.ubpcost = value;
    }

    /**
     * Obtiene el valor de la propiedad uwuid.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUWUID() {
        return uwuid;
    }

    /**
     * Define el valor de la propiedad uwuid.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUWUID(String value) {
        this.uwuid = value;
    }

    /**
     * Obtiene el valor de la propiedad uftomaped.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUFTOMAPED() {
        return uftomaped;
    }

    /**
     * Define el valor de la propiedad uftomaped.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUFTOMAPED(XMLGregorianCalendar value) {
        this.uftomaped = value;
    }

    /**
     * Obtiene el valor de la propiedad ucampana.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUCAMPANA() {
        return ucampana;
    }

    /**
     * Define el valor de la propiedad ucampana.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUCAMPANA(String value) {
        this.ucampana = value;
    }

    /**
     * Obtiene el valor de la propiedad utransp.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUTRANSP() {
        return utransp;
    }

    /**
     * Define el valor de la propiedad utransp.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUTRANSP(String value) {
        this.utransp = value;
    }

    /**
     * Obtiene el valor de la propiedad useparador.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUSEPARADOR() {
        return useparador;
    }

    /**
     * Define el valor de la propiedad useparador.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUSEPARADOR(String value) {
        this.useparador = value;
    }

    /**
     * Obtiene el valor de la propiedad udesp.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUDESP() {
        return udesp;
    }

    /**
     * Define el valor de la propiedad udesp.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUDESP(String value) {
        this.udesp = value;
    }

    /**
     * Obtiene el valor de la propiedad uubic1.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUUBIC1() {
        return uubic1;
    }

    /**
     * Define el valor de la propiedad uubic1.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUUBIC1(String value) {
        this.uubic1 = value;
    }

    /**
     * Obtiene el valor de la propiedad uconcnc.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUCONCNC() {
        return uconcnc;
    }

    /**
     * Define el valor de la propiedad uconcnc.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUCONCNC(String value) {
        this.uconcnc = value;
    }

    /**
     * Obtiene el valor de la propiedad uconcnd.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUCONCND() {
        return uconcnd;
    }

    /**
     * Define el valor de la propiedad uconcnd.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUCONCND(String value) {
        this.uconcnd = value;
    }

    /**
     * Obtiene el valor de la propiedad uconcinv.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUCONCINV() {
        return uconcinv;
    }

    /**
     * Define el valor de la propiedad uconcinv.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUCONCINV(String value) {
        this.uconcinv = value;
    }

    /**
     * Obtiene el valor de la propiedad ufembarque.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUFEMBARQUE() {
        return ufembarque;
    }

    /**
     * Define el valor de la propiedad ufembarque.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUFEMBARQUE(XMLGregorianCalendar value) {
        this.ufembarque = value;
    }

    /**
     * Obtiene el valor de la propiedad utermneg.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUTERMNEG() {
        return utermneg;
    }

    /**
     * Define el valor de la propiedad utermneg.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUTERMNEG(String value) {
        this.utermneg = value;
    }

    /**
     * Obtiene el valor de la propiedad umodtransp.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUMODTRANSP() {
        return umodtransp;
    }

    /**
     * Define el valor de la propiedad umodtransp.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUMODTRANSP(String value) {
        this.umodtransp = value;
    }

    /**
     * Obtiene el valor de la propiedad upuertodes.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUPUERTODES() {
        return upuertodes;
    }

    /**
     * Define el valor de la propiedad upuertodes.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUPUERTODES(String value) {
        this.upuertodes = value;
    }

    /**
     * Obtiene el valor de la propiedad umodimp.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUMODIMP() {
        return umodimp;
    }

    /**
     * Define el valor de la propiedad umodimp.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUMODIMP(String value) {
        this.umodimp = value;
    }

    /**
     * Obtiene el valor de la propiedad uestadooc.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUESTADOOC() {
        return uestadooc;
    }

    /**
     * Define el valor de la propiedad uestadooc.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUESTADOOC(String value) {
        this.uestadooc = value;
    }

    /**
     * Obtiene el valor de la propiedad ufproforma.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUFPROFORMA() {
        return ufproforma;
    }

    /**
     * Define el valor de la propiedad ufproforma.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUFPROFORMA(XMLGregorianCalendar value) {
        this.ufproforma = value;
    }

    /**
     * Obtiene el valor de la propiedad uembarcado.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUEMBARCADO() {
        return uembarcado;
    }

    /**
     * Define el valor de la propiedad uembarcado.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUEMBARCADO(String value) {
        this.uembarcado = value;
    }

    /**
     * Obtiene el valor de la propiedad udoctransp.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUDOCTRANSP() {
        return udoctransp;
    }

    /**
     * Define el valor de la propiedad udoctransp.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUDOCTRANSP(String value) {
        this.udoctransp = value;
    }

    /**
     * Obtiene el valor de la propiedad ufdoctransp.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUFDOCTRANSP() {
        return ufdoctransp;
    }

    /**
     * Define el valor de la propiedad ufdoctransp.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUFDOCTRANSP(XMLGregorianCalendar value) {
        this.ufdoctransp = value;
    }

    /**
     * Obtiene el valor de la propiedad ufarribpuerto.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUFARRIBPUERTO() {
        return ufarribpuerto;
    }

    /**
     * Define el valor de la propiedad ufarribpuerto.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUFARRIBPUERTO(XMLGregorianCalendar value) {
        this.ufarribpuerto = value;
    }

    /**
     * Obtiene el valor de la propiedad ufarribalma.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUFARRIBALMA() {
        return ufarribalma;
    }

    /**
     * Define el valor de la propiedad ufarribalma.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUFARRIBALMA(XMLGregorianCalendar value) {
        this.ufarribalma = value;
    }

    /**
     * Obtiene el valor de la propiedad ureqant.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUREQANT() {
        return ureqant;
    }

    /**
     * Define el valor de la propiedad ureqant.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUREQANT(String value) {
        this.ureqant = value;
    }

    /**
     * Obtiene el valor de la propiedad uantrealiz.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUANTREALIZ() {
        return uantrealiz;
    }

    /**
     * Define el valor de la propiedad uantrealiz.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUANTREALIZ(String value) {
        this.uantrealiz = value;
    }

    /**
     * Obtiene el valor de la propiedad utotcaj.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getUTOTCAJ() {
        return utotcaj;
    }

    /**
     * Define el valor de la propiedad utotcaj.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setUTOTCAJ(BigDecimal value) {
        this.utotcaj = value;
    }

    /**
     * Obtiene el valor de la propiedad utotbul.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getUTOTBUL() {
        return utotbul;
    }

    /**
     * Define el valor de la propiedad utotbul.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setUTOTBUL(BigDecimal value) {
        this.utotbul = value;
    }

    /**
     * Obtiene el valor de la propiedad utotlios.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getUTOTLIOS() {
        return utotlios;
    }

    /**
     * Define el valor de la propiedad utotlios.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setUTOTLIOS(BigDecimal value) {
        this.utotlios = value;
    }

    /**
     * Obtiene el valor de la propiedad uvlrfle.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getUVLRFLE() {
        return uvlrfle;
    }

    /**
     * Define el valor de la propiedad uvlrfle.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setUVLRFLE(BigDecimal value) {
        this.uvlrfle = value;
    }

    /**
     * Obtiene el valor de la propiedad uvlrseg.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getUVLRSEG() {
        return uvlrseg;
    }

    /**
     * Define el valor de la propiedad uvlrseg.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setUVLRSEG(BigDecimal value) {
        this.uvlrseg = value;
    }

    /**
     * Obtiene el valor de la propiedad utotfle.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getUTOTFLE() {
        return utotfle;
    }

    /**
     * Define el valor de la propiedad utotfle.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setUTOTFLE(BigDecimal value) {
        this.utotfle = value;
    }

    /**
     * Obtiene el valor de la propiedad uhoraini.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUHORAINI() {
        return uhoraini;
    }

    /**
     * Define el valor de la propiedad uhoraini.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUHORAINI(XMLGregorianCalendar value) {
        this.uhoraini = value;
    }

    /**
     * Obtiene el valor de la propiedad uhorafin.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUHORAFIN() {
        return uhorafin;
    }

    /**
     * Define el valor de la propiedad uhorafin.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUHORAFIN(XMLGregorianCalendar value) {
        this.uhorafin = value;
    }

    /**
     * Obtiene el valor de la propiedad upesobruto.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getUPESOBRUTO() {
        return upesobruto;
    }

    /**
     * Define el valor de la propiedad upesobruto.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setUPESOBRUTO(BigDecimal value) {
        this.upesobruto = value;
    }

    /**
     * Obtiene el valor de la propiedad uautprecio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUAUTPRECIO() {
        return uautprecio;
    }

    /**
     * Define el valor de la propiedad uautprecio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUAUTPRECIO(String value) {
        this.uautprecio = value;
    }

    /**
     * Obtiene el valor de la propiedad uTipoNota.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUTipoNota() {
        return uTipoNota;
    }

    /**
     * Define el valor de la propiedad uTipoNota.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUTipoNota(String value) {
        this.uTipoNota = value;
    }

    /**
     * Obtiene el valor de la propiedad ununfac.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUNUNFAC() {
        return ununfac;
    }

    /**
     * Define el valor de la propiedad ununfac.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUNUNFAC(String value) {
        this.ununfac = value;
    }

    /**
     * Obtiene el valor de la propiedad ufechaentregapro.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUFECHAENTREGAPRO() {
        return ufechaentregapro;
    }

    /**
     * Define el valor de la propiedad ufechaentregapro.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUFECHAENTREGAPRO(XMLGregorianCalendar value) {
        this.ufechaentregapro = value;
    }

    /**
     * Obtiene el valor de la propiedad unumfacimp.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUNUMFACIMP() {
        return unumfacimp;
    }

    /**
     * Define el valor de la propiedad unumfacimp.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUNUMFACIMP(String value) {
        this.unumfacimp = value;
    }

    /**
     * Obtiene el valor de la propiedad utranspimp.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUTRANSPIMP() {
        return utranspimp;
    }

    /**
     * Define el valor de la propiedad utranspimp.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUTRANSPIMP(String value) {
        this.utranspimp = value;
    }

    /**
     * Obtiene el valor de la propiedad utiempoestimado.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getUTIEMPOESTIMADO() {
        return utiempoestimado;
    }

    /**
     * Define el valor de la propiedad utiempoestimado.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setUTIEMPOESTIMADO(BigDecimal value) {
        this.utiempoestimado = value;
    }

    /**
     * Obtiene el valor de la propiedad ufecini.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUFECINI() {
        return ufecini;
    }

    /**
     * Define el valor de la propiedad ufecini.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUFECINI(XMLGregorianCalendar value) {
        this.ufecini = value;
    }

    /**
     * Obtiene el valor de la propiedad ufecfin.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUFECFIN() {
        return ufecfin;
    }

    /**
     * Define el valor de la propiedad ufecfin.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUFECFIN(XMLGregorianCalendar value) {
        this.ufecfin = value;
    }

    /**
     * Obtiene el valor de la propiedad uivcDone.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUIVCDone() {
        return uivcDone;
    }

    /**
     * Define el valor de la propiedad uivcDone.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUIVCDone(String value) {
        this.uivcDone = value;
    }

    /**
     * Obtiene el valor de la propiedad uVendedor2.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUVendedor2() {
        return uVendedor2;
    }

    /**
     * Define el valor de la propiedad uVendedor2.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUVendedor2(String value) {
        this.uVendedor2 = value;
    }

    /**
     * Obtiene el valor de la propiedad uDifCode.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUDifCode() {
        return uDifCode;
    }

    /**
     * Define el valor de la propiedad uDifCode.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUDifCode(String value) {
        this.uDifCode = value;
    }

    /**
     * Obtiene el valor de la propiedad uok1IVAPA.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUOK1IVAPA() {
        return uok1IVAPA;
    }

    /**
     * Define el valor de la propiedad uok1IVAPA.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUOK1IVAPA(String value) {
        this.uok1IVAPA = value;
    }

    /**
     * Obtiene el valor de la propiedad umotdevol.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUMOTDEVOL() {
        return umotdevol;
    }

    /**
     * Define el valor de la propiedad umotdevol.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUMOTDEVOL(String value) {
        this.umotdevol = value;
    }

    /**
     * Obtiene el valor de la propiedad ufechapago.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUFECHAPAGO() {
        return ufechapago;
    }

    /**
     * Define el valor de la propiedad ufechapago.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUFECHAPAGO(XMLGregorianCalendar value) {
        this.ufechapago = value;
    }

    /**
     * Obtiene el valor de la propiedad uantcancelado.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUANTCANCELADO() {
        return uantcancelado;
    }

    /**
     * Define el valor de la propiedad uantcancelado.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUANTCANCELADO(String value) {
        this.uantcancelado = value;
    }

    /**
     * Obtiene el valor de la propiedad uimpcancelado.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUIMPCANCELADO() {
        return uimpcancelado;
    }

    /**
     * Define el valor de la propiedad uimpcancelado.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUIMPCANCELADO(String value) {
        this.uimpcancelado = value;
    }

    /**
     * Obtiene el valor de la propiedad utipoempaque.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUTIPOEMPAQUE() {
        return utipoempaque;
    }

    /**
     * Define el valor de la propiedad utipoempaque.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUTIPOEMPAQUE(String value) {
        this.utipoempaque = value;
    }

    /**
     * Obtiene el valor de la propiedad uvranticipo.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getUVRANTICIPO() {
        return uvranticipo;
    }

    /**
     * Define el valor de la propiedad uvranticipo.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setUVRANTICIPO(BigDecimal value) {
        this.uvranticipo = value;
    }

    /**
     * Obtiene el valor de la propiedad uvrtotal.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getUVRTOTAL() {
        return uvrtotal;
    }

    /**
     * Define el valor de la propiedad uvrtotal.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setUVRTOTAL(BigDecimal value) {
        this.uvrtotal = value;
    }

    /**
     * Obtiene el valor de la propiedad uvrimpuesto.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getUVRIMPUESTO() {
        return uvrimpuesto;
    }

    /**
     * Define el valor de la propiedad uvrimpuesto.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setUVRIMPUESTO(BigDecimal value) {
        this.uvrimpuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad uobservacion.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUOBSERVACION() {
        return uobservacion;
    }

    /**
     * Define el valor de la propiedad uobservacion.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUOBSERVACION(String value) {
        this.uobservacion = value;
    }

    /**
     * Obtiene el valor de la propiedad uvrdeclarado.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getUVRDECLARADO() {
        return uvrdeclarado;
    }

    /**
     * Define el valor de la propiedad uvrdeclarado.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setUVRDECLARADO(BigDecimal value) {
        this.uvrdeclarado = value;
    }

    /**
     * Obtiene el valor de la propiedad upuertoemb.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUPUERTOEMB() {
        return upuertoemb;
    }

    /**
     * Define el valor de la propiedad upuertoemb.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUPUERTOEMB(String value) {
        this.upuertoemb = value;
    }

    /**
     * Obtiene el valor de la propiedad unaviera.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUNAVIERA() {
        return unaviera;
    }

    /**
     * Define el valor de la propiedad unaviera.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUNAVIERA(String value) {
        this.unaviera = value;
    }

    /**
     * Obtiene el valor de la propiedad utranspterr.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUTRANSPTERR() {
        return utranspterr;
    }

    /**
     * Define el valor de la propiedad utranspterr.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUTRANSPTERR(String value) {
        this.utranspterr = value;
    }

    /**
     * Obtiene el valor de la propiedad uagenteadu.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUAGENTEADU() {
        return uagenteadu;
    }

    /**
     * Define el valor de la propiedad uagenteadu.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUAGENTEADU(String value) {
        this.uagenteadu = value;
    }

    /**
     * Obtiene el valor de la propiedad ualmacdes.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUALMACDES() {
        return ualmacdes;
    }

    /**
     * Define el valor de la propiedad ualmacdes.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUALMACDES(String value) {
        this.ualmacdes = value;
    }

    /**
     * Obtiene el valor de la propiedad uguid.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUGUID() {
        return uguid;
    }

    /**
     * Define el valor de la propiedad uguid.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUGUID(String value) {
        this.uguid = value;
    }

    /**
     * Obtiene el valor de la propiedad ubpvncon2.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUBPVNCON2() {
        return ubpvncon2;
    }

    /**
     * Define el valor de la propiedad ubpvncon2.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUBPVNCON2(String value) {
        this.ubpvncon2 = value;
    }

    /**
     * Obtiene el valor de la propiedad ubpvseri.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUBPVSERI() {
        return ubpvseri;
    }

    /**
     * Define el valor de la propiedad ubpvseri.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUBPVSERI(String value) {
        this.ubpvseri = value;
    }

    /**
     * Obtiene el valor de la propiedad ubpvtran.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUBPVTRAN() {
        return ubpvtran;
    }

    /**
     * Define el valor de la propiedad ubpvtran.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUBPVTRAN(String value) {
        this.ubpvtran = value;
    }

    /**
     * Obtiene el valor de la propiedad ubpvfafe.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUBPVFAFE() {
        return ubpvfafe;
    }

    /**
     * Define el valor de la propiedad ubpvfafe.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUBPVFAFE(String value) {
        this.ubpvfafe = value;
    }

    /**
     * Obtiene el valor de la propiedad ubpvcomp.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUBPVCOMP() {
        return ubpvcomp;
    }

    /**
     * Define el valor de la propiedad ubpvcomp.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUBPVCOMP(String value) {
        this.ubpvcomp = value;
    }

    /**
     * Obtiene el valor de la propiedad ubpvtdoc.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUBPVTDOC() {
        return ubpvtdoc;
    }

    /**
     * Define el valor de la propiedad ubpvtdoc.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUBPVTDOC(String value) {
        this.ubpvtdoc = value;
    }

    /**
     * Obtiene el valor de la propiedad ubpvnimp.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUBPVNIMP() {
        return ubpvnimp;
    }

    /**
     * Define el valor de la propiedad ubpvnimp.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUBPVNIMP(String value) {
        this.ubpvnimp = value;
    }

    /**
     * Obtiene el valor de la propiedad ubpvNumExp.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUBPVNumExp() {
        return ubpvNumExp;
    }

    /**
     * Define el valor de la propiedad ubpvNumExp.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUBPVNumExp(String value) {
        this.ubpvNumExp = value;
    }

    /**
     * Obtiene el valor de la propiedad ubpvncon.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUBPVNCON() {
        return ubpvncon;
    }

    /**
     * Define el valor de la propiedad ubpvncon.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUBPVNCON(String value) {
        this.ubpvncon = value;
    }

    /**
     * Obtiene el valor de la propiedad umotivo.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUMOTIVO() {
        return umotivo;
    }

    /**
     * Define el valor de la propiedad umotivo.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUMOTIVO(String value) {
        this.umotivo = value;
    }

    /**
     * Obtiene el valor de la propiedad uestadoped.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUESTADOPED() {
        return uestadoped;
    }

    /**
     * Define el valor de la propiedad uestadoped.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUESTADOPED(String value) {
        this.uestadoped = value;
    }

    /**
     * Obtiene el valor de la propiedad uAutorret.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUAutorret() {
        return uAutorret;
    }

    /**
     * Define el valor de la propiedad uAutorret.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUAutorret(String value) {
        this.uAutorret = value;
    }

    /**
     * Obtiene el valor de la propiedad uRetefue.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getURetefue() {
        return uRetefue;
    }

    /**
     * Define el valor de la propiedad uRetefue.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setURetefue(String value) {
        this.uRetefue = value;
    }

    /**
     * Obtiene el valor de la propiedad uReteIca.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUReteIca() {
        return uReteIca;
    }

    /**
     * Define el valor de la propiedad uReteIca.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUReteIca(String value) {
        this.uReteIca = value;
    }

    /**
     * Obtiene el valor de la propiedad unwrPicS.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUNWRPicS() {
        return unwrPicS;
    }

    /**
     * Define el valor de la propiedad unwrPicS.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUNWRPicS(String value) {
        this.unwrPicS = value;
    }

    /**
     * Obtiene el valor de la propiedad unwrbRet.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUNWRBRet() {
        return unwrbRet;
    }

    /**
     * Define el valor de la propiedad unwrbRet.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUNWRBRet(String value) {
        this.unwrbRet = value;
    }

    /**
     * Obtiene el valor de la propiedad uNwrPAut.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getUNwrPAut() {
        return uNwrPAut;
    }

    /**
     * Define el valor de la propiedad uNwrPAut.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setUNwrPAut(Long value) {
        this.uNwrPAut = value;
    }

    /**
     * Obtiene el valor de la propiedad uNwrNote.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUNwrNote() {
        return uNwrNote;
    }

    /**
     * Define el valor de la propiedad uNwrNote.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUNwrNote(String value) {
        this.uNwrNote = value;
    }

    /**
     * Obtiene el valor de la propiedad uNwrTag.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUNwrTag() {
        return uNwrTag;
    }

    /**
     * Define el valor de la propiedad uNwrTag.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUNwrTag(String value) {
        this.uNwrTag = value;
    }

    /**
     * Obtiene el valor de la propiedad uNwrFrgt.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getUNwrFrgt() {
        return uNwrFrgt;
    }

    /**
     * Define el valor de la propiedad uNwrFrgt.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setUNwrFrgt(BigDecimal value) {
        this.uNwrFrgt = value;
    }

    /**
     * Obtiene el valor de la propiedad unwrnorm.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUNWRNORM() {
        return unwrnorm;
    }

    /**
     * Define el valor de la propiedad unwrnorm.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUNWRNORM(String value) {
        this.unwrnorm = value;
    }

    /**
     * Obtiene el valor de la propiedad uTypeExped.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUTypeExped() {
        return uTypeExped;
    }

    /**
     * Define el valor de la propiedad uTypeExped.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUTypeExped(String value) {
        this.uTypeExped = value;
    }

    /**
     * Obtiene el valor de la propiedad unwrManifest.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUNWRManifest() {
        return unwrManifest;
    }

    /**
     * Define el valor de la propiedad unwrManifest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUNWRManifest(String value) {
        this.unwrManifest = value;
    }

    /**
     * Obtiene el valor de la propiedad uempacador.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUEMPACADOR() {
        return uempacador;
    }

    /**
     * Define el valor de la propiedad uempacador.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUEMPACADOR(String value) {
        this.uempacador = value;
    }

    /**
     * Obtiene el valor de la propiedad uhorainiemp.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUHORAINIEMP() {
        return uhorainiemp;
    }

    /**
     * Define el valor de la propiedad uhorainiemp.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUHORAINIEMP(XMLGregorianCalendar value) {
        this.uhorainiemp = value;
    }

    /**
     * Obtiene el valor de la propiedad uhorafinemp.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUHORAFINEMP() {
        return uhorafinemp;
    }

    /**
     * Define el valor de la propiedad uhorafinemp.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUHORAFINEMP(XMLGregorianCalendar value) {
        this.uhorafinemp = value;
    }

    /**
     * Obtiene el valor de la propiedad ualist.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUALIST() {
        return ualist;
    }

    /**
     * Define el valor de la propiedad ualist.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUALIST(String value) {
        this.ualist = value;
    }

    /**
     * Obtiene el valor de la propiedad ufeciniemp.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUFECINIEMP() {
        return ufeciniemp;
    }

    /**
     * Define el valor de la propiedad ufeciniemp.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUFECINIEMP(XMLGregorianCalendar value) {
        this.ufeciniemp = value;
    }

    /**
     * Obtiene el valor de la propiedad ufecfinemp.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUFECFINEMP() {
        return ufecfinemp;
    }

    /**
     * Define el valor de la propiedad ufecfinemp.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUFECFINEMP(XMLGregorianCalendar value) {
        this.ufecfinemp = value;
    }

    /**
     * Obtiene el valor de la propiedad uok1IFRS.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUOK1IFRS() {
        return uok1IFRS;
    }

    /**
     * Define el valor de la propiedad uok1IFRS.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUOK1IFRS(String value) {
        this.uok1IFRS = value;
    }

    /**
     * Obtiene el valor de la propiedad utotfleclie.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getUTOTFLECLIE() {
        return utotfleclie;
    }

    /**
     * Define el valor de la propiedad utotfleclie.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setUTOTFLECLIE(BigDecimal value) {
        this.utotfleclie = value;
    }

    /**
     * Obtiene el valor de la propiedad ushipping.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUSHIPPING() {
        return ushipping;
    }

    /**
     * Define el valor de la propiedad ushipping.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUSHIPPING(String value) {
        this.ushipping = value;
    }

    /**
     * Obtiene el valor de la propiedad uEsIndep.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUEsIndep() {
        return uEsIndep;
    }

    /**
     * Define el valor de la propiedad uEsIndep.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUEsIndep(String value) {
        this.uEsIndep = value;
    }

    /**
     * Obtiene el valor de la propiedad uDocEntryLeg.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getUDocEntryLeg() {
        return uDocEntryLeg;
    }

    /**
     * Define el valor de la propiedad uDocEntryLeg.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setUDocEntryLeg(Long value) {
        this.uDocEntryLeg = value;
    }

    /**
     * Obtiene el valor de la propiedad uIdLineLeg.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUIdLineLeg() {
        return uIdLineLeg;
    }

    /**
     * Define el valor de la propiedad uIdLineLeg.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUIdLineLeg(String value) {
        this.uIdLineLeg = value;
    }

    /**
     * Obtiene el valor de la propiedad uSerieLeg.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getUSerieLeg() {
        return uSerieLeg;
    }

    /**
     * Define el valor de la propiedad uSerieLeg.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setUSerieLeg(Long value) {
        this.uSerieLeg = value;
    }

    /**
     * Obtiene el valor de la propiedad uFechaArriboCEDI.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUFechaArriboCEDI() {
        return uFechaArriboCEDI;
    }

    /**
     * Define el valor de la propiedad uFechaArriboCEDI.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUFechaArriboCEDI(XMLGregorianCalendar value) {
        this.uFechaArriboCEDI = value;
    }

    /**
     * Obtiene el valor de la propiedad uCatRet.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUCatRet() {
        return uCatRet;
    }

    /**
     * Define el valor de la propiedad uCatRet.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUCatRet(String value) {
        this.uCatRet = value;
    }

    /**
     * Obtiene el valor de la propiedad uBodega.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUBodega() {
        return uBodega;
    }

    /**
     * Define el valor de la propiedad uBodega.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUBodega(String value) {
        this.uBodega = value;
    }

    /**
     * Obtiene el valor de la propiedad uaiuadmin.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getUAIUADMIN() {
        return uaiuadmin;
    }

    /**
     * Define el valor de la propiedad uaiuadmin.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setUAIUADMIN(BigDecimal value) {
        this.uaiuadmin = value;
    }

    /**
     * Obtiene el valor de la propiedad uaiuimpre.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getUAIUIMPRE() {
        return uaiuimpre;
    }

    /**
     * Define el valor de la propiedad uaiuimpre.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setUAIUIMPRE(BigDecimal value) {
        this.uaiuimpre = value;
    }

    /**
     * Obtiene el valor de la propiedad uaiuutil.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getUAIUUTIL() {
        return uaiuutil;
    }

    /**
     * Define el valor de la propiedad uaiuutil.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setUAIUUTIL(BigDecimal value) {
        this.uaiuutil = value;
    }

    public String getuOrigen() {
        return uOrigen;
    }

    public void setuOrigen(String uOrigen) {
        this.uOrigen = uOrigen;
    }

    /**
     * Obtiene el valor de la propiedad documentApprovalRequests.
     *
     * @return
     *     possible object is
     *     {@link Document.DocumentApprovalRequests }
     *
     */
    public Document.DocumentApprovalRequests getDocumentApprovalRequests() {
        return documentApprovalRequests;
    }

    /**
     * Define el valor de la propiedad documentApprovalRequests.
     *
     * @param value
     *     allowed object is
     *     {@link Document.DocumentApprovalRequests }
     *
     */
    public void setDocumentApprovalRequests(Document.DocumentApprovalRequests value) {
        this.documentApprovalRequests = value;
    }

    /**
     * Obtiene el valor de la propiedad documentLines.
     *
     * @return
     *     possible object is
     *     {@link Document.DocumentLines }
     *
     */
    public Document.DocumentLines getDocumentLines() {
        return documentLines;
    }

    /**
     * Define el valor de la propiedad documentLines.
     *
     * @param value
     *     allowed object is
     *     {@link Document.DocumentLines }
     *
     */
    public void setDocumentLines(Document.DocumentLines value) {
        this.documentLines = value;
    }

    /**
     * Obtiene el valor de la propiedad electronicProtocols.
     *
     * @return
     *     possible object is
     *     {@link Document.ElectronicProtocols }
     *
     */
    public Document.ElectronicProtocols getElectronicProtocols() {
        return electronicProtocols;
    }

    /**
     * Define el valor de la propiedad electronicProtocols.
     *
     * @param value
     *     allowed object is
     *     {@link Document.ElectronicProtocols }
     *
     */
    public void setElectronicProtocols(Document.ElectronicProtocols value) {
        this.electronicProtocols = value;
    }

    /**
     * Obtiene el valor de la propiedad documentAdditionalExpenses.
     *
     * @return
     *     possible object is
     *     {@link Document.DocumentAdditionalExpenses }
     *
     */
    public Document.DocumentAdditionalExpenses getDocumentAdditionalExpenses() {
        return documentAdditionalExpenses;
    }

    /**
     * Define el valor de la propiedad documentAdditionalExpenses.
     *
     * @param value
     *     allowed object is
     *     {@link Document.DocumentAdditionalExpenses }
     *
     */
    public void setDocumentAdditionalExpenses(Document.DocumentAdditionalExpenses value) {
        this.documentAdditionalExpenses = value;
    }

    /**
     * Obtiene el valor de la propiedad withholdingTaxDataWTXCollection.
     *
     * @return
     *     possible object is
     *     {@link Document.WithholdingTaxDataWTXCollection }
     *
     */
    public Document.WithholdingTaxDataWTXCollection getWithholdingTaxDataWTXCollection() {
        return withholdingTaxDataWTXCollection;
    }

    /**
     * Define el valor de la propiedad withholdingTaxDataWTXCollection.
     *
     * @param value
     *     allowed object is
     *     {@link Document.WithholdingTaxDataWTXCollection }
     *
     */
    public void setWithholdingTaxDataWTXCollection(Document.WithholdingTaxDataWTXCollection value) {
        this.withholdingTaxDataWTXCollection = value;
    }

    /**
     * Obtiene el valor de la propiedad withholdingTaxDataCollection.
     *
     * @return
     *     possible object is
     *     {@link Document.WithholdingTaxDataCollection }
     *
     */
    public Document.WithholdingTaxDataCollection getWithholdingTaxDataCollection() {
        return withholdingTaxDataCollection;
    }

    /**
     * Define el valor de la propiedad withholdingTaxDataCollection.
     *
     * @param value
     *     allowed object is
     *     {@link Document.WithholdingTaxDataCollection }
     *
     */
    public void setWithholdingTaxDataCollection(Document.WithholdingTaxDataCollection value) {
        this.withholdingTaxDataCollection = value;
    }

    /**
     * Obtiene el valor de la propiedad documentSpecialLines.
     *
     * @return
     *     possible object is
     *     {@link Document.DocumentSpecialLines }
     *
     */
    public Document.DocumentSpecialLines getDocumentSpecialLines() {
        return documentSpecialLines;
    }

    /**
     * Define el valor de la propiedad documentSpecialLines.
     *
     * @param value
     *     allowed object is
     *     {@link Document.DocumentSpecialLines }
     *
     */
    public void setDocumentSpecialLines(Document.DocumentSpecialLines value) {
        this.documentSpecialLines = value;
    }

    /**
     * Obtiene el valor de la propiedad taxExtension.
     *
     * @return
     *     possible object is
     *     {@link Document.TaxExtension }
     *
     */
    public Document.TaxExtension getTaxExtension() {
        return taxExtension;
    }

    /**
     * Define el valor de la propiedad taxExtension.
     *
     * @param value
     *     allowed object is
     *     {@link Document.TaxExtension }
     *
     */
    public void setTaxExtension(Document.TaxExtension value) {
        this.taxExtension = value;
    }

    /**
     * Obtiene el valor de la propiedad addressExtension.
     *
     * @return
     *     possible object is
     *     {@link Document.AddressExtension }
     *
     */
    public Document.AddressExtension getAddressExtension() {
        return addressExtension;
    }

    /**
     * Define el valor de la propiedad addressExtension.
     *
     * @param value
     *     allowed object is
     *     {@link Document.AddressExtension }
     *
     */
    public void setAddressExtension(Document.AddressExtension value) {
        this.addressExtension = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="ShipToStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShipToStreetNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShipToBlock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShipToBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShipToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShipToZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShipToCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShipToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShipToAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillToStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillToStreetNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillToBlock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillToBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillToZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillToCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillToAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShipToGlobalLocationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillToGlobalLocationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShipToAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShipToAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillToAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillToAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PlaceOfSupply" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PurchasePlaceOfSupply" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class AddressExtension {

        @XmlElement(name = "ShipToStreet")
        protected String shipToStreet;
        @XmlElement(name = "ShipToStreetNo")
        protected String shipToStreetNo;
        @XmlElement(name = "ShipToBlock")
        protected String shipToBlock;
        @XmlElement(name = "ShipToBuilding")
        protected String shipToBuilding;
        @XmlElement(name = "ShipToCity")
        protected String shipToCity;
        @XmlElement(name = "ShipToZipCode")
        protected String shipToZipCode;
        @XmlElement(name = "ShipToCounty")
        protected String shipToCounty;
        @XmlElement(name = "ShipToState")
        protected String shipToState;
        @XmlElement(name = "ShipToCountry")
        protected String shipToCountry;
        @XmlElement(name = "ShipToAddressType")
        protected String shipToAddressType;
        @XmlElement(name = "BillToStreet")
        protected String billToStreet;
        @XmlElement(name = "BillToStreetNo")
        protected String billToStreetNo;
        @XmlElement(name = "BillToBlock")
        protected String billToBlock;
        @XmlElement(name = "BillToBuilding")
        protected String billToBuilding;
        @XmlElement(name = "BillToCity")
        protected String billToCity;
        @XmlElement(name = "BillToZipCode")
        protected String billToZipCode;
        @XmlElement(name = "BillToCounty")
        protected String billToCounty;
        @XmlElement(name = "BillToState")
        protected String billToState;
        @XmlElement(name = "BillToCountry")
        protected String billToCountry;
        @XmlElement(name = "BillToAddressType")
        protected String billToAddressType;
        @XmlElement(name = "ShipToGlobalLocationNumber")
        protected String shipToGlobalLocationNumber;
        @XmlElement(name = "BillToGlobalLocationNumber")
        protected String billToGlobalLocationNumber;
        @XmlElement(name = "ShipToAddress2")
        protected String shipToAddress2;
        @XmlElement(name = "ShipToAddress3")
        protected String shipToAddress3;
        @XmlElement(name = "BillToAddress2")
        protected String billToAddress2;
        @XmlElement(name = "BillToAddress3")
        protected String billToAddress3;
        @XmlElement(name = "PlaceOfSupply")
        protected String placeOfSupply;
        @XmlElement(name = "PurchasePlaceOfSupply")
        protected String purchasePlaceOfSupply;

        /**
         * Obtiene el valor de la propiedad shipToStreet.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getShipToStreet() {
            return shipToStreet;
        }

        /**
         * Define el valor de la propiedad shipToStreet.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setShipToStreet(String value) {
            this.shipToStreet = value;
        }

        /**
         * Obtiene el valor de la propiedad shipToStreetNo.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getShipToStreetNo() {
            return shipToStreetNo;
        }

        /**
         * Define el valor de la propiedad shipToStreetNo.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setShipToStreetNo(String value) {
            this.shipToStreetNo = value;
        }

        /**
         * Obtiene el valor de la propiedad shipToBlock.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getShipToBlock() {
            return shipToBlock;
        }

        /**
         * Define el valor de la propiedad shipToBlock.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setShipToBlock(String value) {
            this.shipToBlock = value;
        }

        /**
         * Obtiene el valor de la propiedad shipToBuilding.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getShipToBuilding() {
            return shipToBuilding;
        }

        /**
         * Define el valor de la propiedad shipToBuilding.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setShipToBuilding(String value) {
            this.shipToBuilding = value;
        }

        /**
         * Obtiene el valor de la propiedad shipToCity.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getShipToCity() {
            return shipToCity;
        }

        /**
         * Define el valor de la propiedad shipToCity.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setShipToCity(String value) {
            this.shipToCity = value;
        }

        /**
         * Obtiene el valor de la propiedad shipToZipCode.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getShipToZipCode() {
            return shipToZipCode;
        }

        /**
         * Define el valor de la propiedad shipToZipCode.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setShipToZipCode(String value) {
            this.shipToZipCode = value;
        }

        /**
         * Obtiene el valor de la propiedad shipToCounty.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getShipToCounty() {
            return shipToCounty;
        }

        /**
         * Define el valor de la propiedad shipToCounty.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setShipToCounty(String value) {
            this.shipToCounty = value;
        }

        /**
         * Obtiene el valor de la propiedad shipToState.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getShipToState() {
            return shipToState;
        }

        /**
         * Define el valor de la propiedad shipToState.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setShipToState(String value) {
            this.shipToState = value;
        }

        /**
         * Obtiene el valor de la propiedad shipToCountry.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getShipToCountry() {
            return shipToCountry;
        }

        /**
         * Define el valor de la propiedad shipToCountry.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setShipToCountry(String value) {
            this.shipToCountry = value;
        }

        /**
         * Obtiene el valor de la propiedad shipToAddressType.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getShipToAddressType() {
            return shipToAddressType;
        }

        /**
         * Define el valor de la propiedad shipToAddressType.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setShipToAddressType(String value) {
            this.shipToAddressType = value;
        }

        /**
         * Obtiene el valor de la propiedad billToStreet.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getBillToStreet() {
            return billToStreet;
        }

        /**
         * Define el valor de la propiedad billToStreet.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setBillToStreet(String value) {
            this.billToStreet = value;
        }

        /**
         * Obtiene el valor de la propiedad billToStreetNo.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getBillToStreetNo() {
            return billToStreetNo;
        }

        /**
         * Define el valor de la propiedad billToStreetNo.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setBillToStreetNo(String value) {
            this.billToStreetNo = value;
        }

        /**
         * Obtiene el valor de la propiedad billToBlock.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getBillToBlock() {
            return billToBlock;
        }

        /**
         * Define el valor de la propiedad billToBlock.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setBillToBlock(String value) {
            this.billToBlock = value;
        }

        /**
         * Obtiene el valor de la propiedad billToBuilding.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getBillToBuilding() {
            return billToBuilding;
        }

        /**
         * Define el valor de la propiedad billToBuilding.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setBillToBuilding(String value) {
            this.billToBuilding = value;
        }

        /**
         * Obtiene el valor de la propiedad billToCity.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getBillToCity() {
            return billToCity;
        }

        /**
         * Define el valor de la propiedad billToCity.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setBillToCity(String value) {
            this.billToCity = value;
        }

        /**
         * Obtiene el valor de la propiedad billToZipCode.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getBillToZipCode() {
            return billToZipCode;
        }

        /**
         * Define el valor de la propiedad billToZipCode.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setBillToZipCode(String value) {
            this.billToZipCode = value;
        }

        /**
         * Obtiene el valor de la propiedad billToCounty.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getBillToCounty() {
            return billToCounty;
        }

        /**
         * Define el valor de la propiedad billToCounty.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setBillToCounty(String value) {
            this.billToCounty = value;
        }

        /**
         * Obtiene el valor de la propiedad billToState.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getBillToState() {
            return billToState;
        }

        /**
         * Define el valor de la propiedad billToState.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setBillToState(String value) {
            this.billToState = value;
        }

        /**
         * Obtiene el valor de la propiedad billToCountry.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getBillToCountry() {
            return billToCountry;
        }

        /**
         * Define el valor de la propiedad billToCountry.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setBillToCountry(String value) {
            this.billToCountry = value;
        }

        /**
         * Obtiene el valor de la propiedad billToAddressType.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getBillToAddressType() {
            return billToAddressType;
        }

        /**
         * Define el valor de la propiedad billToAddressType.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setBillToAddressType(String value) {
            this.billToAddressType = value;
        }

        /**
         * Obtiene el valor de la propiedad shipToGlobalLocationNumber.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getShipToGlobalLocationNumber() {
            return shipToGlobalLocationNumber;
        }

        /**
         * Define el valor de la propiedad shipToGlobalLocationNumber.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setShipToGlobalLocationNumber(String value) {
            this.shipToGlobalLocationNumber = value;
        }

        /**
         * Obtiene el valor de la propiedad billToGlobalLocationNumber.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getBillToGlobalLocationNumber() {
            return billToGlobalLocationNumber;
        }

        /**
         * Define el valor de la propiedad billToGlobalLocationNumber.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setBillToGlobalLocationNumber(String value) {
            this.billToGlobalLocationNumber = value;
        }

        /**
         * Obtiene el valor de la propiedad shipToAddress2.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getShipToAddress2() {
            return shipToAddress2;
        }

        /**
         * Define el valor de la propiedad shipToAddress2.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setShipToAddress2(String value) {
            this.shipToAddress2 = value;
        }

        /**
         * Obtiene el valor de la propiedad shipToAddress3.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getShipToAddress3() {
            return shipToAddress3;
        }

        /**
         * Define el valor de la propiedad shipToAddress3.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setShipToAddress3(String value) {
            this.shipToAddress3 = value;
        }

        /**
         * Obtiene el valor de la propiedad billToAddress2.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getBillToAddress2() {
            return billToAddress2;
        }

        /**
         * Define el valor de la propiedad billToAddress2.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setBillToAddress2(String value) {
            this.billToAddress2 = value;
        }

        /**
         * Obtiene el valor de la propiedad billToAddress3.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getBillToAddress3() {
            return billToAddress3;
        }

        /**
         * Define el valor de la propiedad billToAddress3.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setBillToAddress3(String value) {
            this.billToAddress3 = value;
        }

        /**
         * Obtiene el valor de la propiedad placeOfSupply.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPlaceOfSupply() {
            return placeOfSupply;
        }

        /**
         * Define el valor de la propiedad placeOfSupply.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPlaceOfSupply(String value) {
            this.placeOfSupply = value;
        }

        /**
         * Obtiene el valor de la propiedad purchasePlaceOfSupply.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPurchasePlaceOfSupply() {
            return purchasePlaceOfSupply;
        }

        /**
         * Define el valor de la propiedad purchasePlaceOfSupply.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPurchasePlaceOfSupply(String value) {
            this.purchasePlaceOfSupply = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DocumentAdditionalExpense" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="ExpenseCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="LineTotal" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="LineTotalFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="LineTotalSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="PaidToDate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="PaidToDateFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="PaidToDateSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DistributionMethod" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="aedm_None"/>
     *                         &lt;enumeration value="aedm_Quantity"/>
     *                         &lt;enumeration value="aedm_Volume"/>
     *                         &lt;enumeration value="aedm_Weight"/>
     *                         &lt;enumeration value="aedm_Equally"/>
     *                         &lt;enumeration value="aedm_RowTotal"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TaxLiable" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="VatGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TaxPercent" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="TaxSum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="TaxSumFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="TaxSumSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="DeductibleTaxSum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="DeductibleTaxSumFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="DeductibleTaxSumSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="AquisitionTax" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TaxType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="aext_NormalTax"/>
     *                         &lt;enumeration value="aext_NoTax"/>
     *                         &lt;enumeration value="aext_UseTax"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TaxPaid" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="TaxPaidFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="TaxPaidSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="EqualizationTaxPercent" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="EqualizationTaxSum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="EqualizationTaxFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="EqualizationTaxSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="TaxTotalSum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="TaxTotalSumFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="TaxTotalSumSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="BaseDocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BaseDocLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BaseDocType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BaseDocumentReference" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="LastPurchasePrice" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Status" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="bost_Open"/>
     *                         &lt;enumeration value="bost_Close"/>
     *                         &lt;enumeration value="bost_Paid"/>
     *                         &lt;enumeration value="bost_Delivered"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Stock" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TargetAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="TargetType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="WTLiable" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DistributionRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Project" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DistributionRule2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DistributionRule3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DistributionRule4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DistributionRule5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LineGross" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="LineGrossSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="LineGrossFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="DocExpenseTaxJurisdictions" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DocExpenseTaxJurisdiction" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="JurisdictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="JurisdictionType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="TaxAmountSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="TaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="RowSequence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "documentAdditionalExpense"
    })
    public static class DocumentAdditionalExpenses {

        @XmlElement(name = "DocumentAdditionalExpense")
        protected List<Document.DocumentAdditionalExpenses.DocumentAdditionalExpense> documentAdditionalExpense;

        /**
         * Gets the value of the documentAdditionalExpense property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documentAdditionalExpense property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumentAdditionalExpense().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Document.DocumentAdditionalExpenses.DocumentAdditionalExpense }
         *
         *
         */
        public List<Document.DocumentAdditionalExpenses.DocumentAdditionalExpense> getDocumentAdditionalExpense() {
            if (documentAdditionalExpense == null) {
                documentAdditionalExpense = new ArrayList<Document.DocumentAdditionalExpenses.DocumentAdditionalExpense>();
            }
            return this.documentAdditionalExpense;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="ExpenseCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="LineTotal" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="LineTotalFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="LineTotalSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="PaidToDate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="PaidToDateFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="PaidToDateSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DistributionMethod" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="aedm_None"/>
         *               &lt;enumeration value="aedm_Quantity"/>
         *               &lt;enumeration value="aedm_Volume"/>
         *               &lt;enumeration value="aedm_Weight"/>
         *               &lt;enumeration value="aedm_Equally"/>
         *               &lt;enumeration value="aedm_RowTotal"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TaxLiable" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="VatGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TaxPercent" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="TaxSum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="TaxSumFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="TaxSumSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="DeductibleTaxSum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="DeductibleTaxSumFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="DeductibleTaxSumSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="AquisitionTax" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TaxType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="aext_NormalTax"/>
         *               &lt;enumeration value="aext_NoTax"/>
         *               &lt;enumeration value="aext_UseTax"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TaxPaid" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="TaxPaidFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="TaxPaidSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="EqualizationTaxPercent" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="EqualizationTaxSum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="EqualizationTaxFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="EqualizationTaxSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="TaxTotalSum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="TaxTotalSumFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="TaxTotalSumSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="BaseDocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BaseDocLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BaseDocType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BaseDocumentReference" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="LastPurchasePrice" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Status" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="bost_Open"/>
         *               &lt;enumeration value="bost_Close"/>
         *               &lt;enumeration value="bost_Paid"/>
         *               &lt;enumeration value="bost_Delivered"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Stock" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TargetAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="TargetType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="WTLiable" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DistributionRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Project" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DistributionRule2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DistributionRule3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DistributionRule4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DistributionRule5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LineGross" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="LineGrossSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="LineGrossFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="DocExpenseTaxJurisdictions" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DocExpenseTaxJurisdiction" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="JurisdictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="JurisdictionType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="TaxAmountSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="TaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="RowSequence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                           &lt;/all>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class DocumentAdditionalExpense {

            @XmlElement(name = "ExpenseCode")
            protected Long expenseCode;
            @XmlElement(name = "LineTotal")
            protected BigDecimal lineTotal;
            @XmlElement(name = "LineTotalFC")
            protected BigDecimal lineTotalFC;
            @XmlElement(name = "LineTotalSys")
            protected BigDecimal lineTotalSys;
            @XmlElement(name = "PaidToDate")
            protected BigDecimal paidToDate;
            @XmlElement(name = "PaidToDateFC")
            protected BigDecimal paidToDateFC;
            @XmlElement(name = "PaidToDateSys")
            protected BigDecimal paidToDateSys;
            @XmlElement(name = "Remarks")
            protected String remarks;
            @XmlElement(name = "DistributionMethod")
            protected String distributionMethod;
            @XmlElement(name = "TaxLiable")
            protected String taxLiable;
            @XmlElement(name = "VatGroup")
            protected String vatGroup;
            @XmlElement(name = "TaxPercent")
            protected BigDecimal taxPercent;
            @XmlElement(name = "TaxSum")
            protected BigDecimal taxSum;
            @XmlElement(name = "TaxSumFC")
            protected BigDecimal taxSumFC;
            @XmlElement(name = "TaxSumSys")
            protected BigDecimal taxSumSys;
            @XmlElement(name = "DeductibleTaxSum")
            protected BigDecimal deductibleTaxSum;
            @XmlElement(name = "DeductibleTaxSumFC")
            protected BigDecimal deductibleTaxSumFC;
            @XmlElement(name = "DeductibleTaxSumSys")
            protected BigDecimal deductibleTaxSumSys;
            @XmlElement(name = "AquisitionTax")
            protected String aquisitionTax;
            @XmlElement(name = "TaxCode")
            protected String taxCode;
            @XmlElement(name = "TaxType")
            protected String taxType;
            @XmlElement(name = "TaxPaid")
            protected BigDecimal taxPaid;
            @XmlElement(name = "TaxPaidFC")
            protected BigDecimal taxPaidFC;
            @XmlElement(name = "TaxPaidSys")
            protected BigDecimal taxPaidSys;
            @XmlElement(name = "EqualizationTaxPercent")
            protected BigDecimal equalizationTaxPercent;
            @XmlElement(name = "EqualizationTaxSum")
            protected BigDecimal equalizationTaxSum;
            @XmlElement(name = "EqualizationTaxFC")
            protected BigDecimal equalizationTaxFC;
            @XmlElement(name = "EqualizationTaxSys")
            protected BigDecimal equalizationTaxSys;
            @XmlElement(name = "TaxTotalSum")
            protected BigDecimal taxTotalSum;
            @XmlElement(name = "TaxTotalSumFC")
            protected BigDecimal taxTotalSumFC;
            @XmlElement(name = "TaxTotalSumSys")
            protected BigDecimal taxTotalSumSys;
            @XmlElement(name = "BaseDocEntry")
            protected Long baseDocEntry;
            @XmlElement(name = "BaseDocLine")
            protected Long baseDocLine;
            @XmlElement(name = "BaseDocType")
            protected Long baseDocType;
            @XmlElement(name = "BaseDocumentReference")
            protected Long baseDocumentReference;
            @XmlElement(name = "LineNum")
            protected Long lineNum;
            @XmlElement(name = "LastPurchasePrice")
            protected String lastPurchasePrice;
            @XmlElement(name = "Status")
            protected String status;
            @XmlElement(name = "Stock")
            protected String stock;
            @XmlElement(name = "TargetAbsEntry")
            protected Long targetAbsEntry;
            @XmlElement(name = "TargetType")
            protected Long targetType;
            @XmlElement(name = "WTLiable")
            protected String wtLiable;
            @XmlElement(name = "DistributionRule")
            protected String distributionRule;
            @XmlElement(name = "Project")
            protected String project;
            @XmlElement(name = "DistributionRule2")
            protected String distributionRule2;
            @XmlElement(name = "DistributionRule3")
            protected String distributionRule3;
            @XmlElement(name = "DistributionRule4")
            protected String distributionRule4;
            @XmlElement(name = "DistributionRule5")
            protected String distributionRule5;
            @XmlElement(name = "LineGross")
            protected BigDecimal lineGross;
            @XmlElement(name = "LineGrossSys")
            protected BigDecimal lineGrossSys;
            @XmlElement(name = "LineGrossFC")
            protected BigDecimal lineGrossFC;
            @XmlElement(name = "DocExpenseTaxJurisdictions")
            protected Document.DocumentAdditionalExpenses.DocumentAdditionalExpense.DocExpenseTaxJurisdictions docExpenseTaxJurisdictions;

            /**
             * Obtiene el valor de la propiedad expenseCode.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getExpenseCode() {
                return expenseCode;
            }

            /**
             * Define el valor de la propiedad expenseCode.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setExpenseCode(Long value) {
                this.expenseCode = value;
            }

            /**
             * Obtiene el valor de la propiedad lineTotal.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getLineTotal() {
                return lineTotal;
            }

            /**
             * Define el valor de la propiedad lineTotal.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setLineTotal(BigDecimal value) {
                this.lineTotal = value;
            }

            /**
             * Obtiene el valor de la propiedad lineTotalFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getLineTotalFC() {
                return lineTotalFC;
            }

            /**
             * Define el valor de la propiedad lineTotalFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setLineTotalFC(BigDecimal value) {
                this.lineTotalFC = value;
            }

            /**
             * Obtiene el valor de la propiedad lineTotalSys.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getLineTotalSys() {
                return lineTotalSys;
            }

            /**
             * Define el valor de la propiedad lineTotalSys.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setLineTotalSys(BigDecimal value) {
                this.lineTotalSys = value;
            }

            /**
             * Obtiene el valor de la propiedad paidToDate.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getPaidToDate() {
                return paidToDate;
            }

            /**
             * Define el valor de la propiedad paidToDate.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setPaidToDate(BigDecimal value) {
                this.paidToDate = value;
            }

            /**
             * Obtiene el valor de la propiedad paidToDateFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getPaidToDateFC() {
                return paidToDateFC;
            }

            /**
             * Define el valor de la propiedad paidToDateFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setPaidToDateFC(BigDecimal value) {
                this.paidToDateFC = value;
            }

            /**
             * Obtiene el valor de la propiedad paidToDateSys.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getPaidToDateSys() {
                return paidToDateSys;
            }

            /**
             * Define el valor de la propiedad paidToDateSys.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setPaidToDateSys(BigDecimal value) {
                this.paidToDateSys = value;
            }

            /**
             * Obtiene el valor de la propiedad remarks.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getRemarks() {
                return remarks;
            }

            /**
             * Define el valor de la propiedad remarks.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setRemarks(String value) {
                this.remarks = value;
            }

            /**
             * Obtiene el valor de la propiedad distributionMethod.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDistributionMethod() {
                return distributionMethod;
            }

            /**
             * Define el valor de la propiedad distributionMethod.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDistributionMethod(String value) {
                this.distributionMethod = value;
            }

            /**
             * Obtiene el valor de la propiedad taxLiable.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getTaxLiable() {
                return taxLiable;
            }

            /**
             * Define el valor de la propiedad taxLiable.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setTaxLiable(String value) {
                this.taxLiable = value;
            }

            /**
             * Obtiene el valor de la propiedad vatGroup.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getVatGroup() {
                return vatGroup;
            }

            /**
             * Define el valor de la propiedad vatGroup.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setVatGroup(String value) {
                this.vatGroup = value;
            }

            /**
             * Obtiene el valor de la propiedad taxPercent.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTaxPercent() {
                return taxPercent;
            }

            /**
             * Define el valor de la propiedad taxPercent.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTaxPercent(BigDecimal value) {
                this.taxPercent = value;
            }

            /**
             * Obtiene el valor de la propiedad taxSum.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTaxSum() {
                return taxSum;
            }

            /**
             * Define el valor de la propiedad taxSum.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTaxSum(BigDecimal value) {
                this.taxSum = value;
            }

            /**
             * Obtiene el valor de la propiedad taxSumFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTaxSumFC() {
                return taxSumFC;
            }

            /**
             * Define el valor de la propiedad taxSumFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTaxSumFC(BigDecimal value) {
                this.taxSumFC = value;
            }

            /**
             * Obtiene el valor de la propiedad taxSumSys.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTaxSumSys() {
                return taxSumSys;
            }

            /**
             * Define el valor de la propiedad taxSumSys.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTaxSumSys(BigDecimal value) {
                this.taxSumSys = value;
            }

            /**
             * Obtiene el valor de la propiedad deductibleTaxSum.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getDeductibleTaxSum() {
                return deductibleTaxSum;
            }

            /**
             * Define el valor de la propiedad deductibleTaxSum.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setDeductibleTaxSum(BigDecimal value) {
                this.deductibleTaxSum = value;
            }

            /**
             * Obtiene el valor de la propiedad deductibleTaxSumFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getDeductibleTaxSumFC() {
                return deductibleTaxSumFC;
            }

            /**
             * Define el valor de la propiedad deductibleTaxSumFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setDeductibleTaxSumFC(BigDecimal value) {
                this.deductibleTaxSumFC = value;
            }

            /**
             * Obtiene el valor de la propiedad deductibleTaxSumSys.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getDeductibleTaxSumSys() {
                return deductibleTaxSumSys;
            }

            /**
             * Define el valor de la propiedad deductibleTaxSumSys.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setDeductibleTaxSumSys(BigDecimal value) {
                this.deductibleTaxSumSys = value;
            }

            /**
             * Obtiene el valor de la propiedad aquisitionTax.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getAquisitionTax() {
                return aquisitionTax;
            }

            /**
             * Define el valor de la propiedad aquisitionTax.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setAquisitionTax(String value) {
                this.aquisitionTax = value;
            }

            /**
             * Obtiene el valor de la propiedad taxCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getTaxCode() {
                return taxCode;
            }

            /**
             * Define el valor de la propiedad taxCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setTaxCode(String value) {
                this.taxCode = value;
            }

            /**
             * Obtiene el valor de la propiedad taxType.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getTaxType() {
                return taxType;
            }

            /**
             * Define el valor de la propiedad taxType.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setTaxType(String value) {
                this.taxType = value;
            }

            /**
             * Obtiene el valor de la propiedad taxPaid.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTaxPaid() {
                return taxPaid;
            }

            /**
             * Define el valor de la propiedad taxPaid.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTaxPaid(BigDecimal value) {
                this.taxPaid = value;
            }

            /**
             * Obtiene el valor de la propiedad taxPaidFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTaxPaidFC() {
                return taxPaidFC;
            }

            /**
             * Define el valor de la propiedad taxPaidFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTaxPaidFC(BigDecimal value) {
                this.taxPaidFC = value;
            }

            /**
             * Obtiene el valor de la propiedad taxPaidSys.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTaxPaidSys() {
                return taxPaidSys;
            }

            /**
             * Define el valor de la propiedad taxPaidSys.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTaxPaidSys(BigDecimal value) {
                this.taxPaidSys = value;
            }

            /**
             * Obtiene el valor de la propiedad equalizationTaxPercent.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getEqualizationTaxPercent() {
                return equalizationTaxPercent;
            }

            /**
             * Define el valor de la propiedad equalizationTaxPercent.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setEqualizationTaxPercent(BigDecimal value) {
                this.equalizationTaxPercent = value;
            }

            /**
             * Obtiene el valor de la propiedad equalizationTaxSum.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getEqualizationTaxSum() {
                return equalizationTaxSum;
            }

            /**
             * Define el valor de la propiedad equalizationTaxSum.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setEqualizationTaxSum(BigDecimal value) {
                this.equalizationTaxSum = value;
            }

            /**
             * Obtiene el valor de la propiedad equalizationTaxFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getEqualizationTaxFC() {
                return equalizationTaxFC;
            }

            /**
             * Define el valor de la propiedad equalizationTaxFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setEqualizationTaxFC(BigDecimal value) {
                this.equalizationTaxFC = value;
            }

            /**
             * Obtiene el valor de la propiedad equalizationTaxSys.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getEqualizationTaxSys() {
                return equalizationTaxSys;
            }

            /**
             * Define el valor de la propiedad equalizationTaxSys.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setEqualizationTaxSys(BigDecimal value) {
                this.equalizationTaxSys = value;
            }

            /**
             * Obtiene el valor de la propiedad taxTotalSum.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTaxTotalSum() {
                return taxTotalSum;
            }

            /**
             * Define el valor de la propiedad taxTotalSum.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTaxTotalSum(BigDecimal value) {
                this.taxTotalSum = value;
            }

            /**
             * Obtiene el valor de la propiedad taxTotalSumFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTaxTotalSumFC() {
                return taxTotalSumFC;
            }

            /**
             * Define el valor de la propiedad taxTotalSumFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTaxTotalSumFC(BigDecimal value) {
                this.taxTotalSumFC = value;
            }

            /**
             * Obtiene el valor de la propiedad taxTotalSumSys.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTaxTotalSumSys() {
                return taxTotalSumSys;
            }

            /**
             * Define el valor de la propiedad taxTotalSumSys.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTaxTotalSumSys(BigDecimal value) {
                this.taxTotalSumSys = value;
            }

            /**
             * Obtiene el valor de la propiedad baseDocEntry.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getBaseDocEntry() {
                return baseDocEntry;
            }

            /**
             * Define el valor de la propiedad baseDocEntry.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setBaseDocEntry(Long value) {
                this.baseDocEntry = value;
            }

            /**
             * Obtiene el valor de la propiedad baseDocLine.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getBaseDocLine() {
                return baseDocLine;
            }

            /**
             * Define el valor de la propiedad baseDocLine.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setBaseDocLine(Long value) {
                this.baseDocLine = value;
            }

            /**
             * Obtiene el valor de la propiedad baseDocType.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getBaseDocType() {
                return baseDocType;
            }

            /**
             * Define el valor de la propiedad baseDocType.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setBaseDocType(Long value) {
                this.baseDocType = value;
            }

            /**
             * Obtiene el valor de la propiedad baseDocumentReference.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getBaseDocumentReference() {
                return baseDocumentReference;
            }

            /**
             * Define el valor de la propiedad baseDocumentReference.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setBaseDocumentReference(Long value) {
                this.baseDocumentReference = value;
            }

            /**
             * Obtiene el valor de la propiedad lineNum.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getLineNum() {
                return lineNum;
            }

            /**
             * Define el valor de la propiedad lineNum.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setLineNum(Long value) {
                this.lineNum = value;
            }

            /**
             * Obtiene el valor de la propiedad lastPurchasePrice.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getLastPurchasePrice() {
                return lastPurchasePrice;
            }

            /**
             * Define el valor de la propiedad lastPurchasePrice.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setLastPurchasePrice(String value) {
                this.lastPurchasePrice = value;
            }

            /**
             * Obtiene el valor de la propiedad status.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getStatus() {
                return status;
            }

            /**
             * Define el valor de la propiedad status.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setStatus(String value) {
                this.status = value;
            }

            /**
             * Obtiene el valor de la propiedad stock.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getStock() {
                return stock;
            }

            /**
             * Define el valor de la propiedad stock.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setStock(String value) {
                this.stock = value;
            }

            /**
             * Obtiene el valor de la propiedad targetAbsEntry.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getTargetAbsEntry() {
                return targetAbsEntry;
            }

            /**
             * Define el valor de la propiedad targetAbsEntry.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setTargetAbsEntry(Long value) {
                this.targetAbsEntry = value;
            }

            /**
             * Obtiene el valor de la propiedad targetType.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getTargetType() {
                return targetType;
            }

            /**
             * Define el valor de la propiedad targetType.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setTargetType(Long value) {
                this.targetType = value;
            }

            /**
             * Obtiene el valor de la propiedad wtLiable.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getWTLiable() {
                return wtLiable;
            }

            /**
             * Define el valor de la propiedad wtLiable.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setWTLiable(String value) {
                this.wtLiable = value;
            }

            /**
             * Obtiene el valor de la propiedad distributionRule.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDistributionRule() {
                return distributionRule;
            }

            /**
             * Define el valor de la propiedad distributionRule.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDistributionRule(String value) {
                this.distributionRule = value;
            }

            /**
             * Obtiene el valor de la propiedad project.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getProject() {
                return project;
            }

            /**
             * Define el valor de la propiedad project.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setProject(String value) {
                this.project = value;
            }

            /**
             * Obtiene el valor de la propiedad distributionRule2.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDistributionRule2() {
                return distributionRule2;
            }

            /**
             * Define el valor de la propiedad distributionRule2.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDistributionRule2(String value) {
                this.distributionRule2 = value;
            }

            /**
             * Obtiene el valor de la propiedad distributionRule3.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDistributionRule3() {
                return distributionRule3;
            }

            /**
             * Define el valor de la propiedad distributionRule3.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDistributionRule3(String value) {
                this.distributionRule3 = value;
            }

            /**
             * Obtiene el valor de la propiedad distributionRule4.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDistributionRule4() {
                return distributionRule4;
            }

            /**
             * Define el valor de la propiedad distributionRule4.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDistributionRule4(String value) {
                this.distributionRule4 = value;
            }

            /**
             * Obtiene el valor de la propiedad distributionRule5.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDistributionRule5() {
                return distributionRule5;
            }

            /**
             * Define el valor de la propiedad distributionRule5.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDistributionRule5(String value) {
                this.distributionRule5 = value;
            }

            /**
             * Obtiene el valor de la propiedad lineGross.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getLineGross() {
                return lineGross;
            }

            /**
             * Define el valor de la propiedad lineGross.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setLineGross(BigDecimal value) {
                this.lineGross = value;
            }

            /**
             * Obtiene el valor de la propiedad lineGrossSys.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getLineGrossSys() {
                return lineGrossSys;
            }

            /**
             * Define el valor de la propiedad lineGrossSys.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setLineGrossSys(BigDecimal value) {
                this.lineGrossSys = value;
            }

            /**
             * Obtiene el valor de la propiedad lineGrossFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getLineGrossFC() {
                return lineGrossFC;
            }

            /**
             * Define el valor de la propiedad lineGrossFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setLineGrossFC(BigDecimal value) {
                this.lineGrossFC = value;
            }

            /**
             * Obtiene el valor de la propiedad docExpenseTaxJurisdictions.
             *
             * @return
             *     possible object is
             *     {@link Document.DocumentAdditionalExpenses.DocumentAdditionalExpense.DocExpenseTaxJurisdictions }
             *
             */
            public Document.DocumentAdditionalExpenses.DocumentAdditionalExpense.DocExpenseTaxJurisdictions getDocExpenseTaxJurisdictions() {
                return docExpenseTaxJurisdictions;
            }

            /**
             * Define el valor de la propiedad docExpenseTaxJurisdictions.
             *
             * @param value
             *     allowed object is
             *     {@link Document.DocumentAdditionalExpenses.DocumentAdditionalExpense.DocExpenseTaxJurisdictions }
             *
             */
            public void setDocExpenseTaxJurisdictions(Document.DocumentAdditionalExpenses.DocumentAdditionalExpense.DocExpenseTaxJurisdictions value) {
                this.docExpenseTaxJurisdictions = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             *
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="DocExpenseTaxJurisdiction" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="JurisdictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="JurisdictionType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="TaxAmountSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="TaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="RowSequence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                 &lt;/all>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "docExpenseTaxJurisdiction"
            })
            public static class DocExpenseTaxJurisdictions {

                @XmlElement(name = "DocExpenseTaxJurisdiction")
                protected List<Document.DocumentAdditionalExpenses.DocumentAdditionalExpense.DocExpenseTaxJurisdictions.DocExpenseTaxJurisdiction> docExpenseTaxJurisdiction;

                /**
                 * Gets the value of the docExpenseTaxJurisdiction property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the docExpenseTaxJurisdiction property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDocExpenseTaxJurisdiction().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Document.DocumentAdditionalExpenses.DocumentAdditionalExpense.DocExpenseTaxJurisdictions.DocExpenseTaxJurisdiction }
                 *
                 *
                 */
                public List<Document.DocumentAdditionalExpenses.DocumentAdditionalExpense.DocExpenseTaxJurisdictions.DocExpenseTaxJurisdiction> getDocExpenseTaxJurisdiction() {
                    if (docExpenseTaxJurisdiction == null) {
                        docExpenseTaxJurisdiction = new ArrayList<Document.DocumentAdditionalExpenses.DocumentAdditionalExpense.DocExpenseTaxJurisdictions.DocExpenseTaxJurisdiction>();
                    }
                    return this.docExpenseTaxJurisdiction;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 *
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;all>
                 *         &lt;element name="JurisdictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="JurisdictionType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="TaxAmountSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="TaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="RowSequence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *       &lt;/all>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class DocExpenseTaxJurisdiction {

                    @XmlElement(name = "JurisdictionCode")
                    protected String jurisdictionCode;
                    @XmlElement(name = "JurisdictionType")
                    protected Long jurisdictionType;
                    @XmlElement(name = "TaxAmount")
                    protected BigDecimal taxAmount;
                    @XmlElement(name = "TaxAmountSC")
                    protected BigDecimal taxAmountSC;
                    @XmlElement(name = "TaxAmountFC")
                    protected BigDecimal taxAmountFC;
                    @XmlElement(name = "TaxRate")
                    protected BigDecimal taxRate;
                    @XmlElement(name = "DocEntry")
                    protected Long docEntry;
                    @XmlElement(name = "LineNumber")
                    protected Long lineNumber;
                    @XmlElement(name = "RowSequence")
                    protected Long rowSequence;

                    /**
                     * Obtiene el valor de la propiedad jurisdictionCode.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getJurisdictionCode() {
                        return jurisdictionCode;
                    }

                    /**
                     * Define el valor de la propiedad jurisdictionCode.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setJurisdictionCode(String value) {
                        this.jurisdictionCode = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad jurisdictionType.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getJurisdictionType() {
                        return jurisdictionType;
                    }

                    /**
                     * Define el valor de la propiedad jurisdictionType.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setJurisdictionType(Long value) {
                        this.jurisdictionType = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxAmount.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getTaxAmount() {
                        return taxAmount;
                    }

                    /**
                     * Define el valor de la propiedad taxAmount.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setTaxAmount(BigDecimal value) {
                        this.taxAmount = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxAmountSC.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getTaxAmountSC() {
                        return taxAmountSC;
                    }

                    /**
                     * Define el valor de la propiedad taxAmountSC.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setTaxAmountSC(BigDecimal value) {
                        this.taxAmountSC = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxAmountFC.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getTaxAmountFC() {
                        return taxAmountFC;
                    }

                    /**
                     * Define el valor de la propiedad taxAmountFC.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setTaxAmountFC(BigDecimal value) {
                        this.taxAmountFC = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxRate.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getTaxRate() {
                        return taxRate;
                    }

                    /**
                     * Define el valor de la propiedad taxRate.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setTaxRate(BigDecimal value) {
                        this.taxRate = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad docEntry.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getDocEntry() {
                        return docEntry;
                    }

                    /**
                     * Define el valor de la propiedad docEntry.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setDocEntry(Long value) {
                        this.docEntry = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad lineNumber.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getLineNumber() {
                        return lineNumber;
                    }

                    /**
                     * Define el valor de la propiedad lineNumber.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setLineNumber(Long value) {
                        this.lineNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad rowSequence.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getRowSequence() {
                        return rowSequence;
                    }

                    /**
                     * Define el valor de la propiedad rowSequence.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setRowSequence(Long value) {
                        this.rowSequence = value;
                    }

                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Document_ApprovalRequest" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="ApprovalTemplatesID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "documentApprovalRequest"
    })
    public static class DocumentApprovalRequests {

        @XmlElement(name = "Document_ApprovalRequest")
        protected List<Document.DocumentApprovalRequests.DocumentApprovalRequest> documentApprovalRequest;

        /**
         * Gets the value of the documentApprovalRequest property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documentApprovalRequest property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumentApprovalRequest().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Document.DocumentApprovalRequests.DocumentApprovalRequest }
         *
         *
         */
        public List<Document.DocumentApprovalRequests.DocumentApprovalRequest> getDocumentApprovalRequest() {
            if (documentApprovalRequest == null) {
                documentApprovalRequest = new ArrayList<Document.DocumentApprovalRequests.DocumentApprovalRequest>();
            }
            return this.documentApprovalRequest;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="ApprovalTemplatesID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class DocumentApprovalRequest {

            @XmlElement(name = "ApprovalTemplatesID")
            protected Long approvalTemplatesID;
            @XmlElement(name = "Remarks")
            protected String remarks;

            /**
             * Obtiene el valor de la propiedad approvalTemplatesID.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getApprovalTemplatesID() {
                return approvalTemplatesID;
            }

            /**
             * Define el valor de la propiedad approvalTemplatesID.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setApprovalTemplatesID(Long value) {
                this.approvalTemplatesID = value;
            }

            /**
             * Obtiene el valor de la propiedad remarks.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getRemarks() {
                return remarks;
            }

            /**
             * Define el valor de la propiedad remarks.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setRemarks(String value) {
                this.remarks = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DocumentLine" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="PriceAfterVAT" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="VendorNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SalesPersonCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="CommisionPercent" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="TreeType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="iNotATree"/>
     *                         &lt;enumeration value="iAssemblyTree"/>
     *                         &lt;enumeration value="iSalesTree"/>
     *                         &lt;enumeration value="iProductionTree"/>
     *                         &lt;enumeration value="iTemplateTree"/>
     *                         &lt;enumeration value="iIngredient"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="UseBaseUnits" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="SupplierCatNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CostingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ProjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BarCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="VatGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Height1" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="Hight1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Height2" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="Height2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Lengh1" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="Lengh1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Lengh2" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="Lengh2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Weight1" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="Weight1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Weight2" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="Weight2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Factor1" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="Factor2" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="Factor3" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="Factor4" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="BaseType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BaseEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BaseLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="VolumeUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Width1" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="Width1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Width2" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="Width2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TaxType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tt_Yes"/>
     *                         &lt;enumeration value="tt_No"/>
     *                         &lt;enumeration value="tt_UseTax"/>
     *                         &lt;enumeration value="tt_OffsetTax"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TaxLiable" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PickStatus" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PickQuantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="PickListIdNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="OriginalItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BackOrder" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="FreeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ShippingMethod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="POTargetNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="POTargetEntry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="POTargetRowNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="CorrectionInvoiceItem" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="ciis_Was"/>
     *                         &lt;enumeration value="ciis_ShouldBe"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CorrInvAmountToStock" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="CorrInvAmountToDiffAcct" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="AppliedTax" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="AppliedTaxFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="AppliedTaxSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="WTLiable" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DeferredTax" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="EqualizationTaxPercent" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="TotalEqualizationTax" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="TotalEqualizationTaxFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="TotalEqualizationTaxSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="NetTaxAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="NetTaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="NetTaxAmountSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="MeasureUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="UnitsOfMeasurment" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="LineTotal" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="TaxPercentagePerRow" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="TaxTotal" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="ConsumerSalesForecast" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ExciseAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="TaxPerUnit" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="TotalInclTax" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="CountryOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SWW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TransactionType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="botrntComplete"/>
     *                         &lt;enumeration value="botrntReject"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DistributeExpense" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="RowTotalFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="RowTotalSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="LastBuyInmPrice" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="LastBuyDistributeSumFc" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="LastBuyDistributeSumSc" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="LastBuyDistributeSum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="StockDistributesumForeign" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="StockDistributesumSystem" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="StockDistributesum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="StockInmPrice" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="PickStatusEx" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="dlps_Picked"/>
     *                         &lt;enumeration value="dlps_NotPicked"/>
     *                         &lt;enumeration value="dlps_ReleasedForPicking"/>
     *                         &lt;enumeration value="dlps_PartiallyPicked"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TaxBeforeDPM" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="TaxBeforeDPMFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="TaxBeforeDPMSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="CFOPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CSTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Usage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="TaxOnly" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="VisualOrder" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BaseOpenQuantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="LineStatus" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="bost_Open"/>
     *                         &lt;enumeration value="bost_Close"/>
     *                         &lt;enumeration value="bost_Paid"/>
     *                         &lt;enumeration value="bost_Delivered"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PackageQuantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LineType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="dlt_Regular"/>
     *                         &lt;enumeration value="dlt_Alternative"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="COGSCostingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="COGSAccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ChangeAssemlyBoMWarehouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="GrossBuyPrice" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="GrossBase" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="GrossProfitTotalBasePrice" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="CostingCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CostingCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CostingCode4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CostingCode5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ItemDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="ActualDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="RemainingOpenQuantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="OpenAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="OpenAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="OpenAmountSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="ExLineNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RequiredDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="RequiredQuantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="COGSCostingCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="COGSCostingCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="COGSCostingCode4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="COGSCostingCode5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CSTforIPI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CSTforPIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CSTforCOFINS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CreditOriginCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WithoutInventoryMovement" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="AgreementNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="AgreementRowNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="ActualBaseEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="ActualBaseLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Surpluses" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="DefectAndBreakup" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="Shortages" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="ConsiderQuantity" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PartialRetirement" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="RetirementQuantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="RetirementAPC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="ThirdParty" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ExpenseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ReceiptNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ExpenseOperationType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="bo_ExpOpType_ProfessionalServices"/>
     *                         &lt;enumeration value="bo_ExpOpType_RentingAssets"/>
     *                         &lt;enumeration value="bo_ExpOpType_Others"/>
     *                         &lt;enumeration value="bo_ExpOpType_None"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="FederalTaxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="StgSeqNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="StgEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="StgDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="UoMCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="InventoryQuantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="RemainingOpenInventoryQuantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="ParentLineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Incoterms" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="TransportMode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="ItemType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="dit_Item"/>
     *                         &lt;enumeration value="dit_Resource"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ChangeInventoryQuantityIndependently" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="FreeOfChargeBP" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="SACEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="HSNEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="GrossPrice" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="GrossTotal" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="GrossTotalFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="GrossTotalSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="NCMCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="ShipToCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ShipToDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_PREC_LIS" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="U_DIF_PREC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="U_COSTOIMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_BANCO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_UBICACION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_CHEQUE" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="U_VAL_PRECIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_CAUSAL_DEV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_STOCK_ALM" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="U_DISPONIBLE_ALM" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="U_BLD_LyID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="U_BLD_NCps" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="U_Referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_Diferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_Precio_Cotizacion" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="U_IVCDone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_NWR_Base" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_CustDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="U_DocNumBase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_ObjType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_NWR_QtyAllocated" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="U_ReclamQty" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="U_QAMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_IncomingQty" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="U_NWR_Bin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_TransitWHSCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_CalcAIU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LineTaxJurisdictions" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="LineTaxJurisdiction" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="JurisdictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="JurisdictionType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="TaxAmountSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="TaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="RowSequence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DocumentLineAdditionalExpenses" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DocumentLineAdditionalExpense" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="ExpenseCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="LineTotal" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="LineTotalFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="LineTotalSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="PaidToDate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="PaidToDateFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="PaidToDateSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="TaxLiable" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;enumeration value="tNO"/>
     *                                             &lt;enumeration value="tYES"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="VatGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="TaxPercent" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="TaxSum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="TaxSumFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="TaxSumSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="DeductibleTaxSum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="DeductibleTaxSumFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="DeductibleTaxSumSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="AquisitionTax" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;enumeration value="tNO"/>
     *                                             &lt;enumeration value="tYES"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="TaxType" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;enumeration value="aext_NormalTax"/>
     *                                             &lt;enumeration value="aext_NoTax"/>
     *                                             &lt;enumeration value="aext_UseTax"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="TaxPaid" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="TaxPaidFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="TaxPaidSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="EqualizationTaxPercent" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="EqualizationTaxSum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="EqualizationTaxFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="EqualizationTaxSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="TaxTotalSum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="TaxTotalSumFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="TaxTotalSumSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="WTLiable" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;enumeration value="tNO"/>
     *                                             &lt;enumeration value="tYES"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="BaseGroup" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="DistributionRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Project" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="DistributionRule2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="DistributionRule3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="DistributionRule4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="DistributionRule5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="LineExpenseTaxJurisdictions" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="LineExpenseTaxJurisdiction" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;all>
     *                                                           &lt;element name="JurisdictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                           &lt;element name="JurisdictionType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                                           &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                                           &lt;element name="TaxAmountSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                                           &lt;element name="TaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                                           &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                                           &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                                           &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                                           &lt;element name="RowSequence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                                         &lt;/all>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="WithholdingTaxLines" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="WithholdingTaxLine" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="WTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="WTAmountSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="WTAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="WTAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="WithholdingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="TaxableAmountinSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="TaxableAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="TaxableAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="RoundingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="Criteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="BaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="AppliedWTAmountSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="AppliedWTAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="AppliedWTAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="GLAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="BaseDocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="BaseDocLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="BaseDocType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="BaseDocumentReference" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="Status" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;enumeration value="bost_Open"/>
     *                                             &lt;enumeration value="bost_Close"/>
     *                                             &lt;enumeration value="bost_Paid"/>
     *                                             &lt;enumeration value="bost_Delivered"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="TargetAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="TargetDocumentType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="CSTCodeIncoming" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="CSTCodeOutgoing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="U_Base_ML" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="U_Base_MS" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="U_Base_ME" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="U_Tarifa" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="U_Fuente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="U_Ret_ML" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="U_Ret_MS" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="U_Ret_ME" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SerialNumbers" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SerialNumber" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="ManufacturerSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="InternalSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="ManufactureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="ReceptionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="WarrantyStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="WarrantyEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="BatchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="SystemSerialNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="BaseLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="TrackingNote" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="TrackingNoteLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="BatchNumbers" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="BatchNumber" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="BatchNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="ManufacturerSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="InternalSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="ManufacturingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="AddmisionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="BaseLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="TrackingNote" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="TrackingNoteLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DocumentLinesBinAllocations" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DocumentLinesBinAllocation" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="BinAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                                       &lt;element name="AllowNegativeQuantity" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;enumeration value="tNO"/>
     *                                             &lt;enumeration value="tYES"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="SerialAndBatchNumbersBaseLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                       &lt;element name="BaseLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "documentLine"
    })
    public static class DocumentLines {

        @XmlElement(name = "DocumentLine")
        protected List<Document.DocumentLines.DocumentLine> documentLine;

        /**
         * Gets the value of the documentLine property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documentLine property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumentLine().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Document.DocumentLines.DocumentLine }
         *
         *
         */
        public List<Document.DocumentLines.DocumentLine> getDocumentLine() {
            if (documentLine == null) {
                documentLine = new ArrayList<Document.DocumentLines.DocumentLine>();
            }
            return this.documentLine;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="PriceAfterVAT" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="VendorNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WarehouseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SalesPersonCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="CommisionPercent" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="TreeType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="iNotATree"/>
         *               &lt;enumeration value="iAssemblyTree"/>
         *               &lt;enumeration value="iSalesTree"/>
         *               &lt;enumeration value="iProductionTree"/>
         *               &lt;enumeration value="iTemplateTree"/>
         *               &lt;enumeration value="iIngredient"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="UseBaseUnits" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="SupplierCatNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CostingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ProjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BarCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="VatGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Height1" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="Hight1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Height2" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="Height2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Lengh1" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="Lengh1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Lengh2" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="Lengh2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Weight1" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="Weight1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Weight2" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="Weight2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Factor1" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="Factor2" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="Factor3" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="Factor4" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="BaseType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BaseEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BaseLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="VolumeUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Width1" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="Width1Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Width2" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="Width2Unit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TaxType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tt_Yes"/>
         *               &lt;enumeration value="tt_No"/>
         *               &lt;enumeration value="tt_UseTax"/>
         *               &lt;enumeration value="tt_OffsetTax"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TaxLiable" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PickStatus" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PickQuantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="PickListIdNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="OriginalItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BackOrder" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="FreeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ShippingMethod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="POTargetNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="POTargetEntry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="POTargetRowNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="CorrectionInvoiceItem" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="ciis_Was"/>
         *               &lt;enumeration value="ciis_ShouldBe"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CorrInvAmountToStock" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="CorrInvAmountToDiffAcct" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="AppliedTax" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="AppliedTaxFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="AppliedTaxSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="WTLiable" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DeferredTax" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="EqualizationTaxPercent" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="TotalEqualizationTax" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="TotalEqualizationTaxFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="TotalEqualizationTaxSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="NetTaxAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="NetTaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="NetTaxAmountSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="MeasureUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="UnitsOfMeasurment" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="LineTotal" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="TaxPercentagePerRow" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="TaxTotal" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="ConsumerSalesForecast" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ExciseAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="TaxPerUnit" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="TotalInclTax" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="CountryOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SWW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TransactionType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="botrntComplete"/>
         *               &lt;enumeration value="botrntReject"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DistributeExpense" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="RowTotalFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="RowTotalSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="LastBuyInmPrice" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="LastBuyDistributeSumFc" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="LastBuyDistributeSumSc" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="LastBuyDistributeSum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="StockDistributesumForeign" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="StockDistributesumSystem" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="StockDistributesum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="StockInmPrice" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="PickStatusEx" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="dlps_Picked"/>
         *               &lt;enumeration value="dlps_NotPicked"/>
         *               &lt;enumeration value="dlps_ReleasedForPicking"/>
         *               &lt;enumeration value="dlps_PartiallyPicked"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TaxBeforeDPM" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="TaxBeforeDPMFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="TaxBeforeDPMSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="CFOPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CSTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Usage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="TaxOnly" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="VisualOrder" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BaseOpenQuantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="LineStatus" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="bost_Open"/>
         *               &lt;enumeration value="bost_Close"/>
         *               &lt;enumeration value="bost_Paid"/>
         *               &lt;enumeration value="bost_Delivered"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PackageQuantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LineType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="dlt_Regular"/>
         *               &lt;enumeration value="dlt_Alternative"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="COGSCostingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="COGSAccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ChangeAssemlyBoMWarehouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="GrossBuyPrice" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="GrossBase" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="GrossProfitTotalBasePrice" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="CostingCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CostingCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CostingCode4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CostingCode5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ItemDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="ActualDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="RemainingOpenQuantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="OpenAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="OpenAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="OpenAmountSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="ExLineNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RequiredDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="RequiredQuantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="COGSCostingCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="COGSCostingCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="COGSCostingCode4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="COGSCostingCode5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CSTforIPI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CSTforPIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CSTforCOFINS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CreditOriginCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WithoutInventoryMovement" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="AgreementNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="AgreementRowNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="ActualBaseEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="ActualBaseLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Surpluses" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="DefectAndBreakup" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="Shortages" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="ConsiderQuantity" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PartialRetirement" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="RetirementQuantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="RetirementAPC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="ThirdParty" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ExpenseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ReceiptNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ExpenseOperationType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="bo_ExpOpType_ProfessionalServices"/>
         *               &lt;enumeration value="bo_ExpOpType_RentingAssets"/>
         *               &lt;enumeration value="bo_ExpOpType_Others"/>
         *               &lt;enumeration value="bo_ExpOpType_None"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="FederalTaxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="StgSeqNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="StgEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="StgDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="UoMEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="UoMCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="InventoryQuantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="RemainingOpenInventoryQuantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="ParentLineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Incoterms" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="TransportMode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="ItemType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="dit_Item"/>
         *               &lt;enumeration value="dit_Resource"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ChangeInventoryQuantityIndependently" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="FreeOfChargeBP" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="SACEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="HSNEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="GrossPrice" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="GrossTotal" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="GrossTotalFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="GrossTotalSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="NCMCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="ShipToCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ShipToDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_PREC_LIS" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="U_DIF_PREC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="U_COSTOIMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_BANCO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_UBICACION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_CHEQUE" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="U_VAL_PRECIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_CAUSAL_DEV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_STOCK_ALM" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="U_DISPONIBLE_ALM" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="U_BLD_LyID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="U_BLD_NCps" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="U_Referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_Diferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_Precio_Cotizacion" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="U_IVCDone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_NWR_Base" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_CustDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="U_DocNumBase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_ObjType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_NWR_QtyAllocated" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="U_ReclamQty" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="U_QAMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_IncomingQty" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="U_NWR_Bin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_TransitWHSCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_CalcAIU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LineTaxJurisdictions" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="LineTaxJurisdiction" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="JurisdictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="JurisdictionType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="TaxAmountSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="TaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="RowSequence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                           &lt;/all>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DocumentLineAdditionalExpenses" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DocumentLineAdditionalExpense" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="ExpenseCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="LineTotal" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="LineTotalFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="LineTotalSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="PaidToDate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="PaidToDateFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="PaidToDateSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="TaxLiable" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;enumeration value="tNO"/>
         *                                   &lt;enumeration value="tYES"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="VatGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="TaxPercent" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="TaxSum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="TaxSumFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="TaxSumSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="DeductibleTaxSum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="DeductibleTaxSumFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="DeductibleTaxSumSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="AquisitionTax" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;enumeration value="tNO"/>
         *                                   &lt;enumeration value="tYES"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="TaxType" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;enumeration value="aext_NormalTax"/>
         *                                   &lt;enumeration value="aext_NoTax"/>
         *                                   &lt;enumeration value="aext_UseTax"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="TaxPaid" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="TaxPaidFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="TaxPaidSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="EqualizationTaxPercent" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="EqualizationTaxSum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="EqualizationTaxFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="EqualizationTaxSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="TaxTotalSum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="TaxTotalSumFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="TaxTotalSumSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="WTLiable" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;enumeration value="tNO"/>
         *                                   &lt;enumeration value="tYES"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="BaseGroup" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="DistributionRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Project" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="DistributionRule2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="DistributionRule3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="DistributionRule4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="DistributionRule5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="LineExpenseTaxJurisdictions" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="LineExpenseTaxJurisdiction" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;all>
         *                                                 &lt;element name="JurisdictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                 &lt;element name="JurisdictionType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                                                 &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                                                 &lt;element name="TaxAmountSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                                                 &lt;element name="TaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                                                 &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                                                 &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                                                 &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                                                 &lt;element name="RowSequence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                                               &lt;/all>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/all>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="WithholdingTaxLines" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="WithholdingTaxLine" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="WTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="WTAmountSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="WTAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="WTAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="WithholdingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="TaxableAmountinSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="TaxableAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="TaxableAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="RoundingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="Criteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="BaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="AppliedWTAmountSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="AppliedWTAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="AppliedWTAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="GLAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="BaseDocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="BaseDocLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="BaseDocType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="BaseDocumentReference" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="Status" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;enumeration value="bost_Open"/>
         *                                   &lt;enumeration value="bost_Close"/>
         *                                   &lt;enumeration value="bost_Paid"/>
         *                                   &lt;enumeration value="bost_Delivered"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="TargetAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="TargetDocumentType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="CSTCodeIncoming" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="CSTCodeOutgoing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="U_Base_ML" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="U_Base_MS" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="U_Base_ME" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="U_Tarifa" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="U_Fuente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="U_Ret_ML" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="U_Ret_MS" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="U_Ret_ME" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                           &lt;/all>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SerialNumbers" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SerialNumber" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="ManufacturerSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="InternalSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="ManufactureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="ReceptionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="WarrantyStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="WarrantyEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="BatchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="SystemSerialNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="BaseLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="TrackingNote" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="TrackingNoteLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                           &lt;/all>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="BatchNumbers" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="BatchNumber" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="BatchNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="ManufacturerSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="InternalSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="ManufacturingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="AddmisionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="BaseLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="TrackingNote" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="TrackingNoteLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                           &lt;/all>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DocumentLinesBinAllocations" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DocumentLinesBinAllocation" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="BinAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *                             &lt;element name="AllowNegativeQuantity" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;enumeration value="tNO"/>
         *                                   &lt;enumeration value="tYES"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="SerialAndBatchNumbersBaseLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                             &lt;element name="BaseLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                           &lt;/all>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class DocumentLine {

            @XmlElement(name = "LineNum")
            protected Long lineNum;
            @XmlElement(name = "ItemCode")
            protected String itemCode;
            @XmlElement(name = "ItemDescription")
            protected String itemDescription;
            @XmlElement(name = "Quantity")
            protected Double quantity;
            @XmlElement(name = "ShipDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar shipDate;
            @XmlElement(name = "Price")
            protected BigDecimal price;
            @XmlElement(name = "PriceAfterVAT")
            protected BigDecimal priceAfterVAT;
            @XmlElement(name = "Currency")
            protected String currency;
            @XmlElement(name = "Rate")
            protected BigDecimal rate;
            @XmlElement(name = "DiscountPercent")
            protected BigDecimal discountPercent;
            @XmlElement(name = "VendorNum")
            protected String vendorNum;
            @XmlElement(name = "SerialNum")
            protected String serialNum;
            @XmlElement(name = "WarehouseCode")
            protected String warehouseCode;
            @XmlElement(name = "SalesPersonCode")
            protected Long salesPersonCode;
            @XmlElement(name = "CommisionPercent")
            protected BigDecimal commisionPercent;
            @XmlElement(name = "TreeType")
            protected String treeType;
            @XmlElement(name = "AccountCode")
            protected String accountCode;
            @XmlElement(name = "UseBaseUnits")
            protected String useBaseUnits;
            @XmlElement(name = "SupplierCatNum")
            protected String supplierCatNum;
            @XmlElement(name = "CostingCode")
            protected String costingCode;
            @XmlElement(name = "ProjectCode")
            protected String projectCode;
            @XmlElement(name = "BarCode")
            protected String barCode;
            @XmlElement(name = "VatGroup")
            protected String vatGroup;
            @XmlElement(name = "Height1")
            protected BigDecimal height1;
            @XmlElement(name = "Hight1Unit")
            protected Long hight1Unit;
            @XmlElement(name = "Height2")
            protected BigDecimal height2;
            @XmlElement(name = "Height2Unit")
            protected Long height2Unit;
            @XmlElement(name = "Lengh1")
            protected BigDecimal lengh1;
            @XmlElement(name = "Lengh1Unit")
            protected Long lengh1Unit;
            @XmlElement(name = "Lengh2")
            protected BigDecimal lengh2;
            @XmlElement(name = "Lengh2Unit")
            protected Long lengh2Unit;
            @XmlElement(name = "Weight1")
            protected BigDecimal weight1;
            @XmlElement(name = "Weight1Unit")
            protected Long weight1Unit;
            @XmlElement(name = "Weight2")
            protected BigDecimal weight2;
            @XmlElement(name = "Weight2Unit")
            protected Long weight2Unit;
            @XmlElement(name = "Factor1")
            protected BigDecimal factor1;
            @XmlElement(name = "Factor2")
            protected BigDecimal factor2;
            @XmlElement(name = "Factor3")
            protected BigDecimal factor3;
            @XmlElement(name = "Factor4")
            protected BigDecimal factor4;
            @XmlElement(name = "BaseType")
            protected Long baseType;
            @XmlElement(name = "BaseEntry")
            protected Long baseEntry;
            @XmlElement(name = "BaseLine")
            protected Long baseLine;
            @XmlElement(name = "Volume")
            protected BigDecimal volume;
            @XmlElement(name = "VolumeUnit")
            protected Long volumeUnit;
            @XmlElement(name = "Width1")
            protected BigDecimal width1;
            @XmlElement(name = "Width1Unit")
            protected Long width1Unit;
            @XmlElement(name = "Width2")
            protected BigDecimal width2;
            @XmlElement(name = "Width2Unit")
            protected Long width2Unit;
            @XmlElement(name = "Address")
            protected String address;
            @XmlElement(name = "TaxCode")
            protected String taxCode;
            @XmlElement(name = "TaxType")
            protected String taxType;
            @XmlElement(name = "TaxLiable")
            protected String taxLiable;
            @XmlElement(name = "PickStatus")
            protected String pickStatus;
            @XmlElement(name = "PickQuantity")
            protected BigDecimal pickQuantity;
            @XmlElement(name = "PickListIdNumber")
            protected Long pickListIdNumber;
            @XmlElement(name = "OriginalItem")
            protected String originalItem;
            @XmlElement(name = "BackOrder")
            protected String backOrder;
            @XmlElement(name = "FreeText")
            protected String freeText;
            @XmlElement(name = "ShippingMethod")
            protected Long shippingMethod;
            @XmlElement(name = "POTargetNum")
            protected Long poTargetNum;
            @XmlElement(name = "POTargetEntry")
            protected String poTargetEntry;
            @XmlElement(name = "POTargetRowNum")
            protected Long poTargetRowNum;
            @XmlElement(name = "CorrectionInvoiceItem")
            protected String correctionInvoiceItem;
            @XmlElement(name = "CorrInvAmountToStock")
            protected BigDecimal corrInvAmountToStock;
            @XmlElement(name = "CorrInvAmountToDiffAcct")
            protected BigDecimal corrInvAmountToDiffAcct;
            @XmlElement(name = "AppliedTax")
            protected BigDecimal appliedTax;
            @XmlElement(name = "AppliedTaxFC")
            protected BigDecimal appliedTaxFC;
            @XmlElement(name = "AppliedTaxSC")
            protected BigDecimal appliedTaxSC;
            @XmlElement(name = "WTLiable")
            protected String wtLiable;
            @XmlElement(name = "DeferredTax")
            protected String deferredTax;
            @XmlElement(name = "EqualizationTaxPercent")
            protected BigDecimal equalizationTaxPercent;
            @XmlElement(name = "TotalEqualizationTax")
            protected BigDecimal totalEqualizationTax;
            @XmlElement(name = "TotalEqualizationTaxFC")
            protected BigDecimal totalEqualizationTaxFC;
            @XmlElement(name = "TotalEqualizationTaxSC")
            protected BigDecimal totalEqualizationTaxSC;
            @XmlElement(name = "NetTaxAmount")
            protected BigDecimal netTaxAmount;
            @XmlElement(name = "NetTaxAmountFC")
            protected BigDecimal netTaxAmountFC;
            @XmlElement(name = "NetTaxAmountSC")
            protected BigDecimal netTaxAmountSC;
            @XmlElement(name = "MeasureUnit")
            protected String measureUnit;
            @XmlElement(name = "UnitsOfMeasurment")
            protected BigDecimal unitsOfMeasurment;
            @XmlElement(name = "LineTotal")
            protected BigDecimal lineTotal;
            @XmlElement(name = "TaxPercentagePerRow")
            protected BigDecimal taxPercentagePerRow;
            @XmlElement(name = "TaxTotal")
            protected BigDecimal taxTotal;
            @XmlElement(name = "ConsumerSalesForecast")
            protected String consumerSalesForecast;
            @XmlElement(name = "ExciseAmount")
            protected BigDecimal exciseAmount;
            @XmlElement(name = "TaxPerUnit")
            protected BigDecimal taxPerUnit;
            @XmlElement(name = "TotalInclTax")
            protected BigDecimal totalInclTax;
            @XmlElement(name = "CountryOrg")
            protected String countryOrg;
            @XmlElement(name = "SWW")
            protected String sww;
            @XmlElement(name = "TransactionType")
            protected String transactionType;
            @XmlElement(name = "DistributeExpense")
            protected String distributeExpense;
            @XmlElement(name = "RowTotalFC")
            protected BigDecimal rowTotalFC;
            @XmlElement(name = "RowTotalSC")
            protected BigDecimal rowTotalSC;
            @XmlElement(name = "LastBuyInmPrice")
            protected BigDecimal lastBuyInmPrice;
            @XmlElement(name = "LastBuyDistributeSumFc")
            protected BigDecimal lastBuyDistributeSumFc;
            @XmlElement(name = "LastBuyDistributeSumSc")
            protected BigDecimal lastBuyDistributeSumSc;
            @XmlElement(name = "LastBuyDistributeSum")
            protected BigDecimal lastBuyDistributeSum;
            @XmlElement(name = "StockDistributesumForeign")
            protected BigDecimal stockDistributesumForeign;
            @XmlElement(name = "StockDistributesumSystem")
            protected BigDecimal stockDistributesumSystem;
            @XmlElement(name = "StockDistributesum")
            protected BigDecimal stockDistributesum;
            @XmlElement(name = "StockInmPrice")
            protected BigDecimal stockInmPrice;
            @XmlElement(name = "PickStatusEx")
            protected String pickStatusEx;
            @XmlElement(name = "TaxBeforeDPM")
            protected BigDecimal taxBeforeDPM;
            @XmlElement(name = "TaxBeforeDPMFC")
            protected BigDecimal taxBeforeDPMFC;
            @XmlElement(name = "TaxBeforeDPMSC")
            protected BigDecimal taxBeforeDPMSC;
            @XmlElement(name = "CFOPCode")
            protected String cfopCode;
            @XmlElement(name = "CSTCode")
            protected String cstCode;
            @XmlElement(name = "Usage")
            protected Long usage;
            @XmlElement(name = "TaxOnly")
            protected String taxOnly;
            @XmlElement(name = "VisualOrder")
            protected Long visualOrder;
            @XmlElement(name = "BaseOpenQuantity")
            protected BigDecimal baseOpenQuantity;
            @XmlElement(name = "UnitPrice")
            protected BigDecimal unitPrice;
            @XmlElement(name = "LineStatus")
            protected String lineStatus;
            @XmlElement(name = "PackageQuantity")
            protected BigDecimal packageQuantity;
            @XmlElement(name = "Text")
            protected String text;
            @XmlElement(name = "LineType")
            protected String lineType;
            @XmlElement(name = "COGSCostingCode")
            protected String cogsCostingCode;
            @XmlElement(name = "COGSAccountCode")
            protected String cogsAccountCode;
            @XmlElement(name = "ChangeAssemlyBoMWarehouse")
            protected String changeAssemlyBoMWarehouse;
            @XmlElement(name = "GrossBuyPrice")
            protected BigDecimal grossBuyPrice;
            @XmlElement(name = "GrossBase")
            protected Long grossBase;
            @XmlElement(name = "GrossProfitTotalBasePrice")
            protected BigDecimal grossProfitTotalBasePrice;
            @XmlElement(name = "CostingCode2")
            protected String costingCode2;
            @XmlElement(name = "CostingCode3")
            protected String costingCode3;
            @XmlElement(name = "CostingCode4")
            protected String costingCode4;
            @XmlElement(name = "CostingCode5")
            protected String costingCode5;
            @XmlElement(name = "ItemDetails")
            protected String itemDetails;
            @XmlElement(name = "LocationCode")
            protected Long locationCode;
            @XmlElement(name = "ActualDeliveryDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar actualDeliveryDate;
            @XmlElement(name = "RemainingOpenQuantity")
            protected BigDecimal remainingOpenQuantity;
            @XmlElement(name = "OpenAmount")
            protected BigDecimal openAmount;
            @XmlElement(name = "OpenAmountFC")
            protected BigDecimal openAmountFC;
            @XmlElement(name = "OpenAmountSC")
            protected BigDecimal openAmountSC;
            @XmlElement(name = "ExLineNo")
            protected String exLineNo;
            @XmlElement(name = "RequiredDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar requiredDate;
            @XmlElement(name = "RequiredQuantity")
            protected BigDecimal requiredQuantity;
            @XmlElement(name = "COGSCostingCode2")
            protected String cogsCostingCode2;
            @XmlElement(name = "COGSCostingCode3")
            protected String cogsCostingCode3;
            @XmlElement(name = "COGSCostingCode4")
            protected String cogsCostingCode4;
            @XmlElement(name = "COGSCostingCode5")
            protected String cogsCostingCode5;
            @XmlElement(name = "CSTforIPI")
            protected String csTforIPI;
            @XmlElement(name = "CSTforPIS")
            protected String csTforPIS;
            @XmlElement(name = "CSTforCOFINS")
            protected String csTforCOFINS;
            @XmlElement(name = "CreditOriginCode")
            protected String creditOriginCode;
            @XmlElement(name = "WithoutInventoryMovement")
            protected String withoutInventoryMovement;
            @XmlElement(name = "AgreementNo")
            protected Long agreementNo;
            @XmlElement(name = "AgreementRowNumber")
            protected Long agreementRowNumber;
            @XmlElement(name = "ActualBaseEntry")
            protected Long actualBaseEntry;
            @XmlElement(name = "ActualBaseLine")
            protected Long actualBaseLine;
            @XmlElement(name = "DocEntry")
            protected Long docEntry;
            @XmlElement(name = "Surpluses")
            protected BigDecimal surpluses;
            @XmlElement(name = "DefectAndBreakup")
            protected BigDecimal defectAndBreakup;
            @XmlElement(name = "Shortages")
            protected BigDecimal shortages;
            @XmlElement(name = "ConsiderQuantity")
            protected String considerQuantity;
            @XmlElement(name = "PartialRetirement")
            protected String partialRetirement;
            @XmlElement(name = "RetirementQuantity")
            protected BigDecimal retirementQuantity;
            @XmlElement(name = "RetirementAPC")
            protected BigDecimal retirementAPC;
            @XmlElement(name = "ThirdParty")
            protected String thirdParty;
            @XmlElement(name = "ExpenseType")
            protected String expenseType;
            @XmlElement(name = "ReceiptNumber")
            protected String receiptNumber;
            @XmlElement(name = "ExpenseOperationType")
            protected String expenseOperationType;
            @XmlElement(name = "FederalTaxID")
            protected String federalTaxID;
            @XmlElement(name = "StgSeqNum")
            protected Long stgSeqNum;
            @XmlElement(name = "StgEntry")
            protected Long stgEntry;
            @XmlElement(name = "StgDesc")
            protected String stgDesc;
            @XmlElement(name = "UoMEntry")
            protected Long uoMEntry;
            @XmlElement(name = "UoMCode")
            protected String uoMCode;
            @XmlElement(name = "InventoryQuantity")
            protected BigDecimal inventoryQuantity;
            @XmlElement(name = "RemainingOpenInventoryQuantity")
            protected BigDecimal remainingOpenInventoryQuantity;
            @XmlElement(name = "ParentLineNum")
            protected Long parentLineNum;
            @XmlElement(name = "Incoterms")
            protected Long incoterms;
            @XmlElement(name = "TransportMode")
            protected Long transportMode;
            @XmlElement(name = "ItemType")
            protected String itemType;
            @XmlElement(name = "ChangeInventoryQuantityIndependently")
            protected String changeInventoryQuantityIndependently;
            @XmlElement(name = "FreeOfChargeBP")
            protected String freeOfChargeBP;
            @XmlElement(name = "SACEntry")
            protected Long sacEntry;
            @XmlElement(name = "HSNEntry")
            protected Long hsnEntry;
            @XmlElement(name = "GrossPrice")
            protected BigDecimal grossPrice;
            @XmlElement(name = "GrossTotal")
            protected BigDecimal grossTotal;
            @XmlElement(name = "GrossTotalFC")
            protected BigDecimal grossTotalFC;
            @XmlElement(name = "GrossTotalSC")
            protected BigDecimal grossTotalSC;
            @XmlElement(name = "NCMCode")
            protected Long ncmCode;
            @XmlElement(name = "ShipToCode")
            protected String shipToCode;
            @XmlElement(name = "ShipToDescription")
            protected String shipToDescription;
            @XmlElement(name = "U_PREC_LIS")
            protected BigDecimal upreclis;
            @XmlElement(name = "U_DIF_PREC")
            protected BigDecimal udifprec;
            @XmlElement(name = "U_COSTOIMP")
            protected String ucostoimp;
            @XmlElement(name = "U_BANCO")
            protected String ubanco;
            @XmlElement(name = "U_UBICACION")
            protected String uubicacion;
            @XmlElement(name = "U_CHEQUE")
            protected Long ucheque;
            @XmlElement(name = "U_VAL_PRECIO")
            protected String uvalprecio;
            @XmlElement(name = "U_CAUSAL_DEV")
            protected String ucausaldev;
            @XmlElement(name = "U_STOCK_ALM")
            protected BigDecimal ustockalm;
            @XmlElement(name = "U_DISPONIBLE_ALM")
            protected BigDecimal udisponiblealm;
            @XmlElement(name = "U_BLD_LyID")
            protected Long ubldLyID;
            @XmlElement(name = "U_BLD_NCps")
            protected Long ubldnCps;
            @XmlElement(name = "U_Referencia")
            protected String uReferencia;
            @XmlElement(name = "U_Diferencia")
            protected String uDiferencia;
            @XmlElement(name = "U_Precio_Cotizacion")
            protected BigDecimal uPrecioCotizacion;
            @XmlElement(name = "U_IVCDone")
            protected String uivcDone;
            @XmlElement(name = "U_NWR_Base")
            protected String unwrBase;
            @XmlElement(name = "U_CustDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar uCustDate;
            @XmlElement(name = "U_DocNumBase")
            protected String uDocNumBase;
            @XmlElement(name = "U_ObjType")
            protected String uObjType;
            @XmlElement(name = "U_NWR_QtyAllocated")
            protected BigDecimal unwrQtyAllocated;
            @XmlElement(name = "U_ReclamQty")
            protected BigDecimal uReclamQty;
            @XmlElement(name = "U_QAMark")
            protected String uqaMark;
            @XmlElement(name = "U_IncomingQty")
            protected BigDecimal uIncomingQty;
            @XmlElement(name = "U_NWR_Bin")
            protected String unwrBin;
            @XmlElement(name = "U_TransitWHSCode")
            protected String uTransitWHSCode;
            @XmlElement(name = "U_CalcAIU")
            protected String uCalcAIU;
            @XmlElement(name = "LineTaxJurisdictions")
            protected Document.DocumentLines.DocumentLine.LineTaxJurisdictions lineTaxJurisdictions;
            @XmlElement(name = "DocumentLineAdditionalExpenses")
            protected Document.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses documentLineAdditionalExpenses;
            @XmlElement(name = "WithholdingTaxLines")
            protected Document.DocumentLines.DocumentLine.WithholdingTaxLines withholdingTaxLines;
            @XmlElement(name = "SerialNumbers")
            protected Document.DocumentLines.DocumentLine.SerialNumbers serialNumbers;
            @XmlElement(name = "BatchNumbers")
            protected Document.DocumentLines.DocumentLine.BatchNumbers batchNumbers;
            @XmlElement(name = "DocumentLinesBinAllocations")
            protected Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations documentLinesBinAllocations;

            /**
             * Obtiene el valor de la propiedad lineNum.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getLineNum() {
                return lineNum;
            }

            /**
             * Define el valor de la propiedad lineNum.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setLineNum(Long value) {
                this.lineNum = value;
            }

            /**
             * Obtiene el valor de la propiedad itemCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getItemCode() {
                return itemCode;
            }

            /**
             * Define el valor de la propiedad itemCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setItemCode(String value) {
                this.itemCode = value;
            }

            /**
             * Obtiene el valor de la propiedad itemDescription.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getItemDescription() {
                return itemDescription;
            }

            /**
             * Define el valor de la propiedad itemDescription.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setItemDescription(String value) {
                this.itemDescription = value;
            }

            /**
             * Obtiene el valor de la propiedad quantity.
             *
             * @return
             *     possible object is
             *     {@link Double }
             *
             */
            public Double getQuantity() {
                return quantity;
            }

            /**
             * Define el valor de la propiedad quantity.
             *
             * @param value
             *     allowed object is
             *     {@link Double }
             *
             */
            public void setQuantity(Double value) {
                this.quantity = value;
            }

            /**
             * Obtiene el valor de la propiedad shipDate.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getShipDate() {
                return shipDate;
            }

            /**
             * Define el valor de la propiedad shipDate.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setShipDate(XMLGregorianCalendar value) {
                this.shipDate = value;
            }

            /**
             * Obtiene el valor de la propiedad price.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getPrice() {
                return price;
            }

            /**
             * Define el valor de la propiedad price.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setPrice(BigDecimal value) {
                this.price = value;
            }

            /**
             * Obtiene el valor de la propiedad priceAfterVAT.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getPriceAfterVAT() {
                return priceAfterVAT;
            }

            /**
             * Define el valor de la propiedad priceAfterVAT.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setPriceAfterVAT(BigDecimal value) {
                this.priceAfterVAT = value;
            }

            /**
             * Obtiene el valor de la propiedad currency.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCurrency() {
                return currency;
            }

            /**
             * Define el valor de la propiedad currency.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCurrency(String value) {
                this.currency = value;
            }

            /**
             * Obtiene el valor de la propiedad rate.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getRate() {
                return rate;
            }

            /**
             * Define el valor de la propiedad rate.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setRate(BigDecimal value) {
                this.rate = value;
            }

            /**
             * Obtiene el valor de la propiedad discountPercent.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getDiscountPercent() {
                return discountPercent;
            }

            /**
             * Define el valor de la propiedad discountPercent.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setDiscountPercent(BigDecimal value) {
                this.discountPercent = value;
            }

            /**
             * Obtiene el valor de la propiedad vendorNum.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getVendorNum() {
                return vendorNum;
            }

            /**
             * Define el valor de la propiedad vendorNum.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setVendorNum(String value) {
                this.vendorNum = value;
            }

            /**
             * Obtiene el valor de la propiedad serialNum.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSerialNum() {
                return serialNum;
            }

            /**
             * Define el valor de la propiedad serialNum.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSerialNum(String value) {
                this.serialNum = value;
            }

            /**
             * Obtiene el valor de la propiedad warehouseCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getWarehouseCode() {
                return warehouseCode;
            }

            /**
             * Define el valor de la propiedad warehouseCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setWarehouseCode(String value) {
                this.warehouseCode = value;
            }

            /**
             * Obtiene el valor de la propiedad salesPersonCode.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getSalesPersonCode() {
                return salesPersonCode;
            }

            /**
             * Define el valor de la propiedad salesPersonCode.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setSalesPersonCode(Long value) {
                this.salesPersonCode = value;
            }

            /**
             * Obtiene el valor de la propiedad commisionPercent.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getCommisionPercent() {
                return commisionPercent;
            }

            /**
             * Define el valor de la propiedad commisionPercent.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setCommisionPercent(BigDecimal value) {
                this.commisionPercent = value;
            }

            /**
             * Obtiene el valor de la propiedad treeType.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getTreeType() {
                return treeType;
            }

            /**
             * Define el valor de la propiedad treeType.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setTreeType(String value) {
                this.treeType = value;
            }

            /**
             * Obtiene el valor de la propiedad accountCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getAccountCode() {
                return accountCode;
            }

            /**
             * Define el valor de la propiedad accountCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setAccountCode(String value) {
                this.accountCode = value;
            }

            /**
             * Obtiene el valor de la propiedad useBaseUnits.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUseBaseUnits() {
                return useBaseUnits;
            }

            /**
             * Define el valor de la propiedad useBaseUnits.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUseBaseUnits(String value) {
                this.useBaseUnits = value;
            }

            /**
             * Obtiene el valor de la propiedad supplierCatNum.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSupplierCatNum() {
                return supplierCatNum;
            }

            /**
             * Define el valor de la propiedad supplierCatNum.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSupplierCatNum(String value) {
                this.supplierCatNum = value;
            }

            /**
             * Obtiene el valor de la propiedad costingCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCostingCode() {
                return costingCode;
            }

            /**
             * Define el valor de la propiedad costingCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCostingCode(String value) {
                this.costingCode = value;
            }

            /**
             * Obtiene el valor de la propiedad projectCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getProjectCode() {
                return projectCode;
            }

            /**
             * Define el valor de la propiedad projectCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setProjectCode(String value) {
                this.projectCode = value;
            }

            /**
             * Obtiene el valor de la propiedad barCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getBarCode() {
                return barCode;
            }

            /**
             * Define el valor de la propiedad barCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setBarCode(String value) {
                this.barCode = value;
            }

            /**
             * Obtiene el valor de la propiedad vatGroup.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getVatGroup() {
                return vatGroup;
            }

            /**
             * Define el valor de la propiedad vatGroup.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setVatGroup(String value) {
                this.vatGroup = value;
            }

            /**
             * Obtiene el valor de la propiedad height1.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getHeight1() {
                return height1;
            }

            /**
             * Define el valor de la propiedad height1.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setHeight1(BigDecimal value) {
                this.height1 = value;
            }

            /**
             * Obtiene el valor de la propiedad hight1Unit.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getHight1Unit() {
                return hight1Unit;
            }

            /**
             * Define el valor de la propiedad hight1Unit.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setHight1Unit(Long value) {
                this.hight1Unit = value;
            }

            /**
             * Obtiene el valor de la propiedad height2.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getHeight2() {
                return height2;
            }

            /**
             * Define el valor de la propiedad height2.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setHeight2(BigDecimal value) {
                this.height2 = value;
            }

            /**
             * Obtiene el valor de la propiedad height2Unit.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getHeight2Unit() {
                return height2Unit;
            }

            /**
             * Define el valor de la propiedad height2Unit.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setHeight2Unit(Long value) {
                this.height2Unit = value;
            }

            /**
             * Obtiene el valor de la propiedad lengh1.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getLengh1() {
                return lengh1;
            }

            /**
             * Define el valor de la propiedad lengh1.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setLengh1(BigDecimal value) {
                this.lengh1 = value;
            }

            /**
             * Obtiene el valor de la propiedad lengh1Unit.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getLengh1Unit() {
                return lengh1Unit;
            }

            /**
             * Define el valor de la propiedad lengh1Unit.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setLengh1Unit(Long value) {
                this.lengh1Unit = value;
            }

            /**
             * Obtiene el valor de la propiedad lengh2.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getLengh2() {
                return lengh2;
            }

            /**
             * Define el valor de la propiedad lengh2.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setLengh2(BigDecimal value) {
                this.lengh2 = value;
            }

            /**
             * Obtiene el valor de la propiedad lengh2Unit.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getLengh2Unit() {
                return lengh2Unit;
            }

            /**
             * Define el valor de la propiedad lengh2Unit.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setLengh2Unit(Long value) {
                this.lengh2Unit = value;
            }

            /**
             * Obtiene el valor de la propiedad weight1.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getWeight1() {
                return weight1;
            }

            /**
             * Define el valor de la propiedad weight1.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setWeight1(BigDecimal value) {
                this.weight1 = value;
            }

            /**
             * Obtiene el valor de la propiedad weight1Unit.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getWeight1Unit() {
                return weight1Unit;
            }

            /**
             * Define el valor de la propiedad weight1Unit.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setWeight1Unit(Long value) {
                this.weight1Unit = value;
            }

            /**
             * Obtiene el valor de la propiedad weight2.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getWeight2() {
                return weight2;
            }

            /**
             * Define el valor de la propiedad weight2.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setWeight2(BigDecimal value) {
                this.weight2 = value;
            }

            /**
             * Obtiene el valor de la propiedad weight2Unit.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getWeight2Unit() {
                return weight2Unit;
            }

            /**
             * Define el valor de la propiedad weight2Unit.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setWeight2Unit(Long value) {
                this.weight2Unit = value;
            }

            /**
             * Obtiene el valor de la propiedad factor1.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getFactor1() {
                return factor1;
            }

            /**
             * Define el valor de la propiedad factor1.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setFactor1(BigDecimal value) {
                this.factor1 = value;
            }

            /**
             * Obtiene el valor de la propiedad factor2.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getFactor2() {
                return factor2;
            }

            /**
             * Define el valor de la propiedad factor2.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setFactor2(BigDecimal value) {
                this.factor2 = value;
            }

            /**
             * Obtiene el valor de la propiedad factor3.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getFactor3() {
                return factor3;
            }

            /**
             * Define el valor de la propiedad factor3.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setFactor3(BigDecimal value) {
                this.factor3 = value;
            }

            /**
             * Obtiene el valor de la propiedad factor4.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getFactor4() {
                return factor4;
            }

            /**
             * Define el valor de la propiedad factor4.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setFactor4(BigDecimal value) {
                this.factor4 = value;
            }

            /**
             * Obtiene el valor de la propiedad baseType.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getBaseType() {
                return baseType;
            }

            /**
             * Define el valor de la propiedad baseType.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setBaseType(Long value) {
                this.baseType = value;
            }

            /**
             * Obtiene el valor de la propiedad baseEntry.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getBaseEntry() {
                return baseEntry;
            }

            /**
             * Define el valor de la propiedad baseEntry.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setBaseEntry(Long value) {
                this.baseEntry = value;
            }

            /**
             * Obtiene el valor de la propiedad baseLine.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getBaseLine() {
                return baseLine;
            }

            /**
             * Define el valor de la propiedad baseLine.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setBaseLine(Long value) {
                this.baseLine = value;
            }

            /**
             * Obtiene el valor de la propiedad volume.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getVolume() {
                return volume;
            }

            /**
             * Define el valor de la propiedad volume.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setVolume(BigDecimal value) {
                this.volume = value;
            }

            /**
             * Obtiene el valor de la propiedad volumeUnit.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getVolumeUnit() {
                return volumeUnit;
            }

            /**
             * Define el valor de la propiedad volumeUnit.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setVolumeUnit(Long value) {
                this.volumeUnit = value;
            }

            /**
             * Obtiene el valor de la propiedad width1.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getWidth1() {
                return width1;
            }

            /**
             * Define el valor de la propiedad width1.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setWidth1(BigDecimal value) {
                this.width1 = value;
            }

            /**
             * Obtiene el valor de la propiedad width1Unit.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getWidth1Unit() {
                return width1Unit;
            }

            /**
             * Define el valor de la propiedad width1Unit.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setWidth1Unit(Long value) {
                this.width1Unit = value;
            }

            /**
             * Obtiene el valor de la propiedad width2.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getWidth2() {
                return width2;
            }

            /**
             * Define el valor de la propiedad width2.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setWidth2(BigDecimal value) {
                this.width2 = value;
            }

            /**
             * Obtiene el valor de la propiedad width2Unit.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getWidth2Unit() {
                return width2Unit;
            }

            /**
             * Define el valor de la propiedad width2Unit.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setWidth2Unit(Long value) {
                this.width2Unit = value;
            }

            /**
             * Obtiene el valor de la propiedad address.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getAddress() {
                return address;
            }

            /**
             * Define el valor de la propiedad address.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setAddress(String value) {
                this.address = value;
            }

            /**
             * Obtiene el valor de la propiedad taxCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getTaxCode() {
                return taxCode;
            }

            /**
             * Define el valor de la propiedad taxCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setTaxCode(String value) {
                this.taxCode = value;
            }

            /**
             * Obtiene el valor de la propiedad taxType.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getTaxType() {
                return taxType;
            }

            /**
             * Define el valor de la propiedad taxType.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setTaxType(String value) {
                this.taxType = value;
            }

            /**
             * Obtiene el valor de la propiedad taxLiable.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getTaxLiable() {
                return taxLiable;
            }

            /**
             * Define el valor de la propiedad taxLiable.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setTaxLiable(String value) {
                this.taxLiable = value;
            }

            /**
             * Obtiene el valor de la propiedad pickStatus.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPickStatus() {
                return pickStatus;
            }

            /**
             * Define el valor de la propiedad pickStatus.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPickStatus(String value) {
                this.pickStatus = value;
            }

            /**
             * Obtiene el valor de la propiedad pickQuantity.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getPickQuantity() {
                return pickQuantity;
            }

            /**
             * Define el valor de la propiedad pickQuantity.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setPickQuantity(BigDecimal value) {
                this.pickQuantity = value;
            }

            /**
             * Obtiene el valor de la propiedad pickListIdNumber.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getPickListIdNumber() {
                return pickListIdNumber;
            }

            /**
             * Define el valor de la propiedad pickListIdNumber.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setPickListIdNumber(Long value) {
                this.pickListIdNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad originalItem.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getOriginalItem() {
                return originalItem;
            }

            /**
             * Define el valor de la propiedad originalItem.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setOriginalItem(String value) {
                this.originalItem = value;
            }

            /**
             * Obtiene el valor de la propiedad backOrder.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getBackOrder() {
                return backOrder;
            }

            /**
             * Define el valor de la propiedad backOrder.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setBackOrder(String value) {
                this.backOrder = value;
            }

            /**
             * Obtiene el valor de la propiedad freeText.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFreeText() {
                return freeText;
            }

            /**
             * Define el valor de la propiedad freeText.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFreeText(String value) {
                this.freeText = value;
            }

            /**
             * Obtiene el valor de la propiedad shippingMethod.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getShippingMethod() {
                return shippingMethod;
            }

            /**
             * Define el valor de la propiedad shippingMethod.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setShippingMethod(Long value) {
                this.shippingMethod = value;
            }

            /**
             * Obtiene el valor de la propiedad poTargetNum.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getPOTargetNum() {
                return poTargetNum;
            }

            /**
             * Define el valor de la propiedad poTargetNum.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setPOTargetNum(Long value) {
                this.poTargetNum = value;
            }

            /**
             * Obtiene el valor de la propiedad poTargetEntry.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPOTargetEntry() {
                return poTargetEntry;
            }

            /**
             * Define el valor de la propiedad poTargetEntry.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPOTargetEntry(String value) {
                this.poTargetEntry = value;
            }

            /**
             * Obtiene el valor de la propiedad poTargetRowNum.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getPOTargetRowNum() {
                return poTargetRowNum;
            }

            /**
             * Define el valor de la propiedad poTargetRowNum.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setPOTargetRowNum(Long value) {
                this.poTargetRowNum = value;
            }

            /**
             * Obtiene el valor de la propiedad correctionInvoiceItem.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCorrectionInvoiceItem() {
                return correctionInvoiceItem;
            }

            /**
             * Define el valor de la propiedad correctionInvoiceItem.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCorrectionInvoiceItem(String value) {
                this.correctionInvoiceItem = value;
            }

            /**
             * Obtiene el valor de la propiedad corrInvAmountToStock.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getCorrInvAmountToStock() {
                return corrInvAmountToStock;
            }

            /**
             * Define el valor de la propiedad corrInvAmountToStock.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setCorrInvAmountToStock(BigDecimal value) {
                this.corrInvAmountToStock = value;
            }

            /**
             * Obtiene el valor de la propiedad corrInvAmountToDiffAcct.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getCorrInvAmountToDiffAcct() {
                return corrInvAmountToDiffAcct;
            }

            /**
             * Define el valor de la propiedad corrInvAmountToDiffAcct.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setCorrInvAmountToDiffAcct(BigDecimal value) {
                this.corrInvAmountToDiffAcct = value;
            }

            /**
             * Obtiene el valor de la propiedad appliedTax.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getAppliedTax() {
                return appliedTax;
            }

            /**
             * Define el valor de la propiedad appliedTax.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setAppliedTax(BigDecimal value) {
                this.appliedTax = value;
            }

            /**
             * Obtiene el valor de la propiedad appliedTaxFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getAppliedTaxFC() {
                return appliedTaxFC;
            }

            /**
             * Define el valor de la propiedad appliedTaxFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setAppliedTaxFC(BigDecimal value) {
                this.appliedTaxFC = value;
            }

            /**
             * Obtiene el valor de la propiedad appliedTaxSC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getAppliedTaxSC() {
                return appliedTaxSC;
            }

            /**
             * Define el valor de la propiedad appliedTaxSC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setAppliedTaxSC(BigDecimal value) {
                this.appliedTaxSC = value;
            }

            /**
             * Obtiene el valor de la propiedad wtLiable.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getWTLiable() {
                return wtLiable;
            }

            /**
             * Define el valor de la propiedad wtLiable.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setWTLiable(String value) {
                this.wtLiable = value;
            }

            /**
             * Obtiene el valor de la propiedad deferredTax.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDeferredTax() {
                return deferredTax;
            }

            /**
             * Define el valor de la propiedad deferredTax.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDeferredTax(String value) {
                this.deferredTax = value;
            }

            /**
             * Obtiene el valor de la propiedad equalizationTaxPercent.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getEqualizationTaxPercent() {
                return equalizationTaxPercent;
            }

            /**
             * Define el valor de la propiedad equalizationTaxPercent.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setEqualizationTaxPercent(BigDecimal value) {
                this.equalizationTaxPercent = value;
            }

            /**
             * Obtiene el valor de la propiedad totalEqualizationTax.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTotalEqualizationTax() {
                return totalEqualizationTax;
            }

            /**
             * Define el valor de la propiedad totalEqualizationTax.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTotalEqualizationTax(BigDecimal value) {
                this.totalEqualizationTax = value;
            }

            /**
             * Obtiene el valor de la propiedad totalEqualizationTaxFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTotalEqualizationTaxFC() {
                return totalEqualizationTaxFC;
            }

            /**
             * Define el valor de la propiedad totalEqualizationTaxFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTotalEqualizationTaxFC(BigDecimal value) {
                this.totalEqualizationTaxFC = value;
            }

            /**
             * Obtiene el valor de la propiedad totalEqualizationTaxSC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTotalEqualizationTaxSC() {
                return totalEqualizationTaxSC;
            }

            /**
             * Define el valor de la propiedad totalEqualizationTaxSC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTotalEqualizationTaxSC(BigDecimal value) {
                this.totalEqualizationTaxSC = value;
            }

            /**
             * Obtiene el valor de la propiedad netTaxAmount.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getNetTaxAmount() {
                return netTaxAmount;
            }

            /**
             * Define el valor de la propiedad netTaxAmount.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setNetTaxAmount(BigDecimal value) {
                this.netTaxAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad netTaxAmountFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getNetTaxAmountFC() {
                return netTaxAmountFC;
            }

            /**
             * Define el valor de la propiedad netTaxAmountFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setNetTaxAmountFC(BigDecimal value) {
                this.netTaxAmountFC = value;
            }

            /**
             * Obtiene el valor de la propiedad netTaxAmountSC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getNetTaxAmountSC() {
                return netTaxAmountSC;
            }

            /**
             * Define el valor de la propiedad netTaxAmountSC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setNetTaxAmountSC(BigDecimal value) {
                this.netTaxAmountSC = value;
            }

            /**
             * Obtiene el valor de la propiedad measureUnit.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getMeasureUnit() {
                return measureUnit;
            }

            /**
             * Define el valor de la propiedad measureUnit.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setMeasureUnit(String value) {
                this.measureUnit = value;
            }

            /**
             * Obtiene el valor de la propiedad unitsOfMeasurment.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getUnitsOfMeasurment() {
                return unitsOfMeasurment;
            }

            /**
             * Define el valor de la propiedad unitsOfMeasurment.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setUnitsOfMeasurment(BigDecimal value) {
                this.unitsOfMeasurment = value;
            }

            /**
             * Obtiene el valor de la propiedad lineTotal.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getLineTotal() {
                return lineTotal;
            }

            /**
             * Define el valor de la propiedad lineTotal.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setLineTotal(BigDecimal value) {
                this.lineTotal = value;
            }

            /**
             * Obtiene el valor de la propiedad taxPercentagePerRow.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTaxPercentagePerRow() {
                return taxPercentagePerRow;
            }

            /**
             * Define el valor de la propiedad taxPercentagePerRow.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTaxPercentagePerRow(BigDecimal value) {
                this.taxPercentagePerRow = value;
            }

            /**
             * Obtiene el valor de la propiedad taxTotal.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTaxTotal() {
                return taxTotal;
            }

            /**
             * Define el valor de la propiedad taxTotal.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTaxTotal(BigDecimal value) {
                this.taxTotal = value;
            }

            /**
             * Obtiene el valor de la propiedad consumerSalesForecast.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getConsumerSalesForecast() {
                return consumerSalesForecast;
            }

            /**
             * Define el valor de la propiedad consumerSalesForecast.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setConsumerSalesForecast(String value) {
                this.consumerSalesForecast = value;
            }

            /**
             * Obtiene el valor de la propiedad exciseAmount.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getExciseAmount() {
                return exciseAmount;
            }

            /**
             * Define el valor de la propiedad exciseAmount.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setExciseAmount(BigDecimal value) {
                this.exciseAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad taxPerUnit.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTaxPerUnit() {
                return taxPerUnit;
            }

            /**
             * Define el valor de la propiedad taxPerUnit.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTaxPerUnit(BigDecimal value) {
                this.taxPerUnit = value;
            }

            /**
             * Obtiene el valor de la propiedad totalInclTax.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTotalInclTax() {
                return totalInclTax;
            }

            /**
             * Define el valor de la propiedad totalInclTax.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTotalInclTax(BigDecimal value) {
                this.totalInclTax = value;
            }

            /**
             * Obtiene el valor de la propiedad countryOrg.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCountryOrg() {
                return countryOrg;
            }

            /**
             * Define el valor de la propiedad countryOrg.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCountryOrg(String value) {
                this.countryOrg = value;
            }

            /**
             * Obtiene el valor de la propiedad sww.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSWW() {
                return sww;
            }

            /**
             * Define el valor de la propiedad sww.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSWW(String value) {
                this.sww = value;
            }

            /**
             * Obtiene el valor de la propiedad transactionType.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getTransactionType() {
                return transactionType;
            }

            /**
             * Define el valor de la propiedad transactionType.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setTransactionType(String value) {
                this.transactionType = value;
            }

            /**
             * Obtiene el valor de la propiedad distributeExpense.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDistributeExpense() {
                return distributeExpense;
            }

            /**
             * Define el valor de la propiedad distributeExpense.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDistributeExpense(String value) {
                this.distributeExpense = value;
            }

            /**
             * Obtiene el valor de la propiedad rowTotalFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getRowTotalFC() {
                return rowTotalFC;
            }

            /**
             * Define el valor de la propiedad rowTotalFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setRowTotalFC(BigDecimal value) {
                this.rowTotalFC = value;
            }

            /**
             * Obtiene el valor de la propiedad rowTotalSC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getRowTotalSC() {
                return rowTotalSC;
            }

            /**
             * Define el valor de la propiedad rowTotalSC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setRowTotalSC(BigDecimal value) {
                this.rowTotalSC = value;
            }

            /**
             * Obtiene el valor de la propiedad lastBuyInmPrice.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getLastBuyInmPrice() {
                return lastBuyInmPrice;
            }

            /**
             * Define el valor de la propiedad lastBuyInmPrice.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setLastBuyInmPrice(BigDecimal value) {
                this.lastBuyInmPrice = value;
            }

            /**
             * Obtiene el valor de la propiedad lastBuyDistributeSumFc.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getLastBuyDistributeSumFc() {
                return lastBuyDistributeSumFc;
            }

            /**
             * Define el valor de la propiedad lastBuyDistributeSumFc.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setLastBuyDistributeSumFc(BigDecimal value) {
                this.lastBuyDistributeSumFc = value;
            }

            /**
             * Obtiene el valor de la propiedad lastBuyDistributeSumSc.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getLastBuyDistributeSumSc() {
                return lastBuyDistributeSumSc;
            }

            /**
             * Define el valor de la propiedad lastBuyDistributeSumSc.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setLastBuyDistributeSumSc(BigDecimal value) {
                this.lastBuyDistributeSumSc = value;
            }

            /**
             * Obtiene el valor de la propiedad lastBuyDistributeSum.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getLastBuyDistributeSum() {
                return lastBuyDistributeSum;
            }

            /**
             * Define el valor de la propiedad lastBuyDistributeSum.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setLastBuyDistributeSum(BigDecimal value) {
                this.lastBuyDistributeSum = value;
            }

            /**
             * Obtiene el valor de la propiedad stockDistributesumForeign.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getStockDistributesumForeign() {
                return stockDistributesumForeign;
            }

            /**
             * Define el valor de la propiedad stockDistributesumForeign.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setStockDistributesumForeign(BigDecimal value) {
                this.stockDistributesumForeign = value;
            }

            /**
             * Obtiene el valor de la propiedad stockDistributesumSystem.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getStockDistributesumSystem() {
                return stockDistributesumSystem;
            }

            /**
             * Define el valor de la propiedad stockDistributesumSystem.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setStockDistributesumSystem(BigDecimal value) {
                this.stockDistributesumSystem = value;
            }

            /**
             * Obtiene el valor de la propiedad stockDistributesum.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getStockDistributesum() {
                return stockDistributesum;
            }

            /**
             * Define el valor de la propiedad stockDistributesum.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setStockDistributesum(BigDecimal value) {
                this.stockDistributesum = value;
            }

            /**
             * Obtiene el valor de la propiedad stockInmPrice.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getStockInmPrice() {
                return stockInmPrice;
            }

            /**
             * Define el valor de la propiedad stockInmPrice.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setStockInmPrice(BigDecimal value) {
                this.stockInmPrice = value;
            }

            /**
             * Obtiene el valor de la propiedad pickStatusEx.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPickStatusEx() {
                return pickStatusEx;
            }

            /**
             * Define el valor de la propiedad pickStatusEx.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPickStatusEx(String value) {
                this.pickStatusEx = value;
            }

            /**
             * Obtiene el valor de la propiedad taxBeforeDPM.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTaxBeforeDPM() {
                return taxBeforeDPM;
            }

            /**
             * Define el valor de la propiedad taxBeforeDPM.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTaxBeforeDPM(BigDecimal value) {
                this.taxBeforeDPM = value;
            }

            /**
             * Obtiene el valor de la propiedad taxBeforeDPMFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTaxBeforeDPMFC() {
                return taxBeforeDPMFC;
            }

            /**
             * Define el valor de la propiedad taxBeforeDPMFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTaxBeforeDPMFC(BigDecimal value) {
                this.taxBeforeDPMFC = value;
            }

            /**
             * Obtiene el valor de la propiedad taxBeforeDPMSC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTaxBeforeDPMSC() {
                return taxBeforeDPMSC;
            }

            /**
             * Define el valor de la propiedad taxBeforeDPMSC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTaxBeforeDPMSC(BigDecimal value) {
                this.taxBeforeDPMSC = value;
            }

            /**
             * Obtiene el valor de la propiedad cfopCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCFOPCode() {
                return cfopCode;
            }

            /**
             * Define el valor de la propiedad cfopCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCFOPCode(String value) {
                this.cfopCode = value;
            }

            /**
             * Obtiene el valor de la propiedad cstCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCSTCode() {
                return cstCode;
            }

            /**
             * Define el valor de la propiedad cstCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCSTCode(String value) {
                this.cstCode = value;
            }

            /**
             * Obtiene el valor de la propiedad usage.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getUsage() {
                return usage;
            }

            /**
             * Define el valor de la propiedad usage.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setUsage(Long value) {
                this.usage = value;
            }

            /**
             * Obtiene el valor de la propiedad taxOnly.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getTaxOnly() {
                return taxOnly;
            }

            /**
             * Define el valor de la propiedad taxOnly.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setTaxOnly(String value) {
                this.taxOnly = value;
            }

            /**
             * Obtiene el valor de la propiedad visualOrder.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getVisualOrder() {
                return visualOrder;
            }

            /**
             * Define el valor de la propiedad visualOrder.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setVisualOrder(Long value) {
                this.visualOrder = value;
            }

            /**
             * Obtiene el valor de la propiedad baseOpenQuantity.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getBaseOpenQuantity() {
                return baseOpenQuantity;
            }

            /**
             * Define el valor de la propiedad baseOpenQuantity.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setBaseOpenQuantity(BigDecimal value) {
                this.baseOpenQuantity = value;
            }

            /**
             * Obtiene el valor de la propiedad unitPrice.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getUnitPrice() {
                return unitPrice;
            }

            /**
             * Define el valor de la propiedad unitPrice.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setUnitPrice(BigDecimal value) {
                this.unitPrice = value;
            }

            /**
             * Obtiene el valor de la propiedad lineStatus.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getLineStatus() {
                return lineStatus;
            }

            /**
             * Define el valor de la propiedad lineStatus.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setLineStatus(String value) {
                this.lineStatus = value;
            }

            /**
             * Obtiene el valor de la propiedad packageQuantity.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getPackageQuantity() {
                return packageQuantity;
            }

            /**
             * Define el valor de la propiedad packageQuantity.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setPackageQuantity(BigDecimal value) {
                this.packageQuantity = value;
            }

            /**
             * Obtiene el valor de la propiedad text.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getText() {
                return text;
            }

            /**
             * Define el valor de la propiedad text.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setText(String value) {
                this.text = value;
            }

            /**
             * Obtiene el valor de la propiedad lineType.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getLineType() {
                return lineType;
            }

            /**
             * Define el valor de la propiedad lineType.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setLineType(String value) {
                this.lineType = value;
            }

            /**
             * Obtiene el valor de la propiedad cogsCostingCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCOGSCostingCode() {
                return cogsCostingCode;
            }

            /**
             * Define el valor de la propiedad cogsCostingCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCOGSCostingCode(String value) {
                this.cogsCostingCode = value;
            }

            /**
             * Obtiene el valor de la propiedad cogsAccountCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCOGSAccountCode() {
                return cogsAccountCode;
            }

            /**
             * Define el valor de la propiedad cogsAccountCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCOGSAccountCode(String value) {
                this.cogsAccountCode = value;
            }

            /**
             * Obtiene el valor de la propiedad changeAssemlyBoMWarehouse.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getChangeAssemlyBoMWarehouse() {
                return changeAssemlyBoMWarehouse;
            }

            /**
             * Define el valor de la propiedad changeAssemlyBoMWarehouse.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setChangeAssemlyBoMWarehouse(String value) {
                this.changeAssemlyBoMWarehouse = value;
            }

            /**
             * Obtiene el valor de la propiedad grossBuyPrice.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getGrossBuyPrice() {
                return grossBuyPrice;
            }

            /**
             * Define el valor de la propiedad grossBuyPrice.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setGrossBuyPrice(BigDecimal value) {
                this.grossBuyPrice = value;
            }

            /**
             * Obtiene el valor de la propiedad grossBase.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getGrossBase() {
                return grossBase;
            }

            /**
             * Define el valor de la propiedad grossBase.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setGrossBase(Long value) {
                this.grossBase = value;
            }

            /**
             * Obtiene el valor de la propiedad grossProfitTotalBasePrice.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getGrossProfitTotalBasePrice() {
                return grossProfitTotalBasePrice;
            }

            /**
             * Define el valor de la propiedad grossProfitTotalBasePrice.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setGrossProfitTotalBasePrice(BigDecimal value) {
                this.grossProfitTotalBasePrice = value;
            }

            /**
             * Obtiene el valor de la propiedad costingCode2.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCostingCode2() {
                return costingCode2;
            }

            /**
             * Define el valor de la propiedad costingCode2.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCostingCode2(String value) {
                this.costingCode2 = value;
            }

            /**
             * Obtiene el valor de la propiedad costingCode3.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCostingCode3() {
                return costingCode3;
            }

            /**
             * Define el valor de la propiedad costingCode3.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCostingCode3(String value) {
                this.costingCode3 = value;
            }

            /**
             * Obtiene el valor de la propiedad costingCode4.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCostingCode4() {
                return costingCode4;
            }

            /**
             * Define el valor de la propiedad costingCode4.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCostingCode4(String value) {
                this.costingCode4 = value;
            }

            /**
             * Obtiene el valor de la propiedad costingCode5.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCostingCode5() {
                return costingCode5;
            }

            /**
             * Define el valor de la propiedad costingCode5.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCostingCode5(String value) {
                this.costingCode5 = value;
            }

            /**
             * Obtiene el valor de la propiedad itemDetails.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getItemDetails() {
                return itemDetails;
            }

            /**
             * Define el valor de la propiedad itemDetails.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setItemDetails(String value) {
                this.itemDetails = value;
            }

            /**
             * Obtiene el valor de la propiedad locationCode.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getLocationCode() {
                return locationCode;
            }

            /**
             * Define el valor de la propiedad locationCode.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setLocationCode(Long value) {
                this.locationCode = value;
            }

            /**
             * Obtiene el valor de la propiedad actualDeliveryDate.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getActualDeliveryDate() {
                return actualDeliveryDate;
            }

            /**
             * Define el valor de la propiedad actualDeliveryDate.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setActualDeliveryDate(XMLGregorianCalendar value) {
                this.actualDeliveryDate = value;
            }

            /**
             * Obtiene el valor de la propiedad remainingOpenQuantity.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getRemainingOpenQuantity() {
                return remainingOpenQuantity;
            }

            /**
             * Define el valor de la propiedad remainingOpenQuantity.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setRemainingOpenQuantity(BigDecimal value) {
                this.remainingOpenQuantity = value;
            }

            /**
             * Obtiene el valor de la propiedad openAmount.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getOpenAmount() {
                return openAmount;
            }

            /**
             * Define el valor de la propiedad openAmount.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setOpenAmount(BigDecimal value) {
                this.openAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad openAmountFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getOpenAmountFC() {
                return openAmountFC;
            }

            /**
             * Define el valor de la propiedad openAmountFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setOpenAmountFC(BigDecimal value) {
                this.openAmountFC = value;
            }

            /**
             * Obtiene el valor de la propiedad openAmountSC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getOpenAmountSC() {
                return openAmountSC;
            }

            /**
             * Define el valor de la propiedad openAmountSC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setOpenAmountSC(BigDecimal value) {
                this.openAmountSC = value;
            }

            /**
             * Obtiene el valor de la propiedad exLineNo.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getExLineNo() {
                return exLineNo;
            }

            /**
             * Define el valor de la propiedad exLineNo.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setExLineNo(String value) {
                this.exLineNo = value;
            }

            /**
             * Obtiene el valor de la propiedad requiredDate.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getRequiredDate() {
                return requiredDate;
            }

            /**
             * Define el valor de la propiedad requiredDate.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setRequiredDate(XMLGregorianCalendar value) {
                this.requiredDate = value;
            }

            /**
             * Obtiene el valor de la propiedad requiredQuantity.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getRequiredQuantity() {
                return requiredQuantity;
            }

            /**
             * Define el valor de la propiedad requiredQuantity.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setRequiredQuantity(BigDecimal value) {
                this.requiredQuantity = value;
            }

            /**
             * Obtiene el valor de la propiedad cogsCostingCode2.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCOGSCostingCode2() {
                return cogsCostingCode2;
            }

            /**
             * Define el valor de la propiedad cogsCostingCode2.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCOGSCostingCode2(String value) {
                this.cogsCostingCode2 = value;
            }

            /**
             * Obtiene el valor de la propiedad cogsCostingCode3.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCOGSCostingCode3() {
                return cogsCostingCode3;
            }

            /**
             * Define el valor de la propiedad cogsCostingCode3.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCOGSCostingCode3(String value) {
                this.cogsCostingCode3 = value;
            }

            /**
             * Obtiene el valor de la propiedad cogsCostingCode4.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCOGSCostingCode4() {
                return cogsCostingCode4;
            }

            /**
             * Define el valor de la propiedad cogsCostingCode4.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCOGSCostingCode4(String value) {
                this.cogsCostingCode4 = value;
            }

            /**
             * Obtiene el valor de la propiedad cogsCostingCode5.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCOGSCostingCode5() {
                return cogsCostingCode5;
            }

            /**
             * Define el valor de la propiedad cogsCostingCode5.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCOGSCostingCode5(String value) {
                this.cogsCostingCode5 = value;
            }

            /**
             * Obtiene el valor de la propiedad csTforIPI.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCSTforIPI() {
                return csTforIPI;
            }

            /**
             * Define el valor de la propiedad csTforIPI.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCSTforIPI(String value) {
                this.csTforIPI = value;
            }

            /**
             * Obtiene el valor de la propiedad csTforPIS.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCSTforPIS() {
                return csTforPIS;
            }

            /**
             * Define el valor de la propiedad csTforPIS.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCSTforPIS(String value) {
                this.csTforPIS = value;
            }

            /**
             * Obtiene el valor de la propiedad csTforCOFINS.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCSTforCOFINS() {
                return csTforCOFINS;
            }

            /**
             * Define el valor de la propiedad csTforCOFINS.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCSTforCOFINS(String value) {
                this.csTforCOFINS = value;
            }

            /**
             * Obtiene el valor de la propiedad creditOriginCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCreditOriginCode() {
                return creditOriginCode;
            }

            /**
             * Define el valor de la propiedad creditOriginCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCreditOriginCode(String value) {
                this.creditOriginCode = value;
            }

            /**
             * Obtiene el valor de la propiedad withoutInventoryMovement.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getWithoutInventoryMovement() {
                return withoutInventoryMovement;
            }

            /**
             * Define el valor de la propiedad withoutInventoryMovement.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setWithoutInventoryMovement(String value) {
                this.withoutInventoryMovement = value;
            }

            /**
             * Obtiene el valor de la propiedad agreementNo.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getAgreementNo() {
                return agreementNo;
            }

            /**
             * Define el valor de la propiedad agreementNo.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setAgreementNo(Long value) {
                this.agreementNo = value;
            }

            /**
             * Obtiene el valor de la propiedad agreementRowNumber.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getAgreementRowNumber() {
                return agreementRowNumber;
            }

            /**
             * Define el valor de la propiedad agreementRowNumber.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setAgreementRowNumber(Long value) {
                this.agreementRowNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad actualBaseEntry.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getActualBaseEntry() {
                return actualBaseEntry;
            }

            /**
             * Define el valor de la propiedad actualBaseEntry.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setActualBaseEntry(Long value) {
                this.actualBaseEntry = value;
            }

            /**
             * Obtiene el valor de la propiedad actualBaseLine.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getActualBaseLine() {
                return actualBaseLine;
            }

            /**
             * Define el valor de la propiedad actualBaseLine.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setActualBaseLine(Long value) {
                this.actualBaseLine = value;
            }

            /**
             * Obtiene el valor de la propiedad docEntry.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getDocEntry() {
                return docEntry;
            }

            /**
             * Define el valor de la propiedad docEntry.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setDocEntry(Long value) {
                this.docEntry = value;
            }

            /**
             * Obtiene el valor de la propiedad surpluses.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getSurpluses() {
                return surpluses;
            }

            /**
             * Define el valor de la propiedad surpluses.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setSurpluses(BigDecimal value) {
                this.surpluses = value;
            }

            /**
             * Obtiene el valor de la propiedad defectAndBreakup.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getDefectAndBreakup() {
                return defectAndBreakup;
            }

            /**
             * Define el valor de la propiedad defectAndBreakup.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setDefectAndBreakup(BigDecimal value) {
                this.defectAndBreakup = value;
            }

            /**
             * Obtiene el valor de la propiedad shortages.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getShortages() {
                return shortages;
            }

            /**
             * Define el valor de la propiedad shortages.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setShortages(BigDecimal value) {
                this.shortages = value;
            }

            /**
             * Obtiene el valor de la propiedad considerQuantity.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getConsiderQuantity() {
                return considerQuantity;
            }

            /**
             * Define el valor de la propiedad considerQuantity.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setConsiderQuantity(String value) {
                this.considerQuantity = value;
            }

            /**
             * Obtiene el valor de la propiedad partialRetirement.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPartialRetirement() {
                return partialRetirement;
            }

            /**
             * Define el valor de la propiedad partialRetirement.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPartialRetirement(String value) {
                this.partialRetirement = value;
            }

            /**
             * Obtiene el valor de la propiedad retirementQuantity.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getRetirementQuantity() {
                return retirementQuantity;
            }

            /**
             * Define el valor de la propiedad retirementQuantity.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setRetirementQuantity(BigDecimal value) {
                this.retirementQuantity = value;
            }

            /**
             * Obtiene el valor de la propiedad retirementAPC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getRetirementAPC() {
                return retirementAPC;
            }

            /**
             * Define el valor de la propiedad retirementAPC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setRetirementAPC(BigDecimal value) {
                this.retirementAPC = value;
            }

            /**
             * Obtiene el valor de la propiedad thirdParty.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getThirdParty() {
                return thirdParty;
            }

            /**
             * Define el valor de la propiedad thirdParty.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setThirdParty(String value) {
                this.thirdParty = value;
            }

            /**
             * Obtiene el valor de la propiedad expenseType.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getExpenseType() {
                return expenseType;
            }

            /**
             * Define el valor de la propiedad expenseType.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setExpenseType(String value) {
                this.expenseType = value;
            }

            /**
             * Obtiene el valor de la propiedad receiptNumber.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getReceiptNumber() {
                return receiptNumber;
            }

            /**
             * Define el valor de la propiedad receiptNumber.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setReceiptNumber(String value) {
                this.receiptNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad expenseOperationType.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getExpenseOperationType() {
                return expenseOperationType;
            }

            /**
             * Define el valor de la propiedad expenseOperationType.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setExpenseOperationType(String value) {
                this.expenseOperationType = value;
            }

            /**
             * Obtiene el valor de la propiedad federalTaxID.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFederalTaxID() {
                return federalTaxID;
            }

            /**
             * Define el valor de la propiedad federalTaxID.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFederalTaxID(String value) {
                this.federalTaxID = value;
            }

            /**
             * Obtiene el valor de la propiedad stgSeqNum.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getStgSeqNum() {
                return stgSeqNum;
            }

            /**
             * Define el valor de la propiedad stgSeqNum.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setStgSeqNum(Long value) {
                this.stgSeqNum = value;
            }

            /**
             * Obtiene el valor de la propiedad stgEntry.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getStgEntry() {
                return stgEntry;
            }

            /**
             * Define el valor de la propiedad stgEntry.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setStgEntry(Long value) {
                this.stgEntry = value;
            }

            /**
             * Obtiene el valor de la propiedad stgDesc.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getStgDesc() {
                return stgDesc;
            }

            /**
             * Define el valor de la propiedad stgDesc.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setStgDesc(String value) {
                this.stgDesc = value;
            }

            /**
             * Obtiene el valor de la propiedad uoMEntry.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getUoMEntry() {
                return uoMEntry;
            }

            /**
             * Define el valor de la propiedad uoMEntry.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setUoMEntry(Long value) {
                this.uoMEntry = value;
            }

            /**
             * Obtiene el valor de la propiedad uoMCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUoMCode() {
                return uoMCode;
            }

            /**
             * Define el valor de la propiedad uoMCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUoMCode(String value) {
                this.uoMCode = value;
            }

            /**
             * Obtiene el valor de la propiedad inventoryQuantity.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getInventoryQuantity() {
                return inventoryQuantity;
            }

            /**
             * Define el valor de la propiedad inventoryQuantity.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setInventoryQuantity(BigDecimal value) {
                this.inventoryQuantity = value;
            }

            /**
             * Obtiene el valor de la propiedad remainingOpenInventoryQuantity.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getRemainingOpenInventoryQuantity() {
                return remainingOpenInventoryQuantity;
            }

            /**
             * Define el valor de la propiedad remainingOpenInventoryQuantity.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setRemainingOpenInventoryQuantity(BigDecimal value) {
                this.remainingOpenInventoryQuantity = value;
            }

            /**
             * Obtiene el valor de la propiedad parentLineNum.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getParentLineNum() {
                return parentLineNum;
            }

            /**
             * Define el valor de la propiedad parentLineNum.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setParentLineNum(Long value) {
                this.parentLineNum = value;
            }

            /**
             * Obtiene el valor de la propiedad incoterms.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getIncoterms() {
                return incoterms;
            }

            /**
             * Define el valor de la propiedad incoterms.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setIncoterms(Long value) {
                this.incoterms = value;
            }

            /**
             * Obtiene el valor de la propiedad transportMode.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getTransportMode() {
                return transportMode;
            }

            /**
             * Define el valor de la propiedad transportMode.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setTransportMode(Long value) {
                this.transportMode = value;
            }

            /**
             * Obtiene el valor de la propiedad itemType.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getItemType() {
                return itemType;
            }

            /**
             * Define el valor de la propiedad itemType.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setItemType(String value) {
                this.itemType = value;
            }

            /**
             * Obtiene el valor de la propiedad changeInventoryQuantityIndependently.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getChangeInventoryQuantityIndependently() {
                return changeInventoryQuantityIndependently;
            }

            /**
             * Define el valor de la propiedad changeInventoryQuantityIndependently.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setChangeInventoryQuantityIndependently(String value) {
                this.changeInventoryQuantityIndependently = value;
            }

            /**
             * Obtiene el valor de la propiedad freeOfChargeBP.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFreeOfChargeBP() {
                return freeOfChargeBP;
            }

            /**
             * Define el valor de la propiedad freeOfChargeBP.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFreeOfChargeBP(String value) {
                this.freeOfChargeBP = value;
            }

            /**
             * Obtiene el valor de la propiedad sacEntry.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getSACEntry() {
                return sacEntry;
            }

            /**
             * Define el valor de la propiedad sacEntry.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setSACEntry(Long value) {
                this.sacEntry = value;
            }

            /**
             * Obtiene el valor de la propiedad hsnEntry.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getHSNEntry() {
                return hsnEntry;
            }

            /**
             * Define el valor de la propiedad hsnEntry.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setHSNEntry(Long value) {
                this.hsnEntry = value;
            }

            /**
             * Obtiene el valor de la propiedad grossPrice.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getGrossPrice() {
                return grossPrice;
            }

            /**
             * Define el valor de la propiedad grossPrice.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setGrossPrice(BigDecimal value) {
                this.grossPrice = value;
            }

            /**
             * Obtiene el valor de la propiedad grossTotal.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getGrossTotal() {
                return grossTotal;
            }

            /**
             * Define el valor de la propiedad grossTotal.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setGrossTotal(BigDecimal value) {
                this.grossTotal = value;
            }

            /**
             * Obtiene el valor de la propiedad grossTotalFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getGrossTotalFC() {
                return grossTotalFC;
            }

            /**
             * Define el valor de la propiedad grossTotalFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setGrossTotalFC(BigDecimal value) {
                this.grossTotalFC = value;
            }

            /**
             * Obtiene el valor de la propiedad grossTotalSC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getGrossTotalSC() {
                return grossTotalSC;
            }

            /**
             * Define el valor de la propiedad grossTotalSC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setGrossTotalSC(BigDecimal value) {
                this.grossTotalSC = value;
            }

            /**
             * Obtiene el valor de la propiedad ncmCode.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getNCMCode() {
                return ncmCode;
            }

            /**
             * Define el valor de la propiedad ncmCode.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setNCMCode(Long value) {
                this.ncmCode = value;
            }

            /**
             * Obtiene el valor de la propiedad shipToCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getShipToCode() {
                return shipToCode;
            }

            /**
             * Define el valor de la propiedad shipToCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setShipToCode(String value) {
                this.shipToCode = value;
            }

            /**
             * Obtiene el valor de la propiedad shipToDescription.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getShipToDescription() {
                return shipToDescription;
            }

            /**
             * Define el valor de la propiedad shipToDescription.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setShipToDescription(String value) {
                this.shipToDescription = value;
            }

            /**
             * Obtiene el valor de la propiedad upreclis.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getUPRECLIS() {
                return upreclis;
            }

            /**
             * Define el valor de la propiedad upreclis.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setUPRECLIS(BigDecimal value) {
                this.upreclis = value;
            }

            /**
             * Obtiene el valor de la propiedad udifprec.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getUDIFPREC() {
                return udifprec;
            }

            /**
             * Define el valor de la propiedad udifprec.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setUDIFPREC(BigDecimal value) {
                this.udifprec = value;
            }

            /**
             * Obtiene el valor de la propiedad ucostoimp.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUCOSTOIMP() {
                return ucostoimp;
            }

            /**
             * Define el valor de la propiedad ucostoimp.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUCOSTOIMP(String value) {
                this.ucostoimp = value;
            }

            /**
             * Obtiene el valor de la propiedad ubanco.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUBANCO() {
                return ubanco;
            }

            /**
             * Define el valor de la propiedad ubanco.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUBANCO(String value) {
                this.ubanco = value;
            }

            /**
             * Obtiene el valor de la propiedad uubicacion.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUUBICACION() {
                return uubicacion;
            }

            /**
             * Define el valor de la propiedad uubicacion.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUUBICACION(String value) {
                this.uubicacion = value;
            }

            /**
             * Obtiene el valor de la propiedad ucheque.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getUCHEQUE() {
                return ucheque;
            }

            /**
             * Define el valor de la propiedad ucheque.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setUCHEQUE(Long value) {
                this.ucheque = value;
            }

            /**
             * Obtiene el valor de la propiedad uvalprecio.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUVALPRECIO() {
                return uvalprecio;
            }

            /**
             * Define el valor de la propiedad uvalprecio.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUVALPRECIO(String value) {
                this.uvalprecio = value;
            }

            /**
             * Obtiene el valor de la propiedad ucausaldev.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUCAUSALDEV() {
                return ucausaldev;
            }

            /**
             * Define el valor de la propiedad ucausaldev.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUCAUSALDEV(String value) {
                this.ucausaldev = value;
            }

            /**
             * Obtiene el valor de la propiedad ustockalm.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getUSTOCKALM() {
                return ustockalm;
            }

            /**
             * Define el valor de la propiedad ustockalm.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setUSTOCKALM(BigDecimal value) {
                this.ustockalm = value;
            }

            /**
             * Obtiene el valor de la propiedad udisponiblealm.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getUDISPONIBLEALM() {
                return udisponiblealm;
            }

            /**
             * Define el valor de la propiedad udisponiblealm.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setUDISPONIBLEALM(BigDecimal value) {
                this.udisponiblealm = value;
            }

            /**
             * Obtiene el valor de la propiedad ubldLyID.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getUBLDLyID() {
                return ubldLyID;
            }

            /**
             * Define el valor de la propiedad ubldLyID.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setUBLDLyID(Long value) {
                this.ubldLyID = value;
            }

            /**
             * Obtiene el valor de la propiedad ubldnCps.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getUBLDNCps() {
                return ubldnCps;
            }

            /**
             * Define el valor de la propiedad ubldnCps.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setUBLDNCps(Long value) {
                this.ubldnCps = value;
            }

            /**
             * Obtiene el valor de la propiedad uReferencia.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUReferencia() {
                return uReferencia;
            }

            /**
             * Define el valor de la propiedad uReferencia.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUReferencia(String value) {
                this.uReferencia = value;
            }

            /**
             * Obtiene el valor de la propiedad uDiferencia.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUDiferencia() {
                return uDiferencia;
            }

            /**
             * Define el valor de la propiedad uDiferencia.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUDiferencia(String value) {
                this.uDiferencia = value;
            }

            /**
             * Obtiene el valor de la propiedad uPrecioCotizacion.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getUPrecioCotizacion() {
                return uPrecioCotizacion;
            }

            /**
             * Define el valor de la propiedad uPrecioCotizacion.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setUPrecioCotizacion(BigDecimal value) {
                this.uPrecioCotizacion = value;
            }

            /**
             * Obtiene el valor de la propiedad uivcDone.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUIVCDone() {
                return uivcDone;
            }

            /**
             * Define el valor de la propiedad uivcDone.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUIVCDone(String value) {
                this.uivcDone = value;
            }

            /**
             * Obtiene el valor de la propiedad unwrBase.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUNWRBase() {
                return unwrBase;
            }

            /**
             * Define el valor de la propiedad unwrBase.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUNWRBase(String value) {
                this.unwrBase = value;
            }

            /**
             * Obtiene el valor de la propiedad uCustDate.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getUCustDate() {
                return uCustDate;
            }

            /**
             * Define el valor de la propiedad uCustDate.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setUCustDate(XMLGregorianCalendar value) {
                this.uCustDate = value;
            }

            /**
             * Obtiene el valor de la propiedad uDocNumBase.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUDocNumBase() {
                return uDocNumBase;
            }

            /**
             * Define el valor de la propiedad uDocNumBase.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUDocNumBase(String value) {
                this.uDocNumBase = value;
            }

            /**
             * Obtiene el valor de la propiedad uObjType.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUObjType() {
                return uObjType;
            }

            /**
             * Define el valor de la propiedad uObjType.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUObjType(String value) {
                this.uObjType = value;
            }

            /**
             * Obtiene el valor de la propiedad unwrQtyAllocated.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getUNWRQtyAllocated() {
                return unwrQtyAllocated;
            }

            /**
             * Define el valor de la propiedad unwrQtyAllocated.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setUNWRQtyAllocated(BigDecimal value) {
                this.unwrQtyAllocated = value;
            }

            /**
             * Obtiene el valor de la propiedad uReclamQty.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getUReclamQty() {
                return uReclamQty;
            }

            /**
             * Define el valor de la propiedad uReclamQty.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setUReclamQty(BigDecimal value) {
                this.uReclamQty = value;
            }

            /**
             * Obtiene el valor de la propiedad uqaMark.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUQAMark() {
                return uqaMark;
            }

            /**
             * Define el valor de la propiedad uqaMark.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUQAMark(String value) {
                this.uqaMark = value;
            }

            /**
             * Obtiene el valor de la propiedad uIncomingQty.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getUIncomingQty() {
                return uIncomingQty;
            }

            /**
             * Define el valor de la propiedad uIncomingQty.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setUIncomingQty(BigDecimal value) {
                this.uIncomingQty = value;
            }

            /**
             * Obtiene el valor de la propiedad unwrBin.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUNWRBin() {
                return unwrBin;
            }

            /**
             * Define el valor de la propiedad unwrBin.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUNWRBin(String value) {
                this.unwrBin = value;
            }

            /**
             * Obtiene el valor de la propiedad uTransitWHSCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUTransitWHSCode() {
                return uTransitWHSCode;
            }

            /**
             * Define el valor de la propiedad uTransitWHSCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUTransitWHSCode(String value) {
                this.uTransitWHSCode = value;
            }

            /**
             * Obtiene el valor de la propiedad uCalcAIU.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUCalcAIU() {
                return uCalcAIU;
            }

            /**
             * Define el valor de la propiedad uCalcAIU.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUCalcAIU(String value) {
                this.uCalcAIU = value;
            }

            /**
             * Obtiene el valor de la propiedad lineTaxJurisdictions.
             *
             * @return
             *     possible object is
             *     {@link Document.DocumentLines.DocumentLine.LineTaxJurisdictions }
             *
             */
            public Document.DocumentLines.DocumentLine.LineTaxJurisdictions getLineTaxJurisdictions() {
                return lineTaxJurisdictions;
            }

            /**
             * Define el valor de la propiedad lineTaxJurisdictions.
             *
             * @param value
             *     allowed object is
             *     {@link Document.DocumentLines.DocumentLine.LineTaxJurisdictions }
             *
             */
            public void setLineTaxJurisdictions(Document.DocumentLines.DocumentLine.LineTaxJurisdictions value) {
                this.lineTaxJurisdictions = value;
            }

            /**
             * Obtiene el valor de la propiedad documentLineAdditionalExpenses.
             *
             * @return
             *     possible object is
             *     {@link Document.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses }
             *
             */
            public Document.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses getDocumentLineAdditionalExpenses() {
                return documentLineAdditionalExpenses;
            }

            /**
             * Define el valor de la propiedad documentLineAdditionalExpenses.
             *
             * @param value
             *     allowed object is
             *     {@link Document.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses }
             *
             */
            public void setDocumentLineAdditionalExpenses(Document.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses value) {
                this.documentLineAdditionalExpenses = value;
            }

            /**
             * Obtiene el valor de la propiedad withholdingTaxLines.
             *
             * @return
             *     possible object is
             *     {@link Document.DocumentLines.DocumentLine.WithholdingTaxLines }
             *
             */
            public Document.DocumentLines.DocumentLine.WithholdingTaxLines getWithholdingTaxLines() {
                return withholdingTaxLines;
            }

            /**
             * Define el valor de la propiedad withholdingTaxLines.
             *
             * @param value
             *     allowed object is
             *     {@link Document.DocumentLines.DocumentLine.WithholdingTaxLines }
             *
             */
            public void setWithholdingTaxLines(Document.DocumentLines.DocumentLine.WithholdingTaxLines value) {
                this.withholdingTaxLines = value;
            }

            /**
             * Obtiene el valor de la propiedad serialNumbers.
             *
             * @return
             *     possible object is
             *     {@link Document.DocumentLines.DocumentLine.SerialNumbers }
             *
             */
            public Document.DocumentLines.DocumentLine.SerialNumbers getSerialNumbers() {
                return serialNumbers;
            }

            /**
             * Define el valor de la propiedad serialNumbers.
             *
             * @param value
             *     allowed object is
             *     {@link Document.DocumentLines.DocumentLine.SerialNumbers }
             *
             */
            public void setSerialNumbers(Document.DocumentLines.DocumentLine.SerialNumbers value) {
                this.serialNumbers = value;
            }

            /**
             * Obtiene el valor de la propiedad batchNumbers.
             *
             * @return
             *     possible object is
             *     {@link Document.DocumentLines.DocumentLine.BatchNumbers }
             *
             */
            public Document.DocumentLines.DocumentLine.BatchNumbers getBatchNumbers() {
                return batchNumbers;
            }

            /**
             * Define el valor de la propiedad batchNumbers.
             *
             * @param value
             *     allowed object is
             *     {@link Document.DocumentLines.DocumentLine.BatchNumbers }
             *
             */
            public void setBatchNumbers(Document.DocumentLines.DocumentLine.BatchNumbers value) {
                this.batchNumbers = value;
            }

            /**
             * Obtiene el valor de la propiedad documentLinesBinAllocations.
             *
             * @return
             *     possible object is
             *     {@link Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations }
             *
             */
            public Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations getDocumentLinesBinAllocations() {
                return documentLinesBinAllocations;
            }

            /**
             * Define el valor de la propiedad documentLinesBinAllocations.
             *
             * @param value
             *     allowed object is
             *     {@link Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations }
             *
             */
            public void setDocumentLinesBinAllocations(Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations value) {
                this.documentLinesBinAllocations = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             *
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="BatchNumber" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="BatchNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="ManufacturerSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="InternalSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="ManufacturingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="AddmisionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="BaseLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="TrackingNote" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="TrackingNoteLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                 &lt;/all>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "batchNumber"
            })
            public static class BatchNumbers {

                @XmlElement(name = "BatchNumber")
                protected List<Document.DocumentLines.DocumentLine.BatchNumbers.BatchNumber> batchNumber;

                /**
                 * Gets the value of the batchNumber property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the batchNumber property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBatchNumber().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Document.DocumentLines.DocumentLine.BatchNumbers.BatchNumber }
                 *
                 *
                 */
                public List<Document.DocumentLines.DocumentLine.BatchNumbers.BatchNumber> getBatchNumber() {
                    if (batchNumber == null) {
                        batchNumber = new ArrayList<Document.DocumentLines.DocumentLine.BatchNumbers.BatchNumber>();
                    }
                    return this.batchNumber;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 *
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;all>
                 *         &lt;element name="BatchNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="ManufacturerSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="InternalSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="ManufacturingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="AddmisionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="BaseLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="TrackingNote" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="TrackingNoteLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *       &lt;/all>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class BatchNumber {

                    @XmlElement(name = "BatchNumber")
                    protected String batchNumber;
                    @XmlElement(name = "ManufacturerSerialNumber")
                    protected String manufacturerSerialNumber;
                    @XmlElement(name = "InternalSerialNumber")
                    protected String internalSerialNumber;
                    @XmlElement(name = "ExpiryDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar expiryDate;
                    @XmlElement(name = "ManufacturingDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar manufacturingDate;
                    @XmlElement(name = "AddmisionDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar addmisionDate;
                    @XmlElement(name = "Location")
                    protected String location;
                    @XmlElement(name = "Notes")
                    protected String notes;
                    @XmlElement(name = "Quantity")
                    protected BigDecimal quantity;
                    @XmlElement(name = "BaseLineNumber")
                    protected Long baseLineNumber;
                    @XmlElement(name = "TrackingNote")
                    protected Long trackingNote;
                    @XmlElement(name = "TrackingNoteLine")
                    protected Long trackingNoteLine;

                    /**
                     * Obtiene el valor de la propiedad batchNumber.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getBatchNumber() {
                        return batchNumber;
                    }

                    /**
                     * Define el valor de la propiedad batchNumber.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setBatchNumber(String value) {
                        this.batchNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad manufacturerSerialNumber.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getManufacturerSerialNumber() {
                        return manufacturerSerialNumber;
                    }

                    /**
                     * Define el valor de la propiedad manufacturerSerialNumber.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setManufacturerSerialNumber(String value) {
                        this.manufacturerSerialNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad internalSerialNumber.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getInternalSerialNumber() {
                        return internalSerialNumber;
                    }

                    /**
                     * Define el valor de la propiedad internalSerialNumber.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setInternalSerialNumber(String value) {
                        this.internalSerialNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad expiryDate.
                     *
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public XMLGregorianCalendar getExpiryDate() {
                        return expiryDate;
                    }

                    /**
                     * Define el valor de la propiedad expiryDate.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public void setExpiryDate(XMLGregorianCalendar value) {
                        this.expiryDate = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad manufacturingDate.
                     *
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public XMLGregorianCalendar getManufacturingDate() {
                        return manufacturingDate;
                    }

                    /**
                     * Define el valor de la propiedad manufacturingDate.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public void setManufacturingDate(XMLGregorianCalendar value) {
                        this.manufacturingDate = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad addmisionDate.
                     *
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public XMLGregorianCalendar getAddmisionDate() {
                        return addmisionDate;
                    }

                    /**
                     * Define el valor de la propiedad addmisionDate.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public void setAddmisionDate(XMLGregorianCalendar value) {
                        this.addmisionDate = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad location.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getLocation() {
                        return location;
                    }

                    /**
                     * Define el valor de la propiedad location.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setLocation(String value) {
                        this.location = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad notes.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getNotes() {
                        return notes;
                    }

                    /**
                     * Define el valor de la propiedad notes.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setNotes(String value) {
                        this.notes = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad quantity.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getQuantity() {
                        return quantity;
                    }

                    /**
                     * Define el valor de la propiedad quantity.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setQuantity(BigDecimal value) {
                        this.quantity = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad baseLineNumber.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getBaseLineNumber() {
                        return baseLineNumber;
                    }

                    /**
                     * Define el valor de la propiedad baseLineNumber.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setBaseLineNumber(Long value) {
                        this.baseLineNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad trackingNote.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getTrackingNote() {
                        return trackingNote;
                    }

                    /**
                     * Define el valor de la propiedad trackingNote.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setTrackingNote(Long value) {
                        this.trackingNote = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad trackingNoteLine.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getTrackingNoteLine() {
                        return trackingNoteLine;
                    }

                    /**
                     * Define el valor de la propiedad trackingNoteLine.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setTrackingNoteLine(Long value) {
                        this.trackingNoteLine = value;
                    }

                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             *
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="DocumentLineAdditionalExpense" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="ExpenseCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="LineTotal" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="LineTotalFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="LineTotalSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="PaidToDate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="PaidToDateFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="PaidToDateSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="TaxLiable" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;enumeration value="tNO"/>
             *                         &lt;enumeration value="tYES"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="VatGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="TaxPercent" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="TaxSum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="TaxSumFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="TaxSumSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="DeductibleTaxSum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="DeductibleTaxSumFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="DeductibleTaxSumSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="AquisitionTax" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;enumeration value="tNO"/>
             *                         &lt;enumeration value="tYES"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="TaxType" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;enumeration value="aext_NormalTax"/>
             *                         &lt;enumeration value="aext_NoTax"/>
             *                         &lt;enumeration value="aext_UseTax"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="TaxPaid" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="TaxPaidFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="TaxPaidSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="EqualizationTaxPercent" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="EqualizationTaxSum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="EqualizationTaxFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="EqualizationTaxSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="TaxTotalSum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="TaxTotalSumFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="TaxTotalSumSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="WTLiable" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;enumeration value="tNO"/>
             *                         &lt;enumeration value="tYES"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="BaseGroup" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="DistributionRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Project" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="DistributionRule2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="DistributionRule3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="DistributionRule4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="DistributionRule5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="LineExpenseTaxJurisdictions" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="LineExpenseTaxJurisdiction" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;all>
             *                                       &lt;element name="JurisdictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                       &lt;element name="JurisdictionType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                                       &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                                       &lt;element name="TaxAmountSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                                       &lt;element name="TaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                                       &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                                       &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                                       &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                                       &lt;element name="RowSequence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                                     &lt;/all>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/all>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "documentLineAdditionalExpense"
            })
            public static class DocumentLineAdditionalExpenses {

                @XmlElement(name = "DocumentLineAdditionalExpense")
                protected List<Document.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense> documentLineAdditionalExpense;

                /**
                 * Gets the value of the documentLineAdditionalExpense property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the documentLineAdditionalExpense property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDocumentLineAdditionalExpense().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Document.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense }
                 *
                 *
                 */
                public List<Document.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense> getDocumentLineAdditionalExpense() {
                    if (documentLineAdditionalExpense == null) {
                        documentLineAdditionalExpense = new ArrayList<Document.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense>();
                    }
                    return this.documentLineAdditionalExpense;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 *
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;all>
                 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="ExpenseCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="LineTotal" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="LineTotalFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="LineTotalSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="PaidToDate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="PaidToDateFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="PaidToDateSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="TaxLiable" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;enumeration value="tNO"/>
                 *               &lt;enumeration value="tYES"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="VatGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="TaxPercent" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="TaxSum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="TaxSumFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="TaxSumSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="DeductibleTaxSum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="DeductibleTaxSumFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="DeductibleTaxSumSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="AquisitionTax" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;enumeration value="tNO"/>
                 *               &lt;enumeration value="tYES"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="TaxType" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;enumeration value="aext_NormalTax"/>
                 *               &lt;enumeration value="aext_NoTax"/>
                 *               &lt;enumeration value="aext_UseTax"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="TaxPaid" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="TaxPaidFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="TaxPaidSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="EqualizationTaxPercent" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="EqualizationTaxSum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="EqualizationTaxFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="EqualizationTaxSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="TaxTotalSum" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="TaxTotalSumFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="TaxTotalSumSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="WTLiable" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;enumeration value="tNO"/>
                 *               &lt;enumeration value="tYES"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="BaseGroup" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="DistributionRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Project" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="DistributionRule2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="DistributionRule3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="DistributionRule4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="DistributionRule5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="LineExpenseTaxJurisdictions" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="LineExpenseTaxJurisdiction" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;all>
                 *                             &lt;element name="JurisdictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                             &lt;element name="JurisdictionType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *                             &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *                             &lt;element name="TaxAmountSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *                             &lt;element name="TaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *                             &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *                             &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *                             &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *                             &lt;element name="RowSequence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *                           &lt;/all>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/all>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class DocumentLineAdditionalExpense {

                    @XmlElement(name = "LineNumber")
                    protected Long lineNumber;
                    @XmlElement(name = "GroupCode")
                    protected Long groupCode;
                    @XmlElement(name = "ExpenseCode")
                    protected Long expenseCode;
                    @XmlElement(name = "LineTotal")
                    protected BigDecimal lineTotal;
                    @XmlElement(name = "LineTotalFC")
                    protected BigDecimal lineTotalFC;
                    @XmlElement(name = "LineTotalSys")
                    protected BigDecimal lineTotalSys;
                    @XmlElement(name = "PaidToDate")
                    protected BigDecimal paidToDate;
                    @XmlElement(name = "PaidToDateFC")
                    protected BigDecimal paidToDateFC;
                    @XmlElement(name = "PaidToDateSys")
                    protected BigDecimal paidToDateSys;
                    @XmlElement(name = "TaxLiable")
                    protected String taxLiable;
                    @XmlElement(name = "VatGroup")
                    protected String vatGroup;
                    @XmlElement(name = "TaxPercent")
                    protected BigDecimal taxPercent;
                    @XmlElement(name = "TaxSum")
                    protected BigDecimal taxSum;
                    @XmlElement(name = "TaxSumFC")
                    protected BigDecimal taxSumFC;
                    @XmlElement(name = "TaxSumSys")
                    protected BigDecimal taxSumSys;
                    @XmlElement(name = "DeductibleTaxSum")
                    protected BigDecimal deductibleTaxSum;
                    @XmlElement(name = "DeductibleTaxSumFC")
                    protected BigDecimal deductibleTaxSumFC;
                    @XmlElement(name = "DeductibleTaxSumSys")
                    protected BigDecimal deductibleTaxSumSys;
                    @XmlElement(name = "AquisitionTax")
                    protected String aquisitionTax;
                    @XmlElement(name = "TaxCode")
                    protected String taxCode;
                    @XmlElement(name = "TaxType")
                    protected String taxType;
                    @XmlElement(name = "TaxPaid")
                    protected BigDecimal taxPaid;
                    @XmlElement(name = "TaxPaidFC")
                    protected BigDecimal taxPaidFC;
                    @XmlElement(name = "TaxPaidSys")
                    protected BigDecimal taxPaidSys;
                    @XmlElement(name = "EqualizationTaxPercent")
                    protected BigDecimal equalizationTaxPercent;
                    @XmlElement(name = "EqualizationTaxSum")
                    protected BigDecimal equalizationTaxSum;
                    @XmlElement(name = "EqualizationTaxFC")
                    protected BigDecimal equalizationTaxFC;
                    @XmlElement(name = "EqualizationTaxSys")
                    protected BigDecimal equalizationTaxSys;
                    @XmlElement(name = "TaxTotalSum")
                    protected BigDecimal taxTotalSum;
                    @XmlElement(name = "TaxTotalSumFC")
                    protected BigDecimal taxTotalSumFC;
                    @XmlElement(name = "TaxTotalSumSys")
                    protected BigDecimal taxTotalSumSys;
                    @XmlElement(name = "WTLiable")
                    protected String wtLiable;
                    @XmlElement(name = "BaseGroup")
                    protected Long baseGroup;
                    @XmlElement(name = "DistributionRule")
                    protected String distributionRule;
                    @XmlElement(name = "Project")
                    protected String project;
                    @XmlElement(name = "DistributionRule2")
                    protected String distributionRule2;
                    @XmlElement(name = "DistributionRule3")
                    protected String distributionRule3;
                    @XmlElement(name = "DistributionRule4")
                    protected String distributionRule4;
                    @XmlElement(name = "DistributionRule5")
                    protected String distributionRule5;
                    @XmlElement(name = "LineExpenseTaxJurisdictions")
                    protected Document.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense.LineExpenseTaxJurisdictions lineExpenseTaxJurisdictions;

                    /**
                     * Obtiene el valor de la propiedad lineNumber.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getLineNumber() {
                        return lineNumber;
                    }

                    /**
                     * Define el valor de la propiedad lineNumber.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setLineNumber(Long value) {
                        this.lineNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad groupCode.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getGroupCode() {
                        return groupCode;
                    }

                    /**
                     * Define el valor de la propiedad groupCode.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setGroupCode(Long value) {
                        this.groupCode = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad expenseCode.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getExpenseCode() {
                        return expenseCode;
                    }

                    /**
                     * Define el valor de la propiedad expenseCode.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setExpenseCode(Long value) {
                        this.expenseCode = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad lineTotal.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getLineTotal() {
                        return lineTotal;
                    }

                    /**
                     * Define el valor de la propiedad lineTotal.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setLineTotal(BigDecimal value) {
                        this.lineTotal = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad lineTotalFC.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getLineTotalFC() {
                        return lineTotalFC;
                    }

                    /**
                     * Define el valor de la propiedad lineTotalFC.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setLineTotalFC(BigDecimal value) {
                        this.lineTotalFC = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad lineTotalSys.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getLineTotalSys() {
                        return lineTotalSys;
                    }

                    /**
                     * Define el valor de la propiedad lineTotalSys.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setLineTotalSys(BigDecimal value) {
                        this.lineTotalSys = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad paidToDate.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getPaidToDate() {
                        return paidToDate;
                    }

                    /**
                     * Define el valor de la propiedad paidToDate.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setPaidToDate(BigDecimal value) {
                        this.paidToDate = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad paidToDateFC.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getPaidToDateFC() {
                        return paidToDateFC;
                    }

                    /**
                     * Define el valor de la propiedad paidToDateFC.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setPaidToDateFC(BigDecimal value) {
                        this.paidToDateFC = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad paidToDateSys.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getPaidToDateSys() {
                        return paidToDateSys;
                    }

                    /**
                     * Define el valor de la propiedad paidToDateSys.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setPaidToDateSys(BigDecimal value) {
                        this.paidToDateSys = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxLiable.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getTaxLiable() {
                        return taxLiable;
                    }

                    /**
                     * Define el valor de la propiedad taxLiable.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setTaxLiable(String value) {
                        this.taxLiable = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad vatGroup.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getVatGroup() {
                        return vatGroup;
                    }

                    /**
                     * Define el valor de la propiedad vatGroup.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setVatGroup(String value) {
                        this.vatGroup = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxPercent.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getTaxPercent() {
                        return taxPercent;
                    }

                    /**
                     * Define el valor de la propiedad taxPercent.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setTaxPercent(BigDecimal value) {
                        this.taxPercent = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxSum.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getTaxSum() {
                        return taxSum;
                    }

                    /**
                     * Define el valor de la propiedad taxSum.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setTaxSum(BigDecimal value) {
                        this.taxSum = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxSumFC.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getTaxSumFC() {
                        return taxSumFC;
                    }

                    /**
                     * Define el valor de la propiedad taxSumFC.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setTaxSumFC(BigDecimal value) {
                        this.taxSumFC = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxSumSys.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getTaxSumSys() {
                        return taxSumSys;
                    }

                    /**
                     * Define el valor de la propiedad taxSumSys.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setTaxSumSys(BigDecimal value) {
                        this.taxSumSys = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad deductibleTaxSum.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getDeductibleTaxSum() {
                        return deductibleTaxSum;
                    }

                    /**
                     * Define el valor de la propiedad deductibleTaxSum.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setDeductibleTaxSum(BigDecimal value) {
                        this.deductibleTaxSum = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad deductibleTaxSumFC.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getDeductibleTaxSumFC() {
                        return deductibleTaxSumFC;
                    }

                    /**
                     * Define el valor de la propiedad deductibleTaxSumFC.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setDeductibleTaxSumFC(BigDecimal value) {
                        this.deductibleTaxSumFC = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad deductibleTaxSumSys.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getDeductibleTaxSumSys() {
                        return deductibleTaxSumSys;
                    }

                    /**
                     * Define el valor de la propiedad deductibleTaxSumSys.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setDeductibleTaxSumSys(BigDecimal value) {
                        this.deductibleTaxSumSys = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad aquisitionTax.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getAquisitionTax() {
                        return aquisitionTax;
                    }

                    /**
                     * Define el valor de la propiedad aquisitionTax.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setAquisitionTax(String value) {
                        this.aquisitionTax = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxCode.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getTaxCode() {
                        return taxCode;
                    }

                    /**
                     * Define el valor de la propiedad taxCode.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setTaxCode(String value) {
                        this.taxCode = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxType.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getTaxType() {
                        return taxType;
                    }

                    /**
                     * Define el valor de la propiedad taxType.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setTaxType(String value) {
                        this.taxType = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxPaid.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getTaxPaid() {
                        return taxPaid;
                    }

                    /**
                     * Define el valor de la propiedad taxPaid.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setTaxPaid(BigDecimal value) {
                        this.taxPaid = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxPaidFC.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getTaxPaidFC() {
                        return taxPaidFC;
                    }

                    /**
                     * Define el valor de la propiedad taxPaidFC.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setTaxPaidFC(BigDecimal value) {
                        this.taxPaidFC = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxPaidSys.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getTaxPaidSys() {
                        return taxPaidSys;
                    }

                    /**
                     * Define el valor de la propiedad taxPaidSys.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setTaxPaidSys(BigDecimal value) {
                        this.taxPaidSys = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad equalizationTaxPercent.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getEqualizationTaxPercent() {
                        return equalizationTaxPercent;
                    }

                    /**
                     * Define el valor de la propiedad equalizationTaxPercent.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setEqualizationTaxPercent(BigDecimal value) {
                        this.equalizationTaxPercent = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad equalizationTaxSum.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getEqualizationTaxSum() {
                        return equalizationTaxSum;
                    }

                    /**
                     * Define el valor de la propiedad equalizationTaxSum.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setEqualizationTaxSum(BigDecimal value) {
                        this.equalizationTaxSum = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad equalizationTaxFC.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getEqualizationTaxFC() {
                        return equalizationTaxFC;
                    }

                    /**
                     * Define el valor de la propiedad equalizationTaxFC.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setEqualizationTaxFC(BigDecimal value) {
                        this.equalizationTaxFC = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad equalizationTaxSys.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getEqualizationTaxSys() {
                        return equalizationTaxSys;
                    }

                    /**
                     * Define el valor de la propiedad equalizationTaxSys.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setEqualizationTaxSys(BigDecimal value) {
                        this.equalizationTaxSys = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxTotalSum.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getTaxTotalSum() {
                        return taxTotalSum;
                    }

                    /**
                     * Define el valor de la propiedad taxTotalSum.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setTaxTotalSum(BigDecimal value) {
                        this.taxTotalSum = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxTotalSumFC.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getTaxTotalSumFC() {
                        return taxTotalSumFC;
                    }

                    /**
                     * Define el valor de la propiedad taxTotalSumFC.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setTaxTotalSumFC(BigDecimal value) {
                        this.taxTotalSumFC = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxTotalSumSys.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getTaxTotalSumSys() {
                        return taxTotalSumSys;
                    }

                    /**
                     * Define el valor de la propiedad taxTotalSumSys.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setTaxTotalSumSys(BigDecimal value) {
                        this.taxTotalSumSys = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad wtLiable.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getWTLiable() {
                        return wtLiable;
                    }

                    /**
                     * Define el valor de la propiedad wtLiable.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setWTLiable(String value) {
                        this.wtLiable = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad baseGroup.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getBaseGroup() {
                        return baseGroup;
                    }

                    /**
                     * Define el valor de la propiedad baseGroup.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setBaseGroup(Long value) {
                        this.baseGroup = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad distributionRule.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getDistributionRule() {
                        return distributionRule;
                    }

                    /**
                     * Define el valor de la propiedad distributionRule.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setDistributionRule(String value) {
                        this.distributionRule = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad project.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getProject() {
                        return project;
                    }

                    /**
                     * Define el valor de la propiedad project.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setProject(String value) {
                        this.project = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad distributionRule2.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getDistributionRule2() {
                        return distributionRule2;
                    }

                    /**
                     * Define el valor de la propiedad distributionRule2.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setDistributionRule2(String value) {
                        this.distributionRule2 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad distributionRule3.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getDistributionRule3() {
                        return distributionRule3;
                    }

                    /**
                     * Define el valor de la propiedad distributionRule3.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setDistributionRule3(String value) {
                        this.distributionRule3 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad distributionRule4.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getDistributionRule4() {
                        return distributionRule4;
                    }

                    /**
                     * Define el valor de la propiedad distributionRule4.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setDistributionRule4(String value) {
                        this.distributionRule4 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad distributionRule5.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getDistributionRule5() {
                        return distributionRule5;
                    }

                    /**
                     * Define el valor de la propiedad distributionRule5.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setDistributionRule5(String value) {
                        this.distributionRule5 = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad lineExpenseTaxJurisdictions.
                     *
                     * @return
                     *     possible object is
                     *     {@link Document.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense.LineExpenseTaxJurisdictions }
                     *
                     */
                    public Document.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense.LineExpenseTaxJurisdictions getLineExpenseTaxJurisdictions() {
                        return lineExpenseTaxJurisdictions;
                    }

                    /**
                     * Define el valor de la propiedad lineExpenseTaxJurisdictions.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Document.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense.LineExpenseTaxJurisdictions }
                     *
                     */
                    public void setLineExpenseTaxJurisdictions(Document.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense.LineExpenseTaxJurisdictions value) {
                        this.lineExpenseTaxJurisdictions = value;
                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     *
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="LineExpenseTaxJurisdiction" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;all>
                     *                   &lt;element name="JurisdictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                   &lt;element name="JurisdictionType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                     *                   &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                     *                   &lt;element name="TaxAmountSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                     *                   &lt;element name="TaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                     *                   &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                     *                   &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                     *                   &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                     *                   &lt;element name="RowSequence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                     *                 &lt;/all>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                            "lineExpenseTaxJurisdiction"
                    })
                    public static class LineExpenseTaxJurisdictions {

                        @XmlElement(name = "LineExpenseTaxJurisdiction")
                        protected List<Document.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense.LineExpenseTaxJurisdictions.LineExpenseTaxJurisdiction> lineExpenseTaxJurisdiction;

                        /**
                         * Gets the value of the lineExpenseTaxJurisdiction property.
                         *
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the lineExpenseTaxJurisdiction property.
                         *
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getLineExpenseTaxJurisdiction().add(newItem);
                         * </pre>
                         *
                         *
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Document.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense.LineExpenseTaxJurisdictions.LineExpenseTaxJurisdiction }
                         *
                         *
                         */
                        public List<LineExpenseTaxJurisdiction> getLineExpenseTaxJurisdiction() {
                            if (lineExpenseTaxJurisdiction == null) {
                                lineExpenseTaxJurisdiction = new ArrayList<LineExpenseTaxJurisdiction>();
                            }
                            return this.lineExpenseTaxJurisdiction;
                        }


                        /**
                         * <p>Clase Java para anonymous complex type.
                         *
                         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                         *
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;all>
                         *         &lt;element name="JurisdictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *         &lt;element name="JurisdictionType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                         *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                         *         &lt;element name="TaxAmountSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                         *         &lt;element name="TaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                         *         &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                         *         &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                         *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                         *         &lt;element name="RowSequence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                         *       &lt;/all>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         *
                         *
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {

                        })
                        public static class LineExpenseTaxJurisdiction {

                            @XmlElement(name = "JurisdictionCode")
                            protected String jurisdictionCode;
                            @XmlElement(name = "JurisdictionType")
                            protected Long jurisdictionType;
                            @XmlElement(name = "TaxAmount")
                            protected BigDecimal taxAmount;
                            @XmlElement(name = "TaxAmountSC")
                            protected BigDecimal taxAmountSC;
                            @XmlElement(name = "TaxAmountFC")
                            protected BigDecimal taxAmountFC;
                            @XmlElement(name = "TaxRate")
                            protected BigDecimal taxRate;
                            @XmlElement(name = "DocEntry")
                            protected Long docEntry;
                            @XmlElement(name = "LineNumber")
                            protected Long lineNumber;
                            @XmlElement(name = "RowSequence")
                            protected Long rowSequence;

                            /**
                             * Obtiene el valor de la propiedad jurisdictionCode.
                             *
                             * @return
                             *     possible object is
                             *     {@link String }
                             *
                             */
                            public String getJurisdictionCode() {
                                return jurisdictionCode;
                            }

                            /**
                             * Define el valor de la propiedad jurisdictionCode.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *
                             */
                            public void setJurisdictionCode(String value) {
                                this.jurisdictionCode = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad jurisdictionType.
                             *
                             * @return
                             *     possible object is
                             *     {@link Long }
                             *
                             */
                            public Long getJurisdictionType() {
                                return jurisdictionType;
                            }

                            /**
                             * Define el valor de la propiedad jurisdictionType.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link Long }
                             *
                             */
                            public void setJurisdictionType(Long value) {
                                this.jurisdictionType = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad taxAmount.
                             *
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *
                             */
                            public BigDecimal getTaxAmount() {
                                return taxAmount;
                            }

                            /**
                             * Define el valor de la propiedad taxAmount.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *
                             */
                            public void setTaxAmount(BigDecimal value) {
                                this.taxAmount = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad taxAmountSC.
                             *
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *
                             */
                            public BigDecimal getTaxAmountSC() {
                                return taxAmountSC;
                            }

                            /**
                             * Define el valor de la propiedad taxAmountSC.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *
                             */
                            public void setTaxAmountSC(BigDecimal value) {
                                this.taxAmountSC = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad taxAmountFC.
                             *
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *
                             */
                            public BigDecimal getTaxAmountFC() {
                                return taxAmountFC;
                            }

                            /**
                             * Define el valor de la propiedad taxAmountFC.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *
                             */
                            public void setTaxAmountFC(BigDecimal value) {
                                this.taxAmountFC = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad taxRate.
                             *
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *
                             */
                            public BigDecimal getTaxRate() {
                                return taxRate;
                            }

                            /**
                             * Define el valor de la propiedad taxRate.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *
                             */
                            public void setTaxRate(BigDecimal value) {
                                this.taxRate = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad docEntry.
                             *
                             * @return
                             *     possible object is
                             *     {@link Long }
                             *
                             */
                            public Long getDocEntry() {
                                return docEntry;
                            }

                            /**
                             * Define el valor de la propiedad docEntry.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link Long }
                             *
                             */
                            public void setDocEntry(Long value) {
                                this.docEntry = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad lineNumber.
                             *
                             * @return
                             *     possible object is
                             *     {@link Long }
                             *
                             */
                            public Long getLineNumber() {
                                return lineNumber;
                            }

                            /**
                             * Define el valor de la propiedad lineNumber.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link Long }
                             *
                             */
                            public void setLineNumber(Long value) {
                                this.lineNumber = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad rowSequence.
                             *
                             * @return
                             *     possible object is
                             *     {@link Long }
                             *
                             */
                            public Long getRowSequence() {
                                return rowSequence;
                            }

                            /**
                             * Define el valor de la propiedad rowSequence.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link Long }
                             *
                             */
                            public void setRowSequence(Long value) {
                                this.rowSequence = value;
                            }

                        }

                    }

                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             *
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="DocumentLinesBinAllocation" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="BinAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="AllowNegativeQuantity" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;enumeration value="tNO"/>
             *                         &lt;enumeration value="tYES"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="SerialAndBatchNumbersBaseLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="BaseLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                 &lt;/all>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "documentLinesBinAllocation"
            })
            public static class DocumentLinesBinAllocations {

                @XmlElement(name = "DocumentLinesBinAllocation")
                protected List<Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation> documentLinesBinAllocation;

                /**
                 * Gets the value of the documentLinesBinAllocation property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the documentLinesBinAllocation property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDocumentLinesBinAllocation().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation }
                 *
                 *
                 */
                public List<Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation> getDocumentLinesBinAllocation() {
                    if (documentLinesBinAllocation == null) {
                        documentLinesBinAllocation = new ArrayList<Document.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation>();
                    }
                    return this.documentLinesBinAllocation;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 *
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;all>
                 *         &lt;element name="BinAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="AllowNegativeQuantity" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;enumeration value="tNO"/>
                 *               &lt;enumeration value="tYES"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="SerialAndBatchNumbersBaseLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="BaseLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *       &lt;/all>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class DocumentLinesBinAllocation {

                    @XmlElement(name = "BinAbsEntry")
                    protected Long binAbsEntry;
                    @XmlElement(name = "Quantity")
                    protected BigDecimal quantity;
                    @XmlElement(name = "AllowNegativeQuantity")
                    protected String allowNegativeQuantity;
                    @XmlElement(name = "SerialAndBatchNumbersBaseLine")
                    protected Long serialAndBatchNumbersBaseLine;
                    @XmlElement(name = "BaseLineNumber")
                    protected Long baseLineNumber;

                    /**
                     * Obtiene el valor de la propiedad binAbsEntry.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getBinAbsEntry() {
                        return binAbsEntry;
                    }

                    /**
                     * Define el valor de la propiedad binAbsEntry.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setBinAbsEntry(Long value) {
                        this.binAbsEntry = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad quantity.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getQuantity() {
                        return quantity;
                    }

                    /**
                     * Define el valor de la propiedad quantity.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setQuantity(BigDecimal value) {
                        this.quantity = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad allowNegativeQuantity.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getAllowNegativeQuantity() {
                        return allowNegativeQuantity;
                    }

                    /**
                     * Define el valor de la propiedad allowNegativeQuantity.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setAllowNegativeQuantity(String value) {
                        this.allowNegativeQuantity = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad serialAndBatchNumbersBaseLine.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getSerialAndBatchNumbersBaseLine() {
                        return serialAndBatchNumbersBaseLine;
                    }

                    /**
                     * Define el valor de la propiedad serialAndBatchNumbersBaseLine.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setSerialAndBatchNumbersBaseLine(Long value) {
                        this.serialAndBatchNumbersBaseLine = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad baseLineNumber.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getBaseLineNumber() {
                        return baseLineNumber;
                    }

                    /**
                     * Define el valor de la propiedad baseLineNumber.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setBaseLineNumber(Long value) {
                        this.baseLineNumber = value;
                    }

                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             *
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="LineTaxJurisdiction" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="JurisdictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="JurisdictionType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="TaxAmountSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="TaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="RowSequence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                 &lt;/all>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "lineTaxJurisdiction"
            })
            public static class LineTaxJurisdictions {

                @XmlElement(name = "LineTaxJurisdiction")
                protected List<Document.DocumentLines.DocumentLine.LineTaxJurisdictions.LineTaxJurisdiction> lineTaxJurisdiction;

                /**
                 * Gets the value of the lineTaxJurisdiction property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the lineTaxJurisdiction property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLineTaxJurisdiction().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Document.DocumentLines.DocumentLine.LineTaxJurisdictions.LineTaxJurisdiction }
                 *
                 *
                 */
                public List<Document.DocumentLines.DocumentLine.LineTaxJurisdictions.LineTaxJurisdiction> getLineTaxJurisdiction() {
                    if (lineTaxJurisdiction == null) {
                        lineTaxJurisdiction = new ArrayList<Document.DocumentLines.DocumentLine.LineTaxJurisdictions.LineTaxJurisdiction>();
                    }
                    return this.lineTaxJurisdiction;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 *
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;all>
                 *         &lt;element name="JurisdictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="JurisdictionType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="TaxAmountSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="TaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="DocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="RowSequence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *       &lt;/all>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class LineTaxJurisdiction {

                    @XmlElement(name = "JurisdictionCode")
                    protected String jurisdictionCode;
                    @XmlElement(name = "JurisdictionType")
                    protected Long jurisdictionType;
                    @XmlElement(name = "TaxAmount")
                    protected BigDecimal taxAmount;
                    @XmlElement(name = "TaxAmountSC")
                    protected BigDecimal taxAmountSC;
                    @XmlElement(name = "TaxAmountFC")
                    protected BigDecimal taxAmountFC;
                    @XmlElement(name = "TaxRate")
                    protected BigDecimal taxRate;
                    @XmlElement(name = "DocEntry")
                    protected Long docEntry;
                    @XmlElement(name = "LineNumber")
                    protected Long lineNumber;
                    @XmlElement(name = "RowSequence")
                    protected Long rowSequence;

                    /**
                     * Obtiene el valor de la propiedad jurisdictionCode.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getJurisdictionCode() {
                        return jurisdictionCode;
                    }

                    /**
                     * Define el valor de la propiedad jurisdictionCode.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setJurisdictionCode(String value) {
                        this.jurisdictionCode = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad jurisdictionType.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getJurisdictionType() {
                        return jurisdictionType;
                    }

                    /**
                     * Define el valor de la propiedad jurisdictionType.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setJurisdictionType(Long value) {
                        this.jurisdictionType = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxAmount.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getTaxAmount() {
                        return taxAmount;
                    }

                    /**
                     * Define el valor de la propiedad taxAmount.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setTaxAmount(BigDecimal value) {
                        this.taxAmount = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxAmountSC.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getTaxAmountSC() {
                        return taxAmountSC;
                    }

                    /**
                     * Define el valor de la propiedad taxAmountSC.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setTaxAmountSC(BigDecimal value) {
                        this.taxAmountSC = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxAmountFC.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getTaxAmountFC() {
                        return taxAmountFC;
                    }

                    /**
                     * Define el valor de la propiedad taxAmountFC.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setTaxAmountFC(BigDecimal value) {
                        this.taxAmountFC = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxRate.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getTaxRate() {
                        return taxRate;
                    }

                    /**
                     * Define el valor de la propiedad taxRate.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setTaxRate(BigDecimal value) {
                        this.taxRate = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad docEntry.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getDocEntry() {
                        return docEntry;
                    }

                    /**
                     * Define el valor de la propiedad docEntry.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setDocEntry(Long value) {
                        this.docEntry = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad lineNumber.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getLineNumber() {
                        return lineNumber;
                    }

                    /**
                     * Define el valor de la propiedad lineNumber.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setLineNumber(Long value) {
                        this.lineNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad rowSequence.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getRowSequence() {
                        return rowSequence;
                    }

                    /**
                     * Define el valor de la propiedad rowSequence.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setRowSequence(Long value) {
                        this.rowSequence = value;
                    }

                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             *
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="SerialNumber" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="ManufacturerSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="InternalSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="ManufactureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="ReceptionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="WarrantyStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="WarrantyEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="BatchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="SystemSerialNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="BaseLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="TrackingNote" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="TrackingNoteLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                 &lt;/all>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "serialNumber"
            })
            public static class SerialNumbers {

                @XmlElement(name = "SerialNumber")
                protected List<Document.DocumentLines.DocumentLine.SerialNumbers.SerialNumber> serialNumber;

                /**
                 * Gets the value of the serialNumber property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the serialNumber property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSerialNumber().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Document.DocumentLines.DocumentLine.SerialNumbers.SerialNumber }
                 *
                 *
                 */
                public List<Document.DocumentLines.DocumentLine.SerialNumbers.SerialNumber> getSerialNumber() {
                    if (serialNumber == null) {
                        serialNumber = new ArrayList<Document.DocumentLines.DocumentLine.SerialNumbers.SerialNumber>();
                    }
                    return this.serialNumber;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 *
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;all>
                 *         &lt;element name="ManufacturerSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="InternalSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="ManufactureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="ReceptionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="WarrantyStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="WarrantyEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="BatchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="SystemSerialNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="BaseLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="TrackingNote" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="TrackingNoteLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *       &lt;/all>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class SerialNumber {

                    @XmlElement(name = "ManufacturerSerialNumber")
                    protected String manufacturerSerialNumber;
                    @XmlElement(name = "InternalSerialNumber")
                    protected String internalSerialNumber;
                    @XmlElement(name = "ExpiryDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar expiryDate;
                    @XmlElement(name = "ManufactureDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar manufactureDate;
                    @XmlElement(name = "ReceptionDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar receptionDate;
                    @XmlElement(name = "WarrantyStart")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar warrantyStart;
                    @XmlElement(name = "WarrantyEnd")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar warrantyEnd;
                    @XmlElement(name = "Location")
                    protected String location;
                    @XmlElement(name = "Notes")
                    protected String notes;
                    @XmlElement(name = "BatchID")
                    protected String batchID;
                    @XmlElement(name = "SystemSerialNumber")
                    protected Long systemSerialNumber;
                    @XmlElement(name = "BaseLineNumber")
                    protected Long baseLineNumber;
                    @XmlElement(name = "Quantity")
                    protected BigDecimal quantity;
                    @XmlElement(name = "TrackingNote")
                    protected Long trackingNote;
                    @XmlElement(name = "TrackingNoteLine")
                    protected Long trackingNoteLine;

                    /**
                     * Obtiene el valor de la propiedad manufacturerSerialNumber.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getManufacturerSerialNumber() {
                        return manufacturerSerialNumber;
                    }

                    /**
                     * Define el valor de la propiedad manufacturerSerialNumber.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setManufacturerSerialNumber(String value) {
                        this.manufacturerSerialNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad internalSerialNumber.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getInternalSerialNumber() {
                        return internalSerialNumber;
                    }

                    /**
                     * Define el valor de la propiedad internalSerialNumber.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setInternalSerialNumber(String value) {
                        this.internalSerialNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad expiryDate.
                     *
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public XMLGregorianCalendar getExpiryDate() {
                        return expiryDate;
                    }

                    /**
                     * Define el valor de la propiedad expiryDate.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public void setExpiryDate(XMLGregorianCalendar value) {
                        this.expiryDate = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad manufactureDate.
                     *
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public XMLGregorianCalendar getManufactureDate() {
                        return manufactureDate;
                    }

                    /**
                     * Define el valor de la propiedad manufactureDate.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public void setManufactureDate(XMLGregorianCalendar value) {
                        this.manufactureDate = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad receptionDate.
                     *
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public XMLGregorianCalendar getReceptionDate() {
                        return receptionDate;
                    }

                    /**
                     * Define el valor de la propiedad receptionDate.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public void setReceptionDate(XMLGregorianCalendar value) {
                        this.receptionDate = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad warrantyStart.
                     *
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public XMLGregorianCalendar getWarrantyStart() {
                        return warrantyStart;
                    }

                    /**
                     * Define el valor de la propiedad warrantyStart.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public void setWarrantyStart(XMLGregorianCalendar value) {
                        this.warrantyStart = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad warrantyEnd.
                     *
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public XMLGregorianCalendar getWarrantyEnd() {
                        return warrantyEnd;
                    }

                    /**
                     * Define el valor de la propiedad warrantyEnd.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public void setWarrantyEnd(XMLGregorianCalendar value) {
                        this.warrantyEnd = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad location.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getLocation() {
                        return location;
                    }

                    /**
                     * Define el valor de la propiedad location.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setLocation(String value) {
                        this.location = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad notes.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getNotes() {
                        return notes;
                    }

                    /**
                     * Define el valor de la propiedad notes.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setNotes(String value) {
                        this.notes = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad batchID.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getBatchID() {
                        return batchID;
                    }

                    /**
                     * Define el valor de la propiedad batchID.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setBatchID(String value) {
                        this.batchID = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad systemSerialNumber.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getSystemSerialNumber() {
                        return systemSerialNumber;
                    }

                    /**
                     * Define el valor de la propiedad systemSerialNumber.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setSystemSerialNumber(Long value) {
                        this.systemSerialNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad baseLineNumber.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getBaseLineNumber() {
                        return baseLineNumber;
                    }

                    /**
                     * Define el valor de la propiedad baseLineNumber.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setBaseLineNumber(Long value) {
                        this.baseLineNumber = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad quantity.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getQuantity() {
                        return quantity;
                    }

                    /**
                     * Define el valor de la propiedad quantity.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setQuantity(BigDecimal value) {
                        this.quantity = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad trackingNote.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getTrackingNote() {
                        return trackingNote;
                    }

                    /**
                     * Define el valor de la propiedad trackingNote.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setTrackingNote(Long value) {
                        this.trackingNote = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad trackingNoteLine.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getTrackingNoteLine() {
                        return trackingNoteLine;
                    }

                    /**
                     * Define el valor de la propiedad trackingNoteLine.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setTrackingNoteLine(Long value) {
                        this.trackingNoteLine = value;
                    }

                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             *
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="WithholdingTaxLine" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="WTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="WTAmountSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="WTAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="WTAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="WithholdingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="TaxableAmountinSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="TaxableAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="TaxableAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="RoundingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="Criteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="BaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="AppliedWTAmountSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="AppliedWTAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="AppliedWTAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="GLAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="BaseDocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="BaseDocLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="BaseDocType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="BaseDocumentReference" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="Status" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;enumeration value="bost_Open"/>
             *                         &lt;enumeration value="bost_Close"/>
             *                         &lt;enumeration value="bost_Paid"/>
             *                         &lt;enumeration value="bost_Delivered"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="TargetAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="TargetDocumentType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *                   &lt;element name="CSTCodeIncoming" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="CSTCodeOutgoing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="U_Base_ML" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="U_Base_MS" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="U_Base_ME" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="U_Tarifa" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="U_Fuente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="U_Ret_ML" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="U_Ret_MS" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                   &lt;element name="U_Ret_ME" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
             *                 &lt;/all>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "withholdingTaxLine"
            })
            public static class WithholdingTaxLines {

                @XmlElement(name = "WithholdingTaxLine")
                protected List<Document.DocumentLines.DocumentLine.WithholdingTaxLines.WithholdingTaxLine> withholdingTaxLine;

                /**
                 * Gets the value of the withholdingTaxLine property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the withholdingTaxLine property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getWithholdingTaxLine().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Document.DocumentLines.DocumentLine.WithholdingTaxLines.WithholdingTaxLine }
                 *
                 *
                 */
                public List<Document.DocumentLines.DocumentLine.WithholdingTaxLines.WithholdingTaxLine> getWithholdingTaxLine() {
                    if (withholdingTaxLine == null) {
                        withholdingTaxLine = new ArrayList<Document.DocumentLines.DocumentLine.WithholdingTaxLines.WithholdingTaxLine>();
                    }
                    return this.withholdingTaxLine;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 *
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;all>
                 *         &lt;element name="WTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="WTAmountSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="WTAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="WTAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="WithholdingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="TaxableAmountinSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="TaxableAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="TaxableAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="RoundingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="Criteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="BaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="AppliedWTAmountSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="AppliedWTAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="AppliedWTAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="GLAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="BaseDocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="BaseDocLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="BaseDocType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="BaseDocumentReference" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="Status" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;enumeration value="bost_Open"/>
                 *               &lt;enumeration value="bost_Close"/>
                 *               &lt;enumeration value="bost_Paid"/>
                 *               &lt;enumeration value="bost_Delivered"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="TargetAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="TargetDocumentType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
                 *         &lt;element name="CSTCodeIncoming" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="CSTCodeOutgoing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="U_Base_ML" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="U_Base_MS" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="U_Base_ME" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="U_Tarifa" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="U_Fuente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="U_Ret_ML" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="U_Ret_MS" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *         &lt;element name="U_Ret_ME" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
                 *       &lt;/all>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class WithholdingTaxLine {

                    @XmlElement(name = "WTCode")
                    protected String wtCode;
                    @XmlElement(name = "WTAmountSys")
                    protected BigDecimal wtAmountSys;
                    @XmlElement(name = "WTAmountFC")
                    protected BigDecimal wtAmountFC;
                    @XmlElement(name = "WTAmount")
                    protected BigDecimal wtAmount;
                    @XmlElement(name = "WithholdingType")
                    protected String withholdingType;
                    @XmlElement(name = "TaxableAmountinSys")
                    protected BigDecimal taxableAmountinSys;
                    @XmlElement(name = "TaxableAmountFC")
                    protected BigDecimal taxableAmountFC;
                    @XmlElement(name = "TaxableAmount")
                    protected BigDecimal taxableAmount;
                    @XmlElement(name = "RoundingType")
                    protected String roundingType;
                    @XmlElement(name = "Rate")
                    protected BigDecimal rate;
                    @XmlElement(name = "Criteria")
                    protected String criteria;
                    @XmlElement(name = "Category")
                    protected String category;
                    @XmlElement(name = "BaseType")
                    protected String baseType;
                    @XmlElement(name = "AppliedWTAmountSys")
                    protected BigDecimal appliedWTAmountSys;
                    @XmlElement(name = "AppliedWTAmountFC")
                    protected BigDecimal appliedWTAmountFC;
                    @XmlElement(name = "AppliedWTAmount")
                    protected BigDecimal appliedWTAmount;
                    @XmlElement(name = "GLAccount")
                    protected String glAccount;
                    @XmlElement(name = "LineNum")
                    protected Long lineNum;
                    @XmlElement(name = "BaseDocEntry")
                    protected Long baseDocEntry;
                    @XmlElement(name = "BaseDocLine")
                    protected Long baseDocLine;
                    @XmlElement(name = "BaseDocType")
                    protected Long baseDocType;
                    @XmlElement(name = "BaseDocumentReference")
                    protected Long baseDocumentReference;
                    @XmlElement(name = "Status")
                    protected String status;
                    @XmlElement(name = "TargetAbsEntry")
                    protected Long targetAbsEntry;
                    @XmlElement(name = "TargetDocumentType")
                    protected Long targetDocumentType;
                    @XmlElement(name = "CSTCodeIncoming")
                    protected String cstCodeIncoming;
                    @XmlElement(name = "CSTCodeOutgoing")
                    protected String cstCodeOutgoing;
                    @XmlElement(name = "U_Base_ML")
                    protected BigDecimal uBaseML;
                    @XmlElement(name = "U_Base_MS")
                    protected BigDecimal uBaseMS;
                    @XmlElement(name = "U_Base_ME")
                    protected BigDecimal uBaseME;
                    @XmlElement(name = "U_Tarifa")
                    protected BigDecimal uTarifa;
                    @XmlElement(name = "U_Fuente")
                    protected String uFuente;
                    @XmlElement(name = "U_Ret_ML")
                    protected BigDecimal uRetML;
                    @XmlElement(name = "U_Ret_MS")
                    protected BigDecimal uRetMS;
                    @XmlElement(name = "U_Ret_ME")
                    protected BigDecimal uRetME;

                    /**
                     * Obtiene el valor de la propiedad wtCode.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getWTCode() {
                        return wtCode;
                    }

                    /**
                     * Define el valor de la propiedad wtCode.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setWTCode(String value) {
                        this.wtCode = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad wtAmountSys.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getWTAmountSys() {
                        return wtAmountSys;
                    }

                    /**
                     * Define el valor de la propiedad wtAmountSys.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setWTAmountSys(BigDecimal value) {
                        this.wtAmountSys = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad wtAmountFC.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getWTAmountFC() {
                        return wtAmountFC;
                    }

                    /**
                     * Define el valor de la propiedad wtAmountFC.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setWTAmountFC(BigDecimal value) {
                        this.wtAmountFC = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad wtAmount.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getWTAmount() {
                        return wtAmount;
                    }

                    /**
                     * Define el valor de la propiedad wtAmount.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setWTAmount(BigDecimal value) {
                        this.wtAmount = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad withholdingType.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getWithholdingType() {
                        return withholdingType;
                    }

                    /**
                     * Define el valor de la propiedad withholdingType.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setWithholdingType(String value) {
                        this.withholdingType = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxableAmountinSys.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getTaxableAmountinSys() {
                        return taxableAmountinSys;
                    }

                    /**
                     * Define el valor de la propiedad taxableAmountinSys.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setTaxableAmountinSys(BigDecimal value) {
                        this.taxableAmountinSys = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxableAmountFC.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getTaxableAmountFC() {
                        return taxableAmountFC;
                    }

                    /**
                     * Define el valor de la propiedad taxableAmountFC.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setTaxableAmountFC(BigDecimal value) {
                        this.taxableAmountFC = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxableAmount.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getTaxableAmount() {
                        return taxableAmount;
                    }

                    /**
                     * Define el valor de la propiedad taxableAmount.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setTaxableAmount(BigDecimal value) {
                        this.taxableAmount = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad roundingType.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getRoundingType() {
                        return roundingType;
                    }

                    /**
                     * Define el valor de la propiedad roundingType.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setRoundingType(String value) {
                        this.roundingType = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad rate.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getRate() {
                        return rate;
                    }

                    /**
                     * Define el valor de la propiedad rate.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setRate(BigDecimal value) {
                        this.rate = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad criteria.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getCriteria() {
                        return criteria;
                    }

                    /**
                     * Define el valor de la propiedad criteria.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setCriteria(String value) {
                        this.criteria = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad category.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getCategory() {
                        return category;
                    }

                    /**
                     * Define el valor de la propiedad category.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setCategory(String value) {
                        this.category = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad baseType.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getBaseType() {
                        return baseType;
                    }

                    /**
                     * Define el valor de la propiedad baseType.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setBaseType(String value) {
                        this.baseType = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad appliedWTAmountSys.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getAppliedWTAmountSys() {
                        return appliedWTAmountSys;
                    }

                    /**
                     * Define el valor de la propiedad appliedWTAmountSys.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setAppliedWTAmountSys(BigDecimal value) {
                        this.appliedWTAmountSys = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad appliedWTAmountFC.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getAppliedWTAmountFC() {
                        return appliedWTAmountFC;
                    }

                    /**
                     * Define el valor de la propiedad appliedWTAmountFC.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setAppliedWTAmountFC(BigDecimal value) {
                        this.appliedWTAmountFC = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad appliedWTAmount.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getAppliedWTAmount() {
                        return appliedWTAmount;
                    }

                    /**
                     * Define el valor de la propiedad appliedWTAmount.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setAppliedWTAmount(BigDecimal value) {
                        this.appliedWTAmount = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad glAccount.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getGLAccount() {
                        return glAccount;
                    }

                    /**
                     * Define el valor de la propiedad glAccount.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setGLAccount(String value) {
                        this.glAccount = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad lineNum.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getLineNum() {
                        return lineNum;
                    }

                    /**
                     * Define el valor de la propiedad lineNum.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setLineNum(Long value) {
                        this.lineNum = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad baseDocEntry.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getBaseDocEntry() {
                        return baseDocEntry;
                    }

                    /**
                     * Define el valor de la propiedad baseDocEntry.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setBaseDocEntry(Long value) {
                        this.baseDocEntry = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad baseDocLine.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getBaseDocLine() {
                        return baseDocLine;
                    }

                    /**
                     * Define el valor de la propiedad baseDocLine.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setBaseDocLine(Long value) {
                        this.baseDocLine = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad baseDocType.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getBaseDocType() {
                        return baseDocType;
                    }

                    /**
                     * Define el valor de la propiedad baseDocType.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setBaseDocType(Long value) {
                        this.baseDocType = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad baseDocumentReference.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getBaseDocumentReference() {
                        return baseDocumentReference;
                    }

                    /**
                     * Define el valor de la propiedad baseDocumentReference.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setBaseDocumentReference(Long value) {
                        this.baseDocumentReference = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad status.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getStatus() {
                        return status;
                    }

                    /**
                     * Define el valor de la propiedad status.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setStatus(String value) {
                        this.status = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad targetAbsEntry.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getTargetAbsEntry() {
                        return targetAbsEntry;
                    }

                    /**
                     * Define el valor de la propiedad targetAbsEntry.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setTargetAbsEntry(Long value) {
                        this.targetAbsEntry = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad targetDocumentType.
                     *
                     * @return
                     *     possible object is
                     *     {@link Long }
                     *
                     */
                    public Long getTargetDocumentType() {
                        return targetDocumentType;
                    }

                    /**
                     * Define el valor de la propiedad targetDocumentType.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Long }
                     *
                     */
                    public void setTargetDocumentType(Long value) {
                        this.targetDocumentType = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad cstCodeIncoming.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getCSTCodeIncoming() {
                        return cstCodeIncoming;
                    }

                    /**
                     * Define el valor de la propiedad cstCodeIncoming.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setCSTCodeIncoming(String value) {
                        this.cstCodeIncoming = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad cstCodeOutgoing.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getCSTCodeOutgoing() {
                        return cstCodeOutgoing;
                    }

                    /**
                     * Define el valor de la propiedad cstCodeOutgoing.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setCSTCodeOutgoing(String value) {
                        this.cstCodeOutgoing = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad uBaseML.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getUBaseML() {
                        return uBaseML;
                    }

                    /**
                     * Define el valor de la propiedad uBaseML.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setUBaseML(BigDecimal value) {
                        this.uBaseML = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad uBaseMS.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getUBaseMS() {
                        return uBaseMS;
                    }

                    /**
                     * Define el valor de la propiedad uBaseMS.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setUBaseMS(BigDecimal value) {
                        this.uBaseMS = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad uBaseME.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getUBaseME() {
                        return uBaseME;
                    }

                    /**
                     * Define el valor de la propiedad uBaseME.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setUBaseME(BigDecimal value) {
                        this.uBaseME = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad uTarifa.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getUTarifa() {
                        return uTarifa;
                    }

                    /**
                     * Define el valor de la propiedad uTarifa.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setUTarifa(BigDecimal value) {
                        this.uTarifa = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad uFuente.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getUFuente() {
                        return uFuente;
                    }

                    /**
                     * Define el valor de la propiedad uFuente.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setUFuente(String value) {
                        this.uFuente = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad uRetML.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getURetML() {
                        return uRetML;
                    }

                    /**
                     * Define el valor de la propiedad uRetML.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setURetML(BigDecimal value) {
                        this.uRetML = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad uRetMS.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getURetMS() {
                        return uRetMS;
                    }

                    /**
                     * Define el valor de la propiedad uRetMS.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setURetMS(BigDecimal value) {
                        this.uRetMS = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad uRetME.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getURetME() {
                        return uRetME;
                    }

                    /**
                     * Define el valor de la propiedad uRetME.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setURetME(BigDecimal value) {
                        this.uRetME = value;
                    }

                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DocumentSpecialLine" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="AfterLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="LineType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="dslt_Text"/>
     *                         &lt;enumeration value="dslt_Subtotal"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Subtotal" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="LineText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SubtotalFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="SubtotalSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="TaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="TaxAmountSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="Freight1" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="Freight1FC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="Freight1SC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="Freight2" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="Freight2FC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="Freight2SC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="Freight3" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="Freight3FC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="Freight3SC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="GrossTotal" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="GrossTotalFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="GrossTotalSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "documentSpecialLine"
    })
    public static class DocumentSpecialLines {

        @XmlElement(name = "DocumentSpecialLine")
        protected List<Document.DocumentSpecialLines.DocumentSpecialLine> documentSpecialLine;

        /**
         * Gets the value of the documentSpecialLine property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documentSpecialLine property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumentSpecialLine().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Document.DocumentSpecialLines.DocumentSpecialLine }
         *
         *
         */
        public List<Document.DocumentSpecialLines.DocumentSpecialLine> getDocumentSpecialLine() {
            if (documentSpecialLine == null) {
                documentSpecialLine = new ArrayList<Document.DocumentSpecialLines.DocumentSpecialLine>();
            }
            return this.documentSpecialLine;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="AfterLineNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="LineType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="dslt_Text"/>
         *               &lt;enumeration value="dslt_Subtotal"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Subtotal" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="LineText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SubtotalFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="SubtotalSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="TaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="TaxAmountSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="Freight1" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="Freight1FC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="Freight1SC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="Freight2" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="Freight2FC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="Freight2SC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="Freight3" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="Freight3FC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="Freight3SC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="GrossTotal" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="GrossTotalFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="GrossTotalSC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class DocumentSpecialLine {

            @XmlElement(name = "LineNum")
            protected Long lineNum;
            @XmlElement(name = "AfterLineNumber")
            protected Long afterLineNumber;
            @XmlElement(name = "OrderNumber")
            protected Long orderNumber;
            @XmlElement(name = "LineType")
            protected String lineType;
            @XmlElement(name = "Subtotal")
            protected BigDecimal subtotal;
            @XmlElement(name = "LineText")
            protected String lineText;
            @XmlElement(name = "SubtotalFC")
            protected BigDecimal subtotalFC;
            @XmlElement(name = "SubtotalSC")
            protected BigDecimal subtotalSC;
            @XmlElement(name = "TaxAmount")
            protected BigDecimal taxAmount;
            @XmlElement(name = "TaxAmountFC")
            protected BigDecimal taxAmountFC;
            @XmlElement(name = "TaxAmountSC")
            protected BigDecimal taxAmountSC;
            @XmlElement(name = "Freight1")
            protected BigDecimal freight1;
            @XmlElement(name = "Freight1FC")
            protected BigDecimal freight1FC;
            @XmlElement(name = "Freight1SC")
            protected BigDecimal freight1SC;
            @XmlElement(name = "Freight2")
            protected BigDecimal freight2;
            @XmlElement(name = "Freight2FC")
            protected BigDecimal freight2FC;
            @XmlElement(name = "Freight2SC")
            protected BigDecimal freight2SC;
            @XmlElement(name = "Freight3")
            protected BigDecimal freight3;
            @XmlElement(name = "Freight3FC")
            protected BigDecimal freight3FC;
            @XmlElement(name = "Freight3SC")
            protected BigDecimal freight3SC;
            @XmlElement(name = "GrossTotal")
            protected BigDecimal grossTotal;
            @XmlElement(name = "GrossTotalFC")
            protected BigDecimal grossTotalFC;
            @XmlElement(name = "GrossTotalSC")
            protected BigDecimal grossTotalSC;

            /**
             * Obtiene el valor de la propiedad lineNum.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getLineNum() {
                return lineNum;
            }

            /**
             * Define el valor de la propiedad lineNum.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setLineNum(Long value) {
                this.lineNum = value;
            }

            /**
             * Obtiene el valor de la propiedad afterLineNumber.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getAfterLineNumber() {
                return afterLineNumber;
            }

            /**
             * Define el valor de la propiedad afterLineNumber.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setAfterLineNumber(Long value) {
                this.afterLineNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad orderNumber.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getOrderNumber() {
                return orderNumber;
            }

            /**
             * Define el valor de la propiedad orderNumber.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setOrderNumber(Long value) {
                this.orderNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad lineType.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getLineType() {
                return lineType;
            }

            /**
             * Define el valor de la propiedad lineType.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setLineType(String value) {
                this.lineType = value;
            }

            /**
             * Obtiene el valor de la propiedad subtotal.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getSubtotal() {
                return subtotal;
            }

            /**
             * Define el valor de la propiedad subtotal.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setSubtotal(BigDecimal value) {
                this.subtotal = value;
            }

            /**
             * Obtiene el valor de la propiedad lineText.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getLineText() {
                return lineText;
            }

            /**
             * Define el valor de la propiedad lineText.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setLineText(String value) {
                this.lineText = value;
            }

            /**
             * Obtiene el valor de la propiedad subtotalFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getSubtotalFC() {
                return subtotalFC;
            }

            /**
             * Define el valor de la propiedad subtotalFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setSubtotalFC(BigDecimal value) {
                this.subtotalFC = value;
            }

            /**
             * Obtiene el valor de la propiedad subtotalSC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getSubtotalSC() {
                return subtotalSC;
            }

            /**
             * Define el valor de la propiedad subtotalSC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setSubtotalSC(BigDecimal value) {
                this.subtotalSC = value;
            }

            /**
             * Obtiene el valor de la propiedad taxAmount.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTaxAmount() {
                return taxAmount;
            }

            /**
             * Define el valor de la propiedad taxAmount.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTaxAmount(BigDecimal value) {
                this.taxAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad taxAmountFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTaxAmountFC() {
                return taxAmountFC;
            }

            /**
             * Define el valor de la propiedad taxAmountFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTaxAmountFC(BigDecimal value) {
                this.taxAmountFC = value;
            }

            /**
             * Obtiene el valor de la propiedad taxAmountSC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTaxAmountSC() {
                return taxAmountSC;
            }

            /**
             * Define el valor de la propiedad taxAmountSC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTaxAmountSC(BigDecimal value) {
                this.taxAmountSC = value;
            }

            /**
             * Obtiene el valor de la propiedad freight1.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getFreight1() {
                return freight1;
            }

            /**
             * Define el valor de la propiedad freight1.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setFreight1(BigDecimal value) {
                this.freight1 = value;
            }

            /**
             * Obtiene el valor de la propiedad freight1FC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getFreight1FC() {
                return freight1FC;
            }

            /**
             * Define el valor de la propiedad freight1FC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setFreight1FC(BigDecimal value) {
                this.freight1FC = value;
            }

            /**
             * Obtiene el valor de la propiedad freight1SC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getFreight1SC() {
                return freight1SC;
            }

            /**
             * Define el valor de la propiedad freight1SC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setFreight1SC(BigDecimal value) {
                this.freight1SC = value;
            }

            /**
             * Obtiene el valor de la propiedad freight2.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getFreight2() {
                return freight2;
            }

            /**
             * Define el valor de la propiedad freight2.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setFreight2(BigDecimal value) {
                this.freight2 = value;
            }

            /**
             * Obtiene el valor de la propiedad freight2FC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getFreight2FC() {
                return freight2FC;
            }

            /**
             * Define el valor de la propiedad freight2FC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setFreight2FC(BigDecimal value) {
                this.freight2FC = value;
            }

            /**
             * Obtiene el valor de la propiedad freight2SC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getFreight2SC() {
                return freight2SC;
            }

            /**
             * Define el valor de la propiedad freight2SC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setFreight2SC(BigDecimal value) {
                this.freight2SC = value;
            }

            /**
             * Obtiene el valor de la propiedad freight3.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getFreight3() {
                return freight3;
            }

            /**
             * Define el valor de la propiedad freight3.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setFreight3(BigDecimal value) {
                this.freight3 = value;
            }

            /**
             * Obtiene el valor de la propiedad freight3FC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getFreight3FC() {
                return freight3FC;
            }

            /**
             * Define el valor de la propiedad freight3FC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setFreight3FC(BigDecimal value) {
                this.freight3FC = value;
            }

            /**
             * Obtiene el valor de la propiedad freight3SC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getFreight3SC() {
                return freight3SC;
            }

            /**
             * Define el valor de la propiedad freight3SC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setFreight3SC(BigDecimal value) {
                this.freight3SC = value;
            }

            /**
             * Obtiene el valor de la propiedad grossTotal.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getGrossTotal() {
                return grossTotal;
            }

            /**
             * Define el valor de la propiedad grossTotal.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setGrossTotal(BigDecimal value) {
                this.grossTotal = value;
            }

            /**
             * Obtiene el valor de la propiedad grossTotalFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getGrossTotalFC() {
                return grossTotalFC;
            }

            /**
             * Define el valor de la propiedad grossTotalFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setGrossTotalFC(BigDecimal value) {
                this.grossTotalFC = value;
            }

            /**
             * Obtiene el valor de la propiedad grossTotalSC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getGrossTotalSC() {
                return grossTotalSC;
            }

            /**
             * Define el valor de la propiedad grossTotalSC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setGrossTotalSC(BigDecimal value) {
                this.grossTotalSC = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ElectronicProtocol" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="ProtocolCode" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="edpc_Invalid"/>
     *                         &lt;enumeration value="edpc_GEN"/>
     *                         &lt;enumeration value="edpc_EET"/>
     *                         &lt;enumeration value="edpc_CFDI"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="GenerationType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="edgt_NotRelevant"/>
     *                         &lt;enumeration value="edgt_Generate"/>
     *                         &lt;enumeration value="edgt_GenerateLater"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="MappingID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="TestingMode" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="tNO"/>
     *                         &lt;enumeration value="tYES"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "electronicProtocol"
    })
    public static class ElectronicProtocols {

        @XmlElement(name = "ElectronicProtocol")
        protected List<Document.ElectronicProtocols.ElectronicProtocol> electronicProtocol;

        /**
         * Gets the value of the electronicProtocol property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the electronicProtocol property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getElectronicProtocol().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Document.ElectronicProtocols.ElectronicProtocol }
         *
         *
         */
        public List<Document.ElectronicProtocols.ElectronicProtocol> getElectronicProtocol() {
            if (electronicProtocol == null) {
                electronicProtocol = new ArrayList<Document.ElectronicProtocols.ElectronicProtocol>();
            }
            return this.electronicProtocol;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="ProtocolCode" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="edpc_Invalid"/>
         *               &lt;enumeration value="edpc_GEN"/>
         *               &lt;enumeration value="edpc_EET"/>
         *               &lt;enumeration value="edpc_CFDI"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="GenerationType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="edgt_NotRelevant"/>
         *               &lt;enumeration value="edgt_Generate"/>
         *               &lt;enumeration value="edgt_GenerateLater"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="MappingID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="TestingMode" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="tNO"/>
         *               &lt;enumeration value="tYES"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class ElectronicProtocol {

            @XmlElement(name = "ProtocolCode")
            protected String protocolCode;
            @XmlElement(name = "GenerationType")
            protected String generationType;
            @XmlElement(name = "MappingID")
            protected Long mappingID;
            @XmlElement(name = "TestingMode")
            protected String testingMode;

            /**
             * Obtiene el valor de la propiedad protocolCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getProtocolCode() {
                return protocolCode;
            }

            /**
             * Define el valor de la propiedad protocolCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setProtocolCode(String value) {
                this.protocolCode = value;
            }

            /**
             * Obtiene el valor de la propiedad generationType.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getGenerationType() {
                return generationType;
            }

            /**
             * Define el valor de la propiedad generationType.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setGenerationType(String value) {
                this.generationType = value;
            }

            /**
             * Obtiene el valor de la propiedad mappingID.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getMappingID() {
                return mappingID;
            }

            /**
             * Define el valor de la propiedad mappingID.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setMappingID(Long value) {
                this.mappingID = value;
            }

            /**
             * Obtiene el valor de la propiedad testingMode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getTestingMode() {
                return testingMode;
            }

            /**
             * Define el valor de la propiedad testingMode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setTestingMode(String value) {
                this.testingMode = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="TaxId0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TaxId1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TaxId2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TaxId3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TaxId4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TaxId5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TaxId6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TaxId7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TaxId8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TaxId9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Incoterms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Vehicle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="VehicleState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NFRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PackQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="PackDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ShipUnitNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="NetWeight" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *         &lt;element name="GrossWeight" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *         &lt;element name="StreetS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BlockS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BuildingS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CityS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ZipCodeS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CountyS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="StateS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CountryS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="StreetB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BlockB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BuildingB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CityB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ZipCodeB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CountyB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="StateB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CountryB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ImportOrExport" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="tNO"/>
     *               &lt;enumeration value="tYES"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="MainUsage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="GlobalLocationNumberS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GlobalLocationNumberB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TaxId12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TaxId13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillOfEntryNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillOfEntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="OriginalBillOfEntryNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OriginalBillOfEntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="ImportOrExportType" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="et_IpmortsOrExports"/>
     *               &lt;enumeration value="et_SEZ_Developer"/>
     *               &lt;enumeration value="et_SEZ_Unit"/>
     *               &lt;enumeration value="et_Deemed_ImportsOrExports"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="PortCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class TaxExtension {

        @XmlElement(name = "TaxId0")
        protected String taxId0;
        @XmlElement(name = "TaxId1")
        protected String taxId1;
        @XmlElement(name = "TaxId2")
        protected String taxId2;
        @XmlElement(name = "TaxId3")
        protected String taxId3;
        @XmlElement(name = "TaxId4")
        protected String taxId4;
        @XmlElement(name = "TaxId5")
        protected String taxId5;
        @XmlElement(name = "TaxId6")
        protected String taxId6;
        @XmlElement(name = "TaxId7")
        protected String taxId7;
        @XmlElement(name = "TaxId8")
        protected String taxId8;
        @XmlElement(name = "TaxId9")
        protected String taxId9;
        @XmlElement(name = "State")
        protected String state;
        @XmlElement(name = "County")
        protected String county;
        @XmlElement(name = "Incoterms")
        protected String incoterms;
        @XmlElement(name = "Vehicle")
        protected String vehicle;
        @XmlElement(name = "VehicleState")
        protected String vehicleState;
        @XmlElement(name = "NFRef")
        protected String nfRef;
        @XmlElement(name = "Carrier")
        protected String carrier;
        @XmlElement(name = "PackQuantity")
        protected Long packQuantity;
        @XmlElement(name = "PackDescription")
        protected String packDescription;
        @XmlElement(name = "Brand")
        protected String brand;
        @XmlElement(name = "ShipUnitNo")
        protected Long shipUnitNo;
        @XmlElement(name = "NetWeight")
        protected BigDecimal netWeight;
        @XmlElement(name = "GrossWeight")
        protected BigDecimal grossWeight;
        @XmlElement(name = "StreetS")
        protected String streetS;
        @XmlElement(name = "BlockS")
        protected String blockS;
        @XmlElement(name = "BuildingS")
        protected String buildingS;
        @XmlElement(name = "CityS")
        protected String cityS;
        @XmlElement(name = "ZipCodeS")
        protected String zipCodeS;
        @XmlElement(name = "CountyS")
        protected String countyS;
        @XmlElement(name = "StateS")
        protected String stateS;
        @XmlElement(name = "CountryS")
        protected String countryS;
        @XmlElement(name = "StreetB")
        protected String streetB;
        @XmlElement(name = "BlockB")
        protected String blockB;
        @XmlElement(name = "BuildingB")
        protected String buildingB;
        @XmlElement(name = "CityB")
        protected String cityB;
        @XmlElement(name = "ZipCodeB")
        protected String zipCodeB;
        @XmlElement(name = "CountyB")
        protected String countyB;
        @XmlElement(name = "StateB")
        protected String stateB;
        @XmlElement(name = "CountryB")
        protected String countryB;
        @XmlElement(name = "ImportOrExport")
        protected String importOrExport;
        @XmlElement(name = "MainUsage")
        protected Long mainUsage;
        @XmlElement(name = "GlobalLocationNumberS")
        protected String globalLocationNumberS;
        @XmlElement(name = "GlobalLocationNumberB")
        protected String globalLocationNumberB;
        @XmlElement(name = "TaxId12")
        protected String taxId12;
        @XmlElement(name = "TaxId13")
        protected String taxId13;
        @XmlElement(name = "BillOfEntryNo")
        protected String billOfEntryNo;
        @XmlElement(name = "BillOfEntryDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar billOfEntryDate;
        @XmlElement(name = "OriginalBillOfEntryNo")
        protected String originalBillOfEntryNo;
        @XmlElement(name = "OriginalBillOfEntryDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar originalBillOfEntryDate;
        @XmlElement(name = "ImportOrExportType")
        protected String importOrExportType;
        @XmlElement(name = "PortCode")
        protected String portCode;

        /**
         * Obtiene el valor de la propiedad taxId0.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTaxId0() {
            return taxId0;
        }

        /**
         * Define el valor de la propiedad taxId0.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTaxId0(String value) {
            this.taxId0 = value;
        }

        /**
         * Obtiene el valor de la propiedad taxId1.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTaxId1() {
            return taxId1;
        }

        /**
         * Define el valor de la propiedad taxId1.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTaxId1(String value) {
            this.taxId1 = value;
        }

        /**
         * Obtiene el valor de la propiedad taxId2.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTaxId2() {
            return taxId2;
        }

        /**
         * Define el valor de la propiedad taxId2.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTaxId2(String value) {
            this.taxId2 = value;
        }

        /**
         * Obtiene el valor de la propiedad taxId3.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTaxId3() {
            return taxId3;
        }

        /**
         * Define el valor de la propiedad taxId3.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTaxId3(String value) {
            this.taxId3 = value;
        }

        /**
         * Obtiene el valor de la propiedad taxId4.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTaxId4() {
            return taxId4;
        }

        /**
         * Define el valor de la propiedad taxId4.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTaxId4(String value) {
            this.taxId4 = value;
        }

        /**
         * Obtiene el valor de la propiedad taxId5.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTaxId5() {
            return taxId5;
        }

        /**
         * Define el valor de la propiedad taxId5.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTaxId5(String value) {
            this.taxId5 = value;
        }

        /**
         * Obtiene el valor de la propiedad taxId6.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTaxId6() {
            return taxId6;
        }

        /**
         * Define el valor de la propiedad taxId6.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTaxId6(String value) {
            this.taxId6 = value;
        }

        /**
         * Obtiene el valor de la propiedad taxId7.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTaxId7() {
            return taxId7;
        }

        /**
         * Define el valor de la propiedad taxId7.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTaxId7(String value) {
            this.taxId7 = value;
        }

        /**
         * Obtiene el valor de la propiedad taxId8.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTaxId8() {
            return taxId8;
        }

        /**
         * Define el valor de la propiedad taxId8.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTaxId8(String value) {
            this.taxId8 = value;
        }

        /**
         * Obtiene el valor de la propiedad taxId9.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTaxId9() {
            return taxId9;
        }

        /**
         * Define el valor de la propiedad taxId9.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTaxId9(String value) {
            this.taxId9 = value;
        }

        /**
         * Obtiene el valor de la propiedad state.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getState() {
            return state;
        }

        /**
         * Define el valor de la propiedad state.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setState(String value) {
            this.state = value;
        }

        /**
         * Obtiene el valor de la propiedad county.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCounty() {
            return county;
        }

        /**
         * Define el valor de la propiedad county.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCounty(String value) {
            this.county = value;
        }

        /**
         * Obtiene el valor de la propiedad incoterms.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getIncoterms() {
            return incoterms;
        }

        /**
         * Define el valor de la propiedad incoterms.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setIncoterms(String value) {
            this.incoterms = value;
        }

        /**
         * Obtiene el valor de la propiedad vehicle.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getVehicle() {
            return vehicle;
        }

        /**
         * Define el valor de la propiedad vehicle.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setVehicle(String value) {
            this.vehicle = value;
        }

        /**
         * Obtiene el valor de la propiedad vehicleState.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getVehicleState() {
            return vehicleState;
        }

        /**
         * Define el valor de la propiedad vehicleState.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setVehicleState(String value) {
            this.vehicleState = value;
        }

        /**
         * Obtiene el valor de la propiedad nfRef.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNFRef() {
            return nfRef;
        }

        /**
         * Define el valor de la propiedad nfRef.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNFRef(String value) {
            this.nfRef = value;
        }

        /**
         * Obtiene el valor de la propiedad carrier.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCarrier() {
            return carrier;
        }

        /**
         * Define el valor de la propiedad carrier.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCarrier(String value) {
            this.carrier = value;
        }

        /**
         * Obtiene el valor de la propiedad packQuantity.
         *
         * @return
         *     possible object is
         *     {@link Long }
         *
         */
        public Long getPackQuantity() {
            return packQuantity;
        }

        /**
         * Define el valor de la propiedad packQuantity.
         *
         * @param value
         *     allowed object is
         *     {@link Long }
         *
         */
        public void setPackQuantity(Long value) {
            this.packQuantity = value;
        }

        /**
         * Obtiene el valor de la propiedad packDescription.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPackDescription() {
            return packDescription;
        }

        /**
         * Define el valor de la propiedad packDescription.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPackDescription(String value) {
            this.packDescription = value;
        }

        /**
         * Obtiene el valor de la propiedad brand.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getBrand() {
            return brand;
        }

        /**
         * Define el valor de la propiedad brand.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setBrand(String value) {
            this.brand = value;
        }

        /**
         * Obtiene el valor de la propiedad shipUnitNo.
         *
         * @return
         *     possible object is
         *     {@link Long }
         *
         */
        public Long getShipUnitNo() {
            return shipUnitNo;
        }

        /**
         * Define el valor de la propiedad shipUnitNo.
         *
         * @param value
         *     allowed object is
         *     {@link Long }
         *
         */
        public void setShipUnitNo(Long value) {
            this.shipUnitNo = value;
        }

        /**
         * Obtiene el valor de la propiedad netWeight.
         *
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *
         */
        public BigDecimal getNetWeight() {
            return netWeight;
        }

        /**
         * Define el valor de la propiedad netWeight.
         *
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *
         */
        public void setNetWeight(BigDecimal value) {
            this.netWeight = value;
        }

        /**
         * Obtiene el valor de la propiedad grossWeight.
         *
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *
         */
        public BigDecimal getGrossWeight() {
            return grossWeight;
        }

        /**
         * Define el valor de la propiedad grossWeight.
         *
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *
         */
        public void setGrossWeight(BigDecimal value) {
            this.grossWeight = value;
        }

        /**
         * Obtiene el valor de la propiedad streetS.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getStreetS() {
            return streetS;
        }

        /**
         * Define el valor de la propiedad streetS.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setStreetS(String value) {
            this.streetS = value;
        }

        /**
         * Obtiene el valor de la propiedad blockS.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getBlockS() {
            return blockS;
        }

        /**
         * Define el valor de la propiedad blockS.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setBlockS(String value) {
            this.blockS = value;
        }

        /**
         * Obtiene el valor de la propiedad buildingS.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getBuildingS() {
            return buildingS;
        }

        /**
         * Define el valor de la propiedad buildingS.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setBuildingS(String value) {
            this.buildingS = value;
        }

        /**
         * Obtiene el valor de la propiedad cityS.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCityS() {
            return cityS;
        }

        /**
         * Define el valor de la propiedad cityS.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCityS(String value) {
            this.cityS = value;
        }

        /**
         * Obtiene el valor de la propiedad zipCodeS.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getZipCodeS() {
            return zipCodeS;
        }

        /**
         * Define el valor de la propiedad zipCodeS.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setZipCodeS(String value) {
            this.zipCodeS = value;
        }

        /**
         * Obtiene el valor de la propiedad countyS.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCountyS() {
            return countyS;
        }

        /**
         * Define el valor de la propiedad countyS.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCountyS(String value) {
            this.countyS = value;
        }

        /**
         * Obtiene el valor de la propiedad stateS.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getStateS() {
            return stateS;
        }

        /**
         * Define el valor de la propiedad stateS.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setStateS(String value) {
            this.stateS = value;
        }

        /**
         * Obtiene el valor de la propiedad countryS.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCountryS() {
            return countryS;
        }

        /**
         * Define el valor de la propiedad countryS.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCountryS(String value) {
            this.countryS = value;
        }

        /**
         * Obtiene el valor de la propiedad streetB.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getStreetB() {
            return streetB;
        }

        /**
         * Define el valor de la propiedad streetB.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setStreetB(String value) {
            this.streetB = value;
        }

        /**
         * Obtiene el valor de la propiedad blockB.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getBlockB() {
            return blockB;
        }

        /**
         * Define el valor de la propiedad blockB.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setBlockB(String value) {
            this.blockB = value;
        }

        /**
         * Obtiene el valor de la propiedad buildingB.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getBuildingB() {
            return buildingB;
        }

        /**
         * Define el valor de la propiedad buildingB.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setBuildingB(String value) {
            this.buildingB = value;
        }

        /**
         * Obtiene el valor de la propiedad cityB.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCityB() {
            return cityB;
        }

        /**
         * Define el valor de la propiedad cityB.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCityB(String value) {
            this.cityB = value;
        }

        /**
         * Obtiene el valor de la propiedad zipCodeB.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getZipCodeB() {
            return zipCodeB;
        }

        /**
         * Define el valor de la propiedad zipCodeB.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setZipCodeB(String value) {
            this.zipCodeB = value;
        }

        /**
         * Obtiene el valor de la propiedad countyB.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCountyB() {
            return countyB;
        }

        /**
         * Define el valor de la propiedad countyB.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCountyB(String value) {
            this.countyB = value;
        }

        /**
         * Obtiene el valor de la propiedad stateB.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getStateB() {
            return stateB;
        }

        /**
         * Define el valor de la propiedad stateB.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setStateB(String value) {
            this.stateB = value;
        }

        /**
         * Obtiene el valor de la propiedad countryB.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCountryB() {
            return countryB;
        }

        /**
         * Define el valor de la propiedad countryB.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCountryB(String value) {
            this.countryB = value;
        }

        /**
         * Obtiene el valor de la propiedad importOrExport.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getImportOrExport() {
            return importOrExport;
        }

        /**
         * Define el valor de la propiedad importOrExport.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setImportOrExport(String value) {
            this.importOrExport = value;
        }

        /**
         * Obtiene el valor de la propiedad mainUsage.
         *
         * @return
         *     possible object is
         *     {@link Long }
         *
         */
        public Long getMainUsage() {
            return mainUsage;
        }

        /**
         * Define el valor de la propiedad mainUsage.
         *
         * @param value
         *     allowed object is
         *     {@link Long }
         *
         */
        public void setMainUsage(Long value) {
            this.mainUsage = value;
        }

        /**
         * Obtiene el valor de la propiedad globalLocationNumberS.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getGlobalLocationNumberS() {
            return globalLocationNumberS;
        }

        /**
         * Define el valor de la propiedad globalLocationNumberS.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setGlobalLocationNumberS(String value) {
            this.globalLocationNumberS = value;
        }

        /**
         * Obtiene el valor de la propiedad globalLocationNumberB.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getGlobalLocationNumberB() {
            return globalLocationNumberB;
        }

        /**
         * Define el valor de la propiedad globalLocationNumberB.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setGlobalLocationNumberB(String value) {
            this.globalLocationNumberB = value;
        }

        /**
         * Obtiene el valor de la propiedad taxId12.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTaxId12() {
            return taxId12;
        }

        /**
         * Define el valor de la propiedad taxId12.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTaxId12(String value) {
            this.taxId12 = value;
        }

        /**
         * Obtiene el valor de la propiedad taxId13.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTaxId13() {
            return taxId13;
        }

        /**
         * Define el valor de la propiedad taxId13.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTaxId13(String value) {
            this.taxId13 = value;
        }

        /**
         * Obtiene el valor de la propiedad billOfEntryNo.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getBillOfEntryNo() {
            return billOfEntryNo;
        }

        /**
         * Define el valor de la propiedad billOfEntryNo.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setBillOfEntryNo(String value) {
            this.billOfEntryNo = value;
        }

        /**
         * Obtiene el valor de la propiedad billOfEntryDate.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getBillOfEntryDate() {
            return billOfEntryDate;
        }

        /**
         * Define el valor de la propiedad billOfEntryDate.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setBillOfEntryDate(XMLGregorianCalendar value) {
            this.billOfEntryDate = value;
        }

        /**
         * Obtiene el valor de la propiedad originalBillOfEntryNo.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getOriginalBillOfEntryNo() {
            return originalBillOfEntryNo;
        }

        /**
         * Define el valor de la propiedad originalBillOfEntryNo.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setOriginalBillOfEntryNo(String value) {
            this.originalBillOfEntryNo = value;
        }

        /**
         * Obtiene el valor de la propiedad originalBillOfEntryDate.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getOriginalBillOfEntryDate() {
            return originalBillOfEntryDate;
        }

        /**
         * Define el valor de la propiedad originalBillOfEntryDate.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setOriginalBillOfEntryDate(XMLGregorianCalendar value) {
            this.originalBillOfEntryDate = value;
        }

        /**
         * Obtiene el valor de la propiedad importOrExportType.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getImportOrExportType() {
            return importOrExportType;
        }

        /**
         * Define el valor de la propiedad importOrExportType.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setImportOrExportType(String value) {
            this.importOrExportType = value;
        }

        /**
         * Obtiene el valor de la propiedad portCode.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPortCode() {
            return portCode;
        }

        /**
         * Define el valor de la propiedad portCode.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPortCode(String value) {
            this.portCode = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="WithholdingTaxData" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="WTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WTAmountSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="WTAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="WTAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="WithholdingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TaxableAmountinSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="TaxableAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="TaxableAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="RoundingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="Criteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AppliedWTAmountSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="AppliedWTAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="AppliedWTAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="GLAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BaseDocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BaseDocLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BaseDocType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BaseDocumentReference" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="Status" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="bost_Open"/>
     *                         &lt;enumeration value="bost_Close"/>
     *                         &lt;enumeration value="bost_Paid"/>
     *                         &lt;enumeration value="bost_Delivered"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TargetAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="TargetDocumentType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="U_Base_ML" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="U_Base_MS" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="U_Base_ME" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="U_Tarifa" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="U_Fuente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="U_Ret_ML" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="U_Ret_MS" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="U_Ret_ME" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "withholdingTaxData"
    })
    public static class WithholdingTaxDataCollection {

        @XmlElement(name = "WithholdingTaxData")
        protected List<Document.WithholdingTaxDataCollection.WithholdingTaxData> withholdingTaxData;

        /**
         * Gets the value of the withholdingTaxData property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the withholdingTaxData property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWithholdingTaxData().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Document.WithholdingTaxDataCollection.WithholdingTaxData }
         *
         *
         */
        public List<Document.WithholdingTaxDataCollection.WithholdingTaxData> getWithholdingTaxData() {
            if (withholdingTaxData == null) {
                withholdingTaxData = new ArrayList<Document.WithholdingTaxDataCollection.WithholdingTaxData>();
            }
            return this.withholdingTaxData;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="WTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WTAmountSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="WTAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="WTAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="WithholdingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TaxableAmountinSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="TaxableAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="TaxableAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="RoundingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="Criteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AppliedWTAmountSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="AppliedWTAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="AppliedWTAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="GLAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BaseDocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BaseDocLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BaseDocType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BaseDocumentReference" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="Status" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="bost_Open"/>
         *               &lt;enumeration value="bost_Close"/>
         *               &lt;enumeration value="bost_Paid"/>
         *               &lt;enumeration value="bost_Delivered"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TargetAbsEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="TargetDocumentType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="U_Base_ML" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="U_Base_MS" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="U_Base_ME" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="U_Tarifa" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="U_Fuente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="U_Ret_ML" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="U_Ret_MS" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="U_Ret_ME" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class WithholdingTaxData {

            @XmlElement(name = "WTCode")
            protected String wtCode;
            @XmlElement(name = "WTAmountSys")
            protected BigDecimal wtAmountSys;
            @XmlElement(name = "WTAmountFC")
            protected BigDecimal wtAmountFC;
            @XmlElement(name = "WTAmount")
            protected BigDecimal wtAmount;
            @XmlElement(name = "WithholdingType")
            protected String withholdingType;
            @XmlElement(name = "TaxableAmountinSys")
            protected BigDecimal taxableAmountinSys;
            @XmlElement(name = "TaxableAmountFC")
            protected BigDecimal taxableAmountFC;
            @XmlElement(name = "TaxableAmount")
            protected BigDecimal taxableAmount;
            @XmlElement(name = "RoundingType")
            protected String roundingType;
            @XmlElement(name = "Rate")
            protected BigDecimal rate;
            @XmlElement(name = "Criteria")
            protected String criteria;
            @XmlElement(name = "Category")
            protected String category;
            @XmlElement(name = "BaseType")
            protected String baseType;
            @XmlElement(name = "AppliedWTAmountSys")
            protected BigDecimal appliedWTAmountSys;
            @XmlElement(name = "AppliedWTAmountFC")
            protected BigDecimal appliedWTAmountFC;
            @XmlElement(name = "AppliedWTAmount")
            protected BigDecimal appliedWTAmount;
            @XmlElement(name = "GLAccount")
            protected String glAccount;
            @XmlElement(name = "LineNum")
            protected Long lineNum;
            @XmlElement(name = "BaseDocEntry")
            protected Long baseDocEntry;
            @XmlElement(name = "BaseDocLine")
            protected Long baseDocLine;
            @XmlElement(name = "BaseDocType")
            protected Long baseDocType;
            @XmlElement(name = "BaseDocumentReference")
            protected Long baseDocumentReference;
            @XmlElement(name = "Status")
            protected String status;
            @XmlElement(name = "TargetAbsEntry")
            protected Long targetAbsEntry;
            @XmlElement(name = "TargetDocumentType")
            protected Long targetDocumentType;
            @XmlElement(name = "U_Base_ML")
            protected BigDecimal uBaseML;
            @XmlElement(name = "U_Base_MS")
            protected BigDecimal uBaseMS;
            @XmlElement(name = "U_Base_ME")
            protected BigDecimal uBaseME;
            @XmlElement(name = "U_Tarifa")
            protected BigDecimal uTarifa;
            @XmlElement(name = "U_Fuente")
            protected String uFuente;
            @XmlElement(name = "U_Ret_ML")
            protected BigDecimal uRetML;
            @XmlElement(name = "U_Ret_MS")
            protected BigDecimal uRetMS;
            @XmlElement(name = "U_Ret_ME")
            protected BigDecimal uRetME;

            /**
             * Obtiene el valor de la propiedad wtCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getWTCode() {
                return wtCode;
            }

            /**
             * Define el valor de la propiedad wtCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setWTCode(String value) {
                this.wtCode = value;
            }

            /**
             * Obtiene el valor de la propiedad wtAmountSys.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getWTAmountSys() {
                return wtAmountSys;
            }

            /**
             * Define el valor de la propiedad wtAmountSys.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setWTAmountSys(BigDecimal value) {
                this.wtAmountSys = value;
            }

            /**
             * Obtiene el valor de la propiedad wtAmountFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getWTAmountFC() {
                return wtAmountFC;
            }

            /**
             * Define el valor de la propiedad wtAmountFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setWTAmountFC(BigDecimal value) {
                this.wtAmountFC = value;
            }

            /**
             * Obtiene el valor de la propiedad wtAmount.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getWTAmount() {
                return wtAmount;
            }

            /**
             * Define el valor de la propiedad wtAmount.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setWTAmount(BigDecimal value) {
                this.wtAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad withholdingType.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getWithholdingType() {
                return withholdingType;
            }

            /**
             * Define el valor de la propiedad withholdingType.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setWithholdingType(String value) {
                this.withholdingType = value;
            }

            /**
             * Obtiene el valor de la propiedad taxableAmountinSys.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTaxableAmountinSys() {
                return taxableAmountinSys;
            }

            /**
             * Define el valor de la propiedad taxableAmountinSys.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTaxableAmountinSys(BigDecimal value) {
                this.taxableAmountinSys = value;
            }

            /**
             * Obtiene el valor de la propiedad taxableAmountFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTaxableAmountFC() {
                return taxableAmountFC;
            }

            /**
             * Define el valor de la propiedad taxableAmountFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTaxableAmountFC(BigDecimal value) {
                this.taxableAmountFC = value;
            }

            /**
             * Obtiene el valor de la propiedad taxableAmount.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTaxableAmount() {
                return taxableAmount;
            }

            /**
             * Define el valor de la propiedad taxableAmount.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTaxableAmount(BigDecimal value) {
                this.taxableAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad roundingType.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getRoundingType() {
                return roundingType;
            }

            /**
             * Define el valor de la propiedad roundingType.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setRoundingType(String value) {
                this.roundingType = value;
            }

            /**
             * Obtiene el valor de la propiedad rate.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getRate() {
                return rate;
            }

            /**
             * Define el valor de la propiedad rate.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setRate(BigDecimal value) {
                this.rate = value;
            }

            /**
             * Obtiene el valor de la propiedad criteria.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCriteria() {
                return criteria;
            }

            /**
             * Define el valor de la propiedad criteria.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCriteria(String value) {
                this.criteria = value;
            }

            /**
             * Obtiene el valor de la propiedad category.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCategory() {
                return category;
            }

            /**
             * Define el valor de la propiedad category.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCategory(String value) {
                this.category = value;
            }

            /**
             * Obtiene el valor de la propiedad baseType.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getBaseType() {
                return baseType;
            }

            /**
             * Define el valor de la propiedad baseType.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setBaseType(String value) {
                this.baseType = value;
            }

            /**
             * Obtiene el valor de la propiedad appliedWTAmountSys.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getAppliedWTAmountSys() {
                return appliedWTAmountSys;
            }

            /**
             * Define el valor de la propiedad appliedWTAmountSys.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setAppliedWTAmountSys(BigDecimal value) {
                this.appliedWTAmountSys = value;
            }

            /**
             * Obtiene el valor de la propiedad appliedWTAmountFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getAppliedWTAmountFC() {
                return appliedWTAmountFC;
            }

            /**
             * Define el valor de la propiedad appliedWTAmountFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setAppliedWTAmountFC(BigDecimal value) {
                this.appliedWTAmountFC = value;
            }

            /**
             * Obtiene el valor de la propiedad appliedWTAmount.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getAppliedWTAmount() {
                return appliedWTAmount;
            }

            /**
             * Define el valor de la propiedad appliedWTAmount.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setAppliedWTAmount(BigDecimal value) {
                this.appliedWTAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad glAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getGLAccount() {
                return glAccount;
            }

            /**
             * Define el valor de la propiedad glAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setGLAccount(String value) {
                this.glAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad lineNum.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getLineNum() {
                return lineNum;
            }

            /**
             * Define el valor de la propiedad lineNum.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setLineNum(Long value) {
                this.lineNum = value;
            }

            /**
             * Obtiene el valor de la propiedad baseDocEntry.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getBaseDocEntry() {
                return baseDocEntry;
            }

            /**
             * Define el valor de la propiedad baseDocEntry.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setBaseDocEntry(Long value) {
                this.baseDocEntry = value;
            }

            /**
             * Obtiene el valor de la propiedad baseDocLine.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getBaseDocLine() {
                return baseDocLine;
            }

            /**
             * Define el valor de la propiedad baseDocLine.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setBaseDocLine(Long value) {
                this.baseDocLine = value;
            }

            /**
             * Obtiene el valor de la propiedad baseDocType.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getBaseDocType() {
                return baseDocType;
            }

            /**
             * Define el valor de la propiedad baseDocType.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setBaseDocType(Long value) {
                this.baseDocType = value;
            }

            /**
             * Obtiene el valor de la propiedad baseDocumentReference.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getBaseDocumentReference() {
                return baseDocumentReference;
            }

            /**
             * Define el valor de la propiedad baseDocumentReference.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setBaseDocumentReference(Long value) {
                this.baseDocumentReference = value;
            }

            /**
             * Obtiene el valor de la propiedad status.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getStatus() {
                return status;
            }

            /**
             * Define el valor de la propiedad status.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setStatus(String value) {
                this.status = value;
            }

            /**
             * Obtiene el valor de la propiedad targetAbsEntry.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getTargetAbsEntry() {
                return targetAbsEntry;
            }

            /**
             * Define el valor de la propiedad targetAbsEntry.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setTargetAbsEntry(Long value) {
                this.targetAbsEntry = value;
            }

            /**
             * Obtiene el valor de la propiedad targetDocumentType.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getTargetDocumentType() {
                return targetDocumentType;
            }

            /**
             * Define el valor de la propiedad targetDocumentType.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setTargetDocumentType(Long value) {
                this.targetDocumentType = value;
            }

            /**
             * Obtiene el valor de la propiedad uBaseML.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getUBaseML() {
                return uBaseML;
            }

            /**
             * Define el valor de la propiedad uBaseML.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setUBaseML(BigDecimal value) {
                this.uBaseML = value;
            }

            /**
             * Obtiene el valor de la propiedad uBaseMS.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getUBaseMS() {
                return uBaseMS;
            }

            /**
             * Define el valor de la propiedad uBaseMS.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setUBaseMS(BigDecimal value) {
                this.uBaseMS = value;
            }

            /**
             * Obtiene el valor de la propiedad uBaseME.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getUBaseME() {
                return uBaseME;
            }

            /**
             * Define el valor de la propiedad uBaseME.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setUBaseME(BigDecimal value) {
                this.uBaseME = value;
            }

            /**
             * Obtiene el valor de la propiedad uTarifa.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getUTarifa() {
                return uTarifa;
            }

            /**
             * Define el valor de la propiedad uTarifa.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setUTarifa(BigDecimal value) {
                this.uTarifa = value;
            }

            /**
             * Obtiene el valor de la propiedad uFuente.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUFuente() {
                return uFuente;
            }

            /**
             * Define el valor de la propiedad uFuente.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUFuente(String value) {
                this.uFuente = value;
            }

            /**
             * Obtiene el valor de la propiedad uRetML.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getURetML() {
                return uRetML;
            }

            /**
             * Define el valor de la propiedad uRetML.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setURetML(BigDecimal value) {
                this.uRetML = value;
            }

            /**
             * Obtiene el valor de la propiedad uRetMS.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getURetMS() {
                return uRetMS;
            }

            /**
             * Define el valor de la propiedad uRetMS.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setURetMS(BigDecimal value) {
                this.uRetMS = value;
            }

            /**
             * Obtiene el valor de la propiedad uRetME.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getURetME() {
                return uRetME;
            }

            /**
             * Define el valor de la propiedad uRetME.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setURetME(BigDecimal value) {
                this.uRetME = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="WithholdingTaxDataWTX" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="WTAmountSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="WTAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="WTAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="WithholdingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TaxableAmountinSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="TaxableAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="TaxableAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AppliedWTAmountSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="AppliedWTAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="AppliedWTAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="GLAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BaseDocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BaseDocLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="BaseDocType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WTAbsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ExemptRate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="BaseNetAmountSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="BaseNetAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="BaseNetAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="BaseVatmountSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="BaseVatmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="BaseVatmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="AccumBaseAmountSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="AccumBaseAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="AccumBaseAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="AccumWTaxAmountSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="AccumWTaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                   &lt;element name="AccumWTaxAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "withholdingTaxDataWTX"
    })
    public static class WithholdingTaxDataWTXCollection {

        @XmlElement(name = "WithholdingTaxDataWTX")
        protected List<Document.WithholdingTaxDataWTXCollection.WithholdingTaxDataWTX> withholdingTaxDataWTX;

        /**
         * Gets the value of the withholdingTaxDataWTX property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the withholdingTaxDataWTX property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWithholdingTaxDataWTX().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Document.WithholdingTaxDataWTXCollection.WithholdingTaxDataWTX }
         *
         *
         */
        public List<Document.WithholdingTaxDataWTXCollection.WithholdingTaxDataWTX> getWithholdingTaxDataWTX() {
            if (withholdingTaxDataWTX == null) {
                withholdingTaxDataWTX = new ArrayList<Document.WithholdingTaxDataWTXCollection.WithholdingTaxDataWTX>();
            }
            return this.withholdingTaxDataWTX;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="WTAmountSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="WTAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="WTAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="WithholdingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TaxableAmountinSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="TaxableAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="TaxableAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AppliedWTAmountSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="AppliedWTAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="AppliedWTAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="GLAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LineNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BaseDocEntry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BaseDocLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="BaseDocType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WTAbsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ExemptRate" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="BaseNetAmountSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="BaseNetAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="BaseNetAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="BaseVatmountSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="BaseVatmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="BaseVatmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="AccumBaseAmountSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="AccumBaseAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="AccumBaseAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="AccumWTaxAmountSys" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="AccumWTaxAmountFC" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *         &lt;element name="AccumWTaxAmount" type="{http://www.w3.org/2001/XMLSchema}BigDecimal" minOccurs="0"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class WithholdingTaxDataWTX {

            @XmlElement(name = "WTAmountSys")
            protected BigDecimal wtAmountSys;
            @XmlElement(name = "WTAmountFC")
            protected BigDecimal wtAmountFC;
            @XmlElement(name = "WTAmount")
            protected BigDecimal wtAmount;
            @XmlElement(name = "WithholdingType")
            protected String withholdingType;
            @XmlElement(name = "TaxableAmountinSys")
            protected BigDecimal taxableAmountinSys;
            @XmlElement(name = "TaxableAmountFC")
            protected BigDecimal taxableAmountFC;
            @XmlElement(name = "TaxableAmount")
            protected BigDecimal taxableAmount;
            @XmlElement(name = "Rate")
            protected BigDecimal rate;
            @XmlElement(name = "Category")
            protected String category;
            @XmlElement(name = "BaseType")
            protected String baseType;
            @XmlElement(name = "AppliedWTAmountSys")
            protected BigDecimal appliedWTAmountSys;
            @XmlElement(name = "AppliedWTAmountFC")
            protected BigDecimal appliedWTAmountFC;
            @XmlElement(name = "AppliedWTAmount")
            protected BigDecimal appliedWTAmount;
            @XmlElement(name = "GLAccount")
            protected String glAccount;
            @XmlElement(name = "LineNum")
            protected Long lineNum;
            @XmlElement(name = "BaseDocEntry")
            protected Long baseDocEntry;
            @XmlElement(name = "BaseDocLine")
            protected Long baseDocLine;
            @XmlElement(name = "BaseDocType")
            protected String baseDocType;
            @XmlElement(name = "WTAbsId")
            protected String wtAbsId;
            @XmlElement(name = "ExemptRate")
            protected BigDecimal exemptRate;
            @XmlElement(name = "BaseNetAmountSys")
            protected BigDecimal baseNetAmountSys;
            @XmlElement(name = "BaseNetAmountFC")
            protected BigDecimal baseNetAmountFC;
            @XmlElement(name = "BaseNetAmount")
            protected BigDecimal baseNetAmount;
            @XmlElement(name = "BaseVatmountSys")
            protected BigDecimal baseVatmountSys;
            @XmlElement(name = "BaseVatmountFC")
            protected BigDecimal baseVatmountFC;
            @XmlElement(name = "BaseVatmount")
            protected BigDecimal baseVatmount;
            @XmlElement(name = "AccumBaseAmountSys")
            protected BigDecimal accumBaseAmountSys;
            @XmlElement(name = "AccumBaseAmountFC")
            protected BigDecimal accumBaseAmountFC;
            @XmlElement(name = "AccumBaseAmount")
            protected BigDecimal accumBaseAmount;
            @XmlElement(name = "AccumWTaxAmountSys")
            protected BigDecimal accumWTaxAmountSys;
            @XmlElement(name = "AccumWTaxAmountFC")
            protected BigDecimal accumWTaxAmountFC;
            @XmlElement(name = "AccumWTaxAmount")
            protected BigDecimal accumWTaxAmount;

            /**
             * Obtiene el valor de la propiedad wtAmountSys.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getWTAmountSys() {
                return wtAmountSys;
            }

            /**
             * Define el valor de la propiedad wtAmountSys.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setWTAmountSys(BigDecimal value) {
                this.wtAmountSys = value;
            }

            /**
             * Obtiene el valor de la propiedad wtAmountFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getWTAmountFC() {
                return wtAmountFC;
            }

            /**
             * Define el valor de la propiedad wtAmountFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setWTAmountFC(BigDecimal value) {
                this.wtAmountFC = value;
            }

            /**
             * Obtiene el valor de la propiedad wtAmount.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getWTAmount() {
                return wtAmount;
            }

            /**
             * Define el valor de la propiedad wtAmount.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setWTAmount(BigDecimal value) {
                this.wtAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad withholdingType.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getWithholdingType() {
                return withholdingType;
            }

            /**
             * Define el valor de la propiedad withholdingType.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setWithholdingType(String value) {
                this.withholdingType = value;
            }

            /**
             * Obtiene el valor de la propiedad taxableAmountinSys.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTaxableAmountinSys() {
                return taxableAmountinSys;
            }

            /**
             * Define el valor de la propiedad taxableAmountinSys.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTaxableAmountinSys(BigDecimal value) {
                this.taxableAmountinSys = value;
            }

            /**
             * Obtiene el valor de la propiedad taxableAmountFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTaxableAmountFC() {
                return taxableAmountFC;
            }

            /**
             * Define el valor de la propiedad taxableAmountFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTaxableAmountFC(BigDecimal value) {
                this.taxableAmountFC = value;
            }

            /**
             * Obtiene el valor de la propiedad taxableAmount.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getTaxableAmount() {
                return taxableAmount;
            }

            /**
             * Define el valor de la propiedad taxableAmount.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setTaxableAmount(BigDecimal value) {
                this.taxableAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad rate.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getRate() {
                return rate;
            }

            /**
             * Define el valor de la propiedad rate.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setRate(BigDecimal value) {
                this.rate = value;
            }

            /**
             * Obtiene el valor de la propiedad category.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCategory() {
                return category;
            }

            /**
             * Define el valor de la propiedad category.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCategory(String value) {
                this.category = value;
            }

            /**
             * Obtiene el valor de la propiedad baseType.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getBaseType() {
                return baseType;
            }

            /**
             * Define el valor de la propiedad baseType.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setBaseType(String value) {
                this.baseType = value;
            }

            /**
             * Obtiene el valor de la propiedad appliedWTAmountSys.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getAppliedWTAmountSys() {
                return appliedWTAmountSys;
            }

            /**
             * Define el valor de la propiedad appliedWTAmountSys.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setAppliedWTAmountSys(BigDecimal value) {
                this.appliedWTAmountSys = value;
            }

            /**
             * Obtiene el valor de la propiedad appliedWTAmountFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getAppliedWTAmountFC() {
                return appliedWTAmountFC;
            }

            /**
             * Define el valor de la propiedad appliedWTAmountFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setAppliedWTAmountFC(BigDecimal value) {
                this.appliedWTAmountFC = value;
            }

            /**
             * Obtiene el valor de la propiedad appliedWTAmount.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getAppliedWTAmount() {
                return appliedWTAmount;
            }

            /**
             * Define el valor de la propiedad appliedWTAmount.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setAppliedWTAmount(BigDecimal value) {
                this.appliedWTAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad glAccount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getGLAccount() {
                return glAccount;
            }

            /**
             * Define el valor de la propiedad glAccount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setGLAccount(String value) {
                this.glAccount = value;
            }

            /**
             * Obtiene el valor de la propiedad lineNum.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getLineNum() {
                return lineNum;
            }

            /**
             * Define el valor de la propiedad lineNum.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setLineNum(Long value) {
                this.lineNum = value;
            }

            /**
             * Obtiene el valor de la propiedad baseDocEntry.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getBaseDocEntry() {
                return baseDocEntry;
            }

            /**
             * Define el valor de la propiedad baseDocEntry.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setBaseDocEntry(Long value) {
                this.baseDocEntry = value;
            }

            /**
             * Obtiene el valor de la propiedad baseDocLine.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getBaseDocLine() {
                return baseDocLine;
            }

            /**
             * Define el valor de la propiedad baseDocLine.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setBaseDocLine(Long value) {
                this.baseDocLine = value;
            }

            /**
             * Obtiene el valor de la propiedad baseDocType.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getBaseDocType() {
                return baseDocType;
            }

            /**
             * Define el valor de la propiedad baseDocType.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setBaseDocType(String value) {
                this.baseDocType = value;
            }

            /**
             * Obtiene el valor de la propiedad wtAbsId.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getWTAbsId() {
                return wtAbsId;
            }

            /**
             * Define el valor de la propiedad wtAbsId.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setWTAbsId(String value) {
                this.wtAbsId = value;
            }

            /**
             * Obtiene el valor de la propiedad exemptRate.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getExemptRate() {
                return exemptRate;
            }

            /**
             * Define el valor de la propiedad exemptRate.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setExemptRate(BigDecimal value) {
                this.exemptRate = value;
            }

            /**
             * Obtiene el valor de la propiedad baseNetAmountSys.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getBaseNetAmountSys() {
                return baseNetAmountSys;
            }

            /**
             * Define el valor de la propiedad baseNetAmountSys.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setBaseNetAmountSys(BigDecimal value) {
                this.baseNetAmountSys = value;
            }

            /**
             * Obtiene el valor de la propiedad baseNetAmountFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getBaseNetAmountFC() {
                return baseNetAmountFC;
            }

            /**
             * Define el valor de la propiedad baseNetAmountFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setBaseNetAmountFC(BigDecimal value) {
                this.baseNetAmountFC = value;
            }

            /**
             * Obtiene el valor de la propiedad baseNetAmount.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getBaseNetAmount() {
                return baseNetAmount;
            }

            /**
             * Define el valor de la propiedad baseNetAmount.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setBaseNetAmount(BigDecimal value) {
                this.baseNetAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad baseVatmountSys.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getBaseVatmountSys() {
                return baseVatmountSys;
            }

            /**
             * Define el valor de la propiedad baseVatmountSys.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setBaseVatmountSys(BigDecimal value) {
                this.baseVatmountSys = value;
            }

            /**
             * Obtiene el valor de la propiedad baseVatmountFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getBaseVatmountFC() {
                return baseVatmountFC;
            }

            /**
             * Define el valor de la propiedad baseVatmountFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setBaseVatmountFC(BigDecimal value) {
                this.baseVatmountFC = value;
            }

            /**
             * Obtiene el valor de la propiedad baseVatmount.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getBaseVatmount() {
                return baseVatmount;
            }

            /**
             * Define el valor de la propiedad baseVatmount.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setBaseVatmount(BigDecimal value) {
                this.baseVatmount = value;
            }

            /**
             * Obtiene el valor de la propiedad accumBaseAmountSys.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getAccumBaseAmountSys() {
                return accumBaseAmountSys;
            }

            /**
             * Define el valor de la propiedad accumBaseAmountSys.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setAccumBaseAmountSys(BigDecimal value) {
                this.accumBaseAmountSys = value;
            }

            /**
             * Obtiene el valor de la propiedad accumBaseAmountFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getAccumBaseAmountFC() {
                return accumBaseAmountFC;
            }

            /**
             * Define el valor de la propiedad accumBaseAmountFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setAccumBaseAmountFC(BigDecimal value) {
                this.accumBaseAmountFC = value;
            }

            /**
             * Obtiene el valor de la propiedad accumBaseAmount.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getAccumBaseAmount() {
                return accumBaseAmount;
            }

            /**
             * Define el valor de la propiedad accumBaseAmount.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setAccumBaseAmount(BigDecimal value) {
                this.accumBaseAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad accumWTaxAmountSys.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getAccumWTaxAmountSys() {
                return accumWTaxAmountSys;
            }

            /**
             * Define el valor de la propiedad accumWTaxAmountSys.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setAccumWTaxAmountSys(BigDecimal value) {
                this.accumWTaxAmountSys = value;
            }

            /**
             * Obtiene el valor de la propiedad accumWTaxAmountFC.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getAccumWTaxAmountFC() {
                return accumWTaxAmountFC;
            }

            /**
             * Define el valor de la propiedad accumWTaxAmountFC.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setAccumWTaxAmountFC(BigDecimal value) {
                this.accumWTaxAmountFC = value;
            }

            /**
             * Obtiene el valor de la propiedad accumWTaxAmount.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getAccumWTaxAmount() {
                return accumWTaxAmount;
            }

            /**
             * Define el valor de la propiedad accumWTaxAmount.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setAccumWTaxAmount(BigDecimal value) {
                this.accumWTaxAmount = value;
            }

        }

    }

}
