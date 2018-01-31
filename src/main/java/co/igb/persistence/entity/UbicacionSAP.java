package co.igb.persistence.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author YEIJARA
 */
@Entity
@Table(name = "OBIN")
public class UbicacionSAP implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "AbsEntry")
    private Integer absEntry;
    @Basic(optional = false)
    @Column(name = "BinCode")
    private String binCode;
    @Column(name = "WhsCode")
    private String whsCode;
    @Column(name = "SysBin")
    private Character sysBin;
    @Column(name = "SL1Abs")
    private Integer sL1Abs;
    @Column(name = "SL1Code")
    private String sL1Code;
    @Column(name = "SL2Abs")
    private Integer sL2Abs;
    @Column(name = "SL2Code")
    private String sL2Code;
    @Column(name = "SL3Abs")
    private Integer sL3Abs;
    @Column(name = "SL3Code")
    private String sL3Code;
    @Column(name = "SL4Abs")
    private Integer sL4Abs;
    @Column(name = "SL4Code")
    private String sL4Code;
    @Column(name = "Attr1Abs")
    private Integer attr1Abs;
    @Column(name = "Attr1Val")
    private String attr1Val;
    @Column(name = "Attr2Abs")
    private Integer attr2Abs;
    @Column(name = "Attr2Val")
    private String attr2Val;
    @Column(name = "Attr3Abs")
    private Integer attr3Abs;
    @Column(name = "Attr3Val")
    private String attr3Val;
    @Column(name = "Attr4Abs")
    private Integer attr4Abs;
    @Column(name = "Attr4Val")
    private String attr4Val;
    @Column(name = "Attr5Abs")
    private Integer attr5Abs;
    @Column(name = "Attr5Val")
    private String attr5Val;
    @Column(name = "Attr6Abs")
    private Integer attr6Abs;
    @Column(name = "Attr6Val")
    private String attr6Val;
    @Column(name = "Attr7Abs")
    private Integer attr7Abs;
    @Column(name = "Attr7Val")
    private String attr7Val;
    @Column(name = "Attr8Abs")
    private Integer attr8Abs;
    @Column(name = "Attr8Val")
    private String attr8Val;
    @Column(name = "Attr9Abs")
    private Integer attr9Abs;
    @Column(name = "Attr9Val")
    private String attr9Val;
    @Column(name = "Attr10Abs")
    private Integer attr10Abs;
    @Column(name = "Attr10Val")
    private String attr10Val;
    @Column(name = "Disabled")
    private Character disabled;
    @Column(name = "Descr")
    private String descr;
    @Column(name = "BarCode")
    private String barCode;
    @Column(name = "AltSortCod")
    private String altSortCod;
    @Column(name = "ItmRtrictT")
    private Short itmRtrictT;
    @Column(name = "SpcItmCode")
    private String spcItmCode;
    @Column(name = "SpcItmGrpC")
    private Short spcItmGrpC;
    @Column(name = "SngBatch")
    private Character sngBatch;
    @Column(name = "RtrictType")
    private Short rtrictType;
    @Column(name = "RtrictResn")
    private String rtrictResn;
    @Column(name = "RtrictDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rtrictDate;
    @Column(name = "DataSource")
    private Character dataSource;
    @Column(name = "UserSign")
    private Short userSign;
    @Column(name = "Transfered")
    private Character transfered;
    @Column(name = "Instance")
    private Short instance;
    @Column(name = "LogInstanc")
    private Integer logInstanc;
    @Column(name = "CreateDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Column(name = "UserSign2")
    private Short userSign2;
    @Column(name = "UpdateDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;
    @Column(name = "Deleted")
    private Character deleted;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MinLevel")
    private BigDecimal minLevel;
    @Column(name = "MaxLevel")
    private BigDecimal maxLevel;
    @Column(name = "ReceiveBin")
    private Character receiveBin;
    @Column(name = "NoAutoAllc")
    private Character noAutoAllc;
    @Transient
    private boolean demoEditada = false;
    @Transient
    private Integer idDemo;
    @Transient
    private String estado;
    @Transient
    private boolean usando = false;

    public UbicacionSAP() {
    }

    public UbicacionSAP(Integer absEntry) {
        this.absEntry = absEntry;
    }

    public UbicacionSAP(Integer absEntry, String binCode) {
        this.absEntry = absEntry;
        this.binCode = binCode;
    }

    public Integer getAbsEntry() {
        return absEntry;
    }

    public void setAbsEntry(Integer absEntry) {
        this.absEntry = absEntry;
    }

    public String getBinCode() {
        return binCode;
    }

    public void setBinCode(String binCode) {
        this.binCode = binCode;
    }

    public String getWhsCode() {
        return whsCode;
    }

    public void setWhsCode(String whsCode) {
        this.whsCode = whsCode;
    }

    public Character getSysBin() {
        return sysBin;
    }

    public void setSysBin(Character sysBin) {
        this.sysBin = sysBin;
    }

    public Integer getSL1Abs() {
        return sL1Abs;
    }

    public void setSL1Abs(Integer sL1Abs) {
        this.sL1Abs = sL1Abs;
    }

    public String getSL1Code() {
        return sL1Code;
    }

    public void setSL1Code(String sL1Code) {
        this.sL1Code = sL1Code;
    }

    public Integer getSL2Abs() {
        return sL2Abs;
    }

    public void setSL2Abs(Integer sL2Abs) {
        this.sL2Abs = sL2Abs;
    }

    public String getSL2Code() {
        return sL2Code;
    }

    public void setSL2Code(String sL2Code) {
        this.sL2Code = sL2Code;
    }

    public Integer getSL3Abs() {
        return sL3Abs;
    }

    public void setSL3Abs(Integer sL3Abs) {
        this.sL3Abs = sL3Abs;
    }

    public String getSL3Code() {
        return sL3Code;
    }

    public void setSL3Code(String sL3Code) {
        this.sL3Code = sL3Code;
    }

    public Integer getSL4Abs() {
        return sL4Abs;
    }

    public void setSL4Abs(Integer sL4Abs) {
        this.sL4Abs = sL4Abs;
    }

    public String getSL4Code() {
        return sL4Code;
    }

    public void setSL4Code(String sL4Code) {
        this.sL4Code = sL4Code;
    }

    public Integer getAttr1Abs() {
        return attr1Abs;
    }

    public void setAttr1Abs(Integer attr1Abs) {
        this.attr1Abs = attr1Abs;
    }

    public String getAttr1Val() {
        return attr1Val;
    }

    public void setAttr1Val(String attr1Val) {
        this.attr1Val = attr1Val;
    }

    public Integer getAttr2Abs() {
        return attr2Abs;
    }

    public void setAttr2Abs(Integer attr2Abs) {
        this.attr2Abs = attr2Abs;
    }

    public String getAttr2Val() {
        return attr2Val;
    }

    public void setAttr2Val(String attr2Val) {
        this.attr2Val = attr2Val;
    }

    public Integer getAttr3Abs() {
        return attr3Abs;
    }

    public void setAttr3Abs(Integer attr3Abs) {
        this.attr3Abs = attr3Abs;
    }

    public String getAttr3Val() {
        return attr3Val;
    }

    public void setAttr3Val(String attr3Val) {
        this.attr3Val = attr3Val;
    }

    public Integer getAttr4Abs() {
        return attr4Abs;
    }

    public void setAttr4Abs(Integer attr4Abs) {
        this.attr4Abs = attr4Abs;
    }

    public String getAttr4Val() {
        return attr4Val;
    }

    public void setAttr4Val(String attr4Val) {
        this.attr4Val = attr4Val;
    }

    public Integer getAttr5Abs() {
        return attr5Abs;
    }

    public void setAttr5Abs(Integer attr5Abs) {
        this.attr5Abs = attr5Abs;
    }

    public String getAttr5Val() {
        return attr5Val;
    }

    public void setAttr5Val(String attr5Val) {
        this.attr5Val = attr5Val;
    }

    public Integer getAttr6Abs() {
        return attr6Abs;
    }

    public void setAttr6Abs(Integer attr6Abs) {
        this.attr6Abs = attr6Abs;
    }

    public String getAttr6Val() {
        return attr6Val;
    }

    public void setAttr6Val(String attr6Val) {
        this.attr6Val = attr6Val;
    }

    public Integer getAttr7Abs() {
        return attr7Abs;
    }

    public void setAttr7Abs(Integer attr7Abs) {
        this.attr7Abs = attr7Abs;
    }

    public String getAttr7Val() {
        return attr7Val;
    }

    public void setAttr7Val(String attr7Val) {
        this.attr7Val = attr7Val;
    }

    public Integer getAttr8Abs() {
        return attr8Abs;
    }

    public void setAttr8Abs(Integer attr8Abs) {
        this.attr8Abs = attr8Abs;
    }

    public String getAttr8Val() {
        return attr8Val;
    }

    public void setAttr8Val(String attr8Val) {
        this.attr8Val = attr8Val;
    }

    public Integer getAttr9Abs() {
        return attr9Abs;
    }

    public void setAttr9Abs(Integer attr9Abs) {
        this.attr9Abs = attr9Abs;
    }

    public String getAttr9Val() {
        return attr9Val;
    }

    public void setAttr9Val(String attr9Val) {
        this.attr9Val = attr9Val;
    }

    public Integer getAttr10Abs() {
        return attr10Abs;
    }

    public void setAttr10Abs(Integer attr10Abs) {
        this.attr10Abs = attr10Abs;
    }

    public String getAttr10Val() {
        return attr10Val;
    }

    public void setAttr10Val(String attr10Val) {
        this.attr10Val = attr10Val;
    }

    public Character getDisabled() {
        return disabled;
    }

    public void setDisabled(Character disabled) {
        this.disabled = disabled;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getAltSortCod() {
        return altSortCod;
    }

    public void setAltSortCod(String altSortCod) {
        this.altSortCod = altSortCod;
    }

    public Short getItmRtrictT() {
        return itmRtrictT;
    }

    public void setItmRtrictT(Short itmRtrictT) {
        this.itmRtrictT = itmRtrictT;
    }

    public String getSpcItmCode() {
        return spcItmCode;
    }

    public void setSpcItmCode(String spcItmCode) {
        this.spcItmCode = spcItmCode;
    }

    public Short getSpcItmGrpC() {
        return spcItmGrpC;
    }

    public void setSpcItmGrpC(Short spcItmGrpC) {
        this.spcItmGrpC = spcItmGrpC;
    }

    public Character getSngBatch() {
        return sngBatch;
    }

    public void setSngBatch(Character sngBatch) {
        this.sngBatch = sngBatch;
    }

    public Short getRtrictType() {
        return rtrictType;
    }

    public void setRtrictType(Short rtrictType) {
        this.rtrictType = rtrictType;
    }

    public String getRtrictResn() {
        return rtrictResn;
    }

    public void setRtrictResn(String rtrictResn) {
        this.rtrictResn = rtrictResn;
    }

    public Date getRtrictDate() {
        return rtrictDate;
    }

    public void setRtrictDate(Date rtrictDate) {
        this.rtrictDate = rtrictDate;
    }

    public Character getDataSource() {
        return dataSource;
    }

    public void setDataSource(Character dataSource) {
        this.dataSource = dataSource;
    }

    public Short getUserSign() {
        return userSign;
    }

    public void setUserSign(Short userSign) {
        this.userSign = userSign;
    }

    public Character getTransfered() {
        return transfered;
    }

    public void setTransfered(Character transfered) {
        this.transfered = transfered;
    }

    public Short getInstance() {
        return instance;
    }

    public void setInstance(Short instance) {
        this.instance = instance;
    }

    public Integer getLogInstanc() {
        return logInstanc;
    }

    public void setLogInstanc(Integer logInstanc) {
        this.logInstanc = logInstanc;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Short getUserSign2() {
        return userSign2;
    }

    public void setUserSign2(Short userSign2) {
        this.userSign2 = userSign2;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Character getDeleted() {
        return deleted;
    }

    public void setDeleted(Character deleted) {
        this.deleted = deleted;
    }

    public BigDecimal getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(BigDecimal minLevel) {
        this.minLevel = minLevel;
    }

    public BigDecimal getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(BigDecimal maxLevel) {
        this.maxLevel = maxLevel;
    }

    public Character getReceiveBin() {
        return receiveBin;
    }

    public void setReceiveBin(Character receiveBin) {
        this.receiveBin = receiveBin;
    }

    public Character getNoAutoAllc() {
        return noAutoAllc;
    }

    public void setNoAutoAllc(Character noAutoAllc) {
        this.noAutoAllc = noAutoAllc;
    }

    public boolean isDemoEditada() {
        return demoEditada;
    }

    public void setDemoEditada(boolean demoEditada) {
        this.demoEditada = demoEditada;
    }

    public Integer getIdDemo() {
        return idDemo;
    }

    public void setIdDemo(Integer idDemo) {
        this.idDemo = idDemo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isUsando() {
        return usando;
    }

    public void setUsando(boolean usando) {
        this.usando = usando;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (absEntry != null ? absEntry.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UbicacionSAP)) {
            return false;
        }
        UbicacionSAP other = (UbicacionSAP) object;
        return !((this.absEntry == null && other.absEntry != null) || (this.absEntry != null && !this.absEntry.equals(other.absEntry)));
    }

    @Override
    public String toString() {
        return "co.matisses.sap.entity.UbicacionSAP[ absEntry=" + absEntry + " ]";
    }
}
