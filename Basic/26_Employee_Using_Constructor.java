public class Employee_Cons {
    //Parameterized Constructor
        int id ;
        String name;
        String Department;
        String Designation;
        Employee_Cons(int x,String n,String d,String desi){
            System.out.println("Object Is Created : ");
            id =x;
            name =n;
            Department=d;
            Designation=desi;
        }
        void display(){
            System.out.println("Id :"+id);
            System.out.println("Name :"+name);
            System.out.println("Department :"+Department);
            System.out.println("Designation :"+Designation);
        }

        public static void main(String[] args) {
            Employee_Cons E1=new Employee_Cons(007,"Bhuvi","ETC","Student");
            E1.display();
        }
    }


