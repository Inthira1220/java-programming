package day09_scanner_practice;
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Convert Fahrenheit to Celsius");
        System.out.println("Enter your Temperature:");
        double fahrenheitValue = scan.nextDouble();
        double celsiusValue = (fahrenheitValue-32)*5/9;
        System.out.println("Fahrenheir to Celsius: " + celsiusValue+ " c");

        /*Scanner scan1 = new Scanner(System.in);
        System.out.println("test");
        double test = scan1.nextDouble();
        double test1 = test-1;
        System.out.println("print test1 " + test1);*/
        //ลองใส่ ปริ้นเพิ่ม เพื่อถามคำถามต่อไป ไม่ได้เอามาจากคลาส
    }
}
