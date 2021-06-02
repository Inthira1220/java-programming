package day18_conditions_practice_string_intro;

public class ThreeNumbers {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 44;
        int num3 = 110;
        if (num1 >= num2 && num2 >= num3) {
            System.out.println(num1 + " : Print out-> Largest number");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " : Print out-> Largest number");
        } else if (num3 >= num1 && num3 >= num2) { //}else{ only
            System.out.println(num3 + " : Print out-> Largest number");



        }
    }
}
