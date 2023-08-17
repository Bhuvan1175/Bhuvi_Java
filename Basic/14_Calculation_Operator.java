//Write a Java program to print the results of the following operations.
//Test Data:
//a. -5 + 8 * 6
//b. (55+9) % 9
//c. 20 + -3*5 / 8
//d. 5 + 15 / 3 * 2 - 8 % 3

import java.util.Scanner;
class Calculation{
  public static void main(String args[]){
    System.out.println(" a) The Result Of ( -5 + 8 * 6) is" +  (-5 + 8 * 6));
    System.out.println(" b) The Result Of ((55+9) % 9) is " +((55+9) % 9));
    System.out.println(" c) The Result Of (20 + -3*5 / 8) is" + ( 20 + -3*5 / 8));
    System.out.println(" d) The Result Of (5 + 15 / 3 * 2 - 8 % 3) is" + (5 + 15 / 3 * 2 - 8 % 3));
  }
}
