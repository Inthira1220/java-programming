package day10_shorthand_operators;


import java.util.Scanner;
public class NextLIneBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("put rent and month");
        double rent = scan.nextDouble();//reproduce the issue
        scan.nextLine();                //fix the known bug!!.  add empty one with out String in their
        String month = scan.nextLine();
        System.out.println("How much do you pay for rent? : $"+ rent);
        System.out.println("Which month you didnt pay yet? "+ month);
    }
}
