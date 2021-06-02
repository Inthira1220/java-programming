package day09_scanner_practice;
import java.util.Scanner;
public class GroceryShopping {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Target's Grocery");
        System.out.println("Enter price of milk");
        double milk = scan.nextDouble();
        System.out.println("Enter price of bread");
        double bread = scan.nextDouble();
        System.out.println("Enter price of cucumber");
        double cucumber = scan.nextDouble();
        double totalGrocery = milk+bread+cucumber;
        System.out.println("Total of the grocery $" + totalGrocery);
    }
}
/*Target
milk, bread, cucumber
Flow
Enter price for milk 3.99
bread 2.55
cucumber 4.10
total 10.33

*/

