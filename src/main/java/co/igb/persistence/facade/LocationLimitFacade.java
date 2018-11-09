package co.igb.persistence.facade;

import co.igb.persistence.entity.LocationLimit;
import co.igb.persistence.entity.LocationLimit_;
import co.igb.util.Constants;

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
    private static final String DB_TYPE = Constants.DATABASE_TYPE_MSSQL;

    @EJB
    private PersistenceConf persistenceConf;

    public LocationLimitFacade() {
    }

    public List<LocationLimit> listLocationsLimits(String schema, boolean testing, String warehouseCode) {
        EntityManager em = persistenceConf.chooseSchema(schema, testing, DB_TYPE);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(LocationLimit.class);
        Root limite = cq.from(LocationLimit.class);
        cq.where(cb.like(limite.get(LocationLimit_.ubicacion), warehouseCode));

        try {
            return em.createQuery(cq).getResultList();
        } catch (NoResultException e) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al obtener los limites de las ubicaciones. ", e);
        }
        return null;
    }

    public void editLimit(String schema, boolean testing, LocationLimit limit) {
        EntityManager em = persistenceConf.chooseSchema(schema, testing, DB_TYPE);
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

    public void createLimit(String schema, boolean testing, LocationLimit limit) {
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
            persistenceConf.chooseSchema(schema, testing, DB_TYPE).createNativeQuery(sb.toString()).executeUpdate();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al crear el nuevo limite de ubicacion. ", e);
        }
    }

    public void deleteLimit(String code, String schema, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(schema, testing, DB_TYPE);
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
