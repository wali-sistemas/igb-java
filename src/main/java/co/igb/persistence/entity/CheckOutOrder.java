package co.igb.persistence.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @author jguisao
 */
@Entity
@Table(name = "checkout_order")
@NamedQueries({
        @NamedQuery(name = "CheckOutOrder.findAll", query = "SELECT c FROM CheckOutOrder c")})
public class CheckOutOrder implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcheckout_order")
    private Long id;
    @Basic(optional = false)
    @Column(name = "order_number")
    private Integer orderNumber;
    @Basic(optional = false)
    @Column(name = "delivery_number")
    private Integer deliveryNumber;
    @Basic(optional = false)
    @Column(name = "item_code")
    private String itemCode;
    @Basic(optional = false)
    @Column(name = "qty_order")
    private Long qtyOrder;
    @Basic(optional = false)
    @Column(name = "qty_scan")
    private Long qtyScan;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @Column(name = "emp_id")
    private String empId;
    @Column(name = "datetime_checkout")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetime_checkout;
    @Basic(optional = false)
    @Column(name = "box_number")
    private Integer boxNumber;
    @Basic(optional = false)
    @Column(name = "company_name")
    private String companyName;
    @Basic(optional = false)
    @Column(name = "start_time")
    private String startTime;
    @Basic(optional = false)
    @Column(name = "end_time")
    private String endTime;

    public CheckOutOrder() {
    }

    public CheckOutOrder(Long id, Integer orderNumber, Integer deliveryNumber, String itemCode, Long qtyOrder, Long qtyScan, String status, String empId, Date datetime_checkout, Integer boxNumber, String companyName, String startTime, String endTime) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.deliveryNumber = deliveryNumber;
        this.itemCode = itemCode;
        this.qtyOrder = qtyOrder;
        this.qtyScan = qtyScan;
        this.status = status;
        this.empId = empId;
        this.datetime_checkout = datetime_checkout;
        this.boxNumber = boxNumber;
        this.companyName = companyName;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getDeliveryNumber() {
        return deliveryNumber;
    }

    public void setDeliveryNumber(Integer deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public Long getQtyOrder() {
        return qtyOrder;
    }

    public void setQtyOrder(Long qtyOrder) {
        this.qtyOrder = qtyOrder;
    }

    public Long getQtyScan() {
        return qtyScan;
    }

    public void setQtyScan(Long qtyScan) {
        this.qtyScan = qtyScan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public Date getDatetime_checkout() {
        return datetime_checkout;
    }

    public void setDatetime_checkout(Date datetime_checkout) {
        this.datetime_checkout = datetime_checkout;
    }

    public Integer getBoxNumber() {
        return boxNumber;
    }

    public void setBoxNumber(Integer boxNumber) {
        this.boxNumber = boxNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
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
        final CheckOutOrder other = (CheckOutOrder) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CheckOutOrder{" +
                "id=" + id +
                ", orderNumber=" + orderNumber +
                ", deliveryNumber=" + deliveryNumber +
                ", itemCode='" + itemCode + '\'' +
                ", qtyOrder=" + qtyOrder +
                ", qtyScan=" + qtyScan +
                ", status='" + status + '\'' +
                ", empId='" + empId + '\'' +
                ", datetime_checkout=" + datetime_checkout +
                ", boxNumber=" + boxNumber +
                ", companyName='" + companyName + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}