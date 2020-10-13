package co.igb.persistence.facade;

import co.igb.persistence.entity.Printer;
import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * @author dbotero
 */
@Stateless
public class PrinterFacade {

    private static final String DB_TYPE_WALI = Constants.DATABASE_TYPE_WALI;

    @EJB
    private PersistenceConf persistenceConf;

    public PrinterFacade() {
    }

    public List<Printer> findAll(String companyName, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI);
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Printer.class));
        return em.createQuery(cq).getResultList();
    }
}