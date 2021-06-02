package ReplitTest;

public class IfElseGrade {
    public static void main(String[] args) {

        int grade = 59;

        if (grade >= 90) {

            System.out.println("excellent");
        } else if (grade < 90 && grade > 70) {
            System.out.println("good");
        } else if (grade < 70 && grade > 60) {
            System.out.println("pass");

        } else if (grade < 60) {
            System.out.println("fail");

        }
    }
}
