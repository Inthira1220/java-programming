package ReplitString;

public class PrintHalfTwice {
    public static void main(String[] args) {
        /**
         * Write a program that will print out first half of the word twice.
         * Example:
         * input: java
         * output: jaja
         */
        String word = "java";
        System.out.println(word.substring(0, 2)+word.substring(0, 2));
    }
}
