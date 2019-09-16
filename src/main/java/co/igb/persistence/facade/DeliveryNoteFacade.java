package co.igb.persistence.facade;

import co.igb.util.Constants;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dbotero
 */
@Stateless
public class DeliveryNoteFacade {

    private static final Logger CONSOLE = Logger.getLogger(DeliveryNoteFacade.class.getSimpleName());
    private static final String DB_TYPE = Constants.DATABASE_TYPE_MSSQL;

    @EJB
    private PersistenceConf persistenceConf;

    public DeliveryNoteFacade() {
    }

    public List<Object[]> getDeliveryNoteData(Integer deliveryDocEntry, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(enc.docentry as int) docentry, cast(enc.docnum as int) docnum, cast(enc.objtype as int) objtype, ");
        sb.append("cast(enc.cardcode as varchar(20)) cardcode, cast(enc.slpcode as int) slpcode, cast(ISNULL(enc.cntctcode,'') as int) cntctcode, ");
        sb.append("cast(det.linenum as int) linenum, cast(det.itemcode as varchar(20)) itemcode, cast(det.quantity as int) quantity, ");
        sb.append("cast(enc.U_VR_DECLARADO as numeric(18,2)) valorDeclarado, cast(enc.Comments as varchar(250)) comentario, ");
        sb.append("cast(enc.DocTotal-enc.VatSum as numeric(18,2)) as valorNeto, cast(enc.VatSum as numeric(18,2)) as impuesto from odln enc ");
        sb.append("inner join dln1 det on det.docentry = enc.docentry where enc.docentry =");
        sb.append(deliveryDocEntry);
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los datos de la entrega. ", e);
            return new ArrayList<>();
        }
    }

    public Integer getCountDeliveryNote(Integer orderNumber, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select CAST(COUNT(e.DocNum) AS int) AS entrega ");
        sb.append("from ODLN e ");
        sb.append("inner Join DLN1 d On e.DocEntry = d.DocEntry ");
        sb.append("where d.BaseRef = ");
        sb.append(orderNumber);
        try {
            return (Integer) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar el documento de entrega. ", e);
            return null;
        }
    }

    public List getDetailDeliveryNoteData(Integer DocNum, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(d.itemcode as varchar(20)) itemcode, cast(d.quantity as int) quantity, cast(d.BaseRef as int) BaseRef ");
        sb.append("from ODLN e ");
        sb.append("inner join DLN1 d ON d.DocEntry = e.DocEntry ");
        sb.append("where e.DocNum = '");
        sb.append(DocNum);
        sb.append("'");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando el detalle de la entrega #" + DocNum);
            return null;
        }
    }

    public Integer getDocNumDeliveryNote(Integer orderNumber, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select DISTINCT cast(d.DocEntry as int) DocEntry ");
        sb.append("from DLN1 d where d.BaseRef =");
        sb.append(orderNumber);
        try {
            return (Integer) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando el numero de la entrega", e);
            return null;
        }
    }

    public Integer getDocNumSalesOrder(Integer docNum, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select DISTINCT cast(d.BaseRef as int) as BaseRef ");
        sb.append("from   ODLN e ");
        sb.append("inner  join DLN1 d ON e.DocEntry = d.DocEntry where e.DocNum = ");
        sb.append(docNum);
        try {
            return (Integer) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar la orden para la factura #[" + docNum.toString() + "]");
        }
        return null;
    }

    public Integer getDocNumInvoice(Integer orderNumber, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(v.DocNum as int) as DocNum ");
        sb.append("from  (select DISTINCT d.BaseRef, d.DocEntry from DLN1 d) d ");
        sb.append("inner join (select DISTINCT d.BaseRef, d.DocEntry from INV1 d where d.BaseType = '15') f ON f.BaseRef = d.DocEntry ");
        sb.append("inner join OINV v ON v.DocEntry = f.DocEntry where d.BaseRef = ");
        sb.append(orderNumber);
        try {
            return (Integer) persistenceConf.chooseSchema(companyName, testing, DB_TYPE).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando la factura desde la entrega", e);
        }
        return null;
    }
}