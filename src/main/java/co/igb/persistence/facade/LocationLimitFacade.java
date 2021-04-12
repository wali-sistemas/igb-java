package co.igb.persistence.facade;

import co.igb.persistence.entity.LocationLimit;
import co.igb.persistence.entity.LocationLimit_;
import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.criteria.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dbotero
 */
@Stateless
public class LocationLimitFacade {
    private static final Logger CONSOLE = Logger.getLogger(LocationLimitFacade.class.getSimpleName());
    private static final String DB_TYPE_HANA = Constants.DATABASE_TYPE_HANA;
    @EJB
    private PersistenceConf persistenceConf;

    public LocationLimitFacade() {
    }

    public List<Object> listLocationsLimits(String itemCode, String binCode, String schema, boolean pruebas, String warehouseCode) {
        EntityManager em = persistenceConf.chooseSchema(schema, pruebas, DB_TYPE_HANA);
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(l.\"Code\" as varchar(30))as Code, cast(l.\"Name\" as varchar(30))as Name, ");
        sb.append(" cast(l.\"U_Ubicacion\" as varchar(20))as U_Ubicacion, cast(l.\"U_Item\" as varchar(20))as U_Item, ");
        sb.append(" cast(l.\"U_CantMinima\" as int)as U_CantMinima, cast(l.\"U_CantMaxima\" as int)as U_CantMaxima ");
        sb.append("from \"@LIMITES_UBICACION\" l ");
        sb.append("where (l.\"U_Ubicacion\" ");

        if (itemCode.equals("*")) {
            sb.append("like '");
            sb.append(warehouseCode);
            sb.append("%')");
        } else {
            sb.append("= '");
            sb.append(binCode);
            sb.append("' or l.\"U_Item\" = '");
            sb.append(itemCode);
            sb.append("')");
        }
        sb.append(" order by l.\"U_Item\", l.\"U_Ubicacion\" asc");
        try {
            return em.createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al obtener los limites de las ubicaciones. ", e);
        }
        return null;
    }

    public boolean editLimit(String schema, boolean testing, LocationLimit limit) {
        EntityManager em = persistenceConf.chooseSchema(schema, testing, DB_TYPE_HANA);
        StringBuilder sb = new StringBuilder();
        sb.append("update \"@LIMITES_UBICACION\" set \"U_CantMinima\"=");
        sb.append(limit.getCantMinima());
        sb.append(",\"U_CantMaxima\"=");
        sb.append(limit.getCantMaxima());
        sb.append("where \"Code\"='");
        sb.append(limit.getCode());
        try {
            em.createNativeQuery(sb.toString()).executeUpdate();
            return true;
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al actualizar los limites de ubicacion. ", e);
        }
        return false;
    }

    public boolean createLimit(String schema, boolean testing, LocationLimit limit) {
        StringBuilder sb = new StringBuilder();
        sb.append("insert into \"@LIMITES_UBICACION\" ");
        sb.append("(\"Code\", \"Name\", \"U_Ubicacion\", \"U_Item\", \"U_CantMinima\", \"U_CantMaxima\") ");
        sb.append("values ('");
        sb.append(limit.getCode()).append("', '");
        sb.append(limit.getName()).append("', '");
        sb.append(limit.getUbicacion()).append("', '");
        sb.append(limit.getItem()).append("', ");
        sb.append(limit.getCantMinima()).append(", ");
        sb.append(limit.getCantMaxima()).append(") ");
        try {
            persistenceConf.chooseSchema(schema, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).executeUpdate();
            return true;
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al crear el nuevo limite de ubicacion. ", e);
        }
        return false;
    }

    public void deleteLimit(String code, String schema, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(schema, testing, DB_TYPE_HANA);
        StringBuilder sb = new StringBuilder();
        sb.append("delete from \"@LIMITES_UBICACION\" where \"Code\"='");
        sb.append(code);
        sb.append("'");
        try {
            em.createNativeQuery(sb.toString()).executeUpdate();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al eliminar el limite de ubicacion. ", e);
        }
    }

    public String findLocationFixed(String itemCode, String schema, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(schema, testing, DB_TYPE_HANA);
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(\"U_Ubicacion\" as varchar(20))as Ubicacion ");
        sb.append("from \"@LIMITES_UBICACION\" where \"U_Item\"='");
        sb.append(itemCode);
        sb.append("'");
        try {
            return (String) em.createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar la ubicacion fija.", e);
        }
        return null;
    }
}