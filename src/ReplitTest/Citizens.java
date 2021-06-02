package ReplitTest;
import java.util.Scanner;
public class Citizens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int senior = scan.nextInt();
        int nonsenior = scan.nextInt();
        System.out.println("What is new citizen's age?");
        int age = scan.nextInt();

        if (age >= 65) {
            senior++;
            System.out.println("Senior Citizen");
            System.out.println("New seniorCitizens count " + senior);
            System.out.println("New nonSeniorCitizens count " + nonsenior);
        } else {
            nonsenior++;
            System.out.println("Non-Senior Citizen");
            System.out.println("New seniorCitizens count " + senior);
            System.out.println("New nonSeniorCitizens count " + nonsenior);
        }
    }
}