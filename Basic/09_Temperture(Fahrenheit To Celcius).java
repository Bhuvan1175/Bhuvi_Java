//Write A Program To Convert Fahrenheit To Celcius !!
import java.lang.*;
import java.util.*;
class Temperture{
  public static void main (String args[]){
    Scanner sc=new Scanner(system.in);
    double Fahrenheit;
    double Celcius;
    System.out.println("Enter The Temperture in Fahrenheit : ");
    Fahrenheit=sc.nextDouble();
    Celcius =(Fahrenheit - 32)*5/9;
    System.out.println("The Given Temperture in Fahrenheit is Convert Into Celcius Is "+ Celcius);
  }
}
    
