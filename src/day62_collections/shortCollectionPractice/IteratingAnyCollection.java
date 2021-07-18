package day62_collections.shortCollectionPractice;

import java.util.*;

public class IteratingAnyCollection {

    public static void main(String[] args) {
        Collection<Integer> coll = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 66, 544, 31));
        System.out.println("coll = " + coll);
        //      for (Integer each : coll) {
        //           System.out.println(each);
        //           if(each>10){ //Exception in thread "main" java.util.ConcurrentModificationException
        //               coll.remove(each);
        //           }
        Iterator<Integer> myIter = coll.iterator();
        //hasNext()
        System.out.println("myIter.hasNext() = " + myIter.hasNext()); //myIter.hasNext() = true

        //next()
//            System.out.println(myIter.next());//3
//            System.out.println(myIter.next());//4
//            System.out.println(myIter.next());//5
//            System.out.println(myIter.next());//2
//            System.out.println(myIter.next());//66

        //remove():
        //myIter.remove(); //remove from last called line 24 out
        //myIter.remove(); //couldn't remove bcaz current line removed already
        //System.out.println("coll = " + coll);//coll = [3, 4, 5, 2, 544, 31]

        while (myIter.hasNext()) {

            Integer each = myIter.next();
            System.out.print(each + " - "); //3 - 4 - 5 - 2 - 66 - 544 - 31 -
            if (each > 10) {
                myIter.remove();
            }
        }

        System.out.println();
        System.out.println("myIter = " + myIter); //myIter = java.util.ArrayList$Itr@1b6d3586
        System.out.println(coll);  //[3, 4, 5, 2]


    }


}
//}
