package co.igb.persistence.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @author dbotero
 */
@Entity
@Table(name = "packing_list_record")
public class PackingListRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "idpacking_list_record")
    private Long id;
    @Basic(optional = false)
    @Column(name = "idpacking_list")
    private Integer idPackingList;
    @Basic(optional = false)
    @Column(name = "order_number")
    private Integer orderNumber;
    @Basic(optional = false)
    @Column(name = "customer_id")
    private String customerId;
    @Basic(optional = false)
    @Column(name = "customer_name")
    private String customerName;
    @Temporal(TemporalType.TIMESTAMP)
    @Basic(optional = false)
    @Column(name = "datetime_packed")
    private Date datetimePacked;
    @Basic(optional = false)
    @Column(name = "idpacking_order")
    private Integer idPackingOrder;
    @Basic(optional = false)
    @Column(name = "item_code")
    private String itemCode;
    @Basic(optional = true)
    @Column(name = "item_name")
    private String itemName;
    @Basic(optional = false)
    @Column(name = "quantity")
    private Integer quantity;
    @Basic(optional = false)
    @Column(name = "bin_code")
    private String binCode;
    @Basic(optional = false)
    @Column(name = "bin_abs")
    private Long binAbs;
    @Basic(optional = false)
    @Column(name = "box_number")
    private Integer boxNumber;
    @Basic(optional = false)
    @Column(name = "employee")
    private String employee;
    @Basic(optional = false)
    @Column(name = "company_name")
    private String companyName;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIdPackingList() {
        return idPackingList;
    }

    public void setIdPackingList(Integer idPackingList) {
        this.idPackingList = idPackingList;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getDatetimePacked() {
        return datetimePacked;
    }

    public void setDatetimePacked(Date datetimePacked) {
        this.datetimePacked = datetimePacked;
    }

    public Integer getIdPackingOrder() {
        return idPackingOrder;
    }

    public void setIdPackingOrder(Integer idPackingOrder) {
        this.idPackingOrder = idPackingOrder;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getBinCode() {
        return binCode;
    }

    public void setBinCode(String binCode) {
        if (binCode != null) {
            this.binCode = binCode.trim();
        } else {
            this.binCode = null;
        }
    }

    public Long getBinAbs() {
        return binAbs;
    }

    public void setBinAbs(Long binAbs) {
        this.binAbs = binAbs;
    }

    public Integer getBoxNumber() {
        return boxNumber;
    }

    public void setBoxNumber(Integer boxNumber) {
        this.boxNumber = boxNumber;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.id);
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
        final PackingListRecord other = (PackingListRecord) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PackingListRecord{" + "id=" + id + ", idPackingList=" + idPackingList + ", orderNumber=" + orderNumber + ", customerId=" + customerId + ", customerName=" + customerName + ", datetimePacked=" + datetimePacked + ", idPackingOrder=" + idPackingOrder + ", itemCode=" + itemCode + ", quantity=" + quantity + ", binCode=" + binCode + ", binAbs=" + binAbs + ", boxNumber=" + boxNumber + ", employee=" + employee + ", companyName=" + companyName + ", status=" + status + '}';
    }

}
