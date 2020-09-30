package co.igb.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author dbotero
 */
public class PurchaseOrderDTO {
    private Long docEntry;
    private String docNum;
    private String series;
    private Long salesPersonCode;
    private Date docDate;
    private Double docTotal;
    private Double docTotalFC;
    private String cardCode;
    private String cardName;
    private Integer items;
    private Double docRate;
    private String comments;
    private String ubpcost;
    private String uwuid;
    private Date uftomaped;
    private String ucampana;
    private String utransp;
    private String useparador;
    private String udesp;
    private String uubic1;
    private String uconcnc;
    private String uconcnd;
    private String uconcinv;
    private Date ufembarque;
    private String utermneg;
    private String umodtransp;
    private String upuertodes;
    private String umodimp;
    private String uestadooc;
    private Date ufproforma;
    private String uembarcado;
    private String udoctransp;
    private Date ufdoctransp;
    private Date ufarribpuerto;
    private Date ufarribalma;
    private String ureqant;
    private String uantrealiz;
    private Double utotcaj;
    private Double utotbul;
    private Double utotlios;
    private Double uvlrfle;
    private Double uvlrseg;
    private Double utotfle;
    private Date uhoraini;
    private Date uhorafin;
    private Double upesobruto;
    private String uautprecio;
    private String uTipoNota;
    private String ununfac;
    private Date ufechaentregapro;
    private String unumfacimp;
    private String utranspimp;
    private Double utiempoestimado;
    private Date ufecini;
    private Date ufecfin;
    private String uivcDone;
    private String uVendedor2;
    private String uDifCode;
    private String uok1IVAPA;
    private String umotdevol;
    private Date ufechapago;
    private String uantcancelado;
    private String uimpcancelado;
    private String utipoempaque;
    private Double uvranticipo;
    private Double uvrtotal;
    private Double uvrimpuesto;
    private String uobservacion;
    private Double uvrdeclarado;
    private String upuertoemb;
    private String unaviera;
    private String utranspterr;
    private String uagenteadu;
    private String ualmacdes;
    private String uguid;
    private String ubpvncon2;
    private String ubpvseri;
    private String ubpvtran;
    private String ubpvfafe;
    private String ubpvcomp;
    private String ubpvtdoc;
    private String ubpvnimp;
    private String ubpvNumExp;
    private String ubpvncon;
    private String umotivo;
    private String uestadoped;
    private String uAutorret;
    private String uRetefue;
    private String uReteIca;
    private String unwrPicS;
    private String unwrbRet;
    private Long uNwrPAut;
    private String uNwrNote;
    private String uNwrTag;
    private Double uNwrFrgt;
    private String unwrnorm;
    private String uTypeExped;
    private String unwrManifest;
    private String uempacador;
    private Date uhorainiemp;
    private Date uhorafinemp;
    private String ualist;
    private Date ufeciniemp;
    private Date ufecfinemp;
    private String uok1IFRS;
    private Double utotfleclie;
    private String ushipping;
    private String uEsIndep;
    private Long uDocEntryLeg;
    private String uIdLineLeg;
    private Long uSerieLeg;
    private Date uFechaArriboCEDI;
    private String uCatRet;
    private String uBodega;
    private List<PurchaseOrderLineDTO> lines;

    public PurchaseOrderDTO() {
        this.lines = new ArrayList<>();
    }

    public PurchaseOrderDTO(String docNum, String series, Date docDate, Double docTotal, Double docTotalFC, String cardCode, String cardName, Integer items) {
        this.docNum = docNum;
        this.series = series;
        this.docDate = docDate;
        this.docTotal = docTotal;
        this.docTotalFC = docTotalFC;
        this.cardCode = cardCode;
        this.cardName = cardName;
        this.items = items;
        this.lines = new ArrayList<>();
    }

    public String getDocNum() {
        return docNum;
    }

    public void setDocNum(String docNum) {
        this.docNum = docNum;
    }

    public Long getSalesPersonCode() {
        return salesPersonCode;
    }

    public void setSalesPersonCode(Long salesPersonCode) {
        this.salesPersonCode = salesPersonCode;
    }

    public Double getDocRate() {
        return docRate;
    }

