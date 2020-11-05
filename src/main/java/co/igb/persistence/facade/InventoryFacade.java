package co.igb.persistence.facade;

import co.igb.persistence.entity.Inventory;
import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dbotero
 */
@Stateless
public class InventoryFacade {

    private static final Logger CONSOLE = Logger.getLogger(InventoryFacade.class.getSimpleName());
    private static final String DB_TYPE_WALI = Constants.DATABASE_TYPE_WALI;

    @EJB
    private PersistenceConf persistenceConf;

    public InventoryFacade() {

    }

    public void create(Inventory inventory, String companyName, boolean testing) {
        persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI).persist(inventory);
    }

    public Inventory edit(Inventory inventory, String companyName, boolean testing) {
        return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI).merge(inventory);
    }

    public Inventory find(Integer idInventory, String companyName, boolean testing) {
        return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI).find(Inventory.class, idInventory);
    }

    public Inventory findLastInventoryOpen(String warehouse, String companyName, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI);
        StringBuilder sb = new StringBuilder();
        sb.append("select top 1 cast(id as int)as id,cast(date as datetime)as createDate,cast(status as varchar(3))as status,cast(whscode as varchar(10))as whscode, ");
        sb.append(" cast(location as varchar(20))as location,cast(company as varchar(15))as company,cast(transfer as int)as transfer ");
        sb.append("from inventory ");
        sb.append("where status='PE' and whscode='");
        sb.append(warehouse);
        sb.append("' and company='");
        sb.append(companyName);
        sb.append("' order by id DESC");
        try {
            Object[] obj = (Object[]) em.createNativeQuery(sb.toString()).getSingleResult();

            Inventory entity = new Inventory();
            entity.setId((Integer) obj[0]);
            entity.setDate((Date) obj[1]);
            entity.setStatus((String) obj[2]);
            entity.setWhsCode((String) obj[3]);
            entity.setLocation((String) obj[4]);
            entity.setCompany((String) obj[5]);
            entity.setTransfer((Integer) obj[6]);

            return entity;
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los inventarios pendientes. ", e);
            return null;
        }
    }

    public List<Object[]> obtenerUltimosInventarios(String schema, List<String> locations, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();

        sb.append("SELECT location, MAX(date) ");
        sb.append("FROM   inventory ");
        sb.append("WHERE  company = '");
        sb.append(schema);
        sb.append("' AND   location IN (");
        for (String s : locations) {
            sb.append("'");
            sb.append(s);
            sb.append("', ");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(sb.length() - 1);
        sb.append(") GROUP by location ");
        sb.append("ORDER BY MAX(date)");

        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_WALI).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "", e);
            return null;
        }
    }
}