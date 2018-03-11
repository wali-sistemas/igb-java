package co.igb.persistence.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author YEIJARA
 */
@Entity
@Table(name = "WTR1")
public class StockTransferDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected StockTransferDetailPK stockTransferDetailPK;
    @Column(name = "TargetType")
    private Integer targetType;
    @Column(name = "TrgetEntry")
    private Integer trgetEntry;
    @Column(name = "BaseRef")
    private String baseRef;
    @Column(name = "BaseType")
    private Integer baseType;
    @Column(name = "BaseEntry")
    private Integer baseEntry;
    @Column(name = "BaseLine")
    private Integer baseLine;
    @Column(name = "LineStatus")
    private Character lineStatus;
    @Column(name = "ItemCode")
    private String itemCode;
    @Column(name = "Dscription")
    private String dscription;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Quantity")
    private BigDecimal quantity;
    @Column(name = "ShipDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date shipDate;
    @Column(name = "OpenQty")
    private BigDecimal openQty;
    @Column(name = "Price")
    private BigDecimal price;
    @Column(name = "Currency")
    private String currency;
    @Column(name = "Rate")
    private BigDecimal rate;
    @Column(name = "DiscPrcnt")
    private BigDecimal discPrcnt;
    @Column(name = "LineTotal")
    private BigDecimal lineTotal;
    @Column(name = "TotalFrgn")
    private BigDecimal totalFrgn;
    @Column(name = "OpenSum")
    private BigDecimal openSum;
    @Column(name = "OpenSumFC")
    private BigDecimal openSumFC;
    @Column(name = "VendorNum")
    private String vendorNum;
    @Column(name = "SerialNum")
    private String serialNum;
    @Column(name = "WhsCode")
    private String whsCode;
    @Column(name = "Commission")
    private BigDecimal commission;
    @Column(name = "TreeType")
    private Character treeType;
    @Column(name = "AcctCode")
    private String acctCode;
    @Column(name = "TaxStatus")
    private Character taxStatus;
    @Column(name = "GrossBuyPr")
    private BigDecimal grossBuyPr;
    @Column(name = "PriceBefDi")
    private BigDecimal priceBefDi;
    @Column(name = "DocDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date docDate;
    @Column(name = "Flags")
    private Integer flags;
    @Column(name = "OpenCreQty")
    private BigDecimal openCreQty;
    @Column(name = "UseBaseUn")
    private Character useBaseUn;
    @Column(name = "SubCatNum")
    private String subCatNum;
    @Column(name = "BaseCard")
    private String baseCard;
    @Column(name = "TotalSumSy")
    private BigDecimal totalSumSy;
    @Column(name = "OpenSumSys")
    private BigDecimal openSumSys;
    @Column(name = "InvntSttus")
    private Character invntSttus;
    @Column(name = "OcrCode")
    private String ocrCode;
    @Column(name = "Project")
    private String project;
    @Column(name = "CodeBars")
    private String codeBars;
    @Column(name = "VatPrcnt")
    private BigDecimal vatPrcnt;
    @Column(name = "VatGroup")
    private String vatGroup;
    @Column(name = "PriceAfVAT")
    private BigDecimal priceAfVAT;
    @Column(name = "Height1")
    private BigDecimal height1;
    @Column(name = "Hght1Unit")
    private Short hght1Unit;
    @Column(name = "Height2")
    private BigDecimal height2;
    @Column(name = "Hght2Unit")
    private Short hght2Unit;
    @Column(name = "Width1")
    private BigDecimal width1;
    @Column(name = "Wdth1Unit")
    private Short wdth1Unit;
    @Column(name = "Width2")
    private BigDecimal width2;
    @Column(name = "Wdth2Unit")
    private Short wdth2Unit;
    @Column(name = "Length1")
    private BigDecimal length1;
    @Column(name = "Len1Unit")
    private Short len1Unit;
    @Column(name = "length2")
    private BigDecimal length2;
    @Column(name = "Len2Unit")
    private Short len2Unit;
    @Column(name = "Volume")
    private BigDecimal volume;
    @Column(name = "VolUnit")
    private Short volUnit;
    @Column(name = "Weight1")
    private BigDecimal weight1;
    @Column(name = "Wght1Unit")
    private Short wght1Unit;
    @Column(name = "Weight2")
    private BigDecimal weight2;
    @Column(name = "Wght2Unit")
    private Short wght2Unit;
    @Column(name = "Factor1")
    private BigDecimal factor1;
    @Column(name = "Factor2")
    private BigDecimal factor2;
    @Column(name = "Factor3")
    private BigDecimal factor3;
    @Column(name = "Factor4")
    private BigDecimal factor4;
    @Column(name = "PackQty")
    private BigDecimal packQty;
    @Column(name = "UpdInvntry")
    private Character updInvntry;
    @Column(name = "BaseDocNum")
    private Integer baseDocNum;
    @Column(name = "BaseAtCard")
    private String baseAtCard;
    @Column(name = "SWW")
    private String sww;
    @Column(name = "VatSum")
    private BigDecimal vatSum;
    @Column(name = "VatSumFrgn")
    private BigDecimal vatSumFrgn;
    @Column(name = "VatSumSy")
    private BigDecimal vatSumSy;
    @Column(name = "FinncPriod")
    private Integer finncPriod;
    @Column(name = "ObjType")
    private String objType;
    @Column(name = "LogInstanc")
    private Integer logInstanc;
    @Column(name = "BlockNum")
    private String blockNum;
    @Column(name = "ImportLog")
    private String importLog;
    @Column(name = "DedVatSum")
    private BigDecimal dedVatSum;
    @Column(name = "DedVatSumF")
    private BigDecimal dedVatSumF;
    @Column(name = "DedVatSumS")
    private BigDecimal dedVatSumS;
    @Column(name = "IsAqcuistn")
    private Character isAqcuistn;
    @Column(name = "DistribSum")
    private BigDecimal distribSum;
    @Column(name = "DstrbSumFC")
    private BigDecimal dstrbSumFC;
    @Column(name = "DstrbSumSC")
    private BigDecimal dstrbSumSC;
    @Column(name = "GrssProfit")
    private BigDecimal grssProfit;
    @Column(name = "GrssProfSC")
    private BigDecimal grssProfSC;
    @Column(name = "GrssProfFC")
    private BigDecimal grssProfFC;
    @Column(name = "VisOrder")
    private Integer visOrder;
    @Column(name = "INMPrice")
    private BigDecimal iNMPrice;
    @Column(name = "PoTrgNum")
    private Integer poTrgNum;
    @Column(name = "PoTrgEntry")
    private String poTrgEntry;
    @Column(name = "DropShip")
    private Character dropShip;
    @Column(name = "PoLineNum")
    private Integer poLineNum;
    @Column(name = "Address")
    private String address;
    @Column(name = "TaxCode")
    private String taxCode;
    @Column(name = "TaxType")
    private Character taxType;
    @Column(name = "OrigItem")
    private String origItem;
    @Column(name = "BackOrdr")
    private Character backOrdr;
    @Column(name = "FreeTxt")
    private String freeTxt;
    @Column(name = "PickStatus")
    private Character pickStatus;
    @Column(name = "PickOty")
    private BigDecimal pickOty;
    @Column(name = "PickIdNo")
    private Integer pickIdNo;
    @Column(name = "TrnsCode")
    private Short trnsCode;
    @Column(name = "VatAppld")
    private BigDecimal vatAppld;
    @Column(name = "VatAppldFC")
    private BigDecimal vatAppldFC;
    @Column(name = "VatAppldSC")
    private BigDecimal vatAppldSC;
    @Column(name = "BaseQty")
    private BigDecimal baseQty;
    @Column(name = "BaseOpnQty")
    private BigDecimal baseOpnQty;
    @Column(name = "VatDscntPr")
    private BigDecimal vatDscntPr;
    @Column(name = "WtLiable")
    private Character wtLiable;
    @Column(name = "DeferrTax")
    private Character deferrTax;
    @Column(name = "EquVatPer")
    private BigDecimal equVatPer;
    @Column(name = "EquVatSum")
    private BigDecimal equVatSum;
    @Column(name = "EquVatSumF")
    private BigDecimal equVatSumF;
    @Column(name = "EquVatSumS")
    private BigDecimal equVatSumS;
    @Column(name = "LineVat")
    private BigDecimal lineVat;
    @Column(name = "LineVatlF")
    private BigDecimal lineVatlF;
    @Column(name = "LineVatS")
    private BigDecimal lineVatS;
    @Column(name = "unitMsr")
    private String unitMsr;
    @Column(name = "NumPerMsr")
    private BigDecimal numPerMsr;
    @Column(name = "CEECFlag")
    private Character cEECFlag;
    @Column(name = "ToStock")
    private BigDecimal toStock;
    @Column(name = "ToDiff")
    private BigDecimal toDiff;
    @Column(name = "ExciseAmt")
    private BigDecimal exciseAmt;
    @Column(name = "TaxPerUnit")
    private BigDecimal taxPerUnit;
    @Column(name = "TotInclTax")
    private BigDecimal totInclTax;
    @Column(name = "CountryOrg")
    private String countryOrg;
    @Column(name = "StckDstSum")
    private BigDecimal stckDstSum;
    @Column(name = "ReleasQtty")
    private BigDecimal releasQtty;
    @Column(name = "LineType")
    private Character lineType;
    @Column(name = "TranType")
    private Character tranType;
    @Column(name = "Text")
    private String text;
    @Column(name = "OwnerCode")
    private Integer ownerCode;
    @Column(name = "StockPrice")
    private BigDecimal stockPrice;
    @Column(name = "ConsumeFCT")
    private Character consumeFCT;
    @Column(name = "LstByDsSum")
    private BigDecimal lstByDsSum;
    @Column(name = "StckINMPr")
    private BigDecimal stckINMPr;
    @Column(name = "LstBINMPr")
    private BigDecimal lstBINMPr;
    @Column(name = "StckDstFc")
    private BigDecimal stckDstFc;
    @Column(name = "StckDstSc")
    private BigDecimal stckDstSc;
    @Column(name = "LstByDsFc")
    private BigDecimal lstByDsFc;
    @Column(name = "LstByDsSc")
    private BigDecimal lstByDsSc;
    @Column(name = "StockSum")
    private BigDecimal stockSum;
    @Column(name = "StockSumFc")
    private BigDecimal stockSumFc;
    @Column(name = "StockSumSc")
    private BigDecimal stockSumSc;
    @Column(name = "StckSumApp")
    private BigDecimal stckSumApp;
    @Column(name = "StckAppFc")
    private BigDecimal stckAppFc;
    @Column(name = "StckAppSc")
    private BigDecimal stckAppSc;
    @Column(name = "ShipToCode")
    private String shipToCode;
    @Column(name = "ShipToDesc")
    private String shipToDesc;
    @Column(name = "StckAppD")
    private BigDecimal stckAppD;
    @Column(name = "StckAppDFC")
    private BigDecimal stckAppDFC;
    @Column(name = "StckAppDSC")
    private BigDecimal stckAppDSC;
    @Column(name = "BasePrice")
    private Character basePrice;
    @Column(name = "GTotal")
    private BigDecimal gTotal;
    @Column(name = "GTotalFC")
    private BigDecimal gTotalFC;
    @Column(name = "GTotalSC")
    private BigDecimal gTotalSC;
    @Column(name = "DistribExp")
    private Character distribExp;
    @Column(name = "DescOW")
    private Character descOW;
    @Column(name = "DetailsOW")
    private Character detailsOW;
    @Column(name = "GrossBase")
    private Short grossBase;
    @Column(name = "VatWoDpm")
    private BigDecimal vatWoDpm;
    @Column(name = "VatWoDpmFc")
    private BigDecimal vatWoDpmFc;
    @Column(name = "VatWoDpmSc")
    private BigDecimal vatWoDpmSc;
    @Column(name = "CFOPCode")
    private String cFOPCode;
    @Column(name = "CSTCode")
    private String cSTCode;
    @Column(name = "Usage")
    private Integer usage;
    @Column(name = "TaxOnly")
    private Character taxOnly;
    @Column(name = "WtCalced")
    private Character wtCalced;
    @Column(name = "QtyToShip")
    private BigDecimal qtyToShip;
    @Column(name = "DelivrdQty")
    private BigDecimal delivrdQty;
    @Column(name = "OrderedQty")
    private BigDecimal orderedQty;
    @Column(name = "CogsOcrCod")
    private String cogsOcrCod;
    @Column(name = "CiOppLineN")
    private Integer ciOppLineN;
    @Column(name = "CogsAcct")
    private String cogsAcct;
    @Column(name = "ChgAsmBoMW")
    private Character chgAsmBoMW;
    @Column(name = "ActDelDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actDelDate;
    @Column(name = "OcrCode2")
    private String ocrCode2;
    @Column(name = "OcrCode3")
    private String ocrCode3;
    @Column(name = "OcrCode4")
    private String ocrCode4;
    @Column(name = "OcrCode5")
    private String ocrCode5;
    @Column(name = "TaxDistSum")
    private BigDecimal taxDistSum;
    @Column(name = "TaxDistSFC")
    private BigDecimal taxDistSFC;
    @Column(name = "TaxDistSSC")
    private BigDecimal taxDistSSC;
    @Column(name = "PostTax")
    private Character postTax;
    @Column(name = "Excisable")
    private Character excisable;
    @Column(name = "AssblValue")
    private BigDecimal assblValue;
    @Column(name = "RG23APart1")
    private Integer rG23APart1;
    @Column(name = "RG23APart2")
    private Integer rG23APart2;
    @Column(name = "RG23CPart1")
    private Integer rG23CPart1;
    @Column(name = "RG23CPart2")
    private Integer rG23CPart2;
    @Column(name = "CogsOcrCo2")
    private String cogsOcrCo2;
    @Column(name = "CogsOcrCo3")
    private String cogsOcrCo3;
    @Column(name = "CogsOcrCo4")
    private String cogsOcrCo4;
    @Column(name = "CogsOcrCo5")
    private String cogsOcrCo5;
    @Column(name = "LnExcised")
    private Character lnExcised;
    @Column(name = "LocCode")
    private Integer locCode;
    @Column(name = "StockValue")
    private BigDecimal stockValue;
    @Column(name = "GPTtlBasPr")
    private BigDecimal gPTtlBasPr;
    @Column(name = "unitMsr2")
    private String unitMsr2;
    @Column(name = "NumPerMsr2")
    private BigDecimal numPerMsr2;
    @Column(name = "SpecPrice")
    private Character specPrice;
    @Column(name = "CSTfIPI")
    private String cSTfIPI;
    @Column(name = "CSTfPIS")
    private String cSTfPIS;
    @Column(name = "CSTfCOFINS")
    private String cSTfCOFINS;
    @Column(name = "ExLineNo")
    private String exLineNo;
    @Column(name = "isSrvCall")
    private Character isSrvCall;
    @Column(name = "PQTReqQty")
    private BigDecimal pQTReqQty;
    @Column(name = "PQTReqDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pQTReqDate;
    @Column(name = "PcDocType")
    private Integer pcDocType;
    @Column(name = "PcQuantity")
    private BigDecimal pcQuantity;
    @Column(name = "LinManClsd")
    private Character linManClsd;
    @Column(name = "VatGrpSrc")
    private Character vatGrpSrc;
    @Column(name = "NoInvtryMv")
    private Character noInvtryMv;
    @Column(name = "ActBaseEnt")
    private Integer actBaseEnt;
    @Column(name = "ActBaseLn")
    private Integer actBaseLn;
    @Column(name = "ActBaseNum")
    private Integer actBaseNum;
    @Column(name = "OpenRtnQty")
    private BigDecimal openRtnQty;
    @Column(name = "AgrNo")
    private Integer agrNo;
    @Column(name = "AgrLnNum")
    private Integer agrLnNum;
    @Column(name = "CredOrigin")
    private Character credOrigin;
    @Column(name = "Surpluses")
    private BigDecimal surpluses;
    @Column(name = "DefBreak")
    private BigDecimal defBreak;
    @Column(name = "Shortages")
    private BigDecimal shortages;
    @Column(name = "SlpCode")
    private Integer slpCode;
    @Column(name = "UomEntry")
    private Integer uomEntry;
    @Column(name = "UomEntry2")
    private Integer uomEntry2;
    @Column(name = "UomCode")
    private String uomCode;
    @Column(name = "UomCode2")
    private String uomCode2;
    @Column(name = "FromWhsCod")
    private String fromWhsCod;
    @Column(name = "NeedQty")
    private Character needQty;
    @Column(name = "PartRetire")
    private Character partRetire;
    @Column(name = "RetireQty")
    private BigDecimal retireQty;
    @Column(name = "RetireAPC")
    private BigDecimal retireAPC;
    @Column(name = "RetirAPCFC")
    private BigDecimal retirAPCFC;
    @Column(name = "RetirAPCSC")
    private BigDecimal retirAPCSC;
    @Column(name = "InvQty")
    private BigDecimal invQty;
    @Column(name = "OpenInvQty")
    private BigDecimal openInvQty;
    @Column(name = "EnSetCost")
    private Character enSetCost;
    @Column(name = "RetCost")
    private BigDecimal retCost;
    @Column(name = "Incoterms")
    private Integer incoterms;
    @Column(name = "TransMod")
    private Integer transMod;
    @Column(name = "LineVendor")
    private String lineVendor;
    @Column(name = "DistribIS")
    private Character distribIS;
    @Column(name = "ISDistrb")
    private BigDecimal iSDistrb;
    @Column(name = "ISDistrbFC")
    private BigDecimal iSDistrbFC;
    @Column(name = "ISDistrbSC")
    private BigDecimal iSDistrbSC;
    @Column(name = "LinePoPrss")
    private Character linePoPrss;
    @Column(name = "FreeChrgBP")
    private Character freeChrgBP;
    @Column(name = "LegalText")
    private String legalText;
    @Column(name = "TaxRelev")
    private Character taxRelev;

    public StockTransferDetail() {
    }

    public StockTransferDetail(StockTransferDetailPK stockTransferDetailPK) {
        this.stockTransferDetailPK = stockTransferDetailPK;
    }

    public StockTransferDetail(int docEntry, int lineNum) {
        this.stockTransferDetailPK = new StockTransferDetailPK(docEntry, lineNum);
    }

    public StockTransferDetailPK getStockTransferDetailPK() {
        return stockTransferDetailPK;
    }

    public void setStockTransferDetailPK(StockTransferDetailPK stockTransferDetailPK) {
        this.stockTransferDetailPK = stockTransferDetailPK;
    }

    public Integer getTargetType() {
        return targetType;
    }

    public void setTargetType(Integer targetType) {
        this.targetType = targetType;
    }

    public Integer getTrgetEntry() {
        return trgetEntry;
    }

    public void setTrgetEntry(Integer trgetEntry) {
        this.trgetEntry = trgetEntry;
    }

    public String getBaseRef() {
        return baseRef;
    }

    public void setBaseRef(String baseRef) {
        this.baseRef = baseRef;
    }

    public Integer getBaseType() {
        return baseType;
    }

    public void setBaseType(Integer baseType) {
        this.baseType = baseType;
    }

    public Integer getBaseEntry() {
        return baseEntry;
    }

    public void setBaseEntry(Integer baseEntry) {
        this.baseEntry = baseEntry;
    }

    public Integer getBaseLine() {
        return baseLine;
    }

    public void setBaseLine(Integer baseLine) {
        this.baseLine = baseLine;
    }

    public Character getLineStatus() {
        return lineStatus;
    }

    public void setLineStatus(Character lineStatus) {
        this.lineStatus = lineStatus;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getDscription() {
        return dscription;
    }

    public void setDscription(String dscription) {
        this.dscription = dscription;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public Date getShipDate() {
        return shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    public BigDecimal getOpenQty() {
        return openQty;
    }

    public void setOpenQty(BigDecimal openQty) {
        this.openQty = openQty;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getDiscPrcnt() {
        return discPrcnt;
    }

    public void setDiscPrcnt(BigDecimal discPrcnt) {
        this.discPrcnt = discPrcnt;
    }

    public BigDecimal getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(BigDecimal lineTotal) {
        this.lineTotal = lineTotal;
    }

    public BigDecimal getTotalFrgn() {
        return totalFrgn;
    }

    public void setTotalFrgn(BigDecimal totalFrgn) {
        this.totalFrgn = totalFrgn;
    }

    public BigDecimal getOpenSum() {
        return openSum;
    }

    public void setOpenSum(BigDecimal openSum) {
        this.openSum = openSum;
    }

    public BigDecimal getOpenSumFC() {
        return openSumFC;
    }

    public void setOpenSumFC(BigDecimal openSumFC) {
        this.openSumFC = openSumFC;
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

    public String getWhsCode() {
        return whsCode;
    }

    public void setWhsCode(String whsCode) {
        this.whsCode = whsCode;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public Character getTreeType() {
        return treeType;
    }

    public void setTreeType(Character treeType) {
        this.treeType = treeType;
    }

    public String getAcctCode() {
        return acctCode;
    }

    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    public Character getTaxStatus() {
        return taxStatus;
    }

    public void setTaxStatus(Character taxStatus) {
        this.taxStatus = taxStatus;
    }

    public BigDecimal getGrossBuyPr() {
        return grossBuyPr;
    }

    public void setGrossBuyPr(BigDecimal grossBuyPr) {
        this.grossBuyPr = grossBuyPr;
    }

    public BigDecimal getPriceBefDi() {
        return priceBefDi;
    }

    public void setPriceBefDi(BigDecimal priceBefDi) {
        this.priceBefDi = priceBefDi;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public Integer getFlags() {
        return flags;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    public BigDecimal getOpenCreQty() {
        return openCreQty;
    }

    public void setOpenCreQty(BigDecimal openCreQty) {
        this.openCreQty = openCreQty;
    }

    public Character getUseBaseUn() {
        return useBaseUn;
    }

    public void setUseBaseUn(Character useBaseUn) {
        this.useBaseUn = useBaseUn;
    }

    public String getSubCatNum() {
        return subCatNum;
    }

    public void setSubCatNum(String subCatNum) {
        this.subCatNum = subCatNum;
    }

    public String getBaseCard() {
        return baseCard;
    }

    public void setBaseCard(String baseCard) {
        this.baseCard = baseCard;
    }

    public BigDecimal getTotalSumSy() {
        return totalSumSy;
    }

    public void setTotalSumSy(BigDecimal totalSumSy) {
        this.totalSumSy = totalSumSy;
    }

    public BigDecimal getOpenSumSys() {
        return openSumSys;
    }

    public void setOpenSumSys(BigDecimal openSumSys) {
        this.openSumSys = openSumSys;
    }

    public Character getInvntSttus() {
        return invntSttus;
    }

    public void setInvntSttus(Character invntSttus) {
        this.invntSttus = invntSttus;
    }

    public String getOcrCode() {
        return ocrCode;
    }

    public void setOcrCode(String ocrCode) {
        this.ocrCode = ocrCode;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getCodeBars() {
        return codeBars;
    }

    public void setCodeBars(String codeBars) {
        this.codeBars = codeBars;
    }

    public BigDecimal getVatPrcnt() {
        return vatPrcnt;
    }

    public void setVatPrcnt(BigDecimal vatPrcnt) {
        this.vatPrcnt = vatPrcnt;
    }

    public String getVatGroup() {
        return vatGroup;
    }

    public void setVatGroup(String vatGroup) {
        this.vatGroup = vatGroup;
    }

    public BigDecimal getPriceAfVAT() {
        return priceAfVAT;
    }

    public void setPriceAfVAT(BigDecimal priceAfVAT) {
        this.priceAfVAT = priceAfVAT;
    }

    public BigDecimal getHeight1() {
        return height1;
    }

    public void setHeight1(BigDecimal height1) {
        this.height1 = height1;
    }

    public Short getHght1Unit() {
        return hght1Unit;
    }

    public void setHght1Unit(Short hght1Unit) {
        this.hght1Unit = hght1Unit;
    }

    public BigDecimal getHeight2() {
        return height2;
    }

    public void setHeight2(BigDecimal height2) {
        this.height2 = height2;
    }

    public Short getHght2Unit() {
        return hght2Unit;
    }

    public void setHght2Unit(Short hght2Unit) {
        this.hght2Unit = hght2Unit;
    }

    public BigDecimal getWidth1() {
        return width1;
    }

    public void setWidth1(BigDecimal width1) {
        this.width1 = width1;
    }

    public Short getWdth1Unit() {
        return wdth1Unit;
    }

    public void setWdth1Unit(Short wdth1Unit) {
        this.wdth1Unit = wdth1Unit;
    }

    public BigDecimal getWidth2() {
        return width2;
    }

    public void setWidth2(BigDecimal width2) {
        this.width2 = width2;
    }

    public Short getWdth2Unit() {
        return wdth2Unit;
    }

    public void setWdth2Unit(Short wdth2Unit) {
        this.wdth2Unit = wdth2Unit;
    }

    public BigDecimal getLength1() {
        return length1;
    }

    public void setLength1(BigDecimal length1) {
        this.length1 = length1;
    }

    public Short getLen1Unit() {
        return len1Unit;
    }

    public void setLen1Unit(Short len1Unit) {
        this.len1Unit = len1Unit;
    }

    public BigDecimal getLength2() {
        return length2;
    }

    public void setLength2(BigDecimal length2) {
        this.length2 = length2;
    }

    public Short getLen2Unit() {
        return len2Unit;
    }

    public void setLen2Unit(Short len2Unit) {
        this.len2Unit = len2Unit;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public Short getVolUnit() {
        return volUnit;
    }

    public void setVolUnit(Short volUnit) {
        this.volUnit = volUnit;
    }

    public BigDecimal getWeight1() {
        return weight1;
    }

    public void setWeight1(BigDecimal weight1) {
        this.weight1 = weight1;
    }

    public Short getWght1Unit() {
        return wght1Unit;
    }

    public void setWght1Unit(Short wght1Unit) {
        this.wght1Unit = wght1Unit;
    }

    public BigDecimal getWeight2() {
        return weight2;
    }

    public void setWeight2(BigDecimal weight2) {
        this.weight2 = weight2;
    }

    public Short getWght2Unit() {
        return wght2Unit;
    }

    public void setWght2Unit(Short wght2Unit) {
        this.wght2Unit = wght2Unit;
    }

    public BigDecimal getFactor1() {
        return factor1;
    }

    public void setFactor1(BigDecimal factor1) {
        this.factor1 = factor1;
    }

    public BigDecimal getFactor2() {
        return factor2;
    }

    public void setFactor2(BigDecimal factor2) {
        this.factor2 = factor2;
    }

    public BigDecimal getFactor3() {
        return factor3;
    }

    public void setFactor3(BigDecimal factor3) {
        this.factor3 = factor3;
    }

    public BigDecimal getFactor4() {
        return factor4;
    }

    public void setFactor4(BigDecimal factor4) {
        this.factor4 = factor4;
    }

    public BigDecimal getPackQty() {
        return packQty;
    }

    public void setPackQty(BigDecimal packQty) {
        this.packQty = packQty;
    }

    public Character getUpdInvntry() {
        return updInvntry;
    }

    public void setUpdInvntry(Character updInvntry) {
        this.updInvntry = updInvntry;
    }

    public Integer getBaseDocNum() {
        return baseDocNum;
    }

    public void setBaseDocNum(Integer baseDocNum) {
        this.baseDocNum = baseDocNum;
    }

    public String getBaseAtCard() {
        return baseAtCard;
    }

    public void setBaseAtCard(String baseAtCard) {
        this.baseAtCard = baseAtCard;
    }

    public String getSww() {
        return sww;
    }

    public void setSww(String sww) {
        this.sww = sww;
    }

    public BigDecimal getVatSum() {
        return vatSum;
    }

    public void setVatSum(BigDecimal vatSum) {
        this.vatSum = vatSum;
    }

    public BigDecimal getVatSumFrgn() {
        return vatSumFrgn;
    }

    public void setVatSumFrgn(BigDecimal vatSumFrgn) {
        this.vatSumFrgn = vatSumFrgn;
    }

    public BigDecimal getVatSumSy() {
        return vatSumSy;
    }

    public void setVatSumSy(BigDecimal vatSumSy) {
        this.vatSumSy = vatSumSy;
    }

    public Integer getFinncPriod() {
        return finncPriod;
    }

    public void setFinncPriod(Integer finncPriod) {
        this.finncPriod = finncPriod;
    }

    public String getObjType() {
        return objType;
    }

    public void setObjType(String objType) {
        this.objType = objType;
    }

    public Integer getLogInstanc() {
        return logInstanc;
    }

    public void setLogInstanc(Integer logInstanc) {
        this.logInstanc = logInstanc;
    }

    public String getBlockNum() {
        return blockNum;
    }

    public void setBlockNum(String blockNum) {
        this.blockNum = blockNum;
    }

    public String getImportLog() {
        return importLog;
    }

    public void setImportLog(String importLog) {
        this.importLog = importLog;
    }

    public BigDecimal getDedVatSum() {
        return dedVatSum;
    }

    public void setDedVatSum(BigDecimal dedVatSum) {
        this.dedVatSum = dedVatSum;
    }

    public BigDecimal getDedVatSumF() {
        return dedVatSumF;
    }

    public void setDedVatSumF(BigDecimal dedVatSumF) {
        this.dedVatSumF = dedVatSumF;
    }

    public BigDecimal getDedVatSumS() {
        return dedVatSumS;
    }

    public void setDedVatSumS(BigDecimal dedVatSumS) {
        this.dedVatSumS = dedVatSumS;
    }

    public Character getIsAqcuistn() {
        return isAqcuistn;
    }

    public void setIsAqcuistn(Character isAqcuistn) {
        this.isAqcuistn = isAqcuistn;
    }

    public BigDecimal getDistribSum() {
        return distribSum;
    }

    public void setDistribSum(BigDecimal distribSum) {
        this.distribSum = distribSum;
    }

    public BigDecimal getDstrbSumFC() {
        return dstrbSumFC;
    }

    public void setDstrbSumFC(BigDecimal dstrbSumFC) {
        this.dstrbSumFC = dstrbSumFC;
    }

    public BigDecimal getDstrbSumSC() {
        return dstrbSumSC;
    }

    public void setDstrbSumSC(BigDecimal dstrbSumSC) {
        this.dstrbSumSC = dstrbSumSC;
    }

    public BigDecimal getGrssProfit() {
        return grssProfit;
    }

    public void setGrssProfit(BigDecimal grssProfit) {
        this.grssProfit = grssProfit;
    }

    public BigDecimal getGrssProfSC() {
        return grssProfSC;
    }

    public void setGrssProfSC(BigDecimal grssProfSC) {
        this.grssProfSC = grssProfSC;
    }

    public BigDecimal getGrssProfFC() {
        return grssProfFC;
    }

    public void setGrssProfFC(BigDecimal grssProfFC) {
        this.grssProfFC = grssProfFC;
    }

    public Integer getVisOrder() {
        return visOrder;
    }

    public void setVisOrder(Integer visOrder) {
        this.visOrder = visOrder;
    }

    public BigDecimal getINMPrice() {
        return iNMPrice;
    }

    public void setINMPrice(BigDecimal iNMPrice) {
        this.iNMPrice = iNMPrice;
    }

    public Integer getPoTrgNum() {
        return poTrgNum;
    }

    public void setPoTrgNum(Integer poTrgNum) {
        this.poTrgNum = poTrgNum;
    }

    public String getPoTrgEntry() {
        return poTrgEntry;
    }

    public void setPoTrgEntry(String poTrgEntry) {
        this.poTrgEntry = poTrgEntry;
    }

    public Character getDropShip() {
        return dropShip;
    }

    public void setDropShip(Character dropShip) {
        this.dropShip = dropShip;
    }

    public Integer getPoLineNum() {
        return poLineNum;
    }

    public void setPoLineNum(Integer poLineNum) {
        this.poLineNum = poLineNum;
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

    public Character getTaxType() {
        return taxType;
    }

    public void setTaxType(Character taxType) {
        this.taxType = taxType;
    }

    public String getOrigItem() {
        return origItem;
    }

    public void setOrigItem(String origItem) {
        this.origItem = origItem;
    }

    public Character getBackOrdr() {
        return backOrdr;
    }

    public void setBackOrdr(Character backOrdr) {
        this.backOrdr = backOrdr;
    }

    public String getFreeTxt() {
        return freeTxt;
    }

    public void setFreeTxt(String freeTxt) {
        this.freeTxt = freeTxt;
    }

    public Character getPickStatus() {
        return pickStatus;
    }

    public void setPickStatus(Character pickStatus) {
        this.pickStatus = pickStatus;
    }

    public BigDecimal getPickOty() {
        return pickOty;
    }

    public void setPickOty(BigDecimal pickOty) {
        this.pickOty = pickOty;
    }

    public Integer getPickIdNo() {
        return pickIdNo;
    }

    public void setPickIdNo(Integer pickIdNo) {
        this.pickIdNo = pickIdNo;
    }

    public Short getTrnsCode() {
        return trnsCode;
    }

    public void setTrnsCode(Short trnsCode) {
        this.trnsCode = trnsCode;
    }

    public BigDecimal getVatAppld() {
        return vatAppld;
    }

    public void setVatAppld(BigDecimal vatAppld) {
        this.vatAppld = vatAppld;
    }

    public BigDecimal getVatAppldFC() {
        return vatAppldFC;
    }

    public void setVatAppldFC(BigDecimal vatAppldFC) {
        this.vatAppldFC = vatAppldFC;
    }

    public BigDecimal getVatAppldSC() {
        return vatAppldSC;
    }

    public void setVatAppldSC(BigDecimal vatAppldSC) {
        this.vatAppldSC = vatAppldSC;
    }

    public BigDecimal getBaseQty() {
        return baseQty;
    }

    public void setBaseQty(BigDecimal baseQty) {
        this.baseQty = baseQty;
    }

    public BigDecimal getBaseOpnQty() {
        return baseOpnQty;
    }

    public void setBaseOpnQty(BigDecimal baseOpnQty) {
        this.baseOpnQty = baseOpnQty;
    }

    public BigDecimal getVatDscntPr() {
        return vatDscntPr;
    }

    public void setVatDscntPr(BigDecimal vatDscntPr) {
        this.vatDscntPr = vatDscntPr;
    }

    public Character getWtLiable() {
        return wtLiable;
    }

    public void setWtLiable(Character wtLiable) {
        this.wtLiable = wtLiable;
    }

    public Character getDeferrTax() {
        return deferrTax;
    }

    public void setDeferrTax(Character deferrTax) {
        this.deferrTax = deferrTax;
    }

    public BigDecimal getEquVatPer() {
        return equVatPer;
    }

    public void setEquVatPer(BigDecimal equVatPer) {
        this.equVatPer = equVatPer;
    }

    public BigDecimal getEquVatSum() {
        return equVatSum;
    }

    public void setEquVatSum(BigDecimal equVatSum) {
        this.equVatSum = equVatSum;
    }

    public BigDecimal getEquVatSumF() {
        return equVatSumF;
    }

    public void setEquVatSumF(BigDecimal equVatSumF) {
        this.equVatSumF = equVatSumF;
    }

    public BigDecimal getEquVatSumS() {
        return equVatSumS;
    }

    public void setEquVatSumS(BigDecimal equVatSumS) {
        this.equVatSumS = equVatSumS;
    }

    public BigDecimal getLineVat() {
        return lineVat;
    }

    public void setLineVat(BigDecimal lineVat) {
        this.lineVat = lineVat;
    }

    public BigDecimal getLineVatlF() {
        return lineVatlF;
    }

    public void setLineVatlF(BigDecimal lineVatlF) {
        this.lineVatlF = lineVatlF;
    }

    public BigDecimal getLineVatS() {
        return lineVatS;
    }

    public void setLineVatS(BigDecimal lineVatS) {
        this.lineVatS = lineVatS;
    }

    public String getUnitMsr() {
        return unitMsr;
    }

    public void setUnitMsr(String unitMsr) {
        this.unitMsr = unitMsr;
    }

    public BigDecimal getNumPerMsr() {
        return numPerMsr;
    }

    public void setNumPerMsr(BigDecimal numPerMsr) {
        this.numPerMsr = numPerMsr;
    }

    public Character getCEECFlag() {
        return cEECFlag;
    }

    public void setCEECFlag(Character cEECFlag) {
        this.cEECFlag = cEECFlag;
    }

    public BigDecimal getToStock() {
        return toStock;
    }

    public void setToStock(BigDecimal toStock) {
        this.toStock = toStock;
    }

    public BigDecimal getToDiff() {
        return toDiff;
    }

    public void setToDiff(BigDecimal toDiff) {
        this.toDiff = toDiff;
    }

    public BigDecimal getExciseAmt() {
        return exciseAmt;
    }

    public void setExciseAmt(BigDecimal exciseAmt) {
        this.exciseAmt = exciseAmt;
    }

    public BigDecimal getTaxPerUnit() {
        return taxPerUnit;
    }

    public void setTaxPerUnit(BigDecimal taxPerUnit) {
        this.taxPerUnit = taxPerUnit;
    }

    public BigDecimal getTotInclTax() {
        return totInclTax;
    }

    public void setTotInclTax(BigDecimal totInclTax) {
        this.totInclTax = totInclTax;
    }

    public String getCountryOrg() {
        return countryOrg;
    }

    public void setCountryOrg(String countryOrg) {
        this.countryOrg = countryOrg;
    }

    public BigDecimal getStckDstSum() {
        return stckDstSum;
    }

    public void setStckDstSum(BigDecimal stckDstSum) {
        this.stckDstSum = stckDstSum;
    }

    public BigDecimal getReleasQtty() {
        return releasQtty;
    }

    public void setReleasQtty(BigDecimal releasQtty) {
        this.releasQtty = releasQtty;
    }

    public Character getLineType() {
        return lineType;
    }

    public void setLineType(Character lineType) {
        this.lineType = lineType;
    }

    public Character getTranType() {
        return tranType;
    }

    public void setTranType(Character tranType) {
        this.tranType = tranType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getOwnerCode() {
        return ownerCode;
    }

    public void setOwnerCode(Integer ownerCode) {
        this.ownerCode = ownerCode;
    }

    public BigDecimal getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(BigDecimal stockPrice) {
        this.stockPrice = stockPrice;
    }

    public Character getConsumeFCT() {
        return consumeFCT;
    }

    public void setConsumeFCT(Character consumeFCT) {
        this.consumeFCT = consumeFCT;
    }

    public BigDecimal getLstByDsSum() {
        return lstByDsSum;
    }

    public void setLstByDsSum(BigDecimal lstByDsSum) {
        this.lstByDsSum = lstByDsSum;
    }

    public BigDecimal getStckINMPr() {
        return stckINMPr;
    }

    public void setStckINMPr(BigDecimal stckINMPr) {
        this.stckINMPr = stckINMPr;
    }

    public BigDecimal getLstBINMPr() {
        return lstBINMPr;
    }

    public void setLstBINMPr(BigDecimal lstBINMPr) {
        this.lstBINMPr = lstBINMPr;
    }

    public BigDecimal getStckDstFc() {
        return stckDstFc;
    }

    public void setStckDstFc(BigDecimal stckDstFc) {
        this.stckDstFc = stckDstFc;
    }

    public BigDecimal getStckDstSc() {
        return stckDstSc;
    }

    public void setStckDstSc(BigDecimal stckDstSc) {
        this.stckDstSc = stckDstSc;
    }

    public BigDecimal getLstByDsFc() {
        return lstByDsFc;
    }

    public void setLstByDsFc(BigDecimal lstByDsFc) {
        this.lstByDsFc = lstByDsFc;
    }

    public BigDecimal getLstByDsSc() {
        return lstByDsSc;
    }

    public void setLstByDsSc(BigDecimal lstByDsSc) {
        this.lstByDsSc = lstByDsSc;
    }

    public BigDecimal getStockSum() {
        return stockSum;
    }

    public void setStockSum(BigDecimal stockSum) {
        this.stockSum = stockSum;
    }

    public BigDecimal getStockSumFc() {
        return stockSumFc;
    }

    public void setStockSumFc(BigDecimal stockSumFc) {
        this.stockSumFc = stockSumFc;
    }

    public BigDecimal getStockSumSc() {
        return stockSumSc;
    }

    public void setStockSumSc(BigDecimal stockSumSc) {
        this.stockSumSc = stockSumSc;
    }

    public BigDecimal getStckSumApp() {
        return stckSumApp;
    }

    public void setStckSumApp(BigDecimal stckSumApp) {
        this.stckSumApp = stckSumApp;
    }

    public BigDecimal getStckAppFc() {
        return stckAppFc;
    }

    public void setStckAppFc(BigDecimal stckAppFc) {
        this.stckAppFc = stckAppFc;
    }

    public BigDecimal getStckAppSc() {
        return stckAppSc;
    }

    public void setStckAppSc(BigDecimal stckAppSc) {
        this.stckAppSc = stckAppSc;
    }

    public String getShipToCode() {
        return shipToCode;
    }

    public void setShipToCode(String shipToCode) {
        this.shipToCode = shipToCode;
    }

    public String getShipToDesc() {
        return shipToDesc;
    }

    public void setShipToDesc(String shipToDesc) {
        this.shipToDesc = shipToDesc;
    }

    public BigDecimal getStckAppD() {
        return stckAppD;
    }

    public void setStckAppD(BigDecimal stckAppD) {
        this.stckAppD = stckAppD;
    }

    public BigDecimal getStckAppDFC() {
        return stckAppDFC;
    }

    public void setStckAppDFC(BigDecimal stckAppDFC) {
        this.stckAppDFC = stckAppDFC;
    }

    public BigDecimal getStckAppDSC() {
        return stckAppDSC;
    }

    public void setStckAppDSC(BigDecimal stckAppDSC) {
        this.stckAppDSC = stckAppDSC;
    }

    public Character getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Character basePrice) {
        this.basePrice = basePrice;
    }

    public BigDecimal getGTotal() {
        return gTotal;
    }

    public void setGTotal(BigDecimal gTotal) {
        this.gTotal = gTotal;
    }

    public BigDecimal getGTotalFC() {
        return gTotalFC;
    }

    public void setGTotalFC(BigDecimal gTotalFC) {
        this.gTotalFC = gTotalFC;
    }

    public BigDecimal getGTotalSC() {
        return gTotalSC;
    }

    public void setGTotalSC(BigDecimal gTotalSC) {
        this.gTotalSC = gTotalSC;
    }

    public Character getDistribExp() {
        return distribExp;
    }

    public void setDistribExp(Character distribExp) {
        this.distribExp = distribExp;
    }

    public Character getDescOW() {
        return descOW;
    }

    public void setDescOW(Character descOW) {
        this.descOW = descOW;
    }

    public Character getDetailsOW() {
        return detailsOW;
    }

    public void setDetailsOW(Character detailsOW) {
        this.detailsOW = detailsOW;
    }

    public Short getGrossBase() {
        return grossBase;
    }

    public void setGrossBase(Short grossBase) {
        this.grossBase = grossBase;
    }

    public BigDecimal getVatWoDpm() {
        return vatWoDpm;
    }

    public void setVatWoDpm(BigDecimal vatWoDpm) {
        this.vatWoDpm = vatWoDpm;
    }

    public BigDecimal getVatWoDpmFc() {
        return vatWoDpmFc;
    }

    public void setVatWoDpmFc(BigDecimal vatWoDpmFc) {
        this.vatWoDpmFc = vatWoDpmFc;
    }

    public BigDecimal getVatWoDpmSc() {
        return vatWoDpmSc;
    }

    public void setVatWoDpmSc(BigDecimal vatWoDpmSc) {
        this.vatWoDpmSc = vatWoDpmSc;
    }

    public String getCFOPCode() {
        return cFOPCode;
    }

    public void setCFOPCode(String cFOPCode) {
        this.cFOPCode = cFOPCode;
    }

    public String getCSTCode() {
        return cSTCode;
    }

    public void setCSTCode(String cSTCode) {
        this.cSTCode = cSTCode;
    }

    public Integer getUsage() {
        return usage;
    }

    public void setUsage(Integer usage) {
        this.usage = usage;
    }

    public Character getTaxOnly() {
        return taxOnly;
    }

    public void setTaxOnly(Character taxOnly) {
        this.taxOnly = taxOnly;
    }

    public Character getWtCalced() {
        return wtCalced;
    }

    public void setWtCalced(Character wtCalced) {
        this.wtCalced = wtCalced;
    }

    public BigDecimal getQtyToShip() {
        return qtyToShip;
    }

    public void setQtyToShip(BigDecimal qtyToShip) {
        this.qtyToShip = qtyToShip;
    }

    public BigDecimal getDelivrdQty() {
        return delivrdQty;
    }

    public void setDelivrdQty(BigDecimal delivrdQty) {
        this.delivrdQty = delivrdQty;
    }

    public BigDecimal getOrderedQty() {
        return orderedQty;
    }

    public void setOrderedQty(BigDecimal orderedQty) {
        this.orderedQty = orderedQty;
    }

    public String getCogsOcrCod() {
        return cogsOcrCod;
    }

    public void setCogsOcrCod(String cogsOcrCod) {
        this.cogsOcrCod = cogsOcrCod;
    }

    public Integer getCiOppLineN() {
        return ciOppLineN;
    }

    public void setCiOppLineN(Integer ciOppLineN) {
        this.ciOppLineN = ciOppLineN;
    }

    public String getCogsAcct() {
        return cogsAcct;
    }

    public void setCogsAcct(String cogsAcct) {
        this.cogsAcct = cogsAcct;
    }

    public Character getChgAsmBoMW() {
        return chgAsmBoMW;
    }

    public void setChgAsmBoMW(Character chgAsmBoMW) {
        this.chgAsmBoMW = chgAsmBoMW;
    }

    public Date getActDelDate() {
        return actDelDate;
    }

    public void setActDelDate(Date actDelDate) {
        this.actDelDate = actDelDate;
    }

    public String getOcrCode2() {
        return ocrCode2;
    }

    public void setOcrCode2(String ocrCode2) {
        this.ocrCode2 = ocrCode2;
    }

    public String getOcrCode3() {
        return ocrCode3;
    }

    public void setOcrCode3(String ocrCode3) {
        this.ocrCode3 = ocrCode3;
    }

    public String getOcrCode4() {
        return ocrCode4;
    }

    public void setOcrCode4(String ocrCode4) {
        this.ocrCode4 = ocrCode4;
    }

    public String getOcrCode5() {
        return ocrCode5;
    }

    public void setOcrCode5(String ocrCode5) {
        this.ocrCode5 = ocrCode5;
    }

    public BigDecimal getTaxDistSum() {
        return taxDistSum;
    }

    public void setTaxDistSum(BigDecimal taxDistSum) {
        this.taxDistSum = taxDistSum;
    }

    public BigDecimal getTaxDistSFC() {
        return taxDistSFC;
    }

    public void setTaxDistSFC(BigDecimal taxDistSFC) {
        this.taxDistSFC = taxDistSFC;
    }

    public BigDecimal getTaxDistSSC() {
        return taxDistSSC;
    }

    public void setTaxDistSSC(BigDecimal taxDistSSC) {
        this.taxDistSSC = taxDistSSC;
    }

    public Character getPostTax() {
        return postTax;
    }

    public void setPostTax(Character postTax) {
        this.postTax = postTax;
    }

    public Character getExcisable() {
        return excisable;
    }

    public void setExcisable(Character excisable) {
        this.excisable = excisable;
    }

    public BigDecimal getAssblValue() {
        return assblValue;
    }

    public void setAssblValue(BigDecimal assblValue) {
        this.assblValue = assblValue;
    }

    public Integer getRG23APart1() {
        return rG23APart1;
    }

    public void setRG23APart1(Integer rG23APart1) {
        this.rG23APart1 = rG23APart1;
    }

    public Integer getRG23APart2() {
        return rG23APart2;
    }

    public void setRG23APart2(Integer rG23APart2) {
        this.rG23APart2 = rG23APart2;
    }

    public Integer getRG23CPart1() {
        return rG23CPart1;
    }

    public void setRG23CPart1(Integer rG23CPart1) {
        this.rG23CPart1 = rG23CPart1;
    }

    public Integer getRG23CPart2() {
        return rG23CPart2;
    }

    public void setRG23CPart2(Integer rG23CPart2) {
        this.rG23CPart2 = rG23CPart2;
    }

    public String getCogsOcrCo2() {
        return cogsOcrCo2;
    }

    public void setCogsOcrCo2(String cogsOcrCo2) {
        this.cogsOcrCo2 = cogsOcrCo2;
    }

    public String getCogsOcrCo3() {
        return cogsOcrCo3;
    }

    public void setCogsOcrCo3(String cogsOcrCo3) {
        this.cogsOcrCo3 = cogsOcrCo3;
    }

    public String getCogsOcrCo4() {
        return cogsOcrCo4;
    }

    public void setCogsOcrCo4(String cogsOcrCo4) {
        this.cogsOcrCo4 = cogsOcrCo4;
    }

    public String getCogsOcrCo5() {
        return cogsOcrCo5;
    }

    public void setCogsOcrCo5(String cogsOcrCo5) {
        this.cogsOcrCo5 = cogsOcrCo5;
    }

    public Character getLnExcised() {
        return lnExcised;
    }

    public void setLnExcised(Character lnExcised) {
        this.lnExcised = lnExcised;
    }

    public Integer getLocCode() {
        return locCode;
    }

    public void setLocCode(Integer locCode) {
        this.locCode = locCode;
    }

    public BigDecimal getStockValue() {
        return stockValue;
    }

    public void setStockValue(BigDecimal stockValue) {
        this.stockValue = stockValue;
    }

    public BigDecimal getGPTtlBasPr() {
        return gPTtlBasPr;
    }

    public void setGPTtlBasPr(BigDecimal gPTtlBasPr) {
        this.gPTtlBasPr = gPTtlBasPr;
    }

    public String getUnitMsr2() {
        return unitMsr2;
    }

    public void setUnitMsr2(String unitMsr2) {
        this.unitMsr2 = unitMsr2;
    }

    public BigDecimal getNumPerMsr2() {
        return numPerMsr2;
    }

    public void setNumPerMsr2(BigDecimal numPerMsr2) {
        this.numPerMsr2 = numPerMsr2;
    }

    public Character getSpecPrice() {
        return specPrice;
    }

    public void setSpecPrice(Character specPrice) {
        this.specPrice = specPrice;
    }

    public String getCSTfIPI() {
        return cSTfIPI;
    }

    public void setCSTfIPI(String cSTfIPI) {
        this.cSTfIPI = cSTfIPI;
    }

    public String getCSTfPIS() {
        return cSTfPIS;
    }

    public void setCSTfPIS(String cSTfPIS) {
        this.cSTfPIS = cSTfPIS;
    }

    public String getCSTfCOFINS() {
        return cSTfCOFINS;
    }

    public void setCSTfCOFINS(String cSTfCOFINS) {
        this.cSTfCOFINS = cSTfCOFINS;
    }

    public String getExLineNo() {
        return exLineNo;
    }

    public void setExLineNo(String exLineNo) {
        this.exLineNo = exLineNo;
    }

    public Character getIsSrvCall() {
        return isSrvCall;
    }

    public void setIsSrvCall(Character isSrvCall) {
        this.isSrvCall = isSrvCall;
    }

    public BigDecimal getPQTReqQty() {
        return pQTReqQty;
    }

    public void setPQTReqQty(BigDecimal pQTReqQty) {
        this.pQTReqQty = pQTReqQty;
    }

    public Date getPQTReqDate() {
        return pQTReqDate;
    }

    public void setPQTReqDate(Date pQTReqDate) {
        this.pQTReqDate = pQTReqDate;
    }

    public Integer getPcDocType() {
        return pcDocType;
    }

    public void setPcDocType(Integer pcDocType) {
        this.pcDocType = pcDocType;
    }

    public BigDecimal getPcQuantity() {
        return pcQuantity;
    }

    public void setPcQuantity(BigDecimal pcQuantity) {
        this.pcQuantity = pcQuantity;
    }

    public Character getLinManClsd() {
        return linManClsd;
    }

    public void setLinManClsd(Character linManClsd) {
        this.linManClsd = linManClsd;
    }

    public Character getVatGrpSrc() {
        return vatGrpSrc;
    }

    public void setVatGrpSrc(Character vatGrpSrc) {
        this.vatGrpSrc = vatGrpSrc;
    }

    public Character getNoInvtryMv() {
        return noInvtryMv;
    }

    public void setNoInvtryMv(Character noInvtryMv) {
        this.noInvtryMv = noInvtryMv;
    }

    public Integer getActBaseEnt() {
        return actBaseEnt;
    }

    public void setActBaseEnt(Integer actBaseEnt) {
        this.actBaseEnt = actBaseEnt;
    }

    public Integer getActBaseLn() {
        return actBaseLn;
    }

    public void setActBaseLn(Integer actBaseLn) {
        this.actBaseLn = actBaseLn;
    }

    public Integer getActBaseNum() {
        return actBaseNum;
    }

    public void setActBaseNum(Integer actBaseNum) {
        this.actBaseNum = actBaseNum;
    }

    public BigDecimal getOpenRtnQty() {
        return openRtnQty;
    }

    public void setOpenRtnQty(BigDecimal openRtnQty) {
        this.openRtnQty = openRtnQty;
    }

    public Integer getAgrNo() {
        return agrNo;
    }

    public void setAgrNo(Integer agrNo) {
        this.agrNo = agrNo;
    }

    public Integer getAgrLnNum() {
        return agrLnNum;
    }

    public void setAgrLnNum(Integer agrLnNum) {
        this.agrLnNum = agrLnNum;
    }

    public Character getCredOrigin() {
        return credOrigin;
    }

    public void setCredOrigin(Character credOrigin) {
        this.credOrigin = credOrigin;
    }

    public BigDecimal getSurpluses() {
        return surpluses;
    }

    public void setSurpluses(BigDecimal surpluses) {
        this.surpluses = surpluses;
    }

    public BigDecimal getDefBreak() {
        return defBreak;
    }

    public void setDefBreak(BigDecimal defBreak) {
        this.defBreak = defBreak;
    }

    public BigDecimal getShortages() {
        return shortages;
    }

    public void setShortages(BigDecimal shortages) {
        this.shortages = shortages;
    }

    public Integer getSlpCode() {
        return slpCode;
    }

    public void setSlpCode(Integer slpCode) {
        this.slpCode = slpCode;
    }

    public Integer getUomEntry() {
        return uomEntry;
    }

    public void setUomEntry(Integer uomEntry) {
        this.uomEntry = uomEntry;
    }

    public Integer getUomEntry2() {
        return uomEntry2;
    }

    public void setUomEntry2(Integer uomEntry2) {
        this.uomEntry2 = uomEntry2;
    }

    public String getUomCode() {
        return uomCode;
    }

    public void setUomCode(String uomCode) {
        this.uomCode = uomCode;
    }

    public String getUomCode2() {
        return uomCode2;
    }

    public void setUomCode2(String uomCode2) {
        this.uomCode2 = uomCode2;
    }

    public String getFromWhsCod() {
        return fromWhsCod;
    }

    public void setFromWhsCod(String fromWhsCod) {
        this.fromWhsCod = fromWhsCod;
    }

    public Character getNeedQty() {
        return needQty;
    }

    public void setNeedQty(Character needQty) {
        this.needQty = needQty;
    }

    public Character getPartRetire() {
        return partRetire;
    }

    public void setPartRetire(Character partRetire) {
        this.partRetire = partRetire;
    }

    public BigDecimal getRetireQty() {
        return retireQty;
    }

    public void setRetireQty(BigDecimal retireQty) {
        this.retireQty = retireQty;
    }

    public BigDecimal getRetireAPC() {
        return retireAPC;
    }

    public void setRetireAPC(BigDecimal retireAPC) {
        this.retireAPC = retireAPC;
    }

    public BigDecimal getRetirAPCFC() {
        return retirAPCFC;
    }

    public void setRetirAPCFC(BigDecimal retirAPCFC) {
        this.retirAPCFC = retirAPCFC;
    }

    public BigDecimal getRetirAPCSC() {
        return retirAPCSC;
    }

    public void setRetirAPCSC(BigDecimal retirAPCSC) {
        this.retirAPCSC = retirAPCSC;
    }

    public BigDecimal getInvQty() {
        return invQty;
    }

    public void setInvQty(BigDecimal invQty) {
        this.invQty = invQty;
    }

    public BigDecimal getOpenInvQty() {
        return openInvQty;
    }

    public void setOpenInvQty(BigDecimal openInvQty) {
        this.openInvQty = openInvQty;
    }

    public Character getEnSetCost() {
        return enSetCost;
    }

    public void setEnSetCost(Character enSetCost) {
        this.enSetCost = enSetCost;
    }

    public BigDecimal getRetCost() {
        return retCost;
    }

    public void setRetCost(BigDecimal retCost) {
        this.retCost = retCost;
    }

    public Integer getIncoterms() {
        return incoterms;
    }

    public void setIncoterms(Integer incoterms) {
        this.incoterms = incoterms;
    }

    public Integer getTransMod() {
        return transMod;
    }

    public void setTransMod(Integer transMod) {
        this.transMod = transMod;
    }

    public String getLineVendor() {
        return lineVendor;
    }

    public void setLineVendor(String lineVendor) {
        this.lineVendor = lineVendor;
    }

    public Character getDistribIS() {
        return distribIS;
    }

    public void setDistribIS(Character distribIS) {
        this.distribIS = distribIS;
    }

    public BigDecimal getISDistrb() {
        return iSDistrb;
    }

    public void setISDistrb(BigDecimal iSDistrb) {
        this.iSDistrb = iSDistrb;
    }

    public BigDecimal getISDistrbFC() {
        return iSDistrbFC;
    }

    public void setISDistrbFC(BigDecimal iSDistrbFC) {
        this.iSDistrbFC = iSDistrbFC;
    }

    public BigDecimal getISDistrbSC() {
        return iSDistrbSC;
    }

    public void setISDistrbSC(BigDecimal iSDistrbSC) {
        this.iSDistrbSC = iSDistrbSC;
    }

    public Character getLinePoPrss() {
        return linePoPrss;
    }

    public void setLinePoPrss(Character linePoPrss) {
        this.linePoPrss = linePoPrss;
    }

    public Character getFreeChrgBP() {
        return freeChrgBP;
    }

    public void setFreeChrgBP(Character freeChrgBP) {
        this.freeChrgBP = freeChrgBP;
    }

    public String getLegalText() {
        return legalText;
    }

    public void setLegalText(String legalText) {
        this.legalText = legalText;
    }

    public Character getTaxRelev() {
        return taxRelev;
    }

    public void setTaxRelev(Character taxRelev) {
        this.taxRelev = taxRelev;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stockTransferDetailPK != null ? stockTransferDetailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StockTransferDetail)) {
            return false;
        }
        StockTransferDetail other = (StockTransferDetail) object;
        if ((this.stockTransferDetailPK == null && other.stockTransferDetailPK != null) || (this.stockTransferDetailPK != null && !this.stockTransferDetailPK.equals(other.stockTransferDetailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StockTransferDetail[ stockTransferDetailPK=" + stockTransferDetailPK + " ]";
    }
}
