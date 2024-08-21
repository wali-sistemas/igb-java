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
        sb.append("select cast(\"Code\" as varchar(6))as code,cast(\"Name\" as varchar(50))as name ");
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

    public Integer getSerieStart(Integer codTransp, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(\"U_serieNext\" as int)as serie ");
        sb.append("from \"@TRANSP\" ");
        sb.append("where \"Code\"=");
        sb.append(codTransp);
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult().hashCode();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando la serie de consecutivo para crear guia con codTtans=" + codTransp, e);
        }
        return null;
    }

    public void updateSerieLast(Integer codTransp, Integer guia, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("update \"@TRANSP\" set \"U_serieNext\"=");
        sb.append(guia);
        sb.append(" where \"Code\"=");
        sb.append(codTransp);
        try {
            persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).executeUpdate();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error actualizando la ultima guia creada para la transportadora de codigo " + codTransp, e);
        }
    }
}