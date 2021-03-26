package co.igb.hanaws.dto.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DetailDTO implements Serializable {
    @JsonProperty("DocumentLines")
    protected List<DocumentLines.DocumentLine> documentLines;

    public static class DocumentLines {
        public static class DocumentLine {
            @JsonProperty("LineNum")
            protected Long lineNum;
            @JsonProperty("Quantity")
            protected Double quantity;

            public Long getLineNum() {
                return lineNum;
            }

            public void setLineNum(Long lineNum) {
                this.lineNum = lineNum;
            }

            public Double getQuantity() {
                return quantity;
            }

            public void setQuantity(Double quantity) {
                this.quantity = quantity;
            }
        }
    }

    public List<DocumentLines.DocumentLine> getDocumentLines() {
        return documentLines;
    }

    public void setDocumentLines(List<DocumentLines.DocumentLine> documentLines) {
        this.documentLines = documentLines;
    }
}