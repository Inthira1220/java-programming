package day18_conditions_practice_string_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todayClass = "Soft skill";
        if (todayClass.equals("java")){
            System.out.println(todayClass + ": Java is fun");
        }else if(todayClass.equals("Soft skill")){
            System.out.println(todayClass+ ": today's class is different");
        }
    }
}
