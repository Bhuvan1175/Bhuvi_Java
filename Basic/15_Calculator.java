// Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
import java.util.Scanner;
class Calculator {
  public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    int a,b,c,d,m,n,r,s;
    System.out.println("***** Calculator *****");
    System.out.println("Enter The Value for a and b :  ");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println(" Addition = " +(a+b));
    System.out.println(" Subtraction = " +(a-b));
    System.out.println("Multiplication = " +(a*b));
    System.out.println("Division = " +(a/b));
    System.out.println("Average Of Two Number = "+((a+b)/2));
  }
}
    
  //Code By Bhuvi
    
    
