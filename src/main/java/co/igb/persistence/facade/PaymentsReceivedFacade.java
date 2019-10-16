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
    private static final String DB_TYPE = Constants.DATABASE_TYPE_MSSQL;

    @EJB
    private PersistenceConf persistenceConf;

    public PaymentsReceivedFacade() {
    }

    public List<Object[]> getCollectMonthly(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM (SELECT CAST(t.diasAtraso AS varchar(max)) AS DiasAtraso, SUM(CAST(t.Valor AS numeric(18,0))) AS Valor, MONTH(t.fechaRecibo) AS IdMes, ");
        sb.append("CAST(DATENAME(MONTH, t.fechaRecibo) AS varchar(20)) AS Mes FROM (SELECT CASE WHEN CAST((T0.DocDate-T6.DocDueDate) AS int) < 0 THEN 'Sin vencer' ");
        sb.append("WHEN (CAST((T0.DocDate-T6.DocDueDate) AS int) > 0 AND CAST((T0.DocDate-T6.DocDueDate) AS int) <= 20) THEN '0 a 20' ");
        sb.append("WHEN (CAST((T0.DocDate-T6.DocDueDate) AS int) >= 21 AND CAST((T0.DocDate-T6.DocDueDate) AS int) <= 55) THEN '21 a 55' ");
        sb.append("WHEN (CAST((T0.DocDate-T6.DocDueDate) AS int) >= 56 AND CAST((T0.DocDate-T6.DocDueDate) AS int) <= 120) THEN '56 a 120' ");
        sb.append("WHEN (CAST((T0.DocDate-T6.DocDueDate) AS int) >= 121 AND CAST((T0.DocDate-T6.DocDueDate) AS int) <= 360) THEN '121 a 360' ");
        sb.append("WHEN CAST((T0.DocDate-T6.DocDueDate) AS int) > 361 THEN 'Mayor de 360' ELSE 'Sin vencer' END AS diasAtraso, CAST(T5.AppliedSys AS int) AS Valor, ");
        sb.append("CAST(T0.DocDate AS date) AS fechaRecibo FROM ORCT T0 INNER JOIN RCT2 T5 ON T0.DocEntry = T5.DocNum INNER JOIN OJDT T1 ON T0.TransId = T1.TransId ");
        sb.append("INNER JOIN JDT1 T2 ON T1.TransId = T2.TransId INNER JOIN OINV T6 ON T6.DocEntry = T5.DocEntry WHERE YEAR(T0.DocDate) = YEAR(GETDATE()) AND ");
        sb.append("MONTH(T0.DocDate) between MONTH(GETDATE())-10 AND MONTH(GETDATE()) AND T2.Account >='11050505' AND T2.Account <='11250520' AND T0.Canceled = 'N' AND ");
        sb.append("CAST((T0.DocDate-T6.DocDueDate) AS int) < '700' UNION ALL SELECT CASE WHEN CAST((T0.DocDate-T6.DocDueDate) AS int) < 0 THEN 'Sin vencer' ");
        sb.append("WHEN (CAST((T0.DocDate-T6.DocDueDate) AS int) > 0 AND CAST((T0.DocDate-T6.DocDueDate) AS int) <= 20) THEN '0 a 20' ");
        sb.append("WHEN (CAST((T0.DocDate-T6.DocDueDate) AS int) >= 21 AND CAST((T0.DocDate-T6.DocDueDate) AS int) <= 55) THEN '21 a 55' ");
        sb.append("WHEN (CAST((T0.DocDate-T6.DocDueDate) AS int) >= 56 AND CAST((T0.DocDate-T6.DocDueDate) AS int) <= 120) THEN '56 a 120' ");
        sb.append("WHEN (CAST((T0.DocDate-T6.DocDueDate) AS int) >= 121 AND CAST((T0.DocDate-T6.DocDueDate) AS int) <= 360) THEN '121 a 360' ");
        sb.append("WHEN CAST((T0.DocDate-T6.DocDueDate) AS int) > 361 THEN 'Mayor de 360' ELSE 'Sin vencer' END AS diasAtraso, CAST(T5.AppliedSys AS int) AS Valor, ");
        sb.append("CAST(T0.DocDate AS date) AS fechaRecibo FROM ORCT T0 INNER JOIN RCT2 T5 ON T0.DocEntry = T5.DocNum INNER JOIN OJDT T1 ON T0.TransId = T1.TransId ");
        sb.append("INNER JOIN JDT1 T2 ON T1.TransId = T2.TransId INNER JOIN ORIN T6 ON T6.DocEntry = T5.DocEntry WHERE YEAR(T0.DocDate) = YEAR(GETDATE()) AND ");
        sb.append("MONTH(T0.DocDate) between MONTH(GETDATE())-10 AND MONTH(GETDATE()) AND T2.Account >='11050505' AND T2.Account <='11250520' AND T0.Canceled = 'N' UNION ALL ");
        sb.append("SELECT 'Sin vencer' AS diasAtraso, CAST(T0.NoDocSum AS int) AS Valor, CAST(T0.DocDate AS date) AS fechaRecibo FROM ORCT T0 INNER JOIN OJDT T1 ON T0.TransId = T1.TransId ");
        sb.append("INNER JOIN JDT1 T2 ON T1.TransId = T2.TransId WHERE YEAR(T0.DocDate) = YEAR(GETDATE()) AND MONTH(T0.DocDate) between MONTH(GETDATE())-10 AND MONTH(GETDATE()) AND ");
        sb.append("T2.Account >='11050505' AND T2.Account <='11250520' AND T0.paynodoc = 'Y' AND T0.Canceled = 'N' UNION ALL SELECT CASE WHEN CAST((T0.DocDate-T3.taxdate) AS int) < 0 THEN 'Sin vencer' ");
        sb.append("WHEN (CAST((T0.DocDate-T3.taxdate) AS int) > 0 AND CAST((T0.DocDate-T3.taxdate) AS int) <= 20) THEN '0 a 20' ");
        sb.append("WHEN (CAST((T0.DocDate-T3.taxdate) AS int) >= 21 AND CAST((T0.DocDate-T3.taxdate) AS int) <= 55) THEN '21 a 55' ");
        sb.append("WHEN (CAST((T0.DocDate-T3.taxdate) AS int) >= 56 AND CAST((T0.DocDate-T3.taxdate) AS int) <= 120) THEN '56 a 120' ");
        sb.append("WHEN (CAST((T0.DocDate-T3.taxdate) AS int) >= 121 AND CAST((T0.DocDate-T3.taxdate) AS int) <= 360) THEN '121 a 360' WHEN CAST((T0.DocDate-T3.taxdate) AS int) > 361 THEN 'Mayor de 360' ");
        sb.append("ELSE 'Sin vencer' END AS diasAtraso, CAST(T5.AppliedSys AS int) AS Valor, CAST(T0.DocDate AS date) AS fechaRecibo FROM ORCT T0 INNER JOIN RCT2 T5 ON T0.DocEntry = T5.DocNum ");
        sb.append("INNER JOIN OJDT T1 ON T0.TransId = T1.TransId INNER JOIN JDT1 T2 ON T1.TransId = T2.TransId INNER JOIN OJDT T3 ON T3.TransId = T5.DocTransId WHERE YEAR(T0.DocDate) = YEAR(GETDATE()) AND ");
        sb.append("MONTH(T0.DocDate) between MONTH(GETDATE())-10 AND MONTH(GETDATE()) AND T5.InvType IN ('24','30') AND T2.DebCred = 'C' AND T0.Canceled = 'N' ) AS t ");
        sb.append("GROUP BY t.diasAtraso, DATENAME(MONTH, t.fechaRecibo), MONTH(t.fechaRecibo)) AS p ");
        sb.append("PIVOT(SUM(p.valor) FOR p.diasAtraso IN ([Sin vencer],[0 a 20],[21 a 55],[56 a 120],[121 a 360],[Mayor de 360])) AS matris ORDER BY matris.IdMes ASC");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando el recaudo para la empresa [");
        }
        return null;
    }

    public List<Object[]> getByCollect(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT CAST(t.diasvencimiento AS varchar(max)) AS DiasVencimiento, SUM(CAST(t.Valor AS numeric(18,0))) AS Valor ");
        sb.append("FROM (SELECT CASE WHEN (CAST(fac.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 < 0 THEN '1. Sin vencer' ");
        sb.append("WHEN (CAST(fac.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 > 0 AND (CAST(fac.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 <= 20 THEN '2. 0 a 20' ");
        sb.append("WHEN (CAST(fac.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 >= 21 AND (CAST(fac.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 <= 55 THEN '3. 21 a 55' ");
        sb.append("WHEN (CAST(fac.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 >= 56 AND (CAST(fac.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 <= 120 THEN '4. 56 a 120' ");
        sb.append("WHEN (CAST(fac.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 >= 121 AND (CAST(fac.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 <= 360 THEN '5. 121 a 360' ");
        sb.append("WHEN (CAST(fac.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 > 361 THEN '6. Mayor de 360' ");
        sb.append("ELSE '1. Sin vencer' END AS diasvencimiento,CAST(fac.DocTotal AS NUMERIC(18,0)) - CAST(fac.PaidToDate AS NUMERIC(18,0)) AS Valor ");
        sb.append("FROM oinv fac INNER JOIN OSLP ase ON fac.SlpCode = ase.SlpCode WHERE fac.DocStatus = 'O' UNION ALL ");
        sb.append("SELECT CASE WHEN (CAST(nc.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 < 0 THEN '1. Sin vencer' ");
        sb.append("WHEN (CAST(nc.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 > 0 AND (CAST(nc.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 <= 20 THEN '2. 0 a 20' ");
        sb.append("WHEN (CAST(nc.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 >= 21 AND (CAST(nc.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 <= 55 THEN '3. 21 a 55' ");
        sb.append("WHEN (CAST(nc.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 >= 56 AND (CAST(nc.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 <= 120 THEN '4. 56 a 120' ");
        sb.append("WHEN (CAST(nc.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 >= 121 AND (CAST(nc.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 <= 360 THEN '5. 121 a 360' ");
        sb.append("WHEN (CAST(nc.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 > 361 THEN '6. Mayor de 360' ");
        sb.append("ELSE '1. Sin vencer' END AS diasvencimiento, (CAST(nc.DocTotal AS NUMERIC(18,0))- CAST(nc.paidtodate AS NUMERIC(18,0)))*-1 AS Valor ");
        sb.append("FROM orin nc INNER JOIN OSLP ase ON nc.SlpCode = ase.SlpCode WHERE nc.DocStatus = 'O' UNION ALL ");
        sb.append("SELECT CASE WHEN (CAST(T0.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 < 0 THEN '1. Sin vencer' ");
        sb.append("WHEN (CAST(T0.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 > 0 AND (CAST(T0.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 <= 20 THEN '2. 0 a 20' ");
        sb.append("WHEN (CAST(T0.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 >= 21 AND (CAST(T0.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 <= 55 THEN '3. 21 a 55' ");
        sb.append("WHEN (CAST(T0.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 >= 56 AND (CAST(T0.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 <= 120 THEN '4. 56 a 120' ");
        sb.append("WHEN (CAST(T0.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 >= 121 AND (CAST(T0.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 <= 360 THEN '5. 121 a 360' ");
        sb.append("WHEN (CAST(T0.DocDueDate AS INT) - CAST(GETDATE() AS INT))*-1 > 361 THEN '6. Mayor de 360' ");
        sb.append("ELSE '1. Sin vencer' END AS diasveT0imiento, CAST(T0.OpenBal AS NUMERIC(18,0))*-1 AS Valor ");
        sb.append("FROM ORCT T0 INNER JOIN OJDT T1 ON T0.TransId = T1.TransId INNER JOIN JDT1 T2 ON T1.TransId = T2.TransId INNER JOIN OCRD T3 on T3.CardCode = T0.CardCode ");
        sb.append("INNER JOIN OSLP T4 ON T4.SlpCode = T3.SlpCode ");
        sb.append("WHERE T2.Account >='11050505' AND T2.Account <='13050510' AND t0.PayNoDoc = 'Y' AND T0.Canceled = 'N' AND T0.OpenBal <> 0 ) AS t ");
        sb.append("GROUP BY t.diasvencimiento ORDER BY t.diasvencimiento");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando la cartera por cobrar para la empresa [" + companyName + "]");
        }
        return null;
    }
}