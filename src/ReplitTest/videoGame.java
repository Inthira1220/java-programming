package ReplitTest;

//import java.util.Scanner;

public class videoGame {
    public static void main(String[] args) {

        //System.out.println("Enter number of coupons:");
        int coupons = 40;

        int candy = 10;
        int gumball = 3;
        candy = (coupons / 10)%10;

        gumball = (coupons / 3)%3;


        if (coupons >= 10) {
            System.out.println("Number of Candies: " + candy);
            System.out.println("Number of Gumballs: " + gumball);
        } else {
            System.out.println("Not enough coupons");
        }
    }

}
