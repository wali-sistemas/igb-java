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
    private static final String DB_TYPE = Constants.DATABASE_TYPE_MSSQL;

    @EJB
    private PersistenceConf persistenceConf;

    public LandedCostsFacade() {
    }

    public List<Object[]> listPurchesesCosts(String companyName, boolean pruebas) {
        EntityManager em = persistenceConf.chooseSchema(companyName, pruebas, DB_TYPE);
        StringBuilder sb = new StringBuilder();
        sb.append("select isnull(t.costoCompra,0)as ccompra,isnull(t.costoLogistico,0)as clog,isnull(t.porcentaje,0)as porc, ");
        sb.append(" cast(datename(month,dateadd(month,month(dateadd(mm,v.number,getdate())),0))as varchar(20))as mes,isnull(t.ano,year(getdate()))as ano, ");
        sb.append(" case when cast(datename(month,dateadd(month,month(dateadd(mm,v.number,getdate())),0))as varchar(20))='Enero' then 1");
        sb.append("      when cast(datename(month,dateadd(month,month(dateadd(mm,v.number,getdate())),0))as varchar(20))='Febrero' then 2");
        sb.append("      when cast(datename(month,dateadd(month,month(dateadd(mm,v.number,getdate())),0))as varchar(20))='Marzo' then 3");
        sb.append("      when cast(datename(month,dateadd(month,month(dateadd(mm,v.number,getdate())),0))as varchar(20))='Abril' then 4");
        sb.append("      when cast(datename(month,dateadd(month,month(dateadd(mm,v.number,getdate())),0))as varchar(20))='Mayo' then 5");
        sb.append("      when cast(datename(month,dateadd(month,month(dateadd(mm,v.number,getdate())),0))as varchar(20))='Junio' then 6");
        sb.append("      when cast(datename(month,dateadd(month,month(dateadd(mm,v.number,getdate())),0))as varchar(20))='Julio' then 7");
        sb.append("      when cast(datename(month,dateadd(month,month(dateadd(mm,v.number,getdate())),0))as varchar(20))='Agosto' then 8");
        sb.append("      when cast(datename(month,dateadd(month,month(dateadd(mm,v.number,getdate())),0))as varchar(20))='Septiembre' then 9");
        sb.append("      when cast(datename(month,dateadd(month,month(dateadd(mm,v.number,getdate())),0))as varchar(20))='Octubre' then 10");
        sb.append("      when cast(datename(month,dateadd(month,month(dateadd(mm,v.number,getdate())),0))as varchar(20))='Noviembre' then 11");
        sb.append("      when cast(datename(month,dateadd(month,month(dateadd(mm,v.number,getdate())),0))as varchar(20))='Diciembre' then 12");
        sb.append(" else 0 end as m# ");
        sb.append("from master.dbo.spt_values v ");
        sb.append("left join(");
        sb.append(" select cast(sum(ca.DocTotal)as numeric(18,0))as costoCompra,cast(sum(ca.CostSum)as numeric(18,0))as costoLogistico, ");
        sb.append("  cast((sum(ca.CostSum)/sum(ca.DocTotal)*100)as numeric(18,2))as porcentaje,month(ca.DocDate)as mes#, ");
        sb.append("  cast(year(ca.DocDate)as int)as ano ");
        sb.append(" from OIPF ca ");
        sb.append(" where year(ca.DocDate) between year(dateadd(year,-2,getDate())) and year(getDate()) ");
        sb.append(" group by year(ca.DocDate),month(ca.DocDate) ");
        sb.append(")as t ON t.mes#=v.number ");
        sb.append("where (v.name is null)and(v.number between 1 and 12) ");
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
        EntityManager em = persistenceConf.chooseSchema(companyName, pruebas, DB_TYPE);
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(pvt.Mes as varchar(20))as Mes, ");
        sb.append(" cast(isnull(pvt.[2018],0)as numeric(18,0))as[2018],cast(isnull(pvt.[2019],0)as numeric(18,0))as[2019], ");
        sb.append(" cast(isnull(pvt.[2020],0)as numeric(18,0))as[2020],cast(isnull(pvt.[2021],0)as numeric(18,0))as[2021] ");
        sb.append("from (select datename(month,ca.DocDate)as Mes,month(ca.DocDate)as M,year(ca.DocDate)as Ano, ");
        sb.append("  sum(cast(ca.CostSum as numeric(18,0)))as CostoLogistico ");
        sb.append(" from OIPF ca ");
        sb.append(" where year(ca.DocDate) between year(getdate())-3 and year(getdate()) ");
        sb.append(" group by ca.DocDate ");
        sb.append(")as t ");
        sb.append("pivot (sum(CostoLogistico) for Ano in ([2018],[2019],[2020],[2021]))as pvt ");
        sb.append("order by pvt.M asc");
        try {
            return em.createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al listar los costos de importaciones en comex para " + companyName, e);
        }
        return new ArrayList<>();
    }

    public List<Object[]> listPurchesesFactor(Integer year, String month, String companyName, boolean pruebas) {
        EntityManager em = persistenceConf.chooseSchema(companyName, pruebas, DB_TYPE);
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(r.Ano as varchar(4))as Ano,cast(r.Mes as varchar(20))as Mes,cast(r.Servicio as varchar(50))as Servicio,sum(r.CostoEstimado)as CostoEstimado, ");
        sb.append(" sum(r.CostoReal)as CostoReal,cast(sum(r.Factor)as numeric(18,2))as Factor ");
        sb.append("from (select t.Ano,t.Mes,t.Servicio,t.CostoEstimado,cast(0 as numeric(18,2))as CostoReal,t.Factor from ( ");
        sb.append(" select year(pr.DocDate)as Ano,month(pr.DocDate)as Mes,co.AlcName as Servicio,sum(cast(cs.CostSum as numeric(18,2)))as CostoEstimado,sum(cs.Factor)as Factor ");
        sb.append(" from  OIPF pr ");
        sb.append(" inner join IPF2 cs ON pr.DocEntry=cs.DocEntry ");
        sb.append(" inner join OALC co ON cs.AlcCode=co.AlcCode ");
        sb.append(" where year(pr.DocDate)=");
        sb.append(year);
        sb.append(" and datename(month,pr.DocDate)='");
        sb.append(month);
        sb.append("' group by co.AlcName,year(pr.DocDate),month(pr.DocDate) ");
        sb.append(")as t group by t.Ano,t.Mes,t.Servicio,t.CostoEstimado,t.Factor ");
        sb.append("union all ");
        sb.append("select t.Ano,t.Mes,t.AlcName as Servicio,cast(0 as numeric(18,2))as CostoEstimado,cast(SUM(CostoReal)as numeric(18,2))as CostoReal,0 as Factor ");
        sb.append("from (select distinct co.AlcName, ");
        sb.append("  (select distinct cast((sum(sd.Debit)-sum(sd.Credit))as numeric(18,0))as Total ");
        sb.append("  from OJDT st ");
        sb.append("  inner join JDT1 sd ON st.TransId=sd.TransId ");
        sb.append("  inner join OACT ac ON sd.Account=ac.AcctCode ");
        sb.append("  where sd.Account between '14650526' and '14650535' and st.TransType in('18','19','30') and sd.Project=de.Project and ac.AcctName=co.AlcName and len(st.Ref1)>1 ");
        sb.append("  group by ac.AcctName)as CostoReal,year(pr.DocDate)as Ano,month(pr.DocDate)as Mes ");
        sb.append(" from OIPF pr ");
        sb.append(" inner join IPF2 cs ON pr.DocEntry = cs.DocEntry ");
        sb.append(" inner join IPF1 de ON pr.DocEntry = de.DocEntry ");
        sb.append(" inner join OALC co ON cs.AlcCode = co.AlcCode ");
        sb.append(" where year(pr.DocDate)=");
        sb.append(year);
        sb.append(" and datename(month,pr.DocDate)='");
        sb.append(month);
        sb.append("' and de.Project<>'')as t group by t.Ano,t.Mes,t.AlcName ");
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