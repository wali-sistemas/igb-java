package co.igb.dto;

import java.util.Arrays;
import java.util.List;

/**
 * @author dbotero
 */
public class OrderAssignmentDTO {

    private String assignedBy;
    private String employeeId;
    private List<String[]> orders;

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

    public List<String[]> getOrders() {
        return orders;
    }

    public void setOrders(List<String[]> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OrderAssignmentDTO{" + "assignedBy=").append(assignedBy).append(", employeeId=").append(employeeId).append(", orders=");
        for (String[] str : orders) {
            sb.append(Arrays.toString(str));
        }
        sb.append("}");
        return sb.toString();
    }
}
