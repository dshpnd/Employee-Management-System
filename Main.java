package Emp;import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LeaveManagementSystem system = new LeaveManagementSystem();
        Scanner sc = new Scanner(System.in);

        System.out.println("Leave Management System");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Apply for Leave");
            System.out.println("3. Approve Leave");
            System.out.println("4. Reject Leave");
            System.out.println("5. View Leave Requests");
//            System.out.println("6. View Employee Leave Balances");
            System.out.println("6. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    
                    System.out.println("Employee ID:");
                    String empId = sc.nextLine();
                    System.out.println("Employee Name:");
                    String empName = sc.nextLine();
                    System.out.println("Enter Leave Balance:");
                    int leaveBalance = sc.nextInt();
                    sc.nextLine(); 
                    system.addEmployee(new Employee(empId, empName, leaveBalance));
                    System.out.println("Added Successfully.");
                    break;

                case 2://To apply leave 
                    
                    System.out.println("Enter Employee ID to apply for leave:");
                    empId = sc.nextLine();
                    System.out.println("Enter number of leave days:");
                    int leaveDays = sc.nextInt();
                    sc.nextLine(); 
                    system.applyForLeave(empId, leaveDays);
                    break;

                case 3:// Leave Approve
                    
                    System.out.println("Enter Employee ID to approve leave:");
                    empId = sc.nextLine();
                    system.approveLeave(empId);
                    break;

                case 4://Reject
                    
                    System.out.println("Enter Employee ID to reject leave:");
                    empId = sc.nextLine();
                    system.rejectLeave(empId);
                    break;

                case 5:// Chcek leave Request
                    
                    system.viewLeaveRequests();
                    break;

//                case 6:// View employee leave balances
//                    
//                    system.viewLeaveBalances();
//                    break;

                case 6:
                    System.out.println("Thanks For Using ");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!! Try again!!");
            }
        }
    }
}
