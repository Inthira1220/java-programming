package day48_constructors_static.example;

public class CalculatorTest {
    public static void main(String[] args) {

        //add is static method, can be called using Classname.staticMathMethodName
        //static way of calling the method
        Calculator.add(1,2);

        Calculator calculatorMultiple = new Calculator();
        calculatorMultiple.multiply(1,2);

        calculatorMultiple.add(10,10);

    }
}
