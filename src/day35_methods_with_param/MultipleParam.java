package day35_methods_with_param;
import java.util.Scanner;
import java.beans.PropertyEditorSupport;

public class MultipleParam {
    /**
     * Method name: showSum
     * params/inputs: double num1, double num2
     * it adds numbers and print result
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        showSum(2,3);
        showSum(2.3, 3.3);
        System.out.println("Enter 2 number:");
        double s1 = scan.nextDouble();
        double s2 = scan.nextDouble();
        showSum(s1, s2);

    }
    public static void showSum(double num1, double num2 ){

        double result = num1+num2;
        System.out.println("sum of -->"+ num1 +" + "+num2+ " = "+result);
    }
}
