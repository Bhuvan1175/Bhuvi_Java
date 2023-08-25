import java.util.Scanner;
class Factorial{
  public static void main(String args[]){
    int Result=1;
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Any Number : ");
    num=sc.nextInt();
    for(int i=1 ; i<=num ; i++){
      Result=Result*i;
    }
    System.out.println("Factorial : "+Result);
  }
}
