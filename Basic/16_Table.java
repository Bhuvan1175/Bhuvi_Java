//Write a program to print the table that will be entered by end user upto 10 !!

import java.util.Scanner;
class Table{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Number That You Want ToTake Of Its Table :");
    int num,i;
    num=sc.nextInt();
    for(i=1;i<=10;i++){
      System.out.println(num + "X" +(i) "="+(num*i));
    }
  }
}
