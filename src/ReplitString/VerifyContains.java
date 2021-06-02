package ReplitString;

public class VerifyContains {
    public static void main(String[] args) {
        /**
         * Write a program that will verify if the **sentence**
         * contains **word**. Print out the result as a boolean value.
         Scanner scan = new Scanner(System.in);
         String word = scan.nextLine();
         String sentence = scan.nextLine();
         */
        String word = "word1";
        String sentence = "sentence1";

        System.out.println(sentence.contains((word)));
    }
}
