package co.igb.persistence.facade;

import co.igb.persistence.entity.PackingListRecord;
import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
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
public class PackingListRecordFacade {

    private static final Logger CONSOLE = Logger.getLogger(PackingListRecordFacade.class.getSimpleName());
    private static final String DB_TYPE = Constants.DATABASE_TYPE_MYSQL;

    @EJB
    private PersistenceConf persistenceConf;

    public PackingListRecordFacade() {
    }

    public void create(PackingListRecord packingListRecord, String companyName, boolean testing) {
        persistenceConf.chooseSchema(companyName, testing, DB_TYPE).persist(packingListRecord);
    }

    public Integer getNextPackingListId(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select ifnull(max(idpacking_list),0)+1 as next from packing_list_record");
        try {
            return ((BigInteger) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult()).intValue();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al obtener el siguiente id para packing list.", e);
            return 0;
        }
    }

    public Integer getTotalBoxNumber(Integer orderNumber, String companyName, boolean testing) {
        if (orderNumber != null && companyName != null && !companyName.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("select max(box_number) totalCaj from packing_list_record where order_number = ");
            sb.append(orderNumber);
            try {
                return (Integer) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al obtener el total de cajas de empaque para la orden " + orderNumber + ".", e);
                return 0;
            }
        }
        return 0;
    }

    public List<Object[]> listOpenPackingRecords(String username, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select * from packing_list_record where status = 'open' and company_name = '");
        sb.append(companyName);
        sb.append("' and employee = '");
        sb.append(username);
        sb.append("' order by box_number");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException e) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar si el empleado tiene un proceso de packing iniciado. ", e);
        }
        return new ArrayList<>();
    }

    public List<String> listBoxesUsedPackingRecords(String username, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select distinct box_number ");
        sb.append("from packing_list_record where status = 'open' and company_name = '");
        sb.append(companyName);
        sb.append("' and employee = '");
        sb.append(username);
        sb.append("' order by box_number");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException e) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el listado de cajas usadas. ", e);
        }
        return null;
    }

    public List<Object[]> listRecords(Integer idPackingOrder, String companyName, boolean testing, boolean openRecordsOnly) {
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
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException e) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los registros de packing. ", e);
        }
        return new ArrayList<>();
    }

    public List<Object[]> listByPackingList(Integer idPackingList, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select * from packing_list_record where idpacking_list = ");
        sb.append(idPackingList);
        sb.append(" and company_name = '");
        sb.append(companyName);
        sb.append("' order by box_number");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los items por packing list. ", e);
            return new ArrayList<>();
        }
    }

    public void closePackingOrder(Integer idPackingOrder, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("update packing_list_record set status = 'closed' where company_name = '");
        sb.append(companyName);
        sb.append("' and idpacking_order = ");
        sb.append(idPackingOrder);
        try {
            persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).executeUpdate();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al cerrar la orden de packing. ", e);
        }
    }

    public void deletePackingOrder(Integer idPackingOrder, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("delete from packing_list_record where company_name = '");
        sb.append(companyName);
        sb.append("' and idpacking_order = ");
        sb.append(idPackingOrder);
        try {
            persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).executeUpdate();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al eliminar el registro de la orden de packing. ", e);
        }
    }

    public Integer obtainNumberOfBoxes(Integer idPackingList, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select max(box_number) from packing_list_record where idpacking_order = ");
        sb.append(idPackingList);
        sb.append(" and company_name = '");
        sb.append(companyName);
        sb.append("'");
        try {
            return (Integer) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el numero de cajas por packing list. ", e);
            return 0;
        }
    }

    public String listOrderNumbers(Integer idPackingList, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select distinct order_number from packing_list_record where idpacking_list = ");
        sb.append(idPackingList);
        sb.append(" and company_name = '");
        sb.append(companyName);
        sb.append("' and status = 'open'");
        try {
            List<Integer> orderNumberList = (List<Integer>) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
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
