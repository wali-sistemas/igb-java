package co.igb.persistence.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "groups_allowed")
public class GroupAllowed implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idgroups_allowed")
    private Long id;
    @Basic(optional = false)
    @Column(name = "ldap_group")
    private String ldapGroup;
    @Basic(optional = false)
    @Column(name = "module")
    private String module;

    public GroupAllowed() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLdapGroup() {
        return ldapGroup;
    }

    public void setLdapGroup(String ldapGroup) {
        this.ldapGroup = ldapGroup;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupAllowed that = (GroupAllowed) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "GroupAllowed{" +
                "id=" + id +
                ", ldapGroup='" + ldapGroup + '\'' +
                ", module='" + module + '\'' +
                '}';
    }
}
