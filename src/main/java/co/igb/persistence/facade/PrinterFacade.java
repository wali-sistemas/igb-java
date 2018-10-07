package co.igb.persistence.facade;

import co.igb.persistence.entity.Printer;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 * @author dbotero
 */
@Stateless
public class PrinterFacade extends AbstractFacade<Printer> {

    @EJB
    private PersistenceConf persistenceConf;

    @Override
    protected EntityManager getEntityManager() {
        return persistenceConf.chooseSchema("MySQLPU");
    }

    public PrinterFacade() {
        super(Printer.class);
    }
}
