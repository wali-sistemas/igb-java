package co.igb.persistence.facade;

import co.igb.persistence.entity.ReportPickingProgress;
import co.igb.persistence.entity.ReportPickingProgress_;
import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dbotero
 */
@Stateless
public class ReportPickingProgressFacade {

    private static final Logger CONSOLE = Logger.getLogger(ReportPickingProgressFacade.class.getSimpleName());
    private static final String DB_TYPE = Constants.DATABASE_TYPE_MYSQL;

    @EJB
    private PersistenceConf persistenceConf;

    public ReportPickingProgressFacade() {

    }

    public void create(ReportPickingProgress reportPickingProgress, String companyName, boolean testing) {
        persistenceConf.chooseSchema(companyName, testing, DB_TYPE).persist(reportPickingProgress);
    }

    public ReportPickingProgress obtainReportOrder(Integer orderNumber, String companyName, boolean testing) {
        CriteriaBuilder cb = persistenceConf.chooseSchema(companyName, testing, DB_TYPE).getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(ReportPickingProgress.class);
        Root report = cq.from(ReportPickingProgress.class);

        cq.where(cb.equal(report.get(ReportPickingProgress_.orderNumber), orderNumber));

        try {
            return (ReportPickingProgress) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createQuery(cq).getSingleResult();
        } catch (NoResultException e) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el reporte para una orden. ", e);
        }
        return null;
    }
}
