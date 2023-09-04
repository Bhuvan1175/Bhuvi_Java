import java.util.Scanner;
public class Salary {
    long Basic_Salary;
    double HRA=0.40;
    double TA=0.30;
    double DA=0.90;
    long PF_Deduction=2400;
    long LIC_Deduction=2000;
    long TDS=800;
    double Incentive=0.05;
    double Gross_Salary;
    int lucky_Num;

    public void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Basic Salary : ");
        Basic_Salary=sc.nextLong();
        System.out.println("Enter Your Lucky Number (1-7):");
        lucky_Num=sc.nextInt();
    }
    public void Calculate(){
        HRA=0.40*Basic_Salary;
        TA=0.30*Basic_Salary;
        DA=0.90*Basic_Salary;
        Incentive=0.05*Basic_Salary;
        TDS=800;
        PF_Deduction=2400;
        LIC_Deduction=2000;
        Gross_Salary=Basic_Salary+HRA+TA+DA+Incentive-PF_Deduction-LIC_Deduction-TDS;

    }
    public void display(){
        System.out.println("Basic Salary : "+Basic_Salary);
        System.out.println("HRA :"+HRA);
        System.out.println("TA : "+TA);
        System.out.println("DA :"+DA);
        System.out.println("Gross Salary :"+Gross_Salary);
    }
    public void LuckyDrwa(){
        switch(lucky_Num){
            case 1:
                System.out.println("Congratulations You Got A 8% Adding Incentive : ");
                Gross_Salary=Gross_Salary+0.08*Basic_Salary;
                System.out.println("Gross Salary : "+Gross_Salary);
                break;

            case 2:
                System.out.println("Congratulations You Got A 6% Adding Incentive : ");
                Gross_Salary=Gross_Salary+0.06*Basic_Salary;
                System.out.println("Gross Salary : "+Gross_Salary);
                break;
            case 3:
                System.out.println("Congratulations You Got A 0% Adding Incentive : ");
                Gross_Salary=Gross_Salary+0.00*Basic_Salary;
                System.out.println("Gross Salary : "+Gross_Salary);
                break;
            case 4:
                System.out.println("Congratulations You Got A 10% Adding Incentive : ");
                Gross_Salary=Gross_Salary+0.1*Basic_Salary;
                System.out.println("Gross Salary : "+Gross_Salary);
                break;
            case 5:
                System.out.println("Congratulations You Got A 0.11% Adding Incentive : ");
                Gross_Salary=Gross_Salary+0.0011*Basic_Salary;
                System.out.println("Gross Salary : "+Gross_Salary);
                break;
            case 6:
                System.out.println("Congratulations You Got A Cooker : ");
                Gross_Salary=Gross_Salary+0;
                System.out.println("Gross Salary : "+Gross_Salary);
                break;
            case 7:
                System.out.println("Congratulations You Got A Lots OF Love : ");
                Gross_Salary=Gross_Salary+0;
                System.out.println("Gross Salary : "+Gross_Salary);
                break;

            default:
                System.out.println("Sorry Try Next Year");
                break;
        }

    }
    public static void main(String args[]){
        Salary S1=new Salary();
        System.out.println("#############################Salary Detail #############################");
        S1.getdata();
        S1.Calculate();
        S1.display();
        S1.LuckyDrwa();
    }
}
