package co.igb.persistence.facade;

import co.igb.dto.WarehouseDTO;
import co.igb.util.Constants;
import co.igb.persistence.entity.Warehouse;
import co.igb.persistence.entity.Warehouse_;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
public class WarehouseFacade {
    private static final Logger CONSOLE = Logger.getLogger(WarehouseFacade.class.getSimpleName());
    private static final String DB_TYPE = Constants.DATABASE_TYPE_MSSQL;

    @EJB
    private PersistenceConf persistenceConf;

    public WarehouseFacade() {
    }

    public List<WarehouseDTO> listBinEnabledWarehouses(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(whscode as varchar(5)) as code, cast(whsname as varchar(100)) as name from owhs where binactivat = 'Y'");
        try {
            List<Object[]> results = persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
            List<WarehouseDTO> warehouses = new ArrayList<>();
            for (Object[] row : results) {
                WarehouseDTO warehouse = new WarehouseDTO();
                warehouse.setCode((String) row[0]);
                warehouse.setName((String) row[1]);
                warehouses.add(warehouse);
            }
            return warehouses;
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los almacenes con ubicaciones habilitadas para la empresa " + companyName, e);
            return new ArrayList<>();
        }
    }

    public List<Warehouse> listActiveWarehouses(String companyName, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(companyName, testing, DB_TYPE);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Warehouse> cq = cb.createQuery(Warehouse.class);
        Root<Warehouse> root = cq.from(Warehouse.class);

        cq.where(cb.equal(root.get(Warehouse_.inactive), 'N'));
        try {
            return em.createQuery(cq).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al listar los almacenes activos para la empresa [" + companyName + "]. ", e);
            return null;
        }
    }
}
