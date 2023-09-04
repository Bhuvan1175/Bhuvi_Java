import javax.net.ssl.ManagerFactoryParameters;

//Copy Constructor
public class DemoEmployee {
    int emp_id;
    String name;
    String dept;
    String desg;
    DemoEmployee(int i,String n,String d,String t){
        emp_id=i;
        name=n;
        dept=d;
        desg=t;
    }
    DemoEmployee(DemoEmployee E){
        emp_id=E.emp_id;
        name=E.name;
        dept=E.dept;
        desg=E.desg;
    }
    void display(){
        System.out.println("Detail Of Employee");
        System.out.println("Employee Id : "+emp_id);
        System.out.println("Name :"+name);
        System.out.println("Department"+dept);
        System.out.println("Designation"+desg);
        System.out.println("                 ");
    }

    public static void main(String[] args) {
        DemoEmployee D1=new DemoEmployee(007,"Bhuvi","Automotive", "Manager");
        DemoEmployee D2=new DemoEmployee(D1);
        D2.display();
    }
}
