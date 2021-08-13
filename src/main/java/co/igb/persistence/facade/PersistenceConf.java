package co.igb.persistence.facade;

import co.igb.util.Constants;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.logging.Logger;

@Stateless
public class PersistenceConf {
    private static final Logger CONSOLE = Logger.getLogger(BinLocationFacade.class.getSimpleName());

    @PersistenceContext(unitName = "WMSPU")
    private EntityManager emWMS;
    @PersistenceContext(unitName = "HANAIGBPU")
    private EntityManager emHANAIGB;
    @PersistenceContext(unitName = "HANAVARROCPU")
    private EntityManager emHANAVARROC;
    @PersistenceContext(unitName = "HANAVELEZPU")
    private EntityManager emHANAVELEZ;
    @PersistenceContext(unitName = "HANAIGBTESTPU")
    private EntityManager emHANAIGBTEST;

    public EntityManager chooseSchema(String companyName, boolean testing, String dbType) {
        if (dbType.equalsIgnoreCase(Constants.DATABASE_TYPE_WALI)) {
            return emWMS;
        } else {
            switch (companyName) {
                case "IGB":
                    if (!testing) {
                        return emHANAIGB;
                    } else {
                        return emHANAIGBTEST;
                    }
                case "VARROC":
                    return emHANAVARROC;
                case "VELEZ":
                    return emHANAVELEZ;
                case "IGBPruebas":
                    return emHANAIGBTEST;
                default:
                    return null;
            }
        }
    }
}