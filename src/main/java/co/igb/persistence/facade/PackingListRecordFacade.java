package co.igb.persistence.facade;

import co.igb.persistence.entity.PackingListRecord;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dbotero
 */
@Stateless
public class PackingListRecordFacade extends AbstractFacade<PackingListRecord> {

    private static final Logger CONSOLE = Logger.getLogger(PackingListRecordFacade.class.getSimpleName());

    @PersistenceContext(unitName = "MySQLPU")
    private EntityManager em;

    public PackingListRecordFacade() {
        super(PackingListRecord.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Integer getNextPackingListId() {
        StringBuilder sb = new StringBuilder();
        sb.append("select ifnull(max(idpacking_list_record),0)+1 as next from packing_list_record");
        try {
            return ((BigInteger) em.createNativeQuery(sb.toString()).getSingleResult()).intValue();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al obtener el siguiente id para packing list.", e);
            return 0;
        }
    }
}
