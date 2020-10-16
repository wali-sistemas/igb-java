package co.igb.persistence.facade;

import co.igb.util.Constants;

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
    @PersistenceContext(unitName = "VELEZPU")
    private EntityManager emVELEZ;
    @PersistenceContext(unitName = "WMSPU")
    private EntityManager emWMS;
    @PersistenceContext(unitName = "MySQLPU")
    private EntityManager emWali;
    @PersistenceContext(unitName = "MySQLPruebasPU")
    private EntityManager emWaliPruebas;

    public EntityManager chooseSchema(String companyName, boolean testing, String dbType) {

        if (dbType.equalsIgnoreCase(Constants.DATABASE_TYPE_WALI)) {
            return emWMS;
        /*} else if (dbType.equalsIgnoreCase(Constants.DATABASE_TYPE_MYSQL)) {
            if (testing) {
                return emWaliPruebas;
            } else {
                return emWali;
            }*/
        } else {
            switch (companyName) {
                case "IGB":
                    return emIGB;
                case "VARROC":
                    return emVARROC;
                case "IGBPruebas":
                    return emIGBPruebas;
                case "VARROCPruebas":
                    return emVARROCPruebas;
                case "VELEZ":
                    return emVELEZ;
                default:
                    return null;
            }
        }
    }
}
