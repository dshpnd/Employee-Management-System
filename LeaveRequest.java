package Emp;
public class LeaveRequest {
    String employeeId;
    private String startDate;
    private String endDate;
    private String status; 

    public LeaveRequest(String employeeId, String startDate, String endDate) {
        this.employeeId = employeeId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = "Pending";
    }

    public void approve() {
        this.status = "Approved";
    }

    public void reject() {
        this.status = "Rejected";
    }

    public String getStatus() {
        return status;
    }
    
    
}
