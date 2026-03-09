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
public class LandedCostsFacade {
    private static final Logger CONSOLE = Logger.getLogger(LandedCostsFacade.class.getSimpleName());
    private static final String DB_TYPE_HANA = Constants.DATABASE_TYPE_HANA;
    @EJB
    private PersistenceConf persistenceConf;

    public LandedCostsFacade() {
    }

    public List<Object[]> listPurchesesCosts(String companyName, boolean pruebas) {
        EntityManager em = persistenceConf.chooseSchema(companyName, pruebas, DB_TYPE_HANA);
        StringBuilder sb = new StringBuilder();
        sb.append("select ifnull(t.\"costoCompra\",0)as ccompra,ifnull(t.\"costoLogistico\",0)as clog,ifnull(t.\"porcentaje\",0)as porc, ");
        sb.append(" cast(v.\"U_MonthName\" as varchar(20))as mes, ifnull(t.ano,year(current_date))as ano,v.\"U_Value\" as m# ");
        sb.append("from \"@SPT_VALUES\" v ");
        sb.append("left join(");
        sb.append(" select cast(sum(ca.\"DocTotal\"-ca.\"CostSum\")as numeric(18,0))as \"costoCompra\",cast(sum(ca.\"CostSum\")as numeric(18,0))as \"costoLogistico\", ");
        sb.append("  cast((sum(ca.\"CostSum\")/sum(ca.\"DocTotal\")*100)as numeric(18,2))as \"porcentaje\",month(ca.\"DocDate\")as \"mes#\", ");
        sb.append("  cast(year(ca.\"DocDate\")as int)as ano ");
        sb.append(" from OIPF ca ");
        sb.append(" where year(ca.\"DocDate\") between year(ADD_YEARS(TO_DATE(current_date,'YYYY-MM-DD'),-3)) and year(current_date)-1 ");
        sb.append(" group by year(ca.\"DocDate\"),month(ca.\"DocDate\") ");
        sb.append(")as t ON t.\"mes#\"=v.\"U_Value\" ");
        sb.append("where v.\"U_Value\" between 1 and 12 ");
        sb.append("union all ");
        sb.append("select ifnull(t.\"costoCompra\",0)as ccompra,ifnull(t.\"costoLogistico\",0)as clog,ifnull(t.\"porcentaje\",0)as porc, ");
        sb.append(" cast(v.\"U_MonthName\" as varchar(20))as mes, ifnull(t.ano,year(current_date))as ano,v.\"U_Value\" as m# ");
        sb.append("from \"@SPT_VALUES\" v ");
        sb.append("left join(");
        sb.append(" select cast(sum(ca.\"DocTotal\"-ca.\"CostSum\")as numeric(18,0))as \"costoCompra\",cast(sum(ca.\"CostSum\")as numeric(18,0))as \"costoLogistico\", ");
        sb.append("  cast((sum(ca.\"CostSum\")/sum(ca.\"DocTotal\")*100)as numeric(18,2))as \"porcentaje\",month(ca.\"DocDate\")as \"mes#\", ");
        sb.append("  cast(year(ca.\"DocDate\")as int)as ano ");
        sb.append(" from OIPF ca ");
        sb.append(" where year(ca.\"DocDate\")=year(current_date) ");
        sb.append(" group by year(ca.\"DocDate\"),month(ca.\"DocDate\") ");
        sb.append(")as t ON t.\"mes#\"=v.\"U_Value\" ");
        sb.append("where v.\"U_Value\" between 1 and 12 ");
        sb.append("order by 5,6");
        try {
            return em.createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los costos de compras en comex para " + companyName, e);
        }
        return new ArrayList<>();
    }

    public List<Object[]> listImportsCosto(String companyName, boolean pruebas) {
        EntityManager em = persistenceConf.chooseSchema(companyName, pruebas, DB_TYPE_HANA);
        StringBuilder sb = new StringBuilder();
        sb.append("select r.\"Mes\",sum(r.\"2023\")as \"2023\",sum(r.\"2024\")as \"2024\",sum(r.\"2025\")as \"2025\",sum(r.\"2026\")as \"2026\" ");
        sb.append("from (select t.\"Ano\",t.\"Mes\", ");
        sb.append("      case when t.\"Ano\"='2023' then sum(t.\"CostoLogistico\") else 0 end as \"2023\", ");
        sb.append("      case when t.\"Ano\"='2024' then sum(t.\"CostoLogistico\") else 0 end as \"2024\", ");
        sb.append("      case when t.\"Ano\"='2025' then sum(t.\"CostoLogistico\") else 0 end as \"2025\", ");
        sb.append("      case when t.\"Ano\"='2026' then sum(t.\"CostoLogistico\") else 0 end as \"2026\" ");
        sb.append("     from(select case month(ca.\"DocDate\") ");
        sb.append("          when 1  then 'Enero'");
        sb.append("          when 2  then 'Febrero'");
        sb.append("          when 3  then 'Marzo'");
        sb.append("          when 4  then 'Abril'");
        sb.append("          when 5  then 'Mayo'");
        sb.append("          when 6  then 'Junio'");
        sb.append("          when 7  then 'Julio'");
        sb.append("          when 8  then 'Agosto'");
        sb.append("          when 9  then 'Septiembre'");
        sb.append("          when 10 then 'Octubre'");
        sb.append("          when 11 then 'Noviembre'");
        sb.append("          when 12 then 'Diciembre' end as \"Mes\", ");
        sb.append("          month(ca.\"DocDate\")as \"M\",year(ca.\"DocDate\")as \"Ano\",sum(cast(ca.\"CostSum\" as numeric(18,0)))as \"CostoLogistico\" ");
        sb.append("        from OIPF ca");
        sb.append("        where year(ca.\"DocDate\") between year(ADD_YEARS(current_date,-3)) and year(current_date)");
        sb.append("        group by ca.\"DocDate\"");
        sb.append(" )as t");
        sb.append(" group by t.\"Ano\",t.\"Mes\"");
        sb.append(")as r ");
        sb.append("group by r.\"Mes\"");
        try {
            return em.createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al listar los costos de importaciones en comex para " + companyName, e);
        }
        return new ArrayList<>();
    }

