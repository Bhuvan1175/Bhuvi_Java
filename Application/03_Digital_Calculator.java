import java.util.Scanner;

class DC {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String choice = "Y";
        while (choice.equals("Y")){
            System.out.println("------------------------------------------------------");
            System.out.println("--------------Digital Calculator----------------------");
            System.out.println("------------------------------------------------------");
            System.out.println("--------------Operation Menu -------------------------\n" +
                    "Operation Number        | Operations      \n"+
                    "     01                 |  Addition\n"+
                    "     02                 |  Substraction \n"+
                    "     03                 |  Multiplication \n"+
                    "     04                 |  Division \n"+
                    "     05                 |  Modulus \n"+
                    "     06                 |  Factorial\n");
            System.out.println("Enter The Operation Number That You want : \n");
            int opt_num=sc.nextInt();
            switch(opt_num){
                case 1:
                    System.out.println("Addition Operation");
                    int a, b;
                    System.out.println("Enter The Value For a :\n");
                    a=sc.nextInt();
                    System.out.println("Enter The Value For b :\n");
                    b=sc.nextInt();
                    System.out.println("Addition : "+(a+b));
                    break;
                case 2:
                    System.out.println("Subtraction Operation");
                    int s1, s2;
                    System.out.println("Enter The Value For s1 :\n");
                    s1=sc.nextInt();
                    System.out.println("Enter The Value For s2 :\n");
                    s2=sc.nextInt();
                    System.out.println("Substraction : "+(s1-s2));
                    break;
                case 3:
                    System.out.println("Multiplication Operation");
                    int M1, M2;
                    System.out.println("Enter The Value For M1 :\n");
                    M1=sc.nextInt();
                    System.out.println("Enter The Value For M2 :\n");
                    M2=sc.nextInt();
                    System.out.println("Multiplication : "+(M1*M2));
                    break;
                case 4:
                    System.out.println("Division Operation");
                    float D1, D2;
                    System.out.println("Enter The Value For D1 :\n");
                    D1=sc.nextFloat();
                    System.out.println("Enter The Value For D2 :\n");
                    D2=sc.nextFloat();
                    System.out.println("Division : "+(D1/D2));
                    break;
                case 5:
                    System.out.println("Modulus Operation");
                    float a1, b1;
                    System.out.println("Enter The Value For a1 :\n");
                    a1=sc.nextFloat();
                    System.out.println("Enter The Value For b1 :\n");
                    b1=sc.nextFloat();
                    System.out.println("Modulus : "+(a1%b1));
                    break;
                case 6:
                    System.out.println("Factorial Operation");
                    int Result =1;
                    System.out.println("Enter The Value For Num :\n");
                    int Num=sc.nextInt();
                    for(int i=1;i<=Num;i++) {
                        Result = Result * Num;
                    }
                    System.out.println("Fatorial : "+Result);
                    break;
                default:
                    System.out.println("Sorry Invalid Operation ");
                    break;
            }
            System.out.println("Enter The Y or N: ");
            choice = sc.next();
            if (choice.equals("Y") || choice.equals("y")) {
                continue;
            } else {
                break;
            }
        }
    }
}
