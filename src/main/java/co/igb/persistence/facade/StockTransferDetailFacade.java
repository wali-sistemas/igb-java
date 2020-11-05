package co.igb.persistence.facade;

import co.igb.persistence.entity.StockTransferDetail;
import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author YEIJARA
 */
@Stateless
public class StockTransferDetailFacade {

    private static final Logger CONSOLE = Logger.getLogger(StockTransferDetailFacade.class.getSimpleName());
    private static final String DB_TYPE = Constants.DATABASE_TYPE_MSSQL;

    @EJB
    private PersistenceConf persistenceConf;

    public StockTransferDetailFacade() {
    }

    public List<StockTransferDetail> findStockTransfer(Integer docEntry, String schema, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(schema, testing, DB_TYPE);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(StockTransferDetail.class);
        Root stock = cq.from(StockTransferDetail.class);
        cq.where(cb.equal(stock.get("stockTransferDetailPK").get("docEntry"), docEntry));
        try {
            return em.createQuery(cq).getResultList();
        } catch (NoResultException e) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el traslado. ", e);
        }
        return null;
    }
}