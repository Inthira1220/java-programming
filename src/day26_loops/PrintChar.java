package day26_loops;

public class PrintChar {
    public static void main(String[] args) {
//        String word1 = "inthira";
//
//        for (int i = word1.length() - 1; i > 0; i--) {
//            System.out.println(word1.charAt(i) + " ");
//            //this will print it backward
//      }
        String word = "Inthira";
        for (int i = 0; i < word.length(); i++) { //<-------- i = string index is 0
            System.out.println(i + " - " +word.charAt(i) + " "); //<---i make it dynamic
        }


        for(int i = word.length()-1; i >=0; i--){
            System.out.print(word.charAt(i)+ ",");
        }
    }
    }

