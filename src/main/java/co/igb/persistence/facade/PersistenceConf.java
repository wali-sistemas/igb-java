package co.igb.persistence.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.logging.Logger;

@Stateless
public class PersistenceConf {

    private static final Logger CONSOLE = Logger.getLogger(BinLocationFacade.class.getSimpleName());

    @PersistenceContext(unitName = "IGBPU")
    private EntityManager emIGB;
    @PersistenceContext(unitName = "IGBPruebasPU")
    private EntityManager emIGBPruebas;
    @PersistenceContext(unitName = "VARROCPU")
    private EntityManager emVARROC;
    @PersistenceContext(unitName = "VARROCPruebasPU")
    private EntityManager emVARROCPruebas;
    @PersistenceContext(unitName = "MySQLPU")
    private EntityManager emWali;
    @PersistenceContext(unitName = "MySQLPruebasPU")
    private EntityManager emWaliPruebas;

    public EntityManager chooseSchema(String schemaName) {
        switch (schemaName) {
            case "IGB":
                return emIGB;
            case "VARROC":
                return emVARROC;
            case "IGBPruebas":
                return emIGBPruebas;
            case "VARROCPruebas":
                return emVARROCPruebas;
            case "MySQLPU":
                return emWali;
            case "MySQLPruebasPU":
                return emWaliPruebas;
            default:
                return null;
        }
    }
}
