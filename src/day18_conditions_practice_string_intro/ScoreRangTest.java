package day18_conditions_practice_string_intro;

public class ScoreRangTest {
    public static void main(String[] args) {
        int score = 5;
        if (score >= 91 && score <=100) {
            System.out.println(score + " : your Grade is \'A\'");
        }else if (score >= 61 && score <=90){
            System.out.println(score + " : your Grade is \'B\'");
        }else if (score >= 41 && score <=60) {
            System.out.println(score + " : your Grade is \'C\'");
        }else if (score >= 1 && score <=40) {
            System.out.println(score + " : your Grade is \'D\'");
        }else{
            System.out.println(score +" : Invalid Score!");
        }
    }
}
