package day12_conditional_statemants;

public class ComparisonExample {
    public static void main(String[] args) {
        int currentSpeed, speedLimit;
        currentSpeed = 45;
        speedLimit = 55;
        System.out.println(currentSpeed==speedLimit);
        System.out.println(currentSpeed>speedLimit);
        System.out.println(currentSpeed<speedLimit);
        System.out.println(currentSpeed>=speedLimit);
        System.out.println(currentSpeed<=speedLimit);
        System.out.println(currentSpeed!=speedLimit);

        boolean isSpeeding  = currentSpeed > speedLimit;
        System.out.println("Are you speeding? ->"+ isSpeeding);
        System.out.println("current speeding " +currentSpeed);
        System.out.println("speed Limit " +speedLimit);
        currentSpeed += 20;//45+20+65
        System.out.println(currentSpeed>speedLimit);
        System.out.println(currentSpeed>speedLimit);
        System.out.println(currentSpeed<speedLimit);
        System.out.println(currentSpeed>=speedLimit);
        System.out.println(currentSpeed<=speedLimit);
        System.out.println(currentSpeed!=speedLimit);

        boolean isSpeeding1  = currentSpeed > speedLimit;
        System.out.println("Are you speeding? ->"+ isSpeeding1);
        System.out.println("current speeding " +currentSpeed);
        System.out.println("speed Limit " +speedLimit);
        System.out.println("");

        double accountBalance = 250.25;
        double itemPrice = 100;
        System.out.println(accountBalance==itemPrice);
        System.out.println(accountBalance>=itemPrice);
        System.out.println("Can i afford -->" + (accountBalance<=itemPrice) );

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("Can i afford -->" + canAfford);
        accountBalance = accountBalance - itemPrice;
        accountBalance-=itemPrice;// chart twice in the same items

        boolean inBroke = accountBalance <= 0 ;
        System.out.println("Am i Broke : " + inBroke);

    }
}
