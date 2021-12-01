package co.igb.persistence.facade;

import co.igb.dto.PurchaseOrderDTO;
import co.igb.ejb.IGBApplicationBean;
import co.igb.util.Constants;
import co.igb.util.IGBUtils;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.persistence.NoResultException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jguisao
 */
@Stateless
public class PurchaseOrderFacade {
    private static final Logger CONSOLE = Logger.getLogger(PurchaseOrderFacade.class.getSimpleName());
    private static final String DB_TYPE_HANA = Constants.DATABASE_TYPE_HANA;
    @Inject
    private IGBApplicationBean applicationBean;
    @EJB
    private PersistenceConf persistenceConf;

    public PurchaseOrderFacade() {
    }

    public PurchaseOrderDTO find(String docNum, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(enc.\"Series\" as varchar(4)) series, ");
        sb.append(" cast(enc.\"DocEntry\"as int)docentry, ");
        sb.append(" cast(enc.\"DocNum\"as varchar(10)) docnum, ");
        sb.append(" cast(enc.\"DocDate\"as date) docdate, ");
        sb.append(" enc. \"DocTotal\", enc.\"DocTotalFC\", ");
        sb.append(" cast(enc.\"CardCode\"as varchar(20)) cardcode, ");
        sb.append(" cast(enc.\"CardName\"as varchar(100)) cardname, ");
        sb.append(" cast(det.\"ItemCode\"as varchar(50)) itemcode, ");
        sb.append(" cast(det.\"Dscription\"as varchar(100)) itemname, ");
        sb.append(" cast(det.\"OpenQty\"as int)quantity, ");
        sb.append(" cast(det.\"LineNum\"as int)linenum ");
        sb.append("from OPOR enc ");
        sb.append("inner join POR1 det on det.\"DocEntry\" = enc.\"DocEntry\"");
        sb.append("where enc.\"DocNum\" =");
        sb.append(docNum);
        sb.append(" and det.\"OpenQty\">0 ");
        sb.append("order by enc.\"DocDate\",det.\"LineNum\",det.\"ItemCode\"");
        try {
            PurchaseOrderDTO dto = new PurchaseOrderDTO();
            for (Object[] row : (List<Object[]>) persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList()) {
                if (dto.getDocNum() == null) {
                    dto.setSeries((String) row[0]);
                    dto.setDocEntry(((Integer) row[1]).longValue());
                    dto.setDocNum((String) row[2]);
                    dto.setDocDate((Date) row[3]);
                    dto.setDocTotal(((BigDecimal) row[4]).doubleValue());
                    dto.setDocTotalFC(((BigDecimal) row[5]).doubleValue());
                    dto.setCardCode((String) row[6]);
                    dto.setCardName((String) row[7]);
                }
                dto.addLine((String) row[8], (String) row[9], (Integer) row[10], (Integer) row[11]);
            }
            dto.setItems(dto.getLines().size());
            return dto;
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar la orden de compra. ", e);
            return null;
        }
    }

