package co.igb.persistence.facade;

import co.igb.dto.SalesOrderDTO;
import co.igb.persistence.entity.SalesOrderDetail;
import co.igb.persistence.entity.SalesOrderDetail_;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.criteria.*;
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
    private static final String DB_TYPE = "mssql";

    @EJB
    private PersistenceConf persistenceConf;

    public SalesOrderFacade() {
    }

    public String getOrderStatus(Integer docNum, String schemaName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(DocStatus as varchar(1)) docstatus from ORDR where DocNum = ");
        sb.append(docNum);
        try {
            return (String) persistenceConf.chooseSchema(schemaName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el estado de la orden " + docNum + ". ", e);
        }
        return null;
    }

    public BigDecimal getValorDeclarado(Integer docNum, String schemaName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast((DocTotal + DiscSum + WtSum) - VatSum - TotalExpns - RoundDif AS numeric(18,2)) AS valorDeclarado ");
        sb.append("from ORDR where DocNum = ");
        sb.append(docNum);
        try {
            return (BigDecimal) persistenceConf.chooseSchema(schemaName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el valor declarado para la orden " + docNum + ".", e);
        }
        return new BigDecimal(0);
    }

    public String getOrderComment(Integer docNum, String schemaName, boolean testing) {
        if (docNum != null && schemaName != null && !schemaName.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("select cast(comments as varchar(254)) comments from ORDR where DocNum = ");
            sb.append(docNum);
            try {
                return (String) persistenceConf.chooseSchema(schemaName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
            } catch (NoResultException ex) {
            } catch (Exception e) {
                CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el comentario de la orden " + docNum + ".", e);
            }
        }
        return null;
    }

    public Integer getOrderDocEntry(Integer docNum, String schemaName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select DocEntry from ORDR where DocNum = ");
        sb.append(docNum);
        try {
            return (Integer) persistenceConf.chooseSchema(schemaName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el docentry de la orden. ", e);
        }
        return -1;
    }

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<SalesOrderDTO> findOpenOrders(boolean showAll, boolean filterGroup, String schemaName, boolean testing, String warehouseCode) {
        EntityManager em = persistenceConf.chooseSchema(schemaName, testing, DB_TYPE);
        StringBuilder sb = new StringBuilder();
        sb.append("select j.docnum, j.docdate, j.cardcode, j.cardname, j.confirmed, j.items, j.comments, j.address, j.transp ");
        sb.append("from (select f.*, COUNT(f.grupo) OVER (PARTITION BY f.cardcode) as contGrupo from ( ");
        sb.append("select t.*, ROW_NUMBER() OVER (PARTITION BY t.cardcode order by t.cardcode) as grupo from ( ");
        sb.append("select distinct cast(enc.docnum as varchar(10)) as docnum, ");
        sb.append("cast(enc.docdate as date) as docdate, cast(enc.cardcode as varchar(20)) as cardcode, ");
        sb.append("cast(enc.cardname as varchar(100)) as cardname, cast(enc.confirmed as varchar(1)) as confirmed, ");
        sb.append("(select count(1) from rdr1 det where det.docentry = enc.docentry and det.linestatus = 'O') as items, ");
        sb.append("cast(comments as varchar(254)) as comments, cast(enc.address2 as varchar(200)) as address, ");
        sb.append("isnull(cast(enc.u_transp as varchar(4)),'') as transp from ordr enc ");
        sb.append("inner join rdr1 det on det.docentry = enc.docentry and det.whscode = '");
        sb.append(warehouseCode);
        sb.append("' where enc.DocStatus = 'O' and enc.U_SEPARADOR IN ('APROBADO','PREPAGO','SEDE BOGOTA') and ");
        sb.append("        year(enc.DocDate) = year(GETDATE()) and MONTH(enc.DocDate) between MONTH(GETDATE())-1 and MONTH(GETDATE()) ");
        if (!showAll) {
            sb.append("and enc.confirmed = 'Y' ");
        }
        sb.append(") as t ) as f ) as j ");
        if (filterGroup) {
            sb.append("where j.contGrupo > 1 ");
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
        sb.append("select cast(detalle.itemCode as varchar(20)) itemCode, cast(detalle.openQty as int) openQuantity, cast(detalle.quantity as int) quantity, ");
        sb.append("cast(saldo.binabs as int) binAbs, cast(saldo.onhandqty as int) available, cast(ubicacion.bincode as varchar(50)) binCode, ");
        sb.append("cast(detalle.Dscription as varchar(100)) itemName, cast(orden.docnum as int) orderNumber, ");
        sb.append("cast(ubicacion.attr2val as varchar(5)) velocidad, cast(ubicacion.attr3val as int) secuencia, ");
        sb.append("cast(ubicacion.attr1val as varchar(10)) binType ");
        sb.append("from ordr orden inner join rdr1 detalle on detalle.docentry = orden.docentry and detalle.lineStatus = 'O' ");
        if (itemCodes != null && !itemCodes.isEmpty()) {
            sb.append("and detalle.itemcode in (");
            for (String itemCode : itemCodes) {
                sb.append("'");
                sb.append(itemCode);
                sb.append("',");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(") ");
        }
        sb.append("inner join OIBQ saldo on saldo.ItemCode = detalle.ItemCode and saldo.WhsCode = '");
        sb.append(warehouseCode);
        sb.append("' and saldo.OnHandQty > 0 inner join obin ubicacion on ubicacion.absentry = saldo.binabs and ubicacion.SysBin = 'N' ");
        sb.append("and ubicacion.Attr1Val IN ('PICKING','STORAGE') where orden.docnum = ");
        sb.append(orderNumber);
        sb.append(" order by velocidad, secuencia ");
        CONSOLE.log(Level.FINE, sb.toString());
        try {
            return persistenceConf.chooseSchema(schemaName, testing, "mssql").createNativeQuery(sb.toString()).getResultList();
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
        sb.append("select cast(enc.docnum as varchar(10)) docnum, ");
        sb.append("cast(enc.cardname as varchar(100)) cardname ");
        sb.append("from ordr enc where enc.DocStatus = 'O' ");
        sb.append("and enc.docnum in (");
        for (Integer orderNumber : orderIds) {
            sb.append(orderNumber);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(")");
        try {
            return persistenceConf.chooseSchema(schemaName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al buscar ordenes por id. ", e);
        }
        return new ArrayList();
    }

    public LinkedHashMap<String, Integer> listPendingItems(Integer orderNumber, String schemaName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(det.ItemCode as varchar(20)) itemcode, cast(det.Quantity as int)as pendingQuantity, ");
        sb.append("cast((select top 1 ubicacion.attr2val from OIBQ saldo inner join OBIN ubicacion on ubicacion.absentry = saldo.binabs and ubicacion.SysBin = 'N' ");
        sb.append("and ubicacion.Attr1Val IN ('PICKING','STORAGE') where saldo.WhsCode = det.WhsCode and saldo.OnHandQty > 0 and saldo.ItemCode = det.ItemCode ");
        sb.append("order by ubicacion.attr2val, ubicacion.attr3val)as varchar(5))as velocidad, cast((select top 1 ubicacion.attr3val from OIBQ saldo ");
        sb.append("inner join OBIN ubicacion on ubicacion.absentry = saldo.binabs and ubicacion.SysBin = 'N' and ubicacion.Attr1Val IN ('PICKING','STORAGE') ");
        sb.append("where saldo.WhsCode = det.WhsCode and saldo.OnHandQty > 0 and saldo.ItemCode = det.ItemCode order by ubicacion.attr2val, ubicacion.attr3val)as int)as secuencia ");
        sb.append("from ORDR enc ");
        sb.append("inner join RDR1 det on det.docentry = enc.docentry and det.Quantity > 0 ");
        sb.append("where enc.DocStatus = 'O' and det.LineStatus = 'O' and enc.docnum =");
        sb.append(orderNumber);
        sb.append(" order by velocidad, secuencia");
        try {
            LinkedHashMap<String, Integer> results = new LinkedHashMap<>();
            List<Object[]> rows = (List<Object[]>) persistenceConf.chooseSchema(schemaName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
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
        sb.append("select case when o.U_SEPARADOR='' then 'SAP NO APROB' when o.U_SEPARADOR is null then 'APP NO APROB' ");
        sb.append(" when o.U_SEPARADOR='PENDIENTE DE PAGO' then 'PEND PAGO' else cast(o.U_SEPARADOR as varchar(20))end as Estado, ");
        sb.append(" cast(count(o.DocNum)as int)as Pedidos, ");
        sb.append(" cast(isnull(sum(((((((o.DocTotal+o.DiscSum)-o.VatSum)-o.TotalExpns)+o.WtSum)-o.RoundDif)-o.DiscSum)),0)as numeric(18,0))as Total ");
        sb.append("from  ORDR o ");
        sb.append("where o.DocStatus='O' and o.U_DESP='N' and cast(o.DocDate as Date) between cast(GETDATE()-30 as date) and cast(GETDATE()as date) ");
        sb.append("group by o.U_SEPARADOR ");
        sb.append("union all ");
        sb.append("select 'ENTREGA'as Estado,cast(count(e.DocNum)as int)as Pedidos, ");
        sb.append(" cast(isnull(sum(((((((e.DocTotal+e.DiscSum)-e.VatSum)-e.TotalExpns)+e.WtSum)-e.RoundDif)-e.DiscSum)),0)as numeric(18,0))as Total ");
        sb.append("from  ODLN e ");
        sb.append("where e.CANCELED='N' and e.DocStatus='O' and e.DocType='I' and cast(e.DocDate as date) between cast(GETDATE()-30 as date) and cast(GETDATE()as date) ");
        sb.append("order by Estado ASC");
        try {
            return persistenceConf.chooseSchema(schemaName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error listado la estadistica de las ordenes.", e);
        }
        return null;
    }

    public BigDecimal getTotalOrderMonth(String schemaName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(sum((DocTotal - VatSum + DiscSum - TotalExpns + WTSum) - DiscSum) as numeric(18,0)) as TotalPedido ");
        sb.append("from ORDR ");
        sb.append("where CANCELED = 'N' AND YEAR(DocDate) = YEAR(GETDATE()) AND MONTH(DocDate) = MONTH(GETDATE())");
        try {
            return (BigDecimal) persistenceConf.chooseSchema(schemaName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el total de ordenes mensuales.");
        }
        return null;
    }

    public Long getLineNum(Integer orderNumber, String itemcode, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select top 1 det.linenum from ordr enc inner join rdr1 det on det.docentry = enc.docentry ");
        sb.append("where enc.docnum = ");
        sb.append(orderNumber);
        sb.append(" and det.itemcode = '");
        sb.append(itemcode);
        sb.append("' and linestatus = 'O'");
        try {
            return ((Integer) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult()).longValue();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el numero de linea de una orden. ", e);
        }
        return -1L;
    }

    public List<Object[]> listRemainingStock(Integer orderNumber, String warehouseCode, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(detalle.itemCode as varchar(20)) itemCode, cast(detalle.openQty as int) openQuantity ");
        sb.append(", cast(detalle.quantity as int) quantity, cast(detalle.Dscription as varchar(100)) itemName ");
        sb.append(", cast(orden.docnum as int) orderNumber, cast(saldo.onhand as int) availableTotal, (");
        sb.append("select cast(isnull(sum(onhandqty), 0) as int) availableBins from oibq saldoUbicacion ");
        sb.append("inner join obin ubicacion on ubicacion.absentry = saldoUbicacion.binAbs ");
        sb.append("where saldoUbicacion.itemcode = detalle.ItemCode and ubicacion.attr1val IN ('PICKING','STORAGE') ");
        sb.append(") availableBins from ordr orden ");
        sb.append("inner join rdr1 detalle on detalle.docentry = orden.docentry and detalle.lineStatus = 'O' ");
        sb.append("inner join oitw saldo on saldo.whscode = '");
        sb.append(warehouseCode);
        sb.append("' and detalle.itemcode = saldo.itemcode where orden.docnum = ");
        sb.append(orderNumber);
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el saldo disponible para la orden. ", e);
        }
        return new ArrayList<>();
    }

    public Object[] retrieveStickerInfo(String orderNumbers, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select distinct cast(o.cardname as varchar(100))as cardname,cast(ISNULL(dir.StreetS,ISNULL(dir.Address2S,ISNULL(dir.Address3S,'')))as varchar(220))as address,cast(transp.name as varchar(50))as trans, ");
        sb.append(" cast(dir.CityS as varchar(100))as city,ISNULL(cast(dep.Name as varchar(100)),'')as depart,cast(pg.PymntGroup as varchar(50))as pay,cast(o.CardCode as varchar(50))as cardcode ");
        sb.append("from  ORDR o ");
        sb.append("inner join RDR12 dir ON o.DocEntry=dir.DocEntry ");
        sb.append("left  join [@BPCO_DEP] dep ON dep.Code=dir.StateS ");
        sb.append("inner join [@transp] transp ON transp.code=o.u_transp ");
        sb.append("inner join OCTG pg on pg.GroupNum=o.GroupNum ");
        sb.append("where o.docnum IN (");
        sb.append(orderNumbers);
        sb.append(")");
        try {
            return (Object[]) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los datos para imprimir la etiqueta de packing. ", e);
        }
        return null;
    }

    public String listNumAtCards(String orderNumbers, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(numatcard as varchar(10)) from ordr where docnum in (");
        sb.append(orderNumbers);
        sb.append(") and numatcard is not null");
        try {
            List<String> numAtCardList = (List<String>) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
            StringBuilder numAtCardText = new StringBuilder();
            for (String numAtCard : numAtCardList) {
                numAtCardText.append(numAtCard);
                numAtCardText.append(",");
            }
            if (numAtCardText.length() == 0 || numAtCardText.toString().equals(",")) {
                return "N/A";
            }
            numAtCardText.delete(numAtCardText.length() - 1, numAtCardText.length());
            return numAtCardText.toString();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los numAtCard del packingList. ", e);
            return "N/A";
        }
    }

    public List<Object[]> listPendingOrdersByInvoice(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select DISTINCT cast(e.DocNum as int) as entrega, cast(o.DocNum as int) as orden, cast(e.DocDate as date) as fechaEntrega, ");
        sb.append("       cast(o.DocDate as date) as fechaOrden, cast(e.DocTotal as numeric(18,0)) as total, cast((select top 1 d.WhsCode from RDR1 d where d.DocEntry=o.DocEntry) as varchar(20)) as almacen ");
        sb.append("from  ORDR o ");
        sb.append("inner join ODLN e ON o.DocNum = e.U_NUNFAC ");
        sb.append("where e.CANCELED='N' and e.DocStatus='O' and e.DocType='I' and o.DocType='I' and o.CANCELED='N' and cast(o.DocDate as Date) between cast(GETDATE()-10 as date) and cast(GETDATE() as date)");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error listando las ordenes pendientes por facturar.");
        }
        return null;
    }

    public List<Object[]> listOrdersOfDay(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(GETDATE()-v.number as date)as Fecha,isnull(t.TotalOrder,0)as TotalOrder,isnull(t.Abiertas,0)as Abiertas,isnull(t.Cerradas,0)as Cerradas,isnull(t.Monto,0)as Monto ");
        sb.append("from master.dbo.spt_values v ");
        sb.append(" left join( ");
        sb.append("  select cast(enc.DocDate as date)as Fecha,cast(COUNT(enc.DocNum)as int)as TotalOrder,");
        sb.append("   (select cast(COUNT(DocNum)as int) from ORDR e where DocStatus='O' and cast(e.DocDate as date)=cast(enc.DocDate as date))as Abiertas, ");
        sb.append("   (select cast(COUNT(DocNum)as int) from ORDR e where DocStatus='C' and cast(e.DocDate as date)=cast(enc.DocDate as date))as Cerradas, ");
        sb.append("   SUM(cast(enc.DocTotal-enc.VatSum as numeric(18,2)))as Monto ");
        sb.append("  from ORDR enc ");
        sb.append("  where enc.CANCELED='N' and cast(enc.DocDate as date) between cast(GETDATE()-4 as date) and cast(GETDATE()as date) ");
        sb.append("  group by enc.DocDate ");
        sb.append(" )as t ON t.Fecha=cast(GETDATE()-v.number as date) ");
        sb.append("where (name IS NULL)AND(number BETWEEN 0 AND 4) ");
        sb.append("order by v.number desc");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando las ordenes del dia para la empresa " + companyName, e);
        }
        return new ArrayList<>();
    }

    public String getCardCode(String order) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(cardCode as varchar(20))as cardCode from ORDR where DocNum=");
        sb.append(order);
        try {
            return (String) persistenceConf.chooseSchema("IGB", false, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
        }
        return null;
    }

    /*public void updatePickingOrderLine(Integer orderEntry, String item, String companyName, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(companyName, testing, DB_TYPE);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaUpdate<SalesOrderDetail> cu = cb.createCriteriaUpdate(SalesOrderDetail.class);
        Root<SalesOrderDetail> root = cu.from(SalesOrderDetail.class);

        cu.set(root.get(SalesOrderDetail_.uPicking), "Y");
        cu.where(cb.and(cb.equal(root.get(SalesOrderDetail_.docEntry), orderEntry)), cb.equal(root.get(SalesOrderDetail_.itemCode), item));
        try {
            em.createQuery(cu).executeUpdate();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al actualizar el campo [uPicking] en el detalle de la orden #{0} para el item {0}", new Object[]{orderEntry, item});
        }
    }*/

    public boolean closeOrderLines(Integer orderEntry, HashSet<String> items, String companyName, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(companyName, testing, DB_TYPE);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaUpdate<SalesOrderDetail> cu = cb.createCriteriaUpdate(SalesOrderDetail.class);
        Root<SalesOrderDetail> root = cu.from(SalesOrderDetail.class);

        Expression<String> parentExpression = root.get(SalesOrderDetail_.itemCode);
        Predicate parentPredicate = parentExpression.in(items);

        cu.set(root.get(SalesOrderDetail_.lineStatus), 'C');
        cu.where(cb.and(cb.equal(root.get(SalesOrderDetail_.docEntry), orderEntry)), parentPredicate);
        try {
            em.createQuery(cu).executeUpdate();
            return true;
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al cerrar las lineas de la orden {0} para los productos que no tienen saldo: {1}", new Object[]{orderEntry, parentExpression});
        }
        return false;
    }

    /*public boolean modifySalesOrderQuantity(Integer orderEntry, String itemCode, Integer newQuantity, BigDecimal price, String companyName, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(companyName, testing, DB_TYPE);
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaUpdate<SalesOrderDetail> cu = cb.createCriteriaUpdate(SalesOrderDetail.class);
        Root<SalesOrderDetail> root = cu.from(SalesOrderDetail.class);

        cu.set(root.get(SalesOrderDetail_.quantity), newQuantity);
        cu.set(root.get(SalesOrderDetail_.openQty), newQuantity);
        cu.set(root.get(SalesOrderDetail_.openCreQty), newQuantity);
        cu.set(root.get(SalesOrderDetail_.packQty), newQuantity);
        cu.set(root.get(SalesOrderDetail_.pcQuantity), newQuantity);
        cu.set(root.get(SalesOrderDetail_.invQty), newQuantity);
        cu.set(root.get(SalesOrderDetail_.openInvQty), newQuantity);
        cu.set(root.get(SalesOrderDetail_.lineTotal), price.multiply(new BigDecimal(newQuantity)));
        cu.set(root.get(SalesOrderDetail_.openSum), price.multiply(new BigDecimal(newQuantity)));
        cu.set(root.get(SalesOrderDetail_.totalSumSy), price.multiply(new BigDecimal(newQuantity)));
        cu.set(root.get(SalesOrderDetail_.openSumSys), price.multiply(new BigDecimal(newQuantity)));

        cu.where(cb.and(cb.equal(root.get(SalesOrderDetail_.itemCode), itemCode)), cb.equal(root.get(SalesOrderDetail_.docEntry), orderEntry));
        try {
            em.createQuery(cu).executeUpdate();
            return true;
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al modificar la cantidad del item {1} para la orden {0}", new Object[]{orderEntry, itemCode});
        }
        return false;
    }*/
}