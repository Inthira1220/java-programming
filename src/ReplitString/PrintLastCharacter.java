package ReplitString;

public class PrintLastCharacter {
    public static void main(String[] args) {
        /**
         * Write a program that will print out last letter of the word (string).
         *
         * Ex:
         *
         * Input: java
         * Input: java
         *
         * Output: a
         */
        String input = "java";
        int count = input.length()-1;
        System.out.println(input.charAt(count));
    }
}
