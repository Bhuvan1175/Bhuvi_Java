import java.util.Scanner;
public class Inventory {
    String Item_Name;
    int Item_Number;
    long Item_Price;

    public void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Item Name : ");
        Item_Name=sc.nextLine();
        System.out.println("Enter Item Number  : ");
        Item_Number=sc.nextInt();
        System.out.println("Enter Item Price :");
        Item_Price=sc.nextLong();
    }
    public void display(){
        System.out.println("Item Name : "+Item_Name);
        System.out.println("Item Number : "+Item_Number);
        System.out.println("Item Price : "+Item_Price);
    }
    public static void main(String args[]){
        Inventory I1=new Inventory();
        Inventory I2=new Inventory();
        System.out.println("Detail For First Inventory Shop : ");
        I1.getdata();
        I1.display();
        System.out.println("Detail For Second Inventory Shop : ");
        I2.getdata();
        I2.display();

    }

}
