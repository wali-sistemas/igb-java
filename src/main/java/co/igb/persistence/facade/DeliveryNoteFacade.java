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
 * @author jguisao
 */
@Stateless
public class DeliveryNoteFacade {
    private static final Logger CONSOLE = Logger.getLogger(DeliveryNoteFacade.class.getSimpleName());
    private static final String DB_TYPE_HANA = Constants.DATABASE_TYPE_HANA;
    @EJB
    private PersistenceConf persistenceConf;

    public DeliveryNoteFacade() {
    }

    public List<Object[]> getDeliveryNoteData(Integer docNum, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(enc.\"DocEntry\" as int) docentry, cast(enc.\"DocNum\" as int) docnum, cast(enc.\"ObjType\" as int) objtype, ");
        sb.append(" cast(enc.\"CardCode\" as varchar(20)) cardcode, cast(enc.\"SlpCode\" as int) slpcode, cast(ifnull(enc.\"CntctCode\",0) as int) cntctcode, ");
        sb.append(" cast(det.\"LineNum\" as int) linenum, cast(det.\"ItemCode\" as varchar(20)) itemcode, cast(det.\"Quantity\" as int) quantity, ");
        sb.append(" cast(enc.\"U_VR_DECLARADO\" as numeric(18,2)) valorDeclarado, cast(enc.\"Comments\" as varchar(250)) comentario, ");
        sb.append(" cast(enc.\"DocTotal\"-enc.\"VatSum\" as numeric(18,2)) as valorNeto, cast(enc.\"VatSum\" as numeric(18,2)) as impuesto, ");
        sb.append(" cast(pay.\"ExtraDays\" as int) as days, ifnull(cast(t.\"U_PORC_FLE_CLIE\" as numeric(4,2)),0) as porcetajeFlete, ");
        sb.append(" round(cast(enc.\"U_VLR_FLE\" as numeric(18,4)),2)as flete,cast(det.\"WhsCode\" as varchar(2))as WhsCode,cast(det.\"TaxCode\" as varchar(10))as taxCode, ");
        sb.append(" cast(art.\"U_Marca\" as varchar(4))as marca, cast(case when det.\"WhsCode\" IN ('05','26') then enc.\"U_TRANSP\" else t.\"U_COD_TRA\" end as varchar(6))as codTransp, ");
        sb.append(" cast(enc.\"U_NUNFAC\" as int)as orden,round(cast(ifnull(f.\"LineTotal\",0) as numeric(18,4)),2)as lineTotalF,cast(f.\"TaxCode\" as varchar)as taxCodeF,cast(ifnull(f.\"LineNum\",0) as int)as \"LineNumF\",cast(f.\"ObjType\" as int)as ObjTypeF, ");
        sb.append(" cast(t.\"Code\" as varchar)as codCiudad,cast(t.\"U_CIUDAD\" as varchar)as nameCiudad,cast((select sum(d.\"Quantity\") from DLN1 d where d.\"DocEntry\"=det.\"DocEntry\")as int)as sumQty, ");
        sb.append(" cast(det.\"LineTotal\"-(det.\"LineTotal\"*(enc.\"DiscPrcnt\")/100)as numeric(18,2))as Total,cast(t.\"U_PRINCIPAL\" as varchar)as mainCity,cast(art.\"U_Grupo\" as varchar)as grupo ");
        sb.append("from ODLN enc ");
        sb.append("inner join DLN1 det on det.\"DocEntry\"=enc.\"DocEntry\" ");
        sb.append("left  join DLN3 f on det.\"DocEntry\"=f.\"DocEntry\" ");
        sb.append("inner join DLN12 ad on ad.\"DocEntry\"=enc.\"DocEntry\" ");
        sb.append("left  join \"@TRANSP_TAR\" t on t.\"Code\"=ad.\"BlockS\" ");
        sb.append("inner join OCTG pay on pay.\"GroupNum\"=enc.\"GroupNum\" ");
        sb.append("inner join OITM art on art.\"ItemCode\"=det.\"ItemCode\" ");
        sb.append("where enc.\"DocNum\"=");
        sb.append(docNum);
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los datos de la entrega. ", e);
            return new ArrayList<>();
        }
    }

    public List getDetailDeliveryNoteData(Integer DocNum, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(d.\"ItemCode\" as varchar(20)) itemcode, cast(d.\"Quantity\" as int) quantity, cast(d.\"BaseRef\" as int) BaseRef ");
        sb.append("from ODLN e ");
        sb.append("inner join DLN1 d ON d.\"DocEntry\"=e.\"DocEntry\" ");
        sb.append("where e.DocNum=");
        sb.append(DocNum);
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando el detalle de la entrega #" + DocNum.toString(), e);
            return null;
        }
    }

    public Integer getDocNumDeliveryNote(Integer orderNumber, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select distinct cast(e.\"DocNum\" as int)as DocNum ");
        sb.append("from ODLN e ");
        sb.append("inner join DLN1 d on e.\"DocEntry\"=d.\"DocEntry\" ");
        sb.append("where d.\"BaseRef\"='");
        sb.append(orderNumber);
        sb.append("'");
        try {
            return (Integer) persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando el numero de la entrega. ", e);
        }
        return 0;
    }

    public Integer getDocNumSalesOrder(Integer docNum, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select distinct cast(d.\"BaseRef\" as int)as BaseRef ");
        sb.append("from ODLN e ");
        sb.append("inner join DLN1 d on e.\"DocEntry\"=d.\"DocEntry\" where e.\"DocNum\"=");
        sb.append(docNum);
        sb.append(" limit 1");
        try {
            return (Integer) persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar la orden para la factura #[" + docNum.toString() + "]. ", e);
        }
        return null;
    }

    public Integer getDocNumInvoice(Integer orderNumber, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(f.\"DocNum\" as int)as DocNum ");
        sb.append("from DLN1 d ");
        sb.append("inner join OINV f on d.\"TrgetEntry\"=f.\"DocEntry\" ");
        sb.append("where d.\"BaseEntry\"=(select o.\"DocEntry\" from ORDR o where o.\"DocNum\"=");
        sb.append(orderNumber);
        sb.append(") limit 1");
        try {
            return (Integer) persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando la factura desde la entrega. ", e);
        }
        return null;
    }

    public List<Object[]> listRecords(Integer docNum, String whsCode, String companyName, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA);
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(t.\"DocNum\" as int)as DocNum,cast(t.\"CardCode\" as varchar(20))as CardCode,cast(t.\"ItemCode\" as varchar(20))as ItemCode, ");
        sb.append(" t.\"Quantity\",cast(u.\"AbsEntry\" as int)as BinAbs,t.\"BinCode\",cast(t.\"Comments\" as varchar(254))as Comments,t.\"ValorDeclarado\",cast(t.\"DocEntry\" as int)as DocEntry, ");
        sb.append(" cast(t.\"LineNum\" as int)as LineNum,cast(t.\"WhsCode\" as varchar(10))as WhsCode,ifnull(round(cast(t.\"LineTotal\" as numeric(18,4)),2),0)as lineTotal, ");
        sb.append(" ifnull(cast(t.\"TaxCode\" as varchar),'')as taxcode,cast(t.\"LineNumF\" as int)as LineNumF,cast(t.\"ObjType\" as int)as ObjType ");
        sb.append("from (select d.\"ItemCode\",cast(d.\"Quantity\" as int)as \"Quantity\", ");
        sb.append("      cast((select t.\"BinCode\" from (");
        sb.append("       select u.\"BinCode\", row_number() over(partition by d.\"ItemCode\" order by cast(u.\"Attr2Val\" as varchar(10)),cast(u.\"Attr3Val\" as int))as \"fila\" ");
        sb.append("       from  OIBQ s ");
        sb.append("       inner join OBIN u on u.\"AbsEntry\"=s.\"BinAbs\" and u.\"SysBin\"='N' and u.\"Attr1Val\" IN ('PICKING','STORAGE') ");
        sb.append("       where s.\"OnHandQty\">=d.\"Quantity\" and s.\"ItemCode\"=d.\"ItemCode\" and s.\"WhsCode\"='");
        sb.append(whsCode);
        sb.append("' and s.\"OnHandQty\">0)as t where t.\"fila\" = 1)as varchar(20))as \"BinCode\",o.\"DocNum\",o.\"CardCode\",o.\"Comments\", ");
        sb.append(" cast((o.\"DocTotal\"+o.\"DiscSum\"+o.\"WTSum\")-o.\"VatSum\"-o.\"TotalExpns\"-o.\"RoundDif\" as numeric(18,2))as \"ValorDeclarado\",o.\"DocEntry\",d.\"LineNum\",d.\"WhsCode\", ");
        sb.append(" f.\"LineTotal\",f.\"TaxCode\",f.\"LineNum\" as \"LineNumF\",f.\"ObjType\" ");
        sb.append(" from ORDR o ");
        sb.append(" inner join RDR1 d on d.\"DocEntry\"=o.\"DocEntry\" and d.\"LineStatus\"='O' ");
        sb.append(" left  join RDR3 f on d.\"DocEntry\"=f.\"DocEntry\" ");
        sb.append(" where o.\"DocStatus\"='O' and o.\"DocNum\"=");
        sb.append(docNum);
        sb.append(" and d.\"WhsCode\"='");
        sb.append(whsCode);
        sb.append("')as t ");
        sb.append("left join OBIN u on u.\"BinCode\"=t.\"BinCode\" ");
        sb.append("order by u.\"Attr2Val\",\"Attr3Val\"");
        try {
            return em.createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar la logica de picking ", e);
        }
        return new ArrayList<>();
    }

    public List<Object[]> listOpenDelivery(String whsCode, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select distinct cast(e.\"DocNum\" as varchar(10))as delivey, ");
        sb.append(" concat(concat('(',");
        sb.append(" (select STRING_AGG(\"numOrder\", ',') ");
        sb.append("  from ( ");
        sb.append("   select distinct cast(d.\"BaseRef\" as varchar(10))as \"numOrder\" ");
        sb.append("   from DLN1 d ");
        sb.append("   where d.\"DocEntry\"=e.\"DocEntry\" ");
        sb.append("  )as orders ");
        sb.append(" )),')')as orders,cast(concat(replace(replace(replace(replace(replace(e.\"CardName\",'/',''),'&',''),'Ñ','N'),'ª',''),'¥',''),'|')as varchar(250))as cardName ");
        sb.append("from ODLN e ");
        sb.append("inner join DLN1 d on e.\"DocEntry\"=d.\"DocEntry\" ");
        sb.append("where e.\"U_SEPARADOR\"='PEND-PICKING-LIST-EXPRESS' and d.\"WhsCode\" ");
        if (companyName.contains("VARROC")) {
            sb.append("=");
            sb.append(whsCode);
        } else {
            sb.append("in (01,30) ");
        }
        sb.append(" and year(e.\"DocDate\")=year(current_date) and month(e.\"DocDate\")=month(current_date) ");
        sb.append("order by 1 asc");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error listando las entregas abiertas para la empresa " + companyName, e);
        }
        return new ArrayList<>();
    }

    public void updateUserFieldSeparador(String docNum, String separador, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("update ODLN set \"U_SEPARADOR\"='");
        sb.append(separador);
        sb.append("' where \"DocNum\"=");
        sb.append(docNum);
        try {
            persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).executeUpdate();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error actualizando el campo de usuario [U_SEPARADOR] en " + companyName, e);
        }
    }
}