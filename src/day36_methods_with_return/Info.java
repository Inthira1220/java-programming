package day36_methods_with_return;

import java.util.Random;

public class Info {
    public static void main(String[] args) {
        /**
         * Method name: fullName
         * No params
         * returns "Mike Smith"
         *
         * Method name: isMarried
         * return false
         *
         * method name: getAge
         * returns 35
         */


        fullName(); // no result out anything in this line
        System.out.println("full name = "+ fullName()); //full name = Mike Smith

        System.out.println(fullName());     //Mike Smith
        System.out.println(isMarried());    // false
        System.out.println("Is married = "+ isMarried()); //Is married = false
        System.out.println(getAge());       //24
        System.out.println("age = "+getAge());       //age = 24
        System.out.println("Birth Year = "+ getRandomYear());
        System.out.println("Birth Year = "+ getRandomYear());

        //dynamic. different year each time

        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);

    }

    public static String fullName() {
        return "Mike Smith";

    }

    public static boolean isMarried() {
        return false;
    }

    public static int getAge() {
        //int age = 24;
        return 24; // return age;
    }
    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}
