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
    private static final String DB_TYPE_WALI = Constants.DATABASE_TYPE_WALI;
    private static final String DB_TYPE_MSSQL = Constants.DATABASE_TYPE_MSSQL;

    @EJB
    private PersistenceConf persistenceConf;

    public ShippingOrderFacade() {
    }

    public void create(ShippingOrder shippingOrder, String companyName, boolean testing) {
        CONSOLE.log(Level.INFO, "Creando registro shipping para la factura #[" + shippingOrder.getInvoiceNumber() + "]");
        persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI).persist(shippingOrder);
    }

    public List<String> listTransPayroll(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT distinct s.transport_name FROM shipping_order s WHERE cast(s.datetime_shipping as date) = curdate() ORDER BY s.transport_name ASC");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al listar las transportadoras planilladas.", e);
        }
        return null;
    }

    public Integer getOrdersForShipping(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(count(f.DocNum) as int) as ordenes from OINV f where f.U_SHIPPING = 'N' and f.U_TOT_CAJ > 0");
        try {
            return (Integer) persistenceConf.chooseSchema(companyName, testing, DB_TYPE_MSSQL).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando el total de ordenes pendientes por shipping.", e);
        }
        return 0;
    }
}