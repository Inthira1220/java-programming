package ReplitTest;

import java.util.Scanner;

public class SchoolGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        String subjectMath = scan.next();
        double math = scan.nextDouble();
        System.out.println("Please enter subject name number 2 and score for this subject");
        String subjectBiology = scan.next();
        double biology = scan.nextDouble();
        System.out.println("Please enter subject name number 3 and score for this subject");
        String subjectEnglish = scan.next();
        double english = scan.nextDouble();
        System.out.println("Please enter subject name number 4 and score for this subject");
        String subjectChemistry = scan.next();
        double chemistry = scan.nextDouble();
        System.out.println("Please enter subject name number 5 and score for this subject");
        String subjectMusic = scan.next();
        double music = scan.nextDouble();

        double averageScore = (math + biology + english + chemistry + music) / 5;
        System.out.println("Summary: Math - 5.0,  Biology - 4.2,  English - 4.4, Chemistry - 4.8, Music - 3.4");
        System.out.println("Your average score is: " + averageScore);

        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");

    }
}
