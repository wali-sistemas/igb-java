package co.igb.persistence.facade;

import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
public class SalesPersonFacade {
    private static final Logger CONSOLE = Logger.getLogger(SalesPersonFacade.class.getSimpleName());
    private static final String DB_TYPE_HANA = Constants.DATABASE_TYPE_HANA;
    @EJB
    private PersistenceConf persistenceConf;
    private Exception e;

    public SalesPersonFacade() {
    }

    public List<Object[]> listSalesPersonsActives(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(\"SlpCode\" as int)as slpCode,cast(\"SlpName\" as varchar(100))as slpName ");
        sb.append("from OSLP ");
        sb.append("where \"Locked\"='N' and \"Active\"='Y'");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error listando el personal de ventas para la empresa " + companyName, e);
        }
        return new ArrayList<>();
    }
}
