package co.igb.persistence.facade;

import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Stateless
public class GroupAllowedFacade {

    private static final Logger CONSOLE = Logger.getLogger(DeliveryNoteFacade.class.getSimpleName());
    private static final String DB_TYPE = Constants.DATABASE_TYPE_MYSQL;

    @EJB
    private PersistenceConf persistenceConf;

    public GroupAllowedFacade() {
    }

    public List<String> listAllowedGroups(String module, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select distinct ldap_group from groups_allowed where module = '");
        sb.append(module);
        sb.append("'");

        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

}
