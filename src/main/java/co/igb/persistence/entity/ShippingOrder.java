package co.igb.persistence.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @author jguisao
 */
@Entity
@Table(name = "shipping_order")
@NamedQueries({
        @NamedQuery(name = "ShippingOrder.findAll", query = "SELECT s FROM ShippingOrder s")})
public class ShippingOrder implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idshipping_order")
    private Long id;
    @Basic(optional = false)
    @Column(name = "order_number")
    private Integer orderNumber;
    @Basic(optional = false)
    @Column(name = "delivery_number")
    private Integer deliveryNumber;
    @Basic(optional = false)
    @Column(name = "invoice_number")
    private Integer invoiceNumber;
    @Basic(optional = false)
    @Column(name = "box_sum_shipping")
    private Integer boxSumShipping;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @Column(name = "emp_id")
    private String empId;
    @Column(name = "datetime_shipping")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetimeShipping;
    @Basic(optional = false)
    @Column(name = "company_name")
    private String companyName;
    @Basic(optional = false)
    @Column(name = "address_shipping")
    private String addressShipping;
    @Basic(optional = false)
    @Column(name = "city_shipping")
    private String cityShipping;
    @Basic(optional = false)
    @Column(name = "department_shipping")
    private String departmentShipping;
    @Basic(optional = false)
    @Column(name = "phone_number")
    private String phoneNumber;
    @Basic(optional = false)
    @Column(name = "weight_number")
    private Integer weightNumber;
    @Basic(optional = false)
    @Column(name = "declared_value_number")
    private Integer declaredValueNumber;
    @Basic(optional = false)
    @Column(name = "guide_shipping")
    private String guideShipping;
    @Basic(optional = false)
    @Column(name = "comment_shipping")
    private String commentShipping;
    @Basic(optional = false)
    @Column(name = "transport_name")
    private String transportName;

    public ShippingOrder() {
    }

    public ShippingOrder(Long id, Integer orderNumber, Integer deliveryNumber, Integer invoiceNumber, Integer boxSumShipping, String status, String empId, Date datetimeShipping, String companyName, String addressShipping, String cityShipping, String departmentShipping, String phoneNumber, Integer weightNumber, Integer declaredValueNumber, String guideShipping, String commentShipping, String transportName) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.deliveryNumber = deliveryNumber;
        this.invoiceNumber = invoiceNumber;
        this.boxSumShipping = boxSumShipping;
        this.status = status;
        this.empId = empId;
        this.datetimeShipping = datetimeShipping;
        this.companyName = companyName;
        this.addressShipping = addressShipping;
        this.cityShipping = cityShipping;
        this.departmentShipping = departmentShipping;
        this.phoneNumber = phoneNumber;
        this.weightNumber = weightNumber;
        this.declaredValueNumber = declaredValueNumber;
        this.guideShipping = guideShipping;
        this.commentShipping = commentShipping;
        this.transportName = transportName;
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

    public Integer getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(Integer invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Integer getBoxSumShipping() {
        return boxSumShipping;
    }

    public void setBoxSumShipping(Integer boxSumShipping) {
        this.boxSumShipping = boxSumShipping;
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

    public Date getDatetimeShipping() {
        return datetimeShipping;
    }

    public void setDatetimeShipping(Date datetimeShipping) {
        this.datetimeShipping = datetimeShipping;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddressShipping() {
        return addressShipping;
    }

    public void setAddressShipping(String addressShipping) {
        this.addressShipping = addressShipping;
    }

    public String getCityShipping() {
        return cityShipping;
    }

    public void setCityShipping(String cityShipping) {
        this.cityShipping = cityShipping;
    }

    public String getDepartmentShipping() {
        return departmentShipping;
    }

    public void setDepartmentShipping(String departmentShipping) {
        this.departmentShipping = departmentShipping;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getWeightNumber() {
        return weightNumber;
    }

    public void setWeightNumber(Integer weightNumber) {
        this.weightNumber = weightNumber;
    }

    public Integer getDeclaredValueNumber() {
        return declaredValueNumber;
    }

    public void setDeclaredValueNumber(Integer declaredValueNumber) {
        this.declaredValueNumber = declaredValueNumber;
    }

    public String getGuideShipping() {
        return guideShipping;
    }

    public void setGuideShipping(String guideShipping) {
        this.guideShipping = guideShipping;
    }

    public String getCommentShipping() {
        return commentShipping;
    }

    public void setCommentShipping(String commentShipping) {
        this.commentShipping = commentShipping;
    }

    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
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
        final ShippingOrder other = (ShippingOrder) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ShippingOrder{" +
                "id=" + id +
                ", orderNumber=" + orderNumber +
                ", deliveryNumber=" + deliveryNumber +
                ", invoiceNumber=" + invoiceNumber +
                ", boxSumShipping=" + boxSumShipping +
                ", status='" + status + '\'' +
                ", empId='" + empId + '\'' +
                ", datetimeShipping=" + datetimeShipping +
                ", companyName='" + companyName + '\'' +
                ", addressShipping='" + addressShipping + '\'' +
                ", cityShipping='" + cityShipping + '\'' +
                ", departmentShipping='" + departmentShipping + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", weightNumber=" + weightNumber +
                ", declaredValueNumber=" + declaredValueNumber +
                ", guideShipping='" + guideShipping + '\'' +
                ", commentShipping='" + commentShipping + '\'' +
                ", transportName='" + transportName + '\'' +
                '}';
    }
}