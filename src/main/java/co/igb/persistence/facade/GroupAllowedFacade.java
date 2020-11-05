package co.igb.persistence.facade;

import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Stateless
public class GroupAllowedFacade {

    private static final Logger CONSOLE = Logger.getLogger(GroupAllowedFacade.class.getSimpleName());
    private static final String DB_TYPE_WALI = Constants.DATABASE_TYPE_WALI;

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
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al listar los perfiles del wms.", e);
            return new ArrayList<>();
        }
    }
}