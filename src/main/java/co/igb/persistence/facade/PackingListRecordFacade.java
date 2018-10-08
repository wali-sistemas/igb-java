package co.igb.persistence.facade;

import co.igb.persistence.entity.PackingListRecord;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dbotero
 */
@Stateless
public class PackingListRecordFacade extends AbstractFacade<PackingListRecord> {

    private static final Logger CONSOLE = Logger.getLogger(PackingListRecordFacade.class.getSimpleName());
    private static final String DB_TYPE = "mysql";

    @EJB
    private PersistenceConf persistenceConf;

    public PackingListRecordFacade() {
        super(PackingListRecord.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return persistenceConf.chooseSchema("MySQLPU", DB_TYPE);
    }

    public Integer getNextPackingListId(String companyName) {
        StringBuilder sb = new StringBuilder();
        sb.append("select ifnull(max(idpacking_list),0)+1 as next from packing_list_record");
        try {
            return ((BigInteger) persistenceConf.chooseSchema(companyName, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult()).intValue();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al obtener el siguiente id para packing list.", e);
            return 0;
        }
    }

    public List<Object[]> listOpenPackingRecords(String username, String companyName) {
        StringBuilder sb = new StringBuilder();
        sb.append("select * from packing_list_record where status = 'open' and company_name = '");
        sb.append(companyName);
        sb.append("' and employee = '");
        sb.append(username);
        sb.append("' order by box_number");
        try {
            return persistenceConf.chooseSchema(companyName, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException e) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar si el empleado tiene un proceso de packing iniciado. ", e);
        }
        return new ArrayList<>();
    }

    public List<Object[]> listRecords(Integer idPackingOrder, String companyName, boolean openRecordsOnly) {
        StringBuilder sb = new StringBuilder();
        sb.append("select * from packing_list_record where idpacking_order = ");
        sb.append(idPackingOrder);
        if (openRecordsOnly) {
            sb.append(" and status = 'open' ");
        }
        sb.append(" and company_name = '");

        sb.append(companyName);
        sb.append("' order by item_code, bin_abs");
        try {
            return persistenceConf.chooseSchema(companyName, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException e) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los registros de packing. ", e);
        }
        return new ArrayList<>();
    }

    public List<Object[]> listByPackingList(Integer idPackingList, String companyName) {
        StringBuilder sb = new StringBuilder();
        sb.append("select * from packing_list_record where idpacking_list = ");
        sb.append(idPackingList);
        sb.append(" and company_name = '");
        sb.append(companyName);
        sb.append("' order by box_number");
        try {
            return persistenceConf.chooseSchema(companyName, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los items por packing list. ", e);
            return new ArrayList<>();
        }
    }

    public void closePackingOrder(Integer idPackingOrder, String companyName) {
        StringBuilder sb = new StringBuilder();
        sb.append("update packing_list_record set status = 'closed' where idpacking_order = ");
        sb.append(idPackingOrder);
        sb.append(" and company_name = '");
        sb.append(companyName);
        sb.append("'");
        try {
            persistenceConf.chooseSchema(companyName, DB_TYPE).createNativeQuery(sb.toString()).executeUpdate();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al cerrar la orden de packing. ", e);
        }
    }

    public void closePackingOrder(String username, String companyName) {
        StringBuilder sb = new StringBuilder();
        sb.append("update packing_list_record set status = 'closed' where employee = '");
        sb.append(username);
        sb.append("' and status = 'open' and company_name = '");
        sb.append(companyName);
        sb.append("' and idpacking_list_record <> 0");
        try {
            persistenceConf.chooseSchema(companyName, DB_TYPE).createNativeQuery(sb.toString()).executeUpdate();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al cerrar la orden de packing. ", e);
        }
    }

    public Integer obtainNumberOfBoxes(Integer idPackingList, String companyName) {
        StringBuilder sb = new StringBuilder();
        sb.append("select max(box_number) from packing_list_record where idpacking_list = ");
        sb.append(idPackingList);
        sb.append(" and company_name = '");
        sb.append(companyName);
        sb.append("'");
        try {
            return (Integer) persistenceConf.chooseSchema(companyName, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el numero de cajas por packing list. ", e);
            return 0;
        }
    }

    public String listOrderNumbers(Integer idPackingList, String companyName) {
        StringBuilder sb = new StringBuilder();
        sb.append("select distinct order_number from packing_list_record where idpacking_list = ");
        sb.append(idPackingList);
        sb.append(" and company_name = '");
        sb.append(companyName);
        sb.append("'");
        try {
            List<Integer> orderNumberList = (List<Integer>) persistenceConf.chooseSchema(companyName, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
            StringBuilder orderNumberText = new StringBuilder();
            for (Integer orderNumber : orderNumberList) {
                orderNumberText.append(orderNumber);
                orderNumberText.append(",");
            }
            if (orderNumberText.length() == 0) {
                return null;
            }
            orderNumberText.delete(orderNumberText.length() - 1, orderNumberText.length());
            return orderNumberText.toString();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los numeros de orden de compra del packingList. ", e);
            return null;
        }
    }
}
