package day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args){
        int num1 = 1;
        num1++;
        ++num1;
        System.out.println("num1 = " + num1);//=>3
        int num2 = 5;
        num2--;
        --num2;
        System.out.println( "num2 =" +num2);//3

        // pre increment
        int num3 = 4;
        int num4 = ++num3;
        System.out.println("num3 = " + num3);//5 left to right
        System.out.println("num4 = " +num4); // result is 5 from left to right

        // post increment
        int num5 = 4;
        int num6 = num5++;
        System.out.println("num5 = " + num5);//5 left to right
        System.out.println("num6 = " +num6); // result is "4" from left to right

    }
}
