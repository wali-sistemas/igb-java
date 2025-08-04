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
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
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
        sb.append("select j.docnum, j.docdate, j.cardcode, j.cardname, j.confirmed, j.items, j.comments, j.address, j.transp, ifnull(j.ovMDL,''), j.contSer, j.marca ");
        sb.append("from (select f.*, COUNT(f.grupo) OVER (PARTITION BY f.cardcode) as \"ContGrupo\" from ( ");
        sb.append("select t.*, ROW_NUMBER() OVER (PARTITION BY t.cardcode order by t.cardcode) as grupo from ( ");
        sb.append("select distinct cast(enc.\"DocNum\" as varchar(10)) as docnum, ");
        sb.append("cast(enc.\"DocDueDate\" as date) as docdate, cast(enc.\"CardCode\" as varchar(20)) as cardcode, ");
        sb.append("cast(enc.\"CardName\" as varchar(100)) as cardname, cast(enc.\"Confirmed\" as varchar(1)) as confirmed, ");
        sb.append("cast((select count(1) from RDR1 det where det.\"DocEntry\" = enc.\"DocEntry\" and det.\"LineStatus\" = 'O') as int) as items, ");
        sb.append("cast(enc.\"Comments\" as varchar(254)) as comments, cast(enc.\"Address2\" as varchar(200)) as address, ");
        if (schemaName.contains("VARROC")) {
            sb.append("(select cast(t.\"Name\" as varchar(30)) from \"@TRANSP\" t where t.\"Code\"=enc.\"U_TRANSP\") as transp, ");
            sb.append("(select cast(m.\"Name\" as varchar(30)) from OITM t inner join \"@MARCAS\" m on m.\"Code\"=t.\"U_Marca\" where t.\"ItemCode\"=det.\"ItemCode\")as marca, ");
        } else {
            sb.append("ifnull(cast(enc.\"U_TRANSP\" as varchar(4)),'') as transp, ");
            sb.append("null as marca, ");
        }
        if (warehouseCode.equals("30") || warehouseCode.equals("13") || warehouseCode.equals("32")) {
            sb.append("null as ovMDL, ");
        } else {
            sb.append("cast(mdl.\"DocNum\" as varchar(10))as ovMDL, ");
        }
        sb.append("(select cast(count(\"U_SERIAL\")as int) from ORDR where \"U_SERIAL\"=enc.\"U_SERIAL\")as contSer ");
        sb.append("from ORDR enc ");
        sb.append("inner join RDR1 det on det.\"DocEntry\" = enc.\"DocEntry\" and det.\"WhsCode\" = '");
        sb.append(warehouseCode);
        sb.append("' ");
        if (warehouseCode.equals("01")) {
            sb.append("left join ORDR mdl on enc.\"U_SERIAL\" = mdl.\"U_SERIAL\" and right(mdl.\"NumAtCard\",1)='M' and mdl.\"DocStatus\"='O' ");
        }
        sb.append("where enc.\"DocStatus\" = 'O' and enc.\"U_SEPARADOR\" IN ('APROBADO','PREPAGO','SEDE BOGOTA') and ");
        sb.append("        year(enc.\"DocDate\") = year(current_date) and MONTH(enc.\"DocDate\") between MONTH(current_date)-1 and MONTH(current_date) ");
        if (!showAll) {
            sb.append("and enc.\"Confirmed\" = 'Y' ");
        }
        sb.append(") as t ) as f ) as j ");
        if (filterGroup) {
            if (warehouseCode.equals("30")) {
                sb.append("where j.\"ContGrupo\" > 1 and j.contSer = 1 ");
            } else {
                sb.append("where j.\"ContGrupo\" > 1 ");
            }
        } else {
            if (warehouseCode.equals("30")) {
                sb.append("where j.contSer = 1 ");
            }
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
                order.setDocNumMDL((String) row[9]);
                order.setMarca((String) row[11]);

                orders.add(order);
            }
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar las ordenes de venta abiertas. ", e);
        }
        return orders;
    }

    public List<SalesOrderDTO> findOpenOrdersMagnum(String schemaName, String warehouseCode, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select distinct cast(enc.\"DocNum\" as varchar(10))as docnum, ");
        sb.append(" cast(enc.\"DocDueDate\" as date)as docdate,cast(enc.\"CardCode\" as varchar(20))as cardcode,cast(enc.\"CardName\" as varchar(100))as cardname, ");
        sb.append(" cast((select count(1) from RDR1 det where det.\"DocEntry\"=enc.\"DocEntry\" and det.\"LineStatus\"='O')as int)as items, ");
        sb.append(" cast(enc.\"Comments\" as varchar(254))as comments,cast(enc.\"Address2\" as varchar(200))as address, ");
        sb.append(" ifnull(cast(enc.\"U_TRANSP\" as varchar(4)),'')as transp,cast(det.\"WhsCode\" as varchar(4))as whscode, ");
        sb.append(" cast((enc.\"DocTotal\"-enc.\"VatSum\"-enc.\"TotalExpns\"+enc.\"WTSum\")as numeric(18,2))as TotalDesc, ");
        sb.append(" cast(tt.\"U_MIN_SEG\" as numeric(18,2))as ValStandDecl,cast(tt.\"U_MIN_FLE\" as int)as UnidEmpStand, ");
        sb.append(" cast((select sum(det.\"Quantity\") from RDR1 det where det.\"DocEntry\"=enc.\"DocEntry\" and det.\"LineStatus\"='O')as int)as qty, ");
        sb.append(" ifnull(cast(tt.\"U_PORC_FLE_CLIE\" as numeric(4,2)),0)as porcFlete,cast(pg.\"PymntGroup\" as varchar(20))as condPayment, ");
        sb.append(" (select cast(m.\"Name\" as varchar(30)) from OITM t inner join \"@MARCAS\" m on m.\"Code\"=t.\"U_Marca\" where t.\"ItemCode\"=det.\"ItemCode\")as marca, ");
        sb.append(" case when \"Dscription\" like 'COMBO%' then 'COMBO' else 'NO' end as promotion ");
        sb.append("from ORDR enc ");
        sb.append("inner join RDR1 det on det.\"DocEntry\"=enc.\"DocEntry\" and det.\"WhsCode\" in ('05','26','35','45') ");
        sb.append("inner join RDR12 lg on lg.\"DocEntry\"=enc.\"DocEntry\" ");
        sb.append("left join \"@TRANSP_TAR\" tt on tt.\"U_COD_TRA\"=enc.\"U_TRANSP\" and tt.\"Code\"=lg.\"U_MunicipioS\" ");
        sb.append("inner join \"OCTG\" pg on pg.\"GroupNum\"=enc.\"GroupNum\" ");
        sb.append("where enc.\"DocStatus\"='O' and enc.\"U_SEPARADOR\" in ('APROBADO','PREPAGO','SEDE BOGOTA') ");
        sb.append(" and year(enc.\"DocDate\")=year(current_date) and month(enc.\"DocDate\") between month(current_date)-1 and month(current_date) and enc.\"Confirmed\"='Y' ");
        sb.append("order by whscode,docdate desc ");

        List<SalesOrderDTO> orders = new ArrayList<>();
        try {
            for (Object[] row : (List<Object[]>) persistenceConf.chooseSchema(schemaName, testing, warehouseCode).createNativeQuery(sb.toString()).getResultList()) {
                SalesOrderDTO order = new SalesOrderDTO();
                order.setDocNum((String) row[0]);
                order.setDocDate((Date) row[1]);
                order.setCardCode((String) row[2]);
                order.setCardName((String) row[3]);
                order.setItems((Integer) row[4]);
                order.setComments((String) row[5]);
                order.setAddress((String) row[6]);
                order.setTransp((String) row[7]);
                order.setWhsCode((String) row[8]);
                order.setSubTotal((BigDecimal) row[9]);
                order.setVlrDeclarStand((BigDecimal) row[10]);
                order.setUndEmpStand((Integer) row[11]);
                order.setQty((Integer) row[12]);
                order.setPorcFlet((BigDecimal) row[13]);
                order.setTotalFlet(order.getSubTotal().multiply(order.getPorcFlet().divide(BigDecimal.valueOf(100))));
                order.setCondPayment((String) row[14]);
                order.setMarca((String) row[15]);
                order.setPromotion((String) row[16]);

                orders.add(order);
            }
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error listando las ordenes abiertas de magnum. ", e);
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

    public List<Object[]> listPendingOrdersByInvoice(String companyName, String whsCode, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select * from ( ");
        sb.append(" select distinct cast(e.\"DocNum\" as int) as entrega, cast(o.\"DocNum\" as int) as orden, cast(e.\"DocDate\" as date) as fechaEntrega, ");
        sb.append("  cast(o.\"DocDate\" as date)as fechaOrden,cast(e.\"DocTotal\" as numeric(18,0))as total,cast((select max(d.\"WhsCode\") from RDR1 d where d.\"DocEntry\"=o.\"DocEntry\") as varchar(20))as almacen, ");
        sb.append("  cast(o.\"CardCode\" as varchar(20))as nit ");
        sb.append(" from  ORDR o ");
        sb.append(" inner join ODLN e ON o.\"DocNum\" = e.\"U_NUNFAC\" ");
        sb.append(" where e.\"CANCELED\"='N' and e.\"DocStatus\"='O' and e.\"DocType\"='I' and o.\"DocType\"='I' and o.\"CANCELED\"='N' and o.\"DocDate\" between ADD_DAYS(TO_DATE(current_date,'YYYY-MM-DD'),-20) and current_date");
        sb.append(")as t ");
        if (companyName.contains("VARROC")) {
            sb.append("where t.almacen='");
            sb.append(whsCode);
            sb.append("'");
        }
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

    public boolean validateOrderAuthorized(String order, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select o.\"DocNum\" ");
        sb.append("from ORDR o ");
        sb.append("where o.\"DocStatus\"='O' and o.\"Confirmed\"='Y' and o.\"U_SEPARADOR\" IN ('APROBADO','PREPAGO','SEDE BOGOTA') and o.\"DocNum\"='");
        sb.append(order);
        sb.append("'");
        try {
            int result = persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult().hashCode();
            if (result > 0) {
                return true;
            } else {
                return false;
            }
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando si la orden " + order + " esta aprobada.");
        }
        return false;
    }

    public void updateUserFieldCodTransport(String codTrasnp, Integer docNum, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("update ORDR set \"U_TRANSP\"=");
        sb.append(codTrasnp);
        sb.append(" where \"DocNum\"=");
        sb.append(docNum);
        try {
            persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).executeUpdate();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error actualizando el codigo de transporte para la orden {0}", docNum);
        }
    }

    public List<Object[]> listOrdersForEnlistment(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select t.*, ");
        sb.append(" ifnull((select cast(sum(rc2.\"Vlrec\"*DAYS_BETWEEN(rc2.\"Fecha_FA\",rc2.\"Fecha_RC\"))/sum(rc2.\"Vlrec\")as int) ");
        sb.append("  from(select rc1.\"Fecha_RC\" as \"Fecha_RC\",rc1.\"Vlrec\" as \"Vlrec\",rc1.\"Fecha_FA\" as \"Fecha_FA\",rc1.\"CardCode\" ");
        sb.append("   from(select dc3.\"CardCode\" as \"CardCode\",dc3.\"Tipo_Doc\" as \"Tipo_Doc\",dc3.\"NroDoc\" as \"NroDoc\",dc3.\"Fecha_RC\" as \"Fecha_RC\",dc3.\"NroRec\" as \"NroRec\",dc3.\"Vlrec\" as \"Vlrec\",f.\"DocDate\" as \"Fecha_FA\" ");
        sb.append("    from(select dc1.\"CardCode\" as \"CardCode\",dc1.\"Tipo_Doc\" as \"Tipo_Doc\",dc1.\"NroDoc\" as \"NroDoc\",dc1.\"Fecha_RC\" as \"Fecha_RC\",dc2.\"NroRec\" as \"NroRec\",dc2.\"Vlrec\" as \"Vlrec\" ");
        sb.append("     from(select o.\"CardCode\" as \"CardCode\",o.\"ObjType\" as \"Tipo_Doc\",o.\"DocNum\" as \"NroDoc\",o.\"TaxDate\" as \"Fecha_RC\" ");
        sb.append("      from ORCT o ");
        sb.append("      inner join OCRD c on c.\"CardCode\"=o.\"CardCode\" ");
        sb.append("      inner join \"@PARAMETROS\" p on p.\"Code\"='02' ");
        sb.append("       where o.\"CardCode\"=c.\"CardCode\" and o.\"DocDate\">=ADD_MONTHS(current_date,-10) and o.\"DocDate\"<=current_date and o.\"Canceled\"='N' ");
        sb.append("     )as dc1 ");
        sb.append("     inner join(select dc1.\"Tipo_Doc\" as \"Tipo_Doc\",dc1.\"NroDoc\" as \"NroDoc\",dc1.\"Fecha_RC\" as \"Fecha_RC\",o.\"ReconNum\" as \"NroRec\",i.\"ReconSum\" as \"Vlrec\",dc1.\"CardCode\" ");
        sb.append("      from(select o.\"CardCode\" as \"CardCode\",o.\"ObjType\" as \"Tipo_Doc\",o.\"DocEntry\" as \"DocEntry_Doc\",o.\"DocNum\" as \"NroDoc\",o.\"TaxDate\" as \"Fecha_RC\",0 as \"NroRec\", 0 as \"Vlrec\" ");
        sb.append("       from ORCT o ");
        sb.append("       inner join OCRD c on c.\"CardCode\"=o.\"CardCode\" ");
        sb.append("       inner join \"@PARAMETROS\" p on p.\"Code\"='02' ");
        sb.append("       where o.\"CardCode\"=c.\"CardCode\" and o.\"DocDate\">=ADD_MONTHS(current_date,-10) and o.\"DocDate\"<=current_date and o.\"Canceled\"='N' ");
        sb.append("      )as dc1 ");
        sb.append("      left join ITR1 i on i.\"SrcObjTyp\"=dc1.\"Tipo_Doc\" and i.\"SrcObjAbs\"=dc1.\"DocEntry_Doc\" ");
        sb.append("      left join OITR o on o.\"ReconNum\"=i.\"ReconNum\" ");
        sb.append("      where o.\"Canceled\"='N' and o.\"ReconType\"<>7 and o.\"ReconType\"<>5 ");
        sb.append("     )as dc2 on (dc1.\"CardCode\"=dc2.\"CardCode\" and dc1.\"Tipo_Doc\"=dc2.\"Tipo_Doc\" and dc1.\"NroDoc\"=dc2.\"NroDoc\") ");
        sb.append("    )as dc3 ");
        sb.append("   inner join OITR o on o.\"ReconNum\"=dc3.\"NroRec\" ");
        sb.append("   inner join ITR1 i on i.\"ReconNum\"=o.\"ReconNum\" and i.\"SrcObjTyp\"='13' ");
        sb.append("   inner join OINV f on f.\"DocEntry\"=i.\"SrcObjAbs\" ");
        sb.append("   where dc3.\"Tipo_Doc\"='24' and f.\"DocSubType\"<>'DN' ");
        sb.append("  )as rc1 ");
        sb.append("  group by rc1.\"CardCode\",rc1.\"Tipo_Doc\",rc1.\"NroDoc\",rc1.\"Fecha_RC\",rc1.\"NroRec\",rc1.\"Vlrec\",rc1.\"Fecha_FA\" ");
        sb.append(" )as rc2 ");
        sb.append(" where rc2.\"CardCode\"=t.cardCode ");
        sb.append(" group by rc2.\"CardCode\"),0)as PromDay, ");
        sb.append(" cast(cli.\"Discount\" as int)as DiscClient, ");
        sb.append(" cast((select count(\"DocNum\") from ORDR where \"CardCode\"=cli.\"CardCode\" and \"DocStatus\"='O' and \"U_DESP\"='N' and year(\"DocDate\")=year(current_date) and month(\"DocDate\") between month(current_date)-1 and month(current_date))as int)as nroPed ");
        sb.append("from( ");
        sb.append(" select distinct case when o.\"U_SEPARADOR\"='' then 'SIN ASIGNAR' else cast(ifnull(o.\"U_SEPARADOR\",'SIN ASIGNAR')as varchar) end as estado,cast(o.\"DocNum\" as varchar)as cedi, ");
        sb.append("  ifnull(cast((select distinct r.\"DocNum\" from ORDR r inner join RDR1 d on r.\"DocEntry\"=d.\"DocEntry\" where r.\"U_SERIAL\"=o.\"U_SERIAL\" and d.\"WhsCode\"='30' and r.\"DocStatus\"='O')as varchar),'')as modula, ");
        sb.append("  cast(o.\"CardCode\" as varchar)as cardCode,cast(o.\"CardName\" as varchar)as cardName,cast(a.\"SlpName\" as varchar)as slpName, ");
        if (companyName.contains("IGB")) {
            sb.append("cast(a.\"Memo\" as varchar)as region, ");
        } else {
            sb.append("cast(a.\"U_REGIONAL\" as varchar)as region, ");
        }
        sb.append("  cast(o.\"DocDate\" as date)as docDate,cast(o.\"DocTotal\" as numeric(18,2))as docTotal,case when o.\"GroupNum\"=-1 then 'CONTADO' else 'CRÉDITO' end as payCond,cast(c.\"CreditLine\" as numeric(18,2))as cupo,cast(c.\"Balance\" as numeric(18,2))as saldo, ");
        sb.append("  ifnull(cast((select days_between(current_date,add_days(min(f.\"DocDueDate\"),10))*-1 from oinv f where f.\"DocStatus\"='O' and days_between(current_date,add_days(f.\"DocDueDate\",10))<0 and f.\"CardCode\"=c.\"CardCode\" group by f.\"CardCode\")as int),0)as dayVenc, ");
        sb.append("  case when o.\"DiscPrcnt\">0 then 1 else 0 end as DiscPed,cast(o.\"Comments\" as varchar)as comments ");
        sb.append(" from ORDR o ");
        sb.append(" inner join RDR1 d on o.\"DocEntry\"=d.\"DocEntry\" ");
        sb.append(" inner join OSLP a on a.\"SlpCode\"=o.\"SlpCode\" ");
        sb.append(" inner join OCRD c on o.\"CardCode\"=c.\"CardCode\" ");
        sb.append(" where o.\"DocStatus\"='O' and o.\"U_DESP\"='N' and year(o.\"DocDate\")=year(current_date) and month(o.\"DocDate\") between month(current_date)-1 and month(current_date) ");
        sb.append(")as t ");
        sb.append("inner join OCRD cli on cardcode=cli.\"CardCode\" ");
        sb.append("where t.estado not in ('APROBADO','PREPAGO','FACTURAR','REVISAR','RETENIDO') ");
        sb.append("order by 4 asc");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error listando las ordenes para alistamiento en " + companyName, e);
        }
        return new ArrayList<>();
    }

    public void updateUserFieldApproveOrder(String docNum, String status, String note, String confirmed, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("update ORDR ");
        sb.append("set \"U_SEPARADOR\"='");
        sb.append(status);
        sb.append("',\"Confirmed\"='");
        sb.append(confirmed);
        sb.append("',\"U_nwr_Note\"='");
        sb.append(note);
        sb.append("',\"DocDueDate\"='");
        sb.append(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        sb.append("' where \"DocNum\"=");
        sb.append(docNum);
        try {
            persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).executeUpdate();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error aprobando la orden " + docNum + " para ser separada por " + companyName, e);
        }
    }

    public Object[] getBillsByOrder(Integer docNum, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(o.\"DocEntry\" as int)as docEntry,ifnull(cast(f.\"LineTotal\" as numeric(18,0)),0)as lineTotalF, ");
        sb.append(" ifnull(cast(f.\"TaxCode\" as varchar),'')as taxcodeF,cast(f.\"LineNum\" as int)as LineNumF,cast(f.\"ObjType\" as int)as ObjTypeF ");
        sb.append("from ORDR o ");
        sb.append("inner join RDR1 d on d.\"DocEntry\"=o.\"DocEntry\" and d.\"LineStatus\"='O' ");
        sb.append("left  join RDR3 f on d.\"DocEntry\"=f.\"DocEntry\" ");
        sb.append("where o.\"DocStatus\"='O' and o.\"DocNum\"='");
        sb.append(docNum);
        sb.append("' limit 1");
        try {
            return (Object[]) persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando los gastos de la orden " + docNum + " en " + companyName, e);
        }
        return null;
    }
}