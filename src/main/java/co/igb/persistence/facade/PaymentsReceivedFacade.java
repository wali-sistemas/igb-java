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
        sb.append("select z.\"IdMes\",z.\"Mes\",sum(z.\"Sin vencer\")as \"Sin vencer\", ");
        if (companyName.contains("REDPLAS")) {
            sb.append(" sum(z.\"0 a 15\")as \"0 a 15\",sum(z.\"16 a 30\")as \"16 a 30\",sum(z.\"31 a 60\")as \"31 a 60\",sum(\"61 a 90\")as \"61 a 90\",sum(\"Mayor de 90\")as \"Mayor de 90\" ");
        } else {
            sb.append(" sum(z.\"0 a 20\")as \"0 a 20\",sum(z.\"21 a 55\")as \"21 a 55\",sum(z.\"56 a 120\")as \"56 a 120\",sum(\"121 a 360\")as \"121 a 360\",sum(\"Mayor de 360\")as \"Mayor de 360\" ");
        }
        sb.append("from (");
        sb.append("  select y.\"IdMes\", y.\"Mes\", ");
        //TODO: configuración de edades recaudos para REDPLAS
        if (companyName.contains("REDPLAS")) {
            sb.append(" case when y.\"DiasAtraso\" < 0 then sum(y.\"Valor\") else 0 end as \"Sin vencer\", ");
            sb.append(" case when (y.\"DiasAtraso\" >= 0 and y.\"DiasAtraso\" <= 15) then sum(y.\"Valor\") else 0 end as \"0 a 15\", ");
            sb.append(" case when (y.\"DiasAtraso\" >= 16 and y.\"DiasAtraso\" <= 30) then sum(y.\"Valor\") else 0 end as \"16 a 30\", ");
            sb.append(" case when (y.\"DiasAtraso\" >= 31 and y.\"DiasAtraso\" <= 60) then sum(y.\"Valor\") else 0 end as \"31 a 60\", ");
            sb.append(" case when (y.\"DiasAtraso\" >= 61 and y.\"DiasAtraso\" <= 90) then sum(y.\"Valor\") else 0 end as \"61 a 90\", ");
            sb.append(" case when (y.\"DiasAtraso\" > 90) then sum(y.\"Valor\") else 0 end as \"Mayor de 90\" ");
        } else {
            //TODO: Configuración de edades recaudos para IGB - MTZ
            sb.append(" case when y.\"DiasAtraso\" < 0 then sum(y.\"Valor\") else 0 end as \"Sin vencer\", ");
            sb.append(" case when (y.\"DiasAtraso\" >= 0 and y.\"DiasAtraso\" <= 20) then sum(y.\"Valor\") else 0 end as \"0 a 20\", ");
            sb.append(" case when (y.\"DiasAtraso\" >= 21 and y.\"DiasAtraso\" <= 55) then sum(y.\"Valor\") else 0 end as \"21 a 55\", ");
            sb.append(" case when (y.\"DiasAtraso\" >= 56 and y.\"DiasAtraso\" <= 120) then sum(y.\"Valor\") else 0 end as \"56 a 120\", ");
            sb.append(" case when (y.\"DiasAtraso\" >= 121 and y.\"DiasAtraso\" <= 360) then sum(y.\"Valor\") else 0 end as \"121 a 360\", ");
            sb.append(" case when (y.\"DiasAtraso\" > 361) then sum(y.\"Valor\") else 0 end as \"Mayor de 360\" ");
        }
        sb.append(" from ( ");
        sb.append("  select cast(t.\"diasAtraso\" as varchar(1000)) as \"DiasAtraso\",SUM(cast(t.\"TotalPago\" as numeric(18,0))) as \"Valor\", ");
        sb.append("   month(t.\"fechaRecibo\") as \"IdMes\", cast(v.\"U_MonthName\" as varchar(20)) as \"Mes\" ");
        sb.append("  from ( ");
        sb.append("   select distinct f.\"DocDueDate\" as \"fechaVenc\",d.\"SumApplied\" as \"TotalPago\",cast(r.\"DocDate\" as date) as \"fechaRecibo\",DAYS_BETWEEN(f.\"DocDueDate\",r.\"DocDate\")as \"diasAtraso\",r.\"DocNum\",r.\"DocTotal\" as \"TotalDoc\",d.\"DocEntry\" ");
        sb.append("   from ORCT r ");
        sb.append("   inner join RCT2 d on r.\"DocEntry\" = d.\"DocNum\" ");
        sb.append("   inner join OJDT j on r.\"TransId\" = j.\"TransId\" ");
        sb.append("   inner join JDT1 t on j.\"TransId\" = t.\"TransId\" ");
        sb.append("   inner join OCRD s on s.\"CardCode\" = r.\"CardCode\" ");
        sb.append("   inner join OSLP v on v.\"SlpCode\" = s.\"SlpCode\" ");
        sb.append("   inner join OINV f on f.\"DocEntry\" = d.\"DocEntry\" ");
        sb.append("   where r.\"Canceled\"='N' and year(r.\"DocDate\") = year(current_date) and d.\"InvType\"=13 and r.\"TrsfrAcct\" in ");
        //TODO: Configuración de cuentas de recaudo para compañias activas
        switch (companyName) {
            case "IGB":
                sb.append("('11100507','11100509','11100517','11100518','11100519','11250530','11250520') ");
                break;
            case "VARROC":
                sb.append("('11100506','11100507','11100510','11100518','11100519','11250525','13050510') ");
                break;
            case "REDPLAS":
                sb.append("('11100501','11100502','11100507','11100509','11100510') ");
                break;
            case "VELEZ":
                sb.append("('11100507','11100505','11100510','11100515','11100520','11100521','11200505') ");
                break;
        }
        sb.append(" union all ");
        sb.append("  select distinct n.\"DocDueDate\" as \"fechaVenc\",d.\"SumApplied\"*-1 as \"TotalPago\",cast(r.\"DocDate\" as date) as \"fechaRecibo\",DAYS_BETWEEN(n.\"DocDueDate\",r.\"DocDate\")as \"diasAtraso\", r.\"DocNum\",r.\"DocTotal\" as \"TotalDoc\",d.\"DocEntry\" ");
        sb.append("  from ORCT r ");
        sb.append("  inner join RCT2 d on r.\"DocEntry\" = d.\"DocNum\" ");
        sb.append("  inner join OJDT j on r.\"TransId\" = j.\"TransId\" ");
        sb.append("  inner join JDT1 t on j.\"TransId\" = t.\"TransId\" ");
        sb.append("  inner join OCRD s on s.\"CardCode\" = r.\"CardCode\" ");
        sb.append("  inner join OSLP v on v.\"SlpCode\" = s.\"SlpCode\" ");
        sb.append("  inner join ORIN n on n.\"DocEntry\" = d.\"DocEntry\" ");
        sb.append("  where r.\"Canceled\"='N' and year(r.\"DocDate\") = year(current_date) and r.\"Canceled\"='N' and r.\"TrsfrAcct\" in ");
        //TODO: Configuración de cuentas de recaudo para compañias activas
        switch (companyName) {
            case "IGB":
                sb.append("('11100507','11100509','11100517','11100518','11100519','11250530','11250520') ");
                break;
            case "VARROC":
                sb.append("('11100506','11100507','11100510','11100518','11100519','11250525','13050510') ");
                break;
            case "REDPLAS":
                sb.append("('11100501','11100502','11100507','11100509','11100510') ");
                break;
            case "VELEZ":
                sb.append("('11100507','11100505','11100510','11100515','11100520','11100521','11200505') ");
                break;
        }
        sb.append(" union all ");
        sb.append("  select distinct f.\"TaxDate\" as \"fechaVenc\",d.\"SumApplied\" as \"TotalPago\",cast(r.\"DocDate\" as date) as \"fechaRecibo\",DAYS_BETWEEN(f.\"TaxDate\",r.\"DocDate\")as \"diasAtraso\", r.\"DocNum\",r.\"DocTotal\" as \"TotalDoc\",d.\"DocEntry\" ");
        sb.append("  from ORCT r ");
        sb.append("  inner join OJDT j on r.\"TransId\" = j.\"TransId\" ");
        sb.append("  inner join JDT1 t on t.\"TransId\" = j.\"TransId\" ");
        sb.append("  inner join OCRD s on s.\"CardCode\" = r.\"CardCode\" ");
        sb.append("  inner join OSLP v on v.\"SlpCode\" = s.\"SlpCode\" ");
        sb.append("  inner join RCT2 d on r.\"DocEntry\" = d.\"DocNum\" ");
        sb.append("  inner join OJDT f ON f.\"TransId\" = d.\"DocTransId\" ");
        sb.append("  where r.\"Canceled\"='N' and year(r.\"DocDate\")=year(current_date) and r.\"TrsfrAcct\" not in('41350520','13050510') and d.\"InvType\" IN ('24','30') and t.\"DebCred\"='C' and r.\"Canceled\"='N' ");
        sb.append(" union all ");
        sb.append("  select distinct '' as \"fechaVenc\",r.\"NoDocSum\" as \"TotalPago\",cast(r.\"DocDate\" as date) as \"fechaRecibo\",'20' as \"diasAtraso\",r.\"DocNum\",r.\"DocTotal\" as \"TotalDoc\",0 as \"DocEntry\" ");
        sb.append("  from ORCT r ");
        sb.append("  inner join OJDT j on r.\"TransId\" = j.\"TransId\" ");
        sb.append("  inner join JDT1 t on j.\"TransId\" = t.\"TransId\" ");
        sb.append("  where year(r.\"DocDate\")=year(current_date) and r.\"DocType\"='C' and r.\"Canceled\"='N' and r.\"PayNoDoc\"='Y' and r.\"NoDocSum\">0 and r.\"TrsfrAcct\" in ");
        //TODO: Configuración de cuentas de recaudo para compañias activas
        switch (companyName) {
            case "IGB":
                sb.append("('11100507','11100509','11100517','11100518','11100519','11250530','11250520') ");
                break;
            case "VARROC":
                sb.append("('11100506','11100507','11100510','11100518','11100519','11250525','13050510') ");
                break;
            case "REDPLAS":
                sb.append("('11100501','11100502','11100507','11100509','11100510') ");
                break;
            case "VELEZ":
                sb.append("('11100507','11100505','11100510','11100515','11100520','11100521','11200505') ");
                break;
        }
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
        //TODO: configuración de edades recaudos para REDPLAS
        if (companyName.contains("REDPLAS")) {
            sb.append(" when (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) >= 0 and (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) <= 15 then '2. 0 a 15' ");
            sb.append(" when (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) >= 16 and (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) <= 30 then '3. 16 a 30' ");
            sb.append(" when (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) >= 31 and (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) <= 60 then '4. 31 a 60' ");
            sb.append(" when (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) >= 61 and (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) <= 90 then '5. 61 a 90' ");
            sb.append(" when (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) > 90 then '6. Mayor de 90' ");
        } else {
            //TODO: Configuración de edades recaudos para IGB - MTZ
            sb.append(" when (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) >= 0 and (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) <= 20 then '2. 0 a 20' ");
            sb.append(" when (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) >= 21 and (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) <= 55 then '3. 21 a 55' ");
            sb.append(" when (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) >= 56 and (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) <= 120 then '4. 56 a 120' ");
            sb.append(" when (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) >= 121 and (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) <= 360 then '5. 121 a 360' ");
            sb.append(" when (DAYS_BETWEEN(fac.\"DocDueDate\",current_date)) > 361 then '6. Mayor de 360' ");
        }
        sb.append("  else '1. Sin vencer' end as diasvencimiento,cast(fac.\"DocTotal\" as numeric(18,0)) - cast(fac.\"PaidToDate\" as numeric(18,0)) as ValorFV,0 as ValorNC,0 as ValorRC ");
        sb.append(" from OINV fac ");
        sb.append(" where fac.\"DocStatus\" = 'O' and fac.\"DocNum\" <> 339765 ");//TODO: FV excluida
        sb.append("UNION ALL ");
        sb.append(" select case when (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) < 0 then '1. Sin vencer' ");
        //TODO: configuración de edades recaudos para REDPLAS
        if (companyName.contains("REDPLAS")) {
            sb.append("  when (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) >= 0 and (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) <= 15 then '2. 0 a 15' ");
            sb.append("  when (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) >= 16 and (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) <= 30 then '3. 16 a 30' ");
            sb.append("  when (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) >= 31 and (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) <= 60 then '4. 31 a 60' ");
            sb.append("  when (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) >= 61 and (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) <= 90 then '5. 61 a 90' ");
            sb.append("  when (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) > 90 then '6. Mayor de 90' ");
        } else {
            //TODO: Configuración de edades recaudos para IGB - MTZ
            sb.append("  when (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) >= 0 and (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) <= 20 then '2. 0 a 20' ");
            sb.append("  when (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) >= 21 and (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) <= 55 then '3. 21 a 55' ");
            sb.append("  when (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) >= 56 and (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) <= 120 then '4. 56 a 120' ");
            sb.append("  when (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) >= 121 and (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) <= 360 then '5. 121 a 360' ");
            sb.append("  when (DAYS_BETWEEN(nc.\"DocDueDate\",current_date)) > 361 then '6. Mayor de 360' ");
        }
        sb.append("  else '1. Sin vencer' end as diasvencimiento,0 as ValorFV,(cast(nc.\"DocTotal\" as numeric(18,0))- (cast(nc.\"PaidToDate\" as numeric(18,0)))) as ValorNC,0 as ValorRC ");
        sb.append(" from ORIN nc ");
        sb.append("UNION ALL ");
        sb.append(" select distinct case when (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) < 0 then '1. Sin vencer' ");
        //TODO: configuración de edades recaudos para REDPLAS
        if (companyName.contains("REDPLAS")) {
            sb.append("  when (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) >= 0 and (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) <= 20 then '2. 0 a 15' ");
            sb.append("  when (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) >= 16 and (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) <= 55 then '3. 16 a 30' ");
            sb.append("  when (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) >= 31 and (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) <= 120 then '4. 31 a 60' ");
            sb.append("  when (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) >= 61 and (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) <= 360 then '5. 61 a 90' ");
            sb.append("  when (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) > 90 then '6. Mayor de 90' ");
        } else {
            //TODO: Configuración de edades recaudos para IGB - MTZ
            sb.append("  when (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) >= 0 and (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) <= 20 then '2. 0 a 20' ");
            sb.append("  when (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) >= 21 and (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) <= 55 then '3. 21 a 55' ");
            sb.append("  when (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) >= 56 and (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) <= 120 then '4. 56 a 120' ");
            sb.append("  when (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) >= 121 and (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) <= 360 then '5. 121 a 360' ");
            sb.append("  when (DAYS_BETWEEN(rc.\"DocDueDate\",current_date)) > 361 then '6. Mayor de 360' ");
        }
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