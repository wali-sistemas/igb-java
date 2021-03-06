package co.igb.persistence.facade;

import co.igb.dto.SalesOrderDTO;
import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import java.math.BigDecimal;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dbotero
 */
@Stateless
public class SalesOrderFacade {
    private static final Logger CONSOLE = Logger.getLogger(SalesOrderFacade.class.getSimpleName());
    private static final String DB_TYPE_HANA = Constants.DATABASE_TYPE_HANA;
    @EJB
    private PersistenceConf persistenceConf;

    public SalesOrderFacade() {
    }

    public String getOrderStatus(Integer docNum, String schemaName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(o.\"DocStatus\" as varchar(1)) DocStatus from ORDR o where o.\"DocNum\"=");
        sb.append(docNum);
        try {
            return (String) persistenceConf.chooseSchema(schemaName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el estado de la orden " + docNum + ". ", e);
        }
        return null;
    }

    public BigDecimal getValorDeclarado(Integer docNum, String schemaName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast((o.\"DocTotal\" + o.\"DiscSum\" + o.\"WTSum\") - o.\"VatSum\" - o.\"TotalExpns\" - o.\"RoundDif\" as numeric(18,2)) as valorDeclarado ");
        sb.append("from ORDR o where o.\"DocNum\"=");
        sb.append(docNum);
        try {
            return (BigDecimal) persistenceConf.chooseSchema(schemaName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el valor declarado para la orden " + docNum + ".", e);
        }
        return new BigDecimal(0);
    }

    public String getOrderComment(Integer docNum, String schemaName, boolean testing) {
        if (docNum != null && schemaName != null && !schemaName.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("select cast(o.\"Comments\" as varchar(254)) as Comments from ORDR o where o.\"DocNum\"=");
            sb.append(docNum);
            try {
                return (String) persistenceConf.chooseSchema(schemaName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
            } catch (NoResultException ex) {
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el comentario de la orden " + docNum + ".", e);
            }
        }
        return null;
    }

    public Integer getOrderDocEntry(Integer docNum, String schemaName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select o.\"DocEntry\" from ORDR o where o.\"DocNum\"=");
        sb.append(docNum);
        try {
            return (Integer) persistenceConf.chooseSchema(schemaName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el docentry de la orden. ", e);
        }
        return -1;
    }

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<SalesOrderDTO> findOpenOrders(boolean showAll, boolean filterGroup, String schemaName, boolean testing, String warehouseCode) {
        EntityManager em = persistenceConf.chooseSchema(schemaName, testing, DB_TYPE_HANA);
        StringBuilder sb = new StringBuilder();
        sb.append("select j.docnum, j.docdate, j.cardcode, j.cardname, j.confirmed, j.items, j.comments, j.address, j.transp ");
        sb.append("from (select f.*, COUNT(f.grupo) OVER (PARTITION BY f.cardcode) as \"ContGrupo\" from ( ");
        sb.append("select t.*, ROW_NUMBER() OVER (PARTITION BY t.cardcode order by t.cardcode) as grupo from ( ");
        sb.append("select distinct cast(enc.\"DocNum\" as varchar(10)) as docnum, ");
        sb.append("cast(enc.\"DocDate\" as date) as docdate, cast(enc.\"CardCode\" as varchar(20)) as cardcode, ");
        sb.append("cast(enc.\"CardName\" as varchar(100)) as cardname, cast(enc.\"Confirmed\" as varchar(1)) as confirmed, ");
        sb.append("cast((select count(1) from RDR1 det where det.\"DocEntry\" = enc.\"DocEntry\" and det.\"LineStatus\" = 'O') as int) as items, ");
        sb.append("cast(enc.\"Comments\" as varchar(254)) as comments, cast(enc.\"Address2\" as varchar(200)) as address, ");
        sb.append("ifnull(cast(enc.\"U_TRANSP\" as varchar(4)),'') as transp from ORDR enc ");
        sb.append("inner join RDR1 det on det.\"DocEntry\" = enc.\"DocEntry\" and det.\"WhsCode\" = '");
        sb.append(warehouseCode);
        sb.append("' where enc.\"DocStatus\" = 'O' and enc.\"U_SEPARADOR\" IN ('APROBADO','PREPAGO','SEDE BOGOTA') and ");
        sb.append("        year(enc.\"DocDate\") = year(current_date) and MONTH(enc.\"DocDate\") between MONTH(current_date)-1 and MONTH(current_date) ");
        if (!showAll) {
            sb.append("and enc.\"Confirmed\" = 'Y' ");
        }
        sb.append(") as t ) as f ) as j ");
        if (filterGroup) {
            sb.append("where j.\"ContGrupo\" > 1 ");
        }
        sb.append("order by j.docdate, j.docnum");
        List<SalesOrderDTO> orders = new ArrayList<>();
        try {
            for (Object[] row : (List<Object[]>) em.createNativeQuery(sb.toString()).getResultList()) {
                SalesOrderDTO order = new SalesOrderDTO();
                order.setDocNum((String) row[0]);
                order.setDocDate((Date) row[1]);
                order.setCardCode((String) row[2]);
                order.setCardName((String) row[3]);
                order.setConfirmed((String) row[4]);
                order.setItems((Integer) row[5]);
                order.setComments((String) row[6]);
                order.setAddress((String) row[7]);
                order.setTransp((String) row[8]);

                orders.add(order);
            }
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar las ordenes de venta abiertas. ", e);
        }
        return orders;
    }

    public List<Object[]> findOrdersStockAvailability(Integer orderNumber, List<String> itemCodes, String warehouseCode, String schemaName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(d.\"ItemCode\" as varchar(20)) itemCode, cast(d.\"OpenQty\" as int) openQuantity, cast(d.\"Quantity\" as int) quantity, ");
        sb.append("cast(s.\"BinAbs\" as int) binAbs, cast(s.\"OnHandQty\" as int) available, cast(u.\"BinCode\" as varchar(50)) binCode, ");
        sb.append("cast(d.\"Dscription\" as varchar(100)) itemName, cast(o.\"DocNum\" as int) orderNumber, ");
        sb.append("cast(u.\"Attr2Val\" as varchar(5)) \"velocidad\", cast(u.\"Attr3Val\" as int) \"secuencia\", ");
        sb.append("cast(u.\"Attr1Val\" as varchar(10)) binType ");
        sb.append("from ORDR o inner join RDR1 d on d.\"DocEntry\" = o.\"DocEntry\" and d.\"LineStatus\" = 'O' ");
        if (itemCodes != null && !itemCodes.isEmpty()) {
            sb.append("and d.\"ItemCode\" in (");
            for (String itemCode : itemCodes) {
                sb.append("'");
                sb.append(itemCode);
                sb.append("',");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(") ");
        }
        sb.append("inner join OIBQ s on s.\"ItemCode\" = d.\"ItemCode\" and s.\"WhsCode\" = '");
        sb.append(warehouseCode);
        sb.append("' and s.\"OnHandQty\" > 0 inner join OBIN u on u.\"AbsEntry\" = s.\"BinAbs\" and u.\"SysBin\" = 'N' ");
        sb.append("and u.\"Attr1Val\" IN ('PICKING','STORAGE') where o.\"DocNum\" = ");
        sb.append(orderNumber);
        sb.append(" order by \"velocidad\", \"secuencia\" ");
        CONSOLE.log(Level.FINE, sb.toString());
        try {
            return persistenceConf.chooseSchema(schemaName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al listar el inventario para lis items de las ordenes asignadas. ", e);
            return new ArrayList();
        }
    }

    public List<Object[]> findOrdersById(List<Integer> orderIds, String schemaName, boolean testing) {
        if (orderIds == null || orderIds.isEmpty()) {
            return new ArrayList();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(enc.\"DocNum\" as varchar(10)) docnum, ");
        sb.append("cast(enc.\"CardName\" as varchar(100)) cardname ");
        sb.append("from ORDR enc where enc.\"DocStatus\" = 'O' ");
        sb.append("and enc.\"DocNum\" in (");
        for (Integer orderNumber : orderIds) {
            sb.append(orderNumber);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(")");
        try {
            return persistenceConf.chooseSchema(schemaName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al buscar ordenes por id. ", e);
        }
        return new ArrayList();
    }

    public LinkedHashMap<String, Integer> listPendingItems(Integer orderNumber, String schemaName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(d.\"ItemCode\" as varchar(20))as \"ItemCode\", cast(d.\"Quantity\" as int)as pendingQuantity, ");
        sb.append(" cast((select t.\"Attr2Val\" from (select cast(u.\"Attr2Val\" as varchar(10))as \"Attr2Val\",row_number() over(partition by s.\"ItemCode\" order by cast(u.\"Attr2Val\" as varchar(10)),cast(u.\"Attr3Val\" as int))as \"fila\" ");
        sb.append(" from OIBQ s ");
        sb.append(" inner join OBIN u on u.\"AbsEntry\"=s.\"BinAbs\" and u.\"SysBin\"='N' and u.\"Attr1Val\" in ('PICKING','STORAGE') ");
        sb.append(" where s.\"WhsCode\"=d.\"WhsCode\" and s.\"OnHandQty\">0 and s.\"ItemCode\"=d.\"ItemCode\")as t where t.\"fila\"=1)as varchar(5))as \"Vel\",");
        sb.append(" cast((select r.\"Attr3Val\" from (select cast(u.\"Attr3Val\" as int)as \"Attr3Val\",row_number() over(partition by s.\"ItemCode\" order by cast(u.\"Attr2Val\" as varchar(10)),cast(u.\"Attr3Val\" as int))as \"fila\" ");
        sb.append(" from OIBQ s ");
        sb.append(" inner join OBIN u on u.\"AbsEntry\"=s.\"BinAbs\" and u.\"SysBin\"='N' and u.\"Attr1Val\" in ('PICKING','STORAGE') ");
        sb.append(" where s.\"WhsCode\"=d.\"WhsCode\" and s.\"OnHandQty\">0 and s.\"ItemCode\"=d.\"ItemCode\")as r where r.\"fila\"=1)as int)as \"Sec\" ");
        sb.append("from ORDR o ");
        sb.append("inner join RDR1 d on d.\"DocEntry\"=o.\"DocEntry\" and d.\"Quantity\">0 ");
        sb.append("where o.\"DocStatus\"='O' and d.\"LineStatus\"='O' and o.\"DocNum\"=");
        sb.append(orderNumber);
        sb.append(" order by \"Vel\",\"Sec\"");
        try {
            LinkedHashMap<String, Integer> results = new LinkedHashMap<>();
            List<Object[]> rows = (List<Object[]>) persistenceConf.chooseSchema(schemaName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
            for (Object[] col : rows) {
                results.put((String) col[0], (Integer) col[1]);
            }
            return results;
        } catch (NoResultException e) {
            CONSOLE.log(Level.WARNING, "No se encontraron items pendientes para la orden {0}", orderNumber);
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al listar los items pendientes de la orden. ", e);
        }
        return null;
    }

    public List<Object[]> getOrderStates(String schemaName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select case when o.\"U_SEPARADOR\"='' then 'SAP NO APROB' when o.\"U_SEPARADOR\" is null then 'APP NO APROB' ");
        sb.append(" when o.\"U_SEPARADOR\"='PENDIENTE DE PAGO' then 'PEND PAGO' else cast(o.\"U_SEPARADOR\" as varchar(20))end as \"Estado\", ");
        sb.append(" cast(count(o.\"DocNum\")as int)as Pedidos, ");
        sb.append(" cast(ifnull(sum(((((((o.\"DocTotal\"+o.\"DiscSum\")-o.\"VatSum\")-o.\"TotalExpns\")+o.\"WTSum\")-o.\"RoundDif\")-o.\"DiscSum\")),0)as numeric(18,0))as Total ");
        sb.append("from  ORDR o ");
        sb.append("where o.\"DocStatus\"='O' and o.\"U_DESP\"='N' and o.\"DocDate\" between ADD_MONTHS(ADD_DAYS(current_date,-extract(day from current_date)+1),-1) and current_date ");
        sb.append("group by o.\"U_SEPARADOR\" ");
        sb.append("union all ");
        sb.append("select 'ENTREGA'as Estado,cast(count(e.\"DocNum\")as int)as Pedidos, ");
        sb.append(" cast(ifnull(sum(((((((e.\"DocTotal\"+e.\"DiscSum\")-e.\"VatSum\")-e.\"TotalExpns\")+e.\"WTSum\")-e.\"RoundDif\")-e.\"DiscSum\")),0)as numeric(18,0))as Total ");
        sb.append("from  ODLN e ");
        sb.append("where e.\"CANCELED\"='N' and e.\"DocStatus\"='O' and e.\"DocType\"='I' and e.\"DocDate\" between ADD_MONTHS(ADD_DAYS(current_date,-extract(day from current_date)+1),-1) and current_date ");
        sb.append("order by \"Estado\" ASC");
        try {
            return persistenceConf.chooseSchema(schemaName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error listado la estadistica de las ordenes.", e);
        }
        return null;
    }

    public BigDecimal getTotalOrderMonth(String schemaName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(sum((o.\"DocTotal\" - o.\"VatSum\" + o.\"DiscSum\" - o.\"TotalExpns\" + o.\"WTSum\") - o.\"DiscSum\") as numeric(18,0)) as TotalPedido ");
        sb.append("from ORDR o ");
        sb.append("where o.\"CANCELED\" = 'N' AND YEAR(o.\"DocDate\") = YEAR(current_date) AND MONTH(o.\"DocDate\") = MONTH(current_date)");
        try {
            return (BigDecimal) persistenceConf.chooseSchema(schemaName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el total de ordenes mensuales.");
        }
        return null;
    }

    public Long getLineNum(Integer orderNumber, String itemCode, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select det.\"LineNum\" from ORDR enc inner join RDR1 det on det.\"DocEntry\" = enc.\"DocEntry\" ");
        sb.append("where enc.\"DocNum\" = ");
        sb.append(orderNumber);
        sb.append(" and det.\"ItemCode\" = '");
        sb.append(itemCode);
        sb.append("' and det.\"LineStatus\" = 'O' ");
        sb.append("limit 1");
        try {
            return ((Integer) persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult()).longValue();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el numero de linea de una orden. ", e);
        }
        return -1L;
    }

    public List<Object[]> listRemainingStock(Integer orderNumber, String warehouseCode, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(d.\"ItemCode\" as varchar(20)) itemCode, cast(d.\"OpenQty\" as int) openQuantity, ");
        sb.append(" cast(d.\"Quantity\" as int) quantity, cast(d.\"Dscription\" as varchar(100)) itemName, ");
        sb.append(" cast(o.\"DocNum\" as int) orderNumber, cast(s.\"OnHand\" as int) availableTotal,( ");
        sb.append(" select cast(ifnull(sum(o.\"OnHandQty\"), 0) as int)as \"availableBins\" from OIBQ o ");
        sb.append(" inner join OBIN u on u.\"AbsEntry\" = o.\"BinAbs\" ");
        sb.append(" where o.\"ItemCode\" = d.\"ItemCode\" and u.\"Attr1Val\" IN ('PICKING','STORAGE') ");
        sb.append(")as \"availableBins\" from ORDR o ");
        sb.append("inner join RDR1 d on d.\"DocEntry\" = o.\"DocEntry\" and d.\"LineStatus\" = 'O' ");
        sb.append("inner join OITW s on s.\"WhsCode\" = '");
        sb.append(warehouseCode);
        sb.append("' and d.\"ItemCode\" = s.\"ItemCode\" where o.\"DocNum\" = ");
        sb.append(orderNumber);
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el saldo disponible para la orden. ", e);
        }
        return new ArrayList<>();
    }

    public Object[] retrieveStickerInfo(String orderNumbers, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select distinct cast(o.\"CardName\" as varchar(100))as cardname,cast(ifnull(d.\"StreetS\",ifnull(d.\"Address2S\",ifnull(d.\"Address3S\",'')))as varchar(220))as address,cast(t.\"Name\" as varchar(50))as trans, ");
        sb.append(" cast(d.\"CityS\" as varchar(100))as city,ifnull(cast(p.\"Name\" as varchar(100)),'')as part,cast(pg.\"PymntGroup\" as varchar(50))as pay,cast(o.\"CardCode\" as varchar(50))as cardcode ");
        sb.append("from  ORDR o ");
        sb.append("inner join RDR12 d ON o.\"DocEntry\"=d.\"DocEntry\" ");
        sb.append("left  join \"@BPCO_DEP\" p ON p.\"Code\"=d.\"StateS\" ");
        sb.append("inner join \"@TRANSP\" t ON t.\"Code\"=o.\"U_TRANSP\" ");
        sb.append("inner join OCTG pg on pg.\"GroupNum\"=o.\"GroupNum\" ");
        sb.append("where o.\"DocNum\" IN (");
        sb.append(orderNumbers);
        sb.append(")");
        try {
            return (Object[]) persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los datos para imprimir la etiqueta de packing. ", e);
        }
        return null;
    }

    public List<Object[]> listPendingOrdersByInvoice(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select distinct cast(e.\"DocNum\" as int) as entrega, cast(o.\"DocNum\" as int) as orden, cast(e.\"DocDate\" as date) as fechaEntrega, ");
        sb.append("      cast(o.\"DocDate\" as date) as fechaOrden, cast(e.\"DocTotal\" as numeric(18,0)) as total, cast((select max(d.\"WhsCode\") from RDR1 d where d.\"DocEntry\"=o.\"DocEntry\") as varchar(20)) as almacen ");
        sb.append("from  ORDR o ");
        sb.append("inner join ODLN e ON o.\"DocNum\" = e.\"U_NUNFAC\" ");
        sb.append("where e.\"CANCELED\"='N' and e.\"DocStatus\"='O' and e.\"DocType\"='I' and o.\"DocType\"='I' and o.\"CANCELED\"='N' and o.\"DocDate\" between ADD_DAYS(TO_DATE(current_date,'YYYY-MM-DD'),-20) and current_date");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error listando las ordenes pendientes por facturar.");
        }
        return null;
    }

    public List<Object[]> listOrdersOfDay(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(ADD_DAYS(TO_DATE(current_date,'YYYY-MM-DD'),-v.\"U_Value\")as varchar(20))as Fecha, ");
        sb.append(" ifnull(t.\"TotalOrder\",0)as TotalOrder,ifnull(t.\"Abiertas\",0)as Abiertas,ifnull(t.\"Cerradas\",0)as Cerradas,ifnull(t.\"Monto\",0)as Monto ");
        sb.append("from \"@SPT_VALUES\" v ");
        sb.append("left join( ");
        sb.append(" select cast(enc.\"DocDate\" as date)as \"Fecha\",cast(count(enc.\"DocNum\")as int)as \"TotalOrder\", ");
        sb.append("  (select cast(count(e.\"DocNum\")as int) from ORDR e where e.\"DocStatus\"='O' and cast(e.\"DocDate\" as date)=cast(enc.\"DocDate\" as date))as \"Abiertas\", ");
        sb.append("  (select cast(count(e.\"DocNum\")as int) from ORDR e where e.\"DocStatus\"='C' and cast(e.\"DocDate\" as date)=cast(enc.\"DocDate\" as date))as \"Cerradas\", ");
        sb.append("   sum(cast(enc.\"DocTotal\"-enc.\"VatSum\" as numeric(18,2)))as \"Monto\" ");
        sb.append(" from ORDR enc ");
        sb.append(" where enc.\"CANCELED\"='N' and enc.\"DocDate\" between ADD_DAYS(TO_DATE(current_date,'YYYY-MM-DD'),-4) and current_date ");
        sb.append(" group by enc.\"DocDate\" ");
        sb.append(")as t on t.\"Fecha\"=ADD_DAYS(TO_DATE(current_date,'YYYY-MM-DD'),-v.\"U_Value\") ");
        sb.append("where v.\"U_Value\" between 0 and 4 ");
        sb.append("order by v.\"U_Value\" asc");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando las ordenes del dia para la empresa " + companyName, e);
        }
        return new ArrayList<>();
    }

    public String getCardCode(String order) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(o.\"CardCode\" as varchar(20))as cardCode from ORDR o where o.\"DocNum\"=");
        sb.append(order);
        try {
            return (String) persistenceConf.chooseSchema("IGB", false, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
        }
        return null;
    }


    public boolean closeOrderLines(Integer orderEntry, HashSet<String> items, String companyName, boolean testing) {
        String itms = "";
        EntityManager em = persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA);
        StringBuilder sb = new StringBuilder();
        sb.append("update RDR1 set \"LineStatus\"='C' where \"DocEntry\"=");
        sb.append(orderEntry);
        sb.append(" and \"ItemCode\" in (");

        for (String it : items) {
            itms += "'" + it + "',";
        }

        sb.append(itms.substring(0, itms.length() - 1));
        sb.append(")");
        try {
            em.createNativeQuery(sb.toString()).executeUpdate();
            return true;
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al cerrar las lineas de la orden {0} para los productos que no tienen saldo: {1}", new Object[]{orderEntry, items});
        }
        return false;
    }
}