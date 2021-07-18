package day62_collections.shortCollectionPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {


        //common collection interface method
        Collection<Integer> coll = new ArrayList<>();
        //adding items
        coll.add(1);
        coll.add(3);
        coll.add(13);

        System.out.println("coll = " + coll);

        //adding multiple items in one shot
        coll.addAll(Arrays.asList(4, 5, 6, 7, 8, 9, 0));
        //getting size
        System.out.println("coll.size() = " + coll.size());
        //check empty or not
        System.out.println("coll.isEmpty() = " + coll.isEmpty()); //= false
        //remove item
        System.out.println("coll.remove(4) = " + coll.remove(4)); //= true
        System.out.println("coll = " + coll);
        //contains item
        System.out.println("coll.contains(4) = " + coll.contains(4));
        //contains all item
        System.out.println("coll.containsAll(Arrays.asList(8,9,0)) = " + coll.containsAll(Arrays.asList(8, 9, 0)));
        //remove all
        System.out.println("coll.removeAll(Arrays.asList(8,9,0)) = " + coll.removeAll(Arrays.asList(8, 9, 0)));
        System.out.println("coll = " + coll);
        //retains all
        System.out.println("coll.retainAll(Arrays.asList(1,3,13,5)) = " + coll.retainAll(Arrays.asList(1, 3, 13, 5)));
        System.out.println("coll = " + coll);
        //removeIf
        System.out.println("coll.removeIf(each -> each > 10) = " + coll.removeIf(each -> each > 10));
        System.out.println("coll = " + coll);
        //Turning into array
        Integer[] inArray = coll.toArray( new Integer[4]);
        Integer[] inArray1 = coll.toArray( new Integer[0]);
        System.out.println("Arrays.toString(inArray) = " + Arrays.toString(inArray));
        System.out.println("Arrays.toString(inArray1) = " + Arrays.toString(inArray1));
        //System.out.println("inArray = " + inArray);  //inArray = [Ljava.lang.Integer;@404b9385


    }
}
