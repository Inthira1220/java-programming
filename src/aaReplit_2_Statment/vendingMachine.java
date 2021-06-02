package aaReplit_2_Statment;

public class vendingMachine {
    public static void main(String[] args) {
        /**
         * Write a program that will determine the change given from the vending machine.
         * The program will accept the cents amount and output the change in quarters, dimes, nickels, and pennies.
         *
         *     The given cents value should be more than 0 and less than 100.
         *     If the given cents is not in the range print "Invalid cents amount" and there should be no other output after
         *
         * In valid cases print the change in this format:
         * Your change is x quarters, x dimes, x nickels, and x pennies
         * 95
         * Your change is 3 quarters, 2 dimes, 0 nickels, and 0 pennies
         */

        int cent = 95;

        if ((cent > 0 && cent < 100)){
            System.out.println("Invalid cents amount = "+ cent);
            int quarter = 95/25;
            int quarterRemain = 95%25;
            int dime = quarterRemain/10;

            System.out.println("your change is "+ quarter+ " quarters"+  dime+" dime ");
        }
    }
}