    private String listToString(String companyName) {
        StringBuilder sb = new StringBuilder();
        String parameterValue = IGBUtils.getProperParameter(applicationBean.obtenerValorPropiedad("igb.purchase.order.series"), companyName);
        for (String s : parameterValue.split("\\|")) {
            sb.append("'");
            sb.append(s);
            sb.append("',");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<PurchaseOrderDTO> findOpenOrders(String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(enc.\"Series\" as varchar(4)) series, cast(enc.\"DocNum\" as varchar(10)) docnum, ");
        sb.append(" cast(enc.\"DocDate\" as date) docdate, cast(enc.\"CardCode\" as varchar(20)) cardcode, cast(enc.\"CardName\" as varchar(100)) cardname, ");
        sb.append(" enc.\"DocTotal\", enc.\"DocTotalFC\", cast((select count(1) from POR1 det where det.\"DocEntry\" = enc.\"DocEntry\" and det.\"LineStatus\" = 'O') as int) items ");
        sb.append("from OPOR enc where enc.\"Series\" in (");
        sb.append(listToString(companyName));
        sb.append(") and enc.\"DocStatus\" = 'O' order by enc.\"DocDate\" ");
        List<PurchaseOrderDTO> orders = new ArrayList<>();
        try {
            for (Object[] row : (List<Object[]>) persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList()) {
                PurchaseOrderDTO dto = new PurchaseOrderDTO();
                dto.setSeries((String) row[0]);
                dto.setDocNum((String) row[1]);
                dto.setDocDate((Date) row[2]);
                dto.setCardCode((String) row[3]);
                dto.setCardName((String) row[4]);
                dto.setDocTotal(((BigDecimal) row[5]).doubleValue());
                dto.setDocTotalFC(((BigDecimal) row[6]).doubleValue());
                dto.setItems((Integer) row[7]);

                orders.add(dto);
            }
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar las ordenes de compra. ", e);
        }

        return orders;
    }

    public List<Object[]> listTrackingOrder(String docNum, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(t.\"CONCEPTO\" as varchar(100))as concept,cast(t.\"INFO\" as varchar(100))as info,cast(o.\"DocNum\" as varchar(10))as orden, ");
        sb.append(" cast(o.\"CardName\" as varchar(100))as Prov,cast(o.\"DocDate\" as date)as DocDate,cast(a.\"SlpName\" as varchar(50))as encargado, ");
        sb.append(" cast(case when o.\"U_TIPO_EMPAQUE\"=01 then 'NO APLICA' when o.\"U_TIPO_EMPAQUE\"=04 then 'CONTENEDOR 40' when o.\"U_TIPO_EMPAQUE\"=05 then 'CONTENEDOR 40 HC' ");
        sb.append("  when o.\"U_TIPO_EMPAQUE\"=02 then 'CARGA SUELTA' when o.\"U_TIPO_EMPAQUE\"=03 then 'CONTENEDOR 20' else '' end as varchar)as tipoEmpaque, ");
        sb.append(" cast(case when o.\"U_TIPO_EMPAQUE\"=02 then o.\"U_CBM\" || ' CBM' else o.\"U_CANT_CONTE\" || ' CONTENEDOR' end as varchar)as nro ");
        sb.append("from ( ");
        sb.append(" select 'Origen' as Concepto,cast(e.\"Name\" as varchar(100))as Info,p.\"DocNum\" ");
        sb.append(" from OPOR p ");
        sb.append(" left join \"@PUERTO_PROV\" e on p.\"U_PUERTO_EMB\"=e.\"Code\" ");
        sb.append(" where p.\"Series\"='48' ");
        sb.append("union all ");
        sb.append(" select 'Destino' as Concepto,cast(d.\"Name\" as varchar(100))as Info,p.\"DocNum\" ");
        sb.append(" from OPOR p ");
        sb.append(" left join \"@PUERTO_DES\" d on d.\"Code\"=p.\"U_PUERTO_DES\" ");
        sb.append(" where p.\"Series\"='48' ");
        sb.append("union all ");
        sb.append(" select 'Embarque' as Concepto,cast(cast(p.\"U_F_EMBARQUE\" as date)as varchar)as Info,p.\"DocNum\" ");
        sb.append(" from OPOR p ");
        sb.append(" where p.\"Series\"='48' ");
        sb.append("union all ");
        sb.append(" select 'Arribo Puerto' as Concepto,cast(cast(p.\"U_F_ARRIB_PUERTO\" as date)as varchar)as Info,p.\"DocNum\" ");
        sb.append(" from OPOR p ");
        sb.append(" where p.\"Series\"='48' ");
        sb.append("union all ");
        sb.append(" select 'Arribo Cedi' as Concepto,ifnull(cast(cast(p.\"U_Fecha_Arribo_CEDI\" as date)as varchar),'')as Info,p.\"DocNum\" ");
        sb.append(" from OPOR p ");
        sb.append(" where p.\"Series\"='48' ");
        sb.append("union all ");
        sb.append(" select 'Carga Puerto' as Concepto,ifnull(cast(cast(p.\"U_F_DOC_TRANSP\" as date)as varchar),'')as Info,p.\"DocNum\" ");
        sb.append(" from OPOR p ");
        sb.append(" where p.\"Series\"='48' ");
        sb.append("union all ");
        sb.append(" select 'Tiempo Tránsito' as Concepto,ifnull(cast(days_between(p.\"U_F_EMBARQUE\",p.\"U_Fecha_Arribo_CEDI\")as varchar),'Sin') || ' Días' as Info,p.\"DocNum\" ");
        sb.append(" from OPOR p ");
        sb.append(" where p.\"Series\"='48' ");
        sb.append("union all ");
        sb.append(" select 'Salida Puerto' as Concepto,ifnull(cast(cast(p.\"U_F_SALIDA_PUERTO\" as date)as varchar),'')as Info,p.\"DocNum\" ");
        sb.append(" from OPOR p ");
        sb.append(" where p.\"Series\"='48' ");
        sb.append("union all ");
        sb.append(" select 'Tiempo Puerto' as Concepto,ifnull(cast(days_between(p.\"U_F_ARRIB_PUERTO\",p.\"U_F_SALIDA_PUERTO\")as varchar),'Sin') || ' Días' as Info,p.\"DocNum\" ");
        sb.append(" from OPOR p ");
        sb.append(" where p.\"Series\"='48' ");
        sb.append("union all ");
        sb.append(" select 'Estado OC' as Concepto,cast(s.\"Name\" as varchar)as Info,p.\"DocNum\" ");
        sb.append(" from OPOR p ");
        sb.append(" left join \"@ESTADO_OC\" s on s.\"Code\"=p.\"U_ESTADO_OC\" ");
        sb.append(" where p.\"Series\"='48' ");
        sb.append("union all ");
        sb.append(" select 'Documento BL' as Concepto,cast(p.\"U_DOC_TRANSP\" as varchar) as Info,p.\"DocNum\" ");
        sb.append(" from OPOR p ");
        sb.append(" where p.\"Series\"='48' ");
        sb.append("union all ");
        sb.append(" select 'Observación' as Concepto,cast(p.\"U_OBSERVACION\" as varchar) as Info,p.\"DocNum\" ");
        sb.append(" from OPOR p ");
        sb.append(" where p.\"Series\"='48' ");
        sb.append(")as t ");
        sb.append("inner join OPOR o on o.\"DocNum\"=t.\"DocNum\" ");
        sb.append("inner join OSLP a on a.\"SlpCode\"=o.\"SlpCode\" ");
        sb.append("where t.\"DocNum\"=");
        sb.append(docNum);
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al listar el tracking para la orden de compra # " + docNum, e);
        }
        return null;
    }
}