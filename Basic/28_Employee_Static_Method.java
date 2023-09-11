import java.util.Scanner;

public class EmployeeStatic {
    String Name;
    int emp_id;
    static String Company_Name = "Infosys";

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name:");
        Name = sc.nextLine();
        System.out.println("Enter Employee Id:");
        emp_id = sc.nextInt();
    }

    void display() {
        System.out.println("Employee Details");
        System.out.println("Employee Name: " + Name);
        System.out.println("Employee Id :"+emp_id);
        System.out.println("Company Name: " + Company_Name);
    }

    static void update() {
        Company_Name = "TCS";
    }

    public static void main(String[] args) {
        EmployeeStatic E1 = new EmployeeStatic();
        System.out.println("First Employee Details");
        E1.getdata();
        System.out.println("##################### Previous Name Of Company ###################");
        E1.display();
        System.out.println("Updating Company Name...");
        update();
        System.out.println("##################### Current Name Of Company ####################");
        E1.display();
    }
}
