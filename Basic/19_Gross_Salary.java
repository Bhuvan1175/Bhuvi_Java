import java.util.Scanner;
class Salary{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		long Basic_Salary;
		System.out.println("Enter Your Basic Salary :");
		Basic_Salary=sc.nextLong();
		int incentive=5000;
		int pf_deduction=2500;
		int TDS =800;
		int Lic_deduction=2400;
		double HRA,TA,DA,Gross_Salary;
		HRA = 0.4*Basic_Salary;
    TA=0.3*Basic_Salary;
    DA=0.9*Basic_Salary;
    Gross_Salary=HRA+TA+DA+incentive-TDS-Lic_deduction-pf_deduction;
    System.out.println("Gross Salary Is "+Gross_Salary);
  }
}
    
