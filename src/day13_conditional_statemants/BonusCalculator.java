package day13_conditional_statemants;

public class BonusCalculator {
    public static void main(String[] args) {

        double bonus = 0;
        double saleAmount = 2000.55;

        if (saleAmount <= 2000.55) {

            System.out.println("Good job, you qualified for bonus!");
            bonus = 50.0;
        } else {

            System.out.println("Great job, you are qualified for full bonus");
            bonus = 100.0;
        }
        System.out.println("Your total bonus : $" + bonus);
        System.out.println("Your Sale Amount with bonus is :$" + (saleAmount+bonus));
    }
}

        /*
        double bonus = 0;
       double salesAmount = 2000.55;
       if(salesAmount <= 2000.35){
           bonus = 50;
           System.out.println("Good job, you qualified for bonus " + bonus);
       } else {
           bonus = 100;
           System.out.println("Good job, you qualified for bonus " + bonus);
         */
        /*bonus = 0;
            salesAmount = 2000.55;

            if salesAmount <= 1000
            "Good job, you qualified for bonus!"
    -> assign 50 to bonus
else
            "Great job, you are qualified for full bonus"
    -> assign 100 to bonus

            Your bonus for salesAmount is $100
     */


