package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("addition += " + add(10.2, 2.0));
        System.out.println("subtraction = " + minus(10.2, 2.0));
        System.out.println("multiplication = " + multiply(10.2, 2.0));
        System.out.println("division = " + divide(10.2, 2.0));
        double sum = add(2, 5);
        System.out.println("sum = " + sum);
        System.out.println("100+200 = " + add(100, 200));

    }

    public static double add(double num1, double num2) {
        double sum = num1 + num2;
        return (sum);   //return num1+num2
    }

    public static double minus(double num1, double num2) {
        double sum = num1 - num2;
        return (sum);   //return num1-num2
    }

    public static double multiply(double num1, double num2) {
        double sum = num1 * num2;
        return (sum);   //return num1*num2
    }

    public static double divide(double num1, double num2) {
        double sum = num1 / num2;
        return (sum);   //return num1/num2
    }
}
