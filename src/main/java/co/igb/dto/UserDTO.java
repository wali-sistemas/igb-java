package co.igb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Objects;

/**
 * @author dbotero
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO implements Comparable<UserDTO> {
    private Integer ordenesAsignadas;
    private String username;
    private String password;
    private String name;
    private String surname;
    private String email;
    private String completeName;
    private String token;
    private String selectedCompany;
    private String warehouseCode;
    private String organization;

    public UserDTO() {
    }

    public UserDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserDTO(String username, String name, String surname, String email, String completeName, String selectedCompany, String organization) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.completeName = completeName;
        this.selectedCompany = selectedCompany;
        this.organization = organization;
    }

    public Integer getOrdenesAsignadas() {
        return ordenesAsignadas;
    }

    public void setOrdenesAsignadas(Integer ordenesAsignadas) {
        this.ordenesAsignadas = ordenesAsignadas;
    }

    public String getSelectedCompany() {
        return selectedCompany;
    }

    public void setSelectedCompany(String selectedCompany) {
        this.selectedCompany = selectedCompany;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "ordenesAsignadas=" + ordenesAsignadas +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", completeName='" + completeName + '\'' +
                ", token='" + token + '\'' +
                ", selectedCompany='" + selectedCompany + '\'' +
                ", warehouseCode='" + warehouseCode + '\'' +
                ", organization='" + organization + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.username);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UserDTO other = (UserDTO) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(UserDTO o) {
        if (this.completeName != null) {
            return this.completeName.compareTo(o.completeName);
        }
        if (this.name != null) {
            if (this.name.compareTo(o.name) == 0 && this.surname != null) {
                return this.surname.compareTo(o.surname);
            } else {
                return this.name.compareTo(o.name);
            }
        }
        return 0;
    }
}
