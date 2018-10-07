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

    @EJB
    private PersistenceConf persistenceConf;

    @Override
    protected EntityManager getEntityManager() {
        return persistenceConf.chooseSchema("MySQLPU");
    }

    public UserFacade() {
        super(User.class);
    }

}
