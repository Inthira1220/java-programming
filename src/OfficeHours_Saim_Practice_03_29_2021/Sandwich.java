package OfficeHours_Saim_Practice_03_29_2021;

public class Sandwich {
    public static void main(String[] args) {
        /**
         * A sandwich is two pieces of bread with something in between. Print the string that
         * is between the first and last appearance of "bread" in the given string, or return
         * string "nothing" if there are not two pieces of bread.
         * input: breadjambread
         * output:jam
         * inout: xxbreadapple
         * output: nothing
         */
        String str = "breadjambread"; // if nothing between the bread the result become nothing happen
        if (str.contains("bread")) {
            int firstBread = str.indexOf("bread");  // index of bread is 0
            if (str.substring(firstBread + 5).contains("bread")) { //jambread
                int secondBread = str.lastIndexOf("bread");
                System.out.println(str.substring(firstBread+ 5, secondBread));
            } else {
                System.out.println("nothing");
            }
        }
    }
}