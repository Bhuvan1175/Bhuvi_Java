import java.util.Scanner;

public class Emp_Method {
    String Employee_Name;
    int Employee_Id;
    String Employee_Department;
    String Employee_Designation;
    String Employee_Contact;
    String Employee_Email;

    public void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name:");
        Employee_Name = sc.nextLine();
        System.out.println("Enter Employee ID:");
        Employee_Id = sc.nextInt();
	  sc.nextLine();
        System.out.println("Enter Employee Department:");
        Employee_Department = sc.nextLine();
        System.out.println("Enter Employee Designation:");
        Employee_Designation = sc.nextLine();
        System.out.println("Enter Employee Contact Number:");
        Employee_Contact = sc.nextLine();
        System.out.println("Enter Employee Email Id:");
        Employee_Email = sc.nextLine();
    }

    public void display() {
        System.out.println("Employee Name: " + Employee_Name);
        System.out.println("Employee Id: " + Employee_Id);
        System.out.println("Employee Department: " + Employee_Department);
        System.out.println("Employee Designation: " + Employee_Designation);
        System.out.println("Employee Contact Number: " + Employee_Contact);
        System.out.println("Employee Email Id: " + Employee_Email);
    }

    public static void main(String args[]) {
        Emp_Method E1 = new Emp_Method();
        Emp_Method E2 = new Emp_Method();
        System.out.println("Detail Of Employee-1 ");
        E1.getdata();
        E1.display();
        System.out.println("Detail Of Employee-2 ");
        E2.getdata();
        E2.display();
    }
}
