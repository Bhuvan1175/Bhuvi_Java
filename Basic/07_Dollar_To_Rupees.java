//Write A programm To Convert Dollar Into Rupees !!
// 1$ =83.40rs
import java.lang.*;
import java.util.*;
class Currency{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Currency In Dollar : ");
        double Dollar;
        double Rupees;
        double CV = 83.40;
        Dollar=sc.nextDouble();
        Rupees=Dollar/CV;
        System.out.println("The Currency Converted From Dollar To Rupees is  "+Rupees);
    }
}
