public class Employee {
    String Employee_Name ="Bhuvi";
    int Employee_Id =786;
    String Employee_Department="Debugger";
    String Employee_Designation="Head";
    String Employee_Contact_Number="7083623156";
    String Employee_Email="bhuvan1175@gmail.com";
    public static void main(String args[]){
        Employee e1=new Employee();
        Employee e2=new Employee();
        System.out.println("Emplpoyee Name :"+e1.Employee_Name);
        System.out.println("Emplpoyee Id :"+e1.Employee_Id);
        System.out.println("Emplpoyee Department :"+e1.Employee_Department);
        System.out.println("Emplpoyee Designation :"+e1.Employee_Designation);
        System.out.println("Emplpoyee Contact Number :"+e1.Employee_Contact_Number);
        System.out.println("Emplpoyee Email Id :"+e1.Employee_Email);

        System.out.println("######################## Second Employee #########################");

        System.out.println("Emplpoyee Name :"+e2.Employee_Name);
        System.out.println("Emplpoyee Id :"+e2.Employee_Id);
        System.out.println("Emplpoyee Department :"+e2.Employee_Department);
        System.out.println("Emplpoyee Designation :"+e2.Employee_Designation);
        System.out.println("Emplpoyee Contact Number :"+e2.Employee_Contact_Number);
        System.out.println("Emplpoyee Email Id :"+e2.Employee_Email);
    }

}
