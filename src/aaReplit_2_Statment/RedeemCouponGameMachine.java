package aaReplit_2_Statment;

public class RedeemCouponGameMachine {
    public static void main(String[] args) {
        int numberOfCoupons = 23;
        int candyBar = 10; //10 coupons = 1 candy bar
        int gumball = 3; // 3 coupons = 1 gumball


        int numberOfCandy = numberOfCoupons/candyBar;
        int numberOfCandyRemainder = numberOfCoupons % candyBar;
        int numberOfGumball = gumball / numberOfCandyRemainder;
//        System.out.println("Number of Candies: " + numberOfCandy);
//        System.out.println("numberOfCandyRemainder = " + numberOfCandyRemainder);
//        System.out.println("numberOfGumball = " + numberOfGumball);

        if (numberOfCoupons >= candyBar) {
            System.out.println("Number of Candies: " + numberOfCandy);
            System.out.println("Number of Gumballs: " + numberOfGumball);
        }else{
            System.out.println("Not enough coupons");
        }
    }
}
