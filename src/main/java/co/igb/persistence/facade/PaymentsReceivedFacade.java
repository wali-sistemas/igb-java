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
        sb.append(" select y.\"IdMes\", y.\"Mes\", ");
        sb.append("  case when y.\"DiasAtraso\"='Sin vencer' then sum(y.\"Valor\") else 0 end as \"Sin vencer\", ");
        sb.append("  case when y.\"DiasAtraso\"='0 a 20' then sum(y.\"Valor\") else 0 end as \"0 a 20\", ");
        sb.append("  case when y.\"DiasAtraso\"='21 a 55' then sum(y.\"Valor\") else 0 end as \"21 a 55\", ");
        sb.append("  case when y.\"DiasAtraso\"='56 a 120' then sum(y.\"Valor\") else 0 end as \"56 a 120\", ");
        sb.append("  case when y.\"DiasAtraso\"='121 a 360' then sum(y.\"Valor\") else 0 end as \"121 a 360\", ");
        sb.append("  case when y.\"DiasAtraso\"='Mayor de 360' then sum(y.\"Valor\") else 0 end as \"Mayor de 360\" ");
        sb.append(" from(");
        sb.append("   select cast(t.\"diasAtraso\" as varchar(1000)) as \"DiasAtraso\", SUM(cast(t.\"Valor\" as numeric(18,0))) as \"Valor\", ");
        sb.append("    month(t.\"fechaRecibo\") as \"IdMes\", cast(v.\"U_MonthName\" as varchar(20)) as \"Mes\" ");
        sb.append("   from (");
        sb.append("    select case when (DAYS_BETWEEN(r.\"DocDate\",f.\"DocDueDate\"))<0 then 'Sin vencer' ");
        sb.append("     when ((DAYS_BETWEEN(r.\"DocDate\",f.\"DocDueDate\"))>0 and (DAYS_BETWEEN(r.\"DocDate\",f.\"DocDueDate\"))<=20) then '0 a 20' ");
        sb.append("     when ((DAYS_BETWEEN(r.\"DocDate\",f.\"DocDueDate\"))>=21 and (DAYS_BETWEEN(r.\"DocDate\",f.\"DocDueDate\"))<=55) then '21 a 55' ");
        sb.append("     when ((DAYS_BETWEEN(r.\"DocDate\",f.\"DocDueDate\"))>=56 and (DAYS_BETWEEN(r.\"DocDate\",f.\"DocDueDate\"))<=120) then '56 a 120' ");
        sb.append("     when ((DAYS_BETWEEN(r.\"DocDate\",f.\"DocDueDate\"))>=121 and (DAYS_BETWEEN(r.\"DocDate\",f.\"DocDueDate\"))<=360) then '121 a 360'");
        sb.append("     when (DAYS_BETWEEN(r.\"DocDate\",f.\"DocDueDate\"))>361 then 'Mayor de 360' ELSE 'Sin vencer' end as \"diasAtraso\", ");
        sb.append("    cast(d.\"AppliedSys\" as int) as \"Valor\",cast(r.\"DocDate\" as date) as \"fechaRecibo\" ");
        sb.append("   from ORCT r ");
        sb.append("   inner join RCT2 d on r.\"DocEntry\" = d.\"DocNum\" ");
        sb.append("   inner join OJDT j on r.\"TransId\" = j.\"TransId\" ");
        sb.append("   inner join JDT1 t on j.\"TransId\" = t.\"TransId\" ");
        sb.append("   inner join OINV f on f.\"DocEntry\" = d.\"DocEntry\" ");
        sb.append("   where year(r.\"DocDate\") = year(current_date) and r.\"DocDate\" between ADD_MONTHS(TO_DATE(current_date,'YYYY-MM-DD'),-10) ");
        sb.append("    and current_date and t.\"Account\">='11050505' and t.\"Account\"<='11250520' and r.\"Canceled\"='N' and (DAYS_BETWEEN(r.\"DocDate\",f.\"DocDueDate\"))<'700' ");
        sb.append("  union all ");
        sb.append("   select case when (DAYS_BETWEEN(r.\"DocDate\",n.\"DocDueDate\"))<0 then 'Sin vencer' ");
        sb.append("    when ((DAYS_BETWEEN(r.\"DocDate\",n.\"DocDueDate\"))>0 and (DAYS_BETWEEN(r.\"DocDate\",n.\"DocDueDate\"))<=20) then '0 a 20' ");
        sb.append("    when ((DAYS_BETWEEN(r.\"DocDate\",n.\"DocDueDate\"))>=21 and (DAYS_BETWEEN(r.\"DocDate\",n.\"DocDueDate\"))<=55) then '21 a 55' ");
        sb.append("    when ((DAYS_BETWEEN(r.\"DocDate\",n.\"DocDueDate\"))>=56 and (DAYS_BETWEEN(r.\"DocDate\",n.\"DocDueDate\"))<=120) then '56 a 120' ");
        sb.append("    when ((DAYS_BETWEEN(r.\"DocDate\",n.\"DocDueDate\"))>=121 and (DAYS_BETWEEN(r.\"DocDate\",n.\"DocDueDate\"))<=360) then '121 a 360' ");
        sb.append("    when (DAYS_BETWEEN(r.\"DocDate\",n.\"DocDueDate\"))>361 then 'Mayor de 360' ELSE 'Sin vencer' end as \"diasAtraso\", ");
        sb.append("   cast(d.\"AppliedSys\" as int) as \"Valor\",cast(r.\"DocDate\" as date) as \"fechaRecibo\" ");
        sb.append("   from ORCT r ");
        sb.append("   inner join RCT2 d on r.\"DocEntry\" = d.\"DocNum\" ");
        sb.append("   inner join OJDT j on r.\"TransId\" = j.\"TransId\" ");
        sb.append("   inner join JDT1 t on j.\"TransId\" = t.\"TransId\" ");
        sb.append("   inner join ORIN n on n.\"DocEntry\" = d.\"DocEntry\" ");
        sb.append("   where year(r.\"DocDate\") = year(current_date) and r.\"DocDate\" between ADD_MONTHS(TO_DATE(current_date,'YYYY-MM-DD'),-10) ");
        sb.append("    and current_date and t.\"Account\">='11050505' and t.\"Account\"<='11250520' and r.\"Canceled\"='N' ");
        sb.append("  union all ");
        sb.append("   select 'Sin vencer' as \"diasAtraso\",r.\"NoDocSum\" as \"Valor\",cast(r.\"DocDate\" as date) as \"fechaRecibo\" ");
        sb.append("   from ORCT r ");
        sb.append("   inner join OJDT j on r.\"TransId\" = j.\"TransId\" ");
        sb.append("   inner join JDT1 t on j.\"TransId\" = t.\"TransId\" ");
        sb.append("   where year(r.\"DocDate\")=year(current_date) and r.\"DocDate\" between ADD_MONTHS(TO_DATE(current_date,'YYYY-MM-DD'),-10) ");
        sb.append("    and current_date and t.\"Account\">='11050505' and t.\"Account\"<='11250520' and r.\"PayNoDoc\"='Y' and r.\"Canceled\"='N' ");
        sb.append("  union all");
        sb.append("   select case when (DAYS_BETWEEN(r.\"DocDate\",j.\"TaxDate\")) < 0 then 'Sin vencer' ");
        sb.append("    when ((DAYS_BETWEEN(r.\"DocDate\",j.\"TaxDate\"))>0 and (DAYS_BETWEEN(r.\"DocDate\",j.\"TaxDate\"))<=20) then '0 a 20' ");
        sb.append("    when ((DAYS_BETWEEN(r.\"DocDate\",j.\"TaxDate\"))>=21 and (DAYS_BETWEEN(r.\"DocDate\",j.\"TaxDate\"))<=55) then '21 a 55' ");
        sb.append("    when ((DAYS_BETWEEN(r.\"DocDate\",j.\"TaxDate\"))>=56 and (DAYS_BETWEEN(r.\"DocDate\",j.\"TaxDate\"))<=120) then '56 a 120' ");
        sb.append("    when ((DAYS_BETWEEN(r.\"DocDate\",j.\"TaxDate\"))>=121 and (DAYS_BETWEEN(r.\"DocDate\",j.\"TaxDate\"))<=360) then '121 a 360' ");
        sb.append("    when (DAYS_BETWEEN(r.\"DocDate\",j.\"TaxDate\"))>361 then 'Mayor de 360' ELSE 'Sin vencer' end as \"diasAtraso\", ");
        sb.append("   cast(d.\"AppliedSys\" as int) as \"Valor\", cast(r.\"DocDate\" as date) as \"fechaRecibo\" ");
        sb.append("   from ORCT r ");
        sb.append("   inner join RCT2 d on r.\"DocEntry\" = d.\"DocNum\" ");
        sb.append("   inner join OJDT j on r.\"TransId\" = j.\"TransId\" ");
        sb.append("   inner join JDT1 t on t.\"TransId\" = j.\"TransId\" ");
        sb.append("   inner join OJDT f ON f.\"TransId\" = d.\"DocTransId\" ");
        sb.append("   where year(r.\"DocDate\")=year(current_date) and r.\"DocDate\" between ADD_MONTHS(TO_DATE(current_date,'YYYY-MM-DD'),-10) ");
        sb.append("    and current_date and d.\"InvType\" IN ('24','30') and t.\"DebCred\"='C' and r.\"Canceled\"='N' ");
        sb.append("  ) as t");
        sb.append("  inner join \"@SPT_VALUES\" v on v.\"U_Value\" = month(t.\"fechaRecibo\") ");
        sb.append("  group by t.\"diasAtraso\",t.\"fechaRecibo\",v.\"U_MonthName\" ");
        sb.append(" )as y ");
        sb.append(" group by y.\"IdMes\",y.\"Mes\",y.\"DiasAtraso\" ");
        sb.append(")as z ");
        sb.append("group by z.\"IdMes\",z.\"Mes\"");
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
        sb.append("select cast(t.diasvencimiento as varchar(1000)) as DiasVencimiento, sum(cast(t.Valor as numeric(18,0))) as Valor ");
        sb.append("from (select case when (DAYS_BETWEEN(fac.\"DocDueDate\",current_date))*-1 < 0 then '1. Sin vencer' ");
        sb.append("when (DAYS_BETWEEN(fac.\"DocDueDate\",current_date))*-1 > 0 and (DAYS_BETWEEN(fac.\"DocDueDate\",current_date))*-1 <= 20 then '2. 0 a 20' ");
        sb.append("when (DAYS_BETWEEN(fac.\"DocDueDate\",current_date))*-1 >= 21 and (DAYS_BETWEEN(fac.\"DocDueDate\",current_date))*-1 <= 55 then '3. 21 a 55' ");
        sb.append("when (DAYS_BETWEEN(fac.\"DocDueDate\",current_date))*-1 >= 56 and (DAYS_BETWEEN(fac.\"DocDueDate\",current_date))*-1 <= 120 then '4. 56 a 120' ");
        sb.append("when (DAYS_BETWEEN(fac.\"DocDueDate\",current_date))*-1 >= 121 and (DAYS_BETWEEN(fac.\"DocDueDate\",current_date))*-1 <= 360 then '5. 121 a 360' ");
        sb.append("when (DAYS_BETWEEN(fac.\"DocDueDate\",current_date))*-1 > 361 then '6. Mayor de 360' ");
        sb.append("else '1. Sin vencer' end as diasvencimiento,cast(fac.\"DocTotal\" as numeric(18,0)) - cast(fac.\"PaidToDate\" as numeric(18,0)) as Valor ");
        sb.append("from OINV fac inner join OSLP ase ON fac.\"SlpCode\" = ase.\"SlpCode\" where fac.\"DocStatus\" = 'O' UNION ALL ");
        sb.append("select case when (DAYS_BETWEEN(nc.\"DocDueDate\",current_date))*-1 < 0 then '1. Sin vencer' ");
        sb.append("when (DAYS_BETWEEN(nc.\"DocDueDate\",current_date))*-1 > 0 and (DAYS_BETWEEN(nc.\"DocDueDate\",current_date))*-1 <= 20 then '2. 0 a 20' ");
        sb.append("when (DAYS_BETWEEN(nc.\"DocDueDate\",current_date))*-1 >= 21 and (DAYS_BETWEEN(nc.\"DocDueDate\",current_date))*-1 <= 55 then '3. 21 a 55' ");
        sb.append("when (DAYS_BETWEEN(nc.\"DocDueDate\",current_date))*-1 >= 56 and (DAYS_BETWEEN(nc.\"DocDueDate\",current_date))*-1 <= 120 then '4. 56 a 120' ");
        sb.append("when (DAYS_BETWEEN(nc.\"DocDueDate\",current_date))*-1 >= 121 and (DAYS_BETWEEN(nc.\"DocDueDate\",current_date))*-1 <= 360 then '5. 121 a 360' ");
        sb.append("when (DAYS_BETWEEN(nc.\"DocDueDate\",current_date))*-1 > 361 then '6. Mayor de 360' ");
        sb.append("else '1. Sin vencer' end as diasvencimiento, (cast(nc.\"DocTotal\" as numeric(18,0))- (cast(nc.\"PaidToDate\" as numeric(18,0)))*-1) as Valor ");
        sb.append("from ORIN nc inner join OSLP ase ON nc.\"SlpCode\" = ase.\"SlpCode\" where nc.\"DocStatus\" = 'O' UNION ALL ");
        sb.append("select case when (DAYS_BETWEEN(rc.\"DocDueDate\",current_date))*-1 < 0 then '1. Sin vencer' ");
        sb.append("when (DAYS_BETWEEN(rc.\"DocDueDate\",current_date))*-1 > 0 and (DAYS_BETWEEN(rc.\"DocDueDate\",current_date))*-1 <= 20 then '2. 0 a 20' ");
        sb.append("when (DAYS_BETWEEN(rc.\"DocDueDate\",current_date))*-1 >= 21 and (DAYS_BETWEEN(rc.\"DocDueDate\",current_date))*-1 <= 55 then '3. 21 a 55' ");
        sb.append("when (DAYS_BETWEEN(rc.\"DocDueDate\",current_date))*-1 >= 56 and (DAYS_BETWEEN(rc.\"DocDueDate\",current_date))*-1 <= 120 then '4. 56 a 120' ");
        sb.append("when (DAYS_BETWEEN(rc.\"DocDueDate\",current_date))*-1 >= 121 and (DAYS_BETWEEN(rc.\"DocDueDate\",current_date))*-1 <= 360 then '5. 121 a 360' ");
        sb.append("when (DAYS_BETWEEN(rc.\"DocDueDate\",current_date))*-1 > 361 then '6. Mayor de 360' ");
        sb.append("else '1. Sin vencer' end as diasvercimiento, (cast(rc.\"OpenBal\" as numeric(18,0))*-1) as Valor ");
        sb.append("from ORCT rc inner join OJDT oj ON rc.\"TransId\" = oj.\"TransId\" inner join JDT1 jt ON jt.\"TransId\" = jt.\"TransId\" inner join OCRD sn on sn.\"CardCode\" = rc.\"CardCode\" ");
        sb.append("inner join OSLP ve ON ve.\"SlpCode\" = sn.\"SlpCode\" ");
        sb.append("where jt.\"Account\" >='11050505' and jt.\"Account\" <='13050510' and rc.\"PayNoDoc\" = 'Y' and rc.\"Canceled\" = 'N' and rc.\"OpenBal\" <> 0 ) as t ");
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