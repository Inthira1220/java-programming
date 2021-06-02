package OfficeHours_Saim_Practice_03_15_2021;

public class GradeRetake {
    public static void main(String[] args) {
        int baseGrade = 90;
        int numberAttempts = 1;
        int retakePenalty = 0;
        if (numberAttempts == 1) {
            retakePenalty = (int) (baseGrade * 0.10);
        }
        if (numberAttempts == 2) {
            retakePenalty = (int) (baseGrade * 0.20);
        }
        if (numberAttempts == 3) {
            retakePenalty = (int) (baseGrade * 0.35);
        }
        System.out.println("Grade after retake attempt " + numberAttempts + " was " + (baseGrade - retakePenalty));

    }
}
/*
 Write a program that will give the grade after the retake.
 The program should read a score of the test and which attempt it was.
 ** how many pont you lose basically
    If its the first attempt -> subtract 10%
    If its the second attempt -> subtract 20%
    If its the third attempt -> subtract 35%
 */