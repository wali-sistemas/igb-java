package co.igb.persistence.facade;

import co.igb.persistence.entity.User;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 * @author dbotero
 */
@Stateless
public class UserFacade extends AbstractFacade<User> {

    private static final String DB_TYPE = "mysql";

    @EJB
    private PersistenceConf persistenceConf;

    @Override
    protected EntityManager getEntityManager() {
        return persistenceConf.chooseSchema("MySQLPU", DB_TYPE);
    }

    public UserFacade() {
        super(User.class);
    }

}
