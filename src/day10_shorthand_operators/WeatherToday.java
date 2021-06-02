package day10_shorthand_operators;
import java.util.Scanner;
public class WeatherToday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How is the weather today?");
        String weather = scan.nextLine();// nextLine() can put the whole sentences, next() only 1 word
        System.out.println(weather+ " is a nice day today!");

        //sunny, raining, very cold, very hot
        //question = How is the weather today? cold
        //cold- is a nice day today!

    }
}
