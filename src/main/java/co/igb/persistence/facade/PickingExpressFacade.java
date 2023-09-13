package co.igb.persistence.facade;

import co.igb.persistence.entity.PickingExpress;
import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
public class PickingExpressFacade {
    private static final Logger CONSOLE = Logger.getLogger(PickingExpressFacade.class.getSimpleName());
    private static final String DB_TYPE_WALI = Constants.DATABASE_TYPE_WALI;
    @EJB
    private PersistenceConf persistenceConf;

    public PickingExpressFacade() {
    }

    public void create(PickingExpress PickingExpress, String companyName, boolean testing) {
        persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI).persist(PickingExpress);
    }

    public PickingExpress find(Long idPackingExpress, String companyName, boolean testing) {
        return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI).find(PickingExpress.class, idPackingExpress);
    }
}