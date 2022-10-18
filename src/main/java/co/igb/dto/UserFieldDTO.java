package co.igb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserFieldDTO {
    private String transp;
    private Date fembarque;
    private String termNeg;
    private String modTranp;
    private String puertDes;
    private String estOC;
    private String embarc;
    private String docTras;
    private Date fdocTras;
    private Date farribPuert;
    private Date farribAlm;
    private String tipoEmp;
    private String observ;
    private String puertEmb;
    private String transpTerr;
    private Date farriboCed;
    private int cantCont;
    private String cbm;
    private Date fcargaList;
    private String tiempTrans;
    private Date fsalPuert;
    private String tiempPuert;
    private String tiempEntComex;
    private Date fbooking;
    private String tiempEspBooking;
    private Date festimEmb;
    private Date frecDocFin;
    private String emisBL;
    private String insp;
    private Date farribCedEst;
    private String notifBL;
    private String liqComex;
    private Date fliq;
    private Date flibBL;
    private String conduct;
    private String cedulCond;
    private String placa;
    private String contened;
    private String precint;
    private String enviarDatos;
    private String vendedor;
    private String docNum;

    public UserFieldDTO() {
    }

    public UserFieldDTO(String transp, Date fembarque, String termNeg, String modTranp, String puertDes, String estOC, String embarc, String docTras, Date fdocTras, Date farribPuert, Date farribAlm, String tipoEmp, String observ, String puertEmb, String transpTerr, Date farriboCed, int cantCont, String cbm, Date fcargaList, String tiempTrans, Date fsalPuert, String tiempPuert, String tiempEntComex, Date fbooking, String tiempEspBooking, Date festimEmb, Date frecDocFin, String emisBL, String insp, Date farribCedEst, String notifBL, String liqComex, Date fliq, Date flibBL, String conduct, String cedulCond, String placa, String contened, String precint, String enviarDatos, String vendedor) {
        this.transp = transp;
        this.fembarque = fembarque;
        this.termNeg = termNeg;
        this.modTranp = modTranp;
        this.puertDes = puertDes;
        this.estOC = estOC;
        this.embarc = embarc;
        this.docTras = docTras;
        this.fdocTras = fdocTras;
        this.farribPuert = farribPuert;
        this.farribAlm = farribAlm;
        this.tipoEmp = tipoEmp;
        this.observ = observ;
        this.puertEmb = puertEmb;
        this.transpTerr = transpTerr;
        this.farriboCed = farriboCed;
        this.cantCont = cantCont;
        this.cbm = cbm;
        this.fcargaList = fcargaList;
        this.tiempTrans = tiempTrans;
        this.fsalPuert = fsalPuert;
        this.tiempPuert = tiempPuert;
        this.tiempEntComex = tiempEntComex;
        this.fbooking = fbooking;
        this.tiempEspBooking = tiempEspBooking;
        this.festimEmb = festimEmb;
        this.frecDocFin = frecDocFin;
        this.emisBL = emisBL;
        this.insp = insp;
        this.farribCedEst = farribCedEst;
        this.notifBL = notifBL;
        this.liqComex = liqComex;
        this.fliq = fliq;
        this.flibBL = flibBL;
        this.conduct = conduct;
        this.cedulCond = cedulCond;
        this.placa = placa;
        this.contened = contened;
        this.precint = precint;
        this.enviarDatos = enviarDatos;
        this.vendedor = vendedor;
    }

    public String getTransp() {
        return transp;
    }

    public void setTransp(String transp) {
        this.transp = transp;
    }

    public Date getFembarque() {
        return fembarque;
    }

    public void setFembarque(Date fembarque) {
        this.fembarque = fembarque;
    }

    public String getTermNeg() {
        return termNeg;
    }

    public void setTermNeg(String termNeg) {
        this.termNeg = termNeg;
    }

    public String getModTranp() {
        return modTranp;
    }

    public void setModTranp(String modTranp) {
        this.modTranp = modTranp;
    }

    public String getPuertDes() {
        return puertDes;
    }

    public void setPuertDes(String puertDes) {
        this.puertDes = puertDes;
    }

    public String getEstOC() {
        return estOC;
    }

    public void setEstOC(String estOC) {
        this.estOC = estOC;
    }

    public String getEmbarc() {
        return embarc;
    }

    public void setEmbarc(String embarc) {
        this.embarc = embarc;
    }

    public String getDocTras() {
        return docTras;
    }

    public void setDocTras(String docTras) {
        this.docTras = docTras;
    }

    public Date getFdocTras() {
        return fdocTras;
    }

    public void setFdocTras(Date fdocTras) {
        this.fdocTras = fdocTras;
    }

    public Date getFarribPuert() {
        return farribPuert;
    }

    public void setFarribPuert(Date farribPuert) {
        this.farribPuert = farribPuert;
    }

    public Date getFarribAlm() {
        return farribAlm;
    }

    public void setFarribAlm(Date farribAlm) {
        this.farribAlm = farribAlm;
    }

    public String getTipoEmp() {
        return tipoEmp;
    }

    public void setTipoEmp(String tipoEmp) {
        this.tipoEmp = tipoEmp;
    }

    public String getObserv() {
        return observ;
    }

    public void setObserv(String observ) {
        this.observ = observ;
    }

    public String getPuertEmb() {
        return puertEmb;
    }

    public void setPuertEmb(String puertEmb) {
        this.puertEmb = puertEmb;
    }

    public String getTranspTerr() {
        return transpTerr;
    }

    public void setTranspTerr(String transpTerr) {
        this.transpTerr = transpTerr;
    }

    public Date getFarriboCed() {
        return farriboCed;
    }

    public void setFarriboCed(Date farriboCed) {
        this.farriboCed = farriboCed;
    }

    public int getCantCont() {
        return cantCont;
    }

    public void setCantCont(int cantCont) {
        this.cantCont = cantCont;
    }

    public String getCbm() {
        return cbm;
    }

    public void setCbm(String cbm) {
        this.cbm = cbm;
    }

    public Date getFcargaList() {
        return fcargaList;
    }

    public void setFcargaList(Date fcargaList) {
        this.fcargaList = fcargaList;
    }

    public String getTiempTrans() {
        return tiempTrans;
    }

    public void setTiempTrans(String tiempTrans) {
        this.tiempTrans = tiempTrans;
    }

    public Date getFsalPuert() {
        return fsalPuert;
    }

    public void setFsalPuert(Date fsalPuert) {
        this.fsalPuert = fsalPuert;
    }

    public String getTiempPuert() {
        return tiempPuert;
    }

    public void setTiempPuert(String tiempPuert) {
        this.tiempPuert = tiempPuert;
    }

    public String getTiempEntComex() {
        return tiempEntComex;
    }

    public void setTiempEntComex(String tiempEntComex) {
        this.tiempEntComex = tiempEntComex;
    }

    public Date getFbooking() {
        return fbooking;
    }

    public void setFbooking(Date fbooking) {
        this.fbooking = fbooking;
    }

    public String getTiempEspBooking() {
        return tiempEspBooking;
    }

    public void setTiempEspBooking(String tiempEspBooking) {
        this.tiempEspBooking = tiempEspBooking;
    }

    public Date getFestimEmb() {
        return festimEmb;
    }

    public void setFestimEmb(Date festimEmb) {
        this.festimEmb = festimEmb;
    }

    public Date getFrecDocFin() {
        return frecDocFin;
    }

    public void setFrecDocFin(Date frecDocFin) {
        this.frecDocFin = frecDocFin;
    }

    public String getEmisBL() {
        return emisBL;
    }

    public void setEmisBL(String emisBL) {
        this.emisBL = emisBL;
    }

    public String getInsp() {
        return insp;
    }

    public void setInsp(String insp) {
        this.insp = insp;
    }

    public Date getFarribCedEst() {
        return farribCedEst;
    }

    public void setFarribCedEst(Date farribCedEst) {
        this.farribCedEst = farribCedEst;
    }

    public String getNotifBL() {
        return notifBL;
    }

    public void setNotifBL(String notifBL) {
        this.notifBL = notifBL;
    }

    public String getLiqComex() {
        return liqComex;
    }

    public void setLiqComex(String liqComex) {
        this.liqComex = liqComex;
    }

    public Date getFliq() {
        return fliq;
    }

    public void setFliq(Date fliq) {
        this.fliq = fliq;
    }

    public Date getFlibBL() {
        return flibBL;
    }

    public void setFlibBL(Date flibBL) {
        this.flibBL = flibBL;
    }

    public String getConduct() {
        return conduct;
    }

    public void setConduct(String conduct) {
        this.conduct = conduct;
    }

    public String getCedulCond() {
        return cedulCond;
    }

    public void setCedulCond(String cedulCond) {
        this.cedulCond = cedulCond;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getContened() {
        return contened;
    }

    public void setContened(String contened) {
        this.contened = contened;
    }

    public String getPrecint() {
        return precint;
    }

    public void setPrecint(String precint) {
        this.precint = precint;
    }

    public String getEnviarDatos() {
        return enviarDatos;
    }

    public void setEnviarDatos(String enviarDatos) {
        this.enviarDatos = enviarDatos;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getDocNum() {
        return docNum;
    }

    public void setDocNum(String docNum) {
        this.docNum = docNum;
    }
}