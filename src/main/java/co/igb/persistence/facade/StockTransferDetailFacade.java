package co.igb.persistence.facade;

import co.igb.persistence.entity.StockTransferDetail;
import java.util.List;
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
 *
 * @author YEIJARA
 */
@Stateless
public class StockTransferDetailFacade {

    private static final Logger CONSOLE = Logger.getLogger(StockTransferDetailFacade.class.getSimpleName());
    @PersistenceContext(unitName = "IGBPU")
    private EntityManager emIGB;
    @PersistenceContext(unitName = "VARROCPU")
    private EntityManager emVARROC;

    public StockTransferDetailFacade() {
    }

    private EntityManager chooseSchema(String schemaName) {
        switch (schemaName) {
            case "IGB":
                return emIGB;
            case "VARROC":
                return emVARROC;
            default:
                return null;
        }
    }

    public List<StockTransferDetail> findStockTransfer(Integer docEntry, String schema) {
        EntityManager em = chooseSchema(schema);
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
