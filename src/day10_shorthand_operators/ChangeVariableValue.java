package day10_shorthand_operators;

public class ChangeVariableValue {
    public static void main(String[] args){
        int count = 3;
        System.out.println("count = " + count);
        //aa increase count 2
        count = count + 2;
        System.out.println("count = " + count);

        int apples = 5;
        System.out.println("Apples = " + apples);
        apples = apples + 10;
        System.out.println("Apples = " + apples);
        apples = apples - 3;
        System.out.println("Now i have Apples = " + apples);

        int pizzaSlices = 8;
        System.out.println("pizzaSlice");
        pizzaSlices = pizzaSlices/2;
        System.out.println("i eat half of them and now i have "+ pizzaSlices+ " slices left.");
        //get another whole small pizza just for you 6 slices
        pizzaSlices = pizzaSlices + 6;
        System.out.println("you will have "+ pizzaSlices +" slices of pizza.");
        int players = 10;
        System.out.println("player = " + players);
        players = players *2; //increase double people in the team
        System.out.println("How many player in the team? "+ players);

        int cents = 244;
        System.out.println("cents = "+ cents);
        cents = cents%100;
        System.out.println("remaining cents = "+ cents);
    }
}
