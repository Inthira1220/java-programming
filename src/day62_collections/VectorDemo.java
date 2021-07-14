package day62_collections;

import java.util.*;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();
        List<String> states = new Vector<>();
        states.add("MA");
        states.add("VA");
        states.add("TL");
        states.add("PA");
        states.add("TX");
        states.add("CO");
        states.add("MD");
        states.add("MD");

        System.out.println("states = " + states);
        //VECTOR is Synchronized
    }
}
