package day18_conditions_practice_string_intro;

public class MultiBranchIf {
    public static void main(String[] args) {


        int number = 0;

        if (number > 0) {
            System.out.println(number + "print number is positive");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        } else {                                          // or --> else if (number == 0)
            System.out.println(number + " is zero");
        }
    }
}
//}
//package day18_conditions_practice_strings_intro
//        Add new class MultiBranchIf
//
//number => 5
//
//        number is more than 0
//        print 5 is positive
//        number is less than 0
//        print number is negative
//        number equal 0:
//        print number is zero