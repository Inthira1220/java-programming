package day62_collections;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        List<String> cities = new ArrayList<>(); //polymorphism
        Collection<String> schools = new ArrayList<>(); //polymorphism

        cities.add("Mclean");
        cities.add("Vienna");
        cities.add("New York");
        cities.add("New York");

        System.out.println("cities = " + cities);              //cities = [Mclean, Vienna, New York, New York]
        System.out.println("cities.get(0) = " + cities.get(0));     //cities.get(0) = Mclean
        System.out.println("cities.size() = " + cities.size());     //cities.size() = 4


    }
}
