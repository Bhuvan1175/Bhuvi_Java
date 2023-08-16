//Write A Program To Solve The Area Of Ellipse Problem!!
import java.lang.*;
import java.util.*;
class Area_Of_Ellipse{
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      double Area_Of_Ellipse,FirstAxis,SecondAxis;
      double pi=3.14;
      System.out.println("Enter The Value Of First Axis : ");
      FirstAxis=sc.nextDouble();
      System.out.println("Enter The Value Of Second Axis : ");
      SecondAxis=sc.nextDouble();
      Area_Of_Ellipse = pi * FirstAxis * SecondAxis;
      System.out.println("Area Of Ellipse is "+ Area_Of_Ellipse);
  }
}

// Code By Bhuvi
