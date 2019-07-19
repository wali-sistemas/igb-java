package co.igb.persistence.facade;

import co.igb.persistence.entity.SaldoUbicacion;
import co.igb.persistence.entity.SaldoUbicacion_;
import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dbotero
 */
@Stateless
public class BinLocationFacade {

    private static final Logger CONSOLE = Logger.getLogger(BinLocationFacade.class.getSimpleName());
    private static final String DB_TYPE = Constants.DATABASE_TYPE_MSSQL;

    @EJB
    private PersistenceConf persistenceConf;

    public BinLocationFacade() {
    }

    public List listPickingCarts(String whsCode, String schema, boolean testing) {
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
        sb.append("' and ubic.attr1val = 'CART' and ubic.disabled = 'N' order by binCode asc");

        try {
            return persistenceConf.chooseSchema(schema, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los carritos de picking. ", e);
            return new ArrayList();
        }
    }

    public Object[] getBinCodeAndName(Long binAbs, String schema, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(BinCode as varchar(40)) BinCode, cast(Descr as varchar(45)) BinName from OBIN where AbsEntry = ");
        sb.append(binAbs);
        try {
            return (Object[]) persistenceConf.chooseSchema(schema, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el codigo y nombre de la ubicacion. ", e);
            return null;
        }
    }

    public List<SaldoUbicacion> findLocationBalance(String binCode, String whsCode, String schema, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(schema, testing, DB_TYPE);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<SaldoUbicacion> cq = cb.createQuery(SaldoUbicacion.class);
        Root<SaldoUbicacion> saldo = cq.from(SaldoUbicacion.class);
        cq.where(
                cb.equal(saldo.get("ubicacion").get("binCode"), binCode),
                cb.gt(saldo.get(SaldoUbicacion_.onHandQty), 0),
                cb.equal(saldo.get(SaldoUbicacion_.whsCode), whsCode));

        try {
            return em.createQuery(cq).getResultList();
        } catch (NoResultException e) {
            CONSOLE.log(Level.SEVERE, "No se encontraron datos en la ubicacion {0}", binCode);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los datos de la ubicacion. ", e);
        }
        return null;
    }

    public List<SaldoUbicacion> findLocationBalanceInventory(Integer absEntry, String whsCode, String schema, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(schema, testing, DB_TYPE);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<SaldoUbicacion> cq = cb.createQuery(SaldoUbicacion.class);
        Root<SaldoUbicacion> saldo = cq.from(SaldoUbicacion.class);
        cq.where(
                cb.equal(saldo.get("ubicacion").get("absEntry"), absEntry),
                cb.gt(saldo.get(SaldoUbicacion_.onHandQty), 0),
                cb.equal(saldo.get(SaldoUbicacion_.whsCode), whsCode)
        );

        try {
            return em.createQuery(cq).getResultList();
        } catch (NoResultException e) {
            CONSOLE.log(Level.SEVERE, "No se encontraron datos en la ubicacion {0}", absEntry);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los datos de la ubicacion. ", e);
        }
        return null;
    }

    public Integer getBinAbs(String binCode, String schema, boolean testing) {
        StringBuilder sb = new StringBuilder();

        sb.append("SELECT CAST(ubic.absentry AS INT) binAbs ");
        sb.append("FROM   OBIN ubic ");
        sb.append("WHERE  ubic.bincode = '");
        sb.append(binCode);
        sb.append("'");

        try {
            return (Integer) persistenceConf.chooseSchema(schema, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el id de una ubicacion. ", e);
            return null;
        }
    }

    public List<Object[]> findInventoryLocationId(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(whscode as varchar(2)) whsCode, cast(absentry as int) absEntry from obin where attr1val = 'INVENTORY' and Disabled = 'N'");
        try {
            return (List<Object[]>) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar las ubicaciones de inventario para la empresa " + companyName, e);
            return null;
        }
    }

    public List<Object[]> findReceptionLocations(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select TOP 1 cast(whscode as varchar(2)) whsCode, cast(absentry as int) absEntry from obin where sl1code = 'RECEPTION' and Disabled = 'N'");
        try {
            return (List<Object[]>) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar las ubicaciones de recepcion para la empresa " + companyName, e);
            return null;
        }
    }

    public Long findPackingLocation(String warehouseCode, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select TOP 1 cast(absentry as int) absEntry from obin where sl1code = 'PACKING' and Disabled = 'N' and whscode = '");
        sb.append(warehouseCode);
        sb.append("'");
        try {
            return (Long) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE,
                    "Ocurrio un error al consultar la ubicacion de packing para la empresa " + companyName +
                            " en el almacen " + warehouseCode, e);
            return null;
        }
    }

    public List<String> listBinLocations(String schema, boolean testing, String whsCode) {
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
            return persistenceConf.chooseSchema(schema, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar las ubicaciones. ", e);
            return null;
        }
    }

    public Integer getTotalQuantity(Long binAbs, String itemCode, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(OnHandQty as int) qty from oibq where itemcode = '");
        sb.append(itemCode);
        sb.append("' and binabs = ");
        sb.append(binAbs);
        try {
            return (Integer) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el saldo de un item por ubicacion. ", e);
            return 0;
        }
    }

    public List<Object[]> findLocationsResupply(String whsCode, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();

        sb.append("SELECT DISTINCT CONVERT(INT, ubicacion.AbsEntry) AS absEntry, CONVERT(VARCHAR(50), ubicacion.BinCode) AS binCode ");
        sb.append("FROM   OBIN ubicacion ");
        sb.append("INNER  JOIN OIBQ saldo ON saldo.BinAbs = ubicacion.AbsEntry ");
        sb.append("INNER  JOIN [@limites_ubicacion] limite on limite.u_ubicacion = ubicacion.BinCode ");
        sb.append("WHERE  ubicacion.Attr1Val = 'PICKING' ");
        sb.append("AND    saldo.OnHandQty > 0 ");
        sb.append("AND    saldo.WhsCode = '");
        sb.append(whsCode);
        sb.append("' ");
        sb.append("AND    limite.u_cantminima > saldo.OnHandQty ");
        sb.append("ORDER  BY binCode ");

        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al obtener las ubicaciones para re-abastecer. ", e);
            return null;
        }
    }

    public List<String> findItemsLocationResupply(String location, String whsCode, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();

        sb.append("SELECT DISTINCT CONVERT(VARCHAR(50), saldo.ItemCode) AS itemCode, CONVERT(INT, limite.u_cantminima - saldo.OnHandQty) AS quantity, ");
        sb.append("       CONVERT(INT, limite.u_cantmaxima) AS quantityMaxima ");
        sb.append("FROM   OBIN ubicacion ");
        sb.append("INNER  JOIN OIBQ saldo ON saldo.BinAbs = ubicacion.AbsEntry ");
        sb.append("INNER  JOIN [@limites_ubicacion] limite on limite.u_ubicacion = ubicacion.BinCode ");
        sb.append("WHERE  ubicacion.Attr1Val = 'PICKING' ");
        sb.append("AND    saldo.OnHandQty > 0 ");
        sb.append("AND    saldo.WhsCode = '");
        sb.append(whsCode);
        sb.append("' ");
        sb.append("AND    limite.u_cantminima > saldo.OnHandQty ");
        sb.append("AND    ubicacion.BinCode = '");
        sb.append(location);
        sb.append("' ");

        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al obtener las ubicaciones para re-abastecer. ", e);
            return null;
        }
    }

