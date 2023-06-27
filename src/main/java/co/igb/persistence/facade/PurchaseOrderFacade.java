package co.igb.persistence.facade;

import co.igb.dto.PurchaseOrderDTO;
import co.igb.dto.UserFieldDTO;
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
        sb.append(" cast(case when o.\"U_TIPO_EMPAQUE\"=02 then o.\"U_CBM\" || ' CBM' else o.\"U_CANT_CONTE\" || ' CONTENEDOR' end as varchar)as nro,ifnull(cast(o.\"U_LIQUID_COMEX\" as varchar(5)),'0')as liq ");
        sb.append("from ( ");
        sb.append(" select 'Origen' as Concepto,ifnull(cast(e.\"Name\" as varchar(100)),'')as Info,p.\"DocNum\" ");
        sb.append(" from OPOR p ");
        sb.append(" left join \"@PUERTO_PROV\" e on p.\"U_PUERTO_EMB\"=e.\"Code\" ");
        if (companyName.contains("VARROC")) {
            sb.append(" where p.\"Series\"='16' ");
        } else {
            sb.append(" where p.\"Series\"='48' ");
        }
        sb.append("union all ");
        sb.append(" select 'Destino' as Concepto,ifnull(cast(d.\"Name\" as varchar(100)),'')as Info,p.\"DocNum\" ");
        sb.append(" from OPOR p ");
        sb.append(" left join \"@PUERTO_DES\" d on d.\"Code\"=p.\"U_PUERTO_DES\" ");
        if (companyName.contains("VARROC")) {
            sb.append(" where p.\"Series\"='16' ");
        } else {
            sb.append(" where p.\"Series\"='48' ");
        }
        sb.append("union all ");
        sb.append(" select 'Carga Puerto Origen' as Concepto,ifnull(cast(cast(p.\"U_F_DOC_TRANSP\" as date)as varchar),'')as Info,p.\"DocNum\" ");
        sb.append(" from OPOR p ");
        if (companyName.contains("VARROC")) {
            sb.append(" where p.\"Series\"='16' ");
        } else {
            sb.append(" where p.\"Series\"='48' ");
        }
        sb.append("union all ");
        sb.append(" select 'Embarque' as Concepto,ifnull(cast(cast(p.\"U_F_EMBARQUE\" as date)as varchar),'')as Info,p.\"DocNum\" ");
        sb.append(" from OPOR p ");
        if (companyName.contains("VARROC")) {
            sb.append(" where p.\"Series\"='16' ");
        } else {
            sb.append(" where p.\"Series\"='48' ");
        }
        sb.append("union all ");
        sb.append(" select 'Arribo Puerto' as Concepto,ifnull(cast(cast(p.\"U_F_ARRIB_PUERTO\" as date)as varchar),'')as Info,p.\"DocNum\" ");
        sb.append(" from OPOR p ");
        if (companyName.contains("VARROC")) {
            sb.append(" where p.\"Series\"='16' ");
        } else {
            sb.append(" where p.\"Series\"='48' ");
        }
        sb.append("union all ");
        sb.append(" select 'Arribo Cedi' as Concepto,ifnull(cast(cast(p.\"U_Fecha_Arribo_CEDI\" as date)as varchar),'')as Info,p.\"DocNum\" ");
        sb.append(" from OPOR p ");
        if (companyName.contains("VARROC")) {
            sb.append(" where p.\"Series\"='16' ");
        } else {
            sb.append(" where p.\"Series\"='48' ");
        }
        sb.append("union all ");
        sb.append(" select 'Tiempo Tránsito' as Concepto,ifnull(cast(days_between(p.\"U_F_EMBARQUE\",p.\"U_Fecha_Arribo_CEDI\")as varchar),'Sin') || ' Días' as Info,p.\"DocNum\" ");
        sb.append(" from OPOR p ");
        if (companyName.contains("VARROC")) {
            sb.append(" where p.\"Series\"='16' ");
        } else {
            sb.append(" where p.\"Series\"='48' ");
        }
        sb.append("union all ");
        sb.append(" select 'Salida Puerto Destino' as Concepto,ifnull(cast(cast(p.\"U_F_SALIDA_PUERTO\" as date)as varchar),'')as Info,p.\"DocNum\" ");
        sb.append(" from OPOR p ");
        if (companyName.contains("VARROC")) {
            sb.append(" where p.\"Series\"='16' ");
        } else {
            sb.append(" where p.\"Series\"='48' ");
        }
        sb.append("union all ");
        sb.append(" select 'Tiempo Puerto' as Concepto,ifnull(cast(days_between(p.\"U_F_ARRIB_PUERTO\",p.\"U_F_SALIDA_PUERTO\")as varchar),'Sin') || ' Días' as Info,p.\"DocNum\" ");
        sb.append(" from OPOR p ");
        if (companyName.contains("VARROC")) {
            sb.append(" where p.\"Series\"='16' ");
        } else {
            sb.append(" where p.\"Series\"='48' ");
        }
        sb.append("union all ");
        sb.append(" select 'Estado OC' as Concepto,ifnull(cast(s.\"Name\" as varchar),'')as Info,p.\"DocNum\" ");
        sb.append(" from OPOR p ");
        sb.append(" left join \"@ESTADO_OC\" s on s.\"Code\"=p.\"U_ESTADO_OC\" ");
        if (companyName.contains("VARROC")) {
            sb.append(" where p.\"Series\"='16' ");
        } else {
            sb.append(" where p.\"Series\"='48' ");
        }
        sb.append("union all ");
        sb.append(" select 'Documento BL' as Concepto,ifnull(cast(p.\"U_DOC_TRANSP\" as varchar),'')as Info,p.\"DocNum\" ");
        sb.append(" from OPOR p ");
        if (companyName.contains("VARROC")) {
            sb.append(" where p.\"Series\"='16' ");
        } else {
            sb.append(" where p.\"Series\"='48' ");
        }
        sb.append("union all ");
        sb.append(" select 'Observación' as Concepto,ifnull(cast(p.\"U_OBSERVACION\" as varchar(254)),'')as Info,p.\"DocNum\" ");
        sb.append(" from OPOR p ");
        if (companyName.contains("VARROC")) {
            sb.append(" where p.\"Series\"='16' ");
        } else {
            sb.append(" where p.\"Series\"='48' ");
        }
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

    public Object[] loadUserFields(String docNum, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(\"DocNum\" as int)as docNum,cast(\"U_TRANSP\" as varchar)as transp,cast(\"U_F_EMBARQUE\" as date)as fEmbarque,cast(\"U_TERM_NEG\" as varchar)as termNeg, ");
        sb.append(" cast(\"U_MOD_TRANSP\" as varchar)as modTranp,cast(\"U_PUERTO_DES\" as varchar)as puertDes,cast(\"U_ESTADO_OC\" as varchar)as estOC,cast(\"U_EMBARCADO\" as varchar)as embarc, ");
        sb.append(" cast(\"U_DOC_TRANSP\" as varchar)as docTras,cast(\"U_F_DOC_TRANSP\" as date)as fDocTras,cast(\"U_F_ARRIB_PUERTO\" as date)as fArribPuert,cast(\"U_F_ARRIB_ALMA\" as date)as fArribAlm, ");
        sb.append(" cast(\"U_TIPO_EMPAQUE\" as varchar)as tipoEmp,cast(\"U_OBSERVACION\" as varchar)as observ,cast(\"U_PUERTO_EMB\" as varchar)as puertEmb,cast(\"U_TRANSP_TERR\" as varchar)as transpTerr, ");
        sb.append(" cast(\"U_Fecha_Arribo_CEDI\" as date)as fArriboCed,ifnull(cast(\"U_CANT_CONTE\" as int),0)as cantCont,cast(\"U_CBM\" as varchar)as cbm,cast(\"U_F_CARGA_LISTA\" as date)as fCargaList, ");
        sb.append(" cast(\"U_TIEMPO_TRANSITO\" as varchar)as tiempTrans,cast(\"U_F_SALIDA_PUERTO\" as date)as fSalPuert,cast(\"U_TIEMPO_PUERTO\" as varchar)as tiempPuert, ");
        sb.append(" ifnull(cast(\"U_TIEMPO_ENT_COMEX\" as int),0)as tiempEntComex,cast(\"U_F_BOOKING\" as date)as fbooking,ifnull(cast(\"U_TIEMPO_ESP_BOOKING\" as int),0)as tiempEspBooking, ");
        sb.append(" cast(\"U_F_ESTIM_EMBARQUE\" as date)as fEstimEmb,cast(\"U_F_REC_DOC_FINAL\" as date)as fRecDocFin,cast(\"U_EMISION_BL\" as varchar)as emisBL,cast(\"U_INSPECCION\" as varchar)as insp, ");
        sb.append(" cast(\"U_F_ARRIBO_CEDI_EST\" as date)as fArribCedEst,cast(\"U_NotificationBL\" as varchar)as notifBL,cast(\"U_LIQUID_COMEX\" as varchar)as liqComex,cast(\"U_F_LIQUIDACION\" as date)as fLiq, ");
        sb.append(" cast(\"U_F_LIB_BL\" as date)as fLibBL,cast(\"U_CONDUCTOR\" as varchar)as conduct,ifnull(cast(\"U_CEDULA_CON\" as int),0)as cedulCond,cast(\"U_PLACA\" as varchar)as placa, ");
        sb.append(" cast(\"U_CONTENEDOR\" as varchar)as contened,cast(\"U_PRECINTO\" as varchar) as precint,cast(\"U_ENVIAR_DATOS_CON\" as varchar)as enviarDatos,cast(\"U_Vendedor_2\" as varchar)as vendedor, ");
        sb.append(" cast(\"DocDate\" as date)as DocDate ");
        sb.append("from OPOR e ");
        sb.append("where e.\"DocNum\"=");
        sb.append(docNum);
        try {
            return (Object[]) persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getSingleResult();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultado los UDF para la orden de compra #" + docNum + " en " + companyName, e);
        }
        return null;
    }

    public boolean updateFieldUser(UserFieldDTO dto, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("update OPOR set ");
        sb.append("\"U_TRANSP\"='");
        sb.append(dto.getTransp());
        sb.append("',\"U_F_EMBARQUE\"='");
        sb.append(dto.getFembarque());
        sb.append("',\"U_TERM_NEG\"='");
        sb.append(dto.getTermNeg());
        sb.append("',\"U_MOD_TRANSP\"='");
        sb.append(dto.getModTranp());
        sb.append("',\"U_PUERTO_DES\"='");
        sb.append(dto.getPuertDes());
        sb.append("',\"U_TRANSP_TERR\"='");
        sb.append(dto.getTranspTerr());
        sb.append("',\"U_Fecha_Arribo_CEDI\"='");
        sb.append(dto.getFarriboCed());
        sb.append("',\"U_CANT_CONTE\"=");
        sb.append(dto.getCantCont());
        sb.append(",\"U_CBM\"='");
        sb.append(dto.getCbm());
        sb.append("',\"U_F_CARGA_LISTA\"='");
        sb.append(dto.getFcargaList());
        sb.append("',\"U_TIEMPO_TRANSITO\"='");
        sb.append(dto.getTiempTrans());
        sb.append("',\"U_F_SALIDA_PUERTO\"='");
        sb.append(dto.getFsalPuert());
        sb.append("',\"U_TIEMPO_PUERTO\"='");
        sb.append(dto.getTiempPuert());
        sb.append("',\"U_TIEMPO_ENT_COMEX\"=");
        sb.append(dto.getTiempEntComex());
        sb.append(",\"U_F_BOOKING\"='");
        sb.append(dto.getFbooking());
        sb.append("',\"U_TIEMPO_ESP_BOOKING\"=");
        sb.append(dto.getTiempEspBooking());
        sb.append(",\"U_F_ESTIM_EMBARQUE\"='");
        sb.append(dto.getFestimEmb());
        sb.append("',\"U_F_REC_DOC_FINAL\"='");
        sb.append(dto.getFrecDocFin());
        sb.append("',\"U_EMISION_BL\"='");
        sb.append(dto.getEmisBL());
        sb.append("',\"U_INSPECCION\"='");
        sb.append(dto.getInsp());
        sb.append("',\"U_F_ARRIBO_CEDI_EST\"='");
        sb.append(dto.getFarribCedEst());
        sb.append("',\"U_NotificationBL\"='");
        sb.append(dto.getNotifBL());
        sb.append("',\"U_LIQUID_COMEX\"='");
        sb.append(dto.getLiqComex());
        sb.append("',\"U_F_LIQUIDACION\"='");
        sb.append(dto.getFliq());
        sb.append("',\"U_F_LIB_BL\"='");
        sb.append(dto.getFlibBL());
        sb.append("',\"U_CONDUCTOR\"='");
        sb.append(dto.getConduct());
        sb.append("',\"U_CEDULA_CON\"=");
        sb.append(dto.getCedulCond());
        sb.append(",\"U_PLACA\"='");
        sb.append(dto.getPlaca());
        sb.append("',\"U_CONTENEDOR\"='");
        sb.append(dto.getContened());
        sb.append("',\"U_PRECINTO\"='");
        sb.append(dto.getPrecint());
        sb.append("',\"U_ENVIAR_DATOS_CON\"='");
        sb.append(dto.getEnviarDatos());
        sb.append("',\"U_Vendedor_2\"='");
        sb.append(dto.getVendedor());
        sb.append("',\"U_OBSERVACION\"='");
        sb.append(dto.getObserv());
        sb.append("',\"U_F_ARRIB_PUERTO\"='");
        sb.append(dto.getFarribPuert());
        sb.append("', \"U_F_ARRIB_ALMA\"='");
        sb.append(dto.getFarribAlm());
        sb.append("', \"U_DOC_TRANSP\"='");
        sb.append(dto.getDocTras());
        sb.append("', \"U_ESTADO_OC\"='");
        sb.append(dto.getEstOC());
        sb.append("', \"U_EMBARCADO\"='");
        sb.append(dto.getEmbarc());
        sb.append("', \"U_F_DOC_TRANSP\"='");
        sb.append(dto.getFdocTras());
        sb.append("', \"U_TIPO_EMPAQUE\"='");
        sb.append(dto.getTipoEmp());
        sb.append("', \"U_PUERTO_EMB\"='");
        sb.append(dto.getPuertEmb());
        sb.append("' where \"DocNum\"=");
        sb.append(dto.getDocNum());

        CONSOLE.log(Level.INFO, sb.toString());
        try {
            persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).executeUpdate();
            return true;
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error actualizando los campos de usuario para la orden de compra #" + dto.getDocNum() + " en " + companyName, e);
            return false;
        }
        return false;
    }

    public List<Object[]> listTimeOperation(Integer year, Integer month, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select f.yy,f.mm,f.nameMes,f.userName,sum(f.timeEstCs)as timeEstCs,sum(f.timeRealCs)as timeRealCs,sum(f.timeEstCt)as timeEstCt,sum(f.timeRealCt)as timeRealCt ");
        sb.append("from( ");
        sb.append(" select t.yy,t.mm,t.nameMes,t.userName,sum(t.timeEstCs)as timeEstCs,avg(t.timeRealCs)as timeRealCs,sum(timeEstCt)as timeEstCt,avg(timeRealCt)as timeRealCt ");
        sb.append(" from( ");
        sb.append("  select cast(year(pe.\"U_Fecha_Arribo_CEDI\")as varchar(5))as yy,cast(m.\"U_Value\" as int)as mm,cast(m.\"U_MonthName\" as varchar(30))as nameMes, ");
        sb.append("   cast(ifnull(pe.\"U_Vendedor_2\",'SIN ASIGNAR')as varchar(100))as userName,0 as timeEstCs,0 as timeRealCs,8 as timeEstCt, ");
        sb.append("   cast(ifnull(days_between(pe.\"U_F_ARRIB_PUERTO\",pe.\"U_Fecha_Arribo_CEDI\"),0)as decimal(10,2))as timeRealCt ");
        sb.append("  from OPOR pe ");
        sb.append("  inner join \"@SPT_VALUES\" m on month(pe.\"U_Fecha_Arribo_CEDI\")=m.\"U_Value\" ");
        sb.append("  where pe.\"Series\"='48' and pe.\"U_ESTADO_OC\" in('07','09') and pe.\"U_TIPO_EMPAQUE\"<>02 and year(pe.\"U_Fecha_Arribo_CEDI\")='");
        sb.append(year);
        sb.append("' and m.\"U_Value\"=");
        sb.append(month);
        sb.append(" )as t ");
        sb.append(" group by t.yy,t.mm,t.nameMes,t.userName ");
        sb.append("union all ");
        sb.append(" select t.yy,t.mm,t.nameMes,t.userName,sum(t.timeEstCs)as timeEstCs,avg(t.timeRealCs)as timeRealCs,sum(timeEstCt)as timeEstCt,avg(timeRealCt)as timeRealCt ");
        sb.append(" from( ");
        sb.append("  select cast(year(pe.\"U_Fecha_Arribo_CEDI\")as int)as yy,cast(m.\"U_Value\" as int)as mm,cast(m.\"U_MonthName\" as varchar(30))as nameMes,");
        sb.append("   cast(ifnull(pe.\"U_Vendedor_2\",'SIN ASIGNAR')as varchar(100))as userName,10 as timeEstCs, ");
        sb.append("   cast(ifnull(days_between(pe.\"U_F_ARRIB_PUERTO\",pe.\"U_Fecha_Arribo_CEDI\"),0)as decimal(10,2))as timeRealCs,0 as timeEstCt,0 as timeRealCt ");
        sb.append("  from OPOR pe ");
        sb.append("  inner join \"@SPT_VALUES\" m on month(pe.\"U_Fecha_Arribo_CEDI\")=m.\"U_Value\" ");
        sb.append("  where pe.\"Series\"='48' and pe.\"U_ESTADO_OC\" in('07','09') and pe.\"U_TIPO_EMPAQUE\"=02 and year(pe.\"U_Fecha_Arribo_CEDI\")='");
        sb.append(year);
        sb.append("' and m.\"U_Value\"=");
        sb.append(month);
        sb.append(" )as t ");
        sb.append(" group by t.yy,t.mm,t.nameMes,t.userName ");
        sb.append(")as f ");
        sb.append("group by f.yy,f.mm,f.nameMes,f.userName");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando el tiempo de operacion de comex en " + companyName, e);
        }
        return new ArrayList<>();
    }

    public List<Object[]> listTimeLiquid(Integer year, Integer month, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select f.yy,f.mm,f.nameMes,f.userName,sum(f.timeEstCs)as timeEstCs,sum(f.timeRealCs)as timeRealCs,sum(f.timeEstCt)as timeEstCt,sum(f.timeRealCt)as timeRealCt ");
        sb.append("from( ");
        sb.append(" select t.yy,t.mm,t.nameMes,t.userName,sum(t.timeEstCs)as timeEstCs,avg(t.timeRealCs)as timeRealCs,sum(timeEstCt)as timeEstCt,avg(timeRealCt)as timeRealCt ");
        sb.append(" from( ");
        sb.append("  select cast(year(pe.\"U_Fecha_Arribo_CEDI\")as varchar(5))as yy,cast(m.\"U_Value\" as int)as mm,cast(m.\"U_MonthName\" as varchar(30))as nameMes, ");
        sb.append("   cast(ifnull(pe.\"U_Vendedor_2\",'SIN ASIGNAR')as varchar(100))as userName,0 as timeEstCs,0 as timeRealCs,1 as timeEstCt, ");
        sb.append("   cast(ifnull(days_between(pe.\"U_F_SALIDA_PUERTO\",pe.\"U_F_LIQUIDACION\"),0)as decimal(10,2))as timeRealCt ");
        sb.append("  from OPOR pe ");
        sb.append("  inner join \"@SPT_VALUES\" m on month(pe.\"U_Fecha_Arribo_CEDI\")=m.\"U_Value\" ");
        sb.append("  where pe.\"Series\"='48' and pe.\"U_ESTADO_OC\" in('07','09') and pe.\"U_TIPO_EMPAQUE\"<>02 and year(pe.\"U_Fecha_Arribo_CEDI\")='");
        sb.append(year);
        sb.append("' and m.\"U_Value\"=");
        sb.append(month);
        sb.append(" )as t ");
        sb.append(" group by t.yy,t.mm,t.nameMes,t.userName ");
        sb.append("union all ");
        sb.append(" select t.yy,t.mm,t.nameMes,t.userName,sum(t.timeEstCs)as timeEstCs,avg(t.timeRealCs)as timeRealCs,sum(timeEstCt)as timeEstCt,avg(timeRealCt)as timeRealCt ");
        sb.append(" from( ");
        sb.append("  select cast(year(pe.\"U_Fecha_Arribo_CEDI\")as int)as yy,cast(m.\"U_Value\" as int)as mm,cast(m.\"U_MonthName\" as varchar(30))as nameMes,");
        sb.append("   cast(ifnull(pe.\"U_Vendedor_2\",'SIN ASIGNAR')as varchar(100))as userName,1 as timeEstCs, ");
        sb.append("   cast(ifnull(days_between(pe.\"U_F_SALIDA_PUERTO\",pe.\"U_F_LIQUIDACION\"),0)as decimal(10,2))as timeRealCs,0 as timeEstCt,0 as timeRealCt ");
        sb.append("  from OPOR pe ");
        sb.append("  inner join \"@SPT_VALUES\" m on month(pe.\"U_Fecha_Arribo_CEDI\")=m.\"U_Value\" ");
        sb.append("  where pe.\"Series\"='48' and pe.\"U_ESTADO_OC\" in('07','09') and pe.\"U_TIPO_EMPAQUE\"=02 and year(pe.\"U_Fecha_Arribo_CEDI\")='");
        sb.append(year);
        sb.append("' and m.\"U_Value\"=");
        sb.append(month);
        sb.append(" )as t ");
        sb.append(" group by t.yy,t.mm,t.nameMes,t.userName ");
        sb.append(")as f ");
        sb.append("group by f.yy,f.mm,f.nameMes,f.userName");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando el tiempo de liquidacion de comex en " + companyName, e);
        }
        return new ArrayList<>();
    }

    public List<Object[]> listBooking(Integer year, Integer month, String companyName, boolean testing) {
        StringBuilder sb = new StringBuilder();
        sb.append("select f.yy,f.mm,f.nameMes,f.userName,sum(f.timeEstCs)as timeEstCs,sum(f.timeRealCs)as timeRealCs,sum(f.timeEstCt)as timeEstCt,sum(f.timeRealCt)as timeRealCt ");
        sb.append("from( ");
        sb.append(" select t.yy,t.mm,t.nameMes,t.userName,sum(t.timeEstCs)as timeEstCs,avg(t.timeRealCs)as timeRealCs,sum(timeEstCt)as timeEstCt,avg(timeRealCt)as timeRealCt ");
        sb.append(" from( ");
        sb.append("  select cast(year(pe.\"U_F_BOOKING\")as varchar(5))as yy,cast(m.\"U_Value\" as int)as mm,cast(m.\"U_MonthName\" as varchar(30))as nameMes, ");
        sb.append("   cast(ifnull(pe.\"U_Vendedor_2\",'SIN ASIGNAR')as varchar(100))as userName,0 as timeEstCs,0 as timeRealCs,3 as timeEstCt, ");
        sb.append("   cast(ifnull(days_between(pe.\"U_F_CARGA_LISTA\",pe.\"U_F_BOOKING\"),0)as decimal(10,2))as timeRealCt ");
        sb.append("  from OPOR pe ");
        sb.append("  inner join \"@SPT_VALUES\" m on month(pe.\"U_F_BOOKING\")=m.\"U_Value\" ");
        sb.append("  where pe.\"Series\"='48' and pe.\"U_TIPO_EMPAQUE\"<>02 and year(pe.\"U_F_BOOKING\")='");
        sb.append(year);
        sb.append("' and m.\"U_Value\"=");
        sb.append(month);
        sb.append(" )as t ");
        sb.append(" group by t.yy,t.mm,t.nameMes,t.userName ");
        sb.append("union all ");
        sb.append(" select t.yy,t.mm,t.nameMes,t.userName,sum(t.timeEstCs)as timeEstCs,avg(t.timeRealCs)as timeRealCs,sum(timeEstCt)as timeEstCt,avg(timeRealCt)as timeRealCt ");
        sb.append(" from( ");
        sb.append("  select cast(year(pe.\"U_F_BOOKING\")as int)as yy,cast(m.\"U_Value\" as int)as mm,cast(m.\"U_MonthName\" as varchar(30))as nameMes,");
        sb.append("   cast(ifnull(pe.\"U_Vendedor_2\",'SIN ASIGNAR')as varchar(100))as userName,3 as timeEstCs, ");
        sb.append("   cast(ifnull(days_between(pe.\"U_F_CARGA_LISTA\",pe.\"U_F_BOOKING\"),0)as decimal(10,2))as timeRealCs,0 as timeEstCt,0 as timeRealCt ");
        sb.append("  from OPOR pe ");
        sb.append("  inner join \"@SPT_VALUES\" m on month(pe.\"U_F_BOOKING\")=m.\"U_Value\" ");
        sb.append("  where pe.\"Series\"='48' and pe.\"U_TIPO_EMPAQUE\"=02 and year(pe.\"U_F_BOOKING\")='");
        sb.append(year);
        sb.append("' and m.\"U_Value\"=");
        sb.append(month);
        sb.append(" )as t ");
        sb.append(" group by t.yy,t.mm,t.nameMes,t.userName ");
        sb.append(")as f ");
        sb.append("group by f.yy,f.mm,f.nameMes,f.userName");
        try {
            return persistenceConf.chooseSchema(companyName, testing, DB_TYPE_HANA).createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException ex) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error consultando el booking de comex en " + companyName, e);
        }
        return new ArrayList<>();
    }
}