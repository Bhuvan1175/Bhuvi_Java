//Write a Java program to print the area and perimeter of a circle.
// Area Of Circle = pi*r^2
//Perimeter Of Circle  = 2*pi*r
import java.util.Scanner;
class Circle {
  public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    double pi=3.14;
    double r,AreaOfcircle,PerimeterOfCircle;
    System.out.println("Enter The Value Of Radius :");
    r=sc.nextDouble();
    System.out.println("Radius : "+r);
    AreaOfcircle = pi*r*r;
    PerimeterOfCircle =2*pi*r;
    System.out.println("Area Of Circle Is "+AreaOfcircle);
    System.out.println("Perimeter Of Circle Is "+PerimeterOfcircle);
  }
}
