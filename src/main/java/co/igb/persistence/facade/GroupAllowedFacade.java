package co.igb.persistence.facade;

import co.igb.persistence.entity.GroupAllowed;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Stateless
public class GroupAllowedFacade extends AbstractFacade<GroupAllowed> {

    private static final Logger CONSOLE = Logger.getLogger(DeliveryNoteFacade.class.getSimpleName());
    private static final String DB_TYPE = "mysql";

    @EJB
    private PersistenceConf persistenceConf;

    @Override
    protected EntityManager getEntityManager() {
        return persistenceConf.chooseSchema("MySQLPU", DB_TYPE);
    }

    public GroupAllowedFacade() {
        super(GroupAllowed.class);
    }

    public List<String> listAllowedGroups(String module, String companyName) {
        StringBuilder sb = new StringBuilder();
        sb.append("select distinct ldap_group from groups_allowed where module = '");
        sb.append(module);
        sb.append("'");

        try {
            return persistenceConf.chooseSchema(companyName, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

}
