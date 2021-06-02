package OfficeHours_Saim_Practice_03_09_2021;


import java.util.Scanner;
public class TimesSecondsConvertor {
    public static void main(String[] args) {

        int inputSeconds, hours, minutes, seconds;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Seconds: ");
        inputSeconds = scan.nextInt(); //3695

        // how many seconds are in an hour?
        //60 sce = 1 min
        //60 min = 1 hour
        // 60*60 = 3600
        hours = inputSeconds / 3600; //3695/3600=1
        inputSeconds %= 3600; // <= inputSeconds = inputSeconds %= 3600;
        minutes = inputSeconds / 60; //95%60 = 1
        inputSeconds %= 60; //95%60=35;
        seconds = inputSeconds;


        System.out.println(hours + ":hours "+minutes +":minutes and "+seconds+":Seconds");

    }
}