    public List<Object[]> listPurchesesFactor(Integer year, String month, String companyName, boolean pruebas) {
        EntityManager em = persistenceConf.chooseSchema(companyName, pruebas, DB_TYPE_HANA);
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(r.Ano as varchar(4))as Ano,cast(r.Mes as varchar(20))as Mes,cast(r.Servicio as varchar(50))as Servicio,sum(r.CostoEstimado)as CostoEstimado, ");
        sb.append(" sum(r.CostoReal)as CostoReal,cast(((sum(r.CostoEstimado)/(select sum(\"DocTotal\") from OIPF where year(\"DocDate\")=");
        sb.append(year);
        sb.append(" and MONTHNAME(\"DocDate\")='");
        sb.append(month);
        sb.append("'))*100)as numeric(18,2))as Factor ");
        sb.append("from (select t.Ano,t.Mes,t.Servicio,t.CostoEstimado,cast(0 as numeric(18,2))as CostoReal from ( ");
        sb.append(" select year(pr.\"DocDate\")as Ano,month(pr.\"DocDate\")as Mes,co.\"AlcName\" as Servicio,sum(cast(cs.\"CostSum\" as numeric(18,2)))as CostoEstimado ");
        sb.append(" from  OIPF pr ");
        sb.append(" inner join IPF2 cs ON pr.\"DocEntry\"=cs.\"DocEntry\" ");
        sb.append(" inner join OALC co ON cs.\"AlcCode\"=co.\"AlcCode\" ");
        sb.append(" where year(pr.\"DocDate\")=");
        sb.append(year);
        sb.append(" and MONTHNAME(pr.\"DocDate\")='");
        sb.append(month);
        sb.append("' group by co.\"AlcName\",year(pr.\"DocDate\"),month(pr.\"DocDate\") ");
        sb.append(")as t group by t.Ano,t.Mes,t.Servicio,t.CostoEstimado ");
        sb.append("union all ");
        sb.append("select t.Ano,t.Mes,t.\"AlcName\" as Servicio,cast(0 as numeric(18,2))as CostoEstimado,cast(sum(CostoReal)as numeric(18,2))as CostoReal ");
        sb.append("from (select distinct co.\"AlcName\", ");
        sb.append("  (select distinct cast((sum(sd.\"Debit\")-sum(sd.\"Credit\"))as numeric(18,0))as Total ");
        sb.append("  from OJDT st ");
        sb.append("  inner join JDT1 sd ON st.\"TransId\"=sd.\"TransId\" ");
        sb.append("  inner join OACT ac ON sd.\"Account\"=ac.\"AcctCode\" ");
        sb.append("  where sd.\"Account\" between '14650526' and '14650535' and st.\"TransType\" in('18','19','30') and sd.\"Project\"=de.\"Project\" and ac.\"AcctName\"=co.\"AlcName\" and length(st.\"Ref1\")>1 ");
        sb.append("  group by ac.\"AcctName\")as CostoReal,year(pr.\"DocDate\")as Ano,month(pr.\"DocDate\")as Mes ");
        sb.append(" from OIPF pr ");
        sb.append(" inner join IPF2 cs ON pr.\"DocEntry\"=cs.\"DocEntry\" ");
        sb.append(" inner join IPF1 de ON pr.\"DocEntry\"=de.\"DocEntry\" ");
        sb.append(" inner join OALC co ON cs.\"AlcCode\"=co.\"AlcCode\" ");
        sb.append(" where year(pr.\"DocDate\")=");
        sb.append(year);
        sb.append(" and MONTHNAME(pr.\"DocDate\")='");
        sb.append(month);
        sb.append("' and de.\"Project\"<>'')as t group by t.Ano,t.Mes,t.\"AlcName\"  ");
        sb.append(")as r group by r.Ano,r.Mes,r.Servicio");
        try {
            return em.createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al listar los factores de compras en comex para " + companyName, e);
        }
        return new ArrayList<>();
    }
}