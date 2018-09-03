package co.igb.persistence.facade;

import co.igb.ejb.IGBApplicationBean;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.logging.Level;
import java.util.logging.Logger;

@Stateless
public class ItemFacade {
    private static final Logger CONSOLE = Logger.getLogger(ItemFacade.class.getSimpleName());

    @Inject
    private IGBApplicationBean applicationBean;

    @PersistenceContext(unitName = "IGBPU")
    private EntityManager emIGB;
    @PersistenceContext(unitName = "VARROCPU")
    private EntityManager emVARROC;

    public ItemFacade() {

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

    public String getItemName(String itemCode, String companyName) {
        StringBuilder sb = new StringBuilder();
        sb.append("select itemname from oitm where itemcode='");
        sb.append(itemCode);
        sb.append("'");
        try {
            return (String) chooseSchema(companyName).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el nombre del item " + itemCode, e);
            return null;
        }
    }
}
