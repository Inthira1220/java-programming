package day36_methods_with_return;

public class creditScore {
    public static void main(String[] args) {
//        #1. It is a void method
//        #2. The method already has a print command

        /**
         * method name:
         *     checkEligible
         * input/parameter:
         *     int creditScore
         *
         * if creditScore is 700 or more
         *     you are eligible for leasing this car
         * otherwise
         *     Sorry, you are not eligible for leasing this car
         */
        checkEligible(650);
        checkEligible(800);

        System.out.println("CreditScore = " + getCreditScore());
        System.out.println(getCreditScore());
        //assign variable then print
        int score = getCreditScore();
        System.out.println("score = "+score);
        checkEligible(getCreditScore());


    }
    public static void checkEligible(int creditScore){

        if (creditScore >= 700){
            System.out.println("you are eligible for leasing this car");
        }else{
            System.out.println("you are not eligible for leasing this car");
        }
    }
    public static int getCreditScore() {
        return 400;
    }
}
