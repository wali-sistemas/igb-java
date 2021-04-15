package co.igb.persistence.facade;

import co.igb.dto.WarehouseDTO;
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
public class WarehouseFacade {
    private static final Logger CONSOLE = Logger.getLogger(WarehouseFacade.class.getSimpleName());
    private static final String DB_TYPE_HANA = Constants.DATABASE_TYPE_HANA;
    @EJB
    private PersistenceConf persistenceConf;

    public WarehouseFacade() {
    }

    public List<WarehouseDTO> listBinEnabledWarehouses(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(\"WhsCode\" as varchar(15)) as code, cast(\"WhsName\" as varchar(100)) as name, cast(\"DftBinAbs\" as int) as dftBinAbs from OWHS where \"BinActivat\" = 'Y' order by cast(\"WhsCode\" as varchar(15))");
        try {
            List<Object[]> results = persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
            List<WarehouseDTO> warehouses = new ArrayList<>();
            for (Object[] row : results) {
                WarehouseDTO warehouse = new WarehouseDTO();
                warehouse.setCode((String) row[0]);
                warehouse.setName((String) row[1]);
                warehouse.setDftBinAbs((Integer) row[2]);
                warehouses.add(warehouse);
            }
            return warehouses;
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los almacenes con ubicaciones habilitadas para la empresa " + companyName, e);
            return new ArrayList<>();
        }
    }
}