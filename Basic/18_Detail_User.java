import java.util.Scanner;
public class DetailUser{
	public static void main(String arg[]){
	
		Scanner sc=new Scanner(System.in);
		String Name ,Section, Dept ,Gender;
		int Age;
		long ContactNumber;
		System.out.println("Enter Your Name : \n");
		Name=sc.nextLine();
		System.out.println("Enter Your Department :  \n");
		Dept=sc.nextLine();
		System.out.println("Enter Your Section :  \n");
		Section=sc.nextLine();
		System.out.println("Enter Your Gender :  \n");
		Gender=sc.nextLine();
		System.out.println("Enter Your Age : \n");
		Age=sc.nextInt();
		System.out.println("Enter Your Contact Number : \n");
		ContactNumber=sc.nextLong();
		System.out.println("*******************************************");

		System.out.println("Name	         :"+Name);
		System.out.println("Department     :"+Dept);
		System.out.println("Section        :"+Section);
		System.out.println("Gender 		     :"+Gender);
		System.out.println("Age 		       :"+Age);
		System.out.println("Contact Number :"+ContactNumber);
		System.out.println("\n Thank You");

		System.out.println("*******************************************");

	}
}
