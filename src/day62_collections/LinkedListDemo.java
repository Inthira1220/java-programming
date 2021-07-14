package day62_collections;

import java.util.*;


public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> friends = new LinkedList<>();
        //polymorhism
        List<Integer> scores = new LinkedList<>();
        scores.add(5);
        scores.add(42);
        scores.add(23);
        scores.add(42);

        System.out.println("scores = " + scores);  //scores = [5, 42, 23, 42]
        System.out.println("scores.get(0) = " + scores.get(0));  //scores.get(0) = 5
        System.out.println("scores.get(1) = " + scores.get(1));

        friends.add("AA");
        friends.add("BB");
        friends.add("CC");
        friends.add("BB");

        friends.addFirst("John");
        System.out.println("friends = " + friends); //friends = [John, AA, BB, CC, BB]

        System.out.println("friends.getLast() = " + friends.getLast()); //friends.getLast() = BB


    }
}
