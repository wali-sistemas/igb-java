package co.igb.persistence.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author YEIJARA
 */
@Entity
@Table(name = "report_picking_progress")
public class ReportPickingProgress implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "idreport_picking_progress")
    private Integer id;
    @Column(name = "order_number")
    private Integer orderNumber;
    @Column(name = "dias")
    private Integer dias;
    @Column(name = "horas")
    private Integer horas;
    @Column(name = "minutos")
    private Integer minutos;
    @Column(name = "segundos")
    private Integer segundos;
    @Column(name = "promedio")
    private Double promedio;
    @Column(name = "total_tiempo")
    private Double totalTiempo;

    public ReportPickingProgress() {
    }

    public ReportPickingProgress(Integer id) {
        this.id = id;
    }

    public ReportPickingProgress(Integer id, Integer orderNumber, Integer dias, Integer horas, Integer minutos,
            Integer segundos, Double promedio, Double totalTiempo) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.dias = dias;
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        this.promedio = promedio;
        this.totalTiempo = totalTiempo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }

    public Integer getSegundos() {
        return segundos;
    }

    public void setSegundos(Integer segundos) {
        this.segundos = segundos;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public Double getTotalTiempo() {
        return totalTiempo;
    }

    public void setTotalTiempo(Double totalTiempo) {
        this.totalTiempo = totalTiempo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReportPickingProgress)) {
            return false;
        }
        ReportPickingProgress other = (ReportPickingProgress) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "co.igb.persistence.entity.ReportPickingProgress[ id=" + id + " ]";
    }
}
