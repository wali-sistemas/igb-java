package co.igb.persistence.facade;

import co.igb.persistence.entity.User;
import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * @author dbotero
 */
@Stateless
public class UserFacade {

    private static final String DB_TYPE = Constants.DATABASE_TYPE_MYSQL;

    @EJB
    private PersistenceConf persistenceConf;

    public UserFacade() {
    }

    public void create(User user, String companyName, boolean testing) {
        persistenceConf.chooseSchema(companyName, testing, DB_TYPE).persist(user);
    }

    public User edit(User user, String companyName, boolean testing) {
        return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).merge(user);
    }

    public User find(String username, String companyName, boolean testing) {
        return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).find(User.class, username);
    }

}
