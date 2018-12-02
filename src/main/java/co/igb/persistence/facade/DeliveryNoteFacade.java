package co.igb.persistence.facade;

import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dbotero
 */
@Stateless
public class DeliveryNoteFacade {

    private static final Logger CONSOLE = Logger.getLogger(DeliveryNoteFacade.class.getSimpleName());
    private static final String DB_TYPE = Constants.DATABASE_TYPE_MSSQL;

    @EJB
    private PersistenceConf persistenceConf;

    public DeliveryNoteFacade() {
    }

    public List<Object[]> getDeliveryNoteData(Integer deliveryDocEntry, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(enc.docentry as int) docentry, cast(enc.docnum as int) docnum, cast(enc.objtype as int) objtype, ");
        sb.append("cast(enc.cardcode as varchar(20)) cardcode, cast(enc.slpcode as int) slpcode, cast(ISNULL(enc.cntctcode,'') as int) cntctcode, ");
        sb.append("cast(det.linenum as int) linenum, cast(det.itemcode as varchar(20)) itemcode, cast(det.quantity as int) quantity, ");
        sb.append("cast(enc.U_VR_DECLARADO as numeric(18,2)) valorDeclarado, cast(enc.Comments as varchar(250)) comentario from odln enc ");
        sb.append("inner join dln1 det on det.docentry = enc.docentry where enc.docentry =");
        sb.append(deliveryDocEntry);
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los datos de la entrega. ", e);
            return new ArrayList<>();
        }
    }
}
