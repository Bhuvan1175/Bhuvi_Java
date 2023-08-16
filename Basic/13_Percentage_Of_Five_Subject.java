//Write A program To Display Percentage Of Five Subjects Marks Will Be Given From End User !!
import java.util.Scanner;
class Marksheet{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double TotalMarks,Percentage;
    int MNM,Java,Finance,AC,DIP;
    String Name ;
    System.out.println("May I Know Your Name ?");
    Name = sc.nextLine();
    System.out.println("Hello , I "+Name);
    System.out.println("Enter The Marks Of MNM : ");
    MNM = sc.nextInt();
    System.out.println("Enter The Marks Of Java : ");
    Java = sc.nextInt();
    System.out.println("Enter The Marks Of Finance : ");
    Finance = sc.nextInt();
    System.out.println("Enter The Marks Of AC : ");
    AC = sc.nextInt();
    System.out.println("Enter The Marks Of DIP : ");
    DIP = sc.nextInt();
    TotalMarks=MNM + Java + Finance + AC + DIP;
    System.out.println("Toatl Marks Obtain From 500 is "+TotalMarks);
    Percentage = (TotalMarks/500)*100;
    System.out.println("Percentage Of "+ Name + "Is : " +Percentage );
  }
}

//Code By Bhuvi
    
