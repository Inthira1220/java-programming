package day62_collections.shortCollectionPractice;

import java.util.*;

public class ListPractice {
    public static void main(String[] args) {

        //common List methods/ on top of the method from collection interface

        List<Double> lst = new LinkedList<>(Arrays.asList(3d,4d,27d,66d,3d,3d,44d));
        System.out.println("lst = " + lst); //lst = [3.0, 4.0, 27.0, 66.0, 3.0, 3.0, 44.0]

        //accessing items using index
        System.out.println("first item : lst.get(0) = " + lst.get(0));// first item : lst.get(0) = 3.0
        System.out.println("lst = " + lst);

        //adding items in certain index
        lst.add(1,5d );
        System.out.println("lst = " + lst);  //lst = [3.0, 5.0, 4.0, 27.0, 66.0, 3.0, 3.0, 44.0]

        //updating items in certain index
        lst.set(0, 99.0);
        System.out.println("lst = " + lst);

        //getting indexes of certain items
        System.out.println("lst.indexOf(4.0) = " + lst.indexOf(4.0));
        System.out.println("lst.indexOf(3.0) = " + lst.indexOf(3.0));

        System.out.println("lst.lastIndexOf(3.0) = " + lst.lastIndexOf(3.0)); //6
        System.out.println("if item not found: lst.lastIndexOf(100.0) = " + lst.lastIndexOf(100.0)); //-1

        //remove(Object)
        //remove(index)
        System.out.println("lst.remove1 "+lst.remove(1)); //5.0
        
        //addAll at certain index
        lst.addAll(2, Arrays.asList(99d,89d));
        System.out.println("lst.addAll = " + lst);

        System.out.println("replace each iteam with new value increase by 5 :");
        //using replaceAll(Function : UnaryOperator)
        lst.replaceAll(each -> each+5);
        System.out.println("lst update by 5 = " + lst);

        //sort
        //lst.sort(null); //lst.sort = [8.0, 8.0, 9.0, 32.0, 49.0, 71.0, 94.0, 104.0, 104.0]
        lst.sort(Comparator.naturalOrder()); //lst.sort = [8.0, 8.0, 9.0, 32.0, 49.0, 71.0, 94.0, 104.0, 104.0]
        //lst.sort(Comparator.reverseOrder()); //lst.sort = [104.0, 104.0, 94.0, 71.0, 49.0, 32.0, 9.0, 8.0, 8.0]
        System.out.println("lst.sort = " + lst);

        //getting view out of list object
        //subList() ->view is part of your original list object
        //subList(from, to)
        //List view from index 3 till before 7
        System.out.println("lst.subList(3,7) = " + lst.subList(3, 7)); //lst.subList(3,7) = [32.0, 49.0, 71.0, 94.0]

        List<Double> partOfListView = lst.subList(2, 5);
        System.out.println("partOfListView = " + partOfListView); //= [9.0, 32.0, 49.0]
        partOfListView.set(0, 199.99);
        System.out.println("partOfListView set(0, 199.99) = " + partOfListView); //= [199.99, 32.0, 49.0]
        System.out.println("lst original list = " + lst); //= [8.0, 8.0, 199.99, 32.0, 49.0, 71.0, 94.0, 104.0, 104.0]

    }
}
