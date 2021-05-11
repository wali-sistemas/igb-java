package co.igb.persistence.facade;

import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
public class PaymentsReceivedFacade {
    private static final Logger CONSOLE = Logger.getLogger(PaymentsReceivedFacade.class.getSimpleName());
    private static final String DB_TYPE_HANA = Constants.DATABASE_TYPE_HANA;
    @EJB
    private PersistenceConf persistenceConf;

    public PaymentsReceivedFacade() {
    }

    public List<Object[]> getCollectMonthly(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select z.\"IdMes\",z.\"Mes\",sum(z.\"Sin vencer\")as \"Sin vencer\",sum(z.\"0 a 20\")as \"0 a 20\", ");
        sb.append(" sum(z.\"21 a 55\")as \"21 a 55\",sum(z.\"56 a 120\")as \"56 a 120\",sum(\"121 a 360\")as \"121 a 360\",sum(\"Mayor de 360\")as \"Mayor de 360\" ");
        sb.append("from (");
        sb.append("  select y.\"IdMes\", y.\"Mes\", ");
        sb.append("   case when y.\"DiasAtraso\"='1. Sin vencer' then sum(y.\"Valor\") else 0 end as \"Sin vencer\", ");
        sb.append("   case when y.\"DiasAtraso\"='2. 0 a 20' then sum(y.\"Valor\") else 0 end as \"0 a 20\", ");
        sb.append("   case when y.\"DiasAtraso\"='3. 21 a 55' then sum(y.\"Valor\") else 0 end as \"21 a 55\", ");
        sb.append("   case when y.\"DiasAtraso\"='4. 56 a 120' then sum(y.\"Valor\") else 0 end as \"56 a 120\", ");
        sb.append("   case when y.\"DiasAtraso\"='5. 121 a 360' then sum(y.\"Valor\") else 0 end as \"121 a 360\", ");
        sb.append("   case when y.\"DiasAtraso\"='6. Mayor de 360' then sum(y.\"Valor\") else 0 end as \"Mayor de 360\" ");
        sb.append("  from ( ");
        sb.append("    select cast(t.\"diasAtraso\" as varchar(1000)) as \"DiasAtraso\",SUM(cast(t.\"Valor\" as numeric(18,0))) as \"Valor\", ");
        sb.append("     month(t.\"fechaRecibo\") as \"IdMes\", cast(v.\"U_MonthName\" as varchar(20)) as \"Mes\" ");
        sb.append("    from ( ");
        sb.append("     select distinct case when (DAYS_BETWEEN(f.\"DocDueDate\",r.\"DocDate\")) < 0 then '1. Sin vencer' ");
        sb.append("      when (DAYS_BETWEEN(f.\"DocDueDate\",r.\"DocDate\")) >= 0 and (DAYS_BETWEEN(f.\"DocDueDate\",r.\"DocDate\")) <= 20 then '2. 0 a 20' ");
        sb.append("      when (DAYS_BETWEEN(f.\"DocDueDate\",r.\"DocDate\")) >= 21 and (DAYS_BETWEEN(f.\"DocDueDate\",r.\"DocDate\")) <= 55 then '3. 21 a 55' ");
        sb.append("      when (DAYS_BETWEEN(f.\"DocDueDate\",r.\"DocDate\")) >= 56 and (DAYS_BETWEEN(f.\"DocDueDate\",r.\"DocDate\")) <= 120 then '4. 56 a 120' ");
        sb.append("      when (DAYS_BETWEEN(f.\"DocDueDate\",r.\"DocDate\")) >= 121 and (DAYS_BETWEEN(f.\"DocDueDate\",r.\"DocDate\")) <= 360 then '5. 121 a 360' ");
        sb.append("      when (DAYS_BETWEEN(f.\"DocDueDate\",r.\"DocDate\")) > 361 then '6. Mayor de 360' else 'Sin vencer' end as \"diasAtraso\", ");
        sb.append("      cast(d.\"AppliedSys\" as int) as \"Valor\",cast(r.\"DocDate\" as date) as \"fechaRecibo\" ");
        sb.append("     from ORCT r ");
        sb.append("     inner join RCT2 d on r.\"DocEntry\" = d.\"DocNum\" ");
        sb.append("     inner join OJDT j on r.\"TransId\" = j.\"TransId\" ");
        sb.append("     inner join JDT1 t on j.\"TransId\" = t.\"TransId\" ");
        sb.append("     inner join OCRD s on s.\"CardCode\" = r.\"CardCode\" ");
        sb.append("     inner join OSLP v on v.\"SlpCode\" = s.\"SlpCode\" ");
        sb.append("     inner join OINV f on f.\"DocEntry\" = d.\"DocEntry\" ");
        sb.append("     where year(r.\"DocDate\") = year(current_date) and t.\"Account\">='11050505' and t.\"Account\"<='11250530' and d.\"InvType\"=13 ");
        sb.append("    union all ");
        sb.append("     select distinct case when (DAYS_BETWEEN(n.\"DocDueDate\",r.\"DocDate\")) < 0 then '1. Sin vencer' ");
        sb.append("      when (DAYS_BETWEEN(n.\"DocDueDate\",r.\"DocDate\")) >= 0 and (DAYS_BETWEEN(n.\"DocDueDate\",r.\"DocDate\")) <= 20 then '2. 0 a 20' ");
        sb.append("      when (DAYS_BETWEEN(n.\"DocDueDate\",r.\"DocDate\")) >= 21 and (DAYS_BETWEEN(n.\"DocDueDate\",r.\"DocDate\")) <= 55 then '3. 21 a 55' ");
        sb.append("      when (DAYS_BETWEEN(n.\"DocDueDate\",r.\"DocDate\")) >= 56 and (DAYS_BETWEEN(n.\"DocDueDate\",r.\"DocDate\")) <= 120 then '4. 56 a 120' ");
        sb.append("      when (DAYS_BETWEEN(n.\"DocDueDate\",r.\"DocDate\")) >= 121 and (DAYS_BETWEEN(n.\"DocDueDate\",r.\"DocDate\")) <= 360 then '5. 121 a 360' ");
        sb.append("      when (DAYS_BETWEEN(n.\"DocDueDate\",r.\"DocDate\")) > 361 then '6. Mayor de 360' else 'Sin vencer' end as \"diasAtraso\", ");
        sb.append("      cast(d.\"AppliedSys\" as int) as \"Valor\",cast(r.\"DocDate\" as date) as \"fechaRecibo\" ");
        sb.append("     from ORCT r ");
        sb.append("     inner join RCT2 d on r.\"DocEntry\" = d.\"DocNum\" ");
        sb.append("     inner join OJDT j on r.\"TransId\" = j.\"TransId\" ");
        sb.append("     inner join JDT1 t on j.\"TransId\" = t.\"TransId\" ");
        sb.append("     inner join OCRD s on s.\"CardCode\" = r.\"CardCode\" ");
        sb.append("     inner join OSLP v on v.\"SlpCode\" = s.\"SlpCode\" ");
        sb.append("     inner join ORIN n on n.\"DocEntry\" = d.\"DocEntry\" ");
        sb.append("     where year(r.\"DocDate\") = year(current_date) and t.\"Account\">='11050505' and t.\"Account\"<='11250530' and r.\"Canceled\"='N' and d.\"InvType\"=14 ");
        sb.append("    union all ");
        sb.append("     select distinct case when (DAYS_BETWEEN(f.\"TaxDate\",r.\"DocDate\")) < 0 then '1. Sin vencer' ");
        sb.append("      when (DAYS_BETWEEN(f.\"TaxDate\",r.\"DocDate\")) >= 0 and (DAYS_BETWEEN(f.\"TaxDate\",r.\"DocDate\")) <= 20 then '2. 0 a 20' ");
        sb.append("      when (DAYS_BETWEEN(f.\"TaxDate\",r.\"DocDate\")) >= 21 and (DAYS_BETWEEN(f.\"TaxDate\",r.\"DocDate\")) <= 55 then '3. 21 a 55' ");
        sb.append("      when (DAYS_BETWEEN(f.\"TaxDate\",r.\"DocDate\")) >= 56 and (DAYS_BETWEEN(f.\"TaxDate\",r.\"DocDate\")) <= 120 then '4. 56 a 120' ");
        sb.append("      when (DAYS_BETWEEN(f.\"TaxDate\",r.\"DocDate\")) >= 121 and (DAYS_BETWEEN(f.\"TaxDate\",r.\"DocDate\")) <= 360 then '5. 121 a 360' ");
        sb.append("      when (DAYS_BETWEEN(f.\"TaxDate\",r.\"DocDate\")) > 361 then '6. Mayor de 360' else 'Sin vencer' end as \"diasAtraso\", ");
        sb.append("      cast(d.\"AppliedSys\" as int) as \"Valor\", cast(r.\"DocDate\" as date) as \"fechaRecibo\" ");
        sb.append("     from ORCT r ");
        sb.append("     inner join OJDT j on r.\"TransId\" = j.\"TransId\" ");
        sb.append("     inner join JDT1 t on t.\"TransId\" = j.\"TransId\" ");
        sb.append("     inner join OCRD s on s.\"CardCode\" = r.\"CardCode\" ");
        sb.append("     inner join OSLP v on v.\"SlpCode\" = s.\"SlpCode\" ");
        sb.append("     inner join RCT2 d on r.\"DocEntry\" = d.\"DocNum\" ");
        sb.append("     inner join OJDT f ON f.\"TransId\" = d.\"DocTransId\" ");
        sb.append("     where year(r.\"DocDate\")=year(current_date) and d.\"InvType\" IN ('24','30') and t.\"DebCred\"='C' and r.\"Canceled\"='N' ");
        sb.append("   )as t ");
        sb.append("  inner join \"@SPT_VALUES\" v on v.\"U_Value\" = month(t.\"fechaRecibo\") ");
        sb.append("  group by t.\"diasAtraso\",t.\"fechaRecibo\",v.\"U_MonthName\" ");
        sb.append(" )as y ");
        sb.append(" group by y.\"IdMes\",y.\"Mes\",y.\"DiasAtraso\" ");
        sb.append(")as z ");
        sb.append("group by z.\"IdMes\",z.\"Mes\" ");
        sb.append("order by z.\"IdMes\" asc");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando el recaudo para la empresa [");
        }
        return null;
    }

    public List<Object[]> getByCollect(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(t.diasvencimiento as varchar(1000)) as DiasVencimiento, sum(cast((t.ValorFV-t.ValorNC-t.ValorRC) as numeric(18,0))) as Valor ");
        sb.append("from (select case when (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) < 0 then '1. Sin vencer' ");
        sb.append("  when (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) >= 0 and (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) <= 20 then '2. 0 a 20' ");
        sb.append("  when (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) >= 21 and (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) <= 55 then '3. 21 a 55' ");
        sb.append("  when (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) >= 56 and (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) <= 120 then '4. 56 a 120' ");
        sb.append("  when (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) >= 121 and (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) <= 360 then '5. 121 a 360' ");
        sb.append("  when (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) > 361 then '6. Mayor de 360' ");
        sb.append("  else '1. Sin vencer' end as diasvencimiento,cast(fac.\"DocTotal\" as numeric(18,0)) - cast(fac.\"PaidToDate\" as numeric(18,0)) as ValorFV,0 as ValorNC,0 as ValorRC ");
        sb.append(" from OINV fac ");
        sb.append(" where fac.\"DocStatus\" = 'O' and fac.\"DocNum\" <> 339765 ");//TODO: FV excluida
        sb.append("UNION ALL ");
        sb.append(" select case when (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) < 0 then '1. Sin vencer' ");
        sb.append("  when (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) >= 0 and (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) <= 20 then '2. 0 a 20' ");
        sb.append("  when (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) >= 21 and (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) <= 55 then '3. 21 a 55' ");
        sb.append("  when (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) >= 56 and (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) <= 120 then '4. 56 a 120' ");
        sb.append("  when (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) >= 121 and (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) <= 360 then '5. 121 a 360' ");
        sb.append("  when (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) > 361 then '6. Mayor de 360' ");
        sb.append("  else '1. Sin vencer' end as diasvencimiento,0 as ValorFV,(cast(nc.\"DocTotal\" as numeric(18,0))- (cast(nc.\"PaidToDate\" as numeric(18,0)))) as ValorNC,0 as ValorRC ");
        sb.append(" from ORIN nc ");
        sb.append("UNION ALL ");
        sb.append(" select distinct case when (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) < 0 then '1. Sin vencer' ");
        sb.append("  when (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) >= 0 and (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) <= 20 then '2. 0 a 20' ");
        sb.append("  when (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) >= 21 and (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) <= 55 then '3. 21 a 55' ");
        sb.append("  when (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) >= 56 and (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) <= 120 then '4. 56 a 120' ");
        sb.append("  when (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) >= 121 and (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) <= 360 then '5. 121 a 360' ");
        sb.append("  when (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) > 361 then '6. Mayor de 360' ");
        sb.append("  else '1. Sin vencer' end as diasvercimiento,0 as ValorFV,0 as ValorNC,(cast(rc.\"OpenBal\" as numeric(18,0))) as ValorRC ");
        sb.append(" from ORCT rc ");
        sb.append(" inner join OJDT oj ON rc.\"TransId\" = oj.\"TransId\" ");
        sb.append(" inner join JDT1 jt ON jt.\"TransId\" = jt.\"TransId\" ");
        sb.append(" inner join OCRD sn on sn.\"CardCode\" = rc.\"CardCode\" ");
        sb.append(" where jt.\"Account\" >='11050505' and jt.\"Account\" <='13050510' and rc.\"PayNoDoc\" = 'Y' and rc.\"Canceled\" = 'N' and rc.\"OpenBal\" <> 0 and rc.\"DocNum\" <> 64266 ");//TODO: RC excluida
        sb.append(") as t ");
        sb.append("group by t.diasvencimiento order by t.diasvencimiento");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando la cartera por cobrar para la empresa [" + companyName + "]");
        }
        return null;
    }
}