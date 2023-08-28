import java.util.Scanner;

public class Employee1 {
    Scanner sc = new Scanner(System.in);

    String Employee_Name;
    int Employee_Id;
    String Employee_Department;
    String Employee_Designation;
    String Employee_Contact_Number;
    String Employee_Email;

    public Employee1() {
        System.out.println("Enter Your Name : ");
        Employee_Name = sc.nextLine();

        System.out.println("Enter The Employee Id :");
        Employee_Id = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter The Employee Department :");
        Employee_Department = sc.nextLine();

        System.out.println("Enter The Employee Designation :");
        Employee_Designation = sc.nextLine();

        System.out.println("Enter The Employee Contact Number :");
        Employee_Contact_Number = sc.nextLine();

        System.out.println("Enter The Employee Email Id :");
        Employee_Email = sc.nextLine();
    }

    public static void main(String args[]) {
        Employee e1 = new Employee1();
        Employee e2 = new Employee1();

        System.out.println("######################## First Employee #########################");
        System.out.println("Employee Name: " + e1.Employee_Name);
        System.out.println("Employee Id: " + e1.Employee_Id);
        System.out.println("Employee Department: " + e1.Employee_Department);
        System.out.println("Employee Designation: " + e1.Employee_Designation);
        System.out.println("Employee Contact Number: " + e1.Employee_Contact_Number);
        System.out.println("Employee Email Id: " + e1.Employee_Email);

        System.out.println("######################## Second Employee #########################");
        System.out.println("Employee Name: " + e2.Employee_Name);
        System.out.println("Employee Id: " + e2.Employee_Id);
        System.out.println("Employee Department: " + e2.Employee_Department);
        System.out.println("Employee Designation: " + e2.Employee_Designation);
        System.out.println("Employee Contact Number: " + e2.Employee_Contact_Number);
        System.out.println("Employee Email Id: " + e2.Employee_Email);
    }
}
