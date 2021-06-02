package day42_arraylist;

import java.util.*;


public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        //Arrays.asList();
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'));
        System.out.println("letters.size() = " + letters.size());
        //result -->letters.size() = 9

        System.out.println("print letters = " + letters);
        //print letters = [j, a, v, a, i, s, f, u, n]

        Collections.reverse(letters);
        System.out.println("letters reverse = " + letters);
        //letters reverse = [n, u, f, s, i, a, v, a, j]

        //Collections.frequency(letters, 'a');
        System.out.println(Collections.frequency(letters, 'a')); //2
        // 2 a ==> in letters

        //add variable to count with frequency
        int vCount = Collections.frequency(letters, 'v');
        System.out.println("vCount = " + vCount);
        //vCount = 1

        System.out.println("Max char = " + Collections.max(letters));
        //Max char = v
        System.out.println("Min char = " + Collections.min(letters));
        //Min char = a

        //reverse letter back
        Collections.reverse(letters);
        //replace letters
        Collections.replaceAll(letters, 'a', 'u');
        System.out.println("letters 'a', 'u' = " + letters);
        //letters 'a', 'u' = [j, u, v, u, i, s, f, u, n]

        //sort from small to large
        Collections.sort(letters);
        System.out.println("sort of letters = " + letters);
        //sort of letters = [f, i, j, n, s, u, u, u, v]

        System.out.println("******************************************");
        //ArrayList<Integer> nums = Arrays.asList(23,1,43,5,234,7,-9,0); ->dont work "List can work no need change"
        List<Integer> nums = Arrays.asList(23, 1, 43, 5, 234, 7, -9, 0, 5, 5, 5);
        System.out.println("nums = " + nums);
        //nums = [23, 1, 43, 5, 234, 7, -9, 0, 5, 5, 5]

        Collections.reverse(nums);
        System.out.println("nums = " + nums);
        //nums = [5, 5, 5, 0, -9, 7, 234, 5, 43, 1, 23]
        Collections.sort(nums);
        System.out.println("nums = " + nums);
        //nums = [-9, 0, 1, 5, 5, 5, 5, 7, 23, 43, 234]
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        System.out.println("max = " + max); //max = 234
        System.out.println("min = " + min); //min = -9

        Collections.frequency(nums, 5);
        System.out.println("frequency count 5 = " + nums);
        //frequency count 5 = [-9, 0, 1, 5, 5, 5, 5, 7, 23, 43, 234]

        int countOf1s = Collections.frequency(nums, 1);
        System.out.println("countOf1s = " + countOf1s);
        //countOf1s = 1

        Collections.replaceAll(nums, 5, 50);
        System.out.println("Collections.replaceAll(nums, 5, 50) = "+nums);
        //Collections.replaceAll(nums, 5, 50) = [-9, 0, 1, 50, 50, 50, 50, 7, 23, 43, 234]

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("after reverse sort = " + nums);
        //after reverse sort = [234, 50, 50, 50, 50, 43, 23, 7, 1, 0, -9]

        //shuffle
        Collections.shuffle(nums);
        System.out.println("Collections.shuffle(nums) = "+nums);
        //Collections.shuffle(nums) = [50, 43, 50, 0, 50, -9, 234, 1, 7, 50, 23]

    }
}
