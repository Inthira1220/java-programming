package day09_scanner_practice;
import java.util.Scanner;
public class SpeechCheckV1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your speed limit");
        int currentSpeed = scan.nextInt();
        int speedLimit = 55;
        int overTheLimit = currentSpeed - speedLimit;



        System.out.println("You are driving "+ overTheLimit +
                " mph"+ " over the speed limit, Slow down.");


    }
}
