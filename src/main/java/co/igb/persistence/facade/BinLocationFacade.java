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
public class BinLocationFacade {

    private static final Logger CONSOLE = Logger.getLogger(BinLocationFacade.class.getSimpleName());

    @PersistenceContext(unitName = "IGBPU")
    private EntityManager emIGB;
    @PersistenceContext(unitName = "VARROCPU")
    private EntityManager emVARROC;

    public BinLocationFacade() {
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

    public List listPickingCarts(String whsCode, String schema) {
        CONSOLE.log(Level.INFO, "Listando carritos de picking para el almacen {0} y la empresa {1}", new Object[]{whsCode, schema});

        StringBuilder sb = new StringBuilder();
        sb.append("select cast(ubic.absentry as int) binAbs, cast(ubic.bincode as varchar(20)) binCode, cast(ubic.descr as varchar(50)) binName, ");
        sb.append("sum(cast(ISNULL(saldo.onhandqty, 0) as int)) saldo from obin ubic ");
        sb.append("left join oibq saldo on saldo.binabs = ubic.absentry  ");
        sb.append("where ubic.whscode = '");
        sb.append(whsCode);
        sb.append("' and ubic.attr1val = 'PICKING' ");
        sb.append("and ubic.disabled = 'N' ");
        sb.append("group by ubic.absentry, ubic.bincode, ubic.descr ");

        try {
            return chooseSchema(schema).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los carritos de picking. ", e);
            return new ArrayList();
        }
    }
}
