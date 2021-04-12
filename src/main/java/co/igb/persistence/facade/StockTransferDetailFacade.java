package co.igb.persistence.facade;

import co.igb.persistence.entity.StockTransferDetail;
import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author YEIJARA
 */
@Stateless
public class StockTransferDetailFacade {
    private static final Logger CONSOLE = Logger.getLogger(StockTransferDetailFacade.class.getSimpleName());
    private static final String DB_TYPE_HANA = Constants.DATABASE_TYPE_HANA;
    @EJB
    private PersistenceConf persistenceConf;

    public StockTransferDetailFacade() {
    }

    public List<StockTransferDetail> findStockTransfer(Integer docEntry, String schema, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(schema, testing, DB_TYPE_HANA);
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(\"ItemCode\" as varchar(20))as ItemCode,cast(\"WhsCode\" as varchar(20))as WhsCode,cast(\"Quantity\" as numeric(18,0))as Quantity ");
        sb.append("from WTR1 where \"DocEntry\"=");
        sb.append(docEntry);
        try {
            List<StockTransferDetail> list = new ArrayList<>();
            List<Object[]> objs = em.createNativeQuery(sb.toString()).getResultList();
            for (Object[] o : objs) {
                StockTransferDetail stockTransferDetail = new StockTransferDetail();
                stockTransferDetail.setItemCode((String) o[0]);
                stockTransferDetail.setWhsCode((String) o[1]);
                stockTransferDetail.setQuantity((BigDecimal) o[2]);
                list.add(stockTransferDetail);
            }
            return list;
        } catch (NoResultException e) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el traslado. ", e);
        }
        return null;
    }
}