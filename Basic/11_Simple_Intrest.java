 //Write A Program To Print The Simple Interest ..
//Simple Interest = (P*R*T)/100

import java.lang.*;
import java.util.*;
class SimpleInterest{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    double Simple_Interest,Principal,Rate,Time;
    System.out.println("Enter The Principal Value : ");
    Principal = sc.nextDouble();
    System.out.println("Enter The Rate Value : ");
    Rate = sc.nextDouble();
    System.out.println("Enter The Time Value : ");
    Time = sc.nextDouble();
    Simple_Interest = (Principal * Rate * Time ) / 100;
    System.out.println("Simple Interest Is "+ Simple_Interest );
  }
}
    
