package co.igb.persistence.facade;

import co.igb.dto.WarehouseDTO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Stateless
public class WarehouseFacade {
    private static final Logger CONSOLE = Logger.getLogger(WarehouseFacade.class.getSimpleName());
    @PersistenceContext(unitName = "IGBPU")
    private EntityManager emIGB;
    @PersistenceContext(unitName = "VARROCPU")
    private EntityManager emVARROC;

    public WarehouseFacade() {

    }

    private EntityManager chooseSchema(String schemaName) {
        switch (schemaName) {
            case "IGB":
                return emIGB;
            case "VARROC":
                return emVARROC;
            default:
                return null;
        }
    }

    public List<WarehouseDTO> listBinEnabledWarehouses(String companyName) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(whscode as varchar(5)) as code, cast(whsname as varchar(100)) as name from owhs where binactivat = 'Y'");
        try {
            List<Object[]> results = chooseSchema(companyName).createNativeQuery(sb.toString()).getResultList();
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
}
