package co.igb.persistence.facade;

import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
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
    private static final String DB_TYPE_HANA = Constants.DATABASE_TYPE_HANA;
    @EJB
    private PersistenceConf persistenceConf;

    public BinLocationFacade() {
    }

    public List listPickingCarts(String whsCode, String schema, boolean testing) {
        CONSOLE.log(Level.INFO, "Listando carritos de picking para el almacen {0} y la empresa {1}", new Object[]{whsCode, schema});
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(ubic.\"AbsEntry\" as int)as binAbs, cast(ubic.\"BinCode\" as varchar(20))as binCode, ");
        sb.append(" cast(ubic.\"Descr\" as varchar(50))as binName,(");
        sb.append("  select cast(count(distinct o.\"ItemCode\") as int) from OIBQ o where o.\"BinAbs\"=ubic.\"AbsEntry\" and \"OnHandQty\">0");
        sb.append(") items, (");
        sb.append("select cast(ifnull(sum(o.\"OnHandQty\"),0) as int) from OIBQ o where o.\"BinAbs\"=ubic.\"AbsEntry\" and \"OnHandQty\">0");
        sb.append(")as saldo from OBIN ubic ");
        sb.append("where ubic.\"WhsCode\"='");
        sb.append(whsCode);
        sb.append("' and ubic.\"Attr1Val\"='CART' and ubic.\"Disabled\"='N' order by ubic.\"BinCode\" asc");
        try {
            return persistenceConf.chooseSchema(schema, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los carritos de picking. ", e);
            return new ArrayList();
        }
    }

    public Object[] getBinCodeAndName(Long binAbs, String schema, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(o.\"BinCode\" as varchar(40))as BinCode, cast(o.\"Descr\" as varchar(45))as BinName from OBIN o where o.\"AbsEntry\" = ");
        sb.append(binAbs);
        try {
            return (Object[]) persistenceConf.chooseSchema(schema, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el codigo y nombre de la ubicacion. ", e);
            return null;
        }
    }

    public List<Object[]> findLocationBalance(String binCode, String whsCode, String schema, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(schema, testing, DB_TYPE_HANA);
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(\"AbsEntry\" as int)as AbsEntry,cast(\"ItemCode\" as varchar(20))as ItemCode, ");
        sb.append(" cast(\"BinAbs\" as int)as BinAbs,cast(\"OnHandQty\" as double)as OnHandQty,");
        sb.append(" cast(\"WhsCode\" as varchar(20))as WhsCode,cast(\"Freezed\" as varchar(5))as Freezed,cast(\"FreezeDoc\" as int)as FreezeDoc ");
        sb.append("from OIBQ ");
        sb.append("where \"BinAbs\"=");
        sb.append(getBinAbs(binCode, schema, testing));
        sb.append(" and \"OnHandQty\">0 ");
        sb.append("and \"WhsCode\"= ");
        sb.append(whsCode);
        try {
            return em.createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException e) {
            CONSOLE.log(Level.SEVERE, "No se encontraron datos en la ubicacion {0}", binCode);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los datos de la ubicacion. ", e);
        }
        return null;
    }

    public Integer getBinAbs(String binCode, String schema, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(u.\"AbsEntry\" as int)as BinAbs ");
        sb.append("from OBIN u ");
        sb.append("where u.\"BinCode\"='");
        sb.append(binCode);
        sb.append("'");
        try {
            return (Integer) persistenceConf.chooseSchema(schema, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el id de una ubicacion. ", e);
            return null;
        }
    }

    public String getBinCode(Integer AbsEntry, String schema, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(u.\"BinCode\" as varchar(20))as BinCode ");
        sb.append("from OBIN u ");
        sb.append("where u.\"AbsEntry\"='");
        sb.append(AbsEntry);
        sb.append("'");
        try {
            return (String) persistenceConf.chooseSchema(schema, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el BinCode de una ubicacion. ", e);
            return null;
        }
    }

    public Integer getBinAbsInventory(String companyName, String warehouse, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(o.\"AbsEntry\" as int)as AbsEntry from OBIN o where o.\"Attr1Val\"='INVENTORY' and o.\"Disabled\"='N' and o.\"WhsCode\"='");
        sb.append(warehouse);
        sb.append("'");
        try {
            return (Integer) persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar las ubicaciones de inventario para la empresa " + companyName, e);
            return null;
        }
    }

    public List<Object[]> findReceptionLocations(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(o.\"WhsCode\" as varchar(2))as WhsCode, cast(o.\"AbsEntry\" as int)as AbsEntry ");
        sb.append("from OBIN o where o.\"SL1Code\"='RECEPTION' and o.\"Disabled\"='N'");
        try {
            return (List<Object[]>) persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar las ubicaciones de recepcion para la empresa " + companyName, e);
            return null;
        }
    }

    public Long findPackingLocation(String warehouseCode, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(o.\"AbsEntry\" as int)as AbsEntry from OBIN o where o.\"SL1Code\"='PACKING' and o.\"Disabled\"='N' and o.\"WhsCode\"='");
        sb.append(warehouseCode);
        sb.append("' limit 1");
        try {
            return (Long) persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE,
                    "Ocurrio un error al consultar la ubicacion de packing para la empresa " + companyName +
                            " en el almacen " + warehouseCode, e);
            return null;
        }
    }

    public List<String> listBinLocations(String schema, boolean testing, String whsCode) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(t.BinCode as varchar(100))as BinCode ");
        sb.append("from (select o.\"SL1Code\" + ifnull(o.\"SL2Code\",'')as BinCode, ");
        sb.append("      sum(cast(q.\"OnHandQty\" as int))as Saldo,o.\"AbsEntry\",o.\"BinCode\" as BinCode ");
        sb.append("      from OBIN o ");
        sb.append("      inner join OIBQ q on q.\"BinAbs\"=o.\"AbsEntry\" ");
        sb.append("      where q.\"OnHandQty\">0 and o.\"Attr1Val\" not in ('INVENTORY','CART') and o.\"WhsCode\"='");
        sb.append(whsCode);
        sb.append("'     group by o.\"SL1Code\", o.\"SL2Code\", o.\"AbsEntry\", o.\"BinCode\" ");
        sb.append(")as t order by t.saldo desc");
        try {
            return persistenceConf.chooseSchema(schema, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar las ubicaciones. ", e);
            return null;
        }
    }

    public Integer getTotalQuantity(Long binAbs, String itemCode, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(o.\"OnHandQty\" as int)as Qty from OIBQ o where o.\"ItemCode\"='");
        sb.append(itemCode);
        sb.append("' and o.\"BinAbs\"=");
        sb.append(binAbs);
        try {
            return (Integer) persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el saldo de un item por ubicacion. ", e);
            return 0;
        }
    }

    public List<Object[]> findLocationsResupply(String whsCode, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select distinct cast(u.\"AbsEntry\" as int)as AbsEntry,cast(u.\"BinCode\" as varchar(50))as \"BinCode\" ");
        sb.append("from OBIN u ");
        sb.append("inner join OIBQ s on s.\"BinAbs\"=u.\"AbsEntry\" ");
        sb.append("inner join \"@LIMITES_UBICACION\" l on l.\"U_Ubicacion\"=u.\"BinCode\" ");
        sb.append("where u.\"Attr1Val\"='PICKING' and s.\"OnHandQty\">0 and s.\"WhsCode\"='");
        sb.append(whsCode);
        sb.append("' and l.\"U_CantMinima\">s.\"OnHandQty\" order by u.\"BinCode\"");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al obtener las ubicaciones para re-abastecer. ", e);
            return null;
        }
    }

    public List<String> findItemsLocationResupply(String location, String whsCode, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select distinct cast(s.\"ItemCode\" as varchar(50))as ItemCode,cast(l.\"U_CantMinima\"-s.\"OnHandQty\" as int)as Quantity, ");
        sb.append(" cast(l.\"U_CantMaxima\" as int)as QuantityMaxima ");
        sb.append("from OBIN u ");
        sb.append("inner join OIBQ s on s.\"BinAbs\"=u.\"AbsEntry\" ");
        sb.append("inner join \"@LIMITES_UBICACION\" l on l.\"U_Ubicacion\"=u.\"BinCode\" ");
        sb.append("where u.\"Attr1Val\"='PICKING' and s.\"OnHandQty\">0 and s.\"WhsCode\"=' ");
        sb.append(whsCode);
        sb.append("' ");
        sb.append("and l.\"U_CantMinima\">s.\"OnHandQty\" and u.\"BinCode\"='");
        sb.append(location);
        sb.append("' ");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al obtener las ubicaciones para re-abastecer. ", e);
            return null;
        }
    }

    public List<Object[]> listLocationsStorageResupply(String itemCode, String companyName, boolean testing, String whsCode) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(u.\"AbsEntry\" as int)as AbsEntry,cast(u.\"BinCode\" as varchar(50))as BinCode, cast(s.\"OnHandQty\" as int)as OnHandQty ");
        sb.append("from OBIN u ");
        sb.append("inner join OIBQ s on s.\"BinAbs\"=u.\"AbsEntry\" ");
        sb.append("where s.\"ItemCode\"='");
        sb.append(itemCode);
        sb.append("' and s.\"OnHandQty\">0 and u.\"Attr1Val\"='STORAGE' and u.\"WhsCode\"='");
        sb.append(whsCode);
        sb.append("' order by cast(u.\"Attr2Val\" as varchar(10)),cast(u.\"Attr3Val\" as int)");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException e) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar las ubicaciones para resurtir. ", e);
        }
        return null;
    }

    public String getBinWarehouse(Long binAbs, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(o.\"whscode\" as varchar(2))as WhsCode from OBIN o where o.\"AbsEntry\"=");
        sb.append(binAbs);
        try {
            return (String) persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    public Integer getTotalQuantityInStorage(String itemcode, String warehouse, String companyName, boolean pruebas) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(ifnull(sum(s.\"OnHandQty\"),0)as int)as sTotal ");
        sb.append("from OIBQ s ");
        sb.append("inner join OBIN u on u.\"AbsEntry\"=s.\"BinAbs\" ");
        sb.append("where s.\"ItemCode\"='");
        sb.append(itemcode);
        sb.append("' and s.\"OnHandQty\">0 and u.\"Attr1Val\"='STORAGE' and u.\"WhsCode\"='");
        sb.append(warehouse);
        sb.append("'");
        try {
            return (Integer) persistenceConf.chooseSchema(companyName, pruebas, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException e) {
            return 0;
        }
    }

    public Object getLocationAttributes(String binCode, String warehouse, String companyName, boolean pruebas) {
        EntityManager em = persistenceConf.chooseSchema(companyName, pruebas, DB_TYPE_HANA);
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(o.\"AbsEntry\" as int)as AbsEntry,cast(o.\"BinCode\" as varchar(20))as BinCode, ");
        sb.append(" cast(o.\"Attr1Abs\" as int)as Attr1Abs,cast(o.\"Attr1Val\" as varchar(20))as Attr1Val, ");
        sb.append(" cast(o.\"Attr2Abs\" as int)as Attr2Abs,cast(o.\"Attr2Val\" as varchar(20))as Attr2Val, ");
        sb.append(" cast(o.\"Attr3Abs\" as int)as Attr3Abs,cast(o.\"Attr3Val\" as varchar(20))as Attr3Val ");
        sb.append("from OBIN o ");
        sb.append("where \"BinCode\"='");
        sb.append(binCode);
        sb.append("' and \"WhsCode\"='");
        sb.append(warehouse);
        sb.append("'");
        try {
            return em.createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los atributos de la ubicacion. ", e);
        }
        return null;
    }
}