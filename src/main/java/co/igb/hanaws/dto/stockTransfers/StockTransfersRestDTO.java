package co.igb.hanaws.dto.stockTransfers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class StockTransfersRestDTO implements Serializable {
    @JsonProperty("DocEntry")
    protected Long docEntry;
    @JsonProperty("Series")
    protected Long series;
    @JsonProperty("Printed")
    protected String printed;
    @JsonProperty("DocDate")
    protected String docDate;
    @JsonProperty("DueDate")
    protected String dueDate;
    @JsonProperty("CardCode")
    protected String cardCode;
    @JsonProperty("CardName")
    protected String cardName;
    @JsonProperty("Address")
    protected String address;
    @JsonProperty("Reference1")
    protected String reference1;
    @JsonProperty("Reference2")
    protected String reference2;
    @JsonProperty("Comments")
    protected String comments;
    @JsonProperty("JournalMemo")
    protected String journalMemo;
    @JsonProperty("PriceList")
    protected Long priceList;
    @JsonProperty("SalesPersonCode")
    protected Long salesPersonCode;
    @JsonProperty("FromWarehouse")
    protected String fromWarehouse;
    @JsonProperty("ToWarehouse")
    protected String toWarehouse;
    @JsonProperty("CreationDate")
    protected String creationDate;
    @JsonProperty("UpdateDate")
    protected String updateDate;
    @JsonProperty("FinancialPeriod")
    protected Long financialPeriod;
    @JsonProperty("TransNum")
    protected Long transNum;
    @JsonProperty("DocNum")
    protected Long docNum;
    @JsonProperty("TaxDate")
    protected String taxDate;
    @JsonProperty("ContactPerson")
    protected Long contactPerson;
    @JsonProperty("FolioPrefixString")
    protected String folioPrefixString;
    @JsonProperty("FolioNumber")
    protected Long folioNumber;
    @JsonProperty("DocObjectCode")
    protected String docObjectCode;
    @JsonProperty("AuthorizationStatus")
    protected String authorizationStatus;
    @JsonProperty("BPLID")
    protected Long bplid;
    @JsonProperty("BPLName")
    protected String bplName;
    @JsonProperty("VATRegNum")
    protected String vatRegNum;
    @JsonProperty("U_SourceCompany")
    protected String uSourceCompany;
    @JsonProperty("U_SourceEntry")
    protected String uSourceEntry;
    @JsonProperty("U_QCRefNo")
    protected Long uqcRefNo;
    protected List<StockTransfersRestDTO.StockTransferApprovalRequests.StockTransferApprovalRequest> stockTransferApprovalRequests;
    protected List<StockTransfersRestDTO.StockTransferLines.StockTransferLine> stockTransferLines;
    protected StockTransfersRestDTO.StockTransferTaxExtension stockTransferTaxExtension;

    public Long getDocEntry() {
        return docEntry;
    }

    public void setDocEntry(Long docEntry) {
        this.docEntry = docEntry;
    }

    public Long getSeries() {
        return series;
    }

    public void setSeries(Long series) {
        this.series = series;
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

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
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

    public Long getPriceList() {
        return priceList;
    }

    public void setPriceList(Long priceList) {
        this.priceList = priceList;
    }

    public Long getSalesPersonCode() {
        return salesPersonCode;
    }

    public void setSalesPersonCode(Long salesPersonCode) {
        this.salesPersonCode = salesPersonCode;
    }

    public String getFromWarehouse() {
        return fromWarehouse;
    }

    public void setFromWarehouse(String fromWarehouse) {
        this.fromWarehouse = fromWarehouse;
    }

    public String getToWarehouse() {
        return toWarehouse;
    }

    public void setToWarehouse(String toWarehouse) {
        this.toWarehouse = toWarehouse;
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

    public Long getDocNum() {
        return docNum;
    }

    public void setDocNum(Long docNum) {
        this.docNum = docNum;
    }

    public String getTaxDate() {
        return taxDate;
    }

    public void setTaxDate(String taxDate) {
        this.taxDate = taxDate;
    }

    public Long getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(Long contactPerson) {
        this.contactPerson = contactPerson;
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

    public String getDocObjectCode() {
        return docObjectCode;
    }

    public void setDocObjectCode(String docObjectCode) {
        this.docObjectCode = docObjectCode;
    }

    public String getAuthorizationStatus() {
        return authorizationStatus;
    }

    public void setAuthorizationStatus(String authorizationStatus) {
        this.authorizationStatus = authorizationStatus;
    }

    public Long getBplid() {
        return bplid;
    }

    public void setBplid(Long bplid) {
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

    public List<StockTransferApprovalRequests.StockTransferApprovalRequest> getStockTransferApprovalRequests() {
        return stockTransferApprovalRequests;
    }

    public void setStockTransferApprovalRequests(List<StockTransferApprovalRequests.StockTransferApprovalRequest> stockTransferApprovalRequests) {
        this.stockTransferApprovalRequests = stockTransferApprovalRequests;
    }

    public List<StockTransferLines.StockTransferLine> getStockTransferLines() {
        return stockTransferLines;
    }

    public void setStockTransferLines(List<StockTransferLines.StockTransferLine> stockTransferLines) {
        this.stockTransferLines = stockTransferLines;
    }

    public StockTransferTaxExtension getStockTransferTaxExtension() {
        return stockTransferTaxExtension;
    }

    public void setStockTransferTaxExtension(StockTransferTaxExtension stockTransferTaxExtension) {
        this.stockTransferTaxExtension = stockTransferTaxExtension;
    }

    public static class StockTransferApprovalRequests {
        public static class StockTransferApprovalRequest {
            @JsonProperty("ApprovalTemplatesID")
            protected Long approvalTemplatesID;
            @JsonProperty("Remarks")
            protected String remarks;


        }

    }

    public static class StockTransferLines {
        public static class StockTransferLine {
            @JsonProperty("LineNum")
            protected Long lineNum;
            @JsonProperty("DocEntry")
            protected Long docEntry;
            @JsonProperty("ItemCode")
            protected String itemCode;
            @JsonProperty("ItemDescription")
            protected String itemDescription;
            @JsonProperty("Quantity")
            protected Double quantity;
            @JsonProperty("Price")
            protected Double price;
            @JsonProperty("Currency")
            protected String currency;
            @JsonProperty("Rate")
            protected Double rate;
            @JsonProperty("DiscountPercent")
            protected Double discountPercent;
            @JsonProperty("VendorNum")
            protected String vendorNum;
            @JsonProperty("SerialNumber")
            protected String serialNumber;
            @JsonProperty("WarehouseCode")
            protected String warehouseCode;
            @JsonProperty("FromWarehouseCode")
            protected String fromWarehouseCode;
            @JsonProperty("ProjectCode")
            protected String projectCode;
            @JsonProperty("Factor")
            protected Double factor;
            @JsonProperty("Factor2")
            protected Double factor2;
            @JsonProperty("Factor3")
            protected Double factor3;
            @JsonProperty("Factor4")
            protected Double factor4;
            @JsonProperty("DistributionRule")
            protected String distributionRule;
            @JsonProperty("DistributionRule2")
            protected String distributionRule2;
            @JsonProperty("DistributionRule3")
            protected String distributionRule3;
            @JsonProperty("DistributionRule4")
            protected String distributionRule4;
            @JsonProperty("DistributionRule5")
            protected String distributionRule5;
            @JsonProperty("UseBaseUnits")
            protected String useBaseUnits;
            @JsonProperty("MeasureUnit")
            protected String measureUnit;
            @JsonProperty("UnitsOfMeasurment")
            protected Double unitsOfMeasurment;
            @JsonProperty("BaseType")
            protected String baseType;
            @JsonProperty("BaseLine")
            protected Long baseLine;
            @JsonProperty("BaseEntry")
            protected Long baseEntry;
            @JsonProperty("UnitPrice")
            protected Double unitPrice;
            @JsonProperty("UoMEntry")
            protected Long uoMEntry;
            @JsonProperty("UoMCode")
            protected String uoMCode;
            @JsonProperty("InventoryQuantity")
            protected Double inventoryQuantity;
            @JsonProperty("RemainingOpenQuantity")
            protected Double remainingOpenQuantity;
            @JsonProperty("RemainingOpenInventoryQuantity")
            protected Double remainingOpenInventoryQuantity;
            @JsonProperty("U_ExPrice")
            protected Double uExPrice;
            @JsonProperty("U_ExCurrency")
            protected String uExCurrency;
            @JsonProperty("U_ExRefNo")
            protected String uExRefNo;
            @JsonProperty("U_Color")
            protected String uColor;
            @JsonProperty("SerialNumbers")
            protected List<StockTransfersRestDTO.StockTransferLines.StockTransferLine.SerialNumbers> serialNumbers;
            @JsonProperty("BatchNumbers")
            protected StockTransfersRestDTO.StockTransferLines.StockTransferLine.BatchNumbers batchNumbers;
            @JsonProperty("StockTransferLinesBinAllocations")
            protected StockTransfersRestDTO.StockTransferLines.StockTransferLine.StockTransferLinesBinAllocations stockTransferLinesBinAllocations;

            public static class BatchNumbers {
                public static class BatchNumber {
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

            public static class SerialNumbers {
                public static class SerialNumber {
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

            public static class StockTransferLinesBinAllocations {
                public static class StockTransferLinesBinAllocation {
                    @JsonProperty("BinAbsEntry")
                    protected Long binAbsEntry;
                    @JsonProperty("Quantity")
                    protected Double quantity;
                    @JsonProperty("AllowNegativeQuantity")
                    protected String allowNegativeQuantity;
                    @JsonProperty("SerialAndBatchNumbersBaseLine")
                    protected Long serialAndBatchNumbersBaseLine;
                    @JsonProperty("BinActionType")
                    protected String binActionType;
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

                    public String getBinActionType() {
                        return binActionType;
                    }

                    public void setBinActionType(String binActionType) {
                        this.binActionType = binActionType;
                    }

                    public Long getBaseLineNumber() {
                        return baseLineNumber;
                    }

                    public void setBaseLineNumber(Long baseLineNumber) {
                        this.baseLineNumber = baseLineNumber;
                    }
                }
            }
        }
    }

    public static class StockTransferTaxExtension {
        @JsonProperty("SupportVAT")
        protected String supportVAT;
        @JsonProperty("FormNumber")
        protected String formNumber;
        @JsonProperty("TransactionCategory")
        protected String transactionCategory;

        public String getSupportVAT() {
            return supportVAT;
        }

        public void setSupportVAT(String supportVAT) {
            this.supportVAT = supportVAT;
        }

        public String getFormNumber() {
            return formNumber;
        }

        public void setFormNumber(String formNumber) {
            this.formNumber = formNumber;
        }

        public String getTransactionCategory() {
            return transactionCategory;
        }

        public void setTransactionCategory(String transactionCategory) {
            this.transactionCategory = transactionCategory;
        }
    }
}