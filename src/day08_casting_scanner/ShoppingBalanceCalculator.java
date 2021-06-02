package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        double balance = 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15;
        double initialBalance = price1+price2+price3;
        double remainingBalance = balance - initialBalance;
        int balanceWithNoCent = (int)remainingBalance;
        System.out.println("- Total of stuffs i bought = $"+price1+price2+price3);
        System.out.println("- I have $"+balance+" and i spent out $" +initialBalance +", now after shopping i have money left $"+remainingBalance );
        System.out.println("- The remaining balance without cents $"+balanceWithNoCent);



    }
}
