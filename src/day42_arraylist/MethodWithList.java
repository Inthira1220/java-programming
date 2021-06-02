package day42_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodWithList {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("java");
        words.add("html");
        words.add("selenium");
        words.add("a");
        words.add("input");
        words.add("title");
        printStrList(words);

        printStrList(Arrays.asList("select", "option", "br", "python", "api"));

        //declare list integer
        List<Integer> nums = Arrays.asList(23,23,33,36,35,34,39,37);
        System.out.println(sumIntegerList(nums));
    }

    /**
     methodName: printStrList
     param: List of String
     return: void
     prints all values separated by space in the line
     */

    public static void printStrList(List<String> stringList) {
        for (String str : stringList) {
            System.out.print(str + " ");

        }
        System.out.println();
    }

    /**
     * method: sumIntegerList
     * param: List of integer
     * return int
     * calculates sum of integers in the list then return
     */
    public static int sumIntegerList(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;

    }
}
