package Emp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeaveManagementSystem {
    private HashMap<String, Employee> employees;
    private List<LeaveRequest> leaveRequests;

    public LeaveManagementSystem() {
        employees = new HashMap<>();
        leaveRequests = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    public void applyForLeave(String employeeId, int leaveDays) {
        Employee employee = employees.get(employeeId);
        if (employee != null) {
            employee.applyForLeave(leaveDays);
            LeaveRequest request = new LeaveRequest(employeeId, "2025-02-18", "2025-02-20");  
            leaveRequests.add(request);
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void viewLeaveRequests() {
        for (LeaveRequest request : leaveRequests) {
            System.out.println("Employee ID: " + request.employeeId + ", Status: " + request.getStatus());
        }
    }

    public void approveLeave(String employeeId) {
        for (LeaveRequest request : leaveRequests) {
            if (request.employeeId.equals(employeeId) && request.getStatus().equals("Pending")) {
                request.approve();
                System.out.println("Leave approved for Employee ID: " + employeeId);
                break;
            }
        }
    }

    public void rejectLeave(String employeeId) {
        for (LeaveRequest request : leaveRequests) {
            if (request.employeeId.equals(employeeId) && request.getStatus().equals("Pending")) {
                request.reject();
                System.out.println("Leave rejected for Employee ID: " + employeeId);
                break;
            }
        }
    }

	
}
