package day09_scanner_practice;

public class SalaryCalculator {
    public static void main(String[] args) {
        System.out.println("Enter hourly rate:");
        double hourlyRate = 23.0;
        double weeklyPay = hourlyRate * 50;
        double monthlyPay = weeklyPay * 4; //weeklyPay * 4;< might not be accurate
        double annualPay = monthlyPay * 12;
        double taxPay = (annualPay*10)/100;

        System.out.println("Weekly pay: " + weeklyPay);
        System.out.println("Monthly pay: " + monthlyPay);
        System.out.println("Annual pay: " + annualPay);
        System.out.println("Tax per year" + taxPay);
    }
}
