package co.igb.persistence.facade;

import co.igb.persistence.entity.ReportPickingProgress;
import co.igb.persistence.entity.ReportPickingProgress_;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * @author dbotero
 */
@Stateless
public class ReportPickingProgressFacade extends AbstractFacade<ReportPickingProgress> {

    private static final Logger CONSOLE = Logger.getLogger(ReportPickingProgressFacade.class.getSimpleName());

    @PersistenceContext(unitName = "MySQLPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ReportPickingProgressFacade() {
        super(ReportPickingProgress.class);
    }

    public ReportPickingProgress obtainReportOrder(Integer orderNumber) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(ReportPickingProgress.class);
        Root report = cq.from(ReportPickingProgress.class);

        cq.where(cb.equal(report.get(ReportPickingProgress_.orderNumber), orderNumber));

        try {
            return (ReportPickingProgress) em.createQuery(cq).getSingleResult();
        } catch (NoResultException e) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el reporte para una orden. ", e);
        }
        return null;
    }
}
