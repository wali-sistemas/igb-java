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
public class DeliveryNoteFacade {

    private static final Logger CONSOLE = Logger.getLogger(DeliveryNoteFacade.class.getSimpleName());
    private static final String DB_TYPE = Constants.DATABASE_TYPE_MSSQL;

    @EJB
    private PersistenceConf persistenceConf;

    public DeliveryNoteFacade() {
    }

    public List<Object[]> getDeliveryNoteData(Integer deliveryDocEntry, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(enc.docentry as int) docentry, cast(enc.docnum as int) docnum, cast(enc.objtype as int) objtype, ");
        sb.append("cast(enc.cardcode as varchar(20)) cardcode, cast(enc.slpcode as int) slpcode, cast(ISNULL(enc.cntctcode,'') as int) cntctcode, ");
        sb.append("cast(det.linenum as int) linenum, cast(det.itemcode as varchar(20)) itemcode, cast(det.quantity as int) quantity, ");
        sb.append("cast(enc.U_VR_DECLARADO as numeric(18,2)) valorDeclarado, cast(enc.Comments as varchar(250)) comentario, ");
        sb.append("cast(enc.DocTotal-enc.VatSum as numeric(18,2)) as valorNeto, cast(enc.VatSum as numeric(18,2)) as impuesto, ");
        sb.append("cast(pay.extradays as int) as days ");
        sb.append("from  odln enc ");
        sb.append("inner join dln1 det on det.docentry = enc.docentry ");
        sb.append("inner join octg pay on pay.groupnum = enc.groupnum ");
        sb.append("where enc.docentry =");
        sb.append(deliveryDocEntry);
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los datos de la entrega. ", e);
            return new ArrayList<>();
        }
    }

    public List getDetailDeliveryNoteData(Integer DocNum, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(d.itemcode as varchar(20)) itemcode, cast(d.quantity as int) quantity, cast(d.BaseRef as int) BaseRef ");
        sb.append("from ODLN e ");
        sb.append("inner join DLN1 d ON d.DocEntry = e.DocEntry ");
        sb.append("where e.DocNum = '");
        sb.append(DocNum);
        sb.append("'");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando el detalle de la entrega #" + DocNum.toString(), e);
            return null;
        }
    }

    public Integer getDocNumDeliveryNote(Integer orderNumber, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select DISTINCT cast(d.DocEntry as int)as DocEntry ");
        sb.append("from DLN1 d where d.BaseRef =");
        sb.append(orderNumber);
        try {
            return (Integer) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando el numero de la entrega. ", e);
        }
        return 0;
    }

    public Integer getDocNumSalesOrder(Integer docNum, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select DISTINCT cast(d.BaseRef as int)as BaseRef ");
        sb.append("from   ODLN e ");
        sb.append("inner  join DLN1 d ON e.DocEntry = d.DocEntry where e.DocNum = ");
        sb.append(docNum);
        try {
            return (Integer) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar la orden para la factura #[" + docNum.toString() + "]. ", e);
        }
        return null;
    }

    public Integer getDocNumInvoice(Integer orderNumber, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select top 1 cast(f.DocNum as int)as DocNum ");
        sb.append("from  DLN1 d ");
        sb.append("inner join OINV f ON d.TrgetEntry = f.DocEntry ");
        sb.append("where d.BaseEntry = (select o.DocEntry from ORDR o where o.DocNum = ");
        sb.append(orderNumber);
        sb.append(")");
        try {
            return (Integer) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando la factura desde la entrega. ", e);
        }
        return null;
    }

    public List<Object[]> listRecords(Integer docNum, String companyName, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(companyName, testing, DB_TYPE);
        StringBuilder sb = new StringBuilder();

        sb.append("select cast(t.DocNum as int)as DocNum,cast(t.CardCode as varchar(20))as CardCode,cast(t.ItemCode as varchar(20))as ItemCode, ");
        sb.append(" t.Quantity,cast(u.AbsEntry as int)as BinAbs,t.BinCode,cast(t.Comments as varchar(254))as Comments,t.ValorDeclarado,cast(t.DocEntry as int)as DocEntry,cast(t.LineNum as int)as LineNum ");
        sb.append("from (select d.ItemCode,cast(d.Quantity as int)as Quantity,cast((select top 1 ubicacion.BinCode ");
        sb.append(" from  OIBQ saldo ");
        sb.append(" inner join OBIN ubicacion on ubicacion.absentry=saldo.binabs and ubicacion.SysBin='N' and ubicacion.Attr1Val IN ('PICKING','STORAGE') ");
        sb.append(" where saldo.OnHandQty>=d.Quantity and saldo.ItemCode=d.ItemCode and saldo.WhsCode='01' and saldo.OnHandQty>0 ");
        sb.append(" order by cast(ubicacion.attr2val as varchar(10)),cast(ubicacion.attr3val as int))as varchar(20))as BinCode,o.DocNum,o.CardCode,o.Comments, ");
        sb.append(" cast((o.DocTotal+o.DiscSum+o.WtSum)-o.VatSum-o.TotalExpns-o.RoundDif as numeric(18,2))as ValorDeclarado,o.DocEntry,d.LineNum ");
        sb.append(" from ORDR o ");
        sb.append(" inner join RDR1 d ON d.DocEntry=o.DocEntry and d.LineStatus='O' ");
        sb.append(" where o.DocStatus='O' and o.DocNum=");
        sb.append(docNum);
        sb.append(")as t ");
        sb.append("left join OBIN u ON u.BinCode=t.BinCode ");
        sb.append("order by u.attr2val,Attr3Val");
        try {
            return em.createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar la logica de picking ", e);
        }
        return new ArrayList<>();
    }
}