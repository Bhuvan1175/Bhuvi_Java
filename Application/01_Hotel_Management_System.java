 import java.util.Scanner;
class Hotel {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int bill=0;
        String choice="Y";
        while (choice.equals("Y")){
            System.out.println("----------------------------------------------------------------------------" +
                    "\n-------------------------Welcome To Hotel Crispy!!--------------------------" +
                    "\n----------------------------------------------------------------------------");
            System.out.println("                                                                              ");
            System.out.println("####################### MENU CARD OF CRISPY HOTEL ##########################");
            System.out.println(" Item number| Item name \t\t\t\t\t | Price\t\t");
            System.out.println(" 1. \t\t| Howzatt Biryani Combo  \t\t | 725 /-  ");
            System.out.println(" 2. \t\t| Super 6s Bucket meal   \t\t | 978 /-  ");
            System.out.println(" 3. \t\t| Super 4s Bucket meal   \t\t | 608 /-  ");
            System.out.println(" 4. \t\t| 5pc Smoky Red Chicken  \t\t | 524 /-  ");
            System.out.println(" 5. \t\t| Classic Biryani Combo  \t\t | 777 /-  ");
            System.out.println(" 6. \t\t| Tandoori Zinger Burger \t\t | 209 /-  ");
            System.out.println(" 7. \t\t| Cold Drink             \t\t | 040 /-  ");
            System.out.println(" 8. \t\t| Classic Zinger meal    \t\t | 362 /-  ");
            System.out.println("Enter the item number you want to order : ");
            int item_Number =sc.nextInt();
            System.out.println("You Entered the " + item_Number + "Number Item From Menu Card Of Our Hotel");


            switch (item_Number) {
                case 1:
                    bill = bill + 725;
                    System.out.println("You ordered Howzatt Biryani Combo worth 725/-");
                    break;
                case 2:
                    bill = bill + 978;
                    System.out.println("You ordered Super 6s Bucket meal worth 978/-");
                    break;
                case 3:
                    bill = bill + 608;
                    System.out.println("You ordered Super 4s Bucket meal 608/-");
                    break;
                case 4:
                    bill = bill + 524;
                    System.out.println("5pc Smoky Red Chicken 524/-");
                    break;
                case 5:
                    bill = bill + 777;
                    System.out.println("Classic Biryani Combo 777/-");
                    break;
                case 6:
                    bill = bill + 209;
                    System.out.println("Tandoori Zinger Burger 209/-");
                    break;
                case 7:
                    bill = bill + 040;
                    System.out.println("Cold Drinks 040/-");
                    break;
                case 8:
                    bill = bill + 362;
                    System.out.println("Classic Zinger meal 362/-");
                    break;
                default:
                    System.out.println("End");
            }
            System.out.println("Enter The Y or N: ");
            choice = sc.next();
            if (choice.equals("Y") || choice.equals("y")) {
                continue;
            } else {
                break;
            }

        }
        double discount = 0;
        if (bill > 100 && bill < 500) {
            discount = 0.1 * bill;
        } else if (bill > 500 && bill < 1000) {
            discount = 0.15 * bill;
        } else if (bill > 1000) {
            discount = 0.20 * bill;
        }
        double totalBill = (bill - discount) + 0.18 * bill; // gst is 18%
        System.out.println("Your bill is (including gst and discount): " + totalBill);
        System.out.println("Thank You , Visit again");

    }
}
