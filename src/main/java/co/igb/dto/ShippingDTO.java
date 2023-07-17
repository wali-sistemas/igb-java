package co.igb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.Date;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShippingDTO {
    @JsonProperty("idshipping_order")
    private int id;
    @JsonProperty("order_number")
    private int order;
    @JsonProperty("delivery_number")
    private int delivery;
    @JsonProperty("box_sum_shipping")
    private int boxSum;
    @JsonProperty("invoice_number")
    private String invoice;
    @JsonProperty("status")
    private String estado;
    @JsonProperty("emp_id")
    private String empId;
    @JsonProperty("company_name")
    private String company;
    @JsonProperty("datetime_shipping")
    private Date fecha;
    @JsonProperty("send_to_cedi")
    private boolean sendToCedi;

    public ShippingDTO() {
    }

    public ShippingDTO(int boxSum, String invoice, boolean sendToCedi) {
        this.boxSum = boxSum;
        this.invoice = invoice;
        this.sendToCedi = sendToCedi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getDelivery() {
        return delivery;
    }

    public void setDelivery(int delivery) {
        this.delivery = delivery;
    }

    public int getBoxSum() {
        return boxSum;
    }

    public void setBoxSum(int boxSum) {
        this.boxSum = boxSum;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isSendToCedi() {
        return sendToCedi;
    }

    public void setSendToCedi(boolean sendToCedi) {
        this.sendToCedi = sendToCedi;
    }

    @Override
    public String toString() {
        return "ShippingDTO{" +
                "id=" + id +
                ", order=" + order +
                ", delivery=" + delivery +
                ", boxSum=" + boxSum +
                ", invoice='" + invoice + '\'' +
                ", estado='" + estado + '\'' +
                ", empId='" + empId + '\'' +
                ", company='" + company + '\'' +
                ", fecha=" + fecha +
                ", sendToCedi=" + sendToCedi +
                '}';
    }
}