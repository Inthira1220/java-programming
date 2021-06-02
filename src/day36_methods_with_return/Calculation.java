package day36_methods_with_return;

public class Calculation {
    public static void main(String[] args) {
/**
 * add new Calculations
 * add main method
 * call Calculator class methods there
 */
        Calculator.add(10, 45);
        System.out.println("add 10+45 = " + Calculator.add(10, 45));
        Calculator.multiply(10, 10);
        System.out.println(Calculator.multiply(10, 10));

        double d1 = 234.3;
        double d2 = 321.5;
        double result = Calculator.minus(d1, d2);
        System.out.println("result = " + result);

    }

}
