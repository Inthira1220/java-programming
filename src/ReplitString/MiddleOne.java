package ReplitString;

import java.util.Scanner;

public class MiddleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**
         * You have a word, do the following:
         *     When word has odd number of characters and:
         *     3 or more characters, print middle letter
         *       oak ==> a
         *       oak ==> a
         *       javav ==> v
         *       if branches order:
         *       1 character --> print that char 3 times
         *       2 character --> print those 2 chars 2 times
         *       3 or more characters
         *          if odd print middle char
         *       else (even) print middle 2 char
         */
        String word = scan.nextLine();
        int charCount = word.length();
        if (charCount == 1) {
            System.out.println(word + word + word);
        } else if (charCount == 2) {
            System.out.println(word + word);
        } else if (charCount >= 3) {
            // 01234 = 5 characters and 5/2 = 2 no %
            // hello
            int middleIndex = charCount / 2;
            if (charCount % 2 == 1) {
                System.out.println(word.charAt(middleIndex));
            } else {
                // 012345 = 6 /2 = 3
                // Javase
                System.out.println(word.charAt(middleIndex-1)+""+word.charAt(middleIndex));

                //System.out.println(word.substring( middleIndex+1), middleIndex-1));
            }
        }
    }
}

