package co.igb.persistence.facade;

import co.igb.persistence.entity.LocationLimit;
import co.igb.persistence.entity.LocationLimit_;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dbotero
 */
@Stateless
public class LocationLimitFacade {

    private static final Logger CONSOLE = Logger.getLogger(LocationLimitFacade.class.getSimpleName());
    private static final String DB_TYPE = "sap";

    @EJB
    private PersistenceConf persistenceConf;

    public LocationLimitFacade() {
    }

    public List<Object> listLocationsLimits(String schema, String warehouseCode) {
        EntityManager em = persistenceConf.chooseSchema(schema, DB_TYPE);
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT CONVERT(VARCHAR(30),Code) AS code, CONVERT(VARCHAR(30),Name) AS Name, ");
        sb.append("       CONVERT(VARCHAR(20),U_Ubicacion) AS U_Ubicacion, CONVERT(VARCHAR(20),U_Item) AS U_Item, ");
        sb.append("       CONVERT(INT,U_CantMinima) AS U_CantMinima, CONVERT(int,U_CantMaxima) AS U_CantMaxima ");
        sb.append("FROM [@LIMITES_UBICACION]");

        try {
            return em.createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException e) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al obtener los limites de las ubicaciones. ", e);
        }
        return null;
    }

    public void editLimit(String schema, LocationLimit limit) {
        EntityManager em = persistenceConf.chooseSchema(schema, DB_TYPE);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaUpdate cu = cb.createCriteriaUpdate(LocationLimit.class);
        Root limite = cu.from(LocationLimit.class);

        cu.set(LocationLimit_.cantMaxima, limit.getCantMaxima());
        cu.set(LocationLimit_.cantMinima, limit.getCantMinima());
        cu.where(cb.equal(limite.get(LocationLimit_.code), limit.getCode()));

        try {
            em.createQuery(cu).executeUpdate();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al actualizar los limites de ubicacion. ", e);
        }
    }

    public void createLimit(String schema, LocationLimit limit) {
        StringBuilder sb = new StringBuilder();

        sb.append("INSERT INTO [dbo].[@LIMITES_UBICACION] ");
        sb.append("([Code], [Name], [U_Ubicacion], [U_Item], [U_CantMinima], [U_CantMaxima]) ");
        sb.append("VALUES ('");
        sb.append(limit.getCode()).append("', '");
        sb.append(limit.getName()).append("', '");
        sb.append(limit.getUbicacion()).append("', '");
        sb.append(limit.getItem()).append("', ");
        sb.append(limit.getCantMinima()).append(", ");
        sb.append(limit.getCantMaxima()).append(") ");

        try {
            persistenceConf.chooseSchema(schema, DB_TYPE).createNativeQuery(sb.toString()).executeUpdate();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al crear el nuevo limite de ubicacion. ", e);
        }
    }

    public void deleteLimit(String code, String schema) {
        EntityManager em = persistenceConf.chooseSchema(schema, DB_TYPE);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaDelete cd = cb.createCriteriaDelete(LocationLimit.class);
        Root limit = cd.from(LocationLimit.class);

        cd.where(cb.equal(limit.get(LocationLimit_.code), code));

        try {
            em.createQuery(cd).executeUpdate();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al eliminar el limite de ubicacion. ", e);
        }
    }
}
