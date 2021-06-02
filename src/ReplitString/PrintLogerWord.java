package ReplitString;

public class PrintLogerWord {
    public static void main(String[] args) {
        /**
         * Write a program that will print out the longest word.
         * Note: Assume the length of the two given Strings will be different
         *
         * input:
         * bill
         * check
         */
        String word1 = "bill";
        String word2 = "billy";
        if (word1.length() > word2.length()){
            System.out.println(word1);
        }else{
            System.out.println(word2);
        }
    }
}
