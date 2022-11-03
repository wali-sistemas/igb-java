package co.igb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserFieldDTO {
    private String transp;
    private String fembarque;
    private String termNeg;
    private String modTranp;
    private String puertDes;
    private String estOC;
    private String embarc;
    private String docTras;
    private String fdocTras;
    private String farribPuert;
    private String farribAlm;
    private String tipoEmp;
    private String observ;
    private String puertEmb;
    private String transpTerr;
    private String farriboCed;
    private Integer cantCont;
    private String cbm;
    private String fcargaList;
    private String tiempTrans;
    private String fsalPuert;
    private String tiempPuert;
    private Integer tiempEntComex;
    private String fbooking;
    private Integer tiempEspBooking;
    private String festimEmb;
    private String frecDocFin;
    private String emisBL;
    private String insp;
    private String farribCedEst;
    private String notifBL;
    private String liqComex;
    private String fliq;
    private String flibBL;
    private String conduct;
    private Integer cedulCond;
    private String placa;
    private String contened;
    private String precint;
    private String enviarDatos;
    private String vendedor;
    private String docNum;

    public UserFieldDTO() {
    }

    public UserFieldDTO(String transp, String fembarque, String termNeg, String modTranp, String puertDes, String estOC, String embarc, String docTras, String fdocTras, String farribPuert, String farribAlm, String tipoEmp, String observ, String puertEmb, String transpTerr, String farriboCed, Integer cantCont, String cbm, String fcargaList, String tiempTrans, String fsalPuert, String tiempPuert, Integer tiempEntComex, String fbooking, Integer tiempEspBooking, String festimEmb, String frecDocFin, String emisBL, String insp, String farribCedEst, String notifBL, String liqComex, String fliq, String flibBL, String conduct, Integer cedulCond, String placa, String contened, String precint, String enviarDatos, String vendedor, String docNum) {
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
        this.docNum = docNum;
    }

    public String getTransp() {
        return transp;
    }

    public void setTransp(String transp) {
        this.transp = transp;
    }

    public String getFembarque() {
        return fembarque;
    }

    public void setFembarque(String fembarque) {
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

    public String getFdocTras() {
        return fdocTras;
    }

    public void setFdocTras(String fdocTras) {
        this.fdocTras = fdocTras;
    }

    public String getFarribPuert() {
        return farribPuert;
    }

    public void setFarribPuert(String farribPuert) {
        this.farribPuert = farribPuert;
    }

    public String getFarribAlm() {
        return farribAlm;
    }

    public void setFarribAlm(String farribAlm) {
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

    public String getFarriboCed() {
        return farriboCed;
    }

    public void setFarriboCed(String farriboCed) {
        this.farriboCed = farriboCed;
    }

    public Integer getCantCont() {
        return cantCont;
    }

    public void setCantCont(Integer cantCont) {
        this.cantCont = cantCont;
    }

    public String getCbm() {
        return cbm;
    }

    public void setCbm(String cbm) {
        this.cbm = cbm;
    }

    public String getFcargaList() {
        return fcargaList;
    }

    public void setFcargaList(String fcargaList) {
        this.fcargaList = fcargaList;
    }

    public String getTiempTrans() {
        return tiempTrans;
    }

    public void setTiempTrans(String tiempTrans) {
        this.tiempTrans = tiempTrans;
    }

    public String getFsalPuert() {
        return fsalPuert;
    }

    public void setFsalPuert(String fsalPuert) {
        this.fsalPuert = fsalPuert;
    }

    public String getTiempPuert() {
        return tiempPuert;
    }

    public void setTiempPuert(String tiempPuert) {
        this.tiempPuert = tiempPuert;
    }

    public Integer getTiempEntComex() {
        return tiempEntComex;
    }

    public void setTiempEntComex(Integer tiempEntComex) {
        this.tiempEntComex = tiempEntComex;
    }

    public String getFbooking() {
        return fbooking;
    }

    public void setFbooking(String fbooking) {
        this.fbooking = fbooking;
    }

    public Integer getTiempEspBooking() {
        return tiempEspBooking;
    }

    public void setTiempEspBooking(Integer tiempEspBooking) {
        this.tiempEspBooking = tiempEspBooking;
    }

    public String getFestimEmb() {
        return festimEmb;
    }

    public void setFestimEmb(String festimEmb) {
        this.festimEmb = festimEmb;
    }

    public String getFrecDocFin() {
        return frecDocFin;
    }

    public void setFrecDocFin(String frecDocFin) {
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

    public String getFarribCedEst() {
        return farribCedEst;
    }

    public void setFarribCedEst(String farribCedEst) {
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

    public String getFliq() {
        return fliq;
    }

    public void setFliq(String fliq) {
        this.fliq = fliq;
    }

    public String getFlibBL() {
        return flibBL;
    }

    public void setFlibBL(String flibBL) {
        this.flibBL = flibBL;
    }

    public String getConduct() {
        return conduct;
    }

    public void setConduct(String conduct) {
        this.conduct = conduct;
    }

    public Integer getCedulCond() {
        return cedulCond;
    }

    public void setCedulCond(Integer cedulCond) {
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

    @Override
    public String toString() {
        return "UserFieldDTO{" +
                "transp='" + transp + '\'' +
                ", fembarque=" + fembarque +
                ", termNeg='" + termNeg + '\'' +
                ", modTranp='" + modTranp + '\'' +
                ", puertDes='" + puertDes + '\'' +
                ", estOC='" + estOC + '\'' +
                ", embarc='" + embarc + '\'' +
                ", docTras='" + docTras + '\'' +
                ", fdocTras=" + fdocTras +
                ", farribPuert=" + farribPuert +
                ", farribAlm=" + farribAlm +
                ", tipoEmp='" + tipoEmp + '\'' +
                ", observ='" + observ + '\'' +
                ", puertEmb='" + puertEmb + '\'' +
                ", transpTerr='" + transpTerr + '\'' +
                ", farriboCed=" + farriboCed +
                ", cantCont=" + cantCont +
                ", cbm='" + cbm + '\'' +
                ", fcargaList=" + fcargaList +
                ", tiempTrans='" + tiempTrans + '\'' +
                ", fsalPuert=" + fsalPuert +
                ", tiempPuert='" + tiempPuert + '\'' +
                ", tiempEntComex=" + tiempEntComex +
                ", fbooking=" + fbooking +
                ", tiempEspBooking=" + tiempEspBooking +
                ", festimEmb=" + festimEmb +
                ", frecDocFin=" + frecDocFin +
                ", emisBL='" + emisBL + '\'' +
                ", insp='" + insp + '\'' +
                ", farribCedEst=" + farribCedEst +
                ", notifBL='" + notifBL + '\'' +
                ", liqComex='" + liqComex + '\'' +
                ", fliq=" + fliq +
                ", flibBL=" + flibBL +
                ", conduct='" + conduct + '\'' +
                ", cedulCond=" + cedulCond +
                ", placa='" + placa + '\'' +
                ", contened='" + contened + '\'' +
                ", precint='" + precint + '\'' +
                ", enviarDatos='" + enviarDatos + '\'' +
                ", vendedor='" + vendedor + '\'' +
                ", docNum='" + docNum + '\'' +
                '}';
    }
}