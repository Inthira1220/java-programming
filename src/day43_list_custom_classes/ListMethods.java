package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public static void main(String[] args) {

        System.out.println("getDays() = " + getDays()); //getDays() = [Monday, Tuesday, wednesday, Thursday, Friday, Saturday, sunday]
        System.out.println("getDays().size() = " + getDays().size()); //getDays().size() = Monday
        System.out.println("getDays().size() = " + getDays().get(0)); //getDays().size() = Monday
        List<String> dayNames = getDays();
        dayNames.add("java day");
        System.out.println("dayNames = " + dayNames); //dayNames = [Monday, Tuesday, wednesday, Thursday, Friday, Saturday, sunday, java day]

        //remove if method - java 8 -> accepts lambda - and easy to remove without loop
        dayNames.removeIf(day->day.length()==6);
        System.out.println("dayNames removeIf = " + dayNames); //[Tuesday, wednesday, Thursday, Saturday, java day]

        System.out.println(getRandomList(10));
        List<Integer> nums = getRandomList(100);
        System.out.println("nums = " + nums);
        nums.removeIf(n -> n < 90); // remove nums less than 90
        System.out.println("nums = " + nums);



    }
    public static List<String> getDays(){
    List<String> days = new ArrayList<>(Arrays.asList("Monday","Tuesday","wednesday",
                                        "Thursday","Friday","Saturday","sunday"));
        //    or add 1 by one
        //    days.add("Monday");
        //    days.add("Tuesday");
        //    days.add("Wednesday");
        //    days.add("Thursday");
        //    days.add("Friday");
        //    days.add("Saturday");
        //    days.add("sunday");
    return days;
    }

    /**
     * getRandomList
     * param: int size
     * return List<Integer>
     * generate random numbers(0-100) the count of size, and assign to list then return
     * getRandomList(3) ->43, 12, 54
     */
    public static List<Integer> getRandomList(int size){
        Random random = new Random();//new random object
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <=size ; i++) {
            nums.add(random.nextInt(101)); //generate random 0-100 limit number and add to list

        }
        return nums;

    }
}
