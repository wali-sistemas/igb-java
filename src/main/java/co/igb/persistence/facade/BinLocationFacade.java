package co.igb.persistence.facade;

import co.igb.persistence.entity.SaldoUbicacion;
import co.igb.persistence.entity.SaldoUbicacion_;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

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
        sb.append("select cast(ubic.absentry as int) binAbs, cast(ubic.bincode as varchar(20)) binCode ");
        sb.append(", cast(ubic.descr as varchar(50)) binName, (");
        sb.append("select cast(count(distinct ItemCode) as int)  from oibq where binabs = ubic.absentry and onhandqty > 0");
        sb.append(") items, (");
        sb.append("select cast(isnull(sum(onhandqty), 0) as int)  from oibq where binabs = ubic.absentry and onhandqty > 0");
        sb.append(") saldo from obin ubic ");
        sb.append("where ubic.whscode = '");
        sb.append(whsCode);
        sb.append("' and ubic.attr1val = 'CART' and ubic.disabled = 'N' ");

        try {
            return chooseSchema(schema).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los carritos de picking. ", e);
            return new ArrayList();
        }
    }

    public Object[] getBinCodeAndName(Long binAbs, String schema) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(BinCode as varchar(40)) BinCode, cast(Descr as varchar(45)) BinName from OBIN where AbsEntry = ");
        sb.append(binAbs);
        try {
            return (Object[]) chooseSchema(schema).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el codigo y nombre de la ubicacion. ", e);
            return null;
        }
    }

    public List<SaldoUbicacion> findLocationBalance(String binCode, String schema) {
        EntityManager em = chooseSchema(schema);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<SaldoUbicacion> cq = cb.createQuery(SaldoUbicacion.class);
        Root<SaldoUbicacion> saldo = cq.from(SaldoUbicacion.class);
        cq.where(cb.equal(saldo.get("ubicacion").get("binCode"), binCode), cb.gt(saldo.get(SaldoUbicacion_.onHandQty), 1));

        try {
            return em.createQuery(cq).getResultList();
        } catch (NoResultException e) {
            CONSOLE.log(Level.SEVERE, "No se encontraron datos en la ubicacion {0}", binCode);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los datos de la ubicacion. ", e);
        }
        return null;
    }

    public List<SaldoUbicacion> findLocationBalanceInventory(Integer absEntry, String schema) {
        EntityManager em = chooseSchema(schema);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<SaldoUbicacion> cq = cb.createQuery(SaldoUbicacion.class);
        Root<SaldoUbicacion> saldo = cq.from(SaldoUbicacion.class);
        cq.where(cb.equal(saldo.get("ubicacion").get("absEntry"), absEntry), cb.gt(saldo.get(SaldoUbicacion_.onHandQty), 1));

        try {
            return em.createQuery(cq).getResultList();
        } catch (NoResultException e) {
            CONSOLE.log(Level.SEVERE, "No se encontraron datos en la ubicacion {0}", absEntry);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los datos de la ubicacion. ", e);
        }
        return null;
    }

    public Integer getBinAbs(String binCode, String schema) {
        StringBuilder sb = new StringBuilder();

        sb.append("SELECT CAST(ubic.absentry AS INT) binAbs ");
        sb.append("FROM   OBIN ubic ");
        sb.append("WHERE  ubic.bincode = '");
        sb.append(binCode);
        sb.append("'");

        try {
            return (Integer) chooseSchema(schema).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el id de una ubicacion. ", e);
            return null;
        }
    }

    public Integer findInventoryLocationId(String companyName) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(absentry as int) from obin where attr1val = 'INVENTORY'");
        try {
            return (Integer) chooseSchema(companyName).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar la ubicacion de inventario para la empresa " + companyName, e);
            return -1;
        }
    }

    public List<String> listBinLocations(String schema, String whsCode) {
        StringBuilder sb = new StringBuilder();

        sb.append("SELECT CONVERT(VARCHAR(100), BinCode) AS ubicacion ");
        sb.append("FROM (SELECT o.SL1Code + ISNULL(SL2Code, '') AS ubicacion, ");
        sb.append("SUM(CAST(q.OnHandQty AS INT)) AS saldo, o.AbsEntry, ");
        sb.append("BinCode FROM OBIN o INNER  JOIN OIBQ q ON q.BinAbs = o.AbsEntry ");
        sb.append("WHERE  q.OnHandQty > 0 AND o.Attr1Val NOT IN ('INVENTORY', 'CART') AND o.WhsCode = '");
        sb.append(whsCode);
        sb.append("' GROUP  BY o.SL1Code, o.SL2Code, o.AbsEntry, o.BinCode) AS t ");
        sb.append("ORDER BY t.saldo DESC ");

        try {
            return chooseSchema(schema).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar las ubicaciones. ", e);
            return null;
        }
    }

    public Integer getTotalQuantity(Long binAbs, String itemCode, String companyName) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(OnHandQty as int) qty from oibq where itemcode = '");
        sb.append(itemCode);
        sb.append("' and binabs = ");
        sb.append(binAbs);
        try {
            return (Integer) chooseSchema(companyName).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el saldo de un item por ubicacion. ", e);
            return 0;
        }
    }
}
