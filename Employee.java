package Emp;
public class Employee {
    private String id;
    private String name;
    private int leaveBalance; 

    public Employee(String id, String name, int leaveBalance) {
        this.id = id;
        this.name = name;
        this.leaveBalance = leaveBalance;
    }

    public void decreaseLeaveBalance(int days) {
        this.leaveBalance -= days;
    }

    public int getLeaveBalance() {
        return leaveBalance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

	public void applyForLeave(int leaveDays) {
		// TODO Auto-generated method stub
		
	}
}