    public void setDocRate(Double docRate) {
        this.docRate = docRate;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public Long getDocEntry() {
        return docEntry;
    }

    public void setDocEntry(Long docEntry) {
        this.docEntry = docEntry;
    }

    public Double getDocTotal() {
        return docTotal;
    }

    public void setDocTotal(Double docTotal) {
        this.docTotal = docTotal;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public Integer getItems() {
        return items;
    }

    public void setItems(Integer items) {
        this.items = items;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Double getDocTotalFC() {
        return docTotalFC;
    }

    public void setDocTotalFC(Double docTotalFC) {
        this.docTotalFC = docTotalFC;
    }

    public List<PurchaseOrderLineDTO> getLines() {
        return lines;
    }

    public void setLines(List<PurchaseOrderLineDTO> lines) {
        this.lines = lines;
    }

    public String getUbpcost() {
        return ubpcost;
    }

    public void setUbpcost(String ubpcost) {
        this.ubpcost = ubpcost;
    }

    public String getUwuid() {
        return uwuid;
    }

    public void setUwuid(String uwuid) {
        this.uwuid = uwuid;
    }

    public Date getUftomaped() {
        return uftomaped;
    }

    public void setUftomaped(Date uftomaped) {
        this.uftomaped = uftomaped;
    }

    public String getUcampana() {
        return ucampana;
    }

    public void setUcampana(String ucampana) {
        this.ucampana = ucampana;
    }

    public String getUtransp() {
        return utransp;
    }

    public void setUtransp(String utransp) {
        this.utransp = utransp;
    }

    public String getUseparador() {
        return useparador;
    }

    public void setUseparador(String useparador) {
        this.useparador = useparador;
    }

    public String getUdesp() {
        return udesp;
    }

    public void setUdesp(String udesp) {
        this.udesp = udesp;
    }

    public String getUubic1() {
        return uubic1;
    }

    public void setUubic1(String uubic1) {
        this.uubic1 = uubic1;
    }

    public String getUconcnc() {
        return uconcnc;
    }

    public void setUconcnc(String uconcnc) {
        this.uconcnc = uconcnc;
    }

    public String getUconcnd() {
        return uconcnd;
    }

    public void setUconcnd(String uconcnd) {
        this.uconcnd = uconcnd;
    }

    public String getUconcinv() {
        return uconcinv;
    }

    public void setUconcinv(String uconcinv) {
        this.uconcinv = uconcinv;
    }

    public Date getUfembarque() {
        return ufembarque;
    }

    public void setUfembarque(Date ufembarque) {
        this.ufembarque = ufembarque;
    }

    public String getUtermneg() {
        return utermneg;
    }

    public void setUtermneg(String utermneg) {
        this.utermneg = utermneg;
    }

    public String getUmodtransp() {
        return umodtransp;
    }

    public void setUmodtransp(String umodtransp) {
        this.umodtransp = umodtransp;
    }

    public String getUpuertodes() {
        return upuertodes;
    }

    public void setUpuertodes(String upuertodes) {
        this.upuertodes = upuertodes;
    }

    public String getUmodimp() {
        return umodimp;
    }

    public void setUmodimp(String umodimp) {
        this.umodimp = umodimp;
    }

    public String getUestadooc() {
        return uestadooc;
    }

    public void setUestadooc(String uestadooc) {
        this.uestadooc = uestadooc;
    }

    public Date getUfproforma() {
        return ufproforma;
    }

    public void setUfproforma(Date ufproforma) {
        this.ufproforma = ufproforma;
    }

    public String getUembarcado() {
        return uembarcado;
    }

    public void setUembarcado(String uembarcado) {
        this.uembarcado = uembarcado;
    }

    public String getUdoctransp() {
        return udoctransp;
    }

    public void setUdoctransp(String udoctransp) {
        this.udoctransp = udoctransp;
    }

    public Date getUfdoctransp() {
        return ufdoctransp;
    }

    public void setUfdoctransp(Date ufdoctransp) {
        this.ufdoctransp = ufdoctransp;
    }

    public Date getUfarribpuerto() {
        return ufarribpuerto;
    }

    public void setUfarribpuerto(Date ufarribpuerto) {
        this.ufarribpuerto = ufarribpuerto;
    }

    public Date getUfarribalma() {
        return ufarribalma;
    }

    public void setUfarribalma(Date ufarribalma) {
        this.ufarribalma = ufarribalma;
    }

    public String getUreqant() {
        return ureqant;
    }

    public void setUreqant(String ureqant) {
        this.ureqant = ureqant;
    }

    public String getUantrealiz() {
        return uantrealiz;
    }

    public void setUantrealiz(String uantrealiz) {
        this.uantrealiz = uantrealiz;
    }

    public Double getUtotcaj() {
        return utotcaj;
    }

    public void setUtotcaj(Double utotcaj) {
        this.utotcaj = utotcaj;
    }

    public Double getUtotbul() {
        return utotbul;
    }

    public void setUtotbul(Double utotbul) {
        this.utotbul = utotbul;
    }

    public Double getUtotlios() {
        return utotlios;
    }

    public void setUtotlios(Double utotlios) {
        this.utotlios = utotlios;
    }

    public Double getUvlrfle() {
        return uvlrfle;
    }

    public void setUvlrfle(Double uvlrfle) {
        this.uvlrfle = uvlrfle;
    }

    public Double getUvlrseg() {
        return uvlrseg;
    }

    public void setUvlrseg(Double uvlrseg) {
        this.uvlrseg = uvlrseg;
    }

    public Double getUtotfle() {
        return utotfle;
    }

    public void setUtotfle(Double utotfle) {
        this.utotfle = utotfle;
    }

    public Date getUhoraini() {
        return uhoraini;
    }

    public void setUhoraini(Date uhoraini) {
        this.uhoraini = uhoraini;
    }

    public Date getUhorafin() {
        return uhorafin;
    }

    public void setUhorafin(Date uhorafin) {
        this.uhorafin = uhorafin;
    }

    public Double getUpesobruto() {
        return upesobruto;
    }

    public void setUpesobruto(Double upesobruto) {
        this.upesobruto = upesobruto;
    }

    public String getUautprecio() {
        return uautprecio;
    }

    public void setUautprecio(String uautprecio) {
        this.uautprecio = uautprecio;
    }

    public String getuTipoNota() {
        return uTipoNota;
    }

    public void setuTipoNota(String uTipoNota) {
        this.uTipoNota = uTipoNota;
    }

    public String getUnunfac() {
        return ununfac;
    }

    public void setUnunfac(String ununfac) {
        this.ununfac = ununfac;
    }

    public Date getUfechaentregapro() {
        return ufechaentregapro;
    }

    public void setUfechaentregapro(Date ufechaentregapro) {
        this.ufechaentregapro = ufechaentregapro;
    }

    public String getUnumfacimp() {
        return unumfacimp;
    }

    public void setUnumfacimp(String unumfacimp) {
        this.unumfacimp = unumfacimp;
    }

    public String getUtranspimp() {
        return utranspimp;
    }

    public void setUtranspimp(String utranspimp) {
        this.utranspimp = utranspimp;
    }

    public Double getUtiempoestimado() {
        return utiempoestimado;
    }

    public void setUtiempoestimado(Double utiempoestimado) {
        this.utiempoestimado = utiempoestimado;
    }

    public Date getUfecini() {
        return ufecini;
    }

    public void setUfecini(Date ufecini) {
        this.ufecini = ufecini;
    }

    public Date getUfecfin() {
        return ufecfin;
    }

    public void setUfecfin(Date ufecfin) {
        this.ufecfin = ufecfin;
    }

    public String getUivcDone() {
        return uivcDone;
    }

    public void setUivcDone(String uivcDone) {
        this.uivcDone = uivcDone;
    }

    public String getuVendedor2() {
        return uVendedor2;
    }

    public void setuVendedor2(String uVendedor2) {
        this.uVendedor2 = uVendedor2;
    }

    public String getuDifCode() {
        return uDifCode;
    }

    public void setuDifCode(String uDifCode) {
        this.uDifCode = uDifCode;
    }

    public String getUok1IVAPA() {
        return uok1IVAPA;
    }

    public void setUok1IVAPA(String uok1IVAPA) {
        this.uok1IVAPA = uok1IVAPA;
    }

    public String getUmotdevol() {
        return umotdevol;
    }

    public void setUmotdevol(String umotdevol) {
        this.umotdevol = umotdevol;
    }

    public Date getUfechapago() {
        return ufechapago;
    }

    public void setUfechapago(Date ufechapago) {
        this.ufechapago = ufechapago;
    }

    public String getUantcancelado() {
        return uantcancelado;
    }

    public void setUantcancelado(String uantcancelado) {
        this.uantcancelado = uantcancelado;
    }

    public String getUimpcancelado() {
        return uimpcancelado;
    }

    public void setUimpcancelado(String uimpcancelado) {
        this.uimpcancelado = uimpcancelado;
    }

    public String getUtipoempaque() {
        return utipoempaque;
    }

    public void setUtipoempaque(String utipoempaque) {
        this.utipoempaque = utipoempaque;
    }

    public Double getUvranticipo() {
        return uvranticipo;
    }

    public void setUvranticipo(Double uvranticipo) {
        this.uvranticipo = uvranticipo;
    }

    public Double getUvrtotal() {
        return uvrtotal;
    }

    public void setUvrtotal(Double uvrtotal) {
        this.uvrtotal = uvrtotal;
    }

    public Double getUvrimpuesto() {
        return uvrimpuesto;
    }

    public void setUvrimpuesto(Double uvrimpuesto) {
        this.uvrimpuesto = uvrimpuesto;
    }

    public String getUobservacion() {
        return uobservacion;
    }

    public void setUobservacion(String uobservacion) {
        this.uobservacion = uobservacion;
    }

    public Double getUvrdeclarado() {
        return uvrdeclarado;
    }

    public void setUvrdeclarado(Double uvrdeclarado) {
        this.uvrdeclarado = uvrdeclarado;
    }

    public String getUpuertoemb() {
        return upuertoemb;
    }

    public void setUpuertoemb(String upuertoemb) {
        this.upuertoemb = upuertoemb;
    }

    public String getUnaviera() {
        return unaviera;
    }

    public void setUnaviera(String unaviera) {
        this.unaviera = unaviera;
    }

    public String getUtranspterr() {
        return utranspterr;
    }

    public void setUtranspterr(String utranspterr) {
        this.utranspterr = utranspterr;
    }

    public String getUagenteadu() {
        return uagenteadu;
    }

    public void setUagenteadu(String uagenteadu) {
        this.uagenteadu = uagenteadu;
    }

    public String getUalmacdes() {
        return ualmacdes;
    }

    public void setUalmacdes(String ualmacdes) {
        this.ualmacdes = ualmacdes;
    }

    public String getUguid() {
        return uguid;
    }

    public void setUguid(String uguid) {
        this.uguid = uguid;
    }

    public String getUbpvncon2() {
        return ubpvncon2;
    }

    public void setUbpvncon2(String ubpvncon2) {
        this.ubpvncon2 = ubpvncon2;
    }

    public String getUbpvseri() {
        return ubpvseri;
    }

    public void setUbpvseri(String ubpvseri) {
        this.ubpvseri = ubpvseri;
    }

    public String getUbpvtran() {
        return ubpvtran;
    }

    public void setUbpvtran(String ubpvtran) {
        this.ubpvtran = ubpvtran;
    }

    public String getUbpvfafe() {
        return ubpvfafe;
    }

    public void setUbpvfafe(String ubpvfafe) {
        this.ubpvfafe = ubpvfafe;
    }

    public String getUbpvcomp() {
        return ubpvcomp;
    }

    public void setUbpvcomp(String ubpvcomp) {
        this.ubpvcomp = ubpvcomp;
    }

    public String getUbpvtdoc() {
        return ubpvtdoc;
    }

    public void setUbpvtdoc(String ubpvtdoc) {
        this.ubpvtdoc = ubpvtdoc;
    }

    public String getUbpvnimp() {
        return ubpvnimp;
    }

    public void setUbpvnimp(String ubpvnimp) {
        this.ubpvnimp = ubpvnimp;
    }

    public String getUbpvNumExp() {
        return ubpvNumExp;
    }

    public void setUbpvNumExp(String ubpvNumExp) {
        this.ubpvNumExp = ubpvNumExp;
    }

    public String getUbpvncon() {
        return ubpvncon;
    }

    public void setUbpvncon(String ubpvncon) {
        this.ubpvncon = ubpvncon;
    }

    public String getUmotivo() {
        return umotivo;
    }

    public void setUmotivo(String umotivo) {
        this.umotivo = umotivo;
    }

    public String getUestadoped() {
        return uestadoped;
    }

    public void setUestadoped(String uestadoped) {
        this.uestadoped = uestadoped;
    }

    public String getuAutorret() {
        return uAutorret;
    }

    public void setuAutorret(String uAutorret) {
        this.uAutorret = uAutorret;
    }

    public String getuRetefue() {
        return uRetefue;
    }

    public void setuRetefue(String uRetefue) {
        this.uRetefue = uRetefue;
    }

    public String getuReteIca() {
        return uReteIca;
    }

    public void setuReteIca(String uReteIca) {
        this.uReteIca = uReteIca;
    }

    public String getUnwrPicS() {
        return unwrPicS;
    }

    public void setUnwrPicS(String unwrPicS) {
        this.unwrPicS = unwrPicS;
    }

    public String getUnwrbRet() {
        return unwrbRet;
    }

    public void setUnwrbRet(String unwrbRet) {
        this.unwrbRet = unwrbRet;
    }

    public Long getuNwrPAut() {
        return uNwrPAut;
    }

    public void setuNwrPAut(Long uNwrPAut) {
        this.uNwrPAut = uNwrPAut;
    }

    public String getuNwrNote() {
        return uNwrNote;
    }

    public void setuNwrNote(String uNwrNote) {
        this.uNwrNote = uNwrNote;
    }

    public String getuNwrTag() {
        return uNwrTag;
    }

    public void setuNwrTag(String uNwrTag) {
        this.uNwrTag = uNwrTag;
    }

    public Double getuNwrFrgt() {
        return uNwrFrgt;
    }

    public void setuNwrFrgt(Double uNwrFrgt) {
        this.uNwrFrgt = uNwrFrgt;
    }

    public String getUnwrnorm() {
        return unwrnorm;
    }

    public void setUnwrnorm(String unwrnorm) {
        this.unwrnorm = unwrnorm;
    }

    public String getuTypeExped() {
        return uTypeExped;
    }

    public void setuTypeExped(String uTypeExped) {
        this.uTypeExped = uTypeExped;
    }

    public String getUnwrManifest() {
        return unwrManifest;
    }

    public void setUnwrManifest(String unwrManifest) {
        this.unwrManifest = unwrManifest;
    }

    public String getUempacador() {
        return uempacador;
    }

    public void setUempacador(String uempacador) {
        this.uempacador = uempacador;
    }

    public Date getUhorainiemp() {
        return uhorainiemp;
    }

    public void setUhorainiemp(Date uhorainiemp) {
        this.uhorainiemp = uhorainiemp;
    }

    public Date getUhorafinemp() {
        return uhorafinemp;
    }

    public void setUhorafinemp(Date uhorafinemp) {
        this.uhorafinemp = uhorafinemp;
    }

    public String getUalist() {
        return ualist;
    }

    public void setUalist(String ualist) {
        this.ualist = ualist;
    }

    public Date getUfeciniemp() {
        return ufeciniemp;
    }

    public void setUfeciniemp(Date ufeciniemp) {
        this.ufeciniemp = ufeciniemp;
    }

    public Date getUfecfinemp() {
        return ufecfinemp;
    }

    public void setUfecfinemp(Date ufecfinemp) {
        this.ufecfinemp = ufecfinemp;
    }

    public String getUok1IFRS() {
        return uok1IFRS;
    }

    public void setUok1IFRS(String uok1IFRS) {
        this.uok1IFRS = uok1IFRS;
    }

    public Double getUtotfleclie() {
        return utotfleclie;
    }

    public void setUtotfleclie(Double utotfleclie) {
        this.utotfleclie = utotfleclie;
    }

    public String getUshipping() {
        return ushipping;
    }

    public void setUshipping(String ushipping) {
        this.ushipping = ushipping;
    }

    public String getuEsIndep() {
        return uEsIndep;
    }

    public void setuEsIndep(String uEsIndep) {
        this.uEsIndep = uEsIndep;
    }

    public Long getuDocEntryLeg() {
        return uDocEntryLeg;
    }

    public void setuDocEntryLeg(Long uDocEntryLeg) {
        this.uDocEntryLeg = uDocEntryLeg;
    }

    public String getuIdLineLeg() {
        return uIdLineLeg;
    }

    public void setuIdLineLeg(String uIdLineLeg) {
        this.uIdLineLeg = uIdLineLeg;
    }

    public Long getuSerieLeg() {
        return uSerieLeg;
    }

    public void setuSerieLeg(Long uSerieLeg) {
        this.uSerieLeg = uSerieLeg;
    }

    public Date getuFechaArriboCEDI() {
        return uFechaArriboCEDI;
    }

    public void setuFechaArriboCEDI(Date uFechaArriboCEDI) {
        this.uFechaArriboCEDI = uFechaArriboCEDI;
    }

    public String getuCatRet() {
        return uCatRet;
    }

    public void setuCatRet(String uCatRet) {
        this.uCatRet = uCatRet;
    }

    public String getuBodega() {
        return uBodega;
    }

    public void setuBodega(String uBodega) {
        this.uBodega = uBodega;
    }

    public void addLine(String itemCode, String itemName, Integer quantity, Integer lineNum) {
        PurchaseOrderLineDTO line = new PurchaseOrderLineDTO(itemCode, itemName, quantity, lineNum);
        if (lines.contains(line)) {
            lines.get(lines.indexOf(line)).addQuantity(quantity);
        } else {
            lines.add(line);
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.docNum);
        hash = 67 * hash + Objects.hashCode(this.series);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PurchaseOrderDTO other = (PurchaseOrderDTO) obj;
        if (!Objects.equals(this.docNum, other.docNum)) {
            return false;
        }
        if (!Objects.equals(this.series, other.series)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PurchaseOrderDTO{" +
                "docEntry=" + docEntry +
                ", docNum='" + docNum + '\'' +
                ", series='" + series + '\'' +
                ", salesPersonCode=" + salesPersonCode +
                ", docDate=" + docDate +
                ", docTotal=" + docTotal +
                ", docTotalFC=" + docTotalFC +
                ", cardCode='" + cardCode + '\'' +
                ", cardName='" + cardName + '\'' +
                ", items=" + items +
                ", docRate=" + docRate +
                ", comments='" + comments + '\'' +
                ", ubpcost='" + ubpcost + '\'' +
                ", uwuid='" + uwuid + '\'' +
                ", uftomaped=" + uftomaped +
                ", ucampana='" + ucampana + '\'' +
                ", utransp='" + utransp + '\'' +
                ", useparador='" + useparador + '\'' +
                ", udesp='" + udesp + '\'' +
                ", uubic1='" + uubic1 + '\'' +
                ", uconcnc='" + uconcnc + '\'' +
                ", uconcnd='" + uconcnd + '\'' +
                ", uconcinv='" + uconcinv + '\'' +
                ", ufembarque=" + ufembarque +
                ", utermneg='" + utermneg + '\'' +
                ", umodtransp='" + umodtransp + '\'' +
                ", upuertodes='" + upuertodes + '\'' +
                ", umodimp='" + umodimp + '\'' +
                ", uestadooc='" + uestadooc + '\'' +
                ", ufproforma=" + ufproforma +
                ", uembarcado='" + uembarcado + '\'' +
                ", udoctransp='" + udoctransp + '\'' +
                ", ufdoctransp=" + ufdoctransp +
                ", ufarribpuerto=" + ufarribpuerto +
                ", ufarribalma=" + ufarribalma +
                ", ureqant='" + ureqant + '\'' +
                ", uantrealiz='" + uantrealiz + '\'' +
                ", utotcaj=" + utotcaj +
                ", utotbul=" + utotbul +
                ", utotlios=" + utotlios +
                ", uvlrfle=" + uvlrfle +
                ", uvlrseg=" + uvlrseg +
                ", utotfle=" + utotfle +
                ", uhoraini=" + uhoraini +
                ", uhorafin=" + uhorafin +
                ", upesobruto=" + upesobruto +
                ", uautprecio='" + uautprecio + '\'' +
                ", uTipoNota='" + uTipoNota + '\'' +
                ", ununfac='" + ununfac + '\'' +
                ", ufechaentregapro=" + ufechaentregapro +
                ", unumfacimp='" + unumfacimp + '\'' +
                ", utranspimp='" + utranspimp + '\'' +
                ", utiempoestimado=" + utiempoestimado +
                ", ufecini=" + ufecini +
                ", ufecfin=" + ufecfin +
                ", uivcDone='" + uivcDone + '\'' +
                ", uVendedor2='" + uVendedor2 + '\'' +
                ", uDifCode='" + uDifCode + '\'' +
                ", uok1IVAPA='" + uok1IVAPA + '\'' +
                ", umotdevol='" + umotdevol + '\'' +
                ", ufechapago=" + ufechapago +
                ", uantcancelado='" + uantcancelado + '\'' +
                ", uimpcancelado='" + uimpcancelado + '\'' +
                ", utipoempaque='" + utipoempaque + '\'' +
                ", uvranticipo=" + uvranticipo +
                ", uvrtotal=" + uvrtotal +
                ", uvrimpuesto=" + uvrimpuesto +
                ", uobservacion='" + uobservacion + '\'' +
                ", uvrdeclarado=" + uvrdeclarado +
                ", upuertoemb='" + upuertoemb + '\'' +
                ", unaviera='" + unaviera + '\'' +
                ", utranspterr='" + utranspterr + '\'' +
                ", uagenteadu='" + uagenteadu + '\'' +
                ", ualmacdes='" + ualmacdes + '\'' +
                ", uguid='" + uguid + '\'' +
                ", ubpvncon2='" + ubpvncon2 + '\'' +
                ", ubpvseri='" + ubpvseri + '\'' +
                ", ubpvtran='" + ubpvtran + '\'' +
                ", ubpvfafe='" + ubpvfafe + '\'' +
                ", ubpvcomp='" + ubpvcomp + '\'' +
                ", ubpvtdoc='" + ubpvtdoc + '\'' +
                ", ubpvnimp='" + ubpvnimp + '\'' +
                ", ubpvNumExp='" + ubpvNumExp + '\'' +
                ", ubpvncon='" + ubpvncon + '\'' +
                ", umotivo='" + umotivo + '\'' +
                ", uestadoped='" + uestadoped + '\'' +
                ", uAutorret='" + uAutorret + '\'' +
                ", uRetefue='" + uRetefue + '\'' +
                ", uReteIca='" + uReteIca + '\'' +
                ", unwrPicS='" + unwrPicS + '\'' +
                ", unwrbRet='" + unwrbRet + '\'' +
                ", uNwrPAut=" + uNwrPAut +
                ", uNwrNote='" + uNwrNote + '\'' +
                ", uNwrTag='" + uNwrTag + '\'' +
                ", uNwrFrgt=" + uNwrFrgt +
                ", unwrnorm='" + unwrnorm + '\'' +
                ", uTypeExped='" + uTypeExped + '\'' +
                ", unwrManifest='" + unwrManifest + '\'' +
                ", uempacador='" + uempacador + '\'' +
                ", uhorainiemp=" + uhorainiemp +
                ", uhorafinemp=" + uhorafinemp +
                ", ualist='" + ualist + '\'' +
                ", ufeciniemp=" + ufeciniemp +
                ", ufecfinemp=" + ufecfinemp +
                ", uok1IFRS='" + uok1IFRS + '\'' +
                ", utotfleclie=" + utotfleclie +
                ", ushipping='" + ushipping + '\'' +
                ", uEsIndep='" + uEsIndep + '\'' +
                ", uDocEntryLeg=" + uDocEntryLeg +
                ", uIdLineLeg='" + uIdLineLeg + '\'' +
                ", uSerieLeg=" + uSerieLeg +
                ", uFechaArriboCEDI=" + uFechaArriboCEDI +
                ", uCatRet='" + uCatRet + '\'' +
                ", uBodega='" + uBodega + '\'' +
                ", lines=" + lines +
                '}';
    }
}