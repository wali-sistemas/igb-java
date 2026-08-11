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
        sb.append(" cast(det.\"LineTotal\"-(det.\"LineTotal\"*(enc.\"DiscPrcnt\")/100)as numeric(18,2))as Total,cast(t.\"U_PRINCIPAL\" as varchar)as mainCity,cast(art.\"U_Grupo\" as varchar)as grupo, ");
        sb.append(" ifnull(cast((select sum(\"DocTotal\"-\"VatSum\") from ORDR o where o.\"DocStatus\"='O' and o.\"CardCode\"=enc.\"CardCode\" and o.\"DocDate\" between ADD_DAYS(current_date,-2) and ADD_DAYS(current_date,0))as numeric(18,2)),cast(enc.\"DocTotal\"-enc.\"VatSum\" as numeric(18,2)))as sumOrdPromo ");
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
        sb.append("where e.\"DocNum\"=");
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
        return 0;
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
        return 0;
    }

    public List<Object[]> listRecords(Integer docNum, String whsCode, String companyName, boolean testing) {
        EntityManager em = persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA);
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(o.\"DocNum\" as int)as \"DocNum\",cast(o.\"CardCode\" as varchar(20))as \"CardCode\",cast(d.\"ItemCode\" as varchar(20))as \"ItemCode\", ");
        sb.append(" cast(case when s.\"OnHandQty\">=d.\"Quantity\" then d.\"Quantity\" ");
        sb.append("  when s.\"OnHandQty\"<=(d.\"Quantity\"-ifnull((select sum(s4.\"OnHandQty\") ");
        sb.append("   from OIBQ s4 ");
        sb.append("   inner join OBIN u4 on u4.\"AbsEntry\"=s4.\"BinAbs\" and u4.\"WhsCode\"=s4.\"WhsCode\" and u4.\"SysBin\"='N' and u4.\"Attr1Val\" IN ('PICKING','STORAGE') ");
        sb.append("   where s4.\"ItemCode\"=d.\"ItemCode\" and s4.\"WhsCode\"=d.\"WhsCode\" and s4.\"OnHandQty\">0 and ");
        sb.append("    (cast(u4.\"Attr2Val\" as varchar(10))<cast(u.\"Attr2Val\" as varchar(10)) or ");
        sb.append("    (cast(u4.\"Attr2Val\" as varchar(10))=cast(u.\"Attr2Val\" as varchar(10)) and cast(u4.\"Attr3Val\" as int)<cast(u.\"Attr3Val\" as int)) or ");
        sb.append("    (cast(u4.\"Attr2Val\" as varchar(10))=cast(u.\"Attr2Val\" as varchar(10)) and cast(u4.\"Attr3Val\" as int)=cast(u.\"Attr3Val\" as int) and u4.\"BinCode\"<u.\"BinCode\") or ");
        sb.append("    (cast(u4.\"Attr2Val\" as varchar(10))=cast(u.\"Attr2Val\" as varchar(10)) and cast(u4.\"Attr3Val\" as int)=cast(u.\"Attr3Val\" as int) and u4.\"BinCode\"=u.\"BinCode\" and u4.\"AbsEntry\"<u.\"AbsEntry\"))),0) ");
        sb.append("  ) then s.\"OnHandQty\" ");
        sb.append("  else (d.\"Quantity\"-ifnull((select sum(s5.\"OnHandQty\") ");
        sb.append("   from OIBQ s5 ");
        sb.append("   inner join OBIN u5 on u5.\"AbsEntry\"=s5.\"BinAbs\" and u5.\"WhsCode\"=s5.\"WhsCode\" and u5.\"SysBin\"='N' and u5.\"Attr1Val\" IN ('PICKING','STORAGE') ");
        sb.append("   where s5.\"ItemCode\"=d.\"ItemCode\" and s5.\"WhsCode\"=d.\"WhsCode\" and s5.\"OnHandQty\">0 and ");
        sb.append("    (cast(u5.\"Attr2Val\" as varchar(10))<cast(u.\"Attr2Val\" as varchar(10)) or ");
        sb.append("    (cast(u5.\"Attr2Val\" as varchar(10))=cast(u.\"Attr2Val\" as varchar(10)) and cast(u5.\"Attr3Val\" as int)<cast(u.\"Attr3Val\" as int)) or ");
        sb.append("    (cast(u5.\"Attr2Val\" as varchar(10))=cast(u.\"Attr2Val\" as varchar(10)) and cast(u5.\"Attr3Val\" as int)=cast(u.\"Attr3Val\" as int) and u5.\"BinCode\"<u.\"BinCode\") or ");
        sb.append("    (cast(u5.\"Attr2Val\" as varchar(10))=cast(u.\"Attr2Val\" as varchar(10)) and cast(u5.\"Attr3Val\" as int)=cast(u.\"Attr3Val\" as int) and u5.\"BinCode\"=u.\"BinCode\" and u5.\"AbsEntry\"<u.\"AbsEntry\"))),0) ");
        sb.append("  ) end as int)as \"Quantity\", ");
        sb.append(" cast(u.\"AbsEntry\" as int)as \"BinAbs\",cast(u.\"BinCode\" as varchar(20))as \"BinCode\",cast(o.\"Comments\" as varchar(254))as \"Comments\", ");
        sb.append(" cast((o.\"DocTotal\"+o.\"DiscSum\"+o.\"WTSum\")-o.\"VatSum\"-o.\"TotalExpns\"-o.\"RoundDif\" as numeric(18,2))as \"ValorDeclarado\",cast(o.\"DocEntry\" as int)as \"DocEntry\", ");
        sb.append(" cast(d.\"LineNum\" as int)as \"LineNum\",cast(d.\"WhsCode\" as varchar(10))as \"WhsCode\",ifnull(round(cast(f.\"LineTotal\" as numeric(18,4)),2),0)as \"lineTotal\",ifnull(cast(f.\"TaxCode\" as varchar),'')as \"taxcode\", ");
        sb.append(" cast(f.\"LineNum\" as int)as \"LineNumF\",cast(f.\"ObjType\" as int)as \"ObjType\",cast(d.\"TaxOnly\" as varchar(1))as \"TaxOnly\" ");
        sb.append("from ORDR o ");
        sb.append("inner join RDR1 d on d.\"DocEntry\"=o.\"DocEntry\" and d.\"LineStatus\"='O' ");
        sb.append("inner join OIBQ s on s.\"ItemCode\"=d.\"ItemCode\" and s.\"WhsCode\"=d.\"WhsCode\" and s.\"OnHandQty\">0 ");
        sb.append("inner join OBIN u on u.\"AbsEntry\"=s.\"BinAbs\" and u.\"WhsCode\"=s.\"WhsCode\" and u.\"SysBin\"='N' and u.\"Attr1Val\" in ('PICKING','STORAGE') ");
        sb.append("left join RDR3 f on f.\"DocEntry\"=d.\"DocEntry\" ");
        sb.append("where o.\"DocStatus\"='O' and o.\"DocNum\"=");
        sb.append(docNum);
        sb.append(" and d.\"WhsCode\"='");
        sb.append(whsCode);
        sb.append("' and ((s.\"OnHandQty\">=d.\"Quantity\" and ");
        sb.append(" not exists(select 1 ");
        sb.append("  from OIBQ s1 ");
        sb.append("  inner join OBIN u1 on u1.\"AbsEntry\"=s1.\"BinAbs\" and u1.\"WhsCode\"=s1.\"WhsCode\" and u1.\"SysBin\"='N' and u1.\"Attr1Val\" in ('PICKING','STORAGE') ");
        sb.append("  where s1.\"ItemCode\"=d.\"ItemCode\" and s1.\"WhsCode\"=d.\"WhsCode\" and s1.\"OnHandQty\">0 and s1.\"OnHandQty\">=d.\"Quantity\" and ");
        sb.append("   (cast(u1.\"Attr2Val\" as varchar(10))<cast(u.\"Attr2Val\" as varchar(10)) or ");
        sb.append("   (cast(u1.\"Attr2Val\" as varchar(10))=cast(u.\"Attr2Val\" as varchar(10)) and cast(u1.\"Attr3Val\" as int)<cast(u.\"Attr3Val\" as int)) or ");
        sb.append("   (cast(u1.\"Attr2Val\" as varchar(10))=cast(u.\"Attr2Val\" as varchar(10)) and cast(u1.\"Attr3Val\" as int)=cast(u.\"Attr3Val\" as int) and u1.\"BinCode\"<u.\"BinCode\") or ");
        sb.append("   (cast(u1.\"Attr2Val\" as varchar(10))=cast(u.\"Attr2Val\" as varchar(10)) and cast(u1.\"Attr3Val\" as int)=cast(u.\"Attr3Val\" as int) and u1.\"BinCode\"=u.\"BinCode\" and u1.\"AbsEntry\"<u.\"AbsEntry\")) ");
        sb.append("  )) or ( ");
        sb.append(" not exists(select 1");
        sb.append("  from OIBQ s2 ");
        sb.append("  inner join OBIN u2 on u2.\"AbsEntry\"=s2.\"BinAbs\" and u2.\"WhsCode\"=s2.\"WhsCode\" and u2.\"SysBin\"='N' and u2.\"Attr1Val\" in ('PICKING','STORAGE') ");
        sb.append("  where s2.\"ItemCode\"=d.\"ItemCode\" and s2.\"WhsCode\"=d.\"WhsCode\" and s2.\"OnHandQty\">0 and s2.\"OnHandQty\">=d.\"Quantity\") and ");
        sb.append("   ifnull((select sum(s3.\"OnHandQty\")");
        sb.append("    from OIBQ s3 ");
        sb.append("    inner join OBIN u3 on u3.\"AbsEntry\"=s3.\"BinAbs\" and u3.\"WhsCode\"=s3.\"WhsCode\" and u3.\"SysBin\"='N' and u3.\"Attr1Val\" in ('PICKING','STORAGE') ");
        sb.append("    where s3.\"ItemCode\"=d.\"ItemCode\" and s3.\"WhsCode\"=d.\"WhsCode\" and s3.\"OnHandQty\">0 and ");
        sb.append("     (cast(u3.\"Attr2Val\" as varchar(10))<cast(u.\"Attr2Val\" as varchar(10)) or ");
        sb.append("     (cast(u3.\"Attr2Val\" as varchar(10))=cast(u.\"Attr2Val\" as varchar(10)) and cast(u3.\"Attr3Val\" as int)<cast(u.\"Attr3Val\" as int)) or ");
        sb.append("     (cast(u3.\"Attr2Val\" as varchar(10))=cast(u.\"Attr2Val\" as varchar(10)) and cast(u3.\"Attr3Val\" as int)=cast(u.\"Attr3Val\" as int) and u3.\"BinCode\"<u.\"BinCode\") or ");
        sb.append("     (cast(u3.\"Attr2Val\" as varchar(10))=cast(u.\"Attr2Val\" as varchar(10)) and cast(u3.\"Attr3Val\" as int)=cast(u.\"Attr3Val\" as int) and u3.\"BinCode\"=u.\"BinCode\" and u3.\"AbsEntry\"<u.\"AbsEntry\"))),0)<d.\"Quantity\" ");
        sb.append("   )");
        sb.append("  )");
        sb.append("order by d.\"LineNum\",cast(u.\"Attr2Val\" as varchar(10)),cast(u.\"Attr3Val\" as int),u.\"BinCode\" ");
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