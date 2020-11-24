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
        sb.append("where (v.name is null)and(v.number between 0 and 12) ");
        sb.append("order by 5,6");
        try {
            return em.createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los costos de compras en comex para " + companyName, e);
        }
        return new ArrayList<>();
    }
}