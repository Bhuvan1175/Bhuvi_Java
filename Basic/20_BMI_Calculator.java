import java.util.Scanner;
class BMI{
  public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    double Height,Weight,BMI;
    System.out.println("Enter Your Weight :");
    Weight=sc.nextDouble();
    System.out.println("Enter Your Height :");
    Height=sc.nextDouble();
    BMI=Weight/(Height*Height);
    System.out.println("Your Height : "+Height);
    System.out.println("Your Weight : "+Weight);
    System.out.println("BMI Is "+BMI+ "kg/m2");
  }
}
