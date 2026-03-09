package co.igb.persistence.facade;

import co.igb.persistence.entity.User;
import co.igb.persistence.entity.User_;
import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dbotero
 */
@Stateless
public class UserFacade {
    private static final Logger CONSOLE = Logger.getLogger(UserFacade.class.getSimpleName());
    private static final String DB_TYPE_WALI = Constants.DATABASE_TYPE_WALI;

    @EJB
    private PersistenceConf persistenceConf;

    public UserFacade() {
    }

    public void create(User user, String companyName, boolean testing) {
        persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI).persist(user);
    }

    public User edit(User user, String companyName, boolean testing) {
        return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI).merge(user);
    }

    public User find(String username, String companyName, boolean testing) {
        return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI).find(User.class, username);
    }

    public List<User> findByMemberOf(String rol, String companyName, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<User> cq = cb.createQuery(User.class);
        Root<User> root = cq.from(User.class);
        Predicate predicate = cb.like(cb.lower(root.get(User_.memberOf)), "%" + rol + "%");
        cq.select(root).where(predicate);
        //Predicate predicateEqual = cb.equal(root.get(User_.companyName), companyName);
        //Predicate predicateLike = cb.like(cb.lower(root.get(User_.memberOf)), "%" + rol + "%");
        //cq.select(root).where(cb.and(predicateEqual,predicateLike));
        try {
            return em.createQuery(cq).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error listando los usuarios. ", e);
        }
        return new ArrayList<>();
    }
}