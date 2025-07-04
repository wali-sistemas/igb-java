package co.igb.hanaws.dto.deliveryNotes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeliveryDTO implements Serializable {
    @JsonProperty("CardCode")
    protected String cardCode;
    @JsonProperty("Comments")
    protected String comments;
    @JsonProperty("Series")
    protected Long series;
    @JsonProperty("U_TOT_CAJ")
    protected Double utotcaj;
    @JsonProperty("U_NUNFAC")
    protected String ununfac;
    @JsonProperty("U_VR_DECLARADO")
    protected BigDecimal uvrdeclarado;
    @JsonProperty("U_TRANSP")
    protected String utransp;
    @JsonProperty("U_TOT_LIOS")
    protected BigDecimal utotlios;
    @JsonProperty("U_SEPARADOR")
    protected String useparador;
    @JsonProperty("U_DESPACHO_CONTADO")
    protected String udespachoContado;
    @JsonProperty("U_VLR_FLE")
    protected BigDecimal uvlrfle;
    @JsonProperty("U_PESO_BRUTO")
    protected BigDecimal upesobruto;
    @JsonProperty("DocumentLines")
    protected List<DeliveryDTO.DocumentLines.DocumentLine> documentLines;
    @JsonProperty("DocumentAdditionalExpenses")
    protected List<DeliveryDTO.DocumentAdditionalExpenses.DocumentAdditionalExpense> documentAdditionalExpenses;

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

    public BigDecimal getUvrdeclarado() {
        return uvrdeclarado;
    }

    public void setUvrdeclarado(BigDecimal uvrdeclarado) {
        this.uvrdeclarado = uvrdeclarado;
    }

    public List<DeliveryDTO.DocumentLines.DocumentLine> getDocumentLines() {
        return documentLines;
    }

    public void setDocumentLines(List<DeliveryDTO.DocumentLines.DocumentLine> documentLines) {
        this.documentLines = documentLines;
    }

    public String getUtransp() {
        return utransp;
    }

    public void setUtransp(String utransp) {
        this.utransp = utransp;
    }

    public BigDecimal getUtotlios() {
        return utotlios;
    }

    public void setUtotlios(BigDecimal utotlios) {
        this.utotlios = utotlios;
    }

    public String getUseparador() {
        return useparador;
    }

    public void setUseparador(String useparador) {
        this.useparador = useparador;
    }

    public String getUdespachoContado() {
        return udespachoContado;
    }

    public void setUdespachoContado(String udespachoContado) {
        this.udespachoContado = udespachoContado;
    }

    public BigDecimal getUvlrfle() {
        return uvlrfle;
    }

    public void setUvlrfle(BigDecimal uvlrfle) {
        this.uvlrfle = uvlrfle;
    }

    public BigDecimal getUpesobruto() {
        return upesobruto;
    }

    public void setUpesobruto(BigDecimal upesobruto) {
        this.upesobruto = upesobruto;
    }

    public List<DocumentAdditionalExpenses.DocumentAdditionalExpense> getDocumentAdditionalExpenses() {
        return documentAdditionalExpenses;
    }

    public void setDocumentAdditionalExpenses(List<DocumentAdditionalExpenses.DocumentAdditionalExpense> documentAdditionalExpenses) {
        this.documentAdditionalExpenses = documentAdditionalExpenses;
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
            @JsonProperty("TaxOnly")
            protected String taxOnly;
            @JsonProperty("DocumentLinesBinAllocations")
            protected List<DeliveryDTO.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation> documentLinesBinAllocations;

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

            public String getTaxOnly() {
                return taxOnly;
            }

            public void setTaxOnly(String taxOnly) {
                this.taxOnly = taxOnly;
            }

            public List<DeliveryDTO.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation> getDocumentLinesBinAllocations() {
                return documentLinesBinAllocations;
            }

            public void setDocumentLinesBinAllocations(List<DeliveryDTO.DocumentLines.DocumentLine.DocumentLinesBinAllocations.DocumentLinesBinAllocation> documentLinesBinAllocations) {
                this.documentLinesBinAllocations = documentLinesBinAllocations;
            }

            public static class DocumentLinesBinAllocations {
                public static class DocumentLinesBinAllocation {
                    @JsonProperty("BinAbsEntry")
                    protected Long binAbsEntry;
                    @JsonProperty("Quantity")
                    protected Double quantity;
                    @JsonProperty("AllowNegativeQuantity")
                    protected String allowNegativeQuantity;
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

    @Override
    public String toString() {
        return "DeliveryDTO{" +
                "cardCode='" + cardCode + '\'' +
                ", comments='" + comments + '\'' +
                ", series=" + series +
                ", utotcaj=" + utotcaj +
                ", ununfac='" + ununfac + '\'' +
                ", uvrdeclarado=" + uvrdeclarado +
                ", utransp='" + utransp + '\'' +
                ", utotlios=" + utotlios +
                ", useparador='" + useparador + '\'' +
                ", udespachoContado='" + udespachoContado + '\'' +
                ", uvlrfle=" + uvlrfle +
                ", upesobruto=" + upesobruto +
                ", documentLines=" + documentLines +
                ", documentAdditionalExpenses=" + documentAdditionalExpenses +
                '}';
    }
}