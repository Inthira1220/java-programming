package day09_scanner_practice;
import java.util.Scanner;
public class SalaryCalculator2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your hourly rate");
        int hourlyRate = scan.nextInt();//ใส่เรท ทีหลัง เช่น $23 per hour
        int weeklyPay = hourlyRate * 50; //50 ชม ต่อ อาทิตย์
        int monthlyPay = weeklyPay * 4; //4 weeks in 1 month
        int annualPay = monthlyPay * 12;//12 months in 1 year
        int taxPerYear = (annualPay * 10)/100;
        System.out.println("The weekly pay is: $"+ weeklyPay);
        System.out.println("The monthly pay is: $"+ monthlyPay);
        System.out.println("The annual pay is: $"+ annualPay);
        System.out.println("Tax per year: $" + taxPerYear);
    }
}
