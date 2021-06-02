package day15_logicallops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'I';

        if (grade =='A' || grade == 'B' || grade == 'c') {
            System.out.println("Pass when grade is " + grade);
        }else if(grade == 'D'){
            System.out.println("Qualify retake the exam, your grade: "+ grade);
        }else if(grade == 'E'){
            System.out.println("Failed - " + grade);
        }else{
            System.out.println("Invalid grade \"" + grade + "\"t pls contact your supervisor");}
    }
}
