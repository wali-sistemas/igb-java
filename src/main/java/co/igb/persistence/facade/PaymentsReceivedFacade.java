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

    public List<Object[]> getCollect(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT CAST(t.diasAtraso AS varchar(max)) AS diasAtraso, SUM(CAST(t.Valor AS numeric(18,0))) AS Valor, CAST(DATENAME(MONTH, t.fechaRecibo) AS varchar(20)) AS mes ");
        sb.append("FROM (SELECT CASE WHEN CAST((T0.DocDate-T6.DocDueDate) AS int) < 0 THEN 'Sin vencer' ");
        sb.append("WHEN (CAST((T0.DocDate-T6.DocDueDate) AS int) > 0 AND CAST((T0.DocDate-T6.DocDueDate) AS int) <= 20) THEN 'De 0 a 20' ");
        sb.append("WHEN (CAST((T0.DocDate-T6.DocDueDate) AS int) >= 21 AND CAST((T0.DocDate-T6.DocDueDate) AS int) <= 55) THEN 'De 21 a 55' ");
        sb.append("WHEN (CAST((T0.DocDate-T6.DocDueDate) AS int) >= 56 AND CAST((T0.DocDate-T6.DocDueDate) AS int) <= 120) THEN 'De 56 a 120' ");
        sb.append("WHEN (CAST((T0.DocDate-T6.DocDueDate) AS int) >= 121 AND CAST((T0.DocDate-T6.DocDueDate) AS int) <= 360) THEN 'De 121 a 360' ");
        sb.append("WHEN CAST((T0.DocDate-T6.DocDueDate) AS int) > 361 THEN 'Mayor de 360' ELSE 'Sin vencer' END AS diasAtraso, CAST(T5.AppliedSys AS int) AS Valor, CAST(T0.DocDate AS date) AS fechaRecibo ");
        sb.append("FROM ORCT T0 INNER JOIN RCT2 T5 ON T0.DocEntry = T5.DocNum INNER JOIN OJDT T1 ON T0.TransId = T1.TransId INNER JOIN JDT1 T2 ON T1.TransId = T2.TransId ");
        sb.append("INNER JOIN OINV T6 ON T6.DocEntry = T5.DocEntry WHERE YEAR(T0.DocDate) = YEAR(GETDATE()) AND MONTH(T0.DocDate) between MONTH(GETDATE())-1 AND MONTH(GETDATE()) AND ");
        sb.append("T2.Account >='11050505' AND T0.Canceled = 'N' AND CAST((T0.DocDate-T6.DocDueDate) AS int) < '700' ");
        sb.append("UNION ALL ");
        sb.append("SELECT CASE WHEN CAST((T0.DocDate-T6.DocDueDate) AS int) < 0 THEN 'Sin vencer' ");
        sb.append("WHEN (CAST((T0.DocDate-T6.DocDueDate) AS int) > 0 AND CAST((T0.DocDate-T6.DocDueDate) AS int) <= 20) THEN 'De 0 a 20' ");
        sb.append("WHEN (CAST((T0.DocDate-T6.DocDueDate) AS int) >= 21 AND CAST((T0.DocDate-T6.DocDueDate) AS int) <= 55) THEN 'De 21 a 55' ");
        sb.append("WHEN (CAST((T0.DocDate-T6.DocDueDate) AS int) >= 56 AND CAST((T0.DocDate-T6.DocDueDate) AS int) <= 120) THEN 'De 56 a 120' ");
        sb.append("WHEN (CAST((T0.DocDate-T6.DocDueDate) AS int) >= 121 AND CAST((T0.DocDate-T6.DocDueDate) AS int) <= 360) THEN 'De 121 a 360' ");
        sb.append("WHEN CAST((T0.DocDate-T6.DocDueDate) AS int) > 361 THEN 'Mayor de 360' ELSE 'Sin vencer' END AS diasAtraso, CAST(T5.AppliedSys AS int) * -1 AS Valor, CAST(T0.DocDate AS date) AS fechaRecibo ");
        sb.append("FROM ORCT T0 INNER JOIN RCT2 T5 ON T0.DocEntry = T5.DocNum INNER JOIN OJDT T1 ON T0.TransId = T1.TransId INNER JOIN JDT1 T2 ON T1.TransId = T2.TransId ");
        sb.append("INNER JOIN ORIN T6 ON T6.DocEntry = T5.DocEntry WHERE YEAR(T0.DocDate) = YEAR(GETDATE()) AND MONTH(T0.DocDate) between MONTH(GETDATE())-1 AND MONTH(GETDATE()) AND ");
        sb.append("T2.Account >='11050505' AND T2.Account <='11250520' AND T0.Canceled = 'N' ");
        sb.append("UNION ALL ");
        sb.append("SELECT 'Sin vencer' AS diasAtraso, CAST(T0.NoDocSum AS int) AS Valor, CAST(T0.DocDate AS date) AS fechaRecibo ");
        sb.append("FROM ORCT T0 INNER JOIN OJDT T1 ON T0.TransId = T1.TransId INNER JOIN JDT1 T2 ON T1.TransId = T2.TransId WHERE YEAR(T0.DocDate) = YEAR(GETDATE()) AND ");
        sb.append("MONTH(T0.DocDate) between MONTH(GETDATE())-1 AND MONTH(GETDATE()) AND T2.Account >='11050505' AND T2.Account <='11250520' AND T0.paynodoc = 'Y' AND T0.Canceled = 'N' ");
        sb.append("UNION ALL ");
        sb.append("SELECT CASE WHEN CAST((T0.DocDate-T3.taxdate) AS int) < 0 THEN 'Sin vencer' WHEN (CAST((T0.DocDate-T3.taxdate) AS int) > 0 AND CAST((T0.DocDate-T3.taxdate) AS int) <= 20) THEN 'De 0 a 20' ");
        sb.append("WHEN (CAST((T0.DocDate-T3.taxdate) AS int) >= 21 AND CAST((T0.DocDate-T3.taxdate) AS int) <= 55) THEN 'De 21 a 55' ");
        sb.append("WHEN (CAST((T0.DocDate-T3.taxdate) AS int) >= 56 AND CAST((T0.DocDate-T3.taxdate) AS int) <= 120) THEN 'De 56 a 120' ");
        sb.append("WHEN (CAST((T0.DocDate-T3.taxdate) AS int) >= 121 AND CAST((T0.DocDate-T3.taxdate) AS int) <= 360) THEN 'De 121 a 360' WHEN CAST((T0.DocDate-T3.taxdate) AS int) > 361 THEN 'Mayor de 360' ");
        sb.append("ELSE 'Sin vencer' END AS diasAtraso, CAST(T5.AppliedSys AS int) AS Valor, CAST(T0.DocDate AS date) AS fechaRecibo ");
        sb.append("FROM ORCT T0 INNER JOIN RCT2 T5 ON T0.DocEntry = T5.DocNum INNER JOIN OJDT T1 ON T0.TransId = T1.TransId INNER JOIN JDT1 T2 ON T1.TransId = T2.TransId ");
        sb.append("INNER JOIN OJDT T3 ON T3.TransId = T5.DocTransId WHERE YEAR(T0.DocDate) = YEAR(GETDATE()) AND MONTH(T0.DocDate) between MONTH(GETDATE())-1 AND MONTH(GETDATE()) AND T5.InvType IN ('24','30') AND ");
        sb.append("T2.DebCred = 'C' AND T0.Canceled = 'N' ) AS t GROUP BY t.diasAtraso, DATENAME(MONTH, t.fechaRecibo) ORDER BY DATENAME(MONTH, t.fechaRecibo) DESC");
        try {

        } catch (NoResultException ex) {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando el recaudo para la empresa [");
        }
        return null;
    }
}