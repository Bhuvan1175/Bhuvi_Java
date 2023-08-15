// Write A Program To Swap The Two Number Withou Using Any Third Variable!!
import java.lang.*;
class Swaping{
  public static void main(String args[]){
    int x=56;
    int y=98;
    System.out.println("Before Swaping ");
    System.out.println("x : "+ x);
    System.out.println("y : "+ y);
    x=x+y;
    y=x-y;
    x=x-y;
    System.out.println("After Swaping ");
    System.out.println("x : "+ x);
    System.out.println("y : "+ y);
  }
}
