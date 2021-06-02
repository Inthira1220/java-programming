package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        // cars list
        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("testla");
        myCars.add(0, "jeep"); // when you want to add in 1st 2nd or other
        myCars.add(1, "lada");
        myCars.add(2, "yogo");
        System.out.println("list of my cars = " + myCars);
        System.out.println(myCars.toString());//[jeep, lada, yogo, toyota, mazda, ford, moskvich, testla]
        //saves all cars in 1 String variable
        String allCarIn1st = myCars.toString();
        System.out.println("allCarIn1st in String line = " + allCarIn1st);
        // change jeep to something else [jeep, lada, yogo, toyota, mazda, ford, moskvich, testla]
        //change index 0 to something else
        myCars.set(0, "lamborghini");
        System.out.println("after set, reprint mycar = " + myCars.toString());
        myCars.set(4, "honda");
        System.out.println("change from mazda to honda  = " + myCars.toString());

        /**
         * how would you do that if myCars are Array
         * myCars[4] = "honda";
         */
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //find the index of "ford"find the index of "ford"
        System.out.println("find the index of ford");
        System.out.println("myCars.indexOf(ford) = " + myCars.indexOf("ford"));
        //System.out.println("myCars.indexOf(moskvich) = " + myCars.indexOf("moskvich"));
        //in store moskvich to variable
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        int moskvichIndex = myCars.indexOf("moskvich");
        System.out.println("moskvichIndex = " + moskvichIndex);

        // change "moskvich" to jiguli
        myCars.set(moskvichIndex, "jiguli");
        System.out.println("Update mycars with jiguli = " + myCars.toString());

        // replace ford with trabant, using one statment
        //indexof("ford"), trabant

        myCars.set(myCars.indexOf("ford"), "trabant");
        System.out.println("myCars = " + myCars);

        //use if-else (contain) to fine car brand, if yes then change
        if (myCars.contains("lada")) {
            System.out.println(myCars.set(myCars.indexOf("lada"), "bugatti"));
        } else {
            System.out.println("no lada is here");
        }
        System.out.println("myCars after change lada to bugatti ==>" + myCars.toString());


        System.out.println("--------------------------------");
        /**
         * lamborghini-->prius
         * lada-->lexus
         * trabant --> audi
         */
        System.out.println("loop it");
        for(int i = 0; i < myCars.size(); i++) {
            if (myCars.get(i).equals("lamborghini")) {
                myCars.set(i, "prius");
            } else if (myCars.get(i).equals("toyota")) {
                myCars.set(i, "lexus");
            } else if (myCars.get(i).equals("trabant")) {
                myCars.set(i , "audi");
            }
        }
        System.out.println("after loop = " + myCars);

    }
}



