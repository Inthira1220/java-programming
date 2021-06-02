package day37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {


        System.out.println(getDayName(1));
        System.out.println(getDayName(10));
        System.out.println(getDayNameV2(1));

        for (int i = 1; i <= 8; i++) {
            System.out.println(i + " = " + getDayName(i) + " ");

        }
        //store get the day into the variable and print variable
        String day = getDayName(4);
        System.out.println("today is " + day);
        System.out.println();
        String someDay = getDayName(0);
        if (someDay == null) {
            System.out.println("someday = " + someDay);
        }
    }

    public static String getDayName(int day) {
        switch (day) {
            case 1:
                return ("monday");

            case 2:
                return ("tuesday");

            case 3:
                return ("wednesday");

            case 4:
                return ("thursday");

            case 5:
                return ("friday");

            case 6:
                return ("saturday");

            case 7:
                return ("sunday");

            default:
                System.out.println("Invalid Day" + day);
                return null;

        }

    }

    public static String getDayNameV2(int day) {
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "tuesday";
                break;
            case 3:
                dayName = "wednesday";
                break;
            case 4:
                dayName = "thursday";
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                System.out.println("Invalid day - " + day);
                dayName = null;

        }
        return dayName;
    }
}

