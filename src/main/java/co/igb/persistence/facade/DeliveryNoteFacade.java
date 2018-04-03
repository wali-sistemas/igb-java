package co.igb.persistence.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dbotero
 */
@Stateless
public class DeliveryNoteFacade {

    private static final Logger CONSOLE = Logger.getLogger(DeliveryNoteFacade.class.getSimpleName());

    @PersistenceContext(unitName = "IGBPU")
    private EntityManager emIGB;
    @PersistenceContext(unitName = "VARROCPU")
    private EntityManager emVARROC;

    public DeliveryNoteFacade() {
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

    public List<Object[]> getDeliveryNoteData(Integer deliveryDocEntry, String companyName) {
        StringBuilder sb = new StringBuilder();
        sb.append("select enc.docentry, enc.docnum, enc.objtype, enc.cardcode, enc.slpcode ");
        sb.append(", enc.cntctcode, det.linenum, det.itemcode, det.quantity from odln enc ");
        sb.append("inner join dln1 det on det.docentry = enc.docentry where enc.docentry =");
        sb.append(deliveryDocEntry);
        try {
            return chooseSchema(companyName).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los datos de la entrega. ", e);
            return new ArrayList<>();
        }
    }
}
