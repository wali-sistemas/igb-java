package co.igb.hanaws.dto.deliveryNotes;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeliveryRestDTO implements Serializable {
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
    protected Double vatSum;
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
    protected Double baseAmount;
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
    @JsonProperty("AuthorizationCode")
    protected String authorizationCode;
    @JsonProperty("StartDeliveryDate")
    protected String startDeliveryDate;
    @JsonProperty("StartDeliveryTime")
    protected String startDeliveryTime;
    @JsonProperty("EndDeliveryDate")
    protected String endDeliveryDate;
    @JsonProperty("EndDeliveryTime")
    protected String endDeliveryTime;
    @JsonProperty("VehiclePlate")
    protected String vehiclePlate;
    @JsonProperty("ATDocumentType")
    protected String atDocumentType;
    @JsonProperty("ElecCommStatus")
    protected String elecCommStatus;
    @JsonProperty("ElecCommMessage")
    protected String elecCommMessage;
    @JsonProperty("ReuseDocumentNum")
    protected String reuseDocumentNum;
    @JsonProperty("ReuseNotaFiscalNum")
    protected String reuseNotaFiscalNum;
    @JsonProperty("PrintSEPADirect")
    protected String printSEPADirect;
    @JsonProperty("FiscalDocNum")
    protected String fiscalDocNum;
    @JsonProperty("POSDailySummaryNo")
    protected Long posDailySummaryNo;
    @JsonProperty("POSReceiptNo")
    protected Long posReceiptNo;
    @JsonProperty("PointOfIssueCode")
    protected String pointOfIssueCode;
    @JsonProperty("Letter")
    protected String letter;
    @JsonProperty("FolioNumberFrom")
    protected Long folioNumberFrom;
    @JsonProperty("FolioNumberTo")
    protected Long folioNumberTo;
    @JsonProperty("InterimType")
    protected String interimType;
    @JsonProperty("RelatedType")
    protected Long relatedType;
    @JsonProperty("RelatedEntry")
    protected Long relatedEntry;
    @JsonProperty("U_BPCOST")
    protected String ubpcost;
    @JsonProperty("U_WUID")
    protected String uwuid;
    @JsonProperty("U_F_TOMA_PED")
    protected String uftomaped;
    @JsonProperty("U_CAMPANA")
    protected String ucampana;
    @JsonProperty("U_TRANSP")
    protected String utransp;
    @JsonProperty("U_SEPARADOR")
    protected String useparador;
    @JsonProperty("U_DESP")
    protected String udesp;
    @JsonProperty("U_UBIC1")
    protected String uubic1;
    @JsonProperty("U_CONC_NC")
    protected String uconcnc;
    @JsonProperty("U_CONC_ND")
    protected String uconcnd;
    @JsonProperty("U_CONC_INV")
    protected String uconcinv;
    @JsonProperty("U_F_EMBARQUE")
    protected String ufembarque;
    @JsonProperty("U_TERM_NEG")
    protected String utermneg;
    @JsonProperty("U_MOD_TRANSP")
    protected String umodtransp;
    @JsonProperty("U_PUERTO_DES")
    protected String upuertodes;
    @JsonProperty("U_MOD_IMP")
    protected String umodimp;
    @JsonProperty("U_ESTADO_OC")
    protected String uestadooc;
    @JsonProperty("U_F_PROFORMA")
    protected String ufproforma;
    @JsonProperty("U_EMBARCADO")
    protected String uembarcado;
    @JsonProperty("U_DOC_TRANSP")
    protected String udoctransp;
    @JsonProperty("U_F_DOC_TRANSP")
    protected String ufdoctransp;
    @JsonProperty("U_F_ARRIB_PUERTO")
    protected String ufarribpuerto;
    @JsonProperty("U_F_ARRIB_ALMA")
    protected String ufarribalma;
    @JsonProperty("U_REQ_ANT")
    protected String ureqant;
    @JsonProperty("U_ANT_REALIZ")
    protected String uantrealiz;
    @JsonProperty("U_TOT_CAJ")
    protected Double utotcaj;
    @JsonProperty("U_TOT_BUL")
    protected Double utotbul;
    @JsonProperty("U_TOT_LIOS")
    protected Double utotlios;
    @JsonProperty("U_VLR_FLE")
    protected Double uvlrfle;
    @JsonProperty("U_VLR_SEG")
    protected Double uvlrseg;
    @JsonProperty("U_TOT_FLE")
    protected Double utotfle;
    @JsonProperty("U_HORA_INI")
    protected String uhoraini;
    @JsonProperty("U_HORA_FIN")
    protected String uhorafin;
    @JsonProperty("U_PESO_BRUTO")
    protected Double upesobruto;
    @JsonProperty("U_AUT_PRECIO")
    protected String uautprecio;
    @JsonProperty("U_TipoNota")
    protected String uTipoNota;
    @JsonProperty("U_NUNFAC")
    protected String ununfac;
    @JsonProperty("U_FECHA_ENTREGA_PRO")
    protected String ufechaentregapro;
    @JsonProperty("U_NUM_FAC_IMP")
    protected String unumfacimp;
    @JsonProperty("U_TRANSP_IMP")
    protected String utranspimp;
    @JsonProperty("U_TIEMPO_ESTIMADO")
    protected Double utiempoestimado;
    @JsonProperty("U_FEC_INI")
    protected String ufecini;
    @JsonProperty("U_FEC_FIN")
    protected String ufecfin;
    @JsonProperty("U_IVCDone")
    protected String uivcDone;
    @JsonProperty("U_Vendedor_2")
    protected String uVendedor2;
    @JsonProperty("U_DifCode")
    protected String uDifCode;
    @JsonProperty("U_OK1_IVAPA")
    protected String uok1IVAPA;
    @JsonProperty("U_MOT_DEVOL")
    protected String umotdevol;
    @JsonProperty("U_FECHA_PAGO")
    protected String ufechapago;
    @JsonProperty("U_ANT_CANCELADO")
    protected String uantcancelado;
    @JsonProperty("U_IMP_CANCELADO")
    protected String uimpcancelado;
    @JsonProperty("U_TIPO_EMPAQUE")
    protected String utipoempaque;
    @JsonProperty("U_VR_ANTICIPO")
    protected Double uvranticipo;
    @JsonProperty("U_VR_TOTAL")
    protected Double uvrtotal;
    @JsonProperty("U_VR_IMPUESTO")
    protected Double uvrimpuesto;
    @JsonProperty("U_OBSERVACION")
    protected String uobservacion;
    @JsonProperty("U_VR_DECLARADO")
    protected BigDecimal uvrdeclarado;
    @JsonProperty("U_PUERTO_EMB")
    protected String upuertoemb;
    @JsonProperty("U_NAVIERA")
    protected String unaviera;
    @JsonProperty("U_TRANSP_TERR")
    protected String utranspterr;
    @JsonProperty("U_AGENTE_ADU")
    protected String uagenteadu;
    @JsonProperty("U_ALMAC_DES")
    protected String ualmacdes;
    @JsonProperty("U_GUID")
    protected String uguid;
    @JsonProperty("U_BPV_NCON2")
    protected String ubpvncon2;
    @JsonProperty("U_BPV_SERI")
    protected String ubpvseri;
    @JsonProperty("U_BPV_TRAN")
    protected String ubpvtran;
    @JsonProperty("U_BPV_FAFE")
    protected String ubpvfafe;
    @JsonProperty("U_BPV_COMP")
    protected String ubpvcomp;
    @JsonProperty("U_BPV_TDOC")
    protected String ubpvtdoc;
    @JsonProperty("U_BPV_NIMP")
    protected String ubpvnimp;
    @JsonProperty("U_BPV_NumExp")
    protected String ubpvNumExp;
    @JsonProperty("U_BPV_NCON")
    protected String ubpvncon;
    @JsonProperty("U_MOTIVO")
    protected String umotivo;
    @JsonProperty("U_ESTADO_PED")
    protected String uestadoped;
    @JsonProperty("U_Autorret")
    protected String uAutorret;
    @JsonProperty("U_Retefue")
    protected String uRetefue;
    @JsonProperty("U_ReteIca")
    protected String uReteIca;
    @JsonProperty("U_NWR_PicS")
    protected String unwrPicS;
    @JsonProperty("U_NWR_BRet")
    protected String unwrbRet;
    @JsonProperty("U_nwr_PAut")
    protected Long uNwrPAut;
    @JsonProperty("U_nwr_Note")
    protected String uNwrNote;
    @JsonProperty("U_nwr_Tag")
    protected String uNwrTag;
    @JsonProperty("U_nwr_Frgt")
    protected Double uNwrFrgt;
    @JsonProperty("U_NWR_NORM")
    protected String unwrnorm;
    @JsonProperty("U_TypeExped")
    protected String uTypeExped;
    @JsonProperty("U_NWR_Manifest")
    protected String unwrManifest;
    @JsonProperty("U_EMPACADOR")
    protected String uempacador;
    @JsonProperty("U_HORA_INI_EMP")
    protected String uhorainiemp;
    @JsonProperty("U_HORA_FIN_EMP")
    protected String uhorafinemp;
    @JsonProperty("U_ALIST")
    protected String ualist;
    @JsonProperty("U_FEC_INI_EMP")
    protected String ufeciniemp;
    @JsonProperty("U_FEC_FIN_EMP")
    protected String ufecfinemp;
    @JsonProperty("U_OK1_IFRS")
    protected String uok1IFRS;
    @JsonProperty("U_TOT_FLE_CLIE")
    protected Double utotfleclie;
    @JsonProperty("U_SHIPPING")
    protected String ushipping;
    @JsonProperty("U_EsIndep")
    protected String uEsIndep;
    @JsonProperty("U_DocEntryLeg")
    protected Long uDocEntryLeg;
    @JsonProperty("U_idLineLeg")
    protected String uIdLineLeg;
    @JsonProperty("U_serieLeg")
    protected Long uSerieLeg;
    @JsonProperty("U_Fecha_Arribo_CEDI")
    protected String uFechaArriboCEDI;
    @JsonProperty("U_CatRet")
    protected String uCatRet;
    @JsonProperty("U_Bodega")
    protected String uBodega;
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
    @JsonProperty("U_MedioPg")
    protected String uMedioPg;
    @JsonProperty("U_Plantilla")
    protected Long uPlantilla;
    @JsonProperty("U_DESPACHO_CONTADO")
    protected Long uDespachoContado;
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
    protected DeliveryRestDTO.DocumentApprovalRequests documentApprovalRequests;
    protected List<DocumentLines.DocumentLine> documentLines;
    protected DeliveryRestDTO.DocumentAdditionalExpenses documentAdditionalExpenses;
    protected DeliveryRestDTO.WithholdingTaxDataCollection withholdingTaxDataCollection;
    protected DeliveryRestDTO.DocumentPackages documentPackages;
    protected DeliveryRestDTO.DocumentSpecialLines documentSpecialLines;
    protected DeliveryRestDTO.TaxExtension taxExtension;
    protected DeliveryRestDTO.AddressExtension addressExtension;

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

    public Double getVatSum() {
        return vatSum;
    }

    public void setVatSum(Double vatSum) {
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

    public Double getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(Double baseAmount) {
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

    public String getAuthorizationCode() {
        return authorizationCode;
    }

    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    public String getStartDeliveryDate() {
        return startDeliveryDate;
    }

    public void setStartDeliveryDate(String startDeliveryDate) {
        this.startDeliveryDate = startDeliveryDate;
    }

    public String getStartDeliveryTime() {
        return startDeliveryTime;
    }

    public void setStartDeliveryTime(String startDeliveryTime) {
        this.startDeliveryTime = startDeliveryTime;
    }

    public String getEndDeliveryDate() {
        return endDeliveryDate;
    }

    public void setEndDeliveryDate(String endDeliveryDate) {
        this.endDeliveryDate = endDeliveryDate;
    }

    public String getEndDeliveryTime() {
        return endDeliveryTime;
    }

    public void setEndDeliveryTime(String endDeliveryTime) {
        this.endDeliveryTime = endDeliveryTime;
    }

    public String getVehiclePlate() {
        return vehiclePlate;
    }

    public void setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }

    public String getAtDocumentType() {
        return atDocumentType;
    }

    public void setAtDocumentType(String atDocumentType) {
        this.atDocumentType = atDocumentType;
    }

    public String getElecCommStatus() {
        return elecCommStatus;
    }

    public void setElecCommStatus(String elecCommStatus) {
        this.elecCommStatus = elecCommStatus;
    }

    public String getElecCommMessage() {
        return elecCommMessage;
    }

    public void setElecCommMessage(String elecCommMessage) {
        this.elecCommMessage = elecCommMessage;
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

    public String getPrintSEPADirect() {
        return printSEPADirect;
    }

    public void setPrintSEPADirect(String printSEPADirect) {
        this.printSEPADirect = printSEPADirect;
    }

    public String getFiscalDocNum() {
        return fiscalDocNum;
    }

    public void setFiscalDocNum(String fiscalDocNum) {
        this.fiscalDocNum = fiscalDocNum;
    }

    public Long getPosDailySummaryNo() {
        return posDailySummaryNo;
    }

    public void setPosDailySummaryNo(Long posDailySummaryNo) {
        this.posDailySummaryNo = posDailySummaryNo;
    }

    public Long getPosReceiptNo() {
        return posReceiptNo;
    }

    public void setPosReceiptNo(Long posReceiptNo) {
        this.posReceiptNo = posReceiptNo;
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

    public Long getFolioNumberFrom() {
        return folioNumberFrom;
    }

    public void setFolioNumberFrom(Long folioNumberFrom) {
        this.folioNumberFrom = folioNumberFrom;
    }

    public Long getFolioNumberTo() {
        return folioNumberTo;
    }

    public void setFolioNumberTo(Long folioNumberTo) {
        this.folioNumberTo = folioNumberTo;
    }

    public String getInterimType() {
        return interimType;
    }

    public void setInterimType(String interimType) {
        this.interimType = interimType;
    }

    public Long getRelatedType() {
        return relatedType;
    }

    public void setRelatedType(Long relatedType) {
        this.relatedType = relatedType;
    }

    public Long getRelatedEntry() {
        return relatedEntry;
    }

    public void setRelatedEntry(Long relatedEntry) {
        this.relatedEntry = relatedEntry;
    }

    public String getUbpcost() {
        return ubpcost;
    }

    public void setUbpcost(String ubpcost) {
        this.ubpcost = ubpcost;
    }

    public String getUwuid() {
        return uwuid;
    }

    public void setUwuid(String uwuid) {
        this.uwuid = uwuid;
    }

    public String getUftomaped() {
        return uftomaped;
    }

    public void setUftomaped(String uftomaped) {
        this.uftomaped = uftomaped;
    }

    public String getUcampana() {
        return ucampana;
    }

    public void setUcampana(String ucampana) {
        this.ucampana = ucampana;
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

    public String getUdesp() {
        return udesp;
    }

    public void setUdesp(String udesp) {
        this.udesp = udesp;
    }

    public String getUubic1() {
        return uubic1;
    }

    public void setUubic1(String uubic1) {
        this.uubic1 = uubic1;
    }

    public String getUconcnc() {
        return uconcnc;
    }

    public void setUconcnc(String uconcnc) {
        this.uconcnc = uconcnc;
    }

    public String getUconcnd() {
        return uconcnd;
    }

    public void setUconcnd(String uconcnd) {
        this.uconcnd = uconcnd;
    }

    public String getUconcinv() {
        return uconcinv;
    }

    public void setUconcinv(String uconcinv) {
        this.uconcinv = uconcinv;
    }

    public String getUfembarque() {
        return ufembarque;
    }

    public void setUfembarque(String ufembarque) {
        this.ufembarque = ufembarque;
    }

    public String getUtermneg() {
        return utermneg;
    }

    public void setUtermneg(String utermneg) {
        this.utermneg = utermneg;
    }

    public String getUmodtransp() {
        return umodtransp;
    }

    public void setUmodtransp(String umodtransp) {
        this.umodtransp = umodtransp;
    }

    public String getUpuertodes() {
        return upuertodes;
    }

    public void setUpuertodes(String upuertodes) {
        this.upuertodes = upuertodes;
    }

    public String getUmodimp() {
        return umodimp;
    }

    public void setUmodimp(String umodimp) {
        this.umodimp = umodimp;
    }

    public String getUestadooc() {
        return uestadooc;
    }

    public void setUestadooc(String uestadooc) {
        this.uestadooc = uestadooc;
    }

    public String getUfproforma() {
        return ufproforma;
    }

    public void setUfproforma(String ufproforma) {
        this.ufproforma = ufproforma;
    }

    public String getUembarcado() {
        return uembarcado;
    }

    public void setUembarcado(String uembarcado) {
        this.uembarcado = uembarcado;
    }

    public String getUdoctransp() {
        return udoctransp;
    }

    public void setUdoctransp(String udoctransp) {
        this.udoctransp = udoctransp;
    }

    public String getUfdoctransp() {
        return ufdoctransp;
    }

    public void setUfdoctransp(String ufdoctransp) {
        this.ufdoctransp = ufdoctransp;
    }

    public String getUfarribpuerto() {
        return ufarribpuerto;
    }

    public void setUfarribpuerto(String ufarribpuerto) {
        this.ufarribpuerto = ufarribpuerto;
    }

    public String getUfarribalma() {
        return ufarribalma;
    }

    public void setUfarribalma(String ufarribalma) {
        this.ufarribalma = ufarribalma;
    }

    public String getUreqant() {
        return ureqant;
    }

    public void setUreqant(String ureqant) {
        this.ureqant = ureqant;
    }

    public String getUantrealiz() {
        return uantrealiz;
    }

    public void setUantrealiz(String uantrealiz) {
        this.uantrealiz = uantrealiz;
    }

    public Double getUtotcaj() {
        return utotcaj;
    }

    public void setUtotcaj(Double utotcaj) {
        this.utotcaj = utotcaj;
    }

    public Double getUtotbul() {
        return utotbul;
    }

    public void setUtotbul(Double utotbul) {
        this.utotbul = utotbul;
    }

    public Double getUtotlios() {
        return utotlios;
    }

    public void setUtotlios(Double utotlios) {
        this.utotlios = utotlios;
    }

    public Double getUvlrfle() {
        return uvlrfle;
    }

    public void setUvlrfle(Double uvlrfle) {
        this.uvlrfle = uvlrfle;
    }

    public Double getUvlrseg() {
        return uvlrseg;
    }

    public void setUvlrseg(Double uvlrseg) {
        this.uvlrseg = uvlrseg;
    }

    public Double getUtotfle() {
        return utotfle;
    }

    public void setUtotfle(Double utotfle) {
        this.utotfle = utotfle;
    }

    public String getUhoraini() {
        return uhoraini;
    }

    public void setUhoraini(String uhoraini) {
        this.uhoraini = uhoraini;
    }

    public String getUhorafin() {
        return uhorafin;
    }

    public void setUhorafin(String uhorafin) {
        this.uhorafin = uhorafin;
    }

    public Double getUpesobruto() {
        return upesobruto;
    }

    public void setUpesobruto(Double upesobruto) {
        this.upesobruto = upesobruto;
    }

    public String getUautprecio() {
        return uautprecio;
    }

    public void setUautprecio(String uautprecio) {
        this.uautprecio = uautprecio;
    }

    public String getuTipoNota() {
        return uTipoNota;
    }

    public void setuTipoNota(String uTipoNota) {
        this.uTipoNota = uTipoNota;
    }

    public String getUnunfac() {
        return ununfac;
    }

    public void setUnunfac(String ununfac) {
        this.ununfac = ununfac;
    }

    public String getUfechaentregapro() {
        return ufechaentregapro;
    }

    public void setUfechaentregapro(String ufechaentregapro) {
        this.ufechaentregapro = ufechaentregapro;
    }

    public String getUnumfacimp() {
        return unumfacimp;
    }

    public void setUnumfacimp(String unumfacimp) {
        this.unumfacimp = unumfacimp;
    }

    public String getUtranspimp() {
        return utranspimp;
    }

    public void setUtranspimp(String utranspimp) {
        this.utranspimp = utranspimp;
    }

    public Double getUtiempoestimado() {
        return utiempoestimado;
    }

    public void setUtiempoestimado(Double utiempoestimado) {
        this.utiempoestimado = utiempoestimado;
    }

    public String getUfecini() {
        return ufecini;
    }

    public void setUfecini(String ufecini) {
        this.ufecini = ufecini;
    }

    public String getUfecfin() {
        return ufecfin;
    }

    public void setUfecfin(String ufecfin) {
        this.ufecfin = ufecfin;
    }

    public String getUivcDone() {
        return uivcDone;
    }

    public void setUivcDone(String uivcDone) {
        this.uivcDone = uivcDone;
    }

    public String getuVendedor2() {
        return uVendedor2;
    }

    public void setuVendedor2(String uVendedor2) {
        this.uVendedor2 = uVendedor2;
    }

    public String getuDifCode() {
        return uDifCode;
    }

    public void setuDifCode(String uDifCode) {
        this.uDifCode = uDifCode;
    }

    public String getUok1IVAPA() {
        return uok1IVAPA;
    }

    public void setUok1IVAPA(String uok1IVAPA) {
        this.uok1IVAPA = uok1IVAPA;
    }

    public String getUmotdevol() {
        return umotdevol;
    }

    public void setUmotdevol(String umotdevol) {
        this.umotdevol = umotdevol;
    }

    public String getUfechapago() {
        return ufechapago;
    }

    public void setUfechapago(String ufechapago) {
        this.ufechapago = ufechapago;
    }

    public String getUantcancelado() {
        return uantcancelado;
    }

    public void setUantcancelado(String uantcancelado) {
        this.uantcancelado = uantcancelado;
    }

    public String getUimpcancelado() {
        return uimpcancelado;
    }

    public void setUimpcancelado(String uimpcancelado) {
        this.uimpcancelado = uimpcancelado;
    }

    public String getUtipoempaque() {
        return utipoempaque;
    }

    public void setUtipoempaque(String utipoempaque) {
        this.utipoempaque = utipoempaque;
    }

    public Double getUvranticipo() {
        return uvranticipo;
    }

    public void setUvranticipo(Double uvranticipo) {
        this.uvranticipo = uvranticipo;
    }

    public Double getUvrtotal() {
        return uvrtotal;
    }

    public void setUvrtotal(Double uvrtotal) {
        this.uvrtotal = uvrtotal;
    }

    public Double getUvrimpuesto() {
        return uvrimpuesto;
    }

    public void setUvrimpuesto(Double uvrimpuesto) {
        this.uvrimpuesto = uvrimpuesto;
    }

    public String getUobservacion() {
        return uobservacion;
    }

    public void setUobservacion(String uobservacion) {
        this.uobservacion = uobservacion;
    }

    public BigDecimal getUvrdeclarado() {
        return uvrdeclarado;
    }

    public void setUvrdeclarado(BigDecimal uvrdeclarado) {
        this.uvrdeclarado = uvrdeclarado;
    }

    public String getUpuertoemb() {
        return upuertoemb;
    }

    public void setUpuertoemb(String upuertoemb) {
        this.upuertoemb = upuertoemb;
    }

    public String getUnaviera() {
        return unaviera;
    }

    public void setUnaviera(String unaviera) {
        this.unaviera = unaviera;
    }

    public String getUtranspterr() {
        return utranspterr;
    }

    public void setUtranspterr(String utranspterr) {
        this.utranspterr = utranspterr;
    }

    public String getUagenteadu() {
        return uagenteadu;
    }

    public void setUagenteadu(String uagenteadu) {
        this.uagenteadu = uagenteadu;
    }

    public String getUalmacdes() {
        return ualmacdes;
    }

    public void setUalmacdes(String ualmacdes) {
        this.ualmacdes = ualmacdes;
    }

    public String getUguid() {
        return uguid;
    }

    public void setUguid(String uguid) {
        this.uguid = uguid;
    }

    public String getUbpvncon2() {
        return ubpvncon2;
    }

    public void setUbpvncon2(String ubpvncon2) {
        this.ubpvncon2 = ubpvncon2;
    }

    public String getUbpvseri() {
        return ubpvseri;
    }

    public void setUbpvseri(String ubpvseri) {
        this.ubpvseri = ubpvseri;
    }

    public String getUbpvtran() {
        return ubpvtran;
    }

    public void setUbpvtran(String ubpvtran) {
        this.ubpvtran = ubpvtran;
    }

    public String getUbpvfafe() {
        return ubpvfafe;
    }

    public void setUbpvfafe(String ubpvfafe) {
        this.ubpvfafe = ubpvfafe;
    }

    public String getUbpvcomp() {
        return ubpvcomp;
    }

    public void setUbpvcomp(String ubpvcomp) {
        this.ubpvcomp = ubpvcomp;
    }

    public String getUbpvtdoc() {
        return ubpvtdoc;
    }

    public void setUbpvtdoc(String ubpvtdoc) {
        this.ubpvtdoc = ubpvtdoc;
    }

    public String getUbpvnimp() {
        return ubpvnimp;
    }

    public void setUbpvnimp(String ubpvnimp) {
        this.ubpvnimp = ubpvnimp;
    }

    public String getUbpvNumExp() {
        return ubpvNumExp;
    }

    public void setUbpvNumExp(String ubpvNumExp) {
        this.ubpvNumExp = ubpvNumExp;
    }

    public String getUbpvncon() {
        return ubpvncon;
    }

    public void setUbpvncon(String ubpvncon) {
        this.ubpvncon = ubpvncon;
    }

    public String getUmotivo() {
        return umotivo;
    }

    public void setUmotivo(String umotivo) {
        this.umotivo = umotivo;
    }

    public String getUestadoped() {
        return uestadoped;
    }

    public void setUestadoped(String uestadoped) {
        this.uestadoped = uestadoped;
    }

    public String getuAutorret() {
        return uAutorret;
    }

    public void setuAutorret(String uAutorret) {
        this.uAutorret = uAutorret;
    }

    public String getuRetefue() {
        return uRetefue;
    }

    public void setuRetefue(String uRetefue) {
        this.uRetefue = uRetefue;
    }

    public String getuReteIca() {
        return uReteIca;
    }

    public void setuReteIca(String uReteIca) {
        this.uReteIca = uReteIca;
    }

    public String getUnwrPicS() {
        return unwrPicS;
    }

    public void setUnwrPicS(String unwrPicS) {
        this.unwrPicS = unwrPicS;
    }

    public String getUnwrbRet() {
        return unwrbRet;
    }

    public void setUnwrbRet(String unwrbRet) {
        this.unwrbRet = unwrbRet;
    }

    public Long getuNwrPAut() {
        return uNwrPAut;
    }

    public void setuNwrPAut(Long uNwrPAut) {
        this.uNwrPAut = uNwrPAut;
    }

    public String getuNwrNote() {
        return uNwrNote;
    }

    public void setuNwrNote(String uNwrNote) {
        this.uNwrNote = uNwrNote;
    }

    public String getuNwrTag() {
        return uNwrTag;
    }

    public void setuNwrTag(String uNwrTag) {
        this.uNwrTag = uNwrTag;
    }

    public Double getuNwrFrgt() {
        return uNwrFrgt;
    }

    public void setuNwrFrgt(Double uNwrFrgt) {
        this.uNwrFrgt = uNwrFrgt;
    }

    public String getUnwrnorm() {
        return unwrnorm;
    }

    public void setUnwrnorm(String unwrnorm) {
        this.unwrnorm = unwrnorm;
    }

    public String getuTypeExped() {
        return uTypeExped;
    }

    public void setuTypeExped(String uTypeExped) {
        this.uTypeExped = uTypeExped;
    }

    public String getUnwrManifest() {
        return unwrManifest;
    }

    public void setUnwrManifest(String unwrManifest) {
        this.unwrManifest = unwrManifest;
    }

    public String getUempacador() {
        return uempacador;
    }

    public void setUempacador(String uempacador) {
        this.uempacador = uempacador;
    }

    public String getUhorainiemp() {
        return uhorainiemp;
    }

    public void setUhorainiemp(String uhorainiemp) {
        this.uhorainiemp = uhorainiemp;
    }

    public String getUhorafinemp() {
        return uhorafinemp;
    }

    public void setUhorafinemp(String uhorafinemp) {
        this.uhorafinemp = uhorafinemp;
    }

    public String getUalist() {
        return ualist;
    }

    public void setUalist(String ualist) {
        this.ualist = ualist;
    }

    public String getUfeciniemp() {
        return ufeciniemp;
    }

    public void setUfeciniemp(String ufeciniemp) {
        this.ufeciniemp = ufeciniemp;
    }

    public String getUfecfinemp() {
        return ufecfinemp;
    }

    public void setUfecfinemp(String ufecfinemp) {
        this.ufecfinemp = ufecfinemp;
    }

    public String getUok1IFRS() {
        return uok1IFRS;
    }

    public void setUok1IFRS(String uok1IFRS) {
        this.uok1IFRS = uok1IFRS;
    }

    public Double getUtotfleclie() {
        return utotfleclie;
    }

    public void setUtotfleclie(Double utotfleclie) {
        this.utotfleclie = utotfleclie;
    }

    public String getUshipping() {
        return ushipping;
    }

    public void setUshipping(String ushipping) {
        this.ushipping = ushipping;
    }

    public String getuEsIndep() {
        return uEsIndep;
    }

    public void setuEsIndep(String uEsIndep) {
        this.uEsIndep = uEsIndep;
    }

    public Long getuDocEntryLeg() {
        return uDocEntryLeg;
    }

    public void setuDocEntryLeg(Long uDocEntryLeg) {
        this.uDocEntryLeg = uDocEntryLeg;
    }

    public String getuIdLineLeg() {
        return uIdLineLeg;
    }

    public void setuIdLineLeg(String uIdLineLeg) {
        this.uIdLineLeg = uIdLineLeg;
    }

    public Long getuSerieLeg() {
        return uSerieLeg;
    }

    public void setuSerieLeg(Long uSerieLeg) {
        this.uSerieLeg = uSerieLeg;
    }

    public String getuFechaArriboCEDI() {
        return uFechaArriboCEDI;
    }

    public void setuFechaArriboCEDI(String uFechaArriboCEDI) {
        this.uFechaArriboCEDI = uFechaArriboCEDI;
    }

    public String getuCatRet() {
        return uCatRet;
    }

    public void setuCatRet(String uCatRet) {
        this.uCatRet = uCatRet;
    }

    public String getuBodega() {
        return uBodega;
    }

    public void setuBodega(String uBodega) {
        this.uBodega = uBodega;
    }

    public DocumentApprovalRequests getDocumentApprovalRequests() {
        return documentApprovalRequests;
    }

    public void setDocumentApprovalRequests(DocumentApprovalRequests documentApprovalRequests) {
        this.documentApprovalRequests = documentApprovalRequests;
    }

    public List<DocumentLines.DocumentLine> getDocumentLines() {
        return documentLines;
    }

    public void setDocumentLines(List<DocumentLines.DocumentLine> documentLines) {
        this.documentLines = documentLines;
    }

    public DocumentAdditionalExpenses getDocumentAdditionalExpenses() {
        return documentAdditionalExpenses;
    }

    public void setDocumentAdditionalExpenses(DocumentAdditionalExpenses documentAdditionalExpenses) {
        this.documentAdditionalExpenses = documentAdditionalExpenses;
    }

    public WithholdingTaxDataCollection getWithholdingTaxDataCollection() {
        return withholdingTaxDataCollection;
    }

    public void setWithholdingTaxDataCollection(WithholdingTaxDataCollection withholdingTaxDataCollection) {
        this.withholdingTaxDataCollection = withholdingTaxDataCollection;
    }

    public DocumentPackages getDocumentPackages() {
        return documentPackages;
    }

    public void setDocumentPackages(DocumentPackages documentPackages) {
        this.documentPackages = documentPackages;
    }

    public DocumentSpecialLines getDocumentSpecialLines() {
        return documentSpecialLines;
    }

    public void setDocumentSpecialLines(DocumentSpecialLines documentSpecialLines) {
        this.documentSpecialLines = documentSpecialLines;
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

    public String getuMedioPg() {
        return uMedioPg;
    }

    public void setuMedioPg(String uMedioPg) {
        this.uMedioPg = uMedioPg;
    }

    public Long getuPlantilla() {
        return uPlantilla;
    }

    public void setuPlantilla(Long uPlantilla) {
        this.uPlantilla = uPlantilla;
    }

    public Long getuDespachoContado() {
        return uDespachoContado;
    }

    public void setuDespachoContado(Long uDespachoContado) {
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
    public static class DocumentApprovalRequests implements Serializable {
        @JsonProperty("Document_ApprovalRequest")
        protected List<DeliveryRestDTO.DocumentApprovalRequests.DocumentApprovalRequest> documentApprovalRequest;

        public List<DeliveryRestDTO.DocumentApprovalRequests.DocumentApprovalRequest> getDocumentApprovalRequest() {
            if (documentApprovalRequest == null) {
                documentApprovalRequest = new ArrayList<DeliveryRestDTO.DocumentApprovalRequests.DocumentApprovalRequest>();
            }
            return this.documentApprovalRequest;
        }

        public void setDocumentApprovalRequest(List<DeliveryRestDTO.DocumentApprovalRequests.DocumentApprovalRequest> documentApprovalRequest) {
            this.documentApprovalRequest = documentApprovalRequest;
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class DocumentApprovalRequest implements Serializable {
            @JsonProperty("ApprovalTemplatesID")
            protected Long approvalTemplatesID;
            @JsonProperty("Remarks")
            protected String remarks;

            public Long getApprovalTemplatesID() {
                return approvalTemplatesID;
            }

            public void setApprovalTemplatesID(Long approvalTemplatesID) {
                this.approvalTemplatesID = approvalTemplatesID;
            }

            public String getRemarks() {
                return remarks;
            }

            public void setRemarks(String remarks) {
                this.remarks = remarks;
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
            @JsonProperty("ThirdParty")
            protected String thirdParty;
            @JsonProperty("UoMEntry")
            protected Long uoMEntry;
            @JsonProperty("UoMCode")
            protected String uoMCode;
            @JsonProperty("InventoryQuantity")
            protected Double inventoryQuantity;
            @JsonProperty("RemainingOpenInventoryQuantity")
            protected Double remainingOpenInventoryQuantity;
            @JsonProperty("ParentLineNum")
            protected Long parentLineNum;
            @JsonProperty("Incoterms")
            protected Long incoterms;
            @JsonProperty("TransportMode")
            protected Long transportMode;
            @JsonProperty("ItemType")
            protected String itemType;
            @JsonProperty("ChangeInventoryQuantityIndependently")
            protected String changeInventoryQuantityIndependently;
            @JsonProperty("FreeOfChargeBP")
            protected String freeOfChargeBP;
            @JsonProperty("U_PREC_LIS")
            protected Double upreclis;
            @JsonProperty("U_DIF_PREC")
            protected Double udifprec;
            @JsonProperty("U_COSTOIMP")
            protected String ucostoimp;
            @JsonProperty("U_BANCO")
            protected String ubanco;
            @JsonProperty("U_UBICACION")
            protected String uubicacion;
            @JsonProperty("U_CHEQUE")
            protected Long ucheque;
            @JsonProperty("U_VAL_PRECIO")
            protected String uvalprecio;
            @JsonProperty("U_CAUSAL_DEV")
            protected String ucausaldev;
            @JsonProperty("U_STOCK_ALM")
            protected Double ustockalm;
            @JsonProperty("U_DISPONIBLE_ALM")
            protected Double udisponiblealm;
            @JsonProperty("U_BLD_LyID")
            protected Long ubldLyID;
            @JsonProperty("U_BLD_NCps")
            protected Long ubldnCps;
            @JsonProperty("U_Referencia")
            protected String uReferencia;
            @JsonProperty("U_Diferencia")
            protected String uDiferencia;
            @JsonProperty("U_Precio_Cotizacion")
            protected Double uPrecioCotizacion;
            @JsonProperty("U_IVCDone")
            protected String uivcDone;
            @JsonProperty("U_NWR_Base")
            protected String unwrBase;
            @JsonProperty("U_CustDate")
            protected String uCustDate;
            @JsonProperty("U_DocNumBase")
            protected String uDocNumBase;
            @JsonProperty("U_ObjType")
            protected String uObjType;
            @JsonProperty("U_NWR_QtyAllocated")
            protected Double unwrQtyAllocated;
            @JsonProperty("U_ReclamQty")
            protected Double uReclamQty;
            @JsonProperty("U_QAMark")
            protected String uqaMark;
            @JsonProperty("U_IncomingQty")
            protected Double uIncomingQty;
            @JsonProperty("U_NWR_Bin")
            protected String unwrBin;
            @JsonProperty("U_TransitWHSCode")
            protected String uTransitWHSCode;
            protected DeliveryRestDTO.DocumentLines.DocumentLine.LineTaxJurisdictions lineTaxJurisdictions;
            protected DeliveryRestDTO.DocumentLines.DocumentLine.ExportProcesses exportProcesses;
            protected DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses documentLineAdditionalExpenses;
            protected DeliveryRestDTO.DocumentLines.DocumentLine.WithholdingTaxLines withholdingTaxLines;
            protected DeliveryRestDTO.DocumentLines.DocumentLine.SerialNumbers serialNumbers;
            protected DeliveryRestDTO.DocumentLines.DocumentLine.BatchNumbers batchNumbers;
            protected List<DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation> documentLinesBinAllocations;

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

            public String getItemDescription() {
                return itemDescription;
            }

            public void setItemDescription(String itemDescription) {
                this.itemDescription = itemDescription;
            }

            public Double getQuantity() {
                return quantity;
            }

            public void setQuantity(Double quantity) {
                this.quantity = quantity;
            }

            public String getShipDate() {
                return shipDate;
            }

            public void setShipDate(String shipDate) {
                this.shipDate = shipDate;
            }

            public Double getPrice() {
                return price;
            }

            public void setPrice(Double price) {
                this.price = price;
            }

            public Double getPriceAfterVAT() {
                return priceAfterVAT;
            }

            public void setPriceAfterVAT(Double priceAfterVAT) {
                this.priceAfterVAT = priceAfterVAT;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public Double getRate() {
                return rate;
            }

            public void setRate(Double rate) {
                this.rate = rate;
            }

            public Double getDiscountPercent() {
                return discountPercent;
            }

            public void setDiscountPercent(Double discountPercent) {
                this.discountPercent = discountPercent;
            }

            public String getVendorNum() {
                return vendorNum;
            }

            public void setVendorNum(String vendorNum) {
                this.vendorNum = vendorNum;
            }

            public String getSerialNum() {
                return serialNum;
            }

            public void setSerialNum(String serialNum) {
                this.serialNum = serialNum;
            }

            public String getWarehouseCode() {
                return warehouseCode;
            }

            public void setWarehouseCode(String warehouseCode) {
                this.warehouseCode = warehouseCode;
            }

            public Long getSalesPersonCode() {
                return salesPersonCode;
            }

            public void setSalesPersonCode(Long salesPersonCode) {
                this.salesPersonCode = salesPersonCode;
            }

            public Double getCommisionPercent() {
                return commisionPercent;
            }

            public void setCommisionPercent(Double commisionPercent) {
                this.commisionPercent = commisionPercent;
            }

            public String getTreeType() {
                return treeType;
            }

            public void setTreeType(String treeType) {
                this.treeType = treeType;
            }

            public String getAccountCode() {
                return accountCode;
            }

            public void setAccountCode(String accountCode) {
                this.accountCode = accountCode;
            }

            public String getUseBaseUnits() {
                return useBaseUnits;
            }

            public void setUseBaseUnits(String useBaseUnits) {
                this.useBaseUnits = useBaseUnits;
            }

            public String getSupplierCatNum() {
                return supplierCatNum;
            }

            public void setSupplierCatNum(String supplierCatNum) {
                this.supplierCatNum = supplierCatNum;
            }

            public String getCostingCode() {
                return costingCode;
            }

            public void setCostingCode(String costingCode) {
                this.costingCode = costingCode;
            }

            public String getProjectCode() {
                return projectCode;
            }

            public void setProjectCode(String projectCode) {
                this.projectCode = projectCode;
            }

            public String getBarCode() {
                return barCode;
            }

            public void setBarCode(String barCode) {
                this.barCode = barCode;
            }

            public String getVatGroup() {
                return vatGroup;
            }

            public void setVatGroup(String vatGroup) {
                this.vatGroup = vatGroup;
            }

            public Double getHeight1() {
                return height1;
            }

            public void setHeight1(Double height1) {
                this.height1 = height1;
            }

            public Long getHight1Unit() {
                return hight1Unit;
            }

            public void setHight1Unit(Long hight1Unit) {
                this.hight1Unit = hight1Unit;
            }

            public Double getHeight2() {
                return height2;
            }

            public void setHeight2(Double height2) {
                this.height2 = height2;
            }

            public Long getHeight2Unit() {
                return height2Unit;
            }

            public void setHeight2Unit(Long height2Unit) {
                this.height2Unit = height2Unit;
            }

            public Double getLengh1() {
                return lengh1;
            }

            public void setLengh1(Double lengh1) {
                this.lengh1 = lengh1;
            }

            public Long getLengh1Unit() {
                return lengh1Unit;
            }

            public void setLengh1Unit(Long lengh1Unit) {
                this.lengh1Unit = lengh1Unit;
            }

            public Double getLengh2() {
                return lengh2;
            }

            public void setLengh2(Double lengh2) {
                this.lengh2 = lengh2;
            }

            public Long getLengh2Unit() {
                return lengh2Unit;
            }

            public void setLengh2Unit(Long lengh2Unit) {
                this.lengh2Unit = lengh2Unit;
            }

            public Double getWeight1() {
                return weight1;
            }

            public void setWeight1(Double weight1) {
                this.weight1 = weight1;
            }

            public Long getWeight1Unit() {
                return weight1Unit;
            }

            public void setWeight1Unit(Long weight1Unit) {
                this.weight1Unit = weight1Unit;
            }

            public Double getWeight2() {
                return weight2;
            }

            public void setWeight2(Double weight2) {
                this.weight2 = weight2;
            }

            public Long getWeight2Unit() {
                return weight2Unit;
            }

            public void setWeight2Unit(Long weight2Unit) {
                this.weight2Unit = weight2Unit;
            }

            public Double getFactor1() {
                return factor1;
            }

            public void setFactor1(Double factor1) {
                this.factor1 = factor1;
            }

            public Double getFactor2() {
                return factor2;
            }

            public void setFactor2(Double factor2) {
                this.factor2 = factor2;
            }

            public Double getFactor3() {
                return factor3;
            }

            public void setFactor3(Double factor3) {
                this.factor3 = factor3;
            }

            public Double getFactor4() {
                return factor4;
            }

            public void setFactor4(Double factor4) {
                this.factor4 = factor4;
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

            public Double getVolume() {
                return volume;
            }

            public void setVolume(Double volume) {
                this.volume = volume;
            }

            public Long getVolumeUnit() {
                return volumeUnit;
            }

            public void setVolumeUnit(Long volumeUnit) {
                this.volumeUnit = volumeUnit;
            }

            public Double getWidth1() {
                return width1;
            }

            public void setWidth1(Double width1) {
                this.width1 = width1;
            }

            public Long getWidth1Unit() {
                return width1Unit;
            }

            public void setWidth1Unit(Long width1Unit) {
                this.width1Unit = width1Unit;
            }

            public Double getWidth2() {
                return width2;
            }

            public void setWidth2(Double width2) {
                this.width2 = width2;
            }

            public Long getWidth2Unit() {
                return width2Unit;
            }

            public void setWidth2Unit(Long width2Unit) {
                this.width2Unit = width2Unit;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
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

            public String getTaxLiable() {
                return taxLiable;
            }

            public void setTaxLiable(String taxLiable) {
                this.taxLiable = taxLiable;
            }

            public String getPickStatus() {
                return pickStatus;
            }

            public void setPickStatus(String pickStatus) {
                this.pickStatus = pickStatus;
            }

            public Double getPickQuantity() {
                return pickQuantity;
            }

            public void setPickQuantity(Double pickQuantity) {
                this.pickQuantity = pickQuantity;
            }

            public Long getPickListIdNumber() {
                return pickListIdNumber;
            }

            public void setPickListIdNumber(Long pickListIdNumber) {
                this.pickListIdNumber = pickListIdNumber;
            }

            public String getOriginalItem() {
                return originalItem;
            }

            public void setOriginalItem(String originalItem) {
                this.originalItem = originalItem;
            }

            public String getBackOrder() {
                return backOrder;
            }

            public void setBackOrder(String backOrder) {
                this.backOrder = backOrder;
            }

            public String getFreeText() {
                return freeText;
            }

            public void setFreeText(String freeText) {
                this.freeText = freeText;
            }

            public Long getShippingMethod() {
                return shippingMethod;
            }

            public void setShippingMethod(Long shippingMethod) {
                this.shippingMethod = shippingMethod;
            }

            public Long getPoTargetNum() {
                return poTargetNum;
            }

            public void setPoTargetNum(Long poTargetNum) {
                this.poTargetNum = poTargetNum;
            }

            public String getPoTargetEntry() {
                return poTargetEntry;
            }

            public void setPoTargetEntry(String poTargetEntry) {
                this.poTargetEntry = poTargetEntry;
            }

            public Long getPoTargetRowNum() {
                return poTargetRowNum;
            }

            public void setPoTargetRowNum(Long poTargetRowNum) {
                this.poTargetRowNum = poTargetRowNum;
            }

            public String getCorrectionInvoiceItem() {
                return correctionInvoiceItem;
            }

            public void setCorrectionInvoiceItem(String correctionInvoiceItem) {
                this.correctionInvoiceItem = correctionInvoiceItem;
            }

            public Double getCorrInvAmountToStock() {
                return corrInvAmountToStock;
            }

            public void setCorrInvAmountToStock(Double corrInvAmountToStock) {
                this.corrInvAmountToStock = corrInvAmountToStock;
            }

            public Double getCorrInvAmountToDiffAcct() {
                return corrInvAmountToDiffAcct;
            }

            public void setCorrInvAmountToDiffAcct(Double corrInvAmountToDiffAcct) {
                this.corrInvAmountToDiffAcct = corrInvAmountToDiffAcct;
            }

            public Double getAppliedTax() {
                return appliedTax;
            }

            public void setAppliedTax(Double appliedTax) {
                this.appliedTax = appliedTax;
            }

            public Double getAppliedTaxFC() {
                return appliedTaxFC;
            }

            public void setAppliedTaxFC(Double appliedTaxFC) {
                this.appliedTaxFC = appliedTaxFC;
            }

            public Double getAppliedTaxSC() {
                return appliedTaxSC;
            }

            public void setAppliedTaxSC(Double appliedTaxSC) {
                this.appliedTaxSC = appliedTaxSC;
            }

            public String getWtLiable() {
                return wtLiable;
            }

            public void setWtLiable(String wtLiable) {
                this.wtLiable = wtLiable;
            }

            public String getDeferredTax() {
                return deferredTax;
            }

            public void setDeferredTax(String deferredTax) {
                this.deferredTax = deferredTax;
            }

            public Double getEqualizationTaxPercent() {
                return equalizationTaxPercent;
            }

            public void setEqualizationTaxPercent(Double equalizationTaxPercent) {
                this.equalizationTaxPercent = equalizationTaxPercent;
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

            public Double getNetTaxAmount() {
                return netTaxAmount;
            }

            public void setNetTaxAmount(Double netTaxAmount) {
                this.netTaxAmount = netTaxAmount;
            }

            public Double getNetTaxAmountFC() {
                return netTaxAmountFC;
            }

            public void setNetTaxAmountFC(Double netTaxAmountFC) {
                this.netTaxAmountFC = netTaxAmountFC;
            }

            public Double getNetTaxAmountSC() {
                return netTaxAmountSC;
            }

            public void setNetTaxAmountSC(Double netTaxAmountSC) {
                this.netTaxAmountSC = netTaxAmountSC;
            }

            public String getMeasureUnit() {
                return measureUnit;
            }

            public void setMeasureUnit(String measureUnit) {
                this.measureUnit = measureUnit;
            }

            public Double getUnitsOfMeasurment() {
                return unitsOfMeasurment;
            }

            public void setUnitsOfMeasurment(Double unitsOfMeasurment) {
                this.unitsOfMeasurment = unitsOfMeasurment;
            }

            public Double getLineTotal() {
                return lineTotal;
            }

            public void setLineTotal(Double lineTotal) {
                this.lineTotal = lineTotal;
            }

            public Double getTaxPercentagePerRow() {
                return taxPercentagePerRow;
            }

            public void setTaxPercentagePerRow(Double taxPercentagePerRow) {
                this.taxPercentagePerRow = taxPercentagePerRow;
            }

            public Double getTaxTotal() {
                return taxTotal;
            }

            public void setTaxTotal(Double taxTotal) {
                this.taxTotal = taxTotal;
            }

            public String getConsumerSalesForecast() {
                return consumerSalesForecast;
            }

            public void setConsumerSalesForecast(String consumerSalesForecast) {
                this.consumerSalesForecast = consumerSalesForecast;
            }

            public Double getExciseAmount() {
                return exciseAmount;
            }

            public void setExciseAmount(Double exciseAmount) {
                this.exciseAmount = exciseAmount;
            }

            public Double getTaxPerUnit() {
                return taxPerUnit;
            }

            public void setTaxPerUnit(Double taxPerUnit) {
                this.taxPerUnit = taxPerUnit;
            }

            public Double getTotalInclTax() {
                return totalInclTax;
            }

            public void setTotalInclTax(Double totalInclTax) {
                this.totalInclTax = totalInclTax;
            }

            public String getCountryOrg() {
                return countryOrg;
            }

            public void setCountryOrg(String countryOrg) {
                this.countryOrg = countryOrg;
            }

            public String getSww() {
                return sww;
            }

            public void setSww(String sww) {
                this.sww = sww;
            }

            public String getTransactionType() {
                return transactionType;
            }

            public void setTransactionType(String transactionType) {
                this.transactionType = transactionType;
            }

            public String getDistributeExpense() {
                return distributeExpense;
            }

            public void setDistributeExpense(String distributeExpense) {
                this.distributeExpense = distributeExpense;
            }

            public String getShipToCode() {
                return shipToCode;
            }

            public void setShipToCode(String shipToCode) {
                this.shipToCode = shipToCode;
            }

            public Double getRowTotalFC() {
                return rowTotalFC;
            }

            public void setRowTotalFC(Double rowTotalFC) {
                this.rowTotalFC = rowTotalFC;
            }

            public Double getRowTotalSC() {
                return rowTotalSC;
            }

            public void setRowTotalSC(Double rowTotalSC) {
                this.rowTotalSC = rowTotalSC;
            }

            public Double getLastBuyInmPrice() {
                return lastBuyInmPrice;
            }

            public void setLastBuyInmPrice(Double lastBuyInmPrice) {
                this.lastBuyInmPrice = lastBuyInmPrice;
            }

            public Double getLastBuyDistributeSumFc() {
                return lastBuyDistributeSumFc;
            }

            public void setLastBuyDistributeSumFc(Double lastBuyDistributeSumFc) {
                this.lastBuyDistributeSumFc = lastBuyDistributeSumFc;
            }

            public Double getLastBuyDistributeSumSc() {
                return lastBuyDistributeSumSc;
            }

            public void setLastBuyDistributeSumSc(Double lastBuyDistributeSumSc) {
                this.lastBuyDistributeSumSc = lastBuyDistributeSumSc;
            }

            public Double getLastBuyDistributeSum() {
                return lastBuyDistributeSum;
            }

            public void setLastBuyDistributeSum(Double lastBuyDistributeSum) {
                this.lastBuyDistributeSum = lastBuyDistributeSum;
            }

            public Double getStockDistributesumForeign() {
                return stockDistributesumForeign;
            }

            public void setStockDistributesumForeign(Double stockDistributesumForeign) {
                this.stockDistributesumForeign = stockDistributesumForeign;
            }

            public Double getStockDistributesumSystem() {
                return stockDistributesumSystem;
            }

            public void setStockDistributesumSystem(Double stockDistributesumSystem) {
                this.stockDistributesumSystem = stockDistributesumSystem;
            }

            public Double getStockDistributesum() {
                return stockDistributesum;
            }

            public void setStockDistributesum(Double stockDistributesum) {
                this.stockDistributesum = stockDistributesum;
            }

            public Double getStockInmPrice() {
                return stockInmPrice;
            }

            public void setStockInmPrice(Double stockInmPrice) {
                this.stockInmPrice = stockInmPrice;
            }

            public String getPickStatusEx() {
                return pickStatusEx;
            }

            public void setPickStatusEx(String pickStatusEx) {
                this.pickStatusEx = pickStatusEx;
            }

            public Double getTaxBeforeDPM() {
                return taxBeforeDPM;
            }

            public void setTaxBeforeDPM(Double taxBeforeDPM) {
                this.taxBeforeDPM = taxBeforeDPM;
            }

            public Double getTaxBeforeDPMFC() {
                return taxBeforeDPMFC;
            }

            public void setTaxBeforeDPMFC(Double taxBeforeDPMFC) {
                this.taxBeforeDPMFC = taxBeforeDPMFC;
            }

            public Double getTaxBeforeDPMSC() {
                return taxBeforeDPMSC;
            }

            public void setTaxBeforeDPMSC(Double taxBeforeDPMSC) {
                this.taxBeforeDPMSC = taxBeforeDPMSC;
            }

            public String getCfopCode() {
                return cfopCode;
            }

            public void setCfopCode(String cfopCode) {
                this.cfopCode = cfopCode;
            }

            public String getCstCode() {
                return cstCode;
            }

            public void setCstCode(String cstCode) {
                this.cstCode = cstCode;
            }

            public Long getUsage() {
                return usage;
            }

            public void setUsage(Long usage) {
                this.usage = usage;
            }

            public String getTaxOnly() {
                return taxOnly;
            }

            public void setTaxOnly(String taxOnly) {
                this.taxOnly = taxOnly;
            }

            public Long getVisualOrder() {
                return visualOrder;
            }

            public void setVisualOrder(Long visualOrder) {
                this.visualOrder = visualOrder;
            }

            public Double getBaseOpenQuantity() {
                return baseOpenQuantity;
            }

            public void setBaseOpenQuantity(Double baseOpenQuantity) {
                this.baseOpenQuantity = baseOpenQuantity;
            }

            public Double getUnitPrice() {
                return unitPrice;
            }

            public void setUnitPrice(Double unitPrice) {
                this.unitPrice = unitPrice;
            }

            public String getLineStatus() {
                return lineStatus;
            }

            public void setLineStatus(String lineStatus) {
                this.lineStatus = lineStatus;
            }

            public Double getPackageQuantity() {
                return packageQuantity;
            }

            public void setPackageQuantity(Double packageQuantity) {
                this.packageQuantity = packageQuantity;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public String getLineType() {
                return lineType;
            }

            public void setLineType(String lineType) {
                this.lineType = lineType;
            }

            public String getCogsCostingCode() {
                return cogsCostingCode;
            }

            public void setCogsCostingCode(String cogsCostingCode) {
                this.cogsCostingCode = cogsCostingCode;
            }

            public String getCogsAccountCode() {
                return cogsAccountCode;
            }

            public void setCogsAccountCode(String cogsAccountCode) {
                this.cogsAccountCode = cogsAccountCode;
            }

            public String getChangeAssemlyBoMWarehouse() {
                return changeAssemlyBoMWarehouse;
            }

            public void setChangeAssemlyBoMWarehouse(String changeAssemlyBoMWarehouse) {
                this.changeAssemlyBoMWarehouse = changeAssemlyBoMWarehouse;
            }

            public Double getGrossBuyPrice() {
                return grossBuyPrice;
            }

            public void setGrossBuyPrice(Double grossBuyPrice) {
                this.grossBuyPrice = grossBuyPrice;
            }

            public Long getGrossBase() {
                return grossBase;
            }

            public void setGrossBase(Long grossBase) {
                this.grossBase = grossBase;
            }

            public Double getGrossProfitTotalBasePrice() {
                return grossProfitTotalBasePrice;
            }

            public void setGrossProfitTotalBasePrice(Double grossProfitTotalBasePrice) {
                this.grossProfitTotalBasePrice = grossProfitTotalBasePrice;
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

            public String getCostingCode5() {
                return costingCode5;
            }

            public void setCostingCode5(String costingCode5) {
                this.costingCode5 = costingCode5;
            }

            public String getItemDetails() {
                return itemDetails;
            }

            public void setItemDetails(String itemDetails) {
                this.itemDetails = itemDetails;
            }

            public Long getLocationCode() {
                return locationCode;
            }

            public void setLocationCode(Long locationCode) {
                this.locationCode = locationCode;
            }

            public String getActualDeliveryDate() {
                return actualDeliveryDate;
            }

            public void setActualDeliveryDate(String actualDeliveryDate) {
                this.actualDeliveryDate = actualDeliveryDate;
            }

            public Double getRemainingOpenQuantity() {
                return remainingOpenQuantity;
            }

            public void setRemainingOpenQuantity(Double remainingOpenQuantity) {
                this.remainingOpenQuantity = remainingOpenQuantity;
            }

            public Double getOpenAmount() {
                return openAmount;
            }

            public void setOpenAmount(Double openAmount) {
                this.openAmount = openAmount;
            }

            public Double getOpenAmountFC() {
                return openAmountFC;
            }

            public void setOpenAmountFC(Double openAmountFC) {
                this.openAmountFC = openAmountFC;
            }

            public Double getOpenAmountSC() {
                return openAmountSC;
            }

            public void setOpenAmountSC(Double openAmountSC) {
                this.openAmountSC = openAmountSC;
            }

            public String getExLineNo() {
                return exLineNo;
            }

            public void setExLineNo(String exLineNo) {
                this.exLineNo = exLineNo;
            }

            public String getRequiredDate() {
                return requiredDate;
            }

            public void setRequiredDate(String requiredDate) {
                this.requiredDate = requiredDate;
            }

            public Double getRequiredQuantity() {
                return requiredQuantity;
            }

            public void setRequiredQuantity(Double requiredQuantity) {
                this.requiredQuantity = requiredQuantity;
            }

            public String getCogsCostingCode2() {
                return cogsCostingCode2;
            }

            public void setCogsCostingCode2(String cogsCostingCode2) {
                this.cogsCostingCode2 = cogsCostingCode2;
            }

            public String getCogsCostingCode3() {
                return cogsCostingCode3;
            }

            public void setCogsCostingCode3(String cogsCostingCode3) {
                this.cogsCostingCode3 = cogsCostingCode3;
            }

            public String getCogsCostingCode4() {
                return cogsCostingCode4;
            }

            public void setCogsCostingCode4(String cogsCostingCode4) {
                this.cogsCostingCode4 = cogsCostingCode4;
            }

            public String getCogsCostingCode5() {
                return cogsCostingCode5;
            }

            public void setCogsCostingCode5(String cogsCostingCode5) {
                this.cogsCostingCode5 = cogsCostingCode5;
            }

            public String getCsTforIPI() {
                return csTforIPI;
            }

            public void setCsTforIPI(String csTforIPI) {
                this.csTforIPI = csTforIPI;
            }

            public String getCsTforPIS() {
                return csTforPIS;
            }

            public void setCsTforPIS(String csTforPIS) {
                this.csTforPIS = csTforPIS;
            }

            public String getCsTforCOFINS() {
                return csTforCOFINS;
            }

            public void setCsTforCOFINS(String csTforCOFINS) {
                this.csTforCOFINS = csTforCOFINS;
            }

            public String getCreditOriginCode() {
                return creditOriginCode;
            }

            public void setCreditOriginCode(String creditOriginCode) {
                this.creditOriginCode = creditOriginCode;
            }

            public String getWithoutInventoryMovement() {
                return withoutInventoryMovement;
            }

            public void setWithoutInventoryMovement(String withoutInventoryMovement) {
                this.withoutInventoryMovement = withoutInventoryMovement;
            }

            public Long getAgreementNo() {
                return agreementNo;
            }

            public void setAgreementNo(Long agreementNo) {
                this.agreementNo = agreementNo;
            }

            public Long getAgreementRowNumber() {
                return agreementRowNumber;
            }

            public void setAgreementRowNumber(Long agreementRowNumber) {
                this.agreementRowNumber = agreementRowNumber;
            }

            public String getShipToDescription() {
                return shipToDescription;
            }

            public void setShipToDescription(String shipToDescription) {
                this.shipToDescription = shipToDescription;
            }

            public Long getActualBaseEntry() {
                return actualBaseEntry;
            }

            public void setActualBaseEntry(Long actualBaseEntry) {
                this.actualBaseEntry = actualBaseEntry;
            }

            public Long getActualBaseLine() {
                return actualBaseLine;
            }

            public void setActualBaseLine(Long actualBaseLine) {
                this.actualBaseLine = actualBaseLine;
            }

            public Long getDocEntry() {
                return docEntry;
            }

            public void setDocEntry(Long docEntry) {
                this.docEntry = docEntry;
            }

            public Double getSurpluses() {
                return surpluses;
            }

            public void setSurpluses(Double surpluses) {
                this.surpluses = surpluses;
            }

            public Double getDefectAndBreakup() {
                return defectAndBreakup;
            }

            public void setDefectAndBreakup(Double defectAndBreakup) {
                this.defectAndBreakup = defectAndBreakup;
            }

            public Double getShortages() {
                return shortages;
            }

            public void setShortages(Double shortages) {
                this.shortages = shortages;
            }

            public String getConsiderQuantity() {
                return considerQuantity;
            }

            public void setConsiderQuantity(String considerQuantity) {
                this.considerQuantity = considerQuantity;
            }

            public String getPartialRetirement() {
                return partialRetirement;
            }

            public void setPartialRetirement(String partialRetirement) {
                this.partialRetirement = partialRetirement;
            }

            public Double getRetirementQuantity() {
                return retirementQuantity;
            }

            public void setRetirementQuantity(Double retirementQuantity) {
                this.retirementQuantity = retirementQuantity;
            }

            public Double getRetirementAPC() {
                return retirementAPC;
            }

            public void setRetirementAPC(Double retirementAPC) {
                this.retirementAPC = retirementAPC;
            }

            public String getThirdParty() {
                return thirdParty;
            }

            public void setThirdParty(String thirdParty) {
                this.thirdParty = thirdParty;
            }

            public Long getUoMEntry() {
                return uoMEntry;
            }

            public void setUoMEntry(Long uoMEntry) {
                this.uoMEntry = uoMEntry;
            }

            public String getUoMCode() {
                return uoMCode;
            }

            public void setUoMCode(String uoMCode) {
                this.uoMCode = uoMCode;
            }

            public Double getInventoryQuantity() {
                return inventoryQuantity;
            }

            public void setInventoryQuantity(Double inventoryQuantity) {
                this.inventoryQuantity = inventoryQuantity;
            }

            public Double getRemainingOpenInventoryQuantity() {
                return remainingOpenInventoryQuantity;
            }

            public void setRemainingOpenInventoryQuantity(Double remainingOpenInventoryQuantity) {
                this.remainingOpenInventoryQuantity = remainingOpenInventoryQuantity;
            }

            public Long getParentLineNum() {
                return parentLineNum;
            }

            public void setParentLineNum(Long parentLineNum) {
                this.parentLineNum = parentLineNum;
            }

            public Long getIncoterms() {
                return incoterms;
            }

            public void setIncoterms(Long incoterms) {
                this.incoterms = incoterms;
            }

            public Long getTransportMode() {
                return transportMode;
            }

            public void setTransportMode(Long transportMode) {
                this.transportMode = transportMode;
            }

            public String getItemType() {
                return itemType;
            }

            public void setItemType(String itemType) {
                this.itemType = itemType;
            }

            public String getChangeInventoryQuantityIndependently() {
                return changeInventoryQuantityIndependently;
            }

            public void setChangeInventoryQuantityIndependently(String changeInventoryQuantityIndependently) {
                this.changeInventoryQuantityIndependently = changeInventoryQuantityIndependently;
            }

            public String getFreeOfChargeBP() {
                return freeOfChargeBP;
            }

            public void setFreeOfChargeBP(String freeOfChargeBP) {
                this.freeOfChargeBP = freeOfChargeBP;
            }

            public Double getUpreclis() {
                return upreclis;
            }

            public void setUpreclis(Double upreclis) {
                this.upreclis = upreclis;
            }

            public Double getUdifprec() {
                return udifprec;
            }

            public void setUdifprec(Double udifprec) {
                this.udifprec = udifprec;
            }

            public String getUcostoimp() {
                return ucostoimp;
            }

            public void setUcostoimp(String ucostoimp) {
                this.ucostoimp = ucostoimp;
            }

            public String getUbanco() {
                return ubanco;
            }

            public void setUbanco(String ubanco) {
                this.ubanco = ubanco;
            }

            public String getUubicacion() {
                return uubicacion;
            }

            public void setUubicacion(String uubicacion) {
                this.uubicacion = uubicacion;
            }

            public Long getUcheque() {
                return ucheque;
            }

            public void setUcheque(Long ucheque) {
                this.ucheque = ucheque;
            }

            public String getUvalprecio() {
                return uvalprecio;
            }

            public void setUvalprecio(String uvalprecio) {
                this.uvalprecio = uvalprecio;
            }

            public String getUcausaldev() {
                return ucausaldev;
            }

            public void setUcausaldev(String ucausaldev) {
                this.ucausaldev = ucausaldev;
            }

            public Double getUstockalm() {
                return ustockalm;
            }

            public void setUstockalm(Double ustockalm) {
                this.ustockalm = ustockalm;
            }

            public Double getUdisponiblealm() {
                return udisponiblealm;
            }

            public void setUdisponiblealm(Double udisponiblealm) {
                this.udisponiblealm = udisponiblealm;
            }

            public Long getUbldLyID() {
                return ubldLyID;
            }

            public void setUbldLyID(Long ubldLyID) {
                this.ubldLyID = ubldLyID;
            }

            public Long getUbldnCps() {
                return ubldnCps;
            }

            public void setUbldnCps(Long ubldnCps) {
                this.ubldnCps = ubldnCps;
            }

            public String getuReferencia() {
                return uReferencia;
            }

            public void setuReferencia(String uReferencia) {
                this.uReferencia = uReferencia;
            }

            public String getuDiferencia() {
                return uDiferencia;
            }

            public void setuDiferencia(String uDiferencia) {
                this.uDiferencia = uDiferencia;
            }

            public Double getuPrecioCotizacion() {
                return uPrecioCotizacion;
            }

            public void setuPrecioCotizacion(Double uPrecioCotizacion) {
                this.uPrecioCotizacion = uPrecioCotizacion;
            }

            public String getUivcDone() {
                return uivcDone;
            }

            public void setUivcDone(String uivcDone) {
                this.uivcDone = uivcDone;
            }

            public String getUnwrBase() {
                return unwrBase;
            }

            public void setUnwrBase(String unwrBase) {
                this.unwrBase = unwrBase;
            }

            public String getuCustDate() {
                return uCustDate;
            }

            public void setuCustDate(String uCustDate) {
                this.uCustDate = uCustDate;
            }

            public String getuDocNumBase() {
                return uDocNumBase;
            }

            public void setuDocNumBase(String uDocNumBase) {
                this.uDocNumBase = uDocNumBase;
            }

            public String getuObjType() {
                return uObjType;
            }

            public void setuObjType(String uObjType) {
                this.uObjType = uObjType;
            }

            public Double getUnwrQtyAllocated() {
                return unwrQtyAllocated;
            }

            public void setUnwrQtyAllocated(Double unwrQtyAllocated) {
                this.unwrQtyAllocated = unwrQtyAllocated;
            }

            public Double getuReclamQty() {
                return uReclamQty;
            }

            public void setuReclamQty(Double uReclamQty) {
                this.uReclamQty = uReclamQty;
            }

            public String getUqaMark() {
                return uqaMark;
            }

            public void setUqaMark(String uqaMark) {
                this.uqaMark = uqaMark;
            }

            public Double getuIncomingQty() {
                return uIncomingQty;
            }

            public void setuIncomingQty(Double uIncomingQty) {
                this.uIncomingQty = uIncomingQty;
            }

            public String getUnwrBin() {
                return unwrBin;
            }

            public void setUnwrBin(String unwrBin) {
                this.unwrBin = unwrBin;
            }

            public String getuTransitWHSCode() {
                return uTransitWHSCode;
            }

            public void setuTransitWHSCode(String uTransitWHSCode) {
                this.uTransitWHSCode = uTransitWHSCode;
            }

            public DeliveryRestDTO.DocumentLines.DocumentLine.LineTaxJurisdictions getLineTaxJurisdictions() {
                return lineTaxJurisdictions;
            }

            public void setLineTaxJurisdictions(DeliveryRestDTO.DocumentLines.DocumentLine.LineTaxJurisdictions lineTaxJurisdictions) {
                this.lineTaxJurisdictions = lineTaxJurisdictions;
            }

            public DeliveryRestDTO.DocumentLines.DocumentLine.ExportProcesses getExportProcesses() {
                return exportProcesses;
            }

            public void setExportProcesses(DeliveryRestDTO.DocumentLines.DocumentLine.ExportProcesses exportProcesses) {
                this.exportProcesses = exportProcesses;
            }

            public DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses getDocumentLineAdditionalExpenses() {
                return documentLineAdditionalExpenses;
            }

            public void setDocumentLineAdditionalExpenses(DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses documentLineAdditionalExpenses) {
                this.documentLineAdditionalExpenses = documentLineAdditionalExpenses;
            }

            public DeliveryRestDTO.DocumentLines.DocumentLine.WithholdingTaxLines getWithholdingTaxLines() {
                return withholdingTaxLines;
            }

            public void setWithholdingTaxLines(DeliveryRestDTO.DocumentLines.DocumentLine.WithholdingTaxLines withholdingTaxLines) {
                this.withholdingTaxLines = withholdingTaxLines;
            }

            public DeliveryRestDTO.DocumentLines.DocumentLine.SerialNumbers getSerialNumbers() {
                return serialNumbers;
            }

            public void setSerialNumbers(DeliveryRestDTO.DocumentLines.DocumentLine.SerialNumbers serialNumbers) {
                this.serialNumbers = serialNumbers;
            }

            public DeliveryRestDTO.DocumentLines.DocumentLine.BatchNumbers getBatchNumbers() {
                return batchNumbers;
            }

            public void setBatchNumbers(DeliveryRestDTO.DocumentLines.DocumentLine.BatchNumbers batchNumbers) {
                this.batchNumbers = batchNumbers;
            }

            public List<DocumentLinesBinAllocations.DocumentLinesBinAllocation> getDocumentLinesBinAllocations() {
                return documentLinesBinAllocations;
            }

            public void setDocumentLinesBinAllocations(List<DocumentLinesBinAllocations.DocumentLinesBinAllocation> documentLinesBinAllocations) {
                this.documentLinesBinAllocations = documentLinesBinAllocations;
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class BatchNumbers implements Serializable {
                @JsonProperty("BatchNumber")
                protected List<DeliveryRestDTO.DocumentLines.DocumentLine.BatchNumbers.BatchNumber> batchNumber;

                public List<DeliveryRestDTO.DocumentLines.DocumentLine.BatchNumbers.BatchNumber> getBatchNumber() {
                    if (batchNumber == null) {
                        batchNumber = new ArrayList<DeliveryRestDTO.DocumentLines.DocumentLine.BatchNumbers.BatchNumber>();
                    }
                    return this.batchNumber;
                }

                public void setBatchNumber(List<DeliveryRestDTO.DocumentLines.DocumentLine.BatchNumbers.BatchNumber> batchNumber) {
                    this.batchNumber = batchNumber;
                }

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
                    @JsonProperty("TrackingNote")
                    protected Long trackingNote;
                    @JsonProperty("TrackingNoteLine")
                    protected Long trackingNoteLine;

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

                    public Long getTrackingNote() {
                        return trackingNote;
                    }

                    public void setTrackingNote(Long trackingNote) {
                        this.trackingNote = trackingNote;
                    }

                    public Long getTrackingNoteLine() {
                        return trackingNoteLine;
                    }

                    public void setTrackingNoteLine(Long trackingNoteLine) {
                        this.trackingNoteLine = trackingNoteLine;
                    }
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class DocumentLineAdditionalExpenses implements Serializable {
                @JsonProperty("DocumentLineAdditionalExpense")
                protected List<DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense> documentLineAdditionalExpense;

                public List<DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense> getDocumentLineAdditionalExpense() {
                    if (documentLineAdditionalExpense == null) {
                        documentLineAdditionalExpense = new ArrayList<DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense>();
                    }
                    return this.documentLineAdditionalExpense;
                }

                public void setDocumentLineAdditionalExpense(List<DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense> documentLineAdditionalExpense) {
                    this.documentLineAdditionalExpense = documentLineAdditionalExpense;
                }

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
                    protected DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense.LineExpenseTaxJurisdictions lineExpenseTaxJurisdictions;

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

                    public DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense.LineExpenseTaxJurisdictions getLineExpenseTaxJurisdictions() {
                        return lineExpenseTaxJurisdictions;
                    }

                    public void setLineExpenseTaxJurisdictions(DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense.LineExpenseTaxJurisdictions lineExpenseTaxJurisdictions) {
                        this.lineExpenseTaxJurisdictions = lineExpenseTaxJurisdictions;
                    }

                    @JsonIgnoreProperties(ignoreUnknown = true)
                    public static class LineExpenseTaxJurisdictions implements Serializable {
                        @JsonProperty("LineExpenseTaxJurisdiction")
                        protected List<DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense.LineExpenseTaxJurisdictions.LineExpenseTaxJurisdiction> lineExpenseTaxJurisdiction;

                        public List<DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense.LineExpenseTaxJurisdictions.LineExpenseTaxJurisdiction> getLineExpenseTaxJurisdiction() {
                            if (lineExpenseTaxJurisdiction == null) {
                                lineExpenseTaxJurisdiction = new ArrayList<DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense.LineExpenseTaxJurisdictions.LineExpenseTaxJurisdiction>();
                            }
                            return this.lineExpenseTaxJurisdiction;
                        }

                        public void setLineExpenseTaxJurisdiction(List<DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense.LineExpenseTaxJurisdictions.LineExpenseTaxJurisdiction> lineExpenseTaxJurisdiction) {
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
                @JsonProperty("ExportProcess")
                protected List<DeliveryRestDTO.DocumentLines.DocumentLine.ExportProcesses.ExportProcess> exportProcess;

                public List<DeliveryRestDTO.DocumentLines.DocumentLine.ExportProcesses.ExportProcess> getExportProcess() {
                    if (exportProcess == null) {
                        exportProcess = new ArrayList<DeliveryRestDTO.DocumentLines.DocumentLine.ExportProcesses.ExportProcess>();
                    }
                    return this.exportProcess;
                }

                public void setExportProcess(List<DeliveryRestDTO.DocumentLines.DocumentLine.ExportProcesses.ExportProcess> exportProcess) {
                    this.exportProcess = exportProcess;
                }

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
                @JsonProperty("LineTaxJurisdiction")
                protected List<DeliveryRestDTO.DocumentLines.DocumentLine.LineTaxJurisdictions.LineTaxJurisdiction> lineTaxJurisdiction;

                public List<DeliveryRestDTO.DocumentLines.DocumentLine.LineTaxJurisdictions.LineTaxJurisdiction> getLineTaxJurisdiction() {
                    if (lineTaxJurisdiction == null) {
                        lineTaxJurisdiction = new ArrayList<DeliveryRestDTO.DocumentLines.DocumentLine.LineTaxJurisdictions.LineTaxJurisdiction>();
                    }
                    return this.lineTaxJurisdiction;
                }

                public void setLineTaxJurisdiction(List<DeliveryRestDTO.DocumentLines.DocumentLine.LineTaxJurisdictions.LineTaxJurisdiction> lineTaxJurisdiction) {
                    this.lineTaxJurisdiction = lineTaxJurisdiction;
                }

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
                @JsonProperty("SerialNumber")
                protected List<DeliveryRestDTO.DocumentLines.DocumentLine.SerialNumbers.SerialNumber> serialNumber;

                public List<DeliveryRestDTO.DocumentLines.DocumentLine.SerialNumbers.SerialNumber> getSerialNumber() {
                    if (serialNumber == null) {
                        serialNumber = new ArrayList<DeliveryRestDTO.DocumentLines.DocumentLine.SerialNumbers.SerialNumber>();
                    }
                    return this.serialNumber;
                }

                public void setSerialNumber(List<DeliveryRestDTO.DocumentLines.DocumentLine.SerialNumbers.SerialNumber> serialNumber) {
                    this.serialNumber = serialNumber;
                }

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
                    @JsonProperty("TrackingNote")
                    protected Long trackingNote;
                    @JsonProperty("TrackingNoteLine")
                    protected Long trackingNoteLine;

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

                    public Long getTrackingNote() {
                        return trackingNote;
                    }

                    public void setTrackingNote(Long trackingNote) {
                        this.trackingNote = trackingNote;
                    }

                    public Long getTrackingNoteLine() {
                        return trackingNoteLine;
                    }

                    public void setTrackingNoteLine(Long trackingNoteLine) {
                        this.trackingNoteLine = trackingNoteLine;
                    }
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class WithholdingTaxLines implements Serializable {
                @JsonProperty("WithholdingTaxLine")
                protected List<DeliveryRestDTO.DocumentLines.DocumentLine.WithholdingTaxLines.WithholdingTaxLine> withholdingTaxLine;

                public List<DeliveryRestDTO.DocumentLines.DocumentLine.WithholdingTaxLines.WithholdingTaxLine> getWithholdingTaxLine() {
                    if (withholdingTaxLine == null) {
                        withholdingTaxLine = new ArrayList<DeliveryRestDTO.DocumentLines.DocumentLine.WithholdingTaxLines.WithholdingTaxLine>();
                    }
                    return this.withholdingTaxLine;
                }

                public void setWithholdingTaxLine(List<DeliveryRestDTO.DocumentLines.DocumentLine.WithholdingTaxLines.WithholdingTaxLine> withholdingTaxLine) {
                    this.withholdingTaxLine = withholdingTaxLine;
                }

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
                    @JsonProperty("U_Base_ML")
                    protected Double uBaseML;
                    @JsonProperty("U_Base_MS")
                    protected Double uBaseMS;
                    @JsonProperty("U_Base_ME")
                    protected Double uBaseME;
                    @JsonProperty("U_Tarifa")
                    protected Double uTarifa;
                    @JsonProperty("U_Fuente")
                    protected String uFuente;
                    @JsonProperty("U_Ret_ML")
                    protected Double uRetML;
                    @JsonProperty("U_Ret_MS")
                    protected Double uRetMS;
                    @JsonProperty("U_Ret_ME")
                    protected Double uRetME;

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

                    public Double getuBaseML() {
                        return uBaseML;
                    }

                    public void setuBaseML(Double uBaseML) {
                        this.uBaseML = uBaseML;
                    }

                    public Double getuBaseMS() {
                        return uBaseMS;
                    }

                    public void setuBaseMS(Double uBaseMS) {
                        this.uBaseMS = uBaseMS;
                    }

                    public Double getuBaseME() {
                        return uBaseME;
                    }

                    public void setuBaseME(Double uBaseME) {
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

                    public Double getuRetML() {
                        return uRetML;
                    }

                    public void setuRetML(Double uRetML) {
                        this.uRetML = uRetML;
                    }

                    public Double getuRetMS() {
                        return uRetMS;
                    }

                    public void setuRetMS(Double uRetMS) {
                        this.uRetMS = uRetMS;
                    }

                    public Double getuRetME() {
                        return uRetME;
                    }

                    public void setuRetME(Double uRetME) {
                        this.uRetME = uRetME;
                    }
                }
            }
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DocumentAdditionalExpenses implements Serializable {
        @JsonProperty("DocumentAdditionalExpense")
        protected List<DeliveryRestDTO.DocumentAdditionalExpenses.DocumentAdditionalExpense> documentAdditionalExpense;

        public List<DeliveryRestDTO.DocumentAdditionalExpenses.DocumentAdditionalExpense> getDocumentAdditionalExpense() {
            if (documentAdditionalExpense == null) {
                documentAdditionalExpense = new ArrayList<DeliveryRestDTO.DocumentAdditionalExpenses.DocumentAdditionalExpense>();
            }
            return this.documentAdditionalExpense;
        }

        public void setDocumentAdditionalExpense(List<DocumentAdditionalExpense> documentAdditionalExpense) {
            this.documentAdditionalExpense = documentAdditionalExpense;
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class DocumentAdditionalExpense implements Serializable {
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
            protected DeliveryRestDTO.DocumentAdditionalExpenses.DocumentAdditionalExpense.DocExpenseTaxJurisdictions docExpenseTaxJurisdictions;

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
                protected List<DeliveryRestDTO.DocumentAdditionalExpenses.DocumentAdditionalExpense.DocExpenseTaxJurisdictions.DocExpenseTaxJurisdiction> docExpenseTaxJurisdiction;

                public List<DeliveryRestDTO.DocumentAdditionalExpenses.DocumentAdditionalExpense.DocExpenseTaxJurisdictions.DocExpenseTaxJurisdiction> getDocExpenseTaxJurisdiction() {
                    if (docExpenseTaxJurisdiction == null) {
                        docExpenseTaxJurisdiction = new ArrayList<DeliveryRestDTO.DocumentAdditionalExpenses.DocumentAdditionalExpense.DocExpenseTaxJurisdictions.DocExpenseTaxJurisdiction>();
                    }
                    return this.docExpenseTaxJurisdiction;
                }

                public void setDocExpenseTaxJurisdiction(List<DocExpenseTaxJurisdiction> docExpenseTaxJurisdiction) {
                    this.docExpenseTaxJurisdiction = docExpenseTaxJurisdiction;
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

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class DocumentApprovalRequests implements Serializable {
            @JsonProperty("Document_ApprovalRequest")
            protected List<DeliveryRestDTO.DocumentApprovalRequests.DocumentApprovalRequest> documentApprovalRequest;

            public List<DeliveryRestDTO.DocumentApprovalRequests.DocumentApprovalRequest> getDocumentApprovalRequest() {
                if (documentApprovalRequest == null) {
                    documentApprovalRequest = new ArrayList<DeliveryRestDTO.DocumentApprovalRequests.DocumentApprovalRequest>();
                }
                return this.documentApprovalRequest;
            }

            public void setDocumentApprovalRequest(List<DeliveryRestDTO.DocumentApprovalRequests.DocumentApprovalRequest> documentApprovalRequest) {
                this.documentApprovalRequest = documentApprovalRequest;
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class DocumentApprovalRequest implements Serializable {
                @JsonProperty("ApprovalTemplatesID")
                protected Long approvalTemplatesID;
                @JsonProperty("Remarks")
                protected String remarks;

                public Long getApprovalTemplatesID() {
                    return approvalTemplatesID;
                }

                public void setApprovalTemplatesID(Long approvalTemplatesID) {
                    this.approvalTemplatesID = approvalTemplatesID;
                }

                public String getRemarks() {
                    return remarks;
                }

                public void setRemarks(String remarks) {
                    this.remarks = remarks;
                }
            }
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class DocumentLines implements Serializable {
            @JsonProperty("DocumentLine")
            protected List<DeliveryRestDTO.DocumentLines.DocumentLine> documentLine;

            public List<DeliveryRestDTO.DocumentLines.DocumentLine> getDocumentLine() {
                if (documentLine == null) {
                    documentLine = new ArrayList<DeliveryRestDTO.DocumentLines.DocumentLine>();
                }
                return this.documentLine;
            }

            public void setDocumentLine(List<DeliveryRestDTO.DocumentLines.DocumentLine> documentLine) {
                this.documentLine = documentLine;
            }

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
                @JsonProperty("ThirdParty")
                protected String thirdParty;
                @JsonProperty("UoMEntry")
                protected Long uoMEntry;
                @JsonProperty("UoMCode")
                protected String uoMCode;
                @JsonProperty("InventoryQuantity")
                protected Double inventoryQuantity;
                @JsonProperty("RemainingOpenInventoryQuantity")
                protected Double remainingOpenInventoryQuantity;
                @JsonProperty("ParentLineNum")
                protected Long parentLineNum;
                @JsonProperty("Incoterms")
                protected Long incoterms;
                @JsonProperty("TransportMode")
                protected Long transportMode;
                @JsonProperty("ItemType")
                protected String itemType;
                @JsonProperty("ChangeInventoryQuantityIndependently")
                protected String changeInventoryQuantityIndependently;
                @JsonProperty("FreeOfChargeBP")
                protected String freeOfChargeBP;
                @JsonProperty("U_PREC_LIS")
                protected Double upreclis;
                @JsonProperty("U_DIF_PREC")
                protected Double udifprec;
                @JsonProperty("U_COSTOIMP")
                protected String ucostoimp;
                @JsonProperty("U_BANCO")
                protected String ubanco;
                @JsonProperty("U_UBICACION")
                protected String uubicacion;
                @JsonProperty("U_CHEQUE")
                protected Long ucheque;
                @JsonProperty("U_VAL_PRECIO")
                protected String uvalprecio;
                @JsonProperty("U_CAUSAL_DEV")
                protected String ucausaldev;
                @JsonProperty("U_STOCK_ALM")
                protected Double ustockalm;
                @JsonProperty("U_DISPONIBLE_ALM")
                protected Double udisponiblealm;
                @JsonProperty("U_BLD_LyID")
                protected Long ubldLyID;
                @JsonProperty("U_BLD_NCps")
                protected Long ubldnCps;
                @JsonProperty("U_Referencia")
                protected String uReferencia;
                @JsonProperty("U_Diferencia")
                protected String uDiferencia;
                @JsonProperty("U_Precio_Cotizacion")
                protected Double uPrecioCotizacion;
                @JsonProperty("U_IVCDone")
                protected String uivcDone;
                @JsonProperty("U_NWR_Base")
                protected String unwrBase;
                @JsonProperty("U_CustDate")
                protected String uCustDate;
                @JsonProperty("U_DocNumBase")
                protected String uDocNumBase;
                @JsonProperty("U_ObjType")
                protected String uObjType;
                @JsonProperty("U_NWR_QtyAllocated")
                protected Double unwrQtyAllocated;
                @JsonProperty("U_ReclamQty")
                protected Double uReclamQty;
                @JsonProperty("U_QAMark")
                protected String uqaMark;
                @JsonProperty("U_IncomingQty")
                protected Double uIncomingQty;
                @JsonProperty("U_NWR_Bin")
                protected String unwrBin;
                @JsonProperty("U_TransitWHSCode")
                protected String uTransitWHSCode;
                @JsonProperty("LineTaxJurisdictions")
                protected DeliveryRestDTO.DocumentLines.DocumentLine.LineTaxJurisdictions lineTaxJurisdictions;
                @JsonProperty("ExportProcesses")
                protected DeliveryRestDTO.DocumentLines.DocumentLine.ExportProcesses exportProcesses;
                @JsonProperty("DocumentLineAdditionalExpenses")
                protected DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses documentLineAdditionalExpenses;
                @JsonProperty("WithholdingTaxLines")
                protected DeliveryRestDTO.DocumentLines.DocumentLine.WithholdingTaxLines withholdingTaxLines;
                @JsonProperty("SerialNumbers")
                protected DeliveryRestDTO.DocumentLines.DocumentLine.SerialNumbers serialNumbers;
                @JsonProperty("BatchNumbers")
                protected DeliveryRestDTO.DocumentLines.DocumentLine.BatchNumbers batchNumbers;
                @JsonProperty("DocumentLinesBinAllocations")
                protected DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLinesBinAllocations documentLinesBinAllocations;

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

                public String getItemDescription() {
                    return itemDescription;
                }

                public void setItemDescription(String itemDescription) {
                    this.itemDescription = itemDescription;
                }

                public Double getQuantity() {
                    return quantity;
                }

                public void setQuantity(Double quantity) {
                    this.quantity = quantity;
                }

                public String getShipDate() {
                    return shipDate;
                }

                public void setShipDate(String shipDate) {
                    this.shipDate = shipDate;
                }

                public Double getPrice() {
                    return price;
                }

                public void setPrice(Double price) {
                    this.price = price;
                }

                public Double getPriceAfterVAT() {
                    return priceAfterVAT;
                }

                public void setPriceAfterVAT(Double priceAfterVAT) {
                    this.priceAfterVAT = priceAfterVAT;
                }

                public String getCurrency() {
                    return currency;
                }

                public void setCurrency(String currency) {
                    this.currency = currency;
                }

                public Double getRate() {
                    return rate;
                }

                public void setRate(Double rate) {
                    this.rate = rate;
                }

                public Double getDiscountPercent() {
                    return discountPercent;
                }

                public void setDiscountPercent(Double discountPercent) {
                    this.discountPercent = discountPercent;
                }

                public String getVendorNum() {
                    return vendorNum;
                }

                public void setVendorNum(String vendorNum) {
                    this.vendorNum = vendorNum;
                }

                public String getSerialNum() {
                    return serialNum;
                }

                public void setSerialNum(String serialNum) {
                    this.serialNum = serialNum;
                }

                public String getWarehouseCode() {
                    return warehouseCode;
                }

                public void setWarehouseCode(String warehouseCode) {
                    this.warehouseCode = warehouseCode;
                }

                public Long getSalesPersonCode() {
                    return salesPersonCode;
                }

                public void setSalesPersonCode(Long salesPersonCode) {
                    this.salesPersonCode = salesPersonCode;
                }

                public Double getCommisionPercent() {
                    return commisionPercent;
                }

                public void setCommisionPercent(Double commisionPercent) {
                    this.commisionPercent = commisionPercent;
                }

                public String getTreeType() {
                    return treeType;
                }

                public void setTreeType(String treeType) {
                    this.treeType = treeType;
                }

                public String getAccountCode() {
                    return accountCode;
                }

                public void setAccountCode(String accountCode) {
                    this.accountCode = accountCode;
                }

                public String getUseBaseUnits() {
                    return useBaseUnits;
                }

                public void setUseBaseUnits(String useBaseUnits) {
                    this.useBaseUnits = useBaseUnits;
                }

                public String getSupplierCatNum() {
                    return supplierCatNum;
                }

                public void setSupplierCatNum(String supplierCatNum) {
                    this.supplierCatNum = supplierCatNum;
                }

                public String getCostingCode() {
                    return costingCode;
                }

                public void setCostingCode(String costingCode) {
                    this.costingCode = costingCode;
                }

                public String getProjectCode() {
                    return projectCode;
                }

                public void setProjectCode(String projectCode) {
                    this.projectCode = projectCode;
                }

                public String getBarCode() {
                    return barCode;
                }

                public void setBarCode(String barCode) {
                    this.barCode = barCode;
                }

                public String getVatGroup() {
                    return vatGroup;
                }

                public void setVatGroup(String vatGroup) {
                    this.vatGroup = vatGroup;
                }

                public Double getHeight1() {
                    return height1;
                }

                public void setHeight1(Double height1) {
                    this.height1 = height1;
                }

                public Long getHight1Unit() {
                    return hight1Unit;
                }

                public void setHight1Unit(Long hight1Unit) {
                    this.hight1Unit = hight1Unit;
                }

                public Double getHeight2() {
                    return height2;
                }

                public void setHeight2(Double height2) {
                    this.height2 = height2;
                }

                public Long getHeight2Unit() {
                    return height2Unit;
                }

                public void setHeight2Unit(Long height2Unit) {
                    this.height2Unit = height2Unit;
                }

                public Double getLengh1() {
                    return lengh1;
                }

                public void setLengh1(Double lengh1) {
                    this.lengh1 = lengh1;
                }

                public Long getLengh1Unit() {
                    return lengh1Unit;
                }

                public void setLengh1Unit(Long lengh1Unit) {
                    this.lengh1Unit = lengh1Unit;
                }

                public Double getLengh2() {
                    return lengh2;
                }

                public void setLengh2(Double lengh2) {
                    this.lengh2 = lengh2;
                }

                public Long getLengh2Unit() {
                    return lengh2Unit;
                }

                public void setLengh2Unit(Long lengh2Unit) {
                    this.lengh2Unit = lengh2Unit;
                }

                public Double getWeight1() {
                    return weight1;
                }

                public void setWeight1(Double weight1) {
                    this.weight1 = weight1;
                }

                public Long getWeight1Unit() {
                    return weight1Unit;
                }

                public void setWeight1Unit(Long weight1Unit) {
                    this.weight1Unit = weight1Unit;
                }

                public Double getWeight2() {
                    return weight2;
                }

                public void setWeight2(Double weight2) {
                    this.weight2 = weight2;
                }

                public Long getWeight2Unit() {
                    return weight2Unit;
                }

                public void setWeight2Unit(Long weight2Unit) {
                    this.weight2Unit = weight2Unit;
                }

                public Double getFactor1() {
                    return factor1;
                }

                public void setFactor1(Double factor1) {
                    this.factor1 = factor1;
                }

                public Double getFactor2() {
                    return factor2;
                }

                public void setFactor2(Double factor2) {
                    this.factor2 = factor2;
                }

                public Double getFactor3() {
                    return factor3;
                }

                public void setFactor3(Double factor3) {
                    this.factor3 = factor3;
                }

                public Double getFactor4() {
                    return factor4;
                }

                public void setFactor4(Double factor4) {
                    this.factor4 = factor4;
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

                public Double getVolume() {
                    return volume;
                }

                public void setVolume(Double volume) {
                    this.volume = volume;
                }

                public Long getVolumeUnit() {
                    return volumeUnit;
                }

                public void setVolumeUnit(Long volumeUnit) {
                    this.volumeUnit = volumeUnit;
                }

                public Double getWidth1() {
                    return width1;
                }

                public void setWidth1(Double width1) {
                    this.width1 = width1;
                }

                public Long getWidth1Unit() {
                    return width1Unit;
                }

                public void setWidth1Unit(Long width1Unit) {
                    this.width1Unit = width1Unit;
                }

                public Double getWidth2() {
                    return width2;
                }

                public void setWidth2(Double width2) {
                    this.width2 = width2;
                }

                public Long getWidth2Unit() {
                    return width2Unit;
                }

                public void setWidth2Unit(Long width2Unit) {
                    this.width2Unit = width2Unit;
                }

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
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

                public String getTaxLiable() {
                    return taxLiable;
                }

                public void setTaxLiable(String taxLiable) {
                    this.taxLiable = taxLiable;
                }

                public String getPickStatus() {
                    return pickStatus;
                }

                public void setPickStatus(String pickStatus) {
                    this.pickStatus = pickStatus;
                }

                public Double getPickQuantity() {
                    return pickQuantity;
                }

                public void setPickQuantity(Double pickQuantity) {
                    this.pickQuantity = pickQuantity;
                }

                public Long getPickListIdNumber() {
                    return pickListIdNumber;
                }

                public void setPickListIdNumber(Long pickListIdNumber) {
                    this.pickListIdNumber = pickListIdNumber;
                }

                public String getOriginalItem() {
                    return originalItem;
                }

                public void setOriginalItem(String originalItem) {
                    this.originalItem = originalItem;
                }

                public String getBackOrder() {
                    return backOrder;
                }

                public void setBackOrder(String backOrder) {
                    this.backOrder = backOrder;
                }

                public String getFreeText() {
                    return freeText;
                }

                public void setFreeText(String freeText) {
                    this.freeText = freeText;
                }

                public Long getShippingMethod() {
                    return shippingMethod;
                }

                public void setShippingMethod(Long shippingMethod) {
                    this.shippingMethod = shippingMethod;
                }

                public Long getPoTargetNum() {
                    return poTargetNum;
                }

                public void setPoTargetNum(Long poTargetNum) {
                    this.poTargetNum = poTargetNum;
                }

                public String getPoTargetEntry() {
                    return poTargetEntry;
                }

                public void setPoTargetEntry(String poTargetEntry) {
                    this.poTargetEntry = poTargetEntry;
                }

                public Long getPoTargetRowNum() {
                    return poTargetRowNum;
                }

                public void setPoTargetRowNum(Long poTargetRowNum) {
                    this.poTargetRowNum = poTargetRowNum;
                }

                public String getCorrectionInvoiceItem() {
                    return correctionInvoiceItem;
                }

                public void setCorrectionInvoiceItem(String correctionInvoiceItem) {
                    this.correctionInvoiceItem = correctionInvoiceItem;
                }

                public Double getCorrInvAmountToStock() {
                    return corrInvAmountToStock;
                }

                public void setCorrInvAmountToStock(Double corrInvAmountToStock) {
                    this.corrInvAmountToStock = corrInvAmountToStock;
                }

                public Double getCorrInvAmountToDiffAcct() {
                    return corrInvAmountToDiffAcct;
                }

                public void setCorrInvAmountToDiffAcct(Double corrInvAmountToDiffAcct) {
                    this.corrInvAmountToDiffAcct = corrInvAmountToDiffAcct;
                }

                public Double getAppliedTax() {
                    return appliedTax;
                }

                public void setAppliedTax(Double appliedTax) {
                    this.appliedTax = appliedTax;
                }

                public Double getAppliedTaxFC() {
                    return appliedTaxFC;
                }

                public void setAppliedTaxFC(Double appliedTaxFC) {
                    this.appliedTaxFC = appliedTaxFC;
                }

                public Double getAppliedTaxSC() {
                    return appliedTaxSC;
                }

                public void setAppliedTaxSC(Double appliedTaxSC) {
                    this.appliedTaxSC = appliedTaxSC;
                }

                public String getWtLiable() {
                    return wtLiable;
                }

                public void setWtLiable(String wtLiable) {
                    this.wtLiable = wtLiable;
                }

                public String getDeferredTax() {
                    return deferredTax;
                }

                public void setDeferredTax(String deferredTax) {
                    this.deferredTax = deferredTax;
                }

                public Double getEqualizationTaxPercent() {
                    return equalizationTaxPercent;
                }

                public void setEqualizationTaxPercent(Double equalizationTaxPercent) {
                    this.equalizationTaxPercent = equalizationTaxPercent;
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

                public Double getNetTaxAmount() {
                    return netTaxAmount;
                }

                public void setNetTaxAmount(Double netTaxAmount) {
                    this.netTaxAmount = netTaxAmount;
                }

                public Double getNetTaxAmountFC() {
                    return netTaxAmountFC;
                }

                public void setNetTaxAmountFC(Double netTaxAmountFC) {
                    this.netTaxAmountFC = netTaxAmountFC;
                }

                public Double getNetTaxAmountSC() {
                    return netTaxAmountSC;
                }

                public void setNetTaxAmountSC(Double netTaxAmountSC) {
                    this.netTaxAmountSC = netTaxAmountSC;
                }

                public String getMeasureUnit() {
                    return measureUnit;
                }

                public void setMeasureUnit(String measureUnit) {
                    this.measureUnit = measureUnit;
                }

                public Double getUnitsOfMeasurment() {
                    return unitsOfMeasurment;
                }

                public void setUnitsOfMeasurment(Double unitsOfMeasurment) {
                    this.unitsOfMeasurment = unitsOfMeasurment;
                }

                public Double getLineTotal() {
                    return lineTotal;
                }

                public void setLineTotal(Double lineTotal) {
                    this.lineTotal = lineTotal;
                }

                public Double getTaxPercentagePerRow() {
                    return taxPercentagePerRow;
                }

                public void setTaxPercentagePerRow(Double taxPercentagePerRow) {
                    this.taxPercentagePerRow = taxPercentagePerRow;
                }

                public Double getTaxTotal() {
                    return taxTotal;
                }

                public void setTaxTotal(Double taxTotal) {
                    this.taxTotal = taxTotal;
                }

                public String getConsumerSalesForecast() {
                    return consumerSalesForecast;
                }

                public void setConsumerSalesForecast(String consumerSalesForecast) {
                    this.consumerSalesForecast = consumerSalesForecast;
                }

                public Double getExciseAmount() {
                    return exciseAmount;
                }

                public void setExciseAmount(Double exciseAmount) {
                    this.exciseAmount = exciseAmount;
                }

                public Double getTaxPerUnit() {
                    return taxPerUnit;
                }

                public void setTaxPerUnit(Double taxPerUnit) {
                    this.taxPerUnit = taxPerUnit;
                }

                public Double getTotalInclTax() {
                    return totalInclTax;
                }

                public void setTotalInclTax(Double totalInclTax) {
                    this.totalInclTax = totalInclTax;
                }

                public String getCountryOrg() {
                    return countryOrg;
                }

                public void setCountryOrg(String countryOrg) {
                    this.countryOrg = countryOrg;
                }

                public String getSww() {
                    return sww;
                }

                public void setSww(String sww) {
                    this.sww = sww;
                }

                public String getTransactionType() {
                    return transactionType;
                }

                public void setTransactionType(String transactionType) {
                    this.transactionType = transactionType;
                }

                public String getDistributeExpense() {
                    return distributeExpense;
                }

                public void setDistributeExpense(String distributeExpense) {
                    this.distributeExpense = distributeExpense;
                }

                public String getShipToCode() {
                    return shipToCode;
                }

                public void setShipToCode(String shipToCode) {
                    this.shipToCode = shipToCode;
                }

                public Double getRowTotalFC() {
                    return rowTotalFC;
                }

                public void setRowTotalFC(Double rowTotalFC) {
                    this.rowTotalFC = rowTotalFC;
                }

                public Double getRowTotalSC() {
                    return rowTotalSC;
                }

                public void setRowTotalSC(Double rowTotalSC) {
                    this.rowTotalSC = rowTotalSC;
                }

                public Double getLastBuyInmPrice() {
                    return lastBuyInmPrice;
                }

                public void setLastBuyInmPrice(Double lastBuyInmPrice) {
                    this.lastBuyInmPrice = lastBuyInmPrice;
                }

                public Double getLastBuyDistributeSumFc() {
                    return lastBuyDistributeSumFc;
                }

                public void setLastBuyDistributeSumFc(Double lastBuyDistributeSumFc) {
                    this.lastBuyDistributeSumFc = lastBuyDistributeSumFc;
                }

                public Double getLastBuyDistributeSumSc() {
                    return lastBuyDistributeSumSc;
                }

                public void setLastBuyDistributeSumSc(Double lastBuyDistributeSumSc) {
                    this.lastBuyDistributeSumSc = lastBuyDistributeSumSc;
                }

                public Double getLastBuyDistributeSum() {
                    return lastBuyDistributeSum;
                }

                public void setLastBuyDistributeSum(Double lastBuyDistributeSum) {
                    this.lastBuyDistributeSum = lastBuyDistributeSum;
                }

                public Double getStockDistributesumForeign() {
                    return stockDistributesumForeign;
                }

                public void setStockDistributesumForeign(Double stockDistributesumForeign) {
                    this.stockDistributesumForeign = stockDistributesumForeign;
                }

                public Double getStockDistributesumSystem() {
                    return stockDistributesumSystem;
                }

                public void setStockDistributesumSystem(Double stockDistributesumSystem) {
                    this.stockDistributesumSystem = stockDistributesumSystem;
                }

                public Double getStockDistributesum() {
                    return stockDistributesum;
                }

                public void setStockDistributesum(Double stockDistributesum) {
                    this.stockDistributesum = stockDistributesum;
                }

                public Double getStockInmPrice() {
                    return stockInmPrice;
                }

                public void setStockInmPrice(Double stockInmPrice) {
                    this.stockInmPrice = stockInmPrice;
                }

                public String getPickStatusEx() {
                    return pickStatusEx;
                }

                public void setPickStatusEx(String pickStatusEx) {
                    this.pickStatusEx = pickStatusEx;
                }

                public Double getTaxBeforeDPM() {
                    return taxBeforeDPM;
                }

                public void setTaxBeforeDPM(Double taxBeforeDPM) {
                    this.taxBeforeDPM = taxBeforeDPM;
                }

                public Double getTaxBeforeDPMFC() {
                    return taxBeforeDPMFC;
                }

                public void setTaxBeforeDPMFC(Double taxBeforeDPMFC) {
                    this.taxBeforeDPMFC = taxBeforeDPMFC;
                }

                public Double getTaxBeforeDPMSC() {
                    return taxBeforeDPMSC;
                }

                public void setTaxBeforeDPMSC(Double taxBeforeDPMSC) {
                    this.taxBeforeDPMSC = taxBeforeDPMSC;
                }

                public String getCfopCode() {
                    return cfopCode;
                }

                public void setCfopCode(String cfopCode) {
                    this.cfopCode = cfopCode;
                }

                public String getCstCode() {
                    return cstCode;
                }

                public void setCstCode(String cstCode) {
                    this.cstCode = cstCode;
                }

                public Long getUsage() {
                    return usage;
                }

                public void setUsage(Long usage) {
                    this.usage = usage;
                }

                public String getTaxOnly() {
                    return taxOnly;
                }

                public void setTaxOnly(String taxOnly) {
                    this.taxOnly = taxOnly;
                }

                public Long getVisualOrder() {
                    return visualOrder;
                }

                public void setVisualOrder(Long visualOrder) {
                    this.visualOrder = visualOrder;
                }

                public Double getBaseOpenQuantity() {
                    return baseOpenQuantity;
                }

                public void setBaseOpenQuantity(Double baseOpenQuantity) {
                    this.baseOpenQuantity = baseOpenQuantity;
                }

                public Double getUnitPrice() {
                    return unitPrice;
                }

                public void setUnitPrice(Double unitPrice) {
                    this.unitPrice = unitPrice;
                }

                public String getLineStatus() {
                    return lineStatus;
                }

                public void setLineStatus(String lineStatus) {
                    this.lineStatus = lineStatus;
                }

                public Double getPackageQuantity() {
                    return packageQuantity;
                }

                public void setPackageQuantity(Double packageQuantity) {
                    this.packageQuantity = packageQuantity;
                }

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getLineType() {
                    return lineType;
                }

                public void setLineType(String lineType) {
                    this.lineType = lineType;
                }

                public String getCogsCostingCode() {
                    return cogsCostingCode;
                }

                public void setCogsCostingCode(String cogsCostingCode) {
                    this.cogsCostingCode = cogsCostingCode;
                }

                public String getCogsAccountCode() {
                    return cogsAccountCode;
                }

                public void setCogsAccountCode(String cogsAccountCode) {
                    this.cogsAccountCode = cogsAccountCode;
                }

                public String getChangeAssemlyBoMWarehouse() {
                    return changeAssemlyBoMWarehouse;
                }

                public void setChangeAssemlyBoMWarehouse(String changeAssemlyBoMWarehouse) {
                    this.changeAssemlyBoMWarehouse = changeAssemlyBoMWarehouse;
                }

                public Double getGrossBuyPrice() {
                    return grossBuyPrice;
                }

                public void setGrossBuyPrice(Double grossBuyPrice) {
                    this.grossBuyPrice = grossBuyPrice;
                }

                public Long getGrossBase() {
                    return grossBase;
                }

                public void setGrossBase(Long grossBase) {
                    this.grossBase = grossBase;
                }

                public Double getGrossProfitTotalBasePrice() {
                    return grossProfitTotalBasePrice;
                }

                public void setGrossProfitTotalBasePrice(Double grossProfitTotalBasePrice) {
                    this.grossProfitTotalBasePrice = grossProfitTotalBasePrice;
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

                public String getCostingCode5() {
                    return costingCode5;
                }

                public void setCostingCode5(String costingCode5) {
                    this.costingCode5 = costingCode5;
                }

                public String getItemDetails() {
                    return itemDetails;
                }

                public void setItemDetails(String itemDetails) {
                    this.itemDetails = itemDetails;
                }

                public Long getLocationCode() {
                    return locationCode;
                }

                public void setLocationCode(Long locationCode) {
                    this.locationCode = locationCode;
                }

                public String getActualDeliveryDate() {
                    return actualDeliveryDate;
                }

                public void setActualDeliveryDate(String actualDeliveryDate) {
                    this.actualDeliveryDate = actualDeliveryDate;
                }

                public Double getRemainingOpenQuantity() {
                    return remainingOpenQuantity;
                }

                public void setRemainingOpenQuantity(Double remainingOpenQuantity) {
                    this.remainingOpenQuantity = remainingOpenQuantity;
                }

                public Double getOpenAmount() {
                    return openAmount;
                }

                public void setOpenAmount(Double openAmount) {
                    this.openAmount = openAmount;
                }

                public Double getOpenAmountFC() {
                    return openAmountFC;
                }

                public void setOpenAmountFC(Double openAmountFC) {
                    this.openAmountFC = openAmountFC;
                }

                public Double getOpenAmountSC() {
                    return openAmountSC;
                }

                public void setOpenAmountSC(Double openAmountSC) {
                    this.openAmountSC = openAmountSC;
                }

                public String getExLineNo() {
                    return exLineNo;
                }

                public void setExLineNo(String exLineNo) {
                    this.exLineNo = exLineNo;
                }

                public String getRequiredDate() {
                    return requiredDate;
                }

                public void setRequiredDate(String requiredDate) {
                    this.requiredDate = requiredDate;
                }

                public Double getRequiredQuantity() {
                    return requiredQuantity;
                }

                public void setRequiredQuantity(Double requiredQuantity) {
                    this.requiredQuantity = requiredQuantity;
                }

                public String getCogsCostingCode2() {
                    return cogsCostingCode2;
                }

                public void setCogsCostingCode2(String cogsCostingCode2) {
                    this.cogsCostingCode2 = cogsCostingCode2;
                }

                public String getCogsCostingCode3() {
                    return cogsCostingCode3;
                }

                public void setCogsCostingCode3(String cogsCostingCode3) {
                    this.cogsCostingCode3 = cogsCostingCode3;
                }

                public String getCogsCostingCode4() {
                    return cogsCostingCode4;
                }

                public void setCogsCostingCode4(String cogsCostingCode4) {
                    this.cogsCostingCode4 = cogsCostingCode4;
                }

                public String getCogsCostingCode5() {
                    return cogsCostingCode5;
                }

                public void setCogsCostingCode5(String cogsCostingCode5) {
                    this.cogsCostingCode5 = cogsCostingCode5;
                }

                public String getCsTforIPI() {
                    return csTforIPI;
                }

                public void setCsTforIPI(String csTforIPI) {
                    this.csTforIPI = csTforIPI;
                }

                public String getCsTforPIS() {
                    return csTforPIS;
                }

                public void setCsTforPIS(String csTforPIS) {
                    this.csTforPIS = csTforPIS;
                }

                public String getCsTforCOFINS() {
                    return csTforCOFINS;
                }

                public void setCsTforCOFINS(String csTforCOFINS) {
                    this.csTforCOFINS = csTforCOFINS;
                }

                public String getCreditOriginCode() {
                    return creditOriginCode;
                }

                public void setCreditOriginCode(String creditOriginCode) {
                    this.creditOriginCode = creditOriginCode;
                }

                public String getWithoutInventoryMovement() {
                    return withoutInventoryMovement;
                }

                public void setWithoutInventoryMovement(String withoutInventoryMovement) {
                    this.withoutInventoryMovement = withoutInventoryMovement;
                }

                public Long getAgreementNo() {
                    return agreementNo;
                }

                public void setAgreementNo(Long agreementNo) {
                    this.agreementNo = agreementNo;
                }

                public Long getAgreementRowNumber() {
                    return agreementRowNumber;
                }

                public void setAgreementRowNumber(Long agreementRowNumber) {
                    this.agreementRowNumber = agreementRowNumber;
                }

                public String getShipToDescription() {
                    return shipToDescription;
                }

                public void setShipToDescription(String shipToDescription) {
                    this.shipToDescription = shipToDescription;
                }

                public Long getActualBaseEntry() {
                    return actualBaseEntry;
                }

                public void setActualBaseEntry(Long actualBaseEntry) {
                    this.actualBaseEntry = actualBaseEntry;
                }

                public Long getActualBaseLine() {
                    return actualBaseLine;
                }

                public void setActualBaseLine(Long actualBaseLine) {
                    this.actualBaseLine = actualBaseLine;
                }

                public Long getDocEntry() {
                    return docEntry;
                }

                public void setDocEntry(Long docEntry) {
                    this.docEntry = docEntry;
                }

                public Double getSurpluses() {
                    return surpluses;
                }

                public void setSurpluses(Double surpluses) {
                    this.surpluses = surpluses;
                }

                public Double getDefectAndBreakup() {
                    return defectAndBreakup;
                }

                public void setDefectAndBreakup(Double defectAndBreakup) {
                    this.defectAndBreakup = defectAndBreakup;
                }

                public Double getShortages() {
                    return shortages;
                }

                public void setShortages(Double shortages) {
                    this.shortages = shortages;
                }

                public String getConsiderQuantity() {
                    return considerQuantity;
                }

                public void setConsiderQuantity(String considerQuantity) {
                    this.considerQuantity = considerQuantity;
                }

                public String getPartialRetirement() {
                    return partialRetirement;
                }

                public void setPartialRetirement(String partialRetirement) {
                    this.partialRetirement = partialRetirement;
                }

                public Double getRetirementQuantity() {
                    return retirementQuantity;
                }

                public void setRetirementQuantity(Double retirementQuantity) {
                    this.retirementQuantity = retirementQuantity;
                }

                public Double getRetirementAPC() {
                    return retirementAPC;
                }

                public void setRetirementAPC(Double retirementAPC) {
                    this.retirementAPC = retirementAPC;
                }

                public String getThirdParty() {
                    return thirdParty;
                }

                public void setThirdParty(String thirdParty) {
                    this.thirdParty = thirdParty;
                }

                public Long getUoMEntry() {
                    return uoMEntry;
                }

                public void setUoMEntry(Long uoMEntry) {
                    this.uoMEntry = uoMEntry;
                }

                public String getUoMCode() {
                    return uoMCode;
                }

                public void setUoMCode(String uoMCode) {
                    this.uoMCode = uoMCode;
                }

                public Double getInventoryQuantity() {
                    return inventoryQuantity;
                }

                public void setInventoryQuantity(Double inventoryQuantity) {
                    this.inventoryQuantity = inventoryQuantity;
                }

                public Double getRemainingOpenInventoryQuantity() {
                    return remainingOpenInventoryQuantity;
                }

                public void setRemainingOpenInventoryQuantity(Double remainingOpenInventoryQuantity) {
                    this.remainingOpenInventoryQuantity = remainingOpenInventoryQuantity;
                }

                public Long getParentLineNum() {
                    return parentLineNum;
                }

                public void setParentLineNum(Long parentLineNum) {
                    this.parentLineNum = parentLineNum;
                }

                public Long getIncoterms() {
                    return incoterms;
                }

                public void setIncoterms(Long incoterms) {
                    this.incoterms = incoterms;
                }

                public Long getTransportMode() {
                    return transportMode;
                }

                public void setTransportMode(Long transportMode) {
                    this.transportMode = transportMode;
                }

                public String getItemType() {
                    return itemType;
                }

                public void setItemType(String itemType) {
                    this.itemType = itemType;
                }

                public String getChangeInventoryQuantityIndependently() {
                    return changeInventoryQuantityIndependently;
                }

                public void setChangeInventoryQuantityIndependently(String changeInventoryQuantityIndependently) {
                    this.changeInventoryQuantityIndependently = changeInventoryQuantityIndependently;
                }

                public String getFreeOfChargeBP() {
                    return freeOfChargeBP;
                }

                public void setFreeOfChargeBP(String freeOfChargeBP) {
                    this.freeOfChargeBP = freeOfChargeBP;
                }

                public Double getUpreclis() {
                    return upreclis;
                }

                public void setUpreclis(Double upreclis) {
                    this.upreclis = upreclis;
                }

                public Double getUdifprec() {
                    return udifprec;
                }

                public void setUdifprec(Double udifprec) {
                    this.udifprec = udifprec;
                }

                public String getUcostoimp() {
                    return ucostoimp;
                }

                public void setUcostoimp(String ucostoimp) {
                    this.ucostoimp = ucostoimp;
                }

                public String getUbanco() {
                    return ubanco;
                }

                public void setUbanco(String ubanco) {
                    this.ubanco = ubanco;
                }

                public String getUubicacion() {
                    return uubicacion;
                }

                public void setUubicacion(String uubicacion) {
                    this.uubicacion = uubicacion;
                }

                public Long getUcheque() {
                    return ucheque;
                }

                public void setUcheque(Long ucheque) {
                    this.ucheque = ucheque;
                }

                public String getUvalprecio() {
                    return uvalprecio;
                }

                public void setUvalprecio(String uvalprecio) {
                    this.uvalprecio = uvalprecio;
                }

                public String getUcausaldev() {
                    return ucausaldev;
                }

                public void setUcausaldev(String ucausaldev) {
                    this.ucausaldev = ucausaldev;
                }

                public Double getUstockalm() {
                    return ustockalm;
                }

                public void setUstockalm(Double ustockalm) {
                    this.ustockalm = ustockalm;
                }

                public Double getUdisponiblealm() {
                    return udisponiblealm;
                }

                public void setUdisponiblealm(Double udisponiblealm) {
                    this.udisponiblealm = udisponiblealm;
                }

                public Long getUbldLyID() {
                    return ubldLyID;
                }

                public void setUbldLyID(Long ubldLyID) {
                    this.ubldLyID = ubldLyID;
                }

                public Long getUbldnCps() {
                    return ubldnCps;
                }

                public void setUbldnCps(Long ubldnCps) {
                    this.ubldnCps = ubldnCps;
                }

                public String getuReferencia() {
                    return uReferencia;
                }

                public void setuReferencia(String uReferencia) {
                    this.uReferencia = uReferencia;
                }

                public String getuDiferencia() {
                    return uDiferencia;
                }

                public void setuDiferencia(String uDiferencia) {
                    this.uDiferencia = uDiferencia;
                }

                public Double getuPrecioCotizacion() {
                    return uPrecioCotizacion;
                }

                public void setuPrecioCotizacion(Double uPrecioCotizacion) {
                    this.uPrecioCotizacion = uPrecioCotizacion;
                }

                public String getUivcDone() {
                    return uivcDone;
                }

                public void setUivcDone(String uivcDone) {
                    this.uivcDone = uivcDone;
                }

                public String getUnwrBase() {
                    return unwrBase;
                }

                public void setUnwrBase(String unwrBase) {
                    this.unwrBase = unwrBase;
                }

                public String getuCustDate() {
                    return uCustDate;
                }

                public void setuCustDate(String uCustDate) {
                    this.uCustDate = uCustDate;
                }

                public String getuDocNumBase() {
                    return uDocNumBase;
                }

                public void setuDocNumBase(String uDocNumBase) {
                    this.uDocNumBase = uDocNumBase;
                }

                public String getuObjType() {
                    return uObjType;
                }

                public void setuObjType(String uObjType) {
                    this.uObjType = uObjType;
                }

                public Double getUnwrQtyAllocated() {
                    return unwrQtyAllocated;
                }

                public void setUnwrQtyAllocated(Double unwrQtyAllocated) {
                    this.unwrQtyAllocated = unwrQtyAllocated;
                }

                public Double getuReclamQty() {
                    return uReclamQty;
                }

                public void setuReclamQty(Double uReclamQty) {
                    this.uReclamQty = uReclamQty;
                }

                public String getUqaMark() {
                    return uqaMark;
                }

                public void setUqaMark(String uqaMark) {
                    this.uqaMark = uqaMark;
                }

                public Double getuIncomingQty() {
                    return uIncomingQty;
                }

                public void setuIncomingQty(Double uIncomingQty) {
                    this.uIncomingQty = uIncomingQty;
                }

                public String getUnwrBin() {
                    return unwrBin;
                }

                public void setUnwrBin(String unwrBin) {
                    this.unwrBin = unwrBin;
                }

                public String getuTransitWHSCode() {
                    return uTransitWHSCode;
                }

                public void setuTransitWHSCode(String uTransitWHSCode) {
                    this.uTransitWHSCode = uTransitWHSCode;
                }

                public DeliveryRestDTO.DocumentLines.DocumentLine.LineTaxJurisdictions getLineTaxJurisdictions() {
                    return lineTaxJurisdictions;
                }

                public void setLineTaxJurisdictions(DeliveryRestDTO.DocumentLines.DocumentLine.LineTaxJurisdictions lineTaxJurisdictions) {
                    this.lineTaxJurisdictions = lineTaxJurisdictions;
                }

                public DeliveryRestDTO.DocumentLines.DocumentLine.ExportProcesses getExportProcesses() {
                    return exportProcesses;
                }

                public void setExportProcesses(DeliveryRestDTO.DocumentLines.DocumentLine.ExportProcesses exportProcesses) {
                    this.exportProcesses = exportProcesses;
                }

                public DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses getDocumentLineAdditionalExpenses() {
                    return documentLineAdditionalExpenses;
                }

                public void setDocumentLineAdditionalExpenses(DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses documentLineAdditionalExpenses) {
                    this.documentLineAdditionalExpenses = documentLineAdditionalExpenses;
                }

                public DeliveryRestDTO.DocumentLines.DocumentLine.WithholdingTaxLines getWithholdingTaxLines() {
                    return withholdingTaxLines;
                }

                public void setWithholdingTaxLines(DeliveryRestDTO.DocumentLines.DocumentLine.WithholdingTaxLines withholdingTaxLines) {
                    this.withholdingTaxLines = withholdingTaxLines;
                }

                public DeliveryRestDTO.DocumentLines.DocumentLine.SerialNumbers getSerialNumbers() {
                    return serialNumbers;
                }

                public void setSerialNumbers(DeliveryRestDTO.DocumentLines.DocumentLine.SerialNumbers serialNumbers) {
                    this.serialNumbers = serialNumbers;
                }

                public DeliveryRestDTO.DocumentLines.DocumentLine.BatchNumbers getBatchNumbers() {
                    return batchNumbers;
                }

                public void setBatchNumbers(DeliveryRestDTO.DocumentLines.DocumentLine.BatchNumbers batchNumbers) {
                    this.batchNumbers = batchNumbers;
                }

                public DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLinesBinAllocations getDocumentLinesBinAllocations() {
                    return documentLinesBinAllocations;
                }

                public void setDocumentLinesBinAllocations(DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLinesBinAllocations documentLinesBinAllocations) {
                    this.documentLinesBinAllocations = documentLinesBinAllocations;
                }

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class BatchNumbers implements Serializable {
                    @JsonProperty("BatchNumber")
                    protected List<DeliveryRestDTO.DocumentLines.DocumentLine.BatchNumbers.BatchNumber> batchNumber;

                    public List<DeliveryRestDTO.DocumentLines.DocumentLine.BatchNumbers.BatchNumber> getBatchNumber() {
                        if (batchNumber == null) {
                            batchNumber = new ArrayList<DeliveryRestDTO.DocumentLines.DocumentLine.BatchNumbers.BatchNumber>();
                        }
                        return this.batchNumber;
                    }

                    public void setBatchNumber(List<DeliveryRestDTO.DocumentLines.DocumentLine.BatchNumbers.BatchNumber> batchNumber) {
                        this.batchNumber = batchNumber;
                    }

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
                        @JsonProperty("TrackingNote")
                        protected Long trackingNote;
                        @JsonProperty("TrackingNoteLine")
                        protected Long trackingNoteLine;

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

                        public Long getTrackingNote() {
                            return trackingNote;
                        }

                        public void setTrackingNote(Long trackingNote) {
                            this.trackingNote = trackingNote;
                        }

                        public Long getTrackingNoteLine() {
                            return trackingNoteLine;
                        }

                        public void setTrackingNoteLine(Long trackingNoteLine) {
                            this.trackingNoteLine = trackingNoteLine;
                        }
                    }
                }

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class DocumentLineAdditionalExpenses implements Serializable {
                    @JsonProperty("DocumentLineAdditionalExpense")
                    protected List<DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense> documentLineAdditionalExpense;

                    public List<DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense> getDocumentLineAdditionalExpense() {
                        if (documentLineAdditionalExpense == null) {
                            documentLineAdditionalExpense = new ArrayList<DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense>();
                        }
                        return this.documentLineAdditionalExpense;
                    }

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
                        protected DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense.LineExpenseTaxJurisdictions lineExpenseTaxJurisdictions;


                        @JsonIgnoreProperties(ignoreUnknown = true)
                        public static class LineExpenseTaxJurisdictions implements Serializable {
                            @JsonProperty("LineExpenseTaxJurisdiction")
                            protected List<DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense.LineExpenseTaxJurisdictions.LineExpenseTaxJurisdiction> lineExpenseTaxJurisdiction;

                            public List<DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense.LineExpenseTaxJurisdictions.LineExpenseTaxJurisdiction> getLineExpenseTaxJurisdiction() {
                                if (lineExpenseTaxJurisdiction == null) {
                                    lineExpenseTaxJurisdiction = new ArrayList<DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense.LineExpenseTaxJurisdictions.LineExpenseTaxJurisdiction>();
                                }
                                return this.lineExpenseTaxJurisdiction;
                            }

                            public void setLineExpenseTaxJurisdiction(List<DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLineAdditionalExpenses.DocumentLineAdditionalExpense.LineExpenseTaxJurisdictions.LineExpenseTaxJurisdiction> lineExpenseTaxJurisdiction) {
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
                    @JsonProperty("DocumentLinesBinAllocation")
                    protected List<DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation> documentLinesBinAllocation;

                    public List<DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation> getDocumentLinesBinAllocation() {
                        if (documentLinesBinAllocation == null) {
                            documentLinesBinAllocation = new ArrayList<DeliveryRestDTO.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation>();
                        }
                        return this.documentLinesBinAllocation;
                    }

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
                    @JsonProperty("ExportProcess")
                    protected List<DeliveryRestDTO.DocumentLines.DocumentLine.ExportProcesses.ExportProcess> exportProcess;

                    public List<DeliveryRestDTO.DocumentLines.DocumentLine.ExportProcesses.ExportProcess> getExportProcess() {
                        if (exportProcess == null) {
                            exportProcess = new ArrayList<DeliveryRestDTO.DocumentLines.DocumentLine.ExportProcesses.ExportProcess>();
                        }
                        return this.exportProcess;
                    }

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
                    @JsonProperty("LineTaxJurisdiction")
                    protected List<DeliveryRestDTO.DocumentLines.DocumentLine.LineTaxJurisdictions.LineTaxJurisdiction> lineTaxJurisdiction;

                    public List<DeliveryRestDTO.DocumentLines.DocumentLine.LineTaxJurisdictions.LineTaxJurisdiction> getLineTaxJurisdiction() {
                        if (lineTaxJurisdiction == null) {
                            lineTaxJurisdiction = new ArrayList<DeliveryRestDTO.DocumentLines.DocumentLine.LineTaxJurisdictions.LineTaxJurisdiction>();
                        }
                        return this.lineTaxJurisdiction;
                    }

                    public void setLineTaxJurisdiction(List<DeliveryRestDTO.DocumentLines.DocumentLine.LineTaxJurisdictions.LineTaxJurisdiction> lineTaxJurisdiction) {
                        this.lineTaxJurisdiction = lineTaxJurisdiction;
                    }

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
                    @JsonProperty("SerialNumber")
                    protected List<DeliveryRestDTO.DocumentLines.DocumentLine.SerialNumbers.SerialNumber> serialNumber;

                    public List<DeliveryRestDTO.DocumentLines.DocumentLine.SerialNumbers.SerialNumber> getSerialNumber() {
                        if (serialNumber == null) {
                            serialNumber = new ArrayList<DeliveryRestDTO.DocumentLines.DocumentLine.SerialNumbers.SerialNumber>();
                        }
                        return this.serialNumber;
                    }

                    public void setSerialNumber(List<DeliveryRestDTO.DocumentLines.DocumentLine.SerialNumbers.SerialNumber> serialNumber) {
                        this.serialNumber = serialNumber;
                    }

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
                        @JsonProperty("TrackingNote")
                        protected Long trackingNote;
                        @JsonProperty("TrackingNoteLine")
                        protected Long trackingNoteLine;

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

                        public Long getTrackingNote() {
                            return trackingNote;
                        }

                        public void setTrackingNote(Long trackingNote) {
                            this.trackingNote = trackingNote;
                        }

                        public Long getTrackingNoteLine() {
                            return trackingNoteLine;
                        }

                        public void setTrackingNoteLine(Long trackingNoteLine) {
                            this.trackingNoteLine = trackingNoteLine;
                        }
                    }
                }

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class WithholdingTaxLines implements Serializable {
                    @JsonProperty("WithholdingTaxLine")
                    protected List<DeliveryRestDTO.DocumentLines.DocumentLine.WithholdingTaxLines.WithholdingTaxLine> withholdingTaxLine;

                    public List<DeliveryRestDTO.DocumentLines.DocumentLine.WithholdingTaxLines.WithholdingTaxLine> getWithholdingTaxLine() {
                        if (withholdingTaxLine == null) {
                            withholdingTaxLine = new ArrayList<DeliveryRestDTO.DocumentLines.DocumentLine.WithholdingTaxLines.WithholdingTaxLine>();
                        }
                        return this.withholdingTaxLine;
                    }

                    public void setWithholdingTaxLine(List<DeliveryRestDTO.DocumentLines.DocumentLine.WithholdingTaxLines.WithholdingTaxLine> withholdingTaxLine) {
                        this.withholdingTaxLine = withholdingTaxLine;
                    }

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
                        @JsonProperty("U_Base_ML")
                        protected Double uBaseML;
                        @JsonProperty("U_Base_MS")
                        protected Double uBaseMS;
                        @JsonProperty("U_Base_ME")
                        protected Double uBaseME;
                        @JsonProperty("U_Tarifa")
                        protected Double uTarifa;
                        @JsonProperty("U_Fuente")
                        protected String uFuente;
                        @JsonProperty("U_Ret_ML")
                        protected Double uRetML;
                        @JsonProperty("U_Ret_MS")
                        protected Double uRetMS;
                        @JsonProperty("U_Ret_ME")
                        protected Double uRetME;

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

                        public Double getuBaseML() {
                            return uBaseML;
                        }

                        public void setuBaseML(Double uBaseML) {
                            this.uBaseML = uBaseML;
                        }

                        public Double getuBaseMS() {
                            return uBaseMS;
                        }

                        public void setuBaseMS(Double uBaseMS) {
                            this.uBaseMS = uBaseMS;
                        }

                        public Double getuBaseME() {
                            return uBaseME;
                        }

                        public void setuBaseME(Double uBaseME) {
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

                        public Double getuRetML() {
                            return uRetML;
                        }

                        public void setuRetML(Double uRetML) {
                            this.uRetML = uRetML;
                        }

                        public Double getuRetMS() {
                            return uRetMS;
                        }

                        public void setuRetMS(Double uRetMS) {
                            this.uRetMS = uRetMS;
                        }

                        public Double getuRetME() {
                            return uRetME;
                        }

                        public void setuRetME(Double uRetME) {
                            this.uRetME = uRetME;
                        }
                    }
                }
            }
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class WithholdingTaxDataCollection implements Serializable {
        @JsonProperty("WithholdingTaxData")
        protected List<DeliveryRestDTO.WithholdingTaxDataCollection.WithholdingTaxData> withholdingTaxData;

        public List<DeliveryRestDTO.WithholdingTaxDataCollection.WithholdingTaxData> getWithholdingTaxData() {
            if (withholdingTaxData == null) {
                withholdingTaxData = new ArrayList<DeliveryRestDTO.WithholdingTaxDataCollection.WithholdingTaxData>();
            }
            return this.withholdingTaxData;
        }

        public void setWithholdingTaxData(List<WithholdingTaxData> withholdingTaxData) {
            this.withholdingTaxData = withholdingTaxData;
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class WithholdingTaxData implements Serializable {
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
            @JsonProperty("U_Base_ML")
            protected Double uBaseML;
            @JsonProperty("U_Base_MS")
            protected Double uBaseMS;
            @JsonProperty("U_Base_ME")
            protected Double uBaseME;
            @JsonProperty("U_Tarifa")
            protected Double uTarifa;
            @JsonProperty("U_Fuente")
            protected String uFuente;
            @JsonProperty("U_Ret_ML")
            protected Double uRetML;
            @JsonProperty("U_Ret_MS")
            protected Double uRetMS;
            @JsonProperty("U_Ret_ME")
            protected Double uRetME;

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

            public Double getuBaseML() {
                return uBaseML;
            }

            public void setuBaseML(Double uBaseML) {
                this.uBaseML = uBaseML;
            }

            public Double getuBaseMS() {
                return uBaseMS;
            }

            public void setuBaseMS(Double uBaseMS) {
                this.uBaseMS = uBaseMS;
            }

            public Double getuBaseME() {
                return uBaseME;
            }

            public void setuBaseME(Double uBaseME) {
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

            public Double getuRetML() {
                return uRetML;
            }

            public void setuRetML(Double uRetML) {
                this.uRetML = uRetML;
            }

            public Double getuRetMS() {
                return uRetMS;
            }

            public void setuRetMS(Double uRetMS) {
                this.uRetMS = uRetMS;
            }

            public Double getuRetME() {
                return uRetME;
            }

            public void setuRetME(Double uRetME) {
                this.uRetME = uRetME;
            }
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DocumentPackages implements Serializable {
        @JsonProperty("DocumentPackage")
        protected List<DeliveryRestDTO.DocumentPackages.DocumentPackage> documentPackage;

        public List<DeliveryRestDTO.DocumentPackages.DocumentPackage> getDocumentPackage() {
            if (documentPackage == null) {
                documentPackage = new ArrayList<DeliveryRestDTO.DocumentPackages.DocumentPackage>();
            }
            return this.documentPackage;
        }

        public void setDocumentPackage(List<DeliveryRestDTO.DocumentPackages.DocumentPackage> documentPackage) {
            this.documentPackage = documentPackage;
        }

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
            protected DeliveryRestDTO.DocumentPackages.DocumentPackage.DocumentPackageItems documentPackageItems;

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
                protected List<DeliveryRestDTO.DocumentPackages.DocumentPackage.DocumentPackageItems.DocumentPackageItem> documentPackageItem;

                public List<DeliveryRestDTO.DocumentPackages.DocumentPackage.DocumentPackageItems.DocumentPackageItem> getDocumentPackageItem() {
                    if (documentPackageItem == null) {
                        documentPackageItem = new ArrayList<DeliveryRestDTO.DocumentPackages.DocumentPackage.DocumentPackageItems.DocumentPackageItem>();
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
        @JsonProperty("DocumentSpecialLine")
        protected List<DeliveryRestDTO.DocumentSpecialLines.DocumentSpecialLine> documentSpecialLine;

        public List<DeliveryRestDTO.DocumentSpecialLines.DocumentSpecialLine> getDocumentSpecialLine() {
            if (documentSpecialLine == null) {
                documentSpecialLine = new ArrayList<DeliveryRestDTO.DocumentSpecialLines.DocumentSpecialLine>();
            }
            return this.documentSpecialLine;
        }

        public void setDocumentSpecialLine(List<DocumentSpecialLine> documentSpecialLine) {
            this.documentSpecialLine = documentSpecialLine;
        }

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
        @JsonProperty("TaxId12")
        protected String taxId12;
        @JsonProperty("TaxId13")
        protected String taxId13;

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

        public String getTaxId12() {
            return taxId12;
        }

        public void setTaxId12(String taxId12) {
            this.taxId12 = taxId12;
        }

        public String getTaxId13() {
            return taxId13;
        }

        public void setTaxId13(String taxId13) {
            this.taxId13 = taxId13;
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
        @JsonProperty("ShipToAddress2")
        protected String shipToAddress2;
        @JsonProperty("ShipToAddress3")
        protected String shipToAddress3;
        @JsonProperty("BillToAddress2")
        protected String billToAddress2;
        @JsonProperty("BillToAddress3")
        protected String billToAddress3;

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

        public String getShipToAddress2() {
            return shipToAddress2;
        }

        public void setShipToAddress2(String shipToAddress2) {
            this.shipToAddress2 = shipToAddress2;
        }

        public String getShipToAddress3() {
            return shipToAddress3;
        }

        public void setShipToAddress3(String shipToAddress3) {
            this.shipToAddress3 = shipToAddress3;
        }

        public String getBillToAddress2() {
            return billToAddress2;
        }

        public void setBillToAddress2(String billToAddress2) {
            this.billToAddress2 = billToAddress2;
        }

        public String getBillToAddress3() {
            return billToAddress3;
        }

        public void setBillToAddress3(String billToAddress3) {
            this.billToAddress3 = billToAddress3;
        }
    }
}