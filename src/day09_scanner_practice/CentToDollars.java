package day09_scanner_practice;
import java.util.Scanner;
public class CentToDollars {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Cents to Dollar");
        int cents = scan1.nextInt();
        int dollars = cents /100;
        int remainingCents = cents % 100;
        System.out.println("Answer:" + dollars+ " Dollars and "+ remainingCents + " cents");
        System.out.println("**************************");
        Scanner scan2 = new Scanner(System.in);
        System.out.println("How many dimes in the dollar");
        int dimes = scan2.nextInt();
        int dollars1 = dimes / 10;
        int remainingDimes = dimes % 10;

        System.out.println("Answer " + dollars1 + " dimes and " + remainingDimes + " cents");


    }
}
