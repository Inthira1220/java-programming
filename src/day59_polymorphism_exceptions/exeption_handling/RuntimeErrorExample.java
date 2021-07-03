package day59_polymorphism_exceptions.exeption_handling;

public class RuntimeErrorExample {
    public static void main(String[] args) {
        System.out.println(10 / 2);
        System.out.println(10 / 0);  //ArithmeticException, RuntimeErrorExample.java:6
        System.out.println(10 / 3);
    }
}
