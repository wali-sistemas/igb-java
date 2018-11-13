package co.igb.persistence.facade;

import co.igb.ejb.IGBApplicationBean;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Stateless
public class ItemFacade {
    private static final Logger CONSOLE = Logger.getLogger(ItemFacade.class.getSimpleName());
    private static final String DB_TYPE = "sap";

    @Inject
    private IGBApplicationBean applicationBean;

    @EJB
    private PersistenceConf persistenceConf;

    public ItemFacade() {

    }

    public String getItemName(String itemCode, String companyName) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(itemname as varchar(200)) itemname from oitm where itemcode='");
        sb.append(itemCode);
        sb.append("'");
        try {
            return (String) persistenceConf.chooseSchema(companyName, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el nombre del item " + itemCode, e);
            return null;
        }
    }

    public List<Object[]> getItemStock(String itemCode, String binCode, String whsCode, String companyName) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT CAST(art.ItemCode AS varchar(20)) AS itemCode, CAST(art.ItemName AS varchar(200)) AS itemName, CAST(ubc.OnHandQty AS INT) AS Qty, ");
        sb.append("       CAST(ubc.WhsCode AS varchar(10)) AS whsCode, CAST(dub.BinCode AS varchar(22)) AS BinCode, CAST(pre.Price AS numeric(18,2)) AS Price ");
        sb.append("FROM   OITM art ");
        sb.append("INNER  JOIN OITW sal ON sal.ItemCode = art.ItemCode ");
        sb.append("INNER  JOIN ITM1 pre ON pre.ItemCode = art.ItemCode ");
        sb.append("INNER  JOIN OIBQ ubc ON ubc.ItemCode = sal.ItemCode AND ubc.WhsCode = sal.WhsCode ");
        sb.append("INNER  JOIN OBIN dub ON dub.AbsEntry = ubc.BinAbs ");
        sb.append("WHERE  sal.OnHand > 0 AND ubc.OnHandQty > 0 AND pre.PriceList = 1 AND (art.ItemCode = '");
        sb.append(itemCode);
        sb.append("' OR dub.BinCode = '");
        sb.append(binCode);
        sb.append("') AND sal.WhsCode = '");
        sb.append(whsCode);
        sb.append("' ORDER BY dub.BinCode");
        try {
            return (List<Object[]>) persistenceConf.chooseSchema(companyName, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el stock del item " + itemCode + ".", e);
            return null;
        }
    }
}