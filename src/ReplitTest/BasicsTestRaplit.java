package ReplitTest;

public class BasicsTestRaplit {
    public static void main(String[] args) {

/**
 * In this assignment, you will write code to put together time of day.
 *
 * Like this: `12:24:33 PM`
 *
 * 1. Declare variables: `hour, minute, second` that can hold **int** values.
 *
 *     Declare `amOrPm` variable that can hold a **String** ("AM" or "PM")
 *
 * 2. Instructor will set different values to your variables
 *
 * 3. Using the variables and concatenation, print values in the format mentioned above.
 */
        int hour = 12;
        int minute = 24;
        int second = 33;
        String amOrPm = "PM";
        System.out.println("Like this: \'"+hour+":"+minute+":"+second+ " "+amOrPm+"\'");

        System.out.println();
        /**
         * Write a program that outputs the number of hours, minutes, and seconds that
         * corresponds to input total seconds.
         *
         *     Create a Scanner object
         *     Declare int variables inputSeconds, hours, minutes, seconds
         *
         *     Ask user enter seconds by printing:
         *
         *     "Enter seconds:"
         *
         *     Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
         *
         *     Assign values to the hours, minutes, seconds variables
         *
         *     Display the result.
         *     Enter seconds:
         * 3695
         * 1 hours, 1 minutes, and 35 seconds
         */



        //3600 seconds = 1 hour
        //3600 seconds = 60 minutes
        //60 seconds = 1 minute
        //3700 seconds = 1 hour , 1 minute and 40 seconds
        //hour : 3700/3600 = 1 hour, 100 seconds remaining
        //minutes: 100/60 = 1 minute, 40 seconds remaining
        // second : remaining awcond from minute calculation --> 40 second
    }
}
