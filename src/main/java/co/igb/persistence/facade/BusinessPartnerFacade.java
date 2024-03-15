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
public class BusinessPartnerFacade {
    private static final Logger CONSOLE = Logger.getLogger(CustomerFacade.class.getSimpleName());
    private static final String DB_TYPE_HANA = Constants.DATABASE_TYPE_HANA;
    @EJB
    private PersistenceConf persistenceConf;

    public List<Object[]> listSalesPersonActives(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(\"SlpCode\" as varchar(5))as slpCode,cast(\"SlpName\" as varchar(100))as slpName, ");
        if (companyName.contains("IGB")) {
            sb.append(" cast(\"Telephone\" as varchar(100))as whsCodeTireDefault,'01'as whsCodePartsDefault,cast(\"Memo\" as varchar(100))as regional ");
        } else {
            sb.append(" cast(\"Memo\" as varchar(100))as whsCodeTireDefault,cast(\"Telephone\" as varchar(100))as whsCodePartsDefault,cast(\"U_REGIONAL\" as varchar(100))as regional ");
        }
        sb.append("from OSLP ");
        sb.append("where \"Fax\"='Y' ");
        sb.append("order by \"SlpCode\" asc");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los asesores comerciales en " + companyName, e);
        }
        return new ArrayList<>();
    }
}