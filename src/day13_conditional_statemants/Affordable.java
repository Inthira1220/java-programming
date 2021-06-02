package day13_conditional_statemants;

public class Affordable {
    public static void main(String[] args) {
        double price = 230.44;
        boolean isAffordable = price <= 200.0;
        System.out.println("isAffordable = " + isAffordable);
        if (isAffordable == true) {
            System.out.println("i can affordable!!!, lets but it!" );
        } else {
            System.out.println("Is TOO EXPENSIVE, lets keep coding java");
        }
        System.out.println();

        boolean IsRemoteJob = false;

        //if (IsRemoteJob != true)
        if( !IsRemoteJob){
            System.out.println("Sorry i am not interested!");
        }else{
            System.out.println("Sure I am interested, what is the interview process? ");
        }


    }
}
