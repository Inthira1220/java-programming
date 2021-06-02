package aaReplit_2_Statment;

public class FindMiddleNumber {
    public static void main(String[] args) {
        int num1 = 14;
        int num2 = 52;
        int num3 = 25;

        if (num1>=num2 && num1<=num3){
            System.out.println("Medium value is: "+ num1);
        }else if (num2>=num3 && num2<=num1){
            System.out.println("Medium value is: "+ num2);
        }else if (num3>=num1 && num3<=num2){
            System.out.println("Medium value is: "+ num3);
        }

    }
}
