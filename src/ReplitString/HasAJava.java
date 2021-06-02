package ReplitString;

public class HasAJava {
    public static void main(String[] args) {
        /**
         * Given a string **_word_**, print true if "java" appears starting at index 0 or 1
         * in the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx".
         * The string may be any length, including 0.
         * Example:
         * input: javapython
         * output: true
         */
        String word = "javapython";
        int wordIndex = word.indexOf(0);
        int wordIndex2 = word.indexOf(1);
        //System.out.println(word.substring(0)); //javapython
        //System.out.println(word.substring(0,1)); //j
        //System.out.println(wordIndex2); //-1

        if (word.indexOf(1) == word.indexOf(0,1)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
