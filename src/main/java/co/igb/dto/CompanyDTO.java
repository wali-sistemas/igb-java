package co.igb.dto;

/**
 * @author dbotero
 */
public class CompanyDTO implements Comparable<CompanyDTO> {

    private String companyId;
    private String companyName;
    private boolean testCompany;

    public CompanyDTO() {
    }

    public CompanyDTO(String companyId, String companyName, boolean testCompany) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.testCompany = testCompany;
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

    public boolean isTestCompany() {
        return testCompany;
    }

    public void setTestCompany(boolean testCompany) {
        this.testCompany = testCompany;
    }

    @Override
    public String toString() {
        return "CompanyDTO{" +
                "companyId='" + companyId + '\'' +
                ", companyName='" + companyName + '\'' +
                ", testCompany=" + testCompany +
                '}';
    }

    @Override
    public int compareTo(CompanyDTO o) {
        return companyName.compareTo(o.getCompanyName());
    }
}
