package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList(Arrays.asList(1,6,5,8,6,2,4,10));
        System.out.println("before sort: "+numbers);
        Collections.sort(numbers);
        System.out.println("after sort: " +numbers);
    }

}
