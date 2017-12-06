package co.igb.dto;

import java.util.List;

/**
 *
 * @author dbotero
 */
public class OrderAssignmentDTO {

    private String assignedBy;
    private String employeeId;
    private List<Integer> orders;

    public OrderAssignmentDTO() {
    }

    public String getAssignedBy() {
        return assignedBy;
    }

    public void setAssignedBy(String assignedBy) {
        this.assignedBy = assignedBy;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public List<Integer> getOrders() {
        return orders;
    }

    public void setOrders(List<Integer> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "OrderAssignmentDTO{" + "assignedBy=" + assignedBy + ", employeeId=" + employeeId + ", orders=" + orders + '}';
    }

}
