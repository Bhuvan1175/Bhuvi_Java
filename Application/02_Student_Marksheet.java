 
import java.util.Scanner;
class Marksheet {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter The Student Name Here :");
            String Name=sc.nextLine();
            System.out.println("Enter The " +Name+ " Roll Number :");
            int Roll_no=sc.nextInt();
            int MNM,JAVA,AC,EF,DIP;
            System.out.println("Enter Marks in MNM :  ");
            MNM=sc.nextInt();
            System.out.println("Enter Marks in JAVA : ");
            JAVA=sc.nextInt();
            System.out.println("Enter Marks in AC : ");
            AC=sc.nextInt();
            System.out.println("Enter Marks in EF : ");
            EF=sc.nextInt();
            System.out.println("Enter Marks in DIP : ");
            DIP=sc.nextInt();
            int Total=MNM+JAVA+AC+EF+DIP;
            double Percentage = (Total / 500.0) * 100;
            String Grade;

            if (Percentage >=90){
                Grade="A+";
            }
            else if (Percentage>=80 && Percentage<90) {
                Grade="A";
            }
            else if (Percentage>=70 && Percentage<80){
                Grade="B";
            }
            else if (Percentage>=60 && Percentage<70){
                Grade="C";
            }
            else if (Percentage >= 50 && Percentage<60) {
                Grade="D";
            }
            else if (Percentage>=40 && Percentage<50){
                Grade="E";
            }
            else {
                Grade="F";
            }

            System.out.println("Marksheet  of "  +Name+ " " +Roll_no+  " is as follows\n"+
                    "---------------------------------------------------------------\n"+
                    "Sr. No.  |  Subject                 |  Marks \n"+
                    "---------------------------------------------------------------\n"+
                    "  01     |     MNM                  | "+MNM+ "\n"+
                    "  02     |     JAVA                 | "+JAVA+ "\n"+
                    "  03     |     AC                   | "+AC+ "\n"+
                    "  04     |     EF                   | "+EF+ "\n"+
                    "  05     |     DIP                  | "+DIP+"\n"+
                    "---------------------------------------------------------------\n"+
                    "Grand Total Of The Marks Is         | "+Total+"\n"+
                    "Percentage obtained is              | "+Percentage+"\n"+
                    "Grade is                            | "+Grade+"\n"+
                    "---------------------------------------------------------------\n");



        }
    }
}

