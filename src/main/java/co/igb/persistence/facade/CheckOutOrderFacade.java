package co.igb.persistence.facade;

import co.igb.persistence.entity.CheckOutOrder;
import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
public class CheckOutOrderFacade {
    private static final Logger CONSOLE = Logger.getLogger(PackingOrderFacade.class.getSimpleName());
    private static final String DB_TYPE_WALI = Constants.DATABASE_TYPE_WALI;
    @EJB
    private PersistenceConf persistenceConf;

    public CheckOutOrderFacade() {
    }

    public void create(CheckOutOrder checkOutOrder, String companyName, boolean testing) {
        CONSOLE.log(Level.INFO, "creando registro check-out para la order #[" + checkOutOrder.getOrderNumber().toString() + "]");
        persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI).persist(checkOutOrder);
    }

    public Integer getIdCheckOut(String orderNumber, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select top 1 idcheckout_order from checkout_order ");
        sb.append("where company_name = '");
        sb.append(companyName);
        sb.append("' and order_number = ");
        sb.append(orderNumber);
        try {
            return (Integer) persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException e) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al obtener el conteo para el check-out con orden #[" + orderNumber + "].", e);
        }
        return 0;
    }

    public List<Object[]> getListItemsBox(Integer delivery, Integer box, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT order_number, delivery_number, item_code, qty_scan, emp_id ");
        sb.append("FROM checkout_order where delivery_number =");
        sb.append(delivery);
        sb.append(" and box_number =");
        sb.append(box);
        sb.append(" order by item_code ASC");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando la lista de items de una caja.");
        }
        return null;
    }
}