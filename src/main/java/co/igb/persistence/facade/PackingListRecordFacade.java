package co.igb.persistence.facade;

import co.igb.persistence.entity.PackingListRecord;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dbotero
 */
@Stateless
public class PackingListRecordFacade extends AbstractFacade<PackingListRecord> {

    private static final Logger CONSOLE = Logger.getLogger(PackingListRecordFacade.class.getSimpleName());

    @PersistenceContext(unitName = "MySQLPU")
    private EntityManager em;

    public PackingListRecordFacade() {
        super(PackingListRecord.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Integer getNextPackingListId() {
        StringBuilder sb = new StringBuilder();
        sb.append("select ifnull(max(idpacking_list_record),0)+1 as next from packing_list_record");
        try {
            return ((BigInteger) em.createNativeQuery(sb.toString()).getSingleResult()).intValue();
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
            return em.createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException e) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar si el empleado tiene un proceso de packing iniciado. ", e);
        }
        return new ArrayList<>();
    }

    public List<Object[]> listRecords(Integer idPackingOrder, String companyName) {
        StringBuilder sb = new StringBuilder();
        sb.append("select * from packing_list_record where idpacking_order = ");
        sb.append(idPackingOrder);
        sb.append(" and status = 'open' and company_name = '");
        sb.append(companyName);
        sb.append("' order by item_code, bin_abs");
        try {
            return em.createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException e) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los registros de packing. ", e);
        }
        return new ArrayList<>();
    }
    
    public void closePackingOrder(Integer idPackingOrder, String companyName) {
        StringBuilder sb = new StringBuilder();
        sb.append("update packing_list_record set status = 'closed' where idpacking_order = ");
        sb.append(idPackingOrder);
        sb.append(" and company_name = '");
        sb.append(companyName);
        sb.append("'");
        try {
            em.createNativeQuery(sb.toString()).executeUpdate();
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
            em.createNativeQuery(sb.toString()).executeUpdate();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al cerrar la orden de packing. ", e);
        }
    }
}
