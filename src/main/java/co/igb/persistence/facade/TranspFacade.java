package co.igb.persistence.facade;

import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
public class TranspFacade {
    private static final Logger CONSOLE = Logger.getLogger(TranspFacade.class.getSimpleName());
    private static final String DB_TYPE_HANA = Constants.DATABASE_TYPE_HANA;
    @EJB
    private PersistenceConf persistenceConf;

    public TranspFacade() {
    }

    public List<Object[]> listTranspActive(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(\"Code\" as varchar(2))as code,cast(\"Name\" as varchar(50))as name ");
        sb.append("from \"@TRANSP\" ");
        sb.append("where \"U_Activo\"='Y'");
        try {
           return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error listando las trasnportadoras activas");
        }
        return new ArrayList<>();
    }
}