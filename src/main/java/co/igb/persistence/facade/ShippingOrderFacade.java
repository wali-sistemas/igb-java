package co.igb.persistence.facade;

import co.igb.persistence.entity.ShippingOrder;
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
public class ShippingOrderFacade {
    private static final Logger CONSOLE = Logger.getLogger(ShippingOrder.class.getSimpleName());
    private static final String DB_TYPE = Constants.DATABASE_TYPE_MYSQL;

    @EJB
    private PersistenceConf persistenceConf;

    public ShippingOrderFacade() {
    }

    public void create(ShippingOrder shippingOrder, String companyName, boolean testing) {
        CONSOLE.log(Level.INFO, "Creando registro shipping para la factura #[" + shippingOrder.getInvoiceNumber() + "]");
        persistenceConf.chooseSchema(companyName, testing, DB_TYPE).persist(shippingOrder);
    }

    public List<String> listTransPayroll(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT distinct s.transport_name FROM shipping_order s WHERE cast(s.datetime_shipping as date) = curdate() ORDER BY s.transport_name ASC");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al listar las transportadoras planilladas.", e);
        }
        return null;
    }
}