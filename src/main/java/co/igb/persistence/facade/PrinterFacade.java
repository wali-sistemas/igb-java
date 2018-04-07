package co.igb.persistence.facade;

import co.igb.persistence.entity.Printer;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dbotero
 */
@Stateless
public class PrinterFacade extends AbstractFacade<Printer> {

    @PersistenceContext(unitName = "MySQLPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PrinterFacade() {
        super(Printer.class);
    }
}
