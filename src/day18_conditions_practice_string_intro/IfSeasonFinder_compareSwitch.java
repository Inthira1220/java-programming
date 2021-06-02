package day18_conditions_practice_string_intro;

public class IfSeasonFinder_compareSwitch {
    public static void main(String[] args) {
        int month = 0;
        if (month == 1 || month == 2 || month == 3) {
            System.out.println("winter");
        } else if (month == 4 || month == 5 || month == 6) {
            System.out.println("fall");
        } else if (month == 7 || month == 8 || month == 9) {
            System.out.println("summer");
        } else if (month == 10 || month == 11 || month == 12) {
            System.out.println("spring");
        }else{
            System.out.println("Invalid");
        }
    }
}