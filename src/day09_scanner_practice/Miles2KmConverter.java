package day09_scanner_practice;
import java.util.Scanner;
public class Miles2KmConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("---->Miles to Converse to Kilometer<----");
        System.out.println("Enter miles:");
        double mile = scan.nextDouble();
        double kilometer = mile * 1.609;
        System.out.println("Converse mile per kilometers = " +kilometer + " kms");
    }
}
/*
scanner object
enter mile = 10
miles10, kilometer:16.0934
formula = mile * 16.609

 */