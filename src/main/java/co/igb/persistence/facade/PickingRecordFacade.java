package co.igb.persistence.facade;

import co.igb.persistence.entity.PickingRecord;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dbotero
 */
@Stateless
public class PickingRecordFacade extends AbstractFacade<PickingRecord> {

    private static final Logger CONSOLE = Logger.getLogger(PickingRecordFacade.class.getSimpleName());

    @PersistenceContext(unitName = "MySQLPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PickingRecordFacade() {
        super(PickingRecord.class);
    }

}
