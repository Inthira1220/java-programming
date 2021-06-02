package day04_variables_intro;

public class VariablesPractice {
    public static void main(String[] args){
        int students; // declare variable students that stores number
        students = 50;
        System.out.println(students);//50
        System.out.println(students+20);//70
        students = 70;
        System.out.println(students);//70
        students= 111;
        students= 125;
        System.out.println(students);//125
        int teachers;
        teachers = 2;
        int mentors;
        mentors = 25;
        System.out.println(("how many people in the school; ") +(students+teachers+mentors));//152
        System.out.print("Number of teachers:"); // print without th, it will print out only the number
        System.out.println(teachers); // print without th, it will print out only the number
        System.out.print("Number of mentors:");
        System.out.println(mentors);
    }
}
