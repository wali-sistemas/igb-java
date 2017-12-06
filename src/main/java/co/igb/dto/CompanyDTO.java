package co.igb.dto;

/**
 *
 * @author dbotero
 */
public class CompanyDTO {

    private String companyId;
    private String companyName;

    public CompanyDTO() {
    }

    public CompanyDTO(String companyId, String companyName) {
        this.companyId = companyId;
        this.companyName = companyName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "CompanyDTO{" + "companyId=" + companyId + ", companyName=" + companyName + '}';
    }
}
