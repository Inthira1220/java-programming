package day14_multi_branch_if_statements;
import java.util.Scanner;
public class CalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input first number.");
        double num1 = scan.nextDouble();
        System.out.println("Input second number.");
        double num2 = scan.nextDouble();
        System.out.println("enter operators: +, -, * or /");
        char operator = scan.next().charAt(0);
        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*'){
            System.out.println(num1 * num2);
        } else if (operator == '/'){
            System.out.println(num1 / num2);
        } else {
            System.out.println("invalid operator:" + operator);
        }
    }
}

/*


create scanner object
print "enter 2 numbers"
num1 -> 44.3
num2 -> 23.4
char operator = scan.next().charAt(0);
print "enter operator: - , +, *, /"
based on selection run if statement
 */