    public List<Object[]> listLocationsStorageResupply(String itemCode, String companyName, boolean testing, String whsCode) {
        StringBuilder sb = new StringBuilder();

        sb.append("SELECT CONVERT(INT, ubicacion.AbsEntry) AS absEntry, CONVERT(VARCHAR(50), ubicacion.BinCode) AS BinCode, CONVERT(INT, saldo.OnHandQty) AS OnHandQty ");
        sb.append("FROM   OBIN ubicacion ");
        sb.append("INNER  JOIN OIBQ saldo ON saldo.BinAbs = ubicacion.AbsEntry ");
        sb.append("WHERE  saldo.ItemCode = '");
        sb.append(itemCode);
        sb.append("' ");
        sb.append("AND    saldo.OnHandQty > 0 ");
        sb.append("AND    ubicacion.Attr1Val = 'STORAGE' ");
        sb.append("AND    ubicacion.whsCode = '");
        sb.append(whsCode);
        sb.append("' ORDER  BY ubicacion.attr2val, ubicacion.attr3val ");

        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException e) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar las ubicaciones para resurtir. ", e);
        }
        return null;
    }

    public String getBinWarehouse(Long binAbs, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(whscode as varchar(2)) whscode from obin where absentry = ");
        sb.append(binAbs);

        try {
            return (String) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    public Integer getTotalQuantityInStorage(String itemcode, String warehouse, String companyName, boolean pruebas) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(isnull(sum(onhandqty),0) as int) saldoTotal from oibq saldo ");
        sb.append("inner join obin ubicacion on ubicacion.absentry = saldo.binabs where saldo.itemcode = '");
        sb.append(itemcode);
        sb.append("' and saldo.OnHandQty > 0 and ubicacion.attr1val = 'STORAGE' and ubicacion.whscode = '");
        sb.append(warehouse);
        sb.append("' ");
        try {
            return (Integer) persistenceConf.chooseSchema(companyName, pruebas, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException e) {
            return 0;
        }
    }

    public Object getLocationAttributes(String binCode, String warehouse, String companyName, boolean pruebas) {
        EntityManager em = persistenceConf.chooseSchema(companyName, pruebas, DB_TYPE);
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT CAST(AbsEntry AS int) AS AbsEntry, CAST(BinCode AS varchar(20)) AS BinCode, ");
        sb.append("       CAST(Attr1Abs AS int) AS Attr1Abs, CAST(Attr1Val AS varchar(20)) AS Attr1Val, ");
        sb.append("       CAST(Attr2Abs AS int) AS Attr2Abs, CAST(Attr2Val AS varchar(20)) AS Attr2Val, ");
        sb.append("       CAST(Attr3Abs AS int) AS Attr3Abs, CAST(Attr3Val AS varchar(20)) AS Attr3Val ");
        sb.append("FROM   OBIN ");
        sb.append("WHERE  BinCode = '");
        sb.append(binCode);
        sb.append("' AND WhsCode =");
        sb.append(warehouse);

        try {
            return em.createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los atributos de la ubicacion. ", e);
        }
        return null;
    }
}